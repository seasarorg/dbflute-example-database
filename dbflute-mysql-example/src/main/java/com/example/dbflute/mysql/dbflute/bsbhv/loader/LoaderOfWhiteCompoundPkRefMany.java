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
 * The referrer loader of WHITE_COMPOUND_PK_REF_MANY as TABLE. <br />
 * <pre>
 * [primary key]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID
 *
 * [column]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID, REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, REF_MANY_CODE, REF_MANY_NAME, REF_MANY_DATETIME
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
 *     WHITE_COMPOUND_PK(ToPK)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteCompoundPkToPK
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteCompoundPkRefMany {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteCompoundPkRefMany> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteCompoundPkRefManyBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteCompoundPkRefMany ready(List<WhiteCompoundPkRefMany> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteCompoundPkRefManyBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteCompoundPkRefManyBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteCompoundPk _foreignWhiteCompoundPkToPKLoader;
    public LoaderOfWhiteCompoundPk pulloutWhiteCompoundPkToPK() {
        if (_foreignWhiteCompoundPkToPKLoader != null) { return _foreignWhiteCompoundPkToPKLoader; }
        List<WhiteCompoundPk> pulledList = myBhv().pulloutWhiteCompoundPkToPK(_selectedList);
        _foreignWhiteCompoundPkToPKLoader = new LoaderOfWhiteCompoundPk().ready(pulledList, _selector);
        return _foreignWhiteCompoundPkToPKLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteCompoundPkRefMany> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
