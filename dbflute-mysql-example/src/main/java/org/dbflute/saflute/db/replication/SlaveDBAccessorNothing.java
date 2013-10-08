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

/**
 * @author jflute
 */
public class SlaveDBAccessorNothing implements SlaveDBAccessor {

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
        return callback.callback();
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
        return callback.callback();
    }
}
