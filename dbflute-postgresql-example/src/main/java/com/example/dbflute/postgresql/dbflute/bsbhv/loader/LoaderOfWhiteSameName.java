package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of white_same_name as TABLE. <br />
 * <pre>
 * [primary key]
 *     same_name_id
 *
 * [column]
 *     same_name_id, same_name_name, same_name_integer, next_schema_product_id
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
 *     NEXT_SCHEMA_PRODUCT
 *
 * [referrer table]
 *     white_same_name_ref
 *
 * [foreign property]
 *     nextSchemaProduct
 *
 * [referrer property]
 *     whiteSameNameRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSameName {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSameName> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSameNameBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSameName ready(List<WhiteSameName> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSameNameBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSameNameBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteSameNameRef> _referrerWhiteSameNameRefList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteSameNameRef> loadWhiteSameNameRefList(ConditionBeanSetupper<WhiteSameNameRefCB> setupper) {
        myBhv().loadWhiteSameNameRefList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteSameNameRef>() {
            public void handle(List<WhiteSameNameRef> referrerList) { _referrerWhiteSameNameRefList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteSameNameRef>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteSameNameRef> handler) {
                handler.handle(new LoaderOfWhiteSameNameRef().ready(_referrerWhiteSameNameRefList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfNextSchemaProduct _foreignNextSchemaProductLoader;
    public LoaderOfNextSchemaProduct pulloutNextSchemaProduct() {
        if (_foreignNextSchemaProductLoader != null) { return _foreignNextSchemaProductLoader; }
        List<NextSchemaProduct> pulledList = myBhv().pulloutNextSchemaProduct(_selectedList);
        _foreignNextSchemaProductLoader = new LoaderOfNextSchemaProduct().ready(pulledList, _selector);
        return _foreignNextSchemaProductLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSameName> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
