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
 * The referrer loader of WHITE_COMPOUND_REFERRED_NORMALLY as TABLE. <br />
 * <pre>
 * [primary key]
 *     REFERRED_ID
 *
 * [column]
 *     REFERRED_ID, REFERRED_NAME
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
 *     white_compound_pk
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteCompoundPkList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteCompoundReferredNormally {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteCompoundReferredNormally> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteCompoundReferredNormallyBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteCompoundReferredNormally ready(List<WhiteCompoundReferredNormally> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteCompoundReferredNormallyBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteCompoundReferredNormallyBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteCompoundPk> _referrerWhiteCompoundPkList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteCompoundPk> loadWhiteCompoundPkList(ConditionBeanSetupper<WhiteCompoundPkCB> setupper) {
        myBhv().loadWhiteCompoundPkList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteCompoundPk>() {
            public void handle(List<WhiteCompoundPk> referrerList) { _referrerWhiteCompoundPkList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteCompoundPk>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteCompoundPk> handler) {
                handler.handle(new LoaderOfWhiteCompoundPk().ready(_referrerWhiteCompoundPkList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteCompoundReferredNormally> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
