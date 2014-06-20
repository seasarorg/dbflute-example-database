/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The referrer loader of (会員)MEMBER as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
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
 *     member_status, MEMBER_ADDRESS(AsValid), MEMBER_LOGIN(AsLoginStatus), member_security(AsOne), member_service(AsOne), member_withdrawal(AsOne)
 *
 * [referrer table]
 *     member_address, member_login, purchase, member_security, member_service, member_withdrawal
 *
 * [foreign property]
 *     memberStatus, memberAddressAsValid, memberAddressAsValidBefore, memberLoginAsLoginStatus, memberAddressAsIfComment, memberAddressAsOnlyOneDate, memberLoginAsLocalBindOverTest, memberLoginAsLocalForeignOverTest, memberLoginAsForeignForeignBindOverTest, memberLoginAsForeignForeignEachOverTest, memberLoginAsForeignForeignOptimizedBasicOverTest, memberLoginAsForeignForeignOptimizedMarkOverTest, memberLoginAsForeignForeignOptimizedPartOverTest, memberLoginAsForeignForeignOptimizedWholeOverTest, memberLoginAsForeignForeignParameterOverTest, memberLoginAsForeignForeignVariousOverTest, memberLoginAsReferrerOverTest, memberLoginAsReferrerForeignOverTest, memberAddressAsFormattedBasic, memberAddressAsFormattedLong, memberLoginAsFormattedMany, memberLoginAsLatest, memberLoginAsOldest, memberSecurityAsOne, memberServiceAsOne, memberWithdrawalAsOne
 *
 * [referrer property]
 *     memberAddressList, memberLoginList, purchaseList
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

    protected LoaderOfMemberAddress _foreignMemberAddressAsValidLoader;
    public LoaderOfMemberAddress pulloutMemberAddressAsValid() {
        if (_foreignMemberAddressAsValidLoader != null) { return _foreignMemberAddressAsValidLoader; }
        List<MemberAddress> pulledList = myBhv().pulloutMemberAddressAsValid(_selectedList);
        _foreignMemberAddressAsValidLoader = new LoaderOfMemberAddress().ready(pulledList, _selector);
        return _foreignMemberAddressAsValidLoader;
    }

    protected LoaderOfMemberAddress _foreignMemberAddressAsValidBeforeLoader;
    public LoaderOfMemberAddress pulloutMemberAddressAsValidBefore() {
        if (_foreignMemberAddressAsValidBeforeLoader != null) { return _foreignMemberAddressAsValidBeforeLoader; }
        List<MemberAddress> pulledList = myBhv().pulloutMemberAddressAsValidBefore(_selectedList);
        _foreignMemberAddressAsValidBeforeLoader = new LoaderOfMemberAddress().ready(pulledList, _selector);
        return _foreignMemberAddressAsValidBeforeLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsLoginStatusLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsLoginStatus() {
        if (_foreignMemberLoginAsLoginStatusLoader != null) { return _foreignMemberLoginAsLoginStatusLoader; }
        List<MemberLogin> pulledList = myBhv().pulloutMemberLoginAsLoginStatus(_selectedList);
        _foreignMemberLoginAsLoginStatusLoader = new LoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsLoginStatusLoader;
    }

    protected LoaderOfMemberAddress _foreignMemberAddressAsIfCommentLoader;
    public LoaderOfMemberAddress pulloutMemberAddressAsIfComment() {
        if (_foreignMemberAddressAsIfCommentLoader != null) { return _foreignMemberAddressAsIfCommentLoader; }
        List<MemberAddress> pulledList = myBhv().pulloutMemberAddressAsIfComment(_selectedList);
        _foreignMemberAddressAsIfCommentLoader = new LoaderOfMemberAddress().ready(pulledList, _selector);
        return _foreignMemberAddressAsIfCommentLoader;
    }

    protected LoaderOfMemberAddress _foreignMemberAddressAsOnlyOneDateLoader;
    public LoaderOfMemberAddress pulloutMemberAddressAsOnlyOneDate() {
        if (_foreignMemberAddressAsOnlyOneDateLoader != null) { return _foreignMemberAddressAsOnlyOneDateLoader; }
        List<MemberAddress> pulledList = myBhv().pulloutMemberAddressAsOnlyOneDate(_selectedList);
        _foreignMemberAddressAsOnlyOneDateLoader = new LoaderOfMemberAddress().ready(pulledList, _selector);
        return _foreignMemberAddressAsOnlyOneDateLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsLocalBindOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsLocalBindOverTest() {
        if (_foreignMemberLoginAsLocalBindOverTestLoader != null) { return _foreignMemberLoginAsLocalBindOverTestLoader; }
        List<MemberLogin> pulledList = myBhv().pulloutMemberLoginAsLocalBindOverTest(_selectedList);
        _foreignMemberLoginAsLocalBindOverTestLoader = new LoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsLocalBindOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsLocalForeignOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsLocalForeignOverTest() {
        if (_foreignMemberLoginAsLocalForeignOverTestLoader != null) { return _foreignMemberLoginAsLocalForeignOverTestLoader; }
        List<MemberLogin> pulledList = myBhv().pulloutMemberLoginAsLocalForeignOverTest(_selectedList);
        _foreignMemberLoginAsLocalForeignOverTestLoader = new LoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsLocalForeignOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsForeignForeignBindOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsForeignForeignBindOverTest() {
        if (_foreignMemberLoginAsForeignForeignBindOverTestLoader != null) { return _foreignMemberLoginAsForeignForeignBindOverTestLoader; }
        List<MemberLogin> pulledList = myBhv().pulloutMemberLoginAsForeignForeignBindOverTest(_selectedList);
        _foreignMemberLoginAsForeignForeignBindOverTestLoader = new LoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsForeignForeignBindOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsForeignForeignEachOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsForeignForeignEachOverTest() {
        if (_foreignMemberLoginAsForeignForeignEachOverTestLoader != null) { return _foreignMemberLoginAsForeignForeignEachOverTestLoader; }
        List<MemberLogin> pulledList = myBhv().pulloutMemberLoginAsForeignForeignEachOverTest(_selectedList);
        _foreignMemberLoginAsForeignForeignEachOverTestLoader = new LoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsForeignForeignEachOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsForeignForeignOptimizedBasicOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        if (_foreignMemberLoginAsForeignForeignOptimizedBasicOverTestLoader != null) { return _foreignMemberLoginAsForeignForeignOptimizedBasicOverTestLoader; }
        List<MemberLogin> pulledList = myBhv().pulloutMemberLoginAsForeignForeignOptimizedBasicOverTest(_selectedList);
        _foreignMemberLoginAsForeignForeignOptimizedBasicOverTestLoader = new LoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsForeignForeignOptimizedBasicOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsForeignForeignOptimizedMarkOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        if (_foreignMemberLoginAsForeignForeignOptimizedMarkOverTestLoader != null) { return _foreignMemberLoginAsForeignForeignOptimizedMarkOverTestLoader; }
        List<MemberLogin> pulledList = myBhv().pulloutMemberLoginAsForeignForeignOptimizedMarkOverTest(_selectedList);
        _foreignMemberLoginAsForeignForeignOptimizedMarkOverTestLoader = new LoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsForeignForeignOptimizedMarkOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsForeignForeignOptimizedPartOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsForeignForeignOptimizedPartOverTest() {
        if (_foreignMemberLoginAsForeignForeignOptimizedPartOverTestLoader != null) { return _foreignMemberLoginAsForeignForeignOptimizedPartOverTestLoader; }
        List<MemberLogin> pulledList = myBhv().pulloutMemberLoginAsForeignForeignOptimizedPartOverTest(_selectedList);
        _foreignMemberLoginAsForeignForeignOptimizedPartOverTestLoader = new LoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsForeignForeignOptimizedPartOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsForeignForeignOptimizedWholeOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsForeignForeignOptimizedWholeOverTest() {
        if (_foreignMemberLoginAsForeignForeignOptimizedWholeOverTestLoader != null) { return _foreignMemberLoginAsForeignForeignOptimizedWholeOverTestLoader; }
        List<MemberLogin> pulledList = myBhv().pulloutMemberLoginAsForeignForeignOptimizedWholeOverTest(_selectedList);
        _foreignMemberLoginAsForeignForeignOptimizedWholeOverTestLoader = new LoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsForeignForeignOptimizedWholeOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsForeignForeignParameterOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsForeignForeignParameterOverTest() {
        if (_foreignMemberLoginAsForeignForeignParameterOverTestLoader != null) { return _foreignMemberLoginAsForeignForeignParameterOverTestLoader; }
        List<MemberLogin> pulledList = myBhv().pulloutMemberLoginAsForeignForeignParameterOverTest(_selectedList);
        _foreignMemberLoginAsForeignForeignParameterOverTestLoader = new LoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsForeignForeignParameterOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsForeignForeignVariousOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsForeignForeignVariousOverTest() {
        if (_foreignMemberLoginAsForeignForeignVariousOverTestLoader != null) { return _foreignMemberLoginAsForeignForeignVariousOverTestLoader; }
        List<MemberLogin> pulledList = myBhv().pulloutMemberLoginAsForeignForeignVariousOverTest(_selectedList);
        _foreignMemberLoginAsForeignForeignVariousOverTestLoader = new LoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsForeignForeignVariousOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsReferrerOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsReferrerOverTest() {
        if (_foreignMemberLoginAsReferrerOverTestLoader != null) { return _foreignMemberLoginAsReferrerOverTestLoader; }
        List<MemberLogin> pulledList = myBhv().pulloutMemberLoginAsReferrerOverTest(_selectedList);
        _foreignMemberLoginAsReferrerOverTestLoader = new LoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsReferrerOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsReferrerForeignOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsReferrerForeignOverTest() {
        if (_foreignMemberLoginAsReferrerForeignOverTestLoader != null) { return _foreignMemberLoginAsReferrerForeignOverTestLoader; }
        List<MemberLogin> pulledList = myBhv().pulloutMemberLoginAsReferrerForeignOverTest(_selectedList);
        _foreignMemberLoginAsReferrerForeignOverTestLoader = new LoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsReferrerForeignOverTestLoader;
    }

    protected LoaderOfMemberAddress _foreignMemberAddressAsFormattedBasicLoader;
    public LoaderOfMemberAddress pulloutMemberAddressAsFormattedBasic() {
        if (_foreignMemberAddressAsFormattedBasicLoader != null) { return _foreignMemberAddressAsFormattedBasicLoader; }
        List<MemberAddress> pulledList = myBhv().pulloutMemberAddressAsFormattedBasic(_selectedList);
        _foreignMemberAddressAsFormattedBasicLoader = new LoaderOfMemberAddress().ready(pulledList, _selector);
        return _foreignMemberAddressAsFormattedBasicLoader;
    }

    protected LoaderOfMemberAddress _foreignMemberAddressAsFormattedLongLoader;
    public LoaderOfMemberAddress pulloutMemberAddressAsFormattedLong() {
        if (_foreignMemberAddressAsFormattedLongLoader != null) { return _foreignMemberAddressAsFormattedLongLoader; }
        List<MemberAddress> pulledList = myBhv().pulloutMemberAddressAsFormattedLong(_selectedList);
        _foreignMemberAddressAsFormattedLongLoader = new LoaderOfMemberAddress().ready(pulledList, _selector);
        return _foreignMemberAddressAsFormattedLongLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsFormattedManyLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsFormattedMany() {
        if (_foreignMemberLoginAsFormattedManyLoader != null) { return _foreignMemberLoginAsFormattedManyLoader; }
        List<MemberLogin> pulledList = myBhv().pulloutMemberLoginAsFormattedMany(_selectedList);
        _foreignMemberLoginAsFormattedManyLoader = new LoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsFormattedManyLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsLatestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsLatest() {
        if (_foreignMemberLoginAsLatestLoader != null) { return _foreignMemberLoginAsLatestLoader; }
        List<MemberLogin> pulledList = myBhv().pulloutMemberLoginAsLatest(_selectedList);
        _foreignMemberLoginAsLatestLoader = new LoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsLatestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsOldestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsOldest() {
        if (_foreignMemberLoginAsOldestLoader != null) { return _foreignMemberLoginAsOldestLoader; }
        List<MemberLogin> pulledList = myBhv().pulloutMemberLoginAsOldest(_selectedList);
        _foreignMemberLoginAsOldestLoader = new LoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsOldestLoader;
    }

    protected LoaderOfMemberSecurity _foreignMemberSecurityAsOneLoader;
    public LoaderOfMemberSecurity pulloutMemberSecurityAsOne() {
        if (_foreignMemberSecurityAsOneLoader != null) { return _foreignMemberSecurityAsOneLoader; }
        List<MemberSecurity> pulledList = myBhv().pulloutMemberSecurityAsOne(_selectedList);
        _foreignMemberSecurityAsOneLoader = new LoaderOfMemberSecurity().ready(pulledList, _selector);
        return _foreignMemberSecurityAsOneLoader;
    }

    protected LoaderOfMemberService _foreignMemberServiceAsOneLoader;
    public LoaderOfMemberService pulloutMemberServiceAsOne() {
        if (_foreignMemberServiceAsOneLoader != null) { return _foreignMemberServiceAsOneLoader; }
        List<MemberService> pulledList = myBhv().pulloutMemberServiceAsOne(_selectedList);
        _foreignMemberServiceAsOneLoader = new LoaderOfMemberService().ready(pulledList, _selector);
        return _foreignMemberServiceAsOneLoader;
    }

    protected LoaderOfMemberWithdrawal _foreignMemberWithdrawalAsOneLoader;
    public LoaderOfMemberWithdrawal pulloutMemberWithdrawalAsOne() {
        if (_foreignMemberWithdrawalAsOneLoader != null) { return _foreignMemberWithdrawalAsOneLoader; }
        List<MemberWithdrawal> pulledList = myBhv().pulloutMemberWithdrawalAsOne(_selectedList);
        _foreignMemberWithdrawalAsOneLoader = new LoaderOfMemberWithdrawal().ready(pulledList, _selector);
        return _foreignMemberWithdrawalAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Member> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
