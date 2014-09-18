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
import com.example.dbflute.mysql.dbflute.cbean.cq.WhiteVariantRelationMasterFooCQ;

/**
 * The nest select set-upper of white_variant_relation_master_foo.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteVariantRelationMasterFooNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteVariantRelationMasterFooCQ _query;
    public WhiteVariantRelationMasterFooNss(WhiteVariantRelationMasterFooCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * white_variant_relation_referrer by my MASTER_FOO_ID, named 'whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteVariantRelationReferrerNss withWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne() {
        _query.doNss(new WhiteVariantRelationMasterFooCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne(); }});
        return new WhiteVariantRelationReferrerNss(_query.queryWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne());
    }
    /**
     * With nested relation columns to select clause. <br />
     * white_variant_relation_local_pk_referrer by REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationLocalPkReferrerAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteVariantRelationLocalPkReferrerNss withWhiteVariantRelationLocalPkReferrerAsOne() {
        _query.doNss(new WhiteVariantRelationMasterFooCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteVariantRelationLocalPkReferrerAsOne(); }});
        return new WhiteVariantRelationLocalPkReferrerNss(_query.queryWhiteVariantRelationLocalPkReferrerAsOne());
    }
}
