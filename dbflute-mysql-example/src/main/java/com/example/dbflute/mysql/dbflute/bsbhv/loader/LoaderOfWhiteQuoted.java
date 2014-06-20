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
 * The referrer loader of WHITE_QUOTED as TABLE. <br />
 * <pre>
 * [primary key]
 *     SELECT
 *
 * [column]
 *     SELECT, FROM
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
 *     white_quoted_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteQuotedRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteQuoted {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteQuoted> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteQuotedBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteQuoted ready(List<WhiteQuoted> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteQuotedBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteQuotedBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteQuotedRef> _referrerWhiteQuotedRefList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteQuotedRef> loadWhiteQuotedRefList(ConditionBeanSetupper<WhiteQuotedRefCB> setupper) {
        myBhv().loadWhiteQuotedRefList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteQuotedRef>() {
            public void handle(List<WhiteQuotedRef> referrerList) { _referrerWhiteQuotedRefList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteQuotedRef>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteQuotedRef> handler) {
                handler.handle(new LoaderOfWhiteQuotedRef().ready(_referrerWhiteQuotedRefList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteQuoted> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
