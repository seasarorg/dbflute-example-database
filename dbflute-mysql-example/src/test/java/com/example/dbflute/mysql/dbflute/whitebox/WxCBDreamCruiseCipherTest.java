package com.example.dbflute.mysql.dbflute.whitebox;

import java.util.HashMap;
import java.util.Map;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.ManualOrderBean;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.mysql.dbflute.cbean.MemberServiceCB;
import com.example.dbflute.mysql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberServiceBhv;
import com.example.dbflute.mysql.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.mysql.dbflute.exentity.MemberService;
import com.example.dbflute.mysql.dbflute.exentity.Purchase;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.4C (2012/04/26 Wednesday)
 */
public class WxCBDreamCruiseCipherTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private PurchaseBhv purchaseBhv;
    private MemberServiceBhv memberServiceBhv;

    // ===================================================================================
    //                                                                         ManualOrder
    //                                                                         ===========
    public void test_DreamCruise_ManualOrder_cipher_basic() throws Exception {
        // ## Arrange ##
        ListResultBean<MemberService> serviceList = memberServiceBhv.selectList(new MemberServiceCB());
        Map<Integer, MemberService> serviceMap = new HashMap<Integer, MemberService>();
        for (MemberService service : serviceList) {
            serviceMap.put(service.getMemberId(), service);
        }
        PurchaseCB cb = new PurchaseCB();
        PurchaseCB dreamCruiseCB = cb.dreamCruiseCB();
        ManualOrderBean mob = new ManualOrderBean();
        mob.multiply(dreamCruiseCB.specify().columnMemberId());
        cb.query().addOrderBy_PurchasePrice_Asc().withManualOrder(mob);

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        Integer previousSortValue = null;
        for (Purchase purchase : purchaseList) {
            Integer purchasePrice = purchase.getPurchasePrice();
            Integer memberId = purchase.getMemberId();
            Integer sortValue = purchasePrice * memberId;
            if (previousSortValue != null && previousSortValue > sortValue) {
                fail(previousSortValue + " : " + sortValue);
            }
            previousSortValue = sortValue;
            log(purchasePrice + ", " + memberId + ", " + sortValue);
        }
        String sql = cb.toDisplaySql();
        assertTrue(sql.contains("order by (dfloc.PURCHASE_PRICE - 13) * dfloc.MEMBER_ID"));
        assertEquals(2, Srl.count(sql, "dfloc.PURCHASE_PRICE - 13"));
    }

    public void test_DreamCruise_ManualOrder_cipher_union() throws Exception {
        // ## Arrange ##
        ListResultBean<MemberService> serviceList = memberServiceBhv.selectList(new MemberServiceCB());
        Map<Integer, MemberService> serviceMap = new HashMap<Integer, MemberService>();
        for (MemberService service : serviceList) {
            serviceMap.put(service.getMemberId(), service);
        }
        PurchaseCB cb = new PurchaseCB();
        cb.union(new UnionQuery<PurchaseCB>() {
            public void query(PurchaseCB unionCB) {
            }
        });
        cb.union(new UnionQuery<PurchaseCB>() {
            public void query(PurchaseCB unionCB) {
            }
        });
        PurchaseCB dreamCruiseCB = cb.dreamCruiseCB();
        ManualOrderBean mob = new ManualOrderBean();
        mob.multiply(dreamCruiseCB.specify().columnMemberId());
        cb.query().addOrderBy_PurchasePrice_Asc().withManualOrder(mob);

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        Integer previousSortValue = null;
        for (Purchase purchase : purchaseList) {
            Integer purchasePrice = purchase.getPurchasePrice();
            Integer memberId = purchase.getMemberId();
            Integer sortValue = purchasePrice * memberId;
            if (previousSortValue != null && previousSortValue > sortValue) {
                fail(previousSortValue + " : " + sortValue);
            }
            previousSortValue = sortValue;
            log(purchasePrice + ", " + memberId + ", " + sortValue);
        }
        String sql = cb.toDisplaySql();
        assertTrue(sql.contains("order by PURCHASE_PRICE * MEMBER_ID"));
        assertEquals(2, Srl.count(sql, "union"));
        assertEquals(3, Srl.count(sql, "dfloc.PURCHASE_PRICE - 13"));
    }
}
