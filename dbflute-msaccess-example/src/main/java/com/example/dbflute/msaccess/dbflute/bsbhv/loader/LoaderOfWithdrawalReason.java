package com.example.dbflute.msaccess.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.msaccess.dbflute.exbhv.*;
import com.example.dbflute.msaccess.dbflute.exentity.*;
import com.example.dbflute.msaccess.dbflute.cbean.*;

/**
 * The referrer loader of WITHDRAWAL_REASON as TABLE. <br />
 * <pre>
 * [primary key]
 *     WITHDRAWAL_REASON_CODE
 *
 * [column]
 *     WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_USER, REGISTER_PROCESS, UPDATE_DATETIME, UPDATE_USER, UPDATE_PROCESS, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WITHDRAWAL_REASON_CODE
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     MEMBER_WITHDRAWAL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberWithdrawalList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWithdrawalReason {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WithdrawalReason> _selectedList;
    protected BehaviorSelector _selector;
    protected WithdrawalReasonBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWithdrawalReason ready(List<WithdrawalReason> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WithdrawalReasonBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WithdrawalReasonBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MemberWithdrawal> _referrerMemberWithdrawalList;
    public NestedReferrerLoaderGateway<LoaderOfMemberWithdrawal> loadMemberWithdrawalList(ConditionBeanSetupper<MemberWithdrawalCB> setupper) {
        myBhv().loadMemberWithdrawalList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<MemberWithdrawal>() {
            public void handle(List<MemberWithdrawal> referrerList) { _referrerMemberWithdrawalList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfMemberWithdrawal>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfMemberWithdrawal> handler) {
                handler.handle(new LoaderOfMemberWithdrawal().ready(_referrerMemberWithdrawalList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WithdrawalReason> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
