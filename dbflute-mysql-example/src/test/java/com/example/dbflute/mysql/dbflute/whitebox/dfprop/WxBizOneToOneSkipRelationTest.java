package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.mysql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.mysql.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.mysql.dbflute.exentity.MemberAddress;
import com.example.dbflute.mysql.dbflute.exentity.Purchase;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxBizOneToOneSkipRelationTest extends UnitContainerTestCase {

    private PurchaseBhv purchaseBhv;

    public void test_SkipRelation_SpecifyColumn_foreignColumn_basic() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_MemberAddressAsSkipRelation(currentDate());
        cb.specify().columnPurchaseDatetime();
        cb.specify().specifyMemberAddressAsSkipRelation().columnAddress();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        boolean exists = false;
        for (Purchase purchase : purchaseList) {
            MemberAddress address = purchase.getMemberAddressAsSkipRelation();
            Integer memberId = address != null ? address.getMemberId() : null;
            String addressStr = address != null ? address.getAddress() : null;
            log(purchase.getPurchaseId(), purchase.getPurchaseDatetime(), memberId, addressStr);
            if (address != null) {
                assertNotNull(address.getMemberAddressId());
                assertNotNull(memberId);
                assertNotNull(addressStr);
                assertNull(address.getRegionId());
                assertEquals(purchase.getMemberId(), memberId);
                exists = true;
            }
        }
        assertTrue(exists);
    }

    public void test_SkipRelation_SpecifyColumn_foreignColumn_duplicateSpecify() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_MemberAddressAsSkipRelation(currentDate());
        cb.specify().columnMemberId(); // duplicate specify
        cb.specify().columnPurchaseDatetime();
        cb.specify().specifyMemberAddressAsSkipRelation().columnAddress();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        boolean exists = false;
        for (Purchase purchase : purchaseList) {
            MemberAddress address = purchase.getMemberAddressAsSkipRelation();
            Integer memberId = address != null ? address.getMemberId() : null;
            String addressStr = address != null ? address.getAddress() : null;
            log(purchase.getPurchaseId(), purchase.getPurchaseDatetime(), memberId, addressStr);
            if (address != null) {
                assertNotNull(address.getMemberAddressId());
                assertNotNull(memberId);
                assertNotNull(addressStr);
                assertNull(address.getRegionId());
                assertEquals(purchase.getMemberId(), memberId);
                exists = true;
            }
        }
        assertTrue(exists);
    }
}