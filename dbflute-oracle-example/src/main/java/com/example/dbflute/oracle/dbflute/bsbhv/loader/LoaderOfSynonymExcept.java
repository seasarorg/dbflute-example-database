package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The referrer loader of SYNONYM_EXCEPT as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     EXCEPT_ID
 *
 * [column]
 *     EXCEPT_ID, EXCEPT_NAME
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
 *     SYNONYM_REF_EXCEPT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     synonymRefExceptList
 * </pre>
 * @author oracleman
 */
public class LoaderOfSynonymExcept {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SynonymExcept> _selectedList;
    protected BehaviorSelector _selector;
    protected SynonymExceptBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSynonymExcept ready(List<SynonymExcept> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SynonymExceptBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SynonymExceptBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<SynonymRefExcept> _referrerSynonymRefExceptList;
    public NestedReferrerLoaderGateway<LoaderOfSynonymRefExcept> loadSynonymRefExceptList(ConditionBeanSetupper<SynonymRefExceptCB> setupper) {
        myBhv().loadSynonymRefExceptList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<SynonymRefExcept>() {
            public void handle(List<SynonymRefExcept> referrerList) { _referrerSynonymRefExceptList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfSynonymRefExcept>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfSynonymRefExcept> handler) {
                handler.handle(new LoaderOfSynonymRefExcept().ready(_referrerSynonymRefExceptList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SynonymExcept> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
