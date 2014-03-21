/*
 * Copyright 2004-2014 the Seasar Foundation and the Others.
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
package com.example.dbflute.mysql.mytype;

/**
 * @author jflute
 * @since 1.0.5D (2014/03/21 Friday)
 */
public class MyPriceCount {

    protected Integer _value;

    public MyPriceCount setup(Integer value) {
        _value = value;
        return this;
    }

    @Override
    public String toString() {
        return _value != null ? _value.toString() : "null";
    }

    public Integer getValue() {
        return _value;
    }

    public void setValue(Integer value) {
        this._value = value;
    }
}
