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
 * The referrer loader of WHITE_PERROTTA_OVER_TRACE as TABLE. <br />
 * <pre>
 * [primary key]
 *     TRACE_ID
 *
 * [column]
 *     TRACE_ID, PREVIOUS_PRODUCT_ID, NEXT_PRODUCT_ID, TRACE_TYPE_CODE
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
 *     white_perrotta_over_product
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whitePerrottaOverProductByNextProductId, whitePerrottaOverProductByPreviousProductId
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhitePerrottaOverTrace {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhitePerrottaOverTrace> _selectedList;
    protected BehaviorSelector _selector;
    protected WhitePerrottaOverTraceBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhitePerrottaOverTrace ready(List<WhitePerrottaOverTrace> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhitePerrottaOverTraceBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhitePerrottaOverTraceBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhitePerrottaOverProduct _foreignWhitePerrottaOverProductByNextProductIdLoader;
    public LoaderOfWhitePerrottaOverProduct pulloutWhitePerrottaOverProductByNextProductId() {
        if (_foreignWhitePerrottaOverProductByNextProductIdLoader != null) { return _foreignWhitePerrottaOverProductByNextProductIdLoader; }
        List<WhitePerrottaOverProduct> pulledList = myBhv().pulloutWhitePerrottaOverProductByNextProductId(_selectedList);
        _foreignWhitePerrottaOverProductByNextProductIdLoader = new LoaderOfWhitePerrottaOverProduct().ready(pulledList, _selector);
        return _foreignWhitePerrottaOverProductByNextProductIdLoader;
    }

    protected LoaderOfWhitePerrottaOverProduct _foreignWhitePerrottaOverProductByPreviousProductIdLoader;
    public LoaderOfWhitePerrottaOverProduct pulloutWhitePerrottaOverProductByPreviousProductId() {
        if (_foreignWhitePerrottaOverProductByPreviousProductIdLoader != null) { return _foreignWhitePerrottaOverProductByPreviousProductIdLoader; }
        List<WhitePerrottaOverProduct> pulledList = myBhv().pulloutWhitePerrottaOverProductByPreviousProductId(_selectedList);
        _foreignWhitePerrottaOverProductByPreviousProductIdLoader = new LoaderOfWhitePerrottaOverProduct().ready(pulledList, _selector);
        return _foreignWhitePerrottaOverProductByPreviousProductIdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhitePerrottaOverTrace> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
