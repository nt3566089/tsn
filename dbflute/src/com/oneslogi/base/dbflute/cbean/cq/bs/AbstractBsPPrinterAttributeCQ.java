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
 * The abstract condition-query of P_PRINTER_ATTRIBUTE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPPrinterAttributeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPPrinterAttributeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "P_PRINTER_ATTRIBUTE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * PRINTER_ATTRIBUTE_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * PRINTER_ATTRIBUTE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printerAttributeId The value of printerAttributeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_GreaterThan(Long printerAttributeId) {
        regPrinterAttributeId(CK_GT, printerAttributeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printerAttributeId The value of printerAttributeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_LessThan(Long printerAttributeId) {
        regPrinterAttributeId(CK_LT, printerAttributeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printerAttributeId The value of printerAttributeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_GreaterEqual(Long printerAttributeId) {
        regPrinterAttributeId(CK_GE, printerAttributeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printerAttributeId The value of printerAttributeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_LessEqual(Long printerAttributeId) {
        regPrinterAttributeId(CK_LE, printerAttributeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of printerAttributeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printerAttributeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrinterAttributeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrinterAttributeId(), "PRINTER_ATTRIBUTE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * PRINTER_ATTRIBUTE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printerAttributeIdList The collection of printerAttributeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterAttributeId_NotInScope(Collection<Long> printerAttributeIdList) {
        doSetPrinterAttributeId_NotInScope(printerAttributeIdList);
    }

    protected void doSetPrinterAttributeId_NotInScope(Collection<Long> printerAttributeIdList) {
        regINS(CK_NINS, cTL(printerAttributeIdList), xgetCValuePrinterAttributeId(), "PRINTER_ATTRIBUTE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRINTER_ATTRIBUTE_ID from P_LAYOUT_PRINT_SETTING where ...)} <br>
     * P_LAYOUT_PRINT_SETTING by PRINTER_ATTRIBUTE_ID, named 'PLayoutPrintSettingAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrinterAttributeId_ExistsReferrer_PLayoutPrintSettingList(cb.query());
        registerExistsReferrer(cb.query(), "PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", pp, "pLayoutPrintSettingList");
    }
    public abstract String keepPrinterAttributeId_ExistsReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRINTER_ATTRIBUTE_ID from P_USER_AUTO_PRINT_SETTING where ...)} <br>
     * P_USER_AUTO_PRINT_SETTING by PRINTER_ATTRIBUTE_ID, named 'PUserAutoPrintSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPUserAutoPrintSettingByPrinterAttributeIdList</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PUserAutoPrintSettingByPrinterAttributeIdList for 'exists'. (NotNull)
     */
    public void existsPUserAutoPrintSettingByPrinterAttributeIdList(SubQuery<PUserAutoPrintSettingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PUserAutoPrintSettingCB cb = new PUserAutoPrintSettingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrinterAttributeId_ExistsReferrer_PUserAutoPrintSettingByPrinterAttributeIdList(cb.query());
        registerExistsReferrer(cb.query(), "PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", pp, "pUserAutoPrintSettingByPrinterAttributeIdList");
    }
    public abstract String keepPrinterAttributeId_ExistsReferrer_PUserAutoPrintSettingByPrinterAttributeIdList(PUserAutoPrintSettingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRINTER_ATTRIBUTE_ID from P_TERMINAL_AUTO_PRINT_SET where ...)} <br>
     * P_TERMINAL_AUTO_PRINT_SET by PRINTER_ATTRIBUTE_ID, named 'PTerminalAutoPrintSetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPTerminalAutoPrintSetByPrinterAttributeIdList</span>(setCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     setCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PTerminalAutoPrintSetByPrinterAttributeIdList for 'exists'. (NotNull)
     */
    public void existsPTerminalAutoPrintSetByPrinterAttributeIdList(SubQuery<PTerminalAutoPrintSetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrinterAttributeId_ExistsReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList(cb.query());
        registerExistsReferrer(cb.query(), "PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", pp, "pTerminalAutoPrintSetByPrinterAttributeIdList");
    }
    public abstract String keepPrinterAttributeId_ExistsReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList(PTerminalAutoPrintSetCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRINTER_ATTRIBUTE_ID from P_LAYOUT_PRINT_SETTING where ...)} <br>
     * P_LAYOUT_PRINT_SETTING by PRINTER_ATTRIBUTE_ID, named 'PLayoutPrintSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPLayoutPrintSettingList</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PrinterAttributeId_NotExistsReferrer_PLayoutPrintSettingList for 'not exists'. (NotNull)
     */
    public void notExistsPLayoutPrintSettingList(SubQuery<PLayoutPrintSettingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PLayoutPrintSettingCB cb = new PLayoutPrintSettingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrinterAttributeId_NotExistsReferrer_PLayoutPrintSettingList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", pp, "pLayoutPrintSettingList");
    }
    public abstract String keepPrinterAttributeId_NotExistsReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRINTER_ATTRIBUTE_ID from P_USER_AUTO_PRINT_SETTING where ...)} <br>
     * P_USER_AUTO_PRINT_SETTING by PRINTER_ATTRIBUTE_ID, named 'PUserAutoPrintSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPUserAutoPrintSettingByPrinterAttributeIdList</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PrinterAttributeId_NotExistsReferrer_PUserAutoPrintSettingByPrinterAttributeIdList for 'not exists'. (NotNull)
     */
    public void notExistsPUserAutoPrintSettingByPrinterAttributeIdList(SubQuery<PUserAutoPrintSettingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PUserAutoPrintSettingCB cb = new PUserAutoPrintSettingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrinterAttributeId_NotExistsReferrer_PUserAutoPrintSettingByPrinterAttributeIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", pp, "pUserAutoPrintSettingByPrinterAttributeIdList");
    }
    public abstract String keepPrinterAttributeId_NotExistsReferrer_PUserAutoPrintSettingByPrinterAttributeIdList(PUserAutoPrintSettingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRINTER_ATTRIBUTE_ID from P_TERMINAL_AUTO_PRINT_SET where ...)} <br>
     * P_TERMINAL_AUTO_PRINT_SET by PRINTER_ATTRIBUTE_ID, named 'PTerminalAutoPrintSetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPTerminalAutoPrintSetByPrinterAttributeIdList</span>(setCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     setCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PrinterAttributeId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList for 'not exists'. (NotNull)
     */
    public void notExistsPTerminalAutoPrintSetByPrinterAttributeIdList(SubQuery<PTerminalAutoPrintSetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrinterAttributeId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", pp, "pTerminalAutoPrintSetByPrinterAttributeIdList");
    }
    public abstract String keepPrinterAttributeId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList(PTerminalAutoPrintSetCQ sq);

    public void xsderivePLayoutPrintSettingList(String fn, SubQuery<PLayoutPrintSettingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PLayoutPrintSettingCB cb = new PLayoutPrintSettingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPrinterAttributeId_SpecifyDerivedReferrer_PLayoutPrintSettingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", pp, "pLayoutPrintSettingList", al, op);
    }
    public abstract String keepPrinterAttributeId_SpecifyDerivedReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq);

    public void xsderivePUserAutoPrintSettingByPrinterAttributeIdList(String fn, SubQuery<PUserAutoPrintSettingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PUserAutoPrintSettingCB cb = new PUserAutoPrintSettingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPrinterAttributeId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", pp, "pUserAutoPrintSettingByPrinterAttributeIdList", al, op);
    }
    public abstract String keepPrinterAttributeId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdList(PUserAutoPrintSettingCQ sq);

    public void xsderivePTerminalAutoPrintSetByPrinterAttributeIdList(String fn, SubQuery<PTerminalAutoPrintSetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPrinterAttributeId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", pp, "pTerminalAutoPrintSetByPrinterAttributeIdList", al, op);
    }
    public abstract String keepPrinterAttributeId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList(PTerminalAutoPrintSetCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from P_LAYOUT_PRINT_SETTING where ...)} <br>
     * P_LAYOUT_PRINT_SETTING by PRINTER_ATTRIBUTE_ID, named 'PLayoutPrintSettingAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepPrinterAttributeId_QueryDerivedReferrer_PLayoutPrintSettingList(cb.query()); String prpp = keepPrinterAttributeId_QueryDerivedReferrer_PLayoutPrintSettingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", sqpp, "pLayoutPrintSettingList", rd, vl, prpp, op);
    }
    public abstract String keepPrinterAttributeId_QueryDerivedReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq);
    public abstract String keepPrinterAttributeId_QueryDerivedReferrer_PLayoutPrintSettingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from P_USER_AUTO_PRINT_SETTING where ...)} <br>
     * P_USER_AUTO_PRINT_SETTING by PRINTER_ATTRIBUTE_ID, named 'PUserAutoPrintSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPUserAutoPrintSettingByPrinterAttributeIdList()</span>.<span style="color: #CC4747">max</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     settingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PUserAutoPrintSettingCB> derivedPUserAutoPrintSettingByPrinterAttributeIdList() {
        return xcreateQDRFunctionPUserAutoPrintSettingByPrinterAttributeIdList();
    }
    protected HpQDRFunction<PUserAutoPrintSettingCB> xcreateQDRFunctionPUserAutoPrintSettingByPrinterAttributeIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePUserAutoPrintSettingByPrinterAttributeIdList(fn, sq, rd, vl, op));
    }
    public void xqderivePUserAutoPrintSettingByPrinterAttributeIdList(String fn, SubQuery<PUserAutoPrintSettingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PUserAutoPrintSettingCB cb = new PUserAutoPrintSettingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPrinterAttributeId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdList(cb.query()); String prpp = keepPrinterAttributeId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", sqpp, "pUserAutoPrintSettingByPrinterAttributeIdList", rd, vl, prpp, op);
    }
    public abstract String keepPrinterAttributeId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdList(PUserAutoPrintSettingCQ sq);
    public abstract String keepPrinterAttributeId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from P_TERMINAL_AUTO_PRINT_SET where ...)} <br>
     * P_TERMINAL_AUTO_PRINT_SET by PRINTER_ATTRIBUTE_ID, named 'PTerminalAutoPrintSetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPTerminalAutoPrintSetByPrinterAttributeIdList()</span>.<span style="color: #CC4747">max</span>(setCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     setCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     setCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PTerminalAutoPrintSetCB> derivedPTerminalAutoPrintSetByPrinterAttributeIdList() {
        return xcreateQDRFunctionPTerminalAutoPrintSetByPrinterAttributeIdList();
    }
    protected HpQDRFunction<PTerminalAutoPrintSetCB> xcreateQDRFunctionPTerminalAutoPrintSetByPrinterAttributeIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePTerminalAutoPrintSetByPrinterAttributeIdList(fn, sq, rd, vl, op));
    }
    public void xqderivePTerminalAutoPrintSetByPrinterAttributeIdList(String fn, SubQuery<PTerminalAutoPrintSetCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPrinterAttributeId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList(cb.query()); String prpp = keepPrinterAttributeId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", sqpp, "pTerminalAutoPrintSetByPrinterAttributeIdList", rd, vl, prpp, op);
    }
    public abstract String keepPrinterAttributeId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList(PTerminalAutoPrintSetCQ sq);
    public abstract String keepPrinterAttributeId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPrinterAttributeId_IsNull() { regPrinterAttributeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTER_ATTRIBUTE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPrinterAttributeId_IsNotNull() { regPrinterAttributeId(CK_ISNN, DOBJ); }

    protected void regPrinterAttributeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrinterAttributeId(), "PRINTER_ATTRIBUTE_ID"); }
    protected abstract ConditionValue xgetCValuePrinterAttributeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, NotNull, bigint(19), FK to P_PRINTER}
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
     * PRINTER_ID: {IX, NotNull, bigint(19), FK to P_PRINTER}
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
     * PRINTER_ID: {IX, NotNull, bigint(19), FK to P_PRINTER}
     * @param printerId The value of printerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterId_GreaterThan(Long printerId) {
        regPrinterId(CK_GT, printerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, NotNull, bigint(19), FK to P_PRINTER}
     * @param printerId The value of printerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterId_LessThan(Long printerId) {
        regPrinterId(CK_LT, printerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, NotNull, bigint(19), FK to P_PRINTER}
     * @param printerId The value of printerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterId_GreaterEqual(Long printerId) {
        regPrinterId(CK_GE, printerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, NotNull, bigint(19), FK to P_PRINTER}
     * @param printerId The value of printerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterId_LessEqual(Long printerId) {
        regPrinterId(CK_LE, printerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_ID: {IX, NotNull, bigint(19), FK to P_PRINTER}
     * @param minNumber The min number of printerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrinterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrinterId(), "PRINTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTER_ID: {IX, NotNull, bigint(19), FK to P_PRINTER}
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
     * PRINTER_ID: {IX, NotNull, bigint(19), FK to P_PRINTER}
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

    protected void regPrinterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrinterId(), "PRINTER_ID"); }
    protected abstract ConditionValue xgetCValuePrinterId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRAY_NM: {NotNull, varchar(60)}
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
     * TRAY_NM: {NotNull, varchar(60)}
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
     * TRAY_NM: {NotNull, varchar(60)}
     * @param trayNm The value of trayNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrayNm_GreaterThan(String trayNm) {
        regTrayNm(CK_GT, fRES(trayNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRAY_NM: {NotNull, varchar(60)}
     * @param trayNm The value of trayNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrayNm_LessThan(String trayNm) {
        regTrayNm(CK_LT, fRES(trayNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRAY_NM: {NotNull, varchar(60)}
     * @param trayNm The value of trayNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrayNm_GreaterEqual(String trayNm) {
        regTrayNm(CK_GE, fRES(trayNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRAY_NM: {NotNull, varchar(60)}
     * @param trayNm The value of trayNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrayNm_LessEqual(String trayNm) {
        regTrayNm(CK_LE, fRES(trayNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRAY_NM: {NotNull, varchar(60)}
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
     * TRAY_NM: {NotNull, varchar(60)}
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
     * TRAY_NM: {NotNull, varchar(60)} <br>
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
     * TRAY_NM: {NotNull, varchar(60)}
     * @param trayNm The value of trayNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTrayNm_NotLikeSearch(String trayNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(trayNm), xgetCValueTrayNm(), "TRAY_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRAY_NM: {NotNull, varchar(60)}
     * @param trayNm The value of trayNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrayNm_PrefixSearch(String trayNm) {
        setTrayNm_LikeSearch(trayNm, xcLSOPPre());
    }

    protected void regTrayNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrayNm(), "TRAY_NM"); }
    protected abstract ConditionValue xgetCValueTrayNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible}
     * @param visible The value of visible as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_Equal(String visible) {
        doSetVisible_Equal(fRES(visible));
    }

    /**
     * Equal(=). As Visible. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setVisible_Equal_AsVisible(CDef.Visible cdef) {
        doSetVisible_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 非表示
     */
    public void setVisible_Equal_$0() {
        setVisible_Equal_AsVisible(CDef.Visible.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 表示
     */
    public void setVisible_Equal_$1() {
        setVisible_Equal_AsVisible(CDef.Visible.$1);
    }

    protected void doSetVisible_Equal(String visible) {
        regVisible(CK_EQ, visible);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible}
     * @param visible The value of visible as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_NotEqual(String visible) {
        doSetVisible_NotEqual(fRES(visible));
    }

    /**
     * NotEqual(&lt;&gt;). As Visible. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setVisible_NotEqual_AsVisible(CDef.Visible cdef) {
        doSetVisible_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 非表示
     */
    public void setVisible_NotEqual_$0() {
        setVisible_NotEqual_AsVisible(CDef.Visible.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 表示
     */
    public void setVisible_NotEqual_$1() {
        setVisible_NotEqual_AsVisible(CDef.Visible.$1);
    }

    protected void doSetVisible_NotEqual(String visible) {
        regVisible(CK_NES, visible);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible}
     * @param visibleList The collection of visible as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_InScope(Collection<String> visibleList) {
        doSetVisible_InScope(visibleList);
    }

    /**
     * InScope {in ('a', 'b')}. As Visible. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_InScope_AsVisible(Collection<CDef.Visible> cdefList) {
        doSetVisible_InScope(cTStrL(cdefList));
    }

    protected void doSetVisible_InScope(Collection<String> visibleList) {
        regINS(CK_INS, cTL(visibleList), xgetCValueVisible(), "VISIBLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible}
     * @param visibleList The collection of visible as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_NotInScope(Collection<String> visibleList) {
        doSetVisible_NotInScope(visibleList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Visible. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_NotInScope_AsVisible(Collection<CDef.Visible> cdefList) {
        doSetVisible_NotInScope(cTStrL(cdefList));
    }

    protected void doSetVisible_NotInScope(Collection<String> visibleList) {
        regINS(CK_NINS, cTL(visibleList), xgetCValueVisible(), "VISIBLE");
    }

    protected void regVisible(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVisible(), "VISIBLE"); }
    protected abstract ConditionValue xgetCValueVisible();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_TERMINAL: {varchar(60)}
     * @param addTerminal The value of addTerminal as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddTerminal_Equal(String addTerminal) {
        doSetAddTerminal_Equal(fRES(addTerminal));
    }

    protected void doSetAddTerminal_Equal(String addTerminal) {
        regAddTerminal(CK_EQ, addTerminal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_TERMINAL: {varchar(60)}
     * @param addTerminal The value of addTerminal as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddTerminal_NotEqual(String addTerminal) {
        doSetAddTerminal_NotEqual(fRES(addTerminal));
    }

    protected void doSetAddTerminal_NotEqual(String addTerminal) {
        regAddTerminal(CK_NES, addTerminal);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_TERMINAL: {varchar(60)}
     * @param addTerminal The value of addTerminal as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddTerminal_GreaterThan(String addTerminal) {
        regAddTerminal(CK_GT, fRES(addTerminal));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_TERMINAL: {varchar(60)}
     * @param addTerminal The value of addTerminal as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddTerminal_LessThan(String addTerminal) {
        regAddTerminal(CK_LT, fRES(addTerminal));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_TERMINAL: {varchar(60)}
     * @param addTerminal The value of addTerminal as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddTerminal_GreaterEqual(String addTerminal) {
        regAddTerminal(CK_GE, fRES(addTerminal));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_TERMINAL: {varchar(60)}
     * @param addTerminal The value of addTerminal as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddTerminal_LessEqual(String addTerminal) {
        regAddTerminal(CK_LE, fRES(addTerminal));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADD_TERMINAL: {varchar(60)}
     * @param addTerminalList The collection of addTerminal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddTerminal_InScope(Collection<String> addTerminalList) {
        doSetAddTerminal_InScope(addTerminalList);
    }

    protected void doSetAddTerminal_InScope(Collection<String> addTerminalList) {
        regINS(CK_INS, cTL(addTerminalList), xgetCValueAddTerminal(), "ADD_TERMINAL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADD_TERMINAL: {varchar(60)}
     * @param addTerminalList The collection of addTerminal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddTerminal_NotInScope(Collection<String> addTerminalList) {
        doSetAddTerminal_NotInScope(addTerminalList);
    }

    protected void doSetAddTerminal_NotInScope(Collection<String> addTerminalList) {
        regINS(CK_NINS, cTL(addTerminalList), xgetCValueAddTerminal(), "ADD_TERMINAL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADD_TERMINAL: {varchar(60)} <br>
     * <pre>e.g. setAddTerminal_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param addTerminal The value of addTerminal as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddTerminal_LikeSearch(String addTerminal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(addTerminal), xgetCValueAddTerminal(), "ADD_TERMINAL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADD_TERMINAL: {varchar(60)}
     * @param addTerminal The value of addTerminal as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddTerminal_NotLikeSearch(String addTerminal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(addTerminal), xgetCValueAddTerminal(), "ADD_TERMINAL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADD_TERMINAL: {varchar(60)}
     * @param addTerminal The value of addTerminal as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddTerminal_PrefixSearch(String addTerminal) {
        setAddTerminal_LikeSearch(addTerminal, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_TERMINAL: {varchar(60)}
     */
    public void setAddTerminal_IsNull() { regAddTerminal(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADD_TERMINAL: {varchar(60)}
     */
    public void setAddTerminal_IsNullOrEmpty() { regAddTerminal(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_TERMINAL: {varchar(60)}
     */
    public void setAddTerminal_IsNotNull() { regAddTerminal(CK_ISNN, DOBJ); }

    protected void regAddTerminal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddTerminal(), "ADD_TERMINAL"); }
    protected abstract ConditionValue xgetCValueAddTerminal();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TERMINAL: {varchar(60)}
     * @param updTerminal The value of updTerminal as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdTerminal_Equal(String updTerminal) {
        doSetUpdTerminal_Equal(fRES(updTerminal));
    }

    protected void doSetUpdTerminal_Equal(String updTerminal) {
        regUpdTerminal(CK_EQ, updTerminal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TERMINAL: {varchar(60)}
     * @param updTerminal The value of updTerminal as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdTerminal_NotEqual(String updTerminal) {
        doSetUpdTerminal_NotEqual(fRES(updTerminal));
    }

    protected void doSetUpdTerminal_NotEqual(String updTerminal) {
        regUpdTerminal(CK_NES, updTerminal);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TERMINAL: {varchar(60)}
     * @param updTerminal The value of updTerminal as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdTerminal_GreaterThan(String updTerminal) {
        regUpdTerminal(CK_GT, fRES(updTerminal));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TERMINAL: {varchar(60)}
     * @param updTerminal The value of updTerminal as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdTerminal_LessThan(String updTerminal) {
        regUpdTerminal(CK_LT, fRES(updTerminal));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TERMINAL: {varchar(60)}
     * @param updTerminal The value of updTerminal as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdTerminal_GreaterEqual(String updTerminal) {
        regUpdTerminal(CK_GE, fRES(updTerminal));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TERMINAL: {varchar(60)}
     * @param updTerminal The value of updTerminal as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdTerminal_LessEqual(String updTerminal) {
        regUpdTerminal(CK_LE, fRES(updTerminal));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_TERMINAL: {varchar(60)}
     * @param updTerminalList The collection of updTerminal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdTerminal_InScope(Collection<String> updTerminalList) {
        doSetUpdTerminal_InScope(updTerminalList);
    }

    protected void doSetUpdTerminal_InScope(Collection<String> updTerminalList) {
        regINS(CK_INS, cTL(updTerminalList), xgetCValueUpdTerminal(), "UPD_TERMINAL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_TERMINAL: {varchar(60)}
     * @param updTerminalList The collection of updTerminal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdTerminal_NotInScope(Collection<String> updTerminalList) {
        doSetUpdTerminal_NotInScope(updTerminalList);
    }

    protected void doSetUpdTerminal_NotInScope(Collection<String> updTerminalList) {
        regINS(CK_NINS, cTL(updTerminalList), xgetCValueUpdTerminal(), "UPD_TERMINAL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_TERMINAL: {varchar(60)} <br>
     * <pre>e.g. setUpdTerminal_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updTerminal The value of updTerminal as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdTerminal_LikeSearch(String updTerminal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updTerminal), xgetCValueUpdTerminal(), "UPD_TERMINAL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_TERMINAL: {varchar(60)}
     * @param updTerminal The value of updTerminal as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdTerminal_NotLikeSearch(String updTerminal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updTerminal), xgetCValueUpdTerminal(), "UPD_TERMINAL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_TERMINAL: {varchar(60)}
     * @param updTerminal The value of updTerminal as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdTerminal_PrefixSearch(String updTerminal) {
        setUpdTerminal_LikeSearch(updTerminal, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_TERMINAL: {varchar(60)}
     */
    public void setUpdTerminal_IsNull() { regUpdTerminal(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_TERMINAL: {varchar(60)}
     */
    public void setUpdTerminal_IsNullOrEmpty() { regUpdTerminal(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_TERMINAL: {varchar(60)}
     */
    public void setUpdTerminal_IsNotNull() { regUpdTerminal(CK_ISNN, DOBJ); }

    protected void regUpdTerminal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdTerminal(), "UPD_TERMINAL"); }
    protected abstract ConditionValue xgetCValueUpdTerminal();

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
    public HpSLCFunction<PPrinterAttributeCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PPrinterAttributeCB.class);
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
    public HpSLCFunction<PPrinterAttributeCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PPrinterAttributeCB.class);
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
    public HpSLCFunction<PPrinterAttributeCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PPrinterAttributeCB.class);
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
    public HpSLCFunction<PPrinterAttributeCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PPrinterAttributeCB.class);
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
    public HpSLCFunction<PPrinterAttributeCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PPrinterAttributeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PPrinterAttributeCB&gt;() {
     *     public void query(PPrinterAttributeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PPrinterAttributeCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PPrinterAttributeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrinterAttributeCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PPrinterAttributeCQ sq);

    protected PPrinterAttributeCB xcreateScalarConditionCB() {
        PPrinterAttributeCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PPrinterAttributeCB xcreateScalarConditionPartitionByCB() {
        PPrinterAttributeCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PPrinterAttributeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrinterAttributeCB cb = new PPrinterAttributeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRINTER_ATTRIBUTE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PPrinterAttributeCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PPrinterAttributeCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PPrinterAttributeCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrinterAttributeCB cb = new PPrinterAttributeCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRINTER_ATTRIBUTE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PPrinterAttributeCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PPrinterAttributeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrinterAttributeCB cb = new PPrinterAttributeCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PPrinterAttributeCQ sq);

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
    protected PPrinterAttributeCB newMyCB() {
        return new PPrinterAttributeCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PPrinterAttributeCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
