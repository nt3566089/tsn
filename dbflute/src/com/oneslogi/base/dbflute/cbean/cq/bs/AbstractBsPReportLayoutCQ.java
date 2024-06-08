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
 * The abstract condition-query of P_REPORT_LAYOUT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPReportLayoutCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPReportLayoutCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "P_REPORT_LAYOUT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportLayoutId The value of reportLayoutId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_GreaterThan(Long reportLayoutId) {
        regReportLayoutId(CK_GT, reportLayoutId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportLayoutId The value of reportLayoutId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_LessThan(Long reportLayoutId) {
        regReportLayoutId(CK_LT, reportLayoutId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportLayoutId The value of reportLayoutId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_GreaterEqual(Long reportLayoutId) {
        regReportLayoutId(CK_GE, reportLayoutId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportLayoutId The value of reportLayoutId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportLayoutId_LessEqual(Long reportLayoutId) {
        regReportLayoutId(CK_LE, reportLayoutId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of reportLayoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reportLayoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReportLayoutId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReportLayoutId(), "REPORT_LAYOUT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param reportLayoutIdList The collection of reportLayoutId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutId_NotInScope(Collection<Long> reportLayoutIdList) {
        doSetReportLayoutId_NotInScope(reportLayoutIdList);
    }

    protected void doSetReportLayoutId_NotInScope(Collection<Long> reportLayoutIdList) {
        regINS(CK_NINS, cTL(reportLayoutIdList), xgetCValueReportLayoutId(), "REPORT_LAYOUT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPORT_LAYOUT_ID from P_LAYOUT_PRINT_SETTING where ...)} <br>
     * P_LAYOUT_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PLayoutPrintSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPLayoutPrintSettingAsOne</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PLayoutPrintSettingAsOne for 'exists'. (NotNull)
     */
    public void existsPLayoutPrintSettingAsOne(SubQuery<PLayoutPrintSettingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PLayoutPrintSettingCB cb = new PLayoutPrintSettingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReportLayoutId_ExistsReferrer_PLayoutPrintSettingAsOne(cb.query());
        registerExistsReferrer(cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", pp, "pLayoutPrintSettingAsOne");
    }
    public abstract String keepReportLayoutId_ExistsReferrer_PLayoutPrintSettingAsOne(PLayoutPrintSettingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPORT_LAYOUT_ID from P_REPORT_LAYOUT_ITEM where ...)} <br>
     * P_REPORT_LAYOUT_ITEM by REPORT_LAYOUT_ID, named 'PReportLayoutItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPReportLayoutItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PReportLayoutItemList for 'exists'. (NotNull)
     */
    public void existsPReportLayoutItemList(SubQuery<PReportLayoutItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PReportLayoutItemCB cb = new PReportLayoutItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReportLayoutId_ExistsReferrer_PReportLayoutItemList(cb.query());
        registerExistsReferrer(cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", pp, "pReportLayoutItemList");
    }
    public abstract String keepReportLayoutId_ExistsReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPORT_LAYOUT_ID from P_SUBREP_LAYOUT where ...)} <br>
     * P_SUBREP_LAYOUT by REPORT_LAYOUT_ID, named 'PSubrepLayoutAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPSubrepLayoutAsOne</span>(layoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     layoutCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PSubrepLayoutAsOne for 'exists'. (NotNull)
     */
    public void existsPSubrepLayoutAsOne(SubQuery<PSubrepLayoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PSubrepLayoutCB cb = new PSubrepLayoutCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReportLayoutId_ExistsReferrer_PSubrepLayoutAsOne(cb.query());
        registerExistsReferrer(cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", pp, "pSubrepLayoutAsOne");
    }
    public abstract String keepReportLayoutId_ExistsReferrer_PSubrepLayoutAsOne(PSubrepLayoutCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPORT_LAYOUT_ID from P_USER_AUTO_PRINT_SETTING where ...)} <br>
     * P_USER_AUTO_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PUserAutoPrintSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPUserAutoPrintSettingByReportLayoutIdList</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PUserAutoPrintSettingByReportLayoutIdList for 'exists'. (NotNull)
     */
    public void existsPUserAutoPrintSettingByReportLayoutIdList(SubQuery<PUserAutoPrintSettingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PUserAutoPrintSettingCB cb = new PUserAutoPrintSettingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReportLayoutId_ExistsReferrer_PUserAutoPrintSettingByReportLayoutIdList(cb.query());
        registerExistsReferrer(cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", pp, "pUserAutoPrintSettingByReportLayoutIdList");
    }
    public abstract String keepReportLayoutId_ExistsReferrer_PUserAutoPrintSettingByReportLayoutIdList(PUserAutoPrintSettingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPORT_LAYOUT_ID from P_TERMINAL_AUTO_PRINT_SET where ...)} <br>
     * P_TERMINAL_AUTO_PRINT_SET by REPORT_LAYOUT_ID, named 'PTerminalAutoPrintSetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPTerminalAutoPrintSetByReportLayoutIdList</span>(setCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     setCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PTerminalAutoPrintSetByReportLayoutIdList for 'exists'. (NotNull)
     */
    public void existsPTerminalAutoPrintSetByReportLayoutIdList(SubQuery<PTerminalAutoPrintSetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReportLayoutId_ExistsReferrer_PTerminalAutoPrintSetByReportLayoutIdList(cb.query());
        registerExistsReferrer(cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", pp, "pTerminalAutoPrintSetByReportLayoutIdList");
    }
    public abstract String keepReportLayoutId_ExistsReferrer_PTerminalAutoPrintSetByReportLayoutIdList(PTerminalAutoPrintSetCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPORT_LAYOUT_ID from P_LAYOUT_PRINT_SETTING where ...)} <br>
     * P_LAYOUT_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PLayoutPrintSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPLayoutPrintSettingAsOne</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReportLayoutId_NotExistsReferrer_PLayoutPrintSettingAsOne for 'not exists'. (NotNull)
     */
    public void notExistsPLayoutPrintSettingAsOne(SubQuery<PLayoutPrintSettingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PLayoutPrintSettingCB cb = new PLayoutPrintSettingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReportLayoutId_NotExistsReferrer_PLayoutPrintSettingAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", pp, "pLayoutPrintSettingAsOne");
    }
    public abstract String keepReportLayoutId_NotExistsReferrer_PLayoutPrintSettingAsOne(PLayoutPrintSettingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPORT_LAYOUT_ID from P_REPORT_LAYOUT_ITEM where ...)} <br>
     * P_REPORT_LAYOUT_ITEM by REPORT_LAYOUT_ID, named 'PReportLayoutItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPReportLayoutItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReportLayoutId_NotExistsReferrer_PReportLayoutItemList for 'not exists'. (NotNull)
     */
    public void notExistsPReportLayoutItemList(SubQuery<PReportLayoutItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PReportLayoutItemCB cb = new PReportLayoutItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReportLayoutId_NotExistsReferrer_PReportLayoutItemList(cb.query());
        registerNotExistsReferrer(cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", pp, "pReportLayoutItemList");
    }
    public abstract String keepReportLayoutId_NotExistsReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPORT_LAYOUT_ID from P_SUBREP_LAYOUT where ...)} <br>
     * P_SUBREP_LAYOUT by REPORT_LAYOUT_ID, named 'PSubrepLayoutAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPSubrepLayoutAsOne</span>(layoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     layoutCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReportLayoutId_NotExistsReferrer_PSubrepLayoutAsOne for 'not exists'. (NotNull)
     */
    public void notExistsPSubrepLayoutAsOne(SubQuery<PSubrepLayoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PSubrepLayoutCB cb = new PSubrepLayoutCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReportLayoutId_NotExistsReferrer_PSubrepLayoutAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", pp, "pSubrepLayoutAsOne");
    }
    public abstract String keepReportLayoutId_NotExistsReferrer_PSubrepLayoutAsOne(PSubrepLayoutCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPORT_LAYOUT_ID from P_USER_AUTO_PRINT_SETTING where ...)} <br>
     * P_USER_AUTO_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PUserAutoPrintSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPUserAutoPrintSettingByReportLayoutIdList</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReportLayoutId_NotExistsReferrer_PUserAutoPrintSettingByReportLayoutIdList for 'not exists'. (NotNull)
     */
    public void notExistsPUserAutoPrintSettingByReportLayoutIdList(SubQuery<PUserAutoPrintSettingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PUserAutoPrintSettingCB cb = new PUserAutoPrintSettingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReportLayoutId_NotExistsReferrer_PUserAutoPrintSettingByReportLayoutIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", pp, "pUserAutoPrintSettingByReportLayoutIdList");
    }
    public abstract String keepReportLayoutId_NotExistsReferrer_PUserAutoPrintSettingByReportLayoutIdList(PUserAutoPrintSettingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPORT_LAYOUT_ID from P_TERMINAL_AUTO_PRINT_SET where ...)} <br>
     * P_TERMINAL_AUTO_PRINT_SET by REPORT_LAYOUT_ID, named 'PTerminalAutoPrintSetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPTerminalAutoPrintSetByReportLayoutIdList</span>(setCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     setCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReportLayoutId_NotExistsReferrer_PTerminalAutoPrintSetByReportLayoutIdList for 'not exists'. (NotNull)
     */
    public void notExistsPTerminalAutoPrintSetByReportLayoutIdList(SubQuery<PTerminalAutoPrintSetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReportLayoutId_NotExistsReferrer_PTerminalAutoPrintSetByReportLayoutIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", pp, "pTerminalAutoPrintSetByReportLayoutIdList");
    }
    public abstract String keepReportLayoutId_NotExistsReferrer_PTerminalAutoPrintSetByReportLayoutIdList(PTerminalAutoPrintSetCQ sq);

    public void xsderivePReportLayoutItemList(String fn, SubQuery<PReportLayoutItemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PReportLayoutItemCB cb = new PReportLayoutItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepReportLayoutId_SpecifyDerivedReferrer_PReportLayoutItemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", pp, "pReportLayoutItemList", al, op);
    }
    public abstract String keepReportLayoutId_SpecifyDerivedReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq);

    public void xsderivePUserAutoPrintSettingByReportLayoutIdList(String fn, SubQuery<PUserAutoPrintSettingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PUserAutoPrintSettingCB cb = new PUserAutoPrintSettingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepReportLayoutId_SpecifyDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", pp, "pUserAutoPrintSettingByReportLayoutIdList", al, op);
    }
    public abstract String keepReportLayoutId_SpecifyDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdList(PUserAutoPrintSettingCQ sq);

    public void xsderivePTerminalAutoPrintSetByReportLayoutIdList(String fn, SubQuery<PTerminalAutoPrintSetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepReportLayoutId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", pp, "pTerminalAutoPrintSetByReportLayoutIdList", al, op);
    }
    public abstract String keepReportLayoutId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdList(PTerminalAutoPrintSetCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from P_REPORT_LAYOUT_ITEM where ...)} <br>
     * P_REPORT_LAYOUT_ITEM by REPORT_LAYOUT_ID, named 'PReportLayoutItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPReportLayoutItemList()</span>.<span style="color: #CC4747">max</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     itemCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PReportLayoutItemCB> derivedPReportLayoutItemList() {
        return xcreateQDRFunctionPReportLayoutItemList();
    }
    protected HpQDRFunction<PReportLayoutItemCB> xcreateQDRFunctionPReportLayoutItemList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePReportLayoutItemList(fn, sq, rd, vl, op));
    }
    public void xqderivePReportLayoutItemList(String fn, SubQuery<PReportLayoutItemCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PReportLayoutItemCB cb = new PReportLayoutItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepReportLayoutId_QueryDerivedReferrer_PReportLayoutItemList(cb.query()); String prpp = keepReportLayoutId_QueryDerivedReferrer_PReportLayoutItemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", sqpp, "pReportLayoutItemList", rd, vl, prpp, op);
    }
    public abstract String keepReportLayoutId_QueryDerivedReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq);
    public abstract String keepReportLayoutId_QueryDerivedReferrer_PReportLayoutItemListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from P_USER_AUTO_PRINT_SETTING where ...)} <br>
     * P_USER_AUTO_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PUserAutoPrintSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPUserAutoPrintSettingByReportLayoutIdList()</span>.<span style="color: #CC4747">max</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     settingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PUserAutoPrintSettingCB> derivedPUserAutoPrintSettingByReportLayoutIdList() {
        return xcreateQDRFunctionPUserAutoPrintSettingByReportLayoutIdList();
    }
    protected HpQDRFunction<PUserAutoPrintSettingCB> xcreateQDRFunctionPUserAutoPrintSettingByReportLayoutIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePUserAutoPrintSettingByReportLayoutIdList(fn, sq, rd, vl, op));
    }
    public void xqderivePUserAutoPrintSettingByReportLayoutIdList(String fn, SubQuery<PUserAutoPrintSettingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PUserAutoPrintSettingCB cb = new PUserAutoPrintSettingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepReportLayoutId_QueryDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdList(cb.query()); String prpp = keepReportLayoutId_QueryDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", sqpp, "pUserAutoPrintSettingByReportLayoutIdList", rd, vl, prpp, op);
    }
    public abstract String keepReportLayoutId_QueryDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdList(PUserAutoPrintSettingCQ sq);
    public abstract String keepReportLayoutId_QueryDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from P_TERMINAL_AUTO_PRINT_SET where ...)} <br>
     * P_TERMINAL_AUTO_PRINT_SET by REPORT_LAYOUT_ID, named 'PTerminalAutoPrintSetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPTerminalAutoPrintSetByReportLayoutIdList()</span>.<span style="color: #CC4747">max</span>(setCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     setCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     setCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PTerminalAutoPrintSetCB> derivedPTerminalAutoPrintSetByReportLayoutIdList() {
        return xcreateQDRFunctionPTerminalAutoPrintSetByReportLayoutIdList();
    }
    protected HpQDRFunction<PTerminalAutoPrintSetCB> xcreateQDRFunctionPTerminalAutoPrintSetByReportLayoutIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePTerminalAutoPrintSetByReportLayoutIdList(fn, sq, rd, vl, op));
    }
    public void xqderivePTerminalAutoPrintSetByReportLayoutIdList(String fn, SubQuery<PTerminalAutoPrintSetCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepReportLayoutId_QueryDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdList(cb.query()); String prpp = keepReportLayoutId_QueryDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", sqpp, "pTerminalAutoPrintSetByReportLayoutIdList", rd, vl, prpp, op);
    }
    public abstract String keepReportLayoutId_QueryDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdList(PTerminalAutoPrintSetCQ sq);
    public abstract String keepReportLayoutId_QueryDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setReportLayoutId_IsNull() { regReportLayoutId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setReportLayoutId_IsNotNull() { regReportLayoutId(CK_ISNN, DOBJ); }

    protected void regReportLayoutId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportLayoutId(), "REPORT_LAYOUT_ID"); }
    protected abstract ConditionValue xgetCValueReportLayoutId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT}
     * @param reportId The value of reportId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_Equal(Long reportId) {
        doSetReportId_Equal(reportId);
    }

    protected void doSetReportId_Equal(Long reportId) {
        regReportId(CK_EQ, reportId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT}
     * @param reportId The value of reportId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_NotEqual(Long reportId) {
        doSetReportId_NotEqual(reportId);
    }

    protected void doSetReportId_NotEqual(Long reportId) {
        regReportId(CK_NES, reportId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT}
     * @param reportId The value of reportId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_GreaterThan(Long reportId) {
        regReportId(CK_GT, reportId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT}
     * @param reportId The value of reportId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_LessThan(Long reportId) {
        regReportId(CK_LT, reportId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT}
     * @param reportId The value of reportId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_GreaterEqual(Long reportId) {
        regReportId(CK_GE, reportId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT}
     * @param reportId The value of reportId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_LessEqual(Long reportId) {
        regReportId(CK_LE, reportId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT}
     * @param minNumber The min number of reportId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reportId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReportId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReportId(), "REPORT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT}
     * @param reportIdList The collection of reportId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportId_InScope(Collection<Long> reportIdList) {
        doSetReportId_InScope(reportIdList);
    }

    protected void doSetReportId_InScope(Collection<Long> reportIdList) {
        regINS(CK_INS, cTL(reportIdList), xgetCValueReportId(), "REPORT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT}
     * @param reportIdList The collection of reportId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportId_NotInScope(Collection<Long> reportIdList) {
        doSetReportId_NotInScope(reportIdList);
    }

    protected void doSetReportId_NotInScope(Collection<Long> reportIdList) {
        regINS(CK_NINS, cTL(reportIdList), xgetCValueReportId(), "REPORT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select REPORT_ID from P_REPORT where ...)} <br />
     * P_REPORT by my REPORT_ID, named 'PReport'.
     * @param subCBLambda The callback for sub-query of PReport for 'in-scope'. (NotNull)
     */
    public void inScopePReport(SubQuery<PReportCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PReportCB cb = new PReportCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReportId_InScopeRelation_PReport(cb.query());
        registerInScopeRelation(cb.query(), "REPORT_ID", "REPORT_ID", pp, "pReport", false);
    }
    public abstract String keepReportId_InScopeRelation_PReport(PReportCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select REPORT_ID from P_REPORT where ...)} <br />
     * P_REPORT by my REPORT_ID, named 'PReport'.
     * @param subCBLambda The callback for sub-query of PReport for 'not in-scope'. (NotNull)
     */
    public void notInScopePReport(SubQuery<PReportCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PReportCB cb = new PReportCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReportId_NotInScopeRelation_PReport(cb.query());
        registerInScopeRelation(cb.query(), "REPORT_ID", "REPORT_ID", pp, "pReport", true);
    }
    public abstract String keepReportId_NotInScopeRelation_PReport(PReportCQ sq);

    protected void regReportId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportId(), "REPORT_ID"); }
    protected abstract ConditionValue xgetCValueReportId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)}
     * @param reportLayoutNm The value of reportLayoutNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutNm_Equal(String reportLayoutNm) {
        doSetReportLayoutNm_Equal(fRES(reportLayoutNm));
    }

    protected void doSetReportLayoutNm_Equal(String reportLayoutNm) {
        regReportLayoutNm(CK_EQ, reportLayoutNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)}
     * @param reportLayoutNm The value of reportLayoutNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutNm_NotEqual(String reportLayoutNm) {
        doSetReportLayoutNm_NotEqual(fRES(reportLayoutNm));
    }

    protected void doSetReportLayoutNm_NotEqual(String reportLayoutNm) {
        regReportLayoutNm(CK_NES, reportLayoutNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)}
     * @param reportLayoutNm The value of reportLayoutNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutNm_GreaterThan(String reportLayoutNm) {
        regReportLayoutNm(CK_GT, fRES(reportLayoutNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)}
     * @param reportLayoutNm The value of reportLayoutNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutNm_LessThan(String reportLayoutNm) {
        regReportLayoutNm(CK_LT, fRES(reportLayoutNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)}
     * @param reportLayoutNm The value of reportLayoutNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutNm_GreaterEqual(String reportLayoutNm) {
        regReportLayoutNm(CK_GE, fRES(reportLayoutNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)}
     * @param reportLayoutNm The value of reportLayoutNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutNm_LessEqual(String reportLayoutNm) {
        regReportLayoutNm(CK_LE, fRES(reportLayoutNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)}
     * @param reportLayoutNmList The collection of reportLayoutNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutNm_InScope(Collection<String> reportLayoutNmList) {
        doSetReportLayoutNm_InScope(reportLayoutNmList);
    }

    protected void doSetReportLayoutNm_InScope(Collection<String> reportLayoutNmList) {
        regINS(CK_INS, cTL(reportLayoutNmList), xgetCValueReportLayoutNm(), "REPORT_LAYOUT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)}
     * @param reportLayoutNmList The collection of reportLayoutNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutNm_NotInScope(Collection<String> reportLayoutNmList) {
        doSetReportLayoutNm_NotInScope(reportLayoutNmList);
    }

    protected void doSetReportLayoutNm_NotInScope(Collection<String> reportLayoutNmList) {
        regINS(CK_NINS, cTL(reportLayoutNmList), xgetCValueReportLayoutNm(), "REPORT_LAYOUT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)} <br>
     * <pre>e.g. setReportLayoutNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reportLayoutNm The value of reportLayoutNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReportLayoutNm_LikeSearch(String reportLayoutNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reportLayoutNm), xgetCValueReportLayoutNm(), "REPORT_LAYOUT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)}
     * @param reportLayoutNm The value of reportLayoutNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReportLayoutNm_NotLikeSearch(String reportLayoutNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reportLayoutNm), xgetCValueReportLayoutNm(), "REPORT_LAYOUT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)}
     * @param reportLayoutNm The value of reportLayoutNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutNm_PrefixSearch(String reportLayoutNm) {
        setReportLayoutNm_LikeSearch(reportLayoutNm, xcLSOPPre());
    }

    protected void regReportLayoutNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportLayoutNm(), "REPORT_LAYOUT_NM"); }
    protected abstract ConditionValue xgetCValueReportLayoutNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)}
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
     * REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)}
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
     * REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @param reportLayoutData The value of reportLayoutData as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutData_GreaterThan(String reportLayoutData) {
        regReportLayoutData(CK_GT, fRES(reportLayoutData));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @param reportLayoutData The value of reportLayoutData as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutData_LessThan(String reportLayoutData) {
        regReportLayoutData(CK_LT, fRES(reportLayoutData));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @param reportLayoutData The value of reportLayoutData as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutData_GreaterEqual(String reportLayoutData) {
        regReportLayoutData(CK_GE, fRES(reportLayoutData));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @param reportLayoutData The value of reportLayoutData as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutData_LessEqual(String reportLayoutData) {
        regReportLayoutData(CK_LE, fRES(reportLayoutData));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)}
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
     * REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)}
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
     * REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)} <br>
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
     * REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @param reportLayoutData The value of reportLayoutData as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReportLayoutData_NotLikeSearch(String reportLayoutData, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reportLayoutData), xgetCValueReportLayoutData(), "REPORT_LAYOUT_DATA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @param reportLayoutData The value of reportLayoutData as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutData_PrefixSearch(String reportLayoutData) {
        setReportLayoutData_LikeSearch(reportLayoutData, xcLSOPPre());
    }

    protected void regReportLayoutData(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportLayoutData(), "REPORT_LAYOUT_DATA"); }
    protected abstract ConditionValue xgetCValueReportLayoutData();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable}
     * @param updatable The value of updatable as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatable_Equal(String updatable) {
        doSetUpdatable_Equal(fRES(updatable));
    }

    /**
     * Equal(=). As Updatable. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable} <br>
     * 更新可否
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatable_Equal_AsUpdatable(CDef.Updatable cdef) {
        doSetUpdatable_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 更新不可
     */
    public void setUpdatable_Equal_$0() {
        setUpdatable_Equal_AsUpdatable(CDef.Updatable.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 更新可能
     */
    public void setUpdatable_Equal_$1() {
        setUpdatable_Equal_AsUpdatable(CDef.Updatable.$1);
    }

    protected void doSetUpdatable_Equal(String updatable) {
        regUpdatable(CK_EQ, updatable);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable}
     * @param updatable The value of updatable as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatable_NotEqual(String updatable) {
        doSetUpdatable_NotEqual(fRES(updatable));
    }

    /**
     * NotEqual(&lt;&gt;). As Updatable. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable} <br>
     * 更新可否
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatable_NotEqual_AsUpdatable(CDef.Updatable cdef) {
        doSetUpdatable_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 更新不可
     */
    public void setUpdatable_NotEqual_$0() {
        setUpdatable_NotEqual_AsUpdatable(CDef.Updatable.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 更新可能
     */
    public void setUpdatable_NotEqual_$1() {
        setUpdatable_NotEqual_AsUpdatable(CDef.Updatable.$1);
    }

    protected void doSetUpdatable_NotEqual(String updatable) {
        regUpdatable(CK_NES, updatable);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable}
     * @param updatableList The collection of updatable as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatable_InScope(Collection<String> updatableList) {
        doSetUpdatable_InScope(updatableList);
    }

    /**
     * InScope {in ('a', 'b')}. As Updatable. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable} <br>
     * 更新可否
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatable_InScope_AsUpdatable(Collection<CDef.Updatable> cdefList) {
        doSetUpdatable_InScope(cTStrL(cdefList));
    }

    protected void doSetUpdatable_InScope(Collection<String> updatableList) {
        regINS(CK_INS, cTL(updatableList), xgetCValueUpdatable(), "UPDATABLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable}
     * @param updatableList The collection of updatable as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatable_NotInScope(Collection<String> updatableList) {
        doSetUpdatable_NotInScope(updatableList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Updatable. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable} <br>
     * 更新可否
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatable_NotInScope_AsUpdatable(Collection<CDef.Updatable> cdefList) {
        doSetUpdatable_NotInScope(cTStrL(cdefList));
    }

    protected void doSetUpdatable_NotInScope(Collection<String> updatableList) {
        regINS(CK_NINS, cTL(updatableList), xgetCValueUpdatable(), "UPDATABLE");
    }

    protected void regUpdatable(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdatable(), "UPDATABLE"); }
    protected abstract ConditionValue xgetCValueUpdatable();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1 The value of attribute1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_Equal(String attribute1) {
        doSetAttribute1_Equal(fRES(attribute1));
    }

    protected void doSetAttribute1_Equal(String attribute1) {
        regAttribute1(CK_EQ, attribute1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1 The value of attribute1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_NotEqual(String attribute1) {
        doSetAttribute1_NotEqual(fRES(attribute1));
    }

    protected void doSetAttribute1_NotEqual(String attribute1) {
        regAttribute1(CK_NES, attribute1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1 The value of attribute1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_GreaterThan(String attribute1) {
        regAttribute1(CK_GT, fRES(attribute1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1 The value of attribute1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_LessThan(String attribute1) {
        regAttribute1(CK_LT, fRES(attribute1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1 The value of attribute1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_GreaterEqual(String attribute1) {
        regAttribute1(CK_GE, fRES(attribute1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1 The value of attribute1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_LessEqual(String attribute1) {
        regAttribute1(CK_LE, fRES(attribute1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1List The collection of attribute1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_InScope(Collection<String> attribute1List) {
        doSetAttribute1_InScope(attribute1List);
    }

    protected void doSetAttribute1_InScope(Collection<String> attribute1List) {
        regINS(CK_INS, cTL(attribute1List), xgetCValueAttribute1(), "ATTRIBUTE1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1List The collection of attribute1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_NotInScope(Collection<String> attribute1List) {
        doSetAttribute1_NotInScope(attribute1List);
    }

    protected void doSetAttribute1_NotInScope(Collection<String> attribute1List) {
        regINS(CK_NINS, cTL(attribute1List), xgetCValueAttribute1(), "ATTRIBUTE1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE1: {varchar(100)} <br>
     * <pre>e.g. setAttribute1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param attribute1 The value of attribute1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAttribute1_LikeSearch(String attribute1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(attribute1), xgetCValueAttribute1(), "ATTRIBUTE1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1 The value of attribute1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAttribute1_NotLikeSearch(String attribute1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(attribute1), xgetCValueAttribute1(), "ATTRIBUTE1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1 The value of attribute1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_PrefixSearch(String attribute1) {
        setAttribute1_LikeSearch(attribute1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     */
    public void setAttribute1_IsNull() { regAttribute1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     */
    public void setAttribute1_IsNullOrEmpty() { regAttribute1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     */
    public void setAttribute1_IsNotNull() { regAttribute1(CK_ISNN, DOBJ); }

    protected void regAttribute1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAttribute1(), "ATTRIBUTE1"); }
    protected abstract ConditionValue xgetCValueAttribute1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2 The value of attribute2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_Equal(String attribute2) {
        doSetAttribute2_Equal(fRES(attribute2));
    }

    protected void doSetAttribute2_Equal(String attribute2) {
        regAttribute2(CK_EQ, attribute2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2 The value of attribute2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_NotEqual(String attribute2) {
        doSetAttribute2_NotEqual(fRES(attribute2));
    }

    protected void doSetAttribute2_NotEqual(String attribute2) {
        regAttribute2(CK_NES, attribute2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2 The value of attribute2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_GreaterThan(String attribute2) {
        regAttribute2(CK_GT, fRES(attribute2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2 The value of attribute2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_LessThan(String attribute2) {
        regAttribute2(CK_LT, fRES(attribute2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2 The value of attribute2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_GreaterEqual(String attribute2) {
        regAttribute2(CK_GE, fRES(attribute2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2 The value of attribute2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_LessEqual(String attribute2) {
        regAttribute2(CK_LE, fRES(attribute2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2List The collection of attribute2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_InScope(Collection<String> attribute2List) {
        doSetAttribute2_InScope(attribute2List);
    }

    protected void doSetAttribute2_InScope(Collection<String> attribute2List) {
        regINS(CK_INS, cTL(attribute2List), xgetCValueAttribute2(), "ATTRIBUTE2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2List The collection of attribute2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_NotInScope(Collection<String> attribute2List) {
        doSetAttribute2_NotInScope(attribute2List);
    }

    protected void doSetAttribute2_NotInScope(Collection<String> attribute2List) {
        regINS(CK_NINS, cTL(attribute2List), xgetCValueAttribute2(), "ATTRIBUTE2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE2: {varchar(100)} <br>
     * <pre>e.g. setAttribute2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param attribute2 The value of attribute2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAttribute2_LikeSearch(String attribute2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(attribute2), xgetCValueAttribute2(), "ATTRIBUTE2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2 The value of attribute2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAttribute2_NotLikeSearch(String attribute2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(attribute2), xgetCValueAttribute2(), "ATTRIBUTE2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2 The value of attribute2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_PrefixSearch(String attribute2) {
        setAttribute2_LikeSearch(attribute2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     */
    public void setAttribute2_IsNull() { regAttribute2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     */
    public void setAttribute2_IsNullOrEmpty() { regAttribute2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     */
    public void setAttribute2_IsNotNull() { regAttribute2(CK_ISNN, DOBJ); }

    protected void regAttribute2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAttribute2(), "ATTRIBUTE2"); }
    protected abstract ConditionValue xgetCValueAttribute2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3 The value of attribute3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_Equal(String attribute3) {
        doSetAttribute3_Equal(fRES(attribute3));
    }

    protected void doSetAttribute3_Equal(String attribute3) {
        regAttribute3(CK_EQ, attribute3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3 The value of attribute3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_NotEqual(String attribute3) {
        doSetAttribute3_NotEqual(fRES(attribute3));
    }

    protected void doSetAttribute3_NotEqual(String attribute3) {
        regAttribute3(CK_NES, attribute3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3 The value of attribute3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_GreaterThan(String attribute3) {
        regAttribute3(CK_GT, fRES(attribute3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3 The value of attribute3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_LessThan(String attribute3) {
        regAttribute3(CK_LT, fRES(attribute3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3 The value of attribute3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_GreaterEqual(String attribute3) {
        regAttribute3(CK_GE, fRES(attribute3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3 The value of attribute3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_LessEqual(String attribute3) {
        regAttribute3(CK_LE, fRES(attribute3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3List The collection of attribute3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_InScope(Collection<String> attribute3List) {
        doSetAttribute3_InScope(attribute3List);
    }

    protected void doSetAttribute3_InScope(Collection<String> attribute3List) {
        regINS(CK_INS, cTL(attribute3List), xgetCValueAttribute3(), "ATTRIBUTE3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3List The collection of attribute3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_NotInScope(Collection<String> attribute3List) {
        doSetAttribute3_NotInScope(attribute3List);
    }

    protected void doSetAttribute3_NotInScope(Collection<String> attribute3List) {
        regINS(CK_NINS, cTL(attribute3List), xgetCValueAttribute3(), "ATTRIBUTE3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE3: {varchar(100)} <br>
     * <pre>e.g. setAttribute3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param attribute3 The value of attribute3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAttribute3_LikeSearch(String attribute3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(attribute3), xgetCValueAttribute3(), "ATTRIBUTE3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3 The value of attribute3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAttribute3_NotLikeSearch(String attribute3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(attribute3), xgetCValueAttribute3(), "ATTRIBUTE3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3 The value of attribute3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_PrefixSearch(String attribute3) {
        setAttribute3_LikeSearch(attribute3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     */
    public void setAttribute3_IsNull() { regAttribute3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     */
    public void setAttribute3_IsNullOrEmpty() { regAttribute3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     */
    public void setAttribute3_IsNotNull() { regAttribute3(CK_ISNN, DOBJ); }

    protected void regAttribute3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAttribute3(), "ATTRIBUTE3"); }
    protected abstract ConditionValue xgetCValueAttribute3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4 The value of attribute4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_Equal(String attribute4) {
        doSetAttribute4_Equal(fRES(attribute4));
    }

    protected void doSetAttribute4_Equal(String attribute4) {
        regAttribute4(CK_EQ, attribute4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4 The value of attribute4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_NotEqual(String attribute4) {
        doSetAttribute4_NotEqual(fRES(attribute4));
    }

    protected void doSetAttribute4_NotEqual(String attribute4) {
        regAttribute4(CK_NES, attribute4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4 The value of attribute4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_GreaterThan(String attribute4) {
        regAttribute4(CK_GT, fRES(attribute4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4 The value of attribute4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_LessThan(String attribute4) {
        regAttribute4(CK_LT, fRES(attribute4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4 The value of attribute4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_GreaterEqual(String attribute4) {
        regAttribute4(CK_GE, fRES(attribute4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4 The value of attribute4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_LessEqual(String attribute4) {
        regAttribute4(CK_LE, fRES(attribute4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4List The collection of attribute4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_InScope(Collection<String> attribute4List) {
        doSetAttribute4_InScope(attribute4List);
    }

    protected void doSetAttribute4_InScope(Collection<String> attribute4List) {
        regINS(CK_INS, cTL(attribute4List), xgetCValueAttribute4(), "ATTRIBUTE4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4List The collection of attribute4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_NotInScope(Collection<String> attribute4List) {
        doSetAttribute4_NotInScope(attribute4List);
    }

    protected void doSetAttribute4_NotInScope(Collection<String> attribute4List) {
        regINS(CK_NINS, cTL(attribute4List), xgetCValueAttribute4(), "ATTRIBUTE4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE4: {varchar(100)} <br>
     * <pre>e.g. setAttribute4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param attribute4 The value of attribute4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAttribute4_LikeSearch(String attribute4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(attribute4), xgetCValueAttribute4(), "ATTRIBUTE4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4 The value of attribute4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAttribute4_NotLikeSearch(String attribute4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(attribute4), xgetCValueAttribute4(), "ATTRIBUTE4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4 The value of attribute4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_PrefixSearch(String attribute4) {
        setAttribute4_LikeSearch(attribute4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     */
    public void setAttribute4_IsNull() { regAttribute4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     */
    public void setAttribute4_IsNullOrEmpty() { regAttribute4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     */
    public void setAttribute4_IsNotNull() { regAttribute4(CK_ISNN, DOBJ); }

    protected void regAttribute4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAttribute4(), "ATTRIBUTE4"); }
    protected abstract ConditionValue xgetCValueAttribute4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5 The value of attribute5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_Equal(String attribute5) {
        doSetAttribute5_Equal(fRES(attribute5));
    }

    protected void doSetAttribute5_Equal(String attribute5) {
        regAttribute5(CK_EQ, attribute5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5 The value of attribute5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_NotEqual(String attribute5) {
        doSetAttribute5_NotEqual(fRES(attribute5));
    }

    protected void doSetAttribute5_NotEqual(String attribute5) {
        regAttribute5(CK_NES, attribute5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5 The value of attribute5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_GreaterThan(String attribute5) {
        regAttribute5(CK_GT, fRES(attribute5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5 The value of attribute5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_LessThan(String attribute5) {
        regAttribute5(CK_LT, fRES(attribute5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5 The value of attribute5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_GreaterEqual(String attribute5) {
        regAttribute5(CK_GE, fRES(attribute5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5 The value of attribute5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_LessEqual(String attribute5) {
        regAttribute5(CK_LE, fRES(attribute5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5List The collection of attribute5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_InScope(Collection<String> attribute5List) {
        doSetAttribute5_InScope(attribute5List);
    }

    protected void doSetAttribute5_InScope(Collection<String> attribute5List) {
        regINS(CK_INS, cTL(attribute5List), xgetCValueAttribute5(), "ATTRIBUTE5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5List The collection of attribute5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_NotInScope(Collection<String> attribute5List) {
        doSetAttribute5_NotInScope(attribute5List);
    }

    protected void doSetAttribute5_NotInScope(Collection<String> attribute5List) {
        regINS(CK_NINS, cTL(attribute5List), xgetCValueAttribute5(), "ATTRIBUTE5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE5: {varchar(100)} <br>
     * <pre>e.g. setAttribute5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param attribute5 The value of attribute5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAttribute5_LikeSearch(String attribute5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(attribute5), xgetCValueAttribute5(), "ATTRIBUTE5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5 The value of attribute5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAttribute5_NotLikeSearch(String attribute5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(attribute5), xgetCValueAttribute5(), "ATTRIBUTE5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5 The value of attribute5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_PrefixSearch(String attribute5) {
        setAttribute5_LikeSearch(attribute5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     */
    public void setAttribute5_IsNull() { regAttribute5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     */
    public void setAttribute5_IsNullOrEmpty() { regAttribute5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     */
    public void setAttribute5_IsNotNull() { regAttribute5(CK_ISNN, DOBJ); }

    protected void regAttribute5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAttribute5(), "ATTRIBUTE5"); }
    protected abstract ConditionValue xgetCValueAttribute5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg}
     * @param autoPrintTargetFlg The value of autoPrintTargetFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoPrintTargetFlg_Equal(String autoPrintTargetFlg) {
        doSetAutoPrintTargetFlg_Equal(fRES(autoPrintTargetFlg));
    }

    /**
     * Equal(=). As AutoPrintTargetFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg} <br>
     * 自動印刷対象フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAutoPrintTargetFlg_Equal_AsAutoPrintTargetFlg(CDef.AutoPrintTargetFlg cdef) {
        doSetAutoPrintTargetFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 自動印刷対象外
     */
    public void setAutoPrintTargetFlg_Equal_$0() {
        setAutoPrintTargetFlg_Equal_AsAutoPrintTargetFlg(CDef.AutoPrintTargetFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 自動印刷対象
     */
    public void setAutoPrintTargetFlg_Equal_$1() {
        setAutoPrintTargetFlg_Equal_AsAutoPrintTargetFlg(CDef.AutoPrintTargetFlg.$1);
    }

    protected void doSetAutoPrintTargetFlg_Equal(String autoPrintTargetFlg) {
        regAutoPrintTargetFlg(CK_EQ, autoPrintTargetFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg}
     * @param autoPrintTargetFlg The value of autoPrintTargetFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoPrintTargetFlg_NotEqual(String autoPrintTargetFlg) {
        doSetAutoPrintTargetFlg_NotEqual(fRES(autoPrintTargetFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As AutoPrintTargetFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg} <br>
     * 自動印刷対象フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAutoPrintTargetFlg_NotEqual_AsAutoPrintTargetFlg(CDef.AutoPrintTargetFlg cdef) {
        doSetAutoPrintTargetFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 自動印刷対象外
     */
    public void setAutoPrintTargetFlg_NotEqual_$0() {
        setAutoPrintTargetFlg_NotEqual_AsAutoPrintTargetFlg(CDef.AutoPrintTargetFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 自動印刷対象
     */
    public void setAutoPrintTargetFlg_NotEqual_$1() {
        setAutoPrintTargetFlg_NotEqual_AsAutoPrintTargetFlg(CDef.AutoPrintTargetFlg.$1);
    }

    protected void doSetAutoPrintTargetFlg_NotEqual(String autoPrintTargetFlg) {
        regAutoPrintTargetFlg(CK_NES, autoPrintTargetFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg}
     * @param autoPrintTargetFlgList The collection of autoPrintTargetFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoPrintTargetFlg_InScope(Collection<String> autoPrintTargetFlgList) {
        doSetAutoPrintTargetFlg_InScope(autoPrintTargetFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As AutoPrintTargetFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg} <br>
     * 自動印刷対象フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoPrintTargetFlg_InScope_AsAutoPrintTargetFlg(Collection<CDef.AutoPrintTargetFlg> cdefList) {
        doSetAutoPrintTargetFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetAutoPrintTargetFlg_InScope(Collection<String> autoPrintTargetFlgList) {
        regINS(CK_INS, cTL(autoPrintTargetFlgList), xgetCValueAutoPrintTargetFlg(), "AUTO_PRINT_TARGET_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg}
     * @param autoPrintTargetFlgList The collection of autoPrintTargetFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoPrintTargetFlg_NotInScope(Collection<String> autoPrintTargetFlgList) {
        doSetAutoPrintTargetFlg_NotInScope(autoPrintTargetFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As AutoPrintTargetFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg} <br>
     * 自動印刷対象フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAutoPrintTargetFlg_NotInScope_AsAutoPrintTargetFlg(Collection<CDef.AutoPrintTargetFlg> cdefList) {
        doSetAutoPrintTargetFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetAutoPrintTargetFlg_NotInScope(Collection<String> autoPrintTargetFlgList) {
        regINS(CK_NINS, cTL(autoPrintTargetFlgList), xgetCValueAutoPrintTargetFlg(), "AUTO_PRINT_TARGET_FLG");
    }

    protected void regAutoPrintTargetFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAutoPrintTargetFlg(), "AUTO_PRINT_TARGET_FLG"); }
    protected abstract ConditionValue xgetCValueAutoPrintTargetFlg();

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
    public HpSLCFunction<PReportLayoutCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PReportLayoutCB.class);
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
    public HpSLCFunction<PReportLayoutCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PReportLayoutCB.class);
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
    public HpSLCFunction<PReportLayoutCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PReportLayoutCB.class);
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
    public HpSLCFunction<PReportLayoutCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PReportLayoutCB.class);
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
    public HpSLCFunction<PReportLayoutCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PReportLayoutCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PReportLayoutCB&gt;() {
     *     public void query(PReportLayoutCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PReportLayoutCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PReportLayoutCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PReportLayoutCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PReportLayoutCQ sq);

    protected PReportLayoutCB xcreateScalarConditionCB() {
        PReportLayoutCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PReportLayoutCB xcreateScalarConditionPartitionByCB() {
        PReportLayoutCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PReportLayoutCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PReportLayoutCB cb = new PReportLayoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "REPORT_LAYOUT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PReportLayoutCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PReportLayoutCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PReportLayoutCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PReportLayoutCB cb = new PReportLayoutCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REPORT_LAYOUT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PReportLayoutCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PReportLayoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PReportLayoutCB cb = new PReportLayoutCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PReportLayoutCQ sq);

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
    protected PReportLayoutCB newMyCB() {
        return new PReportLayoutCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PReportLayoutCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
