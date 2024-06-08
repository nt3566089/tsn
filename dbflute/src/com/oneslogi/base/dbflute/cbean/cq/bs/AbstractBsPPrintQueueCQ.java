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
 * The abstract condition-query of P_PRINT_QUEUE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPPrintQueueCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPPrintQueueCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "P_PRINT_QUEUE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printQueueId The value of printQueueId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintQueueId_Equal(Long printQueueId) {
        doSetPrintQueueId_Equal(printQueueId);
    }

    protected void doSetPrintQueueId_Equal(Long printQueueId) {
        regPrintQueueId(CK_EQ, printQueueId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printQueueId The value of printQueueId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintQueueId_NotEqual(Long printQueueId) {
        doSetPrintQueueId_NotEqual(printQueueId);
    }

    protected void doSetPrintQueueId_NotEqual(Long printQueueId) {
        regPrintQueueId(CK_NES, printQueueId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printQueueId The value of printQueueId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintQueueId_GreaterThan(Long printQueueId) {
        regPrintQueueId(CK_GT, printQueueId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printQueueId The value of printQueueId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintQueueId_LessThan(Long printQueueId) {
        regPrintQueueId(CK_LT, printQueueId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printQueueId The value of printQueueId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintQueueId_GreaterEqual(Long printQueueId) {
        regPrintQueueId(CK_GE, printQueueId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printQueueId The value of printQueueId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintQueueId_LessEqual(Long printQueueId) {
        regPrintQueueId(CK_LE, printQueueId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of printQueueId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printQueueId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintQueueId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintQueueId(), "PRINT_QUEUE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printQueueIdList The collection of printQueueId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintQueueId_InScope(Collection<Long> printQueueIdList) {
        doSetPrintQueueId_InScope(printQueueIdList);
    }

    protected void doSetPrintQueueId_InScope(Collection<Long> printQueueIdList) {
        regINS(CK_INS, cTL(printQueueIdList), xgetCValuePrintQueueId(), "PRINT_QUEUE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printQueueIdList The collection of printQueueId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintQueueId_NotInScope(Collection<Long> printQueueIdList) {
        doSetPrintQueueId_NotInScope(printQueueIdList);
    }

    protected void doSetPrintQueueId_NotInScope(Collection<Long> printQueueIdList) {
        regINS(CK_NINS, cTL(printQueueIdList), xgetCValuePrintQueueId(), "PRINT_QUEUE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPrintQueueId_IsNull() { regPrintQueueId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPrintQueueId_IsNotNull() { regPrintQueueId(CK_ISNN, DOBJ); }

    protected void regPrintQueueId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintQueueId(), "PRINT_QUEUE_ID"); }
    protected abstract ConditionValue xgetCValuePrintQueueId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
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
     * PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
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
     * PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
     * @param printRequestId The value of printRequestId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_GreaterThan(Long printRequestId) {
        regPrintRequestId(CK_GT, printRequestId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
     * @param printRequestId The value of printRequestId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_LessThan(Long printRequestId) {
        regPrintRequestId(CK_LT, printRequestId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
     * @param printRequestId The value of printRequestId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_GreaterEqual(Long printRequestId) {
        regPrintRequestId(CK_GE, printRequestId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
     * @param printRequestId The value of printRequestId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_LessEqual(Long printRequestId) {
        regPrintRequestId(CK_LE, printRequestId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
     * @param minNumber The min number of printRequestId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printRequestId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintRequestId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintRequestId(), "PRINT_REQUEST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
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
     * PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
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
     * PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)}
     * @param printerGroupId The value of printerGroupId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_Equal(Long printerGroupId) {
        doSetPrinterGroupId_Equal(printerGroupId);
    }

    protected void doSetPrinterGroupId_Equal(Long printerGroupId) {
        regPrinterGroupId(CK_EQ, printerGroupId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)}
     * @param printerGroupId The value of printerGroupId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_NotEqual(Long printerGroupId) {
        doSetPrinterGroupId_NotEqual(printerGroupId);
    }

    protected void doSetPrinterGroupId_NotEqual(Long printerGroupId) {
        regPrinterGroupId(CK_NES, printerGroupId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)}
     * @param printerGroupId The value of printerGroupId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_GreaterThan(Long printerGroupId) {
        regPrinterGroupId(CK_GT, printerGroupId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)}
     * @param printerGroupId The value of printerGroupId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_LessThan(Long printerGroupId) {
        regPrinterGroupId(CK_LT, printerGroupId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)}
     * @param printerGroupId The value of printerGroupId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_GreaterEqual(Long printerGroupId) {
        regPrinterGroupId(CK_GE, printerGroupId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)}
     * @param printerGroupId The value of printerGroupId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_LessEqual(Long printerGroupId) {
        regPrinterGroupId(CK_LE, printerGroupId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)}
     * @param minNumber The min number of printerGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printerGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrinterGroupId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)}
     * @param printerGroupIdList The collection of printerGroupId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupId_InScope(Collection<Long> printerGroupIdList) {
        doSetPrinterGroupId_InScope(printerGroupIdList);
    }

    protected void doSetPrinterGroupId_InScope(Collection<Long> printerGroupIdList) {
        regINS(CK_INS, cTL(printerGroupIdList), xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)}
     * @param printerGroupIdList The collection of printerGroupId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupId_NotInScope(Collection<Long> printerGroupIdList) {
        doSetPrinterGroupId_NotInScope(printerGroupIdList);
    }

    protected void doSetPrinterGroupId_NotInScope(Collection<Long> printerGroupIdList) {
        regINS(CK_NINS, cTL(printerGroupIdList), xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID");
    }

    protected void regPrinterGroupId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID"); }
    protected abstract ConditionValue xgetCValuePrinterGroupId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus}
     * @param printQueueStatus The value of printQueueStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintQueueStatus_Equal(String printQueueStatus) {
        doSetPrintQueueStatus_Equal(fRES(printQueueStatus));
    }

    /**
     * Equal(=). As PrintQueueStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus} <br>
     * 印刷キューステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintQueueStatus_Equal_AsPrintQueueStatus(CDef.PrintQueueStatus cdef) {
        doSetPrintQueueStatus_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未印刷
     */
    public void setPrintQueueStatus_Equal_$0() {
        setPrintQueueStatus_Equal_AsPrintQueueStatus(CDef.PrintQueueStatus.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 印刷中
     */
    public void setPrintQueueStatus_Equal_$1() {
        setPrintQueueStatus_Equal_AsPrintQueueStatus(CDef.PrintQueueStatus.$1);
    }

    protected void doSetPrintQueueStatus_Equal(String printQueueStatus) {
        regPrintQueueStatus(CK_EQ, printQueueStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus}
     * @param printQueueStatus The value of printQueueStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintQueueStatus_NotEqual(String printQueueStatus) {
        doSetPrintQueueStatus_NotEqual(fRES(printQueueStatus));
    }

    /**
     * NotEqual(&lt;&gt;). As PrintQueueStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus} <br>
     * 印刷キューステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintQueueStatus_NotEqual_AsPrintQueueStatus(CDef.PrintQueueStatus cdef) {
        doSetPrintQueueStatus_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未印刷
     */
    public void setPrintQueueStatus_NotEqual_$0() {
        setPrintQueueStatus_NotEqual_AsPrintQueueStatus(CDef.PrintQueueStatus.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 印刷中
     */
    public void setPrintQueueStatus_NotEqual_$1() {
        setPrintQueueStatus_NotEqual_AsPrintQueueStatus(CDef.PrintQueueStatus.$1);
    }

    protected void doSetPrintQueueStatus_NotEqual(String printQueueStatus) {
        regPrintQueueStatus(CK_NES, printQueueStatus);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus}
     * @param printQueueStatusList The collection of printQueueStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintQueueStatus_InScope(Collection<String> printQueueStatusList) {
        doSetPrintQueueStatus_InScope(printQueueStatusList);
    }

    /**
     * InScope {in ('a', 'b')}. As PrintQueueStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus} <br>
     * 印刷キューステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintQueueStatus_InScope_AsPrintQueueStatus(Collection<CDef.PrintQueueStatus> cdefList) {
        doSetPrintQueueStatus_InScope(cTStrL(cdefList));
    }

    protected void doSetPrintQueueStatus_InScope(Collection<String> printQueueStatusList) {
        regINS(CK_INS, cTL(printQueueStatusList), xgetCValuePrintQueueStatus(), "PRINT_QUEUE_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus}
     * @param printQueueStatusList The collection of printQueueStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintQueueStatus_NotInScope(Collection<String> printQueueStatusList) {
        doSetPrintQueueStatus_NotInScope(printQueueStatusList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PrintQueueStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus} <br>
     * 印刷キューステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintQueueStatus_NotInScope_AsPrintQueueStatus(Collection<CDef.PrintQueueStatus> cdefList) {
        doSetPrintQueueStatus_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPrintQueueStatus_NotInScope(Collection<String> printQueueStatusList) {
        regINS(CK_NINS, cTL(printQueueStatusList), xgetCValuePrintQueueStatus(), "PRINT_QUEUE_STATUS");
    }

    protected void regPrintQueueStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintQueueStatus(), "PRINT_QUEUE_STATUS"); }
    protected abstract ConditionValue xgetCValuePrintQueueStatus();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHEET_COLLATE: {char(1)}
     * @param sheetCollate The value of sheetCollate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSheetCollate_Equal(String sheetCollate) {
        doSetSheetCollate_Equal(fRES(sheetCollate));
    }

    protected void doSetSheetCollate_Equal(String sheetCollate) {
        regSheetCollate(CK_EQ, sheetCollate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHEET_COLLATE: {char(1)}
     * @param sheetCollate The value of sheetCollate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSheetCollate_NotEqual(String sheetCollate) {
        doSetSheetCollate_NotEqual(fRES(sheetCollate));
    }

    protected void doSetSheetCollate_NotEqual(String sheetCollate) {
        regSheetCollate(CK_NES, sheetCollate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHEET_COLLATE: {char(1)}
     * @param sheetCollate The value of sheetCollate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSheetCollate_GreaterThan(String sheetCollate) {
        regSheetCollate(CK_GT, fRES(sheetCollate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHEET_COLLATE: {char(1)}
     * @param sheetCollate The value of sheetCollate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSheetCollate_LessThan(String sheetCollate) {
        regSheetCollate(CK_LT, fRES(sheetCollate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHEET_COLLATE: {char(1)}
     * @param sheetCollate The value of sheetCollate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSheetCollate_GreaterEqual(String sheetCollate) {
        regSheetCollate(CK_GE, fRES(sheetCollate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHEET_COLLATE: {char(1)}
     * @param sheetCollate The value of sheetCollate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSheetCollate_LessEqual(String sheetCollate) {
        regSheetCollate(CK_LE, fRES(sheetCollate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHEET_COLLATE: {char(1)}
     * @param sheetCollateList The collection of sheetCollate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSheetCollate_InScope(Collection<String> sheetCollateList) {
        doSetSheetCollate_InScope(sheetCollateList);
    }

    protected void doSetSheetCollate_InScope(Collection<String> sheetCollateList) {
        regINS(CK_INS, cTL(sheetCollateList), xgetCValueSheetCollate(), "SHEET_COLLATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHEET_COLLATE: {char(1)}
     * @param sheetCollateList The collection of sheetCollate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSheetCollate_NotInScope(Collection<String> sheetCollateList) {
        doSetSheetCollate_NotInScope(sheetCollateList);
    }

    protected void doSetSheetCollate_NotInScope(Collection<String> sheetCollateList) {
        regINS(CK_NINS, cTL(sheetCollateList), xgetCValueSheetCollate(), "SHEET_COLLATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHEET_COLLATE: {char(1)} <br>
     * <pre>e.g. setSheetCollate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sheetCollate The value of sheetCollate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSheetCollate_LikeSearch(String sheetCollate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sheetCollate), xgetCValueSheetCollate(), "SHEET_COLLATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHEET_COLLATE: {char(1)}
     * @param sheetCollate The value of sheetCollate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSheetCollate_NotLikeSearch(String sheetCollate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sheetCollate), xgetCValueSheetCollate(), "SHEET_COLLATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHEET_COLLATE: {char(1)}
     * @param sheetCollate The value of sheetCollate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSheetCollate_PrefixSearch(String sheetCollate) {
        setSheetCollate_LikeSearch(sheetCollate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHEET_COLLATE: {char(1)}
     */
    public void setSheetCollate_IsNull() { regSheetCollate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHEET_COLLATE: {char(1)}
     */
    public void setSheetCollate_IsNotNull() { regSheetCollate(CK_ISNN, DOBJ); }

    protected void regSheetCollate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSheetCollate(), "SHEET_COLLATE"); }
    protected abstract ConditionValue xgetCValueSheetCollate();

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
    public HpSLCFunction<PPrintQueueCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PPrintQueueCB.class);
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
    public HpSLCFunction<PPrintQueueCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PPrintQueueCB.class);
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
    public HpSLCFunction<PPrintQueueCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PPrintQueueCB.class);
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
    public HpSLCFunction<PPrintQueueCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PPrintQueueCB.class);
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
    public HpSLCFunction<PPrintQueueCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PPrintQueueCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PPrintQueueCB&gt;() {
     *     public void query(PPrintQueueCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PPrintQueueCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PPrintQueueCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintQueueCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PPrintQueueCQ sq);

    protected PPrintQueueCB xcreateScalarConditionCB() {
        PPrintQueueCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PPrintQueueCB xcreateScalarConditionPartitionByCB() {
        PPrintQueueCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PPrintQueueCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintQueueCB cb = new PPrintQueueCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRINT_QUEUE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PPrintQueueCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PPrintQueueCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PPrintQueueCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintQueueCB cb = new PPrintQueueCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRINT_QUEUE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PPrintQueueCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PPrintQueueCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrintQueueCB cb = new PPrintQueueCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PPrintQueueCQ sq);

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
    protected PPrintQueueCB newMyCB() {
        return new PPrintQueueCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PPrintQueueCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
