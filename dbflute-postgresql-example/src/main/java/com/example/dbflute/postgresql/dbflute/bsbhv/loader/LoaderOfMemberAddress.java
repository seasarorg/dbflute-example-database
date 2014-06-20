package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of (会員住所情報)member_address as TABLE. <br />
 * <pre>
 * [primary key]
 *     member_address_id
 *
 * [column]
 *     member_address_id, member_id, valid_begin_date, valid_end_date, address, region_id, register_datetime, register_process, register_user, update_datetime, update_process, update_user, version_no
 *
 * [sequence]
 *     member_address_member_address_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     member, region
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, region
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMemberAddress {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MemberAddress> _selectedList;
    protected BehaviorSelector _selector;
    protected MemberAddressBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMemberAddress ready(List<MemberAddress> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MemberAddressBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MemberAddressBhv.class); return _myBhv; } }

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

    protected LoaderOfRegion _foreignRegionLoader;
    public LoaderOfRegion pulloutRegion() {
        if (_foreignRegionLoader != null) { return _foreignRegionLoader; }
        List<Region> pulledList = myBhv().pulloutRegion(_selectedList);
        _foreignRegionLoader = new LoaderOfRegion().ready(pulledList, _selector);
        return _foreignRegionLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MemberAddress> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
