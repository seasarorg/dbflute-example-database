package com.example.dbflute.db2.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.db2.dbflute.exbhv.*;
import com.example.dbflute.db2.dbflute.exentity.*;

/**
 * The referrer loader of ALIAS_MEMBER_LOGIN as ALIAS. <br />
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
 *     ALIAS_MEMBER, MEMBER_STATUS
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     aliasMember, memberStatus
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfAliasMemberLogin {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<AliasMemberLogin> _selectedList;
    protected BehaviorSelector _selector;
    protected AliasMemberLoginBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfAliasMemberLogin ready(List<AliasMemberLogin> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected AliasMemberLoginBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(AliasMemberLoginBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfAliasMember _foreignAliasMemberLoader;
    public LoaderOfAliasMember pulloutAliasMember() {
        if (_foreignAliasMemberLoader != null) { return _foreignAliasMemberLoader; }
        List<AliasMember> pulledList = myBhv().pulloutAliasMember(_selectedList);
        _foreignAliasMemberLoader = new LoaderOfAliasMember().ready(pulledList, _selector);
        return _foreignAliasMemberLoader;
    }

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
    public List<AliasMemberLogin> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
