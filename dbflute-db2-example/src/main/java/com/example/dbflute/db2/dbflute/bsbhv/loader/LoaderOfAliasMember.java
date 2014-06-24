package com.example.dbflute.db2.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.db2.dbflute.exbhv.*;
import com.example.dbflute.db2.dbflute.exentity.*;
import com.example.dbflute.db2.dbflute.cbean.*;

/**
 * The referrer loader of ALIAS_MEMBER as ALIAS. <br />
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
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER_STATUS
 *
 * [referrer table]
 *     ALIAS_MEMBER_LOGIN
 *
 * [foreign property]
 *     memberStatus
 *
 * [referrer property]
 *     aliasMemberLoginList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfAliasMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<AliasMember> _selectedList;
    protected BehaviorSelector _selector;
    protected AliasMemberBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfAliasMember ready(List<AliasMember> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected AliasMemberBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(AliasMemberBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<AliasMemberLogin> _referrerAliasMemberLoginList;
    public NestedReferrerLoaderGateway<LoaderOfAliasMemberLogin> loadAliasMemberLoginList(ConditionBeanSetupper<AliasMemberLoginCB> setupper) {
        myBhv().loadAliasMemberLoginList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<AliasMemberLogin>() {
            public void handle(List<AliasMemberLogin> referrerList) { _referrerAliasMemberLoginList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfAliasMemberLogin>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfAliasMemberLogin> handler) {
                handler.handle(new LoaderOfAliasMemberLogin().ready(_referrerAliasMemberLoginList, _selector));
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

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<AliasMember> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
