package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of vendor_large_data as TABLE. <br />
 * <pre>
 * [primary key]
 *     large_data_id
 *
 * [column]
 *     large_data_id, string_index, string_no_index, string_unique_index, intflg_index, numeric_integer_index, numeric_integer_no_index
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     vendor_large_data_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorLargeDataRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorLargeData {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorLargeData> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorLargeDataBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorLargeData ready(List<VendorLargeData> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorLargeDataBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorLargeDataBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<VendorLargeDataRef> _referrerVendorLargeDataRefList;
    public NestedReferrerLoaderGateway<LoaderOfVendorLargeDataRef> loadVendorLargeDataRefList(ConditionBeanSetupper<VendorLargeDataRefCB> setupper) {
        myBhv().loadVendorLargeDataRefList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<VendorLargeDataRef>() {
            public void handle(List<VendorLargeDataRef> referrerList) { _referrerVendorLargeDataRefList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfVendorLargeDataRef>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfVendorLargeDataRef> handler) {
                handler.handle(new LoaderOfVendorLargeDataRef().ready(_referrerVendorLargeDataRefList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorLargeData> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
