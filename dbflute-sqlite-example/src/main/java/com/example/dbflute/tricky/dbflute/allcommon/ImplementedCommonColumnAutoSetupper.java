package com.example.dbflute.tricky.dbflute.allcommon;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.bhv.core.CommonColumnAutoSetupper;

/**
 * The basic implementation of the auto set-upper of common column.
 * @author DBFlute(AutoGenerator)
 */
public class ImplementedCommonColumnAutoSetupper implements CommonColumnAutoSetupper {

    // =====================================================================================
    //                                                                            Definition
    //                                                                            ==========
    /** Log instance. */
    private static final Log _log = LogFactory.getLog(ImplementedCommonColumnAutoSetupper.class);

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    // =====================================================================================
    //                                                                                Set up
    //                                                                                ======
    /**
     * {@inheritDoc}
     */
    public void handleCommonColumnOfInsertIfNeeds(Entity targetEntity) {
        final EntityDefinedCommonColumn entity = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "INSERT");
        }
        doHandleCommonColumnOfInsertIfNeeds(entity);
    }

    protected void doHandleCommonColumnOfInsertIfNeeds(EntityDefinedCommonColumn entity) {
        final java.sql.Timestamp tableNameRegisterDatetime = org.seasar.dbflute.AccessContext.getAccessTimestampOnThread();
        entity.setTableNameRegisterDatetime(tableNameRegisterDatetime);
        final String tableNameRegisterUser = org.seasar.dbflute.AccessContext.getAccessUserOnThread();
        entity.setTableNameRegisterUser(tableNameRegisterUser);
        final String tableNameRegisterProcess = org.seasar.dbflute.AccessContext.getAccessProcessOnThread();
        entity.setTableNameRegisterProcess(tableNameRegisterProcess);
        final java.sql.Timestamp tableNameUpdateDatetime = entity.getTableNameRegisterDatetime();
        entity.setTableNameUpdateDatetime(tableNameUpdateDatetime);
        final String tableNameUpdateUser = entity.getTableNameRegisterUser();
        entity.setTableNameUpdateUser(tableNameUpdateUser);
        final String tableNameUpdateProcess = entity.getTableNameRegisterProcess();
        entity.setTableNameUpdateProcess(tableNameUpdateProcess);
    }

    /**
     * {@inheritDoc}
     */
    public void handleCommonColumnOfUpdateIfNeeds(Entity targetEntity) {
        final EntityDefinedCommonColumn entity = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "UPDATE");
        }
        doHandleCommonColumnOfUpdateIfNeeds(entity);
    }

    protected void doHandleCommonColumnOfUpdateIfNeeds(EntityDefinedCommonColumn entity) {
        final java.sql.Timestamp tableNameUpdateDatetime = org.seasar.dbflute.AccessContext.getAccessTimestampOnThread();
        entity.setTableNameUpdateDatetime(tableNameUpdateDatetime);
        final String tableNameUpdateUser = org.seasar.dbflute.AccessContext.getAccessUserOnThread();
        entity.setTableNameUpdateUser(tableNameUpdateUser);
        final String tableNameUpdateProcess = org.seasar.dbflute.AccessContext.getAccessProcessOnThread();
        entity.setTableNameUpdateProcess(tableNameUpdateProcess);
    }

    // =====================================================================================
    //                                                                         Assist Helper
    //                                                                         =============
    protected EntityDefinedCommonColumn askIfEntitySetup(Entity targetEntity) {
        if (!hasCommonColumn(targetEntity)) {
            return null;
        }
        final EntityDefinedCommonColumn entity = downcastEntity(targetEntity);
        if (!canCommonColumnAutoSetup(entity)) {
            return null;
        }
        return entity;
    }

    protected boolean hasCommonColumn(Entity targetEntity) {
        return targetEntity instanceof EntityDefinedCommonColumn;
    }

    protected boolean canCommonColumnAutoSetup(EntityDefinedCommonColumn entity) {
        return entity.canCommonColumnAutoSetup();
    }

    protected EntityDefinedCommonColumn downcastEntity(Entity targetEntity) {
        return (EntityDefinedCommonColumn)targetEntity;
    }

    // =====================================================================================
    //                                                                               Logging
    //                                                                               =======
    protected boolean isInternalDebugEnabled() {
        return DBFluteConfig.getInstance().isInternalDebug() && _log.isDebugEnabled();
    }

    protected void logSettingUp(EntityDefinedCommonColumn entity, String keyword) {
        _log.debug("...Setting up column columns of " + entity.getTableDbName() + " before " + keyword);
    }
}
