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
import com.example.dbflute.mysql.dbflute.cbean.cq.WhiteSuppressJoinSqOneCQ;

/**
 * The nest select set-upper of white_suppress_join_sq_one.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSuppressJoinSqOneNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSuppressJoinSqOneCQ _query;
    public WhiteSuppressJoinSqOneNss(WhiteSuppressJoinSqOneCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * white_suppress_join_sq by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteSuppressJoinSqNss withWhiteSuppressJoinSq() {
        _query.doNss(new WhiteSuppressJoinSqOneCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteSuppressJoinSq(); }});
        return new WhiteSuppressJoinSqNss(_query.queryWhiteSuppressJoinSq());
    }

}
