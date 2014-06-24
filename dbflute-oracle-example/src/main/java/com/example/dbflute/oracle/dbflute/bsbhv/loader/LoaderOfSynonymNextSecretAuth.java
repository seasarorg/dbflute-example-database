package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The referrer loader of (隣の秘密で権限あり)SYNONYM_NEXT_SECRET_AUTH as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     SECRET_AUTH_CODE
 *
 * [column]
 *     SECRET_AUTH_CODE, SECRET_AUTH_NAME
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
public class LoaderOfSynonymNextSecretAuth {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SynonymNextSecretAuth> _selectedList;
    protected BehaviorSelector _selector;
    protected SynonymNextSecretAuthBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSynonymNextSecretAuth ready(List<SynonymNextSecretAuth> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SynonymNextSecretAuthBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SynonymNextSecretAuthBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SynonymNextSecretAuth> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
