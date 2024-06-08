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
 * The abstract condition-query of P_PRINT_REQUEST.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPPrintRequestCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPPrintRequestCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "P_PRINT_REQUEST";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestId The value of printRequestId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_GreaterThan(Long printRequestId) {
        regPrintRequestId(CK_GT, printRequestId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestId The value of printRequestId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_LessThan(Long printRequestId) {
        regPrintRequestId(CK_LT, printRequestId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestId The value of printRequestId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_GreaterEqual(Long printRequestId) {
        regPrintRequestId(CK_GE, printRequestId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestId The value of printRequestId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintRequestId_LessEqual(Long printRequestId) {
        regPrintRequestId(CK_LE, printRequestId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of printRequestId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printRequestId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintRequestId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintRequestId(), "PRINT_REQUEST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param printRequestIdList The collection of printRequestId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintRequestId_NotInScope(Collection<Long> printRequestIdList) {
        doSetPrintRequestId_NotInScope(printRequestIdList);
    }

    protected void doSetPrintRequestId_NotInScope(Collection<Long> printRequestIdList) {
        regINS(CK_NINS, cTL(printRequestIdList), xgetCValuePrintRequestId(), "PRINT_REQUEST_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRINT_REQUEST_ID from P_PRINT_QUEUE where ...)} <br>
     * P_PRINT_QUEUE by PRINT_REQUEST_ID, named 'PPrintQueueAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPPrintQueueList</span>(queueCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     queueCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PPrintQueueList for 'exists'. (NotNull)
     */
    public void existsPPrintQueueList(SubQuery<PPrintQueueCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrintQueueCB cb = new PPrintQueueCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrintRequestId_ExistsReferrer_PPrintQueueList(cb.query());
        registerExistsReferrer(cb.query(), "PRINT_REQUEST_ID", "PRINT_REQUEST_ID", pp, "pPrintQueueList");
    }
    public abstract String keepPrintRequestId_ExistsReferrer_PPrintQueueList(PPrintQueueCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRINT_REQUEST_ID from P_PRINT_REQUEST_BINARY where ...)} <br>
     * P_PRINT_REQUEST_BINARY by PRINT_REQUEST_ID, named 'PPrintRequestBinaryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPPrintRequestBinaryList</span>(binaryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     binaryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PPrintRequestBinaryList for 'exists'. (NotNull)
     */
    public void existsPPrintRequestBinaryList(SubQuery<PPrintRequestBinaryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrintRequestBinaryCB cb = new PPrintRequestBinaryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrintRequestId_ExistsReferrer_PPrintRequestBinaryList(cb.query());
        registerExistsReferrer(cb.query(), "PRINT_REQUEST_ID", "PRINT_REQUEST_ID", pp, "pPrintRequestBinaryList");
    }
    public abstract String keepPrintRequestId_ExistsReferrer_PPrintRequestBinaryList(PPrintRequestBinaryCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRINT_REQUEST_ID from P_PRINT_REQUEST_DATA where ...)} <br>
     * P_PRINT_REQUEST_DATA by PRINT_REQUEST_ID, named 'PPrintRequestDataAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPPrintRequestDataAsOne</span>(dataCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dataCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PPrintRequestDataAsOne for 'exists'. (NotNull)
     */
    public void existsPPrintRequestDataAsOne(SubQuery<PPrintRequestDataCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrintRequestDataCB cb = new PPrintRequestDataCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrintRequestId_ExistsReferrer_PPrintRequestDataAsOne(cb.query());
        registerExistsReferrer(cb.query(), "PRINT_REQUEST_ID", "PRINT_REQUEST_ID", pp, "pPrintRequestDataAsOne");
    }
    public abstract String keepPrintRequestId_ExistsReferrer_PPrintRequestDataAsOne(PPrintRequestDataCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRINT_REQUEST_ID from P_PRINT_REQUEST_HIST where ...)} <br>
     * P_PRINT_REQUEST_HIST by PRINT_REQUEST_ID, named 'PPrintRequestHistAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPPrintRequestHistList</span>(histCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     histCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PPrintRequestHistList for 'exists'. (NotNull)
     */
    public void existsPPrintRequestHistList(SubQuery<PPrintRequestHistCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrintRequestHistCB cb = new PPrintRequestHistCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrintRequestId_ExistsReferrer_PPrintRequestHistList(cb.query());
        registerExistsReferrer(cb.query(), "PRINT_REQUEST_ID", "PRINT_REQUEST_ID", pp, "pPrintRequestHistList");
    }
    public abstract String keepPrintRequestId_ExistsReferrer_PPrintRequestHistList(PPrintRequestHistCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRINT_REQUEST_ID from P_PRINT_QUEUE where ...)} <br>
     * P_PRINT_QUEUE by PRINT_REQUEST_ID, named 'PPrintQueueAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPPrintQueueList</span>(queueCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     queueCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PrintRequestId_NotExistsReferrer_PPrintQueueList for 'not exists'. (NotNull)
     */
    public void notExistsPPrintQueueList(SubQuery<PPrintQueueCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrintQueueCB cb = new PPrintQueueCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrintRequestId_NotExistsReferrer_PPrintQueueList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRINT_REQUEST_ID", "PRINT_REQUEST_ID", pp, "pPrintQueueList");
    }
    public abstract String keepPrintRequestId_NotExistsReferrer_PPrintQueueList(PPrintQueueCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRINT_REQUEST_ID from P_PRINT_REQUEST_BINARY where ...)} <br>
     * P_PRINT_REQUEST_BINARY by PRINT_REQUEST_ID, named 'PPrintRequestBinaryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPPrintRequestBinaryList</span>(binaryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     binaryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PrintRequestId_NotExistsReferrer_PPrintRequestBinaryList for 'not exists'. (NotNull)
     */
    public void notExistsPPrintRequestBinaryList(SubQuery<PPrintRequestBinaryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrintRequestBinaryCB cb = new PPrintRequestBinaryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrintRequestId_NotExistsReferrer_PPrintRequestBinaryList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRINT_REQUEST_ID", "PRINT_REQUEST_ID", pp, "pPrintRequestBinaryList");
    }
    public abstract String keepPrintRequestId_NotExistsReferrer_PPrintRequestBinaryList(PPrintRequestBinaryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRINT_REQUEST_ID from P_PRINT_REQUEST_DATA where ...)} <br>
     * P_PRINT_REQUEST_DATA by PRINT_REQUEST_ID, named 'PPrintRequestDataAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPPrintRequestDataAsOne</span>(dataCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dataCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PrintRequestId_NotExistsReferrer_PPrintRequestDataAsOne for 'not exists'. (NotNull)
     */
    public void notExistsPPrintRequestDataAsOne(SubQuery<PPrintRequestDataCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrintRequestDataCB cb = new PPrintRequestDataCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrintRequestId_NotExistsReferrer_PPrintRequestDataAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "PRINT_REQUEST_ID", "PRINT_REQUEST_ID", pp, "pPrintRequestDataAsOne");
    }
    public abstract String keepPrintRequestId_NotExistsReferrer_PPrintRequestDataAsOne(PPrintRequestDataCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRINT_REQUEST_ID from P_PRINT_REQUEST_HIST where ...)} <br>
     * P_PRINT_REQUEST_HIST by PRINT_REQUEST_ID, named 'PPrintRequestHistAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPPrintRequestHistList</span>(histCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     histCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PrintRequestId_NotExistsReferrer_PPrintRequestHistList for 'not exists'. (NotNull)
     */
    public void notExistsPPrintRequestHistList(SubQuery<PPrintRequestHistCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrintRequestHistCB cb = new PPrintRequestHistCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPrintRequestId_NotExistsReferrer_PPrintRequestHistList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRINT_REQUEST_ID", "PRINT_REQUEST_ID", pp, "pPrintRequestHistList");
    }
    public abstract String keepPrintRequestId_NotExistsReferrer_PPrintRequestHistList(PPrintRequestHistCQ sq);

    public void xsderivePPrintQueueList(String fn, SubQuery<PPrintQueueCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintQueueCB cb = new PPrintQueueCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPrintRequestId_SpecifyDerivedReferrer_PPrintQueueList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRINT_REQUEST_ID", "PRINT_REQUEST_ID", pp, "pPrintQueueList", al, op);
    }
    public abstract String keepPrintRequestId_SpecifyDerivedReferrer_PPrintQueueList(PPrintQueueCQ sq);

    public void xsderivePPrintRequestBinaryList(String fn, SubQuery<PPrintRequestBinaryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintRequestBinaryCB cb = new PPrintRequestBinaryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPrintRequestId_SpecifyDerivedReferrer_PPrintRequestBinaryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRINT_REQUEST_ID", "PRINT_REQUEST_ID", pp, "pPrintRequestBinaryList", al, op);
    }
    public abstract String keepPrintRequestId_SpecifyDerivedReferrer_PPrintRequestBinaryList(PPrintRequestBinaryCQ sq);

    public void xsderivePPrintRequestHistList(String fn, SubQuery<PPrintRequestHistCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintRequestHistCB cb = new PPrintRequestHistCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPrintRequestId_SpecifyDerivedReferrer_PPrintRequestHistList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRINT_REQUEST_ID", "PRINT_REQUEST_ID", pp, "pPrintRequestHistList", al, op);
    }
    public abstract String keepPrintRequestId_SpecifyDerivedReferrer_PPrintRequestHistList(PPrintRequestHistCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from P_PRINT_QUEUE where ...)} <br>
     * P_PRINT_QUEUE by PRINT_REQUEST_ID, named 'PPrintQueueAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPPrintQueueList()</span>.<span style="color: #CC4747">max</span>(queueCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     queueCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     queueCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PPrintQueueCB> derivedPPrintQueueList() {
        return xcreateQDRFunctionPPrintQueueList();
    }
    protected HpQDRFunction<PPrintQueueCB> xcreateQDRFunctionPPrintQueueList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePPrintQueueList(fn, sq, rd, vl, op));
    }
    public void xqderivePPrintQueueList(String fn, SubQuery<PPrintQueueCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintQueueCB cb = new PPrintQueueCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPrintRequestId_QueryDerivedReferrer_PPrintQueueList(cb.query()); String prpp = keepPrintRequestId_QueryDerivedReferrer_PPrintQueueListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRINT_REQUEST_ID", "PRINT_REQUEST_ID", sqpp, "pPrintQueueList", rd, vl, prpp, op);
    }
    public abstract String keepPrintRequestId_QueryDerivedReferrer_PPrintQueueList(PPrintQueueCQ sq);
    public abstract String keepPrintRequestId_QueryDerivedReferrer_PPrintQueueListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from P_PRINT_REQUEST_BINARY where ...)} <br>
     * P_PRINT_REQUEST_BINARY by PRINT_REQUEST_ID, named 'PPrintRequestBinaryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPPrintRequestBinaryList()</span>.<span style="color: #CC4747">max</span>(binaryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     binaryCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     binaryCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PPrintRequestBinaryCB> derivedPPrintRequestBinaryList() {
        return xcreateQDRFunctionPPrintRequestBinaryList();
    }
    protected HpQDRFunction<PPrintRequestBinaryCB> xcreateQDRFunctionPPrintRequestBinaryList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePPrintRequestBinaryList(fn, sq, rd, vl, op));
    }
    public void xqderivePPrintRequestBinaryList(String fn, SubQuery<PPrintRequestBinaryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintRequestBinaryCB cb = new PPrintRequestBinaryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPrintRequestId_QueryDerivedReferrer_PPrintRequestBinaryList(cb.query()); String prpp = keepPrintRequestId_QueryDerivedReferrer_PPrintRequestBinaryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRINT_REQUEST_ID", "PRINT_REQUEST_ID", sqpp, "pPrintRequestBinaryList", rd, vl, prpp, op);
    }
    public abstract String keepPrintRequestId_QueryDerivedReferrer_PPrintRequestBinaryList(PPrintRequestBinaryCQ sq);
    public abstract String keepPrintRequestId_QueryDerivedReferrer_PPrintRequestBinaryListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from P_PRINT_REQUEST_HIST where ...)} <br>
     * P_PRINT_REQUEST_HIST by PRINT_REQUEST_ID, named 'PPrintRequestHistAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPPrintRequestHistList()</span>.<span style="color: #CC4747">max</span>(histCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     histCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     histCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PPrintRequestHistCB> derivedPPrintRequestHistList() {
        return xcreateQDRFunctionPPrintRequestHistList();
    }
    protected HpQDRFunction<PPrintRequestHistCB> xcreateQDRFunctionPPrintRequestHistList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePPrintRequestHistList(fn, sq, rd, vl, op));
    }
    public void xqderivePPrintRequestHistList(String fn, SubQuery<PPrintRequestHistCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintRequestHistCB cb = new PPrintRequestHistCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPrintRequestId_QueryDerivedReferrer_PPrintRequestHistList(cb.query()); String prpp = keepPrintRequestId_QueryDerivedReferrer_PPrintRequestHistListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRINT_REQUEST_ID", "PRINT_REQUEST_ID", sqpp, "pPrintRequestHistList", rd, vl, prpp, op);
    }
    public abstract String keepPrintRequestId_QueryDerivedReferrer_PPrintRequestHistList(PPrintRequestHistCQ sq);
    public abstract String keepPrintRequestId_QueryDerivedReferrer_PPrintRequestHistListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPrintRequestId_IsNull() { regPrintRequestId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPrintRequestId_IsNotNull() { regPrintRequestId(CK_ISNN, DOBJ); }

    protected void regPrintRequestId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintRequestId(), "PRINT_REQUEST_ID"); }
    protected abstract ConditionValue xgetCValuePrintRequestId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_CD: {NotNull, varchar(100)}
     * @param reportCd The value of reportCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_Equal(String reportCd) {
        doSetReportCd_Equal(fRES(reportCd));
    }

    protected void doSetReportCd_Equal(String reportCd) {
        regReportCd(CK_EQ, reportCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_CD: {NotNull, varchar(100)}
     * @param reportCd The value of reportCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_NotEqual(String reportCd) {
        doSetReportCd_NotEqual(fRES(reportCd));
    }

    protected void doSetReportCd_NotEqual(String reportCd) {
        regReportCd(CK_NES, reportCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_CD: {NotNull, varchar(100)}
     * @param reportCd The value of reportCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_GreaterThan(String reportCd) {
        regReportCd(CK_GT, fRES(reportCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_CD: {NotNull, varchar(100)}
     * @param reportCd The value of reportCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_LessThan(String reportCd) {
        regReportCd(CK_LT, fRES(reportCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_CD: {NotNull, varchar(100)}
     * @param reportCd The value of reportCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_GreaterEqual(String reportCd) {
        regReportCd(CK_GE, fRES(reportCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_CD: {NotNull, varchar(100)}
     * @param reportCd The value of reportCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_LessEqual(String reportCd) {
        regReportCd(CK_LE, fRES(reportCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_CD: {NotNull, varchar(100)}
     * @param reportCdList The collection of reportCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_InScope(Collection<String> reportCdList) {
        doSetReportCd_InScope(reportCdList);
    }

    protected void doSetReportCd_InScope(Collection<String> reportCdList) {
        regINS(CK_INS, cTL(reportCdList), xgetCValueReportCd(), "REPORT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_CD: {NotNull, varchar(100)}
     * @param reportCdList The collection of reportCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_NotInScope(Collection<String> reportCdList) {
        doSetReportCd_NotInScope(reportCdList);
    }

    protected void doSetReportCd_NotInScope(Collection<String> reportCdList) {
        regINS(CK_NINS, cTL(reportCdList), xgetCValueReportCd(), "REPORT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_CD: {NotNull, varchar(100)} <br>
     * <pre>e.g. setReportCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reportCd The value of reportCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReportCd_LikeSearch(String reportCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reportCd), xgetCValueReportCd(), "REPORT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_CD: {NotNull, varchar(100)}
     * @param reportCd The value of reportCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReportCd_NotLikeSearch(String reportCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reportCd), xgetCValueReportCd(), "REPORT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_CD: {NotNull, varchar(100)}
     * @param reportCd The value of reportCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportCd_PrefixSearch(String reportCd) {
        setReportCd_LikeSearch(reportCd, xcLSOPPre());
    }

    protected void regReportCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportCd(), "REPORT_CD"); }
    protected abstract ConditionValue xgetCValueReportCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNm The value of reportNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_Equal(String reportNm) {
        doSetReportNm_Equal(fRES(reportNm));
    }

    protected void doSetReportNm_Equal(String reportNm) {
        regReportNm(CK_EQ, reportNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNm The value of reportNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_NotEqual(String reportNm) {
        doSetReportNm_NotEqual(fRES(reportNm));
    }

    protected void doSetReportNm_NotEqual(String reportNm) {
        regReportNm(CK_NES, reportNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNm The value of reportNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_GreaterThan(String reportNm) {
        regReportNm(CK_GT, fRES(reportNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNm The value of reportNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_LessThan(String reportNm) {
        regReportNm(CK_LT, fRES(reportNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNm The value of reportNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_GreaterEqual(String reportNm) {
        regReportNm(CK_GE, fRES(reportNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNm The value of reportNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_LessEqual(String reportNm) {
        regReportNm(CK_LE, fRES(reportNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNmList The collection of reportNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_InScope(Collection<String> reportNmList) {
        doSetReportNm_InScope(reportNmList);
    }

    protected void doSetReportNm_InScope(Collection<String> reportNmList) {
        regINS(CK_INS, cTL(reportNmList), xgetCValueReportNm(), "REPORT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNmList The collection of reportNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_NotInScope(Collection<String> reportNmList) {
        doSetReportNm_NotInScope(reportNmList);
    }

    protected void doSetReportNm_NotInScope(Collection<String> reportNmList) {
        regINS(CK_NINS, cTL(reportNmList), xgetCValueReportNm(), "REPORT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)} <br>
     * <pre>e.g. setReportNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reportNm The value of reportNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReportNm_LikeSearch(String reportNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reportNm), xgetCValueReportNm(), "REPORT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNm The value of reportNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReportNm_NotLikeSearch(String reportNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reportNm), xgetCValueReportNm(), "REPORT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @param reportNm The value of reportNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_PrefixSearch(String reportNm) {
        setReportNm_LikeSearch(reportNm, xcLSOPPre());
    }

    protected void regReportNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportNm(), "REPORT_NM"); }
    protected abstract ConditionValue xgetCValueReportNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_NM: {varchar(60)}
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
     * REPORT_LAYOUT_NM: {varchar(60)}
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
     * REPORT_LAYOUT_NM: {varchar(60)}
     * @param reportLayoutNm The value of reportLayoutNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutNm_GreaterThan(String reportLayoutNm) {
        regReportLayoutNm(CK_GT, fRES(reportLayoutNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_NM: {varchar(60)}
     * @param reportLayoutNm The value of reportLayoutNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutNm_LessThan(String reportLayoutNm) {
        regReportLayoutNm(CK_LT, fRES(reportLayoutNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_NM: {varchar(60)}
     * @param reportLayoutNm The value of reportLayoutNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutNm_GreaterEqual(String reportLayoutNm) {
        regReportLayoutNm(CK_GE, fRES(reportLayoutNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_NM: {varchar(60)}
     * @param reportLayoutNm The value of reportLayoutNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutNm_LessEqual(String reportLayoutNm) {
        regReportLayoutNm(CK_LE, fRES(reportLayoutNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_NM: {varchar(60)}
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
     * REPORT_LAYOUT_NM: {varchar(60)}
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
     * REPORT_LAYOUT_NM: {varchar(60)} <br>
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
     * REPORT_LAYOUT_NM: {varchar(60)}
     * @param reportLayoutNm The value of reportLayoutNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReportLayoutNm_NotLikeSearch(String reportLayoutNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reportLayoutNm), xgetCValueReportLayoutNm(), "REPORT_LAYOUT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_LAYOUT_NM: {varchar(60)}
     * @param reportLayoutNm The value of reportLayoutNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportLayoutNm_PrefixSearch(String reportLayoutNm) {
        setReportLayoutNm_LikeSearch(reportLayoutNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_NM: {varchar(60)}
     */
    public void setReportLayoutNm_IsNull() { regReportLayoutNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_NM: {varchar(60)}
     */
    public void setReportLayoutNm_IsNullOrEmpty() { regReportLayoutNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPORT_LAYOUT_NM: {varchar(60)}
     */
    public void setReportLayoutNm_IsNotNull() { regReportLayoutNm(CK_ISNN, DOBJ); }

    protected void regReportLayoutNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportLayoutNm(), "REPORT_LAYOUT_NM"); }
    protected abstract ConditionValue xgetCValueReportLayoutNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {NotNull, bigint(19)}
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
     * PRINTER_GROUP_ID: {NotNull, bigint(19)}
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
     * PRINTER_GROUP_ID: {NotNull, bigint(19)}
     * @param printerGroupId The value of printerGroupId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_GreaterThan(Long printerGroupId) {
        regPrinterGroupId(CK_GT, printerGroupId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {NotNull, bigint(19)}
     * @param printerGroupId The value of printerGroupId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_LessThan(Long printerGroupId) {
        regPrinterGroupId(CK_LT, printerGroupId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {NotNull, bigint(19)}
     * @param printerGroupId The value of printerGroupId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_GreaterEqual(Long printerGroupId) {
        regPrinterGroupId(CK_GE, printerGroupId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {NotNull, bigint(19)}
     * @param printerGroupId The value of printerGroupId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrinterGroupId_LessEqual(Long printerGroupId) {
        regPrinterGroupId(CK_LE, printerGroupId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of printerGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printerGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrinterGroupId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrinterGroupId(), "PRINTER_GROUP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP_ID: {NotNull, bigint(19)}
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
     * PRINTER_GROUP_ID: {NotNull, bigint(19)}
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
     * PRINTER_GROUP_NM: {NotNull, varchar(60)}
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
     * PRINTER_GROUP_NM: {NotNull, varchar(60)}
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
     * PRINTER_GROUP_NM: {NotNull, varchar(60)}
     * @param printerGroupNm The value of printerGroupNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupNm_GreaterThan(String printerGroupNm) {
        regPrinterGroupNm(CK_GT, fRES(printerGroupNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_NM: {NotNull, varchar(60)}
     * @param printerGroupNm The value of printerGroupNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupNm_LessThan(String printerGroupNm) {
        regPrinterGroupNm(CK_LT, fRES(printerGroupNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_NM: {NotNull, varchar(60)}
     * @param printerGroupNm The value of printerGroupNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupNm_GreaterEqual(String printerGroupNm) {
        regPrinterGroupNm(CK_GE, fRES(printerGroupNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_GROUP_NM: {NotNull, varchar(60)}
     * @param printerGroupNm The value of printerGroupNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupNm_LessEqual(String printerGroupNm) {
        regPrinterGroupNm(CK_LE, fRES(printerGroupNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP_NM: {NotNull, varchar(60)}
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
     * PRINTER_GROUP_NM: {NotNull, varchar(60)}
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
     * PRINTER_GROUP_NM: {NotNull, varchar(60)} <br>
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
     * PRINTER_GROUP_NM: {NotNull, varchar(60)}
     * @param printerGroupNm The value of printerGroupNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrinterGroupNm_NotLikeSearch(String printerGroupNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printerGroupNm), xgetCValuePrinterGroupNm(), "PRINTER_GROUP_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTER_GROUP_NM: {NotNull, varchar(60)}
     * @param printerGroupNm The value of printerGroupNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterGroupNm_PrefixSearch(String printerGroupNm) {
        setPrinterGroupNm_LikeSearch(printerGroupNm, xcLSOPPre());
    }

    protected void regPrinterGroupNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrinterGroupNm(), "PRINTER_GROUP_NM"); }
    protected abstract ConditionValue xgetCValuePrinterGroupNm();

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
     * PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus}
     * @param printStatus The value of printStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintStatus_Equal(String printStatus) {
        doSetPrintStatus_Equal(fRES(printStatus));
    }

    /**
     * Equal(=). As PrintStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus} <br>
     * 印刷ステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintStatus_Equal_AsPrintStatus(CDef.PrintStatus cdef) {
        doSetPrintStatus_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未印刷
     */
    public void setPrintStatus_Equal_$0() {
        setPrintStatus_Equal_AsPrintStatus(CDef.PrintStatus.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 印刷中
     */
    public void setPrintStatus_Equal_$1() {
        setPrintStatus_Equal_AsPrintStatus(CDef.PrintStatus.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 印刷済
     */
    public void setPrintStatus_Equal_$2() {
        setPrintStatus_Equal_AsPrintStatus(CDef.PrintStatus.$2);
    }

    /**
     * Equal(=). As $9 (9). And OnlyOnceRegistered. <br>
     * $9: 印刷失敗
     */
    public void setPrintStatus_Equal_$9() {
        setPrintStatus_Equal_AsPrintStatus(CDef.PrintStatus.$9);
    }

    protected void doSetPrintStatus_Equal(String printStatus) {
        regPrintStatus(CK_EQ, printStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus}
     * @param printStatus The value of printStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintStatus_NotEqual(String printStatus) {
        doSetPrintStatus_NotEqual(fRES(printStatus));
    }

    /**
     * NotEqual(&lt;&gt;). As PrintStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus} <br>
     * 印刷ステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintStatus_NotEqual_AsPrintStatus(CDef.PrintStatus cdef) {
        doSetPrintStatus_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未印刷
     */
    public void setPrintStatus_NotEqual_$0() {
        setPrintStatus_NotEqual_AsPrintStatus(CDef.PrintStatus.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 印刷中
     */
    public void setPrintStatus_NotEqual_$1() {
        setPrintStatus_NotEqual_AsPrintStatus(CDef.PrintStatus.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 印刷済
     */
    public void setPrintStatus_NotEqual_$2() {
        setPrintStatus_NotEqual_AsPrintStatus(CDef.PrintStatus.$2);
    }

    /**
     * NotEqual(&lt;&gt;). As $9 (9). And OnlyOnceRegistered. <br>
     * $9: 印刷失敗
     */
    public void setPrintStatus_NotEqual_$9() {
        setPrintStatus_NotEqual_AsPrintStatus(CDef.PrintStatus.$9);
    }

    protected void doSetPrintStatus_NotEqual(String printStatus) {
        regPrintStatus(CK_NES, printStatus);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus}
     * @param printStatusList The collection of printStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintStatus_InScope(Collection<String> printStatusList) {
        doSetPrintStatus_InScope(printStatusList);
    }

    /**
     * InScope {in ('a', 'b')}. As PrintStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus} <br>
     * 印刷ステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintStatus_InScope_AsPrintStatus(Collection<CDef.PrintStatus> cdefList) {
        doSetPrintStatus_InScope(cTStrL(cdefList));
    }

    protected void doSetPrintStatus_InScope(Collection<String> printStatusList) {
        regINS(CK_INS, cTL(printStatusList), xgetCValuePrintStatus(), "PRINT_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus}
     * @param printStatusList The collection of printStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintStatus_NotInScope(Collection<String> printStatusList) {
        doSetPrintStatus_NotInScope(printStatusList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PrintStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus} <br>
     * 印刷ステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintStatus_NotInScope_AsPrintStatus(Collection<CDef.PrintStatus> cdefList) {
        doSetPrintStatus_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPrintStatus_NotInScope(Collection<String> printStatusList) {
        regINS(CK_NINS, cTL(printStatusList), xgetCValuePrintStatus(), "PRINT_STATUS");
    }

    protected void regPrintStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintStatus(), "PRINT_STATUS"); }
    protected abstract ConditionValue xgetCValuePrintStatus();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_PRINT_DT: {datetime2(26, 6)}
     * @param firstPrintDt The value of firstPrintDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstPrintDt_Equal(java.sql.Timestamp firstPrintDt) {
        regFirstPrintDt(CK_EQ,  firstPrintDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_PRINT_DT: {datetime2(26, 6)}
     * @param firstPrintDt The value of firstPrintDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstPrintDt_GreaterThan(java.sql.Timestamp firstPrintDt) {
        regFirstPrintDt(CK_GT,  firstPrintDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_PRINT_DT: {datetime2(26, 6)}
     * @param firstPrintDt The value of firstPrintDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstPrintDt_LessThan(java.sql.Timestamp firstPrintDt) {
        regFirstPrintDt(CK_LT,  firstPrintDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_PRINT_DT: {datetime2(26, 6)}
     * @param firstPrintDt The value of firstPrintDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstPrintDt_GreaterEqual(java.sql.Timestamp firstPrintDt) {
        regFirstPrintDt(CK_GE,  firstPrintDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_PRINT_DT: {datetime2(26, 6)}
     * @param firstPrintDt The value of firstPrintDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstPrintDt_LessEqual(java.sql.Timestamp firstPrintDt) {
        regFirstPrintDt(CK_LE, firstPrintDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_PRINT_DT: {datetime2(26, 6)}
     * <pre>e.g. setFirstPrintDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of firstPrintDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of firstPrintDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setFirstPrintDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueFirstPrintDt(), "FIRST_PRINT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_PRINT_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of firstPrintDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of firstPrintDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setFirstPrintDt_DateFromTo(Date fromDate, Date toDate) {
        setFirstPrintDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIRST_PRINT_DT: {datetime2(26, 6)}
     */
    public void setFirstPrintDt_IsNull() { regFirstPrintDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIRST_PRINT_DT: {datetime2(26, 6)}
     */
    public void setFirstPrintDt_IsNotNull() { regFirstPrintDt(CK_ISNN, DOBJ); }

    protected void regFirstPrintDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirstPrintDt(), "FIRST_PRINT_DT"); }
    protected abstract ConditionValue xgetCValueFirstPrintDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LATEST_PRINT_DT: {datetime2(26, 6)}
     * @param latestPrintDt The value of latestPrintDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLatestPrintDt_Equal(java.sql.Timestamp latestPrintDt) {
        regLatestPrintDt(CK_EQ,  latestPrintDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LATEST_PRINT_DT: {datetime2(26, 6)}
     * @param latestPrintDt The value of latestPrintDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLatestPrintDt_GreaterThan(java.sql.Timestamp latestPrintDt) {
        regLatestPrintDt(CK_GT,  latestPrintDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LATEST_PRINT_DT: {datetime2(26, 6)}
     * @param latestPrintDt The value of latestPrintDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLatestPrintDt_LessThan(java.sql.Timestamp latestPrintDt) {
        regLatestPrintDt(CK_LT,  latestPrintDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LATEST_PRINT_DT: {datetime2(26, 6)}
     * @param latestPrintDt The value of latestPrintDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLatestPrintDt_GreaterEqual(java.sql.Timestamp latestPrintDt) {
        regLatestPrintDt(CK_GE,  latestPrintDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LATEST_PRINT_DT: {datetime2(26, 6)}
     * @param latestPrintDt The value of latestPrintDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLatestPrintDt_LessEqual(java.sql.Timestamp latestPrintDt) {
        regLatestPrintDt(CK_LE, latestPrintDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LATEST_PRINT_DT: {datetime2(26, 6)}
     * <pre>e.g. setLatestPrintDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of latestPrintDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of latestPrintDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setLatestPrintDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueLatestPrintDt(), "LATEST_PRINT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LATEST_PRINT_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of latestPrintDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of latestPrintDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setLatestPrintDt_DateFromTo(Date fromDate, Date toDate) {
        setLatestPrintDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LATEST_PRINT_DT: {datetime2(26, 6)}
     */
    public void setLatestPrintDt_IsNull() { regLatestPrintDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LATEST_PRINT_DT: {datetime2(26, 6)}
     */
    public void setLatestPrintDt_IsNotNull() { regLatestPrintDt(CK_ISNN, DOBJ); }

    protected void regLatestPrintDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLatestPrintDt(), "LATEST_PRINT_DT"); }
    protected abstract ConditionValue xgetCValueLatestPrintDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]}
     * @param printedCount The value of printedCount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintedCount_Equal(Long printedCount) {
        doSetPrintedCount_Equal(printedCount);
    }

    protected void doSetPrintedCount_Equal(Long printedCount) {
        regPrintedCount(CK_EQ, printedCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]}
     * @param printedCount The value of printedCount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintedCount_NotEqual(Long printedCount) {
        doSetPrintedCount_NotEqual(printedCount);
    }

    protected void doSetPrintedCount_NotEqual(Long printedCount) {
        regPrintedCount(CK_NES, printedCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]}
     * @param printedCount The value of printedCount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintedCount_GreaterThan(Long printedCount) {
        regPrintedCount(CK_GT, printedCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]}
     * @param printedCount The value of printedCount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintedCount_LessThan(Long printedCount) {
        regPrintedCount(CK_LT, printedCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]}
     * @param printedCount The value of printedCount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintedCount_GreaterEqual(Long printedCount) {
        regPrintedCount(CK_GE, printedCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]}
     * @param printedCount The value of printedCount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintedCount_LessEqual(Long printedCount) {
        regPrintedCount(CK_LE, printedCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of printedCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printedCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintedCount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintedCount(), "PRINTED_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]}
     * @param printedCountList The collection of printedCount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedCount_InScope(Collection<Long> printedCountList) {
        doSetPrintedCount_InScope(printedCountList);
    }

    protected void doSetPrintedCount_InScope(Collection<Long> printedCountList) {
        regINS(CK_INS, cTL(printedCountList), xgetCValuePrintedCount(), "PRINTED_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]}
     * @param printedCountList The collection of printedCount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedCount_NotInScope(Collection<Long> printedCountList) {
        doSetPrintedCount_NotInScope(printedCountList);
    }

    protected void doSetPrintedCount_NotInScope(Collection<Long> printedCountList) {
        regINS(CK_NINS, cTL(printedCountList), xgetCValuePrintedCount(), "PRINTED_COUNT");
    }

    protected void regPrintedCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintedCount(), "PRINTED_COUNT"); }
    protected abstract ConditionValue xgetCValuePrintedCount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg}
     * @param printedFlg The value of printedFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedFlg_Equal(String printedFlg) {
        doSetPrintedFlg_Equal(fRES(printedFlg));
    }

    /**
     * Equal(=). As PrintedFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg} <br>
     * 再印刷有無
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintedFlg_Equal_AsPrintedFlg(CDef.PrintedFlg cdef) {
        doSetPrintedFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 有
     */
    public void setPrintedFlg_Equal_$0() {
        setPrintedFlg_Equal_AsPrintedFlg(CDef.PrintedFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 無
     */
    public void setPrintedFlg_Equal_$1() {
        setPrintedFlg_Equal_AsPrintedFlg(CDef.PrintedFlg.$1);
    }

    protected void doSetPrintedFlg_Equal(String printedFlg) {
        regPrintedFlg(CK_EQ, printedFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg}
     * @param printedFlg The value of printedFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedFlg_NotEqual(String printedFlg) {
        doSetPrintedFlg_NotEqual(fRES(printedFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As PrintedFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg} <br>
     * 再印刷有無
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintedFlg_NotEqual_AsPrintedFlg(CDef.PrintedFlg cdef) {
        doSetPrintedFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 有
     */
    public void setPrintedFlg_NotEqual_$0() {
        setPrintedFlg_NotEqual_AsPrintedFlg(CDef.PrintedFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 無
     */
    public void setPrintedFlg_NotEqual_$1() {
        setPrintedFlg_NotEqual_AsPrintedFlg(CDef.PrintedFlg.$1);
    }

    protected void doSetPrintedFlg_NotEqual(String printedFlg) {
        regPrintedFlg(CK_NES, printedFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg}
     * @param printedFlgList The collection of printedFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedFlg_InScope(Collection<String> printedFlgList) {
        doSetPrintedFlg_InScope(printedFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As PrintedFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg} <br>
     * 再印刷有無
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedFlg_InScope_AsPrintedFlg(Collection<CDef.PrintedFlg> cdefList) {
        doSetPrintedFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetPrintedFlg_InScope(Collection<String> printedFlgList) {
        regINS(CK_INS, cTL(printedFlgList), xgetCValuePrintedFlg(), "PRINTED_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg}
     * @param printedFlgList The collection of printedFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedFlg_NotInScope(Collection<String> printedFlgList) {
        doSetPrintedFlg_NotInScope(printedFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PrintedFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg} <br>
     * 再印刷有無
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedFlg_NotInScope_AsPrintedFlg(Collection<CDef.PrintedFlg> cdefList) {
        doSetPrintedFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPrintedFlg_NotInScope(Collection<String> printedFlgList) {
        regINS(CK_NINS, cTL(printedFlgList), xgetCValuePrintedFlg(), "PRINTED_FLG");
    }

    protected void regPrintedFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintedFlg(), "PRINTED_FLG"); }
    protected abstract ConditionValue xgetCValuePrintedFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUEUE_ADD_DT: {IX, datetime2(26, 6)}
     * @param queueAddDt The value of queueAddDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQueueAddDt_Equal(java.sql.Timestamp queueAddDt) {
        regQueueAddDt(CK_EQ,  queueAddDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUEUE_ADD_DT: {IX, datetime2(26, 6)}
     * @param queueAddDt The value of queueAddDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQueueAddDt_GreaterThan(java.sql.Timestamp queueAddDt) {
        regQueueAddDt(CK_GT,  queueAddDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUEUE_ADD_DT: {IX, datetime2(26, 6)}
     * @param queueAddDt The value of queueAddDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQueueAddDt_LessThan(java.sql.Timestamp queueAddDt) {
        regQueueAddDt(CK_LT,  queueAddDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUEUE_ADD_DT: {IX, datetime2(26, 6)}
     * @param queueAddDt The value of queueAddDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQueueAddDt_GreaterEqual(java.sql.Timestamp queueAddDt) {
        regQueueAddDt(CK_GE,  queueAddDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUEUE_ADD_DT: {IX, datetime2(26, 6)}
     * @param queueAddDt The value of queueAddDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQueueAddDt_LessEqual(java.sql.Timestamp queueAddDt) {
        regQueueAddDt(CK_LE, queueAddDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QUEUE_ADD_DT: {IX, datetime2(26, 6)}
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
     * QUEUE_ADD_DT: {IX, datetime2(26, 6)}
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

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QUEUE_ADD_DT: {IX, datetime2(26, 6)}
     */
    public void setQueueAddDt_IsNull() { regQueueAddDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QUEUE_ADD_DT: {IX, datetime2(26, 6)}
     */
    public void setQueueAddDt_IsNotNull() { regQueueAddDt(CK_ISNN, DOBJ); }

    protected void regQueueAddDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQueueAddDt(), "QUEUE_ADD_DT"); }
    protected abstract ConditionValue xgetCValueQueueAddDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType}
     * @param printDataType The value of printDataType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintDataType_Equal(String printDataType) {
        doSetPrintDataType_Equal(fRES(printDataType));
    }

    /**
     * Equal(=). As PrintDataType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType} <br>
     * 印刷データタイプ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintDataType_Equal_AsPrintDataType(CDef.PrintDataType cdef) {
        doSetPrintDataType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 通常
     */
    public void setPrintDataType_Equal_$1() {
        setPrintDataType_Equal_AsPrintDataType(CDef.PrintDataType.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 保護PDF
     */
    public void setPrintDataType_Equal_$2() {
        setPrintDataType_Equal_AsPrintDataType(CDef.PrintDataType.$2);
    }

    protected void doSetPrintDataType_Equal(String printDataType) {
        regPrintDataType(CK_EQ, printDataType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType}
     * @param printDataType The value of printDataType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintDataType_NotEqual(String printDataType) {
        doSetPrintDataType_NotEqual(fRES(printDataType));
    }

    /**
     * NotEqual(&lt;&gt;). As PrintDataType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType} <br>
     * 印刷データタイプ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintDataType_NotEqual_AsPrintDataType(CDef.PrintDataType cdef) {
        doSetPrintDataType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 通常
     */
    public void setPrintDataType_NotEqual_$1() {
        setPrintDataType_NotEqual_AsPrintDataType(CDef.PrintDataType.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 保護PDF
     */
    public void setPrintDataType_NotEqual_$2() {
        setPrintDataType_NotEqual_AsPrintDataType(CDef.PrintDataType.$2);
    }

    protected void doSetPrintDataType_NotEqual(String printDataType) {
        regPrintDataType(CK_NES, printDataType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType}
     * @param printDataTypeList The collection of printDataType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintDataType_InScope(Collection<String> printDataTypeList) {
        doSetPrintDataType_InScope(printDataTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As PrintDataType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType} <br>
     * 印刷データタイプ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintDataType_InScope_AsPrintDataType(Collection<CDef.PrintDataType> cdefList) {
        doSetPrintDataType_InScope(cTStrL(cdefList));
    }

    protected void doSetPrintDataType_InScope(Collection<String> printDataTypeList) {
        regINS(CK_INS, cTL(printDataTypeList), xgetCValuePrintDataType(), "PRINT_DATA_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType}
     * @param printDataTypeList The collection of printDataType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintDataType_NotInScope(Collection<String> printDataTypeList) {
        doSetPrintDataType_NotInScope(printDataTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PrintDataType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType} <br>
     * 印刷データタイプ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintDataType_NotInScope_AsPrintDataType(Collection<CDef.PrintDataType> cdefList) {
        doSetPrintDataType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPrintDataType_NotInScope(Collection<String> printDataTypeList) {
        regINS(CK_NINS, cTL(printDataTypeList), xgetCValuePrintDataType(), "PRINT_DATA_TYPE");
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
    public HpSLCFunction<PPrintRequestCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PPrintRequestCB.class);
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
    public HpSLCFunction<PPrintRequestCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PPrintRequestCB.class);
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
    public HpSLCFunction<PPrintRequestCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PPrintRequestCB.class);
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
    public HpSLCFunction<PPrintRequestCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PPrintRequestCB.class);
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
    public HpSLCFunction<PPrintRequestCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PPrintRequestCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PPrintRequestCB&gt;() {
     *     public void query(PPrintRequestCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PPrintRequestCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PPrintRequestCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintRequestCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PPrintRequestCQ sq);

    protected PPrintRequestCB xcreateScalarConditionCB() {
        PPrintRequestCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PPrintRequestCB xcreateScalarConditionPartitionByCB() {
        PPrintRequestCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PPrintRequestCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintRequestCB cb = new PPrintRequestCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRINT_REQUEST_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PPrintRequestCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PPrintRequestCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PPrintRequestCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PPrintRequestCB cb = new PPrintRequestCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRINT_REQUEST_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PPrintRequestCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PPrintRequestCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PPrintRequestCB cb = new PPrintRequestCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PPrintRequestCQ sq);

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
    protected PPrintRequestCB newMyCB() {
        return new PPrintRequestCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PPrintRequestCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
