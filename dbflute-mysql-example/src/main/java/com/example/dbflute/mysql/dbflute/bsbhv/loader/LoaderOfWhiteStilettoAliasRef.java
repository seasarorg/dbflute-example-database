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
 * The referrer loader of WHITE_STILETTO_ALIAS_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     REF_ID
 *
 * [column]
 *     REF_ID, FOO0, FOO_1, FOO2, FOO3, FOO_4, STILETTO_ALIAS_ID
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
 *     white_stiletto_alias
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteStilettoAlias
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteStilettoAliasRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteStilettoAliasRef> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteStilettoAliasRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteStilettoAliasRef ready(List<WhiteStilettoAliasRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteStilettoAliasRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteStilettoAliasRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteStilettoAlias _foreignWhiteStilettoAliasLoader;
    public LoaderOfWhiteStilettoAlias pulloutWhiteStilettoAlias() {
        if (_foreignWhiteStilettoAliasLoader != null) { return _foreignWhiteStilettoAliasLoader; }
        List<WhiteStilettoAlias> pulledList = myBhv().pulloutWhiteStilettoAlias(_selectedList);
        _foreignWhiteStilettoAliasLoader = new LoaderOfWhiteStilettoAlias().ready(pulledList, _selector);
        return _foreignWhiteStilettoAliasLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteStilettoAliasRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
