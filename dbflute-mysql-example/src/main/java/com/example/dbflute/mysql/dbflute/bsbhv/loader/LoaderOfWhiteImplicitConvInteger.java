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
 * The referrer loader of WHITE_IMPLICIT_CONV_INTEGER as TABLE. <br />
 * <pre>
 * [primary key]
 *     IMPLICIT_CONV_INTEGER_ID
 *
 * [column]
 *     IMPLICIT_CONV_INTEGER_ID, IMPLICIT_CONV_NUMERIC_ID, IMPLICIT_CONV_STRING_ID, IMPLICIT_CONV_NAME
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
 *     WHITE_IMPLICIT_CONV_NUMERIC, WHITE_IMPLICIT_CONV_STRING
 *
 * [referrer table]
 *     white_implicit_conv_numeric, white_implicit_conv_string
 *
 * [foreign property]
 *     whiteImplicitConvNumeric, whiteImplicitConvString
 *
 * [referrer property]
 *     whiteImplicitConvNumericList, whiteImplicitConvStringList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteImplicitConvInteger {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteImplicitConvInteger> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteImplicitConvIntegerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteImplicitConvInteger ready(List<WhiteImplicitConvInteger> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteImplicitConvIntegerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteImplicitConvIntegerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteImplicitConvNumeric> _referrerWhiteImplicitConvNumericList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteImplicitConvNumeric> loadWhiteImplicitConvNumericList(ConditionBeanSetupper<WhiteImplicitConvNumericCB> setupper) {
        myBhv().loadWhiteImplicitConvNumericList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteImplicitConvNumeric>() {
            public void handle(List<WhiteImplicitConvNumeric> referrerList) { _referrerWhiteImplicitConvNumericList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteImplicitConvNumeric>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteImplicitConvNumeric> handler) {
                handler.handle(new LoaderOfWhiteImplicitConvNumeric().ready(_referrerWhiteImplicitConvNumericList, _selector));
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
    protected LoaderOfWhiteImplicitConvNumeric _foreignWhiteImplicitConvNumericLoader;
    public LoaderOfWhiteImplicitConvNumeric pulloutWhiteImplicitConvNumeric() {
        if (_foreignWhiteImplicitConvNumericLoader != null) { return _foreignWhiteImplicitConvNumericLoader; }
        List<WhiteImplicitConvNumeric> pulledList = myBhv().pulloutWhiteImplicitConvNumeric(_selectedList);
        _foreignWhiteImplicitConvNumericLoader = new LoaderOfWhiteImplicitConvNumeric().ready(pulledList, _selector);
        return _foreignWhiteImplicitConvNumericLoader;
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
    public List<WhiteImplicitConvInteger> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
