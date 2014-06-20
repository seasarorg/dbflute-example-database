/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_PURCHASE_REFERRER as TABLE. <br />
 * <pre>
 * [primary key]
 *     PURCHASE_REFERRER_ID
 *
 * [column]
 *     PURCHASE_REFERRER_ID, PURCHASE_REFERRER_NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PURCHASE_REFERRER_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     purchase
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     purchase
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhitePurchaseReferrer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhitePurchaseReferrer> _selectedList;
    protected BehaviorSelector _selector;
    protected WhitePurchaseReferrerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhitePurchaseReferrer ready(List<WhitePurchaseReferrer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhitePurchaseReferrerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhitePurchaseReferrerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfPurchase _foreignPurchaseLoader;
    public LoaderOfPurchase pulloutPurchase() {
        if (_foreignPurchaseLoader != null) { return _foreignPurchaseLoader; }
        List<Purchase> pulledList = myBhv().pulloutPurchase(_selectedList);
        _foreignPurchaseLoader = new LoaderOfPurchase().ready(pulledList, _selector);
        return _foreignPurchaseLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhitePurchaseReferrer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
