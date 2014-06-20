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
 * The referrer loader of WHITE_DATE_ADJUSTMENT as TABLE. <br />
 * <pre>
 * [primary key]
 *     DATE_ADJUSTMENT_ID
 *
 * [column]
 *     DATE_ADJUSTMENT_ID, ADJUSTED_DATE, ADJUSTED_DATETIME, ADJUSTED_TIME, ADJUSTED_INTEGER, ADJUSTED_NAMED_STRING_LONG, ADJUSTED_NAMED_TYPED_LONG, ADJUSTED_PINPOINT_STRING_LONG, ADJUSTED_PINPOINT_TYPED_LONG, ADJUSTED_PLAIN_LONG, ADJUSTED_STRING
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
public class LoaderOfWhiteDateAdjustment {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteDateAdjustment> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteDateAdjustmentBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteDateAdjustment ready(List<WhiteDateAdjustment> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteDateAdjustmentBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteDateAdjustmentBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteDateAdjustment> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
