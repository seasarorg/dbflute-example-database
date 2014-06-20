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
 * The referrer loader of WHITE_SUPPRESS_JOIN_SQ_MANY_ONE as TABLE. <br />
 * <pre>
 * [primary key]
 *     MANY_ONE_ID
 *
 * [column]
 *     MANY_ONE_ID, MANY_ONE_NAME, MANY_ONE_ONE_ID
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
 *     white_suppress_join_sq_many_one_one
 *
 * [referrer table]
 *     white_suppress_join_sq_many
 *
 * [foreign property]
 *     whiteSuppressJoinSqManyOneOne
 *
 * [referrer property]
 *     whiteSuppressJoinSqManyList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSuppressJoinSqManyOne {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSuppressJoinSqManyOne> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSuppressJoinSqManyOneBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSuppressJoinSqManyOne ready(List<WhiteSuppressJoinSqManyOne> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSuppressJoinSqManyOneBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSuppressJoinSqManyOneBhv.class); return _myBhv; } }

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
    protected LoaderOfWhiteSuppressJoinSqManyOneOne _foreignWhiteSuppressJoinSqManyOneOneLoader;
    public LoaderOfWhiteSuppressJoinSqManyOneOne pulloutWhiteSuppressJoinSqManyOneOne() {
        if (_foreignWhiteSuppressJoinSqManyOneOneLoader != null) { return _foreignWhiteSuppressJoinSqManyOneOneLoader; }
        List<WhiteSuppressJoinSqManyOneOne> pulledList = myBhv().pulloutWhiteSuppressJoinSqManyOneOne(_selectedList);
        _foreignWhiteSuppressJoinSqManyOneOneLoader = new LoaderOfWhiteSuppressJoinSqManyOneOne().ready(pulledList, _selector);
        return _foreignWhiteSuppressJoinSqManyOneOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSuppressJoinSqManyOne> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
