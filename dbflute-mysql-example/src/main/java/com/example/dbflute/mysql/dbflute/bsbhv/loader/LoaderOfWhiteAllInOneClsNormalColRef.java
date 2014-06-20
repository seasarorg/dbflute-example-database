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
 * The referrer loader of WHITE_ALL_IN_ONE_CLS_NORMAL_COL_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     FOO_CODE, BAR_CODE, QUX_CODE
 *
 * [column]
 *     CLS_REF_ID, FOO_CODE, BAR_CODE, QUX_CODE
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
 *     WHITE_ALL_IN_ONE_CLS_ELEMENT(AsFoo)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteAllInOneClsElementAsFoo, whiteAllInOneClsElementAsBar
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteAllInOneClsNormalColRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteAllInOneClsNormalColRef> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteAllInOneClsNormalColRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteAllInOneClsNormalColRef ready(List<WhiteAllInOneClsNormalColRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteAllInOneClsNormalColRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteAllInOneClsNormalColRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteAllInOneClsElement _foreignWhiteAllInOneClsElementAsFooLoader;
    public LoaderOfWhiteAllInOneClsElement pulloutWhiteAllInOneClsElementAsFoo() {
        if (_foreignWhiteAllInOneClsElementAsFooLoader != null) { return _foreignWhiteAllInOneClsElementAsFooLoader; }
        List<WhiteAllInOneClsElement> pulledList = myBhv().pulloutWhiteAllInOneClsElementAsFoo(_selectedList);
        _foreignWhiteAllInOneClsElementAsFooLoader = new LoaderOfWhiteAllInOneClsElement().ready(pulledList, _selector);
        return _foreignWhiteAllInOneClsElementAsFooLoader;
    }

    protected LoaderOfWhiteAllInOneClsElement _foreignWhiteAllInOneClsElementAsBarLoader;
    public LoaderOfWhiteAllInOneClsElement pulloutWhiteAllInOneClsElementAsBar() {
        if (_foreignWhiteAllInOneClsElementAsBarLoader != null) { return _foreignWhiteAllInOneClsElementAsBarLoader; }
        List<WhiteAllInOneClsElement> pulledList = myBhv().pulloutWhiteAllInOneClsElementAsBar(_selectedList);
        _foreignWhiteAllInOneClsElementAsBarLoader = new LoaderOfWhiteAllInOneClsElement().ready(pulledList, _selector);
        return _foreignWhiteAllInOneClsElementAsBarLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteAllInOneClsNormalColRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
