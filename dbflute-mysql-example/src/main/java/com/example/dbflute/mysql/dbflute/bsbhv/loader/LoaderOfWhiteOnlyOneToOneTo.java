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
 * The referrer loader of WHITE_ONLY_ONE_TO_ONE_TO as TABLE. <br />
 * <pre>
 * [primary key]
 *     TO_ID
 *
 * [column]
 *     TO_ID, TO_NAME, FROM_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TO_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     white_only_one_to_one_from
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteOnlyOneToOneFrom
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteOnlyOneToOneTo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteOnlyOneToOneTo> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteOnlyOneToOneToBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteOnlyOneToOneTo ready(List<WhiteOnlyOneToOneTo> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteOnlyOneToOneToBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteOnlyOneToOneToBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteOnlyOneToOneFrom _foreignWhiteOnlyOneToOneFromLoader;
    public LoaderOfWhiteOnlyOneToOneFrom pulloutWhiteOnlyOneToOneFrom() {
        if (_foreignWhiteOnlyOneToOneFromLoader != null) { return _foreignWhiteOnlyOneToOneFromLoader; }
        List<WhiteOnlyOneToOneFrom> pulledList = myBhv().pulloutWhiteOnlyOneToOneFrom(_selectedList);
        _foreignWhiteOnlyOneToOneFromLoader = new LoaderOfWhiteOnlyOneToOneFrom().ready(pulledList, _selector);
        return _foreignWhiteOnlyOneToOneFromLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteOnlyOneToOneTo> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
