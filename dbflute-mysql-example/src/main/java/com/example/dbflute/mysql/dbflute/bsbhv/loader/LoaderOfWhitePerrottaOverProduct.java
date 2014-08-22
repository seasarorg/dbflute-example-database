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
 * The referrer loader of WHITE_PERROTTA_OVER_PRODUCT as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_NESTED_CODE
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
 *     white_perrotta_over_product_nested, WHITE_PERROTTA_OVER_TRACE(AsPerrotta)
 *
 * [referrer table]
 *     white_perrotta_over_member, white_perrotta_over_trace
 *
 * [foreign property]
 *     whitePerrottaOverProductNested, whitePerrottaOverTraceAsPerrotta
 *
 * [referrer property]
 *     whitePerrottaOverMemberList, whitePerrottaOverTraceByNextProductIdList, whitePerrottaOverTraceByPreviousProductIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhitePerrottaOverProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhitePerrottaOverProduct> _selectedList;
    protected BehaviorSelector _selector;
    protected WhitePerrottaOverProductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhitePerrottaOverProduct ready(List<WhitePerrottaOverProduct> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhitePerrottaOverProductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhitePerrottaOverProductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhitePerrottaOverMember> _referrerWhitePerrottaOverMemberList;
    public NestedReferrerLoaderGateway<LoaderOfWhitePerrottaOverMember> loadWhitePerrottaOverMemberList(ConditionBeanSetupper<WhitePerrottaOverMemberCB> setupper) {
        myBhv().loadWhitePerrottaOverMemberList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhitePerrottaOverMember>() {
            public void handle(List<WhitePerrottaOverMember> referrerList) { _referrerWhitePerrottaOverMemberList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhitePerrottaOverMember>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhitePerrottaOverMember> handler) {
                handler.handle(new LoaderOfWhitePerrottaOverMember().ready(_referrerWhitePerrottaOverMemberList, _selector));
            }
        };
    }

    protected List<WhitePerrottaOverTrace> _referrerWhitePerrottaOverTraceByNextProductIdList;
    public NestedReferrerLoaderGateway<LoaderOfWhitePerrottaOverTrace> loadWhitePerrottaOverTraceByNextProductIdList(ConditionBeanSetupper<WhitePerrottaOverTraceCB> setupper) {
        myBhv().loadWhitePerrottaOverTraceByNextProductIdList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhitePerrottaOverTrace>() {
            public void handle(List<WhitePerrottaOverTrace> referrerList) { _referrerWhitePerrottaOverTraceByNextProductIdList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhitePerrottaOverTrace>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhitePerrottaOverTrace> handler) {
                handler.handle(new LoaderOfWhitePerrottaOverTrace().ready(_referrerWhitePerrottaOverTraceByNextProductIdList, _selector));
            }
        };
    }

    protected List<WhitePerrottaOverTrace> _referrerWhitePerrottaOverTraceByPreviousProductIdList;
    public NestedReferrerLoaderGateway<LoaderOfWhitePerrottaOverTrace> loadWhitePerrottaOverTraceByPreviousProductIdList(ConditionBeanSetupper<WhitePerrottaOverTraceCB> setupper) {
        myBhv().loadWhitePerrottaOverTraceByPreviousProductIdList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhitePerrottaOverTrace>() {
            public void handle(List<WhitePerrottaOverTrace> referrerList) { _referrerWhitePerrottaOverTraceByPreviousProductIdList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhitePerrottaOverTrace>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhitePerrottaOverTrace> handler) {
                handler.handle(new LoaderOfWhitePerrottaOverTrace().ready(_referrerWhitePerrottaOverTraceByPreviousProductIdList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhitePerrottaOverProductNested _foreignWhitePerrottaOverProductNestedLoader;
    public LoaderOfWhitePerrottaOverProductNested pulloutWhitePerrottaOverProductNested() {
        if (_foreignWhitePerrottaOverProductNestedLoader != null) { return _foreignWhitePerrottaOverProductNestedLoader; }
        List<WhitePerrottaOverProductNested> pulledList = myBhv().pulloutWhitePerrottaOverProductNested(_selectedList);
        _foreignWhitePerrottaOverProductNestedLoader = new LoaderOfWhitePerrottaOverProductNested().ready(pulledList, _selector);
        return _foreignWhitePerrottaOverProductNestedLoader;
    }

    protected LoaderOfWhitePerrottaOverTrace _foreignWhitePerrottaOverTraceAsPerrottaLoader;
    public LoaderOfWhitePerrottaOverTrace pulloutWhitePerrottaOverTraceAsPerrotta() {
        if (_foreignWhitePerrottaOverTraceAsPerrottaLoader != null) { return _foreignWhitePerrottaOverTraceAsPerrottaLoader; }
        List<WhitePerrottaOverTrace> pulledList = myBhv().pulloutWhitePerrottaOverTraceAsPerrotta(_selectedList);
        _foreignWhitePerrottaOverTraceAsPerrottaLoader = new LoaderOfWhitePerrottaOverTrace().ready(pulledList, _selector);
        return _foreignWhitePerrottaOverTraceAsPerrottaLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhitePerrottaOverProduct> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
