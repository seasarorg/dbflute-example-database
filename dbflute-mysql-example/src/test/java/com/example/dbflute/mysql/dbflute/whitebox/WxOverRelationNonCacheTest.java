package com.example.dbflute.mysql.dbflute.whitebox;

import java.util.Map;

import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.mysql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.mysql.dbflute.cbean.WhitePerrottaOverMemberCB;
import com.example.dbflute.mysql.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhitePerrottaOverMemberBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhitePerrottaOverMemberMachoBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhitePerrottaOverProductBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhitePerrottaOverProductNestedBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhitePerrottaOverTraceBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.dbflute.exentity.MemberLogin;
import com.example.dbflute.mysql.dbflute.exentity.MemberStatus;
import com.example.dbflute.mysql.dbflute.exentity.Purchase;
import com.example.dbflute.mysql.dbflute.exentity.WhitePerrottaOverMember;
import com.example.dbflute.mysql.dbflute.exentity.WhitePerrottaOverMemberMacho;
import com.example.dbflute.mysql.dbflute.exentity.WhitePerrottaOverProduct;
import com.example.dbflute.mysql.dbflute.exentity.WhitePerrottaOverProductNested;
import com.example.dbflute.mysql.dbflute.exentity.WhitePerrottaOverTrace;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5K (2014/08/22 Friday)
 */
public class WxOverRelationNonCacheTest extends UnitContainerTestCase {

    private WhitePerrottaOverMemberBhv whitePerrottaOverMemberBhv;
    private WhitePerrottaOverMemberMachoBhv whitePerrottaOverMemberMachoBhv;
    private WhitePerrottaOverProductBhv whitePerrottaOverProductBhv;
    private WhitePerrottaOverProductNestedBhv whitePerrottaOverProductNestedBhv;
    private WhitePerrottaOverTraceBhv whitePerrottaOverTraceBhv;
    private PurchaseBhv purchaseBhv;

