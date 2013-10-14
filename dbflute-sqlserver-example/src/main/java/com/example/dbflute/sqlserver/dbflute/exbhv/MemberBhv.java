package com.example.dbflute.sqlserver.dbflute.exbhv;

import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.example.dbflute.sqlserver.dbflute.exbhv.cursor.PurchaseSummaryMemberCursor;
import com.example.dbflute.sqlserver.dbflute.exbhv.cursor.PurchaseSummaryMemberCursorHandler;
import com.example.dbflute.sqlserver.dbflute.exbhv.pmbean.PurchaseSummaryMemberPmb;

/**
 * The behavior of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public class MemberBhv extends com.example.dbflute.sqlserver.dbflute.bsbhv.BsMemberBhv {

    // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    // このクラスは、GenerationGapパターンにおけるExtendedクラスなため、
    // プロジェクト独自のメソッドを追加することが可能。(再自動生成時に上書きされない)
    // - - - - - - - - - -/

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance for sub class. */
    private static final Log _log = LogFactory.getLog(MemberBhv.class);

    // ===================================================================================
    //                                                                          CSV Output
    //                                                                          ==========
    /**
     * 会員の購入数の集計CSVを作成する。
     * 大量件数になる可能性があるため、カーソルフェッチで実現している。
     * 「現場ソリューション DBFlute」における「大量件数」の例題。
     * @param pmb The parameter bean of Purchase Summary Member. (NotNull)
     */
    public void makeCsvPurchaseSummaryMember(PurchaseSummaryMemberPmb pmb) {
        final PurchaseSummaryMemberCursorHandler handler = new PurchaseSummaryMemberCursorHandler() {
            public Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                while (cursor.next()) {
                    final Integer memberId = cursor.getMemberId();
                    final String memberName = cursor.getMemberName();
                    final Integer purchaseSummary = cursor.getPurchaseSummary();

                    // ここではただログに出力するだけ
                    // (本当はCSVファイルへの出力)
                    _log.debug("  " + memberId + " - " + memberName + " - " + purchaseSummary);

                }// ResultSetのCloseはFrameworkが行うので必要なし
                return null;// ここで処理が完結してるので戻り値は不要
            }
        };
        outsideSql().cursorHandling().selectCursor(PATH_selectPurchaseSummaryMember, pmb, handler);
    }
}
