package com.example.dbflute.mysql.friends.seasar.enclave.service;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author jflute
 */
public class EnclaveRefService {

    /** Log instance for sub class. */
    private static final Log _log = LogFactory.getLog(EnclaveRefService.class);

    @Resource
    protected EnclaveBasicService enclaveBasicService;

    public void checkIndirectJdbcComponentInjection() {
        if (_log.isDebugEnabled()) {
            _log.debug("enclaveBasicService: " + enclaveBasicService);
        }
        if (enclaveBasicService == null) {
            String msg = "enclaveBasicService was null.";
            throw new IllegalStateException(msg);
        }
    }
}
