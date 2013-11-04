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
import com.example.dbflute.mysql.dbflute.cbean.cq.WhiteUqFkRefCQ;

/**
 * The nest select set-upper of white_uq_fk_ref.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteUqFkRefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkRefCQ _query;
    public WhiteUqFkRefNss(WhiteUqFkRefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * white_uq_fk by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteUqFkNss withWhiteUqFkByFkToPkId() {
        _query.doNss(new WhiteUqFkRefCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteUqFkByFkToPkId(); }});
        return new WhiteUqFkNss(_query.queryWhiteUqFkByFkToPkId());
    }
    /**
     * With nested relation columns to select clause. <br />
     * white_uq_fk by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteUqFkNss withWhiteUqFkByFkToUqCode() {
        _query.doNss(new WhiteUqFkRefCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteUqFkByFkToUqCode(); }});
        return new WhiteUqFkNss(_query.queryWhiteUqFkByFkToUqCode());
    }

}
