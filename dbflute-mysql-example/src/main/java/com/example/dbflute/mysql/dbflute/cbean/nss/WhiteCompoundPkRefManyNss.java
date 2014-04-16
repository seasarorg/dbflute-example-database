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
import com.example.dbflute.mysql.dbflute.cbean.cq.WhiteCompoundPkRefManyCQ;

/**
 * The nest select set-upper of white_compound_pk_ref_many.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkRefManyNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteCompoundPkRefManyCQ _query;
    public WhiteCompoundPkRefManyNss(WhiteCompoundPkRefManyCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * white_compound_pk by my REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkToPK'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteCompoundPkNss withWhiteCompoundPkToPK() {
        _query.doNss(new WhiteCompoundPkRefManyCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteCompoundPkToPK(); }});
        return new WhiteCompoundPkNss(_query.queryWhiteCompoundPkToPK());
    }

}
