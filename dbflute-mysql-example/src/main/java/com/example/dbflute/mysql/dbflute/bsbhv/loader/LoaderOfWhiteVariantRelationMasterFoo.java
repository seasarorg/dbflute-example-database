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
 * The referrer loader of WHITE_VARIANT_RELATION_MASTER_FOO as TABLE. <br />
 * <pre>
 * [primary key]
 *     MASTER_FOO_ID
 *
 * [column]
 *     MASTER_FOO_ID, MASTER_FOO_NAME
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
 *     white_variant_relation_referrer
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteVariantRelationReferrerAsVariantList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteVariantRelationMasterFoo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteVariantRelationMasterFoo> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteVariantRelationMasterFooBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteVariantRelationMasterFoo ready(List<WhiteVariantRelationMasterFoo> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteVariantRelationMasterFooBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteVariantRelationMasterFooBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteVariantRelationReferrer> _referrerWhiteVariantRelationReferrerAsVariantList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteVariantRelationReferrer> loadWhiteVariantRelationReferrerAsVariantList(ConditionBeanSetupper<WhiteVariantRelationReferrerCB> setupper) {
        myBhv().loadWhiteVariantRelationReferrerAsVariantList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteVariantRelationReferrer>() {
            public void handle(List<WhiteVariantRelationReferrer> referrerList) { _referrerWhiteVariantRelationReferrerAsVariantList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteVariantRelationReferrer>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteVariantRelationReferrer> handler) {
                handler.handle(new LoaderOfWhiteVariantRelationReferrer().ready(_referrerWhiteVariantRelationReferrerAsVariantList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteVariantRelationMasterFoo> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
