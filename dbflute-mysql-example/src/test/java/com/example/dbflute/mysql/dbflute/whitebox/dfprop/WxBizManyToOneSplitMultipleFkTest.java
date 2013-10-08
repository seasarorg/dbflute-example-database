package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.mysql.dbflute.cbean.WhiteSplitMultipleFkBaseCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteSplitMultipleFkChildCB;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteSplitMultipleFkBaseBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteSplitMultipleFkChildBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteSplitMultipleFkNextBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteSplitMultipleFkRefBhv;
import com.example.dbflute.mysql.dbflute.exentity.WhiteSplitMultipleFkBase;
import com.example.dbflute.mysql.dbflute.exentity.WhiteSplitMultipleFkChild;
import com.example.dbflute.mysql.dbflute.exentity.WhiteSplitMultipleFkNext;
import com.example.dbflute.mysql.dbflute.exentity.WhiteSplitMultipleFkRef;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.0 (2012/10/26 Friday)
 */
public class WxBizManyToOneSplitMultipleFkTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteSplitMultipleFkBaseBhv whiteSplitMultipleFkBaseBhv;
    private WhiteSplitMultipleFkNextBhv whiteSplitMultipleFkNextBhv;
    private WhiteSplitMultipleFkRefBhv whiteSplitMultipleFkRefBhv;
    private WhiteSplitMultipleFkChildBhv whiteSplitMultipleFkChildBhv;

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    public void test_SplitMultipleFk_SetupSelect_firstRelation() throws Exception {
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
        doTest_SplitMultipleFk_SetupSelect_firstRelation(cb);
    }

    @SuppressWarnings("deprecation")
    public void test_SplitMultipleFk_SetupSelect_firstRelation_disableCache() throws Exception {
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
        cb.disableRelationMappingCache();
        doTest_SplitMultipleFk_SetupSelect_firstRelation(cb);
    }

    protected void doTest_SplitMultipleFk_SetupSelect_firstRelation(WhiteSplitMultipleFkBaseCB cb) throws Exception {
        // ## Arrange ##
        registerTestData();
        cb.setupSelect_WhiteSplitMultipleFkNext();
        cb.setupSelect_WhiteSplitMultipleFkRefAsSplitMultipleFkTest();
        cb.query().addOrderBy_BaseId_Asc();

        // ## Act ##
        ListResultBean<WhiteSplitMultipleFkBase> baseList = whiteSplitMultipleFkBaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(baseList);
        boolean existsNotSame = false;
        boolean existsPreviousHash = false;
        Map<Set<Object>, String> instanceMap = newHashMap();
        for (WhiteSplitMultipleFkBase base : baseList) {
            WhiteSplitMultipleFkNext next = base.getWhiteSplitMultipleFkNext();
            WhiteSplitMultipleFkRef ref = base.getWhiteSplitMultipleFkRefAsSplitMultipleFkTest();
            Integer baseFirstId = base.getFirstId();
            Integer refFirstId = ref.getFirstId();
            assertEquals(baseFirstId, refFirstId);
            String nextSecondCode = next.getSecondCode();
            String refSecondCode = ref.getSecondCode();
            String mark = "";
            if (!nextSecondCode.equals(refSecondCode)) {
                existsNotSame = true;
                mark = " *";
            }
            String refHash = "(" + Integer.toHexString(ref.instanceHash()) + ")";
            log(base.getBaseId(), baseFirstId, nextSecondCode, refFirstId, refSecondCode + refHash + mark);
            Set<Object> keySet = newHashSet();
            keySet.add(refFirstId);
            keySet.add(refSecondCode);
            String previousHash = instanceMap.get(keySet);
            if (previousHash != null) {
                existsPreviousHash = true;
                if (cb.canRelationMappingCache()) {
                    assertEquals(previousHash, refHash);
                } else {
                    assertNotSame(previousHash, refHash);
                }
            } else {
                instanceMap.put(keySet, refHash);
            }
        }
        assertFalse(existsNotSame);
        assertTrue(existsPreviousHash);
    }

    public void test_SplitMultipleFk_SetupSelect_nextRelation() throws Exception {
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB();
        doTest_SplitMultipleFk_SetupSelect_nextRelation(cb);
    }

    @SuppressWarnings("deprecation")
    public void test_SplitMultipleFk_SetupSelect_nextRelation_disableCache() throws Exception {
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB();
        cb.disableRelationMappingCache();
        doTest_SplitMultipleFk_SetupSelect_nextRelation(cb);
    }

    protected void doTest_SplitMultipleFk_SetupSelect_nextRelation(WhiteSplitMultipleFkChildCB cb) throws Exception {
        // ## Arrange ##
        registerTestData();
        cb.setupSelect_WhiteSplitMultipleFkBase().withWhiteSplitMultipleFkNext();
        cb.setupSelect_WhiteSplitMultipleFkBase().withWhiteSplitMultipleFkRefAsSplitMultipleFkTest();
        cb.query().addOrderBy_ChildId_Asc();

        // ## Act ##
        ListResultBean<WhiteSplitMultipleFkChild> baseList = whiteSplitMultipleFkChildBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(baseList);
        boolean existsNotSame = false;
        boolean existsPreviousHash = false;
        Map<Set<Object>, String> instanceMap = newHashMap();
        for (WhiteSplitMultipleFkChild child : baseList) {
            WhiteSplitMultipleFkBase base = child.getWhiteSplitMultipleFkBase();
            WhiteSplitMultipleFkNext next = base.getWhiteSplitMultipleFkNext();
            WhiteSplitMultipleFkRef ref = base.getWhiteSplitMultipleFkRefAsSplitMultipleFkTest();
            Integer baseFirstId = base.getFirstId();
            Integer refFirstId = ref.getFirstId();
            assertEquals(baseFirstId, refFirstId);
            String nextSecondCode = next.getSecondCode();
            String refSecondCode = ref.getSecondCode();
            String mark = "";
            if (!nextSecondCode.equals(refSecondCode)) {
                existsNotSame = true;
                mark = " *";
            }
            String refHash = "(" + Integer.toHexString(ref.instanceHash()) + ")";
            log(child.getChildId(), base.getBaseId(), baseFirstId, nextSecondCode, refFirstId, refSecondCode + refHash
                    + mark);
            Set<Object> keySet = newHashSet();
            keySet.add(refFirstId);
            keySet.add(refSecondCode);
            String previousHash = instanceMap.get(keySet);
            if (previousHash != null) {
                existsPreviousHash = true;
                if (cb.canRelationMappingCache()) {
                    assertEquals(previousHash, refHash);
                } else {
                    assertNotSame(previousHash, refHash);
                }
            } else {
                instanceMap.put(keySet, refHash);
            }
        }
        assertFalse(existsNotSame);
        assertTrue(existsPreviousHash);
    }

    // ===================================================================================
    //                                                                            TestData
    //                                                                            ========
    protected void registerTestData() {
        List<WhiteSplitMultipleFkNext> nextList = new ArrayList<WhiteSplitMultipleFkNext>();
        setupNext(nextList, 1L, "FOO");
        setupNext(nextList, 2L, "FOO");
        setupNext(nextList, 3L, "BAR");
        setupNext(nextList, 4L, "QUX");
        setupNext(nextList, 5L, "QUX");
        setupNext(nextList, 6L, "QUX");
        setupNext(nextList, 7L, "FOO");
        setupNext(nextList, 8L, "BAR");
        setupNext(nextList, 9L, "FOO");
        whiteSplitMultipleFkNextBhv.batchInsert(nextList);
        Map<Long, WhiteSplitMultipleFkNext> nextMap = newLinkedHashMap();
        for (WhiteSplitMultipleFkNext next : nextList) {
            nextMap.put(next.getNextId(), next);
        }
        List<WhiteSplitMultipleFkBase> baseList = new ArrayList<WhiteSplitMultipleFkBase>();
        setupBase(baseList, 1L, 1, 1L, nextMap);
        setupBase(baseList, 2L, 1, 2L, nextMap);
        setupBase(baseList, 3L, 1, 3L, nextMap);
        setupBase(baseList, 4L, 1, 4L, nextMap);
        setupBase(baseList, 5L, 2, 5L, nextMap);
        setupBase(baseList, 6L, 2, 5L, nextMap);
        setupBase(baseList, 7L, 1, 2L, nextMap);
        setupBase(baseList, 8L, 3, 8L, nextMap);
        setupBase(baseList, 9L, 4, 9L, nextMap);
        whiteSplitMultipleFkBaseBhv.batchInsert(baseList);
        List<WhiteSplitMultipleFkRef> refList = new ArrayList<WhiteSplitMultipleFkRef>();
        setupRef(refList, 1, "FOO");
        setupRef(refList, 1, "BAR");
        setupRef(refList, 1, "QUX");
        setupRef(refList, 2, "FOO");
        setupRef(refList, 2, "BAR");
        setupRef(refList, 2, "QUX");
        setupRef(refList, 3, "FOO");
        setupRef(refList, 3, "BAR");
        setupRef(refList, 3, "QUX");
        setupRef(refList, 4, "FOO");
        setupRef(refList, 4, "BAR");
        setupRef(refList, 4, "QUX");
        setupRef(refList, 5, "FOO");
        setupRef(refList, 5, "BAR");
        setupRef(refList, 5, "QUX");
        whiteSplitMultipleFkRefBhv.batchInsert(refList);
        List<WhiteSplitMultipleFkChild> childList = new ArrayList<WhiteSplitMultipleFkChild>();
        setupChild(childList, 1L, 1L);
        setupChild(childList, 2L, 1L);
        setupChild(childList, 3L, 1L);
        setupChild(childList, 4L, 2L);
        setupChild(childList, 5L, 2L);
        setupChild(childList, 6L, 3L);
        setupChild(childList, 7L, 4L);
        setupChild(childList, 8L, 5L);
        setupChild(childList, 9L, 6L);
        setupChild(childList, 10L, 6L);
        setupChild(childList, 11L, 6L);
        setupChild(childList, 12L, 6L);
        setupChild(childList, 13L, 6L);
        setupChild(childList, 14L, 6L);
        setupChild(childList, 15L, 7L);
        setupChild(childList, 16L, 7L);
        setupChild(childList, 17L, 8L);
        setupChild(childList, 18L, 8L);
        setupChild(childList, 19L, 9L);
        whiteSplitMultipleFkChildBhv.batchInsert(childList);
    }

    protected void setupNext(List<WhiteSplitMultipleFkNext> nextList, Long nextId, String secondCode) {
        WhiteSplitMultipleFkNext next = new WhiteSplitMultipleFkNext();
        next.setNextId(nextId);
        next.setSecondCode(secondCode);
        nextList.add(next);
    }

    protected void setupBase(List<WhiteSplitMultipleFkBase> baseList, Long baseId, Integer firstId, Long nextId,
            Map<Long, WhiteSplitMultipleFkNext> nextMap) {
        WhiteSplitMultipleFkBase base = new WhiteSplitMultipleFkBase();
        base.setBaseId(baseId);
        base.setFirstId(firstId);
        base.setNextId(nextId);
        WhiteSplitMultipleFkNext next = nextMap.get(nextId);
        assertNotNull(next);
        String secondCode = next.getSecondCode();
        base.setSplitName(firstId + ":" + secondCode + "(" + nextId + ")");
        baseList.add(base);
    }

    protected void setupRef(List<WhiteSplitMultipleFkRef> refList, Integer firstId, String secondCode) {
        WhiteSplitMultipleFkRef ref = new WhiteSplitMultipleFkRef();
        ref.setFirstId(firstId);
        ref.setSecondCode(secondCode);
        ref.setRefName(firstId + ":" + secondCode);
        refList.add(ref);
    }

    protected void setupChild(List<WhiteSplitMultipleFkChild> childList, Long childId, Long baseId) {
        WhiteSplitMultipleFkChild child = new WhiteSplitMultipleFkChild();
        child.setChildId(childId);
        child.setBaseId(baseId);
        child.setChildName(childId + ":" + baseId);
        childList.add(child);
    }
}
