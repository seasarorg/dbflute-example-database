package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import java.sql.Timestamp;

import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.mysql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.mysql.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.mysql.dbflute.exentity.Purchase;
import com.example.dbflute.mysql.dbflute.exentity.SummaryWithdrawal;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.1 (2012/12/17 Monday)
 */
public class WxBizManyToOnePlainRelationTest extends UnitContainerTestCase {

    private PurchaseBhv purchaseBhv;

    public void test_NonPKRelation_SpecifyColumn_foreignColumn_basic() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_SummaryWithdrawal(); // non PK relation
        cb.specify().columnPurchaseDatetime();
        cb.specify().specifySummaryWithdrawal().columnWithdrawalDatetime();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        boolean exists = false;
        for (Purchase purchase : purchaseList) {
            SummaryWithdrawal withdrawal = purchase.getSummaryWithdrawal();
            Integer memberId = withdrawal != null ? withdrawal.getMemberId() : null;
            Timestamp withdrawalDatetime = withdrawal != null ? withdrawal.getWithdrawalDatetime() : null;
            log(purchase.getPurchaseId(), purchase.getPurchaseDatetime(), memberId, withdrawalDatetime);
            if (withdrawalDatetime != null) {
                assertNotNull(withdrawal.getMemberId());
                assertNotNull(memberId);
                assertNotNull(withdrawalDatetime);
                assertNull(withdrawal.getWithdrawalReasonCode());
                assertEquals(purchase.getMemberId(), memberId);
                exists = true;
            }
        }
        assertTrue(exists);
    }

    public void test_NonPKRelation_SpecifyColumn_foreignColumn_duplicateSpecify() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_SummaryWithdrawal(); // non PK relation
        cb.specify().columnPurchaseDatetime();
        cb.specify().specifySummaryWithdrawal().columnMemberId(); // duplicate specify
        cb.specify().specifySummaryWithdrawal().columnWithdrawalDatetime();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        boolean exists = false;
        for (Purchase purchase : purchaseList) {
            SummaryWithdrawal withdrawal = purchase.getSummaryWithdrawal();
            Integer memberId = withdrawal != null ? withdrawal.getMemberId() : null;
            Timestamp withdrawalDatetime = withdrawal != null ? withdrawal.getWithdrawalDatetime() : null;
            log(purchase.getPurchaseId(), purchase.getPurchaseDatetime(), memberId, withdrawalDatetime);
            if (withdrawalDatetime != null) {
                assertNotNull(withdrawal.getMemberId());
                assertNotNull(memberId);
                assertNotNull(withdrawalDatetime);
                assertNull(withdrawal.getWithdrawalReasonCode());
                assertEquals(purchase.getMemberId(), memberId);
                exists = true;
            }
        }
        assertTrue(exists);
    }
}
