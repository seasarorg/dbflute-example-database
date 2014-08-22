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
 * The referrer loader of WHITE_PERROTTA_OVER_PRODUCT_NESTED as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_NESTED_CODE
 *
 * [column]
 *     PRODUCT_NESTED_CODE, PRODUCT_NESTED_NAME
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
 *     white_perrotta_over_product
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whitePerrottaOverProductList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhitePerrottaOverProductNested {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhitePerrottaOverProductNested> _selectedList;
    protected BehaviorSelector _selector;
    protected WhitePerrottaOverProductNestedBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhitePerrottaOverProductNested ready(List<WhitePerrottaOverProductNested> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhitePerrottaOverProductNestedBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhitePerrottaOverProductNestedBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhitePerrottaOverProduct> _referrerWhitePerrottaOverProductList;
    public NestedReferrerLoaderGateway<LoaderOfWhitePerrottaOverProduct> loadWhitePerrottaOverProductList(ConditionBeanSetupper<WhitePerrottaOverProductCB> setupper) {
        myBhv().loadWhitePerrottaOverProductList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhitePerrottaOverProduct>() {
            public void handle(List<WhitePerrottaOverProduct> referrerList) { _referrerWhitePerrottaOverProductList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhitePerrottaOverProduct>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhitePerrottaOverProduct> handler) {
                handler.handle(new LoaderOfWhitePerrottaOverProduct().ready(_referrerWhitePerrottaOverProductList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhitePerrottaOverProductNested> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
