package com.example.dbflute.mysql.friends.seasar.enclave.service;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dbflute.saflute.db.replication.SlaveDBAccessor;

/**
 * @author jflute
 */
public class EnclaveBasicService {

    /** Log instance for sub class. */
    private static final Log _log = LogFactory.getLog(EnclaveBasicService.class);

    @Resource
    protected SlaveDBAccessor slaveDBAccessor;

    public void checkJdbcComponentInjection() {
        if (_log.isDebugEnabled()) {
            _log.debug("slaveDBAccessor: " + slaveDBAccessor);
        }
        if (slaveDBAccessor == null) {
            String msg = "slaveDBAccessor was null.";
            throw new IllegalStateException(msg);
        }
    }
}
