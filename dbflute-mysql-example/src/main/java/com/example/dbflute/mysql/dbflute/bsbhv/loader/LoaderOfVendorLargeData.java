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
 * The referrer loader of VENDOR_LARGE_DATA as TABLE. <br />
 * <pre>
 * [primary key]
 *     LARGE_DATA_ID
 *
 * [column]
 *     LARGE_DATA_ID, STRING_INDEX, STRING_NO_INDEX, STRING_UNIQUE_INDEX, INTFLG_INDEX, NUMERIC_INTEGER_INDEX, NUMERIC_INTEGER_NO_INDEX
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
 *     
 *
 * [referrer table]
 *     vendor_large_data_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorLargeDataRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorLargeData {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorLargeData> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorLargeDataBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorLargeData ready(List<VendorLargeData> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorLargeDataBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorLargeDataBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<VendorLargeDataRef> _referrerVendorLargeDataRefList;
    public NestedReferrerLoaderGateway<LoaderOfVendorLargeDataRef> loadVendorLargeDataRefList(ConditionBeanSetupper<VendorLargeDataRefCB> setupper) {
        myBhv().loadVendorLargeDataRefList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<VendorLargeDataRef>() {
            public void handle(List<VendorLargeDataRef> referrerList) { _referrerVendorLargeDataRefList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfVendorLargeDataRef>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfVendorLargeDataRef> handler) {
                handler.handle(new LoaderOfVendorLargeDataRef().ready(_referrerVendorLargeDataRefList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorLargeData> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
