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
 * The referrer loader of WHITE_ESCAPED_NUMBER_INITIAL as TABLE. <br />
 * <pre>
 * [primary key]
 *     NUMBER_INITIAL_CODE
 *
 * [column]
 *     NUMBER_INITIAL_CODE, NUMBER_INITIAL_NAME
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteEscapedNumberInitial {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteEscapedNumberInitial> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteEscapedNumberInitialBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteEscapedNumberInitial ready(List<WhiteEscapedNumberInitial> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteEscapedNumberInitialBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteEscapedNumberInitialBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteEscapedNumberInitial> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
