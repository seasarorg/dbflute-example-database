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
 * The referrer loader of WHITE_INCLUDE_QUERY as TABLE. <br />
 * <pre>
 * [primary key]
 *     INCLUDE_QUERY_ID
 *
 * [column]
 *     INCLUDE_QUERY_ID, INCLUDE_QUERY_VARCHAR, INCLUDE_QUERY_INTEGER, INCLUDE_QUERY_DATE, INCLUDE_QUERY_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INCLUDE_QUERY_ID
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
public class LoaderOfWhiteIncludeQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteIncludeQuery> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteIncludeQueryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteIncludeQuery ready(List<WhiteIncludeQuery> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteIncludeQueryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteIncludeQueryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteIncludeQuery> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
