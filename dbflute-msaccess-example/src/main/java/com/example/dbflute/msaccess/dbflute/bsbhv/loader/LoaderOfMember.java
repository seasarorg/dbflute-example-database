package com.example.dbflute.msaccess.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.msaccess.dbflute.exbhv.*;
import com.example.dbflute.msaccess.dbflute.exentity.*;
import com.example.dbflute.msaccess.dbflute.cbean.*;

/**
 * The referrer loader of MEMBER as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, MEMBER_FORMALIZED_DATETIME, MEMBER_BIRTHDAY, REGISTER_DATETIME, REGISTER_USER, REGISTER_PROCESS, UPDATE_DATETIME, UPDATE_USER, UPDATE_PROCESS, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER_ADDRESS(AsValid), MEMBER_STATUS, MEMBER_WITHDRAWAL(AsOne), MEMBER_SECURITY(AsOne)
 *
 * [referrer table]
 *     MEMBER_ADDRESS, PURCHASE, MEMBER_LOGIN, MEMBER_WITHDRAWAL, MEMBER_SECURITY
 *
 * [foreign property]
 *     memberAddressAsValid, memberStatus, memberWithdrawalAsOne, memberSecurityAsOne
 *
 * [referrer property]
 *     memberAddressList, purchaseList, memberLoginList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Member> _selectedList;
    protected BehaviorSelector _selector;
    protected MemberBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMember ready(List<Member> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MemberBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MemberBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MemberAddress> _referrerMemberAddressList;
    public NestedReferrerLoaderGateway<LoaderOfMemberAddress> loadMemberAddressList(ConditionBeanSetupper<MemberAddressCB> setupper) {
        myBhv().loadMemberAddressList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<MemberAddress>() {
            public void handle(List<MemberAddress> referrerList) { _referrerMemberAddressList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfMemberAddress>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfMemberAddress> handler) {
                handler.handle(new LoaderOfMemberAddress().ready(_referrerMemberAddressList, _selector));
            }
        };
    }

    protected List<Purchase> _referrerPurchaseList;
    public NestedReferrerLoaderGateway<LoaderOfPurchase> loadPurchaseList(ConditionBeanSetupper<PurchaseCB> setupper) {
        myBhv().loadPurchaseList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<Purchase>() {
            public void handle(List<Purchase> referrerList) { _referrerPurchaseList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfPurchase>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfPurchase> handler) {
                handler.handle(new LoaderOfPurchase().ready(_referrerPurchaseList, _selector));
            }
        };
    }

    protected List<MemberLogin> _referrerMemberLoginList;
    public NestedReferrerLoaderGateway<LoaderOfMemberLogin> loadMemberLoginList(ConditionBeanSetupper<MemberLoginCB> setupper) {
        myBhv().loadMemberLoginList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<MemberLogin>() {
            public void handle(List<MemberLogin> referrerList) { _referrerMemberLoginList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfMemberLogin>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfMemberLogin> handler) {
                handler.handle(new LoaderOfMemberLogin().ready(_referrerMemberLoginList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMemberAddress _foreignMemberAddressAsValidLoader;
    public LoaderOfMemberAddress pulloutMemberAddressAsValid() {
        if (_foreignMemberAddressAsValidLoader != null) { return _foreignMemberAddressAsValidLoader; }
        List<MemberAddress> pulledList = myBhv().pulloutMemberAddressAsValid(_selectedList);
        _foreignMemberAddressAsValidLoader = new LoaderOfMemberAddress().ready(pulledList, _selector);
        return _foreignMemberAddressAsValidLoader;
    }

    protected LoaderOfMemberStatus _foreignMemberStatusLoader;
    public LoaderOfMemberStatus pulloutMemberStatus() {
        if (_foreignMemberStatusLoader != null) { return _foreignMemberStatusLoader; }
        List<MemberStatus> pulledList = myBhv().pulloutMemberStatus(_selectedList);
        _foreignMemberStatusLoader = new LoaderOfMemberStatus().ready(pulledList, _selector);
        return _foreignMemberStatusLoader;
    }

    protected LoaderOfMemberWithdrawal _foreignMemberWithdrawalAsOneLoader;
    public LoaderOfMemberWithdrawal pulloutMemberWithdrawalAsOne() {
        if (_foreignMemberWithdrawalAsOneLoader != null) { return _foreignMemberWithdrawalAsOneLoader; }
        List<MemberWithdrawal> pulledList = myBhv().pulloutMemberWithdrawalAsOne(_selectedList);
        _foreignMemberWithdrawalAsOneLoader = new LoaderOfMemberWithdrawal().ready(pulledList, _selector);
        return _foreignMemberWithdrawalAsOneLoader;
    }

    protected LoaderOfMemberSecurity _foreignMemberSecurityAsOneLoader;
    public LoaderOfMemberSecurity pulloutMemberSecurityAsOne() {
        if (_foreignMemberSecurityAsOneLoader != null) { return _foreignMemberSecurityAsOneLoader; }
        List<MemberSecurity> pulledList = myBhv().pulloutMemberSecurityAsOne(_selectedList);
        _foreignMemberSecurityAsOneLoader = new LoaderOfMemberSecurity().ready(pulledList, _selector);
        return _foreignMemberSecurityAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Member> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
