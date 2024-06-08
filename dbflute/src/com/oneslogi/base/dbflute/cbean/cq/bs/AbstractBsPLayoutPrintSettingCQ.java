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
 * The abstract condition-query of P_LAYOUT_PRINT_SETTING.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPLayoutPrintSettingCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPLayoutPrintSettingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "P_LAYOUT_PRINT_SETTING";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param layoutPrintSettingId The value of layoutPrintSettingId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLayoutPrintSettingId_Equal(Long layoutPrintSettingId) {
        doSetLayoutPrintSettingId_Equal(layoutPrintSettingId);
    }

    protected void doSetLayoutPrintSettingId_Equal(Long layoutPrintSettingId) {
        regLayoutPrintSettingId(CK_EQ, layoutPrintSettingId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param layoutPrintSettingId The value of layoutPrintSettingId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLayoutPrintSettingId_NotEqual(Long layoutPrintSettingId) {
        doSetLayoutPrintSettingId_NotEqual(layoutPrintSettingId);
    }

    protected void doSetLayoutPrintSettingId_NotEqual(Long layoutPrintSettingId) {
        regLayoutPrintSettingId(CK_NES, layoutPrintSettingId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param layoutPrintSettingId The value of layoutPrintSettingId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLayoutPrintSettingId_GreaterThan(Long layoutPrintSettingId) {
        regLayoutPrintSettingId(CK_GT, layoutPrintSettingId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param layoutPrintSettingId The value of layoutPrintSettingId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLayoutPrintSettingId_LessThan(Long layoutPrintSettingId) {
        regLayoutPrintSettingId(CK_LT, layoutPrintSettingId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param layoutPrintSettingId The value of layoutPrintSettingId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLayoutPrintSettingId_GreaterEqual(Long layoutPrintSettingId) {
        regLayoutPrintSettingId(CK_GE, layoutPrintSettingId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param layoutPrintSettingId The value of layoutPrintSettingId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLayoutPrintSettingId_LessEqual(Long layoutPrintSettingId) {
        regLayoutPrintSettingId(CK_LE, layoutPrintSettingId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of layoutPrintSettingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of layoutPrintSettingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLayoutPrintSettingId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLayoutPrintSettingId(), "LAYOUT_PRINT_SETTING_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param layoutPrintSettingIdList The collection of layoutPrintSettingId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLayoutPrintSettingId_InScope(Collection<Long> layoutPrintSettingIdList) {
        doSetLayoutPrintSettingId_InScope(layoutPrintSettingIdList);
    }

    protected void doSetLayoutPrintSettingId_InScope(Collection<Long> layoutPrintSettingIdList) {
        regINS(CK_INS, cTL(layoutPrintSettingIdList), xgetCValueLayoutPrintSettingId(), "LAYOUT_PRINT_SETTING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param layoutPrintSettingIdList The collection of layoutPrintSettingId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLayoutPrintSettingId_NotInScope(Collection<Long> layoutPrintSettingIdList) {
        doSetLayoutPrintSettingId_NotInScope(layoutPrintSettingIdList);
    }

    protected void doSetLayoutPrintSettingId_NotInScope(Collection<Long> layoutPrintSettingIdList) {
        regINS(CK_NINS, cTL(layoutPrintSettingIdList), xgetCValueLayoutPrintSettingId(), "LAYOUT_PRINT_SETTING_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setLayoutPrintSettingId_IsNull() { regLayoutPrintSettingId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setLayoutPrintSettingId_IsNotNull() { regLayoutPrintSettingId(CK_ISNN, DOBJ); }

    protected void regLayoutPrintSettingId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLayoutPrintSettingId(), "LAYOUT_PRINT_SETTING_ID"); }
    protected abstract ConditionValue xgetCValueLayoutPrintSettingId();

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
     * P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroup'.
     * @param subCBLambda The callback for sub-query of PPrinterGroup for 'in-scope'. (NotNull)
     */
    public void inScopePPrinterGroup(SubQuery<PPrinterGroupCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrinterGroupCB cb = new PPrinterGroupCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPrinterGroupId_InScopeRelation_PPrinterGroup(cb.query());
        registerInScopeRelation(cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", pp, "pPrinterGroup", false);
    }
    public abstract String keepPrinterGroupId_InScopeRelation_PPrinterGroup(PPrinterGroupCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRINTER_GROUP_ID from P_PRINTER_GROUP where ...)} <br />
     * P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroup'.
     * @param subCBLambda The callback for sub-query of PPrinterGroup for 'not in-scope'. (NotNull)
     */
    public void notInScopePPrinterGroup(SubQuery<PPrinterGroupCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrinterGroupCB cb = new PPrinterGroupCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPrinterGroupId_NotInScopeRelation_PPrinterGroup(cb.query());
        registerInScopeRelation(cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", pp, "pPrinterGroup", true);
    }
    public abstract String keepPrinterGroupId_NotInScopeRelation_PPrinterGroup(PPrinterGroupCQ sq);

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
     * P_PRINTER by my PRINTER_ID, named 'PPrinter'.
     * @param subCBLambda The callback for sub-query of PPrinter for 'in-scope'. (NotNull)
     */
    public void inScopePPrinter(SubQuery<PPrinterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrinterCB cb = new PPrinterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPrinterId_InScopeRelation_PPrinter(cb.query());
        registerInScopeRelation(cb.query(), "PRINTER_ID", "PRINTER_ID", pp, "pPrinter", false);
    }
    public abstract String keepPrinterId_InScopeRelation_PPrinter(PPrinterCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRINTER_ID from P_PRINTER where ...)} <br />
     * P_PRINTER by my PRINTER_ID, named 'PPrinter'.
     * @param subCBLambda The callback for sub-query of PPrinter for 'not in-scope'. (NotNull)
     */
    public void notInScopePPrinter(SubQuery<PPrinterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrinterCB cb = new PPrinterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPrinterId_NotInScopeRelation_PPrinter(cb.query());
        registerInScopeRelation(cb.query(), "PRINTER_ID", "PRINTER_ID", pp, "pPrinter", true);
    }
    public abstract String keepPrinterId_NotInScopeRelation_PPrinter(PPrinterCQ sq);

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
     * P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttribute'.
     * @param subCBLambda The callback for sub-query of PPrinterAttribute for 'in-scope'. (NotNull)
     */
    public void inScopePPrinterAttribute(SubQuery<PPrinterAttributeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrinterAttributeCB cb = new PPrinterAttributeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPrinterAttributeId_InScopeRelation_PPrinterAttribute(cb.query());
        registerInScopeRelation(cb.query(), "PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", pp, "pPrinterAttribute", false);
    }
    public abstract String keepPrinterAttributeId_InScopeRelation_PPrinterAttribute(PPrinterAttributeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRINTER_ATTRIBUTE_ID from P_PRINTER_ATTRIBUTE where ...)} <br />
     * P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttribute'.
     * @param subCBLambda The callback for sub-query of PPrinterAttribute for 'not in-scope'. (NotNull)
     */
    public void notInScopePPrinterAttribute(SubQuery<PPrinterAttributeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrinterAttributeCB cb = new PPrinterAttributeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPrinterAttributeId_NotInScopeRelation_PPrinterAttribute(cb.query());
        registerInScopeRelation(cb.query(), "PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", pp, "pPrinterAttribute", true);
    }
    public abstract String keepPrinterAttributeId_NotInScopeRelation_PPrinterAttribute(PPrinterAttributeCQ sq);

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
    public HpSLCFunction<PLayoutPrintSettingCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PLayoutPrintSettingCB.class);
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
    public HpSLCFunction<PLayoutPrintSettingCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PLayoutPrintSettingCB.class);
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
    public HpSLCFunction<PLayoutPrintSettingCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PLayoutPrintSettingCB.class);
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
    public HpSLCFunction<PLayoutPrintSettingCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PLayoutPrintSettingCB.class);
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
    public HpSLCFunction<PLayoutPrintSettingCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PLayoutPrintSettingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PLayoutPrintSettingCB&gt;() {
     *     public void query(PLayoutPrintSettingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PLayoutPrintSettingCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PLayoutPrintSettingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PLayoutPrintSettingCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PLayoutPrintSettingCQ sq);

    protected PLayoutPrintSettingCB xcreateScalarConditionCB() {
        PLayoutPrintSettingCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PLayoutPrintSettingCB xcreateScalarConditionPartitionByCB() {
        PLayoutPrintSettingCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PLayoutPrintSettingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PLayoutPrintSettingCB cb = new PLayoutPrintSettingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LAYOUT_PRINT_SETTING_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PLayoutPrintSettingCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PLayoutPrintSettingCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PLayoutPrintSettingCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PLayoutPrintSettingCB cb = new PLayoutPrintSettingCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LAYOUT_PRINT_SETTING_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PLayoutPrintSettingCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PLayoutPrintSettingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PLayoutPrintSettingCB cb = new PLayoutPrintSettingCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PLayoutPrintSettingCQ sq);

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
    protected PLayoutPrintSettingCB newMyCB() {
        return new PLayoutPrintSettingCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PLayoutPrintSettingCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
