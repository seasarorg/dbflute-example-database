package com.example.dbflute.postgresql.dbflute.cbean.cq;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import com.example.dbflute.postgresql.dbflute.cbean.cq.bs.BsWhiteSameNameRefCQ;

/**
 * The condition-query of white_same_name_ref.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSameNameRefCQ extends BsWhiteSameNameRefCQ {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
	// You should NOT touch with this constructor.
    /**
     * Constructor.
     * @param referrerQuery The instance of referrer query. (NullAllowed: If null, this is base query)
     * @param sqlClause The instance of SQL clause. (NotNull)
     * @param aliasName The alias name for this query. (NotNull)
     * @param nestLevel The nest level of this query. (If zero, this is base query)
     */
    public WhiteSameNameRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                       Arrange Query
    //                                                                       =============
    // You can make your arranged query methods here.
    //public void arrangeXxx() {
    //    ...
    //}
}
