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
import com.example.dbflute.mysql.dbflute.cbean.cq.PurchaseCQ;

/**
 * The nest select set-upper of purchase.
 * @author DBFlute(AutoGenerator)
 */
public class PurchaseNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PurchaseCQ _query;
    public PurchaseNss(PurchaseCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * (会員)member by my MEMBER_ID, named 'member'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberNss withMember() {
        _query.doNss(new PurchaseCQ.NssCall() { public ConditionQuery qf() { return _query.queryMember(); }});
        MemberNss moreNss = new MemberNss(_query.queryMember());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (商品)product by my PRODUCT_ID, named 'product'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public ProductNss withProduct() {
        _query.doNss(new PurchaseCQ.NssCall() { public ConditionQuery qf() { return _query.queryProduct(); }});
        ProductNss moreNss = new ProductNss(_query.queryProduct());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (VIEW)summary_product by my PRODUCT_ID, named 'summaryProduct'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public SummaryProductNss withSummaryProduct() {
        _query.doNss(new PurchaseCQ.NssCall() { public ConditionQuery qf() { return _query.querySummaryProduct(); }});
        SummaryProductNss moreNss = new SummaryProductNss(_query.querySummaryProduct());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (VIEW)summary_withdrawal by my MEMBER_ID, named 'summaryWithdrawal'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public SummaryWithdrawalNss withSummaryWithdrawal() {
        _query.doNss(new PurchaseCQ.NssCall() { public ConditionQuery qf() { return _query.querySummaryWithdrawal(); }});
        SummaryWithdrawalNss moreNss = new SummaryWithdrawalNss(_query.querySummaryWithdrawal());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (VIEW)white_no_pk_relation by my PRODUCT_ID, named 'whiteNoPkRelation'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteNoPkRelationNss withWhiteNoPkRelation() {
        _query.doNss(new PurchaseCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteNoPkRelation(); }});
        WhiteNoPkRelationNss moreNss = new WhiteNoPkRelationNss(_query.queryWhiteNoPkRelation());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (購入)purchase by my PURCHASE_ID, named 'purchaseSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PurchaseNss withPurchaseSelf() {
        _query.doNss(new PurchaseCQ.NssCall() { public ConditionQuery qf() { return _query.queryPurchaseSelf(); }});
        PurchaseNss moreNss = new PurchaseNss(_query.queryPurchaseSelf());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsSkipRelation'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberAddressNss withMemberAddressAsSkipRelation(final java.util.Date targetDate) {
        _query.doNss(new PurchaseCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberAddressAsSkipRelation(targetDate); }});
        MemberAddressNss moreNss = new MemberAddressNss(_query.queryMemberAddressAsSkipRelation(targetDate));
        return moreNss;
    }

    /**
     * With nested relation columns to select clause. <br />
     * white_purchase_referrer by PURCHASE_REFERRER_ID, named 'whitePurchaseReferrerAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhitePurchaseReferrerNss withWhitePurchaseReferrerAsOne() {
        _query.doNss(new PurchaseCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhitePurchaseReferrerAsOne(); }});
        WhitePurchaseReferrerNss moreNss = new WhitePurchaseReferrerNss(_query.queryWhitePurchaseReferrerAsOne());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (購入)purchase by PURCHASE_ID, named 'purchaseSelfAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PurchaseNss withPurchaseSelfAsOne() {
        _query.doNss(new PurchaseCQ.NssCall() { public ConditionQuery qf() { return _query.queryPurchaseSelfAsOne(); }});
        PurchaseNss moreNss = new PurchaseNss(_query.queryPurchaseSelfAsOne());
        return moreNss;
    }
}
