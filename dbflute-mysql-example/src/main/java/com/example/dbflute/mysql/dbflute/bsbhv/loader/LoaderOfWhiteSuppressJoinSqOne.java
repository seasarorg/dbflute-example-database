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
 * The referrer loader of WHITE_SUPPRESS_JOIN_SQ_ONE as TABLE. <br />
 * <pre>
 * [primary key]
 *     ONE_ID
 *
 * [column]
 *     ONE_ID, ONE_NAME, SUPPRESS_JOIN_SQ_ID, ONE_ADDI_ID
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
 *     white_suppress_join_sq, WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteSuppressJoinSq, whiteSuppressJoinSqOneAddi
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSuppressJoinSqOne {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSuppressJoinSqOne> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSuppressJoinSqOneBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSuppressJoinSqOne ready(List<WhiteSuppressJoinSqOne> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSuppressJoinSqOneBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSuppressJoinSqOneBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteSuppressJoinSq _foreignWhiteSuppressJoinSqLoader;
    public LoaderOfWhiteSuppressJoinSq pulloutWhiteSuppressJoinSq() {
        if (_foreignWhiteSuppressJoinSqLoader != null) { return _foreignWhiteSuppressJoinSqLoader; }
        List<WhiteSuppressJoinSq> pulledList = myBhv().pulloutWhiteSuppressJoinSq(_selectedList);
        _foreignWhiteSuppressJoinSqLoader = new LoaderOfWhiteSuppressJoinSq().ready(pulledList, _selector);
        return _foreignWhiteSuppressJoinSqLoader;
    }

    protected LoaderOfWhiteSuppressJoinSqOneAddi _foreignWhiteSuppressJoinSqOneAddiLoader;
    public LoaderOfWhiteSuppressJoinSqOneAddi pulloutWhiteSuppressJoinSqOneAddi() {
        if (_foreignWhiteSuppressJoinSqOneAddiLoader != null) { return _foreignWhiteSuppressJoinSqOneAddiLoader; }
        List<WhiteSuppressJoinSqOneAddi> pulledList = myBhv().pulloutWhiteSuppressJoinSqOneAddi(_selectedList);
        _foreignWhiteSuppressJoinSqOneAddiLoader = new LoaderOfWhiteSuppressJoinSqOneAddi().ready(pulledList, _selector);
        return _foreignWhiteSuppressJoinSqOneAddiLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSuppressJoinSqOne> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
