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
 * The referrer loader of WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI as TABLE. <br />
 * <pre>
 * [primary key]
 *     ONE_ADDI_ID
 *
 * [column]
 *     ONE_ADDI_ID, ONE_ADDI_NAME
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
 *     white_suppress_join_sq_one
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteSuppressJoinSqOneList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSuppressJoinSqOneAddi {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSuppressJoinSqOneAddi> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSuppressJoinSqOneAddiBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSuppressJoinSqOneAddi ready(List<WhiteSuppressJoinSqOneAddi> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSuppressJoinSqOneAddiBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSuppressJoinSqOneAddiBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteSuppressJoinSqOne> _referrerWhiteSuppressJoinSqOneList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteSuppressJoinSqOne> loadWhiteSuppressJoinSqOneList(ConditionBeanSetupper<WhiteSuppressJoinSqOneCB> setupper) {
        myBhv().loadWhiteSuppressJoinSqOneList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteSuppressJoinSqOne>() {
            public void handle(List<WhiteSuppressJoinSqOne> referrerList) { _referrerWhiteSuppressJoinSqOneList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteSuppressJoinSqOne>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteSuppressJoinSqOne> handler) {
                handler.handle(new LoaderOfWhiteSuppressJoinSqOne().ready(_referrerWhiteSuppressJoinSqOneList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSuppressJoinSqOneAddi> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
