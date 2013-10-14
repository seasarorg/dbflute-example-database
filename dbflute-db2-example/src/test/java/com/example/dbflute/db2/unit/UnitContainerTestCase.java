package com.example.dbflute.db2.unit;

import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv.DeleteOption;
import org.seasar.dbflute.unit.seasar.ContainerTestCase;

import com.example.dbflute.db2.dbflute.cbean.MemberAddressCB;
import com.example.dbflute.db2.dbflute.cbean.MemberLoginCB;
import com.example.dbflute.db2.dbflute.cbean.MemberSecurityCB;
import com.example.dbflute.db2.dbflute.cbean.MemberServiceCB;
import com.example.dbflute.db2.dbflute.cbean.MemberWithdrawalCB;
import com.example.dbflute.db2.dbflute.cbean.PurchaseCB;
import com.example.dbflute.db2.dbflute.exbhv.MemberAddressBhv;
import com.example.dbflute.db2.dbflute.exbhv.MemberLoginBhv;
import com.example.dbflute.db2.dbflute.exbhv.MemberSecurityBhv;
import com.example.dbflute.db2.dbflute.exbhv.MemberServiceBhv;
import com.example.dbflute.db2.dbflute.exbhv.MemberWithdrawalBhv;
import com.example.dbflute.db2.dbflute.exbhv.PurchaseBhv;

/**
 * The test base of the application.
 * @author jflute
 * @since 0.9.9.7F (2012/08/26 Sunday)
 */
public abstract class UnitContainerTestCase extends ContainerTestCase {

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    protected boolean isDestroyContainerAtTearDown() {
        return true;
    }

    // ===================================================================================
    //                                                                         Data Helper
    //                                                                         ===========
    private BehaviorSelector _behaviorSelector;

    protected void deleteMemberReferrer() {
        {
            MemberServiceBhv bhv = _behaviorSelector.select(MemberServiceBhv.class);
            MemberServiceCB cb = bhv.newMyConditionBean();
            bhv.varyingQueryDelete(cb, new DeleteOption<MemberServiceCB>().allowNonQueryDelete());
        }
        {
            MemberAddressBhv bhv = _behaviorSelector.select(MemberAddressBhv.class);
            MemberAddressCB cb = bhv.newMyConditionBean();
            bhv.varyingQueryDelete(cb, new DeleteOption<MemberAddressCB>().allowNonQueryDelete());
        }
        {
            MemberLoginBhv bhv = _behaviorSelector.select(MemberLoginBhv.class);
            MemberLoginCB cb = bhv.newMyConditionBean();
            bhv.varyingQueryDelete(cb, new DeleteOption<MemberLoginCB>().allowNonQueryDelete());
        }
        {
            MemberSecurityBhv bhv = _behaviorSelector.select(MemberSecurityBhv.class);
            MemberSecurityCB cb = bhv.newMyConditionBean();
            bhv.varyingQueryDelete(cb, new DeleteOption<MemberSecurityCB>().allowNonQueryDelete());
        }
        {
            MemberWithdrawalBhv bhv = _behaviorSelector.select(MemberWithdrawalBhv.class);
            MemberWithdrawalCB cb = bhv.newMyConditionBean();
            bhv.varyingQueryDelete(cb, new DeleteOption<MemberWithdrawalCB>().allowNonQueryDelete());
        }
        {
            PurchaseBhv bhv = _behaviorSelector.select(PurchaseBhv.class);
            PurchaseCB cb = bhv.newMyConditionBean();
            bhv.varyingQueryDelete(cb, new DeleteOption<PurchaseCB>().allowNonQueryDelete());
        }
    }
}
