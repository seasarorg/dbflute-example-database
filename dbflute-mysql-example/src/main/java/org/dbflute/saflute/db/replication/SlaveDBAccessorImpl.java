/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.dbflute.saflute.db.replication;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.dbflute.CallbackContext;
import org.seasar.dbflute.bhv.core.BehaviorCommandHook;
import org.seasar.dbflute.bhv.core.BehaviorCommandMeta;
import org.seasar.extension.datasource.DataSourceFactory;

/**
 * @author jflute
 */
public class SlaveDBAccessorImpl implements SlaveDBAccessor {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance for sub class. */
    private static final Log _log = LogFactory.getLog(SlaveDBAccessorImpl.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    protected DataSourceFactory dataSourceFactory;

    // ===================================================================================
    //                                                                      SlaveDB Access
    //                                                                      ==============
    // -----------------------------------------------------
    //                                               Fixedly
    //                                               -------
    /**
     * {@inheritDoc}
     */
    public <RESULT> RESULT accessFixedly(SlaveDBCallback<RESULT> callback) {
        if (callback == null) {
            String msg = "The argument 'callback' should not be null.";
            throw new IllegalArgumentException(msg);
        }
        return doAccessFixedly(callback);
    }

    protected <RESULT> RESULT doAccessFixedly(SlaveDBCallback<RESULT> callback) {
        if (callback == null) {
            String msg = "The argument 'callback' should not be null.";
            throw new IllegalArgumentException(msg);
        }
        final String currentName = dataSourceFactory.getSelectableDataSourceName();
        try {
            final String slaveDB = SLAVE_DB;
            if (_log.isDebugEnabled()) {
                _log.debug("...Accessing to SlaveDB: " + slaveDB);
            }
            setupForcedMasterCallback();
            dataSourceFactory.setSelectableDataSourceName(slaveDB);
            return callback.callback();
        } finally {
            dataSourceFactory.setSelectableDataSourceName(currentName);
            clearForcedMasterCallback();
        }
    }

    // -----------------------------------------------------
    //                                         Random Access
    //                                         -------------
    /**
     * {@inheritDoc}
     */
    public <RESULT> RESULT accessRandomFifty(SlaveDBCallback<RESULT> callback, long determinationNumber) {
        if (callback == null) {
            String msg = "The argument 'callback' should not be null.";
            throw new IllegalArgumentException(msg);
        }
        if (isRandomFiftyHit(determinationNumber)) {
            return doAccessFixedly(callback);
        } else {
            return callback.callback();
        }
    }

    protected boolean isRandomFiftyHit(long determinationNumber) {
        return (determinationNumber % 2) == 0;
    }

    // ===================================================================================
    //                                                                       Forced Master
    //                                                                       =============
    protected void setupForcedMasterCallback() {
        CallbackContext.setBehaviorCommandHookOnThread(new BehaviorCommandHook() {

            protected String currentName;
            protected boolean forcedSet;

            public void hookBefore(BehaviorCommandMeta meta) {
                if (needsForcedMasterCommand(meta)) {
                    final String masterDB = MASTER_DB;
                    currentName = dataSourceFactory.getSelectableDataSourceName();
                    if (!masterDB.equals(currentName)) {
                        if (_log.isDebugEnabled()) {
                            _log.debug("...Accessing to MasterDB forcedly: " + masterDB);
                        }
                        dataSourceFactory.setSelectableDataSourceName(masterDB);
                        forcedSet = true;
                    }
                }
            }

            protected boolean needsForcedMasterCommand(BehaviorCommandMeta meta) {
                return !meta.isSelect();
            }

            public void hookFinally(BehaviorCommandMeta meta, RuntimeException cause) {
                if (forcedSet) {
                    dataSourceFactory.setSelectableDataSourceName(currentName);
                }
            }
        });
    }

    protected void clearForcedMasterCallback() {
        CallbackContext.clearBehaviorCommandHookOnThread();
    }
}
