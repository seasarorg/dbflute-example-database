package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

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
 *     MEMBER, MEMBER_LOGIN, MEMBER_VENDOR_SYNONYM, SYNONYM_MEMBER, SYNONYM_MEMBER_LOGIN, VENDOR_SYNONYM_MEMBER
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberList, memberLoginList, memberVendorSynonymList, synonymMemberList, synonymMemberLoginList, vendorSynonymMemberList
 * </pre>
 * @author oracleman
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

    protected List<MemberVendorSynonym> _referrerMemberVendorSynonymList;
    public NestedReferrerLoaderGateway<LoaderOfMemberVendorSynonym> loadMemberVendorSynonymList(ConditionBeanSetupper<MemberVendorSynonymCB> setupper) {
        myBhv().loadMemberVendorSynonymList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<MemberVendorSynonym>() {
            public void handle(List<MemberVendorSynonym> referrerList) { _referrerMemberVendorSynonymList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfMemberVendorSynonym>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfMemberVendorSynonym> handler) {
                handler.handle(new LoaderOfMemberVendorSynonym().ready(_referrerMemberVendorSynonymList, _selector));
            }
        };
    }

    protected List<SynonymMember> _referrerSynonymMemberList;
    public NestedReferrerLoaderGateway<LoaderOfSynonymMember> loadSynonymMemberList(ConditionBeanSetupper<SynonymMemberCB> setupper) {
        myBhv().loadSynonymMemberList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<SynonymMember>() {
            public void handle(List<SynonymMember> referrerList) { _referrerSynonymMemberList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfSynonymMember>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfSynonymMember> handler) {
                handler.handle(new LoaderOfSynonymMember().ready(_referrerSynonymMemberList, _selector));
            }
        };
    }

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

    protected List<VendorSynonymMember> _referrerVendorSynonymMemberList;
    public NestedReferrerLoaderGateway<LoaderOfVendorSynonymMember> loadVendorSynonymMemberList(ConditionBeanSetupper<VendorSynonymMemberCB> setupper) {
        myBhv().loadVendorSynonymMemberList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<VendorSynonymMember>() {
            public void handle(List<VendorSynonymMember> referrerList) { _referrerVendorSynonymMemberList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfVendorSynonymMember>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfVendorSynonymMember> handler) {
                handler.handle(new LoaderOfVendorSynonymMember().ready(_referrerVendorSynonymMemberList, _selector));
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
