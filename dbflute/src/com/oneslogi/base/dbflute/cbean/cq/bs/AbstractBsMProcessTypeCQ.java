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
 * The abstract condition-query of M_PROCESS_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMProcessTypeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMProcessTypeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_PROCESS_TYPE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param processTypeId The value of processTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_Equal(Long processTypeId) {
        doSetProcessTypeId_Equal(processTypeId);
    }

    protected void doSetProcessTypeId_Equal(Long processTypeId) {
        regProcessTypeId(CK_EQ, processTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param processTypeId The value of processTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_NotEqual(Long processTypeId) {
        doSetProcessTypeId_NotEqual(processTypeId);
    }

    protected void doSetProcessTypeId_NotEqual(Long processTypeId) {
        regProcessTypeId(CK_NES, processTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param processTypeId The value of processTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterThan(Long processTypeId) {
        regProcessTypeId(CK_GT, processTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param processTypeId The value of processTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessThan(Long processTypeId) {
        regProcessTypeId(CK_LT, processTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param processTypeId The value of processTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterEqual(Long processTypeId) {
        regProcessTypeId(CK_GE, processTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param processTypeId The value of processTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessEqual(Long processTypeId) {
        regProcessTypeId(CK_LE, processTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProcessTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param processTypeIdList The collection of processTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeId_InScope(Collection<Long> processTypeIdList) {
        doSetProcessTypeId_InScope(processTypeIdList);
    }

    protected void doSetProcessTypeId_InScope(Collection<Long> processTypeIdList) {
        regINS(CK_INS, cTL(processTypeIdList), xgetCValueProcessTypeId(), "PROCESS_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param processTypeIdList The collection of processTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeId_NotInScope(Collection<Long> processTypeIdList) {
        doSetProcessTypeId_NotInScope(processTypeIdList);
    }

    protected void doSetProcessTypeId_NotInScope(Collection<Long> processTypeIdList) {
        regINS(CK_NINS, cTL(processTypeIdList), xgetCValueProcessTypeId(), "PROCESS_TYPE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PROCESS_TYPE_ID from H_MOVE_H where ...)} <br>
     * H_MOVE_H by PROCESS_TYPE_ID, named 'HMoveHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsHMoveHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of HMoveHList for 'exists'. (NotNull)
     */
    public void existsHMoveHList(SubQuery<HMoveHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HMoveHCB cb = new HMoveHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_ExistsReferrer_HMoveHList(cb.query());
        registerExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "hMoveHList");
    }
    public abstract String keepProcessTypeId_ExistsReferrer_HMoveHList(HMoveHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PROCESS_TYPE_ID from H_RECEIVE_H where ...)} <br>
     * H_RECEIVE_H by PROCESS_TYPE_ID, named 'HReceiveHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsHReceiveHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of HReceiveHList for 'exists'. (NotNull)
     */
    public void existsHReceiveHList(SubQuery<HReceiveHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HReceiveHCB cb = new HReceiveHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_ExistsReferrer_HReceiveHList(cb.query());
        registerExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "hReceiveHList");
    }
    public abstract String keepProcessTypeId_ExistsReferrer_HReceiveHList(HReceiveHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PROCESS_TYPE_ID from H_SHIPPING_H where ...)} <br>
     * H_SHIPPING_H by PROCESS_TYPE_ID, named 'HShippingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsHShippingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of HShippingHList for 'exists'. (NotNull)
     */
    public void existsHShippingHList(SubQuery<HShippingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HShippingHCB cb = new HShippingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_ExistsReferrer_HShippingHList(cb.query());
        registerExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "hShippingHList");
    }
    public abstract String keepProcessTypeId_ExistsReferrer_HShippingHList(HShippingHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PROCESS_TYPE_ID from H_STOCK_INOUT where ...)} <br>
     * H_STOCK_INOUT by PROCESS_TYPE_ID, named 'HStockInoutAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsHStockInoutList</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of HStockInoutList for 'exists'. (NotNull)
     */
    public void existsHStockInoutList(SubQuery<HStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HStockInoutCB cb = new HStockInoutCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_ExistsReferrer_HStockInoutList(cb.query());
        registerExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "hStockInoutList");
    }
    public abstract String keepProcessTypeId_ExistsReferrer_HStockInoutList(HStockInoutCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PROCESS_TYPE_ID from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by PROCESS_TYPE_ID, named 'TAllocInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocInstHList for 'exists'. (NotNull)
     */
    public void existsTAllocInstHList(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_ExistsReferrer_TAllocInstHList(cb.query());
        registerExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tAllocInstHList");
    }
    public abstract String keepProcessTypeId_ExistsReferrer_TAllocInstHList(TAllocInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PROCESS_TYPE_ID from T_MOVE_INST_H where ...)} <br>
     * T_MOVE_INST_H by PROCESS_TYPE_ID, named 'TMoveInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTMoveInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TMoveInstHList for 'exists'. (NotNull)
     */
    public void existsTMoveInstHList(SubQuery<TMoveInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstHCB cb = new TMoveInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_ExistsReferrer_TMoveInstHList(cb.query());
        registerExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tMoveInstHList");
    }
    public abstract String keepProcessTypeId_ExistsReferrer_TMoveInstHList(TMoveInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PROCESS_TYPE_ID from T_PACKING_H where ...)} <br>
     * T_PACKING_H by PROCESS_TYPE_ID, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPackingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPackingHList for 'exists'. (NotNull)
     */
    public void existsTPackingHList(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_ExistsReferrer_TPackingHList(cb.query());
        registerExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tPackingHList");
    }
    public abstract String keepProcessTypeId_ExistsReferrer_TPackingHList(TPackingHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PROCESS_TYPE_ID from T_PICKING_H where ...)} <br>
     * T_PICKING_H by PROCESS_TYPE_ID, named 'TPickingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingHList for 'exists'. (NotNull)
     */
    public void existsTPickingHList(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_ExistsReferrer_TPickingHList(cb.query());
        registerExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tPickingHList");
    }
    public abstract String keepProcessTypeId_ExistsReferrer_TPickingHList(TPickingHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PROCESS_TYPE_ID from T_RECEIVE_PLAN_H where ...)} <br>
     * T_RECEIVE_PLAN_H by PROCESS_TYPE_ID, named 'TReceivePlanHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceivePlanHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceivePlanHList for 'exists'. (NotNull)
     */
    public void existsTReceivePlanHList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_ExistsReferrer_TReceivePlanHList(cb.query());
        registerExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tReceivePlanHList");
    }
    public abstract String keepProcessTypeId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PROCESS_TYPE_ID from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by PROCESS_TYPE_ID, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstHList for 'exists'. (NotNull)
     */
    public void existsTShippingInstHList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_ExistsReferrer_TShippingInstHList(cb.query());
        registerExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tShippingInstHList");
    }
    public abstract String keepProcessTypeId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PROCESS_TYPE_ID from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by PROCESS_TYPE_ID, named 'TStockInoutAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_ExistsReferrer_TStockInoutList(cb.query());
        registerExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tStockInoutList");
    }
    public abstract String keepProcessTypeId_ExistsReferrer_TStockInoutList(TStockInoutCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PROCESS_TYPE_ID from T_STORE_RECORD_H where ...)} <br>
     * T_STORE_RECORD_H by PROCESS_TYPE_ID, named 'TStoreRecordHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStoreRecordHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStoreRecordHList for 'exists'. (NotNull)
     */
    public void existsTStoreRecordHList(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_ExistsReferrer_TStoreRecordHList(cb.query());
        registerExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tStoreRecordHList");
    }
    public abstract String keepProcessTypeId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PROCESS_TYPE_ID from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by PROCESS_TYPE_ID, named 'WHtReceiveNoPlanInspAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_ExistsReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "wHtReceiveNoPlanInspList");
    }
    public abstract String keepProcessTypeId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PROCESS_TYPE_ID from H_MOVE_H where ...)} <br>
     * H_MOVE_H by PROCESS_TYPE_ID, named 'HMoveHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsHMoveHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProcessTypeId_NotExistsReferrer_HMoveHList for 'not exists'. (NotNull)
     */
    public void notExistsHMoveHList(SubQuery<HMoveHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HMoveHCB cb = new HMoveHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_NotExistsReferrer_HMoveHList(cb.query());
        registerNotExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "hMoveHList");
    }
    public abstract String keepProcessTypeId_NotExistsReferrer_HMoveHList(HMoveHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PROCESS_TYPE_ID from H_RECEIVE_H where ...)} <br>
     * H_RECEIVE_H by PROCESS_TYPE_ID, named 'HReceiveHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsHReceiveHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProcessTypeId_NotExistsReferrer_HReceiveHList for 'not exists'. (NotNull)
     */
    public void notExistsHReceiveHList(SubQuery<HReceiveHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HReceiveHCB cb = new HReceiveHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_NotExistsReferrer_HReceiveHList(cb.query());
        registerNotExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "hReceiveHList");
    }
    public abstract String keepProcessTypeId_NotExistsReferrer_HReceiveHList(HReceiveHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PROCESS_TYPE_ID from H_SHIPPING_H where ...)} <br>
     * H_SHIPPING_H by PROCESS_TYPE_ID, named 'HShippingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsHShippingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProcessTypeId_NotExistsReferrer_HShippingHList for 'not exists'. (NotNull)
     */
    public void notExistsHShippingHList(SubQuery<HShippingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HShippingHCB cb = new HShippingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_NotExistsReferrer_HShippingHList(cb.query());
        registerNotExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "hShippingHList");
    }
    public abstract String keepProcessTypeId_NotExistsReferrer_HShippingHList(HShippingHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PROCESS_TYPE_ID from H_STOCK_INOUT where ...)} <br>
     * H_STOCK_INOUT by PROCESS_TYPE_ID, named 'HStockInoutAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsHStockInoutList</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProcessTypeId_NotExistsReferrer_HStockInoutList for 'not exists'. (NotNull)
     */
    public void notExistsHStockInoutList(SubQuery<HStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HStockInoutCB cb = new HStockInoutCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_NotExistsReferrer_HStockInoutList(cb.query());
        registerNotExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "hStockInoutList");
    }
    public abstract String keepProcessTypeId_NotExistsReferrer_HStockInoutList(HStockInoutCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PROCESS_TYPE_ID from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by PROCESS_TYPE_ID, named 'TAllocInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProcessTypeId_NotExistsReferrer_TAllocInstHList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstHList(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_NotExistsReferrer_TAllocInstHList(cb.query());
        registerNotExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tAllocInstHList");
    }
    public abstract String keepProcessTypeId_NotExistsReferrer_TAllocInstHList(TAllocInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PROCESS_TYPE_ID from T_MOVE_INST_H where ...)} <br>
     * T_MOVE_INST_H by PROCESS_TYPE_ID, named 'TMoveInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProcessTypeId_NotExistsReferrer_TMoveInstHList for 'not exists'. (NotNull)
     */
    public void notExistsTMoveInstHList(SubQuery<TMoveInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstHCB cb = new TMoveInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_NotExistsReferrer_TMoveInstHList(cb.query());
        registerNotExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tMoveInstHList");
    }
    public abstract String keepProcessTypeId_NotExistsReferrer_TMoveInstHList(TMoveInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PROCESS_TYPE_ID from T_PACKING_H where ...)} <br>
     * T_PACKING_H by PROCESS_TYPE_ID, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPackingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProcessTypeId_NotExistsReferrer_TPackingHList for 'not exists'. (NotNull)
     */
    public void notExistsTPackingHList(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_NotExistsReferrer_TPackingHList(cb.query());
        registerNotExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tPackingHList");
    }
    public abstract String keepProcessTypeId_NotExistsReferrer_TPackingHList(TPackingHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PROCESS_TYPE_ID from T_PICKING_H where ...)} <br>
     * T_PICKING_H by PROCESS_TYPE_ID, named 'TPickingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProcessTypeId_NotExistsReferrer_TPickingHList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingHList(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_NotExistsReferrer_TPickingHList(cb.query());
        registerNotExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tPickingHList");
    }
    public abstract String keepProcessTypeId_NotExistsReferrer_TPickingHList(TPickingHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PROCESS_TYPE_ID from T_RECEIVE_PLAN_H where ...)} <br>
     * T_RECEIVE_PLAN_H by PROCESS_TYPE_ID, named 'TReceivePlanHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProcessTypeId_NotExistsReferrer_TReceivePlanHList for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanHList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_NotExistsReferrer_TReceivePlanHList(cb.query());
        registerNotExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tReceivePlanHList");
    }
    public abstract String keepProcessTypeId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PROCESS_TYPE_ID from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by PROCESS_TYPE_ID, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProcessTypeId_NotExistsReferrer_TShippingInstHList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstHList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_NotExistsReferrer_TShippingInstHList(cb.query());
        registerNotExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tShippingInstHList");
    }
    public abstract String keepProcessTypeId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PROCESS_TYPE_ID from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by PROCESS_TYPE_ID, named 'TStockInoutAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStockInoutList</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProcessTypeId_NotExistsReferrer_TStockInoutList for 'not exists'. (NotNull)
     */
    public void notExistsTStockInoutList(SubQuery<TStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_NotExistsReferrer_TStockInoutList(cb.query());
        registerNotExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tStockInoutList");
    }
    public abstract String keepProcessTypeId_NotExistsReferrer_TStockInoutList(TStockInoutCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PROCESS_TYPE_ID from T_STORE_RECORD_H where ...)} <br>
     * T_STORE_RECORD_H by PROCESS_TYPE_ID, named 'TStoreRecordHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStoreRecordHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProcessTypeId_NotExistsReferrer_TStoreRecordHList for 'not exists'. (NotNull)
     */
    public void notExistsTStoreRecordHList(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_NotExistsReferrer_TStoreRecordHList(cb.query());
        registerNotExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tStoreRecordHList");
    }
    public abstract String keepProcessTypeId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PROCESS_TYPE_ID from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by PROCESS_TYPE_ID, named 'WHtReceiveNoPlanInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveNoPlanInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProcessTypeId_NotExistsReferrer_WHtReceiveNoPlanInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveNoPlanInspList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProcessTypeId_NotExistsReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "wHtReceiveNoPlanInspList");
    }
    public abstract String keepProcessTypeId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    public void xsderiveHMoveHList(String fn, SubQuery<HMoveHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HMoveHCB cb = new HMoveHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProcessTypeId_SpecifyDerivedReferrer_HMoveHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "hMoveHList", al, op);
    }
    public abstract String keepProcessTypeId_SpecifyDerivedReferrer_HMoveHList(HMoveHCQ sq);

    public void xsderiveHReceiveHList(String fn, SubQuery<HReceiveHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HReceiveHCB cb = new HReceiveHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProcessTypeId_SpecifyDerivedReferrer_HReceiveHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "hReceiveHList", al, op);
    }
    public abstract String keepProcessTypeId_SpecifyDerivedReferrer_HReceiveHList(HReceiveHCQ sq);

    public void xsderiveHShippingHList(String fn, SubQuery<HShippingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HShippingHCB cb = new HShippingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProcessTypeId_SpecifyDerivedReferrer_HShippingHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "hShippingHList", al, op);
    }
    public abstract String keepProcessTypeId_SpecifyDerivedReferrer_HShippingHList(HShippingHCQ sq);

    public void xsderiveHStockInoutList(String fn, SubQuery<HStockInoutCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HStockInoutCB cb = new HStockInoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProcessTypeId_SpecifyDerivedReferrer_HStockInoutList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "hStockInoutList", al, op);
    }
    public abstract String keepProcessTypeId_SpecifyDerivedReferrer_HStockInoutList(HStockInoutCQ sq);

    public void xsderiveTAllocInstHList(String fn, SubQuery<TAllocInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProcessTypeId_SpecifyDerivedReferrer_TAllocInstHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tAllocInstHList", al, op);
    }
    public abstract String keepProcessTypeId_SpecifyDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq);

    public void xsderiveTMoveInstHList(String fn, SubQuery<TMoveInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstHCB cb = new TMoveInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProcessTypeId_SpecifyDerivedReferrer_TMoveInstHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tMoveInstHList", al, op);
    }
    public abstract String keepProcessTypeId_SpecifyDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq);

    public void xsderiveTPackingHList(String fn, SubQuery<TPackingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProcessTypeId_SpecifyDerivedReferrer_TPackingHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tPackingHList", al, op);
    }
    public abstract String keepProcessTypeId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq);

    public void xsderiveTPickingHList(String fn, SubQuery<TPickingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProcessTypeId_SpecifyDerivedReferrer_TPickingHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tPickingHList", al, op);
    }
    public abstract String keepProcessTypeId_SpecifyDerivedReferrer_TPickingHList(TPickingHCQ sq);

    public void xsderiveTReceivePlanHList(String fn, SubQuery<TReceivePlanHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProcessTypeId_SpecifyDerivedReferrer_TReceivePlanHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tReceivePlanHList", al, op);
    }
    public abstract String keepProcessTypeId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq);

    public void xsderiveTShippingInstHList(String fn, SubQuery<TShippingInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProcessTypeId_SpecifyDerivedReferrer_TShippingInstHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tShippingInstHList", al, op);
    }
    public abstract String keepProcessTypeId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq);

    public void xsderiveTStockInoutList(String fn, SubQuery<TStockInoutCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProcessTypeId_SpecifyDerivedReferrer_TStockInoutList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tStockInoutList", al, op);
    }
    public abstract String keepProcessTypeId_SpecifyDerivedReferrer_TStockInoutList(TStockInoutCQ sq);

    public void xsderiveTStoreRecordHList(String fn, SubQuery<TStoreRecordHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProcessTypeId_SpecifyDerivedReferrer_TStoreRecordHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "tStoreRecordHList", al, op);
    }
    public abstract String keepProcessTypeId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq);

    public void xsderiveWHtReceiveNoPlanInspList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProcessTypeId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "wHtReceiveNoPlanInspList", al, op);
    }
    public abstract String keepProcessTypeId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from H_MOVE_H where ...)} <br>
     * H_MOVE_H by PROCESS_TYPE_ID, named 'HMoveHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedHMoveHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<HMoveHCB> derivedHMoveHList() {
        return xcreateQDRFunctionHMoveHList();
    }
    protected HpQDRFunction<HMoveHCB> xcreateQDRFunctionHMoveHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveHMoveHList(fn, sq, rd, vl, op));
    }
    public void xqderiveHMoveHList(String fn, SubQuery<HMoveHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HMoveHCB cb = new HMoveHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProcessTypeId_QueryDerivedReferrer_HMoveHList(cb.query()); String prpp = keepProcessTypeId_QueryDerivedReferrer_HMoveHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", sqpp, "hMoveHList", rd, vl, prpp, op);
    }
    public abstract String keepProcessTypeId_QueryDerivedReferrer_HMoveHList(HMoveHCQ sq);
    public abstract String keepProcessTypeId_QueryDerivedReferrer_HMoveHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from H_RECEIVE_H where ...)} <br>
     * H_RECEIVE_H by PROCESS_TYPE_ID, named 'HReceiveHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedHReceiveHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<HReceiveHCB> derivedHReceiveHList() {
        return xcreateQDRFunctionHReceiveHList();
    }
    protected HpQDRFunction<HReceiveHCB> xcreateQDRFunctionHReceiveHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveHReceiveHList(fn, sq, rd, vl, op));
    }
    public void xqderiveHReceiveHList(String fn, SubQuery<HReceiveHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HReceiveHCB cb = new HReceiveHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProcessTypeId_QueryDerivedReferrer_HReceiveHList(cb.query()); String prpp = keepProcessTypeId_QueryDerivedReferrer_HReceiveHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", sqpp, "hReceiveHList", rd, vl, prpp, op);
    }
    public abstract String keepProcessTypeId_QueryDerivedReferrer_HReceiveHList(HReceiveHCQ sq);
    public abstract String keepProcessTypeId_QueryDerivedReferrer_HReceiveHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from H_SHIPPING_H where ...)} <br>
     * H_SHIPPING_H by PROCESS_TYPE_ID, named 'HShippingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedHShippingHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<HShippingHCB> derivedHShippingHList() {
        return xcreateQDRFunctionHShippingHList();
    }
    protected HpQDRFunction<HShippingHCB> xcreateQDRFunctionHShippingHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveHShippingHList(fn, sq, rd, vl, op));
    }
    public void xqderiveHShippingHList(String fn, SubQuery<HShippingHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HShippingHCB cb = new HShippingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProcessTypeId_QueryDerivedReferrer_HShippingHList(cb.query()); String prpp = keepProcessTypeId_QueryDerivedReferrer_HShippingHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", sqpp, "hShippingHList", rd, vl, prpp, op);
    }
    public abstract String keepProcessTypeId_QueryDerivedReferrer_HShippingHList(HShippingHCQ sq);
    public abstract String keepProcessTypeId_QueryDerivedReferrer_HShippingHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from H_STOCK_INOUT where ...)} <br>
     * H_STOCK_INOUT by PROCESS_TYPE_ID, named 'HStockInoutAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedHStockInoutList()</span>.<span style="color: #CC4747">max</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inoutCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<HStockInoutCB> derivedHStockInoutList() {
        return xcreateQDRFunctionHStockInoutList();
    }
    protected HpQDRFunction<HStockInoutCB> xcreateQDRFunctionHStockInoutList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveHStockInoutList(fn, sq, rd, vl, op));
    }
    public void xqderiveHStockInoutList(String fn, SubQuery<HStockInoutCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HStockInoutCB cb = new HStockInoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProcessTypeId_QueryDerivedReferrer_HStockInoutList(cb.query()); String prpp = keepProcessTypeId_QueryDerivedReferrer_HStockInoutListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", sqpp, "hStockInoutList", rd, vl, prpp, op);
    }
    public abstract String keepProcessTypeId_QueryDerivedReferrer_HStockInoutList(HStockInoutCQ sq);
    public abstract String keepProcessTypeId_QueryDerivedReferrer_HStockInoutListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by PROCESS_TYPE_ID, named 'TAllocInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocInstHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocInstHCB> derivedTAllocInstHList() {
        return xcreateQDRFunctionTAllocInstHList();
    }
    protected HpQDRFunction<TAllocInstHCB> xcreateQDRFunctionTAllocInstHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAllocInstHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAllocInstHList(String fn, SubQuery<TAllocInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProcessTypeId_QueryDerivedReferrer_TAllocInstHList(cb.query()); String prpp = keepProcessTypeId_QueryDerivedReferrer_TAllocInstHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", sqpp, "tAllocInstHList", rd, vl, prpp, op);
    }
    public abstract String keepProcessTypeId_QueryDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq);
    public abstract String keepProcessTypeId_QueryDerivedReferrer_TAllocInstHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_MOVE_INST_H where ...)} <br>
     * T_MOVE_INST_H by PROCESS_TYPE_ID, named 'TMoveInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTMoveInstHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TMoveInstHCB> derivedTMoveInstHList() {
        return xcreateQDRFunctionTMoveInstHList();
    }
    protected HpQDRFunction<TMoveInstHCB> xcreateQDRFunctionTMoveInstHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTMoveInstHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTMoveInstHList(String fn, SubQuery<TMoveInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstHCB cb = new TMoveInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProcessTypeId_QueryDerivedReferrer_TMoveInstHList(cb.query()); String prpp = keepProcessTypeId_QueryDerivedReferrer_TMoveInstHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", sqpp, "tMoveInstHList", rd, vl, prpp, op);
    }
    public abstract String keepProcessTypeId_QueryDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq);
    public abstract String keepProcessTypeId_QueryDerivedReferrer_TMoveInstHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PACKING_H where ...)} <br>
     * T_PACKING_H by PROCESS_TYPE_ID, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPackingHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPackingHCB> derivedTPackingHList() {
        return xcreateQDRFunctionTPackingHList();
    }
    protected HpQDRFunction<TPackingHCB> xcreateQDRFunctionTPackingHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPackingHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPackingHList(String fn, SubQuery<TPackingHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProcessTypeId_QueryDerivedReferrer_TPackingHList(cb.query()); String prpp = keepProcessTypeId_QueryDerivedReferrer_TPackingHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", sqpp, "tPackingHList", rd, vl, prpp, op);
    }
    public abstract String keepProcessTypeId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq);
    public abstract String keepProcessTypeId_QueryDerivedReferrer_TPackingHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PICKING_H where ...)} <br>
     * T_PICKING_H by PROCESS_TYPE_ID, named 'TPickingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingHCB> derivedTPickingHList() {
        return xcreateQDRFunctionTPickingHList();
    }
    protected HpQDRFunction<TPickingHCB> xcreateQDRFunctionTPickingHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingHList(String fn, SubQuery<TPickingHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProcessTypeId_QueryDerivedReferrer_TPickingHList(cb.query()); String prpp = keepProcessTypeId_QueryDerivedReferrer_TPickingHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", sqpp, "tPickingHList", rd, vl, prpp, op);
    }
    public abstract String keepProcessTypeId_QueryDerivedReferrer_TPickingHList(TPickingHCQ sq);
    public abstract String keepProcessTypeId_QueryDerivedReferrer_TPickingHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_RECEIVE_PLAN_H where ...)} <br>
     * T_RECEIVE_PLAN_H by PROCESS_TYPE_ID, named 'TReceivePlanHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReceivePlanHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReceivePlanHCB> derivedTReceivePlanHList() {
        return xcreateQDRFunctionTReceivePlanHList();
    }
    protected HpQDRFunction<TReceivePlanHCB> xcreateQDRFunctionTReceivePlanHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReceivePlanHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReceivePlanHList(String fn, SubQuery<TReceivePlanHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProcessTypeId_QueryDerivedReferrer_TReceivePlanHList(cb.query()); String prpp = keepProcessTypeId_QueryDerivedReferrer_TReceivePlanHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", sqpp, "tReceivePlanHList", rd, vl, prpp, op);
    }
    public abstract String keepProcessTypeId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq);
    public abstract String keepProcessTypeId_QueryDerivedReferrer_TReceivePlanHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by PROCESS_TYPE_ID, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingInstHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingInstHCB> derivedTShippingInstHList() {
        return xcreateQDRFunctionTShippingInstHList();
    }
    protected HpQDRFunction<TShippingInstHCB> xcreateQDRFunctionTShippingInstHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingInstHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingInstHList(String fn, SubQuery<TShippingInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProcessTypeId_QueryDerivedReferrer_TShippingInstHList(cb.query()); String prpp = keepProcessTypeId_QueryDerivedReferrer_TShippingInstHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", sqpp, "tShippingInstHList", rd, vl, prpp, op);
    }
    public abstract String keepProcessTypeId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq);
    public abstract String keepProcessTypeId_QueryDerivedReferrer_TShippingInstHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by PROCESS_TYPE_ID, named 'TStockInoutAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProcessTypeId_QueryDerivedReferrer_TStockInoutList(cb.query()); String prpp = keepProcessTypeId_QueryDerivedReferrer_TStockInoutListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", sqpp, "tStockInoutList", rd, vl, prpp, op);
    }
    public abstract String keepProcessTypeId_QueryDerivedReferrer_TStockInoutList(TStockInoutCQ sq);
    public abstract String keepProcessTypeId_QueryDerivedReferrer_TStockInoutListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_STORE_RECORD_H where ...)} <br>
     * T_STORE_RECORD_H by PROCESS_TYPE_ID, named 'TStoreRecordHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStoreRecordHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStoreRecordHCB> derivedTStoreRecordHList() {
        return xcreateQDRFunctionTStoreRecordHList();
    }
    protected HpQDRFunction<TStoreRecordHCB> xcreateQDRFunctionTStoreRecordHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStoreRecordHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStoreRecordHList(String fn, SubQuery<TStoreRecordHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProcessTypeId_QueryDerivedReferrer_TStoreRecordHList(cb.query()); String prpp = keepProcessTypeId_QueryDerivedReferrer_TStoreRecordHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", sqpp, "tStoreRecordHList", rd, vl, prpp, op);
    }
    public abstract String keepProcessTypeId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq);
    public abstract String keepProcessTypeId_QueryDerivedReferrer_TStoreRecordHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by PROCESS_TYPE_ID, named 'WHtReceiveNoPlanInspAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProcessTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(cb.query()); String prpp = keepProcessTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", sqpp, "wHtReceiveNoPlanInspList", rd, vl, prpp, op);
    }
    public abstract String keepProcessTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);
    public abstract String keepProcessTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setProcessTypeId_IsNull() { regProcessTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setProcessTypeId_IsNotNull() { regProcessTypeId(CK_ISNN, DOBJ); }

    protected void regProcessTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueProcessTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {UQ, NotNull, varchar(30)}
     * @param processTypeCd The value of processTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_Equal(String processTypeCd) {
        doSetProcessTypeCd_Equal(fRES(processTypeCd));
    }

    protected void doSetProcessTypeCd_Equal(String processTypeCd) {
        regProcessTypeCd(CK_EQ, processTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {UQ, NotNull, varchar(30)}
     * @param processTypeCd The value of processTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_NotEqual(String processTypeCd) {
        doSetProcessTypeCd_NotEqual(fRES(processTypeCd));
    }

    protected void doSetProcessTypeCd_NotEqual(String processTypeCd) {
        regProcessTypeCd(CK_NES, processTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {UQ, NotNull, varchar(30)}
     * @param processTypeCd The value of processTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_GreaterThan(String processTypeCd) {
        regProcessTypeCd(CK_GT, fRES(processTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {UQ, NotNull, varchar(30)}
     * @param processTypeCd The value of processTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_LessThan(String processTypeCd) {
        regProcessTypeCd(CK_LT, fRES(processTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {UQ, NotNull, varchar(30)}
     * @param processTypeCd The value of processTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_GreaterEqual(String processTypeCd) {
        regProcessTypeCd(CK_GE, fRES(processTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {UQ, NotNull, varchar(30)}
     * @param processTypeCd The value of processTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_LessEqual(String processTypeCd) {
        regProcessTypeCd(CK_LE, fRES(processTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {UQ, NotNull, varchar(30)}
     * @param processTypeCdList The collection of processTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_InScope(Collection<String> processTypeCdList) {
        doSetProcessTypeCd_InScope(processTypeCdList);
    }

    protected void doSetProcessTypeCd_InScope(Collection<String> processTypeCdList) {
        regINS(CK_INS, cTL(processTypeCdList), xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {UQ, NotNull, varchar(30)}
     * @param processTypeCdList The collection of processTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_NotInScope(Collection<String> processTypeCdList) {
        doSetProcessTypeCd_NotInScope(processTypeCdList);
    }

    protected void doSetProcessTypeCd_NotInScope(Collection<String> processTypeCdList) {
        regINS(CK_NINS, cTL(processTypeCdList), xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {UQ, NotNull, varchar(30)} <br>
     * <pre>e.g. setProcessTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param processTypeCd The value of processTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProcessTypeCd_LikeSearch(String processTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(processTypeCd), xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {UQ, NotNull, varchar(30)}
     * @param processTypeCd The value of processTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProcessTypeCd_NotLikeSearch(String processTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(processTypeCd), xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {UQ, NotNull, varchar(30)}
     * @param processTypeCd The value of processTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_PrefixSearch(String processTypeCd) {
        setProcessTypeCd_LikeSearch(processTypeCd, xcLSOPPre());
    }

    protected void regProcessTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueProcessTypeCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_Equal(Long dictId) {
        doSetDictId_Equal(dictId);
    }

    protected void doSetDictId_Equal(Long dictId) {
        regDictId(CK_EQ, dictId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_NotEqual(Long dictId) {
        doSetDictId_NotEqual(dictId);
    }

    protected void doSetDictId_NotEqual(Long dictId) {
        regDictId(CK_NES, dictId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterThan(Long dictId) {
        regDictId(CK_GT, dictId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessThan(Long dictId) {
        regDictId(CK_LT, dictId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterEqual(Long dictId) {
        regDictId(CK_GE, dictId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessEqual(Long dictId) {
        regDictId(CK_LE, dictId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param minNumber The min number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDictId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDictId(), "DICT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictIdList The collection of dictId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictId_InScope(Collection<Long> dictIdList) {
        doSetDictId_InScope(dictIdList);
    }

    protected void doSetDictId_InScope(Collection<Long> dictIdList) {
        regINS(CK_INS, cTL(dictIdList), xgetCValueDictId(), "DICT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictIdList The collection of dictId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictId_NotInScope(Collection<Long> dictIdList) {
        doSetDictId_NotInScope(dictIdList);
    }

    protected void doSetDictId_NotInScope(Collection<Long> dictIdList) {
        regINS(CK_NINS, cTL(dictIdList), xgetCValueDictId(), "DICT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DICT_ID from B_DICT where ...)} <br />
     * B_DICT by my DICT_ID, named 'BDict'.
     * @param subCBLambda The callback for sub-query of BDict for 'in-scope'. (NotNull)
     */
    public void inScopeBDict(SubQuery<BDictCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BDictCB cb = new BDictCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDictId_InScopeRelation_BDict(cb.query());
        registerInScopeRelation(cb.query(), "DICT_ID", "DICT_ID", pp, "bDict", false);
    }
    public abstract String keepDictId_InScopeRelation_BDict(BDictCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DICT_ID from B_DICT where ...)} <br />
     * B_DICT by my DICT_ID, named 'BDict'.
     * @param subCBLambda The callback for sub-query of BDict for 'not in-scope'. (NotNull)
     */
    public void notInScopeBDict(SubQuery<BDictCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BDictCB cb = new BDictCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDictId_NotInScopeRelation_BDict(cb.query());
        registerInScopeRelation(cb.query(), "DICT_ID", "DICT_ID", pp, "bDict", true);
    }
    public abstract String keepDictId_NotInScopeRelation_BDict(BDictCQ sq);

    protected void regDictId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDictId(), "DICT_ID"); }
    protected abstract ConditionValue xgetCValueDictId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ReceiveFlg}
     * @param receiveFlg The value of receiveFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveFlg_Equal(String receiveFlg) {
        doSetReceiveFlg_Equal(fRES(receiveFlg));
    }

    /**
     * Equal(=). As ReceiveFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ReceiveFlg} <br>
     * 入荷フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveFlg_Equal_AsReceiveFlg(CDef.ReceiveFlg cdef) {
        doSetReceiveFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 入荷対象外
     */
    public void setReceiveFlg_Equal_$0() {
        setReceiveFlg_Equal_AsReceiveFlg(CDef.ReceiveFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 入荷対象
     */
    public void setReceiveFlg_Equal_$1() {
        setReceiveFlg_Equal_AsReceiveFlg(CDef.ReceiveFlg.$1);
    }

    protected void doSetReceiveFlg_Equal(String receiveFlg) {
        regReceiveFlg(CK_EQ, receiveFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ReceiveFlg}
     * @param receiveFlg The value of receiveFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveFlg_NotEqual(String receiveFlg) {
        doSetReceiveFlg_NotEqual(fRES(receiveFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ReceiveFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ReceiveFlg} <br>
     * 入荷フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveFlg_NotEqual_AsReceiveFlg(CDef.ReceiveFlg cdef) {
        doSetReceiveFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 入荷対象外
     */
    public void setReceiveFlg_NotEqual_$0() {
        setReceiveFlg_NotEqual_AsReceiveFlg(CDef.ReceiveFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 入荷対象
     */
    public void setReceiveFlg_NotEqual_$1() {
        setReceiveFlg_NotEqual_AsReceiveFlg(CDef.ReceiveFlg.$1);
    }

    protected void doSetReceiveFlg_NotEqual(String receiveFlg) {
        regReceiveFlg(CK_NES, receiveFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ReceiveFlg}
     * @param receiveFlgList The collection of receiveFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveFlg_InScope(Collection<String> receiveFlgList) {
        doSetReceiveFlg_InScope(receiveFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ReceiveFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ReceiveFlg} <br>
     * 入荷フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveFlg_InScope_AsReceiveFlg(Collection<CDef.ReceiveFlg> cdefList) {
        doSetReceiveFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetReceiveFlg_InScope(Collection<String> receiveFlgList) {
        regINS(CK_INS, cTL(receiveFlgList), xgetCValueReceiveFlg(), "RECEIVE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ReceiveFlg}
     * @param receiveFlgList The collection of receiveFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveFlg_NotInScope(Collection<String> receiveFlgList) {
        doSetReceiveFlg_NotInScope(receiveFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ReceiveFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ReceiveFlg} <br>
     * 入荷フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveFlg_NotInScope_AsReceiveFlg(Collection<CDef.ReceiveFlg> cdefList) {
        doSetReceiveFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetReceiveFlg_NotInScope(Collection<String> receiveFlgList) {
        regINS(CK_NINS, cTL(receiveFlgList), xgetCValueReceiveFlg(), "RECEIVE_FLG");
    }

    protected void regReceiveFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveFlg(), "RECEIVE_FLG"); }
    protected abstract ConditionValue xgetCValueReceiveFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ShippingFlg}
     * @param shippingFlg The value of shippingFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFlg_Equal(String shippingFlg) {
        doSetShippingFlg_Equal(fRES(shippingFlg));
    }

    /**
     * Equal(=). As ShippingFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ShippingFlg} <br>
     * 出荷フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingFlg_Equal_AsShippingFlg(CDef.ShippingFlg cdef) {
        doSetShippingFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出荷対象外
     */
    public void setShippingFlg_Equal_$0() {
        setShippingFlg_Equal_AsShippingFlg(CDef.ShippingFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出荷対象
     */
    public void setShippingFlg_Equal_$1() {
        setShippingFlg_Equal_AsShippingFlg(CDef.ShippingFlg.$1);
    }

    protected void doSetShippingFlg_Equal(String shippingFlg) {
        regShippingFlg(CK_EQ, shippingFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ShippingFlg}
     * @param shippingFlg The value of shippingFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFlg_NotEqual(String shippingFlg) {
        doSetShippingFlg_NotEqual(fRES(shippingFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ShippingFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ShippingFlg} <br>
     * 出荷フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingFlg_NotEqual_AsShippingFlg(CDef.ShippingFlg cdef) {
        doSetShippingFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出荷対象外
     */
    public void setShippingFlg_NotEqual_$0() {
        setShippingFlg_NotEqual_AsShippingFlg(CDef.ShippingFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出荷対象
     */
    public void setShippingFlg_NotEqual_$1() {
        setShippingFlg_NotEqual_AsShippingFlg(CDef.ShippingFlg.$1);
    }

    protected void doSetShippingFlg_NotEqual(String shippingFlg) {
        regShippingFlg(CK_NES, shippingFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ShippingFlg}
     * @param shippingFlgList The collection of shippingFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFlg_InScope(Collection<String> shippingFlgList) {
        doSetShippingFlg_InScope(shippingFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ShippingFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ShippingFlg} <br>
     * 出荷フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFlg_InScope_AsShippingFlg(Collection<CDef.ShippingFlg> cdefList) {
        doSetShippingFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetShippingFlg_InScope(Collection<String> shippingFlgList) {
        regINS(CK_INS, cTL(shippingFlgList), xgetCValueShippingFlg(), "SHIPPING_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ShippingFlg}
     * @param shippingFlgList The collection of shippingFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFlg_NotInScope(Collection<String> shippingFlgList) {
        doSetShippingFlg_NotInScope(shippingFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ShippingFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ShippingFlg} <br>
     * 出荷フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFlg_NotInScope_AsShippingFlg(Collection<CDef.ShippingFlg> cdefList) {
        doSetShippingFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetShippingFlg_NotInScope(Collection<String> shippingFlgList) {
        regINS(CK_NINS, cTL(shippingFlgList), xgetCValueShippingFlg(), "SHIPPING_FLG");
    }

    protected void regShippingFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingFlg(), "SHIPPING_FLG"); }
    protected abstract ConditionValue xgetCValueShippingFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockAdjustFlg}
     * @param stockAdjustFlg The value of stockAdjustFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockAdjustFlg_Equal(String stockAdjustFlg) {
        doSetStockAdjustFlg_Equal(fRES(stockAdjustFlg));
    }

    /**
     * Equal(=). As StockAdjustFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockAdjustFlg} <br>
     * 在庫調整フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStockAdjustFlg_Equal_AsStockAdjustFlg(CDef.StockAdjustFlg cdef) {
        doSetStockAdjustFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 在庫調整対象外
     */
    public void setStockAdjustFlg_Equal_$0() {
        setStockAdjustFlg_Equal_AsStockAdjustFlg(CDef.StockAdjustFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 在庫調整対象
     */
    public void setStockAdjustFlg_Equal_$1() {
        setStockAdjustFlg_Equal_AsStockAdjustFlg(CDef.StockAdjustFlg.$1);
    }

    protected void doSetStockAdjustFlg_Equal(String stockAdjustFlg) {
        regStockAdjustFlg(CK_EQ, stockAdjustFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockAdjustFlg}
     * @param stockAdjustFlg The value of stockAdjustFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockAdjustFlg_NotEqual(String stockAdjustFlg) {
        doSetStockAdjustFlg_NotEqual(fRES(stockAdjustFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As StockAdjustFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockAdjustFlg} <br>
     * 在庫調整フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStockAdjustFlg_NotEqual_AsStockAdjustFlg(CDef.StockAdjustFlg cdef) {
        doSetStockAdjustFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 在庫調整対象外
     */
    public void setStockAdjustFlg_NotEqual_$0() {
        setStockAdjustFlg_NotEqual_AsStockAdjustFlg(CDef.StockAdjustFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 在庫調整対象
     */
    public void setStockAdjustFlg_NotEqual_$1() {
        setStockAdjustFlg_NotEqual_AsStockAdjustFlg(CDef.StockAdjustFlg.$1);
    }

    protected void doSetStockAdjustFlg_NotEqual(String stockAdjustFlg) {
        regStockAdjustFlg(CK_NES, stockAdjustFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockAdjustFlg}
     * @param stockAdjustFlgList The collection of stockAdjustFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockAdjustFlg_InScope(Collection<String> stockAdjustFlgList) {
        doSetStockAdjustFlg_InScope(stockAdjustFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As StockAdjustFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockAdjustFlg} <br>
     * 在庫調整フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockAdjustFlg_InScope_AsStockAdjustFlg(Collection<CDef.StockAdjustFlg> cdefList) {
        doSetStockAdjustFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetStockAdjustFlg_InScope(Collection<String> stockAdjustFlgList) {
        regINS(CK_INS, cTL(stockAdjustFlgList), xgetCValueStockAdjustFlg(), "STOCK_ADJUST_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockAdjustFlg}
     * @param stockAdjustFlgList The collection of stockAdjustFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockAdjustFlg_NotInScope(Collection<String> stockAdjustFlgList) {
        doSetStockAdjustFlg_NotInScope(stockAdjustFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As StockAdjustFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockAdjustFlg} <br>
     * 在庫調整フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockAdjustFlg_NotInScope_AsStockAdjustFlg(Collection<CDef.StockAdjustFlg> cdefList) {
        doSetStockAdjustFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetStockAdjustFlg_NotInScope(Collection<String> stockAdjustFlgList) {
        regINS(CK_NINS, cTL(stockAdjustFlgList), xgetCValueStockAdjustFlg(), "STOCK_ADJUST_FLG");
    }

    protected void regStockAdjustFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockAdjustFlg(), "STOCK_ADJUST_FLG"); }
    protected abstract ConditionValue xgetCValueStockAdjustFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_Equal(String defaultFlg) {
        doSetDefaultFlg_Equal(fRES(defaultFlg));
    }

    protected void doSetDefaultFlg_Equal(String defaultFlg) {
        regDefaultFlg(CK_EQ, defaultFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_NotEqual(String defaultFlg) {
        doSetDefaultFlg_NotEqual(fRES(defaultFlg));
    }

    protected void doSetDefaultFlg_NotEqual(String defaultFlg) {
        regDefaultFlg(CK_NES, defaultFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_GreaterThan(String defaultFlg) {
        regDefaultFlg(CK_GT, fRES(defaultFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_LessThan(String defaultFlg) {
        regDefaultFlg(CK_LT, fRES(defaultFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_GreaterEqual(String defaultFlg) {
        regDefaultFlg(CK_GE, fRES(defaultFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_LessEqual(String defaultFlg) {
        regDefaultFlg(CK_LE, fRES(defaultFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEFAULT_FLG: {char(1), default=[0]}
     * @param defaultFlgList The collection of defaultFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_InScope(Collection<String> defaultFlgList) {
        doSetDefaultFlg_InScope(defaultFlgList);
    }

    protected void doSetDefaultFlg_InScope(Collection<String> defaultFlgList) {
        regINS(CK_INS, cTL(defaultFlgList), xgetCValueDefaultFlg(), "DEFAULT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEFAULT_FLG: {char(1), default=[0]}
     * @param defaultFlgList The collection of defaultFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_NotInScope(Collection<String> defaultFlgList) {
        doSetDefaultFlg_NotInScope(defaultFlgList);
    }

    protected void doSetDefaultFlg_NotInScope(Collection<String> defaultFlgList) {
        regINS(CK_NINS, cTL(defaultFlgList), xgetCValueDefaultFlg(), "DEFAULT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_FLG: {char(1), default=[0]} <br>
     * <pre>e.g. setDefaultFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param defaultFlg The value of defaultFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDefaultFlg_LikeSearch(String defaultFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(defaultFlg), xgetCValueDefaultFlg(), "DEFAULT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_FLG: {char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDefaultFlg_NotLikeSearch(String defaultFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(defaultFlg), xgetCValueDefaultFlg(), "DEFAULT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_FLG: {char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_PrefixSearch(String defaultFlg) {
        setDefaultFlg_LikeSearch(defaultFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {char(1), default=[0]}
     */
    public void setDefaultFlg_IsNull() { regDefaultFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {char(1), default=[0]}
     */
    public void setDefaultFlg_IsNotNull() { regDefaultFlg(CK_ISNN, DOBJ); }

    protected void regDefaultFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDefaultFlg(), "DEFAULT_FLG"); }
    protected abstract ConditionValue xgetCValueDefaultFlg();

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
    public HpSLCFunction<MProcessTypeCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MProcessTypeCB.class);
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
    public HpSLCFunction<MProcessTypeCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MProcessTypeCB.class);
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
    public HpSLCFunction<MProcessTypeCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MProcessTypeCB.class);
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
    public HpSLCFunction<MProcessTypeCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MProcessTypeCB.class);
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
    public HpSLCFunction<MProcessTypeCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MProcessTypeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MProcessTypeCB&gt;() {
     *     public void query(MProcessTypeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MProcessTypeCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MProcessTypeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MProcessTypeCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MProcessTypeCQ sq);

    protected MProcessTypeCB xcreateScalarConditionCB() {
        MProcessTypeCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MProcessTypeCB xcreateScalarConditionPartitionByCB() {
        MProcessTypeCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MProcessTypeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProcessTypeCB cb = new MProcessTypeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PROCESS_TYPE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MProcessTypeCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MProcessTypeCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MProcessTypeCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProcessTypeCB cb = new MProcessTypeCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PROCESS_TYPE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MProcessTypeCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MProcessTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProcessTypeCB cb = new MProcessTypeCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MProcessTypeCQ sq);

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
    protected MProcessTypeCB newMyCB() {
        return new MProcessTypeCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MProcessTypeCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
