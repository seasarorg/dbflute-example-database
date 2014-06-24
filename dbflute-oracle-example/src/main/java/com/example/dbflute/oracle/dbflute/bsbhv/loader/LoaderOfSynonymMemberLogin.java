package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The referrer loader of (会員ログイン)SYNONYM_MEMBER_LOGIN as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     MEMBER_LOGIN_ID
 *
 * [column]
 *     MEMBER_LOGIN_ID, MEMBER_ID, LOGIN_DATETIME, MOBILE_LOGIN_FLG, LOGIN_MEMBER_STATUS_CODE
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
 *     MEMBER_STATUS, MEMBER_VENDOR_SYNONYM, SYNONYM_MEMBER, VENDOR_SYNONYM_MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     memberStatus, memberVendorSynonym, synonymMember, vendorSynonymMember
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public class LoaderOfSynonymMemberLogin {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SynonymMemberLogin> _selectedList;
    protected BehaviorSelector _selector;
    protected SynonymMemberLoginBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSynonymMemberLogin ready(List<SynonymMemberLogin> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SynonymMemberLoginBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SynonymMemberLoginBhv.class); return _myBhv; } }

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

    protected LoaderOfMemberVendorSynonym _foreignMemberVendorSynonymLoader;
    public LoaderOfMemberVendorSynonym pulloutMemberVendorSynonym() {
        if (_foreignMemberVendorSynonymLoader != null) { return _foreignMemberVendorSynonymLoader; }
        List<MemberVendorSynonym> pulledList = myBhv().pulloutMemberVendorSynonym(_selectedList);
        _foreignMemberVendorSynonymLoader = new LoaderOfMemberVendorSynonym().ready(pulledList, _selector);
        return _foreignMemberVendorSynonymLoader;
    }

    protected LoaderOfSynonymMember _foreignSynonymMemberLoader;
    public LoaderOfSynonymMember pulloutSynonymMember() {
        if (_foreignSynonymMemberLoader != null) { return _foreignSynonymMemberLoader; }
        List<SynonymMember> pulledList = myBhv().pulloutSynonymMember(_selectedList);
        _foreignSynonymMemberLoader = new LoaderOfSynonymMember().ready(pulledList, _selector);
        return _foreignSynonymMemberLoader;
    }

    protected LoaderOfVendorSynonymMember _foreignVendorSynonymMemberLoader;
    public LoaderOfVendorSynonymMember pulloutVendorSynonymMember() {
        if (_foreignVendorSynonymMemberLoader != null) { return _foreignVendorSynonymMemberLoader; }
        List<VendorSynonymMember> pulledList = myBhv().pulloutVendorSynonymMember(_selectedList);
        _foreignVendorSynonymMemberLoader = new LoaderOfVendorSynonymMember().ready(pulledList, _selector);
        return _foreignVendorSynonymMemberLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SynonymMemberLogin> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
