package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of (会員退会情報)member_withdrawal as TABLE. <br />
 * <pre>
 * [primary key]
 *     member_id
 *
 * [column]
 *     member_id, withdrawal_reason_code, withdrawal_reason_input_text, withdrawal_datetime, register_datetime, register_process, register_user, update_datetime, update_process, update_user
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
 *     member, withdrawal_reason
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, withdrawalReason
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMemberWithdrawal {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MemberWithdrawal> _selectedList;
    protected BehaviorSelector _selector;
    protected MemberWithdrawalBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMemberWithdrawal ready(List<MemberWithdrawal> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MemberWithdrawalBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MemberWithdrawalBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMember _foreignMemberLoader;
    public LoaderOfMember pulloutMember() {
        if (_foreignMemberLoader != null) { return _foreignMemberLoader; }
        List<Member> pulledList = myBhv().pulloutMember(_selectedList);
        _foreignMemberLoader = new LoaderOfMember().ready(pulledList, _selector);
        return _foreignMemberLoader;
    }

    protected LoaderOfWithdrawalReason _foreignWithdrawalReasonLoader;
    public LoaderOfWithdrawalReason pulloutWithdrawalReason() {
        if (_foreignWithdrawalReasonLoader != null) { return _foreignWithdrawalReasonLoader; }
        List<WithdrawalReason> pulledList = myBhv().pulloutWithdrawalReason(_selectedList);
        _foreignWithdrawalReasonLoader = new LoaderOfWithdrawalReason().ready(pulledList, _selector);
        return _foreignWithdrawalReasonLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MemberWithdrawal> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
