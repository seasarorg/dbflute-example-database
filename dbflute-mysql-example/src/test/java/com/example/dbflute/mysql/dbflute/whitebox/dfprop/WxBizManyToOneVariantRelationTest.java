package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.exception.SQLFailureException;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.cbean.WhiteVariantRelationLocalPkReferrerCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteVariantRelationMasterFooCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteVariantRelationReferrerCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteVariantRelationReferrerRefCB;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteVariantRelationLocalPkReferrerBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteVariantRelationMasterBarBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteVariantRelationMasterFooBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteVariantRelationMasterQuxBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteVariantRelationReferrerBhv;
import com.example.dbflute.mysql.dbflute.exentity.WhiteVariantRelationMasterBar;
import com.example.dbflute.mysql.dbflute.exentity.WhiteVariantRelationMasterFoo;
import com.example.dbflute.mysql.dbflute.exentity.WhiteVariantRelationMasterQux;
import com.example.dbflute.mysql.dbflute.exentity.WhiteVariantRelationReferrer;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.6 (2012/07/05 Thursday)
 */
public class WxBizManyToOneVariantRelationTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteVariantRelationMasterFooBhv whiteVariantRelationMasterFooBhv;
    private WhiteVariantRelationMasterBarBhv whiteVariantRelationMasterBarBhv;
    private WhiteVariantRelationMasterQuxBhv whiteVariantRelationMasterQuxBhv;
    private WhiteVariantRelationReferrerBhv whiteVariantRelationReferrerBhv;
    private WhiteVariantRelationLocalPkReferrerBhv whiteVariantRelationLocalPkReferrerBhv;

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    public void test_VariantRelation_SetupSelect_basic() throws Exception {
        // ## Arrange ##
        registerTestData();
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
        cb.setupSelect_WhiteVariantRelationMasterFooAsVariant();
        cb.setupSelect_WhiteVariantRelationMasterBarAsVariant();
        cb.setupSelect_WhiteVariantRelationMasterQuxAsVariantByQue();
        cb.setupSelect_WhiteVariantRelationMasterCorgeAsVariantByQuxType(CDef.VariantRelationQuxType.Qua);
        cb.query().addOrderBy_ReferrerId_Asc();

        // ## Act ##
        ListResultBean<WhiteVariantRelationReferrer> referrerList = whiteVariantRelationReferrerBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(referrerList);
        for (WhiteVariantRelationReferrer referrer : referrerList) {
            log(referrer);
            WhiteVariantRelationMasterFoo foo = referrer.getWhiteVariantRelationMasterFooAsVariant();
            WhiteVariantRelationMasterBar bar = referrer.getWhiteVariantRelationMasterBarAsVariant();
            WhiteVariantRelationMasterQux qux = referrer.getWhiteVariantRelationMasterQuxAsVariantByQue();
            if (foo != null) {
                whiteVariantRelationMasterFooBhv.selectByPKValueWithDeletedCheck(foo.getMasterFooId());
                assertTrue(referrer.isMasterTypeCodeFooCls());
                assertNull(bar);
                assertNull(qux);
            } else if (bar != null) {
                whiteVariantRelationMasterBarBhv.selectByPKValueWithDeletedCheck(bar.getMasterBarId());
                assertTrue(referrer.isMasterTypeCodeBarCls());
                assertNull(foo);
                assertNull(qux);
            } else if (qux != null) {
                whiteVariantRelationMasterQuxBhv.selectByPKValueWithDeletedCheck(qux.getMasterQuxId());
                assertTrue(referrer.isMasterTypeCodeQuxCls());
                assertNull(foo);
                assertNull(bar);
            } else {
                fail();
            }
        }
    }

    // ===================================================================================
    //                                                                        LoadReferrer
    //                                                                        ============
    public void test_VariantRelation_LoadReferrer_emptyCondition() throws Exception {
        // ## Arrange ##
        registerTestData();
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();

        // ## Act ##
        ListResultBean<WhiteVariantRelationMasterFoo> fooList = whiteVariantRelationMasterFooBhv.selectList(cb);
        whiteVariantRelationMasterFooBhv.loadWhiteVariantRelationReferrerAsVariantList(fooList,
                new ConditionBeanSetupper<WhiteVariantRelationReferrerCB>() {
                    public void setup(WhiteVariantRelationReferrerCB cb) {
                        cb.setupSelect_WhiteVariantRelationMasterBarAsVariant();
                    }
                });

        // ## Assert ##
        assertHasAnyElement(fooList);
        boolean existsReferrer = false;
        boolean notExistsReferrer = false;
        boolean existsTwoRecords = false;
        for (WhiteVariantRelationMasterFoo foo : fooList) {
            log(foo);
            List<WhiteVariantRelationReferrer> referrerList = foo.getWhiteVariantRelationReferrerAsVariantList();
            for (WhiteVariantRelationReferrer referrer : referrerList) {
                log("  " + referrer);
                assertTrue("referrer=" + referrer, referrer.isMasterTypeCodeFooCls());
                existsReferrer = true;
            }
            if (referrerList.isEmpty()) {
                notExistsReferrer = true;
            }
            if (referrerList.size() == 2) {
                existsTwoRecords = true;
            }
        }
        assertTrue(existsReferrer);
        assertTrue(notExistsReferrer);
        assertTrue(existsTwoRecords);
    }

    public void test_VariantRelation_LoadReferrer_withCondition() throws Exception {
        // ## Arrange ##
        registerTestData();
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();

        // ## Act ##
        ListResultBean<WhiteVariantRelationMasterFoo> fooList = whiteVariantRelationMasterFooBhv.selectList(cb);
        whiteVariantRelationMasterFooBhv.loadWhiteVariantRelationReferrerAsVariantList(fooList,
                new ConditionBeanSetupper<WhiteVariantRelationReferrerCB>() {
                    public void setup(WhiteVariantRelationReferrerCB cb) {
                        cb.setupSelect_WhiteVariantRelationMasterBarAsVariant();
                        cb.query().setVariantMasterId_GreaterEqual(2L);
                    }
                });

        // ## Assert ##
        assertHasAnyElement(fooList);
        boolean existsReferrer = false;
        boolean notExistsReferrer = false;
        for (WhiteVariantRelationMasterFoo foo : fooList) {
            log(foo);
            List<WhiteVariantRelationReferrer> referrerList = foo.getWhiteVariantRelationReferrerAsVariantList();
            for (WhiteVariantRelationReferrer referrer : referrerList) {
                log(referrer);
                assertTrue("referrer=" + referrer, referrer.isMasterTypeCodeFooCls());
                assertTrue("referrer=" + referrer, referrer.getVariantMasterId() >= 2);
                existsReferrer = true;
            }
            if (referrerList.isEmpty()) {
                notExistsReferrer = true;
            }
        }
        assertTrue(existsReferrer);
        assertTrue(notExistsReferrer);
    }

    public void test_VariantRelation_LoadReferrer_union() throws Exception {
        // ## Arrange ##
        registerTestData();
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();

        // ## Act ##
        ListResultBean<WhiteVariantRelationMasterFoo> fooList = whiteVariantRelationMasterFooBhv.selectList(cb);
        whiteVariantRelationMasterFooBhv.loadWhiteVariantRelationReferrerAsVariantList(fooList,
                new ConditionBeanSetupper<WhiteVariantRelationReferrerCB>() {
                    public void setup(WhiteVariantRelationReferrerCB cb) {
                        cb.setupSelect_WhiteVariantRelationMasterBarAsVariant();
                        cb.query().setVariantMasterId_GreaterEqual(1L);
                        cb.union(new UnionQuery<WhiteVariantRelationReferrerCB>() {
                            public void query(WhiteVariantRelationReferrerCB unionCB) {
                                unionCB.query().setVariantMasterId_LessEqual(2L);
                            }
                        });
                    }
                });

        // ## Assert ##
        assertHasAnyElement(fooList);
        boolean existsReferrer = false;
        boolean notExistsReferrer = false;
        boolean existsTwoRecords = false;
        for (WhiteVariantRelationMasterFoo foo : fooList) {
            log(foo);
            List<WhiteVariantRelationReferrer> referrerList = foo.getWhiteVariantRelationReferrerAsVariantList();
            for (WhiteVariantRelationReferrer referrer : referrerList) {
                log("  " + referrer);
                assertTrue("referrer=" + referrer, referrer.isMasterTypeCodeFooCls());
                assertTrue("referrer=" + referrer, referrer.getVariantMasterId() <= 2);
                assertTrue("referrer=" + referrer, referrer.getVariantMasterId() >= 1);
                existsReferrer = true;
            }
            if (referrerList.isEmpty()) {
                notExistsReferrer = true;
            }
            if (referrerList.size() == 2) {
                existsTwoRecords = true;
            }
        }
        assertTrue(existsReferrer);
        assertTrue(notExistsReferrer);
        assertTrue(existsTwoRecords);
    }

    // ===================================================================================
    //                                                                      ExistsReferrer
    //                                                                      ==============
    public void test_VariantRelation_ExistsReferrer_emptyCondition() throws Exception {
        // ## Arrange ##
        registerTestData();
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
        cb.query().existsWhiteVariantRelationReferrerAsVariantList(new SubQuery<WhiteVariantRelationReferrerCB>() {
            public void query(WhiteVariantRelationReferrerCB subCB) {
            }
        });

        // ## Act ##
        ListResultBean<WhiteVariantRelationMasterFoo> fooList = whiteVariantRelationMasterFooBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(fooList);
        for (WhiteVariantRelationMasterFoo foo : fooList) {
            log(foo);
            WhiteVariantRelationReferrerCB referrerCB = new WhiteVariantRelationReferrerCB();
            referrerCB.query().setVariantMasterId_Equal(foo.getMasterFooId());
            referrerCB.query().setMasterTypeCode_Equal_FooCls();
            assertFalse(whiteVariantRelationReferrerBhv.selectList(referrerCB).isEmpty());
        }
        String sql = cb.toDisplaySql();
        assertTrue(Srl.containsIgnoreCase(sql, "and sub1loc.MASTER_TYPE_CODE = 'FOO'"));
    }

    public void test_VariantRelation_ExistsReferrer_withCondition() throws Exception {
        // ## Arrange ##
        registerTestData();
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
        cb.query().existsWhiteVariantRelationReferrerAsVariantList(new SubQuery<WhiteVariantRelationReferrerCB>() {
            public void query(WhiteVariantRelationReferrerCB subCB) {
                subCB.query().setVariantMasterId_GreaterEqual(2L);
            }
        });

        // ## Act ##
        ListResultBean<WhiteVariantRelationMasterFoo> fooList = whiteVariantRelationMasterFooBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(fooList);
        for (WhiteVariantRelationMasterFoo foo : fooList) {
            log(foo);
            WhiteVariantRelationReferrerCB referrerCB = new WhiteVariantRelationReferrerCB();
            referrerCB.query().setVariantMasterId_Equal(foo.getMasterFooId());
            referrerCB.query().setVariantMasterId_GreaterEqual(2L);
            referrerCB.query().setMasterTypeCode_Equal_FooCls();
            assertFalse(whiteVariantRelationReferrerBhv.selectList(referrerCB).isEmpty());
        }
        String sql = cb.toDisplaySql();
        assertTrue(Srl.containsIgnoreCase(sql, "where sub1loc.VARIANT_MASTER_ID = dfloc.MASTER_FOO_ID"));
        assertTrue(Srl.containsIgnoreCase(sql, "  and sub1loc.MASTER_TYPE_CODE = 'FOO'"));
        assertTrue(Srl.containsIgnoreCase(sql, "  and sub1loc.VARIANT_MASTER_ID >= 2"));
    }

    public void test_VariantRelation_ExistsReferrer_Union() throws Exception {
        // ## Arrange ##
        registerTestData();
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
        cb.query().existsWhiteVariantRelationReferrerAsVariantList(new SubQuery<WhiteVariantRelationReferrerCB>() {
            public void query(WhiteVariantRelationReferrerCB subCB) {
                subCB.query().setVariantMasterId_GreaterEqual(1L);
                subCB.union(new UnionQuery<WhiteVariantRelationReferrerCB>() {
                    public void query(WhiteVariantRelationReferrerCB unionCB) {
                        unionCB.query().setVariantMasterId_LessEqual(2L);
                    }
                });
            }
        });

        // ## Act ##
        ListResultBean<WhiteVariantRelationMasterFoo> fooList = whiteVariantRelationMasterFooBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(fooList);
        for (WhiteVariantRelationMasterFoo foo : fooList) {
            log(foo);
            WhiteVariantRelationReferrerCB referrerCB = new WhiteVariantRelationReferrerCB();
            referrerCB.query().setVariantMasterId_Equal(foo.getMasterFooId());
            referrerCB.query().setVariantMasterId_GreaterEqual(1L);
            referrerCB.query().setVariantMasterId_LessEqual(2L);
            referrerCB.query().setMasterTypeCode_Equal_FooCls();
            assertFalse(whiteVariantRelationReferrerBhv.selectList(referrerCB).isEmpty());
        }
        String sql = cb.toDisplaySql();
        assertEquals(2, Srl.countIgnoreCase(sql, "where sub1loc.VARIANT_MASTER_ID = dfloc.MASTER_FOO_ID"));
        assertEquals(2, Srl.countIgnoreCase(sql, "  and sub1loc.MASTER_TYPE_CODE = 'FOO'"));
        assertTrue(Srl.containsIgnoreCase(sql, "  and sub1loc.VARIANT_MASTER_ID >= 1"));
        assertTrue(Srl.containsIgnoreCase(sql, "  and sub1loc.VARIANT_MASTER_ID <= 2"));
    }

    // ===================================================================================
    //                                                                     DerivedReferrer
    //                                                                     ===============
    public void test_VariantRelation_DerivedReferrer_basic() throws Exception {
        // ## Arrange ##
        registerTestData();
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
        cb.specify().derivedWhiteVariantRelationReferrerAsVariantList()
                .max(new SubQuery<WhiteVariantRelationReferrerCB>() {
                    public void query(WhiteVariantRelationReferrerCB subCB) {
                        subCB.specify().columnReferrerId();
                    }
                }, WhiteVariantRelationMasterFoo.ALIAS_highestPurchasePrice);
        cb.query().addOrderBy_MasterFooId_Asc();

        // ## Act ##
        ListResultBean<WhiteVariantRelationMasterFoo> fooList = whiteVariantRelationMasterFooBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(fooList);
        assertEquals(5, fooList.get(0).getHighestPurchasePrice());
        assertEquals(4, fooList.get(1).getHighestPurchasePrice());
        assertEquals(null, fooList.get(2).getHighestPurchasePrice());
    }

    public void test_VariantRelation_DerivedReferrer_union_basic() throws Exception {
        // ## Arrange ##
        registerTestData();
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
        cb.specify().derivedWhiteVariantRelationReferrerAsVariantList()
                .max(new SubQuery<WhiteVariantRelationReferrerCB>() {
                    public void query(WhiteVariantRelationReferrerCB subCB) {
                        subCB.specify().columnReferrerId();
                        subCB.union(new UnionQuery<WhiteVariantRelationReferrerCB>() {
                            public void query(WhiteVariantRelationReferrerCB unionCB) {
                            }
                        });
                    }
                }, WhiteVariantRelationMasterFoo.ALIAS_highestPurchasePrice);
        cb.query().addOrderBy_MasterFooId_Asc();

        // ## Act ##
        ListResultBean<WhiteVariantRelationMasterFoo> fooList = whiteVariantRelationMasterFooBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(fooList);
        assertEquals(5, fooList.get(0).getHighestPurchasePrice());
        assertEquals(4, fooList.get(1).getHighestPurchasePrice());
        assertEquals(null, fooList.get(2).getHighestPurchasePrice());

        assertTrue(Srl.containsAll(cb.toDisplaySql(), "union", "max(", // 
                "where sub1main.VARIANT_MASTER_ID = dfloc.MASTER_FOO_ID", // 
                "  and sub1main.MASTER_TYPE_CODE = 'FOO'"));
    }

    public void test_VariantRelation_DerivedReferrer_union_with_nest() throws Exception {
        // ## Arrange ##
        registerTestData();
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
        cb.specify().derivedWhiteVariantRelationReferrerAsVariantList()
                .max(new SubQuery<WhiteVariantRelationReferrerCB>() {
                    public void query(WhiteVariantRelationReferrerCB subCB) {
                        subCB.specify().derivedWhiteVariantRelationReferrerRefList()
                                .max(new SubQuery<WhiteVariantRelationReferrerRefCB>() {
                                    public void query(WhiteVariantRelationReferrerRefCB subCB) {
                                        subCB.specify().columnRefId();
                                        subCB.query().setReferrerId_LessEqual(100L);
                                    }
                                }, null);
                        subCB.union(new UnionQuery<WhiteVariantRelationReferrerCB>() {
                            public void query(WhiteVariantRelationReferrerCB unionCB) {
                                unionCB.query().setMasterTypeCode_Equal_BarCls();
                            }
                        });
                    }
                }, WhiteVariantRelationMasterFoo.ALIAS_highestPurchasePrice);
        cb.query().addOrderBy_MasterFooId_Asc();

        // ## Act ##
        whiteVariantRelationMasterFooBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String sql = cb.toDisplaySql();
        assertTrue(sql.contains("select dfloc.MASTER_FOO_ID as MASTER_FOO_ID, dfloc.MASTER_FOO_NAME"));
        assertTrue(sql.contains("as MASTER_FOO_ID, dfloc.MASTER_FOO_NAME as MASTER_FOO_NAME"));
        assertTrue(sql.contains("and sub2loc.REFERRER_ID <= 100"));
        assertTrue(sql.contains("from (select sub1loc.REFERRER_ID, sub1loc.VARIANT_MASTER_ID,"));
        assertTrue(sql.contains(", sub1loc.VARIANT_MASTER_ID, sub1loc.MASTER_TYPE_CODE"));
        assertTrue(sql.contains("where sub1loc.MASTER_TYPE_CODE = 'BAR'"));
        assertTrue(sql.contains("where sub1main.VARIANT_MASTER_ID = dfloc.MASTER_FOO_ID"));
        assertTrue(sql.contains("  and sub1main.MASTER_TYPE_CODE = 'FOO'"));
        /*
        select dfloc.MASTER_FOO_ID as MASTER_FOO_ID, dfloc.MASTER_FOO_NAME as MASTER_FOO_NAME
             , (select max((select max(sub2loc.REF_ID)
                              from WHITE_VARIANT_RELATION_REFERRER_REF sub2loc
                             where sub2loc.REFERRER_ID = sub1main.REFERRER_ID
                               and sub2loc.REFERRER_ID <= 100
                       ))
                  from (select sub1loc.REFERRER_ID, sub1loc.VARIANT_MASTER_ID, sub1loc.MASTER_TYPE_CODE
                          from WHITE_VARIANT_RELATION_REFERRER sub1loc
                         union 
                        select sub1loc.REFERRER_ID, sub1loc.VARIANT_MASTER_ID, sub1loc.MASTER_TYPE_CODE 
                          from WHITE_VARIANT_RELATION_REFERRER sub1loc 
                         where sub1loc.MASTER_TYPE_CODE = 'BAR'
                       ) sub1main
                 where sub1main.VARIANT_MASTER_ID = dfloc.MASTER_FOO_ID
                   and sub1main.MASTER_TYPE_CODE = 'FOO'
               ) as HIGHEST_PURCHASE_PRICE
          from WHITE_VARIANT_RELATION_MASTER_FOO dfloc 
         order by dfloc.MASTER_FOO_ID asc
        */
    }

    // ===================================================================================
    //                                                                     InScopeRelation
    //                                                                     ===============
    public void test_VariantRelation_InScopeRelation_emptyCondition() throws Exception {
        // ## Arrange ##
        registerTestData();
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
        cb.query().inScopeWhiteVariantRelationReferrerAsVariantList(new SubQuery<WhiteVariantRelationReferrerCB>() {
            public void query(WhiteVariantRelationReferrerCB subCB) {
            }
        });

        // ## Act ##
        ListResultBean<WhiteVariantRelationMasterFoo> fooList = whiteVariantRelationMasterFooBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(fooList);
        for (WhiteVariantRelationMasterFoo foo : fooList) {
            log(foo);
            WhiteVariantRelationReferrerCB referrerCB = new WhiteVariantRelationReferrerCB();
            referrerCB.query().setVariantMasterId_Equal(foo.getMasterFooId());
            referrerCB.query().setMasterTypeCode_Equal_FooCls();
            assertFalse(whiteVariantRelationReferrerBhv.selectList(referrerCB).isEmpty());
        }
        String sql = cb.toDisplaySql();
        assertTrue(Srl.containsIgnoreCase(sql, "where sub1loc.MASTER_TYPE_CODE = 'FOO'"));
    }

    public void test_VariantRelation_InScopeRelation_withCondition() throws Exception {
        // ## Arrange ##
        registerTestData();
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
        cb.query().inScopeWhiteVariantRelationReferrerAsVariantList(new SubQuery<WhiteVariantRelationReferrerCB>() {
            public void query(WhiteVariantRelationReferrerCB subCB) {
                subCB.query().setVariantMasterId_GreaterEqual(2L);
            }
        });

        // ## Act ##
        ListResultBean<WhiteVariantRelationMasterFoo> fooList = whiteVariantRelationMasterFooBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(fooList);
        for (WhiteVariantRelationMasterFoo foo : fooList) {
            log(foo);
            WhiteVariantRelationReferrerCB referrerCB = new WhiteVariantRelationReferrerCB();
            referrerCB.query().setVariantMasterId_Equal(foo.getMasterFooId());
            referrerCB.query().setVariantMasterId_GreaterEqual(2L);
            referrerCB.query().setMasterTypeCode_Equal_FooCls();
            assertFalse(whiteVariantRelationReferrerBhv.selectList(referrerCB).isEmpty());
        }
        String sql = cb.toDisplaySql();
        assertTrue(Srl.containsIgnoreCase(sql, "where sub1loc.MASTER_TYPE_CODE = 'FOO'"));
        assertTrue(Srl.containsIgnoreCase(sql, "  and sub1loc.VARIANT_MASTER_ID >= 2"));
    }

    public void test_VariantRelation_InScopeRelation_Union() throws Exception {
        // ## Arrange ##
        registerTestData();
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
        cb.query().inScopeWhiteVariantRelationReferrerAsVariantList(new SubQuery<WhiteVariantRelationReferrerCB>() {
            public void query(WhiteVariantRelationReferrerCB subCB) {
                subCB.query().setVariantMasterId_GreaterEqual(1L);
                subCB.union(new UnionQuery<WhiteVariantRelationReferrerCB>() {
                    public void query(WhiteVariantRelationReferrerCB unionCB) {
                        unionCB.query().setVariantMasterId_LessEqual(2L);
                    }
                });
            }
        });

        // ## Act ##
        ListResultBean<WhiteVariantRelationMasterFoo> fooList = whiteVariantRelationMasterFooBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(fooList);
        for (WhiteVariantRelationMasterFoo foo : fooList) {
            log(foo);
            WhiteVariantRelationReferrerCB referrerCB = new WhiteVariantRelationReferrerCB();
            referrerCB.query().setVariantMasterId_Equal(foo.getMasterFooId());
            referrerCB.query().setVariantMasterId_GreaterEqual(1L);
            referrerCB.query().setVariantMasterId_LessEqual(2L);
            referrerCB.query().setMasterTypeCode_Equal_FooCls();
            assertFalse(whiteVariantRelationReferrerBhv.selectList(referrerCB).isEmpty());
        }
        String sql = cb.toDisplaySql();
        assertEquals(2, Srl.countIgnoreCase(sql, " where sub1loc.MASTER_TYPE_CODE = 'FOO'"));
        assertTrue(Srl.containsIgnoreCase(sql, "  and sub1loc.VARIANT_MASTER_ID >= 1"));
        assertTrue(Srl.containsIgnoreCase(sql, "  and sub1loc.VARIANT_MASTER_ID <= 2"));
    }

    // ===================================================================================
    //                                                        BizOneToOne for BizManyToOne
    //                                                        ============================
    public void test_VariantRelation_SetupSelect_BizOneToOneForBizManyToOne() throws Exception {
        // ## Arrange ##
        registerTestData();
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
        cb.setupSelect_WhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne();

        // ## Act ##
        ListResultBean<WhiteVariantRelationMasterFoo> masterList = whiteVariantRelationMasterFooBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(masterList);
        for (WhiteVariantRelationMasterFoo master : masterList) {
            log(master);
        }
    }

    // ===================================================================================
    //                                                       BizManyToOne-like BizOneToOne
    //                                                       =============================
    public void test_BizManyToOneLikeOneToOne_basic() throws Exception {
        // ## Arrange ##
        WhiteVariantRelationLocalPkReferrerCB cb = new WhiteVariantRelationLocalPkReferrerCB();
        cb.setupSelect_WhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne();

        // ## Act ##
        whiteVariantRelationLocalPkReferrerBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String sql = cb.toDisplaySql();
        assertContains(sql, "and dfloc.MASTER_TYPE_CODE = 'FOO'");
    }

    public void test_BizManyToOneLikeOneToOne_referrer() throws Exception {
        // ## Arrange ##
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
        cb.setupSelect_WhiteVariantRelationLocalPkReferrerAsOne();

        // ## Act ##
        // unsupported for now, $$localAlias$$ should be resolved as foreign here
        // so you should fixedReferre = false
        try {
            whiteVariantRelationMasterFooBhv.selectList(cb);
            // ## Assert ##
            fail();
        } catch (SQLFailureException e) {
            log(e.getMessage());
        }
        String sql = cb.toDisplaySql();
        assertContains(sql, "and dfloc.MASTER_TYPE_CODE = 'FOO'");
    }

    // ===================================================================================
    //                                                                            TestData
    //                                                                            ========
    protected void registerTestData() {
        doRegisterTestDataFoo();
        doRegisterTestDataBar();
        doRegisterTestDataQux();
        doRegisterTestDataReferrer();
    }

    protected void doRegisterTestDataFoo() {
        List<WhiteVariantRelationMasterFoo> fooList = new ArrayList<WhiteVariantRelationMasterFoo>();
        {
            WhiteVariantRelationMasterFoo foo = new WhiteVariantRelationMasterFoo();
            foo.setMasterFooId(1L);
            foo.setMasterFooName("foo1");
            fooList.add(foo);
        }
        {
            WhiteVariantRelationMasterFoo foo = new WhiteVariantRelationMasterFoo();
            foo.setMasterFooId(2L);
            foo.setMasterFooName("foo2");
            fooList.add(foo);
        }
        {
            WhiteVariantRelationMasterFoo foo = new WhiteVariantRelationMasterFoo();
            foo.setMasterFooId(3L);
            foo.setMasterFooName("foo3");
            fooList.add(foo);
        }
        whiteVariantRelationMasterFooBhv.batchInsert(fooList);
    }

    protected void doRegisterTestDataBar() {
        List<WhiteVariantRelationMasterBar> barList = new ArrayList<WhiteVariantRelationMasterBar>();
        {
            WhiteVariantRelationMasterBar bar = new WhiteVariantRelationMasterBar();
            bar.setMasterBarId(1L);
            bar.setMasterBarName("bar1");
            barList.add(bar);
        }
        {
            WhiteVariantRelationMasterBar bar = new WhiteVariantRelationMasterBar();
            bar.setMasterBarId(2L);
            bar.setMasterBarName("bar2");
            barList.add(bar);
        }
        {
            WhiteVariantRelationMasterBar bar = new WhiteVariantRelationMasterBar();
            bar.setMasterBarId(3L);
            bar.setMasterBarName("bar3");
            barList.add(bar);
        }
        whiteVariantRelationMasterBarBhv.batchInsert(barList);
    }

    protected void doRegisterTestDataQux() {
        List<WhiteVariantRelationMasterQux> quxList = new ArrayList<WhiteVariantRelationMasterQux>();
        {
            WhiteVariantRelationMasterQux qux = new WhiteVariantRelationMasterQux();
            qux.setMasterQuxId(1L);
            qux.setMasterQuxName("qux1");
            qux.setQuxTypeCode_Que();
            quxList.add(qux);
        }
        {
            WhiteVariantRelationMasterQux qux = new WhiteVariantRelationMasterQux();
            qux.setMasterQuxId(2L);
            qux.setMasterQuxName("qux2");
            qux.setQuxTypeCode_Que();
            quxList.add(qux);
        }
        {
            WhiteVariantRelationMasterQux qux = new WhiteVariantRelationMasterQux();
            qux.setMasterQuxId(3L);
            qux.setMasterQuxName("qux3");
            qux.setQuxTypeCode_Quo();
            quxList.add(qux);
        }
        whiteVariantRelationMasterQuxBhv.batchInsert(quxList);
    }

    protected void doRegisterTestDataReferrer() {
        List<WhiteVariantRelationReferrer> referrerList = new ArrayList<WhiteVariantRelationReferrer>();
        {
            WhiteVariantRelationReferrer referrer = new WhiteVariantRelationReferrer();
            referrer.setReferrerId(1L);
            referrer.setVariantMasterId(1L);
            referrer.setMasterTypeCode_FooCls();
            referrerList.add(referrer);
        }
        {
            WhiteVariantRelationReferrer referrer = new WhiteVariantRelationReferrer();
            referrer.setReferrerId(2L);
            referrer.setVariantMasterId(1L);
            referrer.setMasterTypeCode_BarCls();
            referrerList.add(referrer);
        }
        {
            WhiteVariantRelationReferrer referrer = new WhiteVariantRelationReferrer();
            referrer.setReferrerId(3L);
            referrer.setVariantMasterId(2L);
            referrer.setMasterTypeCode_QuxCls();
            referrerList.add(referrer);
        }
        {
            WhiteVariantRelationReferrer referrer = new WhiteVariantRelationReferrer();
            referrer.setReferrerId(4L);
            referrer.setVariantMasterId(2L);
            referrer.setMasterTypeCode_FooCls();
            referrerList.add(referrer);
        }
        {
            WhiteVariantRelationReferrer referrer = new WhiteVariantRelationReferrer();
            referrer.setReferrerId(5L);
            referrer.setVariantMasterId(1L);
            referrer.setMasterTypeCode_FooCls();
            referrerList.add(referrer);
        }
        {
            WhiteVariantRelationReferrer referrer = new WhiteVariantRelationReferrer();
            referrer.setReferrerId(6L);
            referrer.setVariantMasterId(2L);
            referrer.setMasterTypeCode_BarCls();
            referrerList.add(referrer);
        }
        {
            WhiteVariantRelationReferrer referrer = new WhiteVariantRelationReferrer();
            referrer.setReferrerId(7L);
            referrer.setVariantMasterId(3L);
            referrer.setMasterTypeCode_BarCls();
            referrerList.add(referrer);
        }
        whiteVariantRelationReferrerBhv.batchInsert(referrerList);
    }
}
