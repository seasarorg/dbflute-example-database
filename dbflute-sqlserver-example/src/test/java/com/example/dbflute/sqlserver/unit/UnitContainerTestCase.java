package com.example.dbflute.sqlserver.unit;

import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv.DeleteOption;
import org.seasar.dbflute.unit.seasar.ContainerTestCase;

import com.example.dbflute.sqlserver.dbflute.cbean.MemberAddressCB;
import com.example.dbflute.sqlserver.dbflute.cbean.MemberLoginCB;
import com.example.dbflute.sqlserver.dbflute.cbean.MemberSecurityCB;
import com.example.dbflute.sqlserver.dbflute.cbean.MemberServiceCB;
import com.example.dbflute.sqlserver.dbflute.cbean.MemberWithdrawalCB;
import com.example.dbflute.sqlserver.dbflute.cbean.PurchaseCB;
import com.example.dbflute.sqlserver.dbflute.exbhv.MemberAddressBhv;
import com.example.dbflute.sqlserver.dbflute.exbhv.MemberLoginBhv;
import com.example.dbflute.sqlserver.dbflute.exbhv.MemberSecurityBhv;
import com.example.dbflute.sqlserver.dbflute.exbhv.MemberServiceBhv;
import com.example.dbflute.sqlserver.dbflute.exbhv.MemberWithdrawalBhv;
import com.example.dbflute.sqlserver.dbflute.exbhv.PurchaseBhv;

/**
 * The test base of the application.
 * @author jflute
 * @since 0.5.6 (2007/10/22 Monday)
 */
public abstract class UnitContainerTestCase extends ContainerTestCase {

    private BehaviorSelector _behaviorSelector;

    protected void deleteMemberReferrer() {
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
            MemberServiceBhv bhv = _behaviorSelector.select(MemberServiceBhv.class);
            MemberServiceCB cb = bhv.newMyConditionBean();
            bhv.varyingQueryDelete(cb, new DeleteOption<MemberServiceCB>().allowNonQueryDelete());
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
