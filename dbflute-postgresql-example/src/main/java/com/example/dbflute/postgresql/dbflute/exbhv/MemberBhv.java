package com.example.dbflute.postgresql.dbflute.exbhv;

import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.example.dbflute.postgresql.dbflute.exbhv.cursor.PurchaseSummaryMemberCursor;
import com.example.dbflute.postgresql.dbflute.exbhv.cursor.PurchaseSummaryMemberCursorHandler;
import com.example.dbflute.postgresql.dbflute.exbhv.pmbean.PurchaseSummaryMemberPmb;


/**
 * The behavior of member. <br />
 * You can implement your original methods here. <br />
 * This class is NOT overrided when re-generating. <br />
 * 
 * @author DBFlute(AutoGenerator)
 */
public class MemberBhv extends com.example.dbflute.postgresql.dbflute.bsbhv.BsMemberBhv {
    
    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance for sub class. */
    private static final Log _log = LogFactory.getLog(MemberBhv.class);

    // ===================================================================================
    //                                                                          CSV Output
    //                                                                          ==========
    /**
     * 会員の購入数の集計CSVを作成する。<br />
     * 大量件数になる可能性があるため、カーソルフェッチで実現している。<br />
     * 「現場ソリューション DBFlute」における「大量件数」の例題。<br />
     * 
     * @param pmb The parameter bean of Purchase Summary Member. (NotNull)
     */
    public void makeCsvPurchaseSummaryMember(PurchaseSummaryMemberPmb pmb) {
        final PurchaseSummaryMemberCursorHandler handler = new PurchaseSummaryMemberCursorHandler() {
            public Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                while (cursor.next()) {
                    final Integer memberId = cursor.getMemberId();
                    final String memberName = cursor.getMemberName();
                    final Long purchaseSummary = cursor.getPurchaseSummary();

                    // ここではただログに出力するだけ
                    // (本当はCSVファイルへの出力)
                    _log.debug("  " + memberId + ", " + memberName + ", " + purchaseSummary);

                }// ResultSetのCloseはFrameworkが行うので必要なし
                return null;// ここで処理が完結してるので戻り値は不要
            }
        };
        outsideSql().cursorHandling().selectCursor(PATH_selectPurchaseSummaryMember, pmb, handler);
    }
}
