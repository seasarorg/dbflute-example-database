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
 * The referrer loader of WHITE_SPLIT_MULTIPLE_FK_BASE as TABLE. <br />
 * <pre>
 * [primary key]
 *     BASE_ID
 *
 * [column]
 *     BASE_ID, FIRST_ID, NEXT_ID, SPLIT_NAME
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
 *     white_split_multiple_fk_next, WHITE_SPLIT_MULTIPLE_FK_REF(AsSplitMultipleFkTest)
 *
 * [referrer table]
 *     white_split_multiple_fk_child
 *
 * [foreign property]
 *     whiteSplitMultipleFkNext, whiteSplitMultipleFkRefAsSplitMultipleFkTest
 *
 * [referrer property]
 *     whiteSplitMultipleFkChildList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSplitMultipleFkBase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSplitMultipleFkBase> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSplitMultipleFkBaseBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSplitMultipleFkBase ready(List<WhiteSplitMultipleFkBase> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSplitMultipleFkBaseBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSplitMultipleFkBaseBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteSplitMultipleFkChild> _referrerWhiteSplitMultipleFkChildList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteSplitMultipleFkChild> loadWhiteSplitMultipleFkChildList(ConditionBeanSetupper<WhiteSplitMultipleFkChildCB> setupper) {
        myBhv().loadWhiteSplitMultipleFkChildList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteSplitMultipleFkChild>() {
            public void handle(List<WhiteSplitMultipleFkChild> referrerList) { _referrerWhiteSplitMultipleFkChildList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteSplitMultipleFkChild>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteSplitMultipleFkChild> handler) {
                handler.handle(new LoaderOfWhiteSplitMultipleFkChild().ready(_referrerWhiteSplitMultipleFkChildList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteSplitMultipleFkNext _foreignWhiteSplitMultipleFkNextLoader;
    public LoaderOfWhiteSplitMultipleFkNext pulloutWhiteSplitMultipleFkNext() {
        if (_foreignWhiteSplitMultipleFkNextLoader != null) { return _foreignWhiteSplitMultipleFkNextLoader; }
        List<WhiteSplitMultipleFkNext> pulledList = myBhv().pulloutWhiteSplitMultipleFkNext(_selectedList);
        _foreignWhiteSplitMultipleFkNextLoader = new LoaderOfWhiteSplitMultipleFkNext().ready(pulledList, _selector);
        return _foreignWhiteSplitMultipleFkNextLoader;
    }

    protected LoaderOfWhiteSplitMultipleFkRef _foreignWhiteSplitMultipleFkRefAsSplitMultipleFkTestLoader;
    public LoaderOfWhiteSplitMultipleFkRef pulloutWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        if (_foreignWhiteSplitMultipleFkRefAsSplitMultipleFkTestLoader != null) { return _foreignWhiteSplitMultipleFkRefAsSplitMultipleFkTestLoader; }
        List<WhiteSplitMultipleFkRef> pulledList = myBhv().pulloutWhiteSplitMultipleFkRefAsSplitMultipleFkTest(_selectedList);
        _foreignWhiteSplitMultipleFkRefAsSplitMultipleFkTestLoader = new LoaderOfWhiteSplitMultipleFkRef().ready(pulledList, _selector);
        return _foreignWhiteSplitMultipleFkRefAsSplitMultipleFkTestLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSplitMultipleFkBase> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
