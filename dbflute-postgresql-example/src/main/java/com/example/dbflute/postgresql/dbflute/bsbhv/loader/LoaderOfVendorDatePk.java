package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of vendor_date_pk as TABLE. <br />
 * <pre>
 * [primary key]
 *     foo_date
 *
 * [column]
 *     foo_date, foo_name
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
 *     vendor_date_fk
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorDateFkList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorDatePk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorDatePk> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorDatePkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorDatePk ready(List<VendorDatePk> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorDatePkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorDatePkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<VendorDateFk> _referrerVendorDateFkList;
    public NestedReferrerLoaderGateway<LoaderOfVendorDateFk> loadVendorDateFkList(ConditionBeanSetupper<VendorDateFkCB> setupper) {
        myBhv().loadVendorDateFkList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<VendorDateFk>() {
            public void handle(List<VendorDateFk> referrerList) { _referrerVendorDateFkList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfVendorDateFk>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfVendorDateFk> handler) {
                handler.handle(new LoaderOfVendorDateFk().ready(_referrerVendorDateFkList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorDatePk> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
