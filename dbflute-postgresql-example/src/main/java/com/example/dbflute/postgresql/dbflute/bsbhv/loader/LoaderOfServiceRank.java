package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of (サービスランク)service_rank as TABLE. <br />
 * <pre>
 * [primary key]
 *     service_rank_code
 *
 * [column]
 *     service_rank_code, service_rank_name, service_point_incidence, new_acceptable_flg, description, display_order
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
 *     member_service
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberServiceList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfServiceRank {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ServiceRank> _selectedList;
    protected BehaviorSelector _selector;
    protected ServiceRankBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfServiceRank ready(List<ServiceRank> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ServiceRankBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ServiceRankBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MemberService> _referrerMemberServiceList;
    public NestedReferrerLoaderGateway<LoaderOfMemberService> loadMemberServiceList(ConditionBeanSetupper<MemberServiceCB> setupper) {
        myBhv().loadMemberServiceList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<MemberService>() {
            public void handle(List<MemberService> referrerList) { _referrerMemberServiceList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfMemberService>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfMemberService> handler) {
                handler.handle(new LoaderOfMemberService().ready(_referrerMemberServiceList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ServiceRank> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
