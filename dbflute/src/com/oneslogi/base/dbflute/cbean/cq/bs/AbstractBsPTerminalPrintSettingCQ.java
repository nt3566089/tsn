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
 * The abstract condition-query of P_TERMINAL_PRINT_SETTING.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPTerminalPrintSettingCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPTerminalPrintSettingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "P_TERMINAL_PRINT_SETTING";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalPrintSettingId The value of terminalPrintSettingId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalPrintSettingId_Equal(Long terminalPrintSettingId) {
        doSetTerminalPrintSettingId_Equal(terminalPrintSettingId);
    }

    protected void doSetTerminalPrintSettingId_Equal(Long terminalPrintSettingId) {
        regTerminalPrintSettingId(CK_EQ, terminalPrintSettingId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalPrintSettingId The value of terminalPrintSettingId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalPrintSettingId_NotEqual(Long terminalPrintSettingId) {
        doSetTerminalPrintSettingId_NotEqual(terminalPrintSettingId);
    }

    protected void doSetTerminalPrintSettingId_NotEqual(Long terminalPrintSettingId) {
        regTerminalPrintSettingId(CK_NES, terminalPrintSettingId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalPrintSettingId The value of terminalPrintSettingId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalPrintSettingId_GreaterThan(Long terminalPrintSettingId) {
        regTerminalPrintSettingId(CK_GT, terminalPrintSettingId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalPrintSettingId The value of terminalPrintSettingId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalPrintSettingId_LessThan(Long terminalPrintSettingId) {
        regTerminalPrintSettingId(CK_LT, terminalPrintSettingId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalPrintSettingId The value of terminalPrintSettingId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalPrintSettingId_GreaterEqual(Long terminalPrintSettingId) {
        regTerminalPrintSettingId(CK_GE, terminalPrintSettingId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalPrintSettingId The value of terminalPrintSettingId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalPrintSettingId_LessEqual(Long terminalPrintSettingId) {
        regTerminalPrintSettingId(CK_LE, terminalPrintSettingId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of terminalPrintSettingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of terminalPrintSettingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTerminalPrintSettingId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTerminalPrintSettingId(), "TERMINAL_PRINT_SETTING_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TERMINAL_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalPrintSettingIdList The collection of terminalPrintSettingId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalPrintSettingId_InScope(Collection<Long> terminalPrintSettingIdList) {
        doSetTerminalPrintSettingId_InScope(terminalPrintSettingIdList);
    }

    protected void doSetTerminalPrintSettingId_InScope(Collection<Long> terminalPrintSettingIdList) {
        regINS(CK_INS, cTL(terminalPrintSettingIdList), xgetCValueTerminalPrintSettingId(), "TERMINAL_PRINT_SETTING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TERMINAL_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalPrintSettingIdList The collection of terminalPrintSettingId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalPrintSettingId_NotInScope(Collection<Long> terminalPrintSettingIdList) {
        doSetTerminalPrintSettingId_NotInScope(terminalPrintSettingIdList);
    }

    protected void doSetTerminalPrintSettingId_NotInScope(Collection<Long> terminalPrintSettingIdList) {
        regINS(CK_NINS, cTL(terminalPrintSettingIdList), xgetCValueTerminalPrintSettingId(), "TERMINAL_PRINT_SETTING_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TERMINAL_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTerminalPrintSettingId_IsNull() { regTerminalPrintSettingId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TERMINAL_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTerminalPrintSettingId_IsNotNull() { regTerminalPrintSettingId(CK_ISNN, DOBJ); }

    protected void regTerminalPrintSettingId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTerminalPrintSettingId(), "TERMINAL_PRINT_SETTING_ID"); }
    protected abstract ConditionValue xgetCValueTerminalPrintSettingId();

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
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19)}
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
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19)}
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
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19)}
     * @param reportLayoutId The value of reportLayoutId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_GreaterThan(Long reportLayoutId) {
        regReportLayoutId(CK_GT, reportLayoutId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19)}
     * @param reportLayoutId The value of reportLayoutId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_LessThan(Long reportLayoutId) {
        regReportLayoutId(CK_LT, reportLayoutId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19)}
     * @param reportLayoutId The value of reportLayoutId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_GreaterEqual(Long reportLayoutId) {
        regReportLayoutId(CK_GE, reportLayoutId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19)}
     * @param reportLayoutId The value of reportLayoutId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_LessEqual(Long reportLayoutId) {
        regReportLayoutId(CK_LE, reportLayoutId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19)}
     * @param minNumber The min number of reportLayoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reportLayoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReportLayoutId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReportLayoutId(), "REPORT_LAYOUT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19)}
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
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19)}
     * @param reportLayoutIdList The collection of reportLayoutId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutId_NotInScope(Collection<Long> reportLayoutIdList) {
        doSetReportLayoutId_NotInScope(reportLayoutIdList);
    }

    protected void doSetReportLayoutId_NotInScope(Collection<Long> reportLayoutIdList) {
        regINS(CK_NINS, cTL(reportLayoutIdList), xgetCValueReportLayoutId(), "REPORT_LAYOUT_ID");
    }

    protected void regReportLayoutId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportLayoutId(), "REPORT_LAYOUT_ID"); }
    protected abstract ConditionValue xgetCValueReportLayoutId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
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
     * PRINTER_GROUP_ID: {IX, bigint(19)}
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
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @param printerGroupId The value of printerGroupId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_GreaterThan(Long printerGroupId) {
        regPrinterGroupId(CK_GT, printerGroupId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @param printerGroupId The value of printerGroupId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_LessThan(Long printerGroupId) {
        regPrinterGroupId(CK_LT, printerGroupId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @param printerGroupId The value of printerGroupId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_GreaterEqual(Long printerGroupId) {
        regPrinterGroupId(CK_GE, printerGroupId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @param printerGroupId The value of printerGroupId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_LessEqual(Long printerGroupId) {
        regPrinterGroupId(CK_LE, printerGroupId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @param minNumber The min number of printerGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printerGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrinterGroupId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
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
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @param printerGroupIdList The collection of printerGroupId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupId_NotInScope(Collection<Long> printerGroupIdList) {
        doSetPrinterGroupId_NotInScope(printerGroupIdList);
    }

    protected void doSetPrinterGroupId_NotInScope(Collection<Long> printerGroupIdList) {
        regINS(CK_NINS, cTL(printerGroupIdList), xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     */
    public void setPrinterGroupId_IsNull() { regPrinterGroupId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     */
    public void setPrinterGroupId_IsNotNull() { regPrinterGroupId(CK_ISNN, DOBJ); }

    protected void regPrinterGroupId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID"); }
    protected abstract ConditionValue xgetCValuePrinterGroupId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, bigint(19)}
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
     * PRINTER_ID: {IX, bigint(19)}
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
     * PRINTER_ID: {IX, bigint(19)}
     * @param printerId The value of printerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterId_GreaterThan(Long printerId) {
        regPrinterId(CK_GT, printerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, bigint(19)}
     * @param printerId The value of printerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterId_LessThan(Long printerId) {
        regPrinterId(CK_LT, printerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, bigint(19)}
     * @param printerId The value of printerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterId_GreaterEqual(Long printerId) {
        regPrinterId(CK_GE, printerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, bigint(19)}
     * @param printerId The value of printerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterId_LessEqual(Long printerId) {
        regPrinterId(CK_LE, printerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, bigint(19)}
     * @param minNumber The min number of printerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrinterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrinterId(), "PRINTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTER_ID: {IX, bigint(19)}
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
     * PRINTER_ID: {IX, bigint(19)}
     * @param printerIdList The collection of printerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterId_NotInScope(Collection<Long> printerIdList) {
        doSetPrinterId_NotInScope(printerIdList);
    }

    protected void doSetPrinterId_NotInScope(Collection<Long> printerIdList) {
        regINS(CK_NINS, cTL(printerIdList), xgetCValuePrinterId(), "PRINTER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, bigint(19)}
     */
    public void setPrinterId_IsNull() { regPrinterId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, bigint(19)}
     */
    public void setPrinterId_IsNotNull() { regPrinterId(CK_ISNN, DOBJ); }

    protected void regPrinterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrinterId(), "PRINTER_ID"); }
    protected abstract ConditionValue xgetCValuePrinterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19)}
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
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19)}
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
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19)}
     * @param printerAttributeId The value of printerAttributeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_GreaterThan(Long printerAttributeId) {
        regPrinterAttributeId(CK_GT, printerAttributeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19)}
     * @param printerAttributeId The value of printerAttributeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_LessThan(Long printerAttributeId) {
        regPrinterAttributeId(CK_LT, printerAttributeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19)}
     * @param printerAttributeId The value of printerAttributeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_GreaterEqual(Long printerAttributeId) {
        regPrinterAttributeId(CK_GE, printerAttributeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19)}
     * @param printerAttributeId The value of printerAttributeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_LessEqual(Long printerAttributeId) {
        regPrinterAttributeId(CK_LE, printerAttributeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19)}
     * @param minNumber The min number of printerAttributeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printerAttributeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrinterAttributeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrinterAttributeId(), "PRINTER_ATTRIBUTE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19)}
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
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19)}
     * @param printerAttributeIdList The collection of printerAttributeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_NotInScope(Collection<Long> printerAttributeIdList) {
        doSetPrinterAttributeId_NotInScope(printerAttributeIdList);
    }

    protected void doSetPrinterAttributeId_NotInScope(Collection<Long> printerAttributeIdList) {
        regINS(CK_NINS, cTL(printerAttributeIdList), xgetCValuePrinterAttributeId(), "PRINTER_ATTRIBUTE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19)}
     */
    public void setPrinterAttributeId_IsNull() { regPrinterAttributeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19)}
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
    public HpSLCFunction<PTerminalPrintSettingCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PTerminalPrintSettingCB.class);
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
    public HpSLCFunction<PTerminalPrintSettingCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PTerminalPrintSettingCB.class);
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
    public HpSLCFunction<PTerminalPrintSettingCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PTerminalPrintSettingCB.class);
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
    public HpSLCFunction<PTerminalPrintSettingCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PTerminalPrintSettingCB.class);
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
    public HpSLCFunction<PTerminalPrintSettingCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PTerminalPrintSettingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PTerminalPrintSettingCB&gt;() {
     *     public void query(PTerminalPrintSettingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PTerminalPrintSettingCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PTerminalPrintSettingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PTerminalPrintSettingCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PTerminalPrintSettingCQ sq);

    protected PTerminalPrintSettingCB xcreateScalarConditionCB() {
        PTerminalPrintSettingCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PTerminalPrintSettingCB xcreateScalarConditionPartitionByCB() {
        PTerminalPrintSettingCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PTerminalPrintSettingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PTerminalPrintSettingCB cb = new PTerminalPrintSettingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TERMINAL_PRINT_SETTING_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PTerminalPrintSettingCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PTerminalPrintSettingCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PTerminalPrintSettingCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PTerminalPrintSettingCB cb = new PTerminalPrintSettingCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TERMINAL_PRINT_SETTING_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PTerminalPrintSettingCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PTerminalPrintSettingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PTerminalPrintSettingCB cb = new PTerminalPrintSettingCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PTerminalPrintSettingCQ sq);

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
    protected PTerminalPrintSettingCB newMyCB() {
        return new PTerminalPrintSettingCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PTerminalPrintSettingCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
