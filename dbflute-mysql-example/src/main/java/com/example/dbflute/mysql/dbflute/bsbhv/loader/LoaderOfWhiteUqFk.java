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
 * The referrer loader of WHITE_UQ_FK as TABLE. <br />
 * <pre>
 * [primary key]
 *     UQ_FK_ID
 *
 * [column]
 *     UQ_FK_ID, UQ_FK_CODE
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
 *     white_uq_fk_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteUqFkRefByFkToPkIdList, whiteUqFkRefByFkToUqCodeList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteUqFk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteUqFk> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteUqFkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteUqFk ready(List<WhiteUqFk> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteUqFkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteUqFkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteUqFkRef> _referrerWhiteUqFkRefByFkToPkIdList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteUqFkRef> loadWhiteUqFkRefByFkToPkIdList(ConditionBeanSetupper<WhiteUqFkRefCB> setupper) {
        myBhv().loadWhiteUqFkRefByFkToPkIdList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteUqFkRef>() {
            public void handle(List<WhiteUqFkRef> referrerList) { _referrerWhiteUqFkRefByFkToPkIdList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteUqFkRef>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteUqFkRef> handler) {
                handler.handle(new LoaderOfWhiteUqFkRef().ready(_referrerWhiteUqFkRefByFkToPkIdList, _selector));
            }
        };
    }

    protected List<WhiteUqFkRef> _referrerWhiteUqFkRefByFkToUqCodeList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteUqFkRef> loadWhiteUqFkRefByFkToUqCodeList(ConditionBeanSetupper<WhiteUqFkRefCB> setupper) {
        myBhv().loadWhiteUqFkRefByFkToUqCodeList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteUqFkRef>() {
            public void handle(List<WhiteUqFkRef> referrerList) { _referrerWhiteUqFkRefByFkToUqCodeList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteUqFkRef>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteUqFkRef> handler) {
                handler.handle(new LoaderOfWhiteUqFkRef().ready(_referrerWhiteUqFkRefByFkToUqCodeList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteUqFk> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
