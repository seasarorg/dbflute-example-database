package com.example.dbflute.oracle.dbflute.allcommon;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.bhv.core.CommonColumnAutoSetupper;

/**
 * The basic implementation of the auto set-upper of common column.
 * @author oracleman
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

        final java.util.Date registerDatetime = org.seasar.dbflute.AccessContext.getAccessDateOnThread();
        entity.setRegisterDatetime(registerDatetime);

        final String registerUser = org.seasar.dbflute.AccessContext.getAccessUserOnThread();
        entity.setRegisterUser(registerUser);

        final String registerProcess = org.seasar.dbflute.AccessContext.getAccessProcessOnThread();
        entity.setRegisterProcess(registerProcess);

        final java.util.Date updateDatetime = entity.getRegisterDatetime();
        entity.setUpdateDatetime(updateDatetime);

        final String updateUser = entity.getRegisterUser();
        entity.setUpdateUser(updateUser);

        final String updateProcess = entity.getRegisterProcess();
        entity.setUpdateProcess(updateProcess);
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

        final java.util.Date updateDatetime = org.seasar.dbflute.AccessContext.getAccessDateOnThread();
        entity.setUpdateDatetime(updateDatetime);

        final String updateUser = org.seasar.dbflute.AccessContext.getAccessUserOnThread();
        entity.setUpdateUser(updateUser);

        final String updateProcess = org.seasar.dbflute.AccessContext.getAccessProcessOnThread();
        entity.setUpdateProcess(updateProcess);
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
