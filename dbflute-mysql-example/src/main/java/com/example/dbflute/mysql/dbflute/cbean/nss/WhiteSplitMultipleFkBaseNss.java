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
import com.example.dbflute.mysql.dbflute.cbean.cq.WhiteSplitMultipleFkBaseCQ;

/**
 * The nest select set-upper of white_split_multiple_fk_base.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSplitMultipleFkBaseNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSplitMultipleFkBaseCQ _query;
    public WhiteSplitMultipleFkBaseNss(WhiteSplitMultipleFkBaseCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * white_split_multiple_fk_next by my NEXT_ID, named 'whiteSplitMultipleFkNext'.
     */
    public void withWhiteSplitMultipleFkNext() {
        _query.doNss(new WhiteSplitMultipleFkBaseCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteSplitMultipleFkNext(); }});
    }
    /**
     * With nested relation columns to select clause. <br />
     * white_split_multiple_fk_ref by my FIRST_ID, named 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'.
     */
    public void withWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        _query.doNss(new WhiteSplitMultipleFkBaseCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteSplitMultipleFkRefAsSplitMultipleFkTest(); }});
    }
}
