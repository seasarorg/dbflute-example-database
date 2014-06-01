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
package com.example.dbflute.mysql.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.mysql.dbflute.cbean.cq.WhiteImplicitConvStringCQ;

/**
 * The nest select set-upper of white_implicit_conv_string.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteImplicitConvStringNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteImplicitConvStringCQ _query;
    public WhiteImplicitConvStringNss(WhiteImplicitConvStringCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteImplicitConvIntegerNss withWhiteImplicitConvInteger() {
        _query.doNss(new WhiteImplicitConvStringCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteImplicitConvInteger(); }});
        return new WhiteImplicitConvIntegerNss(_query.queryWhiteImplicitConvInteger());
    }
    /**
     * With nested relation columns to select clause. <br />
     * white_implicit_conv_numeric by my IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvNumeric'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteImplicitConvNumericNss withWhiteImplicitConvNumeric() {
        _query.doNss(new WhiteImplicitConvStringCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteImplicitConvNumeric(); }});
        return new WhiteImplicitConvNumericNss(_query.queryWhiteImplicitConvNumeric());
    }
}
