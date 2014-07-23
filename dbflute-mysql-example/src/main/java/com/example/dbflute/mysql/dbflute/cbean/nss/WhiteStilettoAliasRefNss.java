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
import com.example.dbflute.mysql.dbflute.cbean.cq.WhiteStilettoAliasRefCQ;

/**
 * The nest select set-upper of white_stiletto_alias_ref.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteStilettoAliasRefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteStilettoAliasRefCQ _query;
    public WhiteStilettoAliasRefNss(WhiteStilettoAliasRefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * white_stiletto_alias by my STILETTO_ALIAS_ID, named 'whiteStilettoAlias'.
     */
    public void withWhiteStilettoAlias() {
        _query.doNss(new WhiteStilettoAliasRefCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteStilettoAlias(); }});
    }
}
