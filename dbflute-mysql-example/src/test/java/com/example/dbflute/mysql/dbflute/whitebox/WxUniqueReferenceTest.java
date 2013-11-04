package com.example.dbflute.mysql.dbflute.whitebox;

import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.bhv.EntityListSetupper;
import org.seasar.dbflute.bhv.LoadReferrerOption;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.mysql.dbflute.cbean.WhiteUqReferenceCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteUqReferenceRefCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteUqReferenceRefNestCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteUqReferenceWithoutPkCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteUqReferenceWithoutPkRefCB;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteUqReferenceBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteUqReferenceRefBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteUqReferenceRefNestBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteUqReferenceWithoutPkBhv;
import com.example.dbflute.mysql.dbflute.exentity.WhiteUqReference;
import com.example.dbflute.mysql.dbflute.exentity.WhiteUqReferenceRef;
import com.example.dbflute.mysql.dbflute.exentity.WhiteUqReferenceRefNest;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.6 (2010/11/10 Tuesdan)
 */
public class WxUniqueReferenceTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteUqReferenceBhv whiteUqReferenceBhv;
    private WhiteUqReferenceRefBhv whiteUqReferenceRefBhv;
    private WhiteUqReferenceRefNestBhv whiteUqReferenceRefNestBhv;
    private WhiteUqReferenceWithoutPkBhv whiteUqReferenceWithoutPkBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_UqReference_SetupSelect_both() {
        // ## Arrange ##
        registerTestData();
        WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB();
        cb.setupSelect_WhiteUqReferenceByFkToPkId();
        cb.setupSelect_WhiteUqReferenceByFkToUqCode();

        // ## Act ##
        ListResultBean<WhiteUqReferenceRef> refList = whiteUqReferenceRefBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, refList.size());
        for (WhiteUqReferenceRef ref : refList) {
            log(ln() + ref.toStringWithRelation());
            WhiteUqReference byFkToPkId = ref.getWhiteUqReferenceByFkToPkId();
            WhiteUqReference byFkToUqCode = ref.getWhiteUqReferenceByFkToUqCode();
            assertNotNull(byFkToPkId);
            assertNotNull(byFkToUqCode);
            assertNotSame(byFkToPkId, byFkToUqCode);
        }
    }

    public void test_UqReference_SetupSelect_uqOnly() {
        // ## Arrange ##
        registerTestData();
        WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB();
        cb.setupSelect_WhiteUqReferenceByFkToUqCode();

        // ## Act ##
        ListResultBean<WhiteUqReferenceRef> refList = whiteUqReferenceRefBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, refList.size());
        for (WhiteUqReferenceRef ref : refList) {
            log(ln() + ref.toStringWithRelation());
            WhiteUqReference byFkToPkId = ref.getWhiteUqReferenceByFkToPkId();
            WhiteUqReference byFkToUqCode = ref.getWhiteUqReferenceByFkToUqCode();
            assertNull(byFkToPkId);
            assertNotNull(byFkToUqCode);
        }
    }

    public void test_UqReference_SetupSelect_multipleUq() {
        // ## Arrange ##
        registerTestData();
        WhiteUqReferenceRefNestCB cb = new WhiteUqReferenceRefNestCB();
        cb.setupSelect_WhiteUqReferenceRef();

        // ## Act ##
        ListResultBean<WhiteUqReferenceRefNest> nestList = whiteUqReferenceRefNestBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, nestList.size());
        for (WhiteUqReferenceRefNest nest : nestList) {
            log(ln() + nest.toStringWithRelation());
            assertNotNull(nest.getWhiteUqReferenceRef());
        }
    }

    public void test_UqReference_ExistsReferrer_byUq() {
        // ## Arrange ##
        registerTestData();
        WhiteUqReferenceCB cb = new WhiteUqReferenceCB();
        cb.query().existsWhiteUqReferenceRefByFkToUqCodeList(new SubQuery<WhiteUqReferenceRefCB>() {
            public void query(WhiteUqReferenceRefCB subCB) {
                subCB.query().setCompoundUqFirstCode_Equal("F03");
            }
        });

        // ## Act ##
        ListResultBean<WhiteUqReference> mainList = whiteUqReferenceBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, mainList.size());
        for (WhiteUqReference main : mainList) {
            log(main);
        }
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "exists", // ln
                "where sub1loc.FK_TO_UQ_CODE = dfloc.UQ_REFERENCE_CODE", // ln 
                "  and sub1loc.COMPOUND_UQ_FIRST_CODE = 'F03'"));
    }

    public void test_UqReference_ExistsReferrer_byMutipleUq() {
        // ## Arrange ##
        registerTestData();
        WhiteUqReferenceCB cb = new WhiteUqReferenceCB();
        cb.query().existsWhiteUqReferenceRefByFkToUqCodeList(new SubQuery<WhiteUqReferenceRefCB>() {
            public void query(WhiteUqReferenceRefCB subCB) {
                subCB.query().existsWhiteUqReferenceRefNestList(new SubQuery<WhiteUqReferenceRefNestCB>() {
                    public void query(WhiteUqReferenceRefNestCB subCB) {
                        subCB.query().setCompoundUqSecondCode_Equal("S04");
                    }
                });
            }
        });

        // ## Act ##
        ListResultBean<WhiteUqReference> mainList = whiteUqReferenceBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, mainList.size());
        for (WhiteUqReference main : mainList) {
            log(main);
        }
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "exists",
                "where sub1loc.FK_TO_UQ_CODE = dfloc.UQ_REFERENCE_CODE",
                "  and exists (select sub2loc.COMPOUND_UQ_FIRST_CODE",
                "where sub2loc.COMPOUND_UQ_FIRST_CODE = sub1loc.COMPOUND_UQ_FIRST_CODE",
                "  and sub2loc.COMPOUND_UQ_SECOND_CODE = sub1loc.COMPOUND_UQ_SECOND_CODE",
                "  and sub2loc.COMPOUND_UQ_SECOND_CODE = 'S04'"));
    }

    public void test_UqReference_InScopeRelation_byUq() {
        // ## Arrange ##
        registerTestData();
        WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB();
        cb.setupSelect_WhiteUqReferenceByFkToUqCode();
        cb.query().inScopeWhiteUqReferenceByFkToUqCode(new SubQuery<WhiteUqReferenceCB>() {
            public void query(WhiteUqReferenceCB subCB) {
                subCB.query().setUqReferenceCode_Equal("FOO");
            }
        });

        // ## Act ##
        List<WhiteUqReferenceRef> refList = whiteUqReferenceRefBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, refList.size());
        for (WhiteUqReferenceRef ref : refList) {
            log(ln() + ref.toStringWithRelation());
            WhiteUqReference byFkToPkId = ref.getWhiteUqReferenceByFkToPkId();
            WhiteUqReference byFkToUqCode = ref.getWhiteUqReferenceByFkToUqCode();
            assertNull(byFkToPkId);
            assertNotNull(byFkToUqCode);
            assertEquals("FOO", byFkToUqCode.getUqReferenceCode());
        }
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    public void test_UqReference_LoadReferrer_both() {
        // ## Arrange ##
        registerTestData();
        WhiteUqReferenceCB cb = new WhiteUqReferenceCB();

        // ## Act ##
        ListResultBean<WhiteUqReference> mainList = whiteUqReferenceBhv.selectList(cb);
        whiteUqReferenceBhv.loadWhiteUqReferenceRefByFkToPkIdList(mainList,
                new ConditionBeanSetupper<WhiteUqReferenceRefCB>() {
                    public void setup(WhiteUqReferenceRefCB cb) {
                    }
                });
        whiteUqReferenceBhv.loadWhiteUqReferenceRefByFkToUqCodeList(mainList,
                new ConditionBeanSetupper<WhiteUqReferenceRefCB>() {
                    public void setup(WhiteUqReferenceRefCB cb) {
                    }
                });

        // ## Assert ##
        assertNotSame(0, mainList.size());
        StringBuilder logSb = new StringBuilder();
        for (WhiteUqReference main : mainList) {
            logSb.append(ln() + main.toStringWithRelation());
            List<WhiteUqReferenceRef> byFkToPkIdList = main.getWhiteUqReferenceRefByFkToPkIdList();
            List<WhiteUqReferenceRef> byFkToUqCodeList = main.getWhiteUqReferenceRefByFkToUqCodeList();
            assertFalse(byFkToPkIdList.isEmpty());
            assertFalse(byFkToUqCodeList.isEmpty());
            assertNotSame(byFkToPkIdList, byFkToUqCodeList);
        }
        log(logSb);
    }

    public void test_UqReference_LoadReferrer_uqOnly() {
        // ## Arrange ##
        registerTestData();
        WhiteUqReferenceCB cb = new WhiteUqReferenceCB();

        // ## Act ##
        ListResultBean<WhiteUqReference> mainList = whiteUqReferenceBhv.selectList(cb);
        whiteUqReferenceBhv.loadWhiteUqReferenceRefByFkToUqCodeList(mainList,
                new ConditionBeanSetupper<WhiteUqReferenceRefCB>() {
                    public void setup(WhiteUqReferenceRefCB cb) {
                    }
                });

        // ## Assert ##
        assertNotSame(0, mainList.size());
        StringBuilder logSb = new StringBuilder();
        for (WhiteUqReference main : mainList) {
            logSb.append(ln() + main.toStringWithRelation());
            List<WhiteUqReferenceRef> byFkToPkIdList = main.getWhiteUqReferenceRefByFkToPkIdList();
            List<WhiteUqReferenceRef> byFkToUqCodeList = main.getWhiteUqReferenceRefByFkToUqCodeList();
            assertTrue(byFkToPkIdList.isEmpty());
            assertFalse(byFkToUqCodeList.isEmpty());
            for (WhiteUqReferenceRef ref : byFkToUqCodeList) {
                assertEquals(main.getUqReferenceCode(), ref.getFkToUqCode());
            }
        }
        log(logSb);
    }

    public void test_UqReference_LoadReferrer_multipleUq() {
        // ## Arrange ##
        registerTestData();
        WhiteUqReferenceCB cb = new WhiteUqReferenceCB();

        // ## Act ##
        ListResultBean<WhiteUqReference> mainList = whiteUqReferenceBhv.selectList(cb);
        LoadReferrerOption<WhiteUqReferenceRefCB, WhiteUqReferenceRef> option = new LoadReferrerOption<WhiteUqReferenceRefCB, WhiteUqReferenceRef>();
        option.setConditionBeanSetupper(new ConditionBeanSetupper<WhiteUqReferenceRefCB>() {
            public void setup(WhiteUqReferenceRefCB cb) {
            }
        });
        option.setEntityListSetupper(new EntityListSetupper<WhiteUqReferenceRef>() {
            public void setup(List<WhiteUqReferenceRef> entityList) {
                whiteUqReferenceRefBhv.loadWhiteUqReferenceRefNestList(entityList,
                        new ConditionBeanSetupper<WhiteUqReferenceRefNestCB>() {
                            public void setup(WhiteUqReferenceRefNestCB cb) {
                            }
                        });
            }
        });
        whiteUqReferenceBhv.loadWhiteUqReferenceRefByFkToUqCodeList(mainList, option);

        // ## Assert ##
        assertNotSame(0, mainList.size());
        boolean exists = false;
        for (WhiteUqReference main : mainList) {
            log(main.getUqReferenceId() + ", " + main.getUqReferenceCode());
            List<WhiteUqReferenceRef> byFkToPkIdList = main.getWhiteUqReferenceRefByFkToPkIdList();
            List<WhiteUqReferenceRef> byFkToUqCodeList = main.getWhiteUqReferenceRefByFkToUqCodeList();
            assertTrue(byFkToPkIdList.isEmpty());
            assertFalse(byFkToUqCodeList.isEmpty());
            for (WhiteUqReferenceRef ref : byFkToUqCodeList) {
                assertEquals(main.getUqReferenceCode(), ref.getFkToUqCode());
            }
            for (WhiteUqReferenceRef ref : byFkToUqCodeList) {
                log("  " + ref.getUqReferenceRefId());
                List<WhiteUqReferenceRefNest> nestList = ref.getWhiteUqReferenceRefNestList();
                if (!nestList.isEmpty()) {
                    exists = true;
                    for (WhiteUqReferenceRefNest nest : nestList) {
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
    private List<WhiteUqReference> registerTestData() {
        List<WhiteUqReference> mainList = new ArrayList<WhiteUqReference>();
        mainList.add(xregisterWhiteUqReference(1, "FOO"));
        mainList.add(xregisterWhiteUqReference(2, "BAR"));
        mainList.add(xregisterWhiteUqReference(3, "QUX"));

        // 1 to 1...*
        xregisterWhiteUqReferenceRef(1, 1, "BAR", "F01", "S01");
        xregisterWhiteUqReferenceRef(2, 2, "FOO", "F02", "S02");
        xregisterWhiteUqReferenceRef(3, 3, "FOO", "F03", "S03");
        xregisterWhiteUqReferenceRef(4, 3, "BAR", "F04", "S04");
        xregisterWhiteUqReferenceRef(5, 3, "QUX", "F05", "S05");

        // 1 to 0...*
        xregisterWhiteUqReferenceRefNest(1, "F01", "S01");
        xregisterWhiteUqReferenceRefNest(2, "F01", "S01");
        xregisterWhiteUqReferenceRefNest(3, "F04", "S04");
        return mainList;
    }

    private WhiteUqReference xregisterWhiteUqReference(int id, String code) {
        WhiteUqReference main = new WhiteUqReference();
        main.setUqReferenceId(Long.valueOf(id));
        main.setUqReferenceCode(code);
        whiteUqReferenceBhv.insert(main);
        return main;
    }

    private WhiteUqReferenceRef xregisterWhiteUqReferenceRef(int id, int pkId, String uqCode, String firstCode,
            String secondCode) {
        WhiteUqReferenceRef ref = new WhiteUqReferenceRef();
        ref.setUqReferenceRefId(Long.valueOf(id));
        ref.setFkToPkId(Long.valueOf(pkId));
        ref.setFkToUqCode(uqCode);
        ref.setCompoundUqFirstCode(firstCode);
        ref.setCompoundUqSecondCode(secondCode);
        whiteUqReferenceRefBhv.insert(ref);
        return ref;
    }

    private WhiteUqReferenceRefNest xregisterWhiteUqReferenceRefNest(int id, String firstCode, String secondCode) {
        WhiteUqReferenceRefNest nest = new WhiteUqReferenceRefNest();
        nest.setUqReferenceRefNestId(Long.valueOf(id));
        nest.setCompoundUqFirstCode(firstCode);
        nest.setCompoundUqSecondCode(secondCode);
        whiteUqReferenceRefNestBhv.insert(nest);
        return nest;
    }

    // ===================================================================================
    //                                                                          Without PK
    //                                                                          ==========
    public void test_withoutPk_generated() throws Exception {
        // ## Arrange ##
        WhiteUqReferenceWithoutPkCB cb = new WhiteUqReferenceWithoutPkCB();
        cb.query().existsWhiteUqReferenceWithoutPkRefList(new SubQuery<WhiteUqReferenceWithoutPkRefCB>() {
            public void query(WhiteUqReferenceWithoutPkRefCB subCB) {
                subCB.query().queryWhiteUqReferenceWithoutPk().setUqReferenceName_Equal("dummy");
            }
        });

        // ## Act ##
        // ## Assert ##
        whiteUqReferenceWithoutPkBhv.selectCount(cb); // expect no exception
    }
}
