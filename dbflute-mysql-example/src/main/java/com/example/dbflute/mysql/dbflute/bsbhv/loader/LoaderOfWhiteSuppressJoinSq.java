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
 * The referrer loader of WHITE_SUPPRESS_JOIN_SQ as TABLE. <br />
 * <pre>
 * [primary key]
 *     SUPPRESS_JOIN_SQ_ID
 *
 * [column]
 *     SUPPRESS_JOIN_SQ_ID, SUPPRESS_JOIN_SQ_NAME
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
 *     white_suppress_join_sq_one(AsOne)
 *
 * [referrer table]
 *     white_suppress_join_sq_many, white_suppress_join_sq_one
 *
 * [foreign property]
 *     whiteSuppressJoinSqOneAsOne
 *
 * [referrer property]
 *     whiteSuppressJoinSqManyList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSuppressJoinSq {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSuppressJoinSq> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSuppressJoinSqBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSuppressJoinSq ready(List<WhiteSuppressJoinSq> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSuppressJoinSqBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSuppressJoinSqBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteSuppressJoinSqMany> _referrerWhiteSuppressJoinSqManyList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(ConditionBeanSetupper<WhiteSuppressJoinSqManyCB> setupper) {
        myBhv().loadWhiteSuppressJoinSqManyList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteSuppressJoinSqMany>() {
            public void handle(List<WhiteSuppressJoinSqMany> referrerList) { _referrerWhiteSuppressJoinSqManyList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteSuppressJoinSqMany>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteSuppressJoinSqMany> handler) {
                handler.handle(new LoaderOfWhiteSuppressJoinSqMany().ready(_referrerWhiteSuppressJoinSqManyList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteSuppressJoinSqOne _foreignWhiteSuppressJoinSqOneAsOneLoader;
    public LoaderOfWhiteSuppressJoinSqOne pulloutWhiteSuppressJoinSqOneAsOne() {
        if (_foreignWhiteSuppressJoinSqOneAsOneLoader != null) { return _foreignWhiteSuppressJoinSqOneAsOneLoader; }
        List<WhiteSuppressJoinSqOne> pulledList = myBhv().pulloutWhiteSuppressJoinSqOneAsOne(_selectedList);
        _foreignWhiteSuppressJoinSqOneAsOneLoader = new LoaderOfWhiteSuppressJoinSqOne().ready(pulledList, _selector);
        return _foreignWhiteSuppressJoinSqOneAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSuppressJoinSq> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
