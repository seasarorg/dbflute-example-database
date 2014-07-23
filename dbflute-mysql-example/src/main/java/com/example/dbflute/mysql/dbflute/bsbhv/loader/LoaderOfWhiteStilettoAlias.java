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
 * The referrer loader of WHITE_STILETTO_ALIAS as TABLE. <br />
 * <pre>
 * [primary key]
 *     STILETTO_ALIAS_ID
 *
 * [column]
 *     STILETTO_ALIAS_ID, FOO, FOO_1, FOO2, FOO_3, FOO4
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
 *     white_stiletto_alias_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteStilettoAliasRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteStilettoAlias {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteStilettoAlias> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteStilettoAliasBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteStilettoAlias ready(List<WhiteStilettoAlias> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteStilettoAliasBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteStilettoAliasBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteStilettoAliasRef> _referrerWhiteStilettoAliasRefList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteStilettoAliasRef> loadWhiteStilettoAliasRefList(ConditionBeanSetupper<WhiteStilettoAliasRefCB> setupper) {
        myBhv().loadWhiteStilettoAliasRefList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteStilettoAliasRef>() {
            public void handle(List<WhiteStilettoAliasRef> referrerList) { _referrerWhiteStilettoAliasRefList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteStilettoAliasRef>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteStilettoAliasRef> handler) {
                handler.handle(new LoaderOfWhiteStilettoAliasRef().ready(_referrerWhiteStilettoAliasRefList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteStilettoAlias> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
