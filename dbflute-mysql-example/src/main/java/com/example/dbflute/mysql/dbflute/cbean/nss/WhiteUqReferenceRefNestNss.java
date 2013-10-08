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
import com.example.dbflute.mysql.dbflute.cbean.cq.WhiteUqReferenceRefNestCQ;

/**
 * The nest select set-upper of white_uq_reference_ref_nest.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteUqReferenceRefNestNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqReferenceRefNestCQ _query;
    public WhiteUqReferenceRefNestNss(WhiteUqReferenceRefNestCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * white_uq_reference_ref by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqReferenceRef'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteUqReferenceRefNss withWhiteUqReferenceRef() {
        _query.doNss(new WhiteUqReferenceRefNestCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteUqReferenceRef(); }});
        return new WhiteUqReferenceRefNss(_query.queryWhiteUqReferenceRef());
    }

}
