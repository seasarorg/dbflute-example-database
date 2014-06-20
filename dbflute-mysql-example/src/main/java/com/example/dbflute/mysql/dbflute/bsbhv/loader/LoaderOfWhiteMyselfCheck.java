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
 * The referrer loader of WHITE_MYSELF_CHECK as TABLE. <br />
 * <pre>
 * [primary key]
 *     MYSELF_CHECK_ID
 *
 * [column]
 *     MYSELF_CHECK_ID, MYSELF_CHECK_NAME, MYSELF_ID
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
 *     white_myself
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteMyself
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteMyselfCheck {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteMyselfCheck> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteMyselfCheckBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteMyselfCheck ready(List<WhiteMyselfCheck> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteMyselfCheckBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteMyselfCheckBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteMyself _foreignWhiteMyselfLoader;
    public LoaderOfWhiteMyself pulloutWhiteMyself() {
        if (_foreignWhiteMyselfLoader != null) { return _foreignWhiteMyselfLoader; }
        List<WhiteMyself> pulledList = myBhv().pulloutWhiteMyself(_selectedList);
        _foreignWhiteMyselfLoader = new LoaderOfWhiteMyself().ready(pulledList, _selector);
        return _foreignWhiteMyselfLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteMyselfCheck> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
