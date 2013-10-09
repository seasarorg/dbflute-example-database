package com.example.dbflute.postgresql.dbflute.exbhv;

import com.example.dbflute.postgresql.dbflute.bsbhv.BsPurchaseBhv;

/**
 * The behavior of purchase.
 * <p>
 * You can implement your original methods here.
 * This class is NOT overridden when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class PurchaseBhv extends BsPurchaseBhv {

    @Override
    public Integer selectNextValForPurchaseCount() {
        return doSelectNextValForPurchaseCount(1, 10);
    }
}
