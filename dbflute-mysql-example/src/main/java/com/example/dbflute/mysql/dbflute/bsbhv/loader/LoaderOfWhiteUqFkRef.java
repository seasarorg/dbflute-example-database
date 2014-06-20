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
 * The referrer loader of WHITE_UQ_FK_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     UQ_FK_REF_ID
 *
 * [column]
 *     UQ_FK_REF_ID, FK_TO_PK_ID, FK_TO_UQ_CODE, COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE
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
 *     white_uq_fk
 *
 * [referrer table]
 *     white_uq_fk_ref_nest
 *
 * [foreign property]
 *     whiteUqFkByFkToPkId, whiteUqFkByFkToUqCode
 *
 * [referrer property]
 *     whiteUqFkRefNestList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteUqFkRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteUqFkRef> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteUqFkRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteUqFkRef ready(List<WhiteUqFkRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteUqFkRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteUqFkRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteUqFkRefNest> _referrerWhiteUqFkRefNestList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteUqFkRefNest> loadWhiteUqFkRefNestList(ConditionBeanSetupper<WhiteUqFkRefNestCB> setupper) {
        myBhv().loadWhiteUqFkRefNestList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteUqFkRefNest>() {
            public void handle(List<WhiteUqFkRefNest> referrerList) { _referrerWhiteUqFkRefNestList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteUqFkRefNest>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteUqFkRefNest> handler) {
                handler.handle(new LoaderOfWhiteUqFkRefNest().ready(_referrerWhiteUqFkRefNestList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteUqFk _foreignWhiteUqFkByFkToPkIdLoader;
    public LoaderOfWhiteUqFk pulloutWhiteUqFkByFkToPkId() {
        if (_foreignWhiteUqFkByFkToPkIdLoader != null) { return _foreignWhiteUqFkByFkToPkIdLoader; }
        List<WhiteUqFk> pulledList = myBhv().pulloutWhiteUqFkByFkToPkId(_selectedList);
        _foreignWhiteUqFkByFkToPkIdLoader = new LoaderOfWhiteUqFk().ready(pulledList, _selector);
        return _foreignWhiteUqFkByFkToPkIdLoader;
    }

    protected LoaderOfWhiteUqFk _foreignWhiteUqFkByFkToUqCodeLoader;
    public LoaderOfWhiteUqFk pulloutWhiteUqFkByFkToUqCode() {
        if (_foreignWhiteUqFkByFkToUqCodeLoader != null) { return _foreignWhiteUqFkByFkToUqCodeLoader; }
        List<WhiteUqFk> pulledList = myBhv().pulloutWhiteUqFkByFkToUqCode(_selectedList);
        _foreignWhiteUqFkByFkToUqCodeLoader = new LoaderOfWhiteUqFk().ready(pulledList, _selector);
        return _foreignWhiteUqFkByFkToUqCodeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteUqFkRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
