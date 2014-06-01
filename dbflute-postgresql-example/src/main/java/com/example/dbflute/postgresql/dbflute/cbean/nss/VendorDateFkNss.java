package com.example.dbflute.postgresql.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.postgresql.dbflute.cbean.cq.VendorDateFkCQ;

/**
 * The nest select set-upper of vendor_date_fk.
 * @author DBFlute(AutoGenerator)
 */
public class VendorDateFkNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorDateFkCQ _query;
    public VendorDateFkNss(VendorDateFkCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * vendor_date_pk by my bar_date, named 'vendorDatePk'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public VendorDatePkNss withVendorDatePk() {
        _query.doNss(new VendorDateFkCQ.NssCall() { public ConditionQuery qf() { return _query.queryVendorDatePk(); }});
        return new VendorDatePkNss(_query.queryVendorDatePk());
    }
}
