package com.example.dbflute.mysql.unit;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv.BehaviorWritable;
import org.seasar.dbflute.bhv.DeleteOption;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.unit.seasar.ContainerTestCase;

import com.example.dbflute.mysql.dbflute.exbhv.MemberAddressBhv;
import com.example.dbflute.mysql.dbflute.exbhv.MemberLoginBhv;
import com.example.dbflute.mysql.dbflute.exbhv.MemberSecurityBhv;
import com.example.dbflute.mysql.dbflute.exbhv.MemberServiceBhv;
import com.example.dbflute.mysql.dbflute.exbhv.MemberWithdrawalBhv;
import com.example.dbflute.mysql.dbflute.exbhv.PurchaseBhv;

/**
 * @author jflute
 * @since 0.5.9 (2007/12/2 Thursday)
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
        deleteAll(MemberServiceBhv.class);
        deleteAll(MemberAddressBhv.class);
        deleteAll(MemberLoginBhv.class);
        deleteAll(MemberSecurityBhv.class);
        deleteAll(MemberWithdrawalBhv.class);
        deleteAll(PurchaseBhv.class);
    }

    // ===================================================================================
    //                                                                     Isolation Level
    //                                                                     ===============
    /**
     * Adjust transaction isolation level to READ COMMITTED on this session. <br />
     * This method depends on the MySQL. (you cannot use for other DBMSs)
     * @throws SQLException
     */
    protected void adjustTransactionIsolationLevel_ReadCommitted() throws SQLException {
        DataSource dataSource = getDataSource();
        Connection conn = null;
        Statement st = null;
        try {
            conn = dataSource.getConnection();
            st = conn.createStatement();
            st.execute("set SESSION transaction isolation level READ COMMITTED");
        } finally {
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}
