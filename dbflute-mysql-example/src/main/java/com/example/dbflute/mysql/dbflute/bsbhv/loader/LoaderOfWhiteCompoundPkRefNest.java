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
 * The referrer loader of WHITE_COMPOUND_PK_REF_NEST as TABLE. <br />
 * <pre>
 * [primary key]
 *     COMPOUND_PK_REF_NEST_ID
 *
 * [column]
 *     COMPOUND_PK_REF_NEST_ID, FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, NEST_NAME
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
 *     white_compound_pk_ref
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteCompoundPkRefByQuxMultipleId, whiteCompoundPkRefByFooMultipleId
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteCompoundPkRefNest {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteCompoundPkRefNest> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteCompoundPkRefNestBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteCompoundPkRefNest ready(List<WhiteCompoundPkRefNest> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteCompoundPkRefNestBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteCompoundPkRefNestBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteCompoundPkRef _foreignWhiteCompoundPkRefByQuxMultipleIdLoader;
    public LoaderOfWhiteCompoundPkRef pulloutWhiteCompoundPkRefByQuxMultipleId() {
        if (_foreignWhiteCompoundPkRefByQuxMultipleIdLoader != null) { return _foreignWhiteCompoundPkRefByQuxMultipleIdLoader; }
        List<WhiteCompoundPkRef> pulledList = myBhv().pulloutWhiteCompoundPkRefByQuxMultipleId(_selectedList);
        _foreignWhiteCompoundPkRefByQuxMultipleIdLoader = new LoaderOfWhiteCompoundPkRef().ready(pulledList, _selector);
        return _foreignWhiteCompoundPkRefByQuxMultipleIdLoader;
    }

    protected LoaderOfWhiteCompoundPkRef _foreignWhiteCompoundPkRefByFooMultipleIdLoader;
    public LoaderOfWhiteCompoundPkRef pulloutWhiteCompoundPkRefByFooMultipleId() {
        if (_foreignWhiteCompoundPkRefByFooMultipleIdLoader != null) { return _foreignWhiteCompoundPkRefByFooMultipleIdLoader; }
        List<WhiteCompoundPkRef> pulledList = myBhv().pulloutWhiteCompoundPkRefByFooMultipleId(_selectedList);
        _foreignWhiteCompoundPkRefByFooMultipleIdLoader = new LoaderOfWhiteCompoundPkRef().ready(pulledList, _selector);
        return _foreignWhiteCompoundPkRefByFooMultipleIdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteCompoundPkRefNest> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
