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
 * The abstract condition-query of P_SUBREP_LAYOUT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPSubrepLayoutCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPSubrepLayoutCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "P_SUBREP_LAYOUT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param subrepLayoutId The value of subrepLayoutId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubrepLayoutId_Equal(Long subrepLayoutId) {
        doSetSubrepLayoutId_Equal(subrepLayoutId);
    }

    protected void doSetSubrepLayoutId_Equal(Long subrepLayoutId) {
        regSubrepLayoutId(CK_EQ, subrepLayoutId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param subrepLayoutId The value of subrepLayoutId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubrepLayoutId_NotEqual(Long subrepLayoutId) {
        doSetSubrepLayoutId_NotEqual(subrepLayoutId);
    }

    protected void doSetSubrepLayoutId_NotEqual(Long subrepLayoutId) {
        regSubrepLayoutId(CK_NES, subrepLayoutId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param subrepLayoutId The value of subrepLayoutId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubrepLayoutId_GreaterThan(Long subrepLayoutId) {
        regSubrepLayoutId(CK_GT, subrepLayoutId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param subrepLayoutId The value of subrepLayoutId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubrepLayoutId_LessThan(Long subrepLayoutId) {
        regSubrepLayoutId(CK_LT, subrepLayoutId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param subrepLayoutId The value of subrepLayoutId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubrepLayoutId_GreaterEqual(Long subrepLayoutId) {
        regSubrepLayoutId(CK_GE, subrepLayoutId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param subrepLayoutId The value of subrepLayoutId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubrepLayoutId_LessEqual(Long subrepLayoutId) {
        regSubrepLayoutId(CK_LE, subrepLayoutId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of subrepLayoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of subrepLayoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSubrepLayoutId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSubrepLayoutId(), "SUBREP_LAYOUT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUBREP_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param subrepLayoutIdList The collection of subrepLayoutId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubrepLayoutId_InScope(Collection<Long> subrepLayoutIdList) {
        doSetSubrepLayoutId_InScope(subrepLayoutIdList);
    }

    protected void doSetSubrepLayoutId_InScope(Collection<Long> subrepLayoutIdList) {
        regINS(CK_INS, cTL(subrepLayoutIdList), xgetCValueSubrepLayoutId(), "SUBREP_LAYOUT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUBREP_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param subrepLayoutIdList The collection of subrepLayoutId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubrepLayoutId_NotInScope(Collection<Long> subrepLayoutIdList) {
        doSetSubrepLayoutId_NotInScope(subrepLayoutIdList);
    }

    protected void doSetSubrepLayoutId_NotInScope(Collection<Long> subrepLayoutIdList) {
        regINS(CK_NINS, cTL(subrepLayoutIdList), xgetCValueSubrepLayoutId(), "SUBREP_LAYOUT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SUBREP_LAYOUT_ID from P_SUBREP_LAYOUT_ITEM where ...)} <br>
     * P_SUBREP_LAYOUT_ITEM by SUBREP_LAYOUT_ID, named 'PSubrepLayoutItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPSubrepLayoutItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PSubrepLayoutItemList for 'exists'. (NotNull)
     */
    public void existsPSubrepLayoutItemList(SubQuery<PSubrepLayoutItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PSubrepLayoutItemCB cb = new PSubrepLayoutItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSubrepLayoutId_ExistsReferrer_PSubrepLayoutItemList(cb.query());
        registerExistsReferrer(cb.query(), "SUBREP_LAYOUT_ID", "SUBREP_LAYOUT_ID", pp, "pSubrepLayoutItemList");
    }
    public abstract String keepSubrepLayoutId_ExistsReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SUBREP_LAYOUT_ID from P_SUBREP_LAYOUT_ITEM where ...)} <br>
     * P_SUBREP_LAYOUT_ITEM by SUBREP_LAYOUT_ID, named 'PSubrepLayoutItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPSubrepLayoutItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SubrepLayoutId_NotExistsReferrer_PSubrepLayoutItemList for 'not exists'. (NotNull)
     */
    public void notExistsPSubrepLayoutItemList(SubQuery<PSubrepLayoutItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PSubrepLayoutItemCB cb = new PSubrepLayoutItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSubrepLayoutId_NotExistsReferrer_PSubrepLayoutItemList(cb.query());
        registerNotExistsReferrer(cb.query(), "SUBREP_LAYOUT_ID", "SUBREP_LAYOUT_ID", pp, "pSubrepLayoutItemList");
    }
    public abstract String keepSubrepLayoutId_NotExistsReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq);

    public void xsderivePSubrepLayoutItemList(String fn, SubQuery<PSubrepLayoutItemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PSubrepLayoutItemCB cb = new PSubrepLayoutItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSubrepLayoutId_SpecifyDerivedReferrer_PSubrepLayoutItemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SUBREP_LAYOUT_ID", "SUBREP_LAYOUT_ID", pp, "pSubrepLayoutItemList", al, op);
    }
    public abstract String keepSubrepLayoutId_SpecifyDerivedReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from P_SUBREP_LAYOUT_ITEM where ...)} <br>
     * P_SUBREP_LAYOUT_ITEM by SUBREP_LAYOUT_ID, named 'PSubrepLayoutItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPSubrepLayoutItemList()</span>.<span style="color: #CC4747">max</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     itemCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PSubrepLayoutItemCB> derivedPSubrepLayoutItemList() {
        return xcreateQDRFunctionPSubrepLayoutItemList();
    }
    protected HpQDRFunction<PSubrepLayoutItemCB> xcreateQDRFunctionPSubrepLayoutItemList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePSubrepLayoutItemList(fn, sq, rd, vl, op));
    }
    public void xqderivePSubrepLayoutItemList(String fn, SubQuery<PSubrepLayoutItemCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PSubrepLayoutItemCB cb = new PSubrepLayoutItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepSubrepLayoutId_QueryDerivedReferrer_PSubrepLayoutItemList(cb.query()); String prpp = keepSubrepLayoutId_QueryDerivedReferrer_PSubrepLayoutItemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SUBREP_LAYOUT_ID", "SUBREP_LAYOUT_ID", sqpp, "pSubrepLayoutItemList", rd, vl, prpp, op);
    }
    public abstract String keepSubrepLayoutId_QueryDerivedReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq);
    public abstract String keepSubrepLayoutId_QueryDerivedReferrer_PSubrepLayoutItemListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSubrepLayoutId_IsNull() { regSubrepLayoutId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSubrepLayoutId_IsNotNull() { regSubrepLayoutId(CK_ISNN, DOBJ); }

    protected void regSubrepLayoutId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSubrepLayoutId(), "SUBREP_LAYOUT_ID"); }
    protected abstract ConditionValue xgetCValueSubrepLayoutId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
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
     * REPORT_LAYOUT_ID: {UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
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
     * REPORT_LAYOUT_ID: {UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param reportLayoutId The value of reportLayoutId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_GreaterThan(Long reportLayoutId) {
        regReportLayoutId(CK_GT, reportLayoutId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param reportLayoutId The value of reportLayoutId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_LessThan(Long reportLayoutId) {
        regReportLayoutId(CK_LT, reportLayoutId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param reportLayoutId The value of reportLayoutId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_GreaterEqual(Long reportLayoutId) {
        regReportLayoutId(CK_GE, reportLayoutId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param reportLayoutId The value of reportLayoutId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_LessEqual(Long reportLayoutId) {
        regReportLayoutId(CK_LE, reportLayoutId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param minNumber The min number of reportLayoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reportLayoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReportLayoutId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReportLayoutId(), "REPORT_LAYOUT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_ID: {UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
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
     * REPORT_LAYOUT_ID: {UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
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
     * SUBREP_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @param subrepLayoutData The value of subrepLayoutData as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubrepLayoutData_Equal(String subrepLayoutData) {
        doSetSubrepLayoutData_Equal(fRES(subrepLayoutData));
    }

    protected void doSetSubrepLayoutData_Equal(String subrepLayoutData) {
        regSubrepLayoutData(CK_EQ, subrepLayoutData);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @param subrepLayoutData The value of subrepLayoutData as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubrepLayoutData_NotEqual(String subrepLayoutData) {
        doSetSubrepLayoutData_NotEqual(fRES(subrepLayoutData));
    }

    protected void doSetSubrepLayoutData_NotEqual(String subrepLayoutData) {
        regSubrepLayoutData(CK_NES, subrepLayoutData);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @param subrepLayoutData The value of subrepLayoutData as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubrepLayoutData_GreaterThan(String subrepLayoutData) {
        regSubrepLayoutData(CK_GT, fRES(subrepLayoutData));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @param subrepLayoutData The value of subrepLayoutData as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubrepLayoutData_LessThan(String subrepLayoutData) {
        regSubrepLayoutData(CK_LT, fRES(subrepLayoutData));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @param subrepLayoutData The value of subrepLayoutData as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubrepLayoutData_GreaterEqual(String subrepLayoutData) {
        regSubrepLayoutData(CK_GE, fRES(subrepLayoutData));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @param subrepLayoutData The value of subrepLayoutData as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubrepLayoutData_LessEqual(String subrepLayoutData) {
        regSubrepLayoutData(CK_LE, fRES(subrepLayoutData));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUBREP_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @param subrepLayoutDataList The collection of subrepLayoutData as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubrepLayoutData_InScope(Collection<String> subrepLayoutDataList) {
        doSetSubrepLayoutData_InScope(subrepLayoutDataList);
    }

    protected void doSetSubrepLayoutData_InScope(Collection<String> subrepLayoutDataList) {
        regINS(CK_INS, cTL(subrepLayoutDataList), xgetCValueSubrepLayoutData(), "SUBREP_LAYOUT_DATA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUBREP_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @param subrepLayoutDataList The collection of subrepLayoutData as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubrepLayoutData_NotInScope(Collection<String> subrepLayoutDataList) {
        doSetSubrepLayoutData_NotInScope(subrepLayoutDataList);
    }

    protected void doSetSubrepLayoutData_NotInScope(Collection<String> subrepLayoutDataList) {
        regINS(CK_NINS, cTL(subrepLayoutDataList), xgetCValueSubrepLayoutData(), "SUBREP_LAYOUT_DATA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUBREP_LAYOUT_DATA: {NotNull, varchar(2147483647)} <br>
     * <pre>e.g. setSubrepLayoutData_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param subrepLayoutData The value of subrepLayoutData as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSubrepLayoutData_LikeSearch(String subrepLayoutData, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(subrepLayoutData), xgetCValueSubrepLayoutData(), "SUBREP_LAYOUT_DATA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUBREP_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @param subrepLayoutData The value of subrepLayoutData as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSubrepLayoutData_NotLikeSearch(String subrepLayoutData, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(subrepLayoutData), xgetCValueSubrepLayoutData(), "SUBREP_LAYOUT_DATA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUBREP_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @param subrepLayoutData The value of subrepLayoutData as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubrepLayoutData_PrefixSearch(String subrepLayoutData) {
        setSubrepLayoutData_LikeSearch(subrepLayoutData, xcLSOPPre());
    }

    protected void regSubrepLayoutData(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSubrepLayoutData(), "SUBREP_LAYOUT_DATA"); }
    protected abstract ConditionValue xgetCValueSubrepLayoutData();

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
    public HpSLCFunction<PSubrepLayoutCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PSubrepLayoutCB.class);
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
    public HpSLCFunction<PSubrepLayoutCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PSubrepLayoutCB.class);
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
    public HpSLCFunction<PSubrepLayoutCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PSubrepLayoutCB.class);
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
    public HpSLCFunction<PSubrepLayoutCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PSubrepLayoutCB.class);
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
    public HpSLCFunction<PSubrepLayoutCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PSubrepLayoutCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PSubrepLayoutCB&gt;() {
     *     public void query(PSubrepLayoutCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PSubrepLayoutCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PSubrepLayoutCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PSubrepLayoutCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PSubrepLayoutCQ sq);

    protected PSubrepLayoutCB xcreateScalarConditionCB() {
        PSubrepLayoutCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PSubrepLayoutCB xcreateScalarConditionPartitionByCB() {
        PSubrepLayoutCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PSubrepLayoutCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PSubrepLayoutCB cb = new PSubrepLayoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SUBREP_LAYOUT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PSubrepLayoutCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PSubrepLayoutCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PSubrepLayoutCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PSubrepLayoutCB cb = new PSubrepLayoutCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SUBREP_LAYOUT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PSubrepLayoutCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PSubrepLayoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PSubrepLayoutCB cb = new PSubrepLayoutCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PSubrepLayoutCQ sq);

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
    protected PSubrepLayoutCB newMyCB() {
        return new PSubrepLayoutCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PSubrepLayoutCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
