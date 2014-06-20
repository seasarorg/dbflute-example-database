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
 * The referrer loader of WHITE_SELF_REFERENCE as TABLE. <br />
 * <pre>
 * [primary key]
 *     SELF_REFERENCE_ID
 *
 * [column]
 *     SELF_REFERENCE_ID, SELF_REFERENCE_NAME, PARENT_ID
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
 *     white_self_reference, white_self_reference_ref_one(ByParentId)
 *
 * [referrer table]
 *     white_self_reference, white_self_reference_ref_one
 *
 * [foreign property]
 *     whiteSelfReferenceSelf, whiteSelfReferenceRefOneByParentId, whiteSelfReferenceRefOneAsOne
 *
 * [referrer property]
 *     whiteSelfReferenceSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSelfReference {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSelfReference> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSelfReferenceBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSelfReference ready(List<WhiteSelfReference> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSelfReferenceBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSelfReferenceBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteSelfReference> _referrerWhiteSelfReferenceSelfList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteSelfReference> loadWhiteSelfReferenceSelfList(ConditionBeanSetupper<WhiteSelfReferenceCB> setupper) {
        myBhv().loadWhiteSelfReferenceSelfList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteSelfReference>() {
            public void handle(List<WhiteSelfReference> referrerList) { _referrerWhiteSelfReferenceSelfList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteSelfReference>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteSelfReference> handler) {
                handler.handle(new LoaderOfWhiteSelfReference().ready(_referrerWhiteSelfReferenceSelfList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteSelfReference _foreignWhiteSelfReferenceSelfLoader;
    public LoaderOfWhiteSelfReference pulloutWhiteSelfReferenceSelf() {
        if (_foreignWhiteSelfReferenceSelfLoader != null) { return _foreignWhiteSelfReferenceSelfLoader; }
        List<WhiteSelfReference> pulledList = myBhv().pulloutWhiteSelfReferenceSelf(_selectedList);
        _foreignWhiteSelfReferenceSelfLoader = new LoaderOfWhiteSelfReference().ready(pulledList, _selector);
        return _foreignWhiteSelfReferenceSelfLoader;
    }

    protected LoaderOfWhiteSelfReferenceRefOne _foreignWhiteSelfReferenceRefOneByParentIdLoader;
    public LoaderOfWhiteSelfReferenceRefOne pulloutWhiteSelfReferenceRefOneByParentId() {
        if (_foreignWhiteSelfReferenceRefOneByParentIdLoader != null) { return _foreignWhiteSelfReferenceRefOneByParentIdLoader; }
        List<WhiteSelfReferenceRefOne> pulledList = myBhv().pulloutWhiteSelfReferenceRefOneByParentId(_selectedList);
        _foreignWhiteSelfReferenceRefOneByParentIdLoader = new LoaderOfWhiteSelfReferenceRefOne().ready(pulledList, _selector);
        return _foreignWhiteSelfReferenceRefOneByParentIdLoader;
    }

    protected LoaderOfWhiteSelfReferenceRefOne _foreignWhiteSelfReferenceRefOneAsOneLoader;
    public LoaderOfWhiteSelfReferenceRefOne pulloutWhiteSelfReferenceRefOneAsOne() {
        if (_foreignWhiteSelfReferenceRefOneAsOneLoader != null) { return _foreignWhiteSelfReferenceRefOneAsOneLoader; }
        List<WhiteSelfReferenceRefOne> pulledList = myBhv().pulloutWhiteSelfReferenceRefOneAsOne(_selectedList);
        _foreignWhiteSelfReferenceRefOneAsOneLoader = new LoaderOfWhiteSelfReferenceRefOne().ready(pulledList, _selector);
        return _foreignWhiteSelfReferenceRefOneAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSelfReference> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
