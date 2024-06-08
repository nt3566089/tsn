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
 * The abstract condition-query of P_PRINT_REQUEST_DATA.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPPrintRequestDataCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPPrintRequestDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "P_PRINT_REQUEST_DATA";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST}
     * @param printRequestId The value of printRequestId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_Equal(Long printRequestId) {
        doSetPrintRequestId_Equal(printRequestId);
    }

    protected void doSetPrintRequestId_Equal(Long printRequestId) {
        regPrintRequestId(CK_EQ, printRequestId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST}
     * @param printRequestId The value of printRequestId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_NotEqual(Long printRequestId) {
        doSetPrintRequestId_NotEqual(printRequestId);
    }

    protected void doSetPrintRequestId_NotEqual(Long printRequestId) {
        regPrintRequestId(CK_NES, printRequestId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST}
     * @param printRequestId The value of printRequestId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_GreaterThan(Long printRequestId) {
        regPrintRequestId(CK_GT, printRequestId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST}
     * @param printRequestId The value of printRequestId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_LessThan(Long printRequestId) {
        regPrintRequestId(CK_LT, printRequestId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST}
     * @param printRequestId The value of printRequestId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_GreaterEqual(Long printRequestId) {
        regPrintRequestId(CK_GE, printRequestId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST}
     * @param printRequestId The value of printRequestId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_LessEqual(Long printRequestId) {
        regPrintRequestId(CK_LE, printRequestId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST}
     * @param minNumber The min number of printRequestId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printRequestId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintRequestId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintRequestId(), "PRINT_REQUEST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST}
     * @param printRequestIdList The collection of printRequestId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintRequestId_InScope(Collection<Long> printRequestIdList) {
        doSetPrintRequestId_InScope(printRequestIdList);
    }

    protected void doSetPrintRequestId_InScope(Collection<Long> printRequestIdList) {
        regINS(CK_INS, cTL(printRequestIdList), xgetCValuePrintRequestId(), "PRINT_REQUEST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST}
     * @param printRequestIdList The collection of printRequestId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintRequestId_NotInScope(Collection<Long> printRequestIdList) {
        doSetPrintRequestId_NotInScope(printRequestIdList);
    }

    protected void doSetPrintRequestId_NotInScope(Collection<Long> printRequestIdList) {
        regINS(CK_NINS, cTL(printRequestIdList), xgetCValuePrintRequestId(), "PRINT_REQUEST_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRINT_REQUEST_ID from P_PRINT_REQUEST where ...)} <br />
     * P_PRINT_REQUEST by my PRINT_REQUEST_ID, named 'PPrintRequest'.
     * @param subCBLambda The callback for sub-query of PPrintRequest for 'in-scope'. (NotNull)
     */
    public void inScopePPrintRequest(SubQuery<PPrintRequestCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrintRequestCB cb = new PPrintRequestCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPrintRequestId_InScopeRelation_PPrintRequest(cb.query());
        registerInScopeRelation(cb.query(), "PRINT_REQUEST_ID", "PRINT_REQUEST_ID", pp, "pPrintRequest", false);
    }
    public abstract String keepPrintRequestId_InScopeRelation_PPrintRequest(PPrintRequestCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRINT_REQUEST_ID from P_PRINT_REQUEST where ...)} <br />
     * P_PRINT_REQUEST by my PRINT_REQUEST_ID, named 'PPrintRequest'.
     * @param subCBLambda The callback for sub-query of PPrintRequest for 'not in-scope'. (NotNull)
     */
    public void notInScopePPrintRequest(SubQuery<PPrintRequestCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrintRequestCB cb = new PPrintRequestCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPrintRequestId_NotInScopeRelation_PPrintRequest(cb.query());
        registerInScopeRelation(cb.query(), "PRINT_REQUEST_ID", "PRINT_REQUEST_ID", pp, "pPrintRequest", true);
    }
    public abstract String keepPrintRequestId_NotInScopeRelation_PPrintRequest(PPrintRequestCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST}
     */
    public void setPrintRequestId_IsNull() { regPrintRequestId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST}
     */
    public void setPrintRequestId_IsNotNull() { regPrintRequestId(CK_ISNN, DOBJ); }

    protected void regPrintRequestId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintRequestId(), "PRINT_REQUEST_ID"); }
    protected abstract ConditionValue xgetCValuePrintRequestId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_DATA: {varchar(2147483647)}
     * @param reportLayoutData The value of reportLayoutData as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutData_Equal(String reportLayoutData) {
        doSetReportLayoutData_Equal(fRES(reportLayoutData));
    }

    protected void doSetReportLayoutData_Equal(String reportLayoutData) {
        regReportLayoutData(CK_EQ, reportLayoutData);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_DATA: {varchar(2147483647)}
     * @param reportLayoutData The value of reportLayoutData as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutData_NotEqual(String reportLayoutData) {
        doSetReportLayoutData_NotEqual(fRES(reportLayoutData));
    }

    protected void doSetReportLayoutData_NotEqual(String reportLayoutData) {
        regReportLayoutData(CK_NES, reportLayoutData);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_DATA: {varchar(2147483647)}
     * @param reportLayoutData The value of reportLayoutData as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutData_GreaterThan(String reportLayoutData) {
        regReportLayoutData(CK_GT, fRES(reportLayoutData));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_DATA: {varchar(2147483647)}
     * @param reportLayoutData The value of reportLayoutData as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutData_LessThan(String reportLayoutData) {
        regReportLayoutData(CK_LT, fRES(reportLayoutData));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_DATA: {varchar(2147483647)}
     * @param reportLayoutData The value of reportLayoutData as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutData_GreaterEqual(String reportLayoutData) {
        regReportLayoutData(CK_GE, fRES(reportLayoutData));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_DATA: {varchar(2147483647)}
     * @param reportLayoutData The value of reportLayoutData as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutData_LessEqual(String reportLayoutData) {
        regReportLayoutData(CK_LE, fRES(reportLayoutData));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_DATA: {varchar(2147483647)}
     * @param reportLayoutDataList The collection of reportLayoutData as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutData_InScope(Collection<String> reportLayoutDataList) {
        doSetReportLayoutData_InScope(reportLayoutDataList);
    }

    protected void doSetReportLayoutData_InScope(Collection<String> reportLayoutDataList) {
        regINS(CK_INS, cTL(reportLayoutDataList), xgetCValueReportLayoutData(), "REPORT_LAYOUT_DATA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_DATA: {varchar(2147483647)}
     * @param reportLayoutDataList The collection of reportLayoutData as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutData_NotInScope(Collection<String> reportLayoutDataList) {
        doSetReportLayoutData_NotInScope(reportLayoutDataList);
    }

    protected void doSetReportLayoutData_NotInScope(Collection<String> reportLayoutDataList) {
        regINS(CK_NINS, cTL(reportLayoutDataList), xgetCValueReportLayoutData(), "REPORT_LAYOUT_DATA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_DATA: {varchar(2147483647)} <br>
     * <pre>e.g. setReportLayoutData_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reportLayoutData The value of reportLayoutData as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReportLayoutData_LikeSearch(String reportLayoutData, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reportLayoutData), xgetCValueReportLayoutData(), "REPORT_LAYOUT_DATA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_DATA: {varchar(2147483647)}
     * @param reportLayoutData The value of reportLayoutData as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReportLayoutData_NotLikeSearch(String reportLayoutData, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reportLayoutData), xgetCValueReportLayoutData(), "REPORT_LAYOUT_DATA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_DATA: {varchar(2147483647)}
     * @param reportLayoutData The value of reportLayoutData as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutData_PrefixSearch(String reportLayoutData) {
        setReportLayoutData_LikeSearch(reportLayoutData, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_DATA: {varchar(2147483647)}
     */
    public void setReportLayoutData_IsNull() { regReportLayoutData(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_DATA: {varchar(2147483647)}
     */
    public void setReportLayoutData_IsNullOrEmpty() { regReportLayoutData(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_DATA: {varchar(2147483647)}
     */
    public void setReportLayoutData_IsNotNull() { regReportLayoutData(CK_ISNN, DOBJ); }

    protected void regReportLayoutData(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportLayoutData(), "REPORT_LAYOUT_DATA"); }
    protected abstract ConditionValue xgetCValueReportLayoutData();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_DATA: {varchar(2147483647)}
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
     * SUBREP_LAYOUT_DATA: {varchar(2147483647)}
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
     * SUBREP_LAYOUT_DATA: {varchar(2147483647)}
     * @param subrepLayoutData The value of subrepLayoutData as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubrepLayoutData_GreaterThan(String subrepLayoutData) {
        regSubrepLayoutData(CK_GT, fRES(subrepLayoutData));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_DATA: {varchar(2147483647)}
     * @param subrepLayoutData The value of subrepLayoutData as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubrepLayoutData_LessThan(String subrepLayoutData) {
        regSubrepLayoutData(CK_LT, fRES(subrepLayoutData));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_DATA: {varchar(2147483647)}
     * @param subrepLayoutData The value of subrepLayoutData as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubrepLayoutData_GreaterEqual(String subrepLayoutData) {
        regSubrepLayoutData(CK_GE, fRES(subrepLayoutData));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_DATA: {varchar(2147483647)}
     * @param subrepLayoutData The value of subrepLayoutData as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubrepLayoutData_LessEqual(String subrepLayoutData) {
        regSubrepLayoutData(CK_LE, fRES(subrepLayoutData));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUBREP_LAYOUT_DATA: {varchar(2147483647)}
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
     * SUBREP_LAYOUT_DATA: {varchar(2147483647)}
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
     * SUBREP_LAYOUT_DATA: {varchar(2147483647)} <br>
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
     * SUBREP_LAYOUT_DATA: {varchar(2147483647)}
     * @param subrepLayoutData The value of subrepLayoutData as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSubrepLayoutData_NotLikeSearch(String subrepLayoutData, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(subrepLayoutData), xgetCValueSubrepLayoutData(), "SUBREP_LAYOUT_DATA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUBREP_LAYOUT_DATA: {varchar(2147483647)}
     * @param subrepLayoutData The value of subrepLayoutData as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubrepLayoutData_PrefixSearch(String subrepLayoutData) {
        setSubrepLayoutData_LikeSearch(subrepLayoutData, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_DATA: {varchar(2147483647)}
     */
    public void setSubrepLayoutData_IsNull() { regSubrepLayoutData(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_DATA: {varchar(2147483647)}
     */
    public void setSubrepLayoutData_IsNullOrEmpty() { regSubrepLayoutData(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_DATA: {varchar(2147483647)}
     */
    public void setSubrepLayoutData_IsNotNull() { regSubrepLayoutData(CK_ISNN, DOBJ); }

    protected void regSubrepLayoutData(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSubrepLayoutData(), "SUBREP_LAYOUT_DATA"); }
    protected abstract ConditionValue xgetCValueSubrepLayoutData();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_BINARY: {varbinary(2147483647)}
     */
    public void setReportLayoutBinary_IsNull() { regReportLayoutBinary(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_BINARY: {varbinary(2147483647)}
     */
    public void setReportLayoutBinary_IsNotNull() { regReportLayoutBinary(CK_ISNN, DOBJ); }

    protected void regReportLayoutBinary(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportLayoutBinary(), "REPORT_LAYOUT_BINARY"); }
    protected abstract ConditionValue xgetCValueReportLayoutBinary();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_BINARY: {varbinary(2147483647)}
     */
    public void setSubrepLayoutBinary_IsNull() { regSubrepLayoutBinary(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUBREP_LAYOUT_BINARY: {varbinary(2147483647)}
     */
    public void setSubrepLayoutBinary_IsNotNull() { regSubrepLayoutBinary(CK_ISNN, DOBJ); }

    protected void regSubrepLayoutBinary(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSubrepLayoutBinary(), "SUBREP_LAYOUT_BINARY"); }
    protected abstract ConditionValue xgetCValueSubrepLayoutBinary();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_FOR_REPORT: {varchar(2147483647)}
     * @param dataForReport The value of dataForReport as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataForReport_Equal(String dataForReport) {
        doSetDataForReport_Equal(fRES(dataForReport));
    }

    protected void doSetDataForReport_Equal(String dataForReport) {
        regDataForReport(CK_EQ, dataForReport);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_FOR_REPORT: {varchar(2147483647)}
     * @param dataForReport The value of dataForReport as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataForReport_NotEqual(String dataForReport) {
        doSetDataForReport_NotEqual(fRES(dataForReport));
    }

    protected void doSetDataForReport_NotEqual(String dataForReport) {
        regDataForReport(CK_NES, dataForReport);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_FOR_REPORT: {varchar(2147483647)}
     * @param dataForReport The value of dataForReport as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataForReport_GreaterThan(String dataForReport) {
        regDataForReport(CK_GT, fRES(dataForReport));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_FOR_REPORT: {varchar(2147483647)}
     * @param dataForReport The value of dataForReport as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataForReport_LessThan(String dataForReport) {
        regDataForReport(CK_LT, fRES(dataForReport));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_FOR_REPORT: {varchar(2147483647)}
     * @param dataForReport The value of dataForReport as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataForReport_GreaterEqual(String dataForReport) {
        regDataForReport(CK_GE, fRES(dataForReport));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_FOR_REPORT: {varchar(2147483647)}
     * @param dataForReport The value of dataForReport as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataForReport_LessEqual(String dataForReport) {
        regDataForReport(CK_LE, fRES(dataForReport));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_FOR_REPORT: {varchar(2147483647)}
     * @param dataForReportList The collection of dataForReport as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataForReport_InScope(Collection<String> dataForReportList) {
        doSetDataForReport_InScope(dataForReportList);
    }

    protected void doSetDataForReport_InScope(Collection<String> dataForReportList) {
        regINS(CK_INS, cTL(dataForReportList), xgetCValueDataForReport(), "DATA_FOR_REPORT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_FOR_REPORT: {varchar(2147483647)}
     * @param dataForReportList The collection of dataForReport as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataForReport_NotInScope(Collection<String> dataForReportList) {
        doSetDataForReport_NotInScope(dataForReportList);
    }

    protected void doSetDataForReport_NotInScope(Collection<String> dataForReportList) {
        regINS(CK_NINS, cTL(dataForReportList), xgetCValueDataForReport(), "DATA_FOR_REPORT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_FOR_REPORT: {varchar(2147483647)} <br>
     * <pre>e.g. setDataForReport_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataForReport The value of dataForReport as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataForReport_LikeSearch(String dataForReport, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataForReport), xgetCValueDataForReport(), "DATA_FOR_REPORT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_FOR_REPORT: {varchar(2147483647)}
     * @param dataForReport The value of dataForReport as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataForReport_NotLikeSearch(String dataForReport, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataForReport), xgetCValueDataForReport(), "DATA_FOR_REPORT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_FOR_REPORT: {varchar(2147483647)}
     * @param dataForReport The value of dataForReport as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataForReport_PrefixSearch(String dataForReport) {
        setDataForReport_LikeSearch(dataForReport, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_FOR_REPORT: {varchar(2147483647)}
     */
    public void setDataForReport_IsNull() { regDataForReport(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_FOR_REPORT: {varchar(2147483647)}
     */
    public void setDataForReport_IsNullOrEmpty() { regDataForReport(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_FOR_REPORT: {varchar(2147483647)}
     */
    public void setDataForReport_IsNotNull() { regDataForReport(CK_ISNN, DOBJ); }

    protected void regDataForReport(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataForReport(), "DATA_FOR_REPORT"); }
    protected abstract ConditionValue xgetCValueDataForReport();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CULTURE_CD: {varchar(30)}
     * @param cultureCd The value of cultureCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_Equal(String cultureCd) {
        doSetCultureCd_Equal(fRES(cultureCd));
    }

    protected void doSetCultureCd_Equal(String cultureCd) {
        regCultureCd(CK_EQ, cultureCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CULTURE_CD: {varchar(30)}
     * @param cultureCd The value of cultureCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_NotEqual(String cultureCd) {
        doSetCultureCd_NotEqual(fRES(cultureCd));
    }

    protected void doSetCultureCd_NotEqual(String cultureCd) {
        regCultureCd(CK_NES, cultureCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CULTURE_CD: {varchar(30)}
     * @param cultureCd The value of cultureCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_GreaterThan(String cultureCd) {
        regCultureCd(CK_GT, fRES(cultureCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CULTURE_CD: {varchar(30)}
     * @param cultureCd The value of cultureCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_LessThan(String cultureCd) {
        regCultureCd(CK_LT, fRES(cultureCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CULTURE_CD: {varchar(30)}
     * @param cultureCd The value of cultureCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_GreaterEqual(String cultureCd) {
        regCultureCd(CK_GE, fRES(cultureCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CULTURE_CD: {varchar(30)}
     * @param cultureCd The value of cultureCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_LessEqual(String cultureCd) {
        regCultureCd(CK_LE, fRES(cultureCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CULTURE_CD: {varchar(30)}
     * @param cultureCdList The collection of cultureCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_InScope(Collection<String> cultureCdList) {
        doSetCultureCd_InScope(cultureCdList);
    }

    protected void doSetCultureCd_InScope(Collection<String> cultureCdList) {
        regINS(CK_INS, cTL(cultureCdList), xgetCValueCultureCd(), "CULTURE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CULTURE_CD: {varchar(30)}
     * @param cultureCdList The collection of cultureCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_NotInScope(Collection<String> cultureCdList) {
        doSetCultureCd_NotInScope(cultureCdList);
    }

    protected void doSetCultureCd_NotInScope(Collection<String> cultureCdList) {
        regINS(CK_NINS, cTL(cultureCdList), xgetCValueCultureCd(), "CULTURE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CULTURE_CD: {varchar(30)} <br>
     * <pre>e.g. setCultureCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cultureCd The value of cultureCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCultureCd_LikeSearch(String cultureCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cultureCd), xgetCValueCultureCd(), "CULTURE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CULTURE_CD: {varchar(30)}
     * @param cultureCd The value of cultureCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCultureCd_NotLikeSearch(String cultureCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cultureCd), xgetCValueCultureCd(), "CULTURE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CULTURE_CD: {varchar(30)}
     * @param cultureCd The value of cultureCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_PrefixSearch(String cultureCd) {
        setCultureCd_LikeSearch(cultureCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CULTURE_CD: {varchar(30)}
     */
    public void setCultureCd_IsNull() { regCultureCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CULTURE_CD: {varchar(30)}
     */
    public void setCultureCd_IsNullOrEmpty() { regCultureCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CULTURE_CD: {varchar(30)}
     */
    public void setCultureCd_IsNotNull() { regCultureCd(CK_ISNN, DOBJ); }

    protected void regCultureCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCultureCd(), "CULTURE_CD"); }
    protected abstract ConditionValue xgetCValueCultureCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_CD: {varchar(30)}
     * @param timeZoneCd The value of timeZoneCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_Equal(String timeZoneCd) {
        doSetTimeZoneCd_Equal(fRES(timeZoneCd));
    }

    protected void doSetTimeZoneCd_Equal(String timeZoneCd) {
        regTimeZoneCd(CK_EQ, timeZoneCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_CD: {varchar(30)}
     * @param timeZoneCd The value of timeZoneCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_NotEqual(String timeZoneCd) {
        doSetTimeZoneCd_NotEqual(fRES(timeZoneCd));
    }

    protected void doSetTimeZoneCd_NotEqual(String timeZoneCd) {
        regTimeZoneCd(CK_NES, timeZoneCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_CD: {varchar(30)}
     * @param timeZoneCd The value of timeZoneCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_GreaterThan(String timeZoneCd) {
        regTimeZoneCd(CK_GT, fRES(timeZoneCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_CD: {varchar(30)}
     * @param timeZoneCd The value of timeZoneCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_LessThan(String timeZoneCd) {
        regTimeZoneCd(CK_LT, fRES(timeZoneCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_CD: {varchar(30)}
     * @param timeZoneCd The value of timeZoneCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_GreaterEqual(String timeZoneCd) {
        regTimeZoneCd(CK_GE, fRES(timeZoneCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_CD: {varchar(30)}
     * @param timeZoneCd The value of timeZoneCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_LessEqual(String timeZoneCd) {
        regTimeZoneCd(CK_LE, fRES(timeZoneCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TIME_ZONE_CD: {varchar(30)}
     * @param timeZoneCdList The collection of timeZoneCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_InScope(Collection<String> timeZoneCdList) {
        doSetTimeZoneCd_InScope(timeZoneCdList);
    }

    protected void doSetTimeZoneCd_InScope(Collection<String> timeZoneCdList) {
        regINS(CK_INS, cTL(timeZoneCdList), xgetCValueTimeZoneCd(), "TIME_ZONE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TIME_ZONE_CD: {varchar(30)}
     * @param timeZoneCdList The collection of timeZoneCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_NotInScope(Collection<String> timeZoneCdList) {
        doSetTimeZoneCd_NotInScope(timeZoneCdList);
    }

    protected void doSetTimeZoneCd_NotInScope(Collection<String> timeZoneCdList) {
        regINS(CK_NINS, cTL(timeZoneCdList), xgetCValueTimeZoneCd(), "TIME_ZONE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_ZONE_CD: {varchar(30)} <br>
     * <pre>e.g. setTimeZoneCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param timeZoneCd The value of timeZoneCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTimeZoneCd_LikeSearch(String timeZoneCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(timeZoneCd), xgetCValueTimeZoneCd(), "TIME_ZONE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_ZONE_CD: {varchar(30)}
     * @param timeZoneCd The value of timeZoneCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTimeZoneCd_NotLikeSearch(String timeZoneCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(timeZoneCd), xgetCValueTimeZoneCd(), "TIME_ZONE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_ZONE_CD: {varchar(30)}
     * @param timeZoneCd The value of timeZoneCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_PrefixSearch(String timeZoneCd) {
        setTimeZoneCd_LikeSearch(timeZoneCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TIME_ZONE_CD: {varchar(30)}
     */
    public void setTimeZoneCd_IsNull() { regTimeZoneCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TIME_ZONE_CD: {varchar(30)}
     */
    public void setTimeZoneCd_IsNullOrEmpty() { regTimeZoneCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TIME_ZONE_CD: {varchar(30)}
     */
    public void setTimeZoneCd_IsNotNull() { regTimeZoneCd(CK_ISNN, DOBJ); }

    protected void regTimeZoneCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTimeZoneCd(), "TIME_ZONE_CD"); }
    protected abstract ConditionValue xgetCValueTimeZoneCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT: {varchar(30)}
     * @param dateTimeFormat The value of dateTimeFormat as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormat_Equal(String dateTimeFormat) {
        doSetDateTimeFormat_Equal(fRES(dateTimeFormat));
    }

    protected void doSetDateTimeFormat_Equal(String dateTimeFormat) {
        regDateTimeFormat(CK_EQ, dateTimeFormat);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT: {varchar(30)}
     * @param dateTimeFormat The value of dateTimeFormat as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormat_NotEqual(String dateTimeFormat) {
        doSetDateTimeFormat_NotEqual(fRES(dateTimeFormat));
    }

    protected void doSetDateTimeFormat_NotEqual(String dateTimeFormat) {
        regDateTimeFormat(CK_NES, dateTimeFormat);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT: {varchar(30)}
     * @param dateTimeFormat The value of dateTimeFormat as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormat_GreaterThan(String dateTimeFormat) {
        regDateTimeFormat(CK_GT, fRES(dateTimeFormat));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT: {varchar(30)}
     * @param dateTimeFormat The value of dateTimeFormat as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormat_LessThan(String dateTimeFormat) {
        regDateTimeFormat(CK_LT, fRES(dateTimeFormat));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT: {varchar(30)}
     * @param dateTimeFormat The value of dateTimeFormat as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormat_GreaterEqual(String dateTimeFormat) {
        regDateTimeFormat(CK_GE, fRES(dateTimeFormat));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT: {varchar(30)}
     * @param dateTimeFormat The value of dateTimeFormat as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormat_LessEqual(String dateTimeFormat) {
        regDateTimeFormat(CK_LE, fRES(dateTimeFormat));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT: {varchar(30)}
     * @param dateTimeFormatList The collection of dateTimeFormat as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormat_InScope(Collection<String> dateTimeFormatList) {
        doSetDateTimeFormat_InScope(dateTimeFormatList);
    }

    protected void doSetDateTimeFormat_InScope(Collection<String> dateTimeFormatList) {
        regINS(CK_INS, cTL(dateTimeFormatList), xgetCValueDateTimeFormat(), "DATE_TIME_FORMAT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT: {varchar(30)}
     * @param dateTimeFormatList The collection of dateTimeFormat as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormat_NotInScope(Collection<String> dateTimeFormatList) {
        doSetDateTimeFormat_NotInScope(dateTimeFormatList);
    }

    protected void doSetDateTimeFormat_NotInScope(Collection<String> dateTimeFormatList) {
        regINS(CK_NINS, cTL(dateTimeFormatList), xgetCValueDateTimeFormat(), "DATE_TIME_FORMAT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT: {varchar(30)} <br>
     * <pre>e.g. setDateTimeFormat_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dateTimeFormat The value of dateTimeFormat as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDateTimeFormat_LikeSearch(String dateTimeFormat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dateTimeFormat), xgetCValueDateTimeFormat(), "DATE_TIME_FORMAT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT: {varchar(30)}
     * @param dateTimeFormat The value of dateTimeFormat as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDateTimeFormat_NotLikeSearch(String dateTimeFormat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dateTimeFormat), xgetCValueDateTimeFormat(), "DATE_TIME_FORMAT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TIME_FORMAT: {varchar(30)}
     * @param dateTimeFormat The value of dateTimeFormat as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateTimeFormat_PrefixSearch(String dateTimeFormat) {
        setDateTimeFormat_LikeSearch(dateTimeFormat, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT: {varchar(30)}
     */
    public void setDateTimeFormat_IsNull() { regDateTimeFormat(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT: {varchar(30)}
     */
    public void setDateTimeFormat_IsNullOrEmpty() { regDateTimeFormat(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATE_TIME_FORMAT: {varchar(30)}
     */
    public void setDateTimeFormat_IsNotNull() { regDateTimeFormat(CK_ISNN, DOBJ); }

    protected void regDateTimeFormat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDateTimeFormat(), "DATE_TIME_FORMAT"); }
    protected abstract ConditionValue xgetCValueDateTimeFormat();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT: {varchar(30)}
     * @param dateFormat The value of dateFormat as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormat_Equal(String dateFormat) {
        doSetDateFormat_Equal(fRES(dateFormat));
    }

    protected void doSetDateFormat_Equal(String dateFormat) {
        regDateFormat(CK_EQ, dateFormat);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT: {varchar(30)}
     * @param dateFormat The value of dateFormat as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormat_NotEqual(String dateFormat) {
        doSetDateFormat_NotEqual(fRES(dateFormat));
    }

    protected void doSetDateFormat_NotEqual(String dateFormat) {
        regDateFormat(CK_NES, dateFormat);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT: {varchar(30)}
     * @param dateFormat The value of dateFormat as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormat_GreaterThan(String dateFormat) {
        regDateFormat(CK_GT, fRES(dateFormat));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT: {varchar(30)}
     * @param dateFormat The value of dateFormat as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormat_LessThan(String dateFormat) {
        regDateFormat(CK_LT, fRES(dateFormat));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT: {varchar(30)}
     * @param dateFormat The value of dateFormat as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormat_GreaterEqual(String dateFormat) {
        regDateFormat(CK_GE, fRES(dateFormat));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_FORMAT: {varchar(30)}
     * @param dateFormat The value of dateFormat as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormat_LessEqual(String dateFormat) {
        regDateFormat(CK_LE, fRES(dateFormat));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_FORMAT: {varchar(30)}
     * @param dateFormatList The collection of dateFormat as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormat_InScope(Collection<String> dateFormatList) {
        doSetDateFormat_InScope(dateFormatList);
    }

    protected void doSetDateFormat_InScope(Collection<String> dateFormatList) {
        regINS(CK_INS, cTL(dateFormatList), xgetCValueDateFormat(), "DATE_FORMAT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_FORMAT: {varchar(30)}
     * @param dateFormatList The collection of dateFormat as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormat_NotInScope(Collection<String> dateFormatList) {
        doSetDateFormat_NotInScope(dateFormatList);
    }

    protected void doSetDateFormat_NotInScope(Collection<String> dateFormatList) {
        regINS(CK_NINS, cTL(dateFormatList), xgetCValueDateFormat(), "DATE_FORMAT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_FORMAT: {varchar(30)} <br>
     * <pre>e.g. setDateFormat_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dateFormat The value of dateFormat as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDateFormat_LikeSearch(String dateFormat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dateFormat), xgetCValueDateFormat(), "DATE_FORMAT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_FORMAT: {varchar(30)}
     * @param dateFormat The value of dateFormat as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDateFormat_NotLikeSearch(String dateFormat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dateFormat), xgetCValueDateFormat(), "DATE_FORMAT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_FORMAT: {varchar(30)}
     * @param dateFormat The value of dateFormat as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateFormat_PrefixSearch(String dateFormat) {
        setDateFormat_LikeSearch(dateFormat, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATE_FORMAT: {varchar(30)}
     */
    public void setDateFormat_IsNull() { regDateFormat(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATE_FORMAT: {varchar(30)}
     */
    public void setDateFormat_IsNullOrEmpty() { regDateFormat(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATE_FORMAT: {varchar(30)}
     */
    public void setDateFormat_IsNotNull() { regDateFormat(CK_ISNN, DOBJ); }

    protected void regDateFormat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDateFormat(), "DATE_FORMAT"); }
    protected abstract ConditionValue xgetCValueDateFormat();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT: {varchar(30)}
     * @param timeFormat The value of timeFormat as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormat_Equal(String timeFormat) {
        doSetTimeFormat_Equal(fRES(timeFormat));
    }

    protected void doSetTimeFormat_Equal(String timeFormat) {
        regTimeFormat(CK_EQ, timeFormat);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT: {varchar(30)}
     * @param timeFormat The value of timeFormat as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormat_NotEqual(String timeFormat) {
        doSetTimeFormat_NotEqual(fRES(timeFormat));
    }

    protected void doSetTimeFormat_NotEqual(String timeFormat) {
        regTimeFormat(CK_NES, timeFormat);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT: {varchar(30)}
     * @param timeFormat The value of timeFormat as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormat_GreaterThan(String timeFormat) {
        regTimeFormat(CK_GT, fRES(timeFormat));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT: {varchar(30)}
     * @param timeFormat The value of timeFormat as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormat_LessThan(String timeFormat) {
        regTimeFormat(CK_LT, fRES(timeFormat));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT: {varchar(30)}
     * @param timeFormat The value of timeFormat as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormat_GreaterEqual(String timeFormat) {
        regTimeFormat(CK_GE, fRES(timeFormat));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_FORMAT: {varchar(30)}
     * @param timeFormat The value of timeFormat as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormat_LessEqual(String timeFormat) {
        regTimeFormat(CK_LE, fRES(timeFormat));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TIME_FORMAT: {varchar(30)}
     * @param timeFormatList The collection of timeFormat as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormat_InScope(Collection<String> timeFormatList) {
        doSetTimeFormat_InScope(timeFormatList);
    }

    protected void doSetTimeFormat_InScope(Collection<String> timeFormatList) {
        regINS(CK_INS, cTL(timeFormatList), xgetCValueTimeFormat(), "TIME_FORMAT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TIME_FORMAT: {varchar(30)}
     * @param timeFormatList The collection of timeFormat as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormat_NotInScope(Collection<String> timeFormatList) {
        doSetTimeFormat_NotInScope(timeFormatList);
    }

    protected void doSetTimeFormat_NotInScope(Collection<String> timeFormatList) {
        regINS(CK_NINS, cTL(timeFormatList), xgetCValueTimeFormat(), "TIME_FORMAT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_FORMAT: {varchar(30)} <br>
     * <pre>e.g. setTimeFormat_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param timeFormat The value of timeFormat as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTimeFormat_LikeSearch(String timeFormat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(timeFormat), xgetCValueTimeFormat(), "TIME_FORMAT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_FORMAT: {varchar(30)}
     * @param timeFormat The value of timeFormat as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTimeFormat_NotLikeSearch(String timeFormat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(timeFormat), xgetCValueTimeFormat(), "TIME_FORMAT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_FORMAT: {varchar(30)}
     * @param timeFormat The value of timeFormat as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeFormat_PrefixSearch(String timeFormat) {
        setTimeFormat_LikeSearch(timeFormat, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TIME_FORMAT: {varchar(30)}
     */
    public void setTimeFormat_IsNull() { regTimeFormat(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TIME_FORMAT: {varchar(30)}
     */
    public void setTimeFormat_IsNullOrEmpty() { regTimeFormat(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TIME_FORMAT: {varchar(30)}
     */
    public void setTimeFormat_IsNotNull() { regTimeFormat(CK_ISNN, DOBJ); }

    protected void regTimeFormat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTimeFormat(), "TIME_FORMAT"); }
    protected abstract ConditionValue xgetCValueTimeFormat();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT: {varchar(30)}
     * @param numberFormat The value of numberFormat as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormat_Equal(String numberFormat) {
        doSetNumberFormat_Equal(fRES(numberFormat));
    }

    protected void doSetNumberFormat_Equal(String numberFormat) {
        regNumberFormat(CK_EQ, numberFormat);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT: {varchar(30)}
     * @param numberFormat The value of numberFormat as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormat_NotEqual(String numberFormat) {
        doSetNumberFormat_NotEqual(fRES(numberFormat));
    }

    protected void doSetNumberFormat_NotEqual(String numberFormat) {
        regNumberFormat(CK_NES, numberFormat);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT: {varchar(30)}
     * @param numberFormat The value of numberFormat as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormat_GreaterThan(String numberFormat) {
        regNumberFormat(CK_GT, fRES(numberFormat));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT: {varchar(30)}
     * @param numberFormat The value of numberFormat as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormat_LessThan(String numberFormat) {
        regNumberFormat(CK_LT, fRES(numberFormat));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT: {varchar(30)}
     * @param numberFormat The value of numberFormat as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormat_GreaterEqual(String numberFormat) {
        regNumberFormat(CK_GE, fRES(numberFormat));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_FORMAT: {varchar(30)}
     * @param numberFormat The value of numberFormat as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormat_LessEqual(String numberFormat) {
        regNumberFormat(CK_LE, fRES(numberFormat));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT: {varchar(30)}
     * @param numberFormatList The collection of numberFormat as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormat_InScope(Collection<String> numberFormatList) {
        doSetNumberFormat_InScope(numberFormatList);
    }

    protected void doSetNumberFormat_InScope(Collection<String> numberFormatList) {
        regINS(CK_INS, cTL(numberFormatList), xgetCValueNumberFormat(), "NUMBER_FORMAT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT: {varchar(30)}
     * @param numberFormatList The collection of numberFormat as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormat_NotInScope(Collection<String> numberFormatList) {
        doSetNumberFormat_NotInScope(numberFormatList);
    }

    protected void doSetNumberFormat_NotInScope(Collection<String> numberFormatList) {
        regINS(CK_NINS, cTL(numberFormatList), xgetCValueNumberFormat(), "NUMBER_FORMAT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT: {varchar(30)} <br>
     * <pre>e.g. setNumberFormat_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param numberFormat The value of numberFormat as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNumberFormat_LikeSearch(String numberFormat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(numberFormat), xgetCValueNumberFormat(), "NUMBER_FORMAT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT: {varchar(30)}
     * @param numberFormat The value of numberFormat as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNumberFormat_NotLikeSearch(String numberFormat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(numberFormat), xgetCValueNumberFormat(), "NUMBER_FORMAT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_FORMAT: {varchar(30)}
     * @param numberFormat The value of numberFormat as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberFormat_PrefixSearch(String numberFormat) {
        setNumberFormat_LikeSearch(numberFormat, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUMBER_FORMAT: {varchar(30)}
     */
    public void setNumberFormat_IsNull() { regNumberFormat(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NUMBER_FORMAT: {varchar(30)}
     */
    public void setNumberFormat_IsNullOrEmpty() { regNumberFormat(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUMBER_FORMAT: {varchar(30)}
     */
    public void setNumberFormat_IsNotNull() { regNumberFormat(CK_ISNN, DOBJ); }

    protected void regNumberFormat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNumberFormat(), "NUMBER_FORMAT"); }
    protected abstract ConditionValue xgetCValueNumberFormat();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT: {varchar(30)}
     * @param currencyFormat The value of currencyFormat as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormat_Equal(String currencyFormat) {
        doSetCurrencyFormat_Equal(fRES(currencyFormat));
    }

    protected void doSetCurrencyFormat_Equal(String currencyFormat) {
        regCurrencyFormat(CK_EQ, currencyFormat);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT: {varchar(30)}
     * @param currencyFormat The value of currencyFormat as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormat_NotEqual(String currencyFormat) {
        doSetCurrencyFormat_NotEqual(fRES(currencyFormat));
    }

    protected void doSetCurrencyFormat_NotEqual(String currencyFormat) {
        regCurrencyFormat(CK_NES, currencyFormat);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT: {varchar(30)}
     * @param currencyFormat The value of currencyFormat as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormat_GreaterThan(String currencyFormat) {
        regCurrencyFormat(CK_GT, fRES(currencyFormat));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT: {varchar(30)}
     * @param currencyFormat The value of currencyFormat as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormat_LessThan(String currencyFormat) {
        regCurrencyFormat(CK_LT, fRES(currencyFormat));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT: {varchar(30)}
     * @param currencyFormat The value of currencyFormat as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormat_GreaterEqual(String currencyFormat) {
        regCurrencyFormat(CK_GE, fRES(currencyFormat));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT: {varchar(30)}
     * @param currencyFormat The value of currencyFormat as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormat_LessEqual(String currencyFormat) {
        regCurrencyFormat(CK_LE, fRES(currencyFormat));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CURRENCY_FORMAT: {varchar(30)}
     * @param currencyFormatList The collection of currencyFormat as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormat_InScope(Collection<String> currencyFormatList) {
        doSetCurrencyFormat_InScope(currencyFormatList);
    }

    protected void doSetCurrencyFormat_InScope(Collection<String> currencyFormatList) {
        regINS(CK_INS, cTL(currencyFormatList), xgetCValueCurrencyFormat(), "CURRENCY_FORMAT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CURRENCY_FORMAT: {varchar(30)}
     * @param currencyFormatList The collection of currencyFormat as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormat_NotInScope(Collection<String> currencyFormatList) {
        doSetCurrencyFormat_NotInScope(currencyFormatList);
    }

    protected void doSetCurrencyFormat_NotInScope(Collection<String> currencyFormatList) {
        regINS(CK_NINS, cTL(currencyFormatList), xgetCValueCurrencyFormat(), "CURRENCY_FORMAT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENCY_FORMAT: {varchar(30)} <br>
     * <pre>e.g. setCurrencyFormat_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param currencyFormat The value of currencyFormat as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCurrencyFormat_LikeSearch(String currencyFormat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(currencyFormat), xgetCValueCurrencyFormat(), "CURRENCY_FORMAT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENCY_FORMAT: {varchar(30)}
     * @param currencyFormat The value of currencyFormat as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCurrencyFormat_NotLikeSearch(String currencyFormat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(currencyFormat), xgetCValueCurrencyFormat(), "CURRENCY_FORMAT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENCY_FORMAT: {varchar(30)}
     * @param currencyFormat The value of currencyFormat as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrencyFormat_PrefixSearch(String currencyFormat) {
        setCurrencyFormat_LikeSearch(currencyFormat, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT: {varchar(30)}
     */
    public void setCurrencyFormat_IsNull() { regCurrencyFormat(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT: {varchar(30)}
     */
    public void setCurrencyFormat_IsNullOrEmpty() { regCurrencyFormat(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CURRENCY_FORMAT: {varchar(30)}
     */
    public void setCurrencyFormat_IsNotNull() { regCurrencyFormat(CK_ISNN, DOBJ); }

    protected void regCurrencyFormat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCurrencyFormat(), "CURRENCY_FORMAT"); }
    protected abstract ConditionValue xgetCValueCurrencyFormat();

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
    public HpSLCFunction<PPrintRequestDataCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PPrintRequestDataCB.class);
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
    public HpSLCFunction<PPrintRequestDataCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PPrintRequestDataCB.class);
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
    public HpSLCFunction<PPrintRequestDataCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PPrintRequestDataCB.class);
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
    public HpSLCFunction<PPrintRequestDataCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PPrintRequestDataCB.class);
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
    public HpSLCFunction<PPrintRequestDataCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PPrintRequestDataCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PPrintRequestDataCB&gt;() {
     *     public void query(PPrintRequestDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PPrintRequestDataCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PPrintRequestDataCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintRequestDataCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PPrintRequestDataCQ sq);

    protected PPrintRequestDataCB xcreateScalarConditionCB() {
        PPrintRequestDataCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PPrintRequestDataCB xcreateScalarConditionPartitionByCB() {
        PPrintRequestDataCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PPrintRequestDataCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintRequestDataCB cb = new PPrintRequestDataCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRINT_REQUEST_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PPrintRequestDataCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PPrintRequestDataCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PPrintRequestDataCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintRequestDataCB cb = new PPrintRequestDataCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRINT_REQUEST_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PPrintRequestDataCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PPrintRequestDataCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrintRequestDataCB cb = new PPrintRequestDataCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PPrintRequestDataCQ sq);

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
    protected PPrintRequestDataCB newMyCB() {
        return new PPrintRequestDataCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PPrintRequestDataCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
