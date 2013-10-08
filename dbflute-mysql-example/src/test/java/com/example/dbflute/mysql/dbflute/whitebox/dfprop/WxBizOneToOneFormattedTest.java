package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.CallbackContext;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.jdbc.SqlLogHandler;
import org.seasar.dbflute.jdbc.SqlLogInfo;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxBizOneToOneFormattedTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;

    public void test_formatted_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberAddressAsFormattedBasic(currentDate());

        // ## Act ##
        final List<String> sqlList = new ArrayList<String>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                sqlList.add(info.getDisplaySql());
            }
        });
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        String sql = sqlList.get(0);
        log(ln() + sql);
        assertEquals(2, Srl.count(sql, "     and dfrel"));
    }

    public void test_formatted_long() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberAddressAsFormattedLong(currentDate());

        // ## Act ##
        final List<String> sqlList = new ArrayList<String>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                sqlList.add(info.getDisplaySql());
            }
        });
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        String sql = sqlList.get(0);
        log(ln() + sql);
        assertEquals(2, Srl.count(sql, "     and dfrel"));
    }

    public void test_formatted_many() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsFormattedMany();

        // ## Act ##
        final List<String> sqlList = new ArrayList<String>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                sqlList.add(info.getDisplaySql());
            }
        });
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        String sql = sqlList.get(0);
        log(ln() + sql);
        assertEquals(5, Srl.count(sql, "\n                         left outer join "));
        assertEquals(1, Srl.count(sql, "\n                      where dffixedjoin"));
        assertEquals(4, Srl.count(sql, "\n                        and dffixedjoin"));
        assertEquals(2, Srl.count(sql, "\n     and dfrel"));
    }
}