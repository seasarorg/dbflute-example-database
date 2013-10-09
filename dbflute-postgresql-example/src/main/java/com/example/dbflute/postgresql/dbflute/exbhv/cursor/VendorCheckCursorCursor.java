package com.example.dbflute.postgresql.dbflute.exbhv.cursor;

import java.sql.SQLException;

import com.example.dbflute.postgresql.mytype.MyArray;
import com.example.dbflute.postgresql.mytype.MyArrayType;

/**
 * The cursor of VendorCheckCursor.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class VendorCheckCursorCursor extends com.example.dbflute.postgresql.dbflute.bsbhv.cursor.BsVendorCheckCursorCursor {
    
    protected MyArrayType _arrayType = new MyArrayType();
    
    @Override
    public MyArray getTypeOfVcArray() throws SQLException {
        return (MyArray)_arrayType.getValue(_rs, "type_of_vc_array");
    }
}
