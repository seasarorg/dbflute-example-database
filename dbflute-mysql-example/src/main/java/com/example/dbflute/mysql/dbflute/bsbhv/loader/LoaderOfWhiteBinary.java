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
 * The referrer loader of WHITE_BINARY as TABLE. <br />
 * <pre>
 * [primary key]
 *     BINARY_ID
 *
 * [column]
 *     BINARY_ID, BINARY_DATA, BLOB_DATA
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BINARY_ID
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
public class LoaderOfWhiteBinary {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteBinary> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteBinaryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteBinary ready(List<WhiteBinary> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteBinaryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteBinaryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteBinary> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
