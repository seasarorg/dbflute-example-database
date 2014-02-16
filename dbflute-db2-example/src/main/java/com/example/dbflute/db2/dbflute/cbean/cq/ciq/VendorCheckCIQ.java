package com.example.dbflute.db2.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.db2.dbflute.cbean.*;
import com.example.dbflute.db2.dbflute.cbean.cq.bs.*;
import com.example.dbflute.db2.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
public class VendorCheckCIQ extends AbstractBsVendorCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsVendorCheckCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public VendorCheckCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsVendorCheckCQ myCQ) {
        super(childQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    @Override
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq) {
        String msg = "InlineView must not need UNION method: " + bq + " : " + uq;
        throw new IllegalConditionBeanOperationException(msg);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col) {
        regIQ(k, v, cv, col);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op) {
        regIQ(k, v, cv, col, op);
    }

    @Override
    protected void registerWhereClause(String wc) {
        registerInlineWhereClause(wc);
    }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) {
            throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported.");
        }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue getCValueVendorCheckId() { return _myCQ.getVendorCheckId(); }
    protected ConditionValue getCValueTypeOfChar() { return _myCQ.getTypeOfChar(); }
    protected ConditionValue getCValueTypeOfCharForBitData() { return _myCQ.getTypeOfCharForBitData(); }
    protected ConditionValue getCValueTypeOfVarchar() { return _myCQ.getTypeOfVarchar(); }
    protected ConditionValue getCValueTypeOfVarcharForBitData() { return _myCQ.getTypeOfVarcharForBitData(); }
    protected ConditionValue getCValueTypeOfClob() { return _myCQ.getTypeOfClob(); }
    protected ConditionValue getCValueTypeOfDbclob() { return _myCQ.getTypeOfDbclob(); }
    protected ConditionValue getCValueTypeOfDecimalDecimal() { return _myCQ.getTypeOfDecimalDecimal(); }
    protected ConditionValue getCValueTypeOfDecimalInteger() { return _myCQ.getTypeOfDecimalInteger(); }
    protected ConditionValue getCValueTypeOfDecimalBigint() { return _myCQ.getTypeOfDecimalBigint(); }
    protected ConditionValue getCValueTypeOfSmallint() { return _myCQ.getTypeOfSmallint(); }
    protected ConditionValue getCValueTypeOfInteger() { return _myCQ.getTypeOfInteger(); }
    protected ConditionValue getCValueTypeOfBigint() { return _myCQ.getTypeOfBigint(); }
    protected ConditionValue getCValueTypeOfFloat() { return _myCQ.getTypeOfFloat(); }
    protected ConditionValue getCValueTypeOfDouble() { return _myCQ.getTypeOfDouble(); }
    protected ConditionValue getCValueTypeOfReal() { return _myCQ.getTypeOfReal(); }
    protected ConditionValue getCValueTypeOfDate() { return _myCQ.getTypeOfDate(); }
    protected ConditionValue getCValueTypeOfTime() { return _myCQ.getTypeOfTime(); }
    protected ConditionValue getCValueTypeOfTimestamp() { return _myCQ.getTypeOfTimestamp(); }
    protected ConditionValue getCValueTypeOfBlob() { return _myCQ.getTypeOfBlob(); }
    protected ConditionValue getCValueTypeOfGraphic() { return _myCQ.getTypeOfGraphic(); }
    protected ConditionValue getCValueTypeOfVargraphic() { return _myCQ.getTypeOfVargraphic(); }
    protected ConditionValue getCValueTypeOfLongVargraphic() { return _myCQ.getTypeOfLongVargraphic(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(VendorCheckCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(VendorCheckCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(VendorCheckCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(VendorCheckCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(VendorCheckCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return VendorCheckCB.class.getName(); }
    protected String xinCQ() { return VendorCheckCQ.class.getName(); }
}
