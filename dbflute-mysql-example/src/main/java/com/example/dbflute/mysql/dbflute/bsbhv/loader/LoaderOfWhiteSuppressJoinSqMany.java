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
 * The referrer loader of WHITE_SUPPRESS_JOIN_SQ_MANY as TABLE. <br />
 * <pre>
 * [primary key]
 *     MANY_ID
 *
 * [column]
 *     MANY_ID, MANY_NAME, SUPPRESS_JOIN_SQ_ID, MANY_ONE_ID
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
 *     white_suppress_join_sq_many_one, white_suppress_join_sq
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteSuppressJoinSqManyOne, whiteSuppressJoinSq
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSuppressJoinSqMany {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSuppressJoinSqMany> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSuppressJoinSqManyBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSuppressJoinSqMany ready(List<WhiteSuppressJoinSqMany> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSuppressJoinSqManyBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSuppressJoinSqManyBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteSuppressJoinSqManyOne _foreignWhiteSuppressJoinSqManyOneLoader;
    public LoaderOfWhiteSuppressJoinSqManyOne pulloutWhiteSuppressJoinSqManyOne() {
        if (_foreignWhiteSuppressJoinSqManyOneLoader != null) { return _foreignWhiteSuppressJoinSqManyOneLoader; }
        List<WhiteSuppressJoinSqManyOne> pulledList = myBhv().pulloutWhiteSuppressJoinSqManyOne(_selectedList);
        _foreignWhiteSuppressJoinSqManyOneLoader = new LoaderOfWhiteSuppressJoinSqManyOne().ready(pulledList, _selector);
        return _foreignWhiteSuppressJoinSqManyOneLoader;
    }

    protected LoaderOfWhiteSuppressJoinSq _foreignWhiteSuppressJoinSqLoader;
    public LoaderOfWhiteSuppressJoinSq pulloutWhiteSuppressJoinSq() {
        if (_foreignWhiteSuppressJoinSqLoader != null) { return _foreignWhiteSuppressJoinSqLoader; }
        List<WhiteSuppressJoinSq> pulledList = myBhv().pulloutWhiteSuppressJoinSq(_selectedList);
        _foreignWhiteSuppressJoinSqLoader = new LoaderOfWhiteSuppressJoinSq().ready(pulledList, _selector);
        return _foreignWhiteSuppressJoinSqLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSuppressJoinSqMany> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
