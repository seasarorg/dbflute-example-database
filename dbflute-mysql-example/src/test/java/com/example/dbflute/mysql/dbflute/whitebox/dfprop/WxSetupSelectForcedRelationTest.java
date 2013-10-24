package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.cbean.MemberServiceCB;
import com.example.dbflute.mysql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exbhv.MemberServiceBhv;
import com.example.dbflute.mysql.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.dbflute.exentity.MemberService;
import com.example.dbflute.mysql.dbflute.exentity.Purchase;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5A (2013/10/25 Friday)
 */
public class WxSetupSelectForcedRelationTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;
    private MemberServiceBhv memberServiceBhv;
    private PurchaseBhv purchaseBhv;

    public void test_BasePoint_basic() throws Exception {
        // ## Arrange ##
        MemberServiceCB cb = new MemberServiceCB();

        // ## Act ##
        ListResultBean<MemberService> serviceList = memberServiceBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(serviceList);
        for (MemberService service : serviceList) {
            assertNull(service.getMember());
            assertNotNull(service.getServiceRank()); // point
        }
    }

    public void test_SetupSelect_basic() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberServiceAsOne();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            assertNull(member.getMemberStatus());
            assertNull(member.getMemberSecurityAsOne());
            assertNotNull(member.getMemberServiceAsOne());
            assertNotNull(member.getMemberServiceAsOne().getServiceRank()); // point
        }
    }

    public void test_NestSelectSetupper_basic() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberServiceAsOne();
        cb.setupSelect_Product();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        for (Purchase purchase : purchaseList) {
            Member member = purchase.getMember();
            assertNull(member.getMemberStatus());
            assertNull(member.getMemberSecurityAsOne());
            assertNotNull(member.getMemberServiceAsOne());
            assertNotNull(member.getMemberServiceAsOne().getServiceRank());
            assertNotNull(purchase.getProduct());
            assertNull(purchase.getProduct().getProductStatus());
        }
    }
}
