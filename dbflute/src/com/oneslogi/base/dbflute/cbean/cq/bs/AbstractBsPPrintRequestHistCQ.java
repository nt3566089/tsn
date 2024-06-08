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
 * The abstract condition-query of P_PRINT_REQUEST_HIST.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPPrintRequestHistCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPPrintRequestHistCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "P_PRINT_REQUEST_HIST";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestHistId The value of printRequestHistId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestHistId_Equal(Long printRequestHistId) {
        doSetPrintRequestHistId_Equal(printRequestHistId);
    }

    protected void doSetPrintRequestHistId_Equal(Long printRequestHistId) {
        regPrintRequestHistId(CK_EQ, printRequestHistId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestHistId The value of printRequestHistId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestHistId_NotEqual(Long printRequestHistId) {
        doSetPrintRequestHistId_NotEqual(printRequestHistId);
    }

    protected void doSetPrintRequestHistId_NotEqual(Long printRequestHistId) {
        regPrintRequestHistId(CK_NES, printRequestHistId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestHistId The value of printRequestHistId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestHistId_GreaterThan(Long printRequestHistId) {
        regPrintRequestHistId(CK_GT, printRequestHistId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestHistId The value of printRequestHistId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestHistId_LessThan(Long printRequestHistId) {
        regPrintRequestHistId(CK_LT, printRequestHistId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestHistId The value of printRequestHistId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestHistId_GreaterEqual(Long printRequestHistId) {
        regPrintRequestHistId(CK_GE, printRequestHistId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestHistId The value of printRequestHistId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestHistId_LessEqual(Long printRequestHistId) {
        regPrintRequestHistId(CK_LE, printRequestHistId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of printRequestHistId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printRequestHistId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintRequestHistId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintRequestHistId(), "PRINT_REQUEST_HIST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestHistIdList The collection of printRequestHistId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintRequestHistId_InScope(Collection<Long> printRequestHistIdList) {
        doSetPrintRequestHistId_InScope(printRequestHistIdList);
    }

    protected void doSetPrintRequestHistId_InScope(Collection<Long> printRequestHistIdList) {
        regINS(CK_INS, cTL(printRequestHistIdList), xgetCValuePrintRequestHistId(), "PRINT_REQUEST_HIST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestHistIdList The collection of printRequestHistId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintRequestHistId_NotInScope(Collection<Long> printRequestHistIdList) {
        doSetPrintRequestHistId_NotInScope(printRequestHistIdList);
    }

    protected void doSetPrintRequestHistId_NotInScope(Collection<Long> printRequestHistIdList) {
        regINS(CK_NINS, cTL(printRequestHistIdList), xgetCValuePrintRequestHistId(), "PRINT_REQUEST_HIST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPrintRequestHistId_IsNull() { regPrintRequestHistId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPrintRequestHistId_IsNotNull() { regPrintRequestHistId(CK_ISNN, DOBJ); }

    protected void regPrintRequestHistId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintRequestHistId(), "PRINT_REQUEST_HIST_ID"); }
    protected abstract ConditionValue xgetCValuePrintRequestHistId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
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
     * PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
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
     * PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
     * @param printRequestId The value of printRequestId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_GreaterThan(Long printRequestId) {
        regPrintRequestId(CK_GT, printRequestId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
     * @param printRequestId The value of printRequestId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_LessThan(Long printRequestId) {
        regPrintRequestId(CK_LT, printRequestId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
     * @param printRequestId The value of printRequestId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_GreaterEqual(Long printRequestId) {
        regPrintRequestId(CK_GE, printRequestId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
     * @param printRequestId The value of printRequestId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_LessEqual(Long printRequestId) {
        regPrintRequestId(CK_LE, printRequestId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
     * @param minNumber The min number of printRequestId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printRequestId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintRequestId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintRequestId(), "PRINT_REQUEST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
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
     * PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
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

    protected void regPrintRequestId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintRequestId(), "PRINT_REQUEST_ID"); }
    protected abstract ConditionValue xgetCValuePrintRequestId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_NO: {+UQ, NotNull, bigint(19)}
     * @param printRequestNo The value of printRequestNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestNo_Equal(Long printRequestNo) {
        doSetPrintRequestNo_Equal(printRequestNo);
    }

    protected void doSetPrintRequestNo_Equal(Long printRequestNo) {
        regPrintRequestNo(CK_EQ, printRequestNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_NO: {+UQ, NotNull, bigint(19)}
     * @param printRequestNo The value of printRequestNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestNo_NotEqual(Long printRequestNo) {
        doSetPrintRequestNo_NotEqual(printRequestNo);
    }

    protected void doSetPrintRequestNo_NotEqual(Long printRequestNo) {
        regPrintRequestNo(CK_NES, printRequestNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_NO: {+UQ, NotNull, bigint(19)}
     * @param printRequestNo The value of printRequestNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestNo_GreaterThan(Long printRequestNo) {
        regPrintRequestNo(CK_GT, printRequestNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_NO: {+UQ, NotNull, bigint(19)}
     * @param printRequestNo The value of printRequestNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestNo_LessThan(Long printRequestNo) {
        regPrintRequestNo(CK_LT, printRequestNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_NO: {+UQ, NotNull, bigint(19)}
     * @param printRequestNo The value of printRequestNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestNo_GreaterEqual(Long printRequestNo) {
        regPrintRequestNo(CK_GE, printRequestNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_NO: {+UQ, NotNull, bigint(19)}
     * @param printRequestNo The value of printRequestNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestNo_LessEqual(Long printRequestNo) {
        regPrintRequestNo(CK_LE, printRequestNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_NO: {+UQ, NotNull, bigint(19)}
     * @param minNumber The min number of printRequestNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printRequestNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintRequestNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintRequestNo(), "PRINT_REQUEST_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_REQUEST_NO: {+UQ, NotNull, bigint(19)}
     * @param printRequestNoList The collection of printRequestNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintRequestNo_InScope(Collection<Long> printRequestNoList) {
        doSetPrintRequestNo_InScope(printRequestNoList);
    }

    protected void doSetPrintRequestNo_InScope(Collection<Long> printRequestNoList) {
        regINS(CK_INS, cTL(printRequestNoList), xgetCValuePrintRequestNo(), "PRINT_REQUEST_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_REQUEST_NO: {+UQ, NotNull, bigint(19)}
     * @param printRequestNoList The collection of printRequestNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintRequestNo_NotInScope(Collection<Long> printRequestNoList) {
        doSetPrintRequestNo_NotInScope(printRequestNoList);
    }

    protected void doSetPrintRequestNo_NotInScope(Collection<Long> printRequestNoList) {
        regINS(CK_NINS, cTL(printRequestNoList), xgetCValuePrintRequestNo(), "PRINT_REQUEST_NO");
    }

    protected void regPrintRequestNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintRequestNo(), "PRINT_REQUEST_NO"); }
    protected abstract ConditionValue xgetCValuePrintRequestNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_NM: {varchar(60)}
     * @param printerNm The value of printerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNm_Equal(String printerNm) {
        doSetPrinterNm_Equal(fRES(printerNm));
    }

    protected void doSetPrinterNm_Equal(String printerNm) {
        regPrinterNm(CK_EQ, printerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_NM: {varchar(60)}
     * @param printerNm The value of printerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNm_NotEqual(String printerNm) {
        doSetPrinterNm_NotEqual(fRES(printerNm));
    }

    protected void doSetPrinterNm_NotEqual(String printerNm) {
        regPrinterNm(CK_NES, printerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_NM: {varchar(60)}
     * @param printerNm The value of printerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNm_GreaterThan(String printerNm) {
        regPrinterNm(CK_GT, fRES(printerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_NM: {varchar(60)}
     * @param printerNm The value of printerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNm_LessThan(String printerNm) {
        regPrinterNm(CK_LT, fRES(printerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_NM: {varchar(60)}
     * @param printerNm The value of printerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNm_GreaterEqual(String printerNm) {
        regPrinterNm(CK_GE, fRES(printerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_NM: {varchar(60)}
     * @param printerNm The value of printerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNm_LessEqual(String printerNm) {
        regPrinterNm(CK_LE, fRES(printerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTER_NM: {varchar(60)}
     * @param printerNmList The collection of printerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNm_InScope(Collection<String> printerNmList) {
        doSetPrinterNm_InScope(printerNmList);
    }

    protected void doSetPrinterNm_InScope(Collection<String> printerNmList) {
        regINS(CK_INS, cTL(printerNmList), xgetCValuePrinterNm(), "PRINTER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTER_NM: {varchar(60)}
     * @param printerNmList The collection of printerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNm_NotInScope(Collection<String> printerNmList) {
        doSetPrinterNm_NotInScope(printerNmList);
    }

    protected void doSetPrinterNm_NotInScope(Collection<String> printerNmList) {
        regINS(CK_NINS, cTL(printerNmList), xgetCValuePrinterNm(), "PRINTER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTER_NM: {varchar(60)} <br>
     * <pre>e.g. setPrinterNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param printerNm The value of printerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrinterNm_LikeSearch(String printerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(printerNm), xgetCValuePrinterNm(), "PRINTER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTER_NM: {varchar(60)}
     * @param printerNm The value of printerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrinterNm_NotLikeSearch(String printerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printerNm), xgetCValuePrinterNm(), "PRINTER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTER_NM: {varchar(60)}
     * @param printerNm The value of printerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNm_PrefixSearch(String printerNm) {
        setPrinterNm_LikeSearch(printerNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTER_NM: {varchar(60)}
     */
    public void setPrinterNm_IsNull() { regPrinterNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRINTER_NM: {varchar(60)}
     */
    public void setPrinterNm_IsNullOrEmpty() { regPrinterNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTER_NM: {varchar(60)}
     */
    public void setPrinterNm_IsNotNull() { regPrinterNm(CK_ISNN, DOBJ); }

    protected void regPrinterNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrinterNm(), "PRINTER_NM"); }
    protected abstract ConditionValue xgetCValuePrinterNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRAY_NM: {varchar(60)}
     * @param trayNm The value of trayNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrayNm_Equal(String trayNm) {
        doSetTrayNm_Equal(fRES(trayNm));
    }

    protected void doSetTrayNm_Equal(String trayNm) {
        regTrayNm(CK_EQ, trayNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRAY_NM: {varchar(60)}
     * @param trayNm The value of trayNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrayNm_NotEqual(String trayNm) {
        doSetTrayNm_NotEqual(fRES(trayNm));
    }

    protected void doSetTrayNm_NotEqual(String trayNm) {
        regTrayNm(CK_NES, trayNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRAY_NM: {varchar(60)}
     * @param trayNm The value of trayNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrayNm_GreaterThan(String trayNm) {
        regTrayNm(CK_GT, fRES(trayNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRAY_NM: {varchar(60)}
     * @param trayNm The value of trayNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrayNm_LessThan(String trayNm) {
        regTrayNm(CK_LT, fRES(trayNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRAY_NM: {varchar(60)}
     * @param trayNm The value of trayNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrayNm_GreaterEqual(String trayNm) {
        regTrayNm(CK_GE, fRES(trayNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRAY_NM: {varchar(60)}
     * @param trayNm The value of trayNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrayNm_LessEqual(String trayNm) {
        regTrayNm(CK_LE, fRES(trayNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRAY_NM: {varchar(60)}
     * @param trayNmList The collection of trayNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrayNm_InScope(Collection<String> trayNmList) {
        doSetTrayNm_InScope(trayNmList);
    }

    protected void doSetTrayNm_InScope(Collection<String> trayNmList) {
        regINS(CK_INS, cTL(trayNmList), xgetCValueTrayNm(), "TRAY_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRAY_NM: {varchar(60)}
     * @param trayNmList The collection of trayNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrayNm_NotInScope(Collection<String> trayNmList) {
        doSetTrayNm_NotInScope(trayNmList);
    }

    protected void doSetTrayNm_NotInScope(Collection<String> trayNmList) {
        regINS(CK_NINS, cTL(trayNmList), xgetCValueTrayNm(), "TRAY_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRAY_NM: {varchar(60)} <br>
     * <pre>e.g. setTrayNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param trayNm The value of trayNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTrayNm_LikeSearch(String trayNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(trayNm), xgetCValueTrayNm(), "TRAY_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRAY_NM: {varchar(60)}
     * @param trayNm The value of trayNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTrayNm_NotLikeSearch(String trayNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(trayNm), xgetCValueTrayNm(), "TRAY_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRAY_NM: {varchar(60)}
     * @param trayNm The value of trayNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrayNm_PrefixSearch(String trayNm) {
        setTrayNm_LikeSearch(trayNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRAY_NM: {varchar(60)}
     */
    public void setTrayNm_IsNull() { regTrayNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRAY_NM: {varchar(60)}
     */
    public void setTrayNm_IsNullOrEmpty() { regTrayNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRAY_NM: {varchar(60)}
     */
    public void setTrayNm_IsNotNull() { regTrayNm(CK_ISNN, DOBJ); }

    protected void regTrayNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrayNm(), "TRAY_NM"); }
    protected abstract ConditionValue xgetCValueTrayNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_NUM: {bigint(19)}
     * @param printNum The value of printNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintNum_Equal(Long printNum) {
        doSetPrintNum_Equal(printNum);
    }

    protected void doSetPrintNum_Equal(Long printNum) {
        regPrintNum(CK_EQ, printNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_NUM: {bigint(19)}
     * @param printNum The value of printNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintNum_NotEqual(Long printNum) {
        doSetPrintNum_NotEqual(printNum);
    }

    protected void doSetPrintNum_NotEqual(Long printNum) {
        regPrintNum(CK_NES, printNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_NUM: {bigint(19)}
     * @param printNum The value of printNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintNum_GreaterThan(Long printNum) {
        regPrintNum(CK_GT, printNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_NUM: {bigint(19)}
     * @param printNum The value of printNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintNum_LessThan(Long printNum) {
        regPrintNum(CK_LT, printNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_NUM: {bigint(19)}
     * @param printNum The value of printNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintNum_GreaterEqual(Long printNum) {
        regPrintNum(CK_GE, printNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_NUM: {bigint(19)}
     * @param printNum The value of printNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintNum_LessEqual(Long printNum) {
        regPrintNum(CK_LE, printNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_NUM: {bigint(19)}
     * @param minNumber The min number of printNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintNum(), "PRINT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_NUM: {bigint(19)}
     * @param printNumList The collection of printNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintNum_InScope(Collection<Long> printNumList) {
        doSetPrintNum_InScope(printNumList);
    }

    protected void doSetPrintNum_InScope(Collection<Long> printNumList) {
        regINS(CK_INS, cTL(printNumList), xgetCValuePrintNum(), "PRINT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_NUM: {bigint(19)}
     * @param printNumList The collection of printNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintNum_NotInScope(Collection<Long> printNumList) {
        doSetPrintNum_NotInScope(printNumList);
    }

    protected void doSetPrintNum_NotInScope(Collection<Long> printNumList) {
        regINS(CK_NINS, cTL(printNumList), xgetCValuePrintNum(), "PRINT_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINT_NUM: {bigint(19)}
     */
    public void setPrintNum_IsNull() { regPrintNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINT_NUM: {bigint(19)}
     */
    public void setPrintNum_IsNotNull() { regPrintNum(CK_ISNN, DOBJ); }

    protected void regPrintNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintNum(), "PRINT_NUM"); }
    protected abstract ConditionValue xgetCValuePrintNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCUMENT_PAGE_SIZE: {bigint(19)}
     * @param documentPageSize The value of documentPageSize as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocumentPageSize_Equal(Long documentPageSize) {
        doSetDocumentPageSize_Equal(documentPageSize);
    }

    protected void doSetDocumentPageSize_Equal(Long documentPageSize) {
        regDocumentPageSize(CK_EQ, documentPageSize);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCUMENT_PAGE_SIZE: {bigint(19)}
     * @param documentPageSize The value of documentPageSize as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocumentPageSize_NotEqual(Long documentPageSize) {
        doSetDocumentPageSize_NotEqual(documentPageSize);
    }

    protected void doSetDocumentPageSize_NotEqual(Long documentPageSize) {
        regDocumentPageSize(CK_NES, documentPageSize);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCUMENT_PAGE_SIZE: {bigint(19)}
     * @param documentPageSize The value of documentPageSize as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocumentPageSize_GreaterThan(Long documentPageSize) {
        regDocumentPageSize(CK_GT, documentPageSize);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCUMENT_PAGE_SIZE: {bigint(19)}
     * @param documentPageSize The value of documentPageSize as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocumentPageSize_LessThan(Long documentPageSize) {
        regDocumentPageSize(CK_LT, documentPageSize);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCUMENT_PAGE_SIZE: {bigint(19)}
     * @param documentPageSize The value of documentPageSize as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocumentPageSize_GreaterEqual(Long documentPageSize) {
        regDocumentPageSize(CK_GE, documentPageSize);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCUMENT_PAGE_SIZE: {bigint(19)}
     * @param documentPageSize The value of documentPageSize as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocumentPageSize_LessEqual(Long documentPageSize) {
        regDocumentPageSize(CK_LE, documentPageSize);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DOCUMENT_PAGE_SIZE: {bigint(19)}
     * @param minNumber The min number of documentPageSize. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of documentPageSize. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDocumentPageSize_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDocumentPageSize(), "DOCUMENT_PAGE_SIZE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DOCUMENT_PAGE_SIZE: {bigint(19)}
     * @param documentPageSizeList The collection of documentPageSize as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDocumentPageSize_InScope(Collection<Long> documentPageSizeList) {
        doSetDocumentPageSize_InScope(documentPageSizeList);
    }

    protected void doSetDocumentPageSize_InScope(Collection<Long> documentPageSizeList) {
        regINS(CK_INS, cTL(documentPageSizeList), xgetCValueDocumentPageSize(), "DOCUMENT_PAGE_SIZE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DOCUMENT_PAGE_SIZE: {bigint(19)}
     * @param documentPageSizeList The collection of documentPageSize as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDocumentPageSize_NotInScope(Collection<Long> documentPageSizeList) {
        doSetDocumentPageSize_NotInScope(documentPageSizeList);
    }

    protected void doSetDocumentPageSize_NotInScope(Collection<Long> documentPageSizeList) {
        regINS(CK_NINS, cTL(documentPageSizeList), xgetCValueDocumentPageSize(), "DOCUMENT_PAGE_SIZE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DOCUMENT_PAGE_SIZE: {bigint(19)}
     */
    public void setDocumentPageSize_IsNull() { regDocumentPageSize(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DOCUMENT_PAGE_SIZE: {bigint(19)}
     */
    public void setDocumentPageSize_IsNotNull() { regDocumentPageSize(CK_ISNN, DOBJ); }

    protected void regDocumentPageSize(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDocumentPageSize(), "DOCUMENT_PAGE_SIZE"); }
    protected abstract ConditionValue xgetCValueDocumentPageSize();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate}
     * @param sheetCollate The value of sheetCollate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSheetCollate_Equal(String sheetCollate) {
        doSetSheetCollate_Equal(fRES(sheetCollate));
    }

    /**
     * Equal(=). As SheetCollate. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate} <br>
     * 部単位印刷要否
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSheetCollate_Equal_AsSheetCollate(CDef.SheetCollate cdef) {
        doSetSheetCollate_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: ページ毎印刷
     */
    public void setSheetCollate_Equal_$0() {
        setSheetCollate_Equal_AsSheetCollate(CDef.SheetCollate.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 部単位で印刷
     */
    public void setSheetCollate_Equal_$1() {
        setSheetCollate_Equal_AsSheetCollate(CDef.SheetCollate.$1);
    }

    protected void doSetSheetCollate_Equal(String sheetCollate) {
        regSheetCollate(CK_EQ, sheetCollate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate}
     * @param sheetCollate The value of sheetCollate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSheetCollate_NotEqual(String sheetCollate) {
        doSetSheetCollate_NotEqual(fRES(sheetCollate));
    }

    /**
     * NotEqual(&lt;&gt;). As SheetCollate. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate} <br>
     * 部単位印刷要否
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSheetCollate_NotEqual_AsSheetCollate(CDef.SheetCollate cdef) {
        doSetSheetCollate_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: ページ毎印刷
     */
    public void setSheetCollate_NotEqual_$0() {
        setSheetCollate_NotEqual_AsSheetCollate(CDef.SheetCollate.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 部単位で印刷
     */
    public void setSheetCollate_NotEqual_$1() {
        setSheetCollate_NotEqual_AsSheetCollate(CDef.SheetCollate.$1);
    }

    protected void doSetSheetCollate_NotEqual(String sheetCollate) {
        regSheetCollate(CK_NES, sheetCollate);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate}
     * @param sheetCollateList The collection of sheetCollate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSheetCollate_InScope(Collection<String> sheetCollateList) {
        doSetSheetCollate_InScope(sheetCollateList);
    }

    /**
     * InScope {in ('a', 'b')}. As SheetCollate. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate} <br>
     * 部単位印刷要否
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSheetCollate_InScope_AsSheetCollate(Collection<CDef.SheetCollate> cdefList) {
        doSetSheetCollate_InScope(cTStrL(cdefList));
    }

    protected void doSetSheetCollate_InScope(Collection<String> sheetCollateList) {
        regINS(CK_INS, cTL(sheetCollateList), xgetCValueSheetCollate(), "SHEET_COLLATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate}
     * @param sheetCollateList The collection of sheetCollate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSheetCollate_NotInScope(Collection<String> sheetCollateList) {
        doSetSheetCollate_NotInScope(sheetCollateList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As SheetCollate. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate} <br>
     * 部単位印刷要否
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSheetCollate_NotInScope_AsSheetCollate(Collection<CDef.SheetCollate> cdefList) {
        doSetSheetCollate_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSheetCollate_NotInScope(Collection<String> sheetCollateList) {
        regINS(CK_NINS, cTL(sheetCollateList), xgetCValueSheetCollate(), "SHEET_COLLATE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate}
     */
    public void setSheetCollate_IsNull() { regSheetCollate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate}
     */
    public void setSheetCollate_IsNotNull() { regSheetCollate(CK_ISNN, DOBJ); }

    protected void regSheetCollate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSheetCollate(), "SHEET_COLLATE"); }
    protected abstract ConditionValue xgetCValueSheetCollate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_RESULT_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintResultClass}
     * @param printResultClass The value of printResultClass as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintResultClass_Equal(String printResultClass) {
        doSetPrintResultClass_Equal(fRES(printResultClass));
    }

    /**
     * Equal(=). As PrintResultClass. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_RESULT_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintResultClass} <br>
     * 印刷結果区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintResultClass_Equal_AsPrintResultClass(CDef.PrintResultClass cdef) {
        doSetPrintResultClass_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 印刷成功
     */
    public void setPrintResultClass_Equal_$0() {
        setPrintResultClass_Equal_AsPrintResultClass(CDef.PrintResultClass.$0);
    }

    /**
     * Equal(=). As $9 (9). And OnlyOnceRegistered. <br>
     * $9: 印刷失敗
     */
    public void setPrintResultClass_Equal_$9() {
        setPrintResultClass_Equal_AsPrintResultClass(CDef.PrintResultClass.$9);
    }

    protected void doSetPrintResultClass_Equal(String printResultClass) {
        regPrintResultClass(CK_EQ, printResultClass);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_RESULT_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintResultClass}
     * @param printResultClass The value of printResultClass as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintResultClass_NotEqual(String printResultClass) {
        doSetPrintResultClass_NotEqual(fRES(printResultClass));
    }

    /**
     * NotEqual(&lt;&gt;). As PrintResultClass. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_RESULT_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintResultClass} <br>
     * 印刷結果区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintResultClass_NotEqual_AsPrintResultClass(CDef.PrintResultClass cdef) {
        doSetPrintResultClass_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 印刷成功
     */
    public void setPrintResultClass_NotEqual_$0() {
        setPrintResultClass_NotEqual_AsPrintResultClass(CDef.PrintResultClass.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $9 (9). And OnlyOnceRegistered. <br>
     * $9: 印刷失敗
     */
    public void setPrintResultClass_NotEqual_$9() {
        setPrintResultClass_NotEqual_AsPrintResultClass(CDef.PrintResultClass.$9);
    }

    protected void doSetPrintResultClass_NotEqual(String printResultClass) {
        regPrintResultClass(CK_NES, printResultClass);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_RESULT_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintResultClass}
     * @param printResultClassList The collection of printResultClass as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintResultClass_InScope(Collection<String> printResultClassList) {
        doSetPrintResultClass_InScope(printResultClassList);
    }

    /**
     * InScope {in ('a', 'b')}. As PrintResultClass. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_RESULT_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintResultClass} <br>
     * 印刷結果区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintResultClass_InScope_AsPrintResultClass(Collection<CDef.PrintResultClass> cdefList) {
        doSetPrintResultClass_InScope(cTStrL(cdefList));
    }

    protected void doSetPrintResultClass_InScope(Collection<String> printResultClassList) {
        regINS(CK_INS, cTL(printResultClassList), xgetCValuePrintResultClass(), "PRINT_RESULT_CLASS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_RESULT_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintResultClass}
     * @param printResultClassList The collection of printResultClass as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintResultClass_NotInScope(Collection<String> printResultClassList) {
        doSetPrintResultClass_NotInScope(printResultClassList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PrintResultClass. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_RESULT_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintResultClass} <br>
     * 印刷結果区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintResultClass_NotInScope_AsPrintResultClass(Collection<CDef.PrintResultClass> cdefList) {
        doSetPrintResultClass_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPrintResultClass_NotInScope(Collection<String> printResultClassList) {
        regINS(CK_NINS, cTL(printResultClassList), xgetCValuePrintResultClass(), "PRINT_RESULT_CLASS");
    }

    protected void regPrintResultClass(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintResultClass(), "PRINT_RESULT_CLASS"); }
    protected abstract ConditionValue xgetCValuePrintResultClass();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_INFO: {varchar(2147483647)}
     * @param processInfo The value of processInfo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_Equal(String processInfo) {
        doSetProcessInfo_Equal(fRES(processInfo));
    }

    protected void doSetProcessInfo_Equal(String processInfo) {
        regProcessInfo(CK_EQ, processInfo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_INFO: {varchar(2147483647)}
     * @param processInfo The value of processInfo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_NotEqual(String processInfo) {
        doSetProcessInfo_NotEqual(fRES(processInfo));
    }

    protected void doSetProcessInfo_NotEqual(String processInfo) {
        regProcessInfo(CK_NES, processInfo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_INFO: {varchar(2147483647)}
     * @param processInfo The value of processInfo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_GreaterThan(String processInfo) {
        regProcessInfo(CK_GT, fRES(processInfo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_INFO: {varchar(2147483647)}
     * @param processInfo The value of processInfo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_LessThan(String processInfo) {
        regProcessInfo(CK_LT, fRES(processInfo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_INFO: {varchar(2147483647)}
     * @param processInfo The value of processInfo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_GreaterEqual(String processInfo) {
        regProcessInfo(CK_GE, fRES(processInfo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_INFO: {varchar(2147483647)}
     * @param processInfo The value of processInfo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_LessEqual(String processInfo) {
        regProcessInfo(CK_LE, fRES(processInfo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_INFO: {varchar(2147483647)}
     * @param processInfoList The collection of processInfo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_InScope(Collection<String> processInfoList) {
        doSetProcessInfo_InScope(processInfoList);
    }

    protected void doSetProcessInfo_InScope(Collection<String> processInfoList) {
        regINS(CK_INS, cTL(processInfoList), xgetCValueProcessInfo(), "PROCESS_INFO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_INFO: {varchar(2147483647)}
     * @param processInfoList The collection of processInfo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_NotInScope(Collection<String> processInfoList) {
        doSetProcessInfo_NotInScope(processInfoList);
    }

    protected void doSetProcessInfo_NotInScope(Collection<String> processInfoList) {
        regINS(CK_NINS, cTL(processInfoList), xgetCValueProcessInfo(), "PROCESS_INFO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_INFO: {varchar(2147483647)} <br>
     * <pre>e.g. setProcessInfo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param processInfo The value of processInfo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProcessInfo_LikeSearch(String processInfo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(processInfo), xgetCValueProcessInfo(), "PROCESS_INFO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_INFO: {varchar(2147483647)}
     * @param processInfo The value of processInfo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProcessInfo_NotLikeSearch(String processInfo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(processInfo), xgetCValueProcessInfo(), "PROCESS_INFO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_INFO: {varchar(2147483647)}
     * @param processInfo The value of processInfo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_PrefixSearch(String processInfo) {
        setProcessInfo_LikeSearch(processInfo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROCESS_INFO: {varchar(2147483647)}
     */
    public void setProcessInfo_IsNull() { regProcessInfo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROCESS_INFO: {varchar(2147483647)}
     */
    public void setProcessInfo_IsNullOrEmpty() { regProcessInfo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROCESS_INFO: {varchar(2147483647)}
     */
    public void setProcessInfo_IsNotNull() { regProcessInfo(CK_ISNN, DOBJ); }

    protected void regProcessInfo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessInfo(), "PROCESS_INFO"); }
    protected abstract ConditionValue xgetCValueProcessInfo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUEUE_ADD_DT: {NotNull, datetime2(26, 6)}
     * @param queueAddDt The value of queueAddDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQueueAddDt_Equal(java.sql.Timestamp queueAddDt) {
        regQueueAddDt(CK_EQ,  queueAddDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUEUE_ADD_DT: {NotNull, datetime2(26, 6)}
     * @param queueAddDt The value of queueAddDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQueueAddDt_GreaterThan(java.sql.Timestamp queueAddDt) {
        regQueueAddDt(CK_GT,  queueAddDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUEUE_ADD_DT: {NotNull, datetime2(26, 6)}
     * @param queueAddDt The value of queueAddDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQueueAddDt_LessThan(java.sql.Timestamp queueAddDt) {
        regQueueAddDt(CK_LT,  queueAddDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUEUE_ADD_DT: {NotNull, datetime2(26, 6)}
     * @param queueAddDt The value of queueAddDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQueueAddDt_GreaterEqual(java.sql.Timestamp queueAddDt) {
        regQueueAddDt(CK_GE,  queueAddDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUEUE_ADD_DT: {NotNull, datetime2(26, 6)}
     * @param queueAddDt The value of queueAddDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQueueAddDt_LessEqual(java.sql.Timestamp queueAddDt) {
        regQueueAddDt(CK_LE, queueAddDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QUEUE_ADD_DT: {NotNull, datetime2(26, 6)}
     * <pre>e.g. setQueueAddDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of queueAddDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of queueAddDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setQueueAddDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueQueueAddDt(), "QUEUE_ADD_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QUEUE_ADD_DT: {NotNull, datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of queueAddDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of queueAddDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setQueueAddDt_DateFromTo(Date fromDate, Date toDate) {
        setQueueAddDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    protected void regQueueAddDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQueueAddDt(), "QUEUE_ADD_DT"); }
    protected abstract ConditionValue xgetCValueQueueAddDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_DT: {NotNull, datetime2(26, 6)}
     * @param printDt The value of printDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintDt_Equal(java.sql.Timestamp printDt) {
        regPrintDt(CK_EQ,  printDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_DT: {NotNull, datetime2(26, 6)}
     * @param printDt The value of printDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintDt_GreaterThan(java.sql.Timestamp printDt) {
        regPrintDt(CK_GT,  printDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_DT: {NotNull, datetime2(26, 6)}
     * @param printDt The value of printDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintDt_LessThan(java.sql.Timestamp printDt) {
        regPrintDt(CK_LT,  printDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_DT: {NotNull, datetime2(26, 6)}
     * @param printDt The value of printDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintDt_GreaterEqual(java.sql.Timestamp printDt) {
        regPrintDt(CK_GE,  printDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_DT: {NotNull, datetime2(26, 6)}
     * @param printDt The value of printDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintDt_LessEqual(java.sql.Timestamp printDt) {
        regPrintDt(CK_LE, printDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_DT: {NotNull, datetime2(26, 6)}
     * <pre>e.g. setPrintDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of printDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of printDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPrintDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValuePrintDt(), "PRINT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_DT: {NotNull, datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of printDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of printDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPrintDt_DateFromTo(Date fromDate, Date toDate) {
        setPrintDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    protected void regPrintDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintDt(), "PRINT_DT"); }
    protected abstract ConditionValue xgetCValuePrintDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1)}
     * @param printDataType The value of printDataType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintDataType_Equal(String printDataType) {
        doSetPrintDataType_Equal(fRES(printDataType));
    }

    protected void doSetPrintDataType_Equal(String printDataType) {
        regPrintDataType(CK_EQ, printDataType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1)}
     * @param printDataType The value of printDataType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintDataType_NotEqual(String printDataType) {
        doSetPrintDataType_NotEqual(fRES(printDataType));
    }

    protected void doSetPrintDataType_NotEqual(String printDataType) {
        regPrintDataType(CK_NES, printDataType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1)}
     * @param printDataType The value of printDataType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintDataType_GreaterThan(String printDataType) {
        regPrintDataType(CK_GT, fRES(printDataType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1)}
     * @param printDataType The value of printDataType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintDataType_LessThan(String printDataType) {
        regPrintDataType(CK_LT, fRES(printDataType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1)}
     * @param printDataType The value of printDataType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintDataType_GreaterEqual(String printDataType) {
        regPrintDataType(CK_GE, fRES(printDataType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1)}
     * @param printDataType The value of printDataType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintDataType_LessEqual(String printDataType) {
        regPrintDataType(CK_LE, fRES(printDataType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1)}
     * @param printDataTypeList The collection of printDataType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintDataType_InScope(Collection<String> printDataTypeList) {
        doSetPrintDataType_InScope(printDataTypeList);
    }

    protected void doSetPrintDataType_InScope(Collection<String> printDataTypeList) {
        regINS(CK_INS, cTL(printDataTypeList), xgetCValuePrintDataType(), "PRINT_DATA_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1)}
     * @param printDataTypeList The collection of printDataType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintDataType_NotInScope(Collection<String> printDataTypeList) {
        doSetPrintDataType_NotInScope(printDataTypeList);
    }

    protected void doSetPrintDataType_NotInScope(Collection<String> printDataTypeList) {
        regINS(CK_NINS, cTL(printDataTypeList), xgetCValuePrintDataType(), "PRINT_DATA_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1)} <br>
     * <pre>e.g. setPrintDataType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param printDataType The value of printDataType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrintDataType_LikeSearch(String printDataType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(printDataType), xgetCValuePrintDataType(), "PRINT_DATA_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1)}
     * @param printDataType The value of printDataType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrintDataType_NotLikeSearch(String printDataType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printDataType), xgetCValuePrintDataType(), "PRINT_DATA_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1)}
     * @param printDataType The value of printDataType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintDataType_PrefixSearch(String printDataType) {
        setPrintDataType_LikeSearch(printDataType, xcLSOPPre());
    }

    protected void regPrintDataType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintDataType(), "PRINT_DATA_TYPE"); }
    protected abstract ConditionValue xgetCValuePrintDataType();

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
    public HpSLCFunction<PPrintRequestHistCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PPrintRequestHistCB.class);
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
    public HpSLCFunction<PPrintRequestHistCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PPrintRequestHistCB.class);
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
    public HpSLCFunction<PPrintRequestHistCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PPrintRequestHistCB.class);
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
    public HpSLCFunction<PPrintRequestHistCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PPrintRequestHistCB.class);
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
    public HpSLCFunction<PPrintRequestHistCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PPrintRequestHistCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PPrintRequestHistCB&gt;() {
     *     public void query(PPrintRequestHistCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PPrintRequestHistCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PPrintRequestHistCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintRequestHistCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PPrintRequestHistCQ sq);

    protected PPrintRequestHistCB xcreateScalarConditionCB() {
        PPrintRequestHistCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PPrintRequestHistCB xcreateScalarConditionPartitionByCB() {
        PPrintRequestHistCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PPrintRequestHistCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintRequestHistCB cb = new PPrintRequestHistCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRINT_REQUEST_HIST_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PPrintRequestHistCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PPrintRequestHistCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PPrintRequestHistCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintRequestHistCB cb = new PPrintRequestHistCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRINT_REQUEST_HIST_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PPrintRequestHistCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PPrintRequestHistCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrintRequestHistCB cb = new PPrintRequestHistCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PPrintRequestHistCQ sq);

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
    protected PPrintRequestHistCB newMyCB() {
        return new PPrintRequestHistCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PPrintRequestHistCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
