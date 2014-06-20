package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of (会員ステータス)member_status as TABLE. <br />
 * <pre>
 * [primary key]
 *     member_status_code
 *
 * [column]
 *     member_status_code, member_status_name, description, display_order
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
 *     member, member_login
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberList, memberLoginList
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
