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
package com.example.dbflute.mysql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_GEARED_CIPHER as TABLE. <br />
 * <pre>
 * [primary key]
 *     CIPHER_ID
 *
 * [column]
 *     CIPHER_ID, CIPHER_INTEGER, CIPHER_VARCHAR, CIPHER_DATE, CIPHER_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CIPHER_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteGearedCipher {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteGearedCipher> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteGearedCipherBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteGearedCipher ready(List<WhiteGearedCipher> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteGearedCipherBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteGearedCipherBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteGearedCipher> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
