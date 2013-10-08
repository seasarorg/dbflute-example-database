package com.example.dbflute.oracle.dbflute.exbhv;

import java.math.BigDecimal;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.example.dbflute.oracle.dbflute.exbhv.cursor.PurchaseSummaryMemberCursor;
import com.example.dbflute.oracle.dbflute.exbhv.cursor.PurchaseSummaryMemberCursorHandler;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.PurchaseSummaryMemberPmb;


/**
 * The behavior of MEMBER. <br />
 * You can implement your original methods here. <br />
 * This class is NOT overrided when re-generating. <br />
 * 
 * @author DBFlute(AutoGenerator)
 */
public class MemberBhv extends com.example.dbflute.oracle.dbflute.bsbhv.BsMemberBhv {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance for sub class. */
    private static final Log _log = LogFactory.getLog(MemberBhv.class);

    // ===================================================================================
    //                                                                          Csv Output
    //                                                                          ==========
    /**
     * @param pmb The parameter bean of Purchase Summary Member. (NotNull)
     */
    public void makeCsvPurchaseSummaryMember(PurchaseSummaryMemberPmb pmb) {
        final PurchaseSummaryMemberCursorHandler handler = new PurchaseSummaryMemberCursorHandler() {
            public Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                while (cursor.next()) {
                    final Long memberId = cursor.getMemberId();
                    final String memberName = cursor.getMemberName();
                    final BigDecimal purchaseSummary = cursor.getPurchaseSummary();

                    _log.debug("  " + memberId + ", " + memberName + ", " + purchaseSummary);

                }
                return null;
            }
        };
        outsideSql().cursorHandling().selectCursor(PATH_selectPurchaseSummaryMember, pmb, handler);
    }
}
