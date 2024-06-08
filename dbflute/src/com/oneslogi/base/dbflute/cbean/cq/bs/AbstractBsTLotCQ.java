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
 * The abstract condition-query of T_LOT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTLotCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTLotCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_LOT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * LOT_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * LOT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param lotId The value of lotId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterThan(Long lotId) {
        regLotId(CK_GT, lotId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param lotId The value of lotId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessThan(Long lotId) {
        regLotId(CK_LT, lotId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param lotId The value of lotId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterEqual(Long lotId) {
        regLotId(CK_GE, lotId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param lotId The value of lotId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessEqual(Long lotId) {
        regLotId(CK_LE, lotId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotId(), "LOT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * LOT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param lotIdList The collection of lotId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_NotInScope(Collection<Long> lotIdList) {
        doSetLotId_NotInScope(lotIdList);
    }

    protected void doSetLotId_NotInScope(Collection<Long> lotIdList) {
        regINS(CK_NINS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOT_ID from T_ALLOC_INST_B where ...)} <br>
     * T_ALLOC_INST_B by LOT_ID, named 'TAllocInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocInstBList for 'exists'. (NotNull)
     */
    public void existsTAllocInstBList(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_ExistsReferrer_TAllocInstBList(cb.query());
        registerExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "tAllocInstBList");
    }
    public abstract String keepLotId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOT_ID from T_ALLOC_LOT where ...)} <br>
     * T_ALLOC_LOT by LOT_ID, named 'TAllocLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocLotList for 'exists'. (NotNull)
     */
    public void existsTAllocLotList(SubQuery<TAllocLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_ExistsReferrer_TAllocLotList(cb.query());
        registerExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "tAllocLotList");
    }
    public abstract String keepLotId_ExistsReferrer_TAllocLotList(TAllocLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOT_ID from T_INVENTORY_B where ...)} <br>
     * T_INVENTORY_B by LOT_ID, named 'TInventoryBAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_ExistsReferrer_TInventoryBList(cb.query());
        registerExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "tInventoryBList");
    }
    public abstract String keepLotId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOT_ID from T_KEEPING_LOT where ...)} <br>
     * T_KEEPING_LOT by LOT_ID, named 'TKeepingLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTKeepingLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TKeepingLotList for 'exists'. (NotNull)
     */
    public void existsTKeepingLotList(SubQuery<TKeepingLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_ExistsReferrer_TKeepingLotList(cb.query());
        registerExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "tKeepingLotList");
    }
    public abstract String keepLotId_ExistsReferrer_TKeepingLotList(TKeepingLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOT_ID from T_LAST_LOT where ...)} <br>
     * T_LAST_LOT by LOT_ID, named 'TLastLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTLastLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TLastLotList for 'exists'. (NotNull)
     */
    public void existsTLastLotList(SubQuery<TLastLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_ExistsReferrer_TLastLotList(cb.query());
        registerExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "tLastLotList");
    }
    public abstract String keepLotId_ExistsReferrer_TLastLotList(TLastLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOT_ID from T_MOVE_INST_B where ...)} <br>
     * T_MOVE_INST_B by LOT_ID, named 'TMoveInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTMoveInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TMoveInstBList for 'exists'. (NotNull)
     */
    public void existsTMoveInstBList(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_ExistsReferrer_TMoveInstBList(cb.query());
        registerExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "tMoveInstBList");
    }
    public abstract String keepLotId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOT_ID from T_SHIPPING_INST_B where ...)} <br>
     * T_SHIPPING_INST_B by LOT_ID, named 'TShippingInstBAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_ExistsReferrer_TShippingInstBList(cb.query());
        registerExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "tShippingInstBList");
    }
    public abstract String keepLotId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOT_ID from T_STOCK where ...)} <br>
     * T_STOCK by LOT_ID, named 'TStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStockList</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStockList for 'exists'. (NotNull)
     */
    public void existsTStockList(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_ExistsReferrer_TStockList(cb.query());
        registerExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "tStockList");
    }
    public abstract String keepLotId_ExistsReferrer_TStockList(TStockCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOT_ID from W_HT_INVENTORY_INPUT_PROD where ...)} <br>
     * W_HT_INVENTORY_INPUT_PROD by LOT_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtInventoryInputProdList</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtInventoryInputProdList for 'exists'. (NotNull)
     */
    public void existsWHtInventoryInputProdList(SubQuery<WHtInventoryInputProdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_ExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepLotId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOT_ID from W_HT_RECEIVE_INSPECTION where ...)} <br>
     * W_HT_RECEIVE_INSPECTION by LOT_ID, named 'WHtReceiveInspectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtReceiveInspectionList</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspectionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtReceiveInspectionList for 'exists'. (NotNull)
     */
    public void existsWHtReceiveInspectionList(SubQuery<WHtReceiveInspectionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_ExistsReferrer_WHtReceiveInspectionList(cb.query());
        registerExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "wHtReceiveInspectionList");
    }
    public abstract String keepLotId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOT_ID from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by LOT_ID, named 'WHtReceiveNoPlanInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtReceiveNoPlanInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtReceiveNoPlanInspList for 'exists'. (NotNull)
     */
    public void existsWHtReceiveNoPlanInspList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_ExistsReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "wHtReceiveNoPlanInspList");
    }
    public abstract String keepLotId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOT_ID from W_HT_RECEIVE_STORE where ...)} <br>
     * W_HT_RECEIVE_STORE by LOT_ID, named 'WHtReceiveStoreAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtReceiveStoreList</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     storeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtReceiveStoreList for 'exists'. (NotNull)
     */
    public void existsWHtReceiveStoreList(SubQuery<WHtReceiveStoreCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_ExistsReferrer_WHtReceiveStoreList(cb.query());
        registerExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "wHtReceiveStoreList");
    }
    public abstract String keepLotId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOT_ID from W_HT_SHIPPING_PICKING where ...)} <br>
     * W_HT_SHIPPING_PICKING by LOT_ID, named 'WHtShippingPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtShippingPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtShippingPickingList for 'exists'. (NotNull)
     */
    public void existsWHtShippingPickingList(SubQuery<WHtShippingPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_ExistsReferrer_WHtShippingPickingList(cb.query());
        registerExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "wHtShippingPickingList");
    }
    public abstract String keepLotId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOT_ID from T_ALLOC_INST_B where ...)} <br>
     * T_ALLOC_INST_B by LOT_ID, named 'TAllocInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LotId_NotExistsReferrer_TAllocInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstBList(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_NotExistsReferrer_TAllocInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "tAllocInstBList");
    }
    public abstract String keepLotId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOT_ID from T_ALLOC_LOT where ...)} <br>
     * T_ALLOC_LOT by LOT_ID, named 'TAllocLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LotId_NotExistsReferrer_TAllocLotList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocLotList(SubQuery<TAllocLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_NotExistsReferrer_TAllocLotList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "tAllocLotList");
    }
    public abstract String keepLotId_NotExistsReferrer_TAllocLotList(TAllocLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOT_ID from T_INVENTORY_B where ...)} <br>
     * T_INVENTORY_B by LOT_ID, named 'TInventoryBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LotId_NotExistsReferrer_TInventoryBList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryBList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_NotExistsReferrer_TInventoryBList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "tInventoryBList");
    }
    public abstract String keepLotId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOT_ID from T_KEEPING_LOT where ...)} <br>
     * T_KEEPING_LOT by LOT_ID, named 'TKeepingLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTKeepingLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LotId_NotExistsReferrer_TKeepingLotList for 'not exists'. (NotNull)
     */
    public void notExistsTKeepingLotList(SubQuery<TKeepingLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_NotExistsReferrer_TKeepingLotList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "tKeepingLotList");
    }
    public abstract String keepLotId_NotExistsReferrer_TKeepingLotList(TKeepingLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOT_ID from T_LAST_LOT where ...)} <br>
     * T_LAST_LOT by LOT_ID, named 'TLastLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTLastLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LotId_NotExistsReferrer_TLastLotList for 'not exists'. (NotNull)
     */
    public void notExistsTLastLotList(SubQuery<TLastLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_NotExistsReferrer_TLastLotList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "tLastLotList");
    }
    public abstract String keepLotId_NotExistsReferrer_TLastLotList(TLastLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOT_ID from T_MOVE_INST_B where ...)} <br>
     * T_MOVE_INST_B by LOT_ID, named 'TMoveInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LotId_NotExistsReferrer_TMoveInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTMoveInstBList(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_NotExistsReferrer_TMoveInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "tMoveInstBList");
    }
    public abstract String keepLotId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOT_ID from T_SHIPPING_INST_B where ...)} <br>
     * T_SHIPPING_INST_B by LOT_ID, named 'TShippingInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LotId_NotExistsReferrer_TShippingInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstBList(SubQuery<TShippingInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_NotExistsReferrer_TShippingInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "tShippingInstBList");
    }
    public abstract String keepLotId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOT_ID from T_STOCK where ...)} <br>
     * T_STOCK by LOT_ID, named 'TStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStockList</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LotId_NotExistsReferrer_TStockList for 'not exists'. (NotNull)
     */
    public void notExistsTStockList(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_NotExistsReferrer_TStockList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "tStockList");
    }
    public abstract String keepLotId_NotExistsReferrer_TStockList(TStockCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOT_ID from W_HT_INVENTORY_INPUT_PROD where ...)} <br>
     * W_HT_INVENTORY_INPUT_PROD by LOT_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtInventoryInputProdList</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LotId_NotExistsReferrer_WHtInventoryInputProdList for 'not exists'. (NotNull)
     */
    public void notExistsWHtInventoryInputProdList(SubQuery<WHtInventoryInputProdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_NotExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepLotId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOT_ID from W_HT_RECEIVE_INSPECTION where ...)} <br>
     * W_HT_RECEIVE_INSPECTION by LOT_ID, named 'WHtReceiveInspectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveInspectionList</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspectionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LotId_NotExistsReferrer_WHtReceiveInspectionList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveInspectionList(SubQuery<WHtReceiveInspectionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_NotExistsReferrer_WHtReceiveInspectionList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "wHtReceiveInspectionList");
    }
    public abstract String keepLotId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOT_ID from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by LOT_ID, named 'WHtReceiveNoPlanInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveNoPlanInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LotId_NotExistsReferrer_WHtReceiveNoPlanInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveNoPlanInspList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_NotExistsReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "wHtReceiveNoPlanInspList");
    }
    public abstract String keepLotId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOT_ID from W_HT_RECEIVE_STORE where ...)} <br>
     * W_HT_RECEIVE_STORE by LOT_ID, named 'WHtReceiveStoreAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveStoreList</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     storeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LotId_NotExistsReferrer_WHtReceiveStoreList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveStoreList(SubQuery<WHtReceiveStoreCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_NotExistsReferrer_WHtReceiveStoreList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "wHtReceiveStoreList");
    }
    public abstract String keepLotId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOT_ID from W_HT_SHIPPING_PICKING where ...)} <br>
     * W_HT_SHIPPING_PICKING by LOT_ID, named 'WHtShippingPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtShippingPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LotId_NotExistsReferrer_WHtShippingPickingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtShippingPickingList(SubQuery<WHtShippingPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLotId_NotExistsReferrer_WHtShippingPickingList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOT_ID", "LOT_ID", pp, "wHtShippingPickingList");
    }
    public abstract String keepLotId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    public void xsderiveTAllocInstBList(String fn, SubQuery<TAllocInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLotId_SpecifyDerivedReferrer_TAllocInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", pp, "tAllocInstBList", al, op);
    }
    public abstract String keepLotId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq);

    public void xsderiveTAllocLotList(String fn, SubQuery<TAllocLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLotId_SpecifyDerivedReferrer_TAllocLotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", pp, "tAllocLotList", al, op);
    }
    public abstract String keepLotId_SpecifyDerivedReferrer_TAllocLotList(TAllocLotCQ sq);

    public void xsderiveTInventoryBList(String fn, SubQuery<TInventoryBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLotId_SpecifyDerivedReferrer_TInventoryBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", pp, "tInventoryBList", al, op);
    }
    public abstract String keepLotId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq);

    public void xsderiveTKeepingLotList(String fn, SubQuery<TKeepingLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLotId_SpecifyDerivedReferrer_TKeepingLotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", pp, "tKeepingLotList", al, op);
    }
    public abstract String keepLotId_SpecifyDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq);

    public void xsderiveTLastLotList(String fn, SubQuery<TLastLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLotId_SpecifyDerivedReferrer_TLastLotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", pp, "tLastLotList", al, op);
    }
    public abstract String keepLotId_SpecifyDerivedReferrer_TLastLotList(TLastLotCQ sq);

    public void xsderiveTMoveInstBList(String fn, SubQuery<TMoveInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLotId_SpecifyDerivedReferrer_TMoveInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", pp, "tMoveInstBList", al, op);
    }
    public abstract String keepLotId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq);

    public void xsderiveTShippingInstBList(String fn, SubQuery<TShippingInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLotId_SpecifyDerivedReferrer_TShippingInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", pp, "tShippingInstBList", al, op);
    }
    public abstract String keepLotId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq);

    public void xsderiveTStockList(String fn, SubQuery<TStockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockCB cb = new TStockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLotId_SpecifyDerivedReferrer_TStockList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", pp, "tStockList", al, op);
    }
    public abstract String keepLotId_SpecifyDerivedReferrer_TStockList(TStockCQ sq);

    public void xsderiveWHtInventoryInputProdList(String fn, SubQuery<WHtInventoryInputProdCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLotId_SpecifyDerivedReferrer_WHtInventoryInputProdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", pp, "wHtInventoryInputProdList", al, op);
    }
    public abstract String keepLotId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    public void xsderiveWHtReceiveInspectionList(String fn, SubQuery<WHtReceiveInspectionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLotId_SpecifyDerivedReferrer_WHtReceiveInspectionList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", pp, "wHtReceiveInspectionList", al, op);
    }
    public abstract String keepLotId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    public void xsderiveWHtReceiveNoPlanInspList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLotId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", pp, "wHtReceiveNoPlanInspList", al, op);
    }
    public abstract String keepLotId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    public void xsderiveWHtReceiveStoreList(String fn, SubQuery<WHtReceiveStoreCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLotId_SpecifyDerivedReferrer_WHtReceiveStoreList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", pp, "wHtReceiveStoreList", al, op);
    }
    public abstract String keepLotId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    public void xsderiveWHtShippingPickingList(String fn, SubQuery<WHtShippingPickingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLotId_SpecifyDerivedReferrer_WHtShippingPickingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", pp, "wHtShippingPickingList", al, op);
    }
    public abstract String keepLotId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_ALLOC_INST_B where ...)} <br>
     * T_ALLOC_INST_B by LOT_ID, named 'TAllocInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocInstBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocInstBCB> derivedTAllocInstBList() {
        return xcreateQDRFunctionTAllocInstBList();
    }
    protected HpQDRFunction<TAllocInstBCB> xcreateQDRFunctionTAllocInstBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAllocInstBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAllocInstBList(String fn, SubQuery<TAllocInstBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLotId_QueryDerivedReferrer_TAllocInstBList(cb.query()); String prpp = keepLotId_QueryDerivedReferrer_TAllocInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", sqpp, "tAllocInstBList", rd, vl, prpp, op);
    }
    public abstract String keepLotId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq);
    public abstract String keepLotId_QueryDerivedReferrer_TAllocInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_ALLOC_LOT where ...)} <br>
     * T_ALLOC_LOT by LOT_ID, named 'TAllocLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocLotList()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     lotCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocLotCB> derivedTAllocLotList() {
        return xcreateQDRFunctionTAllocLotList();
    }
    protected HpQDRFunction<TAllocLotCB> xcreateQDRFunctionTAllocLotList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAllocLotList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAllocLotList(String fn, SubQuery<TAllocLotCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLotId_QueryDerivedReferrer_TAllocLotList(cb.query()); String prpp = keepLotId_QueryDerivedReferrer_TAllocLotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", sqpp, "tAllocLotList", rd, vl, prpp, op);
    }
    public abstract String keepLotId_QueryDerivedReferrer_TAllocLotList(TAllocLotCQ sq);
    public abstract String keepLotId_QueryDerivedReferrer_TAllocLotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_INVENTORY_B where ...)} <br>
     * T_INVENTORY_B by LOT_ID, named 'TInventoryBAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepLotId_QueryDerivedReferrer_TInventoryBList(cb.query()); String prpp = keepLotId_QueryDerivedReferrer_TInventoryBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", sqpp, "tInventoryBList", rd, vl, prpp, op);
    }
    public abstract String keepLotId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq);
    public abstract String keepLotId_QueryDerivedReferrer_TInventoryBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_KEEPING_LOT where ...)} <br>
     * T_KEEPING_LOT by LOT_ID, named 'TKeepingLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTKeepingLotList()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     lotCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TKeepingLotCB> derivedTKeepingLotList() {
        return xcreateQDRFunctionTKeepingLotList();
    }
    protected HpQDRFunction<TKeepingLotCB> xcreateQDRFunctionTKeepingLotList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTKeepingLotList(fn, sq, rd, vl, op));
    }
    public void xqderiveTKeepingLotList(String fn, SubQuery<TKeepingLotCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLotId_QueryDerivedReferrer_TKeepingLotList(cb.query()); String prpp = keepLotId_QueryDerivedReferrer_TKeepingLotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", sqpp, "tKeepingLotList", rd, vl, prpp, op);
    }
    public abstract String keepLotId_QueryDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq);
    public abstract String keepLotId_QueryDerivedReferrer_TKeepingLotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_LAST_LOT where ...)} <br>
     * T_LAST_LOT by LOT_ID, named 'TLastLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTLastLotList()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     lotCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TLastLotCB> derivedTLastLotList() {
        return xcreateQDRFunctionTLastLotList();
    }
    protected HpQDRFunction<TLastLotCB> xcreateQDRFunctionTLastLotList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTLastLotList(fn, sq, rd, vl, op));
    }
    public void xqderiveTLastLotList(String fn, SubQuery<TLastLotCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLotId_QueryDerivedReferrer_TLastLotList(cb.query()); String prpp = keepLotId_QueryDerivedReferrer_TLastLotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", sqpp, "tLastLotList", rd, vl, prpp, op);
    }
    public abstract String keepLotId_QueryDerivedReferrer_TLastLotList(TLastLotCQ sq);
    public abstract String keepLotId_QueryDerivedReferrer_TLastLotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_MOVE_INST_B where ...)} <br>
     * T_MOVE_INST_B by LOT_ID, named 'TMoveInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTMoveInstBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TMoveInstBCB> derivedTMoveInstBList() {
        return xcreateQDRFunctionTMoveInstBList();
    }
    protected HpQDRFunction<TMoveInstBCB> xcreateQDRFunctionTMoveInstBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTMoveInstBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTMoveInstBList(String fn, SubQuery<TMoveInstBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLotId_QueryDerivedReferrer_TMoveInstBList(cb.query()); String prpp = keepLotId_QueryDerivedReferrer_TMoveInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", sqpp, "tMoveInstBList", rd, vl, prpp, op);
    }
    public abstract String keepLotId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq);
    public abstract String keepLotId_QueryDerivedReferrer_TMoveInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_SHIPPING_INST_B where ...)} <br>
     * T_SHIPPING_INST_B by LOT_ID, named 'TShippingInstBAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepLotId_QueryDerivedReferrer_TShippingInstBList(cb.query()); String prpp = keepLotId_QueryDerivedReferrer_TShippingInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", sqpp, "tShippingInstBList", rd, vl, prpp, op);
    }
    public abstract String keepLotId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq);
    public abstract String keepLotId_QueryDerivedReferrer_TShippingInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_STOCK where ...)} <br>
     * T_STOCK by LOT_ID, named 'TStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStockList()</span>.<span style="color: #CC4747">max</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     stockCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStockCB> derivedTStockList() {
        return xcreateQDRFunctionTStockList();
    }
    protected HpQDRFunction<TStockCB> xcreateQDRFunctionTStockList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStockList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStockList(String fn, SubQuery<TStockCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockCB cb = new TStockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLotId_QueryDerivedReferrer_TStockList(cb.query()); String prpp = keepLotId_QueryDerivedReferrer_TStockListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", sqpp, "tStockList", rd, vl, prpp, op);
    }
    public abstract String keepLotId_QueryDerivedReferrer_TStockList(TStockCQ sq);
    public abstract String keepLotId_QueryDerivedReferrer_TStockListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_INVENTORY_INPUT_PROD where ...)} <br>
     * W_HT_INVENTORY_INPUT_PROD by LOT_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtInventoryInputProdList()</span>.<span style="color: #CC4747">max</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     prodCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtInventoryInputProdCB> derivedWHtInventoryInputProdList() {
        return xcreateQDRFunctionWHtInventoryInputProdList();
    }
    protected HpQDRFunction<WHtInventoryInputProdCB> xcreateQDRFunctionWHtInventoryInputProdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtInventoryInputProdList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtInventoryInputProdList(String fn, SubQuery<WHtInventoryInputProdCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLotId_QueryDerivedReferrer_WHtInventoryInputProdList(cb.query()); String prpp = keepLotId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", sqpp, "wHtInventoryInputProdList", rd, vl, prpp, op);
    }
    public abstract String keepLotId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);
    public abstract String keepLotId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_RECEIVE_INSPECTION where ...)} <br>
     * W_HT_RECEIVE_INSPECTION by LOT_ID, named 'WHtReceiveInspectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtReceiveInspectionList()</span>.<span style="color: #CC4747">max</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspectionCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspectionCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtReceiveInspectionCB> derivedWHtReceiveInspectionList() {
        return xcreateQDRFunctionWHtReceiveInspectionList();
    }
    protected HpQDRFunction<WHtReceiveInspectionCB> xcreateQDRFunctionWHtReceiveInspectionList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtReceiveInspectionList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtReceiveInspectionList(String fn, SubQuery<WHtReceiveInspectionCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLotId_QueryDerivedReferrer_WHtReceiveInspectionList(cb.query()); String prpp = keepLotId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", sqpp, "wHtReceiveInspectionList", rd, vl, prpp, op);
    }
    public abstract String keepLotId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);
    public abstract String keepLotId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by LOT_ID, named 'WHtReceiveNoPlanInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtReceiveNoPlanInspList()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtReceiveNoPlanInspCB> derivedWHtReceiveNoPlanInspList() {
        return xcreateQDRFunctionWHtReceiveNoPlanInspList();
    }
    protected HpQDRFunction<WHtReceiveNoPlanInspCB> xcreateQDRFunctionWHtReceiveNoPlanInspList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtReceiveNoPlanInspList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtReceiveNoPlanInspList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLotId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(cb.query()); String prpp = keepLotId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", sqpp, "wHtReceiveNoPlanInspList", rd, vl, prpp, op);
    }
    public abstract String keepLotId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);
    public abstract String keepLotId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_RECEIVE_STORE where ...)} <br>
     * W_HT_RECEIVE_STORE by LOT_ID, named 'WHtReceiveStoreAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtReceiveStoreList()</span>.<span style="color: #CC4747">max</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     storeCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     storeCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtReceiveStoreCB> derivedWHtReceiveStoreList() {
        return xcreateQDRFunctionWHtReceiveStoreList();
    }
    protected HpQDRFunction<WHtReceiveStoreCB> xcreateQDRFunctionWHtReceiveStoreList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtReceiveStoreList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtReceiveStoreList(String fn, SubQuery<WHtReceiveStoreCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLotId_QueryDerivedReferrer_WHtReceiveStoreList(cb.query()); String prpp = keepLotId_QueryDerivedReferrer_WHtReceiveStoreListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", sqpp, "wHtReceiveStoreList", rd, vl, prpp, op);
    }
    public abstract String keepLotId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);
    public abstract String keepLotId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_SHIPPING_PICKING where ...)} <br>
     * W_HT_SHIPPING_PICKING by LOT_ID, named 'WHtShippingPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtShippingPickingList()</span>.<span style="color: #CC4747">max</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     pickingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtShippingPickingCB> derivedWHtShippingPickingList() {
        return xcreateQDRFunctionWHtShippingPickingList();
    }
    protected HpQDRFunction<WHtShippingPickingCB> xcreateQDRFunctionWHtShippingPickingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtShippingPickingList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtShippingPickingList(String fn, SubQuery<WHtShippingPickingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLotId_QueryDerivedReferrer_WHtShippingPickingList(cb.query()); String prpp = keepLotId_QueryDerivedReferrer_WHtShippingPickingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOT_ID", "LOT_ID", sqpp, "wHtShippingPickingList", rd, vl, prpp, op);
    }
    public abstract String keepLotId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);
    public abstract String keepLotId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setLotId_IsNull() { regLotId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setLotId_IsNotNull() { regLotId(CK_ISNN, DOBJ); }

    protected void regLotId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotId(), "LOT_ID"); }
    protected abstract ConditionValue xgetCValueLotId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, bigint(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {IX, NotNull, bigint(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, bigint(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {IX, NotNull, bigint(19), FK to M_PRODUCT}
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
     * LOT_SORT: {varchar(30)}
     * @param lotSort The value of lotSort as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSort_Equal(String lotSort) {
        doSetLotSort_Equal(fRES(lotSort));
    }

    protected void doSetLotSort_Equal(String lotSort) {
        regLotSort(CK_EQ, lotSort);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_SORT: {varchar(30)}
     * @param lotSort The value of lotSort as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSort_NotEqual(String lotSort) {
        doSetLotSort_NotEqual(fRES(lotSort));
    }

    protected void doSetLotSort_NotEqual(String lotSort) {
        regLotSort(CK_NES, lotSort);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_SORT: {varchar(30)}
     * @param lotSort The value of lotSort as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSort_GreaterThan(String lotSort) {
        regLotSort(CK_GT, fRES(lotSort));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_SORT: {varchar(30)}
     * @param lotSort The value of lotSort as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSort_LessThan(String lotSort) {
        regLotSort(CK_LT, fRES(lotSort));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_SORT: {varchar(30)}
     * @param lotSort The value of lotSort as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSort_GreaterEqual(String lotSort) {
        regLotSort(CK_GE, fRES(lotSort));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_SORT: {varchar(30)}
     * @param lotSort The value of lotSort as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSort_LessEqual(String lotSort) {
        regLotSort(CK_LE, fRES(lotSort));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_SORT: {varchar(30)}
     * @param lotSortList The collection of lotSort as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSort_InScope(Collection<String> lotSortList) {
        doSetLotSort_InScope(lotSortList);
    }

    protected void doSetLotSort_InScope(Collection<String> lotSortList) {
        regINS(CK_INS, cTL(lotSortList), xgetCValueLotSort(), "LOT_SORT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_SORT: {varchar(30)}
     * @param lotSortList The collection of lotSort as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSort_NotInScope(Collection<String> lotSortList) {
        doSetLotSort_NotInScope(lotSortList);
    }

    protected void doSetLotSort_NotInScope(Collection<String> lotSortList) {
        regINS(CK_NINS, cTL(lotSortList), xgetCValueLotSort(), "LOT_SORT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_SORT: {varchar(30)} <br>
     * <pre>e.g. setLotSort_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotSort The value of lotSort as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotSort_LikeSearch(String lotSort, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotSort), xgetCValueLotSort(), "LOT_SORT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_SORT: {varchar(30)}
     * @param lotSort The value of lotSort as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotSort_NotLikeSearch(String lotSort, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotSort), xgetCValueLotSort(), "LOT_SORT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_SORT: {varchar(30)}
     * @param lotSort The value of lotSort as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSort_PrefixSearch(String lotSort) {
        setLotSort_LikeSearch(lotSort, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_SORT: {varchar(30)}
     */
    public void setLotSort_IsNull() { regLotSort(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT_SORT: {varchar(30)}
     */
    public void setLotSort_IsNullOrEmpty() { regLotSort(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_SORT: {varchar(30)}
     */
    public void setLotSort_IsNotNull() { regLotSort(CK_ISNN, DOBJ); }

    protected void regLotSort(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotSort(), "LOT_SORT"); }
    protected abstract ConditionValue xgetCValueLotSort();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_Equal(String lot1) {
        doSetLot1_Equal(fRES(lot1));
    }

    protected void doSetLot1_Equal(String lot1) {
        regLot1(CK_EQ, lot1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_NotEqual(String lot1) {
        doSetLot1_NotEqual(fRES(lot1));
    }

    protected void doSetLot1_NotEqual(String lot1) {
        regLot1(CK_NES, lot1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterThan(String lot1) {
        regLot1(CK_GT, fRES(lot1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessThan(String lot1) {
        regLot1(CK_LT, fRES(lot1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterEqual(String lot1) {
        regLot1(CK_GE, fRES(lot1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessEqual(String lot1) {
        regLot1(CK_LE, fRES(lot1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1List The collection of lot1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_InScope(Collection<String> lot1List) {
        doSetLot1_InScope(lot1List);
    }

    protected void doSetLot1_InScope(Collection<String> lot1List) {
        regINS(CK_INS, cTL(lot1List), xgetCValueLot1(), "LOT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1List The collection of lot1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_NotInScope(Collection<String> lot1List) {
        doSetLot1_NotInScope(lot1List);
    }

    protected void doSetLot1_NotInScope(Collection<String> lot1List) {
        regINS(CK_NINS, cTL(lot1List), xgetCValueLot1(), "LOT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(255)} <br>
     * <pre>e.g. setLot1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot1 The value of lot1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot1_LikeSearch(String lot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot1), xgetCValueLot1(), "LOT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot1_NotLikeSearch(String lot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot1), xgetCValueLot1(), "LOT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_PrefixSearch(String lot1) {
        setLot1_LikeSearch(lot1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     */
    public void setLot1_IsNull() { regLot1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     */
    public void setLot1_IsNullOrEmpty() { regLot1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     */
    public void setLot1_IsNotNull() { regLot1(CK_ISNN, DOBJ); }

    protected void regLot1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot1(), "LOT1"); }
    protected abstract ConditionValue xgetCValueLot1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2 The value of lot2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_Equal(String lot2) {
        doSetLot2_Equal(fRES(lot2));
    }

    protected void doSetLot2_Equal(String lot2) {
        regLot2(CK_EQ, lot2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2 The value of lot2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_NotEqual(String lot2) {
        doSetLot2_NotEqual(fRES(lot2));
    }

    protected void doSetLot2_NotEqual(String lot2) {
        regLot2(CK_NES, lot2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2 The value of lot2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_GreaterThan(String lot2) {
        regLot2(CK_GT, fRES(lot2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2 The value of lot2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_LessThan(String lot2) {
        regLot2(CK_LT, fRES(lot2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2 The value of lot2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_GreaterEqual(String lot2) {
        regLot2(CK_GE, fRES(lot2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2 The value of lot2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_LessEqual(String lot2) {
        regLot2(CK_LE, fRES(lot2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2List The collection of lot2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_InScope(Collection<String> lot2List) {
        doSetLot2_InScope(lot2List);
    }

    protected void doSetLot2_InScope(Collection<String> lot2List) {
        regINS(CK_INS, cTL(lot2List), xgetCValueLot2(), "LOT2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2List The collection of lot2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_NotInScope(Collection<String> lot2List) {
        doSetLot2_NotInScope(lot2List);
    }

    protected void doSetLot2_NotInScope(Collection<String> lot2List) {
        regINS(CK_NINS, cTL(lot2List), xgetCValueLot2(), "LOT2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(255)} <br>
     * <pre>e.g. setLot2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot2 The value of lot2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot2_LikeSearch(String lot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot2), xgetCValueLot2(), "LOT2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2 The value of lot2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot2_NotLikeSearch(String lot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot2), xgetCValueLot2(), "LOT2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2 The value of lot2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_PrefixSearch(String lot2) {
        setLot2_LikeSearch(lot2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     */
    public void setLot2_IsNull() { regLot2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     */
    public void setLot2_IsNullOrEmpty() { regLot2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     */
    public void setLot2_IsNotNull() { regLot2(CK_ISNN, DOBJ); }

    protected void regLot2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot2(), "LOT2"); }
    protected abstract ConditionValue xgetCValueLot2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_Equal(String lot3) {
        doSetLot3_Equal(fRES(lot3));
    }

    protected void doSetLot3_Equal(String lot3) {
        regLot3(CK_EQ, lot3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_NotEqual(String lot3) {
        doSetLot3_NotEqual(fRES(lot3));
    }

    protected void doSetLot3_NotEqual(String lot3) {
        regLot3(CK_NES, lot3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterThan(String lot3) {
        regLot3(CK_GT, fRES(lot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessThan(String lot3) {
        regLot3(CK_LT, fRES(lot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterEqual(String lot3) {
        regLot3(CK_GE, fRES(lot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessEqual(String lot3) {
        regLot3(CK_LE, fRES(lot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3List The collection of lot3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_InScope(Collection<String> lot3List) {
        doSetLot3_InScope(lot3List);
    }

    protected void doSetLot3_InScope(Collection<String> lot3List) {
        regINS(CK_INS, cTL(lot3List), xgetCValueLot3(), "LOT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3List The collection of lot3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_NotInScope(Collection<String> lot3List) {
        doSetLot3_NotInScope(lot3List);
    }

    protected void doSetLot3_NotInScope(Collection<String> lot3List) {
        regINS(CK_NINS, cTL(lot3List), xgetCValueLot3(), "LOT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(255)} <br>
     * <pre>e.g. setLot3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot3 The value of lot3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot3_LikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot3_NotLikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_PrefixSearch(String lot3) {
        setLot3_LikeSearch(lot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     */
    public void setLot3_IsNull() { regLot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     */
    public void setLot3_IsNullOrEmpty() { regLot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     */
    public void setLot3_IsNotNull() { regLot3(CK_ISNN, DOBJ); }

    protected void regLot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot3(), "LOT3"); }
    protected abstract ConditionValue xgetCValueLot3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_Equal(String lot4) {
        doSetLot4_Equal(fRES(lot4));
    }

    protected void doSetLot4_Equal(String lot4) {
        regLot4(CK_EQ, lot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotEqual(String lot4) {
        doSetLot4_NotEqual(fRES(lot4));
    }

    protected void doSetLot4_NotEqual(String lot4) {
        regLot4(CK_NES, lot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterThan(String lot4) {
        regLot4(CK_GT, fRES(lot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessThan(String lot4) {
        regLot4(CK_LT, fRES(lot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterEqual(String lot4) {
        regLot4(CK_GE, fRES(lot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessEqual(String lot4) {
        regLot4(CK_LE, fRES(lot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4List The collection of lot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_InScope(Collection<String> lot4List) {
        doSetLot4_InScope(lot4List);
    }

    protected void doSetLot4_InScope(Collection<String> lot4List) {
        regINS(CK_INS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4List The collection of lot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotInScope(Collection<String> lot4List) {
        doSetLot4_NotInScope(lot4List);
    }

    protected void doSetLot4_NotInScope(Collection<String> lot4List) {
        regINS(CK_NINS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)} <br>
     * <pre>e.g. setLot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot4 The value of lot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot4_LikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot4_NotLikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_PrefixSearch(String lot4) {
        setLot4_LikeSearch(lot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNull() { regLot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNullOrEmpty() { regLot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNotNull() { regLot4(CK_ISNN, DOBJ); }

    protected void regLot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot4(), "LOT4"); }
    protected abstract ConditionValue xgetCValueLot4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1)}
     * @param damageflg The value of damageflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_Equal(String damageflg) {
        doSetDamageflg_Equal(fRES(damageflg));
    }

    protected void doSetDamageflg_Equal(String damageflg) {
        regDamageflg(CK_EQ, damageflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1)}
     * @param damageflg The value of damageflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_NotEqual(String damageflg) {
        doSetDamageflg_NotEqual(fRES(damageflg));
    }

    protected void doSetDamageflg_NotEqual(String damageflg) {
        regDamageflg(CK_NES, damageflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1)}
     * @param damageflg The value of damageflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_GreaterThan(String damageflg) {
        regDamageflg(CK_GT, fRES(damageflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1)}
     * @param damageflg The value of damageflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_LessThan(String damageflg) {
        regDamageflg(CK_LT, fRES(damageflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1)}
     * @param damageflg The value of damageflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_GreaterEqual(String damageflg) {
        regDamageflg(CK_GE, fRES(damageflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1)}
     * @param damageflg The value of damageflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_LessEqual(String damageflg) {
        regDamageflg(CK_LE, fRES(damageflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1)}
     * @param damageflgList The collection of damageflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_InScope(Collection<String> damageflgList) {
        doSetDamageflg_InScope(damageflgList);
    }

    protected void doSetDamageflg_InScope(Collection<String> damageflgList) {
        regINS(CK_INS, cTL(damageflgList), xgetCValueDamageflg(), "DAMAGEFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1)}
     * @param damageflgList The collection of damageflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_NotInScope(Collection<String> damageflgList) {
        doSetDamageflg_NotInScope(damageflgList);
    }

    protected void doSetDamageflg_NotInScope(Collection<String> damageflgList) {
        regINS(CK_NINS, cTL(damageflgList), xgetCValueDamageflg(), "DAMAGEFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1)} <br>
     * <pre>e.g. setDamageflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param damageflg The value of damageflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDamageflg_LikeSearch(String damageflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(damageflg), xgetCValueDamageflg(), "DAMAGEFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1)}
     * @param damageflg The value of damageflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDamageflg_NotLikeSearch(String damageflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(damageflg), xgetCValueDamageflg(), "DAMAGEFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {NotNull, char(1)}
     * @param damageflg The value of damageflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_PrefixSearch(String damageflg) {
        setDamageflg_LikeSearch(damageflg, xcLSOPPre());
    }

    protected void regDamageflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDamageflg(), "DAMAGEFLG"); }
    protected abstract ConditionValue xgetCValueDamageflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1)}
     * @param noshippingflg The value of noshippingflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_Equal(String noshippingflg) {
        doSetNoshippingflg_Equal(fRES(noshippingflg));
    }

    protected void doSetNoshippingflg_Equal(String noshippingflg) {
        regNoshippingflg(CK_EQ, noshippingflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1)}
     * @param noshippingflg The value of noshippingflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_NotEqual(String noshippingflg) {
        doSetNoshippingflg_NotEqual(fRES(noshippingflg));
    }

    protected void doSetNoshippingflg_NotEqual(String noshippingflg) {
        regNoshippingflg(CK_NES, noshippingflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1)}
     * @param noshippingflg The value of noshippingflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_GreaterThan(String noshippingflg) {
        regNoshippingflg(CK_GT, fRES(noshippingflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1)}
     * @param noshippingflg The value of noshippingflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_LessThan(String noshippingflg) {
        regNoshippingflg(CK_LT, fRES(noshippingflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1)}
     * @param noshippingflg The value of noshippingflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_GreaterEqual(String noshippingflg) {
        regNoshippingflg(CK_GE, fRES(noshippingflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1)}
     * @param noshippingflg The value of noshippingflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_LessEqual(String noshippingflg) {
        regNoshippingflg(CK_LE, fRES(noshippingflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1)}
     * @param noshippingflgList The collection of noshippingflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_InScope(Collection<String> noshippingflgList) {
        doSetNoshippingflg_InScope(noshippingflgList);
    }

    protected void doSetNoshippingflg_InScope(Collection<String> noshippingflgList) {
        regINS(CK_INS, cTL(noshippingflgList), xgetCValueNoshippingflg(), "NOSHIPPINGFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1)}
     * @param noshippingflgList The collection of noshippingflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_NotInScope(Collection<String> noshippingflgList) {
        doSetNoshippingflg_NotInScope(noshippingflgList);
    }

    protected void doSetNoshippingflg_NotInScope(Collection<String> noshippingflgList) {
        regINS(CK_NINS, cTL(noshippingflgList), xgetCValueNoshippingflg(), "NOSHIPPINGFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1)} <br>
     * <pre>e.g. setNoshippingflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param noshippingflg The value of noshippingflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNoshippingflg_LikeSearch(String noshippingflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(noshippingflg), xgetCValueNoshippingflg(), "NOSHIPPINGFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1)}
     * @param noshippingflg The value of noshippingflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNoshippingflg_NotLikeSearch(String noshippingflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(noshippingflg), xgetCValueNoshippingflg(), "NOSHIPPINGFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, char(1)}
     * @param noshippingflg The value of noshippingflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_PrefixSearch(String noshippingflg) {
        setNoshippingflg_LikeSearch(noshippingflg, xcLSOPPre());
    }

    protected void regNoshippingflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNoshippingflg(), "NOSHIPPINGFLG"); }
    protected abstract ConditionValue xgetCValueNoshippingflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1)}
     * @param foreigncargoflg The value of foreigncargoflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_Equal(String foreigncargoflg) {
        doSetForeigncargoflg_Equal(fRES(foreigncargoflg));
    }

    protected void doSetForeigncargoflg_Equal(String foreigncargoflg) {
        regForeigncargoflg(CK_EQ, foreigncargoflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1)}
     * @param foreigncargoflg The value of foreigncargoflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_NotEqual(String foreigncargoflg) {
        doSetForeigncargoflg_NotEqual(fRES(foreigncargoflg));
    }

    protected void doSetForeigncargoflg_NotEqual(String foreigncargoflg) {
        regForeigncargoflg(CK_NES, foreigncargoflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1)}
     * @param foreigncargoflg The value of foreigncargoflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_GreaterThan(String foreigncargoflg) {
        regForeigncargoflg(CK_GT, fRES(foreigncargoflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1)}
     * @param foreigncargoflg The value of foreigncargoflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_LessThan(String foreigncargoflg) {
        regForeigncargoflg(CK_LT, fRES(foreigncargoflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1)}
     * @param foreigncargoflg The value of foreigncargoflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_GreaterEqual(String foreigncargoflg) {
        regForeigncargoflg(CK_GE, fRES(foreigncargoflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1)}
     * @param foreigncargoflg The value of foreigncargoflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_LessEqual(String foreigncargoflg) {
        regForeigncargoflg(CK_LE, fRES(foreigncargoflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1)}
     * @param foreigncargoflgList The collection of foreigncargoflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_InScope(Collection<String> foreigncargoflgList) {
        doSetForeigncargoflg_InScope(foreigncargoflgList);
    }

    protected void doSetForeigncargoflg_InScope(Collection<String> foreigncargoflgList) {
        regINS(CK_INS, cTL(foreigncargoflgList), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1)}
     * @param foreigncargoflgList The collection of foreigncargoflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_NotInScope(Collection<String> foreigncargoflgList) {
        doSetForeigncargoflg_NotInScope(foreigncargoflgList);
    }

    protected void doSetForeigncargoflg_NotInScope(Collection<String> foreigncargoflgList) {
        regINS(CK_NINS, cTL(foreigncargoflgList), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1)} <br>
     * <pre>e.g. setForeigncargoflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param foreigncargoflg The value of foreigncargoflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setForeigncargoflg_LikeSearch(String foreigncargoflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(foreigncargoflg), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1)}
     * @param foreigncargoflg The value of foreigncargoflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setForeigncargoflg_NotLikeSearch(String foreigncargoflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(foreigncargoflg), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1)}
     * @param foreigncargoflg The value of foreigncargoflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_PrefixSearch(String foreigncargoflg) {
        setForeigncargoflg_LikeSearch(foreigncargoflg, xcLSOPPre());
    }

    protected void regForeigncargoflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG"); }
    protected abstract ConditionValue xgetCValueForeigncargoflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1)}
     * @param customsreleaseflg The value of customsreleaseflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_Equal(String customsreleaseflg) {
        doSetCustomsreleaseflg_Equal(fRES(customsreleaseflg));
    }

    protected void doSetCustomsreleaseflg_Equal(String customsreleaseflg) {
        regCustomsreleaseflg(CK_EQ, customsreleaseflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1)}
     * @param customsreleaseflg The value of customsreleaseflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_NotEqual(String customsreleaseflg) {
        doSetCustomsreleaseflg_NotEqual(fRES(customsreleaseflg));
    }

    protected void doSetCustomsreleaseflg_NotEqual(String customsreleaseflg) {
        regCustomsreleaseflg(CK_NES, customsreleaseflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1)}
     * @param customsreleaseflg The value of customsreleaseflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_GreaterThan(String customsreleaseflg) {
        regCustomsreleaseflg(CK_GT, fRES(customsreleaseflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1)}
     * @param customsreleaseflg The value of customsreleaseflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_LessThan(String customsreleaseflg) {
        regCustomsreleaseflg(CK_LT, fRES(customsreleaseflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1)}
     * @param customsreleaseflg The value of customsreleaseflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_GreaterEqual(String customsreleaseflg) {
        regCustomsreleaseflg(CK_GE, fRES(customsreleaseflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1)}
     * @param customsreleaseflg The value of customsreleaseflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_LessEqual(String customsreleaseflg) {
        regCustomsreleaseflg(CK_LE, fRES(customsreleaseflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1)}
     * @param customsreleaseflgList The collection of customsreleaseflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_InScope(Collection<String> customsreleaseflgList) {
        doSetCustomsreleaseflg_InScope(customsreleaseflgList);
    }

    protected void doSetCustomsreleaseflg_InScope(Collection<String> customsreleaseflgList) {
        regINS(CK_INS, cTL(customsreleaseflgList), xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1)}
     * @param customsreleaseflgList The collection of customsreleaseflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_NotInScope(Collection<String> customsreleaseflgList) {
        doSetCustomsreleaseflg_NotInScope(customsreleaseflgList);
    }

    protected void doSetCustomsreleaseflg_NotInScope(Collection<String> customsreleaseflgList) {
        regINS(CK_NINS, cTL(customsreleaseflgList), xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1)} <br>
     * <pre>e.g. setCustomsreleaseflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customsreleaseflg The value of customsreleaseflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomsreleaseflg_LikeSearch(String customsreleaseflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customsreleaseflg), xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1)}
     * @param customsreleaseflg The value of customsreleaseflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomsreleaseflg_NotLikeSearch(String customsreleaseflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customsreleaseflg), xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1)}
     * @param customsreleaseflg The value of customsreleaseflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_PrefixSearch(String customsreleaseflg) {
        setCustomsreleaseflg_LikeSearch(customsreleaseflg, xcLSOPPre());
    }

    protected void regCustomsreleaseflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG"); }
    protected abstract ConditionValue xgetCValueCustomsreleaseflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {IX, NotNull, char(1)}
     * @param taxflg The value of taxflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_Equal(String taxflg) {
        doSetTaxflg_Equal(fRES(taxflg));
    }

    protected void doSetTaxflg_Equal(String taxflg) {
        regTaxflg(CK_EQ, taxflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {IX, NotNull, char(1)}
     * @param taxflg The value of taxflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_NotEqual(String taxflg) {
        doSetTaxflg_NotEqual(fRES(taxflg));
    }

    protected void doSetTaxflg_NotEqual(String taxflg) {
        regTaxflg(CK_NES, taxflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {IX, NotNull, char(1)}
     * @param taxflg The value of taxflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_GreaterThan(String taxflg) {
        regTaxflg(CK_GT, fRES(taxflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {IX, NotNull, char(1)}
     * @param taxflg The value of taxflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_LessThan(String taxflg) {
        regTaxflg(CK_LT, fRES(taxflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {IX, NotNull, char(1)}
     * @param taxflg The value of taxflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_GreaterEqual(String taxflg) {
        regTaxflg(CK_GE, fRES(taxflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {IX, NotNull, char(1)}
     * @param taxflg The value of taxflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_LessEqual(String taxflg) {
        regTaxflg(CK_LE, fRES(taxflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAXFLG: {IX, NotNull, char(1)}
     * @param taxflgList The collection of taxflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_InScope(Collection<String> taxflgList) {
        doSetTaxflg_InScope(taxflgList);
    }

    protected void doSetTaxflg_InScope(Collection<String> taxflgList) {
        regINS(CK_INS, cTL(taxflgList), xgetCValueTaxflg(), "TAXFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAXFLG: {IX, NotNull, char(1)}
     * @param taxflgList The collection of taxflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_NotInScope(Collection<String> taxflgList) {
        doSetTaxflg_NotInScope(taxflgList);
    }

    protected void doSetTaxflg_NotInScope(Collection<String> taxflgList) {
        regINS(CK_NINS, cTL(taxflgList), xgetCValueTaxflg(), "TAXFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAXFLG: {IX, NotNull, char(1)} <br>
     * <pre>e.g. setTaxflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param taxflg The value of taxflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTaxflg_LikeSearch(String taxflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(taxflg), xgetCValueTaxflg(), "TAXFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAXFLG: {IX, NotNull, char(1)}
     * @param taxflg The value of taxflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTaxflg_NotLikeSearch(String taxflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(taxflg), xgetCValueTaxflg(), "TAXFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAXFLG: {IX, NotNull, char(1)}
     * @param taxflg The value of taxflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_PrefixSearch(String taxflg) {
        setTaxflg_LikeSearch(taxflg, xcLSOPPre());
    }

    protected void regTaxflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaxflg(), "TAXFLG"); }
    protected abstract ConditionValue xgetCValueTaxflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANCEPORT_CD: {varchar(30)}
     * @param tranceportCd The value of tranceportCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTranceportCd_Equal(String tranceportCd) {
        doSetTranceportCd_Equal(fRES(tranceportCd));
    }

    protected void doSetTranceportCd_Equal(String tranceportCd) {
        regTranceportCd(CK_EQ, tranceportCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANCEPORT_CD: {varchar(30)}
     * @param tranceportCd The value of tranceportCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTranceportCd_NotEqual(String tranceportCd) {
        doSetTranceportCd_NotEqual(fRES(tranceportCd));
    }

    protected void doSetTranceportCd_NotEqual(String tranceportCd) {
        regTranceportCd(CK_NES, tranceportCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANCEPORT_CD: {varchar(30)}
     * @param tranceportCd The value of tranceportCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTranceportCd_GreaterThan(String tranceportCd) {
        regTranceportCd(CK_GT, fRES(tranceportCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANCEPORT_CD: {varchar(30)}
     * @param tranceportCd The value of tranceportCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTranceportCd_LessThan(String tranceportCd) {
        regTranceportCd(CK_LT, fRES(tranceportCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANCEPORT_CD: {varchar(30)}
     * @param tranceportCd The value of tranceportCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTranceportCd_GreaterEqual(String tranceportCd) {
        regTranceportCd(CK_GE, fRES(tranceportCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANCEPORT_CD: {varchar(30)}
     * @param tranceportCd The value of tranceportCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTranceportCd_LessEqual(String tranceportCd) {
        regTranceportCd(CK_LE, fRES(tranceportCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANCEPORT_CD: {varchar(30)}
     * @param tranceportCdList The collection of tranceportCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTranceportCd_InScope(Collection<String> tranceportCdList) {
        doSetTranceportCd_InScope(tranceportCdList);
    }

    protected void doSetTranceportCd_InScope(Collection<String> tranceportCdList) {
        regINS(CK_INS, cTL(tranceportCdList), xgetCValueTranceportCd(), "TRANCEPORT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANCEPORT_CD: {varchar(30)}
     * @param tranceportCdList The collection of tranceportCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTranceportCd_NotInScope(Collection<String> tranceportCdList) {
        doSetTranceportCd_NotInScope(tranceportCdList);
    }

    protected void doSetTranceportCd_NotInScope(Collection<String> tranceportCdList) {
        regINS(CK_NINS, cTL(tranceportCdList), xgetCValueTranceportCd(), "TRANCEPORT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANCEPORT_CD: {varchar(30)} <br>
     * <pre>e.g. setTranceportCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tranceportCd The value of tranceportCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTranceportCd_LikeSearch(String tranceportCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tranceportCd), xgetCValueTranceportCd(), "TRANCEPORT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANCEPORT_CD: {varchar(30)}
     * @param tranceportCd The value of tranceportCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTranceportCd_NotLikeSearch(String tranceportCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tranceportCd), xgetCValueTranceportCd(), "TRANCEPORT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANCEPORT_CD: {varchar(30)}
     * @param tranceportCd The value of tranceportCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTranceportCd_PrefixSearch(String tranceportCd) {
        setTranceportCd_LikeSearch(tranceportCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANCEPORT_CD: {varchar(30)}
     */
    public void setTranceportCd_IsNull() { regTranceportCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRANCEPORT_CD: {varchar(30)}
     */
    public void setTranceportCd_IsNullOrEmpty() { regTranceportCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANCEPORT_CD: {varchar(30)}
     */
    public void setTranceportCd_IsNotNull() { regTranceportCd(CK_ISNN, DOBJ); }

    protected void regTranceportCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTranceportCd(), "TRANCEPORT_CD"); }
    protected abstract ConditionValue xgetCValueTranceportCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCd The value of sourceCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_Equal(String sourceCd) {
        doSetSourceCd_Equal(fRES(sourceCd));
    }

    protected void doSetSourceCd_Equal(String sourceCd) {
        regSourceCd(CK_EQ, sourceCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCd The value of sourceCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_NotEqual(String sourceCd) {
        doSetSourceCd_NotEqual(fRES(sourceCd));
    }

    protected void doSetSourceCd_NotEqual(String sourceCd) {
        regSourceCd(CK_NES, sourceCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCd The value of sourceCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_GreaterThan(String sourceCd) {
        regSourceCd(CK_GT, fRES(sourceCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCd The value of sourceCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_LessThan(String sourceCd) {
        regSourceCd(CK_LT, fRES(sourceCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCd The value of sourceCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_GreaterEqual(String sourceCd) {
        regSourceCd(CK_GE, fRES(sourceCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCd The value of sourceCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_LessEqual(String sourceCd) {
        regSourceCd(CK_LE, fRES(sourceCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCdList The collection of sourceCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_InScope(Collection<String> sourceCdList) {
        doSetSourceCd_InScope(sourceCdList);
    }

    protected void doSetSourceCd_InScope(Collection<String> sourceCdList) {
        regINS(CK_INS, cTL(sourceCdList), xgetCValueSourceCd(), "SOURCE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCdList The collection of sourceCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_NotInScope(Collection<String> sourceCdList) {
        doSetSourceCd_NotInScope(sourceCdList);
    }

    protected void doSetSourceCd_NotInScope(Collection<String> sourceCdList) {
        regINS(CK_NINS, cTL(sourceCdList), xgetCValueSourceCd(), "SOURCE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_CD: {varchar(30)} <br>
     * <pre>e.g. setSourceCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sourceCd The value of sourceCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourceCd_LikeSearch(String sourceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourceCd), xgetCValueSourceCd(), "SOURCE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCd The value of sourceCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourceCd_NotLikeSearch(String sourceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourceCd), xgetCValueSourceCd(), "SOURCE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCd The value of sourceCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_PrefixSearch(String sourceCd) {
        setSourceCd_LikeSearch(sourceCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     */
    public void setSourceCd_IsNull() { regSourceCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     */
    public void setSourceCd_IsNullOrEmpty() { regSourceCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     */
    public void setSourceCd_IsNotNull() { regSourceCd(CK_ISNN, DOBJ); }

    protected void regSourceCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceCd(), "SOURCE_CD"); }
    protected abstract ConditionValue xgetCValueSourceCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NM: {varchar(60)}
     * @param sourceNm The value of sourceNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_Equal(String sourceNm) {
        doSetSourceNm_Equal(fRES(sourceNm));
    }

    protected void doSetSourceNm_Equal(String sourceNm) {
        regSourceNm(CK_EQ, sourceNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NM: {varchar(60)}
     * @param sourceNm The value of sourceNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_NotEqual(String sourceNm) {
        doSetSourceNm_NotEqual(fRES(sourceNm));
    }

    protected void doSetSourceNm_NotEqual(String sourceNm) {
        regSourceNm(CK_NES, sourceNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NM: {varchar(60)}
     * @param sourceNm The value of sourceNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_GreaterThan(String sourceNm) {
        regSourceNm(CK_GT, fRES(sourceNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NM: {varchar(60)}
     * @param sourceNm The value of sourceNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_LessThan(String sourceNm) {
        regSourceNm(CK_LT, fRES(sourceNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NM: {varchar(60)}
     * @param sourceNm The value of sourceNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_GreaterEqual(String sourceNm) {
        regSourceNm(CK_GE, fRES(sourceNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NM: {varchar(60)}
     * @param sourceNm The value of sourceNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_LessEqual(String sourceNm) {
        regSourceNm(CK_LE, fRES(sourceNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOURCE_NM: {varchar(60)}
     * @param sourceNmList The collection of sourceNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_InScope(Collection<String> sourceNmList) {
        doSetSourceNm_InScope(sourceNmList);
    }

    protected void doSetSourceNm_InScope(Collection<String> sourceNmList) {
        regINS(CK_INS, cTL(sourceNmList), xgetCValueSourceNm(), "SOURCE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOURCE_NM: {varchar(60)}
     * @param sourceNmList The collection of sourceNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_NotInScope(Collection<String> sourceNmList) {
        doSetSourceNm_NotInScope(sourceNmList);
    }

    protected void doSetSourceNm_NotInScope(Collection<String> sourceNmList) {
        regINS(CK_NINS, cTL(sourceNmList), xgetCValueSourceNm(), "SOURCE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_NM: {varchar(60)} <br>
     * <pre>e.g. setSourceNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sourceNm The value of sourceNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourceNm_LikeSearch(String sourceNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourceNm), xgetCValueSourceNm(), "SOURCE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_NM: {varchar(60)}
     * @param sourceNm The value of sourceNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourceNm_NotLikeSearch(String sourceNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourceNm), xgetCValueSourceNm(), "SOURCE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_NM: {varchar(60)}
     * @param sourceNm The value of sourceNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_PrefixSearch(String sourceNm) {
        setSourceNm_LikeSearch(sourceNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOURCE_NM: {varchar(60)}
     */
    public void setSourceNm_IsNull() { regSourceNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SOURCE_NM: {varchar(60)}
     */
    public void setSourceNm_IsNullOrEmpty() { regSourceNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOURCE_NM: {varchar(60)}
     */
    public void setSourceNm_IsNotNull() { regSourceNm(CK_ISNN, DOBJ); }

    protected void regSourceNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceNm(), "SOURCE_NM"); }
    protected abstract ConditionValue xgetCValueSourceNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DT: {varchar(8)}
     * @param schDt The value of schDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDt_Equal(String schDt) {
        doSetSchDt_Equal(fRES(schDt));
    }

    protected void doSetSchDt_Equal(String schDt) {
        regSchDt(CK_EQ, schDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DT: {varchar(8)}
     * @param schDt The value of schDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDt_NotEqual(String schDt) {
        doSetSchDt_NotEqual(fRES(schDt));
    }

    protected void doSetSchDt_NotEqual(String schDt) {
        regSchDt(CK_NES, schDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DT: {varchar(8)}
     * @param schDt The value of schDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDt_GreaterThan(String schDt) {
        regSchDt(CK_GT, fRES(schDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DT: {varchar(8)}
     * @param schDt The value of schDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDt_LessThan(String schDt) {
        regSchDt(CK_LT, fRES(schDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DT: {varchar(8)}
     * @param schDt The value of schDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDt_GreaterEqual(String schDt) {
        regSchDt(CK_GE, fRES(schDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DT: {varchar(8)}
     * @param schDt The value of schDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDt_LessEqual(String schDt) {
        regSchDt(CK_LE, fRES(schDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCH_DT: {varchar(8)}
     * @param schDtList The collection of schDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDt_InScope(Collection<String> schDtList) {
        doSetSchDt_InScope(schDtList);
    }

    protected void doSetSchDt_InScope(Collection<String> schDtList) {
        regINS(CK_INS, cTL(schDtList), xgetCValueSchDt(), "SCH_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCH_DT: {varchar(8)}
     * @param schDtList The collection of schDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDt_NotInScope(Collection<String> schDtList) {
        doSetSchDt_NotInScope(schDtList);
    }

    protected void doSetSchDt_NotInScope(Collection<String> schDtList) {
        regINS(CK_NINS, cTL(schDtList), xgetCValueSchDt(), "SCH_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCH_DT: {varchar(8)} <br>
     * <pre>e.g. setSchDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param schDt The value of schDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSchDt_LikeSearch(String schDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(schDt), xgetCValueSchDt(), "SCH_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCH_DT: {varchar(8)}
     * @param schDt The value of schDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSchDt_NotLikeSearch(String schDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(schDt), xgetCValueSchDt(), "SCH_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCH_DT: {varchar(8)}
     * @param schDt The value of schDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDt_PrefixSearch(String schDt) {
        setSchDt_LikeSearch(schDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCH_DT: {varchar(8)}
     */
    public void setSchDt_IsNull() { regSchDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SCH_DT: {varchar(8)}
     */
    public void setSchDt_IsNullOrEmpty() { regSchDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCH_DT: {varchar(8)}
     */
    public void setSchDt_IsNotNull() { regSchDt(CK_ISNN, DOBJ); }

    protected void regSchDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSchDt(), "SCH_DT"); }
    protected abstract ConditionValue xgetCValueSchDt();

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
    public HpSLCFunction<TLotCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TLotCB.class);
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
    public HpSLCFunction<TLotCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TLotCB.class);
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
    public HpSLCFunction<TLotCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TLotCB.class);
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
    public HpSLCFunction<TLotCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TLotCB.class);
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
    public HpSLCFunction<TLotCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TLotCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TLotCB&gt;() {
     *     public void query(TLotCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TLotCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TLotCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TLotCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TLotCQ sq);

    protected TLotCB xcreateScalarConditionCB() {
        TLotCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TLotCB xcreateScalarConditionPartitionByCB() {
        TLotCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TLotCB cb = new TLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LOT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TLotCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TLotCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TLotCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TLotCB cb = new TLotCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LOT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TLotCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLotCB cb = new TLotCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TLotCQ sq);

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
    protected TLotCB newMyCB() {
        return new TLotCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TLotCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
