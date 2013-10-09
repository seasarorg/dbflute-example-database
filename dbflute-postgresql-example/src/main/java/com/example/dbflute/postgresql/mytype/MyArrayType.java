package com.example.dbflute.postgresql.mytype;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.seasar.dbflute.s2dao.valuetype.TnAbstractValueType;

/**
 * Simple example of extending Array Type.
 * @author jflute
 */
public class MyArrayType extends TnAbstractValueType {

    public MyArrayType() {
        super(Types.OTHER);
    }

    public Object getValue(ResultSet resultSet, int index) throws SQLException {
        String arrayString = resultSet.getString(index);
        return arrayString != null ? new MyArray().setup(arrayString) : null;
    }

    public Object getValue(ResultSet resultSet, String columnName) throws SQLException {
        String arrayString = resultSet.getString(columnName);
        return arrayString != null ? new MyArray().setup(arrayString) : null;
    }

    public Object getValue(CallableStatement cs, int index) throws SQLException {
        String arrayString = cs.getString(index);
        return arrayString != null ? new MyArray().setup(arrayString) : null;
    }

    public Object getValue(CallableStatement cs, String parameterName) throws SQLException {
        String arrayString = cs.getString(parameterName);
        return arrayString != null ? new MyArray().setup(arrayString) : null;
    }

    public void bindValue(Connection conn, PreparedStatement ps, int index, Object value) throws SQLException {
        if (value == null) {
            setNull(ps, index);
        } else {
            ps.setObject(index, value, Types.OTHER);
        }
    }

    public void bindValue(Connection conn, CallableStatement cs, String parameterName, Object value)
            throws SQLException {
        if (value == null) {
            setNull(cs, parameterName);
        } else {
            cs.setObject(parameterName, value, Types.OTHER);
        }
    }
}
