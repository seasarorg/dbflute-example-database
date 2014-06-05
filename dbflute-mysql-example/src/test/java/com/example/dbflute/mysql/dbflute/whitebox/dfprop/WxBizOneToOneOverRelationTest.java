package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.seasar.dbflute.CallbackContext;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.exception.FixedConditionIllegalOverRelationException;
import org.seasar.dbflute.jdbc.SqlLogHandler;
import org.seasar.dbflute.jdbc.SqlLogInfo;
import org.seasar.dbflute.util.DfTypeUtil;
import org.seasar.dbflute.util.Srl;
import org.seasar.dbflute.util.Srl.IndexOfInfo;

import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.mysql.dbflute.cbean.WhitePurchaseReferrerCB;
import com.example.dbflute.mysql.dbflute.cbean.cq.MemberLoginCQ;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhitePurchaseReferrerBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxBizOneToOneOverRelationTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;
    private PurchaseBhv purchaseBhv;
    private WhitePurchaseReferrerBhv whitePurchaseReferrerBhv;

    // ===================================================================================
    //                                                                       Local Foreign
    //                                                                       =============
    public void test_OverRelation_LocalForeign_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsLocalForeignOverTest();

        // ## Act ##
        memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, " join member_status"));
        assertTrue(displaySql.contains(".MEMBER_STATUS_NAME"));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    public void test_OverRelation_LocalForeign_nest() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberLoginAsLocalForeignOverTest();

        // ## Act ##
        purchaseBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, " join member_status"));
        assertTrue(displaySql.contains(".MEMBER_STATUS_NAME"));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    public void test_OverRelation_LocalForeign_setup() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();
        cb.setupSelect_MemberLoginAsLocalForeignOverTest();

        // ## Act ##
        memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, " join member_status"));
        assertTrue(displaySql.contains(".MEMBER_STATUS_NAME"));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    public void test_OverRelation_LocalForeign_subQuery() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().existsPurchaseList(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().queryMember().queryMemberLoginAsLocalForeignOverTest().setMobileLoginFlg_Equal_True();
            }
        });

        // ## Act ##
        memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "inner join member sub1rel"));
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "left outer join member_status sub1rel"));
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "inner join member_login sub1rel"));
        assertTrue(displaySql.contains("exists (select"));
        assertTrue(displaySql.contains(".MEMBER_STATUS_NAME"));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    public void test_OverRelation_LocalForeign_with_otherOvers() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberLoginAsLocalForeignOverTest();
        cb.setupSelect_Member().withMemberLoginAsReferrerForeignOverTest().withMemberStatus();
        cb.setupSelect_Product().withProductStatus();
        cb.setupSelect_Member().withMemberLoginAsForeignForeignParameterOverTest(DfTypeUtil.toDate("2010/10/12"))
                .withMemberStatus();

        // ## Act ##
        purchaseBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "left outer join member"));
        assertTrue(Srl.containsAllIgnoreCase(displaySql, " join member_status"));
        assertTrue(displaySql.contains("BIRTHDATE > '2010-10-12'"));
        assertTrue(displaySql.contains(".MEMBER_STATUS_NAME"));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    // ===================================================================================
    //                                                                     Foreign Foreign
    //                                                                     ===============
    // -----------------------------------------------------
    //                                                  Each
    //                                                  ----
    public void test_OverRelation_ForeignForeignEach_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsForeignForeignEachOverTest();

        // ## Act ##
        memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, " join member_status dfrel"));
        assertTrue(Srl.containsAllIgnoreCase(displaySql, " join member_status dffixedjoin"));
        assertTrue(displaySql.contains(".DISPLAY_ORDER = "));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    public void test_OverRelation_ForeignForeignEach_with_normalInlineView() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsForeignForeignEachOverTest();
        cb.query().queryMemberLoginAsForeignForeignEachOverTest().inline().setMobileLoginFlg_Equal_True();

        // ## Act ##
        memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "left outer join member_status dfrel"));
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "left outer join member_status dffixedjoin"));
        assertTrue(displaySql.contains(".DISPLAY_ORDER = "));
        assertTrue(displaySql.contains("where dfinlineloc.MOBILE_LOGIN_FLG = 1"));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    public void test_OverRelation_ForeignForeignEach_with_normalOnClause() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsForeignForeignEachOverTest();
        cb.query().queryMemberLoginAsForeignForeignEachOverTest().on().setMobileLoginFlg_Equal_True();

        // ## Act ##
        memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "left outer join member_status dfrel"));
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "left outer join member_status dffixedjoin"));
        assertTrue(displaySql.contains(".DISPLAY_ORDER = "));
        assertTrue(displaySql.contains(".MOBILE_LOGIN_FLG = 1"));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    // -----------------------------------------------------
    //                                                  Bind
    //                                                  ----
    public void test_OverRelation_ForeignForeignBindOptimized_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsForeignForeignBindOverTest(3);

        // ## Act ##
        memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "select dffixedbase.*\n"));
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "join MEMBER_STATUS dffixedjoin_0_0"));
        assertTrue(displaySql.contains("on "));
        String beforeOn = Srl.substringLastFront(displaySql, "on ");
        assertTrue(Srl.containsIgnoreCase(beforeOn, "where dffixedjoin_0_0.DISPLAY_ORDER = 3"));
        assertEquals(1, Srl.countIgnoreCase(displaySql, ".DISPLAY_ORDER = "));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    // -----------------------------------------------------
    //                                             Optimized
    //                                             ---------
    public void test_OverRelation_ForeignForeignBasicOptimized_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsForeignForeignOptimizedBasicOverTest();

        // ## Act ##
        memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "select dffixedbase.*\n"));
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "join MEMBER_STATUS dffixedjoin_0_0"));
        assertTrue(displaySql.contains("on "));
        String beforeOn = Srl.substringLastFront(displaySql, "on ");
        assertTrue(Srl.containsIgnoreCase(beforeOn, "where dffixedjoin_0_0.DISPLAY_ORDER = 3"));
        assertEquals(1, Srl.countIgnoreCase(displaySql, ".DISPLAY_ORDER = "));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    public void test_OverRelation_ForeignForeignMarkOptimized_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsForeignForeignOptimizedMarkOverTest();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, " join member_status dfrel"));
        assertTrue(Srl.containsAllIgnoreCase(displaySql, " join member_status dffixedjoin"));
        assertTrue(displaySql.contains("on "));
        String frontOn = Srl.substringLastFront(displaySql, "on ");
        assertTrue(Srl.containsIgnoreCase(frontOn,
                "select dffixedbase.*, dffixedjoin_0_0.DISPLAY_ORDER as STATUS_ORDER, dffixedjoin_0_0.DISPLAY_ORDER\n"));
        assertTrue(Srl.containsIgnoreCase(frontOn, "where dffixedjoin_0_0.DESCRIPTION is not null"));
        assertTrue(Srl.containsIgnoreCase(frontOn, "  and dffixedbase.MOBILE_LOGIN_FLG = 1"));
        assertTrue(Srl.containsIgnoreCase(frontOn, "  and dffixedbase.MEMBER_ID >= dffixedjoin_0_0.DISPLAY_ORDER"));
        String rearOn = Srl.substringLastRear(displaySql, "on ");
        assertTrue(Srl.containsIgnoreCase(rearOn, ".DISPLAY_ORDER = dfrel"));
        assertTrue(Srl.containsIgnoreCase(rearOn, ".STATUS_ORDER"));
        assertTrue(Srl.containsIgnoreCase(rearOn, ".DISPLAY_ORDER = 3"));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));

        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            log(member);
        }
    }

    public void test_OverRelation_ForeignForeignOptimizedPart_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsForeignForeignOptimizedPartOverTest(3, "S");

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, " join member_status dfrel"));
        assertTrue(Srl.containsAllIgnoreCase(displaySql, " join member_status dffixedjoin"));
        assertTrue(displaySql.contains("on "));
        String frontOn = Srl.substringLastFront(displaySql, "on ");
        assertTrue(Srl.containsIgnoreCase(frontOn,
                "select dffixedbase.*, dffixedjoin_0_0.DISPLAY_ORDER, dffixedjoin_0_0.DISPLAY_ORDER as STATUS_ORDER\n"));
        assertTrue(Srl.containsIgnoreCase(frontOn, "where dffixedjoin_0_0.DISPLAY_ORDER = 3"));
        assertTrue(Srl.containsIgnoreCase(frontOn, "  and dffixedjoin_0_0.DESCRIPTION is not null"));
        assertTrue(Srl.containsIgnoreCase(frontOn, "  and dffixedbase.MOBILE_LOGIN_FLG = 1"));
        assertTrue(Srl.containsIgnoreCase(frontOn, "  and dffixedbase.MEMBER_ID >= dffixedjoin_0_0.DISPLAY_ORDER"));
        String rearOn = Srl.substringLastRear(displaySql, "on ");
        assertTrue(Srl.containsIgnoreCase(rearOn, ".DISPLAY_ORDER = dfrel"));
        assertTrue(Srl.containsIgnoreCase(rearOn, ".STATUS_ORDER"));
        assertTrue(Srl.containsIgnoreCase(rearOn, ".BIRTHDATE is not null"));
        assertTrue(Srl.containsIgnoreCase(rearOn, ".MEMBER_NAME like 'S'"));
        assertTrue(Srl.containsIgnoreCase(rearOn, ".MOBILE_LOGIN_FLG = ("));
        assertTrue(Srl.containsIgnoreCase(rearOn, "select 'Y'"));
        assertTrue(Srl.containsIgnoreCase(rearOn, ".LOGIN_DATETIME >= now()"));
        assertTrue(Srl.containsIgnoreCase(rearOn, ".LOGIN_DATETIME <= now()"));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));

        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            log(member);
        }
    }

    public void test_OverRelation_ForeignForeignWholeOptimized_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsForeignForeignOptimizedWholeOverTest(3);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertFalse(Srl.containsAllIgnoreCase(displaySql, " join member_status dfrel"));
        assertTrue(Srl.containsAllIgnoreCase(displaySql, " join member_status dffixedjoin"));
        assertTrue(displaySql.contains("on "));
        String frontOn = Srl.substringLastFront(displaySql, "on ");
        assertTrue(Srl.containsIgnoreCase(frontOn, "select dffixedbase.*\n"));
        assertTrue(Srl.containsIgnoreCase(frontOn, "where dffixedjoin_0_0.DISPLAY_ORDER = 3"));
        assertTrue(Srl.containsIgnoreCase(frontOn, "  and dffixedjoin_0_0.DESCRIPTION is not null"));
        assertTrue(Srl.containsIgnoreCase(frontOn, "  and dffixedbase.MOBILE_LOGIN_FLG = 1"));
        assertTrue(Srl.containsIgnoreCase(frontOn, "  and dffixedbase.MEMBER_ID >= dffixedjoin_0_0.DISPLAY_ORDER"));
        String rearOn = Srl.substringLastRear(displaySql, "on ");
        assertFalse(Srl.containsIgnoreCase(rearOn, "and "));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));

        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            log(member);
        }
    }

    public void test_OverRelation_ForeignForeignZooOptimized_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsForeignForeignOptimizedMarkOverTest();
        cb.setupSelect_MemberLoginAsForeignForeignOptimizedPartOverTest(3, "S");
        cb.setupSelect_MemberLoginAsForeignForeignOptimizedWholeOverTest(3);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();

        // mark
        assertTrue(displaySql.contains("on "));
        assertTrue(Srl.containsIgnoreCase(displaySql,
                "select dffixedbase.*, dffixedjoin_0_0.DISPLAY_ORDER as STATUS_ORDER, dffixedjoin_0_0.DISPLAY_ORDER\n"));
        assertTrue(Srl.containsIgnoreCase(displaySql, "where dffixedjoin_0_0.DESCRIPTION is not null"));
        assertTrue(Srl.containsIgnoreCase(displaySql, "  and dffixedbase.MOBILE_LOGIN_FLG = 1"));
        assertTrue(Srl.containsIgnoreCase(displaySql, "  and dffixedbase.MEMBER_ID >= dffixedjoin_0_0.DISPLAY_ORDER"));
        assertTrue(Srl.containsIgnoreCase(displaySql, ".DISPLAY_ORDER = dfrel"));
        assertTrue(Srl.containsIgnoreCase(displaySql, ".STATUS_ORDER"));
        assertTrue(Srl.containsIgnoreCase(displaySql, ".DISPLAY_ORDER = 3"));

        // part
        assertTrue(Srl.containsIgnoreCase(displaySql,
                "select dffixedbase.*, dffixedjoin_0_0.DISPLAY_ORDER as STATUS_ORDER, dffixedjoin_0_0.DISPLAY_ORDER\n"));
        assertTrue(Srl.containsIgnoreCase(displaySql, "where dffixedjoin_0_0.DISPLAY_ORDER = 3"));
        assertTrue(Srl.containsIgnoreCase(displaySql, "  and dffixedjoin_0_0.DESCRIPTION is not null"));
        assertTrue(Srl.containsIgnoreCase(displaySql, "  and dffixedbase.MOBILE_LOGIN_FLG = 1"));
        assertTrue(Srl.containsIgnoreCase(displaySql, "  and dffixedbase.MEMBER_ID >= dffixedjoin_0_0.DISPLAY_ORDER"));
        assertTrue(Srl.containsIgnoreCase(displaySql, ".DISPLAY_ORDER = dfrel"));
        assertTrue(Srl.containsIgnoreCase(displaySql, ".STATUS_ORDER"));
        assertTrue(Srl.containsIgnoreCase(displaySql, ".BIRTHDATE is not null"));
        assertTrue(Srl.containsIgnoreCase(displaySql, ".MEMBER_NAME like 'S'"));
        assertTrue(Srl.containsIgnoreCase(displaySql, ".MOBILE_LOGIN_FLG = ("));
        assertTrue(Srl.containsIgnoreCase(displaySql, "select 'Y'"));
        assertTrue(Srl.containsIgnoreCase(displaySql, ".LOGIN_DATETIME >= now()"));
        assertTrue(Srl.containsIgnoreCase(displaySql, ".LOGIN_DATETIME <= now()"));

        // whole
        assertTrue(Srl.containsIgnoreCase(displaySql, "select dffixedbase.*\n"));
        assertTrue(Srl.containsIgnoreCase(displaySql, "where dffixedjoin_0_0.DISPLAY_ORDER = 3"));
        assertTrue(Srl.containsIgnoreCase(displaySql, "  and dffixedjoin_0_0.DESCRIPTION is not null"));
        assertTrue(Srl.containsIgnoreCase(displaySql, "  and dffixedbase.MOBILE_LOGIN_FLG = 1"));
        assertTrue(Srl.containsIgnoreCase(displaySql, "  and dffixedbase.MEMBER_ID >= dffixedjoin_0_0.DISPLAY_ORDER"));

        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));

        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            log(member);
        }
    }

    // -----------------------------------------------------
    //                                             Parameter
    //                                             ---------
    public void test_OverRelation_ForeignForeignParameter_useSecondArg() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsForeignForeignParameterOverTest(DfTypeUtil.toDate("2010/10/12"));

        // ## Act ##
        cb.paging(1, 1);
        cb.disablePagingCountLater();
        memberBhv.selectPage(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "left outer join member_status dfrel"));
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "left outer join member_status dffixedjoin"));
        assertTrue(displaySql.contains(".DISPLAY_ORDER = "));
        assertTrue(displaySql.contains("as STATUS_ORDER"));
        assertTrue(displaySql.contains(".STATUS_ORDER"));
        assertTrue(displaySql.contains("and dfloc.BIRTHDATE > '2010-10-12'"));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    public void test_OverRelation_ForeignForeignParameter_doubleOver() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsForeignForeignEachOverTest();
        cb.setupSelect_MemberLoginAsForeignForeignParameterOverTest(DfTypeUtil.toDate("2010/10/12"));

        // ## Act ##
        memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "left outer join member_status dfrel"));
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "left outer join member_status dffixedjoin"));
        assertTrue(displaySql.contains(".DISPLAY_ORDER = "));
        assertTrue(displaySql.contains("as STATUS_ORDER"));
        assertTrue(displaySql.contains(".STATUS_ORDER"));
        assertTrue(displaySql.contains("and dfloc.BIRTHDATE > '2010-10-12'"));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    // -----------------------------------------------------
    //                                               Various
    //                                               -------
    public void test_OverRelation_ForeignForeignVarious_basic() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberLoginAsForeignForeignVariousOverTest();

        // ## Act ##
        purchaseBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        IndexOfInfo inlineIndex = Srl.indexOfFirst(displaySql, "left outer join (");
        assertNotNull(inlineIndex);
        String front = inlineIndex.substringFront();
        String rear = inlineIndex.substringRear();
        assertEquals(1, Srl.countIgnoreCase(front, "left outer join product "));
        assertEquals(1, Srl.countIgnoreCase(front, "left outer join product_status "));
        assertEquals(1, Srl.countIgnoreCase(front, "left outer join member "));
        assertEquals(2, Srl.countIgnoreCase(rear, "left outer join member_status "));
        assertEquals(1, Srl.countIgnoreCase(rear, "left outer join member "));
        assertEquals(1, Srl.countIgnoreCase(rear, "left outer join member_withdrawal "));
        assertEquals(1, Srl.countIgnoreCase(rear, "left outer join withdrawal_reason "));
        assertTrue(rear.contains(".STATUS_ORDER is not null"));
        assertTrue(rear.contains(".MEMBER_STATUS_NAME is not null"));
        assertTrue(rear.contains(".DISPLAY_ORDER is not null"));
        assertTrue(rear.contains(".WITHDRAWAL_DATETIME is not null"));
        assertTrue(rear.contains(".REASON_ORDER is not null"));
        assertTrue(rear.contains(".PRODUCT_STATUS_NAME is not null"));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    // ===================================================================================
    //                                                                            Referrer
    //                                                                            ========
    public void test_OverRelation_Referrer_basic() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberLoginAsReferrerOverTest();

        // ## Act ##
        purchaseBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "left outer join member"));
        assertTrue(displaySql.contains(".PURCHASE_DATETIME"));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    public void test_OverRelation_Referrer_illegal() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // ## Act ##
        try {
            cb.setupSelect_MemberLoginAsReferrerOverTest();

            // ## Assert ##
            fail();
        } catch (FixedConditionIllegalOverRelationException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_OverRelation_Referrer_fromReferrer() {
        // ## Arrange ##
        WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
        cb.setupSelect_Purchase().withMember().withMemberLoginAsReferrerOverTest();

        // ## Act ##
        whitePurchaseReferrerBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "left outer join member"));
        assertTrue(displaySql.contains(".PURCHASE_DATETIME"));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    // ===================================================================================
    //                                                                    Referrer Foreign
    //                                                                    ================
    public void test_OverRelation_ReferrerForeign_basic() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberLoginAsReferrerForeignOverTest();

        // ## Act ##
        purchaseBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "left outer join product_status"));
        assertTrue(displaySql.contains(".PRODUCT_STATUS_NAME"));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    public void test_OverRelation_ReferrerForeign_setup() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Product().withProductStatus();
        cb.setupSelect_Member().withMemberLoginAsReferrerForeignOverTest();

        // ## Act ##
        purchaseBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "left outer join product_status"));
        assertTrue(displaySql.contains(".PRODUCT_STATUS_NAME"));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    // ===================================================================================
    //                                                               Paging CountLeastJoin
    //                                                               =====================
    public void test_OverRelation_ForeignForeignParameter_PagingCountLeastJoin_hasQuery() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        Date targetDate = DfTypeUtil.toDate("2010/10/12");
        cb.setupSelect_MemberLoginAsForeignForeignParameterOverTest(targetDate);
        cb.query().queryMemberLoginAsForeignForeignParameterOverTest(targetDate).setMemberId_GreaterEqual(0);
        cb.paging(3, 1);
        cb.disablePagingCountLater();

        List<String> displaySqlList = setupSqlLogHandler();
        try {
            // ## Act ##
            memberBhv.selectPage(cb); // expect no exception

            // ## Assert ##
            String sql = displaySqlList.get(0);
            assertTrue(Srl.containsAllIgnoreCase(sql, "left outer join member_status dfrel"));
            assertTrue(Srl.containsAllIgnoreCase(sql, "inner join (select dffixedbase"));
            assertTrue(Srl.containsAllIgnoreCase(sql, "left outer join member_status dffixedjoin"));
            assertTrue(sql.contains(".DISPLAY_ORDER = "));
            assertTrue(sql.contains("as STATUS_ORDER"));
            assertTrue(sql.contains(".STATUS_ORDER"));
            assertTrue(sql.contains("and dfloc.BIRTHDATE > '2010-10-12'"));
            assertFalse(sql.contains("$$"));
            assertFalse(sql.contains("over("));
        } finally {
            closeSqlLogHandler();
        }
    }

    public void test_OverRelation_ForeignForeignParameter_PagingCountLeastJoin_noQuery() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        Date targetDate = DfTypeUtil.toDate("2010/10/12");
        cb.setupSelect_MemberLoginAsForeignForeignParameterOverTest(targetDate);
        cb.paging(3, 1);
        cb.disablePagingCountLater();

        List<String> displaySqlList = setupSqlLogHandler();
        try {
            // ## Act ##
            memberBhv.selectPage(cb); // expect no exception

            // ## Assert ##
            String sql = displaySqlList.get(0);
            assertTrue(Srl.containsAllIgnoreCase(sql, "left outer join member_status dfrel"));
            assertTrue(Srl.containsAllIgnoreCase(sql, "left outer join (select dffixedbase"));
            assertTrue(Srl.containsAllIgnoreCase(sql, "left outer join member_status dffixedjoin"));
            assertTrue(sql.contains(".DISPLAY_ORDER = "));
            assertTrue(sql.contains("as STATUS_ORDER"));
            assertTrue(sql.contains(".STATUS_ORDER"));
            assertTrue(sql.contains("and dfloc.BIRTHDATE > '2010-10-12'"));
            assertFalse(sql.contains("$$"));
            assertFalse(sql.contains("over("));
        } finally {
            closeSqlLogHandler();
        }
    }

    // ===================================================================================
    //                                                                InnerJoin AutoDetect
    //                                                                ====================
    public void test_OverRelation_ForeignForeign_with_WhereUsedInnerJoin() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.allowInnerJoinAutoDetect();
        cb.setupSelect_MemberLoginAsForeignForeignEachOverTest();
        cb.query().queryMemberLoginAsForeignForeignEachOverTest().setMobileLoginFlg_Equal_True();

        // ## Act ##
        memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "left outer join member_status dfrel"));
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "inner join (select dffixedbase"));
        assertTrue(Srl.containsAllIgnoreCase(displaySql, "left outer join member_status dffixedjoin"));
        assertTrue(displaySql.contains(".DISPLAY_ORDER = "));
        assertTrue(displaySql.contains(".MOBILE_LOGIN_FLG = 1"));
        assertFalse(displaySql.contains("$$"));
        assertFalse(displaySql.contains("over("));
    }

    // ===================================================================================
    //                                                                           CQ Invoke
    //                                                                           =========
    // -----------------------------------------------------
    //                                     invokeForeignCQ()
    //                                     -----------------
    public void test_invokeForeignCQ_bizOneToOne_noParameter() {
        // ## Arrange ##
        ConditionBean cb = memberBhv.newConditionBean();
        MemberDbm dbm = MemberDbm.getInstance();
        String foreignPropertyName = dbm.foreignMemberLoginAsLocalForeignOverTest().getForeignPropertyName();

        // ## Act ##
        ConditionQuery foreignCQ = cb.localCQ().invokeForeignCQ(foreignPropertyName);

        // ## Assert ##
        log(foreignCQ);
        assertTrue(foreignCQ instanceof MemberLoginCQ);
    }

    // ===================================================================================
    //                                                                         Test Helper
    //                                                                         ===========
    protected List<String> setupSqlLogHandler() {
        CallbackContext context = new CallbackContext();
        final List<String> displaySqlList = new ArrayList<String>();
        context.setSqlLogHandler(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                displaySqlList.add(info.getDisplaySql());
            }
        });
        CallbackContext.setCallbackContextOnThread(context);
        return displaySqlList;
    }

    protected void closeSqlLogHandler() {
        CallbackContext.clearCallbackContextOnThread();
    }
}