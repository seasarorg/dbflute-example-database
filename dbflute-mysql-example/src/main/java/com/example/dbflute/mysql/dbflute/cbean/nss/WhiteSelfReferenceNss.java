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
import com.example.dbflute.mysql.dbflute.cbean.cq.WhiteSelfReferenceCQ;

/**
 * The nest select set-upper of white_self_reference.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSelfReferenceNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSelfReferenceCQ _query;
    public WhiteSelfReferenceNss(WhiteSelfReferenceCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * white_self_reference by my PARENT_ID, named 'whiteSelfReferenceSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteSelfReferenceNss withWhiteSelfReferenceSelf() {
        _query.doNss(new WhiteSelfReferenceCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteSelfReferenceSelf(); }});
        return new WhiteSelfReferenceNss(_query.queryWhiteSelfReferenceSelf());
    }
    /**
     * With nested relation columns to select clause. <br />
     * white_self_reference_ref_one by my PARENT_ID, named 'whiteSelfReferenceRefOneByParentId'. <br />
     * Implicit Reverse FK to FK_WHITE_SELF_REFERENCE_REF_ONE_DIRECT_PARENT
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteSelfReferenceRefOneNss withWhiteSelfReferenceRefOneByParentId() {
        _query.doNss(new WhiteSelfReferenceCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteSelfReferenceRefOneByParentId(); }});
        return new WhiteSelfReferenceRefOneNss(_query.queryWhiteSelfReferenceRefOneByParentId());
    }
    /**
     * With nested relation columns to select clause. <br />
     * white_self_reference_ref_one by SELF_REFERENCE_ID, named 'whiteSelfReferenceRefOneAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteSelfReferenceRefOneNss withWhiteSelfReferenceRefOneAsOne() {
        _query.doNss(new WhiteSelfReferenceCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteSelfReferenceRefOneAsOne(); }});
        return new WhiteSelfReferenceRefOneNss(_query.queryWhiteSelfReferenceRefOneAsOne());
    }
}
