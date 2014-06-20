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
 * The referrer loader of WHITE_IMPLICIT_REVERSE_FK_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     WHITE_IMPLICIT_REVERSE_FK_REF_ID
 *
 * [column]
 *     WHITE_IMPLICIT_REVERSE_FK_REF_ID, WHITE_IMPLICIT_REVERSE_FK_ID, VALID_BEGIN_DATE, VALID_END_DATE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WHITE_IMPLICIT_REVERSE_FK_REF_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     white_implicit_reverse_fk
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteImplicitReverseFk
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteImplicitReverseFkRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteImplicitReverseFkRef> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteImplicitReverseFkRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteImplicitReverseFkRef ready(List<WhiteImplicitReverseFkRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteImplicitReverseFkRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteImplicitReverseFkRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteImplicitReverseFk _foreignWhiteImplicitReverseFkLoader;
    public LoaderOfWhiteImplicitReverseFk pulloutWhiteImplicitReverseFk() {
        if (_foreignWhiteImplicitReverseFkLoader != null) { return _foreignWhiteImplicitReverseFkLoader; }
        List<WhiteImplicitReverseFk> pulledList = myBhv().pulloutWhiteImplicitReverseFk(_selectedList);
        _foreignWhiteImplicitReverseFkLoader = new LoaderOfWhiteImplicitReverseFk().ready(pulledList, _selector);
        return _foreignWhiteImplicitReverseFkLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteImplicitReverseFkRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
