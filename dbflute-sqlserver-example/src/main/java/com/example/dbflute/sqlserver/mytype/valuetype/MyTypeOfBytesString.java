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
package com.example.dbflute.sqlserver.mytype.valuetype;

import java.io.UnsupportedEncodingException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.seasar.dbflute.s2dao.valuetype.TnAbstractValueType;

/**
 * @author jflute
 * @since 1.0.5D (2014/03/21 Friday)
 */
public class MyTypeOfBytesString extends TnAbstractValueType {

    public MyTypeOfBytesString() {
        super(Types.VARCHAR);
    }

    public Object getValue(ResultSet rs, int index) throws SQLException {
        byte[] bytes = rs.getBytes(index);
        return bytes != null ? newString(bytes) : null;
    }

    public Object getValue(ResultSet rs, String columnName) throws SQLException {
        byte[] bytes = rs.getBytes(columnName);
        return bytes != null ? newString(bytes) : null;
    }

    public Object getValue(CallableStatement cs, int index) throws SQLException {
        byte[] bytes = cs.getBytes(index);
        return bytes != null ? newString(bytes) : null;
    }

    public Object getValue(CallableStatement cs, String parameterName) throws SQLException {
        byte[] bytes = cs.getBytes(parameterName);
        return bytes != null ? newString(bytes) : null;
    }

    protected String newString(byte[] bytes) {
        try {
            return new String(bytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    public void bindValue(Connection conn, PreparedStatement ps, int index, Object value) throws SQLException {
        if (value == null) {
            setNull(ps, index);
        } else {
            String str = (String) value;
            ps.setBytes(index, newBytes(str));
        }
    }

    public void bindValue(Connection conn, CallableStatement cs, String parameterName, Object value)
            throws SQLException {
        if (value == null) {
            setNull(cs, parameterName);
        } else {
            String str = (String) value;
            cs.setBytes(parameterName, newBytes(str));
        }
    }

    protected byte[] newBytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }
}
