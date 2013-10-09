package com.example.dbflute.postgresql.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.postgresql.dbflute.cbean.cq.VendorLargeDataRefCQ;

/**
 * The nest select set-upper of vendor_large_data_ref.
 * @author DBFlute(AutoGenerator)
 */
public class VendorLargeDataRefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorLargeDataRefCQ _query;
    public VendorLargeDataRefNss(VendorLargeDataRefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * vendor_large_data by my large_data_id, named 'vendorLargeData'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public VendorLargeDataNss withVendorLargeData() {
        _query.doNss(new VendorLargeDataRefCQ.NssCall() { public ConditionQuery qf() { return _query.queryVendorLargeData(); }});
        return new VendorLargeDataNss(_query.queryVendorLargeData());
    }
    /**
     * With nested relation columns to select clause. <br />
     * vendor_large_data_ref by my self_parent_id, named 'vendorLargeDataRefSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public VendorLargeDataRefNss withVendorLargeDataRefSelf() {
        _query.doNss(new VendorLargeDataRefCQ.NssCall() { public ConditionQuery qf() { return _query.queryVendorLargeDataRefSelf(); }});
        return new VendorLargeDataRefNss(_query.queryVendorLargeDataRefSelf());
    }

}
