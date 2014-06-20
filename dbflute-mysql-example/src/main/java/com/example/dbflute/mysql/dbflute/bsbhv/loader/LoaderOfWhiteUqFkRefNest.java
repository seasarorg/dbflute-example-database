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
 * The referrer loader of WHITE_UQ_FK_REF_NEST as TABLE. <br />
 * <pre>
 * [primary key]
 *     UQ_FK_REF_NEST_ID
 *
 * [column]
 *     UQ_FK_REF_NEST_ID, COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE
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
 *     white_uq_fk_ref
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteUqFkRef
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteUqFkRefNest {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteUqFkRefNest> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteUqFkRefNestBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteUqFkRefNest ready(List<WhiteUqFkRefNest> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteUqFkRefNestBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteUqFkRefNestBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteUqFkRef _foreignWhiteUqFkRefLoader;
    public LoaderOfWhiteUqFkRef pulloutWhiteUqFkRef() {
        if (_foreignWhiteUqFkRefLoader != null) { return _foreignWhiteUqFkRefLoader; }
        List<WhiteUqFkRef> pulledList = myBhv().pulloutWhiteUqFkRef(_selectedList);
        _foreignWhiteUqFkRefLoader = new LoaderOfWhiteUqFkRef().ready(pulledList, _selector);
        return _foreignWhiteUqFkRefLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteUqFkRefNest> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
