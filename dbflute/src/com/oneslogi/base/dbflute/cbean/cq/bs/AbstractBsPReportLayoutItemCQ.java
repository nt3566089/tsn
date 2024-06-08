package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of P_REPORT_LAYOUT_ITEM.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPReportLayoutItemCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPReportLayoutItemCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "P_REPORT_LAYOUT_ITEM";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportLayoutItemId The value of reportLayoutItemId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutItemId_Equal(Long reportLayoutItemId) {
        doSetReportLayoutItemId_Equal(reportLayoutItemId);
    }

    protected void doSetReportLayoutItemId_Equal(Long reportLayoutItemId) {
        regReportLayoutItemId(CK_EQ, reportLayoutItemId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportLayoutItemId The value of reportLayoutItemId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutItemId_NotEqual(Long reportLayoutItemId) {
        doSetReportLayoutItemId_NotEqual(reportLayoutItemId);
    }

    protected void doSetReportLayoutItemId_NotEqual(Long reportLayoutItemId) {
        regReportLayoutItemId(CK_NES, reportLayoutItemId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportLayoutItemId The value of reportLayoutItemId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutItemId_GreaterThan(Long reportLayoutItemId) {
        regReportLayoutItemId(CK_GT, reportLayoutItemId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportLayoutItemId The value of reportLayoutItemId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutItemId_LessThan(Long reportLayoutItemId) {
        regReportLayoutItemId(CK_LT, reportLayoutItemId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportLayoutItemId The value of reportLayoutItemId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutItemId_GreaterEqual(Long reportLayoutItemId) {
        regReportLayoutItemId(CK_GE, reportLayoutItemId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportLayoutItemId The value of reportLayoutItemId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutItemId_LessEqual(Long reportLayoutItemId) {
        regReportLayoutItemId(CK_LE, reportLayoutItemId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of reportLayoutItemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reportLayoutItemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReportLayoutItemId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReportLayoutItemId(), "REPORT_LAYOUT_ITEM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportLayoutItemIdList The collection of reportLayoutItemId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutItemId_InScope(Collection<Long> reportLayoutItemIdList) {
        doSetReportLayoutItemId_InScope(reportLayoutItemIdList);
    }

    protected void doSetReportLayoutItemId_InScope(Collection<Long> reportLayoutItemIdList) {
        regINS(CK_INS, cTL(reportLayoutItemIdList), xgetCValueReportLayoutItemId(), "REPORT_LAYOUT_ITEM_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportLayoutItemIdList The collection of reportLayoutItemId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutItemId_NotInScope(Collection<Long> reportLayoutItemIdList) {
        doSetReportLayoutItemId_NotInScope(reportLayoutItemIdList);
    }

    protected void doSetReportLayoutItemId_NotInScope(Collection<Long> reportLayoutItemIdList) {
        regINS(CK_NINS, cTL(reportLayoutItemIdList), xgetCValueReportLayoutItemId(), "REPORT_LAYOUT_ITEM_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setReportLayoutItemId_IsNull() { regReportLayoutItemId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setReportLayoutItemId_IsNotNull() { regReportLayoutItemId(CK_ISNN, DOBJ); }

    protected void regReportLayoutItemId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportLayoutItemId(), "REPORT_LAYOUT_ITEM_ID"); }
    protected abstract ConditionValue xgetCValueReportLayoutItemId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param reportLayoutId The value of reportLayoutId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_Equal(Long reportLayoutId) {
        doSetReportLayoutId_Equal(reportLayoutId);
    }

    protected void doSetReportLayoutId_Equal(Long reportLayoutId) {
        regReportLayoutId(CK_EQ, reportLayoutId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param reportLayoutId The value of reportLayoutId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_NotEqual(Long reportLayoutId) {
        doSetReportLayoutId_NotEqual(reportLayoutId);
    }

    protected void doSetReportLayoutId_NotEqual(Long reportLayoutId) {
        regReportLayoutId(CK_NES, reportLayoutId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param reportLayoutId The value of reportLayoutId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_GreaterThan(Long reportLayoutId) {
        regReportLayoutId(CK_GT, reportLayoutId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param reportLayoutId The value of reportLayoutId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_LessThan(Long reportLayoutId) {
        regReportLayoutId(CK_LT, reportLayoutId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param reportLayoutId The value of reportLayoutId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_GreaterEqual(Long reportLayoutId) {
        regReportLayoutId(CK_GE, reportLayoutId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param reportLayoutId The value of reportLayoutId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_LessEqual(Long reportLayoutId) {
        regReportLayoutId(CK_LE, reportLayoutId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param minNumber The min number of reportLayoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reportLayoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReportLayoutId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReportLayoutId(), "REPORT_LAYOUT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param reportLayoutIdList The collection of reportLayoutId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutId_InScope(Collection<Long> reportLayoutIdList) {
        doSetReportLayoutId_InScope(reportLayoutIdList);
    }

    protected void doSetReportLayoutId_InScope(Collection<Long> reportLayoutIdList) {
        regINS(CK_INS, cTL(reportLayoutIdList), xgetCValueReportLayoutId(), "REPORT_LAYOUT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param reportLayoutIdList The collection of reportLayoutId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutId_NotInScope(Collection<Long> reportLayoutIdList) {
        doSetReportLayoutId_NotInScope(reportLayoutIdList);
    }

    protected void doSetReportLayoutId_NotInScope(Collection<Long> reportLayoutIdList) {
        regINS(CK_NINS, cTL(reportLayoutIdList), xgetCValueReportLayoutId(), "REPORT_LAYOUT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select REPORT_LAYOUT_ID from P_REPORT_LAYOUT where ...)} <br />
     * P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayout'.
     * @param subCBLambda The callback for sub-query of PReportLayout for 'in-scope'. (NotNull)
     */
    public void inScopePReportLayout(SubQuery<PReportLayoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PReportLayoutCB cb = new PReportLayoutCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReportLayoutId_InScopeRelation_PReportLayout(cb.query());
        registerInScopeRelation(cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", pp, "pReportLayout", false);
    }
    public abstract String keepReportLayoutId_InScopeRelation_PReportLayout(PReportLayoutCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select REPORT_LAYOUT_ID from P_REPORT_LAYOUT where ...)} <br />
     * P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayout'.
     * @param subCBLambda The callback for sub-query of PReportLayout for 'not in-scope'. (NotNull)
     */
    public void notInScopePReportLayout(SubQuery<PReportLayoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PReportLayoutCB cb = new PReportLayoutCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReportLayoutId_NotInScopeRelation_PReportLayout(cb.query());
        registerInScopeRelation(cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", pp, "pReportLayout", true);
    }
    public abstract String keepReportLayoutId_NotInScopeRelation_PReportLayout(PReportLayoutCQ sq);

    protected void regReportLayoutId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportLayoutId(), "REPORT_LAYOUT_ID"); }
    protected abstract ConditionValue xgetCValueReportLayoutId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {+UQ, NotNull, varchar(100)}
     * @param itemCd The value of itemCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_Equal(String itemCd) {
        doSetItemCd_Equal(fRES(itemCd));
    }

    protected void doSetItemCd_Equal(String itemCd) {
        regItemCd(CK_EQ, itemCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {+UQ, NotNull, varchar(100)}
     * @param itemCd The value of itemCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_NotEqual(String itemCd) {
        doSetItemCd_NotEqual(fRES(itemCd));
    }

    protected void doSetItemCd_NotEqual(String itemCd) {
        regItemCd(CK_NES, itemCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {+UQ, NotNull, varchar(100)}
     * @param itemCd The value of itemCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_GreaterThan(String itemCd) {
        regItemCd(CK_GT, fRES(itemCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {+UQ, NotNull, varchar(100)}
     * @param itemCd The value of itemCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_LessThan(String itemCd) {
        regItemCd(CK_LT, fRES(itemCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {+UQ, NotNull, varchar(100)}
     * @param itemCd The value of itemCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_GreaterEqual(String itemCd) {
        regItemCd(CK_GE, fRES(itemCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {+UQ, NotNull, varchar(100)}
     * @param itemCd The value of itemCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_LessEqual(String itemCd) {
        regItemCd(CK_LE, fRES(itemCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_CD: {+UQ, NotNull, varchar(100)}
     * @param itemCdList The collection of itemCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_InScope(Collection<String> itemCdList) {
        doSetItemCd_InScope(itemCdList);
    }

    protected void doSetItemCd_InScope(Collection<String> itemCdList) {
        regINS(CK_INS, cTL(itemCdList), xgetCValueItemCd(), "ITEM_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_CD: {+UQ, NotNull, varchar(100)}
     * @param itemCdList The collection of itemCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_NotInScope(Collection<String> itemCdList) {
        doSetItemCd_NotInScope(itemCdList);
    }

    protected void doSetItemCd_NotInScope(Collection<String> itemCdList) {
        regINS(CK_NINS, cTL(itemCdList), xgetCValueItemCd(), "ITEM_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD: {+UQ, NotNull, varchar(100)} <br>
     * <pre>e.g. setItemCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemCd The value of itemCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemCd_LikeSearch(String itemCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemCd), xgetCValueItemCd(), "ITEM_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD: {+UQ, NotNull, varchar(100)}
     * @param itemCd The value of itemCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemCd_NotLikeSearch(String itemCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemCd), xgetCValueItemCd(), "ITEM_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD: {+UQ, NotNull, varchar(100)}
     * @param itemCd The value of itemCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_PrefixSearch(String itemCd) {
        setItemCd_LikeSearch(itemCd, xcLSOPPre());
    }

    protected void regItemCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemCd(), "ITEM_CD"); }
    protected abstract ConditionValue xgetCValueItemCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_Equal(Long dictId) {
        doSetDictId_Equal(dictId);
    }

    protected void doSetDictId_Equal(Long dictId) {
        regDictId(CK_EQ, dictId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_NotEqual(Long dictId) {
        doSetDictId_NotEqual(dictId);
    }

    protected void doSetDictId_NotEqual(Long dictId) {
        regDictId(CK_NES, dictId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterThan(Long dictId) {
        regDictId(CK_GT, dictId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessThan(Long dictId) {
        regDictId(CK_LT, dictId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterEqual(Long dictId) {
        regDictId(CK_GE, dictId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessEqual(Long dictId) {
        regDictId(CK_LE, dictId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param minNumber The min number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDictId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDictId(), "DICT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictIdList The collection of dictId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictId_InScope(Collection<Long> dictIdList) {
        doSetDictId_InScope(dictIdList);
    }

    protected void doSetDictId_InScope(Collection<Long> dictIdList) {
        regINS(CK_INS, cTL(dictIdList), xgetCValueDictId(), "DICT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictIdList The collection of dictId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictId_NotInScope(Collection<Long> dictIdList) {
        doSetDictId_NotInScope(dictIdList);
    }

    protected void doSetDictId_NotInScope(Collection<Long> dictIdList) {
        regINS(CK_NINS, cTL(dictIdList), xgetCValueDictId(), "DICT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DICT_ID from B_DICT where ...)} <br />
     * B_DICT by my DICT_ID, named 'BDict'.
     * @param subCBLambda The callback for sub-query of BDict for 'in-scope'. (NotNull)
     */
    public void inScopeBDict(SubQuery<BDictCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BDictCB cb = new BDictCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDictId_InScopeRelation_BDict(cb.query());
        registerInScopeRelation(cb.query(), "DICT_ID", "DICT_ID", pp, "bDict", false);
    }
    public abstract String keepDictId_InScopeRelation_BDict(BDictCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DICT_ID from B_DICT where ...)} <br />
     * B_DICT by my DICT_ID, named 'BDict'.
     * @param subCBLambda The callback for sub-query of BDict for 'not in-scope'. (NotNull)
     */
    public void notInScopeBDict(SubQuery<BDictCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BDictCB cb = new BDictCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDictId_NotInScopeRelation_BDict(cb.query());
        registerInScopeRelation(cb.query(), "DICT_ID", "DICT_ID", pp, "bDict", true);
    }
    public abstract String keepDictId_NotInScopeRelation_BDict(BDictCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     */
    public void setDictId_IsNull() { regDictId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     */
    public void setDictId_IsNotNull() { regDictId(CK_ISNN, DOBJ); }

    protected void regDictId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDictId(), "DICT_ID"); }
    protected abstract ConditionValue xgetCValueDictId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_TYPE: {varchar(30)}
     * @param itemType The value of itemType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemType_Equal(String itemType) {
        doSetItemType_Equal(fRES(itemType));
    }

    protected void doSetItemType_Equal(String itemType) {
        regItemType(CK_EQ, itemType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_TYPE: {varchar(30)}
     * @param itemType The value of itemType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemType_NotEqual(String itemType) {
        doSetItemType_NotEqual(fRES(itemType));
    }

    protected void doSetItemType_NotEqual(String itemType) {
        regItemType(CK_NES, itemType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_TYPE: {varchar(30)}
     * @param itemType The value of itemType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemType_GreaterThan(String itemType) {
        regItemType(CK_GT, fRES(itemType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_TYPE: {varchar(30)}
     * @param itemType The value of itemType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemType_LessThan(String itemType) {
        regItemType(CK_LT, fRES(itemType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_TYPE: {varchar(30)}
     * @param itemType The value of itemType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemType_GreaterEqual(String itemType) {
        regItemType(CK_GE, fRES(itemType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_TYPE: {varchar(30)}
     * @param itemType The value of itemType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemType_LessEqual(String itemType) {
        regItemType(CK_LE, fRES(itemType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_TYPE: {varchar(30)}
     * @param itemTypeList The collection of itemType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemType_InScope(Collection<String> itemTypeList) {
        doSetItemType_InScope(itemTypeList);
    }

    protected void doSetItemType_InScope(Collection<String> itemTypeList) {
        regINS(CK_INS, cTL(itemTypeList), xgetCValueItemType(), "ITEM_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_TYPE: {varchar(30)}
     * @param itemTypeList The collection of itemType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemType_NotInScope(Collection<String> itemTypeList) {
        doSetItemType_NotInScope(itemTypeList);
    }

    protected void doSetItemType_NotInScope(Collection<String> itemTypeList) {
        regINS(CK_NINS, cTL(itemTypeList), xgetCValueItemType(), "ITEM_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_TYPE: {varchar(30)} <br>
     * <pre>e.g. setItemType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemType The value of itemType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemType_LikeSearch(String itemType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemType), xgetCValueItemType(), "ITEM_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_TYPE: {varchar(30)}
     * @param itemType The value of itemType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemType_NotLikeSearch(String itemType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemType), xgetCValueItemType(), "ITEM_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_TYPE: {varchar(30)}
     * @param itemType The value of itemType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemType_PrefixSearch(String itemType) {
        setItemType_LikeSearch(itemType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_TYPE: {varchar(30)}
     */
    public void setItemType_IsNull() { regItemType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_TYPE: {varchar(30)}
     */
    public void setItemType_IsNullOrEmpty() { regItemType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_TYPE: {varchar(30)}
     */
    public void setItemType_IsNotNull() { regItemType(CK_ISNN, DOBJ); }

    protected void regItemType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemType(), "ITEM_TYPE"); }
    protected abstract ConditionValue xgetCValueItemType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1]}
     * @param visible The value of visible as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_Equal(String visible) {
        doSetVisible_Equal(fRES(visible));
    }

    protected void doSetVisible_Equal(String visible) {
        regVisible(CK_EQ, visible);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1]}
     * @param visible The value of visible as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_NotEqual(String visible) {
        doSetVisible_NotEqual(fRES(visible));
    }

    protected void doSetVisible_NotEqual(String visible) {
        regVisible(CK_NES, visible);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1]}
     * @param visible The value of visible as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_GreaterThan(String visible) {
        regVisible(CK_GT, fRES(visible));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1]}
     * @param visible The value of visible as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_LessThan(String visible) {
        regVisible(CK_LT, fRES(visible));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1]}
     * @param visible The value of visible as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_GreaterEqual(String visible) {
        regVisible(CK_GE, fRES(visible));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1]}
     * @param visible The value of visible as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_LessEqual(String visible) {
        regVisible(CK_LE, fRES(visible));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1]}
     * @param visibleList The collection of visible as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_InScope(Collection<String> visibleList) {
        doSetVisible_InScope(visibleList);
    }

    protected void doSetVisible_InScope(Collection<String> visibleList) {
        regINS(CK_INS, cTL(visibleList), xgetCValueVisible(), "VISIBLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1]}
     * @param visibleList The collection of visible as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_NotInScope(Collection<String> visibleList) {
        doSetVisible_NotInScope(visibleList);
    }

    protected void doSetVisible_NotInScope(Collection<String> visibleList) {
        regINS(CK_NINS, cTL(visibleList), xgetCValueVisible(), "VISIBLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1]} <br>
     * <pre>e.g. setVisible_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param visible The value of visible as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVisible_LikeSearch(String visible, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(visible), xgetCValueVisible(), "VISIBLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1]}
     * @param visible The value of visible as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVisible_NotLikeSearch(String visible, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(visible), xgetCValueVisible(), "VISIBLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1]}
     * @param visible The value of visible as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_PrefixSearch(String visible) {
        setVisible_LikeSearch(visible, xcLSOPPre());
    }

    protected void regVisible(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVisible(), "VISIBLE"); }
    protected abstract ConditionValue xgetCValueVisible();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_FORMAT: {varchar(30)}
     * @param itemFormat The value of itemFormat as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemFormat_Equal(String itemFormat) {
        doSetItemFormat_Equal(fRES(itemFormat));
    }

    protected void doSetItemFormat_Equal(String itemFormat) {
        regItemFormat(CK_EQ, itemFormat);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_FORMAT: {varchar(30)}
     * @param itemFormat The value of itemFormat as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemFormat_NotEqual(String itemFormat) {
        doSetItemFormat_NotEqual(fRES(itemFormat));
    }

    protected void doSetItemFormat_NotEqual(String itemFormat) {
        regItemFormat(CK_NES, itemFormat);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_FORMAT: {varchar(30)}
     * @param itemFormat The value of itemFormat as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemFormat_GreaterThan(String itemFormat) {
        regItemFormat(CK_GT, fRES(itemFormat));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_FORMAT: {varchar(30)}
     * @param itemFormat The value of itemFormat as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemFormat_LessThan(String itemFormat) {
        regItemFormat(CK_LT, fRES(itemFormat));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_FORMAT: {varchar(30)}
     * @param itemFormat The value of itemFormat as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemFormat_GreaterEqual(String itemFormat) {
        regItemFormat(CK_GE, fRES(itemFormat));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_FORMAT: {varchar(30)}
     * @param itemFormat The value of itemFormat as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemFormat_LessEqual(String itemFormat) {
        regItemFormat(CK_LE, fRES(itemFormat));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_FORMAT: {varchar(30)}
     * @param itemFormatList The collection of itemFormat as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemFormat_InScope(Collection<String> itemFormatList) {
        doSetItemFormat_InScope(itemFormatList);
    }

    protected void doSetItemFormat_InScope(Collection<String> itemFormatList) {
        regINS(CK_INS, cTL(itemFormatList), xgetCValueItemFormat(), "ITEM_FORMAT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_FORMAT: {varchar(30)}
     * @param itemFormatList The collection of itemFormat as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemFormat_NotInScope(Collection<String> itemFormatList) {
        doSetItemFormat_NotInScope(itemFormatList);
    }

    protected void doSetItemFormat_NotInScope(Collection<String> itemFormatList) {
        regINS(CK_NINS, cTL(itemFormatList), xgetCValueItemFormat(), "ITEM_FORMAT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_FORMAT: {varchar(30)} <br>
     * <pre>e.g. setItemFormat_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemFormat The value of itemFormat as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemFormat_LikeSearch(String itemFormat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemFormat), xgetCValueItemFormat(), "ITEM_FORMAT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_FORMAT: {varchar(30)}
     * @param itemFormat The value of itemFormat as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemFormat_NotLikeSearch(String itemFormat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemFormat), xgetCValueItemFormat(), "ITEM_FORMAT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_FORMAT: {varchar(30)}
     * @param itemFormat The value of itemFormat as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemFormat_PrefixSearch(String itemFormat) {
        setItemFormat_LikeSearch(itemFormat, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_FORMAT: {varchar(30)}
     */
    public void setItemFormat_IsNull() { regItemFormat(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_FORMAT: {varchar(30)}
     */
    public void setItemFormat_IsNullOrEmpty() { regItemFormat(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_FORMAT: {varchar(30)}
     */
    public void setItemFormat_IsNotNull() { regItemFormat(CK_ISNN, DOBJ); }

    protected void regItemFormat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemFormat(), "ITEM_FORMAT"); }
    protected abstract ConditionValue xgetCValueItemFormat();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As DelFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_Equal_AsDelFlg(CDef.DelFlg cdef) {
        doSetDelFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未削除
     */
    public void setDelFlg_Equal_$0() {
        setDelFlg_Equal_AsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 削除済
     */
    public void setDelFlg_Equal_$1() {
        setDelFlg_Equal_AsDelFlg(CDef.DelFlg.$1);
    }

    protected void doSetDelFlg_Equal(String delFlg) {
        regDelFlg(CK_EQ, delFlg);
    }

    protected void regDelFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelFlg(), "DEL_FLG"); }
    protected abstract ConditionValue xgetCValueDelFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {bigint(19)}
     * @param controlNo The value of controlNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setControlNo_Equal(Long controlNo) {
        doSetControlNo_Equal(controlNo);
    }

    protected void doSetControlNo_Equal(Long controlNo) {
        regControlNo(CK_EQ, controlNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {bigint(19)}
     * @param controlNo The value of controlNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setControlNo_NotEqual(Long controlNo) {
        doSetControlNo_NotEqual(controlNo);
    }

    protected void doSetControlNo_NotEqual(Long controlNo) {
        regControlNo(CK_NES, controlNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {bigint(19)}
     * @param minNumber The min number of controlNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of controlNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setControlNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueControlNo(), "CONTROL_NO", rangeOfOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CONTROL_NO: {bigint(19)}
     */
    public void setControlNo_IsNull() { regControlNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CONTROL_NO: {bigint(19)}
     */
    public void setControlNo_IsNotNull() { regControlNo(CK_ISNN, DOBJ); }

    protected void regControlNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueControlNo(), "CONTROL_NO"); }
    protected abstract ConditionValue xgetCValueControlNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @param addDt The value of addDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddDt_Equal(java.sql.Timestamp addDt) {
        regAddDt(CK_EQ,  addDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @param addDt The value of addDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddDt_LessEqual(java.sql.Timestamp addDt) {
        regAddDt(CK_LE, addDt);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_DT: {datetime2(26, 6)}
     */
    public void setAddDt_IsNull() { regAddDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_DT: {datetime2(26, 6)}
     */
    public void setAddDt_IsNotNull() { regAddDt(CK_ISNN, DOBJ); }

    protected void regAddDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddDt(), "ADD_DT"); }
    protected abstract ConditionValue xgetCValueAddDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_USER: {varchar(255)}
     * @param addUser The value of addUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddUser_Equal(String addUser) {
        doSetAddUser_Equal(fRES(addUser));
    }

    protected void doSetAddUser_Equal(String addUser) {
        regAddUser(CK_EQ, addUser);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_USER: {varchar(255)}
     */
    public void setAddUser_IsNull() { regAddUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADD_USER: {varchar(255)}
     */
    public void setAddUser_IsNullOrEmpty() { regAddUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_USER: {varchar(255)}
     */
    public void setAddUser_IsNotNull() { regAddUser(CK_ISNN, DOBJ); }

    protected void regAddUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddUser(), "ADD_USER"); }
    protected abstract ConditionValue xgetCValueAddUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @param addProcess The value of addProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddProcess_Equal(String addProcess) {
        doSetAddProcess_Equal(fRES(addProcess));
    }

    protected void doSetAddProcess_Equal(String addProcess) {
        regAddProcess(CK_EQ, addProcess);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {varchar(4000)}
     */
    public void setAddProcess_IsNull() { regAddProcess(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {varchar(4000)}
     */
    public void setAddProcess_IsNullOrEmpty() { regAddProcess(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {varchar(4000)}
     */
    public void setAddProcess_IsNotNull() { regAddProcess(CK_ISNN, DOBJ); }

    protected void regAddProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddProcess(), "ADD_PROCESS"); }
    protected abstract ConditionValue xgetCValueAddProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @param updDt The value of updDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDt_Equal(java.sql.Timestamp updDt) {
        regUpdDt(CK_EQ,  updDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @param updDt The value of updDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDt_LessEqual(java.sql.Timestamp updDt) {
        regUpdDt(CK_LE, updDt);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_DT: {datetime2(26, 6)}
     */
    public void setUpdDt_IsNull() { regUpdDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_DT: {datetime2(26, 6)}
     */
    public void setUpdDt_IsNotNull() { regUpdDt(CK_ISNN, DOBJ); }

    protected void regUpdDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdDt(), "UPD_DT"); }
    protected abstract ConditionValue xgetCValueUpdDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER: {varchar(255)}
     * @param updUser The value of updUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdUser_Equal(String updUser) {
        doSetUpdUser_Equal(fRES(updUser));
    }

    protected void doSetUpdUser_Equal(String updUser) {
        regUpdUser(CK_EQ, updUser);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_USER: {varchar(255)}
     */
    public void setUpdUser_IsNull() { regUpdUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_USER: {varchar(255)}
     */
    public void setUpdUser_IsNullOrEmpty() { regUpdUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_USER: {varchar(255)}
     */
    public void setUpdUser_IsNotNull() { regUpdUser(CK_ISNN, DOBJ); }

    protected void regUpdUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdUser(), "UPD_USER"); }
    protected abstract ConditionValue xgetCValueUpdUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @param updProcess The value of updProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdProcess_Equal(String updProcess) {
        doSetUpdProcess_Equal(fRES(updProcess));
    }

    protected void doSetUpdProcess_Equal(String updProcess) {
        regUpdProcess(CK_EQ, updProcess);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {varchar(4000)}
     */
    public void setUpdProcess_IsNull() { regUpdProcess(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {varchar(4000)}
     */
    public void setUpdProcess_IsNullOrEmpty() { regUpdProcess(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {varchar(4000)}
     */
    public void setUpdProcess_IsNotNull() { regUpdProcess(CK_ISNN, DOBJ); }

    protected void regUpdProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdProcess(), "UPD_PROCESS"); }
    protected abstract ConditionValue xgetCValueUpdProcess();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PReportLayoutItemCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PReportLayoutItemCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PReportLayoutItemCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PReportLayoutItemCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PReportLayoutItemCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PReportLayoutItemCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PReportLayoutItemCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PReportLayoutItemCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PReportLayoutItemCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PReportLayoutItemCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PReportLayoutItemCB&gt;() {
     *     public void query(PReportLayoutItemCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PReportLayoutItemCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PReportLayoutItemCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PReportLayoutItemCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PReportLayoutItemCQ sq);

    protected PReportLayoutItemCB xcreateScalarConditionCB() {
        PReportLayoutItemCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PReportLayoutItemCB xcreateScalarConditionPartitionByCB() {
        PReportLayoutItemCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PReportLayoutItemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PReportLayoutItemCB cb = new PReportLayoutItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "REPORT_LAYOUT_ITEM_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PReportLayoutItemCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PReportLayoutItemCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PReportLayoutItemCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PReportLayoutItemCB cb = new PReportLayoutItemCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REPORT_LAYOUT_ITEM_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PReportLayoutItemCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PReportLayoutItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PReportLayoutItemCB cb = new PReportLayoutItemCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PReportLayoutItemCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param option The option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOption option) { // is user public!
        xdoWithManualOrder(option);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    /**
     * Order along the list of manual values. #beforejava8 <br>
     * This function with Union is unsupported! <br>
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderOption option = new ManualOrderOption();
        option.acceptOrderValueList(orderValueList);
        withManualOrder(option);
    }

    @Override
    protected void filterFromToOption(String columnDbName, FromToOption option) {
        option.allowOneSide();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected PReportLayoutItemCB newMyCB() {
        return new PReportLayoutItemCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PReportLayoutItemCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
