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
package com.example.dbflute.mysql.dbflute.exentity;

import com.example.dbflute.mysql.dbflute.bsentity.BsWhiteCompoundReferredPrimary;

/**
 * The entity of white_compound_referred_primary.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundReferredPrimary extends BsWhiteCompoundReferredPrimary {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    /** MAX_FIRST_ID: Derived Referrer Alias. */
    public static final String ALIAS_maxFirstId = "MAX_FIRST_ID";
    /** MAX_FIRST_ID: (Derived Referrer) */
    protected Integer _maxFirstId;
    /**
     * [get] MAX_FIRST_ID: (Derived Referrer)
     * @return The value of the column 'MAX_FIRST_ID'. (NullAllowed)
     */
    public Integer getMaxFirstId() {
        return _maxFirstId;
    }
    /**
     * [set] MAX_FIRST_ID: (Derived Referrer)
     * @param maxFirstId The value of the column 'MAX_FIRST_ID'. (NullAllowed)
     */
    public void setMaxFirstId(Integer maxFirstId) {
        _maxFirstId = maxFirstId;
    }
}
