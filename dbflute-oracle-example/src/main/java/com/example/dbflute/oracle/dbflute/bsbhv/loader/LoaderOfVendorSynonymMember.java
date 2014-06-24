package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The referrer loader of (会員)VENDOR_SYNONYM_MEMBER as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, REGISTER_DATETIME, REGISTER_USER, REGISTER_PROCESS, UPDATE_DATETIME, UPDATE_USER, UPDATE_PROCESS, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER_STATUS, SYNONYM_MEMBER_WITHDRAWAL(AsOne)
 *
 * [referrer table]
 *     SYNONYM_MEMBER_LOGIN, SYNONYM_MEMBER_WITHDRAWAL
 *
 * [foreign property]
 *     memberStatus, synonymMemberWithdrawalAsOne
 *
 * [referrer property]
 *     synonymMemberLoginList
 * </pre>
 * @author oracleman
 */
public class LoaderOfVendorSynonymMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorSynonymMember> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorSynonymMemberBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorSynonymMember ready(List<VendorSynonymMember> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorSynonymMemberBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorSynonymMemberBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<SynonymMemberLogin> _referrerSynonymMemberLoginList;
    public NestedReferrerLoaderGateway<LoaderOfSynonymMemberLogin> loadSynonymMemberLoginList(ConditionBeanSetupper<SynonymMemberLoginCB> setupper) {
        myBhv().loadSynonymMemberLoginList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<SynonymMemberLogin>() {
            public void handle(List<SynonymMemberLogin> referrerList) { _referrerSynonymMemberLoginList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfSynonymMemberLogin>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfSynonymMemberLogin> handler) {
                handler.handle(new LoaderOfSynonymMemberLogin().ready(_referrerSynonymMemberLoginList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMemberStatus _foreignMemberStatusLoader;
    public LoaderOfMemberStatus pulloutMemberStatus() {
        if (_foreignMemberStatusLoader != null) { return _foreignMemberStatusLoader; }
        List<MemberStatus> pulledList = myBhv().pulloutMemberStatus(_selectedList);
        _foreignMemberStatusLoader = new LoaderOfMemberStatus().ready(pulledList, _selector);
        return _foreignMemberStatusLoader;
    }

    protected LoaderOfSynonymMemberWithdrawal _foreignSynonymMemberWithdrawalAsOneLoader;
    public LoaderOfSynonymMemberWithdrawal pulloutSynonymMemberWithdrawalAsOne() {
        if (_foreignSynonymMemberWithdrawalAsOneLoader != null) { return _foreignSynonymMemberWithdrawalAsOneLoader; }
        List<SynonymMemberWithdrawal> pulledList = myBhv().pulloutSynonymMemberWithdrawalAsOne(_selectedList);
        _foreignSynonymMemberWithdrawalAsOneLoader = new LoaderOfSynonymMemberWithdrawal().ready(pulledList, _selector);
        return _foreignSynonymMemberWithdrawalAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorSynonymMember> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
