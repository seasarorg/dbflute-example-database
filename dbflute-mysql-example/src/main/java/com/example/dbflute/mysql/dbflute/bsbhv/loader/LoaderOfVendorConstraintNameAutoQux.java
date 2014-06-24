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
 * The referrer loader of VENDOR_CONSTRAINT_NAME_AUTO_QUX as TABLE. <br />
 * <pre>
 * [primary key]
 *     CONSTRAINT_NAME_AUTO_QUX_ID
 *
 * [column]
 *     CONSTRAINT_NAME_AUTO_QUX_ID, CONSTRAINT_NAME_AUTO_QUX_NAME
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
 *     vendor_constraint_name_auto_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorConstraintNameAutoRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorConstraintNameAutoQux {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorConstraintNameAutoQux> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorConstraintNameAutoQuxBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorConstraintNameAutoQux ready(List<VendorConstraintNameAutoQux> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorConstraintNameAutoQuxBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorConstraintNameAutoQuxBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<VendorConstraintNameAutoRef> _referrerVendorConstraintNameAutoRefList;
    public NestedReferrerLoaderGateway<LoaderOfVendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(ConditionBeanSetupper<VendorConstraintNameAutoRefCB> setupper) {
        myBhv().loadVendorConstraintNameAutoRefList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<VendorConstraintNameAutoRef>() {
            public void handle(List<VendorConstraintNameAutoRef> referrerList) { _referrerVendorConstraintNameAutoRefList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfVendorConstraintNameAutoRef>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfVendorConstraintNameAutoRef> handler) {
                handler.handle(new LoaderOfVendorConstraintNameAutoRef().ready(_referrerVendorConstraintNameAutoRefList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorConstraintNameAutoQux> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}