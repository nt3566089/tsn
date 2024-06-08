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
 * The abstract condition-query of T_ALLOC_INST_B.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTAllocInstBCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTAllocInstBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_ALLOC_INST_B";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param allocInstBId The value of allocInstBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_Equal(Long allocInstBId) {
        doSetAllocInstBId_Equal(allocInstBId);
    }

    protected void doSetAllocInstBId_Equal(Long allocInstBId) {
        regAllocInstBId(CK_EQ, allocInstBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param allocInstBId The value of allocInstBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_NotEqual(Long allocInstBId) {
        doSetAllocInstBId_NotEqual(allocInstBId);
    }

    protected void doSetAllocInstBId_NotEqual(Long allocInstBId) {
        regAllocInstBId(CK_NES, allocInstBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param allocInstBId The value of allocInstBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_GreaterThan(Long allocInstBId) {
        regAllocInstBId(CK_GT, allocInstBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param allocInstBId The value of allocInstBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_LessThan(Long allocInstBId) {
        regAllocInstBId(CK_LT, allocInstBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param allocInstBId The value of allocInstBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_GreaterEqual(Long allocInstBId) {
        regAllocInstBId(CK_GE, allocInstBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param allocInstBId The value of allocInstBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_LessEqual(Long allocInstBId) {
        regAllocInstBId(CK_LE, allocInstBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of allocInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocInstBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocInstBId(), "ALLOC_INST_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param allocInstBIdList The collection of allocInstBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstBId_InScope(Collection<Long> allocInstBIdList) {
        doSetAllocInstBId_InScope(allocInstBIdList);
    }

    protected void doSetAllocInstBId_InScope(Collection<Long> allocInstBIdList) {
        regINS(CK_INS, cTL(allocInstBIdList), xgetCValueAllocInstBId(), "ALLOC_INST_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param allocInstBIdList The collection of allocInstBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstBId_NotInScope(Collection<Long> allocInstBIdList) {
        doSetAllocInstBId_NotInScope(allocInstBIdList);
    }

    protected void doSetAllocInstBId_NotInScope(Collection<Long> allocInstBIdList) {
        regINS(CK_NINS, cTL(allocInstBIdList), xgetCValueAllocInstBId(), "ALLOC_INST_B_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ALLOC_INST_B_ID from T_ALLOC_LOT where ...)} <br>
     * T_ALLOC_LOT by ALLOC_INST_B_ID, named 'TAllocLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocLotAsOne</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocLotAsOne for 'exists'. (NotNull)
     */
    public void existsTAllocLotAsOne(SubQuery<TAllocLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstBId_ExistsReferrer_TAllocLotAsOne(cb.query());
        registerExistsReferrer(cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tAllocLotAsOne");
    }
    public abstract String keepAllocInstBId_ExistsReferrer_TAllocLotAsOne(TAllocLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ALLOC_INST_B_ID from T_PACKING_B where ...)} <br>
     * T_PACKING_B by ALLOC_INST_B_ID, named 'TPackingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPackingBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPackingBList for 'exists'. (NotNull)
     */
    public void existsTPackingBList(SubQuery<TPackingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingBCB cb = new TPackingBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstBId_ExistsReferrer_TPackingBList(cb.query());
        registerExistsReferrer(cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tPackingBList");
    }
    public abstract String keepAllocInstBId_ExistsReferrer_TPackingBList(TPackingBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ALLOC_INST_B_ID from T_PICKING_B where ...)} <br>
     * T_PICKING_B by ALLOC_INST_B_ID, named 'TPickingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingBList for 'exists'. (NotNull)
     */
    public void existsTPickingBList(SubQuery<TPickingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstBId_ExistsReferrer_TPickingBList(cb.query());
        registerExistsReferrer(cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tPickingBList");
    }
    public abstract String keepAllocInstBId_ExistsReferrer_TPickingBList(TPickingBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ALLOC_INST_B_ID from T_SHIPPING_INST_B where ...)} <br>
     * T_SHIPPING_INST_B by ALLOC_INST_B_ID, named 'TShippingInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstBList for 'exists'. (NotNull)
     */
    public void existsTShippingInstBList(SubQuery<TShippingInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstBId_ExistsReferrer_TShippingInstBList(cb.query());
        registerExistsReferrer(cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tShippingInstBList");
    }
    public abstract String keepAllocInstBId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ALLOC_INST_B_ID from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by ALLOC_INST_B_ID, named 'TStockInoutAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStockInoutList</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStockInoutList for 'exists'. (NotNull)
     */
    public void existsTStockInoutList(SubQuery<TStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstBId_ExistsReferrer_TStockInoutList(cb.query());
        registerExistsReferrer(cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tStockInoutList");
    }
    public abstract String keepAllocInstBId_ExistsReferrer_TStockInoutList(TStockInoutCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ALLOC_INST_B_ID from T_ALLOC_LOT where ...)} <br>
     * T_ALLOC_LOT by ALLOC_INST_B_ID, named 'TAllocLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocLotAsOne</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AllocInstBId_NotExistsReferrer_TAllocLotAsOne for 'not exists'. (NotNull)
     */
    public void notExistsTAllocLotAsOne(SubQuery<TAllocLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstBId_NotExistsReferrer_TAllocLotAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tAllocLotAsOne");
    }
    public abstract String keepAllocInstBId_NotExistsReferrer_TAllocLotAsOne(TAllocLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ALLOC_INST_B_ID from T_PACKING_B where ...)} <br>
     * T_PACKING_B by ALLOC_INST_B_ID, named 'TPackingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPackingBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AllocInstBId_NotExistsReferrer_TPackingBList for 'not exists'. (NotNull)
     */
    public void notExistsTPackingBList(SubQuery<TPackingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingBCB cb = new TPackingBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstBId_NotExistsReferrer_TPackingBList(cb.query());
        registerNotExistsReferrer(cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tPackingBList");
    }
    public abstract String keepAllocInstBId_NotExistsReferrer_TPackingBList(TPackingBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ALLOC_INST_B_ID from T_PICKING_B where ...)} <br>
     * T_PICKING_B by ALLOC_INST_B_ID, named 'TPickingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AllocInstBId_NotExistsReferrer_TPickingBList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingBList(SubQuery<TPickingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstBId_NotExistsReferrer_TPickingBList(cb.query());
        registerNotExistsReferrer(cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tPickingBList");
    }
    public abstract String keepAllocInstBId_NotExistsReferrer_TPickingBList(TPickingBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ALLOC_INST_B_ID from T_SHIPPING_INST_B where ...)} <br>
     * T_SHIPPING_INST_B by ALLOC_INST_B_ID, named 'TShippingInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AllocInstBId_NotExistsReferrer_TShippingInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstBList(SubQuery<TShippingInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstBId_NotExistsReferrer_TShippingInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tShippingInstBList");
    }
    public abstract String keepAllocInstBId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ALLOC_INST_B_ID from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by ALLOC_INST_B_ID, named 'TStockInoutAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStockInoutList</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AllocInstBId_NotExistsReferrer_TStockInoutList for 'not exists'. (NotNull)
     */
    public void notExistsTStockInoutList(SubQuery<TStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstBId_NotExistsReferrer_TStockInoutList(cb.query());
        registerNotExistsReferrer(cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tStockInoutList");
    }
    public abstract String keepAllocInstBId_NotExistsReferrer_TStockInoutList(TStockInoutCQ sq);

    public void xsderiveTPackingBList(String fn, SubQuery<TPackingBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingBCB cb = new TPackingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepAllocInstBId_SpecifyDerivedReferrer_TPackingBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tPackingBList", al, op);
    }
    public abstract String keepAllocInstBId_SpecifyDerivedReferrer_TPackingBList(TPackingBCQ sq);

    public void xsderiveTPickingBList(String fn, SubQuery<TPickingBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepAllocInstBId_SpecifyDerivedReferrer_TPickingBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tPickingBList", al, op);
    }
    public abstract String keepAllocInstBId_SpecifyDerivedReferrer_TPickingBList(TPickingBCQ sq);

    public void xsderiveTShippingInstBList(String fn, SubQuery<TShippingInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepAllocInstBId_SpecifyDerivedReferrer_TShippingInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tShippingInstBList", al, op);
    }
    public abstract String keepAllocInstBId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq);

    public void xsderiveTStockInoutList(String fn, SubQuery<TStockInoutCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepAllocInstBId_SpecifyDerivedReferrer_TStockInoutList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tStockInoutList", al, op);
    }
    public abstract String keepAllocInstBId_SpecifyDerivedReferrer_TStockInoutList(TStockInoutCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PACKING_B where ...)} <br>
     * T_PACKING_B by ALLOC_INST_B_ID, named 'TPackingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPackingBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPackingBCB> derivedTPackingBList() {
        return xcreateQDRFunctionTPackingBList();
    }
    protected HpQDRFunction<TPackingBCB> xcreateQDRFunctionTPackingBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPackingBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPackingBList(String fn, SubQuery<TPackingBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingBCB cb = new TPackingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepAllocInstBId_QueryDerivedReferrer_TPackingBList(cb.query()); String prpp = keepAllocInstBId_QueryDerivedReferrer_TPackingBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", sqpp, "tPackingBList", rd, vl, prpp, op);
    }
    public abstract String keepAllocInstBId_QueryDerivedReferrer_TPackingBList(TPackingBCQ sq);
    public abstract String keepAllocInstBId_QueryDerivedReferrer_TPackingBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PICKING_B where ...)} <br>
     * T_PICKING_B by ALLOC_INST_B_ID, named 'TPickingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingBCB> derivedTPickingBList() {
        return xcreateQDRFunctionTPickingBList();
    }
    protected HpQDRFunction<TPickingBCB> xcreateQDRFunctionTPickingBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingBList(String fn, SubQuery<TPickingBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepAllocInstBId_QueryDerivedReferrer_TPickingBList(cb.query()); String prpp = keepAllocInstBId_QueryDerivedReferrer_TPickingBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", sqpp, "tPickingBList", rd, vl, prpp, op);
    }
    public abstract String keepAllocInstBId_QueryDerivedReferrer_TPickingBList(TPickingBCQ sq);
    public abstract String keepAllocInstBId_QueryDerivedReferrer_TPickingBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_SHIPPING_INST_B where ...)} <br>
     * T_SHIPPING_INST_B by ALLOC_INST_B_ID, named 'TShippingInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingInstBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingInstBCB> derivedTShippingInstBList() {
        return xcreateQDRFunctionTShippingInstBList();
    }
    protected HpQDRFunction<TShippingInstBCB> xcreateQDRFunctionTShippingInstBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingInstBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingInstBList(String fn, SubQuery<TShippingInstBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepAllocInstBId_QueryDerivedReferrer_TShippingInstBList(cb.query()); String prpp = keepAllocInstBId_QueryDerivedReferrer_TShippingInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", sqpp, "tShippingInstBList", rd, vl, prpp, op);
    }
    public abstract String keepAllocInstBId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq);
    public abstract String keepAllocInstBId_QueryDerivedReferrer_TShippingInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by ALLOC_INST_B_ID, named 'TStockInoutAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStockInoutList()</span>.<span style="color: #CC4747">max</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inoutCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStockInoutCB> derivedTStockInoutList() {
        return xcreateQDRFunctionTStockInoutList();
    }
    protected HpQDRFunction<TStockInoutCB> xcreateQDRFunctionTStockInoutList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStockInoutList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStockInoutList(String fn, SubQuery<TStockInoutCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepAllocInstBId_QueryDerivedReferrer_TStockInoutList(cb.query()); String prpp = keepAllocInstBId_QueryDerivedReferrer_TStockInoutListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", sqpp, "tStockInoutList", rd, vl, prpp, op);
    }
    public abstract String keepAllocInstBId_QueryDerivedReferrer_TStockInoutList(TStockInoutCQ sq);
    public abstract String keepAllocInstBId_QueryDerivedReferrer_TStockInoutListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setAllocInstBId_IsNull() { regAllocInstBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setAllocInstBId_IsNotNull() { regAllocInstBId(CK_ISNN, DOBJ); }

    protected void regAllocInstBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocInstBId(), "ALLOC_INST_B_ID"); }
    protected abstract ConditionValue xgetCValueAllocInstBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, NotNull, bigint(19), FK to T_ALLOC_INST_H}
     * @param allocInstHId The value of allocInstHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_Equal(Long allocInstHId) {
        doSetAllocInstHId_Equal(allocInstHId);
    }

    protected void doSetAllocInstHId_Equal(Long allocInstHId) {
        regAllocInstHId(CK_EQ, allocInstHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, NotNull, bigint(19), FK to T_ALLOC_INST_H}
     * @param allocInstHId The value of allocInstHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_NotEqual(Long allocInstHId) {
        doSetAllocInstHId_NotEqual(allocInstHId);
    }

    protected void doSetAllocInstHId_NotEqual(Long allocInstHId) {
        regAllocInstHId(CK_NES, allocInstHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, NotNull, bigint(19), FK to T_ALLOC_INST_H}
     * @param allocInstHId The value of allocInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_GreaterThan(Long allocInstHId) {
        regAllocInstHId(CK_GT, allocInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, NotNull, bigint(19), FK to T_ALLOC_INST_H}
     * @param allocInstHId The value of allocInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_LessThan(Long allocInstHId) {
        regAllocInstHId(CK_LT, allocInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, NotNull, bigint(19), FK to T_ALLOC_INST_H}
     * @param allocInstHId The value of allocInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_GreaterEqual(Long allocInstHId) {
        regAllocInstHId(CK_GE, allocInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, NotNull, bigint(19), FK to T_ALLOC_INST_H}
     * @param allocInstHId The value of allocInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_LessEqual(Long allocInstHId) {
        regAllocInstHId(CK_LE, allocInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, NotNull, bigint(19), FK to T_ALLOC_INST_H}
     * @param minNumber The min number of allocInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocInstHId(), "ALLOC_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_H_ID: {IX, NotNull, bigint(19), FK to T_ALLOC_INST_H}
     * @param allocInstHIdList The collection of allocInstHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstHId_InScope(Collection<Long> allocInstHIdList) {
        doSetAllocInstHId_InScope(allocInstHIdList);
    }

    protected void doSetAllocInstHId_InScope(Collection<Long> allocInstHIdList) {
        regINS(CK_INS, cTL(allocInstHIdList), xgetCValueAllocInstHId(), "ALLOC_INST_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_H_ID: {IX, NotNull, bigint(19), FK to T_ALLOC_INST_H}
     * @param allocInstHIdList The collection of allocInstHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstHId_NotInScope(Collection<Long> allocInstHIdList) {
        doSetAllocInstHId_NotInScope(allocInstHIdList);
    }

    protected void doSetAllocInstHId_NotInScope(Collection<Long> allocInstHIdList) {
        regINS(CK_NINS, cTL(allocInstHIdList), xgetCValueAllocInstHId(), "ALLOC_INST_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ALLOC_INST_H_ID from T_ALLOC_INST_H where ...)} <br />
     * T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * @param subCBLambda The callback for sub-query of TAllocInstH for 'in-scope'. (NotNull)
     */
    public void inScopeTAllocInstH(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepAllocInstHId_InScopeRelation_TAllocInstH(cb.query());
        registerInScopeRelation(cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tAllocInstH", false);
    }
    public abstract String keepAllocInstHId_InScopeRelation_TAllocInstH(TAllocInstHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ALLOC_INST_H_ID from T_ALLOC_INST_H where ...)} <br />
     * T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * @param subCBLambda The callback for sub-query of TAllocInstH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTAllocInstH(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepAllocInstHId_NotInScopeRelation_TAllocInstH(cb.query());
        registerInScopeRelation(cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tAllocInstH", true);
    }
    public abstract String keepAllocInstHId_NotInScopeRelation_TAllocInstH(TAllocInstHCQ sq);

    protected void regAllocInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocInstHId(), "ALLOC_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueAllocInstHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
     * @param warehouseId The value of warehouseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_Equal(Long warehouseId) {
        doSetWarehouseId_Equal(warehouseId);
    }

    protected void doSetWarehouseId_Equal(Long warehouseId) {
        regWarehouseId(CK_EQ, warehouseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
     * @param warehouseId The value of warehouseId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_NotEqual(Long warehouseId) {
        doSetWarehouseId_NotEqual(warehouseId);
    }

    protected void doSetWarehouseId_NotEqual(Long warehouseId) {
        regWarehouseId(CK_NES, warehouseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
     * @param warehouseId The value of warehouseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_GreaterThan(Long warehouseId) {
        regWarehouseId(CK_GT, warehouseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
     * @param warehouseId The value of warehouseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_LessThan(Long warehouseId) {
        regWarehouseId(CK_LT, warehouseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
     * @param warehouseId The value of warehouseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_GreaterEqual(Long warehouseId) {
        regWarehouseId(CK_GE, warehouseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
     * @param warehouseId The value of warehouseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_LessEqual(Long warehouseId) {
        regWarehouseId(CK_LE, warehouseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
     * @param minNumber The min number of warehouseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of warehouseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWarehouseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWarehouseId(), "WAREHOUSE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
     * @param warehouseIdList The collection of warehouseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseId_InScope(Collection<Long> warehouseIdList) {
        doSetWarehouseId_InScope(warehouseIdList);
    }

    protected void doSetWarehouseId_InScope(Collection<Long> warehouseIdList) {
        regINS(CK_INS, cTL(warehouseIdList), xgetCValueWarehouseId(), "WAREHOUSE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
     * @param warehouseIdList The collection of warehouseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseId_NotInScope(Collection<Long> warehouseIdList) {
        doSetWarehouseId_NotInScope(warehouseIdList);
    }

    protected void doSetWarehouseId_NotInScope(Collection<Long> warehouseIdList) {
        regINS(CK_NINS, cTL(warehouseIdList), xgetCValueWarehouseId(), "WAREHOUSE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select WAREHOUSE_ID from M_WAREHOUSE where ...)} <br />
     * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * @param subCBLambda The callback for sub-query of MWarehouse for 'in-scope'. (NotNull)
     */
    public void inScopeMWarehouse(SubQuery<MWarehouseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWarehouseCB cb = new MWarehouseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepWarehouseId_InScopeRelation_MWarehouse(cb.query());
        registerInScopeRelation(cb.query(), "WAREHOUSE_ID", "WAREHOUSE_ID", pp, "mWarehouse", false);
    }
    public abstract String keepWarehouseId_InScopeRelation_MWarehouse(MWarehouseCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select WAREHOUSE_ID from M_WAREHOUSE where ...)} <br />
     * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * @param subCBLambda The callback for sub-query of MWarehouse for 'not in-scope'. (NotNull)
     */
    public void notInScopeMWarehouse(SubQuery<MWarehouseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWarehouseCB cb = new MWarehouseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepWarehouseId_NotInScopeRelation_MWarehouse(cb.query());
        registerInScopeRelation(cb.query(), "WAREHOUSE_ID", "WAREHOUSE_ID", pp, "mWarehouse", true);
    }
    public abstract String keepWarehouseId_NotInScopeRelation_MWarehouse(MWarehouseCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
     */
    public void setWarehouseId_IsNull() { regWarehouseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
     */
    public void setWarehouseId_IsNotNull() { regWarehouseId(CK_ISNN, DOBJ); }

    protected void regWarehouseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseId(), "WAREHOUSE_ID"); }
    protected abstract ConditionValue xgetCValueWarehouseId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_Equal(Long productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Long productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_NotEqual(Long productId) {
        doSetProductId_NotEqual(productId);
    }

    protected void doSetProductId_NotEqual(Long productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @param productIdList The collection of productId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_InScope(Collection<Long> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Long> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'in-scope'. (NotNull)
     */
    public void inScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_InScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", false);
    }
    public abstract String keepProductId_InScopeRelation_MProduct(MProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotInScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", true);
    }
    public abstract String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     */
    public void setProductId_IsNull() { regProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     */
    public void setProductId_IsNotNull() { regProductId(CK_ISNN, DOBJ); }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_Equal(Long stockTypeId) {
        doSetStockTypeId_Equal(stockTypeId);
    }

    protected void doSetStockTypeId_Equal(Long stockTypeId) {
        regStockTypeId(CK_EQ, stockTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_NotEqual(Long stockTypeId) {
        doSetStockTypeId_NotEqual(stockTypeId);
    }

    protected void doSetStockTypeId_NotEqual(Long stockTypeId) {
        regStockTypeId(CK_NES, stockTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_GreaterThan(Long stockTypeId) {
        regStockTypeId(CK_GT, stockTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_LessThan(Long stockTypeId) {
        regStockTypeId(CK_LT, stockTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_GreaterEqual(Long stockTypeId) {
        regStockTypeId(CK_GE, stockTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_LessEqual(Long stockTypeId) {
        regStockTypeId(CK_LE, stockTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param minNumber The min number of stockTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockTypeId(), "STOCK_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeIdList The collection of stockTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeId_InScope(Collection<Long> stockTypeIdList) {
        doSetStockTypeId_InScope(stockTypeIdList);
    }

    protected void doSetStockTypeId_InScope(Collection<Long> stockTypeIdList) {
        regINS(CK_INS, cTL(stockTypeIdList), xgetCValueStockTypeId(), "STOCK_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeIdList The collection of stockTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeId_NotInScope(Collection<Long> stockTypeIdList) {
        doSetStockTypeId_NotInScope(stockTypeIdList);
    }

    protected void doSetStockTypeId_NotInScope(Collection<Long> stockTypeIdList) {
        regINS(CK_NINS, cTL(stockTypeIdList), xgetCValueStockTypeId(), "STOCK_TYPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STOCK_TYPE_ID from M_STOCK_TYPE where ...)} <br />
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @param subCBLambda The callback for sub-query of MStockType for 'in-scope'. (NotNull)
     */
    public void inScopeMStockType(SubQuery<MStockTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MStockTypeCB cb = new MStockTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockTypeId_InScopeRelation_MStockType(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_TYPE_ID", "STOCK_TYPE_ID", pp, "mStockType", false);
    }
    public abstract String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STOCK_TYPE_ID from M_STOCK_TYPE where ...)} <br />
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @param subCBLambda The callback for sub-query of MStockType for 'not in-scope'. (NotNull)
     */
    public void notInScopeMStockType(SubQuery<MStockTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MStockTypeCB cb = new MStockTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockTypeId_NotInScopeRelation_MStockType(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_TYPE_ID", "STOCK_TYPE_ID", pp, "mStockType", true);
    }
    public abstract String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     */
    public void setStockTypeId_IsNull() { regStockTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     */
    public void setStockTypeId_IsNotNull() { regStockTypeId(CK_ISNN, DOBJ); }

    protected void regStockTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockTypeId(), "STOCK_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueStockTypeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @param locationId The value of locationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_Equal(Long locationId) {
        doSetLocationId_Equal(locationId);
    }

    protected void doSetLocationId_Equal(Long locationId) {
        regLocationId(CK_EQ, locationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @param locationId The value of locationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_NotEqual(Long locationId) {
        doSetLocationId_NotEqual(locationId);
    }

    protected void doSetLocationId_NotEqual(Long locationId) {
        regLocationId(CK_NES, locationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @param locationId The value of locationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterThan(Long locationId) {
        regLocationId(CK_GT, locationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @param locationId The value of locationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessThan(Long locationId) {
        regLocationId(CK_LT, locationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @param locationId The value of locationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterEqual(Long locationId) {
        regLocationId(CK_GE, locationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @param locationId The value of locationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessEqual(Long locationId) {
        regLocationId(CK_LE, locationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @param minNumber The min number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocationId(), "LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @param locationIdList The collection of locationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_InScope(Collection<Long> locationIdList) {
        doSetLocationId_InScope(locationIdList);
    }

    protected void doSetLocationId_InScope(Collection<Long> locationIdList) {
        regINS(CK_INS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @param locationIdList The collection of locationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotInScope(Collection<Long> locationIdList) {
        doSetLocationId_NotInScope(locationIdList);
    }

    protected void doSetLocationId_NotInScope(Collection<Long> locationIdList) {
        regINS(CK_NINS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LOCATION_ID from M_LOCATION where ...)} <br />
     * M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * @param subCBLambda The callback for sub-query of MLocation for 'in-scope'. (NotNull)
     */
    public void inScopeMLocation(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLocationId_InScopeRelation_MLocation(cb.query());
        registerInScopeRelation(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "mLocation", false);
    }
    public abstract String keepLocationId_InScopeRelation_MLocation(MLocationCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LOCATION_ID from M_LOCATION where ...)} <br />
     * M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * @param subCBLambda The callback for sub-query of MLocation for 'not in-scope'. (NotNull)
     */
    public void notInScopeMLocation(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLocationId_NotInScopeRelation_MLocation(cb.query());
        registerInScopeRelation(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "mLocation", true);
    }
    public abstract String keepLocationId_NotInScopeRelation_MLocation(MLocationCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     */
    public void setLocationId_IsNull() { regLocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     */
    public void setLocationId_IsNotNull() { regLocationId(CK_ISNN, DOBJ); }

    protected void regLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationId(), "LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueLocationId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_Equal(String locationCd) {
        doSetLocationCd_Equal(fRES(locationCd));
    }

    protected void doSetLocationCd_Equal(String locationCd) {
        regLocationCd(CK_EQ, locationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotEqual(String locationCd) {
        doSetLocationCd_NotEqual(fRES(locationCd));
    }

    protected void doSetLocationCd_NotEqual(String locationCd) {
        regLocationCd(CK_NES, locationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterThan(String locationCd) {
        regLocationCd(CK_GT, fRES(locationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessThan(String locationCd) {
        regLocationCd(CK_LT, fRES(locationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterEqual(String locationCd) {
        regLocationCd(CK_GE, fRES(locationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessEqual(String locationCd) {
        regLocationCd(CK_LE, fRES(locationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCdList The collection of locationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_InScope(Collection<String> locationCdList) {
        doSetLocationCd_InScope(locationCdList);
    }

    protected void doSetLocationCd_InScope(Collection<String> locationCdList) {
        regINS(CK_INS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCdList The collection of locationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotInScope(Collection<String> locationCdList) {
        doSetLocationCd_NotInScope(locationCdList);
    }

    protected void doSetLocationCd_NotInScope(Collection<String> locationCdList) {
        regINS(CK_NINS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)} <br>
     * <pre>e.g. setLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationCd The value of locationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationCd_LikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationCd_NotLikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_PrefixSearch(String locationCd) {
        setLocationCd_LikeSearch(locationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     */
    public void setLocationCd_IsNull() { regLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     */
    public void setLocationCd_IsNullOrEmpty() { regLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     */
    public void setLocationCd_IsNotNull() { regLocationCd(CK_ISNN, DOBJ); }

    protected void regLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationCd(), "LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueLocationCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param depositId The value of depositId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_Equal(Long depositId) {
        doSetDepositId_Equal(depositId);
    }

    protected void doSetDepositId_Equal(Long depositId) {
        regDepositId(CK_EQ, depositId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param depositId The value of depositId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_NotEqual(Long depositId) {
        doSetDepositId_NotEqual(depositId);
    }

    protected void doSetDepositId_NotEqual(Long depositId) {
        regDepositId(CK_NES, depositId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param depositId The value of depositId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_GreaterThan(Long depositId) {
        regDepositId(CK_GT, depositId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param depositId The value of depositId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_LessThan(Long depositId) {
        regDepositId(CK_LT, depositId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param depositId The value of depositId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_GreaterEqual(Long depositId) {
        regDepositId(CK_GE, depositId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param depositId The value of depositId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_LessEqual(Long depositId) {
        regDepositId(CK_LE, depositId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param minNumber The min number of depositId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of depositId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDepositId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDepositId(), "DEPOSIT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param depositIdList The collection of depositId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositId_InScope(Collection<Long> depositIdList) {
        doSetDepositId_InScope(depositIdList);
    }

    protected void doSetDepositId_InScope(Collection<Long> depositIdList) {
        regINS(CK_INS, cTL(depositIdList), xgetCValueDepositId(), "DEPOSIT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param depositIdList The collection of depositId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositId_NotInScope(Collection<Long> depositIdList) {
        doSetDepositId_NotInScope(depositIdList);
    }

    protected void doSetDepositId_NotInScope(Collection<Long> depositIdList) {
        regINS(CK_NINS, cTL(depositIdList), xgetCValueDepositId(), "DEPOSIT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DEPOSIT_ID from M_CUSTOMER where ...)} <br />
     * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDepositId_InScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "DEPOSIT_ID", "CUSTOMER_ID", pp, "mCustomer", false);
    }
    public abstract String keepDepositId_InScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DEPOSIT_ID from M_CUSTOMER where ...)} <br />
     * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDepositId_NotInScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "DEPOSIT_ID", "CUSTOMER_ID", pp, "mCustomer", true);
    }
    public abstract String keepDepositId_NotInScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     */
    public void setDepositId_IsNull() { regDepositId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     */
    public void setDepositId_IsNotNull() { regDepositId(CK_ISNN, DOBJ); }

    protected void regDepositId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDepositId(), "DEPOSIT_ID"); }
    protected abstract ConditionValue xgetCValueDepositId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19), FK to T_LOT}
     * @param lotId The value of lotId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_Equal(Long lotId) {
        doSetLotId_Equal(lotId);
    }

    protected void doSetLotId_Equal(Long lotId) {
        regLotId(CK_EQ, lotId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19), FK to T_LOT}
     * @param lotId The value of lotId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_NotEqual(Long lotId) {
        doSetLotId_NotEqual(lotId);
    }

    protected void doSetLotId_NotEqual(Long lotId) {
        regLotId(CK_NES, lotId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19), FK to T_LOT}
     * @param lotId The value of lotId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterThan(Long lotId) {
        regLotId(CK_GT, lotId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19), FK to T_LOT}
     * @param lotId The value of lotId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessThan(Long lotId) {
        regLotId(CK_LT, lotId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19), FK to T_LOT}
     * @param lotId The value of lotId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterEqual(Long lotId) {
        regLotId(CK_GE, lotId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19), FK to T_LOT}
     * @param lotId The value of lotId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessEqual(Long lotId) {
        regLotId(CK_LE, lotId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19), FK to T_LOT}
     * @param minNumber The min number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotId(), "LOT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {IX, bigint(19), FK to T_LOT}
     * @param lotIdList The collection of lotId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_InScope(Collection<Long> lotIdList) {
        doSetLotId_InScope(lotIdList);
    }

    protected void doSetLotId_InScope(Collection<Long> lotIdList) {
        regINS(CK_INS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {IX, bigint(19), FK to T_LOT}
     * @param lotIdList The collection of lotId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_NotInScope(Collection<Long> lotIdList) {
        doSetLotId_NotInScope(lotIdList);
    }

    protected void doSetLotId_NotInScope(Collection<Long> lotIdList) {
        regINS(CK_NINS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LOT_ID from T_LOT where ...)} <br />
     * T_LOT by my LOT_ID, named 'TLot'.
     * @param subCBLambda The callback for sub-query of TLot for 'in-scope'. (NotNull)
     */
    public void inScopeTLot(SubQuery<TLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLotCB cb = new TLotCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLotId_InScopeRelation_TLot(cb.query());
        registerInScopeRelation(cb.query(), "LOT_ID", "LOT_ID", pp, "tLot", false);
    }
    public abstract String keepLotId_InScopeRelation_TLot(TLotCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LOT_ID from T_LOT where ...)} <br />
     * T_LOT by my LOT_ID, named 'TLot'.
     * @param subCBLambda The callback for sub-query of TLot for 'not in-scope'. (NotNull)
     */
    public void notInScopeTLot(SubQuery<TLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLotCB cb = new TLotCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLotId_NotInScopeRelation_TLot(cb.query());
        registerInScopeRelation(cb.query(), "LOT_ID", "LOT_ID", pp, "tLot", true);
    }
    public abstract String keepLotId_NotInScopeRelation_TLot(TLotCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19), FK to T_LOT}
     */
    public void setLotId_IsNull() { regLotId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {IX, bigint(19), FK to T_LOT}
     */
    public void setLotId_IsNotNull() { regLotId(CK_ISNN, DOBJ); }

    protected void regLotId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotId(), "LOT_ID"); }
    protected abstract ConditionValue xgetCValueLotId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     * @param lot The value of lot as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_Equal(String lot) {
        doSetLot_Equal(fRES(lot));
    }

    protected void doSetLot_Equal(String lot) {
        regLot(CK_EQ, lot);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     * @param lot The value of lot as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_NotEqual(String lot) {
        doSetLot_NotEqual(fRES(lot));
    }

    protected void doSetLot_NotEqual(String lot) {
        regLot(CK_NES, lot);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     * @param lot The value of lot as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_GreaterThan(String lot) {
        regLot(CK_GT, fRES(lot));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     * @param lot The value of lot as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_LessThan(String lot) {
        regLot(CK_LT, fRES(lot));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     * @param lot The value of lot as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_GreaterEqual(String lot) {
        regLot(CK_GE, fRES(lot));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     * @param lot The value of lot as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_LessEqual(String lot) {
        regLot(CK_LE, fRES(lot));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT: {varchar(30)}
     * @param lotList The collection of lot as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_InScope(Collection<String> lotList) {
        doSetLot_InScope(lotList);
    }

    protected void doSetLot_InScope(Collection<String> lotList) {
        regINS(CK_INS, cTL(lotList), xgetCValueLot(), "LOT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT: {varchar(30)}
     * @param lotList The collection of lot as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_NotInScope(Collection<String> lotList) {
        doSetLot_NotInScope(lotList);
    }

    protected void doSetLot_NotInScope(Collection<String> lotList) {
        regINS(CK_NINS, cTL(lotList), xgetCValueLot(), "LOT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {varchar(30)} <br>
     * <pre>e.g. setLot_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot The value of lot as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot_LikeSearch(String lot, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot), xgetCValueLot(), "LOT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {varchar(30)}
     * @param lot The value of lot as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot_NotLikeSearch(String lot, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot), xgetCValueLot(), "LOT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {varchar(30)}
     * @param lot The value of lot as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_PrefixSearch(String lot) {
        setLot_LikeSearch(lot, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     */
    public void setLot_IsNull() { regLot(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     */
    public void setLot_IsNullOrEmpty() { regLot(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT: {varchar(30)}
     */
    public void setLot_IsNotNull() { regLot(CK_ISNN, DOBJ); }

    protected void regLot(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot(), "LOT"); }
    protected abstract ConditionValue xgetCValueLot();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDt The value of limitDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_Equal(String limitDt) {
        doSetLimitDt_Equal(fRES(limitDt));
    }

    protected void doSetLimitDt_Equal(String limitDt) {
        regLimitDt(CK_EQ, limitDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDt The value of limitDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_NotEqual(String limitDt) {
        doSetLimitDt_NotEqual(fRES(limitDt));
    }

    protected void doSetLimitDt_NotEqual(String limitDt) {
        regLimitDt(CK_NES, limitDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDt The value of limitDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_GreaterThan(String limitDt) {
        regLimitDt(CK_GT, fRES(limitDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDt The value of limitDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_LessThan(String limitDt) {
        regLimitDt(CK_LT, fRES(limitDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDt The value of limitDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_GreaterEqual(String limitDt) {
        regLimitDt(CK_GE, fRES(limitDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDt The value of limitDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_LessEqual(String limitDt) {
        regLimitDt(CK_LE, fRES(limitDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDtList The collection of limitDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_InScope(Collection<String> limitDtList) {
        doSetLimitDt_InScope(limitDtList);
    }

    protected void doSetLimitDt_InScope(Collection<String> limitDtList) {
        regINS(CK_INS, cTL(limitDtList), xgetCValueLimitDt(), "LIMIT_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDtList The collection of limitDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_NotInScope(Collection<String> limitDtList) {
        doSetLimitDt_NotInScope(limitDtList);
    }

    protected void doSetLimitDt_NotInScope(Collection<String> limitDtList) {
        regINS(CK_NINS, cTL(limitDtList), xgetCValueLimitDt(), "LIMIT_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {varchar(8)} <br>
     * <pre>e.g. setLimitDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitDt The value of limitDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitDt_LikeSearch(String limitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitDt), xgetCValueLimitDt(), "LIMIT_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDt The value of limitDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitDt_NotLikeSearch(String limitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitDt), xgetCValueLimitDt(), "LIMIT_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     * @param limitDt The value of limitDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_PrefixSearch(String limitDt) {
        setLimitDt_LikeSearch(limitDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     */
    public void setLimitDt_IsNull() { regLimitDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     */
    public void setLimitDt_IsNullOrEmpty() { regLimitDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {varchar(8)}
     */
    public void setLimitDt_IsNotNull() { regLimitDt(CK_ISNN, DOBJ); }

    protected void regLimitDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDt(), "LIMIT_DT"); }
    protected abstract ConditionValue xgetCValueLimitDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO}
     * @param storeNoId The value of storeNoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_Equal(Long storeNoId) {
        doSetStoreNoId_Equal(storeNoId);
    }

    protected void doSetStoreNoId_Equal(Long storeNoId) {
        regStoreNoId(CK_EQ, storeNoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO}
     * @param storeNoId The value of storeNoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_NotEqual(Long storeNoId) {
        doSetStoreNoId_NotEqual(storeNoId);
    }

    protected void doSetStoreNoId_NotEqual(Long storeNoId) {
        regStoreNoId(CK_NES, storeNoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO}
     * @param storeNoId The value of storeNoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_GreaterThan(Long storeNoId) {
        regStoreNoId(CK_GT, storeNoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO}
     * @param storeNoId The value of storeNoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_LessThan(Long storeNoId) {
        regStoreNoId(CK_LT, storeNoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO}
     * @param storeNoId The value of storeNoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_GreaterEqual(Long storeNoId) {
        regStoreNoId(CK_GE, storeNoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO}
     * @param storeNoId The value of storeNoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_LessEqual(Long storeNoId) {
        regStoreNoId(CK_LE, storeNoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO}
     * @param minNumber The min number of storeNoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeNoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreNoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreNoId(), "STORE_NO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO}
     * @param storeNoIdList The collection of storeNoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoId_InScope(Collection<Long> storeNoIdList) {
        doSetStoreNoId_InScope(storeNoIdList);
    }

    protected void doSetStoreNoId_InScope(Collection<Long> storeNoIdList) {
        regINS(CK_INS, cTL(storeNoIdList), xgetCValueStoreNoId(), "STORE_NO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO}
     * @param storeNoIdList The collection of storeNoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoId_NotInScope(Collection<Long> storeNoIdList) {
        doSetStoreNoId_NotInScope(storeNoIdList);
    }

    protected void doSetStoreNoId_NotInScope(Collection<Long> storeNoIdList) {
        regINS(CK_NINS, cTL(storeNoIdList), xgetCValueStoreNoId(), "STORE_NO_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STORE_NO_ID from T_STORE_NO where ...)} <br />
     * T_STORE_NO by my STORE_NO_ID, named 'TStoreNo'.
     * @param subCBLambda The callback for sub-query of TStoreNo for 'in-scope'. (NotNull)
     */
    public void inScopeTStoreNo(SubQuery<TStoreNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreNoCB cb = new TStoreNoCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStoreNoId_InScopeRelation_TStoreNo(cb.query());
        registerInScopeRelation(cb.query(), "STORE_NO_ID", "STORE_NO_ID", pp, "tStoreNo", false);
    }
    public abstract String keepStoreNoId_InScopeRelation_TStoreNo(TStoreNoCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STORE_NO_ID from T_STORE_NO where ...)} <br />
     * T_STORE_NO by my STORE_NO_ID, named 'TStoreNo'.
     * @param subCBLambda The callback for sub-query of TStoreNo for 'not in-scope'. (NotNull)
     */
    public void notInScopeTStoreNo(SubQuery<TStoreNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreNoCB cb = new TStoreNoCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStoreNoId_NotInScopeRelation_TStoreNo(cb.query());
        registerInScopeRelation(cb.query(), "STORE_NO_ID", "STORE_NO_ID", pp, "tStoreNo", true);
    }
    public abstract String keepStoreNoId_NotInScopeRelation_TStoreNo(TStoreNoCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO}
     */
    public void setStoreNoId_IsNull() { regStoreNoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO}
     */
    public void setStoreNoId_IsNotNull() { regStoreNoId(CK_ISNN, DOBJ); }

    protected void regStoreNoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreNoId(), "STORE_NO_ID"); }
    protected abstract ConditionValue xgetCValueStoreNoId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {varchar(30)}
     * @param storeLabelNo The value of storeLabelNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_Equal(String storeLabelNo) {
        doSetStoreLabelNo_Equal(fRES(storeLabelNo));
    }

    protected void doSetStoreLabelNo_Equal(String storeLabelNo) {
        regStoreLabelNo(CK_EQ, storeLabelNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {varchar(30)}
     * @param storeLabelNo The value of storeLabelNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_NotEqual(String storeLabelNo) {
        doSetStoreLabelNo_NotEqual(fRES(storeLabelNo));
    }

    protected void doSetStoreLabelNo_NotEqual(String storeLabelNo) {
        regStoreLabelNo(CK_NES, storeLabelNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {varchar(30)}
     * @param storeLabelNo The value of storeLabelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_GreaterThan(String storeLabelNo) {
        regStoreLabelNo(CK_GT, fRES(storeLabelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {varchar(30)}
     * @param storeLabelNo The value of storeLabelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_LessThan(String storeLabelNo) {
        regStoreLabelNo(CK_LT, fRES(storeLabelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {varchar(30)}
     * @param storeLabelNo The value of storeLabelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_GreaterEqual(String storeLabelNo) {
        regStoreLabelNo(CK_GE, fRES(storeLabelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {varchar(30)}
     * @param storeLabelNo The value of storeLabelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_LessEqual(String storeLabelNo) {
        regStoreLabelNo(CK_LE, fRES(storeLabelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_LABEL_NO: {varchar(30)}
     * @param storeLabelNoList The collection of storeLabelNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_InScope(Collection<String> storeLabelNoList) {
        doSetStoreLabelNo_InScope(storeLabelNoList);
    }

    protected void doSetStoreLabelNo_InScope(Collection<String> storeLabelNoList) {
        regINS(CK_INS, cTL(storeLabelNoList), xgetCValueStoreLabelNo(), "STORE_LABEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_LABEL_NO: {varchar(30)}
     * @param storeLabelNoList The collection of storeLabelNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_NotInScope(Collection<String> storeLabelNoList) {
        doSetStoreLabelNo_NotInScope(storeLabelNoList);
    }

    protected void doSetStoreLabelNo_NotInScope(Collection<String> storeLabelNoList) {
        regINS(CK_NINS, cTL(storeLabelNoList), xgetCValueStoreLabelNo(), "STORE_LABEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_LABEL_NO: {varchar(30)} <br>
     * <pre>e.g. setStoreLabelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeLabelNo The value of storeLabelNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreLabelNo_LikeSearch(String storeLabelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeLabelNo), xgetCValueStoreLabelNo(), "STORE_LABEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_LABEL_NO: {varchar(30)}
     * @param storeLabelNo The value of storeLabelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreLabelNo_NotLikeSearch(String storeLabelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeLabelNo), xgetCValueStoreLabelNo(), "STORE_LABEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_LABEL_NO: {varchar(30)}
     * @param storeLabelNo The value of storeLabelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_PrefixSearch(String storeLabelNo) {
        setStoreLabelNo_LikeSearch(storeLabelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {varchar(30)}
     */
    public void setStoreLabelNo_IsNull() { regStoreLabelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {varchar(30)}
     */
    public void setStoreLabelNo_IsNullOrEmpty() { regStoreLabelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {varchar(30)}
     */
    public void setStoreLabelNo_IsNotNull() { regStoreLabelNo(CK_ISNN, DOBJ); }

    protected void regStoreLabelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreLabelNo(), "STORE_LABEL_NO"); }
    protected abstract ConditionValue xgetCValueStoreLabelNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @param shapeId The value of shapeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_Equal(Long shapeId) {
        doSetShapeId_Equal(shapeId);
    }

    protected void doSetShapeId_Equal(Long shapeId) {
        regShapeId(CK_EQ, shapeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @param shapeId The value of shapeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_NotEqual(Long shapeId) {
        doSetShapeId_NotEqual(shapeId);
    }

    protected void doSetShapeId_NotEqual(Long shapeId) {
        regShapeId(CK_NES, shapeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @param shapeId The value of shapeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_GreaterThan(Long shapeId) {
        regShapeId(CK_GT, shapeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @param shapeId The value of shapeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_LessThan(Long shapeId) {
        regShapeId(CK_LT, shapeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @param shapeId The value of shapeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_GreaterEqual(Long shapeId) {
        regShapeId(CK_GE, shapeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @param shapeId The value of shapeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_LessEqual(Long shapeId) {
        regShapeId(CK_LE, shapeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @param minNumber The min number of shapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShapeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShapeId(), "SHAPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @param shapeIdList The collection of shapeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeId_InScope(Collection<Long> shapeIdList) {
        doSetShapeId_InScope(shapeIdList);
    }

    protected void doSetShapeId_InScope(Collection<Long> shapeIdList) {
        regINS(CK_INS, cTL(shapeIdList), xgetCValueShapeId(), "SHAPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @param shapeIdList The collection of shapeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeId_NotInScope(Collection<Long> shapeIdList) {
        doSetShapeId_NotInScope(shapeIdList);
    }

    protected void doSetShapeId_NotInScope(Collection<Long> shapeIdList) {
        regINS(CK_NINS, cTL(shapeIdList), xgetCValueShapeId(), "SHAPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHAPE_ID from M_SHAPE where ...)} <br />
     * M_SHAPE by my SHAPE_ID, named 'MShape'.
     * @param subCBLambda The callback for sub-query of MShape for 'in-scope'. (NotNull)
     */
    public void inScopeMShape(SubQuery<MShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeCB cb = new MShapeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeId_InScopeRelation_MShape(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_ID", "SHAPE_ID", pp, "mShape", false);
    }
    public abstract String keepShapeId_InScopeRelation_MShape(MShapeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHAPE_ID from M_SHAPE where ...)} <br />
     * M_SHAPE by my SHAPE_ID, named 'MShape'.
     * @param subCBLambda The callback for sub-query of MShape for 'not in-scope'. (NotNull)
     */
    public void notInScopeMShape(SubQuery<MShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeCB cb = new MShapeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeId_NotInScopeRelation_MShape(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_ID", "SHAPE_ID", pp, "mShape", true);
    }
    public abstract String keepShapeId_NotInScopeRelation_MShape(MShapeCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     */
    public void setShapeId_IsNull() { regShapeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     */
    public void setShapeId_IsNotNull() { regShapeId(CK_ISNN, DOBJ); }

    protected void regShapeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShapeId(), "SHAPE_ID"); }
    protected abstract ConditionValue xgetCValueShapeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {varchar(30)}
     * @param shapeCd The value of shapeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_Equal(String shapeCd) {
        doSetShapeCd_Equal(fRES(shapeCd));
    }

    protected void doSetShapeCd_Equal(String shapeCd) {
        regShapeCd(CK_EQ, shapeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {varchar(30)}
     * @param shapeCd The value of shapeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_NotEqual(String shapeCd) {
        doSetShapeCd_NotEqual(fRES(shapeCd));
    }

    protected void doSetShapeCd_NotEqual(String shapeCd) {
        regShapeCd(CK_NES, shapeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {varchar(30)}
     * @param shapeCd The value of shapeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_GreaterThan(String shapeCd) {
        regShapeCd(CK_GT, fRES(shapeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {varchar(30)}
     * @param shapeCd The value of shapeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_LessThan(String shapeCd) {
        regShapeCd(CK_LT, fRES(shapeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {varchar(30)}
     * @param shapeCd The value of shapeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_GreaterEqual(String shapeCd) {
        regShapeCd(CK_GE, fRES(shapeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {varchar(30)}
     * @param shapeCd The value of shapeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_LessEqual(String shapeCd) {
        regShapeCd(CK_LE, fRES(shapeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAPE_CD: {varchar(30)}
     * @param shapeCdList The collection of shapeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_InScope(Collection<String> shapeCdList) {
        doSetShapeCd_InScope(shapeCdList);
    }

    protected void doSetShapeCd_InScope(Collection<String> shapeCdList) {
        regINS(CK_INS, cTL(shapeCdList), xgetCValueShapeCd(), "SHAPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAPE_CD: {varchar(30)}
     * @param shapeCdList The collection of shapeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_NotInScope(Collection<String> shapeCdList) {
        doSetShapeCd_NotInScope(shapeCdList);
    }

    protected void doSetShapeCd_NotInScope(Collection<String> shapeCdList) {
        regINS(CK_NINS, cTL(shapeCdList), xgetCValueShapeCd(), "SHAPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAPE_CD: {varchar(30)} <br>
     * <pre>e.g. setShapeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shapeCd The value of shapeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShapeCd_LikeSearch(String shapeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shapeCd), xgetCValueShapeCd(), "SHAPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAPE_CD: {varchar(30)}
     * @param shapeCd The value of shapeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShapeCd_NotLikeSearch(String shapeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shapeCd), xgetCValueShapeCd(), "SHAPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAPE_CD: {varchar(30)}
     * @param shapeCd The value of shapeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_PrefixSearch(String shapeCd) {
        setShapeCd_LikeSearch(shapeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHAPE_CD: {varchar(30)}
     */
    public void setShapeCd_IsNull() { regShapeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHAPE_CD: {varchar(30)}
     */
    public void setShapeCd_IsNullOrEmpty() { regShapeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHAPE_CD: {varchar(30)}
     */
    public void setShapeCd_IsNotNull() { regShapeCd(CK_ISNN, DOBJ); }

    protected void regShapeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShapeCd(), "SHAPE_CD"); }
    protected abstract ConditionValue xgetCValueShapeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlg The value of limitDtReverseFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_Equal(String limitDtReverseFlg) {
        doSetLimitDtReverseFlg_Equal(fRES(limitDtReverseFlg));
    }

    /**
     * Equal(=). As LimitDtReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_Equal_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg cdef) {
        doSetLimitDtReverseFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLimitDtReverseFlg_Equal_$0() {
        setLimitDtReverseFlg_Equal_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLimitDtReverseFlg_Equal_$1() {
        setLimitDtReverseFlg_Equal_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$1);
    }

    protected void doSetLimitDtReverseFlg_Equal(String limitDtReverseFlg) {
        regLimitDtReverseFlg(CK_EQ, limitDtReverseFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlg The value of limitDtReverseFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotEqual(String limitDtReverseFlg) {
        doSetLimitDtReverseFlg_NotEqual(fRES(limitDtReverseFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LimitDtReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotEqual_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg cdef) {
        doSetLimitDtReverseFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLimitDtReverseFlg_NotEqual_$0() {
        setLimitDtReverseFlg_NotEqual_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLimitDtReverseFlg_NotEqual_$1() {
        setLimitDtReverseFlg_NotEqual_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$1);
    }

    protected void doSetLimitDtReverseFlg_NotEqual(String limitDtReverseFlg) {
        regLimitDtReverseFlg(CK_NES, limitDtReverseFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlgList The collection of limitDtReverseFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_InScope(Collection<String> limitDtReverseFlgList) {
        doSetLimitDtReverseFlg_InScope(limitDtReverseFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LimitDtReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_InScope_AsLimitDtReverseFlg(Collection<CDef.LimitDtReverseFlg> cdefList) {
        doSetLimitDtReverseFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLimitDtReverseFlg_InScope(Collection<String> limitDtReverseFlgList) {
        regINS(CK_INS, cTL(limitDtReverseFlgList), xgetCValueLimitDtReverseFlg(), "LIMIT_DT_REVERSE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlgList The collection of limitDtReverseFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotInScope(Collection<String> limitDtReverseFlgList) {
        doSetLimitDtReverseFlg_NotInScope(limitDtReverseFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LimitDtReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotInScope_AsLimitDtReverseFlg(Collection<CDef.LimitDtReverseFlg> cdefList) {
        doSetLimitDtReverseFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLimitDtReverseFlg_NotInScope(Collection<String> limitDtReverseFlgList) {
        regINS(CK_NINS, cTL(limitDtReverseFlgList), xgetCValueLimitDtReverseFlg(), "LIMIT_DT_REVERSE_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     */
    public void setLimitDtReverseFlg_IsNull() { regLimitDtReverseFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     */
    public void setLimitDtReverseFlg_IsNotNull() { regLimitDtReverseFlg(CK_ISNN, DOBJ); }

    protected void regLimitDtReverseFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDtReverseFlg(), "LIMIT_DT_REVERSE_FLG"); }
    protected abstract ConditionValue xgetCValueLimitDtReverseFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_DT: {varchar(8)}
     * @param shippingLimitDt The value of shippingLimitDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingLimitDt_Equal(String shippingLimitDt) {
        doSetShippingLimitDt_Equal(fRES(shippingLimitDt));
    }

    protected void doSetShippingLimitDt_Equal(String shippingLimitDt) {
        regShippingLimitDt(CK_EQ, shippingLimitDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_DT: {varchar(8)}
     * @param shippingLimitDt The value of shippingLimitDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingLimitDt_NotEqual(String shippingLimitDt) {
        doSetShippingLimitDt_NotEqual(fRES(shippingLimitDt));
    }

    protected void doSetShippingLimitDt_NotEqual(String shippingLimitDt) {
        regShippingLimitDt(CK_NES, shippingLimitDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_DT: {varchar(8)}
     * @param shippingLimitDt The value of shippingLimitDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingLimitDt_GreaterThan(String shippingLimitDt) {
        regShippingLimitDt(CK_GT, fRES(shippingLimitDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_DT: {varchar(8)}
     * @param shippingLimitDt The value of shippingLimitDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingLimitDt_LessThan(String shippingLimitDt) {
        regShippingLimitDt(CK_LT, fRES(shippingLimitDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_DT: {varchar(8)}
     * @param shippingLimitDt The value of shippingLimitDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingLimitDt_GreaterEqual(String shippingLimitDt) {
        regShippingLimitDt(CK_GE, fRES(shippingLimitDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_DT: {varchar(8)}
     * @param shippingLimitDt The value of shippingLimitDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingLimitDt_LessEqual(String shippingLimitDt) {
        regShippingLimitDt(CK_LE, fRES(shippingLimitDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_LIMIT_DT: {varchar(8)}
     * @param shippingLimitDtList The collection of shippingLimitDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingLimitDt_InScope(Collection<String> shippingLimitDtList) {
        doSetShippingLimitDt_InScope(shippingLimitDtList);
    }

    protected void doSetShippingLimitDt_InScope(Collection<String> shippingLimitDtList) {
        regINS(CK_INS, cTL(shippingLimitDtList), xgetCValueShippingLimitDt(), "SHIPPING_LIMIT_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_LIMIT_DT: {varchar(8)}
     * @param shippingLimitDtList The collection of shippingLimitDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingLimitDt_NotInScope(Collection<String> shippingLimitDtList) {
        doSetShippingLimitDt_NotInScope(shippingLimitDtList);
    }

    protected void doSetShippingLimitDt_NotInScope(Collection<String> shippingLimitDtList) {
        regINS(CK_NINS, cTL(shippingLimitDtList), xgetCValueShippingLimitDt(), "SHIPPING_LIMIT_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_LIMIT_DT: {varchar(8)} <br>
     * <pre>e.g. setShippingLimitDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingLimitDt The value of shippingLimitDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingLimitDt_LikeSearch(String shippingLimitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingLimitDt), xgetCValueShippingLimitDt(), "SHIPPING_LIMIT_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_LIMIT_DT: {varchar(8)}
     * @param shippingLimitDt The value of shippingLimitDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingLimitDt_NotLikeSearch(String shippingLimitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingLimitDt), xgetCValueShippingLimitDt(), "SHIPPING_LIMIT_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_LIMIT_DT: {varchar(8)}
     * @param shippingLimitDt The value of shippingLimitDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingLimitDt_PrefixSearch(String shippingLimitDt) {
        setShippingLimitDt_LikeSearch(shippingLimitDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_DT: {varchar(8)}
     */
    public void setShippingLimitDt_IsNull() { regShippingLimitDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_DT: {varchar(8)}
     */
    public void setShippingLimitDt_IsNullOrEmpty() { regShippingLimitDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_DT: {varchar(8)}
     */
    public void setShippingLimitDt_IsNotNull() { regShippingLimitDt(CK_ISNN, DOBJ); }

    protected void regShippingLimitDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingLimitDt(), "SHIPPING_LIMIT_DT"); }
    protected abstract ConditionValue xgetCValueShippingLimitDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LotManagFlg}
     * @param lotManagFlg The value of lotManagFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagFlg_Equal(String lotManagFlg) {
        doSetLotManagFlg_Equal(fRES(lotManagFlg));
    }

    /**
     * Equal(=). As LotManagFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLotManagFlg_Equal_AsLotManagFlg(CDef.LotManagFlg cdef) {
        doSetLotManagFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLotManagFlg_Equal_$0() {
        setLotManagFlg_Equal_AsLotManagFlg(CDef.LotManagFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLotManagFlg_Equal_$1() {
        setLotManagFlg_Equal_AsLotManagFlg(CDef.LotManagFlg.$1);
    }

    protected void doSetLotManagFlg_Equal(String lotManagFlg) {
        regLotManagFlg(CK_EQ, lotManagFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LotManagFlg}
     * @param lotManagFlg The value of lotManagFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagFlg_NotEqual(String lotManagFlg) {
        doSetLotManagFlg_NotEqual(fRES(lotManagFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LotManagFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLotManagFlg_NotEqual_AsLotManagFlg(CDef.LotManagFlg cdef) {
        doSetLotManagFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLotManagFlg_NotEqual_$0() {
        setLotManagFlg_NotEqual_AsLotManagFlg(CDef.LotManagFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLotManagFlg_NotEqual_$1() {
        setLotManagFlg_NotEqual_AsLotManagFlg(CDef.LotManagFlg.$1);
    }

    protected void doSetLotManagFlg_NotEqual(String lotManagFlg) {
        regLotManagFlg(CK_NES, lotManagFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LotManagFlg}
     * @param lotManagFlgList The collection of lotManagFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagFlg_InScope(Collection<String> lotManagFlgList) {
        doSetLotManagFlg_InScope(lotManagFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LotManagFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagFlg_InScope_AsLotManagFlg(Collection<CDef.LotManagFlg> cdefList) {
        doSetLotManagFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLotManagFlg_InScope(Collection<String> lotManagFlgList) {
        regINS(CK_INS, cTL(lotManagFlgList), xgetCValueLotManagFlg(), "LOT_MANAG_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LotManagFlg}
     * @param lotManagFlgList The collection of lotManagFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagFlg_NotInScope(Collection<String> lotManagFlgList) {
        doSetLotManagFlg_NotInScope(lotManagFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LotManagFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagFlg_NotInScope_AsLotManagFlg(Collection<CDef.LotManagFlg> cdefList) {
        doSetLotManagFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLotManagFlg_NotInScope(Collection<String> lotManagFlgList) {
        regINS(CK_NINS, cTL(lotManagFlgList), xgetCValueLotManagFlg(), "LOT_MANAG_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LotManagFlg}
     */
    public void setLotManagFlg_IsNull() { regLotManagFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LotManagFlg}
     */
    public void setLotManagFlg_IsNotNull() { regLotManagFlg(CK_ISNN, DOBJ); }

    protected void regLotManagFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotManagFlg(), "LOT_MANAG_FLG"); }
    protected abstract ConditionValue xgetCValueLotManagFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @param limitDtManagFlg The value of limitDtManagFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_Equal(String limitDtManagFlg) {
        doSetLimitDtManagFlg_Equal(fRES(limitDtManagFlg));
    }

    /**
     * Equal(=). As LimitDtManagFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_Equal_AsLimitDtManagFlg(CDef.LimitDtManagFlg cdef) {
        doSetLimitDtManagFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLimitDtManagFlg_Equal_$0() {
        setLimitDtManagFlg_Equal_AsLimitDtManagFlg(CDef.LimitDtManagFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLimitDtManagFlg_Equal_$1() {
        setLimitDtManagFlg_Equal_AsLimitDtManagFlg(CDef.LimitDtManagFlg.$1);
    }

    protected void doSetLimitDtManagFlg_Equal(String limitDtManagFlg) {
        regLimitDtManagFlg(CK_EQ, limitDtManagFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @param limitDtManagFlg The value of limitDtManagFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_NotEqual(String limitDtManagFlg) {
        doSetLimitDtManagFlg_NotEqual(fRES(limitDtManagFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LimitDtManagFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_NotEqual_AsLimitDtManagFlg(CDef.LimitDtManagFlg cdef) {
        doSetLimitDtManagFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLimitDtManagFlg_NotEqual_$0() {
        setLimitDtManagFlg_NotEqual_AsLimitDtManagFlg(CDef.LimitDtManagFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLimitDtManagFlg_NotEqual_$1() {
        setLimitDtManagFlg_NotEqual_AsLimitDtManagFlg(CDef.LimitDtManagFlg.$1);
    }

    protected void doSetLimitDtManagFlg_NotEqual(String limitDtManagFlg) {
        regLimitDtManagFlg(CK_NES, limitDtManagFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @param limitDtManagFlgList The collection of limitDtManagFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_InScope(Collection<String> limitDtManagFlgList) {
        doSetLimitDtManagFlg_InScope(limitDtManagFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LimitDtManagFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_InScope_AsLimitDtManagFlg(Collection<CDef.LimitDtManagFlg> cdefList) {
        doSetLimitDtManagFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLimitDtManagFlg_InScope(Collection<String> limitDtManagFlgList) {
        regINS(CK_INS, cTL(limitDtManagFlgList), xgetCValueLimitDtManagFlg(), "LIMIT_DT_MANAG_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @param limitDtManagFlgList The collection of limitDtManagFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_NotInScope(Collection<String> limitDtManagFlgList) {
        doSetLimitDtManagFlg_NotInScope(limitDtManagFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LimitDtManagFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_NotInScope_AsLimitDtManagFlg(Collection<CDef.LimitDtManagFlg> cdefList) {
        doSetLimitDtManagFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLimitDtManagFlg_NotInScope(Collection<String> limitDtManagFlgList) {
        regINS(CK_NINS, cTL(limitDtManagFlgList), xgetCValueLimitDtManagFlg(), "LIMIT_DT_MANAG_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     */
    public void setLimitDtManagFlg_IsNull() { regLimitDtManagFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     */
    public void setLimitDtManagFlg_IsNotNull() { regLimitDtManagFlg(CK_ISNN, DOBJ); }

    protected void regLimitDtManagFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDtManagFlg(), "LIMIT_DT_MANAG_FLG"); }
    protected abstract ConditionValue xgetCValueLimitDtManagFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param unitNum The value of unitNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_Equal(Long unitNum) {
        doSetUnitNum_Equal(unitNum);
    }

    protected void doSetUnitNum_Equal(Long unitNum) {
        regUnitNum(CK_EQ, unitNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param unitNum The value of unitNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_NotEqual(Long unitNum) {
        doSetUnitNum_NotEqual(unitNum);
    }

    protected void doSetUnitNum_NotEqual(Long unitNum) {
        regUnitNum(CK_NES, unitNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param unitNum The value of unitNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_GreaterThan(Long unitNum) {
        regUnitNum(CK_GT, unitNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param unitNum The value of unitNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_LessThan(Long unitNum) {
        regUnitNum(CK_LT, unitNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param unitNum The value of unitNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_GreaterEqual(Long unitNum) {
        regUnitNum(CK_GE, unitNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param unitNum The value of unitNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_LessEqual(Long unitNum) {
        regUnitNum(CK_LE, unitNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param minNumber The min number of unitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnitNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnitNum(), "UNIT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param unitNumList The collection of unitNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_InScope(Collection<Long> unitNumList) {
        doSetUnitNum_InScope(unitNumList);
    }

    protected void doSetUnitNum_InScope(Collection<Long> unitNumList) {
        regINS(CK_INS, cTL(unitNumList), xgetCValueUnitNum(), "UNIT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param unitNumList The collection of unitNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_NotInScope(Collection<Long> unitNumList) {
        doSetUnitNum_NotInScope(unitNumList);
    }

    protected void doSetUnitNum_NotInScope(Collection<Long> unitNumList) {
        regINS(CK_NINS, cTL(unitNumList), xgetCValueUnitNum(), "UNIT_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     */
    public void setUnitNum_IsNull() { regUnitNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     */
    public void setUnitNum_IsNotNull() { regUnitNum(CK_ISNN, DOBJ); }

    protected void regUnitNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitNum(), "UNIT_NUM"); }
    protected abstract ConditionValue xgetCValueUnitNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param instNum The value of instNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_Equal(java.math.BigDecimal instNum) {
        doSetInstNum_Equal(instNum);
    }

    protected void doSetInstNum_Equal(java.math.BigDecimal instNum) {
        regInstNum(CK_EQ, instNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param instNum The value of instNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_NotEqual(java.math.BigDecimal instNum) {
        doSetInstNum_NotEqual(instNum);
    }

    protected void doSetInstNum_NotEqual(java.math.BigDecimal instNum) {
        regInstNum(CK_NES, instNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param instNum The value of instNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_GreaterThan(java.math.BigDecimal instNum) {
        regInstNum(CK_GT, instNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param instNum The value of instNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_LessThan(java.math.BigDecimal instNum) {
        regInstNum(CK_LT, instNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param instNum The value of instNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_GreaterEqual(java.math.BigDecimal instNum) {
        regInstNum(CK_GE, instNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param instNum The value of instNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_LessEqual(java.math.BigDecimal instNum) {
        regInstNum(CK_LE, instNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of instNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of instNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInstNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInstNum(), "INST_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param instNumList The collection of instNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstNum_InScope(Collection<java.math.BigDecimal> instNumList) {
        doSetInstNum_InScope(instNumList);
    }

    protected void doSetInstNum_InScope(Collection<java.math.BigDecimal> instNumList) {
        regINS(CK_INS, cTL(instNumList), xgetCValueInstNum(), "INST_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INST_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param instNumList The collection of instNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstNum_NotInScope(Collection<java.math.BigDecimal> instNumList) {
        doSetInstNum_NotInScope(instNumList);
    }

    protected void doSetInstNum_NotInScope(Collection<java.math.BigDecimal> instNumList) {
        regINS(CK_NINS, cTL(instNumList), xgetCValueInstNum(), "INST_NUM");
    }

    protected void regInstNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstNum(), "INST_NUM"); }
    protected abstract ConditionValue xgetCValueInstNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {varchar(30)}
     * @param processNo The value of processNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_Equal(String processNo) {
        doSetProcessNo_Equal(fRES(processNo));
    }

    protected void doSetProcessNo_Equal(String processNo) {
        regProcessNo(CK_EQ, processNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {varchar(30)}
     * @param processNo The value of processNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_NotEqual(String processNo) {
        doSetProcessNo_NotEqual(fRES(processNo));
    }

    protected void doSetProcessNo_NotEqual(String processNo) {
        regProcessNo(CK_NES, processNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {varchar(30)}
     * @param processNo The value of processNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_GreaterThan(String processNo) {
        regProcessNo(CK_GT, fRES(processNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {varchar(30)}
     * @param processNo The value of processNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_LessThan(String processNo) {
        regProcessNo(CK_LT, fRES(processNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {varchar(30)}
     * @param processNo The value of processNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_GreaterEqual(String processNo) {
        regProcessNo(CK_GE, fRES(processNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {varchar(30)}
     * @param processNo The value of processNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_LessEqual(String processNo) {
        regProcessNo(CK_LE, fRES(processNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {varchar(30)}
     * @param processNoList The collection of processNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_InScope(Collection<String> processNoList) {
        doSetProcessNo_InScope(processNoList);
    }

    protected void doSetProcessNo_InScope(Collection<String> processNoList) {
        regINS(CK_INS, cTL(processNoList), xgetCValueProcessNo(), "PROCESS_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {varchar(30)}
     * @param processNoList The collection of processNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_NotInScope(Collection<String> processNoList) {
        doSetProcessNo_NotInScope(processNoList);
    }

    protected void doSetProcessNo_NotInScope(Collection<String> processNoList) {
        regINS(CK_NINS, cTL(processNoList), xgetCValueProcessNo(), "PROCESS_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {varchar(30)} <br>
     * <pre>e.g. setProcessNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param processNo The value of processNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProcessNo_LikeSearch(String processNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(processNo), xgetCValueProcessNo(), "PROCESS_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {varchar(30)}
     * @param processNo The value of processNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProcessNo_NotLikeSearch(String processNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(processNo), xgetCValueProcessNo(), "PROCESS_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {varchar(30)}
     * @param processNo The value of processNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_PrefixSearch(String processNo) {
        setProcessNo_LikeSearch(processNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROCESS_NO: {varchar(30)}
     */
    public void setProcessNo_IsNull() { regProcessNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROCESS_NO: {varchar(30)}
     */
    public void setProcessNo_IsNullOrEmpty() { regProcessNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROCESS_NO: {varchar(30)}
     */
    public void setProcessNo_IsNotNull() { regProcessNo(CK_ISNN, DOBJ); }

    protected void regProcessNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessNo(), "PROCESS_NO"); }
    protected abstract ConditionValue xgetCValueProcessNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocNum The value of allocNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_Equal(java.math.BigDecimal allocNum) {
        doSetAllocNum_Equal(allocNum);
    }

    protected void doSetAllocNum_Equal(java.math.BigDecimal allocNum) {
        regAllocNum(CK_EQ, allocNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocNum The value of allocNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_NotEqual(java.math.BigDecimal allocNum) {
        doSetAllocNum_NotEqual(allocNum);
    }

    protected void doSetAllocNum_NotEqual(java.math.BigDecimal allocNum) {
        regAllocNum(CK_NES, allocNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocNum The value of allocNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_GreaterThan(java.math.BigDecimal allocNum) {
        regAllocNum(CK_GT, allocNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocNum The value of allocNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_LessThan(java.math.BigDecimal allocNum) {
        regAllocNum(CK_LT, allocNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocNum The value of allocNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_GreaterEqual(java.math.BigDecimal allocNum) {
        regAllocNum(CK_GE, allocNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocNum The value of allocNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_LessEqual(java.math.BigDecimal allocNum) {
        regAllocNum(CK_LE, allocNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of allocNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocNum(), "ALLOC_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocNumList The collection of allocNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNum_InScope(Collection<java.math.BigDecimal> allocNumList) {
        doSetAllocNum_InScope(allocNumList);
    }

    protected void doSetAllocNum_InScope(Collection<java.math.BigDecimal> allocNumList) {
        regINS(CK_INS, cTL(allocNumList), xgetCValueAllocNum(), "ALLOC_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param allocNumList The collection of allocNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNum_NotInScope(Collection<java.math.BigDecimal> allocNumList) {
        doSetAllocNum_NotInScope(allocNumList);
    }

    protected void doSetAllocNum_NotInScope(Collection<java.math.BigDecimal> allocNumList) {
        regINS(CK_NINS, cTL(allocNumList), xgetCValueAllocNum(), "ALLOC_NUM");
    }

    protected void regAllocNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocNum(), "ALLOC_NUM"); }
    protected abstract ConditionValue xgetCValueAllocNum();

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
    public HpSLCFunction<TAllocInstBCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TAllocInstBCB.class);
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
    public HpSLCFunction<TAllocInstBCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TAllocInstBCB.class);
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
    public HpSLCFunction<TAllocInstBCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TAllocInstBCB.class);
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
    public HpSLCFunction<TAllocInstBCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TAllocInstBCB.class);
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
    public HpSLCFunction<TAllocInstBCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TAllocInstBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TAllocInstBCB&gt;() {
     *     public void query(TAllocInstBCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TAllocInstBCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TAllocInstBCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstBCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TAllocInstBCQ sq);

    protected TAllocInstBCB xcreateScalarConditionCB() {
        TAllocInstBCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TAllocInstBCB xcreateScalarConditionPartitionByCB() {
        TAllocInstBCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TAllocInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ALLOC_INST_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TAllocInstBCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TAllocInstBCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TAllocInstBCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ALLOC_INST_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TAllocInstBCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TAllocInstBCQ sq);

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
    protected TAllocInstBCB newMyCB() {
        return new TAllocInstBCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TAllocInstBCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
