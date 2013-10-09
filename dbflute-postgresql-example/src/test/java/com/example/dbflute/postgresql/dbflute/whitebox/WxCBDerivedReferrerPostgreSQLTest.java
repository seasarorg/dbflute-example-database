package com.example.dbflute.postgresql.dbflute.whitebox;

import java.util.Date;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.coption.DerivedReferrerOption;
import org.seasar.dbflute.util.DfTypeUtil;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.postgresql.dbflute.cbean.MemberCB;
import com.example.dbflute.postgresql.dbflute.cbean.MemberLoginCB;
import com.example.dbflute.postgresql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.postgresql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.postgresql.dbflute.exentity.Member;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.7 (2010/12/04 Saturday)
 */
public class WxCBDerivedReferrerPostgreSQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_sepcify_derivedReferrer_trunc_date_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedMemberLoginList().max(new SubQuery<MemberLoginCB>() {
            public void query(MemberLoginCB subCB) {
                subCB.specify().columnLoginDatetime();
                subCB.query().setMobileLoginFlg_Equal_False();
            }
        }, Member.ALIAS_latestLoginDatetime, new DerivedReferrerOption().coalesce("1900-12-04").trunc("year"));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        boolean existsLoginDatetime = false;
        for (Member member : memberList) {
            String memberName = member.getMemberName();
            Date latestLoginDatetime = member.getLatestLoginDatetime();
            assertNotNull(latestLoginDatetime);
            String formatted = DfTypeUtil.toString(latestLoginDatetime, "yyyy-MM-dd");
            assertTrue(Srl.endsWith(formatted, "-01-01"));
            if (formatted.equals("1900-01-01")) {
                existsLoginDatetime = true;
            }
            log("memberName=" + memberName + ", latestLoginDatetime=" + formatted);
        }
        assertTrue(existsLoginDatetime);
        String sql = cb.toDisplaySql();
        assertTrue(Srl.contains(sql, "select date_trunc('year', coalesce"));
        assertTrue(Srl.contains(sql, ", coalesce(max(sub1loc.login_datetime), '1900-12-04'))"));
    }

    public void test_sepcify_derivedReferrer_trunc_date_nested() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedMemberLoginList().max(new SubQuery<MemberLoginCB>() {
            public void query(MemberLoginCB subCB) {
                subCB.specify().specifyMember().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.specify().columnPurchaseDatetime();
                    }
                }, null, new DerivedReferrerOption().coalesce("1900-12-04").trunc("year"));
                subCB.query().setMobileLoginFlg_Equal_False();
            }
        }, Member.ALIAS_latestLoginDatetime, new DerivedReferrerOption().coalesce("1900-12-04").trunc("year"));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        boolean existsLoginDatetime = false;
        for (Member member : memberList) {
            String memberName = member.getMemberName();
            Date latestLoginDatetime = member.getLatestLoginDatetime();
            assertNotNull(latestLoginDatetime);
            String formatted = DfTypeUtil.toString(latestLoginDatetime, "yyyy-MM-dd");
            assertTrue(Srl.endsWith(formatted, "-01-01"));
            if (formatted.equals("1900-01-01")) {
                existsLoginDatetime = true;
            }
            log("memberName=" + memberName + ", latestLoginDatetime=" + formatted);
        }
        assertTrue(existsLoginDatetime);
        String sql = cb.toDisplaySql();
        assertTrue(Srl.contains(sql, ", (select date_trunc('year'" + ln()));
        assertTrue(Srl.contains(sql, ", coalesce(max((select date_trunc('year'"));
        assertTrue(Srl.contains(sql, ", coalesce(max(sub2loc.purchase_datetime), '1900-12-04'))"));
        assertTrue(Srl.contains(sql, "and sub1loc.mobile_login_flg = 0"));
    }
}
