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
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The referrer loader of VENDOR_LARGE_DATA_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     LARGE_DATA_REF_ID
 *
 * [column]
 *     LARGE_DATA_REF_ID, LARGE_DATA_ID, DATE_INDEX, DATE_NO_INDEX, TIMESTAMP_INDEX, TIMESTAMP_NO_INDEX, NULLABLE_DECIMAL_INDEX, NULLABLE_DECIMAL_NO_INDEX, SELF_PARENT_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     vendor_large_data, vendor_large_data_ref
 *
 * [referrer table]
 *     vendor_large_data_ref
 *
 * [foreign property]
 *     vendorLargeData, vendorLargeDataRefSelf
 *
 * [referrer property]
 *     vendorLargeDataRefSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorLargeDataRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorLargeDataRef> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorLargeDataRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorLargeDataRef ready(List<VendorLargeDataRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorLargeDataRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorLargeDataRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<VendorLargeDataRef> _referrerVendorLargeDataRefSelfList;
    public NestedReferrerLoaderGateway<LoaderOfVendorLargeDataRef> loadVendorLargeDataRefSelfList(ConditionBeanSetupper<VendorLargeDataRefCB> setupper) {
        myBhv().loadVendorLargeDataRefSelfList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<VendorLargeDataRef>() {
            public void handle(List<VendorLargeDataRef> referrerList) { _referrerVendorLargeDataRefSelfList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfVendorLargeDataRef>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfVendorLargeDataRef> handler) {
                handler.handle(new LoaderOfVendorLargeDataRef().ready(_referrerVendorLargeDataRefSelfList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfVendorLargeData _foreignVendorLargeDataLoader;
    public LoaderOfVendorLargeData pulloutVendorLargeData() {
        if (_foreignVendorLargeDataLoader != null) { return _foreignVendorLargeDataLoader; }
        List<VendorLargeData> pulledList = myBhv().pulloutVendorLargeData(_selectedList);
        _foreignVendorLargeDataLoader = new LoaderOfVendorLargeData().ready(pulledList, _selector);
        return _foreignVendorLargeDataLoader;
    }

    protected LoaderOfVendorLargeDataRef _foreignVendorLargeDataRefSelfLoader;
    public LoaderOfVendorLargeDataRef pulloutVendorLargeDataRefSelf() {
        if (_foreignVendorLargeDataRefSelfLoader != null) { return _foreignVendorLargeDataRefSelfLoader; }
        List<VendorLargeDataRef> pulledList = myBhv().pulloutVendorLargeDataRefSelf(_selectedList);
        _foreignVendorLargeDataRefSelfLoader = new LoaderOfVendorLargeDataRef().ready(pulledList, _selector);
        return _foreignVendorLargeDataRefSelfLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorLargeDataRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
