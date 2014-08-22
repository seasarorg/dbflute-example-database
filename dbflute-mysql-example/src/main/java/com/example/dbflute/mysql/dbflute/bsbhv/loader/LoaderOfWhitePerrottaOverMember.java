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
 * The referrer loader of WHITE_PERROTTA_OVER_MEMBER as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, PRODUCT_ID, TRACE_TYPE_CODE, MACHO_CODE
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
 *     white_perrotta_over_member_macho, white_perrotta_over_product
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whitePerrottaOverMemberMacho, whitePerrottaOverProduct
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhitePerrottaOverMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhitePerrottaOverMember> _selectedList;
    protected BehaviorSelector _selector;
    protected WhitePerrottaOverMemberBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhitePerrottaOverMember ready(List<WhitePerrottaOverMember> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhitePerrottaOverMemberBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhitePerrottaOverMemberBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhitePerrottaOverMemberMacho _foreignWhitePerrottaOverMemberMachoLoader;
    public LoaderOfWhitePerrottaOverMemberMacho pulloutWhitePerrottaOverMemberMacho() {
        if (_foreignWhitePerrottaOverMemberMachoLoader != null) { return _foreignWhitePerrottaOverMemberMachoLoader; }
        List<WhitePerrottaOverMemberMacho> pulledList = myBhv().pulloutWhitePerrottaOverMemberMacho(_selectedList);
        _foreignWhitePerrottaOverMemberMachoLoader = new LoaderOfWhitePerrottaOverMemberMacho().ready(pulledList, _selector);
        return _foreignWhitePerrottaOverMemberMachoLoader;
    }

    protected LoaderOfWhitePerrottaOverProduct _foreignWhitePerrottaOverProductLoader;
    public LoaderOfWhitePerrottaOverProduct pulloutWhitePerrottaOverProduct() {
        if (_foreignWhitePerrottaOverProductLoader != null) { return _foreignWhitePerrottaOverProductLoader; }
        List<WhitePerrottaOverProduct> pulledList = myBhv().pulloutWhitePerrottaOverProduct(_selectedList);
        _foreignWhitePerrottaOverProductLoader = new LoaderOfWhitePerrottaOverProduct().ready(pulledList, _selector);
        return _foreignWhitePerrottaOverProductLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhitePerrottaOverMember> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
