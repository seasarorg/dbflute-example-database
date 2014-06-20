package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of white_xls_man as TABLE. <br />
 * <pre>
 * [primary key]
 *     xls_man_id
 *
 * [column]
 *     xls_man_id, string_converted, timestamp_zero_default_millis, timestamp_zero_prefix_millis, timestamp_zero_suffix_millis
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteXlsMan {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteXlsMan> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteXlsManBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteXlsMan ready(List<WhiteXlsMan> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteXlsManBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteXlsManBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteXlsMan> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
