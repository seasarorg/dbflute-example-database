package com.example.dbflute.postgresql.mytype.valuetype;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.seasar.dbflute.s2dao.valuetype.TnAbstractValueType;

import com.example.dbflute.postgresql.mytype.MyXML;

/**
 * Simple example of extending Array Type.
 * @author jflute
 */
public class MyTypeOfXML extends TnAbstractValueType {

    public MyTypeOfXML() {
        super(Types.OTHER);
    }

    public Object getValue(ResultSet resultSet, int index) throws SQLException {
        String xmlString = resultSet.getString(index);
        return xmlString != null ? new MyXML().setup(xmlString) : null;
    }

    public Object getValue(ResultSet resultSet, String columnName) throws SQLException {
        String xmlString = resultSet.getString(columnName);
        return xmlString != null ? new MyXML().setup(xmlString) : null;
    }

    public Object getValue(CallableStatement cs, int index) throws SQLException {
        String xmlString = cs.getString(index);
        return xmlString != null ? new MyXML().setup(xmlString) : null;
    }

    public Object getValue(CallableStatement cs, String parameterName) throws SQLException {
        String xmlString = cs.getString(parameterName);
        return xmlString != null ? new MyXML().setup(xmlString) : null;
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
