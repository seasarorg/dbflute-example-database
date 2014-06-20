package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of (会員サービス)member_service as TABLE. <br />
 * <pre>
 * [primary key]
 *     member_service_id
 *
 * [column]
 *     member_service_id, member_id, service_point_count, service_rank_code, register_datetime, register_process, register_user, update_datetime, update_process, update_user, version_no
 *
 * [sequence]
 *     member_service_member_service_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     service_rank
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     serviceRank
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMemberService {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MemberService> _selectedList;
    protected BehaviorSelector _selector;
    protected MemberServiceBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMemberService ready(List<MemberService> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MemberServiceBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MemberServiceBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfServiceRank _foreignServiceRankLoader;
    public LoaderOfServiceRank pulloutServiceRank() {
        if (_foreignServiceRankLoader != null) { return _foreignServiceRankLoader; }
        List<ServiceRank> pulledList = myBhv().pulloutServiceRank(_selectedList);
        _foreignServiceRankLoader = new LoaderOfServiceRank().ready(pulledList, _selector);
        return _foreignServiceRankLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MemberService> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
