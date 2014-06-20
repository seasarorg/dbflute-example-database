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
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The referrer loader of WHITE_IMPLICIT_CONV_NUMERIC as TABLE. <br />
 * <pre>
 * [primary key]
 *     IMPLICIT_CONV_NUMERIC_ID
 *
 * [column]
 *     IMPLICIT_CONV_NUMERIC_ID, IMPLICIT_CONV_INTEGER_ID, IMPLICIT_CONV_STRING_ID, IMPLICIT_CONV_NAME
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
 *     WHITE_IMPLICIT_CONV_INTEGER, WHITE_IMPLICIT_CONV_STRING
 *
 * [referrer table]
 *     white_implicit_conv_integer, white_implicit_conv_string
 *
 * [foreign property]
 *     whiteImplicitConvInteger, whiteImplicitConvString
 *
 * [referrer property]
 *     whiteImplicitConvIntegerList, whiteImplicitConvStringList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteImplicitConvNumeric {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteImplicitConvNumeric> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteImplicitConvNumericBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteImplicitConvNumeric ready(List<WhiteImplicitConvNumeric> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteImplicitConvNumericBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteImplicitConvNumericBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteImplicitConvInteger> _referrerWhiteImplicitConvIntegerList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteImplicitConvInteger> loadWhiteImplicitConvIntegerList(ConditionBeanSetupper<WhiteImplicitConvIntegerCB> setupper) {
        myBhv().loadWhiteImplicitConvIntegerList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteImplicitConvInteger>() {
            public void handle(List<WhiteImplicitConvInteger> referrerList) { _referrerWhiteImplicitConvIntegerList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteImplicitConvInteger>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteImplicitConvInteger> handler) {
                handler.handle(new LoaderOfWhiteImplicitConvInteger().ready(_referrerWhiteImplicitConvIntegerList, _selector));
            }
        };
    }

    protected List<WhiteImplicitConvString> _referrerWhiteImplicitConvStringList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteImplicitConvString> loadWhiteImplicitConvStringList(ConditionBeanSetupper<WhiteImplicitConvStringCB> setupper) {
        myBhv().loadWhiteImplicitConvStringList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteImplicitConvString>() {
            public void handle(List<WhiteImplicitConvString> referrerList) { _referrerWhiteImplicitConvStringList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteImplicitConvString>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteImplicitConvString> handler) {
                handler.handle(new LoaderOfWhiteImplicitConvString().ready(_referrerWhiteImplicitConvStringList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteImplicitConvInteger _foreignWhiteImplicitConvIntegerLoader;
    public LoaderOfWhiteImplicitConvInteger pulloutWhiteImplicitConvInteger() {
        if (_foreignWhiteImplicitConvIntegerLoader != null) { return _foreignWhiteImplicitConvIntegerLoader; }
        List<WhiteImplicitConvInteger> pulledList = myBhv().pulloutWhiteImplicitConvInteger(_selectedList);
        _foreignWhiteImplicitConvIntegerLoader = new LoaderOfWhiteImplicitConvInteger().ready(pulledList, _selector);
        return _foreignWhiteImplicitConvIntegerLoader;
    }

    protected LoaderOfWhiteImplicitConvString _foreignWhiteImplicitConvStringLoader;
    public LoaderOfWhiteImplicitConvString pulloutWhiteImplicitConvString() {
        if (_foreignWhiteImplicitConvStringLoader != null) { return _foreignWhiteImplicitConvStringLoader; }
        List<WhiteImplicitConvString> pulledList = myBhv().pulloutWhiteImplicitConvString(_selectedList);
        _foreignWhiteImplicitConvStringLoader = new LoaderOfWhiteImplicitConvString().ready(pulledList, _selector);
        return _foreignWhiteImplicitConvStringLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteImplicitConvNumeric> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
