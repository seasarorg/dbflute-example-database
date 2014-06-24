package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The referrer loader of SYNONYM_NEXT_LINK_SECRET as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     SECRET_CODE
 *
 * [column]
 *     SECRET_CODE, SECRET_NAME, SECRET_AUTH_CODE
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
 * @author oracleman
 */
public class LoaderOfSynonymNextLinkSecret {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SynonymNextLinkSecret> _selectedList;
    protected BehaviorSelector _selector;
    protected SynonymNextLinkSecretBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSynonymNextLinkSecret ready(List<SynonymNextLinkSecret> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SynonymNextLinkSecretBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SynonymNextLinkSecretBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SynonymNextLinkSecret> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
