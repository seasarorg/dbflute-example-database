package com.example.dbflute.bhvap.dbflute.allcommon;

import javax.sql.DataSource;

import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv.core.BehaviorCommandInvoker;
import org.seasar.dbflute.bhv.core.CommonColumnAutoSetupper;
import com.example.dbflute.tricky.dbflute.allcommon.DBFluteModule;
import com.example.dbflute.bhvap.dbflute.exbhv.*;

/**
 * @author DBFlute(AutoGenerator)
 */
public class DBFluteModuleBhvAp extends DBFluteModule {

    public DBFluteModuleBhvAp(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected void setupBehavior(BehaviorCommandInvoker ker, BehaviorSelector tor, CommonColumnAutoSetupper per) {
        super.setupBehavior(ker, tor, per);

        {
            MemberBhvAp bhv = new MemberBhvAp();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberBhvAp.class).toInstance(bhv);
        }
        {
            MemberAddressBhvAp bhv = new MemberAddressBhvAp();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberAddressBhvAp.class).toInstance(bhv);
        }
        {
            MemberLoginBhvAp bhv = new MemberLoginBhvAp();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberLoginBhvAp.class).toInstance(bhv);
        }
        {
            MemberSecurityBhvAp bhv = new MemberSecurityBhvAp();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberSecurityBhvAp.class).toInstance(bhv);
        }
        {
            MemberServiceBhvAp bhv = new MemberServiceBhvAp();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberServiceBhvAp.class).toInstance(bhv);
        }
        {
            MemberStatusBhvAp bhv = new MemberStatusBhvAp();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberStatusBhvAp.class).toInstance(bhv);
        }
        {
            MemberWithdrawalBhvAp bhv = new MemberWithdrawalBhvAp();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberWithdrawalBhvAp.class).toInstance(bhv);
        }
        {
            ProductBhvAp bhv = new ProductBhvAp();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(ProductBhvAp.class).toInstance(bhv);
        }
        {
            ProductCategoryBhvAp bhv = new ProductCategoryBhvAp();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(ProductCategoryBhvAp.class).toInstance(bhv);
        }
        {
            ProductStatusBhvAp bhv = new ProductStatusBhvAp();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(ProductStatusBhvAp.class).toInstance(bhv);
        }
        {
            PurchaseBhvAp bhv = new PurchaseBhvAp();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(PurchaseBhvAp.class).toInstance(bhv);
        }
        {
            RegionBhvAp bhv = new RegionBhvAp();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(RegionBhvAp.class).toInstance(bhv);
        }
        {
            ServiceRankBhvAp bhv = new ServiceRankBhvAp();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(ServiceRankBhvAp.class).toInstance(bhv);
        }
        {
            SummaryProductBhvAp bhv = new SummaryProductBhvAp();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(SummaryProductBhvAp.class).toInstance(bhv);
        }
        {
            VendorCheckBhvAp bhv = new VendorCheckBhvAp();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(VendorCheckBhvAp.class).toInstance(bhv);
        }
        {
            WithdrawalReasonBhvAp bhv = new WithdrawalReasonBhvAp();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WithdrawalReasonBhvAp.class).toInstance(bhv);
        }
    }
}
