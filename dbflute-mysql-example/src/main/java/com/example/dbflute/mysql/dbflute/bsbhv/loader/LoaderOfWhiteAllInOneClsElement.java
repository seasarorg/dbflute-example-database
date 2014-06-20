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
 * The referrer loader of WHITE_ALL_IN_ONE_CLS_ELEMENT as TABLE. <br />
 * <pre>
 * [primary key]
 *     CLS_CATEGORY_CODE, CLS_ELEMENT_CODE
 *
 * [column]
 *     CLS_CATEGORY_CODE, CLS_ELEMENT_CODE, CLS_ELEMENT_NAME, ATTRIBUTE_EXP
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
 *     white_all_in_one_cls_category
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteAllInOneClsCategory
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteAllInOneClsElement {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteAllInOneClsElement> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteAllInOneClsElementBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteAllInOneClsElement ready(List<WhiteAllInOneClsElement> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteAllInOneClsElementBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteAllInOneClsElementBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteAllInOneClsCategory _foreignWhiteAllInOneClsCategoryLoader;
    public LoaderOfWhiteAllInOneClsCategory pulloutWhiteAllInOneClsCategory() {
        if (_foreignWhiteAllInOneClsCategoryLoader != null) { return _foreignWhiteAllInOneClsCategoryLoader; }
        List<WhiteAllInOneClsCategory> pulledList = myBhv().pulloutWhiteAllInOneClsCategory(_selectedList);
        _foreignWhiteAllInOneClsCategoryLoader = new LoaderOfWhiteAllInOneClsCategory().ready(pulledList, _selector);
        return _foreignWhiteAllInOneClsCategoryLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteAllInOneClsElement> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
