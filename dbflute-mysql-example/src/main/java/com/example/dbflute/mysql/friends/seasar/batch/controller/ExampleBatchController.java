package com.example.dbflute.mysql.friends.seasar.batch.controller;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.dbflute.cbean.EntityRowHandler;
import org.seasar.extension.tx.annotation.RequiredTx;
import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchController;

/**
 * @author jflute
 * @since 0.9.1 (2009/02/07 Saturday)
 */
public class ExampleBatchController implements BatchController {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance for sub class. */
    private static final Log _log = LogFactory.getLog(ExampleBatchController.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Binding(bindingType = BindingType.MUST)
    protected MemberBhv memberBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    public void execute(List<String> argList) {
        if (argList.isEmpty()) {
            String msg = "The argument should have prefix as first argument!";
            throw new IllegalArgumentException(msg);
        }
        String memberNamePrefix = argList.get(0);
        transferMember(memberNamePrefix);
    }

    protected void transferMember(String memberNamePrefix) {
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_PrefixSearch(memberNamePrefix);
        cb.query().setMemberStatusCode_Equal_Formalized();
        memberBhv.selectCursor(cb, new EntityRowHandler<Member>() {
            public void handle(Member entity) {
                insertOther(entity);
            }
        });
    }

    // ===================================================================================
    //                                                                   Transaction Logic
    //                                                                   =================
    @RequiredTx
    public void insertOther(Member entity) {
        // Actually you should implement real business logic.
        Integer memberId = entity.getMemberId();
        String memberName = entity.getMemberName();
        Date birthdate = entity.getBirthdate();
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        _log.debug("entity: " + memberId + ", " + memberName + ", " + birthdate);
        _log.debug("- - - - - - - - - -/");
    }
}
