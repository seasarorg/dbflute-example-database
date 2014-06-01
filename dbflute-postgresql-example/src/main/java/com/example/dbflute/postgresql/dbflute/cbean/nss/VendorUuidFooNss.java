package com.example.dbflute.postgresql.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.postgresql.dbflute.cbean.cq.VendorUuidFooCQ;

/**
 * The nest select set-upper of vendor_uuid_foo.
 * @author DBFlute(AutoGenerator)
 */
public class VendorUuidFooNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorUuidFooCQ _query;
    public VendorUuidFooNss(VendorUuidFooCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * vendor_uuid_bar by my bar_id, named 'vendorUuidBar'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public VendorUuidBarNss withVendorUuidBar() {
        _query.doNss(new VendorUuidFooCQ.NssCall() { public ConditionQuery qf() { return _query.queryVendorUuidBar(); }});
        return new VendorUuidBarNss(_query.queryVendorUuidBar());
    }
}
