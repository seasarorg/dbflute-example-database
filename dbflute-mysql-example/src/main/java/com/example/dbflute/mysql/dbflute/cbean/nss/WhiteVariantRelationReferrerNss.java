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
import com.example.dbflute.mysql.dbflute.cbean.cq.WhiteVariantRelationReferrerCQ;

/**
 * The nest select set-upper of white_variant_relation_referrer.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteVariantRelationReferrerNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteVariantRelationReferrerCQ _query;
    public WhiteVariantRelationReferrerNss(WhiteVariantRelationReferrerCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * white_variant_relation_master_foo by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterFooAsVariant'.
     */
    public void withWhiteVariantRelationMasterFooAsVariant() {
        _query.doNss(new WhiteVariantRelationReferrerCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteVariantRelationMasterFooAsVariant(); }});
    }
    /**
     * With nested relation columns to select clause. <br />
     * white_variant_relation_master_bar by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterBarAsVariant'.
     */
    public void withWhiteVariantRelationMasterBarAsVariant() {
        _query.doNss(new WhiteVariantRelationReferrerCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteVariantRelationMasterBarAsVariant(); }});
    }
    /**
     * With nested relation columns to select clause. <br />
     * white_variant_relation_master_qux by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterQuxAsVariantByQue'.
     */
    public void withWhiteVariantRelationMasterQuxAsVariantByQue() {
        _query.doNss(new WhiteVariantRelationReferrerCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteVariantRelationMasterQuxAsVariantByQue(); }});
    }
    /**
     * With nested relation columns to select clause. <br />
     * white_variant_relation_master_corge by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterCorgeAsVariantByQuxType'.
     * @param quxType The bind parameter of fixed condition for quxType. (NotNull)
     */
    public void withWhiteVariantRelationMasterCorgeAsVariantByQuxType(final com.example.dbflute.mysql.dbflute.allcommon.CDef.VariantRelationQuxType quxType) {
        _query.doNss(new WhiteVariantRelationReferrerCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteVariantRelationMasterCorgeAsVariantByQuxType(quxType); }});
    }
}
