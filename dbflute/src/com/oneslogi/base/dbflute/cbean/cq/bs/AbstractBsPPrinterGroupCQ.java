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
 * The abstract condition-query of P_PRINTER_GROUP.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPPrinterGroupCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPPrinterGroupCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "P_PRINTER_GROUP";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * PRINTER_GROUP_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * PRINTER_GROUP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printerGroupId The value of printerGroupId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_GreaterThan(Long printerGroupId) {
        regPrinterGroupId(CK_GT, printerGroupId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printerGroupId The value of printerGroupId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_LessThan(Long printerGroupId) {
        regPrinterGroupId(CK_LT, printerGroupId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printerGroupId The value of printerGroupId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_GreaterEqual(Long printerGroupId) {
        regPrinterGroupId(CK_GE, printerGroupId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printerGroupId The value of printerGroupId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_LessEqual(Long printerGroupId) {
        regPrinterGroupId(CK_LE, printerGroupId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of printerGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printerGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrinterGroupId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * PRINTER_GROUP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printerGroupIdList The collection of printerGroupId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupId_NotInScope(Collection<Long> printerGroupIdList) {
        doSetPrinterGroupId_NotInScope(printerGroupIdList);
    }

    protected void doSetPrinterGroupId_NotInScope(Collection<Long> printerGroupIdList) {
        regINS(CK_NINS, cTL(printerGroupIdList), xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRINTER_GROUP_ID from P_LAYOUT_PRINT_SETTING where ...)} <br>
     * P_LAYOUT_PRINT_SETTING by PRINTER_GROUP_ID, named 'PLayoutPrintSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPLayoutPrintSettingList</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PLayoutPrintSettingList for 'exists'. (NotNull)
     */
    public void existsPLayoutPrintSettingList(SubQuery<PLayoutPrintSettingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PLayoutPrintSettingCB cb = new PLayoutPrintSettingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrinterGroupId_ExistsReferrer_PLayoutPrintSettingList(cb.query());
        registerExistsReferrer(cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", pp, "pLayoutPrintSettingList");
    }
    public abstract String keepPrinterGroupId_ExistsReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRINTER_GROUP_ID from P_PRINTER where ...)} <br>
     * P_PRINTER by PRINTER_GROUP_ID, named 'PPrinterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPPrinterList</span>(printerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     printerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PPrinterList for 'exists'. (NotNull)
     */
    public void existsPPrinterList(SubQuery<PPrinterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrinterCB cb = new PPrinterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrinterGroupId_ExistsReferrer_PPrinterList(cb.query());
        registerExistsReferrer(cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", pp, "pPrinterList");
    }
    public abstract String keepPrinterGroupId_ExistsReferrer_PPrinterList(PPrinterCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRINTER_GROUP_ID from P_USER_AUTO_PRINT_SETTING where ...)} <br>
     * P_USER_AUTO_PRINT_SETTING by PRINTER_GROUP_ID, named 'PUserAutoPrintSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPUserAutoPrintSettingByPrinterGroupIdList</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PUserAutoPrintSettingByPrinterGroupIdList for 'exists'. (NotNull)
     */
    public void existsPUserAutoPrintSettingByPrinterGroupIdList(SubQuery<PUserAutoPrintSettingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PUserAutoPrintSettingCB cb = new PUserAutoPrintSettingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrinterGroupId_ExistsReferrer_PUserAutoPrintSettingByPrinterGroupIdList(cb.query());
        registerExistsReferrer(cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", pp, "pUserAutoPrintSettingByPrinterGroupIdList");
    }
    public abstract String keepPrinterGroupId_ExistsReferrer_PUserAutoPrintSettingByPrinterGroupIdList(PUserAutoPrintSettingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRINTER_GROUP_ID from P_TERMINAL_AUTO_PRINT_SET where ...)} <br>
     * P_TERMINAL_AUTO_PRINT_SET by PRINTER_GROUP_ID, named 'PTerminalAutoPrintSetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPTerminalAutoPrintSetByPrinterGroupIdList</span>(setCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     setCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PTerminalAutoPrintSetByPrinterGroupIdList for 'exists'. (NotNull)
     */
    public void existsPTerminalAutoPrintSetByPrinterGroupIdList(SubQuery<PTerminalAutoPrintSetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrinterGroupId_ExistsReferrer_PTerminalAutoPrintSetByPrinterGroupIdList(cb.query());
        registerExistsReferrer(cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", pp, "pTerminalAutoPrintSetByPrinterGroupIdList");
    }
    public abstract String keepPrinterGroupId_ExistsReferrer_PTerminalAutoPrintSetByPrinterGroupIdList(PTerminalAutoPrintSetCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRINTER_GROUP_ID from P_LAYOUT_PRINT_SETTING where ...)} <br>
     * P_LAYOUT_PRINT_SETTING by PRINTER_GROUP_ID, named 'PLayoutPrintSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPLayoutPrintSettingList</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PrinterGroupId_NotExistsReferrer_PLayoutPrintSettingList for 'not exists'. (NotNull)
     */
    public void notExistsPLayoutPrintSettingList(SubQuery<PLayoutPrintSettingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PLayoutPrintSettingCB cb = new PLayoutPrintSettingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrinterGroupId_NotExistsReferrer_PLayoutPrintSettingList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", pp, "pLayoutPrintSettingList");
    }
    public abstract String keepPrinterGroupId_NotExistsReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRINTER_GROUP_ID from P_PRINTER where ...)} <br>
     * P_PRINTER by PRINTER_GROUP_ID, named 'PPrinterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPPrinterList</span>(printerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     printerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PrinterGroupId_NotExistsReferrer_PPrinterList for 'not exists'. (NotNull)
     */
    public void notExistsPPrinterList(SubQuery<PPrinterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrinterCB cb = new PPrinterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrinterGroupId_NotExistsReferrer_PPrinterList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", pp, "pPrinterList");
    }
    public abstract String keepPrinterGroupId_NotExistsReferrer_PPrinterList(PPrinterCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRINTER_GROUP_ID from P_USER_AUTO_PRINT_SETTING where ...)} <br>
     * P_USER_AUTO_PRINT_SETTING by PRINTER_GROUP_ID, named 'PUserAutoPrintSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPUserAutoPrintSettingByPrinterGroupIdList</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PrinterGroupId_NotExistsReferrer_PUserAutoPrintSettingByPrinterGroupIdList for 'not exists'. (NotNull)
     */
    public void notExistsPUserAutoPrintSettingByPrinterGroupIdList(SubQuery<PUserAutoPrintSettingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PUserAutoPrintSettingCB cb = new PUserAutoPrintSettingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrinterGroupId_NotExistsReferrer_PUserAutoPrintSettingByPrinterGroupIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", pp, "pUserAutoPrintSettingByPrinterGroupIdList");
    }
    public abstract String keepPrinterGroupId_NotExistsReferrer_PUserAutoPrintSettingByPrinterGroupIdList(PUserAutoPrintSettingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRINTER_GROUP_ID from P_TERMINAL_AUTO_PRINT_SET where ...)} <br>
     * P_TERMINAL_AUTO_PRINT_SET by PRINTER_GROUP_ID, named 'PTerminalAutoPrintSetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPTerminalAutoPrintSetByPrinterGroupIdList</span>(setCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     setCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PrinterGroupId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterGroupIdList for 'not exists'. (NotNull)
     */
    public void notExistsPTerminalAutoPrintSetByPrinterGroupIdList(SubQuery<PTerminalAutoPrintSetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrinterGroupId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterGroupIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", pp, "pTerminalAutoPrintSetByPrinterGroupIdList");
    }
    public abstract String keepPrinterGroupId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterGroupIdList(PTerminalAutoPrintSetCQ sq);

    public void xsderivePLayoutPrintSettingList(String fn, SubQuery<PLayoutPrintSettingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PLayoutPrintSettingCB cb = new PLayoutPrintSettingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPrinterGroupId_SpecifyDerivedReferrer_PLayoutPrintSettingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", pp, "pLayoutPrintSettingList", al, op);
    }
    public abstract String keepPrinterGroupId_SpecifyDerivedReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq);

    public void xsderivePPrinterList(String fn, SubQuery<PPrinterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrinterCB cb = new PPrinterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPrinterGroupId_SpecifyDerivedReferrer_PPrinterList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", pp, "pPrinterList", al, op);
    }
    public abstract String keepPrinterGroupId_SpecifyDerivedReferrer_PPrinterList(PPrinterCQ sq);

    public void xsderivePUserAutoPrintSettingByPrinterGroupIdList(String fn, SubQuery<PUserAutoPrintSettingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PUserAutoPrintSettingCB cb = new PUserAutoPrintSettingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPrinterGroupId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", pp, "pUserAutoPrintSettingByPrinterGroupIdList", al, op);
    }
    public abstract String keepPrinterGroupId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdList(PUserAutoPrintSettingCQ sq);

    public void xsderivePTerminalAutoPrintSetByPrinterGroupIdList(String fn, SubQuery<PTerminalAutoPrintSetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPrinterGroupId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", pp, "pTerminalAutoPrintSetByPrinterGroupIdList", al, op);
    }
    public abstract String keepPrinterGroupId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdList(PTerminalAutoPrintSetCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from P_LAYOUT_PRINT_SETTING where ...)} <br>
     * P_LAYOUT_PRINT_SETTING by PRINTER_GROUP_ID, named 'PLayoutPrintSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPLayoutPrintSettingList()</span>.<span style="color: #CC4747">max</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     settingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PLayoutPrintSettingCB> derivedPLayoutPrintSettingList() {
        return xcreateQDRFunctionPLayoutPrintSettingList();
    }
    protected HpQDRFunction<PLayoutPrintSettingCB> xcreateQDRFunctionPLayoutPrintSettingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePLayoutPrintSettingList(fn, sq, rd, vl, op));
    }
    public void xqderivePLayoutPrintSettingList(String fn, SubQuery<PLayoutPrintSettingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PLayoutPrintSettingCB cb = new PLayoutPrintSettingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPrinterGroupId_QueryDerivedReferrer_PLayoutPrintSettingList(cb.query()); String prpp = keepPrinterGroupId_QueryDerivedReferrer_PLayoutPrintSettingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", sqpp, "pLayoutPrintSettingList", rd, vl, prpp, op);
    }
    public abstract String keepPrinterGroupId_QueryDerivedReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq);
    public abstract String keepPrinterGroupId_QueryDerivedReferrer_PLayoutPrintSettingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from P_PRINTER where ...)} <br>
     * P_PRINTER by PRINTER_GROUP_ID, named 'PPrinterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPPrinterList()</span>.<span style="color: #CC4747">max</span>(printerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     printerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     printerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PPrinterCB> derivedPPrinterList() {
        return xcreateQDRFunctionPPrinterList();
    }
    protected HpQDRFunction<PPrinterCB> xcreateQDRFunctionPPrinterList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePPrinterList(fn, sq, rd, vl, op));
    }
    public void xqderivePPrinterList(String fn, SubQuery<PPrinterCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrinterCB cb = new PPrinterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPrinterGroupId_QueryDerivedReferrer_PPrinterList(cb.query()); String prpp = keepPrinterGroupId_QueryDerivedReferrer_PPrinterListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", sqpp, "pPrinterList", rd, vl, prpp, op);
    }
    public abstract String keepPrinterGroupId_QueryDerivedReferrer_PPrinterList(PPrinterCQ sq);
    public abstract String keepPrinterGroupId_QueryDerivedReferrer_PPrinterListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from P_USER_AUTO_PRINT_SETTING where ...)} <br>
     * P_USER_AUTO_PRINT_SETTING by PRINTER_GROUP_ID, named 'PUserAutoPrintSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPUserAutoPrintSettingByPrinterGroupIdList()</span>.<span style="color: #CC4747">max</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     settingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PUserAutoPrintSettingCB> derivedPUserAutoPrintSettingByPrinterGroupIdList() {
        return xcreateQDRFunctionPUserAutoPrintSettingByPrinterGroupIdList();
    }
    protected HpQDRFunction<PUserAutoPrintSettingCB> xcreateQDRFunctionPUserAutoPrintSettingByPrinterGroupIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePUserAutoPrintSettingByPrinterGroupIdList(fn, sq, rd, vl, op));
    }
    public void xqderivePUserAutoPrintSettingByPrinterGroupIdList(String fn, SubQuery<PUserAutoPrintSettingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PUserAutoPrintSettingCB cb = new PUserAutoPrintSettingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPrinterGroupId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdList(cb.query()); String prpp = keepPrinterGroupId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", sqpp, "pUserAutoPrintSettingByPrinterGroupIdList", rd, vl, prpp, op);
    }
    public abstract String keepPrinterGroupId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdList(PUserAutoPrintSettingCQ sq);
    public abstract String keepPrinterGroupId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from P_TERMINAL_AUTO_PRINT_SET where ...)} <br>
     * P_TERMINAL_AUTO_PRINT_SET by PRINTER_GROUP_ID, named 'PTerminalAutoPrintSetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPTerminalAutoPrintSetByPrinterGroupIdList()</span>.<span style="color: #CC4747">max</span>(setCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     setCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     setCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PTerminalAutoPrintSetCB> derivedPTerminalAutoPrintSetByPrinterGroupIdList() {
        return xcreateQDRFunctionPTerminalAutoPrintSetByPrinterGroupIdList();
    }
    protected HpQDRFunction<PTerminalAutoPrintSetCB> xcreateQDRFunctionPTerminalAutoPrintSetByPrinterGroupIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePTerminalAutoPrintSetByPrinterGroupIdList(fn, sq, rd, vl, op));
    }
    public void xqderivePTerminalAutoPrintSetByPrinterGroupIdList(String fn, SubQuery<PTerminalAutoPrintSetCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPrinterGroupId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdList(cb.query()); String prpp = keepPrinterGroupId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRINTER_GROUP_ID", "PRINTER_GROUP_ID", sqpp, "pTerminalAutoPrintSetByPrinterGroupIdList", rd, vl, prpp, op);
    }
    public abstract String keepPrinterGroupId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdList(PTerminalAutoPrintSetCQ sq);
    public abstract String keepPrinterGroupId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPrinterGroupId_IsNull() { regPrinterGroupId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPrinterGroupId_IsNotNull() { regPrinterGroupId(CK_ISNN, DOBJ); }

    protected void regPrinterGroupId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID"); }
    protected abstract ConditionValue xgetCValuePrinterGroupId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_NM: {UQ, NotNull, varchar(60)}
     * @param printerGroupNm The value of printerGroupNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupNm_Equal(String printerGroupNm) {
        doSetPrinterGroupNm_Equal(fRES(printerGroupNm));
    }

    protected void doSetPrinterGroupNm_Equal(String printerGroupNm) {
        regPrinterGroupNm(CK_EQ, printerGroupNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_NM: {UQ, NotNull, varchar(60)}
     * @param printerGroupNm The value of printerGroupNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupNm_NotEqual(String printerGroupNm) {
        doSetPrinterGroupNm_NotEqual(fRES(printerGroupNm));
    }

    protected void doSetPrinterGroupNm_NotEqual(String printerGroupNm) {
        regPrinterGroupNm(CK_NES, printerGroupNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_NM: {UQ, NotNull, varchar(60)}
     * @param printerGroupNm The value of printerGroupNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupNm_GreaterThan(String printerGroupNm) {
        regPrinterGroupNm(CK_GT, fRES(printerGroupNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_NM: {UQ, NotNull, varchar(60)}
     * @param printerGroupNm The value of printerGroupNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupNm_LessThan(String printerGroupNm) {
        regPrinterGroupNm(CK_LT, fRES(printerGroupNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_NM: {UQ, NotNull, varchar(60)}
     * @param printerGroupNm The value of printerGroupNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupNm_GreaterEqual(String printerGroupNm) {
        regPrinterGroupNm(CK_GE, fRES(printerGroupNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_NM: {UQ, NotNull, varchar(60)}
     * @param printerGroupNm The value of printerGroupNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupNm_LessEqual(String printerGroupNm) {
        regPrinterGroupNm(CK_LE, fRES(printerGroupNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP_NM: {UQ, NotNull, varchar(60)}
     * @param printerGroupNmList The collection of printerGroupNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupNm_InScope(Collection<String> printerGroupNmList) {
        doSetPrinterGroupNm_InScope(printerGroupNmList);
    }

    protected void doSetPrinterGroupNm_InScope(Collection<String> printerGroupNmList) {
        regINS(CK_INS, cTL(printerGroupNmList), xgetCValuePrinterGroupNm(), "PRINTER_GROUP_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP_NM: {UQ, NotNull, varchar(60)}
     * @param printerGroupNmList The collection of printerGroupNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupNm_NotInScope(Collection<String> printerGroupNmList) {
        doSetPrinterGroupNm_NotInScope(printerGroupNmList);
    }

    protected void doSetPrinterGroupNm_NotInScope(Collection<String> printerGroupNmList) {
        regINS(CK_NINS, cTL(printerGroupNmList), xgetCValuePrinterGroupNm(), "PRINTER_GROUP_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP_NM: {UQ, NotNull, varchar(60)} <br>
     * <pre>e.g. setPrinterGroupNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param printerGroupNm The value of printerGroupNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrinterGroupNm_LikeSearch(String printerGroupNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(printerGroupNm), xgetCValuePrinterGroupNm(), "PRINTER_GROUP_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP_NM: {UQ, NotNull, varchar(60)}
     * @param printerGroupNm The value of printerGroupNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrinterGroupNm_NotLikeSearch(String printerGroupNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printerGroupNm), xgetCValuePrinterGroupNm(), "PRINTER_GROUP_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP_NM: {UQ, NotNull, varchar(60)}
     * @param printerGroupNm The value of printerGroupNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupNm_PrefixSearch(String printerGroupNm) {
        setPrinterGroupNm_LikeSearch(printerGroupNm, xcLSOPPre());
    }

    protected void regPrinterGroupNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrinterGroupNm(), "PRINTER_GROUP_NM"); }
    protected abstract ConditionValue xgetCValuePrinterGroupNm();

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
    public HpSLCFunction<PPrinterGroupCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PPrinterGroupCB.class);
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
    public HpSLCFunction<PPrinterGroupCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PPrinterGroupCB.class);
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
    public HpSLCFunction<PPrinterGroupCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PPrinterGroupCB.class);
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
    public HpSLCFunction<PPrinterGroupCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PPrinterGroupCB.class);
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
    public HpSLCFunction<PPrinterGroupCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PPrinterGroupCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PPrinterGroupCB&gt;() {
     *     public void query(PPrinterGroupCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PPrinterGroupCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PPrinterGroupCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrinterGroupCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PPrinterGroupCQ sq);

    protected PPrinterGroupCB xcreateScalarConditionCB() {
        PPrinterGroupCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PPrinterGroupCB xcreateScalarConditionPartitionByCB() {
        PPrinterGroupCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PPrinterGroupCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrinterGroupCB cb = new PPrinterGroupCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRINTER_GROUP_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PPrinterGroupCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PPrinterGroupCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PPrinterGroupCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrinterGroupCB cb = new PPrinterGroupCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRINTER_GROUP_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PPrinterGroupCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PPrinterGroupCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrinterGroupCB cb = new PPrinterGroupCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PPrinterGroupCQ sq);

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
    protected PPrinterGroupCB newMyCB() {
        return new PPrinterGroupCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PPrinterGroupCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
