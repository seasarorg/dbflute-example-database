package com.example.dbflute.firebird.dbflute.vendor;

import java.util.Date;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.coption.DerivedReferrerOption;
import org.seasar.dbflute.exception.SQLFailureException;
import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.firebird.dbflute.cbean.MemberCB;
import com.example.dbflute.firebird.dbflute.cbean.MemberLoginCB;
import com.example.dbflute.firebird.dbflute.cbean.PurchaseCB;
import com.example.dbflute.firebird.dbflute.exbhv.MemberBhv;
import com.example.dbflute.firebird.dbflute.exentity.Member;
import com.example.dbflute.firebird.unit.AppContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.4 (2010/09/11 Saturday)
 */
public class VendorFunctionTest extends AppContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                            Coalesce
    //                                                                            ========
    public void test_sepcify_derivedReferrer_option_coalesce_basic() throws Exception {
        // ## Arrange ##
        int countAll;
        {
            MemberCB cb = new MemberCB();
            countAll = memberBhv.selectCount(cb);
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().derivedMemberLoginList().count(new SubQuery<MemberLoginCB>() {
                public void query(MemberLoginCB subCB) {
                    subCB.specify().columnMemberLoginId();
                }
            }).equal(0);
            memberBhv.selectEntityWithDeletedCheck(cb); // expect no exception
        }
        MemberCB cb = new MemberCB();
        cb.specify().derivedMemberLoginList().max(new SubQuery<MemberLoginCB>() {
            public void query(MemberLoginCB subCB) {
                subCB.specify().columnLoginDatetime();
            }
        }, Member.ALIAS_latestLoginDatetime, new DerivedReferrerOption().coalesce("1192-01-01"));
        assertTrue(cb.toDisplaySql().contains("coalesce("));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        assertEquals(countAll, memberList.size());
        boolean exists = false;
        for (Member member : memberList) {
            Date latestLoginDatetime = member.getLatestLoginDatetime();
            String loginDateView = DfTypeUtil.toString(latestLoginDatetime, "yyyy-MM-dd");
            log(member.getMemberName() + ": " + loginDateView);
            if ("1192-01-01".equals(loginDateView)) {
                exists = true;
            }
        }
        assertTrue(exists);
    }

    // ===================================================================================
    //                                                                               Round
    //                                                                               =====
    public void test_sepcify_derivedReferrer_option_round_basic() throws Exception {
        // ## Arrange ##
        int countAll;
        {
            MemberCB cb = new MemberCB();
            countAll = memberBhv.selectCount(cb);
        }
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchaseList().avg(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseCount();
            }
        }, Member.ALIAS_productKindCount, new DerivedReferrerOption().round(0));
        assertTrue(cb.toDisplaySql().contains("round("));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        assertEquals(countAll, memberList.size());
        boolean existsNotNull = true;
        boolean existsNull = true;
        for (Member member : memberList) {
            log(member.getMemberName() + ": " + member.getProductKindCount());
            if (member.getProductKindCount() != null) {
                existsNotNull = true;
            } else {
                existsNull = true;
            }
        }
        assertTrue(existsNotNull);
        assertTrue(existsNull);
    }

    // ===================================================================================
    //                                                                               Trunc
    //                                                                               =====
    public void test_sepcify_derivedReferrer_option_trunc_basic() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchaseList().avg(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseCount();
            }
        }, Member.ALIAS_productKindCount, new DerivedReferrerOption().trunc(0));
        assertTrue(cb.toDisplaySql().contains("trunc("));

        // ## Act ##
        try {
            memberBhv.selectList(cb);

            // ## Assert ##
            fail("SQLite does not support trunc() and truncate()");
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
        }
    }
}
