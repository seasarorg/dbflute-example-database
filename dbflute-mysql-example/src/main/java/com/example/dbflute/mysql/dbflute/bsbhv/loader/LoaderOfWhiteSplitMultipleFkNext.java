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
 * The referrer loader of WHITE_SPLIT_MULTIPLE_FK_NEXT as TABLE. <br />
 * <pre>
 * [primary key]
 *     NEXT_ID
 *
 * [column]
 *     NEXT_ID, SECOND_CODE
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
 *     white_split_multiple_fk_base
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteSplitMultipleFkBaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSplitMultipleFkNext {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSplitMultipleFkNext> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSplitMultipleFkNextBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSplitMultipleFkNext ready(List<WhiteSplitMultipleFkNext> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSplitMultipleFkNextBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSplitMultipleFkNextBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteSplitMultipleFkBase> _referrerWhiteSplitMultipleFkBaseList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteSplitMultipleFkBase> loadWhiteSplitMultipleFkBaseList(ConditionBeanSetupper<WhiteSplitMultipleFkBaseCB> setupper) {
        myBhv().loadWhiteSplitMultipleFkBaseList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteSplitMultipleFkBase>() {
            public void handle(List<WhiteSplitMultipleFkBase> referrerList) { _referrerWhiteSplitMultipleFkBaseList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteSplitMultipleFkBase>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteSplitMultipleFkBase> handler) {
                handler.handle(new LoaderOfWhiteSplitMultipleFkBase().ready(_referrerWhiteSplitMultipleFkBaseList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSplitMultipleFkNext> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
