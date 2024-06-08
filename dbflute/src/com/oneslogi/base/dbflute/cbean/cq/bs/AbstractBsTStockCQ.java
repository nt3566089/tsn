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
 * The abstract condition-query of T_STOCK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTStockCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTStockCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_STOCK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockId The value of stockId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_Equal(Long stockId) {
        doSetStockId_Equal(stockId);
    }

    protected void doSetStockId_Equal(Long stockId) {
        regStockId(CK_EQ, stockId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockId The value of stockId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_NotEqual(Long stockId) {
        doSetStockId_NotEqual(stockId);
    }

    protected void doSetStockId_NotEqual(Long stockId) {
        regStockId(CK_NES, stockId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockId The value of stockId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterThan(Long stockId) {
        regStockId(CK_GT, stockId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockId The value of stockId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessThan(Long stockId) {
        regStockId(CK_LT, stockId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockId The value of stockId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterEqual(Long stockId) {
        regStockId(CK_GE, stockId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockId The value of stockId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessEqual(Long stockId) {
        regStockId(CK_LE, stockId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockId(), "STOCK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockIdList The collection of stockId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_InScope(Collection<Long> stockIdList) {
        doSetStockId_InScope(stockIdList);
    }

    protected void doSetStockId_InScope(Collection<Long> stockIdList) {
        regINS(CK_INS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockIdList The collection of stockId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_NotInScope(Collection<Long> stockIdList) {
        doSetStockId_NotInScope(stockIdList);
    }

    protected void doSetStockId_NotInScope(Collection<Long> stockIdList) {
        regINS(CK_NINS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select STOCK_ID from T_INVENTORY_B where ...)} <br>
     * T_INVENTORY_B by STOCK_ID, named 'TInventoryBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryBList for 'exists'. (NotNull)
     */
    public void existsTInventoryBList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockId_ExistsReferrer_TInventoryBList(cb.query());
        registerExistsReferrer(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tInventoryBList");
    }
    public abstract String keepStockId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select STOCK_ID from T_PALLET where ...)} <br>
     * T_PALLET by STOCK_ID, named 'TPalletAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPalletList</span>(palletCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     palletCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPalletList for 'exists'. (NotNull)
     */
    public void existsTPalletList(SubQuery<TPalletCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPalletCB cb = new TPalletCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockId_ExistsReferrer_TPalletList(cb.query());
        registerExistsReferrer(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tPalletList");
    }
    public abstract String keepStockId_ExistsReferrer_TPalletList(TPalletCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select STOCK_ID from T_PICKING_B where ...)} <br>
     * T_PICKING_B by STOCK_ID, named 'TPickingBAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockId_ExistsReferrer_TPickingBList(cb.query());
        registerExistsReferrer(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tPickingBList");
    }
    public abstract String keepStockId_ExistsReferrer_TPickingBList(TPickingBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select STOCK_ID from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by STOCK_ID, named 'TStockInoutAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockId_ExistsReferrer_TStockInoutList(cb.query());
        registerExistsReferrer(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tStockInoutList");
    }
    public abstract String keepStockId_ExistsReferrer_TStockInoutList(TStockInoutCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select STOCK_ID from T_STOCK_REPORT where ...)} <br>
     * T_STOCK_REPORT by STOCK_ID, named 'TStockReportAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStockReportAsOne</span>(reportCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     reportCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStockReportAsOne for 'exists'. (NotNull)
     */
    public void existsTStockReportAsOne(SubQuery<TStockReportCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockReportCB cb = new TStockReportCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockId_ExistsReferrer_TStockReportAsOne(cb.query());
        registerExistsReferrer(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tStockReportAsOne");
    }
    public abstract String keepStockId_ExistsReferrer_TStockReportAsOne(TStockReportCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select STOCK_ID from T_TRIMALLOCSTOCK where ...)} <br>
     * T_TRIMALLOCSTOCK by STOCK_ID, named 'TTrimallocstockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrimallocstockList</span>(trimallocstockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trimallocstockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrimallocstockList for 'exists'. (NotNull)
     */
    public void existsTTrimallocstockList(SubQuery<TTrimallocstockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrimallocstockCB cb = new TTrimallocstockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockId_ExistsReferrer_TTrimallocstockList(cb.query());
        registerExistsReferrer(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tTrimallocstockList");
    }
    public abstract String keepStockId_ExistsReferrer_TTrimallocstockList(TTrimallocstockCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select STOCK_ID from T_TRPICKDETAIL where ...)} <br>
     * T_TRPICKDETAIL by STOCK_ID, named 'TTrpickdetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrpickdetailList</span>(trpickdetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trpickdetailCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrpickdetailList for 'exists'. (NotNull)
     */
    public void existsTTrpickdetailList(SubQuery<TTrpickdetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpickdetailCB cb = new TTrpickdetailCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockId_ExistsReferrer_TTrpickdetailList(cb.query());
        registerExistsReferrer(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tTrpickdetailList");
    }
    public abstract String keepStockId_ExistsReferrer_TTrpickdetailList(TTrpickdetailCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select STOCK_ID from T_INVENTORY_B where ...)} <br>
     * T_INVENTORY_B by STOCK_ID, named 'TInventoryBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of StockId_NotExistsReferrer_TInventoryBList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryBList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockId_NotExistsReferrer_TInventoryBList(cb.query());
        registerNotExistsReferrer(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tInventoryBList");
    }
    public abstract String keepStockId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select STOCK_ID from T_PALLET where ...)} <br>
     * T_PALLET by STOCK_ID, named 'TPalletAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPalletList</span>(palletCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     palletCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of StockId_NotExistsReferrer_TPalletList for 'not exists'. (NotNull)
     */
    public void notExistsTPalletList(SubQuery<TPalletCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPalletCB cb = new TPalletCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockId_NotExistsReferrer_TPalletList(cb.query());
        registerNotExistsReferrer(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tPalletList");
    }
    public abstract String keepStockId_NotExistsReferrer_TPalletList(TPalletCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select STOCK_ID from T_PICKING_B where ...)} <br>
     * T_PICKING_B by STOCK_ID, named 'TPickingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of StockId_NotExistsReferrer_TPickingBList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingBList(SubQuery<TPickingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockId_NotExistsReferrer_TPickingBList(cb.query());
        registerNotExistsReferrer(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tPickingBList");
    }
    public abstract String keepStockId_NotExistsReferrer_TPickingBList(TPickingBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select STOCK_ID from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by STOCK_ID, named 'TStockInoutAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStockInoutList</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of StockId_NotExistsReferrer_TStockInoutList for 'not exists'. (NotNull)
     */
    public void notExistsTStockInoutList(SubQuery<TStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockId_NotExistsReferrer_TStockInoutList(cb.query());
        registerNotExistsReferrer(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tStockInoutList");
    }
    public abstract String keepStockId_NotExistsReferrer_TStockInoutList(TStockInoutCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select STOCK_ID from T_STOCK_REPORT where ...)} <br>
     * T_STOCK_REPORT by STOCK_ID, named 'TStockReportAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStockReportAsOne</span>(reportCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     reportCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of StockId_NotExistsReferrer_TStockReportAsOne for 'not exists'. (NotNull)
     */
    public void notExistsTStockReportAsOne(SubQuery<TStockReportCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockReportCB cb = new TStockReportCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockId_NotExistsReferrer_TStockReportAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tStockReportAsOne");
    }
    public abstract String keepStockId_NotExistsReferrer_TStockReportAsOne(TStockReportCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select STOCK_ID from T_TRIMALLOCSTOCK where ...)} <br>
     * T_TRIMALLOCSTOCK by STOCK_ID, named 'TTrimallocstockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrimallocstockList</span>(trimallocstockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trimallocstockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of StockId_NotExistsReferrer_TTrimallocstockList for 'not exists'. (NotNull)
     */
    public void notExistsTTrimallocstockList(SubQuery<TTrimallocstockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrimallocstockCB cb = new TTrimallocstockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockId_NotExistsReferrer_TTrimallocstockList(cb.query());
        registerNotExistsReferrer(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tTrimallocstockList");
    }
    public abstract String keepStockId_NotExistsReferrer_TTrimallocstockList(TTrimallocstockCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select STOCK_ID from T_TRPICKDETAIL where ...)} <br>
     * T_TRPICKDETAIL by STOCK_ID, named 'TTrpickdetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrpickdetailList</span>(trpickdetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trpickdetailCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of StockId_NotExistsReferrer_TTrpickdetailList for 'not exists'. (NotNull)
     */
    public void notExistsTTrpickdetailList(SubQuery<TTrpickdetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpickdetailCB cb = new TTrpickdetailCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockId_NotExistsReferrer_TTrpickdetailList(cb.query());
        registerNotExistsReferrer(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tTrpickdetailList");
    }
    public abstract String keepStockId_NotExistsReferrer_TTrpickdetailList(TTrpickdetailCQ sq);

    public void xsderiveTInventoryBList(String fn, SubQuery<TInventoryBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepStockId_SpecifyDerivedReferrer_TInventoryBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "STOCK_ID", "STOCK_ID", pp, "tInventoryBList", al, op);
    }
    public abstract String keepStockId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq);

    public void xsderiveTPalletList(String fn, SubQuery<TPalletCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPalletCB cb = new TPalletCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepStockId_SpecifyDerivedReferrer_TPalletList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "STOCK_ID", "STOCK_ID", pp, "tPalletList", al, op);
    }
    public abstract String keepStockId_SpecifyDerivedReferrer_TPalletList(TPalletCQ sq);

    public void xsderiveTPickingBList(String fn, SubQuery<TPickingBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepStockId_SpecifyDerivedReferrer_TPickingBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "STOCK_ID", "STOCK_ID", pp, "tPickingBList", al, op);
    }
    public abstract String keepStockId_SpecifyDerivedReferrer_TPickingBList(TPickingBCQ sq);

    public void xsderiveTStockInoutList(String fn, SubQuery<TStockInoutCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepStockId_SpecifyDerivedReferrer_TStockInoutList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "STOCK_ID", "STOCK_ID", pp, "tStockInoutList", al, op);
    }
    public abstract String keepStockId_SpecifyDerivedReferrer_TStockInoutList(TStockInoutCQ sq);

    public void xsderiveTTrimallocstockList(String fn, SubQuery<TTrimallocstockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrimallocstockCB cb = new TTrimallocstockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepStockId_SpecifyDerivedReferrer_TTrimallocstockList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "STOCK_ID", "STOCK_ID", pp, "tTrimallocstockList", al, op);
    }
    public abstract String keepStockId_SpecifyDerivedReferrer_TTrimallocstockList(TTrimallocstockCQ sq);

    public void xsderiveTTrpickdetailList(String fn, SubQuery<TTrpickdetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpickdetailCB cb = new TTrpickdetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepStockId_SpecifyDerivedReferrer_TTrpickdetailList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "STOCK_ID", "STOCK_ID", pp, "tTrpickdetailList", al, op);
    }
    public abstract String keepStockId_SpecifyDerivedReferrer_TTrpickdetailList(TTrpickdetailCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_INVENTORY_B where ...)} <br>
     * T_INVENTORY_B by STOCK_ID, named 'TInventoryBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryBCB> derivedTInventoryBList() {
        return xcreateQDRFunctionTInventoryBList();
    }
    protected HpQDRFunction<TInventoryBCB> xcreateQDRFunctionTInventoryBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryBList(String fn, SubQuery<TInventoryBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepStockId_QueryDerivedReferrer_TInventoryBList(cb.query()); String prpp = keepStockId_QueryDerivedReferrer_TInventoryBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "STOCK_ID", "STOCK_ID", sqpp, "tInventoryBList", rd, vl, prpp, op);
    }
    public abstract String keepStockId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq);
    public abstract String keepStockId_QueryDerivedReferrer_TInventoryBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PALLET where ...)} <br>
     * T_PALLET by STOCK_ID, named 'TPalletAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPalletList()</span>.<span style="color: #CC4747">max</span>(palletCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     palletCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     palletCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPalletCB> derivedTPalletList() {
        return xcreateQDRFunctionTPalletList();
    }
    protected HpQDRFunction<TPalletCB> xcreateQDRFunctionTPalletList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPalletList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPalletList(String fn, SubQuery<TPalletCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPalletCB cb = new TPalletCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepStockId_QueryDerivedReferrer_TPalletList(cb.query()); String prpp = keepStockId_QueryDerivedReferrer_TPalletListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "STOCK_ID", "STOCK_ID", sqpp, "tPalletList", rd, vl, prpp, op);
    }
    public abstract String keepStockId_QueryDerivedReferrer_TPalletList(TPalletCQ sq);
    public abstract String keepStockId_QueryDerivedReferrer_TPalletListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PICKING_B where ...)} <br>
     * T_PICKING_B by STOCK_ID, named 'TPickingBAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepStockId_QueryDerivedReferrer_TPickingBList(cb.query()); String prpp = keepStockId_QueryDerivedReferrer_TPickingBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "STOCK_ID", "STOCK_ID", sqpp, "tPickingBList", rd, vl, prpp, op);
    }
    public abstract String keepStockId_QueryDerivedReferrer_TPickingBList(TPickingBCQ sq);
    public abstract String keepStockId_QueryDerivedReferrer_TPickingBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by STOCK_ID, named 'TStockInoutAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepStockId_QueryDerivedReferrer_TStockInoutList(cb.query()); String prpp = keepStockId_QueryDerivedReferrer_TStockInoutListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "STOCK_ID", "STOCK_ID", sqpp, "tStockInoutList", rd, vl, prpp, op);
    }
    public abstract String keepStockId_QueryDerivedReferrer_TStockInoutList(TStockInoutCQ sq);
    public abstract String keepStockId_QueryDerivedReferrer_TStockInoutListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRIMALLOCSTOCK where ...)} <br>
     * T_TRIMALLOCSTOCK by STOCK_ID, named 'TTrimallocstockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrimallocstockList()</span>.<span style="color: #CC4747">max</span>(trimallocstockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trimallocstockCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trimallocstockCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrimallocstockCB> derivedTTrimallocstockList() {
        return xcreateQDRFunctionTTrimallocstockList();
    }
    protected HpQDRFunction<TTrimallocstockCB> xcreateQDRFunctionTTrimallocstockList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrimallocstockList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrimallocstockList(String fn, SubQuery<TTrimallocstockCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrimallocstockCB cb = new TTrimallocstockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepStockId_QueryDerivedReferrer_TTrimallocstockList(cb.query()); String prpp = keepStockId_QueryDerivedReferrer_TTrimallocstockListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "STOCK_ID", "STOCK_ID", sqpp, "tTrimallocstockList", rd, vl, prpp, op);
    }
    public abstract String keepStockId_QueryDerivedReferrer_TTrimallocstockList(TTrimallocstockCQ sq);
    public abstract String keepStockId_QueryDerivedReferrer_TTrimallocstockListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRPICKDETAIL where ...)} <br>
     * T_TRPICKDETAIL by STOCK_ID, named 'TTrpickdetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrpickdetailList()</span>.<span style="color: #CC4747">max</span>(trpickdetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trpickdetailCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trpickdetailCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrpickdetailCB> derivedTTrpickdetailList() {
        return xcreateQDRFunctionTTrpickdetailList();
    }
    protected HpQDRFunction<TTrpickdetailCB> xcreateQDRFunctionTTrpickdetailList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrpickdetailList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrpickdetailList(String fn, SubQuery<TTrpickdetailCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpickdetailCB cb = new TTrpickdetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepStockId_QueryDerivedReferrer_TTrpickdetailList(cb.query()); String prpp = keepStockId_QueryDerivedReferrer_TTrpickdetailListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "STOCK_ID", "STOCK_ID", sqpp, "tTrpickdetailList", rd, vl, prpp, op);
    }
    public abstract String keepStockId_QueryDerivedReferrer_TTrpickdetailList(TTrpickdetailCQ sq);
    public abstract String keepStockId_QueryDerivedReferrer_TTrpickdetailListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setStockId_IsNull() { regStockId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setStockId_IsNotNull() { regStockId(CK_ISNN, DOBJ); }

    protected void regStockId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockId(), "STOCK_ID"); }
    protected abstract ConditionValue xgetCValueStockId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_Equal(Long clientId) {
        doSetClientId_Equal(clientId);
    }

    protected void doSetClientId_Equal(Long clientId) {
        regClientId(CK_EQ, clientId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_NotEqual(Long clientId) {
        doSetClientId_NotEqual(clientId);
    }

    protected void doSetClientId_NotEqual(Long clientId) {
        regClientId(CK_NES, clientId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientIdList The collection of clientId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_InScope(Collection<Long> clientIdList) {
        doSetClientId_InScope(clientIdList);
    }

    protected void doSetClientId_InScope(Collection<Long> clientIdList) {
        regINS(CK_INS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLIENT_ID from M_CLIENT where ...)} <br />
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'in-scope'. (NotNull)
     */
    public void inScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_InScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", false);
    }
    public abstract String keepClientId_InScopeRelation_MClient(MClientCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLIENT_ID from M_CLIENT where ...)} <br />
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'not in-scope'. (NotNull)
     */
    public void notInScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_NotInScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", true);
    }
    public abstract String keepClientId_NotInScopeRelation_MClient(MClientCQ sq);

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {NotNull, bigint(19), FK to M_WAREHOUSE}
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
     * WAREHOUSE_ID: {NotNull, bigint(19), FK to M_WAREHOUSE}
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
     * WAREHOUSE_ID: {NotNull, bigint(19), FK to M_WAREHOUSE}
     * @param warehouseId The value of warehouseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_GreaterThan(Long warehouseId) {
        regWarehouseId(CK_GT, warehouseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {NotNull, bigint(19), FK to M_WAREHOUSE}
     * @param warehouseId The value of warehouseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_LessThan(Long warehouseId) {
        regWarehouseId(CK_LT, warehouseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {NotNull, bigint(19), FK to M_WAREHOUSE}
     * @param warehouseId The value of warehouseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_GreaterEqual(Long warehouseId) {
        regWarehouseId(CK_GE, warehouseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {NotNull, bigint(19), FK to M_WAREHOUSE}
     * @param warehouseId The value of warehouseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_LessEqual(Long warehouseId) {
        regWarehouseId(CK_LE, warehouseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {NotNull, bigint(19), FK to M_WAREHOUSE}
     * @param minNumber The min number of warehouseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of warehouseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWarehouseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWarehouseId(), "WAREHOUSE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_ID: {NotNull, bigint(19), FK to M_WAREHOUSE}
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
     * WAREHOUSE_ID: {NotNull, bigint(19), FK to M_WAREHOUSE}
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

    protected void regWarehouseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseId(), "WAREHOUSE_ID"); }
    protected abstract ConditionValue xgetCValueWarehouseId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX+, NotNull, bigint(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {IX+, NotNull, bigint(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {IX+, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX+, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX+, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX+, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX+, NotNull, bigint(19), FK to M_PRODUCT}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX+, NotNull, bigint(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {IX+, NotNull, bigint(19), FK to M_PRODUCT}
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

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX+, NotNull, bigint(19), FK to M_STOCK_TYPE}
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
     * STOCK_TYPE_ID: {IX+, NotNull, bigint(19), FK to M_STOCK_TYPE}
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
     * STOCK_TYPE_ID: {IX+, NotNull, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_GreaterThan(Long stockTypeId) {
        regStockTypeId(CK_GT, stockTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX+, NotNull, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_LessThan(Long stockTypeId) {
        regStockTypeId(CK_LT, stockTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX+, NotNull, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_GreaterEqual(Long stockTypeId) {
        regStockTypeId(CK_GE, stockTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX+, NotNull, bigint(19), FK to M_STOCK_TYPE}
     * @param stockTypeId The value of stockTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_LessEqual(Long stockTypeId) {
        regStockTypeId(CK_LE, stockTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX+, NotNull, bigint(19), FK to M_STOCK_TYPE}
     * @param minNumber The min number of stockTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockTypeId(), "STOCK_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_ID: {IX+, NotNull, bigint(19), FK to M_STOCK_TYPE}
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
     * STOCK_TYPE_ID: {IX+, NotNull, bigint(19), FK to M_STOCK_TYPE}
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

    protected void regStockTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockTypeId(), "STOCK_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueStockTypeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {+UQ, IX+, NotNull, bigint(19), FK to M_LOCATION}
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
     * LOCATION_ID: {+UQ, IX+, NotNull, bigint(19), FK to M_LOCATION}
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
     * LOCATION_ID: {+UQ, IX+, NotNull, bigint(19), FK to M_LOCATION}
     * @param locationId The value of locationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterThan(Long locationId) {
        regLocationId(CK_GT, locationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {+UQ, IX+, NotNull, bigint(19), FK to M_LOCATION}
     * @param locationId The value of locationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessThan(Long locationId) {
        regLocationId(CK_LT, locationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {+UQ, IX+, NotNull, bigint(19), FK to M_LOCATION}
     * @param locationId The value of locationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterEqual(Long locationId) {
        regLocationId(CK_GE, locationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {+UQ, IX+, NotNull, bigint(19), FK to M_LOCATION}
     * @param locationId The value of locationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessEqual(Long locationId) {
        regLocationId(CK_LE, locationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {+UQ, IX+, NotNull, bigint(19), FK to M_LOCATION}
     * @param minNumber The min number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocationId(), "LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {+UQ, IX+, NotNull, bigint(19), FK to M_LOCATION}
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
     * LOCATION_ID: {+UQ, IX+, NotNull, bigint(19), FK to M_LOCATION}
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

    protected void regLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationId(), "LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueLocationId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX+, NotNull, bigint(19), FK to M_CUSTOMER}
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
     * DEPOSIT_ID: {IX+, NotNull, bigint(19), FK to M_CUSTOMER}
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
     * DEPOSIT_ID: {IX+, NotNull, bigint(19), FK to M_CUSTOMER}
     * @param depositId The value of depositId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_GreaterThan(Long depositId) {
        regDepositId(CK_GT, depositId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX+, NotNull, bigint(19), FK to M_CUSTOMER}
     * @param depositId The value of depositId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_LessThan(Long depositId) {
        regDepositId(CK_LT, depositId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX+, NotNull, bigint(19), FK to M_CUSTOMER}
     * @param depositId The value of depositId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_GreaterEqual(Long depositId) {
        regDepositId(CK_GE, depositId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX+, NotNull, bigint(19), FK to M_CUSTOMER}
     * @param depositId The value of depositId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_LessEqual(Long depositId) {
        regDepositId(CK_LE, depositId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX+, NotNull, bigint(19), FK to M_CUSTOMER}
     * @param minNumber The min number of depositId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of depositId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDepositId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDepositId(), "DEPOSIT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_ID: {IX+, NotNull, bigint(19), FK to M_CUSTOMER}
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
     * DEPOSIT_ID: {IX+, NotNull, bigint(19), FK to M_CUSTOMER}
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

    protected void regDepositId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDepositId(), "DEPOSIT_ID"); }
    protected abstract ConditionValue xgetCValueDepositId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX+, NotNull, bigint(19), FK to T_LOT}
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
     * LOT_ID: {IX+, NotNull, bigint(19), FK to T_LOT}
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
     * LOT_ID: {IX+, NotNull, bigint(19), FK to T_LOT}
     * @param lotId The value of lotId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterThan(Long lotId) {
        regLotId(CK_GT, lotId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX+, NotNull, bigint(19), FK to T_LOT}
     * @param lotId The value of lotId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessThan(Long lotId) {
        regLotId(CK_LT, lotId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX+, NotNull, bigint(19), FK to T_LOT}
     * @param lotId The value of lotId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterEqual(Long lotId) {
        regLotId(CK_GE, lotId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX+, NotNull, bigint(19), FK to T_LOT}
     * @param lotId The value of lotId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessEqual(Long lotId) {
        regLotId(CK_LE, lotId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX+, NotNull, bigint(19), FK to T_LOT}
     * @param minNumber The min number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotId(), "LOT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {IX+, NotNull, bigint(19), FK to T_LOT}
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
     * LOT_ID: {IX+, NotNull, bigint(19), FK to T_LOT}
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

    protected void regLotId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotId(), "LOT_ID"); }
    protected abstract ConditionValue xgetCValueLotId();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {UQ+, IX, NotNull, bigint(19), FK to T_STORE_NO}
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
     * STORE_NO_ID: {UQ+, IX, NotNull, bigint(19), FK to T_STORE_NO}
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
     * STORE_NO_ID: {UQ+, IX, NotNull, bigint(19), FK to T_STORE_NO}
     * @param storeNoId The value of storeNoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_GreaterThan(Long storeNoId) {
        regStoreNoId(CK_GT, storeNoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {UQ+, IX, NotNull, bigint(19), FK to T_STORE_NO}
     * @param storeNoId The value of storeNoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_LessThan(Long storeNoId) {
        regStoreNoId(CK_LT, storeNoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {UQ+, IX, NotNull, bigint(19), FK to T_STORE_NO}
     * @param storeNoId The value of storeNoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_GreaterEqual(Long storeNoId) {
        regStoreNoId(CK_GE, storeNoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {UQ+, IX, NotNull, bigint(19), FK to T_STORE_NO}
     * @param storeNoId The value of storeNoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_LessEqual(Long storeNoId) {
        regStoreNoId(CK_LE, storeNoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {UQ+, IX, NotNull, bigint(19), FK to T_STORE_NO}
     * @param minNumber The min number of storeNoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeNoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreNoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreNoId(), "STORE_NO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_NO_ID: {UQ+, IX, NotNull, bigint(19), FK to T_STORE_NO}
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
     * STORE_NO_ID: {UQ+, IX, NotNull, bigint(19), FK to T_STORE_NO}
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

    protected void regStoreNoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreNoId(), "STORE_NO_ID"); }
    protected abstract ConditionValue xgetCValueStoreNoId();

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
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param chargeNum The value of chargeNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum_Equal(java.math.BigDecimal chargeNum) {
        doSetChargeNum_Equal(chargeNum);
    }

    protected void doSetChargeNum_Equal(java.math.BigDecimal chargeNum) {
        regChargeNum(CK_EQ, chargeNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param chargeNum The value of chargeNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum_NotEqual(java.math.BigDecimal chargeNum) {
        doSetChargeNum_NotEqual(chargeNum);
    }

    protected void doSetChargeNum_NotEqual(java.math.BigDecimal chargeNum) {
        regChargeNum(CK_NES, chargeNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param chargeNum The value of chargeNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum_GreaterThan(java.math.BigDecimal chargeNum) {
        regChargeNum(CK_GT, chargeNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param chargeNum The value of chargeNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum_LessThan(java.math.BigDecimal chargeNum) {
        regChargeNum(CK_LT, chargeNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param chargeNum The value of chargeNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum_GreaterEqual(java.math.BigDecimal chargeNum) {
        regChargeNum(CK_GE, chargeNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param chargeNum The value of chargeNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChargeNum_LessEqual(java.math.BigDecimal chargeNum) {
        regChargeNum(CK_LE, chargeNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of chargeNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of chargeNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setChargeNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueChargeNum(), "CHARGE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param chargeNumList The collection of chargeNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChargeNum_InScope(Collection<java.math.BigDecimal> chargeNumList) {
        doSetChargeNum_InScope(chargeNumList);
    }

    protected void doSetChargeNum_InScope(Collection<java.math.BigDecimal> chargeNumList) {
        regINS(CK_INS, cTL(chargeNumList), xgetCValueChargeNum(), "CHARGE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param chargeNumList The collection of chargeNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChargeNum_NotInScope(Collection<java.math.BigDecimal> chargeNumList) {
        doSetChargeNum_NotInScope(chargeNumList);
    }

    protected void doSetChargeNum_NotInScope(Collection<java.math.BigDecimal> chargeNumList) {
        regINS(CK_NINS, cTL(chargeNumList), xgetCValueChargeNum(), "CHARGE_NUM");
    }

    protected void regChargeNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChargeNum(), "CHARGE_NUM"); }
    protected abstract ConditionValue xgetCValueChargeNum();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param moveNum The value of moveNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum_Equal(java.math.BigDecimal moveNum) {
        doSetMoveNum_Equal(moveNum);
    }

    protected void doSetMoveNum_Equal(java.math.BigDecimal moveNum) {
        regMoveNum(CK_EQ, moveNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param moveNum The value of moveNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum_NotEqual(java.math.BigDecimal moveNum) {
        doSetMoveNum_NotEqual(moveNum);
    }

    protected void doSetMoveNum_NotEqual(java.math.BigDecimal moveNum) {
        regMoveNum(CK_NES, moveNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param moveNum The value of moveNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum_GreaterThan(java.math.BigDecimal moveNum) {
        regMoveNum(CK_GT, moveNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param moveNum The value of moveNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum_LessThan(java.math.BigDecimal moveNum) {
        regMoveNum(CK_LT, moveNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param moveNum The value of moveNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum_GreaterEqual(java.math.BigDecimal moveNum) {
        regMoveNum(CK_GE, moveNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param moveNum The value of moveNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum_LessEqual(java.math.BigDecimal moveNum) {
        regMoveNum(CK_LE, moveNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of moveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveNum(), "MOVE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param moveNumList The collection of moveNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveNum_InScope(Collection<java.math.BigDecimal> moveNumList) {
        doSetMoveNum_InScope(moveNumList);
    }

    protected void doSetMoveNum_InScope(Collection<java.math.BigDecimal> moveNumList) {
        regINS(CK_INS, cTL(moveNumList), xgetCValueMoveNum(), "MOVE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param moveNumList The collection of moveNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveNum_NotInScope(Collection<java.math.BigDecimal> moveNumList) {
        doSetMoveNum_NotInScope(moveNumList);
    }

    protected void doSetMoveNum_NotInScope(Collection<java.math.BigDecimal> moveNumList) {
        regINS(CK_NINS, cTL(moveNumList), xgetCValueMoveNum(), "MOVE_NUM");
    }

    protected void regMoveNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveNum(), "MOVE_NUM"); }
    protected abstract ConditionValue xgetCValueMoveNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param transitNum The value of transitNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_Equal(java.math.BigDecimal transitNum) {
        doSetTransitNum_Equal(transitNum);
    }

    protected void doSetTransitNum_Equal(java.math.BigDecimal transitNum) {
        regTransitNum(CK_EQ, transitNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param transitNum The value of transitNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_NotEqual(java.math.BigDecimal transitNum) {
        doSetTransitNum_NotEqual(transitNum);
    }

    protected void doSetTransitNum_NotEqual(java.math.BigDecimal transitNum) {
        regTransitNum(CK_NES, transitNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param transitNum The value of transitNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_GreaterThan(java.math.BigDecimal transitNum) {
        regTransitNum(CK_GT, transitNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param transitNum The value of transitNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_LessThan(java.math.BigDecimal transitNum) {
        regTransitNum(CK_LT, transitNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param transitNum The value of transitNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_GreaterEqual(java.math.BigDecimal transitNum) {
        regTransitNum(CK_GE, transitNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param transitNum The value of transitNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_LessEqual(java.math.BigDecimal transitNum) {
        regTransitNum(CK_LE, transitNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of transitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of transitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTransitNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTransitNum(), "TRANSIT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param transitNumList The collection of transitNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransitNum_InScope(Collection<java.math.BigDecimal> transitNumList) {
        doSetTransitNum_InScope(transitNumList);
    }

    protected void doSetTransitNum_InScope(Collection<java.math.BigDecimal> transitNumList) {
        regINS(CK_INS, cTL(transitNumList), xgetCValueTransitNum(), "TRANSIT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param transitNumList The collection of transitNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransitNum_NotInScope(Collection<java.math.BigDecimal> transitNumList) {
        doSetTransitNum_NotInScope(transitNumList);
    }

    protected void doSetTransitNum_NotInScope(Collection<java.math.BigDecimal> transitNumList) {
        regINS(CK_NINS, cTL(transitNumList), xgetCValueTransitNum(), "TRANSIT_NUM");
    }

    protected void regTransitNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransitNum(), "TRANSIT_NUM"); }
    protected abstract ConditionValue xgetCValueTransitNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_Equal(String companycd) {
        doSetCompanycd_Equal(fRES(companycd));
    }

    protected void doSetCompanycd_Equal(String companycd) {
        regCompanycd(CK_EQ, companycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_NotEqual(String companycd) {
        doSetCompanycd_NotEqual(fRES(companycd));
    }

    protected void doSetCompanycd_NotEqual(String companycd) {
        regCompanycd(CK_NES, companycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_GreaterThan(String companycd) {
        regCompanycd(CK_GT, fRES(companycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_LessThan(String companycd) {
        regCompanycd(CK_LT, fRES(companycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_GreaterEqual(String companycd) {
        regCompanycd(CK_GE, fRES(companycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_LessEqual(String companycd) {
        regCompanycd(CK_LE, fRES(companycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycdList The collection of companycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_InScope(Collection<String> companycdList) {
        doSetCompanycd_InScope(companycdList);
    }

    protected void doSetCompanycd_InScope(Collection<String> companycdList) {
        regINS(CK_INS, cTL(companycdList), xgetCValueCompanycd(), "COMPANYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycdList The collection of companycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_NotInScope(Collection<String> companycdList) {
        doSetCompanycd_NotInScope(companycdList);
    }

    protected void doSetCompanycd_NotInScope(Collection<String> companycdList) {
        regINS(CK_NINS, cTL(companycdList), xgetCValueCompanycd(), "COMPANYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)} <br>
     * <pre>e.g. setCompanycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param companycd The value of companycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompanycd_LikeSearch(String companycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(companycd), xgetCValueCompanycd(), "COMPANYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompanycd_NotLikeSearch(String companycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(companycd), xgetCValueCompanycd(), "COMPANYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_PrefixSearch(String companycd) {
        setCompanycd_LikeSearch(companycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     */
    public void setCompanycd_IsNull() { regCompanycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     */
    public void setCompanycd_IsNullOrEmpty() { regCompanycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     */
    public void setCompanycd_IsNotNull() { regCompanycd(CK_ISNN, DOBJ); }

    protected void regCompanycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanycd(), "COMPANYCD"); }
    protected abstract ConditionValue xgetCValueCompanycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {char(1)}
     * @param logicflg1 The value of logicflg1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_Equal(String logicflg1) {
        doSetLogicflg1_Equal(fRES(logicflg1));
    }

    protected void doSetLogicflg1_Equal(String logicflg1) {
        regLogicflg1(CK_EQ, logicflg1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {char(1)}
     * @param logicflg1 The value of logicflg1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_NotEqual(String logicflg1) {
        doSetLogicflg1_NotEqual(fRES(logicflg1));
    }

    protected void doSetLogicflg1_NotEqual(String logicflg1) {
        regLogicflg1(CK_NES, logicflg1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {char(1)}
     * @param logicflg1 The value of logicflg1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_GreaterThan(String logicflg1) {
        regLogicflg1(CK_GT, fRES(logicflg1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {char(1)}
     * @param logicflg1 The value of logicflg1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_LessThan(String logicflg1) {
        regLogicflg1(CK_LT, fRES(logicflg1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {char(1)}
     * @param logicflg1 The value of logicflg1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_GreaterEqual(String logicflg1) {
        regLogicflg1(CK_GE, fRES(logicflg1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG1: {char(1)}
     * @param logicflg1 The value of logicflg1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_LessEqual(String logicflg1) {
        regLogicflg1(CK_LE, fRES(logicflg1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGICFLG1: {char(1)}
     * @param logicflg1List The collection of logicflg1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_InScope(Collection<String> logicflg1List) {
        doSetLogicflg1_InScope(logicflg1List);
    }

    protected void doSetLogicflg1_InScope(Collection<String> logicflg1List) {
        regINS(CK_INS, cTL(logicflg1List), xgetCValueLogicflg1(), "LOGICFLG1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGICFLG1: {char(1)}
     * @param logicflg1List The collection of logicflg1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_NotInScope(Collection<String> logicflg1List) {
        doSetLogicflg1_NotInScope(logicflg1List);
    }

    protected void doSetLogicflg1_NotInScope(Collection<String> logicflg1List) {
        regINS(CK_NINS, cTL(logicflg1List), xgetCValueLogicflg1(), "LOGICFLG1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG1: {char(1)} <br>
     * <pre>e.g. setLogicflg1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logicflg1 The value of logicflg1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogicflg1_LikeSearch(String logicflg1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logicflg1), xgetCValueLogicflg1(), "LOGICFLG1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG1: {char(1)}
     * @param logicflg1 The value of logicflg1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogicflg1_NotLikeSearch(String logicflg1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logicflg1), xgetCValueLogicflg1(), "LOGICFLG1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG1: {char(1)}
     * @param logicflg1 The value of logicflg1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg1_PrefixSearch(String logicflg1) {
        setLogicflg1_LikeSearch(logicflg1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOGICFLG1: {char(1)}
     */
    public void setLogicflg1_IsNull() { regLogicflg1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOGICFLG1: {char(1)}
     */
    public void setLogicflg1_IsNotNull() { regLogicflg1(CK_ISNN, DOBJ); }

    protected void regLogicflg1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogicflg1(), "LOGICFLG1"); }
    protected abstract ConditionValue xgetCValueLogicflg1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {char(1)}
     * @param logicflg2 The value of logicflg2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_Equal(String logicflg2) {
        doSetLogicflg2_Equal(fRES(logicflg2));
    }

    protected void doSetLogicflg2_Equal(String logicflg2) {
        regLogicflg2(CK_EQ, logicflg2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {char(1)}
     * @param logicflg2 The value of logicflg2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_NotEqual(String logicflg2) {
        doSetLogicflg2_NotEqual(fRES(logicflg2));
    }

    protected void doSetLogicflg2_NotEqual(String logicflg2) {
        regLogicflg2(CK_NES, logicflg2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {char(1)}
     * @param logicflg2 The value of logicflg2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_GreaterThan(String logicflg2) {
        regLogicflg2(CK_GT, fRES(logicflg2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {char(1)}
     * @param logicflg2 The value of logicflg2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_LessThan(String logicflg2) {
        regLogicflg2(CK_LT, fRES(logicflg2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {char(1)}
     * @param logicflg2 The value of logicflg2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_GreaterEqual(String logicflg2) {
        regLogicflg2(CK_GE, fRES(logicflg2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG2: {char(1)}
     * @param logicflg2 The value of logicflg2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_LessEqual(String logicflg2) {
        regLogicflg2(CK_LE, fRES(logicflg2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGICFLG2: {char(1)}
     * @param logicflg2List The collection of logicflg2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_InScope(Collection<String> logicflg2List) {
        doSetLogicflg2_InScope(logicflg2List);
    }

    protected void doSetLogicflg2_InScope(Collection<String> logicflg2List) {
        regINS(CK_INS, cTL(logicflg2List), xgetCValueLogicflg2(), "LOGICFLG2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGICFLG2: {char(1)}
     * @param logicflg2List The collection of logicflg2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_NotInScope(Collection<String> logicflg2List) {
        doSetLogicflg2_NotInScope(logicflg2List);
    }

    protected void doSetLogicflg2_NotInScope(Collection<String> logicflg2List) {
        regINS(CK_NINS, cTL(logicflg2List), xgetCValueLogicflg2(), "LOGICFLG2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG2: {char(1)} <br>
     * <pre>e.g. setLogicflg2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logicflg2 The value of logicflg2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogicflg2_LikeSearch(String logicflg2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logicflg2), xgetCValueLogicflg2(), "LOGICFLG2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG2: {char(1)}
     * @param logicflg2 The value of logicflg2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogicflg2_NotLikeSearch(String logicflg2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logicflg2), xgetCValueLogicflg2(), "LOGICFLG2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG2: {char(1)}
     * @param logicflg2 The value of logicflg2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg2_PrefixSearch(String logicflg2) {
        setLogicflg2_LikeSearch(logicflg2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOGICFLG2: {char(1)}
     */
    public void setLogicflg2_IsNull() { regLogicflg2(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOGICFLG2: {char(1)}
     */
    public void setLogicflg2_IsNotNull() { regLogicflg2(CK_ISNN, DOBJ); }

    protected void regLogicflg2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogicflg2(), "LOGICFLG2"); }
    protected abstract ConditionValue xgetCValueLogicflg2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {char(1)}
     * @param logicflg3 The value of logicflg3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_Equal(String logicflg3) {
        doSetLogicflg3_Equal(fRES(logicflg3));
    }

    protected void doSetLogicflg3_Equal(String logicflg3) {
        regLogicflg3(CK_EQ, logicflg3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {char(1)}
     * @param logicflg3 The value of logicflg3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_NotEqual(String logicflg3) {
        doSetLogicflg3_NotEqual(fRES(logicflg3));
    }

    protected void doSetLogicflg3_NotEqual(String logicflg3) {
        regLogicflg3(CK_NES, logicflg3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {char(1)}
     * @param logicflg3 The value of logicflg3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_GreaterThan(String logicflg3) {
        regLogicflg3(CK_GT, fRES(logicflg3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {char(1)}
     * @param logicflg3 The value of logicflg3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_LessThan(String logicflg3) {
        regLogicflg3(CK_LT, fRES(logicflg3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {char(1)}
     * @param logicflg3 The value of logicflg3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_GreaterEqual(String logicflg3) {
        regLogicflg3(CK_GE, fRES(logicflg3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGICFLG3: {char(1)}
     * @param logicflg3 The value of logicflg3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_LessEqual(String logicflg3) {
        regLogicflg3(CK_LE, fRES(logicflg3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGICFLG3: {char(1)}
     * @param logicflg3List The collection of logicflg3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_InScope(Collection<String> logicflg3List) {
        doSetLogicflg3_InScope(logicflg3List);
    }

    protected void doSetLogicflg3_InScope(Collection<String> logicflg3List) {
        regINS(CK_INS, cTL(logicflg3List), xgetCValueLogicflg3(), "LOGICFLG3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGICFLG3: {char(1)}
     * @param logicflg3List The collection of logicflg3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_NotInScope(Collection<String> logicflg3List) {
        doSetLogicflg3_NotInScope(logicflg3List);
    }

    protected void doSetLogicflg3_NotInScope(Collection<String> logicflg3List) {
        regINS(CK_NINS, cTL(logicflg3List), xgetCValueLogicflg3(), "LOGICFLG3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG3: {char(1)} <br>
     * <pre>e.g. setLogicflg3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logicflg3 The value of logicflg3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogicflg3_LikeSearch(String logicflg3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logicflg3), xgetCValueLogicflg3(), "LOGICFLG3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG3: {char(1)}
     * @param logicflg3 The value of logicflg3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogicflg3_NotLikeSearch(String logicflg3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logicflg3), xgetCValueLogicflg3(), "LOGICFLG3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGICFLG3: {char(1)}
     * @param logicflg3 The value of logicflg3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogicflg3_PrefixSearch(String logicflg3) {
        setLogicflg3_LikeSearch(logicflg3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOGICFLG3: {char(1)}
     */
    public void setLogicflg3_IsNull() { regLogicflg3(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOGICFLG3: {char(1)}
     */
    public void setLogicflg3_IsNotNull() { regLogicflg3(CK_ISNN, DOBJ); }

    protected void regLogicflg3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogicflg3(), "LOGICFLG3"); }
    protected abstract ConditionValue xgetCValueLogicflg3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_Equal(String tagcd) {
        doSetTagcd_Equal(fRES(tagcd));
    }

    protected void doSetTagcd_Equal(String tagcd) {
        regTagcd(CK_EQ, tagcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_NotEqual(String tagcd) {
        doSetTagcd_NotEqual(fRES(tagcd));
    }

    protected void doSetTagcd_NotEqual(String tagcd) {
        regTagcd(CK_NES, tagcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_GreaterThan(String tagcd) {
        regTagcd(CK_GT, fRES(tagcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_LessThan(String tagcd) {
        regTagcd(CK_LT, fRES(tagcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_GreaterEqual(String tagcd) {
        regTagcd(CK_GE, fRES(tagcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_LessEqual(String tagcd) {
        regTagcd(CK_LE, fRES(tagcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcdList The collection of tagcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_InScope(Collection<String> tagcdList) {
        doSetTagcd_InScope(tagcdList);
    }

    protected void doSetTagcd_InScope(Collection<String> tagcdList) {
        regINS(CK_INS, cTL(tagcdList), xgetCValueTagcd(), "TAGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcdList The collection of tagcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_NotInScope(Collection<String> tagcdList) {
        doSetTagcd_NotInScope(tagcdList);
    }

    protected void doSetTagcd_NotInScope(Collection<String> tagcdList) {
        regINS(CK_NINS, cTL(tagcdList), xgetCValueTagcd(), "TAGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAGCD: {varchar(30)} <br>
     * <pre>e.g. setTagcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tagcd The value of tagcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTagcd_LikeSearch(String tagcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tagcd), xgetCValueTagcd(), "TAGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTagcd_NotLikeSearch(String tagcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tagcd), xgetCValueTagcd(), "TAGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_PrefixSearch(String tagcd) {
        setTagcd_LikeSearch(tagcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     */
    public void setTagcd_IsNull() { regTagcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     */
    public void setTagcd_IsNullOrEmpty() { regTagcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     */
    public void setTagcd_IsNotNull() { regTagcd(CK_ISNN, DOBJ); }

    protected void regTagcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagcd(), "TAGCD"); }
    protected abstract ConditionValue xgetCValueTagcd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2AVG: {decimal(16, 6)}
     * @param qty2avg The value of qty2avg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2avg_Equal(java.math.BigDecimal qty2avg) {
        doSetQty2avg_Equal(qty2avg);
    }

    protected void doSetQty2avg_Equal(java.math.BigDecimal qty2avg) {
        regQty2avg(CK_EQ, qty2avg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2AVG: {decimal(16, 6)}
     * @param qty2avg The value of qty2avg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2avg_NotEqual(java.math.BigDecimal qty2avg) {
        doSetQty2avg_NotEqual(qty2avg);
    }

    protected void doSetQty2avg_NotEqual(java.math.BigDecimal qty2avg) {
        regQty2avg(CK_NES, qty2avg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2AVG: {decimal(16, 6)}
     * @param qty2avg The value of qty2avg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2avg_GreaterThan(java.math.BigDecimal qty2avg) {
        regQty2avg(CK_GT, qty2avg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2AVG: {decimal(16, 6)}
     * @param qty2avg The value of qty2avg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2avg_LessThan(java.math.BigDecimal qty2avg) {
        regQty2avg(CK_LT, qty2avg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2AVG: {decimal(16, 6)}
     * @param qty2avg The value of qty2avg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2avg_GreaterEqual(java.math.BigDecimal qty2avg) {
        regQty2avg(CK_GE, qty2avg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2AVG: {decimal(16, 6)}
     * @param qty2avg The value of qty2avg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2avg_LessEqual(java.math.BigDecimal qty2avg) {
        regQty2avg(CK_LE, qty2avg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2AVG: {decimal(16, 6)}
     * @param minNumber The min number of qty2avg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty2avg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty2avg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty2avg(), "QTY2AVG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY2AVG: {decimal(16, 6)}
     * @param qty2avgList The collection of qty2avg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty2avg_InScope(Collection<java.math.BigDecimal> qty2avgList) {
        doSetQty2avg_InScope(qty2avgList);
    }

    protected void doSetQty2avg_InScope(Collection<java.math.BigDecimal> qty2avgList) {
        regINS(CK_INS, cTL(qty2avgList), xgetCValueQty2avg(), "QTY2AVG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY2AVG: {decimal(16, 6)}
     * @param qty2avgList The collection of qty2avg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty2avg_NotInScope(Collection<java.math.BigDecimal> qty2avgList) {
        doSetQty2avg_NotInScope(qty2avgList);
    }

    protected void doSetQty2avg_NotInScope(Collection<java.math.BigDecimal> qty2avgList) {
        regINS(CK_NINS, cTL(qty2avgList), xgetCValueQty2avg(), "QTY2AVG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY2AVG: {decimal(16, 6)}
     */
    public void setQty2avg_IsNull() { regQty2avg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY2AVG: {decimal(16, 6)}
     */
    public void setQty2avg_IsNotNull() { regQty2avg(CK_ISNN, DOBJ); }

    protected void regQty2avg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty2avg(), "QTY2AVG"); }
    protected abstract ConditionValue xgetCValueQty2avg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3AVG: {decimal(16, 6)}
     * @param qty3avg The value of qty3avg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3avg_Equal(java.math.BigDecimal qty3avg) {
        doSetQty3avg_Equal(qty3avg);
    }

    protected void doSetQty3avg_Equal(java.math.BigDecimal qty3avg) {
        regQty3avg(CK_EQ, qty3avg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3AVG: {decimal(16, 6)}
     * @param qty3avg The value of qty3avg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3avg_NotEqual(java.math.BigDecimal qty3avg) {
        doSetQty3avg_NotEqual(qty3avg);
    }

    protected void doSetQty3avg_NotEqual(java.math.BigDecimal qty3avg) {
        regQty3avg(CK_NES, qty3avg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3AVG: {decimal(16, 6)}
     * @param qty3avg The value of qty3avg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3avg_GreaterThan(java.math.BigDecimal qty3avg) {
        regQty3avg(CK_GT, qty3avg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3AVG: {decimal(16, 6)}
     * @param qty3avg The value of qty3avg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3avg_LessThan(java.math.BigDecimal qty3avg) {
        regQty3avg(CK_LT, qty3avg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3AVG: {decimal(16, 6)}
     * @param qty3avg The value of qty3avg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3avg_GreaterEqual(java.math.BigDecimal qty3avg) {
        regQty3avg(CK_GE, qty3avg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3AVG: {decimal(16, 6)}
     * @param qty3avg The value of qty3avg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3avg_LessEqual(java.math.BigDecimal qty3avg) {
        regQty3avg(CK_LE, qty3avg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3AVG: {decimal(16, 6)}
     * @param minNumber The min number of qty3avg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty3avg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty3avg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty3avg(), "QTY3AVG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY3AVG: {decimal(16, 6)}
     * @param qty3avgList The collection of qty3avg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty3avg_InScope(Collection<java.math.BigDecimal> qty3avgList) {
        doSetQty3avg_InScope(qty3avgList);
    }

    protected void doSetQty3avg_InScope(Collection<java.math.BigDecimal> qty3avgList) {
        regINS(CK_INS, cTL(qty3avgList), xgetCValueQty3avg(), "QTY3AVG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY3AVG: {decimal(16, 6)}
     * @param qty3avgList The collection of qty3avg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty3avg_NotInScope(Collection<java.math.BigDecimal> qty3avgList) {
        doSetQty3avg_NotInScope(qty3avgList);
    }

    protected void doSetQty3avg_NotInScope(Collection<java.math.BigDecimal> qty3avgList) {
        regINS(CK_NINS, cTL(qty3avgList), xgetCValueQty3avg(), "QTY3AVG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY3AVG: {decimal(16, 6)}
     */
    public void setQty3avg_IsNull() { regQty3avg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY3AVG: {decimal(16, 6)}
     */
    public void setQty3avg_IsNotNull() { regQty3avg(CK_ISNN, DOBJ); }

    protected void regQty3avg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty3avg(), "QTY3AVG"); }
    protected abstract ConditionValue xgetCValueQty3avg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1INSTRUCTED: {bigint(19)}
     * @param qty1instructed The value of qty1instructed as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1instructed_Equal(Long qty1instructed) {
        doSetQty1instructed_Equal(qty1instructed);
    }

    protected void doSetQty1instructed_Equal(Long qty1instructed) {
        regQty1instructed(CK_EQ, qty1instructed);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1INSTRUCTED: {bigint(19)}
     * @param qty1instructed The value of qty1instructed as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1instructed_NotEqual(Long qty1instructed) {
        doSetQty1instructed_NotEqual(qty1instructed);
    }

    protected void doSetQty1instructed_NotEqual(Long qty1instructed) {
        regQty1instructed(CK_NES, qty1instructed);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1INSTRUCTED: {bigint(19)}
     * @param qty1instructed The value of qty1instructed as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1instructed_GreaterThan(Long qty1instructed) {
        regQty1instructed(CK_GT, qty1instructed);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1INSTRUCTED: {bigint(19)}
     * @param qty1instructed The value of qty1instructed as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1instructed_LessThan(Long qty1instructed) {
        regQty1instructed(CK_LT, qty1instructed);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1INSTRUCTED: {bigint(19)}
     * @param qty1instructed The value of qty1instructed as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1instructed_GreaterEqual(Long qty1instructed) {
        regQty1instructed(CK_GE, qty1instructed);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1INSTRUCTED: {bigint(19)}
     * @param qty1instructed The value of qty1instructed as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1instructed_LessEqual(Long qty1instructed) {
        regQty1instructed(CK_LE, qty1instructed);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1INSTRUCTED: {bigint(19)}
     * @param minNumber The min number of qty1instructed. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty1instructed. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty1instructed_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty1instructed(), "QTY1INSTRUCTED", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY1INSTRUCTED: {bigint(19)}
     * @param qty1instructedList The collection of qty1instructed as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1instructed_InScope(Collection<Long> qty1instructedList) {
        doSetQty1instructed_InScope(qty1instructedList);
    }

    protected void doSetQty1instructed_InScope(Collection<Long> qty1instructedList) {
        regINS(CK_INS, cTL(qty1instructedList), xgetCValueQty1instructed(), "QTY1INSTRUCTED");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY1INSTRUCTED: {bigint(19)}
     * @param qty1instructedList The collection of qty1instructed as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1instructed_NotInScope(Collection<Long> qty1instructedList) {
        doSetQty1instructed_NotInScope(qty1instructedList);
    }

    protected void doSetQty1instructed_NotInScope(Collection<Long> qty1instructedList) {
        regINS(CK_NINS, cTL(qty1instructedList), xgetCValueQty1instructed(), "QTY1INSTRUCTED");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY1INSTRUCTED: {bigint(19)}
     */
    public void setQty1instructed_IsNull() { regQty1instructed(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY1INSTRUCTED: {bigint(19)}
     */
    public void setQty1instructed_IsNotNull() { regQty1instructed(CK_ISNN, DOBJ); }

    protected void regQty1instructed(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty1instructed(), "QTY1INSTRUCTED"); }
    protected abstract ConditionValue xgetCValueQty1instructed();

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
    public HpSLCFunction<TStockCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TStockCB.class);
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
    public HpSLCFunction<TStockCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TStockCB.class);
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
    public HpSLCFunction<TStockCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TStockCB.class);
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
    public HpSLCFunction<TStockCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TStockCB.class);
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
    public HpSLCFunction<TStockCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TStockCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TStockCB&gt;() {
     *     public void query(TStockCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TStockCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TStockCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TStockCQ sq);

    protected TStockCB xcreateScalarConditionCB() {
        TStockCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TStockCB xcreateScalarConditionPartitionByCB() {
        TStockCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TStockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockCB cb = new TStockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "STOCK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TStockCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TStockCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TStockCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockCB cb = new TStockCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "STOCK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TStockCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TStockCQ sq);

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
    protected TStockCB newMyCB() {
        return new TStockCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TStockCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
