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
 * The referrer loader of WHITE_VARIANT_RELATION_LOCAL_PK_REFERRER as TABLE. <br />
 * <pre>
 * [primary key]
 *     REVERSEFK_SUPPRESSED_ID
 *
 * [column]
 *     REVERSEFK_SUPPRESSED_ID, MASTER_TYPE_CODE
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
 *     WHITE_VARIANT_RELATION_MASTER_FOO(AsBizManyToOneLikeBizOneToOne)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteVariantRelationLocalPkReferrer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteVariantRelationLocalPkReferrer> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteVariantRelationLocalPkReferrerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteVariantRelationLocalPkReferrer ready(List<WhiteVariantRelationLocalPkReferrer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteVariantRelationLocalPkReferrerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteVariantRelationLocalPkReferrerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteVariantRelationMasterFoo _foreignWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOneLoader;
    public LoaderOfWhiteVariantRelationMasterFoo pulloutWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne() {
        if (_foreignWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOneLoader != null) { return _foreignWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOneLoader; }
        List<WhiteVariantRelationMasterFoo> pulledList = myBhv().pulloutWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne(_selectedList);
        _foreignWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOneLoader = new LoaderOfWhiteVariantRelationMasterFoo().ready(pulledList, _selector);
        return _foreignWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteVariantRelationLocalPkReferrer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
