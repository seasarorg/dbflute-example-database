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
 * The referrer loader of WHITE_VARIANT_RELATION_REFERRER_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     REF_ID
 *
 * [column]
 *     REF_ID, REFERRER_ID
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
 *     white_variant_relation_referrer
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteVariantRelationReferrer
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteVariantRelationReferrerRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteVariantRelationReferrerRef> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteVariantRelationReferrerRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteVariantRelationReferrerRef ready(List<WhiteVariantRelationReferrerRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteVariantRelationReferrerRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteVariantRelationReferrerRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteVariantRelationReferrer _foreignWhiteVariantRelationReferrerLoader;
    public LoaderOfWhiteVariantRelationReferrer pulloutWhiteVariantRelationReferrer() {
        if (_foreignWhiteVariantRelationReferrerLoader != null) { return _foreignWhiteVariantRelationReferrerLoader; }
        List<WhiteVariantRelationReferrer> pulledList = myBhv().pulloutWhiteVariantRelationReferrer(_selectedList);
        _foreignWhiteVariantRelationReferrerLoader = new LoaderOfWhiteVariantRelationReferrer().ready(pulledList, _selector);
        return _foreignWhiteVariantRelationReferrerLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteVariantRelationReferrerRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
