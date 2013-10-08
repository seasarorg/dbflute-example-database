package com.example.dbflute.mysql.dbflute.whitebox;

import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.bhv.EntityListSetupper;
import org.seasar.dbflute.bhv.LoadReferrerOption;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.mysql.dbflute.cbean.WhiteCompoundPkCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteCompoundPkRefCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteCompoundPkRefNestCB;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteCompoundPkBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteCompoundPkRefBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteCompoundPkRefNestBhv;
import com.example.dbflute.mysql.dbflute.exentity.WhiteCompoundPk;
import com.example.dbflute.mysql.dbflute.exentity.WhiteCompoundPkRef;
import com.example.dbflute.mysql.dbflute.exentity.WhiteCompoundPkRefNest;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.6 (2010/11/10 Tuesday)
 */
public class WxCompoundPKMainTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteCompoundPkBhv whiteCompoundPkBhv;
    private WhiteCompoundPkRefBhv whiteCompoundPkRefBhv;
    private WhiteCompoundPkRefNestBhv whiteCompoundPkRefNestBhv;

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    // -----------------------------------------------------
    //                                           SetupSelect
    //                                           -----------
    public void test_CompoundPK_SetupSelect_basic() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
        cb.setupSelect_WhiteCompoundPk();

        // ## Act ##
        ListResultBean<WhiteCompoundPkRef> refList = whiteCompoundPkRefBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, refList.size());
        StringBuilder logSb = new StringBuilder();
        for (WhiteCompoundPkRef ref : refList) {
            logSb.append(ln() + ref.toStringWithRelation());
            WhiteCompoundPk main = ref.getWhiteCompoundPk();
            assertNotNull(main);
            assertEquals(ref.getRefFirstId(), main.getPkFirstId());
            assertEquals(ref.getRefSecondId(), main.getPkSecondId());
        }
        log(logSb);
    }

    // -----------------------------------------------------
    //                                        ExistsReferrer
    //                                        --------------
    public void test_CompoundPK_ExistsReferrer_basic() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.query().existsWhiteCompoundPkRefList(new SubQuery<WhiteCompoundPkRefCB>() {
            public void query(WhiteCompoundPkRefCB subCB) {
                subCB.query().setRefSecondId_GreaterThan(1);
            }
        });

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, mainList.size());
        for (WhiteCompoundPk main : mainList) {
            log(main);
        }
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "exists", // ln 
                "where sub1loc.REF_FIRST_ID = dfloc.PK_FIRST_ID", // ln 
                "  and sub1loc.REF_SECOND_ID = dfloc.PK_SECOND_ID", // ln
                "  and sub1loc.REF_SECOND_ID > 1"));
    }

    // -----------------------------------------------------
    //                                           QueryUpdate
    //                                           -----------
    // implemented at WxBhvQueryUpdateCompoundPKTest

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    public void test_CompoundPK_LoadReferrer_basic() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);
        whiteCompoundPkBhv.loadWhiteCompoundPkRefList(mainList, new ConditionBeanSetupper<WhiteCompoundPkRefCB>() {
            public void setup(WhiteCompoundPkRefCB cb) {
            }
        });

        // ## Assert ##
        assertNotSame(0, mainList.size());
        StringBuilder logSb = new StringBuilder();
        boolean exists = false;
        for (WhiteCompoundPk main : mainList) {
            logSb.append(ln() + main.toStringWithRelation());
            List<WhiteCompoundPkRef> refList = main.getWhiteCompoundPkRefList();
            if (!refList.isEmpty()) {
                exists = true;
                for (WhiteCompoundPkRef ref : refList) {
                    assertEquals(main.getPkFirstId(), ref.getRefFirstId());
                    assertEquals(main.getPkSecondId(), ref.getRefSecondId());
                }
            }
        }
        log(logSb);
        assertTrue(exists);
    }

    public void test_UqReference_LoadReferrer_multiple() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);
        LoadReferrerOption<WhiteCompoundPkRefCB, WhiteCompoundPkRef> option = new LoadReferrerOption<WhiteCompoundPkRefCB, WhiteCompoundPkRef>();
        option.setConditionBeanSetupper(new ConditionBeanSetupper<WhiteCompoundPkRefCB>() {
            public void setup(WhiteCompoundPkRefCB cb) {
            }
        });
        option.setEntityListSetupper(new EntityListSetupper<WhiteCompoundPkRef>() {
            public void setup(List<WhiteCompoundPkRef> entityList) {
                whiteCompoundPkRefBhv.loadWhiteCompoundPkRefNestByFooMultipleIdList(entityList,
                        new ConditionBeanSetupper<WhiteCompoundPkRefNestCB>() {
                            public void setup(WhiteCompoundPkRefNestCB cb) {
                            }
                        });
            }
        });
        whiteCompoundPkBhv.loadWhiteCompoundPkRefList(mainList, option);

        // ## Assert ##
        assertNotSame(0, mainList.size());
        boolean exists = false;
        for (WhiteCompoundPk main : mainList) {
            log(main.getPkFirstId() + ", " + main.getPkSecondId());
            List<WhiteCompoundPkRef> refList = main.getWhiteCompoundPkRefList();
            if (!refList.isEmpty()) {
                for (WhiteCompoundPkRef ref : refList) {
                    log("  " + ref.getMultipleFirstId() + ", " + ref.getMultipleSecondId());
                    assertEquals(main.getPkFirstId(), ref.getRefFirstId());
                    assertEquals(main.getPkSecondId(), ref.getRefSecondId());
                    List<WhiteCompoundPkRefNest> fooMultipleIdList = ref.getWhiteCompoundPkRefNestByFooMultipleIdList();
                    List<WhiteCompoundPkRefNest> quxMultipleIdList = ref.getWhiteCompoundPkRefNestByQuxMultipleIdList();
                    assertTrue(quxMultipleIdList.isEmpty());
                    for (WhiteCompoundPkRefNest nest : fooMultipleIdList) {
                        exists = true;
                        log("    " + nest);
                        assertEquals(ref.getMultipleFirstId(), nest.getFooMultipleId());
                        assertEquals(ref.getMultipleSecondId(), nest.getBarMultipleId());
                    }
                }
            }
        }
        assertTrue(exists);
    }

    // ===================================================================================
    //                                                                      Specify Column
    //                                                                      ==============
    public void test_CompoundPK_SpecifyColumn_LoadReferrer_autoResolved() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);
        whiteCompoundPkBhv.loadWhiteCompoundPkRefList(mainList, new ConditionBeanSetupper<WhiteCompoundPkRefCB>() {
            public void setup(WhiteCompoundPkRefCB cb) {
                cb.specify().columnRefFirstId();
            }
        });

        // ## Assert ##
        assertNotSame(0, mainList.size());
        StringBuilder logSb = new StringBuilder();
        boolean exists = false;
        for (WhiteCompoundPk main : mainList) {
            logSb.append(ln() + main.toStringWithRelation());
            List<WhiteCompoundPkRef> refList = main.getWhiteCompoundPkRefList();
            if (!refList.isEmpty()) {
                exists = true;
                for (WhiteCompoundPkRef ref : refList) {
                    assertNotNull(ref.getRefFirstId());
                    assertNotNull(ref.getRefSecondId()); // auto-resolved
                }
            }
        }
        log(logSb);
        assertTrue(exists);
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    private List<WhiteCompoundPk> registerTestData() {
        List<WhiteCompoundPk> mainList = new ArrayList<WhiteCompoundPk>();
        mainList.add(xregisterWhiteCompoundPk(1, 1, "FOO"));
        mainList.add(xregisterWhiteCompoundPk(1, 2, "BAR"));
        mainList.add(xregisterWhiteCompoundPk(2, 1, "QUX"));
        mainList.add(xregisterWhiteCompoundPk(3, 1, "QUUX"));

        // 1 to 0...*
        xregisterWhiteCompoundPkRef(1, 1, 1, 1);
        xregisterWhiteCompoundPkRef(1, 2, 1, 1);
        xregisterWhiteCompoundPkRef(1, 3, 1, 2);
        xregisterWhiteCompoundPkRef(2, 1, 2, 1);
        xregisterWhiteCompoundPkRef(2, 2, 2, 1);
        xregisterWhiteCompoundPkRef(3, 1, 2, 1);

        // 1 to 0...*
        xregisterWhiteCompoundPkRefNest(1, 1, 1, 1);
        xregisterWhiteCompoundPkRefNest(2, 1, 1, 2);
        xregisterWhiteCompoundPkRefNest(3, 3, 1, 3);
        xregisterWhiteCompoundPkRefNest(4, 2, 2, 1);
        return mainList;
    }

    private WhiteCompoundPk xregisterWhiteCompoundPk(int first, int second, String pkName) {
        WhiteCompoundPk main = new WhiteCompoundPk();
        main.setPkFirstId(first);
        main.setPkSecondId(second);
        main.setPkName(pkName);
        whiteCompoundPkBhv.insert(main);
        return main;
    }

    private WhiteCompoundPkRef xregisterWhiteCompoundPkRef(int mulFirst, int mulSecond, int refFirst, int refSecond) {
        WhiteCompoundPkRef ref = new WhiteCompoundPkRef();
        ref.setMultipleFirstId(mulFirst);
        ref.setMultipleSecondId(mulSecond);
        ref.setRefFirstId(refFirst);
        ref.setRefSecondId(refSecond);
        whiteCompoundPkRefBhv.insert(ref);
        return ref;
    }

    private WhiteCompoundPkRefNest xregisterWhiteCompoundPkRefNest(int id, int foo, int bar, int qux) {
        WhiteCompoundPkRefNest nest = new WhiteCompoundPkRefNest();
        nest.setCompoundPkRefNestId(id);
        nest.setFooMultipleId(foo);
        nest.setBarMultipleId(bar);
        nest.setQuxMultipleId(qux);
        whiteCompoundPkRefNestBhv.insert(nest);
        return nest;
    }
}
