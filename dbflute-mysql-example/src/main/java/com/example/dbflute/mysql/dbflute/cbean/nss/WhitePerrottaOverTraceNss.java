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
import com.example.dbflute.mysql.dbflute.cbean.cq.WhitePerrottaOverTraceCQ;

/**
 * The nest select set-upper of white_perrotta_over_trace.
 * @author DBFlute(AutoGenerator)
 */
public class WhitePerrottaOverTraceNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhitePerrottaOverTraceCQ _query;
    public WhitePerrottaOverTraceNss(WhitePerrottaOverTraceCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * white_perrotta_over_product by my NEXT_PRODUCT_ID, named 'whitePerrottaOverProductByNextProductId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhitePerrottaOverProductNss withWhitePerrottaOverProductByNextProductId() {
        _query.doNss(new WhitePerrottaOverTraceCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhitePerrottaOverProductByNextProductId(); }});
        return new WhitePerrottaOverProductNss(_query.queryWhitePerrottaOverProductByNextProductId());
    }
    /**
     * With nested relation columns to select clause. <br />
     * white_perrotta_over_product by my PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverProductByPreviousProductId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhitePerrottaOverProductNss withWhitePerrottaOverProductByPreviousProductId() {
        _query.doNss(new WhitePerrottaOverTraceCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhitePerrottaOverProductByPreviousProductId(); }});
        return new WhitePerrottaOverProductNss(_query.queryWhitePerrottaOverProductByPreviousProductId());
    }
}
