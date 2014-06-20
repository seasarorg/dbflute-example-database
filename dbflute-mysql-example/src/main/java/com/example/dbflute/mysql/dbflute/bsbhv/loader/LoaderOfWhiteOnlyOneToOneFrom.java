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
 * The referrer loader of WHITE_ONLY_ONE_TO_ONE_FROM as TABLE. <br />
 * <pre>
 * [primary key]
 *     FROM_ID
 *
 * [column]
 *     FROM_ID, FROM_NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FROM_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     white_only_one_to_one_to(AsOne)
 *
 * [referrer table]
 *     white_only_one_to_one_to
 *
 * [foreign property]
 *     whiteOnlyOneToOneToAsOne
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteOnlyOneToOneFrom {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteOnlyOneToOneFrom> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteOnlyOneToOneFromBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteOnlyOneToOneFrom ready(List<WhiteOnlyOneToOneFrom> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteOnlyOneToOneFromBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteOnlyOneToOneFromBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteOnlyOneToOneTo _foreignWhiteOnlyOneToOneToAsOneLoader;
    public LoaderOfWhiteOnlyOneToOneTo pulloutWhiteOnlyOneToOneToAsOne() {
        if (_foreignWhiteOnlyOneToOneToAsOneLoader != null) { return _foreignWhiteOnlyOneToOneToAsOneLoader; }
        List<WhiteOnlyOneToOneTo> pulledList = myBhv().pulloutWhiteOnlyOneToOneToAsOne(_selectedList);
        _foreignWhiteOnlyOneToOneToAsOneLoader = new LoaderOfWhiteOnlyOneToOneTo().ready(pulledList, _selector);
        return _foreignWhiteOnlyOneToOneToAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteOnlyOneToOneFrom> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
