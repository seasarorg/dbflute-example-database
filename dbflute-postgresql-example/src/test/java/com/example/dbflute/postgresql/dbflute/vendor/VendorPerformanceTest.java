package com.example.dbflute.postgresql.dbflute.vendor;

import org.seasar.dbflute.resource.DBFluteSystem;
import org.seasar.dbflute.util.DfTraceViewUtil;

import com.example.dbflute.postgresql.dbflute.cbean.MemberCB;
import com.example.dbflute.postgresql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.2 (2010/06/15 Tuesday)
 */
public class VendorPerformanceTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    public void test_selectEntity() {
        // ## Arrange ##
        long count = 1000L;
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(3);

        // ## Act ##
        long before = DBFluteSystem.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            memberBhv.selectEntity(cb);
        }
        long after = DBFluteSystem.currentTimeMillis();

        // ## Assert ##
        long avg = (after - before) / count;
        log(DfTraceViewUtil.convertToPerformanceView(avg));
    }

    public void test_selectList() {
        // ## Arrange ##
        long count = 1000L;
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.query().addOrderBy_MemberName_Desc();

        // ## Act ##
        long before = DBFluteSystem.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            memberBhv.selectList(cb);
        }
        long after = DBFluteSystem.currentTimeMillis();

        // ## Assert ##
        long avg = (after - before) / count;
        log(DfTraceViewUtil.convertToPerformanceView(avg));
    }
}
