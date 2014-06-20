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
 * The referrer loader of WHITE_MYSELF as TABLE. <br />
 * <pre>
 * [primary key]
 *     MYSELF_ID
 *
 * [column]
 *     MYSELF_ID, MYSELF_NAME
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
 *     white_myself_check
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteMyselfCheckList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteMyself {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteMyself> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteMyselfBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteMyself ready(List<WhiteMyself> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteMyselfBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteMyselfBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteMyselfCheck> _referrerWhiteMyselfCheckList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteMyselfCheck> loadWhiteMyselfCheckList(ConditionBeanSetupper<WhiteMyselfCheckCB> setupper) {
        myBhv().loadWhiteMyselfCheckList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteMyselfCheck>() {
            public void handle(List<WhiteMyselfCheck> referrerList) { _referrerWhiteMyselfCheckList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteMyselfCheck>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteMyselfCheck> handler) {
                handler.handle(new LoaderOfWhiteMyselfCheck().ready(_referrerWhiteMyselfCheckList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteMyself> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
