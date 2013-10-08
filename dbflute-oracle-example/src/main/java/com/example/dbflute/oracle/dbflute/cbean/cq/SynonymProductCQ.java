package com.example.dbflute.oracle.dbflute.cbean.cq;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import com.example.dbflute.oracle.dbflute.cbean.cq.bs.BsSynonymProductCQ;

/**
 * The condition-query of SYNONYM_PRODUCT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author oracleman
 */
public class SynonymProductCQ extends BsSynonymProductCQ {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     * @param referrerQuery The instance of referrer query. (Nullable: If null, this is base query)
     * @param sqlClause The instance of SQL clause. (NotNull)
     * @param aliasName The alias name for this query. (NotNull)
     * @param nestLevel The nest level of this query. (If zero, this is base query)
     */
    public SynonymProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }
	
    // ===================================================================================
    //                                                                      Arrange Method
    //                                                                      ==============
	// You can make original arrange query methods here.
	// public void arrangeXxx() {
	//     ...
	// }
}
