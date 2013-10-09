package com.example.dbflute.postgresql.dbflute.bsbhv.cursor;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.seasar.dbflute.jdbc.CursorHandler;
import com.example.dbflute.postgresql.dbflute.exbhv.cursor.VendorCheckCursorCursor;

/**
 * The cursor handler of VendorCheckCursor.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorCheckCursorCursorHandler implements CursorHandler {

    /**
     * Handle the cursor.
     * @param rs The cursor (result set) for the query, which has first pointer. (NotNull)
     * @return The result object of handling process. (NullAllowed)
     * @throws SQLException
     */
    public Object handle(ResultSet rs) throws SQLException {
        return fetchCursor(createTypeSafeCursor(rs));
    }

    /**
     * Create the type-safe cursor.
     * @param rs The cursor (result set) for the query, which has first pointer. (NotNull)
     * @return The created type-safe cursor. (NotNull)
     * @throws SQLException
     */
    protected VendorCheckCursorCursor createTypeSafeCursor(ResultSet rs) throws SQLException {
        final VendorCheckCursorCursor cursor = new VendorCheckCursorCursor();
        cursor.accept(rs);
        return cursor;
    }

    /**
     * Fetch the cursor.
     * @param cursor The type-safe cursor for the query, which has first pointer. (NotNull)
     * @return The result object of handling process. (NullAllowed)
     * @throws SQLException
     */
    protected abstract Object fetchCursor(VendorCheckCursorCursor cursor) throws SQLException;
}
