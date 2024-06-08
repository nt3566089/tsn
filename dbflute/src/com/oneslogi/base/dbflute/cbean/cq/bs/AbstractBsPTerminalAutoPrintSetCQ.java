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
 * The abstract condition-query of P_TERMINAL_AUTO_PRINT_SET.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPTerminalAutoPrintSetCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPTerminalAutoPrintSetCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "P_TERMINAL_AUTO_PRINT_SET";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_AUTO_PRINT_SET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalAutoPrintSetId The value of terminalAutoPrintSetId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalAutoPrintSetId_Equal(Long terminalAutoPrintSetId) {
        doSetTerminalAutoPrintSetId_Equal(terminalAutoPrintSetId);
    }

    protected void doSetTerminalAutoPrintSetId_Equal(Long terminalAutoPrintSetId) {
        regTerminalAutoPrintSetId(CK_EQ, terminalAutoPrintSetId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_AUTO_PRINT_SET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalAutoPrintSetId The value of terminalAutoPrintSetId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalAutoPrintSetId_NotEqual(Long terminalAutoPrintSetId) {
        doSetTerminalAutoPrintSetId_NotEqual(terminalAutoPrintSetId);
    }

    protected void doSetTerminalAutoPrintSetId_NotEqual(Long terminalAutoPrintSetId) {
        regTerminalAutoPrintSetId(CK_NES, terminalAutoPrintSetId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_AUTO_PRINT_SET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalAutoPrintSetId The value of terminalAutoPrintSetId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalAutoPrintSetId_GreaterThan(Long terminalAutoPrintSetId) {
        regTerminalAutoPrintSetId(CK_GT, terminalAutoPrintSetId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_AUTO_PRINT_SET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalAutoPrintSetId The value of terminalAutoPrintSetId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalAutoPrintSetId_LessThan(Long terminalAutoPrintSetId) {
        regTerminalAutoPrintSetId(CK_LT, terminalAutoPrintSetId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_AUTO_PRINT_SET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalAutoPrintSetId The value of terminalAutoPrintSetId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalAutoPrintSetId_GreaterEqual(Long terminalAutoPrintSetId) {
        regTerminalAutoPrintSetId(CK_GE, terminalAutoPrintSetId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_AUTO_PRINT_SET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalAutoPrintSetId The value of terminalAutoPrintSetId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalAutoPrintSetId_LessEqual(Long terminalAutoPrintSetId) {
        regTerminalAutoPrintSetId(CK_LE, terminalAutoPrintSetId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_AUTO_PRINT_SET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of terminalAutoPrintSetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of terminalAutoPrintSetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTerminalAutoPrintSetId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTerminalAutoPrintSetId(), "TERMINAL_AUTO_PRINT_SET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TERMINAL_AUTO_PRINT_SET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalAutoPrintSetIdList The collection of terminalAutoPrintSetId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalAutoPrintSetId_InScope(Collection<Long> terminalAutoPrintSetIdList) {
        doSetTerminalAutoPrintSetId_InScope(terminalAutoPrintSetIdList);
    }

    protected void doSetTerminalAutoPrintSetId_InScope(Collection<Long> terminalAutoPrintSetIdList) {
        regINS(CK_INS, cTL(terminalAutoPrintSetIdList), xgetCValueTerminalAutoPrintSetId(), "TERMINAL_AUTO_PRINT_SET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TERMINAL_AUTO_PRINT_SET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalAutoPrintSetIdList The collection of terminalAutoPrintSetId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalAutoPrintSetId_NotInScope(Collection<Long> terminalAutoPrintSetIdList) {
        doSetTerminalAutoPrintSetId_NotInScope(terminalAutoPrintSetIdList);
    }

    protected void doSetTerminalAutoPrintSetId_NotInScope(Collection<Long> terminalAutoPrintSetIdList) {
        regINS(CK_NINS, cTL(terminalAutoPrintSetIdList), xgetCValueTerminalAutoPrintSetId(), "TERMINAL_AUTO_PRINT_SET_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TERMINAL_AUTO_PRINT_SET_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTerminalAutoPrintSetId_IsNull() { regTerminalAutoPrintSetId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TERMINAL_AUTO_PRINT_SET_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTerminalAutoPrintSetId_IsNotNull() { regTerminalAutoPrintSetId(CK_ISNN, DOBJ); }

    protected void regTerminalAutoPrintSetId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTerminalAutoPrintSetId(), "TERMINAL_AUTO_PRINT_SET_ID"); }
    protected abstract ConditionValue xgetCValueTerminalAutoPrintSetId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)}
     * @param terminalAssignCd The value of terminalAssignCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalAssignCd_Equal(String terminalAssignCd) {
        doSetTerminalAssignCd_Equal(fRES(terminalAssignCd));
    }

    protected void doSetTerminalAssignCd_Equal(String terminalAssignCd) {
        regTerminalAssignCd(CK_EQ, terminalAssignCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)}
     * @param terminalAssignCd The value of terminalAssignCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalAssignCd_NotEqual(String terminalAssignCd) {
        doSetTerminalAssignCd_NotEqual(fRES(terminalAssignCd));
    }

    protected void doSetTerminalAssignCd_NotEqual(String terminalAssignCd) {
        regTerminalAssignCd(CK_NES, terminalAssignCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)}
     * @param terminalAssignCd The value of terminalAssignCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalAssignCd_GreaterThan(String terminalAssignCd) {
        regTerminalAssignCd(CK_GT, fRES(terminalAssignCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)}
     * @param terminalAssignCd The value of terminalAssignCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalAssignCd_LessThan(String terminalAssignCd) {
        regTerminalAssignCd(CK_LT, fRES(terminalAssignCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)}
     * @param terminalAssignCd The value of terminalAssignCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalAssignCd_GreaterEqual(String terminalAssignCd) {
        regTerminalAssignCd(CK_GE, fRES(terminalAssignCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)}
     * @param terminalAssignCd The value of terminalAssignCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalAssignCd_LessEqual(String terminalAssignCd) {
        regTerminalAssignCd(CK_LE, fRES(terminalAssignCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)}
     * @param terminalAssignCdList The collection of terminalAssignCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalAssignCd_InScope(Collection<String> terminalAssignCdList) {
        doSetTerminalAssignCd_InScope(terminalAssignCdList);
    }

    protected void doSetTerminalAssignCd_InScope(Collection<String> terminalAssignCdList) {
        regINS(CK_INS, cTL(terminalAssignCdList), xgetCValueTerminalAssignCd(), "TERMINAL_ASSIGN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)}
     * @param terminalAssignCdList The collection of terminalAssignCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalAssignCd_NotInScope(Collection<String> terminalAssignCdList) {
        doSetTerminalAssignCd_NotInScope(terminalAssignCdList);
    }

    protected void doSetTerminalAssignCd_NotInScope(Collection<String> terminalAssignCdList) {
        regINS(CK_NINS, cTL(terminalAssignCdList), xgetCValueTerminalAssignCd(), "TERMINAL_ASSIGN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)} <br>
     * <pre>e.g. setTerminalAssignCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param terminalAssignCd The value of terminalAssignCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTerminalAssignCd_LikeSearch(String terminalAssignCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(terminalAssignCd), xgetCValueTerminalAssignCd(), "TERMINAL_ASSIGN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)}
     * @param terminalAssignCd The value of terminalAssignCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTerminalAssignCd_NotLikeSearch(String terminalAssignCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(terminalAssignCd), xgetCValueTerminalAssignCd(), "TERMINAL_ASSIGN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)}
     * @param terminalAssignCd The value of terminalAssignCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalAssignCd_PrefixSearch(String terminalAssignCd) {
        setTerminalAssignCd_LikeSearch(terminalAssignCd, xcLSOPPre());
    }

    protected void regTerminalAssignCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTerminalAssignCd(), "TERMINAL_ASSIGN_CD"); }
    protected abstract ConditionValue xgetCValueTerminalAssignCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
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
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
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
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param reportLayoutId The value of reportLayoutId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_GreaterThan(Long reportLayoutId) {
        regReportLayoutId(CK_GT, reportLayoutId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param reportLayoutId The value of reportLayoutId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_LessThan(Long reportLayoutId) {
        regReportLayoutId(CK_LT, reportLayoutId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param reportLayoutId The value of reportLayoutId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_GreaterEqual(Long reportLayoutId) {
        regReportLayoutId(CK_GE, reportLayoutId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param reportLayoutId The value of reportLayoutId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_LessEqual(Long reportLayoutId) {
        regReportLayoutId(CK_LE, reportLayoutId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @param minNumber The min number of reportLayoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reportLayoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReportLayoutId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReportLayoutId(), "REPORT_LAYOUT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
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
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
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
     * P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayoutByReportLayoutId'.
     * @param subCBLambda The callback for sub-query of PReportLayoutByReportLayoutId for 'in-scope'. (NotNull)
     */
    public void inScopePReportLayoutByReportLayoutId(SubQuery<PReportLayoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PReportLayoutCB cb = new PReportLayoutCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReportLayoutId_InScopeRelation_PReportLayoutByReportLayoutId(cb.query());
        registerInScopeRelation(cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", pp, "pReportLayoutByReportLayoutId", false);
    }
    public abstract String keepReportLayoutId_InScopeRelation_PReportLayoutByReportLayoutId(PReportLayoutCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select REPORT_LAYOUT_ID from P_REPORT_LAYOUT where ...)} <br />
     * P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayoutByReportLayoutId'.
     * @param subCBLambda The callback for sub-query of PReportLayoutByReportLayoutId for 'not in-scope'. (NotNull)
     */
    public void notInScopePReportLayoutByReportLayoutId(SubQuery<PReportLayoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PReportLayoutCB cb = new PReportLayoutCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReportLayoutId_NotInScopeRelation_PReportLayoutByReportLayoutId(cb.query());
        registerInScopeRelation(cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", pp, "pReportLayoutByReportLayoutId", true);
    }
    public abstract String keepReportLayoutId_NotInScopeRelation_PReportLayoutByReportLayoutId(PReportLayoutCQ sq);

    protected void regReportLayoutId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportLayoutId(), "REPORT_LAYOUT_ID"); }
    protected abstract ConditionValue xgetCValueReportLayoutId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
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
     * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
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
     * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
     * @param printerGroupId The value of printerGroupId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_GreaterThan(Long printerGroupId) {
        regPrinterGroupId(CK_GT, printerGroupId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
     * @param printerGroupId The value of printerGroupId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_LessThan(Long printerGroupId) {
        regPrinterGroupId(CK_LT, printerGroupId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
     * @param printerGroupId The value of printerGroupId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_GreaterEqual(Long printerGroupId) {
        regPrinterGroupId(CK_GE, printerGroupId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
     * @param printerGroupId The value of printerGroupId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_LessEqual(Long printerGroupId) {
        regPrinterGroupId(CK_LE, printerGroupId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
     * @param minNumber The min number of printerGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printerGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrinterGroupId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
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
     * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
     * @param printerGroupIdList The collection of printerGroupId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupId_NotInScope(Collection<Long> printerGroupIdList) {
        doSetPrinterGroupId_NotInScope(printerGroupIdList);
    }

    protected void doSetPrinterGroupId_NotInScope(Collection<Long> printerGroupIdList) {
        regINS(CK_NINS, cTL(printerGroupIdList), xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRINTER_GROUP_ID from P_PRINTER_GROUP where ...)} <br />
     * P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroupByPrinterGroupId'.
     * @param subCBLambda The callback for sub-query of PPrinterGroupByPrinterGroupId for 'in-scope'. (NotNull)
     */
    public void inScopePPrinterGroupByPrinterGroupId(SubQuery<PPrinterGroupCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrinterGroupCB cb = new PPrinterGroupCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPrinterGroupId_InScopeRelation_PPrinterGroupByPrinterGroupId(cb.query());
        registerInScopeRelation(cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", pp, "pPrinterGroupByPrinterGroupId", false);
    }
    public abstract String keepPrinterGroupId_InScopeRelation_PPrinterGroupByPrinterGroupId(PPrinterGroupCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRINTER_GROUP_ID from P_PRINTER_GROUP where ...)} <br />
     * P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroupByPrinterGroupId'.
     * @param subCBLambda The callback for sub-query of PPrinterGroupByPrinterGroupId for 'not in-scope'. (NotNull)
     */
    public void notInScopePPrinterGroupByPrinterGroupId(SubQuery<PPrinterGroupCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrinterGroupCB cb = new PPrinterGroupCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPrinterGroupId_NotInScopeRelation_PPrinterGroupByPrinterGroupId(cb.query());
        registerInScopeRelation(cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", pp, "pPrinterGroupByPrinterGroupId", true);
    }
    public abstract String keepPrinterGroupId_NotInScopeRelation_PPrinterGroupByPrinterGroupId(PPrinterGroupCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
     */
    public void setPrinterGroupId_IsNull() { regPrinterGroupId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
     */
    public void setPrinterGroupId_IsNotNull() { regPrinterGroupId(CK_ISNN, DOBJ); }

    protected void regPrinterGroupId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID"); }
    protected abstract ConditionValue xgetCValuePrinterGroupId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
     * @param printerId The value of printerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterId_Equal(Long printerId) {
        doSetPrinterId_Equal(printerId);
    }

    protected void doSetPrinterId_Equal(Long printerId) {
        regPrinterId(CK_EQ, printerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
     * @param printerId The value of printerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterId_NotEqual(Long printerId) {
        doSetPrinterId_NotEqual(printerId);
    }

    protected void doSetPrinterId_NotEqual(Long printerId) {
        regPrinterId(CK_NES, printerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
     * @param printerId The value of printerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterId_GreaterThan(Long printerId) {
        regPrinterId(CK_GT, printerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
     * @param printerId The value of printerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterId_LessThan(Long printerId) {
        regPrinterId(CK_LT, printerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
     * @param printerId The value of printerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterId_GreaterEqual(Long printerId) {
        regPrinterId(CK_GE, printerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
     * @param printerId The value of printerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterId_LessEqual(Long printerId) {
        regPrinterId(CK_LE, printerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
     * @param minNumber The min number of printerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrinterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrinterId(), "PRINTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
     * @param printerIdList The collection of printerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterId_InScope(Collection<Long> printerIdList) {
        doSetPrinterId_InScope(printerIdList);
    }

    protected void doSetPrinterId_InScope(Collection<Long> printerIdList) {
        regINS(CK_INS, cTL(printerIdList), xgetCValuePrinterId(), "PRINTER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
     * @param printerIdList The collection of printerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterId_NotInScope(Collection<Long> printerIdList) {
        doSetPrinterId_NotInScope(printerIdList);
    }

    protected void doSetPrinterId_NotInScope(Collection<Long> printerIdList) {
        regINS(CK_NINS, cTL(printerIdList), xgetCValuePrinterId(), "PRINTER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRINTER_ID from P_PRINTER where ...)} <br />
     * P_PRINTER by my PRINTER_ID, named 'PPrinterByPrinterId'.
     * @param subCBLambda The callback for sub-query of PPrinterByPrinterId for 'in-scope'. (NotNull)
     */
    public void inScopePPrinterByPrinterId(SubQuery<PPrinterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrinterCB cb = new PPrinterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPrinterId_InScopeRelation_PPrinterByPrinterId(cb.query());
        registerInScopeRelation(cb.query(), "PRINTER_ID", "PRINTER_ID", pp, "pPrinterByPrinterId", false);
    }
    public abstract String keepPrinterId_InScopeRelation_PPrinterByPrinterId(PPrinterCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRINTER_ID from P_PRINTER where ...)} <br />
     * P_PRINTER by my PRINTER_ID, named 'PPrinterByPrinterId'.
     * @param subCBLambda The callback for sub-query of PPrinterByPrinterId for 'not in-scope'. (NotNull)
     */
    public void notInScopePPrinterByPrinterId(SubQuery<PPrinterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrinterCB cb = new PPrinterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPrinterId_NotInScopeRelation_PPrinterByPrinterId(cb.query());
        registerInScopeRelation(cb.query(), "PRINTER_ID", "PRINTER_ID", pp, "pPrinterByPrinterId", true);
    }
    public abstract String keepPrinterId_NotInScopeRelation_PPrinterByPrinterId(PPrinterCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
     */
    public void setPrinterId_IsNull() { regPrinterId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
     */
    public void setPrinterId_IsNotNull() { regPrinterId(CK_ISNN, DOBJ); }

    protected void regPrinterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrinterId(), "PRINTER_ID"); }
    protected abstract ConditionValue xgetCValuePrinterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
     * @param printerAttributeId The value of printerAttributeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_Equal(Long printerAttributeId) {
        doSetPrinterAttributeId_Equal(printerAttributeId);
    }

    protected void doSetPrinterAttributeId_Equal(Long printerAttributeId) {
        regPrinterAttributeId(CK_EQ, printerAttributeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
     * @param printerAttributeId The value of printerAttributeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_NotEqual(Long printerAttributeId) {
        doSetPrinterAttributeId_NotEqual(printerAttributeId);
    }

    protected void doSetPrinterAttributeId_NotEqual(Long printerAttributeId) {
        regPrinterAttributeId(CK_NES, printerAttributeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
     * @param printerAttributeId The value of printerAttributeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_GreaterThan(Long printerAttributeId) {
        regPrinterAttributeId(CK_GT, printerAttributeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
     * @param printerAttributeId The value of printerAttributeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_LessThan(Long printerAttributeId) {
        regPrinterAttributeId(CK_LT, printerAttributeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
     * @param printerAttributeId The value of printerAttributeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_GreaterEqual(Long printerAttributeId) {
        regPrinterAttributeId(CK_GE, printerAttributeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
     * @param printerAttributeId The value of printerAttributeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_LessEqual(Long printerAttributeId) {
        regPrinterAttributeId(CK_LE, printerAttributeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
     * @param minNumber The min number of printerAttributeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printerAttributeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrinterAttributeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrinterAttributeId(), "PRINTER_ATTRIBUTE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
     * @param printerAttributeIdList The collection of printerAttributeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_InScope(Collection<Long> printerAttributeIdList) {
        doSetPrinterAttributeId_InScope(printerAttributeIdList);
    }

    protected void doSetPrinterAttributeId_InScope(Collection<Long> printerAttributeIdList) {
        regINS(CK_INS, cTL(printerAttributeIdList), xgetCValuePrinterAttributeId(), "PRINTER_ATTRIBUTE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
     * @param printerAttributeIdList The collection of printerAttributeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_NotInScope(Collection<Long> printerAttributeIdList) {
        doSetPrinterAttributeId_NotInScope(printerAttributeIdList);
    }

    protected void doSetPrinterAttributeId_NotInScope(Collection<Long> printerAttributeIdList) {
        regINS(CK_NINS, cTL(printerAttributeIdList), xgetCValuePrinterAttributeId(), "PRINTER_ATTRIBUTE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRINTER_ATTRIBUTE_ID from P_PRINTER_ATTRIBUTE where ...)} <br />
     * P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttributeByPrinterAttributeId'.
     * @param subCBLambda The callback for sub-query of PPrinterAttributeByPrinterAttributeId for 'in-scope'. (NotNull)
     */
    public void inScopePPrinterAttributeByPrinterAttributeId(SubQuery<PPrinterAttributeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrinterAttributeCB cb = new PPrinterAttributeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPrinterAttributeId_InScopeRelation_PPrinterAttributeByPrinterAttributeId(cb.query());
        registerInScopeRelation(cb.query(), "PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", pp, "pPrinterAttributeByPrinterAttributeId", false);
    }
    public abstract String keepPrinterAttributeId_InScopeRelation_PPrinterAttributeByPrinterAttributeId(PPrinterAttributeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRINTER_ATTRIBUTE_ID from P_PRINTER_ATTRIBUTE where ...)} <br />
     * P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttributeByPrinterAttributeId'.
     * @param subCBLambda The callback for sub-query of PPrinterAttributeByPrinterAttributeId for 'not in-scope'. (NotNull)
     */
    public void notInScopePPrinterAttributeByPrinterAttributeId(SubQuery<PPrinterAttributeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrinterAttributeCB cb = new PPrinterAttributeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPrinterAttributeId_NotInScopeRelation_PPrinterAttributeByPrinterAttributeId(cb.query());
        registerInScopeRelation(cb.query(), "PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", pp, "pPrinterAttributeByPrinterAttributeId", true);
    }
    public abstract String keepPrinterAttributeId_NotInScopeRelation_PPrinterAttributeByPrinterAttributeId(PPrinterAttributeCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
     */
    public void setPrinterAttributeId_IsNull() { regPrinterAttributeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
     */
    public void setPrinterAttributeId_IsNotNull() { regPrinterAttributeId(CK_ISNN, DOBJ); }

    protected void regPrinterAttributeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrinterAttributeId(), "PRINTER_ATTRIBUTE_ID"); }
    protected abstract ConditionValue xgetCValuePrinterAttributeId();

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
    public HpSLCFunction<PTerminalAutoPrintSetCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PTerminalAutoPrintSetCB.class);
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
    public HpSLCFunction<PTerminalAutoPrintSetCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PTerminalAutoPrintSetCB.class);
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
    public HpSLCFunction<PTerminalAutoPrintSetCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PTerminalAutoPrintSetCB.class);
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
    public HpSLCFunction<PTerminalAutoPrintSetCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PTerminalAutoPrintSetCB.class);
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
    public HpSLCFunction<PTerminalAutoPrintSetCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PTerminalAutoPrintSetCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PTerminalAutoPrintSetCB&gt;() {
     *     public void query(PTerminalAutoPrintSetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PTerminalAutoPrintSetCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PTerminalAutoPrintSetCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PTerminalAutoPrintSetCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PTerminalAutoPrintSetCQ sq);

    protected PTerminalAutoPrintSetCB xcreateScalarConditionCB() {
        PTerminalAutoPrintSetCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PTerminalAutoPrintSetCB xcreateScalarConditionPartitionByCB() {
        PTerminalAutoPrintSetCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PTerminalAutoPrintSetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TERMINAL_AUTO_PRINT_SET_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PTerminalAutoPrintSetCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PTerminalAutoPrintSetCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PTerminalAutoPrintSetCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TERMINAL_AUTO_PRINT_SET_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PTerminalAutoPrintSetCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PTerminalAutoPrintSetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PTerminalAutoPrintSetCQ sq);

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
    protected PTerminalAutoPrintSetCB newMyCB() {
        return new PTerminalAutoPrintSetCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PTerminalAutoPrintSetCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}