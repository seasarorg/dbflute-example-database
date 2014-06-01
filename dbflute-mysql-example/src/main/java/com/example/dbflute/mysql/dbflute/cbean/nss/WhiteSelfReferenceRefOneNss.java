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
import com.example.dbflute.mysql.dbflute.cbean.cq.WhiteSelfReferenceRefOneCQ;

/**
 * The nest select set-upper of white_self_reference_ref_one.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSelfReferenceRefOneNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSelfReferenceRefOneCQ _query;
    public WhiteSelfReferenceRefOneNss(WhiteSelfReferenceRefOneCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReference'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteSelfReferenceNss withWhiteSelfReference() {
        _query.doNss(new WhiteSelfReferenceRefOneCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteSelfReference(); }});
        return new WhiteSelfReferenceNss(_query.queryWhiteSelfReference());
    }
    /**
     * With nested relation columns to select clause. <br />
     * white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReferenceAsDirectParent'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteSelfReferenceNss withWhiteSelfReferenceAsDirectParent() {
        _query.doNss(new WhiteSelfReferenceRefOneCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteSelfReferenceAsDirectParent(); }});
        return new WhiteSelfReferenceNss(_query.queryWhiteSelfReferenceAsDirectParent());
    }
}
