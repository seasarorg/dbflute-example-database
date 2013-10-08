package com.example.dbflute.oracle.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.oracle.dbflute.cbean.cq.VendorLargeName90123456RefCQ;

/**
 * The nest select set-upper of VENDOR_LARGE_NAME_90123456_REF.
 * @author oracleman
 */
public class VendorLargeName90123456RefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorLargeName90123456RefCQ _query;
    public VendorLargeName90123456RefNss(VendorLargeName90123456RefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * VENDOR_LARGE_NAME_901234567890 by my VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName901234567890'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public VendorLargeName901234567890Nss withVendorLargeName901234567890() {
        _query.doNss(new VendorLargeName90123456RefCQ.NssCall() { public ConditionQuery qf() { return _query.queryVendorLargeName901234567890(); }});
        return new VendorLargeName901234567890Nss(_query.queryVendorLargeName901234567890());
    }

}
