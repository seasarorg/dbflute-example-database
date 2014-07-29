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
 * The referrer loader of WHITE_VARIANT_RELATION_REFERRER as TABLE. <br />
 * <pre>
 * [primary key]
 *     REFERRER_ID
 *
 * [column]
 *     REFERRER_ID, VARIANT_MASTER_ID, MASTER_TYPE_CODE
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
 *     WHITE_VARIANT_RELATION_MASTER_FOO(AsVariant), WHITE_VARIANT_RELATION_MASTER_BAR(AsVariant), WHITE_VARIANT_RELATION_MASTER_QUX(AsVariantByQue), WHITE_VARIANT_RELATION_MASTER_CORGE(AsVariantByQuxType)
 *
 * [referrer table]
 *     white_variant_relation_referrer_ref
 *
 * [foreign property]
 *     whiteVariantRelationMasterFooAsVariant, whiteVariantRelationMasterBarAsVariant, whiteVariantRelationMasterQuxAsVariantByQue, whiteVariantRelationMasterCorgeAsVariantByQuxType
 *
 * [referrer property]
 *     whiteVariantRelationReferrerRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteVariantRelationReferrer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteVariantRelationReferrer> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteVariantRelationReferrerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteVariantRelationReferrer ready(List<WhiteVariantRelationReferrer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteVariantRelationReferrerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteVariantRelationReferrerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteVariantRelationReferrerRef> _referrerWhiteVariantRelationReferrerRefList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteVariantRelationReferrerRef> loadWhiteVariantRelationReferrerRefList(ConditionBeanSetupper<WhiteVariantRelationReferrerRefCB> setupper) {
        myBhv().loadWhiteVariantRelationReferrerRefList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteVariantRelationReferrerRef>() {
            public void handle(List<WhiteVariantRelationReferrerRef> referrerList) { _referrerWhiteVariantRelationReferrerRefList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteVariantRelationReferrerRef>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteVariantRelationReferrerRef> handler) {
                handler.handle(new LoaderOfWhiteVariantRelationReferrerRef().ready(_referrerWhiteVariantRelationReferrerRefList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteVariantRelationMasterFoo _foreignWhiteVariantRelationMasterFooAsVariantLoader;
    public LoaderOfWhiteVariantRelationMasterFoo pulloutWhiteVariantRelationMasterFooAsVariant() {
        if (_foreignWhiteVariantRelationMasterFooAsVariantLoader != null) { return _foreignWhiteVariantRelationMasterFooAsVariantLoader; }
        List<WhiteVariantRelationMasterFoo> pulledList = myBhv().pulloutWhiteVariantRelationMasterFooAsVariant(_selectedList);
        _foreignWhiteVariantRelationMasterFooAsVariantLoader = new LoaderOfWhiteVariantRelationMasterFoo().ready(pulledList, _selector);
        return _foreignWhiteVariantRelationMasterFooAsVariantLoader;
    }

    protected LoaderOfWhiteVariantRelationMasterBar _foreignWhiteVariantRelationMasterBarAsVariantLoader;
    public LoaderOfWhiteVariantRelationMasterBar pulloutWhiteVariantRelationMasterBarAsVariant() {
        if (_foreignWhiteVariantRelationMasterBarAsVariantLoader != null) { return _foreignWhiteVariantRelationMasterBarAsVariantLoader; }
        List<WhiteVariantRelationMasterBar> pulledList = myBhv().pulloutWhiteVariantRelationMasterBarAsVariant(_selectedList);
        _foreignWhiteVariantRelationMasterBarAsVariantLoader = new LoaderOfWhiteVariantRelationMasterBar().ready(pulledList, _selector);
        return _foreignWhiteVariantRelationMasterBarAsVariantLoader;
    }

    protected LoaderOfWhiteVariantRelationMasterQux _foreignWhiteVariantRelationMasterQuxAsVariantByQueLoader;
    public LoaderOfWhiteVariantRelationMasterQux pulloutWhiteVariantRelationMasterQuxAsVariantByQue() {
        if (_foreignWhiteVariantRelationMasterQuxAsVariantByQueLoader != null) { return _foreignWhiteVariantRelationMasterQuxAsVariantByQueLoader; }
        List<WhiteVariantRelationMasterQux> pulledList = myBhv().pulloutWhiteVariantRelationMasterQuxAsVariantByQue(_selectedList);
        _foreignWhiteVariantRelationMasterQuxAsVariantByQueLoader = new LoaderOfWhiteVariantRelationMasterQux().ready(pulledList, _selector);
        return _foreignWhiteVariantRelationMasterQuxAsVariantByQueLoader;
    }

    protected LoaderOfWhiteVariantRelationMasterCorge _foreignWhiteVariantRelationMasterCorgeAsVariantByQuxTypeLoader;
    public LoaderOfWhiteVariantRelationMasterCorge pulloutWhiteVariantRelationMasterCorgeAsVariantByQuxType() {
        if (_foreignWhiteVariantRelationMasterCorgeAsVariantByQuxTypeLoader != null) { return _foreignWhiteVariantRelationMasterCorgeAsVariantByQuxTypeLoader; }
        List<WhiteVariantRelationMasterCorge> pulledList = myBhv().pulloutWhiteVariantRelationMasterCorgeAsVariantByQuxType(_selectedList);
        _foreignWhiteVariantRelationMasterCorgeAsVariantByQuxTypeLoader = new LoaderOfWhiteVariantRelationMasterCorge().ready(pulledList, _selector);
        return _foreignWhiteVariantRelationMasterCorgeAsVariantByQuxTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteVariantRelationReferrer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
