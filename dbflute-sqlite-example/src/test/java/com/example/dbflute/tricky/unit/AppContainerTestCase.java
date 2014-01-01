package com.example.dbflute.tricky.unit;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import javax.sql.DataSource;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

import org.seasar.dbflute.AccessContext;
import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv.DeleteOption;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.dbflute.exception.SQLFailureException;
import org.seasar.dbflute.util.DfTypeUtil;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import com.atomikos.jdbc.nonxa.AtomikosNonXADataSourceBean;
import com.example.dbflute.tricky.EmbeddedSQLiteUrlFactoryBean;
import com.example.dbflute.tricky.dbflute.allcommon.DBCurrent;
import com.example.dbflute.tricky.dbflute.allcommon.DBFluteModule;
import com.example.dbflute.tricky.dbflute.cbean.MemberAddressCB;
import com.example.dbflute.tricky.dbflute.cbean.MemberLoginCB;
import com.example.dbflute.tricky.dbflute.cbean.MemberSecurityCB;
import com.example.dbflute.tricky.dbflute.cbean.MemberWithdrawalCB;
import com.example.dbflute.tricky.dbflute.cbean.PurchaseCB;
import com.example.dbflute.tricky.dbflute.exbhv.MemberAddressBhv;
import com.example.dbflute.tricky.dbflute.exbhv.MemberLoginBhv;
import com.example.dbflute.tricky.dbflute.exbhv.MemberSecurityBhv;
import com.example.dbflute.tricky.dbflute.exbhv.MemberWithdrawalBhv;
import com.example.dbflute.tricky.dbflute.exbhv.PurchaseBhv;
import com.google.inject.AbstractModule;
import com.google.inject.Module;

/**
 * The test case with container.
 * @author jflute
 * @since 0.9.2 (2009/02/18 Wednesday)
 */
public abstract class AppContainerTestCase extends GuiceTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                         Common Column
    //                                         -------------
    /** The current session value of accessTimestamp. {Common Column on database} */
    protected Timestamp accessTimestamp;

    /** The current session value of accessUser. {Common Column on database} */
    protected String accessUser;

    /** The current session value of accessProcess. {Common Column on database} */
    protected String accessProcess;

    // -----------------------------------------------------
    //                                    Transaction Object
    //                                    ------------------
    /** The transaction manager for platform. {Transaction Object} */
    protected TransactionManager transactionManager;

    // -----------------------------------------------------
    //                                           Data Source
    //                                           -----------
    /** The data source for database connection. */
    protected DataSource dataSource;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() throws Exception {
        setupDataSource();
        super.setUp(); // is initializing the container
        initializeTestCaseAccessContext();
    }

    protected void setupDataSource() {
        dataSource = createDataSource();
    }

    protected DataSource createDataSource() {
        AtomikosNonXADataSourceBean bean = new AtomikosNonXADataSourceBean();
        bean.setUniqueResourceName("NONXADBMS");
        bean.setDriverClassName("org.sqlite.JDBC");
        EmbeddedSQLiteUrlFactoryBean factoryBean = new EmbeddedSQLiteUrlFactoryBean();
        factoryBean.setUrlSuffix("/exampledb/exampledb.db");
        factoryBean.setReferenceClassName(DBCurrent.class.getName());
        String url;
        try {
            url = factoryBean.getObject().toString();
        } catch (Exception e) {
            String msg = "The factoryBean was invalid: " + factoryBean;
            throw new IllegalStateException(msg, e);
        }
        bean.setUrl(url.toString());
        bean.setUser("sa");
        bean.setPassword("");
        bean.setPoolSize(20);
        bean.setBorrowConnectionTimeout(60);
        return bean;
    }

    @Override
    protected void setupApplicationModule(List<Module> moduleList) {
        moduleList.add(new DBFluteModule(dataSource));
    }

    @Override
    protected void setupTransactionModule(List<Module> moduleList) {
        moduleList.add(new TransactionModule(dataSource));
    }

    protected static class TransactionModule extends AbstractModule {

        protected DataSource dataSource;

        public TransactionModule(DataSource dataSource) {
            if (dataSource == null) {
                String msg = "The argument 'dataSource' should not be null!";
                throw new IllegalArgumentException(msg);
            }
            this.dataSource = dataSource;
        }

        @Override
        protected void configure() {
            try {
                UserTransactionImp userTransactionImp = new UserTransactionImp();
                userTransactionImp.setTransactionTimeout(300);
                UserTransactionManager userTransactionManager = new UserTransactionManager();
                userTransactionManager.setForceShutdown(true);
                userTransactionManager.init();
                bind(UserTransaction.class).toInstance(userTransactionImp);
                bind(TransactionManager.class).toInstance(userTransactionManager);

                bind(DataSource.class).toInstance(dataSource);
            } catch (SystemException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    @Override
    protected void beginTransaction() {
        try {
            transactionManager.begin();
        } catch (NotSupportedException e) {
            throw new IllegalStateException(e);
        } catch (SystemException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Initialize the context of access for common column auto set-up. <br />
     * You should implement this in your AOP class of front class
     * (for example Page class) at your real project.
     */
    protected void initializeTestCaseAccessContext() {
        accessTimestamp = currentTimestamp();
        accessUser = "testUser";
        accessProcess = DfTypeUtil.toClassTitle(this);
        initializeNewAccessContext();
    }

    protected void initializeNewAccessContext() {
        AccessContext context = new AccessContext();
        context.setAccessTimestamp(accessTimestamp);
        context.setAccessUser(accessUser);
        context.setAccessProcess(accessProcess + "[" + Thread.currentThread().getName() + "]");
        AccessContext.setAccessContextOnThread(context);
    }

    @Override
    public void tearDown() throws Exception {
        destroyAccessContext();
        super.tearDown();
    }

    /**
     * Destroy the context of access in thread local.
     * You should implement this in your AOP class of front class
     * (for example Page class) at your real project.
     */
    protected void destroyAccessContext() {
        AccessContext.clearAccessContextOnThread();
    }

    @Override
    protected void rollbackTransaction() {
        try {
            transactionManager.rollback();
        } catch (SystemException e) {
            throw new IllegalStateException(e);
        }
    }

    // ===================================================================================
    //                                                                   DataSource Helper
    //                                                                   =================
    protected DataSource getDataSource() {
        return dataSource;
    }

    protected DatabaseMetaData getDatabaseMetaData() {
        try {
            return getDataSource().getConnection().getMetaData();
        } catch (SQLException e) {
            throw new SQLFailureException("Failed to get meta data!", e);
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
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
}
