package com.example.dbflute.tricky.dbflute.howto;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.bhv.EntityListSetupper;
import org.seasar.dbflute.bhv.LoadReferrerOption;
import org.seasar.dbflute.cbean.EntityRowHandler;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.dbflute.cbean.grouping.GroupingListDeterminer;
import org.seasar.dbflute.cbean.grouping.GroupingListRowResource;
import org.seasar.dbflute.cbean.pagenavi.group.PageGroupOption;
import org.seasar.dbflute.cbean.pagenavi.range.PageRangeOption;
import org.seasar.dbflute.exception.OutsideSqlNotFoundException;
import org.seasar.dbflute.jdbc.StatementConfig;
import org.seasar.dbflute.twowaysql.exception.BindVariableCommentNotFoundPropertyException;
import org.seasar.dbflute.twowaysql.exception.EndCommentNotFoundException;
import org.seasar.dbflute.twowaysql.exception.IfCommentNotBooleanResultException;
import org.seasar.dbflute.twowaysql.exception.IfCommentNotFoundPropertyException;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.tricky.dbflute.allcommon.CDef;
import com.example.dbflute.tricky.dbflute.cbean.MemberCB;
import com.example.dbflute.tricky.dbflute.cbean.MemberLoginCB;
import com.example.dbflute.tricky.dbflute.cbean.MemberStatusCB;
import com.example.dbflute.tricky.dbflute.cbean.PurchaseCB;
import com.example.dbflute.tricky.dbflute.exbhv.MemberBhv;
import com.example.dbflute.tricky.dbflute.exbhv.MemberStatusBhv;
import com.example.dbflute.tricky.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.tricky.dbflute.exbhv.cursor.PurchaseSummaryMemberCursor;
import com.example.dbflute.tricky.dbflute.exbhv.cursor.PurchaseSummaryMemberCursorHandler;
import com.example.dbflute.tricky.dbflute.exbhv.pmbean.PurchaseMaxPriceMemberPmb;
import com.example.dbflute.tricky.dbflute.exbhv.pmbean.PurchaseSummaryMemberPmb;
import com.example.dbflute.tricky.dbflute.exbhv.pmbean.ResolvedPackageNamePmb;
import com.example.dbflute.tricky.dbflute.exbhv.pmbean.SimpleMemberPmb;
import com.example.dbflute.tricky.dbflute.exbhv.pmbean.UnpaidSummaryMemberPmb;
import com.example.dbflute.tricky.dbflute.exentity.Member;
import com.example.dbflute.tricky.dbflute.exentity.MemberLogin;
import com.example.dbflute.tricky.dbflute.exentity.MemberStatus;
import com.example.dbflute.tricky.dbflute.exentity.Product;
import com.example.dbflute.tricky.dbflute.exentity.Purchase;
import com.example.dbflute.tricky.dbflute.exentity.customize.PurchaseMaxPriceMember;
import com.example.dbflute.tricky.dbflute.exentity.customize.SimpleMember;
import com.example.dbflute.tricky.dbflute.exentity.customize.UnpaidSummaryMember;
import com.example.dbflute.tricky.unit.AppContainerTestCase;

/**
 * @author jflute
 */