    public void test_nonCache_when_UnderOverRelation_basic() throws Exception {
        // ## Arrange ##
        registerTestData();

        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
        cb.setupSelect_WhitePerrottaOverMemberMacho();
        cb.setupSelect_WhitePerrottaOverProduct().withWhitePerrottaOverProductNested();
        cb.setupSelect_WhitePerrottaOverProduct().withWhitePerrottaOverTraceAsPerrotta();
        cb.query().addOrderBy_MemberId_Asc();

        // ## Act ##
        ListResultBean<WhitePerrottaOverMember> memberList = whitePerrottaOverMemberBhv.selectList(cb);

        // ## Assert ##
        // sea (1) -> CupRamen(21) -(over)-> {21, FOO}
        // land(2) -> CupRamen(21) -(over)-> {21, BAR}
        // iks (3) -> Coffee  (21) -(over)-> null
        for (WhitePerrottaOverMember member : memberList) {
            WhitePerrottaOverProduct product = member.getWhitePerrottaOverProduct();
            Long productId = product.getProductId();
            String productName = product.getProductName();
            WhitePerrottaOverTrace trace = product.getWhitePerrottaOverTraceAsPerrotta();
            Long previousProductId = trace != null ? trace.getPreviousProductId() : null;
            Long nextProductId = trace != null ? trace.getNextProductId() : null;
            String traceType = trace != null ? trace.getTraceTypeCode() : null;
            Integer traceHash = trace != null ? trace.instanceHash() : null;
            log(member.getMemberName(), productId, productName, previousProductId, nextProductId, traceType, traceHash);
        }

        assertEquals(3, memberList.size());
        WhitePerrottaOverMember firstMember = memberList.get(0);
        WhitePerrottaOverMember secondMember = memberList.get(1);
        WhitePerrottaOverMember thirdMember = memberList.get(2);
        assertEquals(Long.valueOf(1), firstMember.getMemberId());
        assertEquals(Long.valueOf(2), secondMember.getMemberId());
        assertEquals(Long.valueOf(3), thirdMember.getMemberId());
        assertEquals("sea", firstMember.getMemberName());
        assertEquals("land", secondMember.getMemberName());
        assertEquals("iks", thirdMember.getMemberName());
        assertNotSame(firstMember, secondMember);
        assertNotSame(firstMember.instanceHash(), secondMember.instanceHash());

        WhitePerrottaOverProduct firstProduct = firstMember.getWhitePerrottaOverProduct();
        WhitePerrottaOverProduct secondProduct = secondMember.getWhitePerrottaOverProduct();
        WhitePerrottaOverProduct thirdProduct = thirdMember.getWhitePerrottaOverProduct();
        assertEquals(Long.valueOf(21), firstProduct.getProductId());
        assertEquals(firstProduct.getProductId(), secondProduct.getProductId());
        assertEquals("CupRamen", firstProduct.getProductName());
        assertEquals(Long.valueOf(23), thirdProduct.getProductId());
        assertNotSame(firstProduct, secondProduct);
        assertNotSame(firstProduct.instanceHash(), secondProduct.instanceHash());

        WhitePerrottaOverTrace firstTrace = firstProduct.getWhitePerrottaOverTraceAsPerrotta();
        WhitePerrottaOverTrace secondTrace = secondProduct.getWhitePerrottaOverTraceAsPerrotta();
        assertNull(thirdProduct.getWhitePerrottaOverTraceAsPerrotta());
        assertEquals(Long.valueOf(301), firstTrace.getTraceId());
        assertEquals(Long.valueOf(302), secondTrace.getTraceId());
        assertNotSame(firstTrace, secondTrace);
        assertNotSame(firstTrace.instanceHash(), secondTrace.instanceHash());

        WhitePerrottaOverProductNested firstNested = firstProduct.getWhitePerrottaOverProductNested();
        WhitePerrottaOverProductNested secondNested = secondProduct.getWhitePerrottaOverProductNested();
        assertSame(firstNested, secondNested);
        assertEquals(firstNested.instanceHash(), secondNested.instanceHash());

        WhitePerrottaOverMemberMacho firstMacho = firstMember.getWhitePerrottaOverMemberMacho();
        WhitePerrottaOverMemberMacho secondMacho = secondMember.getWhitePerrottaOverMemberMacho();
        WhitePerrottaOverMemberMacho thirdMacho = thirdMember.getWhitePerrottaOverMemberMacho();
        assertEquals("AAA", firstMacho.getMachoCode());
        assertEquals("BBB", secondMacho.getMachoCode());
        assertEquals("AAA", thirdMacho.getMachoCode());
        assertEquals("Foo", firstMacho.getMachoName());
        assertEquals("Bar", secondMacho.getMachoName());
        assertEquals("Foo", thirdMacho.getMachoName());
        assertSame(firstMacho, thirdMacho);
        assertEquals(firstMacho.instanceHash(), thirdMacho.instanceHash());
    }

