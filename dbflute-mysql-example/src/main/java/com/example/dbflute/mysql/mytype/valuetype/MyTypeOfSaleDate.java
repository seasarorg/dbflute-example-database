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
package com.example.dbflute.mysql.mytype.valuetype;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.seasar.dbflute.s2dao.valuetype.TnAbstractValueType;

import com.example.dbflute.mysql.mytype.MySaleDate;

/**
 * @author jflute
 * @since 1.0.5D (2014/03/21 Friday)
 */
public class MyTypeOfSaleDate extends TnAbstractValueType {

    public MyTypeOfSaleDate() {
        super(Types.BIGINT);
    }

    public Object getValue(ResultSet rs, int index) throws SQLException {
        Long value = rs.getLong(index);
        return value != null ? new MySaleDate().setup(value) : null;
    }

    public Object getValue(ResultSet rs, String columnName) throws SQLException {
        Long value = rs.getLong(columnName);
        return value != null ? new MySaleDate().setup(value) : null;
    }

    public Object getValue(CallableStatement cs, int index) throws SQLException {
        Long value = cs.getLong(index);
        return value != null ? new MySaleDate().setup(value) : null;
    }

    public Object getValue(CallableStatement cs, String parameterName) throws SQLException {
        Long value = cs.getLong(parameterName);
        return value != null ? new MySaleDate().setup(value) : null;
    }

    public void bindValue(Connection conn, PreparedStatement ps, int index, Object value) throws SQLException {
        if (value == null) {
            setNull(ps, index);
        } else {
            MySaleDate date = (MySaleDate) value;
            ps.setLong(index, date.getValue());
        }
    }

    public void bindValue(Connection conn, CallableStatement cs, String parameterName, Object value)
            throws SQLException {
        if (value == null) {
            setNull(cs, parameterName);
        } else {
            MySaleDate date = (MySaleDate) value;
            cs.setLong(parameterName, date.getValue());
        }
    }
}
