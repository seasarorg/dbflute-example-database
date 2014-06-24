package com.example.dbflute.db2.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.db2.dbflute.exbhv.*;
import com.example.dbflute.db2.dbflute.exentity.*;
import com.example.dbflute.db2.dbflute.cbean.*;

/**
 * The referrer loader of (会員ステータス)MEMBER_STATUS as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_STATUS_CODE
 *
 * [column]
 *     MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, DESCRIPTION, DISPLAY_ORDER
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
 *     ALIAS_MEMBER, ALIAS_MEMBER_LOGIN, MEMBER, MEMBER_LOGIN
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     aliasMemberList, aliasMemberLoginList, memberList, memberLoginList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMemberStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MemberStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected MemberStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMemberStatus ready(List<MemberStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MemberStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MemberStatusBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<AliasMember> _referrerAliasMemberList;
    public NestedReferrerLoaderGateway<LoaderOfAliasMember> loadAliasMemberList(ConditionBeanSetupper<AliasMemberCB> setupper) {
        myBhv().loadAliasMemberList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<AliasMember>() {
            public void handle(List<AliasMember> referrerList) { _referrerAliasMemberList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfAliasMember>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfAliasMember> handler) {
                handler.handle(new LoaderOfAliasMember().ready(_referrerAliasMemberList, _selector));
            }
        };
    }

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

    protected List<Member> _referrerMemberList;
    public NestedReferrerLoaderGateway<LoaderOfMember> loadMemberList(ConditionBeanSetupper<MemberCB> setupper) {
        myBhv().loadMemberList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<Member>() {
            public void handle(List<Member> referrerList) { _referrerMemberList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfMember>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfMember> handler) {
                handler.handle(new LoaderOfMember().ready(_referrerMemberList, _selector));
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
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MemberStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
