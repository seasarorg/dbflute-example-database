package com.example.dbflute.sqlserver.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.sqlserver.dbflute.exbhv.*;
import com.example.dbflute.sqlserver.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_DELIMITER as TABLE. <br />
 * <pre>
 * [primary key]
 *     DELIMITER_ID
 *
 * [column]
 *     DELIMITER_ID, NUMBER_NULLABLE, STRING_CONVERTED, STRING_NON_CONVERTED, DATE_DEFAULT
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DELIMITER_ID
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
public class LoaderOfWhiteDelimiter {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteDelimiter> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteDelimiterBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteDelimiter ready(List<WhiteDelimiter> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteDelimiterBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteDelimiterBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteDelimiter> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
