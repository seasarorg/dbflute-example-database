package com.example.dbflute.mysql.dbflute.whitebox;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.util.DfTraceViewUtil;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.cbean.MemberLoginCB;
import com.example.dbflute.mysql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exbhv.MemberStatusBhv;
import com.example.dbflute.mysql.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.dbflute.exentity.MemberLogin;
import com.example.dbflute.mysql.dbflute.exentity.MemberSecurity;
import com.example.dbflute.mysql.dbflute.exentity.MemberStatus;
import com.example.dbflute.mysql.dbflute.exentity.MemberWithdrawal;
import com.example.dbflute.mysql.dbflute.exentity.Product;
import com.example.dbflute.mysql.dbflute.exentity.Purchase;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * This is not DBMS dependency logic but just in case.
 * @author jflute
 * @since 1.0.1 (2012/11/05 Monday)
 */
public class WxCBRelationMappingMySQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private MemberStatusBhv memberStatusBhv;
    private PurchaseBhv purchaseBhv;

    // ===================================================================================
    //                                                                      First Relation
    //                                                                      ==============
    public void test_firstRelation_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        Set<String> statusCodeSet = newHashSet();
        Set<String> instanceHashSet = newHashSet();
        for (Member member : memberList) {
            MemberStatus status = member.getMemberStatus();
            String statusCode = member.getMemberStatusCode();
            assertEquals(statusCode, status.getMemberStatusCode());
            statusCodeSet.add(statusCode);
            String instanceHash = Integer.toHexString(status.instanceHash());
            instanceHashSet.add(instanceHash);
            log(member.getMemberName(), statusCode, instanceHash);
        }
        log(statusCodeSet.size() + " = " + instanceHashSet.size());
        assertEquals(statusCodeSet.size(), instanceHashSet.size());
    }

    @SuppressWarnings("deprecation")
    public void test_firstRelation_disableCache() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.disableRelationMappingCache();
        cb.setupSelect_MemberStatus();

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        Set<String> statusCodeSet = newHashSet();
        Set<String> instanceHashSet = newHashSet();
        for (Member member : memberList) {
            MemberStatus status = member.getMemberStatus();
            String statusCode = member.getMemberStatusCode();
            assertEquals(statusCode, status.getMemberStatusCode());
            statusCodeSet.add(statusCode);
            String instanceHash = Integer.toHexString(status.instanceHash());
            instanceHashSet.add(instanceHash);
            log(member.getMemberName(), statusCode, instanceHash);
        }
        log(statusCodeSet.size() + " != " + instanceHashSet.size());
        assertNotSame(statusCodeSet.size(), instanceHashSet.size());
        assertEquals(memberList.size(), instanceHashSet.size());
    }

    public void test_firstRelation_LoadReferrer() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);
        List<MemberStatus> statusList = memberBhv.pulloutMemberStatus(memberList);
        memberStatusBhv.loadMemberLoginList(statusList, new ConditionBeanSetupper<MemberLoginCB>() {
            public void setup(MemberLoginCB cb) {
            }
        });

        // ## Assert ##
        assertHasAnyElement(memberList);
        Map<String, List<MemberLogin>> statusLoginMap = newHashMap();
        boolean exists = false;
        for (Member member : memberList) {
            String statusCode = member.getMemberStatusCode();
            MemberStatus status = member.getMemberStatus();
            List<MemberLogin> prevoiusLoginList = statusLoginMap.get(statusCode);
            List<MemberLogin> mappedLoginList = status.getMemberLoginList();
            log(member.getMemberName(), statusCode, mappedLoginList.size());
            if (prevoiusLoginList != null) {
                if (prevoiusLoginList.isEmpty()) {
                    assertTrue(mappedLoginList.isEmpty());
                } else {
                    assertFalse(mappedLoginList.isEmpty());
                }
                assertEquals(prevoiusLoginList, mappedLoginList);
                exists = true;
            } else {
                statusLoginMap.put(statusCode, mappedLoginList);
            }
        }
        assertTrue(exists);
    }

    // ===================================================================================
    //                                                                       Nest Relation
    //                                                                       =============
    public void test_nestRelation_basic() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberStatus();
        cb.query().addOrderBy_PurchaseId_Asc();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        Set<Integer> memberIdSet = newHashSet();
        Set<String> memberHashSet = newHashSet();
        Set<String> statusCodeSet = newHashSet();
        Set<String> statusHashSet = newHashSet();
        for (Purchase purchase : purchaseList) {
            Member member = purchase.getMember();
            Integer memberId = purchase.getMemberId();
            assertEquals(memberId, member.getMemberId());
            memberIdSet.add(memberId);
            String memberHash = Integer.toHexString(member.instanceHash());
            memberHashSet.add(memberHash);

            MemberStatus status = member.getMemberStatus();
            String statusCode = member.getMemberStatusCode();
            assertEquals(statusCode, status.getMemberStatusCode());
            statusCodeSet.add(statusCode);
            String statusHash = Integer.toHexString(status.instanceHash());
            statusHashSet.add(statusHash);

            log(purchase.getPurchaseId(), member.getMemberName(), memberHash, statusCode, statusHash);
        }
        log("Member: " + memberIdSet.size() + " = " + memberHashSet.size());
        assertEquals(memberIdSet.size(), memberHashSet.size());
        log("Status: " + statusCodeSet.size() + " = " + statusHashSet.size());
        assertEquals(statusCodeSet.size(), statusHashSet.size());
    }

    @SuppressWarnings("deprecation")
    public void test_nestRelation_disableCache() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.disableRelationMappingCache();
        cb.setupSelect_Member().withMemberStatus();
        cb.query().addOrderBy_PurchaseId_Asc();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        Set<Integer> memberIdSet = newHashSet();
        Set<String> memberHashSet = newHashSet();
        Set<String> statusCodeSet = newHashSet();
        Set<String> statusHashSet = newHashSet();
        for (Purchase purchase : purchaseList) {
            Member member = purchase.getMember();
            Integer memberId = purchase.getMemberId();
            assertEquals(memberId, member.getMemberId());
            memberIdSet.add(memberId);
            String memberHash = Integer.toHexString(member.instanceHash());
            memberHashSet.add(memberHash);

            MemberStatus status = member.getMemberStatus();
            String statusCode = member.getMemberStatusCode();
            assertEquals(statusCode, status.getMemberStatusCode());
            statusCodeSet.add(statusCode);
            String statusHash = Integer.toHexString(status.instanceHash());
            statusHashSet.add(statusHash);

            log(purchase.getPurchaseId(), member.getMemberName(), memberHash, statusCode, statusHash);
        }
        log("Member: " + memberIdSet.size() + " != " + memberHashSet.size());
        assertNotSame(memberIdSet.size(), memberHashSet.size());
        assertEquals(purchaseList.size(), memberHashSet.size());
        log("Status: " + statusCodeSet.size() + " != " + statusHashSet.size());
        assertNotSame(statusCodeSet.size(), statusHashSet.size());
        assertEquals(purchaseList.size(), statusHashSet.size());
    }

    public void test_nestRelation_LoadReferrer() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberStatus();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);
        List<Member> memberList = purchaseBhv.pulloutMember(purchaseList);
        List<MemberStatus> statusList = memberBhv.pulloutMemberStatus(memberList);
        memberStatusBhv.loadMemberLoginList(statusList, new ConditionBeanSetupper<MemberLoginCB>() {
            public void setup(MemberLoginCB cb) {
            }
        });

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        Map<String, List<MemberLogin>> statusLoginMap = newHashMap();
        boolean exists = false;
        for (Purchase purchase : purchaseList) {
            Member member = purchase.getMember();
            String statusCode = member.getMemberStatusCode();
            MemberStatus status = member.getMemberStatus();
            List<MemberLogin> previousLoginList = statusLoginMap.get(statusCode);
            List<MemberLogin> mappedLoginList = status.getMemberLoginList();
            log(member.getMemberName(), statusCode, mappedLoginList.size());
            if (previousLoginList != null) {
                if (previousLoginList.isEmpty()) {
                    assertTrue(mappedLoginList.isEmpty());
                } else {
                    assertFalse(mappedLoginList.isEmpty());
                }
                assertEquals(previousLoginList, mappedLoginList);
                exists = true;
            } else {
                statusLoginMap.put(statusCode, mappedLoginList);
            }
        }
        assertTrue(exists);
    }

    // ===================================================================================
    //                                                                   OnParade Relation
    //                                                                   =================
    public void test_onParadeRelation_basic() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberStatus();
        cb.setupSelect_Member().withMemberAddressAsValid(currentDate());
        cb.setupSelect_Member().withMemberLoginAsLatest().withMemberStatus();
        cb.setupSelect_Member().withMemberSecurityAsOne().withMember().withMemberStatus();
        cb.setupSelect_Member().withMemberWithdrawalAsOne().withWithdrawalReason();
        cb.setupSelect_Member().withMemberWithdrawalAsOne().withMember();
        cb.setupSelect_Member().withMemberServiceAsOne().withServiceRank();
        cb.setupSelect_Product().withProductCategory().withProductCategorySelf();
        cb.setupSelect_Product().withProductStatus();
        cb.query().addOrderBy_PurchaseId_Asc();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        Set<Integer> firstMemberIdSet = newHashSet();
        Set<String> firstMemberHashSet = newHashSet();
        Set<Integer> firstProductIdSet = newHashSet();
        Set<String> firstProductHashSet = newHashSet();
        Set<String> firstStatusCodeSet = newHashSet();
        Set<String> firstStatusHashSet = newHashSet();
        Set<String> securityStatusCodeSet = newHashSet();
        Set<String> securityStatusHashSet = newHashSet();
        boolean existsLoginStatus = false;
        boolean existsWithdrawal = false;
        for (Purchase purchase : purchaseList) {
            Member member = purchase.getMember();
            assertNotNull(member);
            assertEquals(member.getMemberId(), purchase.getMemberId());
            firstMemberIdSet.add(member.getMemberId());
            firstMemberHashSet.add(Integer.toHexString(member.instanceHash()));

            MemberStatus firstStatus = member.getMemberStatus();
            assertNotNull(firstStatus);
            assertEquals(firstStatus.getMemberStatusCode(), member.getMemberStatusCode());
            firstStatusCodeSet.add(firstStatus.getMemberStatusCode());
            firstStatusHashSet.add(Integer.toHexString(firstStatus.instanceHash()));

            MemberLogin loginAsLatest = member.getMemberLoginAsLatest();
            if (loginAsLatest != null) {
                MemberStatus loginStatus = loginAsLatest.getMemberStatus();
                assertNotNull(loginStatus);
                if (firstStatus.getMemberStatusCode().equals(loginStatus.getMemberStatusCode())) {
                    assertNotSame(firstStatus.instanceHash(), loginStatus.instanceHash());
                    existsLoginStatus = true;
                }
            }

            MemberSecurity security = member.getMemberSecurityAsOne();
            assertNotNull(security);
            assertEquals(member.getMemberId(), security.getMemberId());
            assertNotNull(security.getMember());
            assertEquals(member.getMemberId(), security.getMember().getMemberId());
            assertNotSame(member.instanceHash(), security.getMember().instanceHash());
            assertNotNull(security.getMember().getMemberStatus());
            MemberStatus securityStatus = security.getMember().getMemberStatus();

            assertEquals(securityStatus.getMemberStatusCode(), member.getMemberStatusCode());
            securityStatusCodeSet.add(securityStatus.getMemberStatusCode());
            securityStatusHashSet.add(Integer.toHexString(securityStatus.instanceHash()));

            MemberWithdrawal withdrawal = member.getMemberWithdrawalAsOne();
            if (withdrawal != null) {
                assertEquals(member.getMemberId(), withdrawal.getMemberId());
                assertNotNull(withdrawal.getMember());
                assertNull(withdrawal.getMember().getMemberStatus());
                existsWithdrawal = true;
            }

            Product product = purchase.getProduct();
            assertNotNull(product);
            assertEquals(purchase.getProductId(), product.getProductId());
            firstProductIdSet.add(product.getProductId());
            firstProductHashSet.add(Integer.toHexString(product.instanceHash()));
        }
        assertTrue(existsLoginStatus);
        assertTrue(existsWithdrawal);
        log("FirstMember: " + firstMemberIdSet.size() + " = " + firstMemberHashSet.size());
        assertEquals(firstMemberIdSet.size(), firstMemberHashSet.size());
        log("FirstStatus: " + firstStatusCodeSet.size() + " = " + firstStatusHashSet.size());
        assertEquals(firstStatusCodeSet.size(), firstStatusHashSet.size());
        log("SecurityStatus: " + securityStatusCodeSet.size() + " = " + securityStatusHashSet.size());
        assertEquals(securityStatusCodeSet.size(), securityStatusHashSet.size());
        log("Product: " + firstProductIdSet.size() + " = " + firstProductHashSet.size());
        assertEquals(firstProductIdSet.size(), firstProductHashSet.size());
    }

    // ===================================================================================
    //                                                                         Performance
    //                                                                         ===========
    public void test_performance_baseOnly() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        long warmBefore = currentTimestamp().getTime();
        purchaseBhv.selectList(cb); // warming up
        long warmAfter = currentTimestamp().getTime();

        // ## Act ##
        long actBefore = currentTimestamp().getTime();
        for (int i = 0; i < 100; i++) {
            purchaseBhv.selectList(cb);
        }
        long actAfter = currentTimestamp().getTime();

        // ## Assert ##
        String actCost = DfTraceViewUtil.convertToPerformanceView(actAfter - actBefore);
        String warmCost = DfTraceViewUtil.convertToPerformanceView(warmAfter - warmBefore);
        log(actCost + " (" + warmCost + ")");

        // before: 00m01s616ms (00m00s746ms), 00m01s592ms (00m00s740ms), 00m01s637ms (00m00s795ms)
        // after : 00m01s626ms (00m00s853ms), 00m01s570ms (00m00s746ms), 00m01s616ms (00m00s725ms)
    }

    public void test_performance_firstRelation() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member();
        cb.setupSelect_Product();
        cb.setupSelect_SummaryProduct();
        long warmBefore = currentTimestamp().getTime();
        purchaseBhv.selectList(cb); // warming up
        long warmAfter = currentTimestamp().getTime();

        // ## Act ##
        long actBefore = currentTimestamp().getTime();
        for (int i = 0; i < 100; i++) {
            purchaseBhv.selectList(cb);
        }
        long actAfter = currentTimestamp().getTime();

        // ## Assert ##
        String actCost = DfTraceViewUtil.convertToPerformanceView(actAfter - actBefore);
        String warmCost = DfTraceViewUtil.convertToPerformanceView(warmAfter - warmBefore);
        log(actCost + " (" + warmCost + ")");

        // before: 00m02s815ms (00m00s681ms), 00m02s755ms (00m00s660ms), 00m02s643ms (00m00s653ms)
        // after : 00m02s272ms (00m00s712ms), 00m02s372ms (00m00s695ms), 00m02s273ms (00m00s709ms)
    }

    public void test_performance_onParadeRelation_basic() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberStatus();
        cb.setupSelect_Member().withMemberAddressAsValid(currentDate());
        cb.setupSelect_Member().withMemberLoginAsLatest().withMemberStatus();
        cb.setupSelect_Member().withMemberSecurityAsOne().withMember().withMemberStatus();
        cb.setupSelect_Member().withMemberWithdrawalAsOne().withWithdrawalReason();
        cb.setupSelect_Member().withMemberWithdrawalAsOne().withMember();
        cb.setupSelect_Member().withMemberServiceAsOne().withServiceRank();
        cb.setupSelect_Product().withProductCategory().withProductCategorySelf();
        cb.setupSelect_Product().withProductStatus();
        long warmBefore = currentTimestamp().getTime();
        purchaseBhv.selectList(cb); // warming up
        long warmAfter = currentTimestamp().getTime();

        // ## Act ##
        long actBefore = currentTimestamp().getTime();
        for (int i = 0; i < 100; i++) {
            purchaseBhv.selectList(cb);
        }
        long actAfter = currentTimestamp().getTime();

        // ## Assert ##
        String actCost = DfTraceViewUtil.convertToPerformanceView(actAfter - actBefore);
        String warmCost = DfTraceViewUtil.convertToPerformanceView(warmAfter - warmBefore);
        log(actCost + " (" + warmCost + ")");

        // before: 00m04s705ms (00m00s722ms), 00m04s684ms (00m00s706ms), 00m04s669ms (00m00s712ms)
        // after : 00m04s516ms (00m00s751ms), 00m04s586ms (00m00s759ms), 00m04s442ms (00m00s751ms)
    }

    @SuppressWarnings("deprecation")
    public void test_performance_onParade_disableCache() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.disableRelationMappingCache();
        cb.setupSelect_Member().withMemberStatus();
        cb.setupSelect_Member().withMemberAddressAsValid(currentDate());
        cb.setupSelect_Member().withMemberLoginAsLatest().withMemberStatus();
        cb.setupSelect_Member().withMemberSecurityAsOne().withMember().withMemberStatus();
        cb.setupSelect_Member().withMemberWithdrawalAsOne().withWithdrawalReason();
        cb.setupSelect_Member().withMemberWithdrawalAsOne().withMember();
        cb.setupSelect_Member().withMemberServiceAsOne().withServiceRank();
        cb.setupSelect_Product().withProductCategory().withProductCategorySelf();
        cb.setupSelect_Product().withProductStatus();
        long warmBefore = currentTimestamp().getTime();
        purchaseBhv.selectList(cb); // warming up
        long warmAfter = currentTimestamp().getTime();

        // ## Act ##
        long actBefore = currentTimestamp().getTime();
        for (int i = 0; i < 100; i++) {
            purchaseBhv.selectList(cb);
        }
        long actAfter = currentTimestamp().getTime();

        // ## Assert ##
        String actCost = DfTraceViewUtil.convertToPerformanceView(actAfter - actBefore);
        String warmCost = DfTraceViewUtil.convertToPerformanceView(warmAfter - warmBefore);
        log(actCost + " (" + warmCost + ")");
    }
}
