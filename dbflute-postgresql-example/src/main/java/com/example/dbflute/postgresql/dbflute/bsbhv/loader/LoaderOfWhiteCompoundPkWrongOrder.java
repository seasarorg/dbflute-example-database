package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of white_compound_pk_wrong_order as TABLE. <br />
 * <pre>
 * [primary key]
 *     first_id, third_id, second_id
 *
 * [column]
 *     first_id, second_id, third_id, wrong_name
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
public class LoaderOfWhiteCompoundPkWrongOrder {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteCompoundPkWrongOrder> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteCompoundPkWrongOrderBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteCompoundPkWrongOrder ready(List<WhiteCompoundPkWrongOrder> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteCompoundPkWrongOrderBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteCompoundPkWrongOrderBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteCompoundPkWrongOrder> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
