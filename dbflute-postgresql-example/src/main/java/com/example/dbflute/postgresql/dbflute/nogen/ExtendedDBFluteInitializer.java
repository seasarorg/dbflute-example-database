package com.example.dbflute.postgresql.dbflute.nogen;

import javax.sql.DataSource;

import com.example.dbflute.postgresql.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.postgresql.dbflute.allcommon.DBFluteInitializer;
import com.example.dbflute.postgresql.mytype.MyArray;
import com.example.dbflute.postgresql.mytype.MyArrayType;
import com.example.dbflute.postgresql.mytype.MyXML;
import com.example.dbflute.postgresql.mytype.MyXMLType;

/**
 * @author jflute
 */
public class ExtendedDBFluteInitializer extends DBFluteInitializer {

    public ExtendedDBFluteInitializer(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected void prologue() {
        super.prologue();

        DBFluteConfig config = DBFluteConfig.getInstance();
        config.unlock();
        config.registerBasicValueType(MyArray.class, new MyArrayType());
        config.registerBasicValueType(MyXML.class, new MyXMLType());
        config.lock();
    }
}
