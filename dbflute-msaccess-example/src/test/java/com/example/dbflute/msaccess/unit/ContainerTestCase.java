package com.example.dbflute.msaccess.unit;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.seasar.dbflute.AccessContext;
import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv.DeleteOption;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.framework.unit.Seasar2;
import org.seasar.framework.unit.annotation.RootDicon;

import com.example.dbflute.msaccess.dbflute.cbean.MemberLoginCB;
import com.example.dbflute.msaccess.dbflute.cbean.MemberSecurityCB;
import com.example.dbflute.msaccess.dbflute.cbean.MemberWithdrawalCB;
import com.example.dbflute.msaccess.dbflute.cbean.PurchaseCB;
import com.example.dbflute.msaccess.dbflute.exbhv.MemberLoginBhv;
import com.example.dbflute.msaccess.dbflute.exbhv.MemberSecurityBhv;
import com.example.dbflute.msaccess.dbflute.exbhv.MemberWithdrawalBhv;
import com.example.dbflute.msaccess.dbflute.exbhv.PurchaseBhv;

/**
 * @author jflute
 * @since 0.8.2 (2008/10/27 Monday)
 */
@RunWith(Seasar2.class)
@RootDicon("app.dicon")
public abstract class ContainerTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance for sub class. */
    private static final Log _log = LogFactory.getLog(ContainerTestCase.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // protected Timestamp accessTimestamp;
    protected Date accessDate;

    protected String accessUser;

    protected String accessProcess;

    private DataSource dataSource;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Before
    public void setUp() {
        initializeAccessContext();
    }

    protected void initializeAccessContext() {
        // accessTimestamp = currentTimestamp();
        accessDate = currentTimestamp();
        accessUser = "testUser";
        accessProcess = getClass().getSimpleName();
        AccessContext context = new AccessContext();
        // context.setAccessTimestamp(accessTimestamp);
        context.setAccessDate(accessDate);
        context.setAccessUser(accessUser);
        context.setAccessProcess(accessProcess);
        AccessContext.setAccessContextOnThread(context);
    }

    @After
    public void tearDown() {
        destroyAccessContext();
    }

    protected void destroyAccessContext() {
        AccessContext.clearAccessContextOnThread();
    }

    // ===================================================================================
    //                                                                  Data Source Helper
    //                                                                  ==================
    protected DataSource getDataSource() {
        return dataSource;
    }

    protected DatabaseMetaData getDatabaseMetaData() {
        Connection conn = null;
        try {
            conn = getDataSource().getConnection();
            return conn.getMetaData();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ignored) {
                }
            }
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    private BehaviorSelector _behaviorSelector;

    protected void deleteMemberReferrer() {
        {
            // no primary key (needs to fix)
            //MemberAddressBhv bhv = _behaviorSelector.select(MemberAddressBhv.class);
            //MemberAddressCB cb = bhv.newMyConditionBean();
            //bhv.varyingQueryDelete(cb, new DeleteOption<MemberAddressCB>().allowNonQueryDelete());
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

    protected void showPage(PagingResultBean<? extends Object>... pages) {
        for (PagingResultBean<? extends Object> page : pages) {
            log(page);
        }
        int count = 1;
        for (PagingResultBean<? extends Object> page : pages) {
            log("[page" + count + "]");
            for (Object entity : page) {
                log("  " + entity);
            }
            ++count;
        }
    }

    protected void showList(List<? extends Object>... lss) {
        for (List<? extends Object> ls : lss) {
            log(ls);
        }
        int count = 1;
        for (List<? extends Object> ls : lss) {
            log("[page" + count + "]");
            for (Object entity : ls) {
                log("  " + entity);
            }
            ++count;
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected void log(Object msg) {
        _log.debug(msg);
    }

    protected Date currentDate() {
        return new Date(System.currentTimeMillis());
    }

    protected Timestamp currentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }

    protected static String getLineSeparator() {
        return System.getProperty("line.separator");
    }
}
