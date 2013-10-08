package com.example.dbflute.mysql.friends.seasar.tricky;

import com.example.dbflute.mysql.friends.seasar.tricky.TrickyAction;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class TrickyActionTest extends UnitContainerTestCase {

    @Override
    protected boolean isSuppressWebMock() {
        return false;
    }

    public void test_inject_tricky_dependency_requestValid() throws Exception {
        TrickyAction action = new TrickyAction();
        inject(action); // expect no exception
    }
}
