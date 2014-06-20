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
 * The referrer loader of WHITE_SPLIT_MULTIPLE_FK_CHILD as TABLE. <br />
 * <pre>
 * [primary key]
 *     CHILD_ID
 *
 * [column]
 *     CHILD_ID, BASE_ID, CHILD_NAME
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
 *     white_split_multiple_fk_base
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteSplitMultipleFkBase
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSplitMultipleFkChild {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSplitMultipleFkChild> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSplitMultipleFkChildBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSplitMultipleFkChild ready(List<WhiteSplitMultipleFkChild> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSplitMultipleFkChildBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSplitMultipleFkChildBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteSplitMultipleFkBase _foreignWhiteSplitMultipleFkBaseLoader;
    public LoaderOfWhiteSplitMultipleFkBase pulloutWhiteSplitMultipleFkBase() {
        if (_foreignWhiteSplitMultipleFkBaseLoader != null) { return _foreignWhiteSplitMultipleFkBaseLoader; }
        List<WhiteSplitMultipleFkBase> pulledList = myBhv().pulloutWhiteSplitMultipleFkBase(_selectedList);
        _foreignWhiteSplitMultipleFkBaseLoader = new LoaderOfWhiteSplitMultipleFkBase().ready(pulledList, _selector);
        return _foreignWhiteSplitMultipleFkBaseLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSplitMultipleFkChild> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
