package com.example.dbflute.oracle.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.bs.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of VENDOR_CHECK.
 * @author oracleman
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
    protected ConditionValue getCValueTypeOfNchar() { return _myCQ.getTypeOfNchar(); }
    protected ConditionValue getCValueTypeOfVarchar2() { return _myCQ.getTypeOfVarchar2(); }
    protected ConditionValue getCValueTypeOfVarchar2Max() { return _myCQ.getTypeOfVarchar2Max(); }
    protected ConditionValue getCValueTypeOfNvarchar2() { return _myCQ.getTypeOfNvarchar2(); }
    protected ConditionValue getCValueTypeOfClob() { return _myCQ.getTypeOfClob(); }
    protected ConditionValue getCValueTypeOfNclob() { return _myCQ.getTypeOfNclob(); }
    protected ConditionValue getCValueTypeOfLong() { return _myCQ.getTypeOfLong(); }
    protected ConditionValue getCValueTypeOfXmltype() { return _myCQ.getTypeOfXmltype(); }
    protected ConditionValue getCValueTypeOfNumberInteger() { return _myCQ.getTypeOfNumberInteger(); }
    protected ConditionValue getCValueTypeOfNumberBigint() { return _myCQ.getTypeOfNumberBigint(); }
    protected ConditionValue getCValueTypeOfNumberDecimal() { return _myCQ.getTypeOfNumberDecimal(); }
    protected ConditionValue getCValueTypeOfNumberIntegerMin() { return _myCQ.getTypeOfNumberIntegerMin(); }
    protected ConditionValue getCValueTypeOfNumberIntegerMax() { return _myCQ.getTypeOfNumberIntegerMax(); }
    protected ConditionValue getCValueTypeOfNumberBigintMin() { return _myCQ.getTypeOfNumberBigintMin(); }
    protected ConditionValue getCValueTypeOfNumberBigintMax() { return _myCQ.getTypeOfNumberBigintMax(); }
    protected ConditionValue getCValueTypeOfNumberSuperintMin() { return _myCQ.getTypeOfNumberSuperintMin(); }
    protected ConditionValue getCValueTypeOfNumberSuperintMax() { return _myCQ.getTypeOfNumberSuperintMax(); }
    protected ConditionValue getCValueTypeOfNumberMaxdecimal() { return _myCQ.getTypeOfNumberMaxdecimal(); }
    protected ConditionValue getCValueTypeOfInteger() { return _myCQ.getTypeOfInteger(); }
    protected ConditionValue getCValueTypeOfBinaryFloat() { return _myCQ.getTypeOfBinaryFloat(); }
    protected ConditionValue getCValueTypeOfBinaryDouble() { return _myCQ.getTypeOfBinaryDouble(); }
    protected ConditionValue getCValueTypeOfDate() { return _myCQ.getTypeOfDate(); }
    protected ConditionValue getCValueTypeOfTimestamp() { return _myCQ.getTypeOfTimestamp(); }
    protected ConditionValue getCValueTypeOfIntervalYearToMonth() { return _myCQ.getTypeOfIntervalYearToMonth(); }
    protected ConditionValue getCValueTypeOfIntervalDayToSecond() { return _myCQ.getTypeOfIntervalDayToSecond(); }
    protected ConditionValue getCValueTypeOfBlob() { return _myCQ.getTypeOfBlob(); }
    protected ConditionValue getCValueTypeOfRaw() { return _myCQ.getTypeOfRaw(); }
    protected ConditionValue getCValueTypeOfBfile() { return _myCQ.getTypeOfBfile(); }
    protected ConditionValue getCValueTypeOfRowid() { return _myCQ.getTypeOfRowid(); }
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
