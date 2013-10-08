package com.example.dbflute.mysql.dbflute.whitebox;

import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.coption.DerivedReferrerOption;

import com.example.dbflute.mysql.dbflute.cbean.MemberLoginCB;
import com.example.dbflute.mysql.dbflute.cbean.MemberServiceCB;
import com.example.dbflute.mysql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.mysql.dbflute.cbean.ServiceRankCB;
import com.example.dbflute.mysql.dbflute.exentity.ServiceRank;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxCBNestedReferrerFormatTest extends UnitContainerTestCase {

    public void test_NestedReferrer_onParade() throws Exception {
        // ## Arrange ##
        ServiceRankCB cb = new ServiceRankCB();
        cb.specify().derivedMemberServiceList().count(new SubQuery<MemberServiceCB>() {
            public void query(MemberServiceCB subCB) {
                subCB.specify().columnMemberServiceId();
            }
        }, ServiceRank.ALIAS_memberCount);
        cb.specify().derivedMemberServiceList().sum(new SubQuery<MemberServiceCB>() {
            public void query(MemberServiceCB subCB) {
                subCB.specify().specifyMember().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.specify().columnPurchasePrice();
                    }
                }, null);
            }
        }, ServiceRank.ALIAS_maxPurchasePrice);
        cb.specify().derivedMemberServiceList().avg(new SubQuery<MemberServiceCB>() {
            public void query(MemberServiceCB subCB) {
                subCB.specify().specifyMember().derivedPurchaseList().avg(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.specify().columnPurchasePrice();
                    }
                }, null);
            }
        }, ServiceRank.ALIAS_avgPurchasePrice);
        cb.specify().derivedMemberServiceList().avg(new SubQuery<MemberServiceCB>() {
            public void query(MemberServiceCB subCB) {
                subCB.specify().columnServicePointCount();
            }
        }, ServiceRank.ALIAS_sumPointCount);
        cb.specify().derivedMemberServiceList().count(new SubQuery<MemberServiceCB>() {
            public void query(MemberServiceCB subCB) {
                subCB.specify().specifyMember().derivedMemberLoginList().count(new SubQuery<MemberLoginCB>() {

                    public void query(MemberLoginCB subCB) {
                        subCB.specify().columnMemberLoginId();
                    }
                }, null);
            }
        }, ServiceRank.ALIAS_loginCount);
        cb.columnQuery(new SpecifyQuery<ServiceRankCB>() {
            public void specify(ServiceRankCB cb) {
                cb.specify().columnDisplayOrder();
            }
        }).greaterThan(new SpecifyQuery<ServiceRankCB>() {
            public void specify(ServiceRankCB cb) {
                cb.specify().derivedMemberServiceList().avg(new SubQuery<MemberServiceCB>() {
                    public void query(MemberServiceCB subCB) {
                        subCB.specify().columnServicePointCount();
                        subCB.query().setUpdateUser_Equal("ColumnQueryUser");
                    }
                }, null, new DerivedReferrerOption().coalesce(123).round(8));
            }
        });
        cb.query().existsMemberServiceList(new SubQuery<MemberServiceCB>() {
            public void query(MemberServiceCB subCB) {
                subCB.columnQuery(new SpecifyQuery<MemberServiceCB>() {
                    public void specify(MemberServiceCB cb) {
                        cb.specify().columnServicePointCount();
                    }
                }).greaterThan(new SpecifyQuery<MemberServiceCB>() {
                    public void specify(MemberServiceCB cb) {
                        cb.specify().specifyServiceRank().derivedMemberServiceList()
                                .avg(new SubQuery<MemberServiceCB>() {
                                    public void query(MemberServiceCB subCB) {
                                        subCB.specify().columnServicePointCount();
                                        subCB.query().setUpdateUser_Equal("ColumnQueryUser");
                                    }
                                }, null, new DerivedReferrerOption().coalesce(123));
                    }
                });
                subCB.columnQuery(new SpecifyQuery<MemberServiceCB>() {
                    public void specify(MemberServiceCB cb) {
                        cb.specify().specifyServiceRank().derivedMemberServiceList()
                                .avg(new SubQuery<MemberServiceCB>() {
                                    public void query(MemberServiceCB subCB) {
                                        subCB.specify().columnServicePointCount();
                                        subCB.query().setUpdateUser_Equal("@ServicePointCount");
                                    }
                                }, null, new DerivedReferrerOption().coalesce(789));
                    }
                }).greaterThan(new SpecifyQuery<MemberServiceCB>() {
                    public void specify(MemberServiceCB cb) {
                        cb.specify().columnServicePointCount();
                    }
                });
                subCB.columnQuery(new SpecifyQuery<MemberServiceCB>() {
                    public void specify(MemberServiceCB cb) {
                        cb.specify().specifyMember().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
                            public void query(PurchaseCB subCB) {
                                subCB.specify().columnPurchasePrice();
                            }
                        }, null);
                    }
                }).greaterThan(new SpecifyQuery<MemberServiceCB>() {
                    public void specify(MemberServiceCB cb) {
                        cb.specify().specifyServiceRank().derivedMemberServiceList()
                                .avg(new SubQuery<MemberServiceCB>() {
                                    public void query(MemberServiceCB subCB) {
                                        subCB.specify().columnServicePointCount();
                                    }
                                }, null, new DerivedReferrerOption().coalesce(456));
                    }
                }).plus(999);
            }
        });

        // ## Act ##
        String displaySql = cb.toDisplaySql();

        // ## Assert ##
        log(ln() + displaySql);
        assertTrue(displaySql.contains("= 'ColumnQueryUser'"));
        assertTrue(displaySql.contains(", 123"));
    }
}
