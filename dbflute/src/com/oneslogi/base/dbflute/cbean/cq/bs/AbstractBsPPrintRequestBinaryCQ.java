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
 * The abstract condition-query of P_PRINT_REQUEST_BINARY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPPrintRequestBinaryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPPrintRequestBinaryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "P_PRINT_REQUEST_BINARY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestBinaryId The value of printRequestBinaryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestBinaryId_Equal(Long printRequestBinaryId) {
        doSetPrintRequestBinaryId_Equal(printRequestBinaryId);
    }

    protected void doSetPrintRequestBinaryId_Equal(Long printRequestBinaryId) {
        regPrintRequestBinaryId(CK_EQ, printRequestBinaryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestBinaryId The value of printRequestBinaryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestBinaryId_NotEqual(Long printRequestBinaryId) {
        doSetPrintRequestBinaryId_NotEqual(printRequestBinaryId);
    }

    protected void doSetPrintRequestBinaryId_NotEqual(Long printRequestBinaryId) {
        regPrintRequestBinaryId(CK_NES, printRequestBinaryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestBinaryId The value of printRequestBinaryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestBinaryId_GreaterThan(Long printRequestBinaryId) {
        regPrintRequestBinaryId(CK_GT, printRequestBinaryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestBinaryId The value of printRequestBinaryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestBinaryId_LessThan(Long printRequestBinaryId) {
        regPrintRequestBinaryId(CK_LT, printRequestBinaryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestBinaryId The value of printRequestBinaryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestBinaryId_GreaterEqual(Long printRequestBinaryId) {
        regPrintRequestBinaryId(CK_GE, printRequestBinaryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestBinaryId The value of printRequestBinaryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestBinaryId_LessEqual(Long printRequestBinaryId) {
        regPrintRequestBinaryId(CK_LE, printRequestBinaryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of printRequestBinaryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printRequestBinaryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintRequestBinaryId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintRequestBinaryId(), "PRINT_REQUEST_BINARY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestBinaryIdList The collection of printRequestBinaryId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintRequestBinaryId_InScope(Collection<Long> printRequestBinaryIdList) {
        doSetPrintRequestBinaryId_InScope(printRequestBinaryIdList);
    }

    protected void doSetPrintRequestBinaryId_InScope(Collection<Long> printRequestBinaryIdList) {
        regINS(CK_INS, cTL(printRequestBinaryIdList), xgetCValuePrintRequestBinaryId(), "PRINT_REQUEST_BINARY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestBinaryIdList The collection of printRequestBinaryId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintRequestBinaryId_NotInScope(Collection<Long> printRequestBinaryIdList) {
        doSetPrintRequestBinaryId_NotInScope(printRequestBinaryIdList);
    }

    protected void doSetPrintRequestBinaryId_NotInScope(Collection<Long> printRequestBinaryIdList) {
        regINS(CK_NINS, cTL(printRequestBinaryIdList), xgetCValuePrintRequestBinaryId(), "PRINT_REQUEST_BINARY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPrintRequestBinaryId_IsNull() { regPrintRequestBinaryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPrintRequestBinaryId_IsNotNull() { regPrintRequestBinaryId(CK_ISNN, DOBJ); }

    protected void regPrintRequestBinaryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintRequestBinaryId(), "PRINT_REQUEST_BINARY_ID"); }
    protected abstract ConditionValue xgetCValuePrintRequestBinaryId();

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
     * SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)}
     * @param srcFileIndex The value of srcFileIndex as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrcFileIndex_Equal(Long srcFileIndex) {
        doSetSrcFileIndex_Equal(srcFileIndex);
    }

    protected void doSetSrcFileIndex_Equal(Long srcFileIndex) {
        regSrcFileIndex(CK_EQ, srcFileIndex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)}
     * @param srcFileIndex The value of srcFileIndex as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrcFileIndex_NotEqual(Long srcFileIndex) {
        doSetSrcFileIndex_NotEqual(srcFileIndex);
    }

    protected void doSetSrcFileIndex_NotEqual(Long srcFileIndex) {
        regSrcFileIndex(CK_NES, srcFileIndex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)}
     * @param srcFileIndex The value of srcFileIndex as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrcFileIndex_GreaterThan(Long srcFileIndex) {
        regSrcFileIndex(CK_GT, srcFileIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)}
     * @param srcFileIndex The value of srcFileIndex as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrcFileIndex_LessThan(Long srcFileIndex) {
        regSrcFileIndex(CK_LT, srcFileIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)}
     * @param srcFileIndex The value of srcFileIndex as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrcFileIndex_GreaterEqual(Long srcFileIndex) {
        regSrcFileIndex(CK_GE, srcFileIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)}
     * @param srcFileIndex The value of srcFileIndex as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrcFileIndex_LessEqual(Long srcFileIndex) {
        regSrcFileIndex(CK_LE, srcFileIndex);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)}
     * @param minNumber The min number of srcFileIndex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of srcFileIndex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSrcFileIndex_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSrcFileIndex(), "SRC_FILE_INDEX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)}
     * @param srcFileIndexList The collection of srcFileIndex as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrcFileIndex_InScope(Collection<Long> srcFileIndexList) {
        doSetSrcFileIndex_InScope(srcFileIndexList);
    }

    protected void doSetSrcFileIndex_InScope(Collection<Long> srcFileIndexList) {
        regINS(CK_INS, cTL(srcFileIndexList), xgetCValueSrcFileIndex(), "SRC_FILE_INDEX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)}
     * @param srcFileIndexList The collection of srcFileIndex as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrcFileIndex_NotInScope(Collection<Long> srcFileIndexList) {
        doSetSrcFileIndex_NotInScope(srcFileIndexList);
    }

    protected void doSetSrcFileIndex_NotInScope(Collection<Long> srcFileIndexList) {
        regINS(CK_NINS, cTL(srcFileIndexList), xgetCValueSrcFileIndex(), "SRC_FILE_INDEX");
    }

    protected void regSrcFileIndex(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrcFileIndex(), "SRC_FILE_INDEX"); }
    protected abstract ConditionValue xgetCValueSrcFileIndex();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPORT_BINARY: {varbinary(2147483647)}
     */
    public void setReportBinary_IsNull() { regReportBinary(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPORT_BINARY: {varbinary(2147483647)}
     */
    public void setReportBinary_IsNotNull() { regReportBinary(CK_ISNN, DOBJ); }

    protected void regReportBinary(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportBinary(), "REPORT_BINARY"); }
    protected abstract ConditionValue xgetCValueReportBinary();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)}
     * @param printCustomRangeFlg The value of printCustomRangeFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintCustomRangeFlg_Equal(String printCustomRangeFlg) {
        doSetPrintCustomRangeFlg_Equal(fRES(printCustomRangeFlg));
    }

    protected void doSetPrintCustomRangeFlg_Equal(String printCustomRangeFlg) {
        regPrintCustomRangeFlg(CK_EQ, printCustomRangeFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)}
     * @param printCustomRangeFlg The value of printCustomRangeFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintCustomRangeFlg_NotEqual(String printCustomRangeFlg) {
        doSetPrintCustomRangeFlg_NotEqual(fRES(printCustomRangeFlg));
    }

    protected void doSetPrintCustomRangeFlg_NotEqual(String printCustomRangeFlg) {
        regPrintCustomRangeFlg(CK_NES, printCustomRangeFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)}
     * @param printCustomRangeFlg The value of printCustomRangeFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintCustomRangeFlg_GreaterThan(String printCustomRangeFlg) {
        regPrintCustomRangeFlg(CK_GT, fRES(printCustomRangeFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)}
     * @param printCustomRangeFlg The value of printCustomRangeFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintCustomRangeFlg_LessThan(String printCustomRangeFlg) {
        regPrintCustomRangeFlg(CK_LT, fRES(printCustomRangeFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)}
     * @param printCustomRangeFlg The value of printCustomRangeFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintCustomRangeFlg_GreaterEqual(String printCustomRangeFlg) {
        regPrintCustomRangeFlg(CK_GE, fRES(printCustomRangeFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)}
     * @param printCustomRangeFlg The value of printCustomRangeFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintCustomRangeFlg_LessEqual(String printCustomRangeFlg) {
        regPrintCustomRangeFlg(CK_LE, fRES(printCustomRangeFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)}
     * @param printCustomRangeFlgList The collection of printCustomRangeFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintCustomRangeFlg_InScope(Collection<String> printCustomRangeFlgList) {
        doSetPrintCustomRangeFlg_InScope(printCustomRangeFlgList);
    }

    protected void doSetPrintCustomRangeFlg_InScope(Collection<String> printCustomRangeFlgList) {
        regINS(CK_INS, cTL(printCustomRangeFlgList), xgetCValuePrintCustomRangeFlg(), "PRINT_CUSTOM_RANGE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)}
     * @param printCustomRangeFlgList The collection of printCustomRangeFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintCustomRangeFlg_NotInScope(Collection<String> printCustomRangeFlgList) {
        doSetPrintCustomRangeFlg_NotInScope(printCustomRangeFlgList);
    }

    protected void doSetPrintCustomRangeFlg_NotInScope(Collection<String> printCustomRangeFlgList) {
        regINS(CK_NINS, cTL(printCustomRangeFlgList), xgetCValuePrintCustomRangeFlg(), "PRINT_CUSTOM_RANGE_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)} <br>
     * <pre>e.g. setPrintCustomRangeFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param printCustomRangeFlg The value of printCustomRangeFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrintCustomRangeFlg_LikeSearch(String printCustomRangeFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(printCustomRangeFlg), xgetCValuePrintCustomRangeFlg(), "PRINT_CUSTOM_RANGE_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)}
     * @param printCustomRangeFlg The value of printCustomRangeFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrintCustomRangeFlg_NotLikeSearch(String printCustomRangeFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printCustomRangeFlg), xgetCValuePrintCustomRangeFlg(), "PRINT_CUSTOM_RANGE_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)}
     * @param printCustomRangeFlg The value of printCustomRangeFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintCustomRangeFlg_PrefixSearch(String printCustomRangeFlg) {
        setPrintCustomRangeFlg_LikeSearch(printCustomRangeFlg, xcLSOPPre());
    }

    protected void regPrintCustomRangeFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintCustomRangeFlg(), "PRINT_CUSTOM_RANGE_FLG"); }
    protected abstract ConditionValue xgetCValuePrintCustomRangeFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_FIRST_PAGE: {bigint(19)}
     * @param printFirstPage The value of printFirstPage as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintFirstPage_Equal(Long printFirstPage) {
        doSetPrintFirstPage_Equal(printFirstPage);
    }

    protected void doSetPrintFirstPage_Equal(Long printFirstPage) {
        regPrintFirstPage(CK_EQ, printFirstPage);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_FIRST_PAGE: {bigint(19)}
     * @param printFirstPage The value of printFirstPage as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintFirstPage_NotEqual(Long printFirstPage) {
        doSetPrintFirstPage_NotEqual(printFirstPage);
    }

    protected void doSetPrintFirstPage_NotEqual(Long printFirstPage) {
        regPrintFirstPage(CK_NES, printFirstPage);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_FIRST_PAGE: {bigint(19)}
     * @param printFirstPage The value of printFirstPage as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintFirstPage_GreaterThan(Long printFirstPage) {
        regPrintFirstPage(CK_GT, printFirstPage);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_FIRST_PAGE: {bigint(19)}
     * @param printFirstPage The value of printFirstPage as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintFirstPage_LessThan(Long printFirstPage) {
        regPrintFirstPage(CK_LT, printFirstPage);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_FIRST_PAGE: {bigint(19)}
     * @param printFirstPage The value of printFirstPage as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintFirstPage_GreaterEqual(Long printFirstPage) {
        regPrintFirstPage(CK_GE, printFirstPage);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_FIRST_PAGE: {bigint(19)}
     * @param printFirstPage The value of printFirstPage as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintFirstPage_LessEqual(Long printFirstPage) {
        regPrintFirstPage(CK_LE, printFirstPage);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_FIRST_PAGE: {bigint(19)}
     * @param minNumber The min number of printFirstPage. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printFirstPage. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintFirstPage_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintFirstPage(), "PRINT_FIRST_PAGE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_FIRST_PAGE: {bigint(19)}
     * @param printFirstPageList The collection of printFirstPage as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintFirstPage_InScope(Collection<Long> printFirstPageList) {
        doSetPrintFirstPage_InScope(printFirstPageList);
    }

    protected void doSetPrintFirstPage_InScope(Collection<Long> printFirstPageList) {
        regINS(CK_INS, cTL(printFirstPageList), xgetCValuePrintFirstPage(), "PRINT_FIRST_PAGE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_FIRST_PAGE: {bigint(19)}
     * @param printFirstPageList The collection of printFirstPage as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintFirstPage_NotInScope(Collection<Long> printFirstPageList) {
        doSetPrintFirstPage_NotInScope(printFirstPageList);
    }

    protected void doSetPrintFirstPage_NotInScope(Collection<Long> printFirstPageList) {
        regINS(CK_NINS, cTL(printFirstPageList), xgetCValuePrintFirstPage(), "PRINT_FIRST_PAGE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINT_FIRST_PAGE: {bigint(19)}
     */
    public void setPrintFirstPage_IsNull() { regPrintFirstPage(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINT_FIRST_PAGE: {bigint(19)}
     */
    public void setPrintFirstPage_IsNotNull() { regPrintFirstPage(CK_ISNN, DOBJ); }

    protected void regPrintFirstPage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintFirstPage(), "PRINT_FIRST_PAGE"); }
    protected abstract ConditionValue xgetCValuePrintFirstPage();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_LAST_PAGE: {bigint(19)}
     * @param printLastPage The value of printLastPage as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintLastPage_Equal(Long printLastPage) {
        doSetPrintLastPage_Equal(printLastPage);
    }

    protected void doSetPrintLastPage_Equal(Long printLastPage) {
        regPrintLastPage(CK_EQ, printLastPage);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_LAST_PAGE: {bigint(19)}
     * @param printLastPage The value of printLastPage as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintLastPage_NotEqual(Long printLastPage) {
        doSetPrintLastPage_NotEqual(printLastPage);
    }

    protected void doSetPrintLastPage_NotEqual(Long printLastPage) {
        regPrintLastPage(CK_NES, printLastPage);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_LAST_PAGE: {bigint(19)}
     * @param printLastPage The value of printLastPage as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintLastPage_GreaterThan(Long printLastPage) {
        regPrintLastPage(CK_GT, printLastPage);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_LAST_PAGE: {bigint(19)}
     * @param printLastPage The value of printLastPage as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintLastPage_LessThan(Long printLastPage) {
        regPrintLastPage(CK_LT, printLastPage);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_LAST_PAGE: {bigint(19)}
     * @param printLastPage The value of printLastPage as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintLastPage_GreaterEqual(Long printLastPage) {
        regPrintLastPage(CK_GE, printLastPage);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_LAST_PAGE: {bigint(19)}
     * @param printLastPage The value of printLastPage as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintLastPage_LessEqual(Long printLastPage) {
        regPrintLastPage(CK_LE, printLastPage);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_LAST_PAGE: {bigint(19)}
     * @param minNumber The min number of printLastPage. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printLastPage. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintLastPage_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintLastPage(), "PRINT_LAST_PAGE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_LAST_PAGE: {bigint(19)}
     * @param printLastPageList The collection of printLastPage as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintLastPage_InScope(Collection<Long> printLastPageList) {
        doSetPrintLastPage_InScope(printLastPageList);
    }

    protected void doSetPrintLastPage_InScope(Collection<Long> printLastPageList) {
        regINS(CK_INS, cTL(printLastPageList), xgetCValuePrintLastPage(), "PRINT_LAST_PAGE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_LAST_PAGE: {bigint(19)}
     * @param printLastPageList The collection of printLastPage as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintLastPage_NotInScope(Collection<Long> printLastPageList) {
        doSetPrintLastPage_NotInScope(printLastPageList);
    }

    protected void doSetPrintLastPage_NotInScope(Collection<Long> printLastPageList) {
        regINS(CK_NINS, cTL(printLastPageList), xgetCValuePrintLastPage(), "PRINT_LAST_PAGE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINT_LAST_PAGE: {bigint(19)}
     */
    public void setPrintLastPage_IsNull() { regPrintLastPage(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINT_LAST_PAGE: {bigint(19)}
     */
    public void setPrintLastPage_IsNotNull() { regPrintLastPage(CK_ISNN, DOBJ); }

    protected void regPrintLastPage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintLastPage(), "PRINT_LAST_PAGE"); }
    protected abstract ConditionValue xgetCValuePrintLastPage();

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
    public HpSLCFunction<PPrintRequestBinaryCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PPrintRequestBinaryCB.class);
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
    public HpSLCFunction<PPrintRequestBinaryCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PPrintRequestBinaryCB.class);
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
    public HpSLCFunction<PPrintRequestBinaryCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PPrintRequestBinaryCB.class);
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
    public HpSLCFunction<PPrintRequestBinaryCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PPrintRequestBinaryCB.class);
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
    public HpSLCFunction<PPrintRequestBinaryCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PPrintRequestBinaryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PPrintRequestBinaryCB&gt;() {
     *     public void query(PPrintRequestBinaryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PPrintRequestBinaryCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PPrintRequestBinaryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintRequestBinaryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PPrintRequestBinaryCQ sq);

    protected PPrintRequestBinaryCB xcreateScalarConditionCB() {
        PPrintRequestBinaryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PPrintRequestBinaryCB xcreateScalarConditionPartitionByCB() {
        PPrintRequestBinaryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PPrintRequestBinaryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintRequestBinaryCB cb = new PPrintRequestBinaryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRINT_REQUEST_BINARY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PPrintRequestBinaryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PPrintRequestBinaryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PPrintRequestBinaryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintRequestBinaryCB cb = new PPrintRequestBinaryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRINT_REQUEST_BINARY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PPrintRequestBinaryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PPrintRequestBinaryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrintRequestBinaryCB cb = new PPrintRequestBinaryCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PPrintRequestBinaryCQ sq);

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
    protected PPrintRequestBinaryCB newMyCB() {
        return new PPrintRequestBinaryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PPrintRequestBinaryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