public class BehaviorPlatinumTest extends AppContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The behavior of Member. (Injection Object) */
    private MemberBhv memberBhv;

    /** The behavior of MemberStatus. (Injection Object) */
    private MemberStatusBhv memberStatusBhv;

    /** The behavior of Purchase. (Injection Object) */
    private PurchaseBhv purchaseBhv;

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    public void test_selectPage_PageRangeOption_PageGroupOption() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().addOrderBy_MemberName_Asc();

        // ## Act ##
        cb.paging(4, 2);
        PagingResultBean<Member> page2 = memberBhv.selectPage(cb);
        cb.paging(4, 3);
        PagingResultBean<Member> page3 = memberBhv.selectPage(cb);

        // ## Assert ##
        assertNotSame(0, page3.size());

        log("{PageRange}");
        {
            PageRangeOption pageRangeOption = new PageRangeOption();
            pageRangeOption.setPageRangeSize(2);
            page2.setPageRangeOption(pageRangeOption);
            {
                boolean existsPre = page2.pageRange().isExistPrePageRange();
                boolean existsNext = page2.pageRange().isExistNextPageRange();
                log("    page2: " + existsPre + " " + page2.pageRange().createPageNumberList() + " " + existsNext);
            }
            page3.setPageRangeOption(pageRangeOption);
            {
                boolean existsPre = page3.pageRange().isExistPrePageRange();
                boolean existsNext = page3.pageRange().isExistNextPageRange();
                log("    page3: " + existsPre + " " + page3.pageRange().createPageNumberList() + " " + existsNext);
            }
            log("PagingResultBean.toString():" + ln() + " " + page2 + ln() + " " + page3);
            log("");
        }
        log("{PageRange-fillLimit}");
        {
            PageRangeOption pageRangeOption = new PageRangeOption();
            pageRangeOption.setPageRangeSize(2);
            pageRangeOption.setFillLimit(true);
            page2.setPageRangeOption(pageRangeOption);
            {
                boolean existsPre = page2.pageRange().isExistPrePageRange();
                boolean existsNext = page2.pageRange().isExistNextPageRange();
                log("    page2: " + existsPre + " " + page2.pageRange().createPageNumberList() + " " + existsNext);
            }
            page3.setPageRangeOption(pageRangeOption);
            {
                boolean existsPre = page3.pageRange().isExistPrePageRange();
                boolean existsNext = page3.pageRange().isExistNextPageRange();
                log("    page3: " + existsPre + " " + page3.pageRange().createPageNumberList() + " " + existsNext);
            }
            log("PagingResultBean.toString():" + ln() + " " + page2 + ln() + " " + page3);
            log("");
        }
        log("{PageGroup}");
        {
            PageGroupOption pageGroupOption = new PageGroupOption();
            pageGroupOption.setPageGroupSize(2);
            page2.setPageGroupOption(pageGroupOption);
            {
                boolean existsPre = page2.pageGroup().isExistPrePageGroup();
                boolean existsNext = page2.pageGroup().isExistNextPageGroup();
                log("    page2: " + existsPre + " " + page2.pageGroup().createPageNumberList() + " " + existsNext);
            }
            page3.setPageGroupOption(pageGroupOption);
            {
                boolean existsPre = page3.pageGroup().isExistPrePageGroup();
                boolean existsNext = page3.pageGroup().isExistNextPageGroup();
                log("    page3: " + existsPre + " " + page3.pageGroup().createPageNumberList() + " " + existsNext);
            }
            log("PagingResultBean.toString():" + ln() + " " + page2 + ln() + " " + page3);
            log("");
        }
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    public void test_selectCursor_EntityRowHandler() {
        // ## Arrange ##
        int allCount = memberBhv.selectCount(new MemberCB());
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();
        final Set<Integer> memberIdSet = new HashSet<Integer>();

        // ## Act ##
        memberBhv.selectCursor(cb, new EntityRowHandler<Member>() {
            public void handle(Member entity) {
                memberIdSet.add(entity.getMemberId());
                log(entity.getMemberName() + ", " + entity.getMemberStatus().getMemberStatusName());
            }
        });

        // ## Assert ##
        assertEquals(allCount, memberIdSet.size());
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    public void test_loadReferrer_setupSelect_Foreign() {
        // ## Arrange ##
        final MemberCB cb = new MemberCB();
        final ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Act ##
        memberBhv.loadPurchaseList(memberList, new ConditionBeanSetupper<PurchaseCB>() {
            public void setup(PurchaseCB cb) {
                cb.setupSelect_Product();// *Point!
                cb.query().addOrderBy_PurchaseCount_Desc();
            }
        });

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            List<Purchase> purchaseList = member.getPurchaseList();
            log("[MEMBER]: " + member.getMemberName());
            for (Purchase purchase : purchaseList) {
                Integer purchaseId = purchase.getPurchaseId();
                Product product = purchase.getProduct();// *Point!
                log("    [PURCHASE]: purchaseId=" + purchaseId + ", product=" + product);
                assertNotNull(product);
            }
        }
    }

    public void test_loadReferrer_loadReferrerReferrer() {
        // ## Arrange ##
        // A base table is MemberStatus at this test case.
        MemberStatusCB cb = new MemberStatusCB();
        ListResultBean<MemberStatus> memberStatusList = memberStatusBhv.selectList(cb);

        LoadReferrerOption<MemberCB, Member> loadReferrerOption = new LoadReferrerOption<MemberCB, Member>();

        // Member
        loadReferrerOption.setConditionBeanSetupper(new ConditionBeanSetupper<MemberCB>() {
            public void setup(MemberCB cb) {
                cb.query().addOrderBy_FormalizedDatetime_Desc();
            }
        });

        // Purchase
        loadReferrerOption.setEntityListSetupper(new EntityListSetupper<Member>() {
            public void setup(List<Member> entityList) {
                memberBhv.loadPurchaseList(entityList, new ConditionBeanSetupper<PurchaseCB>() {
                    public void setup(PurchaseCB cb) {
                        cb.query().addOrderBy_PurchaseCount_Desc();
                        cb.query().addOrderBy_ProductId_Desc();
                    }
                });
            }
        });

        // ## Act ##
        memberStatusBhv.loadMemberList(memberStatusList, loadReferrerOption);

        // ## Assert ##
        boolean existsPurchase = false;
        assertNotSame(0, memberStatusList.size());
        for (MemberStatus memberStatus : memberStatusList) {
            List<Member> memberList = memberStatus.getMemberList();
            log("[MEMBER_STATUS]: " + memberStatus.getMemberStatusName());
            for (Member member : memberList) {
                List<Purchase> purchaseList = member.getPurchaseList();
                log("    [MEMBER]: " + member.getMemberName() + ", " + member.getFormalizedDatetime());
                for (Purchase purchase : purchaseList) {
                    log("        [PURCHASE]: " + purchase.getPurchaseId() + ", " + purchase.getPurchaseCount());
                    existsPurchase = true;
                }
            }
            log("");
        }
        assertTrue(existsPurchase);
    }

    public void test_loadReferrer_pulloutMember_loadMemberLoginList() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member();// *Point!
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Act ##
        List<Member> memberList = purchaseBhv.pulloutMember(purchaseList);// *Point!
        memberBhv.loadMemberLoginList(memberList, new ConditionBeanSetupper<MemberLoginCB>() {
            public void setup(MemberLoginCB cb) {
                cb.query().setMobileLoginFlg_Equal_True();
                cb.query().addOrderBy_LoginDatetime_Desc();
            }
        });

        // ## Assert ##
        assertNotSame(0, memberList.size());
        boolean existsMemberLogin = false;
        log("");
        for (Purchase purchase : purchaseList) {
            Member member = purchase.getMember();
            log("[PURCHASE & MEMBER]: " + purchase.getPurchaseId() + ", " + member.getMemberName());
            List<MemberLogin> memberLoginList = member.getMemberLoginList();
            for (MemberLogin memberLogin : memberLoginList) {
                log("    [MEMBER_LOGIN]: " + memberLogin);
                existsMemberLogin = true;
            }
        }
        assertTrue(existsMemberLogin);

        log("");
        boolean existsPurchase = false;
        for (Member member : memberList) {
            List<Purchase> backToPurchaseList = member.getPurchaseList();
            if (!backToPurchaseList.isEmpty()) {
                existsPurchase = true;
            }
            log("[MEMBER]: " + member.getMemberName());
            for (Purchase backToPurchase : backToPurchaseList) {
                log("    " + backToPurchase);
            }
        }
        assertTrue(existsPurchase);
    }

    public void test_LoadReferrer_ousdieSql_paging() {
        // ## Arrange ##
        String path = MemberBhv.PATH_selectUnpaidSummaryMember;
        UnpaidSummaryMemberPmb pmb = new UnpaidSummaryMemberPmb();
        pmb.paging(8, 2);
        Class<UnpaidSummaryMember> entityType = UnpaidSummaryMember.class;

        PagingResultBean<UnpaidSummaryMember> memberPage = memberBhv.outsideSql().autoPaging()
                .selectPage(path, pmb, entityType);
        List<Member> domainList = new ArrayList<Member>();
        for (UnpaidSummaryMember member : memberPage) {
            domainList.add(member.prepareDomain());
        }

        // ## Act ##
        memberBhv.loadPurchaseList(domainList, new ConditionBeanSetupper<PurchaseCB>() {
            public void setup(PurchaseCB cb) {
                cb.setupSelect_Product();
                cb.query().setPaymentCompleteFlg_Equal_True();
            }
        });

        // ## Assert ##
        boolean exists = false;
        for (UnpaidSummaryMember member : memberPage) {
            List<Purchase> purchaseList = member.getPurchaseList();
            if (!purchaseList.isEmpty()) {
                exists = true;
            }
            log(member.getUnpaidManName() + ", " + member.getStatusName());
            for (Purchase purchase : purchaseList) {
                log("  " + purchase);
            }
            assertTrue(member.getMemberLoginList().isEmpty());
        }
        assertTrue(exists);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    public void test_Batch_batchInsert() {
        // ## Arrange ##
        List<Member> memberList = new ArrayList<Member>();
        {
            Member member = new Member();
            member.setMemberName("testName1");
            member.setMemberAccount("testAccount1");
            member.setMemberStatusCode_FormalizedMember();
            memberList.add(member);
        }
        {
            Member member = new Member();
            member.setMemberName("testName2");
            member.setMemberAccount("testAccount2");
            member.setMemberStatusCode_ProvisionalMember();
            memberList.add(member);
        }
        {
            Member member = new Member();
            member.setMemberName("testName3");
            member.setMemberAccount("testAccount3");
            member.setMemberStatusCode_WithdrawalMember();
            memberList.add(member);
        }

        // ## Act ##
        int[] result = memberBhv.batchInsert(memberList);

        // ## Assert ##
        assertEquals(3, result.length);
    }

    public void test_Batch_batchUpdate() {
        // ## Arrange ##
        List<Integer> memberIdList = new ArrayList<Integer>();
        memberIdList.add(1);
        memberIdList.add(3);
        memberIdList.add(7);
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_InScope(memberIdList);
        ListResultBean<Member> memberList = memberBhv.selectList(cb);
        int count = 0;
        List<Integer> expectedVersionNoList = new ArrayList<Integer>();
        for (Member member : memberList) {
            member.setMemberName("testName" + count);
            member.setMemberAccount("testAccount" + count);
            member.classifyMemberStatusCodeProvisionalMember();
            member.setFormalizedDatetime(currentTimestamp());
            member.setBirthdate(currentTimestamp());
            expectedVersionNoList.add(member.getVersionNo());
            ++count;
        }

        // ## Act ##
        int[] result = memberBhv.batchUpdate(memberList);

        // ## Assert ##
        assertEquals(3, result.length);
    }

    public void test_Batch_batchUpdateNonstrict() {
        // ## Arrange ##
        List<Integer> memberIdList = new ArrayList<Integer>();
        memberIdList.add(1);
        memberIdList.add(3);
        memberIdList.add(7);
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_InScope(memberIdList);
        ListResultBean<Member> memberList = memberBhv.selectList(cb);
        int count = 0;
        for (Member member : memberList) {
            member.setMemberName("testName" + count);
            member.setMemberAccount("testAccount" + count);
            member.classifyMemberStatusCodeProvisionalMember();
            member.setFormalizedDatetime(currentTimestamp());
            member.setBirthdate(currentTimestamp());
            member.setVersionNo(null);// *Point!
            ++count;
        }
        // ## Act ##
        int[] result = memberBhv.batchUpdateNonstrict(memberList);

        // ## Assert ##
        assertEquals(3, result.length);
        for (Member member : memberList) {
            assertNull(member.getVersionNo());
        }
    }

    public void test_Batch_batchDelete() {
        // ## Arrange ##
        deleteMemberReferrer();

        List<Integer> memberIdList = new ArrayList<Integer>();
        memberIdList.add(1);
        memberIdList.add(3);
        memberIdList.add(7);
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_InScope(memberIdList);
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Act ##
        int[] result = memberBhv.batchDelete(memberList);

        // ## Assert ##
        assertEquals(3, result.length);
    }

    public void test_Batch_batchDeleteNonstrict() {
        // ## Arrange ##
        deleteMemberReferrer();

        List<Member> memberList = new ArrayList<Member>();
        {
            Member member = new Member();
            member.setMemberId(1);
            memberList.add(member);
        }
        {
            Member member = new Member();
            member.setMemberId(3);
            memberList.add(member);
        }
        {
            Member member = new Member();
            member.setMemberId(7);
            memberList.add(member);
        }

        // ## Act ##
        int[] result = memberBhv.batchDeleteNonstrict(memberList);

        // ## Assert ##
        assertEquals(3, result.length);
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    // -----------------------------------------------------
    //                                                  List
    //                                                  ----
    public void test_outsideSql_selectList_selectSubDirectory() {
        // ## Arrange ##
        String path = MemberBhv.PATH_subdirectory_selectSubDirectoryCheck;
        SimpleMemberPmb pmb = new SimpleMemberPmb();
        pmb.setMemberName_PrefixSearch("S");
        Class<SimpleMember> entityType = SimpleMember.class;
        List<SimpleMember> resultList = memberBhv.outsideSql().selectList(path, pmb, entityType);

        // ## Assert ##
        assertNotSame(0, resultList.size());
        log("{SimpleMember}");
        for (SimpleMember entity : resultList) {
            Integer memberId = entity.getMemberId();
            String memberName = entity.getMemberName();
            String memberStatusName = entity.getMemberStatusName();
            log("    " + memberId + ", " + memberName + ", " + memberStatusName);
            assertNotNull(memberId);
            assertNotNull(memberName);
            assertNotNull(memberStatusName);
            assertTrue(memberName.startsWith("S"));
        }
    }

    // -----------------------------------------------------
    //                                                Cursor
    //                                                ------
    public void test_outsideSql_selectCursor_makeCsvSummaryMember_selectPurchaseSummaryMember() {
        // ## Arrange ##
        PurchaseSummaryMemberPmb pmb = new PurchaseSummaryMemberPmb();
        pmb.setMemberStatusCode_FormalizedMember();
        pmb.setFormalizedDatetime(DfTypeUtil.toTimestamp("2003-08-12 12:34:56.147"));

        // ## Act & Assert ##
        memberBhv.makeCsvPurchaseSummaryMember(pmb);
    }

    // -----------------------------------------------------
    //                                           FOR Comment
    //                                           -----------
    public void test_outsideSql_forComment_nextAnd() {
        // ## Arrange ##
        String path = MemberBhv.PATH_selectPurchaseSummaryMember;
        PurchaseSummaryMemberPmb pmb = new PurchaseSummaryMemberPmb();
        pmb.setMemberNameList_ContainSearch(DfCollectionUtil.newArrayList("S", "v"));

        // ## Act & Assert ##
        final Set<String> existsSet = DfCollectionUtil.newHashSet();
        memberBhv.outsideSql().cursorHandling().selectCursor(path, pmb, new PurchaseSummaryMemberCursorHandler() {
            public Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                while (cursor.next()) {
                    existsSet.add("exists");
                    final Integer memberId = cursor.getMemberId();
                    final String memberName = cursor.getMemberName();
                    final Date birthdate = cursor.getBirthdate();

                    final String c = ", ";
                    log(memberId + c + memberName + c + birthdate);
                    // case insensitive at SQLite
                    if (!memberName.toLowerCase().contains("s") || !memberName.toLowerCase().contains("v")) {
                        fail("memberName should have S and t: " + memberName);
                    }
                }
                return null;
            }
        });
        assertTrue(existsSet.contains("exists"));
    }

    public void test_outsideSql_forComment_nextOr() {
        // ## Arrange ##
        String path = MemberBhv.PATH_selectPurchaseMaxPriceMember;

        PurchaseMaxPriceMemberPmb pmb = new PurchaseMaxPriceMemberPmb();
        //pmb.setMemberId(3);
        pmb.setMemberNameList_PrefixSearch(DfCollectionUtil.newArrayList("S", "M"));

        Class<PurchaseMaxPriceMember> entityType = PurchaseMaxPriceMember.class;

        // ## Act ##
        int pageSize = 3;
        pmb.paging(pageSize, 1); // 1st page
        PagingResultBean<PurchaseMaxPriceMember> page1 = memberBhv.outsideSql().manualPaging()
                .selectPage(path, pmb, entityType);

        // ## Assert ##
        assertNotSame(0, page1.size());
        for (PurchaseMaxPriceMember member : page1) {
            log(member);
            String memberName = member.getMemberName();

            if (!memberName.contains("S") && !memberName.contains("M")) {
                fail("memberName should have S or M: " + memberName);
            }
        }
    }

    // -----------------------------------------------------
    //                                      Statement Config
    //                                      ----------------
    public void test_outsideSql_configure() {
        // ## Arrange ##
        String path = MemberBhv.PATH_selectSimpleMember;
        SimpleMemberPmb pmb = new SimpleMemberPmb();
        pmb.setMemberName_PrefixSearch("S");
        Class<SimpleMember> entityType = SimpleMember.class;
        StatementConfig statementConfig = new StatementConfig().typeForwardOnly().queryTimeout(7).maxRows(2);

        // ## Act ##
        List<SimpleMember> memberList = memberBhv.outsideSql().configure(statementConfig)
                .selectList(path, pmb, entityType);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        // maxRows does not work at SQLite!
        //assertEquals(2, memberList.size());
        log("{SimpleMember}");
        for (SimpleMember entity : memberList) {
            Integer memberId = entity.getMemberId();
            String memberName = entity.getMemberName();
            String memberStatusName = entity.getMemberStatusName();
            log("    " + memberId + ", " + memberName + ", " + memberStatusName);
            assertNotNull(memberId);
            assertNotNull(memberName);
            assertNotNull(memberStatusName);
            assertTrue(memberName.startsWith("S"));
        }
    }

    // -----------------------------------------------------
    //                          ParameterBean ResolvePackage
    //                          ----------------------------
    public void test_outsideSql_selectResolvedPackageName() {
        // ## Arrange ##
        String path = MemberBhv.PATH_various_pmbcheck_selectResolvedPackageName;

        ResolvedPackageNamePmb pmb = new ResolvedPackageNamePmb();
        pmb.setDate1(new java.util.Date());
        List<String> statusList = new ArrayList<String>();
        statusList.add(CDef.MemberStatus.FormalizedMember.code());
        statusList.add(CDef.MemberStatus.WithdrawalMember.code());
        pmb.setList1(statusList);

        Class<Member> entityType = Member.class;

        // ## Act ##ß
        List<Member> memberList = memberBhv.outsideSql().selectList(path, pmb, entityType);

        // ## Assert ##
        assertNotSame(0, memberList.size());
    }

    // -----------------------------------------------------
    //                                              NotFound
    //                                              --------
    public void test_outsideSql_NotFound() {
        try {
            memberBhv.outsideSql().selectList("sql/noexist/selectByNoExistSql.sql", null, Member.class);
            fail();
        } catch (OutsideSqlNotFoundException e) {
            log(e.getMessage());
        }
    }

    // -----------------------------------------------------
    //                                         Wrong Comment
    //                                         -------------
    public void test_outsideSql_BindVariableNotFoundProperty() {
        try {
            String path = MemberBhv.PATH_various_wrongexample_selectBindVariableNotFoundProperty;
            UnpaidSummaryMemberPmb pmb = new UnpaidSummaryMemberPmb();
            pmb.setMemberName_PrefixSearch("S");
            memberBhv.outsideSql().selectList(path, pmb, Member.class);
            fail();
        } catch (BindVariableCommentNotFoundPropertyException e) {
            log(e.getMessage());
            assertTrue(e.getMessage().contains("wrongMemberId"));
        }
    }

    public void test_outsideSql_EndCommentNotFound() {
        try {
            String path = MemberBhv.PATH_various_wrongexample_selectEndCommentNotFound;
            UnpaidSummaryMemberPmb pmb = new UnpaidSummaryMemberPmb();
            pmb.setMemberName_PrefixSearch("S");
            memberBhv.outsideSql().selectList(path, pmb, Member.class);
            fail();
        } catch (EndCommentNotFoundException e) {
            log(e.getMessage());
        }
    }

    public void test_outsideSql_IfCommentNotBooleanResult() {
        try {
            String path = MemberBhv.PATH_various_wrongexample_selectIfCommentNotBooleanResult;
            UnpaidSummaryMemberPmb pmb = new UnpaidSummaryMemberPmb();
            pmb.setMemberName_PrefixSearch("S");
            memberBhv.outsideSql().selectList(path, pmb, Member.class);
            fail();
        } catch (IfCommentNotBooleanResultException e) {
            log(e.getMessage());
        }
    }

    public void test_outsideSql_IfCommentWrongExpression() {
        try {
            String path = MemberBhv.PATH_various_wrongexample_selectIfCommentWrongExpression;
            UnpaidSummaryMemberPmb pmb = new UnpaidSummaryMemberPmb();
            pmb.setMemberName_PrefixSearch("S");
            memberBhv.outsideSql().selectList(path, pmb, Member.class);
            fail();
        } catch (IfCommentNotFoundPropertyException e) {
            log(e.getMessage());
            if (!e.getMessage().contains("wrongMemberId")) {
                fail();
            }
        }
    }

    // ===================================================================================
    //                                                                       Common Column
    //                                                                       =============
    public void test_insert_disableCommonColumnAutoSetup() {
        // ## Arrange ##
        Timestamp expectedTimestamp = new Timestamp(currentTimestamp().getTime() - 10000000000l);
        Member member = new Member();
        member.setMemberName("Billy Joel");
        member.setMemberAccount("martinjoel");
        member.setBirthdate(currentDate());
        member.setFormalizedDatetime(currentTimestamp());
        member.setMemberStatusCode_FormalizedMember();
        member.setTableNameRegisterDatetime(expectedTimestamp);
        member.setTableNameRegisterUser("suppressRegisterUser");
        member.setTableNameRegisterProcess("suppressRegisterProcess");
        member.setTableNameUpdateDatetime(expectedTimestamp);
        member.setTableNameUpdateUser("suppressUpdateUser");
        member.setTableNameUpdateProcess("suppressUpdateProcess");
        member.disableCommonColumnAutoSetup();// *Point!

        // ## Act ##
        memberBhv.insert(member);

        // ## Assert ##
        final MemberCB cb = new MemberCB();
        cb.acceptPrimaryKeyMap(member.getDBMeta().extractPrimaryKeyMap(member));
        final Member actualMember = memberBhv.selectEntityWithDeletedCheck(cb);
        final Timestamp registerDatetime = actualMember.getTableNameRegisterDatetime();
        final String registerUser = actualMember.getTableNameRegisterUser();
        final String registerProcess = actualMember.getTableNameRegisterProcess();
        final Timestamp updateDatetime = actualMember.getTableNameUpdateDatetime();
        final String updateUser = actualMember.getTableNameUpdateUser();
        final String updateProcess = actualMember.getTableNameUpdateProcess();
        log("registerDatetime = " + registerDatetime);
        assertNotNull(registerDatetime);
        assertEquals(expectedTimestamp, registerDatetime);
        log("registerUser = " + registerUser);
        assertNotNull(registerUser);
        assertEquals("suppressRegisterUser", registerUser);
        log("registerProcess = " + registerProcess);
        assertNotNull(registerProcess);
        assertEquals("suppressRegisterProcess", registerProcess);
        log("updateDatetime = " + updateDatetime);
        assertNotNull(updateDatetime);
        assertEquals(expectedTimestamp, updateDatetime);
        log("updateUser = " + updateUser);
        assertNotNull(updateUser);
        assertEquals("suppressUpdateUser", updateUser);
        log("updateProcess = " + updateProcess);
        assertNotNull(updateProcess);
        assertEquals("suppressUpdateProcess", updateProcess);
    }

    // ===================================================================================
    //                                                                    Paging Re-Select
    //                                                                    ================
    public void test_conditionBean_paging_disablePagingReSelect() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().addOrderBy_MemberName_Asc();
        cb.paging(4, 99999);
        cb.disablePagingReSelect();

        // ## Act ##
        PagingResultBean<Member> page99999 = memberBhv.selectPage(cb);

        // ## Assert ##
        assertTrue(page99999.isEmpty());
    }

    public void test_outsideSql_paging_disablePagingReSelect() {
        // ## Arrange ##
        // SQLのパス
        String path = MemberBhv.PATH_selectUnpaidSummaryMember;

        // 検索条件
        UnpaidSummaryMemberPmb pmb = new UnpaidSummaryMemberPmb();
        pmb.setMemberStatusCode_FormalizedMember();
        pmb.disablePagingReSelect();

        // 戻り値Entityの型
        Class<UnpaidSummaryMember> entityType = UnpaidSummaryMember.class;

        // ## Act ##
        // SQL実行！
        int pageSize = 3;
        pmb.paging(pageSize, 99999);
        PagingResultBean<UnpaidSummaryMember> page99999 = memberBhv.outsideSql().autoPaging()
                .selectPage(path, pmb, entityType);

        // ## Assert ##
        assertTrue(page99999.isEmpty());
    }

    // ===================================================================================
    //                                                                    List Result Bean
    //                                                                    ================
    public void test_selectList_ListResultBean_groupingList_count() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().addOrderBy_MemberName_Asc();
        ListResultBean<Member> memberList = memberBhv.selectList(cb);
        log("ListResultBean.toString():" + ln() + " " + memberList);

        // ## Act ##
        List<ListResultBean<Member>> groupingList = memberList.groupingList(new GroupingListDeterminer<Member>() {
            public boolean isBreakRow(GroupingListRowResource<Member> rowResource, Member nextEntity) {
                return rowResource.getNextIndex() >= 3;
            }
        });

        // ## Assert ##
        assertFalse(groupingList.isEmpty());
        int rowIndex = 0;
        for (List<Member> elementList : groupingList) {
            assertTrue(elementList.size() <= 3);
            log("[" + rowIndex + "]");
            for (Member member : elementList) {
                log("  " + member);
            }
            ++rowIndex;
        }
    }

    public void test_selectList_ListResultBean_groupingList_determine() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().addOrderBy_MemberName_Asc();
        ListResultBean<Member> memberList = memberBhv.selectList(cb);
        log("ListResultBean.toString():" + ln() + " " + memberList);

        // ## Act ##
        List<ListResultBean<Member>> groupingList = memberList.groupingList(new GroupingListDeterminer<Member>() {
            public boolean isBreakRow(GroupingListRowResource<Member> rowResource, Member nextEntity) {
                Member currentEntity = rowResource.getCurrentEntity();
                String currentInitChar = currentEntity.getMemberName().substring(0, 1);
                String nextInitChar = nextEntity.getMemberName().substring(0, 1);
                return !currentInitChar.equalsIgnoreCase(nextInitChar);
            }
        });

        // ## Assert ##
        assertFalse(groupingList.isEmpty());
        int entityCount = 0;
        for (List<Member> elementList : groupingList) {
            String currentInitChar = null;
            for (Member member : elementList) {
                if (currentInitChar == null) {
                    currentInitChar = member.getMemberName().substring(0, 1);
                    log("[" + currentInitChar + "]");
                }
                log("  " + member.getMemberName() + ", " + member);
                assertEquals(currentInitChar, member.getMemberName().substring(0, 1));
                ++entityCount;
            }
        }
        assertEquals(memberList.size(), entityCount);
    }
}