    public void test_normalOverRelation_basic() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberLoginAsForeignForeignBindOverTest(3);

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        Map<Integer, Member> memberMap = newHashMap();
        Map<Long, MemberLogin> loginMap = newHashMap();
        for (Purchase purchase : purchaseList) {
            Member member = purchase.getMember();
            Member existingMember = memberMap.get(member.getMemberId());
            if (existingMember != null) {
                assertNotSame(member.instanceHash(), existingMember.instanceHash());
                markHere("existsMember");
            }
            memberMap.put(member.getMemberId(), member);
            MemberLogin login = member.getMemberLoginAsForeignForeignBindOverTest();
            if (login != null) {
                MemberLogin existingLogin = loginMap.get(login.getMemberLoginId());
                if (existingLogin != null) {
                    assertNotSame(login.instanceHash(), existingLogin.instanceHash());
                    markHere("existsLogin");
                }
                loginMap.put(login.getMemberLoginId(), login);
            }
        }
        assertMarked("existsMember");
        assertMarked("existsLogin");
    }

    public void test_normalOverRelation_nested() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberLoginAsForeignForeignBindOverTest(3).withMemberStatus();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        Map<Integer, Member> memberMap = newHashMap();
        Map<Long, MemberLogin> loginMap = newHashMap();
        Map<String, MemberStatus> statusMap = newHashMap();
        for (Purchase purchase : purchaseList) {
            Member member = purchase.getMember();
            Member existingMember = memberMap.get(member.getMemberId());
            if (existingMember != null) {
                assertNotSame(member.instanceHash(), existingMember.instanceHash());
                markHere("existsMember");
            }
            memberMap.put(member.getMemberId(), member);
            MemberLogin login = member.getMemberLoginAsForeignForeignBindOverTest();
            if (login != null) {
                MemberLogin existingLogin = loginMap.get(login.getMemberLoginId());
                if (existingLogin != null) {
                    assertNotSame(login.instanceHash(), existingLogin.instanceHash());
                    markHere("existsLogin");
                }
                loginMap.put(login.getMemberLoginId(), login);
                MemberStatus status = login.getMemberStatus();
                if (status != null) {
                    MemberStatus existingStatus = statusMap.get(status.getMemberStatusCode());
                    if (existingStatus != null) {
                        assertEquals(status.instanceHash(), existingStatus.instanceHash());
                        markHere("existsStatus");
                    }
                    statusMap.put(status.getMemberStatusCode(), status);
                }
            }
        }
        assertMarked("existsMember");
        assertMarked("existsLogin");
        assertMarked("existsStatus");
    }

    public void test_normalFixedCondition_basic() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberStatus();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        Map<Integer, Member> memberMap = newHashMap();
        Map<String, MemberStatus> statusMap = newHashMap();
        for (Purchase purchase : purchaseList) {
            Member member = purchase.getMember();
            Member existingMember = memberMap.get(member.getMemberId());
            if (existingMember != null) {
                assertEquals(member.instanceHash(), existingMember.instanceHash());
                markHere("existsMember");
            }
            memberMap.put(member.getMemberId(), member);
            MemberStatus status = member.getMemberStatus();
            if (status != null) {
                MemberStatus existingStatus = statusMap.get(status.getMemberStatusCode());
                if (existingStatus != null) {
                    assertEquals(status.instanceHash(), existingStatus.instanceHash());
                    markHere("existsStatus");
                }
                statusMap.put(status.getMemberStatusCode(), status);
            }
        }
        assertMarked("existsMember");
        assertMarked("existsStatus");
    }

    // ===================================================================================
    //                                                                         Test Helper
    //                                                                         ===========
    protected void registerTestData() {
        registerNested("DOC", "DockSideStage");
        registerNested("HUN", "HungerStage");
        registerProduct(21L, "CupRamen", "HUN");
        registerProduct(22L, "Uchiwa", "HUN");
        registerProduct(23L, "Coffee", "DOC");
        registerMacho("AAA", "Foo");
        registerMacho("BBB", "Bar");
        registerMember(1L, "sea", 21L, "FOO", "AAA");
        registerMember(2L, "land", 21L, "BAR", "BBB");
        registerMember(3L, "iks", 23L, "BAR", "AAA");
        registerTrace(301L, 21L, 22L, "FOO");
        registerTrace(302L, 21L, 23L, "BAR");
    }

    protected void registerNested(String code, String name) {
        WhitePerrottaOverProductNested nested = new WhitePerrottaOverProductNested();
        nested.setProductNestedCode(code);
        nested.setProductNestedName(name);
        whitePerrottaOverProductNestedBhv.insert(nested);
    }

    protected void registerProduct(Long id, String name, String nested) {
        WhitePerrottaOverProduct product = new WhitePerrottaOverProduct();
        product.setProductId(id);
        product.setProductName(name);
        product.setProductNestedCode(nested);
        whitePerrottaOverProductBhv.insert(product);
    }

    protected void registerMacho(String code, String name) {
        WhitePerrottaOverMemberMacho nested = new WhitePerrottaOverMemberMacho();
        nested.setMachoCode(code);
        nested.setMachoName(name);
        whitePerrottaOverMemberMachoBhv.insert(nested);
    }

    protected void registerMember(Long memberId, String name, Long productId, String traceType, String machoCode) {
        WhitePerrottaOverMember member = new WhitePerrottaOverMember();
        member.setMemberId(memberId);
        member.setMemberName(name);
        member.setProductId(productId);
        member.setTraceTypeCode(traceType);
        member.setMachoCode(machoCode);
        whitePerrottaOverMemberBhv.insert(member);
    }

    protected void registerTrace(Long traceId, Long previousId, Long nextId, String traceType) {
        WhitePerrottaOverTrace trace = new WhitePerrottaOverTrace();
        trace.setTraceId(traceId);
        trace.setPreviousProductId(previousId);
        trace.setNextProductId(nextId);
        trace.setTraceTypeCode(traceType);
        whitePerrottaOverTraceBhv.insert(trace);
    }

    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
}
