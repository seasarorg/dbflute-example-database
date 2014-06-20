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
 * The referrer loader of WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE as TABLE. <br />
 * <pre>
 * [primary key]
 *     MANY_ONE_ONE_ID
 *
 * [column]
 *     MANY_ONE_ONE_ID, MANY_ONE_ONE_NAME
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
 *     white_suppress_join_sq_many_one
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteSuppressJoinSqManyOneList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSuppressJoinSqManyOneOne {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSuppressJoinSqManyOneOne> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSuppressJoinSqManyOneOneBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSuppressJoinSqManyOneOne ready(List<WhiteSuppressJoinSqManyOneOne> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSuppressJoinSqManyOneOneBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSuppressJoinSqManyOneOneBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteSuppressJoinSqManyOne> _referrerWhiteSuppressJoinSqManyOneList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteSuppressJoinSqManyOne> loadWhiteSuppressJoinSqManyOneList(ConditionBeanSetupper<WhiteSuppressJoinSqManyOneCB> setupper) {
        myBhv().loadWhiteSuppressJoinSqManyOneList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteSuppressJoinSqManyOne>() {
            public void handle(List<WhiteSuppressJoinSqManyOne> referrerList) { _referrerWhiteSuppressJoinSqManyOneList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteSuppressJoinSqManyOne>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteSuppressJoinSqManyOne> handler) {
                handler.handle(new LoaderOfWhiteSuppressJoinSqManyOne().ready(_referrerWhiteSuppressJoinSqManyOneList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSuppressJoinSqManyOneOne> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
