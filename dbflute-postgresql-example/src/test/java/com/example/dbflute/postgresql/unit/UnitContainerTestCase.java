package com.example.dbflute.postgresql.unit;

import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv.BehaviorWritable;
import org.seasar.dbflute.bhv.DeleteOption;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.unit.spring.ContainerTestCase;

import com.example.dbflute.postgresql.dbflute.exbhv.MemberAddressBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.MemberLoginBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.MemberSecurityBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.MemberWithdrawalBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.PurchaseBhv;

/**
 * The test case with container.
 * @author jflute
 * @since 0.6.3 (2008/02/02 Saturday)
 */
public abstract class UnitContainerTestCase extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private BehaviorSelector _behaviorSelector;

    // ===================================================================================
    //                                                                         Data Helper
    //                                                                         ===========
    protected void deleteAll(Class<? extends BehaviorWritable> clazz) {
        BehaviorWritable bhv = _behaviorSelector.select(clazz);
        ConditionBean cb = bhv.newConditionBean();
        bhv.rangeRemove(cb, new DeleteOption<ConditionBean>().allowNonQueryDelete());
    }

    protected void deleteMemberReferrer() {
        // not create yet
        //deleteAll(MemberServiceBhv.class);
        //deleteAll(MemberFollowingBhv.class);
        deleteAll(MemberAddressBhv.class);
        deleteAll(MemberLoginBhv.class);
        deleteAll(MemberSecurityBhv.class);
        deleteAll(MemberWithdrawalBhv.class);
        deleteAll(PurchaseBhv.class);
    }
}
