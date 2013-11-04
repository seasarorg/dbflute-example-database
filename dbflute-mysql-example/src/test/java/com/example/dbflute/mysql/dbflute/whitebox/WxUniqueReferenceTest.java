package com.example.dbflute.mysql.dbflute.whitebox;

import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.bhv.EntityListSetupper;
import org.seasar.dbflute.bhv.LoadReferrerOption;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.mysql.dbflute.cbean.WhiteUqFkCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteUqFkRefCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteUqFkRefNestCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteUqFkWithoutPkCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteUqFkWithoutPkRefCB;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteUqFkBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteUqFkRefBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteUqFkRefNestBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteUqFkWithoutPkBhv;
import com.example.dbflute.mysql.dbflute.exentity.WhiteUqFk;
import com.example.dbflute.mysql.dbflute.exentity.WhiteUqFkRef;
import com.example.dbflute.mysql.dbflute.exentity.WhiteUqFkRefNest;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.6 (2010/11/10 Tuesdan)
 */
public class WxUniqueReferenceTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteUqFkBhv whiteUqFkBhv;
    private WhiteUqFkRefBhv whiteUqFkRefBhv;
    private WhiteUqFkRefNestBhv whiteUqFkRefNestBhv;
    private WhiteUqFkWithoutPkBhv whiteUqFkWithoutPkBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_UqFk_SetupSelect_both() {
        // ## Arrange ##
        registerTestData();
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
        cb.setupSelect_WhiteUqFkByFkToPkId();
        cb.setupSelect_WhiteUqFkByFkToUqCode();

        // ## Act ##
        ListResultBean<WhiteUqFkRef> refList = whiteUqFkRefBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, refList.size());
        for (WhiteUqFkRef ref : refList) {
            log(ln() + ref.toStringWithRelation());
            WhiteUqFk byFkToPkId = ref.getWhiteUqFkByFkToPkId();
            WhiteUqFk byFkToUqCode = ref.getWhiteUqFkByFkToUqCode();
            assertNotNull(byFkToPkId);
            assertNotNull(byFkToUqCode);
            assertNotSame(byFkToPkId, byFkToUqCode);
        }
    }

    public void test_UqFk_SetupSelect_uqOnly() {
        // ## Arrange ##
        registerTestData();
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
        cb.setupSelect_WhiteUqFkByFkToUqCode();

        // ## Act ##
        ListResultBean<WhiteUqFkRef> refList = whiteUqFkRefBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, refList.size());
        for (WhiteUqFkRef ref : refList) {
            log(ln() + ref.toStringWithRelation());
            WhiteUqFk byFkToPkId = ref.getWhiteUqFkByFkToPkId();
            WhiteUqFk byFkToUqCode = ref.getWhiteUqFkByFkToUqCode();
            assertNull(byFkToPkId);
            assertNotNull(byFkToUqCode);
        }
    }

    public void test_UqFk_SetupSelect_multipleUq() {
        // ## Arrange ##
        registerTestData();
        WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
        cb.setupSelect_WhiteUqFkRef();

        // ## Act ##
        ListResultBean<WhiteUqFkRefNest> nestList = whiteUqFkRefNestBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, nestList.size());
        for (WhiteUqFkRefNest nest : nestList) {
            log(ln() + nest.toStringWithRelation());
            assertNotNull(nest.getWhiteUqFkRef());
        }
    }

    public void test_UqFk_ExistsReferrer_byUq() {
        // ## Arrange ##
        registerTestData();
        WhiteUqFkCB cb = new WhiteUqFkCB();
        cb.query().existsWhiteUqFkRefByFkToUqCodeList(new SubQuery<WhiteUqFkRefCB>() {
            public void query(WhiteUqFkRefCB subCB) {
                subCB.query().setCompoundUqFirstCode_Equal("F03");
            }
        });

        // ## Act ##
        ListResultBean<WhiteUqFk> mainList = whiteUqFkBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, mainList.size());
        for (WhiteUqFk main : mainList) {
            log(main);
        }
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "exists", // ln
                "where sub1loc.FK_TO_UQ_CODE = dfloc.UQ_FK_CODE", // ln 
                "  and sub1loc.COMPOUND_UQ_FIRST_CODE = 'F03'"));
    }

    public void test_UqFk_ExistsReferrer_byMutipleUq() {
        // ## Arrange ##
        registerTestData();
        WhiteUqFkCB cb = new WhiteUqFkCB();
        cb.query().existsWhiteUqFkRefByFkToUqCodeList(new SubQuery<WhiteUqFkRefCB>() {
            public void query(WhiteUqFkRefCB subCB) {
                subCB.query().existsWhiteUqFkRefNestList(new SubQuery<WhiteUqFkRefNestCB>() {
                    public void query(WhiteUqFkRefNestCB subCB) {
                        subCB.query().setCompoundUqSecondCode_Equal("S04");
                    }
                });
            }
        });

        // ## Act ##
        ListResultBean<WhiteUqFk> mainList = whiteUqFkBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, mainList.size());
        for (WhiteUqFk main : mainList) {
            log(main);
        }
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "exists", "where sub1loc.FK_TO_UQ_CODE = dfloc.UQ_FK_CODE",
                "  and exists (select sub2loc.COMPOUND_UQ_FIRST_CODE",
                "where sub2loc.COMPOUND_UQ_FIRST_CODE = sub1loc.COMPOUND_UQ_FIRST_CODE",
                "  and sub2loc.COMPOUND_UQ_SECOND_CODE = sub1loc.COMPOUND_UQ_SECOND_CODE",
                "  and sub2loc.COMPOUND_UQ_SECOND_CODE = 'S04'"));
    }

    public void test_UqFk_InScopeRelation_byUq() {
        // ## Arrange ##
        registerTestData();
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
        cb.setupSelect_WhiteUqFkByFkToUqCode();
        cb.query().inScopeWhiteUqFkByFkToUqCode(new SubQuery<WhiteUqFkCB>() {
            public void query(WhiteUqFkCB subCB) {
                subCB.query().setUqFkCode_Equal("FOO");
            }
        });

        // ## Act ##
        List<WhiteUqFkRef> refList = whiteUqFkRefBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, refList.size());
        for (WhiteUqFkRef ref : refList) {
            log(ln() + ref.toStringWithRelation());
            WhiteUqFk byFkToPkId = ref.getWhiteUqFkByFkToPkId();
            WhiteUqFk byFkToUqCode = ref.getWhiteUqFkByFkToUqCode();
            assertNull(byFkToPkId);
            assertNotNull(byFkToUqCode);
            assertEquals("FOO", byFkToUqCode.getUqFkCode());
        }
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    public void test_UqFk_LoadReferrer_both() {
        // ## Arrange ##
        registerTestData();
        WhiteUqFkCB cb = new WhiteUqFkCB();

        // ## Act ##
        ListResultBean<WhiteUqFk> mainList = whiteUqFkBhv.selectList(cb);
        whiteUqFkBhv.loadWhiteUqFkRefByFkToPkIdList(mainList, new ConditionBeanSetupper<WhiteUqFkRefCB>() {
            public void setup(WhiteUqFkRefCB cb) {
            }
        });
        whiteUqFkBhv.loadWhiteUqFkRefByFkToUqCodeList(mainList, new ConditionBeanSetupper<WhiteUqFkRefCB>() {
            public void setup(WhiteUqFkRefCB cb) {
            }
        });

        // ## Assert ##
        assertNotSame(0, mainList.size());
        StringBuilder logSb = new StringBuilder();
        for (WhiteUqFk main : mainList) {
            logSb.append(ln() + main.toStringWithRelation());
            List<WhiteUqFkRef> byFkToPkIdList = main.getWhiteUqFkRefByFkToPkIdList();
            List<WhiteUqFkRef> byFkToUqCodeList = main.getWhiteUqFkRefByFkToUqCodeList();
            assertFalse(byFkToPkIdList.isEmpty());
            assertFalse(byFkToUqCodeList.isEmpty());
            assertNotSame(byFkToPkIdList, byFkToUqCodeList);
        }
        log(logSb);
    }

    public void test_UqFk_LoadReferrer_uqOnly() {
        // ## Arrange ##
        registerTestData();
        WhiteUqFkCB cb = new WhiteUqFkCB();

        // ## Act ##
        ListResultBean<WhiteUqFk> mainList = whiteUqFkBhv.selectList(cb);
        whiteUqFkBhv.loadWhiteUqFkRefByFkToUqCodeList(mainList, new ConditionBeanSetupper<WhiteUqFkRefCB>() {
            public void setup(WhiteUqFkRefCB cb) {
            }
        });

        // ## Assert ##
        assertNotSame(0, mainList.size());
        StringBuilder logSb = new StringBuilder();
        for (WhiteUqFk main : mainList) {
            logSb.append(ln() + main.toStringWithRelation());
            List<WhiteUqFkRef> byFkToPkIdList = main.getWhiteUqFkRefByFkToPkIdList();
            List<WhiteUqFkRef> byFkToUqCodeList = main.getWhiteUqFkRefByFkToUqCodeList();
            assertTrue(byFkToPkIdList.isEmpty());
            assertFalse(byFkToUqCodeList.isEmpty());
            for (WhiteUqFkRef ref : byFkToUqCodeList) {
                assertEquals(main.getUqFkCode(), ref.getFkToUqCode());
            }
        }
        log(logSb);
    }

    public void test_UqFk_LoadReferrer_multipleUq() {
        // ## Arrange ##
        registerTestData();
        WhiteUqFkCB cb = new WhiteUqFkCB();

        // ## Act ##
        ListResultBean<WhiteUqFk> mainList = whiteUqFkBhv.selectList(cb);
        LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef> option = new LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef>();
        option.setConditionBeanSetupper(new ConditionBeanSetupper<WhiteUqFkRefCB>() {
            public void setup(WhiteUqFkRefCB cb) {
            }
        });
        option.setEntityListSetupper(new EntityListSetupper<WhiteUqFkRef>() {
            public void setup(List<WhiteUqFkRef> entityList) {
                whiteUqFkRefBhv.loadWhiteUqFkRefNestList(entityList, new ConditionBeanSetupper<WhiteUqFkRefNestCB>() {
                    public void setup(WhiteUqFkRefNestCB cb) {
                    }
                });
            }
        });
        whiteUqFkBhv.loadWhiteUqFkRefByFkToUqCodeList(mainList, option);

        // ## Assert ##
        assertNotSame(0, mainList.size());
        boolean exists = false;
        for (WhiteUqFk main : mainList) {
            log(main.getUqFkId() + ", " + main.getUqFkCode());
            List<WhiteUqFkRef> byFkToPkIdList = main.getWhiteUqFkRefByFkToPkIdList();
            List<WhiteUqFkRef> byFkToUqCodeList = main.getWhiteUqFkRefByFkToUqCodeList();
            assertTrue(byFkToPkIdList.isEmpty());
            assertFalse(byFkToUqCodeList.isEmpty());
            for (WhiteUqFkRef ref : byFkToUqCodeList) {
                assertEquals(main.getUqFkCode(), ref.getFkToUqCode());
            }
            for (WhiteUqFkRef ref : byFkToUqCodeList) {
                log("  " + ref.getUqFkRefId());
                List<WhiteUqFkRefNest> nestList = ref.getWhiteUqFkRefNestList();
                if (!nestList.isEmpty()) {
                    exists = true;
                    for (WhiteUqFkRefNest nest : nestList) {
                        log("    " + nest);
                        assertEquals(nest.getCompoundUqFirstCode(), nest.getCompoundUqFirstCode());
                        assertEquals(nest.getCompoundUqSecondCode(), nest.getCompoundUqSecondCode());
                    }
                }
                assertFalse(byFkToUqCodeList.isEmpty());
            }
        }
        assertTrue(exists);
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    private List<WhiteUqFk> registerTestData() {
        List<WhiteUqFk> mainList = new ArrayList<WhiteUqFk>();
        mainList.add(xregisterWhiteUqFk(1, "FOO"));
        mainList.add(xregisterWhiteUqFk(2, "BAR"));
        mainList.add(xregisterWhiteUqFk(3, "QUX"));

        // 1 to 1...*
        xregisterWhiteUqFkRef(1, 1, "BAR", "F01", "S01");
        xregisterWhiteUqFkRef(2, 2, "FOO", "F02", "S02");
        xregisterWhiteUqFkRef(3, 3, "FOO", "F03", "S03");
        xregisterWhiteUqFkRef(4, 3, "BAR", "F04", "S04");
        xregisterWhiteUqFkRef(5, 3, "QUX", "F05", "S05");

        // 1 to 0...*
        xregisterWhiteUqFkRefNest(1, "F01", "S01");
        xregisterWhiteUqFkRefNest(2, "F01", "S01");
        xregisterWhiteUqFkRefNest(3, "F04", "S04");
        return mainList;
    }

    private WhiteUqFk xregisterWhiteUqFk(int id, String code) {
        WhiteUqFk main = new WhiteUqFk();
        main.setUqFkId(Long.valueOf(id));
        main.setUqFkCode(code);
        whiteUqFkBhv.insert(main);
        return main;
    }

    private WhiteUqFkRef xregisterWhiteUqFkRef(int id, int pkId, String uqCode, String firstCode, String secondCode) {
        WhiteUqFkRef ref = new WhiteUqFkRef();
        ref.setUqFkRefId(Long.valueOf(id));
        ref.setFkToPkId(Long.valueOf(pkId));
        ref.setFkToUqCode(uqCode);
        ref.setCompoundUqFirstCode(firstCode);
        ref.setCompoundUqSecondCode(secondCode);
        whiteUqFkRefBhv.insert(ref);
        return ref;
    }

    private WhiteUqFkRefNest xregisterWhiteUqFkRefNest(int id, String firstCode, String secondCode) {
        WhiteUqFkRefNest nest = new WhiteUqFkRefNest();
        nest.setUqFkRefNestId(Long.valueOf(id));
        nest.setCompoundUqFirstCode(firstCode);
        nest.setCompoundUqSecondCode(secondCode);
        whiteUqFkRefNestBhv.insert(nest);
        return nest;
    }

    // ===================================================================================
    //                                                                          Without PK
    //                                                                          ==========
    public void test_withoutPk_generated() throws Exception {
        // ## Arrange ##
        WhiteUqFkWithoutPkCB cb = new WhiteUqFkWithoutPkCB();
        cb.query().existsWhiteUqFkWithoutPkRefList(new SubQuery<WhiteUqFkWithoutPkRefCB>() {
            public void query(WhiteUqFkWithoutPkRefCB subCB) {
                subCB.query().queryWhiteUqFkWithoutPk().setUqFkName_Equal("dummy");
            }
        });

        // ## Act ##
        // ## Assert ##
        whiteUqFkWithoutPkBhv.selectCount(cb); // expect no exception
    }
}
