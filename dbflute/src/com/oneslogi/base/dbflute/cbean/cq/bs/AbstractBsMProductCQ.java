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
 * The abstract condition-query of M_PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMProductCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_PRODUCT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPLENISH_PRODUCT_ID from M_LOCATION where ...)} <br>
     * M_LOCATION by REPLENISH_PRODUCT_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMLocationList</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MLocationList for 'exists'. (NotNull)
     */
    public void existsMLocationList(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_MLocationList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "REPLENISH_PRODUCT_ID", pp, "mLocationList");
    }
    public abstract String keepProductId_ExistsReferrer_MLocationList(MLocationCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from M_MFWHxITEM where ...)} <br>
     * M_MFWHxITEM by PRODUCT_ID, named 'MMfwhxitemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMMfwhxitemList</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     entityCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MMfwhxitemList for 'exists'. (NotNull)
     */
    public void existsMMfwhxitemList(SubQuery<MMfwhxitemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfwhxitemCB cb = new MMfwhxitemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_MMfwhxitemList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mMfwhxitemList");
    }
    public abstract String keepProductId_ExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from M_PRODUCT where ...)} <br>
     * M_PRODUCT by PRODUCT_ID, named 'MProductSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMProductSelfAsOne</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MProductSelfAsOne for 'exists'. (NotNull)
     */
    public void existsMProductSelfAsOne(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_MProductSelfAsOne(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProductSelfAsOne");
    }
    public abstract String keepProductId_ExistsReferrer_MProductSelfAsOne(MProductCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from M_PRODUCT_SHAPE where ...)} <br>
     * M_PRODUCT_SHAPE by PRODUCT_ID, named 'MProductShapeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMProductShapeList</span>(shapeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shapeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MProductShapeList for 'exists'. (NotNull)
     */
    public void existsMProductShapeList(SubQuery<MProductShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_MProductShapeList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProductShapeList");
    }
    public abstract String keepProductId_ExistsReferrer_MProductShapeList(MProductShapeCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from M_PRODUCT_TERM where ...)} <br>
     * M_PRODUCT_TERM by PRODUCT_ID, named 'MProductTermAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMProductTermAsOne</span>(termCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     termCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MProductTermAsOne for 'exists'. (NotNull)
     */
    public void existsMProductTermAsOne(SubQuery<MProductTermCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductTermCB cb = new MProductTermCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_MProductTermAsOne(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProductTermAsOne");
    }
    public abstract String keepProductId_ExistsReferrer_MProductTermAsOne(MProductTermCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from M_SET_PARENT where ...)} <br>
     * M_SET_PARENT by PRODUCT_ID, named 'MSetParentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMSetParentAsOne</span>(parentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     parentCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MSetParentAsOne for 'exists'. (NotNull)
     */
    public void existsMSetParentAsOne(SubQuery<MSetParentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MSetParentCB cb = new MSetParentCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_MSetParentAsOne(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mSetParentAsOne");
    }
    public abstract String keepProductId_ExistsReferrer_MSetParentAsOne(MSetParentCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from M_SET_STRUCTURE where ...)} <br>
     * M_SET_STRUCTURE by PRODUCT_ID, named 'MSetStructureAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMSetStructureList</span>(structureCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     structureCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MSetStructureList for 'exists'. (NotNull)
     */
    public void existsMSetStructureList(SubQuery<MSetStructureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MSetStructureCB cb = new MSetStructureCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_MSetStructureList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mSetStructureList");
    }
    public abstract String keepProductId_ExistsReferrer_MSetStructureList(MSetStructureCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from T_ALLOC_INST_B where ...)} <br>
     * T_ALLOC_INST_B by PRODUCT_ID, named 'TAllocInstBAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TAllocInstBList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tAllocInstBList");
    }
    public abstract String keepProductId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from T_ALLOC_LOT where ...)} <br>
     * T_ALLOC_LOT by PRODUCT_ID, named 'TAllocLotAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TAllocLotList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tAllocLotList");
    }
    public abstract String keepProductId_ExistsReferrer_TAllocLotList(TAllocLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from T_INVENTORY_B where ...)} <br>
     * T_INVENTORY_B by PRODUCT_ID, named 'TInventoryBAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TInventoryBList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tInventoryBList");
    }
    public abstract String keepProductId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from T_KEEPING_LOT where ...)} <br>
     * T_KEEPING_LOT by PRODUCT_ID, named 'TKeepingLotAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TKeepingLotList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tKeepingLotList");
    }
    public abstract String keepProductId_ExistsReferrer_TKeepingLotList(TKeepingLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from T_LAST_LOT where ...)} <br>
     * T_LAST_LOT by PRODUCT_ID, named 'TLastLotAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TLastLotList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tLastLotList");
    }
    public abstract String keepProductId_ExistsReferrer_TLastLotList(TLastLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from T_LOT where ...)} <br>
     * T_LOT by PRODUCT_ID, named 'TLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TLotList for 'exists'. (NotNull)
     */
    public void existsTLotList(SubQuery<TLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLotCB cb = new TLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TLotList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tLotList");
    }
    public abstract String keepProductId_ExistsReferrer_TLotList(TLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from T_MOVE_INST_B where ...)} <br>
     * T_MOVE_INST_B by PRODUCT_ID, named 'TMoveInstBAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TMoveInstBList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tMoveInstBList");
    }
    public abstract String keepProductId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from T_RECEIVE_PLAN_B where ...)} <br>
     * T_RECEIVE_PLAN_B by PRODUCT_ID, named 'TReceivePlanBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceivePlanBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceivePlanBList for 'exists'. (NotNull)
     */
    public void existsTReceivePlanBList(SubQuery<TReceivePlanBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TReceivePlanBList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tReceivePlanBList");
    }
    public abstract String keepProductId_ExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from T_SERIAL_NO where ...)} <br>
     * T_SERIAL_NO by PRODUCT_ID, named 'TSerialNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTSerialNoList</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TSerialNoList for 'exists'. (NotNull)
     */
    public void existsTSerialNoList(SubQuery<TSerialNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TSerialNoList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tSerialNoList");
    }
    public abstract String keepProductId_ExistsReferrer_TSerialNoList(TSerialNoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from T_SHIPPING_INST_B where ...)} <br>
     * T_SHIPPING_INST_B by PRODUCT_ID, named 'TShippingInstBAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TShippingInstBList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tShippingInstBList");
    }
    public abstract String keepProductId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from T_STOCK where ...)} <br>
     * T_STOCK by PRODUCT_ID, named 'TStockAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TStockList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tStockList");
    }
    public abstract String keepProductId_ExistsReferrer_TStockList(TStockCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from T_TRINVCHECKINFO where ...)} <br>
     * T_TRINVCHECKINFO by PRODUCT_ID, named 'TTrinvcheckinfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrinvcheckinfoList</span>(trinvcheckinfoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvcheckinfoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrinvcheckinfoList for 'exists'. (NotNull)
     */
    public void existsTTrinvcheckinfoList(SubQuery<TTrinvcheckinfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrinvcheckinfoCB cb = new TTrinvcheckinfoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TTrinvcheckinfoList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tTrinvcheckinfoList");
    }
    public abstract String keepProductId_ExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from T_YTRSODETAIL where ...)} <br>
     * T_YTRSODETAIL by PRODUCT_ID, named 'TYtrsodetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTYtrsodetailList</span>(ytrsodetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ytrsodetailCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TYtrsodetailList for 'exists'. (NotNull)
     */
    public void existsTYtrsodetailList(SubQuery<TYtrsodetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYtrsodetailCB cb = new TYtrsodetailCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TYtrsodetailList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tYtrsodetailList");
    }
    public abstract String keepProductId_ExistsReferrer_TYtrsodetailList(TYtrsodetailCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from W_HT_INVENTORY_INPUT_PROD where ...)} <br>
     * W_HT_INVENTORY_INPUT_PROD by PRODUCT_ID, named 'WHtInventoryInputProdAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepProductId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from W_HT_RECEIVE_INSPECTION where ...)} <br>
     * W_HT_RECEIVE_INSPECTION by PRODUCT_ID, named 'WHtReceiveInspectionAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WHtReceiveInspectionList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveInspectionList");
    }
    public abstract String keepProductId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by PRODUCT_ID, named 'WHtReceiveNoPlanInspAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveNoPlanInspList");
    }
    public abstract String keepProductId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from W_HT_RECEIVE_STORE where ...)} <br>
     * W_HT_RECEIVE_STORE by PRODUCT_ID, named 'WHtReceiveStoreAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WHtReceiveStoreList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveStoreList");
    }
    public abstract String keepProductId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from W_HT_SHIPPING where ...)} <br>
     * W_HT_SHIPPING by PRODUCT_ID, named 'WHtShippingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtShippingList</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shippingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtShippingList for 'exists'. (NotNull)
     */
    public void existsWHtShippingList(SubQuery<WHtShippingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WHtShippingList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtShippingList");
    }
    public abstract String keepProductId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from W_HT_SHIPPING_PICKING where ...)} <br>
     * W_HT_SHIPPING_PICKING by PRODUCT_ID, named 'WHtShippingPickingAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WHtShippingPickingList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtShippingPickingList");
    }
    public abstract String keepProductId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from W_SGL_ROW_SHIP_INSP_H where ...)} <br>
     * W_SGL_ROW_SHIP_INSP_H by PRODUCT_ID, named 'WSglRowShipInspHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWSglRowShipInspHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WSglRowShipInspHList for 'exists'. (NotNull)
     */
    public void existsWSglRowShipInspHList(SubQuery<WSglRowShipInspHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WSglRowShipInspHList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wSglRowShipInspHList");
    }
    public abstract String keepProductId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from W_SHIPPING_INTERRUPT where ...)} <br>
     * W_SHIPPING_INTERRUPT by PRODUCT_ID, named 'WShippingInterruptAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWShippingInterruptList</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     interruptCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WShippingInterruptList for 'exists'. (NotNull)
     */
    public void existsWShippingInterruptList(SubQuery<WShippingInterruptCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WShippingInterruptList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wShippingInterruptList");
    }
    public abstract String keepProductId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPLENISH_PRODUCT_ID from M_LOCATION where ...)} <br>
     * M_LOCATION by REPLENISH_PRODUCT_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMLocationList</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_MLocationList for 'not exists'. (NotNull)
     */
    public void notExistsMLocationList(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_MLocationList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "REPLENISH_PRODUCT_ID", pp, "mLocationList");
    }
    public abstract String keepProductId_NotExistsReferrer_MLocationList(MLocationCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from M_MFWHxITEM where ...)} <br>
     * M_MFWHxITEM by PRODUCT_ID, named 'MMfwhxitemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMMfwhxitemList</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     entityCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_MMfwhxitemList for 'not exists'. (NotNull)
     */
    public void notExistsMMfwhxitemList(SubQuery<MMfwhxitemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfwhxitemCB cb = new MMfwhxitemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_MMfwhxitemList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mMfwhxitemList");
    }
    public abstract String keepProductId_NotExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from M_PRODUCT where ...)} <br>
     * M_PRODUCT by PRODUCT_ID, named 'MProductSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMProductSelfAsOne</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_MProductSelfAsOne for 'not exists'. (NotNull)
     */
    public void notExistsMProductSelfAsOne(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_MProductSelfAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProductSelfAsOne");
    }
    public abstract String keepProductId_NotExistsReferrer_MProductSelfAsOne(MProductCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from M_PRODUCT_SHAPE where ...)} <br>
     * M_PRODUCT_SHAPE by PRODUCT_ID, named 'MProductShapeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMProductShapeList</span>(shapeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shapeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_MProductShapeList for 'not exists'. (NotNull)
     */
    public void notExistsMProductShapeList(SubQuery<MProductShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_MProductShapeList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProductShapeList");
    }
    public abstract String keepProductId_NotExistsReferrer_MProductShapeList(MProductShapeCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from M_PRODUCT_TERM where ...)} <br>
     * M_PRODUCT_TERM by PRODUCT_ID, named 'MProductTermAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMProductTermAsOne</span>(termCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     termCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_MProductTermAsOne for 'not exists'. (NotNull)
     */
    public void notExistsMProductTermAsOne(SubQuery<MProductTermCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductTermCB cb = new MProductTermCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_MProductTermAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProductTermAsOne");
    }
    public abstract String keepProductId_NotExistsReferrer_MProductTermAsOne(MProductTermCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from M_SET_PARENT where ...)} <br>
     * M_SET_PARENT by PRODUCT_ID, named 'MSetParentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMSetParentAsOne</span>(parentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     parentCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_MSetParentAsOne for 'not exists'. (NotNull)
     */
    public void notExistsMSetParentAsOne(SubQuery<MSetParentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MSetParentCB cb = new MSetParentCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_MSetParentAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mSetParentAsOne");
    }
    public abstract String keepProductId_NotExistsReferrer_MSetParentAsOne(MSetParentCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from M_SET_STRUCTURE where ...)} <br>
     * M_SET_STRUCTURE by PRODUCT_ID, named 'MSetStructureAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMSetStructureList</span>(structureCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     structureCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_MSetStructureList for 'not exists'. (NotNull)
     */
    public void notExistsMSetStructureList(SubQuery<MSetStructureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MSetStructureCB cb = new MSetStructureCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_MSetStructureList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mSetStructureList");
    }
    public abstract String keepProductId_NotExistsReferrer_MSetStructureList(MSetStructureCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from T_ALLOC_INST_B where ...)} <br>
     * T_ALLOC_INST_B by PRODUCT_ID, named 'TAllocInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TAllocInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstBList(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TAllocInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tAllocInstBList");
    }
    public abstract String keepProductId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from T_ALLOC_LOT where ...)} <br>
     * T_ALLOC_LOT by PRODUCT_ID, named 'TAllocLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TAllocLotList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocLotList(SubQuery<TAllocLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TAllocLotList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tAllocLotList");
    }
    public abstract String keepProductId_NotExistsReferrer_TAllocLotList(TAllocLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from T_INVENTORY_B where ...)} <br>
     * T_INVENTORY_B by PRODUCT_ID, named 'TInventoryBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TInventoryBList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryBList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TInventoryBList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tInventoryBList");
    }
    public abstract String keepProductId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from T_KEEPING_LOT where ...)} <br>
     * T_KEEPING_LOT by PRODUCT_ID, named 'TKeepingLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTKeepingLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TKeepingLotList for 'not exists'. (NotNull)
     */
    public void notExistsTKeepingLotList(SubQuery<TKeepingLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TKeepingLotList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tKeepingLotList");
    }
    public abstract String keepProductId_NotExistsReferrer_TKeepingLotList(TKeepingLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from T_LAST_LOT where ...)} <br>
     * T_LAST_LOT by PRODUCT_ID, named 'TLastLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTLastLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TLastLotList for 'not exists'. (NotNull)
     */
    public void notExistsTLastLotList(SubQuery<TLastLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TLastLotList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tLastLotList");
    }
    public abstract String keepProductId_NotExistsReferrer_TLastLotList(TLastLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from T_LOT where ...)} <br>
     * T_LOT by PRODUCT_ID, named 'TLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TLotList for 'not exists'. (NotNull)
     */
    public void notExistsTLotList(SubQuery<TLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLotCB cb = new TLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TLotList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tLotList");
    }
    public abstract String keepProductId_NotExistsReferrer_TLotList(TLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from T_MOVE_INST_B where ...)} <br>
     * T_MOVE_INST_B by PRODUCT_ID, named 'TMoveInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TMoveInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTMoveInstBList(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TMoveInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tMoveInstBList");
    }
    public abstract String keepProductId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from T_RECEIVE_PLAN_B where ...)} <br>
     * T_RECEIVE_PLAN_B by PRODUCT_ID, named 'TReceivePlanBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TReceivePlanBList for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanBList(SubQuery<TReceivePlanBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TReceivePlanBList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tReceivePlanBList");
    }
    public abstract String keepProductId_NotExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from T_SERIAL_NO where ...)} <br>
     * T_SERIAL_NO by PRODUCT_ID, named 'TSerialNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTSerialNoList</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TSerialNoList for 'not exists'. (NotNull)
     */
    public void notExistsTSerialNoList(SubQuery<TSerialNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TSerialNoList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tSerialNoList");
    }
    public abstract String keepProductId_NotExistsReferrer_TSerialNoList(TSerialNoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from T_SHIPPING_INST_B where ...)} <br>
     * T_SHIPPING_INST_B by PRODUCT_ID, named 'TShippingInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TShippingInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstBList(SubQuery<TShippingInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TShippingInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tShippingInstBList");
    }
    public abstract String keepProductId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from T_STOCK where ...)} <br>
     * T_STOCK by PRODUCT_ID, named 'TStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStockList</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TStockList for 'not exists'. (NotNull)
     */
    public void notExistsTStockList(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TStockList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tStockList");
    }
    public abstract String keepProductId_NotExistsReferrer_TStockList(TStockCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from T_TRINVCHECKINFO where ...)} <br>
     * T_TRINVCHECKINFO by PRODUCT_ID, named 'TTrinvcheckinfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrinvcheckinfoList</span>(trinvcheckinfoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvcheckinfoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TTrinvcheckinfoList for 'not exists'. (NotNull)
     */
    public void notExistsTTrinvcheckinfoList(SubQuery<TTrinvcheckinfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrinvcheckinfoCB cb = new TTrinvcheckinfoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TTrinvcheckinfoList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tTrinvcheckinfoList");
    }
    public abstract String keepProductId_NotExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from T_YTRSODETAIL where ...)} <br>
     * T_YTRSODETAIL by PRODUCT_ID, named 'TYtrsodetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTYtrsodetailList</span>(ytrsodetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ytrsodetailCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TYtrsodetailList for 'not exists'. (NotNull)
     */
    public void notExistsTYtrsodetailList(SubQuery<TYtrsodetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYtrsodetailCB cb = new TYtrsodetailCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TYtrsodetailList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tYtrsodetailList");
    }
    public abstract String keepProductId_NotExistsReferrer_TYtrsodetailList(TYtrsodetailCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from W_HT_INVENTORY_INPUT_PROD where ...)} <br>
     * W_HT_INVENTORY_INPUT_PROD by PRODUCT_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtInventoryInputProdList</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WHtInventoryInputProdList for 'not exists'. (NotNull)
     */
    public void notExistsWHtInventoryInputProdList(SubQuery<WHtInventoryInputProdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepProductId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from W_HT_RECEIVE_INSPECTION where ...)} <br>
     * W_HT_RECEIVE_INSPECTION by PRODUCT_ID, named 'WHtReceiveInspectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveInspectionList</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspectionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WHtReceiveInspectionList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveInspectionList(SubQuery<WHtReceiveInspectionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WHtReceiveInspectionList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveInspectionList");
    }
    public abstract String keepProductId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by PRODUCT_ID, named 'WHtReceiveNoPlanInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveNoPlanInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WHtReceiveNoPlanInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveNoPlanInspList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveNoPlanInspList");
    }
    public abstract String keepProductId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from W_HT_RECEIVE_STORE where ...)} <br>
     * W_HT_RECEIVE_STORE by PRODUCT_ID, named 'WHtReceiveStoreAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveStoreList</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     storeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WHtReceiveStoreList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveStoreList(SubQuery<WHtReceiveStoreCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WHtReceiveStoreList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveStoreList");
    }
    public abstract String keepProductId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from W_HT_SHIPPING where ...)} <br>
     * W_HT_SHIPPING by PRODUCT_ID, named 'WHtShippingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtShippingList</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shippingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WHtShippingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtShippingList(SubQuery<WHtShippingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WHtShippingList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtShippingList");
    }
    public abstract String keepProductId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from W_HT_SHIPPING_PICKING where ...)} <br>
     * W_HT_SHIPPING_PICKING by PRODUCT_ID, named 'WHtShippingPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtShippingPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WHtShippingPickingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtShippingPickingList(SubQuery<WHtShippingPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WHtShippingPickingList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtShippingPickingList");
    }
    public abstract String keepProductId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from W_SGL_ROW_SHIP_INSP_H where ...)} <br>
     * W_SGL_ROW_SHIP_INSP_H by PRODUCT_ID, named 'WSglRowShipInspHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWSglRowShipInspHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WSglRowShipInspHList for 'not exists'. (NotNull)
     */
    public void notExistsWSglRowShipInspHList(SubQuery<WSglRowShipInspHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WSglRowShipInspHList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wSglRowShipInspHList");
    }
    public abstract String keepProductId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from W_SHIPPING_INTERRUPT where ...)} <br>
     * W_SHIPPING_INTERRUPT by PRODUCT_ID, named 'WShippingInterruptAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWShippingInterruptList</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     interruptCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WShippingInterruptList for 'not exists'. (NotNull)
     */
    public void notExistsWShippingInterruptList(SubQuery<WShippingInterruptCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WShippingInterruptList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wShippingInterruptList");
    }
    public abstract String keepProductId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    public void xsderiveMLocationList(String fn, SubQuery<MLocationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_MLocationList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "REPLENISH_PRODUCT_ID", pp, "mLocationList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq);

    public void xsderiveMMfwhxitemList(String fn, SubQuery<MMfwhxitemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfwhxitemCB cb = new MMfwhxitemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_MMfwhxitemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mMfwhxitemList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq);

    public void xsderiveMProductShapeList(String fn, SubQuery<MProductShapeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_MProductShapeList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProductShapeList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_MProductShapeList(MProductShapeCQ sq);

    public void xsderiveMSetStructureList(String fn, SubQuery<MSetStructureCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MSetStructureCB cb = new MSetStructureCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_MSetStructureList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mSetStructureList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_MSetStructureList(MSetStructureCQ sq);

    public void xsderiveTAllocInstBList(String fn, SubQuery<TAllocInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TAllocInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tAllocInstBList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq);

    public void xsderiveTAllocLotList(String fn, SubQuery<TAllocLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TAllocLotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tAllocLotList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TAllocLotList(TAllocLotCQ sq);

    public void xsderiveTInventoryBList(String fn, SubQuery<TInventoryBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TInventoryBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tInventoryBList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq);

    public void xsderiveTKeepingLotList(String fn, SubQuery<TKeepingLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TKeepingLotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tKeepingLotList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq);

    public void xsderiveTLastLotList(String fn, SubQuery<TLastLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TLastLotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tLastLotList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TLastLotList(TLastLotCQ sq);

    public void xsderiveTLotList(String fn, SubQuery<TLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TLotCB cb = new TLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TLotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tLotList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TLotList(TLotCQ sq);

    public void xsderiveTMoveInstBList(String fn, SubQuery<TMoveInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TMoveInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tMoveInstBList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq);

    public void xsderiveTReceivePlanBList(String fn, SubQuery<TReceivePlanBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TReceivePlanBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tReceivePlanBList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq);

    public void xsderiveTSerialNoList(String fn, SubQuery<TSerialNoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TSerialNoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tSerialNoList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TSerialNoList(TSerialNoCQ sq);

    public void xsderiveTShippingInstBList(String fn, SubQuery<TShippingInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TShippingInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tShippingInstBList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq);

    public void xsderiveTStockList(String fn, SubQuery<TStockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockCB cb = new TStockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TStockList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tStockList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TStockList(TStockCQ sq);

    public void xsderiveTTrinvcheckinfoList(String fn, SubQuery<TTrinvcheckinfoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvcheckinfoCB cb = new TTrinvcheckinfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TTrinvcheckinfoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tTrinvcheckinfoList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq);

    public void xsderiveTYtrsodetailList(String fn, SubQuery<TYtrsodetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TYtrsodetailCB cb = new TYtrsodetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TYtrsodetailList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tYtrsodetailList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TYtrsodetailList(TYtrsodetailCQ sq);

    public void xsderiveWHtInventoryInputProdList(String fn, SubQuery<WHtInventoryInputProdCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WHtInventoryInputProdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtInventoryInputProdList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    public void xsderiveWHtReceiveInspectionList(String fn, SubQuery<WHtReceiveInspectionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WHtReceiveInspectionList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveInspectionList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    public void xsderiveWHtReceiveNoPlanInspList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveNoPlanInspList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    public void xsderiveWHtReceiveStoreList(String fn, SubQuery<WHtReceiveStoreCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WHtReceiveStoreList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveStoreList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    public void xsderiveWHtShippingList(String fn, SubQuery<WHtShippingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WHtShippingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtShippingList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq);

    public void xsderiveWHtShippingPickingList(String fn, SubQuery<WHtShippingPickingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WHtShippingPickingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtShippingPickingList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    public void xsderiveWSglRowShipInspHList(String fn, SubQuery<WSglRowShipInspHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WSglRowShipInspHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wSglRowShipInspHList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    public void xsderiveWShippingInterruptList(String fn, SubQuery<WShippingInterruptCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WShippingInterruptList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wShippingInterruptList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_LOCATION where ...)} <br>
     * M_LOCATION by REPLENISH_PRODUCT_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMLocationList()</span>.<span style="color: #CC4747">max</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     locationCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MLocationCB> derivedMLocationList() {
        return xcreateQDRFunctionMLocationList();
    }
    protected HpQDRFunction<MLocationCB> xcreateQDRFunctionMLocationList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMLocationList(fn, sq, rd, vl, op));
    }
    public void xqderiveMLocationList(String fn, SubQuery<MLocationCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_MLocationList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_MLocationListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "REPLENISH_PRODUCT_ID", sqpp, "mLocationList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_MLocationList(MLocationCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_MLocationListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_MFWHxITEM where ...)} <br>
     * M_MFWHxITEM by PRODUCT_ID, named 'MMfwhxitemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMMfwhxitemList()</span>.<span style="color: #CC4747">max</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     entityCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     entityCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MMfwhxitemCB> derivedMMfwhxitemList() {
        return xcreateQDRFunctionMMfwhxitemList();
    }
    protected HpQDRFunction<MMfwhxitemCB> xcreateQDRFunctionMMfwhxitemList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMMfwhxitemList(fn, sq, rd, vl, op));
    }
    public void xqderiveMMfwhxitemList(String fn, SubQuery<MMfwhxitemCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfwhxitemCB cb = new MMfwhxitemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_MMfwhxitemList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_MMfwhxitemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "mMfwhxitemList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_MMfwhxitemListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_PRODUCT_SHAPE where ...)} <br>
     * M_PRODUCT_SHAPE by PRODUCT_ID, named 'MProductShapeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMProductShapeList()</span>.<span style="color: #CC4747">max</span>(shapeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shapeCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     shapeCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MProductShapeCB> derivedMProductShapeList() {
        return xcreateQDRFunctionMProductShapeList();
    }
    protected HpQDRFunction<MProductShapeCB> xcreateQDRFunctionMProductShapeList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMProductShapeList(fn, sq, rd, vl, op));
    }
    public void xqderiveMProductShapeList(String fn, SubQuery<MProductShapeCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_MProductShapeList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_MProductShapeListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "mProductShapeList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_MProductShapeList(MProductShapeCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_MProductShapeListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_SET_STRUCTURE where ...)} <br>
     * M_SET_STRUCTURE by PRODUCT_ID, named 'MSetStructureAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMSetStructureList()</span>.<span style="color: #CC4747">max</span>(structureCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     structureCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     structureCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MSetStructureCB> derivedMSetStructureList() {
        return xcreateQDRFunctionMSetStructureList();
    }
    protected HpQDRFunction<MSetStructureCB> xcreateQDRFunctionMSetStructureList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMSetStructureList(fn, sq, rd, vl, op));
    }
    public void xqderiveMSetStructureList(String fn, SubQuery<MSetStructureCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MSetStructureCB cb = new MSetStructureCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_MSetStructureList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_MSetStructureListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "mSetStructureList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_MSetStructureList(MSetStructureCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_MSetStructureListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_ALLOC_INST_B where ...)} <br>
     * T_ALLOC_INST_B by PRODUCT_ID, named 'TAllocInstBAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TAllocInstBList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TAllocInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tAllocInstBList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TAllocInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_ALLOC_LOT where ...)} <br>
     * T_ALLOC_LOT by PRODUCT_ID, named 'TAllocLotAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TAllocLotList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TAllocLotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tAllocLotList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TAllocLotList(TAllocLotCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TAllocLotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_INVENTORY_B where ...)} <br>
     * T_INVENTORY_B by PRODUCT_ID, named 'TInventoryBAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TInventoryBList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TInventoryBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tInventoryBList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TInventoryBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_KEEPING_LOT where ...)} <br>
     * T_KEEPING_LOT by PRODUCT_ID, named 'TKeepingLotAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TKeepingLotList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TKeepingLotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tKeepingLotList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TKeepingLotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_LAST_LOT where ...)} <br>
     * T_LAST_LOT by PRODUCT_ID, named 'TLastLotAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TLastLotList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TLastLotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tLastLotList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TLastLotList(TLastLotCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TLastLotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_LOT where ...)} <br>
     * T_LOT by PRODUCT_ID, named 'TLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTLotList()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     lotCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TLotCB> derivedTLotList() {
        return xcreateQDRFunctionTLotList();
    }
    protected HpQDRFunction<TLotCB> xcreateQDRFunctionTLotList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTLotList(fn, sq, rd, vl, op));
    }
    public void xqderiveTLotList(String fn, SubQuery<TLotCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TLotCB cb = new TLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TLotList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TLotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tLotList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TLotList(TLotCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TLotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_MOVE_INST_B where ...)} <br>
     * T_MOVE_INST_B by PRODUCT_ID, named 'TMoveInstBAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TMoveInstBList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TMoveInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tMoveInstBList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TMoveInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_RECEIVE_PLAN_B where ...)} <br>
     * T_RECEIVE_PLAN_B by PRODUCT_ID, named 'TReceivePlanBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReceivePlanBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReceivePlanBCB> derivedTReceivePlanBList() {
        return xcreateQDRFunctionTReceivePlanBList();
    }
    protected HpQDRFunction<TReceivePlanBCB> xcreateQDRFunctionTReceivePlanBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReceivePlanBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReceivePlanBList(String fn, SubQuery<TReceivePlanBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TReceivePlanBList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TReceivePlanBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tReceivePlanBList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TReceivePlanBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_SERIAL_NO where ...)} <br>
     * T_SERIAL_NO by PRODUCT_ID, named 'TSerialNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTSerialNoList()</span>.<span style="color: #CC4747">max</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     noCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TSerialNoCB> derivedTSerialNoList() {
        return xcreateQDRFunctionTSerialNoList();
    }
    protected HpQDRFunction<TSerialNoCB> xcreateQDRFunctionTSerialNoList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTSerialNoList(fn, sq, rd, vl, op));
    }
    public void xqderiveTSerialNoList(String fn, SubQuery<TSerialNoCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TSerialNoList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TSerialNoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tSerialNoList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TSerialNoList(TSerialNoCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TSerialNoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_SHIPPING_INST_B where ...)} <br>
     * T_SHIPPING_INST_B by PRODUCT_ID, named 'TShippingInstBAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TShippingInstBList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TShippingInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tShippingInstBList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TShippingInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_STOCK where ...)} <br>
     * T_STOCK by PRODUCT_ID, named 'TStockAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TStockList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TStockListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tStockList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TStockList(TStockCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TStockListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRINVCHECKINFO where ...)} <br>
     * T_TRINVCHECKINFO by PRODUCT_ID, named 'TTrinvcheckinfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrinvcheckinfoList()</span>.<span style="color: #CC4747">max</span>(trinvcheckinfoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvcheckinfoCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trinvcheckinfoCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrinvcheckinfoCB> derivedTTrinvcheckinfoList() {
        return xcreateQDRFunctionTTrinvcheckinfoList();
    }
    protected HpQDRFunction<TTrinvcheckinfoCB> xcreateQDRFunctionTTrinvcheckinfoList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrinvcheckinfoList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrinvcheckinfoList(String fn, SubQuery<TTrinvcheckinfoCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvcheckinfoCB cb = new TTrinvcheckinfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TTrinvcheckinfoList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TTrinvcheckinfoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tTrinvcheckinfoList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TTrinvcheckinfoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_YTRSODETAIL where ...)} <br>
     * T_YTRSODETAIL by PRODUCT_ID, named 'TYtrsodetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTYtrsodetailList()</span>.<span style="color: #CC4747">max</span>(ytrsodetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ytrsodetailCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     ytrsodetailCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TYtrsodetailCB> derivedTYtrsodetailList() {
        return xcreateQDRFunctionTYtrsodetailList();
    }
    protected HpQDRFunction<TYtrsodetailCB> xcreateQDRFunctionTYtrsodetailList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTYtrsodetailList(fn, sq, rd, vl, op));
    }
    public void xqderiveTYtrsodetailList(String fn, SubQuery<TYtrsodetailCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TYtrsodetailCB cb = new TYtrsodetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TYtrsodetailList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TYtrsodetailListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tYtrsodetailList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TYtrsodetailList(TYtrsodetailCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TYtrsodetailListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_INVENTORY_INPUT_PROD where ...)} <br>
     * W_HT_INVENTORY_INPUT_PROD by PRODUCT_ID, named 'WHtInventoryInputProdAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WHtInventoryInputProdList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wHtInventoryInputProdList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_RECEIVE_INSPECTION where ...)} <br>
     * W_HT_RECEIVE_INSPECTION by PRODUCT_ID, named 'WHtReceiveInspectionAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WHtReceiveInspectionList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wHtReceiveInspectionList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by PRODUCT_ID, named 'WHtReceiveNoPlanInspAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wHtReceiveNoPlanInspList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_RECEIVE_STORE where ...)} <br>
     * W_HT_RECEIVE_STORE by PRODUCT_ID, named 'WHtReceiveStoreAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WHtReceiveStoreList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WHtReceiveStoreListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wHtReceiveStoreList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_SHIPPING where ...)} <br>
     * W_HT_SHIPPING by PRODUCT_ID, named 'WHtShippingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtShippingList()</span>.<span style="color: #CC4747">max</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shippingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     shippingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtShippingCB> derivedWHtShippingList() {
        return xcreateQDRFunctionWHtShippingList();
    }
    protected HpQDRFunction<WHtShippingCB> xcreateQDRFunctionWHtShippingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtShippingList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtShippingList(String fn, SubQuery<WHtShippingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WHtShippingList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WHtShippingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wHtShippingList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WHtShippingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_SHIPPING_PICKING where ...)} <br>
     * W_HT_SHIPPING_PICKING by PRODUCT_ID, named 'WHtShippingPickingAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WHtShippingPickingList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WHtShippingPickingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wHtShippingPickingList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_SGL_ROW_SHIP_INSP_H where ...)} <br>
     * W_SGL_ROW_SHIP_INSP_H by PRODUCT_ID, named 'WSglRowShipInspHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWSglRowShipInspHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WSglRowShipInspHCB> derivedWSglRowShipInspHList() {
        return xcreateQDRFunctionWSglRowShipInspHList();
    }
    protected HpQDRFunction<WSglRowShipInspHCB> xcreateQDRFunctionWSglRowShipInspHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWSglRowShipInspHList(fn, sq, rd, vl, op));
    }
    public void xqderiveWSglRowShipInspHList(String fn, SubQuery<WSglRowShipInspHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WSglRowShipInspHList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WSglRowShipInspHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wSglRowShipInspHList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_SHIPPING_INTERRUPT where ...)} <br>
     * W_SHIPPING_INTERRUPT by PRODUCT_ID, named 'WShippingInterruptAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWShippingInterruptList()</span>.<span style="color: #CC4747">max</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     interruptCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     interruptCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WShippingInterruptCB> derivedWShippingInterruptList() {
        return xcreateQDRFunctionWShippingInterruptList();
    }
    protected HpQDRFunction<WShippingInterruptCB> xcreateQDRFunctionWShippingInterruptList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWShippingInterruptList(fn, sq, rd, vl, op));
    }
    public void xqderiveWShippingInterruptList(String fn, SubQuery<WShippingInterruptCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WShippingInterruptList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WShippingInterruptListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wShippingInterruptList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WShippingInterruptListParameter(Object vl);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProductSelf'.
     * @param subCBLambda The callback for sub-query of MProductSelf for 'in-scope'. (NotNull)
     */
    public void inScopeMProductSelf(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_InScopeRelation_MProductSelf(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProductSelf", false);
    }
    public abstract String keepProductId_InScopeRelation_MProductSelf(MProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProductSelf'.
     * @param subCBLambda The callback for sub-query of MProductSelf for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProductSelf(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotInScopeRelation_MProductSelf(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProductSelf", true);
    }
    public abstract String keepProductId_NotInScopeRelation_MProductSelf(MProductCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT}
     */
    public void setProductId_IsNull() { regProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT}
     */
    public void setProductId_IsNotNull() { regProductId(CK_ISNN, DOBJ); }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)}
     * @param productCd The value of productCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_Equal(String productCd) {
        doSetProductCd_Equal(fRES(productCd));
    }

    protected void doSetProductCd_Equal(String productCd) {
        regProductCd(CK_EQ, productCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)}
     * @param productCd The value of productCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotEqual(String productCd) {
        doSetProductCd_NotEqual(fRES(productCd));
    }

    protected void doSetProductCd_NotEqual(String productCd) {
        regProductCd(CK_NES, productCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)}
     * @param productCdList The collection of productCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_InScope(Collection<String> productCdList) {
        doSetProductCd_InScope(productCdList);
    }

    protected void doSetProductCd_InScope(Collection<String> productCdList) {
        regINS(CK_INS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)}
     * @param productCdList The collection of productCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotInScope(Collection<String> productCdList) {
        doSetProductCd_NotInScope(productCdList);
    }

    protected void doSetProductCd_NotInScope(Collection<String> productCdList) {
        regINS(CK_NINS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)} <br>
     * <pre>e.g. setProductCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCd The value of productCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCd_LikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @param productNm The value of productNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_Equal(String productNm) {
        doSetProductNm_Equal(fRES(productNm));
    }

    protected void doSetProductNm_Equal(String productNm) {
        regProductNm(CK_EQ, productNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @param productNm The value of productNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_NotEqual(String productNm) {
        doSetProductNm_NotEqual(fRES(productNm));
    }

    protected void doSetProductNm_NotEqual(String productNm) {
        regProductNm(CK_NES, productNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @param productNm The value of productNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterThan(String productNm) {
        regProductNm(CK_GT, fRES(productNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @param productNm The value of productNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessThan(String productNm) {
        regProductNm(CK_LT, fRES(productNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @param productNm The value of productNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterEqual(String productNm) {
        regProductNm(CK_GE, fRES(productNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @param productNm The value of productNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessEqual(String productNm) {
        regProductNm(CK_LE, fRES(productNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @param productNmList The collection of productNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_InScope(Collection<String> productNmList) {
        doSetProductNm_InScope(productNmList);
    }

    protected void doSetProductNm_InScope(Collection<String> productNmList) {
        regINS(CK_INS, cTL(productNmList), xgetCValueProductNm(), "PRODUCT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @param productNmList The collection of productNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_NotInScope(Collection<String> productNmList) {
        doSetProductNm_NotInScope(productNmList);
    }

    protected void doSetProductNm_NotInScope(Collection<String> productNmList) {
        regINS(CK_NINS, cTL(productNmList), xgetCValueProductNm(), "PRODUCT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(255)} <br>
     * <pre>e.g. setProductNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productNm The value of productNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductNm_LikeSearch(String productNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productNm), xgetCValueProductNm(), "PRODUCT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @param productNm The value of productNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductNm_NotLikeSearch(String productNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productNm), xgetCValueProductNm(), "PRODUCT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @param productNm The value of productNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_PrefixSearch(String productNm) {
        setProductNm_LikeSearch(productNm, xcLSOPPre());
    }

    protected void regProductNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductNm(), "PRODUCT_NM"); }
    protected abstract ConditionValue xgetCValueProductNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {varchar(60)}
     * @param productAbbr The value of productAbbr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_Equal(String productAbbr) {
        doSetProductAbbr_Equal(fRES(productAbbr));
    }

    protected void doSetProductAbbr_Equal(String productAbbr) {
        regProductAbbr(CK_EQ, productAbbr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {varchar(60)}
     * @param productAbbr The value of productAbbr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_NotEqual(String productAbbr) {
        doSetProductAbbr_NotEqual(fRES(productAbbr));
    }

    protected void doSetProductAbbr_NotEqual(String productAbbr) {
        regProductAbbr(CK_NES, productAbbr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {varchar(60)}
     * @param productAbbr The value of productAbbr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_GreaterThan(String productAbbr) {
        regProductAbbr(CK_GT, fRES(productAbbr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {varchar(60)}
     * @param productAbbr The value of productAbbr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_LessThan(String productAbbr) {
        regProductAbbr(CK_LT, fRES(productAbbr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {varchar(60)}
     * @param productAbbr The value of productAbbr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_GreaterEqual(String productAbbr) {
        regProductAbbr(CK_GE, fRES(productAbbr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {varchar(60)}
     * @param productAbbr The value of productAbbr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_LessEqual(String productAbbr) {
        regProductAbbr(CK_LE, fRES(productAbbr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ABBR: {varchar(60)}
     * @param productAbbrList The collection of productAbbr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_InScope(Collection<String> productAbbrList) {
        doSetProductAbbr_InScope(productAbbrList);
    }

    protected void doSetProductAbbr_InScope(Collection<String> productAbbrList) {
        regINS(CK_INS, cTL(productAbbrList), xgetCValueProductAbbr(), "PRODUCT_ABBR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ABBR: {varchar(60)}
     * @param productAbbrList The collection of productAbbr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_NotInScope(Collection<String> productAbbrList) {
        doSetProductAbbr_NotInScope(productAbbrList);
    }

    protected void doSetProductAbbr_NotInScope(Collection<String> productAbbrList) {
        regINS(CK_NINS, cTL(productAbbrList), xgetCValueProductAbbr(), "PRODUCT_ABBR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ABBR: {varchar(60)} <br>
     * <pre>e.g. setProductAbbr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productAbbr The value of productAbbr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductAbbr_LikeSearch(String productAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productAbbr), xgetCValueProductAbbr(), "PRODUCT_ABBR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ABBR: {varchar(60)}
     * @param productAbbr The value of productAbbr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductAbbr_NotLikeSearch(String productAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productAbbr), xgetCValueProductAbbr(), "PRODUCT_ABBR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ABBR: {varchar(60)}
     * @param productAbbr The value of productAbbr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_PrefixSearch(String productAbbr) {
        setProductAbbr_LikeSearch(productAbbr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {varchar(60)}
     */
    public void setProductAbbr_IsNull() { regProductAbbr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {varchar(60)}
     */
    public void setProductAbbr_IsNullOrEmpty() { regProductAbbr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {varchar(60)}
     */
    public void setProductAbbr_IsNotNull() { regProductAbbr(CK_ISNN, DOBJ); }

    protected void regProductAbbr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductAbbr(), "PRODUCT_ABBR"); }
    protected abstract ConditionValue xgetCValueProductAbbr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {IX, varchar(30)}
     * @param janCd The value of janCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_Equal(String janCd) {
        doSetJanCd_Equal(fRES(janCd));
    }

    protected void doSetJanCd_Equal(String janCd) {
        regJanCd(CK_EQ, janCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {IX, varchar(30)}
     * @param janCd The value of janCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_NotEqual(String janCd) {
        doSetJanCd_NotEqual(fRES(janCd));
    }

    protected void doSetJanCd_NotEqual(String janCd) {
        regJanCd(CK_NES, janCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {IX, varchar(30)}
     * @param janCd The value of janCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_GreaterThan(String janCd) {
        regJanCd(CK_GT, fRES(janCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {IX, varchar(30)}
     * @param janCd The value of janCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_LessThan(String janCd) {
        regJanCd(CK_LT, fRES(janCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {IX, varchar(30)}
     * @param janCd The value of janCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_GreaterEqual(String janCd) {
        regJanCd(CK_GE, fRES(janCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {IX, varchar(30)}
     * @param janCd The value of janCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_LessEqual(String janCd) {
        regJanCd(CK_LE, fRES(janCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JAN_CD: {IX, varchar(30)}
     * @param janCdList The collection of janCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_InScope(Collection<String> janCdList) {
        doSetJanCd_InScope(janCdList);
    }

    protected void doSetJanCd_InScope(Collection<String> janCdList) {
        regINS(CK_INS, cTL(janCdList), xgetCValueJanCd(), "JAN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JAN_CD: {IX, varchar(30)}
     * @param janCdList The collection of janCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_NotInScope(Collection<String> janCdList) {
        doSetJanCd_NotInScope(janCdList);
    }

    protected void doSetJanCd_NotInScope(Collection<String> janCdList) {
        regINS(CK_NINS, cTL(janCdList), xgetCValueJanCd(), "JAN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {IX, varchar(30)} <br>
     * <pre>e.g. setJanCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param janCd The value of janCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setJanCd_LikeSearch(String janCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(janCd), xgetCValueJanCd(), "JAN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {IX, varchar(30)}
     * @param janCd The value of janCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setJanCd_NotLikeSearch(String janCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(janCd), xgetCValueJanCd(), "JAN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {IX, varchar(30)}
     * @param janCd The value of janCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_PrefixSearch(String janCd) {
        setJanCd_LikeSearch(janCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JAN_CD: {IX, varchar(30)}
     */
    public void setJanCd_IsNull() { regJanCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * JAN_CD: {IX, varchar(30)}
     */
    public void setJanCd_IsNullOrEmpty() { regJanCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JAN_CD: {IX, varchar(30)}
     */
    public void setJanCd_IsNotNull() { regJanCd(CK_ISNN, DOBJ); }

    protected void regJanCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJanCd(), "JAN_CD"); }
    protected abstract ConditionValue xgetCValueJanCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg}
     * @param lotManagFlg The value of lotManagFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagFlg_Equal(String lotManagFlg) {
        doSetLotManagFlg_Equal(fRES(lotManagFlg));
    }

    /**
     * Equal(=). As LotManagFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
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
     * LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg}
     * @param lotManagFlg The value of lotManagFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagFlg_NotEqual(String lotManagFlg) {
        doSetLotManagFlg_NotEqual(fRES(lotManagFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LotManagFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
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
     * LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg}
     * @param lotManagFlgList The collection of lotManagFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagFlg_InScope(Collection<String> lotManagFlgList) {
        doSetLotManagFlg_InScope(lotManagFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LotManagFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
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
     * LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg}
     * @param lotManagFlgList The collection of lotManagFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagFlg_NotInScope(Collection<String> lotManagFlgList) {
        doSetLotManagFlg_NotInScope(lotManagFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LotManagFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagFlg_NotInScope_AsLotManagFlg(Collection<CDef.LotManagFlg> cdefList) {
        doSetLotManagFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLotManagFlg_NotInScope(Collection<String> lotManagFlgList) {
        regINS(CK_NINS, cTL(lotManagFlgList), xgetCValueLotManagFlg(), "LOT_MANAG_FLG");
    }

    protected void regLotManagFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotManagFlg(), "LOT_MANAG_FLG"); }
    protected abstract ConditionValue xgetCValueLotManagFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @param limitDtManagFlg The value of limitDtManagFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_Equal(String limitDtManagFlg) {
        doSetLimitDtManagFlg_Equal(fRES(limitDtManagFlg));
    }

    /**
     * Equal(=). As LimitDtManagFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
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
     * LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @param limitDtManagFlg The value of limitDtManagFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_NotEqual(String limitDtManagFlg) {
        doSetLimitDtManagFlg_NotEqual(fRES(limitDtManagFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LimitDtManagFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
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
     * LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @param limitDtManagFlgList The collection of limitDtManagFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_InScope(Collection<String> limitDtManagFlgList) {
        doSetLimitDtManagFlg_InScope(limitDtManagFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LimitDtManagFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
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
     * LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @param limitDtManagFlgList The collection of limitDtManagFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_NotInScope(Collection<String> limitDtManagFlgList) {
        doSetLimitDtManagFlg_NotInScope(limitDtManagFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LimitDtManagFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_NotInScope_AsLimitDtManagFlg(Collection<CDef.LimitDtManagFlg> cdefList) {
        doSetLimitDtManagFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLimitDtManagFlg_NotInScope(Collection<String> limitDtManagFlgList) {
        regINS(CK_NINS, cTL(limitDtManagFlgList), xgetCValueLimitDtManagFlg(), "LIMIT_DT_MANAG_FLG");
    }

    protected void regLimitDtManagFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDtManagFlg(), "LIMIT_DT_MANAG_FLG"); }
    protected abstract ConditionValue xgetCValueLimitDtManagFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param receiveLimitNum The value of receiveLimitNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLimitNum_Equal(Long receiveLimitNum) {
        doSetReceiveLimitNum_Equal(receiveLimitNum);
    }

    protected void doSetReceiveLimitNum_Equal(Long receiveLimitNum) {
        regReceiveLimitNum(CK_EQ, receiveLimitNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param receiveLimitNum The value of receiveLimitNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLimitNum_NotEqual(Long receiveLimitNum) {
        doSetReceiveLimitNum_NotEqual(receiveLimitNum);
    }

    protected void doSetReceiveLimitNum_NotEqual(Long receiveLimitNum) {
        regReceiveLimitNum(CK_NES, receiveLimitNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param receiveLimitNum The value of receiveLimitNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLimitNum_GreaterThan(Long receiveLimitNum) {
        regReceiveLimitNum(CK_GT, receiveLimitNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param receiveLimitNum The value of receiveLimitNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLimitNum_LessThan(Long receiveLimitNum) {
        regReceiveLimitNum(CK_LT, receiveLimitNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param receiveLimitNum The value of receiveLimitNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLimitNum_GreaterEqual(Long receiveLimitNum) {
        regReceiveLimitNum(CK_GE, receiveLimitNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param receiveLimitNum The value of receiveLimitNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLimitNum_LessEqual(Long receiveLimitNum) {
        regReceiveLimitNum(CK_LE, receiveLimitNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param minNumber The min number of receiveLimitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveLimitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveLimitNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveLimitNum(), "RECEIVE_LIMIT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param receiveLimitNumList The collection of receiveLimitNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLimitNum_InScope(Collection<Long> receiveLimitNumList) {
        doSetReceiveLimitNum_InScope(receiveLimitNumList);
    }

    protected void doSetReceiveLimitNum_InScope(Collection<Long> receiveLimitNumList) {
        regINS(CK_INS, cTL(receiveLimitNumList), xgetCValueReceiveLimitNum(), "RECEIVE_LIMIT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param receiveLimitNumList The collection of receiveLimitNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLimitNum_NotInScope(Collection<Long> receiveLimitNumList) {
        doSetReceiveLimitNum_NotInScope(receiveLimitNumList);
    }

    protected void doSetReceiveLimitNum_NotInScope(Collection<Long> receiveLimitNumList) {
        regINS(CK_NINS, cTL(receiveLimitNumList), xgetCValueReceiveLimitNum(), "RECEIVE_LIMIT_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]}
     */
    public void setReceiveLimitNum_IsNull() { regReceiveLimitNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]}
     */
    public void setReceiveLimitNum_IsNotNull() { regReceiveLimitNum(CK_ISNN, DOBJ); }

    protected void regReceiveLimitNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveLimitNum(), "RECEIVE_LIMIT_NUM"); }
    protected abstract ConditionValue xgetCValueReceiveLimitNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param shippingLimitNum The value of shippingLimitNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingLimitNum_Equal(Long shippingLimitNum) {
        doSetShippingLimitNum_Equal(shippingLimitNum);
    }

    protected void doSetShippingLimitNum_Equal(Long shippingLimitNum) {
        regShippingLimitNum(CK_EQ, shippingLimitNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param shippingLimitNum The value of shippingLimitNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingLimitNum_NotEqual(Long shippingLimitNum) {
        doSetShippingLimitNum_NotEqual(shippingLimitNum);
    }

    protected void doSetShippingLimitNum_NotEqual(Long shippingLimitNum) {
        regShippingLimitNum(CK_NES, shippingLimitNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param shippingLimitNum The value of shippingLimitNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingLimitNum_GreaterThan(Long shippingLimitNum) {
        regShippingLimitNum(CK_GT, shippingLimitNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param shippingLimitNum The value of shippingLimitNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingLimitNum_LessThan(Long shippingLimitNum) {
        regShippingLimitNum(CK_LT, shippingLimitNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param shippingLimitNum The value of shippingLimitNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingLimitNum_GreaterEqual(Long shippingLimitNum) {
        regShippingLimitNum(CK_GE, shippingLimitNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param shippingLimitNum The value of shippingLimitNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingLimitNum_LessEqual(Long shippingLimitNum) {
        regShippingLimitNum(CK_LE, shippingLimitNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param minNumber The min number of shippingLimitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingLimitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingLimitNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingLimitNum(), "SHIPPING_LIMIT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param shippingLimitNumList The collection of shippingLimitNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingLimitNum_InScope(Collection<Long> shippingLimitNumList) {
        doSetShippingLimitNum_InScope(shippingLimitNumList);
    }

    protected void doSetShippingLimitNum_InScope(Collection<Long> shippingLimitNumList) {
        regINS(CK_INS, cTL(shippingLimitNumList), xgetCValueShippingLimitNum(), "SHIPPING_LIMIT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @param shippingLimitNumList The collection of shippingLimitNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingLimitNum_NotInScope(Collection<Long> shippingLimitNumList) {
        doSetShippingLimitNum_NotInScope(shippingLimitNumList);
    }

    protected void doSetShippingLimitNum_NotInScope(Collection<Long> shippingLimitNumList) {
        regINS(CK_NINS, cTL(shippingLimitNumList), xgetCValueShippingLimitNum(), "SHIPPING_LIMIT_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]}
     */
    public void setShippingLimitNum_IsNull() { regShippingLimitNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]}
     */
    public void setShippingLimitNum_IsNotNull() { regShippingLimitNum(CK_ISNN, DOBJ); }

    protected void regShippingLimitNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingLimitNum(), "SHIPPING_LIMIT_NUM"); }
    protected abstract ConditionValue xgetCValueShippingLimitNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @param mergeCls The value of mergeCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_Equal(String mergeCls) {
        doSetMergeCls_Equal(fRES(mergeCls));
    }

    /**
     * Equal(=). As MergeCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCls_Equal_AsMergeCls(CDef.MergeCls cdef) {
        doSetMergeCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: マージしない
     */
    public void setMergeCls_Equal_$00() {
        setMergeCls_Equal_AsMergeCls(CDef.MergeCls.$00);
    }

    /**
     * Equal(=). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: ピックロケのみ自動マージ
     */
    public void setMergeCls_Equal_$01() {
        setMergeCls_Equal_AsMergeCls(CDef.MergeCls.$01);
    }

    /**
     * Equal(=). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 自動マージ
     */
    public void setMergeCls_Equal_$02() {
        setMergeCls_Equal_AsMergeCls(CDef.MergeCls.$02);
    }

    protected void doSetMergeCls_Equal(String mergeCls) {
        regMergeCls(CK_EQ, mergeCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @param mergeCls The value of mergeCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_NotEqual(String mergeCls) {
        doSetMergeCls_NotEqual(fRES(mergeCls));
    }

    /**
     * NotEqual(&lt;&gt;). As MergeCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCls_NotEqual_AsMergeCls(CDef.MergeCls cdef) {
        doSetMergeCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: マージしない
     */
    public void setMergeCls_NotEqual_$00() {
        setMergeCls_NotEqual_AsMergeCls(CDef.MergeCls.$00);
    }

    /**
     * NotEqual(&lt;&gt;). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: ピックロケのみ自動マージ
     */
    public void setMergeCls_NotEqual_$01() {
        setMergeCls_NotEqual_AsMergeCls(CDef.MergeCls.$01);
    }

    /**
     * NotEqual(&lt;&gt;). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 自動マージ
     */
    public void setMergeCls_NotEqual_$02() {
        setMergeCls_NotEqual_AsMergeCls(CDef.MergeCls.$02);
    }

    protected void doSetMergeCls_NotEqual(String mergeCls) {
        regMergeCls(CK_NES, mergeCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @param mergeClsList The collection of mergeCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_InScope(Collection<String> mergeClsList) {
        doSetMergeCls_InScope(mergeClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As MergeCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_InScope_AsMergeCls(Collection<CDef.MergeCls> cdefList) {
        doSetMergeCls_InScope(cTStrL(cdefList));
    }

    protected void doSetMergeCls_InScope(Collection<String> mergeClsList) {
        regINS(CK_INS, cTL(mergeClsList), xgetCValueMergeCls(), "MERGE_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @param mergeClsList The collection of mergeCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_NotInScope(Collection<String> mergeClsList) {
        doSetMergeCls_NotInScope(mergeClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MergeCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_NotInScope_AsMergeCls(Collection<CDef.MergeCls> cdefList) {
        doSetMergeCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetMergeCls_NotInScope(Collection<String> mergeClsList) {
        regINS(CK_NINS, cTL(mergeClsList), xgetCValueMergeCls(), "MERGE_CLS");
    }

    protected void regMergeCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMergeCls(), "MERGE_CLS"); }
    protected abstract ConditionValue xgetCValueMergeCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @param lotReverseFlg The value of lotReverseFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_Equal(String lotReverseFlg) {
        doSetLotReverseFlg_Equal(fRES(lotReverseFlg));
    }

    /**
     * Equal(=). As LotReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLotReverseFlg_Equal_AsLotReverseFlg(CDef.LotReverseFlg cdef) {
        doSetLotReverseFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLotReverseFlg_Equal_$0() {
        setLotReverseFlg_Equal_AsLotReverseFlg(CDef.LotReverseFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLotReverseFlg_Equal_$1() {
        setLotReverseFlg_Equal_AsLotReverseFlg(CDef.LotReverseFlg.$1);
    }

    protected void doSetLotReverseFlg_Equal(String lotReverseFlg) {
        regLotReverseFlg(CK_EQ, lotReverseFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @param lotReverseFlg The value of lotReverseFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_NotEqual(String lotReverseFlg) {
        doSetLotReverseFlg_NotEqual(fRES(lotReverseFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LotReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLotReverseFlg_NotEqual_AsLotReverseFlg(CDef.LotReverseFlg cdef) {
        doSetLotReverseFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLotReverseFlg_NotEqual_$0() {
        setLotReverseFlg_NotEqual_AsLotReverseFlg(CDef.LotReverseFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLotReverseFlg_NotEqual_$1() {
        setLotReverseFlg_NotEqual_AsLotReverseFlg(CDef.LotReverseFlg.$1);
    }

    protected void doSetLotReverseFlg_NotEqual(String lotReverseFlg) {
        regLotReverseFlg(CK_NES, lotReverseFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @param lotReverseFlgList The collection of lotReverseFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_InScope(Collection<String> lotReverseFlgList) {
        doSetLotReverseFlg_InScope(lotReverseFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LotReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_InScope_AsLotReverseFlg(Collection<CDef.LotReverseFlg> cdefList) {
        doSetLotReverseFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLotReverseFlg_InScope(Collection<String> lotReverseFlgList) {
        regINS(CK_INS, cTL(lotReverseFlgList), xgetCValueLotReverseFlg(), "LOT_REVERSE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @param lotReverseFlgList The collection of lotReverseFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_NotInScope(Collection<String> lotReverseFlgList) {
        doSetLotReverseFlg_NotInScope(lotReverseFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LotReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_NotInScope_AsLotReverseFlg(Collection<CDef.LotReverseFlg> cdefList) {
        doSetLotReverseFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLotReverseFlg_NotInScope(Collection<String> lotReverseFlgList) {
        regINS(CK_NINS, cTL(lotReverseFlgList), xgetCValueLotReverseFlg(), "LOT_REVERSE_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     */
    public void setLotReverseFlg_IsNull() { regLotReverseFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     */
    public void setLotReverseFlg_IsNotNull() { regLotReverseFlg(CK_ISNN, DOBJ); }

    protected void regLotReverseFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotReverseFlg(), "LOT_REVERSE_FLG"); }
    protected abstract ConditionValue xgetCValueLotReverseFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlg The value of limitDtReverseFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_Equal(String limitDtReverseFlg) {
        doSetLimitDtReverseFlg_Equal(fRES(limitDtReverseFlg));
    }

    /**
     * Equal(=). As LimitDtReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
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
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlg The value of limitDtReverseFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotEqual(String limitDtReverseFlg) {
        doSetLimitDtReverseFlg_NotEqual(fRES(limitDtReverseFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LimitDtReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
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
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlgList The collection of limitDtReverseFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_InScope(Collection<String> limitDtReverseFlgList) {
        doSetLimitDtReverseFlg_InScope(limitDtReverseFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LimitDtReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
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
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlgList The collection of limitDtReverseFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotInScope(Collection<String> limitDtReverseFlgList) {
        doSetLimitDtReverseFlg_NotInScope(limitDtReverseFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LimitDtReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
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
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     */
    public void setLimitDtReverseFlg_IsNull() { regLimitDtReverseFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     */
    public void setLimitDtReverseFlg_IsNotNull() { regLimitDtReverseFlg(CK_ISNN, DOBJ); }

    protected void regLimitDtReverseFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDtReverseFlg(), "LIMIT_DT_REVERSE_FLG"); }
    protected abstract ConditionValue xgetCValueLimitDtReverseFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @param shippingStopFlg The value of shippingStopFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_Equal(String shippingStopFlg) {
        doSetShippingStopFlg_Equal(fRES(shippingStopFlg));
    }

    /**
     * Equal(=). As ShippingStopFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingStopFlg_Equal_AsShippingStopFlg(CDef.ShippingStopFlg cdef) {
        doSetShippingStopFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出荷可能
     */
    public void setShippingStopFlg_Equal_$0() {
        setShippingStopFlg_Equal_AsShippingStopFlg(CDef.ShippingStopFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出荷停止
     */
    public void setShippingStopFlg_Equal_$1() {
        setShippingStopFlg_Equal_AsShippingStopFlg(CDef.ShippingStopFlg.$1);
    }

    protected void doSetShippingStopFlg_Equal(String shippingStopFlg) {
        regShippingStopFlg(CK_EQ, shippingStopFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @param shippingStopFlg The value of shippingStopFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_NotEqual(String shippingStopFlg) {
        doSetShippingStopFlg_NotEqual(fRES(shippingStopFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ShippingStopFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingStopFlg_NotEqual_AsShippingStopFlg(CDef.ShippingStopFlg cdef) {
        doSetShippingStopFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出荷可能
     */
    public void setShippingStopFlg_NotEqual_$0() {
        setShippingStopFlg_NotEqual_AsShippingStopFlg(CDef.ShippingStopFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出荷停止
     */
    public void setShippingStopFlg_NotEqual_$1() {
        setShippingStopFlg_NotEqual_AsShippingStopFlg(CDef.ShippingStopFlg.$1);
    }

    protected void doSetShippingStopFlg_NotEqual(String shippingStopFlg) {
        regShippingStopFlg(CK_NES, shippingStopFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @param shippingStopFlgList The collection of shippingStopFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_InScope(Collection<String> shippingStopFlgList) {
        doSetShippingStopFlg_InScope(shippingStopFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ShippingStopFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_InScope_AsShippingStopFlg(Collection<CDef.ShippingStopFlg> cdefList) {
        doSetShippingStopFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetShippingStopFlg_InScope(Collection<String> shippingStopFlgList) {
        regINS(CK_INS, cTL(shippingStopFlgList), xgetCValueShippingStopFlg(), "SHIPPING_STOP_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @param shippingStopFlgList The collection of shippingStopFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_NotInScope(Collection<String> shippingStopFlgList) {
        doSetShippingStopFlg_NotInScope(shippingStopFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ShippingStopFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_NotInScope_AsShippingStopFlg(Collection<CDef.ShippingStopFlg> cdefList) {
        doSetShippingStopFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetShippingStopFlg_NotInScope(Collection<String> shippingStopFlgList) {
        regINS(CK_NINS, cTL(shippingStopFlgList), xgetCValueShippingStopFlg(), "SHIPPING_STOP_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     */
    public void setShippingStopFlg_IsNull() { regShippingStopFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     */
    public void setShippingStopFlg_IsNotNull() { regShippingStopFlg(CK_ISNN, DOBJ); }

    protected void regShippingStopFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingStopFlg(), "SHIPPING_STOP_FLG"); }
    protected abstract ConditionValue xgetCValueShippingStopFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIXED_POINT: {decimal(16, 6)}
     * @param fixedPoint The value of fixedPoint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedPoint_Equal(java.math.BigDecimal fixedPoint) {
        doSetFixedPoint_Equal(fixedPoint);
    }

    protected void doSetFixedPoint_Equal(java.math.BigDecimal fixedPoint) {
        regFixedPoint(CK_EQ, fixedPoint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FIXED_POINT: {decimal(16, 6)}
     * @param fixedPoint The value of fixedPoint as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedPoint_NotEqual(java.math.BigDecimal fixedPoint) {
        doSetFixedPoint_NotEqual(fixedPoint);
    }

    protected void doSetFixedPoint_NotEqual(java.math.BigDecimal fixedPoint) {
        regFixedPoint(CK_NES, fixedPoint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FIXED_POINT: {decimal(16, 6)}
     * @param fixedPoint The value of fixedPoint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedPoint_GreaterThan(java.math.BigDecimal fixedPoint) {
        regFixedPoint(CK_GT, fixedPoint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FIXED_POINT: {decimal(16, 6)}
     * @param fixedPoint The value of fixedPoint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedPoint_LessThan(java.math.BigDecimal fixedPoint) {
        regFixedPoint(CK_LT, fixedPoint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIXED_POINT: {decimal(16, 6)}
     * @param fixedPoint The value of fixedPoint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedPoint_GreaterEqual(java.math.BigDecimal fixedPoint) {
        regFixedPoint(CK_GE, fixedPoint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIXED_POINT: {decimal(16, 6)}
     * @param fixedPoint The value of fixedPoint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedPoint_LessEqual(java.math.BigDecimal fixedPoint) {
        regFixedPoint(CK_LE, fixedPoint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FIXED_POINT: {decimal(16, 6)}
     * @param minNumber The min number of fixedPoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fixedPoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFixedPoint_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFixedPoint(), "FIXED_POINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FIXED_POINT: {decimal(16, 6)}
     * @param fixedPointList The collection of fixedPoint as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedPoint_InScope(Collection<java.math.BigDecimal> fixedPointList) {
        doSetFixedPoint_InScope(fixedPointList);
    }

    protected void doSetFixedPoint_InScope(Collection<java.math.BigDecimal> fixedPointList) {
        regINS(CK_INS, cTL(fixedPointList), xgetCValueFixedPoint(), "FIXED_POINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FIXED_POINT: {decimal(16, 6)}
     * @param fixedPointList The collection of fixedPoint as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedPoint_NotInScope(Collection<java.math.BigDecimal> fixedPointList) {
        doSetFixedPoint_NotInScope(fixedPointList);
    }

    protected void doSetFixedPoint_NotInScope(Collection<java.math.BigDecimal> fixedPointList) {
        regINS(CK_NINS, cTL(fixedPointList), xgetCValueFixedPoint(), "FIXED_POINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIXED_POINT: {decimal(16, 6)}
     */
    public void setFixedPoint_IsNull() { regFixedPoint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIXED_POINT: {decimal(16, 6)}
     */
    public void setFixedPoint_IsNotNull() { regFixedPoint(CK_ISNN, DOBJ); }

    protected void regFixedPoint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFixedPoint(), "FIXED_POINT"); }
    protected abstract ConditionValue xgetCValueFixedPoint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpId The value of shapeGrpId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_Equal(Long shapeGrpId) {
        doSetShapeGrpId_Equal(shapeGrpId);
    }

    protected void doSetShapeGrpId_Equal(Long shapeGrpId) {
        regShapeGrpId(CK_EQ, shapeGrpId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpId The value of shapeGrpId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_NotEqual(Long shapeGrpId) {
        doSetShapeGrpId_NotEqual(shapeGrpId);
    }

    protected void doSetShapeGrpId_NotEqual(Long shapeGrpId) {
        regShapeGrpId(CK_NES, shapeGrpId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpId The value of shapeGrpId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_GreaterThan(Long shapeGrpId) {
        regShapeGrpId(CK_GT, shapeGrpId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpId The value of shapeGrpId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_LessThan(Long shapeGrpId) {
        regShapeGrpId(CK_LT, shapeGrpId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpId The value of shapeGrpId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_GreaterEqual(Long shapeGrpId) {
        regShapeGrpId(CK_GE, shapeGrpId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpId The value of shapeGrpId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_LessEqual(Long shapeGrpId) {
        regShapeGrpId(CK_LE, shapeGrpId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param minNumber The min number of shapeGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shapeGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShapeGrpId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShapeGrpId(), "SHAPE_GRP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpIdList The collection of shapeGrpId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpId_InScope(Collection<Long> shapeGrpIdList) {
        doSetShapeGrpId_InScope(shapeGrpIdList);
    }

    protected void doSetShapeGrpId_InScope(Collection<Long> shapeGrpIdList) {
        regINS(CK_INS, cTL(shapeGrpIdList), xgetCValueShapeGrpId(), "SHAPE_GRP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpIdList The collection of shapeGrpId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpId_NotInScope(Collection<Long> shapeGrpIdList) {
        doSetShapeGrpId_NotInScope(shapeGrpIdList);
    }

    protected void doSetShapeGrpId_NotInScope(Collection<Long> shapeGrpIdList) {
        regINS(CK_NINS, cTL(shapeGrpIdList), xgetCValueShapeGrpId(), "SHAPE_GRP_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHAPE_GRP_ID from M_SHAPE_GRP where ...)} <br />
     * M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @param subCBLambda The callback for sub-query of MShapeGrp for 'in-scope'. (NotNull)
     */
    public void inScopeMShapeGrp(SubQuery<MShapeGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeGrpCB cb = new MShapeGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeGrpId_InScopeRelation_MShapeGrp(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", pp, "mShapeGrp", false);
    }
    public abstract String keepShapeGrpId_InScopeRelation_MShapeGrp(MShapeGrpCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHAPE_GRP_ID from M_SHAPE_GRP where ...)} <br />
     * M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @param subCBLambda The callback for sub-query of MShapeGrp for 'not in-scope'. (NotNull)
     */
    public void notInScopeMShapeGrp(SubQuery<MShapeGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeGrpCB cb = new MShapeGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeGrpId_NotInScopeRelation_MShapeGrp(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", pp, "mShapeGrp", true);
    }
    public abstract String keepShapeGrpId_NotInScopeRelation_MShapeGrp(MShapeGrpCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     */
    public void setShapeGrpId_IsNull() { regShapeGrpId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     */
    public void setShapeGrpId_IsNotNull() { regShapeGrpId(CK_ISNN, DOBJ); }

    protected void regShapeGrpId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShapeGrpId(), "SHAPE_GRP_ID"); }
    protected abstract ConditionValue xgetCValueShapeGrpId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NMFC_CODE: {varchar(30)}
     * @param nmfcCode The value of nmfcCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_Equal(String nmfcCode) {
        doSetNmfcCode_Equal(fRES(nmfcCode));
    }

    protected void doSetNmfcCode_Equal(String nmfcCode) {
        regNmfcCode(CK_EQ, nmfcCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NMFC_CODE: {varchar(30)}
     * @param nmfcCode The value of nmfcCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_NotEqual(String nmfcCode) {
        doSetNmfcCode_NotEqual(fRES(nmfcCode));
    }

    protected void doSetNmfcCode_NotEqual(String nmfcCode) {
        regNmfcCode(CK_NES, nmfcCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NMFC_CODE: {varchar(30)}
     * @param nmfcCode The value of nmfcCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_GreaterThan(String nmfcCode) {
        regNmfcCode(CK_GT, fRES(nmfcCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NMFC_CODE: {varchar(30)}
     * @param nmfcCode The value of nmfcCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_LessThan(String nmfcCode) {
        regNmfcCode(CK_LT, fRES(nmfcCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NMFC_CODE: {varchar(30)}
     * @param nmfcCode The value of nmfcCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_GreaterEqual(String nmfcCode) {
        regNmfcCode(CK_GE, fRES(nmfcCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NMFC_CODE: {varchar(30)}
     * @param nmfcCode The value of nmfcCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_LessEqual(String nmfcCode) {
        regNmfcCode(CK_LE, fRES(nmfcCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NMFC_CODE: {varchar(30)}
     * @param nmfcCodeList The collection of nmfcCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_InScope(Collection<String> nmfcCodeList) {
        doSetNmfcCode_InScope(nmfcCodeList);
    }

    protected void doSetNmfcCode_InScope(Collection<String> nmfcCodeList) {
        regINS(CK_INS, cTL(nmfcCodeList), xgetCValueNmfcCode(), "NMFC_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NMFC_CODE: {varchar(30)}
     * @param nmfcCodeList The collection of nmfcCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_NotInScope(Collection<String> nmfcCodeList) {
        doSetNmfcCode_NotInScope(nmfcCodeList);
    }

    protected void doSetNmfcCode_NotInScope(Collection<String> nmfcCodeList) {
        regINS(CK_NINS, cTL(nmfcCodeList), xgetCValueNmfcCode(), "NMFC_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NMFC_CODE: {varchar(30)} <br>
     * <pre>e.g. setNmfcCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nmfcCode The value of nmfcCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNmfcCode_LikeSearch(String nmfcCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nmfcCode), xgetCValueNmfcCode(), "NMFC_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NMFC_CODE: {varchar(30)}
     * @param nmfcCode The value of nmfcCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNmfcCode_NotLikeSearch(String nmfcCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nmfcCode), xgetCValueNmfcCode(), "NMFC_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NMFC_CODE: {varchar(30)}
     * @param nmfcCode The value of nmfcCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_PrefixSearch(String nmfcCode) {
        setNmfcCode_LikeSearch(nmfcCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NMFC_CODE: {varchar(30)}
     */
    public void setNmfcCode_IsNull() { regNmfcCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NMFC_CODE: {varchar(30)}
     */
    public void setNmfcCode_IsNullOrEmpty() { regNmfcCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NMFC_CODE: {varchar(30)}
     */
    public void setNmfcCode_IsNotNull() { regNmfcCode(CK_ISNN, DOBJ); }

    protected void regNmfcCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNmfcCode(), "NMFC_CODE"); }
    protected abstract ConditionValue xgetCValueNmfcCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls}
     * @param freightCls The value of freightCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightCls_Equal(String freightCls) {
        doSetFreightCls_Equal(fRES(freightCls));
    }

    /**
     * Equal(=). As FreightCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setFreightCls_Equal_AsFreightCls(CDef.FreightCls cdef) {
        doSetFreightCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: 50
     */
    public void setFreightCls_Equal_$01() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$01);
    }

    /**
     * Equal(=). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 55
     */
    public void setFreightCls_Equal_$02() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$02);
    }

    /**
     * Equal(=). As $03 (03). And OnlyOnceRegistered. <br>
     * $03: 60
     */
    public void setFreightCls_Equal_$03() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$03);
    }

    /**
     * Equal(=). As $04 (04). And OnlyOnceRegistered. <br>
     * $04: 65
     */
    public void setFreightCls_Equal_$04() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$04);
    }

    /**
     * Equal(=). As $05 (05). And OnlyOnceRegistered. <br>
     * $05: 70
     */
    public void setFreightCls_Equal_$05() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$05);
    }

    /**
     * Equal(=). As $06 (06). And OnlyOnceRegistered. <br>
     * $06: 77.5
     */
    public void setFreightCls_Equal_$06() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$06);
    }

    /**
     * Equal(=). As $07 (07). And OnlyOnceRegistered. <br>
     * $07: 85
     */
    public void setFreightCls_Equal_$07() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$07);
    }

    /**
     * Equal(=). As $08 (08). And OnlyOnceRegistered. <br>
     * $08: 92.5
     */
    public void setFreightCls_Equal_$08() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$08);
    }

    /**
     * Equal(=). As $09 (09). And OnlyOnceRegistered. <br>
     * $09: 100
     */
    public void setFreightCls_Equal_$09() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$09);
    }

    /**
     * Equal(=). As $10 (10). And OnlyOnceRegistered. <br>
     * $10: 110
     */
    public void setFreightCls_Equal_$10() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$10);
    }

    /**
     * Equal(=). As $11 (11). And OnlyOnceRegistered. <br>
     * $11: 125
     */
    public void setFreightCls_Equal_$11() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$11);
    }

    /**
     * Equal(=). As $12 (12). And OnlyOnceRegistered. <br>
     * $12: 150
     */
    public void setFreightCls_Equal_$12() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$12);
    }

    /**
     * Equal(=). As $13 (13). And OnlyOnceRegistered. <br>
     * $13: 175
     */
    public void setFreightCls_Equal_$13() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$13);
    }

    /**
     * Equal(=). As $14 (14). And OnlyOnceRegistered. <br>
     * $14: 200
     */
    public void setFreightCls_Equal_$14() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$14);
    }

    /**
     * Equal(=). As $15 (15). And OnlyOnceRegistered. <br>
     * $15: 250
     */
    public void setFreightCls_Equal_$15() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$15);
    }

    /**
     * Equal(=). As $16 (16). And OnlyOnceRegistered. <br>
     * $16: 300
     */
    public void setFreightCls_Equal_$16() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$16);
    }

    /**
     * Equal(=). As $17 (17). And OnlyOnceRegistered. <br>
     * $17: 400
     */
    public void setFreightCls_Equal_$17() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$17);
    }

    /**
     * Equal(=). As $18 (18). And OnlyOnceRegistered. <br>
     * $18: 500
     */
    public void setFreightCls_Equal_$18() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$18);
    }

    protected void doSetFreightCls_Equal(String freightCls) {
        regFreightCls(CK_EQ, freightCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls}
     * @param freightCls The value of freightCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightCls_NotEqual(String freightCls) {
        doSetFreightCls_NotEqual(fRES(freightCls));
    }

    /**
     * NotEqual(&lt;&gt;). As FreightCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls cdef) {
        doSetFreightCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: 50
     */
    public void setFreightCls_NotEqual_$01() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$01);
    }

    /**
     * NotEqual(&lt;&gt;). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 55
     */
    public void setFreightCls_NotEqual_$02() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$02);
    }

    /**
     * NotEqual(&lt;&gt;). As $03 (03). And OnlyOnceRegistered. <br>
     * $03: 60
     */
    public void setFreightCls_NotEqual_$03() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$03);
    }

    /**
     * NotEqual(&lt;&gt;). As $04 (04). And OnlyOnceRegistered. <br>
     * $04: 65
     */
    public void setFreightCls_NotEqual_$04() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$04);
    }

    /**
     * NotEqual(&lt;&gt;). As $05 (05). And OnlyOnceRegistered. <br>
     * $05: 70
     */
    public void setFreightCls_NotEqual_$05() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$05);
    }

    /**
     * NotEqual(&lt;&gt;). As $06 (06). And OnlyOnceRegistered. <br>
     * $06: 77.5
     */
    public void setFreightCls_NotEqual_$06() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$06);
    }

    /**
     * NotEqual(&lt;&gt;). As $07 (07). And OnlyOnceRegistered. <br>
     * $07: 85
     */
    public void setFreightCls_NotEqual_$07() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$07);
    }

    /**
     * NotEqual(&lt;&gt;). As $08 (08). And OnlyOnceRegistered. <br>
     * $08: 92.5
     */
    public void setFreightCls_NotEqual_$08() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$08);
    }

    /**
     * NotEqual(&lt;&gt;). As $09 (09). And OnlyOnceRegistered. <br>
     * $09: 100
     */
    public void setFreightCls_NotEqual_$09() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$09);
    }

    /**
     * NotEqual(&lt;&gt;). As $10 (10). And OnlyOnceRegistered. <br>
     * $10: 110
     */
    public void setFreightCls_NotEqual_$10() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$10);
    }

    /**
     * NotEqual(&lt;&gt;). As $11 (11). And OnlyOnceRegistered. <br>
     * $11: 125
     */
    public void setFreightCls_NotEqual_$11() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$11);
    }

    /**
     * NotEqual(&lt;&gt;). As $12 (12). And OnlyOnceRegistered. <br>
     * $12: 150
     */
    public void setFreightCls_NotEqual_$12() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$12);
    }

    /**
     * NotEqual(&lt;&gt;). As $13 (13). And OnlyOnceRegistered. <br>
     * $13: 175
     */
    public void setFreightCls_NotEqual_$13() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$13);
    }

    /**
     * NotEqual(&lt;&gt;). As $14 (14). And OnlyOnceRegistered. <br>
     * $14: 200
     */
    public void setFreightCls_NotEqual_$14() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$14);
    }

    /**
     * NotEqual(&lt;&gt;). As $15 (15). And OnlyOnceRegistered. <br>
     * $15: 250
     */
    public void setFreightCls_NotEqual_$15() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$15);
    }

    /**
     * NotEqual(&lt;&gt;). As $16 (16). And OnlyOnceRegistered. <br>
     * $16: 300
     */
    public void setFreightCls_NotEqual_$16() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$16);
    }

    /**
     * NotEqual(&lt;&gt;). As $17 (17). And OnlyOnceRegistered. <br>
     * $17: 400
     */
    public void setFreightCls_NotEqual_$17() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$17);
    }

    /**
     * NotEqual(&lt;&gt;). As $18 (18). And OnlyOnceRegistered. <br>
     * $18: 500
     */
    public void setFreightCls_NotEqual_$18() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$18);
    }

    protected void doSetFreightCls_NotEqual(String freightCls) {
        regFreightCls(CK_NES, freightCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls}
     * @param freightClsList The collection of freightCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightCls_InScope(Collection<String> freightClsList) {
        doSetFreightCls_InScope(freightClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As FreightCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightCls_InScope_AsFreightCls(Collection<CDef.FreightCls> cdefList) {
        doSetFreightCls_InScope(cTStrL(cdefList));
    }

    protected void doSetFreightCls_InScope(Collection<String> freightClsList) {
        regINS(CK_INS, cTL(freightClsList), xgetCValueFreightCls(), "FREIGHT_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls}
     * @param freightClsList The collection of freightCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightCls_NotInScope(Collection<String> freightClsList) {
        doSetFreightCls_NotInScope(freightClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As FreightCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightCls_NotInScope_AsFreightCls(Collection<CDef.FreightCls> cdefList) {
        doSetFreightCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetFreightCls_NotInScope(Collection<String> freightClsList) {
        regINS(CK_NINS, cTL(freightClsList), xgetCValueFreightCls(), "FREIGHT_CLS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls}
     */
    public void setFreightCls_IsNull() { regFreightCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls}
     */
    public void setFreightCls_IsNullOrEmpty() { regFreightCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls}
     */
    public void setFreightCls_IsNotNull() { regFreightCls(CK_ISNN, DOBJ); }

    protected void regFreightCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFreightCls(), "FREIGHT_CLS"); }
    protected abstract ConditionValue xgetCValueFreightCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {varchar(30)}
     * @param counntryOfOrigin The value of counntryOfOrigin as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_Equal(String counntryOfOrigin) {
        doSetCounntryOfOrigin_Equal(fRES(counntryOfOrigin));
    }

    protected void doSetCounntryOfOrigin_Equal(String counntryOfOrigin) {
        regCounntryOfOrigin(CK_EQ, counntryOfOrigin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {varchar(30)}
     * @param counntryOfOrigin The value of counntryOfOrigin as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_NotEqual(String counntryOfOrigin) {
        doSetCounntryOfOrigin_NotEqual(fRES(counntryOfOrigin));
    }

    protected void doSetCounntryOfOrigin_NotEqual(String counntryOfOrigin) {
        regCounntryOfOrigin(CK_NES, counntryOfOrigin);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {varchar(30)}
     * @param counntryOfOrigin The value of counntryOfOrigin as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_GreaterThan(String counntryOfOrigin) {
        regCounntryOfOrigin(CK_GT, fRES(counntryOfOrigin));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {varchar(30)}
     * @param counntryOfOrigin The value of counntryOfOrigin as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_LessThan(String counntryOfOrigin) {
        regCounntryOfOrigin(CK_LT, fRES(counntryOfOrigin));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {varchar(30)}
     * @param counntryOfOrigin The value of counntryOfOrigin as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_GreaterEqual(String counntryOfOrigin) {
        regCounntryOfOrigin(CK_GE, fRES(counntryOfOrigin));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {varchar(30)}
     * @param counntryOfOrigin The value of counntryOfOrigin as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_LessEqual(String counntryOfOrigin) {
        regCounntryOfOrigin(CK_LE, fRES(counntryOfOrigin));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {varchar(30)}
     * @param counntryOfOriginList The collection of counntryOfOrigin as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_InScope(Collection<String> counntryOfOriginList) {
        doSetCounntryOfOrigin_InScope(counntryOfOriginList);
    }

    protected void doSetCounntryOfOrigin_InScope(Collection<String> counntryOfOriginList) {
        regINS(CK_INS, cTL(counntryOfOriginList), xgetCValueCounntryOfOrigin(), "COUNNTRY_OF_ORIGIN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {varchar(30)}
     * @param counntryOfOriginList The collection of counntryOfOrigin as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_NotInScope(Collection<String> counntryOfOriginList) {
        doSetCounntryOfOrigin_NotInScope(counntryOfOriginList);
    }

    protected void doSetCounntryOfOrigin_NotInScope(Collection<String> counntryOfOriginList) {
        regINS(CK_NINS, cTL(counntryOfOriginList), xgetCValueCounntryOfOrigin(), "COUNNTRY_OF_ORIGIN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {varchar(30)} <br>
     * <pre>e.g. setCounntryOfOrigin_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param counntryOfOrigin The value of counntryOfOrigin as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCounntryOfOrigin_LikeSearch(String counntryOfOrigin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(counntryOfOrigin), xgetCValueCounntryOfOrigin(), "COUNNTRY_OF_ORIGIN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {varchar(30)}
     * @param counntryOfOrigin The value of counntryOfOrigin as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCounntryOfOrigin_NotLikeSearch(String counntryOfOrigin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(counntryOfOrigin), xgetCValueCounntryOfOrigin(), "COUNNTRY_OF_ORIGIN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {varchar(30)}
     * @param counntryOfOrigin The value of counntryOfOrigin as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_PrefixSearch(String counntryOfOrigin) {
        setCounntryOfOrigin_LikeSearch(counntryOfOrigin, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {varchar(30)}
     */
    public void setCounntryOfOrigin_IsNull() { regCounntryOfOrigin(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {varchar(30)}
     */
    public void setCounntryOfOrigin_IsNullOrEmpty() { regCounntryOfOrigin(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {varchar(30)}
     */
    public void setCounntryOfOrigin_IsNotNull() { regCounntryOfOrigin(CK_ISNN, DOBJ); }

    protected void regCounntryOfOrigin(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCounntryOfOrigin(), "COUNNTRY_OF_ORIGIN"); }
    protected abstract ConditionValue xgetCValueCounntryOfOrigin();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_VAL: {decimal(16, 6)}
     * @param unitVal The value of unitVal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitVal_Equal(java.math.BigDecimal unitVal) {
        doSetUnitVal_Equal(unitVal);
    }

    protected void doSetUnitVal_Equal(java.math.BigDecimal unitVal) {
        regUnitVal(CK_EQ, unitVal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_VAL: {decimal(16, 6)}
     * @param unitVal The value of unitVal as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitVal_NotEqual(java.math.BigDecimal unitVal) {
        doSetUnitVal_NotEqual(unitVal);
    }

    protected void doSetUnitVal_NotEqual(java.math.BigDecimal unitVal) {
        regUnitVal(CK_NES, unitVal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_VAL: {decimal(16, 6)}
     * @param unitVal The value of unitVal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitVal_GreaterThan(java.math.BigDecimal unitVal) {
        regUnitVal(CK_GT, unitVal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_VAL: {decimal(16, 6)}
     * @param unitVal The value of unitVal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitVal_LessThan(java.math.BigDecimal unitVal) {
        regUnitVal(CK_LT, unitVal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_VAL: {decimal(16, 6)}
     * @param unitVal The value of unitVal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitVal_GreaterEqual(java.math.BigDecimal unitVal) {
        regUnitVal(CK_GE, unitVal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_VAL: {decimal(16, 6)}
     * @param unitVal The value of unitVal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitVal_LessEqual(java.math.BigDecimal unitVal) {
        regUnitVal(CK_LE, unitVal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_VAL: {decimal(16, 6)}
     * @param minNumber The min number of unitVal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unitVal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnitVal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnitVal(), "UNIT_VAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_VAL: {decimal(16, 6)}
     * @param unitValList The collection of unitVal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitVal_InScope(Collection<java.math.BigDecimal> unitValList) {
        doSetUnitVal_InScope(unitValList);
    }

    protected void doSetUnitVal_InScope(Collection<java.math.BigDecimal> unitValList) {
        regINS(CK_INS, cTL(unitValList), xgetCValueUnitVal(), "UNIT_VAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_VAL: {decimal(16, 6)}
     * @param unitValList The collection of unitVal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitVal_NotInScope(Collection<java.math.BigDecimal> unitValList) {
        doSetUnitVal_NotInScope(unitValList);
    }

    protected void doSetUnitVal_NotInScope(Collection<java.math.BigDecimal> unitValList) {
        regINS(CK_NINS, cTL(unitValList), xgetCValueUnitVal(), "UNIT_VAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_VAL: {decimal(16, 6)}
     */
    public void setUnitVal_IsNull() { regUnitVal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_VAL: {decimal(16, 6)}
     */
    public void setUnitVal_IsNotNull() { regUnitVal(CK_ISNN, DOBJ); }

    protected void regUnitVal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitVal(), "UNIT_VAL"); }
    protected abstract ConditionValue xgetCValueUnitVal();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTS_CD: {varchar(30)}
     * @param htsCd The value of htsCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_Equal(String htsCd) {
        doSetHtsCd_Equal(fRES(htsCd));
    }

    protected void doSetHtsCd_Equal(String htsCd) {
        regHtsCd(CK_EQ, htsCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTS_CD: {varchar(30)}
     * @param htsCd The value of htsCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_NotEqual(String htsCd) {
        doSetHtsCd_NotEqual(fRES(htsCd));
    }

    protected void doSetHtsCd_NotEqual(String htsCd) {
        regHtsCd(CK_NES, htsCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTS_CD: {varchar(30)}
     * @param htsCd The value of htsCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_GreaterThan(String htsCd) {
        regHtsCd(CK_GT, fRES(htsCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTS_CD: {varchar(30)}
     * @param htsCd The value of htsCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_LessThan(String htsCd) {
        regHtsCd(CK_LT, fRES(htsCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTS_CD: {varchar(30)}
     * @param htsCd The value of htsCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_GreaterEqual(String htsCd) {
        regHtsCd(CK_GE, fRES(htsCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTS_CD: {varchar(30)}
     * @param htsCd The value of htsCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_LessEqual(String htsCd) {
        regHtsCd(CK_LE, fRES(htsCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HTS_CD: {varchar(30)}
     * @param htsCdList The collection of htsCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_InScope(Collection<String> htsCdList) {
        doSetHtsCd_InScope(htsCdList);
    }

    protected void doSetHtsCd_InScope(Collection<String> htsCdList) {
        regINS(CK_INS, cTL(htsCdList), xgetCValueHtsCd(), "HTS_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HTS_CD: {varchar(30)}
     * @param htsCdList The collection of htsCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_NotInScope(Collection<String> htsCdList) {
        doSetHtsCd_NotInScope(htsCdList);
    }

    protected void doSetHtsCd_NotInScope(Collection<String> htsCdList) {
        regINS(CK_NINS, cTL(htsCdList), xgetCValueHtsCd(), "HTS_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HTS_CD: {varchar(30)} <br>
     * <pre>e.g. setHtsCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param htsCd The value of htsCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHtsCd_LikeSearch(String htsCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(htsCd), xgetCValueHtsCd(), "HTS_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HTS_CD: {varchar(30)}
     * @param htsCd The value of htsCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHtsCd_NotLikeSearch(String htsCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(htsCd), xgetCValueHtsCd(), "HTS_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HTS_CD: {varchar(30)}
     * @param htsCd The value of htsCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_PrefixSearch(String htsCd) {
        setHtsCd_LikeSearch(htsCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HTS_CD: {varchar(30)}
     */
    public void setHtsCd_IsNull() { regHtsCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HTS_CD: {varchar(30)}
     */
    public void setHtsCd_IsNullOrEmpty() { regHtsCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HTS_CD: {varchar(30)}
     */
    public void setHtsCd_IsNotNull() { regHtsCd(CK_ISNN, DOBJ); }

    protected void regHtsCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHtsCd(), "HTS_CD"); }
    protected abstract ConditionValue xgetCValueHtsCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroup The value of itemgroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_Equal(String itemgroup) {
        doSetItemgroup_Equal(fRES(itemgroup));
    }

    protected void doSetItemgroup_Equal(String itemgroup) {
        regItemgroup(CK_EQ, itemgroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroup The value of itemgroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_NotEqual(String itemgroup) {
        doSetItemgroup_NotEqual(fRES(itemgroup));
    }

    protected void doSetItemgroup_NotEqual(String itemgroup) {
        regItemgroup(CK_NES, itemgroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroup The value of itemgroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_GreaterThan(String itemgroup) {
        regItemgroup(CK_GT, fRES(itemgroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroup The value of itemgroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_LessThan(String itemgroup) {
        regItemgroup(CK_LT, fRES(itemgroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroup The value of itemgroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_GreaterEqual(String itemgroup) {
        regItemgroup(CK_GE, fRES(itemgroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroup The value of itemgroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_LessEqual(String itemgroup) {
        regItemgroup(CK_LE, fRES(itemgroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroupList The collection of itemgroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_InScope(Collection<String> itemgroupList) {
        doSetItemgroup_InScope(itemgroupList);
    }

    protected void doSetItemgroup_InScope(Collection<String> itemgroupList) {
        regINS(CK_INS, cTL(itemgroupList), xgetCValueItemgroup(), "ITEMGROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroupList The collection of itemgroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_NotInScope(Collection<String> itemgroupList) {
        doSetItemgroup_NotInScope(itemgroupList);
    }

    protected void doSetItemgroup_NotInScope(Collection<String> itemgroupList) {
        regINS(CK_NINS, cTL(itemgroupList), xgetCValueItemgroup(), "ITEMGROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMGROUP: {varchar(60)} <br>
     * <pre>e.g. setItemgroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemgroup The value of itemgroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemgroup_LikeSearch(String itemgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemgroup), xgetCValueItemgroup(), "ITEMGROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroup The value of itemgroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemgroup_NotLikeSearch(String itemgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemgroup), xgetCValueItemgroup(), "ITEMGROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroup The value of itemgroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_PrefixSearch(String itemgroup) {
        setItemgroup_LikeSearch(itemgroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     */
    public void setItemgroup_IsNull() { regItemgroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     */
    public void setItemgroup_IsNullOrEmpty() { regItemgroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     */
    public void setItemgroup_IsNotNull() { regItemgroup(CK_ISNN, DOBJ); }

    protected void regItemgroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemgroup(), "ITEMGROUP"); }
    protected abstract ConditionValue xgetCValueItemgroup();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_Equal(java.math.BigDecimal actflg) {
        doSetActflg_Equal(actflg);
    }

    protected void doSetActflg_Equal(java.math.BigDecimal actflg) {
        regActflg(CK_EQ, actflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_NotEqual(java.math.BigDecimal actflg) {
        doSetActflg_NotEqual(actflg);
    }

    protected void doSetActflg_NotEqual(java.math.BigDecimal actflg) {
        regActflg(CK_NES, actflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_GreaterThan(java.math.BigDecimal actflg) {
        regActflg(CK_GT, actflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_LessThan(java.math.BigDecimal actflg) {
        regActflg(CK_LT, actflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_GreaterEqual(java.math.BigDecimal actflg) {
        regActflg(CK_GE, actflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_LessEqual(java.math.BigDecimal actflg) {
        regActflg(CK_LE, actflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param minNumber The min number of actflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of actflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setActflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueActflg(), "ACTFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflgList The collection of actflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_InScope(Collection<java.math.BigDecimal> actflgList) {
        doSetActflg_InScope(actflgList);
    }

    protected void doSetActflg_InScope(Collection<java.math.BigDecimal> actflgList) {
        regINS(CK_INS, cTL(actflgList), xgetCValueActflg(), "ACTFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflgList The collection of actflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_NotInScope(Collection<java.math.BigDecimal> actflgList) {
        doSetActflg_NotInScope(actflgList);
    }

    protected void doSetActflg_NotInScope(Collection<java.math.BigDecimal> actflgList) {
        regINS(CK_NINS, cTL(actflgList), xgetCValueActflg(), "ACTFLG");
    }

    protected void regActflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueActflg(), "ACTFLG"); }
    protected abstract ConditionValue xgetCValueActflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVTYPE: {NotNull, varchar(30)}
     * @param invtype The value of invtype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_Equal(String invtype) {
        doSetInvtype_Equal(fRES(invtype));
    }

    protected void doSetInvtype_Equal(String invtype) {
        regInvtype(CK_EQ, invtype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVTYPE: {NotNull, varchar(30)}
     * @param invtype The value of invtype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_NotEqual(String invtype) {
        doSetInvtype_NotEqual(fRES(invtype));
    }

    protected void doSetInvtype_NotEqual(String invtype) {
        regInvtype(CK_NES, invtype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVTYPE: {NotNull, varchar(30)}
     * @param invtype The value of invtype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_GreaterThan(String invtype) {
        regInvtype(CK_GT, fRES(invtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVTYPE: {NotNull, varchar(30)}
     * @param invtype The value of invtype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_LessThan(String invtype) {
        regInvtype(CK_LT, fRES(invtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVTYPE: {NotNull, varchar(30)}
     * @param invtype The value of invtype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_GreaterEqual(String invtype) {
        regInvtype(CK_GE, fRES(invtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVTYPE: {NotNull, varchar(30)}
     * @param invtype The value of invtype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_LessEqual(String invtype) {
        regInvtype(CK_LE, fRES(invtype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVTYPE: {NotNull, varchar(30)}
     * @param invtypeList The collection of invtype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_InScope(Collection<String> invtypeList) {
        doSetInvtype_InScope(invtypeList);
    }

    protected void doSetInvtype_InScope(Collection<String> invtypeList) {
        regINS(CK_INS, cTL(invtypeList), xgetCValueInvtype(), "INVTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVTYPE: {NotNull, varchar(30)}
     * @param invtypeList The collection of invtype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_NotInScope(Collection<String> invtypeList) {
        doSetInvtype_NotInScope(invtypeList);
    }

    protected void doSetInvtype_NotInScope(Collection<String> invtypeList) {
        regINS(CK_NINS, cTL(invtypeList), xgetCValueInvtype(), "INVTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVTYPE: {NotNull, varchar(30)} <br>
     * <pre>e.g. setInvtype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invtype The value of invtype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvtype_LikeSearch(String invtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invtype), xgetCValueInvtype(), "INVTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVTYPE: {NotNull, varchar(30)}
     * @param invtype The value of invtype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvtype_NotLikeSearch(String invtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invtype), xgetCValueInvtype(), "INVTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVTYPE: {NotNull, varchar(30)}
     * @param invtype The value of invtype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_PrefixSearch(String invtype) {
        setInvtype_LikeSearch(invtype, xcLSOPPre());
    }

    protected void regInvtype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvtype(), "INVTYPE"); }
    protected abstract ConditionValue xgetCValueInvtype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param setitemflg The value of setitemflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSetitemflg_Equal(java.math.BigDecimal setitemflg) {
        doSetSetitemflg_Equal(setitemflg);
    }

    protected void doSetSetitemflg_Equal(java.math.BigDecimal setitemflg) {
        regSetitemflg(CK_EQ, setitemflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param setitemflg The value of setitemflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSetitemflg_NotEqual(java.math.BigDecimal setitemflg) {
        doSetSetitemflg_NotEqual(setitemflg);
    }

    protected void doSetSetitemflg_NotEqual(java.math.BigDecimal setitemflg) {
        regSetitemflg(CK_NES, setitemflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param setitemflg The value of setitemflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSetitemflg_GreaterThan(java.math.BigDecimal setitemflg) {
        regSetitemflg(CK_GT, setitemflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param setitemflg The value of setitemflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSetitemflg_LessThan(java.math.BigDecimal setitemflg) {
        regSetitemflg(CK_LT, setitemflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param setitemflg The value of setitemflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSetitemflg_GreaterEqual(java.math.BigDecimal setitemflg) {
        regSetitemflg(CK_GE, setitemflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param setitemflg The value of setitemflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSetitemflg_LessEqual(java.math.BigDecimal setitemflg) {
        regSetitemflg(CK_LE, setitemflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of setitemflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of setitemflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSetitemflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSetitemflg(), "SETITEMFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param setitemflgList The collection of setitemflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSetitemflg_InScope(Collection<java.math.BigDecimal> setitemflgList) {
        doSetSetitemflg_InScope(setitemflgList);
    }

    protected void doSetSetitemflg_InScope(Collection<java.math.BigDecimal> setitemflgList) {
        regINS(CK_INS, cTL(setitemflgList), xgetCValueSetitemflg(), "SETITEMFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param setitemflgList The collection of setitemflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSetitemflg_NotInScope(Collection<java.math.BigDecimal> setitemflgList) {
        doSetSetitemflg_NotInScope(setitemflgList);
    }

    protected void doSetSetitemflg_NotInScope(Collection<java.math.BigDecimal> setitemflgList) {
        regINS(CK_NINS, cTL(setitemflgList), xgetCValueSetitemflg(), "SETITEMFLG");
    }

    protected void regSetitemflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSetitemflg(), "SETITEMFLG"); }
    protected abstract ConditionValue xgetCValueSetitemflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcd The value of owneritemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_Equal(String owneritemcd) {
        doSetOwneritemcd_Equal(fRES(owneritemcd));
    }

    protected void doSetOwneritemcd_Equal(String owneritemcd) {
        regOwneritemcd(CK_EQ, owneritemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcd The value of owneritemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_NotEqual(String owneritemcd) {
        doSetOwneritemcd_NotEqual(fRES(owneritemcd));
    }

    protected void doSetOwneritemcd_NotEqual(String owneritemcd) {
        regOwneritemcd(CK_NES, owneritemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcd The value of owneritemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_GreaterThan(String owneritemcd) {
        regOwneritemcd(CK_GT, fRES(owneritemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcd The value of owneritemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_LessThan(String owneritemcd) {
        regOwneritemcd(CK_LT, fRES(owneritemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcd The value of owneritemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_GreaterEqual(String owneritemcd) {
        regOwneritemcd(CK_GE, fRES(owneritemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcd The value of owneritemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_LessEqual(String owneritemcd) {
        regOwneritemcd(CK_LE, fRES(owneritemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcdList The collection of owneritemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_InScope(Collection<String> owneritemcdList) {
        doSetOwneritemcd_InScope(owneritemcdList);
    }

    protected void doSetOwneritemcd_InScope(Collection<String> owneritemcdList) {
        regINS(CK_INS, cTL(owneritemcdList), xgetCValueOwneritemcd(), "OWNERITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcdList The collection of owneritemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_NotInScope(Collection<String> owneritemcdList) {
        doSetOwneritemcd_NotInScope(owneritemcdList);
    }

    protected void doSetOwneritemcd_NotInScope(Collection<String> owneritemcdList) {
        regINS(CK_NINS, cTL(owneritemcdList), xgetCValueOwneritemcd(), "OWNERITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERITEMCD: {varchar(30)} <br>
     * <pre>e.g. setOwneritemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param owneritemcd The value of owneritemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwneritemcd_LikeSearch(String owneritemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(owneritemcd), xgetCValueOwneritemcd(), "OWNERITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcd The value of owneritemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwneritemcd_NotLikeSearch(String owneritemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(owneritemcd), xgetCValueOwneritemcd(), "OWNERITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcd The value of owneritemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_PrefixSearch(String owneritemcd) {
        setOwneritemcd_LikeSearch(owneritemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     */
    public void setOwneritemcd_IsNull() { regOwneritemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     */
    public void setOwneritemcd_IsNullOrEmpty() { regOwneritemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     */
    public void setOwneritemcd_IsNotNull() { regOwneritemcd(CK_ISNN, DOBJ); }

    protected void regOwneritemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwneritemcd(), "OWNERITEMCD"); }
    protected abstract ConditionValue xgetCValueOwneritemcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcd The value of supplieritemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_Equal(String supplieritemcd) {
        doSetSupplieritemcd_Equal(fRES(supplieritemcd));
    }

    protected void doSetSupplieritemcd_Equal(String supplieritemcd) {
        regSupplieritemcd(CK_EQ, supplieritemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcd The value of supplieritemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_NotEqual(String supplieritemcd) {
        doSetSupplieritemcd_NotEqual(fRES(supplieritemcd));
    }

    protected void doSetSupplieritemcd_NotEqual(String supplieritemcd) {
        regSupplieritemcd(CK_NES, supplieritemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcd The value of supplieritemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_GreaterThan(String supplieritemcd) {
        regSupplieritemcd(CK_GT, fRES(supplieritemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcd The value of supplieritemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_LessThan(String supplieritemcd) {
        regSupplieritemcd(CK_LT, fRES(supplieritemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcd The value of supplieritemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_GreaterEqual(String supplieritemcd) {
        regSupplieritemcd(CK_GE, fRES(supplieritemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcd The value of supplieritemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_LessEqual(String supplieritemcd) {
        regSupplieritemcd(CK_LE, fRES(supplieritemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcdList The collection of supplieritemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_InScope(Collection<String> supplieritemcdList) {
        doSetSupplieritemcd_InScope(supplieritemcdList);
    }

    protected void doSetSupplieritemcd_InScope(Collection<String> supplieritemcdList) {
        regINS(CK_INS, cTL(supplieritemcdList), xgetCValueSupplieritemcd(), "SUPPLIERITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcdList The collection of supplieritemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_NotInScope(Collection<String> supplieritemcdList) {
        doSetSupplieritemcd_NotInScope(supplieritemcdList);
    }

    protected void doSetSupplieritemcd_NotInScope(Collection<String> supplieritemcdList) {
        regINS(CK_NINS, cTL(supplieritemcdList), xgetCValueSupplieritemcd(), "SUPPLIERITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)} <br>
     * <pre>e.g. setSupplieritemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplieritemcd The value of supplieritemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplieritemcd_LikeSearch(String supplieritemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplieritemcd), xgetCValueSupplieritemcd(), "SUPPLIERITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcd The value of supplieritemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplieritemcd_NotLikeSearch(String supplieritemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplieritemcd), xgetCValueSupplieritemcd(), "SUPPLIERITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcd The value of supplieritemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_PrefixSearch(String supplieritemcd) {
        setSupplieritemcd_LikeSearch(supplieritemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     */
    public void setSupplieritemcd_IsNull() { regSupplieritemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     */
    public void setSupplieritemcd_IsNullOrEmpty() { regSupplieritemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     */
    public void setSupplieritemcd_IsNotNull() { regSupplieritemcd(CK_ISNN, DOBJ); }

    protected void regSupplieritemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplieritemcd(), "SUPPLIERITEMCD"); }
    protected abstract ConditionValue xgetCValueSupplieritemcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcd The value of positemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_Equal(String positemcd) {
        doSetPositemcd_Equal(fRES(positemcd));
    }

    protected void doSetPositemcd_Equal(String positemcd) {
        regPositemcd(CK_EQ, positemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcd The value of positemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_NotEqual(String positemcd) {
        doSetPositemcd_NotEqual(fRES(positemcd));
    }

    protected void doSetPositemcd_NotEqual(String positemcd) {
        regPositemcd(CK_NES, positemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcd The value of positemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_GreaterThan(String positemcd) {
        regPositemcd(CK_GT, fRES(positemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcd The value of positemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_LessThan(String positemcd) {
        regPositemcd(CK_LT, fRES(positemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcd The value of positemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_GreaterEqual(String positemcd) {
        regPositemcd(CK_GE, fRES(positemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcd The value of positemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_LessEqual(String positemcd) {
        regPositemcd(CK_LE, fRES(positemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcdList The collection of positemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_InScope(Collection<String> positemcdList) {
        doSetPositemcd_InScope(positemcdList);
    }

    protected void doSetPositemcd_InScope(Collection<String> positemcdList) {
        regINS(CK_INS, cTL(positemcdList), xgetCValuePositemcd(), "POSITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcdList The collection of positemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_NotInScope(Collection<String> positemcdList) {
        doSetPositemcd_NotInScope(positemcdList);
    }

    protected void doSetPositemcd_NotInScope(Collection<String> positemcdList) {
        regINS(CK_NINS, cTL(positemcdList), xgetCValuePositemcd(), "POSITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POSITEMCD: {varchar(30)} <br>
     * <pre>e.g. setPositemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param positemcd The value of positemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPositemcd_LikeSearch(String positemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(positemcd), xgetCValuePositemcd(), "POSITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcd The value of positemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPositemcd_NotLikeSearch(String positemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(positemcd), xgetCValuePositemcd(), "POSITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcd The value of positemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_PrefixSearch(String positemcd) {
        setPositemcd_LikeSearch(positemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     */
    public void setPositemcd_IsNull() { regPositemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     */
    public void setPositemcd_IsNullOrEmpty() { regPositemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     */
    public void setPositemcd_IsNotNull() { regPositemcd(CK_ISNN, DOBJ); }

    protected void regPositemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePositemcd(), "POSITEMCD"); }
    protected abstract ConditionValue xgetCValuePositemcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcd The value of itfcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_Equal(String itfcd) {
        doSetItfcd_Equal(fRES(itfcd));
    }

    protected void doSetItfcd_Equal(String itfcd) {
        regItfcd(CK_EQ, itfcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcd The value of itfcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_NotEqual(String itfcd) {
        doSetItfcd_NotEqual(fRES(itfcd));
    }

    protected void doSetItfcd_NotEqual(String itfcd) {
        regItfcd(CK_NES, itfcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcd The value of itfcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_GreaterThan(String itfcd) {
        regItfcd(CK_GT, fRES(itfcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcd The value of itfcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_LessThan(String itfcd) {
        regItfcd(CK_LT, fRES(itfcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcd The value of itfcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_GreaterEqual(String itfcd) {
        regItfcd(CK_GE, fRES(itfcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcd The value of itfcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_LessEqual(String itfcd) {
        regItfcd(CK_LE, fRES(itfcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcdList The collection of itfcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_InScope(Collection<String> itfcdList) {
        doSetItfcd_InScope(itfcdList);
    }

    protected void doSetItfcd_InScope(Collection<String> itfcdList) {
        regINS(CK_INS, cTL(itfcdList), xgetCValueItfcd(), "ITFCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcdList The collection of itfcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_NotInScope(Collection<String> itfcdList) {
        doSetItfcd_NotInScope(itfcdList);
    }

    protected void doSetItfcd_NotInScope(Collection<String> itfcdList) {
        regINS(CK_NINS, cTL(itfcdList), xgetCValueItfcd(), "ITFCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITFCD: {varchar(30)} <br>
     * <pre>e.g. setItfcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itfcd The value of itfcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItfcd_LikeSearch(String itfcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itfcd), xgetCValueItfcd(), "ITFCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcd The value of itfcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItfcd_NotLikeSearch(String itfcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itfcd), xgetCValueItfcd(), "ITFCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcd The value of itfcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_PrefixSearch(String itfcd) {
        setItfcd_LikeSearch(itfcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     */
    public void setItfcd_IsNull() { regItfcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     */
    public void setItfcd_IsNullOrEmpty() { regItfcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     */
    public void setItfcd_IsNotNull() { regItfcd(CK_ISNN, DOBJ); }

    protected void regItfcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItfcd(), "ITFCD"); }
    protected abstract ConditionValue xgetCValueItfcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_Equal(String manuitemcd) {
        doSetManuitemcd_Equal(fRES(manuitemcd));
    }

    protected void doSetManuitemcd_Equal(String manuitemcd) {
        regManuitemcd(CK_EQ, manuitemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_NotEqual(String manuitemcd) {
        doSetManuitemcd_NotEqual(fRES(manuitemcd));
    }

    protected void doSetManuitemcd_NotEqual(String manuitemcd) {
        regManuitemcd(CK_NES, manuitemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_GreaterThan(String manuitemcd) {
        regManuitemcd(CK_GT, fRES(manuitemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_LessThan(String manuitemcd) {
        regManuitemcd(CK_LT, fRES(manuitemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_GreaterEqual(String manuitemcd) {
        regManuitemcd(CK_GE, fRES(manuitemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_LessEqual(String manuitemcd) {
        regManuitemcd(CK_LE, fRES(manuitemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcdList The collection of manuitemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_InScope(Collection<String> manuitemcdList) {
        doSetManuitemcd_InScope(manuitemcdList);
    }

    protected void doSetManuitemcd_InScope(Collection<String> manuitemcdList) {
        regINS(CK_INS, cTL(manuitemcdList), xgetCValueManuitemcd(), "MANUITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcdList The collection of manuitemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_NotInScope(Collection<String> manuitemcdList) {
        doSetManuitemcd_NotInScope(manuitemcdList);
    }

    protected void doSetManuitemcd_NotInScope(Collection<String> manuitemcdList) {
        regINS(CK_NINS, cTL(manuitemcdList), xgetCValueManuitemcd(), "MANUITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUITEMCD: {varchar(30)} <br>
     * <pre>e.g. setManuitemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manuitemcd The value of manuitemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManuitemcd_LikeSearch(String manuitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manuitemcd), xgetCValueManuitemcd(), "MANUITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManuitemcd_NotLikeSearch(String manuitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manuitemcd), xgetCValueManuitemcd(), "MANUITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_PrefixSearch(String manuitemcd) {
        setManuitemcd_LikeSearch(manuitemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     */
    public void setManuitemcd_IsNull() { regManuitemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     */
    public void setManuitemcd_IsNullOrEmpty() { regManuitemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     */
    public void setManuitemcd_IsNotNull() { regManuitemcd(CK_ISNN, DOBJ); }

    protected void regManuitemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManuitemcd(), "MANUITEMCD"); }
    protected abstract ConditionValue xgetCValueManuitemcd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param priceBuy The value of priceBuy as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_Equal(Long priceBuy) {
        doSetPriceBuy_Equal(priceBuy);
    }

    protected void doSetPriceBuy_Equal(Long priceBuy) {
        regPriceBuy(CK_EQ, priceBuy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param priceBuy The value of priceBuy as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_NotEqual(Long priceBuy) {
        doSetPriceBuy_NotEqual(priceBuy);
    }

    protected void doSetPriceBuy_NotEqual(Long priceBuy) {
        regPriceBuy(CK_NES, priceBuy);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param priceBuy The value of priceBuy as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_GreaterThan(Long priceBuy) {
        regPriceBuy(CK_GT, priceBuy);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param priceBuy The value of priceBuy as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_LessThan(Long priceBuy) {
        regPriceBuy(CK_LT, priceBuy);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param priceBuy The value of priceBuy as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_GreaterEqual(Long priceBuy) {
        regPriceBuy(CK_GE, priceBuy);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param priceBuy The value of priceBuy as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_LessEqual(Long priceBuy) {
        regPriceBuy(CK_LE, priceBuy);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of priceBuy. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of priceBuy. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPriceBuy_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePriceBuy(), "PRICE_BUY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param priceBuyList The collection of priceBuy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceBuy_InScope(Collection<Long> priceBuyList) {
        doSetPriceBuy_InScope(priceBuyList);
    }

    protected void doSetPriceBuy_InScope(Collection<Long> priceBuyList) {
        regINS(CK_INS, cTL(priceBuyList), xgetCValuePriceBuy(), "PRICE_BUY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @param priceBuyList The collection of priceBuy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceBuy_NotInScope(Collection<Long> priceBuyList) {
        doSetPriceBuy_NotInScope(priceBuyList);
    }

    protected void doSetPriceBuy_NotInScope(Collection<Long> priceBuyList) {
        regINS(CK_NINS, cTL(priceBuyList), xgetCValuePriceBuy(), "PRICE_BUY");
    }

    protected void regPriceBuy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriceBuy(), "PRICE_BUY"); }
    protected abstract ConditionValue xgetCValuePriceBuy();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceWholesale_Equal(Long priceWholesale) {
        doSetPriceWholesale_Equal(priceWholesale);
    }

    protected void doSetPriceWholesale_Equal(Long priceWholesale) {
        regPriceWholesale(CK_EQ, priceWholesale);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceWholesale_NotEqual(Long priceWholesale) {
        doSetPriceWholesale_NotEqual(priceWholesale);
    }

    protected void doSetPriceWholesale_NotEqual(Long priceWholesale) {
        regPriceWholesale(CK_NES, priceWholesale);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceWholesale_GreaterThan(Long priceWholesale) {
        regPriceWholesale(CK_GT, priceWholesale);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceWholesale_LessThan(Long priceWholesale) {
        regPriceWholesale(CK_LT, priceWholesale);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceWholesale_GreaterEqual(Long priceWholesale) {
        regPriceWholesale(CK_GE, priceWholesale);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceWholesale_LessEqual(Long priceWholesale) {
        regPriceWholesale(CK_LE, priceWholesale);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of priceWholesale. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of priceWholesale. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPriceWholesale_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePriceWholesale(), "PRICE_WHOLESALE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceWholesaleList The collection of priceWholesale as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceWholesale_InScope(Collection<Long> priceWholesaleList) {
        doSetPriceWholesale_InScope(priceWholesaleList);
    }

    protected void doSetPriceWholesale_InScope(Collection<Long> priceWholesaleList) {
        regINS(CK_INS, cTL(priceWholesaleList), xgetCValuePriceWholesale(), "PRICE_WHOLESALE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceWholesaleList The collection of priceWholesale as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceWholesale_NotInScope(Collection<Long> priceWholesaleList) {
        doSetPriceWholesale_NotInScope(priceWholesaleList);
    }

    protected void doSetPriceWholesale_NotInScope(Collection<Long> priceWholesaleList) {
        regINS(CK_NINS, cTL(priceWholesaleList), xgetCValuePriceWholesale(), "PRICE_WHOLESALE");
    }

    protected void regPriceWholesale(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriceWholesale(), "PRICE_WHOLESALE"); }
    protected abstract ConditionValue xgetCValuePriceWholesale();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceSale The value of priceSale as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceSale_Equal(Long priceSale) {
        doSetPriceSale_Equal(priceSale);
    }

    protected void doSetPriceSale_Equal(Long priceSale) {
        regPriceSale(CK_EQ, priceSale);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceSale The value of priceSale as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceSale_NotEqual(Long priceSale) {
        doSetPriceSale_NotEqual(priceSale);
    }

    protected void doSetPriceSale_NotEqual(Long priceSale) {
        regPriceSale(CK_NES, priceSale);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceSale The value of priceSale as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceSale_GreaterThan(Long priceSale) {
        regPriceSale(CK_GT, priceSale);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceSale The value of priceSale as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceSale_LessThan(Long priceSale) {
        regPriceSale(CK_LT, priceSale);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceSale The value of priceSale as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceSale_GreaterEqual(Long priceSale) {
        regPriceSale(CK_GE, priceSale);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceSale The value of priceSale as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceSale_LessEqual(Long priceSale) {
        regPriceSale(CK_LE, priceSale);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of priceSale. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of priceSale. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPriceSale_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePriceSale(), "PRICE_SALE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceSaleList The collection of priceSale as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceSale_InScope(Collection<Long> priceSaleList) {
        doSetPriceSale_InScope(priceSaleList);
    }

    protected void doSetPriceSale_InScope(Collection<Long> priceSaleList) {
        regINS(CK_INS, cTL(priceSaleList), xgetCValuePriceSale(), "PRICE_SALE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @param priceSaleList The collection of priceSale as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceSale_NotInScope(Collection<Long> priceSaleList) {
        doSetPriceSale_NotInScope(priceSaleList);
    }

    protected void doSetPriceSale_NotInScope(Collection<Long> priceSaleList) {
        regINS(CK_NINS, cTL(priceSaleList), xgetCValuePriceSale(), "PRICE_SALE");
    }

    protected void regPriceSale(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriceSale(), "PRICE_SALE"); }
    protected abstract ConditionValue xgetCValuePriceSale();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCPOLICYKEY: {decimal(16, 6)}
     * @param allocpolicykey The value of allocpolicykey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocpolicykey_Equal(java.math.BigDecimal allocpolicykey) {
        doSetAllocpolicykey_Equal(allocpolicykey);
    }

    protected void doSetAllocpolicykey_Equal(java.math.BigDecimal allocpolicykey) {
        regAllocpolicykey(CK_EQ, allocpolicykey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCPOLICYKEY: {decimal(16, 6)}
     * @param allocpolicykey The value of allocpolicykey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocpolicykey_NotEqual(java.math.BigDecimal allocpolicykey) {
        doSetAllocpolicykey_NotEqual(allocpolicykey);
    }

    protected void doSetAllocpolicykey_NotEqual(java.math.BigDecimal allocpolicykey) {
        regAllocpolicykey(CK_NES, allocpolicykey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCPOLICYKEY: {decimal(16, 6)}
     * @param allocpolicykey The value of allocpolicykey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocpolicykey_GreaterThan(java.math.BigDecimal allocpolicykey) {
        regAllocpolicykey(CK_GT, allocpolicykey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCPOLICYKEY: {decimal(16, 6)}
     * @param allocpolicykey The value of allocpolicykey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocpolicykey_LessThan(java.math.BigDecimal allocpolicykey) {
        regAllocpolicykey(CK_LT, allocpolicykey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCPOLICYKEY: {decimal(16, 6)}
     * @param allocpolicykey The value of allocpolicykey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocpolicykey_GreaterEqual(java.math.BigDecimal allocpolicykey) {
        regAllocpolicykey(CK_GE, allocpolicykey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCPOLICYKEY: {decimal(16, 6)}
     * @param allocpolicykey The value of allocpolicykey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocpolicykey_LessEqual(java.math.BigDecimal allocpolicykey) {
        regAllocpolicykey(CK_LE, allocpolicykey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCPOLICYKEY: {decimal(16, 6)}
     * @param minNumber The min number of allocpolicykey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocpolicykey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocpolicykey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocpolicykey(), "ALLOCPOLICYKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOCPOLICYKEY: {decimal(16, 6)}
     * @param allocpolicykeyList The collection of allocpolicykey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocpolicykey_InScope(Collection<java.math.BigDecimal> allocpolicykeyList) {
        doSetAllocpolicykey_InScope(allocpolicykeyList);
    }

    protected void doSetAllocpolicykey_InScope(Collection<java.math.BigDecimal> allocpolicykeyList) {
        regINS(CK_INS, cTL(allocpolicykeyList), xgetCValueAllocpolicykey(), "ALLOCPOLICYKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOCPOLICYKEY: {decimal(16, 6)}
     * @param allocpolicykeyList The collection of allocpolicykey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocpolicykey_NotInScope(Collection<java.math.BigDecimal> allocpolicykeyList) {
        doSetAllocpolicykey_NotInScope(allocpolicykeyList);
    }

    protected void doSetAllocpolicykey_NotInScope(Collection<java.math.BigDecimal> allocpolicykeyList) {
        regINS(CK_NINS, cTL(allocpolicykeyList), xgetCValueAllocpolicykey(), "ALLOCPOLICYKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOCPOLICYKEY: {decimal(16, 6)}
     */
    public void setAllocpolicykey_IsNull() { regAllocpolicykey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOCPOLICYKEY: {decimal(16, 6)}
     */
    public void setAllocpolicykey_IsNotNull() { regAllocpolicykey(CK_ISNN, DOBJ); }

    protected void regAllocpolicykey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocpolicykey(), "ALLOCPOLICYKEY"); }
    protected abstract ConditionValue xgetCValueAllocpolicykey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param slotpolicykey The value of slotpolicykey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotpolicykey_Equal(java.math.BigDecimal slotpolicykey) {
        doSetSlotpolicykey_Equal(slotpolicykey);
    }

    protected void doSetSlotpolicykey_Equal(java.math.BigDecimal slotpolicykey) {
        regSlotpolicykey(CK_EQ, slotpolicykey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param slotpolicykey The value of slotpolicykey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotpolicykey_NotEqual(java.math.BigDecimal slotpolicykey) {
        doSetSlotpolicykey_NotEqual(slotpolicykey);
    }

    protected void doSetSlotpolicykey_NotEqual(java.math.BigDecimal slotpolicykey) {
        regSlotpolicykey(CK_NES, slotpolicykey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param slotpolicykey The value of slotpolicykey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotpolicykey_GreaterThan(java.math.BigDecimal slotpolicykey) {
        regSlotpolicykey(CK_GT, slotpolicykey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param slotpolicykey The value of slotpolicykey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotpolicykey_LessThan(java.math.BigDecimal slotpolicykey) {
        regSlotpolicykey(CK_LT, slotpolicykey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param slotpolicykey The value of slotpolicykey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotpolicykey_GreaterEqual(java.math.BigDecimal slotpolicykey) {
        regSlotpolicykey(CK_GE, slotpolicykey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param slotpolicykey The value of slotpolicykey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotpolicykey_LessEqual(java.math.BigDecimal slotpolicykey) {
        regSlotpolicykey(CK_LE, slotpolicykey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param minNumber The min number of slotpolicykey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of slotpolicykey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSlotpolicykey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSlotpolicykey(), "SLOTPOLICYKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param slotpolicykeyList The collection of slotpolicykey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotpolicykey_InScope(Collection<java.math.BigDecimal> slotpolicykeyList) {
        doSetSlotpolicykey_InScope(slotpolicykeyList);
    }

    protected void doSetSlotpolicykey_InScope(Collection<java.math.BigDecimal> slotpolicykeyList) {
        regINS(CK_INS, cTL(slotpolicykeyList), xgetCValueSlotpolicykey(), "SLOTPOLICYKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param slotpolicykeyList The collection of slotpolicykey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotpolicykey_NotInScope(Collection<java.math.BigDecimal> slotpolicykeyList) {
        doSetSlotpolicykey_NotInScope(slotpolicykeyList);
    }

    protected void doSetSlotpolicykey_NotInScope(Collection<java.math.BigDecimal> slotpolicykeyList) {
        regINS(CK_NINS, cTL(slotpolicykeyList), xgetCValueSlotpolicykey(), "SLOTPOLICYKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     */
    public void setSlotpolicykey_IsNull() { regSlotpolicykey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     */
    public void setSlotpolicykey_IsNotNull() { regSlotpolicykey(CK_ISNN, DOBJ); }

    protected void regSlotpolicykey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlotpolicykey(), "SLOTPOLICYKEY"); }
    protected abstract ConditionValue xgetCValueSlotpolicykey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param inworkingkey The value of inworkingkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInworkingkey_Equal(java.math.BigDecimal inworkingkey) {
        doSetInworkingkey_Equal(inworkingkey);
    }

    protected void doSetInworkingkey_Equal(java.math.BigDecimal inworkingkey) {
        regInworkingkey(CK_EQ, inworkingkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param inworkingkey The value of inworkingkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInworkingkey_NotEqual(java.math.BigDecimal inworkingkey) {
        doSetInworkingkey_NotEqual(inworkingkey);
    }

    protected void doSetInworkingkey_NotEqual(java.math.BigDecimal inworkingkey) {
        regInworkingkey(CK_NES, inworkingkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param inworkingkey The value of inworkingkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInworkingkey_GreaterThan(java.math.BigDecimal inworkingkey) {
        regInworkingkey(CK_GT, inworkingkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param inworkingkey The value of inworkingkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInworkingkey_LessThan(java.math.BigDecimal inworkingkey) {
        regInworkingkey(CK_LT, inworkingkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param inworkingkey The value of inworkingkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInworkingkey_GreaterEqual(java.math.BigDecimal inworkingkey) {
        regInworkingkey(CK_GE, inworkingkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param inworkingkey The value of inworkingkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInworkingkey_LessEqual(java.math.BigDecimal inworkingkey) {
        regInworkingkey(CK_LE, inworkingkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param minNumber The min number of inworkingkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inworkingkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInworkingkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInworkingkey(), "INWORKINGKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param inworkingkeyList The collection of inworkingkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInworkingkey_InScope(Collection<java.math.BigDecimal> inworkingkeyList) {
        doSetInworkingkey_InScope(inworkingkeyList);
    }

    protected void doSetInworkingkey_InScope(Collection<java.math.BigDecimal> inworkingkeyList) {
        regINS(CK_INS, cTL(inworkingkeyList), xgetCValueInworkingkey(), "INWORKINGKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param inworkingkeyList The collection of inworkingkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInworkingkey_NotInScope(Collection<java.math.BigDecimal> inworkingkeyList) {
        doSetInworkingkey_NotInScope(inworkingkeyList);
    }

    protected void doSetInworkingkey_NotInScope(Collection<java.math.BigDecimal> inworkingkeyList) {
        regINS(CK_NINS, cTL(inworkingkeyList), xgetCValueInworkingkey(), "INWORKINGKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     */
    public void setInworkingkey_IsNull() { regInworkingkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     */
    public void setInworkingkey_IsNotNull() { regInworkingkey(CK_ISNN, DOBJ); }

    protected void regInworkingkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInworkingkey(), "INWORKINGKEY"); }
    protected abstract ConditionValue xgetCValueInworkingkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param outworkingkey The value of outworkingkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutworkingkey_Equal(java.math.BigDecimal outworkingkey) {
        doSetOutworkingkey_Equal(outworkingkey);
    }

    protected void doSetOutworkingkey_Equal(java.math.BigDecimal outworkingkey) {
        regOutworkingkey(CK_EQ, outworkingkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param outworkingkey The value of outworkingkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutworkingkey_NotEqual(java.math.BigDecimal outworkingkey) {
        doSetOutworkingkey_NotEqual(outworkingkey);
    }

    protected void doSetOutworkingkey_NotEqual(java.math.BigDecimal outworkingkey) {
        regOutworkingkey(CK_NES, outworkingkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param outworkingkey The value of outworkingkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutworkingkey_GreaterThan(java.math.BigDecimal outworkingkey) {
        regOutworkingkey(CK_GT, outworkingkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param outworkingkey The value of outworkingkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutworkingkey_LessThan(java.math.BigDecimal outworkingkey) {
        regOutworkingkey(CK_LT, outworkingkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param outworkingkey The value of outworkingkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutworkingkey_GreaterEqual(java.math.BigDecimal outworkingkey) {
        regOutworkingkey(CK_GE, outworkingkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param outworkingkey The value of outworkingkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutworkingkey_LessEqual(java.math.BigDecimal outworkingkey) {
        regOutworkingkey(CK_LE, outworkingkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param minNumber The min number of outworkingkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of outworkingkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOutworkingkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOutworkingkey(), "OUTWORKINGKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param outworkingkeyList The collection of outworkingkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOutworkingkey_InScope(Collection<java.math.BigDecimal> outworkingkeyList) {
        doSetOutworkingkey_InScope(outworkingkeyList);
    }

    protected void doSetOutworkingkey_InScope(Collection<java.math.BigDecimal> outworkingkeyList) {
        regINS(CK_INS, cTL(outworkingkeyList), xgetCValueOutworkingkey(), "OUTWORKINGKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param outworkingkeyList The collection of outworkingkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOutworkingkey_NotInScope(Collection<java.math.BigDecimal> outworkingkeyList) {
        doSetOutworkingkey_NotInScope(outworkingkeyList);
    }

    protected void doSetOutworkingkey_NotInScope(Collection<java.math.BigDecimal> outworkingkeyList) {
        regINS(CK_NINS, cTL(outworkingkeyList), xgetCValueOutworkingkey(), "OUTWORKINGKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     */
    public void setOutworkingkey_IsNull() { regOutworkingkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     */
    public void setOutworkingkey_IsNotNull() { regOutworkingkey(CK_ISNN, DOBJ); }

    protected void regOutworkingkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOutworkingkey(), "OUTWORKINGKEY"); }
    protected abstract ConditionValue xgetCValueOutworkingkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctype The value of abctype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_Equal(String abctype) {
        doSetAbctype_Equal(fRES(abctype));
    }

    protected void doSetAbctype_Equal(String abctype) {
        regAbctype(CK_EQ, abctype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctype The value of abctype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_NotEqual(String abctype) {
        doSetAbctype_NotEqual(fRES(abctype));
    }

    protected void doSetAbctype_NotEqual(String abctype) {
        regAbctype(CK_NES, abctype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctype The value of abctype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_GreaterThan(String abctype) {
        regAbctype(CK_GT, fRES(abctype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctype The value of abctype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_LessThan(String abctype) {
        regAbctype(CK_LT, fRES(abctype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctype The value of abctype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_GreaterEqual(String abctype) {
        regAbctype(CK_GE, fRES(abctype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctype The value of abctype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_LessEqual(String abctype) {
        regAbctype(CK_LE, fRES(abctype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctypeList The collection of abctype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_InScope(Collection<String> abctypeList) {
        doSetAbctype_InScope(abctypeList);
    }

    protected void doSetAbctype_InScope(Collection<String> abctypeList) {
        regINS(CK_INS, cTL(abctypeList), xgetCValueAbctype(), "ABCTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctypeList The collection of abctype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_NotInScope(Collection<String> abctypeList) {
        doSetAbctype_NotInScope(abctypeList);
    }

    protected void doSetAbctype_NotInScope(Collection<String> abctypeList) {
        regINS(CK_NINS, cTL(abctypeList), xgetCValueAbctype(), "ABCTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ABCTYPE: {varchar(30)} <br>
     * <pre>e.g. setAbctype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param abctype The value of abctype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAbctype_LikeSearch(String abctype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(abctype), xgetCValueAbctype(), "ABCTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctype The value of abctype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAbctype_NotLikeSearch(String abctype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(abctype), xgetCValueAbctype(), "ABCTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctype The value of abctype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_PrefixSearch(String abctype) {
        setAbctype_LikeSearch(abctype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     */
    public void setAbctype_IsNull() { regAbctype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     */
    public void setAbctype_IsNullOrEmpty() { regAbctype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     */
    public void setAbctype_IsNotNull() { regAbctype(CK_ISNN, DOBJ); }

    protected void regAbctype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAbctype(), "ABCTYPE"); }
    protected abstract ConditionValue xgetCValueAbctype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty1type The value of qty1type as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1type_Equal(java.math.BigDecimal qty1type) {
        doSetQty1type_Equal(qty1type);
    }

    protected void doSetQty1type_Equal(java.math.BigDecimal qty1type) {
        regQty1type(CK_EQ, qty1type);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty1type The value of qty1type as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1type_NotEqual(java.math.BigDecimal qty1type) {
        doSetQty1type_NotEqual(qty1type);
    }

    protected void doSetQty1type_NotEqual(java.math.BigDecimal qty1type) {
        regQty1type(CK_NES, qty1type);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty1type The value of qty1type as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1type_GreaterThan(java.math.BigDecimal qty1type) {
        regQty1type(CK_GT, qty1type);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty1type The value of qty1type as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1type_LessThan(java.math.BigDecimal qty1type) {
        regQty1type(CK_LT, qty1type);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty1type The value of qty1type as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1type_GreaterEqual(java.math.BigDecimal qty1type) {
        regQty1type(CK_GE, qty1type);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty1type The value of qty1type as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1type_LessEqual(java.math.BigDecimal qty1type) {
        regQty1type(CK_LE, qty1type);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of qty1type. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty1type. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty1type_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty1type(), "QTY1TYPE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty1typeList The collection of qty1type as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1type_InScope(Collection<java.math.BigDecimal> qty1typeList) {
        doSetQty1type_InScope(qty1typeList);
    }

    protected void doSetQty1type_InScope(Collection<java.math.BigDecimal> qty1typeList) {
        regINS(CK_INS, cTL(qty1typeList), xgetCValueQty1type(), "QTY1TYPE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty1typeList The collection of qty1type as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1type_NotInScope(Collection<java.math.BigDecimal> qty1typeList) {
        doSetQty1type_NotInScope(qty1typeList);
    }

    protected void doSetQty1type_NotInScope(Collection<java.math.BigDecimal> qty1typeList) {
        regINS(CK_NINS, cTL(qty1typeList), xgetCValueQty1type(), "QTY1TYPE");
    }

    protected void regQty1type(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty1type(), "QTY1TYPE"); }
    protected abstract ConditionValue xgetCValueQty1type();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit1 The value of unit1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit1_Equal(java.math.BigDecimal unit1) {
        doSetUnit1_Equal(unit1);
    }

    protected void doSetUnit1_Equal(java.math.BigDecimal unit1) {
        regUnit1(CK_EQ, unit1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit1 The value of unit1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit1_NotEqual(java.math.BigDecimal unit1) {
        doSetUnit1_NotEqual(unit1);
    }

    protected void doSetUnit1_NotEqual(java.math.BigDecimal unit1) {
        regUnit1(CK_NES, unit1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit1 The value of unit1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit1_GreaterThan(java.math.BigDecimal unit1) {
        regUnit1(CK_GT, unit1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit1 The value of unit1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit1_LessThan(java.math.BigDecimal unit1) {
        regUnit1(CK_LT, unit1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit1 The value of unit1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit1_GreaterEqual(java.math.BigDecimal unit1) {
        regUnit1(CK_GE, unit1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit1 The value of unit1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit1_LessEqual(java.math.BigDecimal unit1) {
        regUnit1(CK_LE, unit1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of unit1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unit1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnit1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnit1(), "UNIT1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit1List The collection of unit1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1_InScope(Collection<java.math.BigDecimal> unit1List) {
        doSetUnit1_InScope(unit1List);
    }

    protected void doSetUnit1_InScope(Collection<java.math.BigDecimal> unit1List) {
        regINS(CK_INS, cTL(unit1List), xgetCValueUnit1(), "UNIT1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit1List The collection of unit1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1_NotInScope(Collection<java.math.BigDecimal> unit1List) {
        doSetUnit1_NotInScope(unit1List);
    }

    protected void doSetUnit1_NotInScope(Collection<java.math.BigDecimal> unit1List) {
        regINS(CK_NINS, cTL(unit1List), xgetCValueUnit1(), "UNIT1");
    }

    protected void regUnit1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnit1(), "UNIT1"); }
    protected abstract ConditionValue xgetCValueUnit1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1style The value of unit1style as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_Equal(String unit1style) {
        doSetUnit1style_Equal(fRES(unit1style));
    }

    protected void doSetUnit1style_Equal(String unit1style) {
        regUnit1style(CK_EQ, unit1style);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1style The value of unit1style as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_NotEqual(String unit1style) {
        doSetUnit1style_NotEqual(fRES(unit1style));
    }

    protected void doSetUnit1style_NotEqual(String unit1style) {
        regUnit1style(CK_NES, unit1style);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1style The value of unit1style as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_GreaterThan(String unit1style) {
        regUnit1style(CK_GT, fRES(unit1style));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1style The value of unit1style as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_LessThan(String unit1style) {
        regUnit1style(CK_LT, fRES(unit1style));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1style The value of unit1style as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_GreaterEqual(String unit1style) {
        regUnit1style(CK_GE, fRES(unit1style));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1style The value of unit1style as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_LessEqual(String unit1style) {
        regUnit1style(CK_LE, fRES(unit1style));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1styleList The collection of unit1style as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_InScope(Collection<String> unit1styleList) {
        doSetUnit1style_InScope(unit1styleList);
    }

    protected void doSetUnit1style_InScope(Collection<String> unit1styleList) {
        regINS(CK_INS, cTL(unit1styleList), xgetCValueUnit1style(), "UNIT1STYLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1styleList The collection of unit1style as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_NotInScope(Collection<String> unit1styleList) {
        doSetUnit1style_NotInScope(unit1styleList);
    }

    protected void doSetUnit1style_NotInScope(Collection<String> unit1styleList) {
        regINS(CK_NINS, cTL(unit1styleList), xgetCValueUnit1style(), "UNIT1STYLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT1STYLE: {varchar(60)} <br>
     * <pre>e.g. setUnit1style_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unit1style The value of unit1style as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUnit1style_LikeSearch(String unit1style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unit1style), xgetCValueUnit1style(), "UNIT1STYLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1style The value of unit1style as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnit1style_NotLikeSearch(String unit1style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unit1style), xgetCValueUnit1style(), "UNIT1STYLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1style The value of unit1style as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_PrefixSearch(String unit1style) {
        setUnit1style_LikeSearch(unit1style, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     */
    public void setUnit1style_IsNull() { regUnit1style(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     */
    public void setUnit1style_IsNullOrEmpty() { regUnit1style(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     */
    public void setUnit1style_IsNotNull() { regUnit1style(CK_ISNN, DOBJ); }

    protected void regUnit1style(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnit1style(), "UNIT1STYLE"); }
    protected abstract ConditionValue xgetCValueUnit1style();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {NotNull, bigint(19), default=[(0)]}
     * @param length1 The value of length1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength1_Equal(Long length1) {
        doSetLength1_Equal(length1);
    }

    protected void doSetLength1_Equal(Long length1) {
        regLength1(CK_EQ, length1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {NotNull, bigint(19), default=[(0)]}
     * @param length1 The value of length1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength1_NotEqual(Long length1) {
        doSetLength1_NotEqual(length1);
    }

    protected void doSetLength1_NotEqual(Long length1) {
        regLength1(CK_NES, length1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {NotNull, bigint(19), default=[(0)]}
     * @param length1 The value of length1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength1_GreaterThan(Long length1) {
        regLength1(CK_GT, length1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {NotNull, bigint(19), default=[(0)]}
     * @param length1 The value of length1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength1_LessThan(Long length1) {
        regLength1(CK_LT, length1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {NotNull, bigint(19), default=[(0)]}
     * @param length1 The value of length1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength1_GreaterEqual(Long length1) {
        regLength1(CK_GE, length1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {NotNull, bigint(19), default=[(0)]}
     * @param length1 The value of length1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength1_LessEqual(Long length1) {
        regLength1(CK_LE, length1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of length1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of length1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLength1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLength1(), "LENGTH1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LENGTH1: {NotNull, bigint(19), default=[(0)]}
     * @param length1List The collection of length1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength1_InScope(Collection<Long> length1List) {
        doSetLength1_InScope(length1List);
    }

    protected void doSetLength1_InScope(Collection<Long> length1List) {
        regINS(CK_INS, cTL(length1List), xgetCValueLength1(), "LENGTH1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LENGTH1: {NotNull, bigint(19), default=[(0)]}
     * @param length1List The collection of length1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength1_NotInScope(Collection<Long> length1List) {
        doSetLength1_NotInScope(length1List);
    }

    protected void doSetLength1_NotInScope(Collection<Long> length1List) {
        regINS(CK_NINS, cTL(length1List), xgetCValueLength1(), "LENGTH1");
    }

    protected void regLength1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLength1(), "LENGTH1"); }
    protected abstract ConditionValue xgetCValueLength1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {NotNull, bigint(19), default=[(0)]}
     * @param width1 The value of width1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth1_Equal(Long width1) {
        doSetWidth1_Equal(width1);
    }

    protected void doSetWidth1_Equal(Long width1) {
        regWidth1(CK_EQ, width1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {NotNull, bigint(19), default=[(0)]}
     * @param width1 The value of width1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth1_NotEqual(Long width1) {
        doSetWidth1_NotEqual(width1);
    }

    protected void doSetWidth1_NotEqual(Long width1) {
        regWidth1(CK_NES, width1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {NotNull, bigint(19), default=[(0)]}
     * @param width1 The value of width1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth1_GreaterThan(Long width1) {
        regWidth1(CK_GT, width1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {NotNull, bigint(19), default=[(0)]}
     * @param width1 The value of width1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth1_LessThan(Long width1) {
        regWidth1(CK_LT, width1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {NotNull, bigint(19), default=[(0)]}
     * @param width1 The value of width1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth1_GreaterEqual(Long width1) {
        regWidth1(CK_GE, width1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {NotNull, bigint(19), default=[(0)]}
     * @param width1 The value of width1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth1_LessEqual(Long width1) {
        regWidth1(CK_LE, width1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of width1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of width1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWidth1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWidth1(), "WIDTH1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WIDTH1: {NotNull, bigint(19), default=[(0)]}
     * @param width1List The collection of width1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth1_InScope(Collection<Long> width1List) {
        doSetWidth1_InScope(width1List);
    }

    protected void doSetWidth1_InScope(Collection<Long> width1List) {
        regINS(CK_INS, cTL(width1List), xgetCValueWidth1(), "WIDTH1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WIDTH1: {NotNull, bigint(19), default=[(0)]}
     * @param width1List The collection of width1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth1_NotInScope(Collection<Long> width1List) {
        doSetWidth1_NotInScope(width1List);
    }

    protected void doSetWidth1_NotInScope(Collection<Long> width1List) {
        regINS(CK_NINS, cTL(width1List), xgetCValueWidth1(), "WIDTH1");
    }

    protected void regWidth1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWidth1(), "WIDTH1"); }
    protected abstract ConditionValue xgetCValueWidth1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param height1 The value of height1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight1_Equal(Long height1) {
        doSetHeight1_Equal(height1);
    }

    protected void doSetHeight1_Equal(Long height1) {
        regHeight1(CK_EQ, height1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param height1 The value of height1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight1_NotEqual(Long height1) {
        doSetHeight1_NotEqual(height1);
    }

    protected void doSetHeight1_NotEqual(Long height1) {
        regHeight1(CK_NES, height1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param height1 The value of height1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight1_GreaterThan(Long height1) {
        regHeight1(CK_GT, height1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param height1 The value of height1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight1_LessThan(Long height1) {
        regHeight1(CK_LT, height1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param height1 The value of height1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight1_GreaterEqual(Long height1) {
        regHeight1(CK_GE, height1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param height1 The value of height1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight1_LessEqual(Long height1) {
        regHeight1(CK_LE, height1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of height1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of height1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHeight1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHeight1(), "HEIGHT1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param height1List The collection of height1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight1_InScope(Collection<Long> height1List) {
        doSetHeight1_InScope(height1List);
    }

    protected void doSetHeight1_InScope(Collection<Long> height1List) {
        regINS(CK_INS, cTL(height1List), xgetCValueHeight1(), "HEIGHT1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param height1List The collection of height1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight1_NotInScope(Collection<Long> height1List) {
        doSetHeight1_NotInScope(height1List);
    }

    protected void doSetHeight1_NotInScope(Collection<Long> height1List) {
        regINS(CK_NINS, cTL(height1List), xgetCValueHeight1(), "HEIGHT1");
    }

    protected void regHeight1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHeight1(), "HEIGHT1"); }
    protected abstract ConditionValue xgetCValueHeight1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight1 The value of grossweight1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight1_Equal(Long grossweight1) {
        doSetGrossweight1_Equal(grossweight1);
    }

    protected void doSetGrossweight1_Equal(Long grossweight1) {
        regGrossweight1(CK_EQ, grossweight1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight1 The value of grossweight1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight1_NotEqual(Long grossweight1) {
        doSetGrossweight1_NotEqual(grossweight1);
    }

    protected void doSetGrossweight1_NotEqual(Long grossweight1) {
        regGrossweight1(CK_NES, grossweight1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight1 The value of grossweight1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight1_GreaterThan(Long grossweight1) {
        regGrossweight1(CK_GT, grossweight1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight1 The value of grossweight1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight1_LessThan(Long grossweight1) {
        regGrossweight1(CK_LT, grossweight1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight1 The value of grossweight1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight1_GreaterEqual(Long grossweight1) {
        regGrossweight1(CK_GE, grossweight1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight1 The value of grossweight1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight1_LessEqual(Long grossweight1) {
        regGrossweight1(CK_LE, grossweight1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of grossweight1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of grossweight1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGrossweight1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGrossweight1(), "GROSSWEIGHT1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight1List The collection of grossweight1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight1_InScope(Collection<Long> grossweight1List) {
        doSetGrossweight1_InScope(grossweight1List);
    }

    protected void doSetGrossweight1_InScope(Collection<Long> grossweight1List) {
        regINS(CK_INS, cTL(grossweight1List), xgetCValueGrossweight1(), "GROSSWEIGHT1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight1List The collection of grossweight1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight1_NotInScope(Collection<Long> grossweight1List) {
        doSetGrossweight1_NotInScope(grossweight1List);
    }

    protected void doSetGrossweight1_NotInScope(Collection<Long> grossweight1List) {
        regINS(CK_NINS, cTL(grossweight1List), xgetCValueGrossweight1(), "GROSSWEIGHT1");
    }

    protected void regGrossweight1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGrossweight1(), "GROSSWEIGHT1"); }
    protected abstract ConditionValue xgetCValueGrossweight1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param netweight1 The value of netweight1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight1_Equal(Long netweight1) {
        doSetNetweight1_Equal(netweight1);
    }

    protected void doSetNetweight1_Equal(Long netweight1) {
        regNetweight1(CK_EQ, netweight1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param netweight1 The value of netweight1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight1_NotEqual(Long netweight1) {
        doSetNetweight1_NotEqual(netweight1);
    }

    protected void doSetNetweight1_NotEqual(Long netweight1) {
        regNetweight1(CK_NES, netweight1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param netweight1 The value of netweight1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight1_GreaterThan(Long netweight1) {
        regNetweight1(CK_GT, netweight1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param netweight1 The value of netweight1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight1_LessThan(Long netweight1) {
        regNetweight1(CK_LT, netweight1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param netweight1 The value of netweight1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight1_GreaterEqual(Long netweight1) {
        regNetweight1(CK_GE, netweight1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param netweight1 The value of netweight1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight1_LessEqual(Long netweight1) {
        regNetweight1(CK_LE, netweight1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of netweight1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of netweight1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNetweight1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNetweight1(), "NETWEIGHT1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NETWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param netweight1List The collection of netweight1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight1_InScope(Collection<Long> netweight1List) {
        doSetNetweight1_InScope(netweight1List);
    }

    protected void doSetNetweight1_InScope(Collection<Long> netweight1List) {
        regINS(CK_INS, cTL(netweight1List), xgetCValueNetweight1(), "NETWEIGHT1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NETWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @param netweight1List The collection of netweight1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight1_NotInScope(Collection<Long> netweight1List) {
        doSetNetweight1_NotInScope(netweight1List);
    }

    protected void doSetNetweight1_NotInScope(Collection<Long> netweight1List) {
        regINS(CK_NINS, cTL(netweight1List), xgetCValueNetweight1(), "NETWEIGHT1");
    }

    protected void regNetweight1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNetweight1(), "NETWEIGHT1"); }
    protected abstract ConditionValue xgetCValueNetweight1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE1: {NotNull, bigint(19), default=[(0)]}
     * @param cube1 The value of cube1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube1_Equal(Long cube1) {
        doSetCube1_Equal(cube1);
    }

    protected void doSetCube1_Equal(Long cube1) {
        regCube1(CK_EQ, cube1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE1: {NotNull, bigint(19), default=[(0)]}
     * @param cube1 The value of cube1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube1_NotEqual(Long cube1) {
        doSetCube1_NotEqual(cube1);
    }

    protected void doSetCube1_NotEqual(Long cube1) {
        regCube1(CK_NES, cube1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE1: {NotNull, bigint(19), default=[(0)]}
     * @param cube1 The value of cube1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube1_GreaterThan(Long cube1) {
        regCube1(CK_GT, cube1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE1: {NotNull, bigint(19), default=[(0)]}
     * @param cube1 The value of cube1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube1_LessThan(Long cube1) {
        regCube1(CK_LT, cube1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE1: {NotNull, bigint(19), default=[(0)]}
     * @param cube1 The value of cube1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube1_GreaterEqual(Long cube1) {
        regCube1(CK_GE, cube1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE1: {NotNull, bigint(19), default=[(0)]}
     * @param cube1 The value of cube1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube1_LessEqual(Long cube1) {
        regCube1(CK_LE, cube1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE1: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of cube1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cube1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCube1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCube1(), "CUBE1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUBE1: {NotNull, bigint(19), default=[(0)]}
     * @param cube1List The collection of cube1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube1_InScope(Collection<Long> cube1List) {
        doSetCube1_InScope(cube1List);
    }

    protected void doSetCube1_InScope(Collection<Long> cube1List) {
        regINS(CK_INS, cTL(cube1List), xgetCValueCube1(), "CUBE1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUBE1: {NotNull, bigint(19), default=[(0)]}
     * @param cube1List The collection of cube1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube1_NotInScope(Collection<Long> cube1List) {
        doSetCube1_NotInScope(cube1List);
    }

    protected void doSetCube1_NotInScope(Collection<Long> cube1List) {
        regINS(CK_NINS, cTL(cube1List), xgetCValueCube1(), "CUBE1");
    }

    protected void regCube1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCube1(), "CUBE1"); }
    protected abstract ConditionValue xgetCValueCube1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER1: {NotNull, bigint(19), default=[(0)]}
     * @param liter1 The value of liter1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter1_Equal(Long liter1) {
        doSetLiter1_Equal(liter1);
    }

    protected void doSetLiter1_Equal(Long liter1) {
        regLiter1(CK_EQ, liter1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER1: {NotNull, bigint(19), default=[(0)]}
     * @param liter1 The value of liter1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter1_NotEqual(Long liter1) {
        doSetLiter1_NotEqual(liter1);
    }

    protected void doSetLiter1_NotEqual(Long liter1) {
        regLiter1(CK_NES, liter1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER1: {NotNull, bigint(19), default=[(0)]}
     * @param liter1 The value of liter1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter1_GreaterThan(Long liter1) {
        regLiter1(CK_GT, liter1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER1: {NotNull, bigint(19), default=[(0)]}
     * @param liter1 The value of liter1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter1_LessThan(Long liter1) {
        regLiter1(CK_LT, liter1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER1: {NotNull, bigint(19), default=[(0)]}
     * @param liter1 The value of liter1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter1_GreaterEqual(Long liter1) {
        regLiter1(CK_GE, liter1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER1: {NotNull, bigint(19), default=[(0)]}
     * @param liter1 The value of liter1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter1_LessEqual(Long liter1) {
        regLiter1(CK_LE, liter1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LITER1: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of liter1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of liter1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLiter1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLiter1(), "LITER1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LITER1: {NotNull, bigint(19), default=[(0)]}
     * @param liter1List The collection of liter1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter1_InScope(Collection<Long> liter1List) {
        doSetLiter1_InScope(liter1List);
    }

    protected void doSetLiter1_InScope(Collection<Long> liter1List) {
        regINS(CK_INS, cTL(liter1List), xgetCValueLiter1(), "LITER1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LITER1: {NotNull, bigint(19), default=[(0)]}
     * @param liter1List The collection of liter1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter1_NotInScope(Collection<Long> liter1List) {
        doSetLiter1_NotInScope(liter1List);
    }

    protected void doSetLiter1_NotInScope(Collection<Long> liter1List) {
        regINS(CK_NINS, cTL(liter1List), xgetCValueLiter1(), "LITER1");
    }

    protected void regLiter1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLiter1(), "LITER1"); }
    protected abstract ConditionValue xgetCValueLiter1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit2 The value of unit2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit2_Equal(java.math.BigDecimal unit2) {
        doSetUnit2_Equal(unit2);
    }

    protected void doSetUnit2_Equal(java.math.BigDecimal unit2) {
        regUnit2(CK_EQ, unit2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit2 The value of unit2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit2_NotEqual(java.math.BigDecimal unit2) {
        doSetUnit2_NotEqual(unit2);
    }

    protected void doSetUnit2_NotEqual(java.math.BigDecimal unit2) {
        regUnit2(CK_NES, unit2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit2 The value of unit2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit2_GreaterThan(java.math.BigDecimal unit2) {
        regUnit2(CK_GT, unit2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit2 The value of unit2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit2_LessThan(java.math.BigDecimal unit2) {
        regUnit2(CK_LT, unit2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit2 The value of unit2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit2_GreaterEqual(java.math.BigDecimal unit2) {
        regUnit2(CK_GE, unit2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit2 The value of unit2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit2_LessEqual(java.math.BigDecimal unit2) {
        regUnit2(CK_LE, unit2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of unit2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unit2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnit2_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnit2(), "UNIT2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit2List The collection of unit2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2_InScope(Collection<java.math.BigDecimal> unit2List) {
        doSetUnit2_InScope(unit2List);
    }

    protected void doSetUnit2_InScope(Collection<java.math.BigDecimal> unit2List) {
        regINS(CK_INS, cTL(unit2List), xgetCValueUnit2(), "UNIT2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit2List The collection of unit2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2_NotInScope(Collection<java.math.BigDecimal> unit2List) {
        doSetUnit2_NotInScope(unit2List);
    }

    protected void doSetUnit2_NotInScope(Collection<java.math.BigDecimal> unit2List) {
        regINS(CK_NINS, cTL(unit2List), xgetCValueUnit2(), "UNIT2");
    }

    protected void regUnit2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnit2(), "UNIT2"); }
    protected abstract ConditionValue xgetCValueUnit2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2style The value of unit2style as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_Equal(String unit2style) {
        doSetUnit2style_Equal(fRES(unit2style));
    }

    protected void doSetUnit2style_Equal(String unit2style) {
        regUnit2style(CK_EQ, unit2style);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2style The value of unit2style as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_NotEqual(String unit2style) {
        doSetUnit2style_NotEqual(fRES(unit2style));
    }

    protected void doSetUnit2style_NotEqual(String unit2style) {
        regUnit2style(CK_NES, unit2style);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2style The value of unit2style as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_GreaterThan(String unit2style) {
        regUnit2style(CK_GT, fRES(unit2style));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2style The value of unit2style as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_LessThan(String unit2style) {
        regUnit2style(CK_LT, fRES(unit2style));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2style The value of unit2style as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_GreaterEqual(String unit2style) {
        regUnit2style(CK_GE, fRES(unit2style));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2style The value of unit2style as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_LessEqual(String unit2style) {
        regUnit2style(CK_LE, fRES(unit2style));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2styleList The collection of unit2style as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_InScope(Collection<String> unit2styleList) {
        doSetUnit2style_InScope(unit2styleList);
    }

    protected void doSetUnit2style_InScope(Collection<String> unit2styleList) {
        regINS(CK_INS, cTL(unit2styleList), xgetCValueUnit2style(), "UNIT2STYLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2styleList The collection of unit2style as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_NotInScope(Collection<String> unit2styleList) {
        doSetUnit2style_NotInScope(unit2styleList);
    }

    protected void doSetUnit2style_NotInScope(Collection<String> unit2styleList) {
        regINS(CK_NINS, cTL(unit2styleList), xgetCValueUnit2style(), "UNIT2STYLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT2STYLE: {varchar(60)} <br>
     * <pre>e.g. setUnit2style_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unit2style The value of unit2style as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUnit2style_LikeSearch(String unit2style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unit2style), xgetCValueUnit2style(), "UNIT2STYLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2style The value of unit2style as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnit2style_NotLikeSearch(String unit2style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unit2style), xgetCValueUnit2style(), "UNIT2STYLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2style The value of unit2style as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_PrefixSearch(String unit2style) {
        setUnit2style_LikeSearch(unit2style, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     */
    public void setUnit2style_IsNull() { regUnit2style(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     */
    public void setUnit2style_IsNullOrEmpty() { regUnit2style(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     */
    public void setUnit2style_IsNotNull() { regUnit2style(CK_ISNN, DOBJ); }

    protected void regUnit2style(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnit2style(), "UNIT2STYLE"); }
    protected abstract ConditionValue xgetCValueUnit2style();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH2: {NotNull, bigint(19), default=[(0)]}
     * @param length2 The value of length2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength2_Equal(Long length2) {
        doSetLength2_Equal(length2);
    }

    protected void doSetLength2_Equal(Long length2) {
        regLength2(CK_EQ, length2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH2: {NotNull, bigint(19), default=[(0)]}
     * @param length2 The value of length2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength2_NotEqual(Long length2) {
        doSetLength2_NotEqual(length2);
    }

    protected void doSetLength2_NotEqual(Long length2) {
        regLength2(CK_NES, length2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH2: {NotNull, bigint(19), default=[(0)]}
     * @param length2 The value of length2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength2_GreaterThan(Long length2) {
        regLength2(CK_GT, length2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH2: {NotNull, bigint(19), default=[(0)]}
     * @param length2 The value of length2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength2_LessThan(Long length2) {
        regLength2(CK_LT, length2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH2: {NotNull, bigint(19), default=[(0)]}
     * @param length2 The value of length2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength2_GreaterEqual(Long length2) {
        regLength2(CK_GE, length2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH2: {NotNull, bigint(19), default=[(0)]}
     * @param length2 The value of length2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength2_LessEqual(Long length2) {
        regLength2(CK_LE, length2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH2: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of length2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of length2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLength2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLength2(), "LENGTH2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LENGTH2: {NotNull, bigint(19), default=[(0)]}
     * @param length2List The collection of length2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength2_InScope(Collection<Long> length2List) {
        doSetLength2_InScope(length2List);
    }

    protected void doSetLength2_InScope(Collection<Long> length2List) {
        regINS(CK_INS, cTL(length2List), xgetCValueLength2(), "LENGTH2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LENGTH2: {NotNull, bigint(19), default=[(0)]}
     * @param length2List The collection of length2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength2_NotInScope(Collection<Long> length2List) {
        doSetLength2_NotInScope(length2List);
    }

    protected void doSetLength2_NotInScope(Collection<Long> length2List) {
        regINS(CK_NINS, cTL(length2List), xgetCValueLength2(), "LENGTH2");
    }

    protected void regLength2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLength2(), "LENGTH2"); }
    protected abstract ConditionValue xgetCValueLength2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH2: {NotNull, bigint(19), default=[(0)]}
     * @param width2 The value of width2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth2_Equal(Long width2) {
        doSetWidth2_Equal(width2);
    }

    protected void doSetWidth2_Equal(Long width2) {
        regWidth2(CK_EQ, width2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH2: {NotNull, bigint(19), default=[(0)]}
     * @param width2 The value of width2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth2_NotEqual(Long width2) {
        doSetWidth2_NotEqual(width2);
    }

    protected void doSetWidth2_NotEqual(Long width2) {
        regWidth2(CK_NES, width2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH2: {NotNull, bigint(19), default=[(0)]}
     * @param width2 The value of width2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth2_GreaterThan(Long width2) {
        regWidth2(CK_GT, width2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH2: {NotNull, bigint(19), default=[(0)]}
     * @param width2 The value of width2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth2_LessThan(Long width2) {
        regWidth2(CK_LT, width2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH2: {NotNull, bigint(19), default=[(0)]}
     * @param width2 The value of width2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth2_GreaterEqual(Long width2) {
        regWidth2(CK_GE, width2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH2: {NotNull, bigint(19), default=[(0)]}
     * @param width2 The value of width2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth2_LessEqual(Long width2) {
        regWidth2(CK_LE, width2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH2: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of width2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of width2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWidth2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWidth2(), "WIDTH2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WIDTH2: {NotNull, bigint(19), default=[(0)]}
     * @param width2List The collection of width2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth2_InScope(Collection<Long> width2List) {
        doSetWidth2_InScope(width2List);
    }

    protected void doSetWidth2_InScope(Collection<Long> width2List) {
        regINS(CK_INS, cTL(width2List), xgetCValueWidth2(), "WIDTH2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WIDTH2: {NotNull, bigint(19), default=[(0)]}
     * @param width2List The collection of width2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth2_NotInScope(Collection<Long> width2List) {
        doSetWidth2_NotInScope(width2List);
    }

    protected void doSetWidth2_NotInScope(Collection<Long> width2List) {
        regINS(CK_NINS, cTL(width2List), xgetCValueWidth2(), "WIDTH2");
    }

    protected void regWidth2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWidth2(), "WIDTH2"); }
    protected abstract ConditionValue xgetCValueWidth2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param height2 The value of height2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight2_Equal(Long height2) {
        doSetHeight2_Equal(height2);
    }

    protected void doSetHeight2_Equal(Long height2) {
        regHeight2(CK_EQ, height2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param height2 The value of height2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight2_NotEqual(Long height2) {
        doSetHeight2_NotEqual(height2);
    }

    protected void doSetHeight2_NotEqual(Long height2) {
        regHeight2(CK_NES, height2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param height2 The value of height2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight2_GreaterThan(Long height2) {
        regHeight2(CK_GT, height2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param height2 The value of height2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight2_LessThan(Long height2) {
        regHeight2(CK_LT, height2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param height2 The value of height2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight2_GreaterEqual(Long height2) {
        regHeight2(CK_GE, height2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param height2 The value of height2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight2_LessEqual(Long height2) {
        regHeight2(CK_LE, height2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of height2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of height2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHeight2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHeight2(), "HEIGHT2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param height2List The collection of height2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight2_InScope(Collection<Long> height2List) {
        doSetHeight2_InScope(height2List);
    }

    protected void doSetHeight2_InScope(Collection<Long> height2List) {
        regINS(CK_INS, cTL(height2List), xgetCValueHeight2(), "HEIGHT2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param height2List The collection of height2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight2_NotInScope(Collection<Long> height2List) {
        doSetHeight2_NotInScope(height2List);
    }

    protected void doSetHeight2_NotInScope(Collection<Long> height2List) {
        regINS(CK_NINS, cTL(height2List), xgetCValueHeight2(), "HEIGHT2");
    }

    protected void regHeight2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHeight2(), "HEIGHT2"); }
    protected abstract ConditionValue xgetCValueHeight2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight2 The value of grossweight2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight2_Equal(Long grossweight2) {
        doSetGrossweight2_Equal(grossweight2);
    }

    protected void doSetGrossweight2_Equal(Long grossweight2) {
        regGrossweight2(CK_EQ, grossweight2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight2 The value of grossweight2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight2_NotEqual(Long grossweight2) {
        doSetGrossweight2_NotEqual(grossweight2);
    }

    protected void doSetGrossweight2_NotEqual(Long grossweight2) {
        regGrossweight2(CK_NES, grossweight2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight2 The value of grossweight2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight2_GreaterThan(Long grossweight2) {
        regGrossweight2(CK_GT, grossweight2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight2 The value of grossweight2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight2_LessThan(Long grossweight2) {
        regGrossweight2(CK_LT, grossweight2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight2 The value of grossweight2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight2_GreaterEqual(Long grossweight2) {
        regGrossweight2(CK_GE, grossweight2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight2 The value of grossweight2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight2_LessEqual(Long grossweight2) {
        regGrossweight2(CK_LE, grossweight2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of grossweight2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of grossweight2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGrossweight2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGrossweight2(), "GROSSWEIGHT2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight2List The collection of grossweight2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight2_InScope(Collection<Long> grossweight2List) {
        doSetGrossweight2_InScope(grossweight2List);
    }

    protected void doSetGrossweight2_InScope(Collection<Long> grossweight2List) {
        regINS(CK_INS, cTL(grossweight2List), xgetCValueGrossweight2(), "GROSSWEIGHT2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight2List The collection of grossweight2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight2_NotInScope(Collection<Long> grossweight2List) {
        doSetGrossweight2_NotInScope(grossweight2List);
    }

    protected void doSetGrossweight2_NotInScope(Collection<Long> grossweight2List) {
        regINS(CK_NINS, cTL(grossweight2List), xgetCValueGrossweight2(), "GROSSWEIGHT2");
    }

    protected void regGrossweight2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGrossweight2(), "GROSSWEIGHT2"); }
    protected abstract ConditionValue xgetCValueGrossweight2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param netweight2 The value of netweight2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight2_Equal(Long netweight2) {
        doSetNetweight2_Equal(netweight2);
    }

    protected void doSetNetweight2_Equal(Long netweight2) {
        regNetweight2(CK_EQ, netweight2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param netweight2 The value of netweight2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight2_NotEqual(Long netweight2) {
        doSetNetweight2_NotEqual(netweight2);
    }

    protected void doSetNetweight2_NotEqual(Long netweight2) {
        regNetweight2(CK_NES, netweight2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param netweight2 The value of netweight2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight2_GreaterThan(Long netweight2) {
        regNetweight2(CK_GT, netweight2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param netweight2 The value of netweight2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight2_LessThan(Long netweight2) {
        regNetweight2(CK_LT, netweight2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param netweight2 The value of netweight2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight2_GreaterEqual(Long netweight2) {
        regNetweight2(CK_GE, netweight2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param netweight2 The value of netweight2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight2_LessEqual(Long netweight2) {
        regNetweight2(CK_LE, netweight2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of netweight2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of netweight2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNetweight2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNetweight2(), "NETWEIGHT2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NETWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param netweight2List The collection of netweight2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight2_InScope(Collection<Long> netweight2List) {
        doSetNetweight2_InScope(netweight2List);
    }

    protected void doSetNetweight2_InScope(Collection<Long> netweight2List) {
        regINS(CK_INS, cTL(netweight2List), xgetCValueNetweight2(), "NETWEIGHT2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NETWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @param netweight2List The collection of netweight2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight2_NotInScope(Collection<Long> netweight2List) {
        doSetNetweight2_NotInScope(netweight2List);
    }

    protected void doSetNetweight2_NotInScope(Collection<Long> netweight2List) {
        regINS(CK_NINS, cTL(netweight2List), xgetCValueNetweight2(), "NETWEIGHT2");
    }

    protected void regNetweight2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNetweight2(), "NETWEIGHT2"); }
    protected abstract ConditionValue xgetCValueNetweight2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE2: {NotNull, bigint(19), default=[(0)]}
     * @param cube2 The value of cube2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube2_Equal(Long cube2) {
        doSetCube2_Equal(cube2);
    }

    protected void doSetCube2_Equal(Long cube2) {
        regCube2(CK_EQ, cube2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE2: {NotNull, bigint(19), default=[(0)]}
     * @param cube2 The value of cube2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube2_NotEqual(Long cube2) {
        doSetCube2_NotEqual(cube2);
    }

    protected void doSetCube2_NotEqual(Long cube2) {
        regCube2(CK_NES, cube2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE2: {NotNull, bigint(19), default=[(0)]}
     * @param cube2 The value of cube2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube2_GreaterThan(Long cube2) {
        regCube2(CK_GT, cube2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE2: {NotNull, bigint(19), default=[(0)]}
     * @param cube2 The value of cube2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube2_LessThan(Long cube2) {
        regCube2(CK_LT, cube2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE2: {NotNull, bigint(19), default=[(0)]}
     * @param cube2 The value of cube2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube2_GreaterEqual(Long cube2) {
        regCube2(CK_GE, cube2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE2: {NotNull, bigint(19), default=[(0)]}
     * @param cube2 The value of cube2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube2_LessEqual(Long cube2) {
        regCube2(CK_LE, cube2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE2: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of cube2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cube2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCube2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCube2(), "CUBE2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUBE2: {NotNull, bigint(19), default=[(0)]}
     * @param cube2List The collection of cube2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube2_InScope(Collection<Long> cube2List) {
        doSetCube2_InScope(cube2List);
    }

    protected void doSetCube2_InScope(Collection<Long> cube2List) {
        regINS(CK_INS, cTL(cube2List), xgetCValueCube2(), "CUBE2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUBE2: {NotNull, bigint(19), default=[(0)]}
     * @param cube2List The collection of cube2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube2_NotInScope(Collection<Long> cube2List) {
        doSetCube2_NotInScope(cube2List);
    }

    protected void doSetCube2_NotInScope(Collection<Long> cube2List) {
        regINS(CK_NINS, cTL(cube2List), xgetCValueCube2(), "CUBE2");
    }

    protected void regCube2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCube2(), "CUBE2"); }
    protected abstract ConditionValue xgetCValueCube2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER2: {NotNull, bigint(19), default=[(0)]}
     * @param liter2 The value of liter2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter2_Equal(Long liter2) {
        doSetLiter2_Equal(liter2);
    }

    protected void doSetLiter2_Equal(Long liter2) {
        regLiter2(CK_EQ, liter2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER2: {NotNull, bigint(19), default=[(0)]}
     * @param liter2 The value of liter2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter2_NotEqual(Long liter2) {
        doSetLiter2_NotEqual(liter2);
    }

    protected void doSetLiter2_NotEqual(Long liter2) {
        regLiter2(CK_NES, liter2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER2: {NotNull, bigint(19), default=[(0)]}
     * @param liter2 The value of liter2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter2_GreaterThan(Long liter2) {
        regLiter2(CK_GT, liter2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER2: {NotNull, bigint(19), default=[(0)]}
     * @param liter2 The value of liter2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter2_LessThan(Long liter2) {
        regLiter2(CK_LT, liter2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER2: {NotNull, bigint(19), default=[(0)]}
     * @param liter2 The value of liter2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter2_GreaterEqual(Long liter2) {
        regLiter2(CK_GE, liter2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER2: {NotNull, bigint(19), default=[(0)]}
     * @param liter2 The value of liter2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter2_LessEqual(Long liter2) {
        regLiter2(CK_LE, liter2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LITER2: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of liter2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of liter2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLiter2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLiter2(), "LITER2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LITER2: {NotNull, bigint(19), default=[(0)]}
     * @param liter2List The collection of liter2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter2_InScope(Collection<Long> liter2List) {
        doSetLiter2_InScope(liter2List);
    }

    protected void doSetLiter2_InScope(Collection<Long> liter2List) {
        regINS(CK_INS, cTL(liter2List), xgetCValueLiter2(), "LITER2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LITER2: {NotNull, bigint(19), default=[(0)]}
     * @param liter2List The collection of liter2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter2_NotInScope(Collection<Long> liter2List) {
        doSetLiter2_NotInScope(liter2List);
    }

    protected void doSetLiter2_NotInScope(Collection<Long> liter2List) {
        regINS(CK_NINS, cTL(liter2List), xgetCValueLiter2(), "LITER2");
    }

    protected void regLiter2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLiter2(), "LITER2"); }
    protected abstract ConditionValue xgetCValueLiter2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit3 The value of unit3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit3_Equal(java.math.BigDecimal unit3) {
        doSetUnit3_Equal(unit3);
    }

    protected void doSetUnit3_Equal(java.math.BigDecimal unit3) {
        regUnit3(CK_EQ, unit3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit3 The value of unit3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit3_NotEqual(java.math.BigDecimal unit3) {
        doSetUnit3_NotEqual(unit3);
    }

    protected void doSetUnit3_NotEqual(java.math.BigDecimal unit3) {
        regUnit3(CK_NES, unit3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit3 The value of unit3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit3_GreaterThan(java.math.BigDecimal unit3) {
        regUnit3(CK_GT, unit3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit3 The value of unit3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit3_LessThan(java.math.BigDecimal unit3) {
        regUnit3(CK_LT, unit3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit3 The value of unit3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit3_GreaterEqual(java.math.BigDecimal unit3) {
        regUnit3(CK_GE, unit3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit3 The value of unit3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit3_LessEqual(java.math.BigDecimal unit3) {
        regUnit3(CK_LE, unit3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of unit3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unit3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnit3_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnit3(), "UNIT3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit3List The collection of unit3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3_InScope(Collection<java.math.BigDecimal> unit3List) {
        doSetUnit3_InScope(unit3List);
    }

    protected void doSetUnit3_InScope(Collection<java.math.BigDecimal> unit3List) {
        regINS(CK_INS, cTL(unit3List), xgetCValueUnit3(), "UNIT3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT3: {NotNull, decimal(16, 6), default=[(0)]}
     * @param unit3List The collection of unit3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3_NotInScope(Collection<java.math.BigDecimal> unit3List) {
        doSetUnit3_NotInScope(unit3List);
    }

    protected void doSetUnit3_NotInScope(Collection<java.math.BigDecimal> unit3List) {
        regINS(CK_NINS, cTL(unit3List), xgetCValueUnit3(), "UNIT3");
    }

    protected void regUnit3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnit3(), "UNIT3"); }
    protected abstract ConditionValue xgetCValueUnit3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3style The value of unit3style as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_Equal(String unit3style) {
        doSetUnit3style_Equal(fRES(unit3style));
    }

    protected void doSetUnit3style_Equal(String unit3style) {
        regUnit3style(CK_EQ, unit3style);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3style The value of unit3style as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_NotEqual(String unit3style) {
        doSetUnit3style_NotEqual(fRES(unit3style));
    }

    protected void doSetUnit3style_NotEqual(String unit3style) {
        regUnit3style(CK_NES, unit3style);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3style The value of unit3style as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_GreaterThan(String unit3style) {
        regUnit3style(CK_GT, fRES(unit3style));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3style The value of unit3style as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_LessThan(String unit3style) {
        regUnit3style(CK_LT, fRES(unit3style));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3style The value of unit3style as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_GreaterEqual(String unit3style) {
        regUnit3style(CK_GE, fRES(unit3style));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3style The value of unit3style as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_LessEqual(String unit3style) {
        regUnit3style(CK_LE, fRES(unit3style));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3styleList The collection of unit3style as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_InScope(Collection<String> unit3styleList) {
        doSetUnit3style_InScope(unit3styleList);
    }

    protected void doSetUnit3style_InScope(Collection<String> unit3styleList) {
        regINS(CK_INS, cTL(unit3styleList), xgetCValueUnit3style(), "UNIT3STYLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3styleList The collection of unit3style as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_NotInScope(Collection<String> unit3styleList) {
        doSetUnit3style_NotInScope(unit3styleList);
    }

    protected void doSetUnit3style_NotInScope(Collection<String> unit3styleList) {
        regINS(CK_NINS, cTL(unit3styleList), xgetCValueUnit3style(), "UNIT3STYLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT3STYLE: {varchar(60)} <br>
     * <pre>e.g. setUnit3style_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unit3style The value of unit3style as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUnit3style_LikeSearch(String unit3style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unit3style), xgetCValueUnit3style(), "UNIT3STYLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3style The value of unit3style as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnit3style_NotLikeSearch(String unit3style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unit3style), xgetCValueUnit3style(), "UNIT3STYLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3style The value of unit3style as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_PrefixSearch(String unit3style) {
        setUnit3style_LikeSearch(unit3style, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     */
    public void setUnit3style_IsNull() { regUnit3style(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     */
    public void setUnit3style_IsNullOrEmpty() { regUnit3style(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     */
    public void setUnit3style_IsNotNull() { regUnit3style(CK_ISNN, DOBJ); }

    protected void regUnit3style(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnit3style(), "UNIT3STYLE"); }
    protected abstract ConditionValue xgetCValueUnit3style();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH3: {NotNull, bigint(19), default=[(0)]}
     * @param length3 The value of length3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength3_Equal(Long length3) {
        doSetLength3_Equal(length3);
    }

    protected void doSetLength3_Equal(Long length3) {
        regLength3(CK_EQ, length3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH3: {NotNull, bigint(19), default=[(0)]}
     * @param length3 The value of length3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength3_NotEqual(Long length3) {
        doSetLength3_NotEqual(length3);
    }

    protected void doSetLength3_NotEqual(Long length3) {
        regLength3(CK_NES, length3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH3: {NotNull, bigint(19), default=[(0)]}
     * @param length3 The value of length3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength3_GreaterThan(Long length3) {
        regLength3(CK_GT, length3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH3: {NotNull, bigint(19), default=[(0)]}
     * @param length3 The value of length3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength3_LessThan(Long length3) {
        regLength3(CK_LT, length3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH3: {NotNull, bigint(19), default=[(0)]}
     * @param length3 The value of length3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength3_GreaterEqual(Long length3) {
        regLength3(CK_GE, length3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH3: {NotNull, bigint(19), default=[(0)]}
     * @param length3 The value of length3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength3_LessEqual(Long length3) {
        regLength3(CK_LE, length3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH3: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of length3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of length3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLength3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLength3(), "LENGTH3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LENGTH3: {NotNull, bigint(19), default=[(0)]}
     * @param length3List The collection of length3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength3_InScope(Collection<Long> length3List) {
        doSetLength3_InScope(length3List);
    }

    protected void doSetLength3_InScope(Collection<Long> length3List) {
        regINS(CK_INS, cTL(length3List), xgetCValueLength3(), "LENGTH3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LENGTH3: {NotNull, bigint(19), default=[(0)]}
     * @param length3List The collection of length3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength3_NotInScope(Collection<Long> length3List) {
        doSetLength3_NotInScope(length3List);
    }

    protected void doSetLength3_NotInScope(Collection<Long> length3List) {
        regINS(CK_NINS, cTL(length3List), xgetCValueLength3(), "LENGTH3");
    }

    protected void regLength3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLength3(), "LENGTH3"); }
    protected abstract ConditionValue xgetCValueLength3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH3: {NotNull, bigint(19), default=[(0)]}
     * @param width3 The value of width3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth3_Equal(Long width3) {
        doSetWidth3_Equal(width3);
    }

    protected void doSetWidth3_Equal(Long width3) {
        regWidth3(CK_EQ, width3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH3: {NotNull, bigint(19), default=[(0)]}
     * @param width3 The value of width3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth3_NotEqual(Long width3) {
        doSetWidth3_NotEqual(width3);
    }

    protected void doSetWidth3_NotEqual(Long width3) {
        regWidth3(CK_NES, width3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH3: {NotNull, bigint(19), default=[(0)]}
     * @param width3 The value of width3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth3_GreaterThan(Long width3) {
        regWidth3(CK_GT, width3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH3: {NotNull, bigint(19), default=[(0)]}
     * @param width3 The value of width3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth3_LessThan(Long width3) {
        regWidth3(CK_LT, width3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH3: {NotNull, bigint(19), default=[(0)]}
     * @param width3 The value of width3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth3_GreaterEqual(Long width3) {
        regWidth3(CK_GE, width3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH3: {NotNull, bigint(19), default=[(0)]}
     * @param width3 The value of width3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth3_LessEqual(Long width3) {
        regWidth3(CK_LE, width3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH3: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of width3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of width3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWidth3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWidth3(), "WIDTH3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WIDTH3: {NotNull, bigint(19), default=[(0)]}
     * @param width3List The collection of width3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth3_InScope(Collection<Long> width3List) {
        doSetWidth3_InScope(width3List);
    }

    protected void doSetWidth3_InScope(Collection<Long> width3List) {
        regINS(CK_INS, cTL(width3List), xgetCValueWidth3(), "WIDTH3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WIDTH3: {NotNull, bigint(19), default=[(0)]}
     * @param width3List The collection of width3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth3_NotInScope(Collection<Long> width3List) {
        doSetWidth3_NotInScope(width3List);
    }

    protected void doSetWidth3_NotInScope(Collection<Long> width3List) {
        regINS(CK_NINS, cTL(width3List), xgetCValueWidth3(), "WIDTH3");
    }

    protected void regWidth3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWidth3(), "WIDTH3"); }
    protected abstract ConditionValue xgetCValueWidth3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param height3 The value of height3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight3_Equal(Long height3) {
        doSetHeight3_Equal(height3);
    }

    protected void doSetHeight3_Equal(Long height3) {
        regHeight3(CK_EQ, height3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param height3 The value of height3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight3_NotEqual(Long height3) {
        doSetHeight3_NotEqual(height3);
    }

    protected void doSetHeight3_NotEqual(Long height3) {
        regHeight3(CK_NES, height3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param height3 The value of height3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight3_GreaterThan(Long height3) {
        regHeight3(CK_GT, height3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param height3 The value of height3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight3_LessThan(Long height3) {
        regHeight3(CK_LT, height3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param height3 The value of height3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight3_GreaterEqual(Long height3) {
        regHeight3(CK_GE, height3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param height3 The value of height3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight3_LessEqual(Long height3) {
        regHeight3(CK_LE, height3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of height3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of height3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHeight3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHeight3(), "HEIGHT3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param height3List The collection of height3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight3_InScope(Collection<Long> height3List) {
        doSetHeight3_InScope(height3List);
    }

    protected void doSetHeight3_InScope(Collection<Long> height3List) {
        regINS(CK_INS, cTL(height3List), xgetCValueHeight3(), "HEIGHT3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param height3List The collection of height3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight3_NotInScope(Collection<Long> height3List) {
        doSetHeight3_NotInScope(height3List);
    }

    protected void doSetHeight3_NotInScope(Collection<Long> height3List) {
        regINS(CK_NINS, cTL(height3List), xgetCValueHeight3(), "HEIGHT3");
    }

    protected void regHeight3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHeight3(), "HEIGHT3"); }
    protected abstract ConditionValue xgetCValueHeight3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight3 The value of grossweight3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight3_Equal(Long grossweight3) {
        doSetGrossweight3_Equal(grossweight3);
    }

    protected void doSetGrossweight3_Equal(Long grossweight3) {
        regGrossweight3(CK_EQ, grossweight3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight3 The value of grossweight3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight3_NotEqual(Long grossweight3) {
        doSetGrossweight3_NotEqual(grossweight3);
    }

    protected void doSetGrossweight3_NotEqual(Long grossweight3) {
        regGrossweight3(CK_NES, grossweight3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight3 The value of grossweight3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight3_GreaterThan(Long grossweight3) {
        regGrossweight3(CK_GT, grossweight3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight3 The value of grossweight3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight3_LessThan(Long grossweight3) {
        regGrossweight3(CK_LT, grossweight3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight3 The value of grossweight3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight3_GreaterEqual(Long grossweight3) {
        regGrossweight3(CK_GE, grossweight3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight3 The value of grossweight3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossweight3_LessEqual(Long grossweight3) {
        regGrossweight3(CK_LE, grossweight3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of grossweight3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of grossweight3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGrossweight3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGrossweight3(), "GROSSWEIGHT3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight3List The collection of grossweight3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight3_InScope(Collection<Long> grossweight3List) {
        doSetGrossweight3_InScope(grossweight3List);
    }

    protected void doSetGrossweight3_InScope(Collection<Long> grossweight3List) {
        regINS(CK_INS, cTL(grossweight3List), xgetCValueGrossweight3(), "GROSSWEIGHT3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param grossweight3List The collection of grossweight3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight3_NotInScope(Collection<Long> grossweight3List) {
        doSetGrossweight3_NotInScope(grossweight3List);
    }

    protected void doSetGrossweight3_NotInScope(Collection<Long> grossweight3List) {
        regINS(CK_NINS, cTL(grossweight3List), xgetCValueGrossweight3(), "GROSSWEIGHT3");
    }

    protected void regGrossweight3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGrossweight3(), "GROSSWEIGHT3"); }
    protected abstract ConditionValue xgetCValueGrossweight3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param netweight3 The value of netweight3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight3_Equal(Long netweight3) {
        doSetNetweight3_Equal(netweight3);
    }

    protected void doSetNetweight3_Equal(Long netweight3) {
        regNetweight3(CK_EQ, netweight3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param netweight3 The value of netweight3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight3_NotEqual(Long netweight3) {
        doSetNetweight3_NotEqual(netweight3);
    }

    protected void doSetNetweight3_NotEqual(Long netweight3) {
        regNetweight3(CK_NES, netweight3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param netweight3 The value of netweight3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight3_GreaterThan(Long netweight3) {
        regNetweight3(CK_GT, netweight3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param netweight3 The value of netweight3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight3_LessThan(Long netweight3) {
        regNetweight3(CK_LT, netweight3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param netweight3 The value of netweight3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight3_GreaterEqual(Long netweight3) {
        regNetweight3(CK_GE, netweight3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param netweight3 The value of netweight3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetweight3_LessEqual(Long netweight3) {
        regNetweight3(CK_LE, netweight3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of netweight3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of netweight3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNetweight3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNetweight3(), "NETWEIGHT3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NETWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param netweight3List The collection of netweight3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight3_InScope(Collection<Long> netweight3List) {
        doSetNetweight3_InScope(netweight3List);
    }

    protected void doSetNetweight3_InScope(Collection<Long> netweight3List) {
        regINS(CK_INS, cTL(netweight3List), xgetCValueNetweight3(), "NETWEIGHT3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NETWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @param netweight3List The collection of netweight3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight3_NotInScope(Collection<Long> netweight3List) {
        doSetNetweight3_NotInScope(netweight3List);
    }

    protected void doSetNetweight3_NotInScope(Collection<Long> netweight3List) {
        regINS(CK_NINS, cTL(netweight3List), xgetCValueNetweight3(), "NETWEIGHT3");
    }

    protected void regNetweight3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNetweight3(), "NETWEIGHT3"); }
    protected abstract ConditionValue xgetCValueNetweight3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE3: {NotNull, bigint(19), default=[(0)]}
     * @param cube3 The value of cube3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube3_Equal(Long cube3) {
        doSetCube3_Equal(cube3);
    }

    protected void doSetCube3_Equal(Long cube3) {
        regCube3(CK_EQ, cube3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE3: {NotNull, bigint(19), default=[(0)]}
     * @param cube3 The value of cube3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube3_NotEqual(Long cube3) {
        doSetCube3_NotEqual(cube3);
    }

    protected void doSetCube3_NotEqual(Long cube3) {
        regCube3(CK_NES, cube3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE3: {NotNull, bigint(19), default=[(0)]}
     * @param cube3 The value of cube3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube3_GreaterThan(Long cube3) {
        regCube3(CK_GT, cube3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE3: {NotNull, bigint(19), default=[(0)]}
     * @param cube3 The value of cube3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube3_LessThan(Long cube3) {
        regCube3(CK_LT, cube3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE3: {NotNull, bigint(19), default=[(0)]}
     * @param cube3 The value of cube3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube3_GreaterEqual(Long cube3) {
        regCube3(CK_GE, cube3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE3: {NotNull, bigint(19), default=[(0)]}
     * @param cube3 The value of cube3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCube3_LessEqual(Long cube3) {
        regCube3(CK_LE, cube3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CUBE3: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of cube3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cube3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCube3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCube3(), "CUBE3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUBE3: {NotNull, bigint(19), default=[(0)]}
     * @param cube3List The collection of cube3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube3_InScope(Collection<Long> cube3List) {
        doSetCube3_InScope(cube3List);
    }

    protected void doSetCube3_InScope(Collection<Long> cube3List) {
        regINS(CK_INS, cTL(cube3List), xgetCValueCube3(), "CUBE3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUBE3: {NotNull, bigint(19), default=[(0)]}
     * @param cube3List The collection of cube3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube3_NotInScope(Collection<Long> cube3List) {
        doSetCube3_NotInScope(cube3List);
    }

    protected void doSetCube3_NotInScope(Collection<Long> cube3List) {
        regINS(CK_NINS, cTL(cube3List), xgetCValueCube3(), "CUBE3");
    }

    protected void regCube3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCube3(), "CUBE3"); }
    protected abstract ConditionValue xgetCValueCube3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER3: {NotNull, bigint(19), default=[(0)]}
     * @param liter3 The value of liter3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter3_Equal(Long liter3) {
        doSetLiter3_Equal(liter3);
    }

    protected void doSetLiter3_Equal(Long liter3) {
        regLiter3(CK_EQ, liter3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER3: {NotNull, bigint(19), default=[(0)]}
     * @param liter3 The value of liter3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter3_NotEqual(Long liter3) {
        doSetLiter3_NotEqual(liter3);
    }

    protected void doSetLiter3_NotEqual(Long liter3) {
        regLiter3(CK_NES, liter3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER3: {NotNull, bigint(19), default=[(0)]}
     * @param liter3 The value of liter3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter3_GreaterThan(Long liter3) {
        regLiter3(CK_GT, liter3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER3: {NotNull, bigint(19), default=[(0)]}
     * @param liter3 The value of liter3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter3_LessThan(Long liter3) {
        regLiter3(CK_LT, liter3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER3: {NotNull, bigint(19), default=[(0)]}
     * @param liter3 The value of liter3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter3_GreaterEqual(Long liter3) {
        regLiter3(CK_GE, liter3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LITER3: {NotNull, bigint(19), default=[(0)]}
     * @param liter3 The value of liter3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLiter3_LessEqual(Long liter3) {
        regLiter3(CK_LE, liter3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LITER3: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of liter3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of liter3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLiter3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLiter3(), "LITER3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LITER3: {NotNull, bigint(19), default=[(0)]}
     * @param liter3List The collection of liter3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter3_InScope(Collection<Long> liter3List) {
        doSetLiter3_InScope(liter3List);
    }

    protected void doSetLiter3_InScope(Collection<Long> liter3List) {
        regINS(CK_INS, cTL(liter3List), xgetCValueLiter3(), "LITER3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LITER3: {NotNull, bigint(19), default=[(0)]}
     * @param liter3List The collection of liter3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter3_NotInScope(Collection<Long> liter3List) {
        doSetLiter3_NotInScope(liter3List);
    }

    protected void doSetLiter3_NotInScope(Collection<Long> liter3List) {
        regINS(CK_NINS, cTL(liter3List), xgetCValueLiter3(), "LITER3");
    }

    protected void regLiter3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLiter3(), "LITER3"); }
    protected abstract ConditionValue xgetCValueLiter3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {decimal(16, 6), default=[(0)]}
     * @param pQty The value of pQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPQty_Equal(java.math.BigDecimal pQty) {
        doSetPQty_Equal(pQty);
    }

    protected void doSetPQty_Equal(java.math.BigDecimal pQty) {
        regPQty(CK_EQ, pQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {decimal(16, 6), default=[(0)]}
     * @param pQty The value of pQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPQty_NotEqual(java.math.BigDecimal pQty) {
        doSetPQty_NotEqual(pQty);
    }

    protected void doSetPQty_NotEqual(java.math.BigDecimal pQty) {
        regPQty(CK_NES, pQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {decimal(16, 6), default=[(0)]}
     * @param pQty The value of pQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPQty_GreaterThan(java.math.BigDecimal pQty) {
        regPQty(CK_GT, pQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {decimal(16, 6), default=[(0)]}
     * @param pQty The value of pQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPQty_LessThan(java.math.BigDecimal pQty) {
        regPQty(CK_LT, pQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {decimal(16, 6), default=[(0)]}
     * @param pQty The value of pQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPQty_GreaterEqual(java.math.BigDecimal pQty) {
        regPQty(CK_GE, pQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {decimal(16, 6), default=[(0)]}
     * @param pQty The value of pQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPQty_LessEqual(java.math.BigDecimal pQty) {
        regPQty(CK_LE, pQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of pQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPQty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePQty(), "P_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_QTY: {decimal(16, 6), default=[(0)]}
     * @param pQtyList The collection of pQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPQty_InScope(Collection<java.math.BigDecimal> pQtyList) {
        doSetPQty_InScope(pQtyList);
    }

    protected void doSetPQty_InScope(Collection<java.math.BigDecimal> pQtyList) {
        regINS(CK_INS, cTL(pQtyList), xgetCValuePQty(), "P_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_QTY: {decimal(16, 6), default=[(0)]}
     * @param pQtyList The collection of pQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPQty_NotInScope(Collection<java.math.BigDecimal> pQtyList) {
        doSetPQty_NotInScope(pQtyList);
    }

    protected void doSetPQty_NotInScope(Collection<java.math.BigDecimal> pQtyList) {
        regINS(CK_NINS, cTL(pQtyList), xgetCValuePQty(), "P_QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * P_QTY: {decimal(16, 6), default=[(0)]}
     */
    public void setPQty_IsNull() { regPQty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * P_QTY: {decimal(16, 6), default=[(0)]}
     */
    public void setPQty_IsNotNull() { regPQty(CK_ISNN, DOBJ); }

    protected void regPQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePQty(), "P_QTY"); }
    protected abstract ConditionValue xgetCValuePQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_HEIGHT: {decimal(16, 6), default=[(0)]}
     * @param pHeight The value of pHeight as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPHeight_Equal(java.math.BigDecimal pHeight) {
        doSetPHeight_Equal(pHeight);
    }

    protected void doSetPHeight_Equal(java.math.BigDecimal pHeight) {
        regPHeight(CK_EQ, pHeight);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_HEIGHT: {decimal(16, 6), default=[(0)]}
     * @param pHeight The value of pHeight as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPHeight_NotEqual(java.math.BigDecimal pHeight) {
        doSetPHeight_NotEqual(pHeight);
    }

    protected void doSetPHeight_NotEqual(java.math.BigDecimal pHeight) {
        regPHeight(CK_NES, pHeight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_HEIGHT: {decimal(16, 6), default=[(0)]}
     * @param pHeight The value of pHeight as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPHeight_GreaterThan(java.math.BigDecimal pHeight) {
        regPHeight(CK_GT, pHeight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_HEIGHT: {decimal(16, 6), default=[(0)]}
     * @param pHeight The value of pHeight as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPHeight_LessThan(java.math.BigDecimal pHeight) {
        regPHeight(CK_LT, pHeight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_HEIGHT: {decimal(16, 6), default=[(0)]}
     * @param pHeight The value of pHeight as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPHeight_GreaterEqual(java.math.BigDecimal pHeight) {
        regPHeight(CK_GE, pHeight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_HEIGHT: {decimal(16, 6), default=[(0)]}
     * @param pHeight The value of pHeight as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPHeight_LessEqual(java.math.BigDecimal pHeight) {
        regPHeight(CK_LE, pHeight);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_HEIGHT: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of pHeight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pHeight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPHeight_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePHeight(), "P_HEIGHT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_HEIGHT: {decimal(16, 6), default=[(0)]}
     * @param pHeightList The collection of pHeight as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPHeight_InScope(Collection<java.math.BigDecimal> pHeightList) {
        doSetPHeight_InScope(pHeightList);
    }

    protected void doSetPHeight_InScope(Collection<java.math.BigDecimal> pHeightList) {
        regINS(CK_INS, cTL(pHeightList), xgetCValuePHeight(), "P_HEIGHT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_HEIGHT: {decimal(16, 6), default=[(0)]}
     * @param pHeightList The collection of pHeight as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPHeight_NotInScope(Collection<java.math.BigDecimal> pHeightList) {
        doSetPHeight_NotInScope(pHeightList);
    }

    protected void doSetPHeight_NotInScope(Collection<java.math.BigDecimal> pHeightList) {
        regINS(CK_NINS, cTL(pHeightList), xgetCValuePHeight(), "P_HEIGHT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * P_HEIGHT: {decimal(16, 6), default=[(0)]}
     */
    public void setPHeight_IsNull() { regPHeight(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * P_HEIGHT: {decimal(16, 6), default=[(0)]}
     */
    public void setPHeight_IsNotNull() { regPHeight(CK_ISNN, DOBJ); }

    protected void regPHeight(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePHeight(), "P_HEIGHT"); }
    protected abstract ConditionValue xgetCValuePHeight();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6), default=[(0)]}
     * @param pOdd The value of pOdd as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPOdd_Equal(java.math.BigDecimal pOdd) {
        doSetPOdd_Equal(pOdd);
    }

    protected void doSetPOdd_Equal(java.math.BigDecimal pOdd) {
        regPOdd(CK_EQ, pOdd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6), default=[(0)]}
     * @param pOdd The value of pOdd as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPOdd_NotEqual(java.math.BigDecimal pOdd) {
        doSetPOdd_NotEqual(pOdd);
    }

    protected void doSetPOdd_NotEqual(java.math.BigDecimal pOdd) {
        regPOdd(CK_NES, pOdd);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6), default=[(0)]}
     * @param pOdd The value of pOdd as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPOdd_GreaterThan(java.math.BigDecimal pOdd) {
        regPOdd(CK_GT, pOdd);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6), default=[(0)]}
     * @param pOdd The value of pOdd as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPOdd_LessThan(java.math.BigDecimal pOdd) {
        regPOdd(CK_LT, pOdd);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6), default=[(0)]}
     * @param pOdd The value of pOdd as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPOdd_GreaterEqual(java.math.BigDecimal pOdd) {
        regPOdd(CK_GE, pOdd);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6), default=[(0)]}
     * @param pOdd The value of pOdd as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPOdd_LessEqual(java.math.BigDecimal pOdd) {
        regPOdd(CK_LE, pOdd);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of pOdd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pOdd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPOdd_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePOdd(), "P_ODD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_ODD: {decimal(16, 6), default=[(0)]}
     * @param pOddList The collection of pOdd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPOdd_InScope(Collection<java.math.BigDecimal> pOddList) {
        doSetPOdd_InScope(pOddList);
    }

    protected void doSetPOdd_InScope(Collection<java.math.BigDecimal> pOddList) {
        regINS(CK_INS, cTL(pOddList), xgetCValuePOdd(), "P_ODD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_ODD: {decimal(16, 6), default=[(0)]}
     * @param pOddList The collection of pOdd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPOdd_NotInScope(Collection<java.math.BigDecimal> pOddList) {
        doSetPOdd_NotInScope(pOddList);
    }

    protected void doSetPOdd_NotInScope(Collection<java.math.BigDecimal> pOddList) {
        regINS(CK_NINS, cTL(pOddList), xgetCValuePOdd(), "P_ODD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6), default=[(0)]}
     */
    public void setPOdd_IsNull() { regPOdd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6), default=[(0)]}
     */
    public void setPOdd_IsNotNull() { regPOdd(CK_ISNN, DOBJ); }

    protected void regPOdd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePOdd(), "P_ODD"); }
    protected abstract ConditionValue xgetCValuePOdd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_DESCRIPTION: {varchar(4000)}
     * @param pDescription The value of pDescription as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPDescription_Equal(String pDescription) {
        doSetPDescription_Equal(fRES(pDescription));
    }

    protected void doSetPDescription_Equal(String pDescription) {
        regPDescription(CK_EQ, pDescription);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_DESCRIPTION: {varchar(4000)}
     * @param pDescription The value of pDescription as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPDescription_NotEqual(String pDescription) {
        doSetPDescription_NotEqual(fRES(pDescription));
    }

    protected void doSetPDescription_NotEqual(String pDescription) {
        regPDescription(CK_NES, pDescription);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_DESCRIPTION: {varchar(4000)}
     * @param pDescription The value of pDescription as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPDescription_GreaterThan(String pDescription) {
        regPDescription(CK_GT, fRES(pDescription));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_DESCRIPTION: {varchar(4000)}
     * @param pDescription The value of pDescription as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPDescription_LessThan(String pDescription) {
        regPDescription(CK_LT, fRES(pDescription));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_DESCRIPTION: {varchar(4000)}
     * @param pDescription The value of pDescription as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPDescription_GreaterEqual(String pDescription) {
        regPDescription(CK_GE, fRES(pDescription));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_DESCRIPTION: {varchar(4000)}
     * @param pDescription The value of pDescription as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPDescription_LessEqual(String pDescription) {
        regPDescription(CK_LE, fRES(pDescription));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * P_DESCRIPTION: {varchar(4000)}
     * @param pDescriptionList The collection of pDescription as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPDescription_InScope(Collection<String> pDescriptionList) {
        doSetPDescription_InScope(pDescriptionList);
    }

    protected void doSetPDescription_InScope(Collection<String> pDescriptionList) {
        regINS(CK_INS, cTL(pDescriptionList), xgetCValuePDescription(), "P_DESCRIPTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * P_DESCRIPTION: {varchar(4000)}
     * @param pDescriptionList The collection of pDescription as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPDescription_NotInScope(Collection<String> pDescriptionList) {
        doSetPDescription_NotInScope(pDescriptionList);
    }

    protected void doSetPDescription_NotInScope(Collection<String> pDescriptionList) {
        regINS(CK_NINS, cTL(pDescriptionList), xgetCValuePDescription(), "P_DESCRIPTION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * P_DESCRIPTION: {varchar(4000)} <br>
     * <pre>e.g. setPDescription_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pDescription The value of pDescription as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPDescription_LikeSearch(String pDescription, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pDescription), xgetCValuePDescription(), "P_DESCRIPTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * P_DESCRIPTION: {varchar(4000)}
     * @param pDescription The value of pDescription as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPDescription_NotLikeSearch(String pDescription, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pDescription), xgetCValuePDescription(), "P_DESCRIPTION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * P_DESCRIPTION: {varchar(4000)}
     * @param pDescription The value of pDescription as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPDescription_PrefixSearch(String pDescription) {
        setPDescription_LikeSearch(pDescription, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * P_DESCRIPTION: {varchar(4000)}
     */
    public void setPDescription_IsNull() { regPDescription(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * P_DESCRIPTION: {varchar(4000)}
     */
    public void setPDescription_IsNullOrEmpty() { regPDescription(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * P_DESCRIPTION: {varchar(4000)}
     */
    public void setPDescription_IsNotNull() { regPDescription(CK_ISNN, DOBJ); }

    protected void regPDescription(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePDescription(), "P_DESCRIPTION"); }
    protected abstract ConditionValue xgetCValuePDescription();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_Equal(String notes) {
        doSetNotes_Equal(fRES(notes));
    }

    protected void doSetNotes_Equal(String notes) {
        regNotes(CK_EQ, notes);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotEqual(String notes) {
        doSetNotes_NotEqual(fRES(notes));
    }

    protected void doSetNotes_NotEqual(String notes) {
        regNotes(CK_NES, notes);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notesList The collection of notes as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_InScope(Collection<String> notesList) {
        doSetNotes_InScope(notesList);
    }

    protected void doSetNotes_InScope(Collection<String> notesList) {
        regINS(CK_INS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notesList The collection of notes as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotInScope(Collection<String> notesList) {
        doSetNotes_NotInScope(notesList);
    }

    protected void doSetNotes_NotInScope(Collection<String> notesList) {
        regINS(CK_NINS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)} <br>
     * <pre>e.g. setNotes_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param notes The value of notes as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_PrefixSearch(String notes) {
        setNotes_LikeSearch(notes, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNullOrEmpty() { regNotes(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DOBJ); }

    protected void regNotes(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotes(), "NOTES"); }
    protected abstract ConditionValue xgetCValueNotes();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty2usedflg The value of qty2usedflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2usedflg_Equal(java.math.BigDecimal qty2usedflg) {
        doSetQty2usedflg_Equal(qty2usedflg);
    }

    protected void doSetQty2usedflg_Equal(java.math.BigDecimal qty2usedflg) {
        regQty2usedflg(CK_EQ, qty2usedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty2usedflg The value of qty2usedflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2usedflg_NotEqual(java.math.BigDecimal qty2usedflg) {
        doSetQty2usedflg_NotEqual(qty2usedflg);
    }

    protected void doSetQty2usedflg_NotEqual(java.math.BigDecimal qty2usedflg) {
        regQty2usedflg(CK_NES, qty2usedflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty2usedflg The value of qty2usedflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2usedflg_GreaterThan(java.math.BigDecimal qty2usedflg) {
        regQty2usedflg(CK_GT, qty2usedflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty2usedflg The value of qty2usedflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2usedflg_LessThan(java.math.BigDecimal qty2usedflg) {
        regQty2usedflg(CK_LT, qty2usedflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty2usedflg The value of qty2usedflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2usedflg_GreaterEqual(java.math.BigDecimal qty2usedflg) {
        regQty2usedflg(CK_GE, qty2usedflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty2usedflg The value of qty2usedflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2usedflg_LessEqual(java.math.BigDecimal qty2usedflg) {
        regQty2usedflg(CK_LE, qty2usedflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of qty2usedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty2usedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty2usedflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty2usedflg(), "QTY2USEDFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty2usedflgList The collection of qty2usedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty2usedflg_InScope(Collection<java.math.BigDecimal> qty2usedflgList) {
        doSetQty2usedflg_InScope(qty2usedflgList);
    }

    protected void doSetQty2usedflg_InScope(Collection<java.math.BigDecimal> qty2usedflgList) {
        regINS(CK_INS, cTL(qty2usedflgList), xgetCValueQty2usedflg(), "QTY2USEDFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty2usedflgList The collection of qty2usedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty2usedflg_NotInScope(Collection<java.math.BigDecimal> qty2usedflgList) {
        doSetQty2usedflg_NotInScope(qty2usedflgList);
    }

    protected void doSetQty2usedflg_NotInScope(Collection<java.math.BigDecimal> qty2usedflgList) {
        regINS(CK_NINS, cTL(qty2usedflgList), xgetCValueQty2usedflg(), "QTY2USEDFLG");
    }

    protected void regQty2usedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty2usedflg(), "QTY2USEDFLG"); }
    protected abstract ConditionValue xgetCValueQty2usedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY2STYLE: {varchar(60)}
     * @param qty2style The value of qty2style as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty2style_Equal(String qty2style) {
        doSetQty2style_Equal(fRES(qty2style));
    }

    protected void doSetQty2style_Equal(String qty2style) {
        regQty2style(CK_EQ, qty2style);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY2STYLE: {varchar(60)}
     * @param qty2style The value of qty2style as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty2style_NotEqual(String qty2style) {
        doSetQty2style_NotEqual(fRES(qty2style));
    }

    protected void doSetQty2style_NotEqual(String qty2style) {
        regQty2style(CK_NES, qty2style);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY2STYLE: {varchar(60)}
     * @param qty2style The value of qty2style as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty2style_GreaterThan(String qty2style) {
        regQty2style(CK_GT, fRES(qty2style));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY2STYLE: {varchar(60)}
     * @param qty2style The value of qty2style as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty2style_LessThan(String qty2style) {
        regQty2style(CK_LT, fRES(qty2style));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY2STYLE: {varchar(60)}
     * @param qty2style The value of qty2style as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty2style_GreaterEqual(String qty2style) {
        regQty2style(CK_GE, fRES(qty2style));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY2STYLE: {varchar(60)}
     * @param qty2style The value of qty2style as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty2style_LessEqual(String qty2style) {
        regQty2style(CK_LE, fRES(qty2style));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QTY2STYLE: {varchar(60)}
     * @param qty2styleList The collection of qty2style as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty2style_InScope(Collection<String> qty2styleList) {
        doSetQty2style_InScope(qty2styleList);
    }

    protected void doSetQty2style_InScope(Collection<String> qty2styleList) {
        regINS(CK_INS, cTL(qty2styleList), xgetCValueQty2style(), "QTY2STYLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QTY2STYLE: {varchar(60)}
     * @param qty2styleList The collection of qty2style as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty2style_NotInScope(Collection<String> qty2styleList) {
        doSetQty2style_NotInScope(qty2styleList);
    }

    protected void doSetQty2style_NotInScope(Collection<String> qty2styleList) {
        regINS(CK_NINS, cTL(qty2styleList), xgetCValueQty2style(), "QTY2STYLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY2STYLE: {varchar(60)} <br>
     * <pre>e.g. setQty2style_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param qty2style The value of qty2style as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQty2style_LikeSearch(String qty2style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(qty2style), xgetCValueQty2style(), "QTY2STYLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY2STYLE: {varchar(60)}
     * @param qty2style The value of qty2style as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQty2style_NotLikeSearch(String qty2style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(qty2style), xgetCValueQty2style(), "QTY2STYLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY2STYLE: {varchar(60)}
     * @param qty2style The value of qty2style as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty2style_PrefixSearch(String qty2style) {
        setQty2style_LikeSearch(qty2style, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY2STYLE: {varchar(60)}
     */
    public void setQty2style_IsNull() { regQty2style(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * QTY2STYLE: {varchar(60)}
     */
    public void setQty2style_IsNullOrEmpty() { regQty2style(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY2STYLE: {varchar(60)}
     */
    public void setQty2style_IsNotNull() { regQty2style(CK_ISNN, DOBJ); }

    protected void regQty2style(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty2style(), "QTY2STYLE"); }
    protected abstract ConditionValue xgetCValueQty2style();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty3usedflg The value of qty3usedflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3usedflg_Equal(java.math.BigDecimal qty3usedflg) {
        doSetQty3usedflg_Equal(qty3usedflg);
    }

    protected void doSetQty3usedflg_Equal(java.math.BigDecimal qty3usedflg) {
        regQty3usedflg(CK_EQ, qty3usedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty3usedflg The value of qty3usedflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3usedflg_NotEqual(java.math.BigDecimal qty3usedflg) {
        doSetQty3usedflg_NotEqual(qty3usedflg);
    }

    protected void doSetQty3usedflg_NotEqual(java.math.BigDecimal qty3usedflg) {
        regQty3usedflg(CK_NES, qty3usedflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty3usedflg The value of qty3usedflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3usedflg_GreaterThan(java.math.BigDecimal qty3usedflg) {
        regQty3usedflg(CK_GT, qty3usedflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty3usedflg The value of qty3usedflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3usedflg_LessThan(java.math.BigDecimal qty3usedflg) {
        regQty3usedflg(CK_LT, qty3usedflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty3usedflg The value of qty3usedflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3usedflg_GreaterEqual(java.math.BigDecimal qty3usedflg) {
        regQty3usedflg(CK_GE, qty3usedflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty3usedflg The value of qty3usedflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3usedflg_LessEqual(java.math.BigDecimal qty3usedflg) {
        regQty3usedflg(CK_LE, qty3usedflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of qty3usedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty3usedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty3usedflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty3usedflg(), "QTY3USEDFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty3usedflgList The collection of qty3usedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty3usedflg_InScope(Collection<java.math.BigDecimal> qty3usedflgList) {
        doSetQty3usedflg_InScope(qty3usedflgList);
    }

    protected void doSetQty3usedflg_InScope(Collection<java.math.BigDecimal> qty3usedflgList) {
        regINS(CK_INS, cTL(qty3usedflgList), xgetCValueQty3usedflg(), "QTY3USEDFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param qty3usedflgList The collection of qty3usedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty3usedflg_NotInScope(Collection<java.math.BigDecimal> qty3usedflgList) {
        doSetQty3usedflg_NotInScope(qty3usedflgList);
    }

    protected void doSetQty3usedflg_NotInScope(Collection<java.math.BigDecimal> qty3usedflgList) {
        regINS(CK_NINS, cTL(qty3usedflgList), xgetCValueQty3usedflg(), "QTY3USEDFLG");
    }

    protected void regQty3usedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty3usedflg(), "QTY3USEDFLG"); }
    protected abstract ConditionValue xgetCValueQty3usedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY3STYLE: {varchar(60)}
     * @param qty3style The value of qty3style as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty3style_Equal(String qty3style) {
        doSetQty3style_Equal(fRES(qty3style));
    }

    protected void doSetQty3style_Equal(String qty3style) {
        regQty3style(CK_EQ, qty3style);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY3STYLE: {varchar(60)}
     * @param qty3style The value of qty3style as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty3style_NotEqual(String qty3style) {
        doSetQty3style_NotEqual(fRES(qty3style));
    }

    protected void doSetQty3style_NotEqual(String qty3style) {
        regQty3style(CK_NES, qty3style);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY3STYLE: {varchar(60)}
     * @param qty3style The value of qty3style as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty3style_GreaterThan(String qty3style) {
        regQty3style(CK_GT, fRES(qty3style));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY3STYLE: {varchar(60)}
     * @param qty3style The value of qty3style as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty3style_LessThan(String qty3style) {
        regQty3style(CK_LT, fRES(qty3style));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY3STYLE: {varchar(60)}
     * @param qty3style The value of qty3style as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty3style_GreaterEqual(String qty3style) {
        regQty3style(CK_GE, fRES(qty3style));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY3STYLE: {varchar(60)}
     * @param qty3style The value of qty3style as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty3style_LessEqual(String qty3style) {
        regQty3style(CK_LE, fRES(qty3style));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QTY3STYLE: {varchar(60)}
     * @param qty3styleList The collection of qty3style as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty3style_InScope(Collection<String> qty3styleList) {
        doSetQty3style_InScope(qty3styleList);
    }

    protected void doSetQty3style_InScope(Collection<String> qty3styleList) {
        regINS(CK_INS, cTL(qty3styleList), xgetCValueQty3style(), "QTY3STYLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QTY3STYLE: {varchar(60)}
     * @param qty3styleList The collection of qty3style as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty3style_NotInScope(Collection<String> qty3styleList) {
        doSetQty3style_NotInScope(qty3styleList);
    }

    protected void doSetQty3style_NotInScope(Collection<String> qty3styleList) {
        regINS(CK_NINS, cTL(qty3styleList), xgetCValueQty3style(), "QTY3STYLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY3STYLE: {varchar(60)} <br>
     * <pre>e.g. setQty3style_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param qty3style The value of qty3style as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQty3style_LikeSearch(String qty3style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(qty3style), xgetCValueQty3style(), "QTY3STYLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY3STYLE: {varchar(60)}
     * @param qty3style The value of qty3style as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQty3style_NotLikeSearch(String qty3style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(qty3style), xgetCValueQty3style(), "QTY3STYLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY3STYLE: {varchar(60)}
     * @param qty3style The value of qty3style as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty3style_PrefixSearch(String qty3style) {
        setQty3style_LikeSearch(qty3style, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY3STYLE: {varchar(60)}
     */
    public void setQty3style_IsNull() { regQty3style(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * QTY3STYLE: {varchar(60)}
     */
    public void setQty3style_IsNullOrEmpty() { regQty3style(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY3STYLE: {varchar(60)}
     */
    public void setQty3style_IsNotNull() { regQty3style(CK_ISNN, DOBJ); }

    protected void regQty3style(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty3style(), "QTY3STYLE"); }
    protected abstract ConditionValue xgetCValueQty3style();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spCalcflg The value of spCalcflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpCalcflg_Equal(java.math.BigDecimal spCalcflg) {
        doSetSpCalcflg_Equal(spCalcflg);
    }

    protected void doSetSpCalcflg_Equal(java.math.BigDecimal spCalcflg) {
        regSpCalcflg(CK_EQ, spCalcflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spCalcflg The value of spCalcflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpCalcflg_NotEqual(java.math.BigDecimal spCalcflg) {
        doSetSpCalcflg_NotEqual(spCalcflg);
    }

    protected void doSetSpCalcflg_NotEqual(java.math.BigDecimal spCalcflg) {
        regSpCalcflg(CK_NES, spCalcflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spCalcflg The value of spCalcflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpCalcflg_GreaterThan(java.math.BigDecimal spCalcflg) {
        regSpCalcflg(CK_GT, spCalcflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spCalcflg The value of spCalcflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpCalcflg_LessThan(java.math.BigDecimal spCalcflg) {
        regSpCalcflg(CK_LT, spCalcflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spCalcflg The value of spCalcflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpCalcflg_GreaterEqual(java.math.BigDecimal spCalcflg) {
        regSpCalcflg(CK_GE, spCalcflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spCalcflg The value of spCalcflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpCalcflg_LessEqual(java.math.BigDecimal spCalcflg) {
        regSpCalcflg(CK_LE, spCalcflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of spCalcflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of spCalcflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSpCalcflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSpCalcflg(), "SP_CALCFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spCalcflgList The collection of spCalcflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpCalcflg_InScope(Collection<java.math.BigDecimal> spCalcflgList) {
        doSetSpCalcflg_InScope(spCalcflgList);
    }

    protected void doSetSpCalcflg_InScope(Collection<java.math.BigDecimal> spCalcflgList) {
        regINS(CK_INS, cTL(spCalcflgList), xgetCValueSpCalcflg(), "SP_CALCFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spCalcflgList The collection of spCalcflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpCalcflg_NotInScope(Collection<java.math.BigDecimal> spCalcflgList) {
        doSetSpCalcflg_NotInScope(spCalcflgList);
    }

    protected void doSetSpCalcflg_NotInScope(Collection<java.math.BigDecimal> spCalcflgList) {
        regINS(CK_NINS, cTL(spCalcflgList), xgetCValueSpCalcflg(), "SP_CALCFLG");
    }

    protected void regSpCalcflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpCalcflg(), "SP_CALCFLG"); }
    protected abstract ConditionValue xgetCValueSpCalcflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb1usedflg The value of spLotatrb1usedflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb1usedflg_Equal(java.math.BigDecimal spLotatrb1usedflg) {
        doSetSpLotatrb1usedflg_Equal(spLotatrb1usedflg);
    }

    protected void doSetSpLotatrb1usedflg_Equal(java.math.BigDecimal spLotatrb1usedflg) {
        regSpLotatrb1usedflg(CK_EQ, spLotatrb1usedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb1usedflg The value of spLotatrb1usedflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb1usedflg_NotEqual(java.math.BigDecimal spLotatrb1usedflg) {
        doSetSpLotatrb1usedflg_NotEqual(spLotatrb1usedflg);
    }

    protected void doSetSpLotatrb1usedflg_NotEqual(java.math.BigDecimal spLotatrb1usedflg) {
        regSpLotatrb1usedflg(CK_NES, spLotatrb1usedflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb1usedflg The value of spLotatrb1usedflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb1usedflg_GreaterThan(java.math.BigDecimal spLotatrb1usedflg) {
        regSpLotatrb1usedflg(CK_GT, spLotatrb1usedflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb1usedflg The value of spLotatrb1usedflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb1usedflg_LessThan(java.math.BigDecimal spLotatrb1usedflg) {
        regSpLotatrb1usedflg(CK_LT, spLotatrb1usedflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb1usedflg The value of spLotatrb1usedflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb1usedflg_GreaterEqual(java.math.BigDecimal spLotatrb1usedflg) {
        regSpLotatrb1usedflg(CK_GE, spLotatrb1usedflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb1usedflg The value of spLotatrb1usedflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb1usedflg_LessEqual(java.math.BigDecimal spLotatrb1usedflg) {
        regSpLotatrb1usedflg(CK_LE, spLotatrb1usedflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of spLotatrb1usedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of spLotatrb1usedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSpLotatrb1usedflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSpLotatrb1usedflg(), "SP_LOTATRB1USEDFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb1usedflgList The collection of spLotatrb1usedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpLotatrb1usedflg_InScope(Collection<java.math.BigDecimal> spLotatrb1usedflgList) {
        doSetSpLotatrb1usedflg_InScope(spLotatrb1usedflgList);
    }

    protected void doSetSpLotatrb1usedflg_InScope(Collection<java.math.BigDecimal> spLotatrb1usedflgList) {
        regINS(CK_INS, cTL(spLotatrb1usedflgList), xgetCValueSpLotatrb1usedflg(), "SP_LOTATRB1USEDFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb1usedflgList The collection of spLotatrb1usedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpLotatrb1usedflg_NotInScope(Collection<java.math.BigDecimal> spLotatrb1usedflgList) {
        doSetSpLotatrb1usedflg_NotInScope(spLotatrb1usedflgList);
    }

    protected void doSetSpLotatrb1usedflg_NotInScope(Collection<java.math.BigDecimal> spLotatrb1usedflgList) {
        regINS(CK_NINS, cTL(spLotatrb1usedflgList), xgetCValueSpLotatrb1usedflg(), "SP_LOTATRB1USEDFLG");
    }

    protected void regSpLotatrb1usedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpLotatrb1usedflg(), "SP_LOTATRB1USEDFLG"); }
    protected abstract ConditionValue xgetCValueSpLotatrb1usedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1 The value of spOperator1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_Equal(String spOperator1) {
        doSetSpOperator1_Equal(fRES(spOperator1));
    }

    protected void doSetSpOperator1_Equal(String spOperator1) {
        regSpOperator1(CK_EQ, spOperator1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1 The value of spOperator1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_NotEqual(String spOperator1) {
        doSetSpOperator1_NotEqual(fRES(spOperator1));
    }

    protected void doSetSpOperator1_NotEqual(String spOperator1) {
        regSpOperator1(CK_NES, spOperator1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1 The value of spOperator1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_GreaterThan(String spOperator1) {
        regSpOperator1(CK_GT, fRES(spOperator1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1 The value of spOperator1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_LessThan(String spOperator1) {
        regSpOperator1(CK_LT, fRES(spOperator1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1 The value of spOperator1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_GreaterEqual(String spOperator1) {
        regSpOperator1(CK_GE, fRES(spOperator1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1 The value of spOperator1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_LessEqual(String spOperator1) {
        regSpOperator1(CK_LE, fRES(spOperator1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1List The collection of spOperator1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_InScope(Collection<String> spOperator1List) {
        doSetSpOperator1_InScope(spOperator1List);
    }

    protected void doSetSpOperator1_InScope(Collection<String> spOperator1List) {
        regINS(CK_INS, cTL(spOperator1List), xgetCValueSpOperator1(), "SP_OPERATOR1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1List The collection of spOperator1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_NotInScope(Collection<String> spOperator1List) {
        doSetSpOperator1_NotInScope(spOperator1List);
    }

    protected void doSetSpOperator1_NotInScope(Collection<String> spOperator1List) {
        regINS(CK_NINS, cTL(spOperator1List), xgetCValueSpOperator1(), "SP_OPERATOR1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SP_OPERATOR1: {varchar(30)} <br>
     * <pre>e.g. setSpOperator1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spOperator1 The value of spOperator1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpOperator1_LikeSearch(String spOperator1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spOperator1), xgetCValueSpOperator1(), "SP_OPERATOR1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1 The value of spOperator1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpOperator1_NotLikeSearch(String spOperator1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spOperator1), xgetCValueSpOperator1(), "SP_OPERATOR1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1 The value of spOperator1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_PrefixSearch(String spOperator1) {
        setSpOperator1_LikeSearch(spOperator1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     */
    public void setSpOperator1_IsNull() { regSpOperator1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     */
    public void setSpOperator1_IsNullOrEmpty() { regSpOperator1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     */
    public void setSpOperator1_IsNotNull() { regSpOperator1(CK_ISNN, DOBJ); }

    protected void regSpOperator1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpOperator1(), "SP_OPERATOR1"); }
    protected abstract ConditionValue xgetCValueSpOperator1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb2usedflg The value of spLotatrb2usedflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb2usedflg_Equal(java.math.BigDecimal spLotatrb2usedflg) {
        doSetSpLotatrb2usedflg_Equal(spLotatrb2usedflg);
    }

    protected void doSetSpLotatrb2usedflg_Equal(java.math.BigDecimal spLotatrb2usedflg) {
        regSpLotatrb2usedflg(CK_EQ, spLotatrb2usedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb2usedflg The value of spLotatrb2usedflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb2usedflg_NotEqual(java.math.BigDecimal spLotatrb2usedflg) {
        doSetSpLotatrb2usedflg_NotEqual(spLotatrb2usedflg);
    }

    protected void doSetSpLotatrb2usedflg_NotEqual(java.math.BigDecimal spLotatrb2usedflg) {
        regSpLotatrb2usedflg(CK_NES, spLotatrb2usedflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb2usedflg The value of spLotatrb2usedflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb2usedflg_GreaterThan(java.math.BigDecimal spLotatrb2usedflg) {
        regSpLotatrb2usedflg(CK_GT, spLotatrb2usedflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb2usedflg The value of spLotatrb2usedflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb2usedflg_LessThan(java.math.BigDecimal spLotatrb2usedflg) {
        regSpLotatrb2usedflg(CK_LT, spLotatrb2usedflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb2usedflg The value of spLotatrb2usedflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb2usedflg_GreaterEqual(java.math.BigDecimal spLotatrb2usedflg) {
        regSpLotatrb2usedflg(CK_GE, spLotatrb2usedflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb2usedflg The value of spLotatrb2usedflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb2usedflg_LessEqual(java.math.BigDecimal spLotatrb2usedflg) {
        regSpLotatrb2usedflg(CK_LE, spLotatrb2usedflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of spLotatrb2usedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of spLotatrb2usedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSpLotatrb2usedflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSpLotatrb2usedflg(), "SP_LOTATRB2USEDFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb2usedflgList The collection of spLotatrb2usedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpLotatrb2usedflg_InScope(Collection<java.math.BigDecimal> spLotatrb2usedflgList) {
        doSetSpLotatrb2usedflg_InScope(spLotatrb2usedflgList);
    }

    protected void doSetSpLotatrb2usedflg_InScope(Collection<java.math.BigDecimal> spLotatrb2usedflgList) {
        regINS(CK_INS, cTL(spLotatrb2usedflgList), xgetCValueSpLotatrb2usedflg(), "SP_LOTATRB2USEDFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb2usedflgList The collection of spLotatrb2usedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpLotatrb2usedflg_NotInScope(Collection<java.math.BigDecimal> spLotatrb2usedflgList) {
        doSetSpLotatrb2usedflg_NotInScope(spLotatrb2usedflgList);
    }

    protected void doSetSpLotatrb2usedflg_NotInScope(Collection<java.math.BigDecimal> spLotatrb2usedflgList) {
        regINS(CK_NINS, cTL(spLotatrb2usedflgList), xgetCValueSpLotatrb2usedflg(), "SP_LOTATRB2USEDFLG");
    }

    protected void regSpLotatrb2usedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpLotatrb2usedflg(), "SP_LOTATRB2USEDFLG"); }
    protected abstract ConditionValue xgetCValueSpLotatrb2usedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR2: {varchar(30)}
     * @param spOperator2 The value of spOperator2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator2_Equal(String spOperator2) {
        doSetSpOperator2_Equal(fRES(spOperator2));
    }

    protected void doSetSpOperator2_Equal(String spOperator2) {
        regSpOperator2(CK_EQ, spOperator2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR2: {varchar(30)}
     * @param spOperator2 The value of spOperator2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator2_NotEqual(String spOperator2) {
        doSetSpOperator2_NotEqual(fRES(spOperator2));
    }

    protected void doSetSpOperator2_NotEqual(String spOperator2) {
        regSpOperator2(CK_NES, spOperator2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR2: {varchar(30)}
     * @param spOperator2 The value of spOperator2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator2_GreaterThan(String spOperator2) {
        regSpOperator2(CK_GT, fRES(spOperator2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR2: {varchar(30)}
     * @param spOperator2 The value of spOperator2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator2_LessThan(String spOperator2) {
        regSpOperator2(CK_LT, fRES(spOperator2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR2: {varchar(30)}
     * @param spOperator2 The value of spOperator2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator2_GreaterEqual(String spOperator2) {
        regSpOperator2(CK_GE, fRES(spOperator2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR2: {varchar(30)}
     * @param spOperator2 The value of spOperator2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator2_LessEqual(String spOperator2) {
        regSpOperator2(CK_LE, fRES(spOperator2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SP_OPERATOR2: {varchar(30)}
     * @param spOperator2List The collection of spOperator2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator2_InScope(Collection<String> spOperator2List) {
        doSetSpOperator2_InScope(spOperator2List);
    }

    protected void doSetSpOperator2_InScope(Collection<String> spOperator2List) {
        regINS(CK_INS, cTL(spOperator2List), xgetCValueSpOperator2(), "SP_OPERATOR2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SP_OPERATOR2: {varchar(30)}
     * @param spOperator2List The collection of spOperator2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator2_NotInScope(Collection<String> spOperator2List) {
        doSetSpOperator2_NotInScope(spOperator2List);
    }

    protected void doSetSpOperator2_NotInScope(Collection<String> spOperator2List) {
        regINS(CK_NINS, cTL(spOperator2List), xgetCValueSpOperator2(), "SP_OPERATOR2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SP_OPERATOR2: {varchar(30)} <br>
     * <pre>e.g. setSpOperator2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spOperator2 The value of spOperator2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpOperator2_LikeSearch(String spOperator2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spOperator2), xgetCValueSpOperator2(), "SP_OPERATOR2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SP_OPERATOR2: {varchar(30)}
     * @param spOperator2 The value of spOperator2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpOperator2_NotLikeSearch(String spOperator2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spOperator2), xgetCValueSpOperator2(), "SP_OPERATOR2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SP_OPERATOR2: {varchar(30)}
     * @param spOperator2 The value of spOperator2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator2_PrefixSearch(String spOperator2) {
        setSpOperator2_LikeSearch(spOperator2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SP_OPERATOR2: {varchar(30)}
     */
    public void setSpOperator2_IsNull() { regSpOperator2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SP_OPERATOR2: {varchar(30)}
     */
    public void setSpOperator2_IsNullOrEmpty() { regSpOperator2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SP_OPERATOR2: {varchar(30)}
     */
    public void setSpOperator2_IsNotNull() { regSpOperator2(CK_ISNN, DOBJ); }

    protected void regSpOperator2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpOperator2(), "SP_OPERATOR2"); }
    protected abstract ConditionValue xgetCValueSpOperator2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb3usedflg The value of spLotatrb3usedflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb3usedflg_Equal(java.math.BigDecimal spLotatrb3usedflg) {
        doSetSpLotatrb3usedflg_Equal(spLotatrb3usedflg);
    }

    protected void doSetSpLotatrb3usedflg_Equal(java.math.BigDecimal spLotatrb3usedflg) {
        regSpLotatrb3usedflg(CK_EQ, spLotatrb3usedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb3usedflg The value of spLotatrb3usedflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb3usedflg_NotEqual(java.math.BigDecimal spLotatrb3usedflg) {
        doSetSpLotatrb3usedflg_NotEqual(spLotatrb3usedflg);
    }

    protected void doSetSpLotatrb3usedflg_NotEqual(java.math.BigDecimal spLotatrb3usedflg) {
        regSpLotatrb3usedflg(CK_NES, spLotatrb3usedflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb3usedflg The value of spLotatrb3usedflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb3usedflg_GreaterThan(java.math.BigDecimal spLotatrb3usedflg) {
        regSpLotatrb3usedflg(CK_GT, spLotatrb3usedflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb3usedflg The value of spLotatrb3usedflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb3usedflg_LessThan(java.math.BigDecimal spLotatrb3usedflg) {
        regSpLotatrb3usedflg(CK_LT, spLotatrb3usedflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb3usedflg The value of spLotatrb3usedflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb3usedflg_GreaterEqual(java.math.BigDecimal spLotatrb3usedflg) {
        regSpLotatrb3usedflg(CK_GE, spLotatrb3usedflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb3usedflg The value of spLotatrb3usedflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpLotatrb3usedflg_LessEqual(java.math.BigDecimal spLotatrb3usedflg) {
        regSpLotatrb3usedflg(CK_LE, spLotatrb3usedflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of spLotatrb3usedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of spLotatrb3usedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSpLotatrb3usedflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSpLotatrb3usedflg(), "SP_LOTATRB3USEDFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb3usedflgList The collection of spLotatrb3usedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpLotatrb3usedflg_InScope(Collection<java.math.BigDecimal> spLotatrb3usedflgList) {
        doSetSpLotatrb3usedflg_InScope(spLotatrb3usedflgList);
    }

    protected void doSetSpLotatrb3usedflg_InScope(Collection<java.math.BigDecimal> spLotatrb3usedflgList) {
        regINS(CK_INS, cTL(spLotatrb3usedflgList), xgetCValueSpLotatrb3usedflg(), "SP_LOTATRB3USEDFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param spLotatrb3usedflgList The collection of spLotatrb3usedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpLotatrb3usedflg_NotInScope(Collection<java.math.BigDecimal> spLotatrb3usedflgList) {
        doSetSpLotatrb3usedflg_NotInScope(spLotatrb3usedflgList);
    }

    protected void doSetSpLotatrb3usedflg_NotInScope(Collection<java.math.BigDecimal> spLotatrb3usedflgList) {
        regINS(CK_NINS, cTL(spLotatrb3usedflgList), xgetCValueSpLotatrb3usedflg(), "SP_LOTATRB3USEDFLG");
    }

    protected void regSpLotatrb3usedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpLotatrb3usedflg(), "SP_LOTATRB3USEDFLG"); }
    protected abstract ConditionValue xgetCValueSpLotatrb3usedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR3: {varchar(30)}
     * @param spOperator3 The value of spOperator3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator3_Equal(String spOperator3) {
        doSetSpOperator3_Equal(fRES(spOperator3));
    }

    protected void doSetSpOperator3_Equal(String spOperator3) {
        regSpOperator3(CK_EQ, spOperator3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR3: {varchar(30)}
     * @param spOperator3 The value of spOperator3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator3_NotEqual(String spOperator3) {
        doSetSpOperator3_NotEqual(fRES(spOperator3));
    }

    protected void doSetSpOperator3_NotEqual(String spOperator3) {
        regSpOperator3(CK_NES, spOperator3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR3: {varchar(30)}
     * @param spOperator3 The value of spOperator3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator3_GreaterThan(String spOperator3) {
        regSpOperator3(CK_GT, fRES(spOperator3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR3: {varchar(30)}
     * @param spOperator3 The value of spOperator3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator3_LessThan(String spOperator3) {
        regSpOperator3(CK_LT, fRES(spOperator3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR3: {varchar(30)}
     * @param spOperator3 The value of spOperator3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator3_GreaterEqual(String spOperator3) {
        regSpOperator3(CK_GE, fRES(spOperator3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR3: {varchar(30)}
     * @param spOperator3 The value of spOperator3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator3_LessEqual(String spOperator3) {
        regSpOperator3(CK_LE, fRES(spOperator3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SP_OPERATOR3: {varchar(30)}
     * @param spOperator3List The collection of spOperator3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator3_InScope(Collection<String> spOperator3List) {
        doSetSpOperator3_InScope(spOperator3List);
    }

    protected void doSetSpOperator3_InScope(Collection<String> spOperator3List) {
        regINS(CK_INS, cTL(spOperator3List), xgetCValueSpOperator3(), "SP_OPERATOR3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SP_OPERATOR3: {varchar(30)}
     * @param spOperator3List The collection of spOperator3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator3_NotInScope(Collection<String> spOperator3List) {
        doSetSpOperator3_NotInScope(spOperator3List);
    }

    protected void doSetSpOperator3_NotInScope(Collection<String> spOperator3List) {
        regINS(CK_NINS, cTL(spOperator3List), xgetCValueSpOperator3(), "SP_OPERATOR3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SP_OPERATOR3: {varchar(30)} <br>
     * <pre>e.g. setSpOperator3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spOperator3 The value of spOperator3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpOperator3_LikeSearch(String spOperator3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spOperator3), xgetCValueSpOperator3(), "SP_OPERATOR3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SP_OPERATOR3: {varchar(30)}
     * @param spOperator3 The value of spOperator3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpOperator3_NotLikeSearch(String spOperator3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spOperator3), xgetCValueSpOperator3(), "SP_OPERATOR3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SP_OPERATOR3: {varchar(30)}
     * @param spOperator3 The value of spOperator3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator3_PrefixSearch(String spOperator3) {
        setSpOperator3_LikeSearch(spOperator3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SP_OPERATOR3: {varchar(30)}
     */
    public void setSpOperator3_IsNull() { regSpOperator3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SP_OPERATOR3: {varchar(30)}
     */
    public void setSpOperator3_IsNullOrEmpty() { regSpOperator3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SP_OPERATOR3: {varchar(30)}
     */
    public void setSpOperator3_IsNotNull() { regSpOperator3(CK_ISNN, DOBJ); }

    protected void regSpOperator3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpOperator3(), "SP_OPERATOR3"); }
    protected abstract ConditionValue xgetCValueSpOperator3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_RATE: {NotNull, bigint(19), default=[(0)]}
     * @param spRate The value of spRate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpRate_Equal(Long spRate) {
        doSetSpRate_Equal(spRate);
    }

    protected void doSetSpRate_Equal(Long spRate) {
        regSpRate(CK_EQ, spRate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_RATE: {NotNull, bigint(19), default=[(0)]}
     * @param spRate The value of spRate as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpRate_NotEqual(Long spRate) {
        doSetSpRate_NotEqual(spRate);
    }

    protected void doSetSpRate_NotEqual(Long spRate) {
        regSpRate(CK_NES, spRate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_RATE: {NotNull, bigint(19), default=[(0)]}
     * @param spRate The value of spRate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpRate_GreaterThan(Long spRate) {
        regSpRate(CK_GT, spRate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_RATE: {NotNull, bigint(19), default=[(0)]}
     * @param spRate The value of spRate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpRate_LessThan(Long spRate) {
        regSpRate(CK_LT, spRate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_RATE: {NotNull, bigint(19), default=[(0)]}
     * @param spRate The value of spRate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpRate_GreaterEqual(Long spRate) {
        regSpRate(CK_GE, spRate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SP_RATE: {NotNull, bigint(19), default=[(0)]}
     * @param spRate The value of spRate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpRate_LessEqual(Long spRate) {
        regSpRate(CK_LE, spRate);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SP_RATE: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of spRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of spRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSpRate_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSpRate(), "SP_RATE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SP_RATE: {NotNull, bigint(19), default=[(0)]}
     * @param spRateList The collection of spRate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpRate_InScope(Collection<Long> spRateList) {
        doSetSpRate_InScope(spRateList);
    }

    protected void doSetSpRate_InScope(Collection<Long> spRateList) {
        regINS(CK_INS, cTL(spRateList), xgetCValueSpRate(), "SP_RATE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SP_RATE: {NotNull, bigint(19), default=[(0)]}
     * @param spRateList The collection of spRate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpRate_NotInScope(Collection<Long> spRateList) {
        doSetSpRate_NotInScope(spRateList);
    }

    protected void doSetSpRate_NotInScope(Collection<Long> spRateList) {
        regINS(CK_NINS, cTL(spRateList), xgetCValueSpRate(), "SP_RATE");
    }

    protected void regSpRate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpRate(), "SP_RATE"); }
    protected abstract ConditionValue xgetCValueSpRate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB1TITLE: {varchar(60)}
     * @param lotatrb1title The value of lotatrb1title as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb1title_Equal(String lotatrb1title) {
        doSetLotatrb1title_Equal(fRES(lotatrb1title));
    }

    protected void doSetLotatrb1title_Equal(String lotatrb1title) {
        regLotatrb1title(CK_EQ, lotatrb1title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB1TITLE: {varchar(60)}
     * @param lotatrb1title The value of lotatrb1title as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb1title_NotEqual(String lotatrb1title) {
        doSetLotatrb1title_NotEqual(fRES(lotatrb1title));
    }

    protected void doSetLotatrb1title_NotEqual(String lotatrb1title) {
        regLotatrb1title(CK_NES, lotatrb1title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB1TITLE: {varchar(60)}
     * @param lotatrb1title The value of lotatrb1title as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb1title_GreaterThan(String lotatrb1title) {
        regLotatrb1title(CK_GT, fRES(lotatrb1title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB1TITLE: {varchar(60)}
     * @param lotatrb1title The value of lotatrb1title as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb1title_LessThan(String lotatrb1title) {
        regLotatrb1title(CK_LT, fRES(lotatrb1title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB1TITLE: {varchar(60)}
     * @param lotatrb1title The value of lotatrb1title as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb1title_GreaterEqual(String lotatrb1title) {
        regLotatrb1title(CK_GE, fRES(lotatrb1title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB1TITLE: {varchar(60)}
     * @param lotatrb1title The value of lotatrb1title as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb1title_LessEqual(String lotatrb1title) {
        regLotatrb1title(CK_LE, fRES(lotatrb1title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB1TITLE: {varchar(60)}
     * @param lotatrb1titleList The collection of lotatrb1title as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb1title_InScope(Collection<String> lotatrb1titleList) {
        doSetLotatrb1title_InScope(lotatrb1titleList);
    }

    protected void doSetLotatrb1title_InScope(Collection<String> lotatrb1titleList) {
        regINS(CK_INS, cTL(lotatrb1titleList), xgetCValueLotatrb1title(), "LOTATRB1TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB1TITLE: {varchar(60)}
     * @param lotatrb1titleList The collection of lotatrb1title as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb1title_NotInScope(Collection<String> lotatrb1titleList) {
        doSetLotatrb1title_NotInScope(lotatrb1titleList);
    }

    protected void doSetLotatrb1title_NotInScope(Collection<String> lotatrb1titleList) {
        regINS(CK_NINS, cTL(lotatrb1titleList), xgetCValueLotatrb1title(), "LOTATRB1TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB1TITLE: {varchar(60)} <br>
     * <pre>e.g. setLotatrb1title_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotatrb1title The value of lotatrb1title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotatrb1title_LikeSearch(String lotatrb1title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotatrb1title), xgetCValueLotatrb1title(), "LOTATRB1TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB1TITLE: {varchar(60)}
     * @param lotatrb1title The value of lotatrb1title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotatrb1title_NotLikeSearch(String lotatrb1title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotatrb1title), xgetCValueLotatrb1title(), "LOTATRB1TITLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB1TITLE: {varchar(60)}
     * @param lotatrb1title The value of lotatrb1title as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb1title_PrefixSearch(String lotatrb1title) {
        setLotatrb1title_LikeSearch(lotatrb1title, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOTATRB1TITLE: {varchar(60)}
     */
    public void setLotatrb1title_IsNull() { regLotatrb1title(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOTATRB1TITLE: {varchar(60)}
     */
    public void setLotatrb1title_IsNullOrEmpty() { regLotatrb1title(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOTATRB1TITLE: {varchar(60)}
     */
    public void setLotatrb1title_IsNotNull() { regLotatrb1title(CK_ISNN, DOBJ); }

    protected void regLotatrb1title(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotatrb1title(), "LOTATRB1TITLE"); }
    protected abstract ConditionValue xgetCValueLotatrb1title();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB2TITLE: {varchar(60)}
     * @param lotatrb2title The value of lotatrb2title as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb2title_Equal(String lotatrb2title) {
        doSetLotatrb2title_Equal(fRES(lotatrb2title));
    }

    protected void doSetLotatrb2title_Equal(String lotatrb2title) {
        regLotatrb2title(CK_EQ, lotatrb2title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB2TITLE: {varchar(60)}
     * @param lotatrb2title The value of lotatrb2title as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb2title_NotEqual(String lotatrb2title) {
        doSetLotatrb2title_NotEqual(fRES(lotatrb2title));
    }

    protected void doSetLotatrb2title_NotEqual(String lotatrb2title) {
        regLotatrb2title(CK_NES, lotatrb2title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB2TITLE: {varchar(60)}
     * @param lotatrb2title The value of lotatrb2title as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb2title_GreaterThan(String lotatrb2title) {
        regLotatrb2title(CK_GT, fRES(lotatrb2title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB2TITLE: {varchar(60)}
     * @param lotatrb2title The value of lotatrb2title as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb2title_LessThan(String lotatrb2title) {
        regLotatrb2title(CK_LT, fRES(lotatrb2title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB2TITLE: {varchar(60)}
     * @param lotatrb2title The value of lotatrb2title as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb2title_GreaterEqual(String lotatrb2title) {
        regLotatrb2title(CK_GE, fRES(lotatrb2title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB2TITLE: {varchar(60)}
     * @param lotatrb2title The value of lotatrb2title as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb2title_LessEqual(String lotatrb2title) {
        regLotatrb2title(CK_LE, fRES(lotatrb2title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB2TITLE: {varchar(60)}
     * @param lotatrb2titleList The collection of lotatrb2title as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb2title_InScope(Collection<String> lotatrb2titleList) {
        doSetLotatrb2title_InScope(lotatrb2titleList);
    }

    protected void doSetLotatrb2title_InScope(Collection<String> lotatrb2titleList) {
        regINS(CK_INS, cTL(lotatrb2titleList), xgetCValueLotatrb2title(), "LOTATRB2TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB2TITLE: {varchar(60)}
     * @param lotatrb2titleList The collection of lotatrb2title as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb2title_NotInScope(Collection<String> lotatrb2titleList) {
        doSetLotatrb2title_NotInScope(lotatrb2titleList);
    }

    protected void doSetLotatrb2title_NotInScope(Collection<String> lotatrb2titleList) {
        regINS(CK_NINS, cTL(lotatrb2titleList), xgetCValueLotatrb2title(), "LOTATRB2TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB2TITLE: {varchar(60)} <br>
     * <pre>e.g. setLotatrb2title_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotatrb2title The value of lotatrb2title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotatrb2title_LikeSearch(String lotatrb2title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotatrb2title), xgetCValueLotatrb2title(), "LOTATRB2TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB2TITLE: {varchar(60)}
     * @param lotatrb2title The value of lotatrb2title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotatrb2title_NotLikeSearch(String lotatrb2title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotatrb2title), xgetCValueLotatrb2title(), "LOTATRB2TITLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB2TITLE: {varchar(60)}
     * @param lotatrb2title The value of lotatrb2title as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb2title_PrefixSearch(String lotatrb2title) {
        setLotatrb2title_LikeSearch(lotatrb2title, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOTATRB2TITLE: {varchar(60)}
     */
    public void setLotatrb2title_IsNull() { regLotatrb2title(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOTATRB2TITLE: {varchar(60)}
     */
    public void setLotatrb2title_IsNullOrEmpty() { regLotatrb2title(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOTATRB2TITLE: {varchar(60)}
     */
    public void setLotatrb2title_IsNotNull() { regLotatrb2title(CK_ISNN, DOBJ); }

    protected void regLotatrb2title(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotatrb2title(), "LOTATRB2TITLE"); }
    protected abstract ConditionValue xgetCValueLotatrb2title();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB3TITLE: {varchar(60)}
     * @param lotatrb3title The value of lotatrb3title as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb3title_Equal(String lotatrb3title) {
        doSetLotatrb3title_Equal(fRES(lotatrb3title));
    }

    protected void doSetLotatrb3title_Equal(String lotatrb3title) {
        regLotatrb3title(CK_EQ, lotatrb3title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB3TITLE: {varchar(60)}
     * @param lotatrb3title The value of lotatrb3title as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb3title_NotEqual(String lotatrb3title) {
        doSetLotatrb3title_NotEqual(fRES(lotatrb3title));
    }

    protected void doSetLotatrb3title_NotEqual(String lotatrb3title) {
        regLotatrb3title(CK_NES, lotatrb3title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB3TITLE: {varchar(60)}
     * @param lotatrb3title The value of lotatrb3title as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb3title_GreaterThan(String lotatrb3title) {
        regLotatrb3title(CK_GT, fRES(lotatrb3title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB3TITLE: {varchar(60)}
     * @param lotatrb3title The value of lotatrb3title as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb3title_LessThan(String lotatrb3title) {
        regLotatrb3title(CK_LT, fRES(lotatrb3title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB3TITLE: {varchar(60)}
     * @param lotatrb3title The value of lotatrb3title as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb3title_GreaterEqual(String lotatrb3title) {
        regLotatrb3title(CK_GE, fRES(lotatrb3title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB3TITLE: {varchar(60)}
     * @param lotatrb3title The value of lotatrb3title as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb3title_LessEqual(String lotatrb3title) {
        regLotatrb3title(CK_LE, fRES(lotatrb3title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB3TITLE: {varchar(60)}
     * @param lotatrb3titleList The collection of lotatrb3title as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb3title_InScope(Collection<String> lotatrb3titleList) {
        doSetLotatrb3title_InScope(lotatrb3titleList);
    }

    protected void doSetLotatrb3title_InScope(Collection<String> lotatrb3titleList) {
        regINS(CK_INS, cTL(lotatrb3titleList), xgetCValueLotatrb3title(), "LOTATRB3TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB3TITLE: {varchar(60)}
     * @param lotatrb3titleList The collection of lotatrb3title as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb3title_NotInScope(Collection<String> lotatrb3titleList) {
        doSetLotatrb3title_NotInScope(lotatrb3titleList);
    }

    protected void doSetLotatrb3title_NotInScope(Collection<String> lotatrb3titleList) {
        regINS(CK_NINS, cTL(lotatrb3titleList), xgetCValueLotatrb3title(), "LOTATRB3TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB3TITLE: {varchar(60)} <br>
     * <pre>e.g. setLotatrb3title_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotatrb3title The value of lotatrb3title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotatrb3title_LikeSearch(String lotatrb3title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotatrb3title), xgetCValueLotatrb3title(), "LOTATRB3TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB3TITLE: {varchar(60)}
     * @param lotatrb3title The value of lotatrb3title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotatrb3title_NotLikeSearch(String lotatrb3title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotatrb3title), xgetCValueLotatrb3title(), "LOTATRB3TITLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB3TITLE: {varchar(60)}
     * @param lotatrb3title The value of lotatrb3title as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb3title_PrefixSearch(String lotatrb3title) {
        setLotatrb3title_LikeSearch(lotatrb3title, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOTATRB3TITLE: {varchar(60)}
     */
    public void setLotatrb3title_IsNull() { regLotatrb3title(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOTATRB3TITLE: {varchar(60)}
     */
    public void setLotatrb3title_IsNullOrEmpty() { regLotatrb3title(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOTATRB3TITLE: {varchar(60)}
     */
    public void setLotatrb3title_IsNotNull() { regLotatrb3title(CK_ISNN, DOBJ); }

    protected void regLotatrb3title(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotatrb3title(), "LOTATRB3TITLE"); }
    protected abstract ConditionValue xgetCValueLotatrb3title();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB4TITLE: {varchar(60)}
     * @param lotatrb4title The value of lotatrb4title as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb4title_Equal(String lotatrb4title) {
        doSetLotatrb4title_Equal(fRES(lotatrb4title));
    }

    protected void doSetLotatrb4title_Equal(String lotatrb4title) {
        regLotatrb4title(CK_EQ, lotatrb4title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB4TITLE: {varchar(60)}
     * @param lotatrb4title The value of lotatrb4title as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb4title_NotEqual(String lotatrb4title) {
        doSetLotatrb4title_NotEqual(fRES(lotatrb4title));
    }

    protected void doSetLotatrb4title_NotEqual(String lotatrb4title) {
        regLotatrb4title(CK_NES, lotatrb4title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB4TITLE: {varchar(60)}
     * @param lotatrb4title The value of lotatrb4title as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb4title_GreaterThan(String lotatrb4title) {
        regLotatrb4title(CK_GT, fRES(lotatrb4title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB4TITLE: {varchar(60)}
     * @param lotatrb4title The value of lotatrb4title as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb4title_LessThan(String lotatrb4title) {
        regLotatrb4title(CK_LT, fRES(lotatrb4title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB4TITLE: {varchar(60)}
     * @param lotatrb4title The value of lotatrb4title as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb4title_GreaterEqual(String lotatrb4title) {
        regLotatrb4title(CK_GE, fRES(lotatrb4title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB4TITLE: {varchar(60)}
     * @param lotatrb4title The value of lotatrb4title as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb4title_LessEqual(String lotatrb4title) {
        regLotatrb4title(CK_LE, fRES(lotatrb4title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB4TITLE: {varchar(60)}
     * @param lotatrb4titleList The collection of lotatrb4title as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb4title_InScope(Collection<String> lotatrb4titleList) {
        doSetLotatrb4title_InScope(lotatrb4titleList);
    }

    protected void doSetLotatrb4title_InScope(Collection<String> lotatrb4titleList) {
        regINS(CK_INS, cTL(lotatrb4titleList), xgetCValueLotatrb4title(), "LOTATRB4TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB4TITLE: {varchar(60)}
     * @param lotatrb4titleList The collection of lotatrb4title as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb4title_NotInScope(Collection<String> lotatrb4titleList) {
        doSetLotatrb4title_NotInScope(lotatrb4titleList);
    }

    protected void doSetLotatrb4title_NotInScope(Collection<String> lotatrb4titleList) {
        regINS(CK_NINS, cTL(lotatrb4titleList), xgetCValueLotatrb4title(), "LOTATRB4TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB4TITLE: {varchar(60)} <br>
     * <pre>e.g. setLotatrb4title_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotatrb4title The value of lotatrb4title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotatrb4title_LikeSearch(String lotatrb4title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotatrb4title), xgetCValueLotatrb4title(), "LOTATRB4TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB4TITLE: {varchar(60)}
     * @param lotatrb4title The value of lotatrb4title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotatrb4title_NotLikeSearch(String lotatrb4title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotatrb4title), xgetCValueLotatrb4title(), "LOTATRB4TITLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB4TITLE: {varchar(60)}
     * @param lotatrb4title The value of lotatrb4title as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb4title_PrefixSearch(String lotatrb4title) {
        setLotatrb4title_LikeSearch(lotatrb4title, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOTATRB4TITLE: {varchar(60)}
     */
    public void setLotatrb4title_IsNull() { regLotatrb4title(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOTATRB4TITLE: {varchar(60)}
     */
    public void setLotatrb4title_IsNullOrEmpty() { regLotatrb4title(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOTATRB4TITLE: {varchar(60)}
     */
    public void setLotatrb4title_IsNotNull() { regLotatrb4title(CK_ISNN, DOBJ); }

    protected void regLotatrb4title(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotatrb4title(), "LOTATRB4TITLE"); }
    protected abstract ConditionValue xgetCValueLotatrb4title();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB5TITLE: {varchar(60)}
     * @param lotatrb5title The value of lotatrb5title as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb5title_Equal(String lotatrb5title) {
        doSetLotatrb5title_Equal(fRES(lotatrb5title));
    }

    protected void doSetLotatrb5title_Equal(String lotatrb5title) {
        regLotatrb5title(CK_EQ, lotatrb5title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB5TITLE: {varchar(60)}
     * @param lotatrb5title The value of lotatrb5title as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb5title_NotEqual(String lotatrb5title) {
        doSetLotatrb5title_NotEqual(fRES(lotatrb5title));
    }

    protected void doSetLotatrb5title_NotEqual(String lotatrb5title) {
        regLotatrb5title(CK_NES, lotatrb5title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB5TITLE: {varchar(60)}
     * @param lotatrb5title The value of lotatrb5title as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb5title_GreaterThan(String lotatrb5title) {
        regLotatrb5title(CK_GT, fRES(lotatrb5title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB5TITLE: {varchar(60)}
     * @param lotatrb5title The value of lotatrb5title as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb5title_LessThan(String lotatrb5title) {
        regLotatrb5title(CK_LT, fRES(lotatrb5title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB5TITLE: {varchar(60)}
     * @param lotatrb5title The value of lotatrb5title as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb5title_GreaterEqual(String lotatrb5title) {
        regLotatrb5title(CK_GE, fRES(lotatrb5title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB5TITLE: {varchar(60)}
     * @param lotatrb5title The value of lotatrb5title as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb5title_LessEqual(String lotatrb5title) {
        regLotatrb5title(CK_LE, fRES(lotatrb5title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB5TITLE: {varchar(60)}
     * @param lotatrb5titleList The collection of lotatrb5title as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb5title_InScope(Collection<String> lotatrb5titleList) {
        doSetLotatrb5title_InScope(lotatrb5titleList);
    }

    protected void doSetLotatrb5title_InScope(Collection<String> lotatrb5titleList) {
        regINS(CK_INS, cTL(lotatrb5titleList), xgetCValueLotatrb5title(), "LOTATRB5TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB5TITLE: {varchar(60)}
     * @param lotatrb5titleList The collection of lotatrb5title as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb5title_NotInScope(Collection<String> lotatrb5titleList) {
        doSetLotatrb5title_NotInScope(lotatrb5titleList);
    }

    protected void doSetLotatrb5title_NotInScope(Collection<String> lotatrb5titleList) {
        regINS(CK_NINS, cTL(lotatrb5titleList), xgetCValueLotatrb5title(), "LOTATRB5TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB5TITLE: {varchar(60)} <br>
     * <pre>e.g. setLotatrb5title_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotatrb5title The value of lotatrb5title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotatrb5title_LikeSearch(String lotatrb5title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotatrb5title), xgetCValueLotatrb5title(), "LOTATRB5TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB5TITLE: {varchar(60)}
     * @param lotatrb5title The value of lotatrb5title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotatrb5title_NotLikeSearch(String lotatrb5title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotatrb5title), xgetCValueLotatrb5title(), "LOTATRB5TITLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB5TITLE: {varchar(60)}
     * @param lotatrb5title The value of lotatrb5title as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb5title_PrefixSearch(String lotatrb5title) {
        setLotatrb5title_LikeSearch(lotatrb5title, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOTATRB5TITLE: {varchar(60)}
     */
    public void setLotatrb5title_IsNull() { regLotatrb5title(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOTATRB5TITLE: {varchar(60)}
     */
    public void setLotatrb5title_IsNullOrEmpty() { regLotatrb5title(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOTATRB5TITLE: {varchar(60)}
     */
    public void setLotatrb5title_IsNotNull() { regLotatrb5title(CK_ISNN, DOBJ); }

    protected void regLotatrb5title(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotatrb5title(), "LOTATRB5TITLE"); }
    protected abstract ConditionValue xgetCValueLotatrb5title();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB6TITLE: {varchar(60)}
     * @param lotatrb6title The value of lotatrb6title as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb6title_Equal(String lotatrb6title) {
        doSetLotatrb6title_Equal(fRES(lotatrb6title));
    }

    protected void doSetLotatrb6title_Equal(String lotatrb6title) {
        regLotatrb6title(CK_EQ, lotatrb6title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB6TITLE: {varchar(60)}
     * @param lotatrb6title The value of lotatrb6title as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb6title_NotEqual(String lotatrb6title) {
        doSetLotatrb6title_NotEqual(fRES(lotatrb6title));
    }

    protected void doSetLotatrb6title_NotEqual(String lotatrb6title) {
        regLotatrb6title(CK_NES, lotatrb6title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB6TITLE: {varchar(60)}
     * @param lotatrb6title The value of lotatrb6title as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb6title_GreaterThan(String lotatrb6title) {
        regLotatrb6title(CK_GT, fRES(lotatrb6title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB6TITLE: {varchar(60)}
     * @param lotatrb6title The value of lotatrb6title as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb6title_LessThan(String lotatrb6title) {
        regLotatrb6title(CK_LT, fRES(lotatrb6title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB6TITLE: {varchar(60)}
     * @param lotatrb6title The value of lotatrb6title as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb6title_GreaterEqual(String lotatrb6title) {
        regLotatrb6title(CK_GE, fRES(lotatrb6title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB6TITLE: {varchar(60)}
     * @param lotatrb6title The value of lotatrb6title as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb6title_LessEqual(String lotatrb6title) {
        regLotatrb6title(CK_LE, fRES(lotatrb6title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB6TITLE: {varchar(60)}
     * @param lotatrb6titleList The collection of lotatrb6title as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb6title_InScope(Collection<String> lotatrb6titleList) {
        doSetLotatrb6title_InScope(lotatrb6titleList);
    }

    protected void doSetLotatrb6title_InScope(Collection<String> lotatrb6titleList) {
        regINS(CK_INS, cTL(lotatrb6titleList), xgetCValueLotatrb6title(), "LOTATRB6TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB6TITLE: {varchar(60)}
     * @param lotatrb6titleList The collection of lotatrb6title as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb6title_NotInScope(Collection<String> lotatrb6titleList) {
        doSetLotatrb6title_NotInScope(lotatrb6titleList);
    }

    protected void doSetLotatrb6title_NotInScope(Collection<String> lotatrb6titleList) {
        regINS(CK_NINS, cTL(lotatrb6titleList), xgetCValueLotatrb6title(), "LOTATRB6TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB6TITLE: {varchar(60)} <br>
     * <pre>e.g. setLotatrb6title_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotatrb6title The value of lotatrb6title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotatrb6title_LikeSearch(String lotatrb6title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotatrb6title), xgetCValueLotatrb6title(), "LOTATRB6TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB6TITLE: {varchar(60)}
     * @param lotatrb6title The value of lotatrb6title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotatrb6title_NotLikeSearch(String lotatrb6title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotatrb6title), xgetCValueLotatrb6title(), "LOTATRB6TITLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB6TITLE: {varchar(60)}
     * @param lotatrb6title The value of lotatrb6title as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb6title_PrefixSearch(String lotatrb6title) {
        setLotatrb6title_LikeSearch(lotatrb6title, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOTATRB6TITLE: {varchar(60)}
     */
    public void setLotatrb6title_IsNull() { regLotatrb6title(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOTATRB6TITLE: {varchar(60)}
     */
    public void setLotatrb6title_IsNullOrEmpty() { regLotatrb6title(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOTATRB6TITLE: {varchar(60)}
     */
    public void setLotatrb6title_IsNotNull() { regLotatrb6title(CK_ISNN, DOBJ); }

    protected void regLotatrb6title(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotatrb6title(), "LOTATRB6TITLE"); }
    protected abstract ConditionValue xgetCValueLotatrb6title();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB7TITLE: {varchar(60)}
     * @param lotatrb7title The value of lotatrb7title as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb7title_Equal(String lotatrb7title) {
        doSetLotatrb7title_Equal(fRES(lotatrb7title));
    }

    protected void doSetLotatrb7title_Equal(String lotatrb7title) {
        regLotatrb7title(CK_EQ, lotatrb7title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB7TITLE: {varchar(60)}
     * @param lotatrb7title The value of lotatrb7title as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb7title_NotEqual(String lotatrb7title) {
        doSetLotatrb7title_NotEqual(fRES(lotatrb7title));
    }

    protected void doSetLotatrb7title_NotEqual(String lotatrb7title) {
        regLotatrb7title(CK_NES, lotatrb7title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB7TITLE: {varchar(60)}
     * @param lotatrb7title The value of lotatrb7title as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb7title_GreaterThan(String lotatrb7title) {
        regLotatrb7title(CK_GT, fRES(lotatrb7title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB7TITLE: {varchar(60)}
     * @param lotatrb7title The value of lotatrb7title as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb7title_LessThan(String lotatrb7title) {
        regLotatrb7title(CK_LT, fRES(lotatrb7title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB7TITLE: {varchar(60)}
     * @param lotatrb7title The value of lotatrb7title as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb7title_GreaterEqual(String lotatrb7title) {
        regLotatrb7title(CK_GE, fRES(lotatrb7title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB7TITLE: {varchar(60)}
     * @param lotatrb7title The value of lotatrb7title as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb7title_LessEqual(String lotatrb7title) {
        regLotatrb7title(CK_LE, fRES(lotatrb7title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB7TITLE: {varchar(60)}
     * @param lotatrb7titleList The collection of lotatrb7title as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb7title_InScope(Collection<String> lotatrb7titleList) {
        doSetLotatrb7title_InScope(lotatrb7titleList);
    }

    protected void doSetLotatrb7title_InScope(Collection<String> lotatrb7titleList) {
        regINS(CK_INS, cTL(lotatrb7titleList), xgetCValueLotatrb7title(), "LOTATRB7TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB7TITLE: {varchar(60)}
     * @param lotatrb7titleList The collection of lotatrb7title as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb7title_NotInScope(Collection<String> lotatrb7titleList) {
        doSetLotatrb7title_NotInScope(lotatrb7titleList);
    }

    protected void doSetLotatrb7title_NotInScope(Collection<String> lotatrb7titleList) {
        regINS(CK_NINS, cTL(lotatrb7titleList), xgetCValueLotatrb7title(), "LOTATRB7TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB7TITLE: {varchar(60)} <br>
     * <pre>e.g. setLotatrb7title_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotatrb7title The value of lotatrb7title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotatrb7title_LikeSearch(String lotatrb7title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotatrb7title), xgetCValueLotatrb7title(), "LOTATRB7TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB7TITLE: {varchar(60)}
     * @param lotatrb7title The value of lotatrb7title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotatrb7title_NotLikeSearch(String lotatrb7title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotatrb7title), xgetCValueLotatrb7title(), "LOTATRB7TITLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB7TITLE: {varchar(60)}
     * @param lotatrb7title The value of lotatrb7title as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb7title_PrefixSearch(String lotatrb7title) {
        setLotatrb7title_LikeSearch(lotatrb7title, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOTATRB7TITLE: {varchar(60)}
     */
    public void setLotatrb7title_IsNull() { regLotatrb7title(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOTATRB7TITLE: {varchar(60)}
     */
    public void setLotatrb7title_IsNullOrEmpty() { regLotatrb7title(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOTATRB7TITLE: {varchar(60)}
     */
    public void setLotatrb7title_IsNotNull() { regLotatrb7title(CK_ISNN, DOBJ); }

    protected void regLotatrb7title(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotatrb7title(), "LOTATRB7TITLE"); }
    protected abstract ConditionValue xgetCValueLotatrb7title();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB8TITLE: {varchar(60)}
     * @param lotatrb8title The value of lotatrb8title as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb8title_Equal(String lotatrb8title) {
        doSetLotatrb8title_Equal(fRES(lotatrb8title));
    }

    protected void doSetLotatrb8title_Equal(String lotatrb8title) {
        regLotatrb8title(CK_EQ, lotatrb8title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB8TITLE: {varchar(60)}
     * @param lotatrb8title The value of lotatrb8title as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb8title_NotEqual(String lotatrb8title) {
        doSetLotatrb8title_NotEqual(fRES(lotatrb8title));
    }

    protected void doSetLotatrb8title_NotEqual(String lotatrb8title) {
        regLotatrb8title(CK_NES, lotatrb8title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB8TITLE: {varchar(60)}
     * @param lotatrb8title The value of lotatrb8title as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb8title_GreaterThan(String lotatrb8title) {
        regLotatrb8title(CK_GT, fRES(lotatrb8title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB8TITLE: {varchar(60)}
     * @param lotatrb8title The value of lotatrb8title as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb8title_LessThan(String lotatrb8title) {
        regLotatrb8title(CK_LT, fRES(lotatrb8title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB8TITLE: {varchar(60)}
     * @param lotatrb8title The value of lotatrb8title as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb8title_GreaterEqual(String lotatrb8title) {
        regLotatrb8title(CK_GE, fRES(lotatrb8title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB8TITLE: {varchar(60)}
     * @param lotatrb8title The value of lotatrb8title as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb8title_LessEqual(String lotatrb8title) {
        regLotatrb8title(CK_LE, fRES(lotatrb8title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB8TITLE: {varchar(60)}
     * @param lotatrb8titleList The collection of lotatrb8title as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb8title_InScope(Collection<String> lotatrb8titleList) {
        doSetLotatrb8title_InScope(lotatrb8titleList);
    }

    protected void doSetLotatrb8title_InScope(Collection<String> lotatrb8titleList) {
        regINS(CK_INS, cTL(lotatrb8titleList), xgetCValueLotatrb8title(), "LOTATRB8TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB8TITLE: {varchar(60)}
     * @param lotatrb8titleList The collection of lotatrb8title as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb8title_NotInScope(Collection<String> lotatrb8titleList) {
        doSetLotatrb8title_NotInScope(lotatrb8titleList);
    }

    protected void doSetLotatrb8title_NotInScope(Collection<String> lotatrb8titleList) {
        regINS(CK_NINS, cTL(lotatrb8titleList), xgetCValueLotatrb8title(), "LOTATRB8TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB8TITLE: {varchar(60)} <br>
     * <pre>e.g. setLotatrb8title_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotatrb8title The value of lotatrb8title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotatrb8title_LikeSearch(String lotatrb8title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotatrb8title), xgetCValueLotatrb8title(), "LOTATRB8TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB8TITLE: {varchar(60)}
     * @param lotatrb8title The value of lotatrb8title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotatrb8title_NotLikeSearch(String lotatrb8title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotatrb8title), xgetCValueLotatrb8title(), "LOTATRB8TITLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB8TITLE: {varchar(60)}
     * @param lotatrb8title The value of lotatrb8title as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb8title_PrefixSearch(String lotatrb8title) {
        setLotatrb8title_LikeSearch(lotatrb8title, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOTATRB8TITLE: {varchar(60)}
     */
    public void setLotatrb8title_IsNull() { regLotatrb8title(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOTATRB8TITLE: {varchar(60)}
     */
    public void setLotatrb8title_IsNullOrEmpty() { regLotatrb8title(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOTATRB8TITLE: {varchar(60)}
     */
    public void setLotatrb8title_IsNotNull() { regLotatrb8title(CK_ISNN, DOBJ); }

    protected void regLotatrb8title(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotatrb8title(), "LOTATRB8TITLE"); }
    protected abstract ConditionValue xgetCValueLotatrb8title();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB9TITLE: {varchar(60)}
     * @param lotatrb9title The value of lotatrb9title as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb9title_Equal(String lotatrb9title) {
        doSetLotatrb9title_Equal(fRES(lotatrb9title));
    }

    protected void doSetLotatrb9title_Equal(String lotatrb9title) {
        regLotatrb9title(CK_EQ, lotatrb9title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB9TITLE: {varchar(60)}
     * @param lotatrb9title The value of lotatrb9title as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb9title_NotEqual(String lotatrb9title) {
        doSetLotatrb9title_NotEqual(fRES(lotatrb9title));
    }

    protected void doSetLotatrb9title_NotEqual(String lotatrb9title) {
        regLotatrb9title(CK_NES, lotatrb9title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB9TITLE: {varchar(60)}
     * @param lotatrb9title The value of lotatrb9title as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb9title_GreaterThan(String lotatrb9title) {
        regLotatrb9title(CK_GT, fRES(lotatrb9title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB9TITLE: {varchar(60)}
     * @param lotatrb9title The value of lotatrb9title as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb9title_LessThan(String lotatrb9title) {
        regLotatrb9title(CK_LT, fRES(lotatrb9title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB9TITLE: {varchar(60)}
     * @param lotatrb9title The value of lotatrb9title as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb9title_GreaterEqual(String lotatrb9title) {
        regLotatrb9title(CK_GE, fRES(lotatrb9title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB9TITLE: {varchar(60)}
     * @param lotatrb9title The value of lotatrb9title as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb9title_LessEqual(String lotatrb9title) {
        regLotatrb9title(CK_LE, fRES(lotatrb9title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB9TITLE: {varchar(60)}
     * @param lotatrb9titleList The collection of lotatrb9title as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb9title_InScope(Collection<String> lotatrb9titleList) {
        doSetLotatrb9title_InScope(lotatrb9titleList);
    }

    protected void doSetLotatrb9title_InScope(Collection<String> lotatrb9titleList) {
        regINS(CK_INS, cTL(lotatrb9titleList), xgetCValueLotatrb9title(), "LOTATRB9TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB9TITLE: {varchar(60)}
     * @param lotatrb9titleList The collection of lotatrb9title as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb9title_NotInScope(Collection<String> lotatrb9titleList) {
        doSetLotatrb9title_NotInScope(lotatrb9titleList);
    }

    protected void doSetLotatrb9title_NotInScope(Collection<String> lotatrb9titleList) {
        regINS(CK_NINS, cTL(lotatrb9titleList), xgetCValueLotatrb9title(), "LOTATRB9TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB9TITLE: {varchar(60)} <br>
     * <pre>e.g. setLotatrb9title_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotatrb9title The value of lotatrb9title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotatrb9title_LikeSearch(String lotatrb9title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotatrb9title), xgetCValueLotatrb9title(), "LOTATRB9TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB9TITLE: {varchar(60)}
     * @param lotatrb9title The value of lotatrb9title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotatrb9title_NotLikeSearch(String lotatrb9title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotatrb9title), xgetCValueLotatrb9title(), "LOTATRB9TITLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB9TITLE: {varchar(60)}
     * @param lotatrb9title The value of lotatrb9title as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb9title_PrefixSearch(String lotatrb9title) {
        setLotatrb9title_LikeSearch(lotatrb9title, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOTATRB9TITLE: {varchar(60)}
     */
    public void setLotatrb9title_IsNull() { regLotatrb9title(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOTATRB9TITLE: {varchar(60)}
     */
    public void setLotatrb9title_IsNullOrEmpty() { regLotatrb9title(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOTATRB9TITLE: {varchar(60)}
     */
    public void setLotatrb9title_IsNotNull() { regLotatrb9title(CK_ISNN, DOBJ); }

    protected void regLotatrb9title(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotatrb9title(), "LOTATRB9TITLE"); }
    protected abstract ConditionValue xgetCValueLotatrb9title();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB10TITLE: {varchar(60)}
     * @param lotatrb10title The value of lotatrb10title as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb10title_Equal(String lotatrb10title) {
        doSetLotatrb10title_Equal(fRES(lotatrb10title));
    }

    protected void doSetLotatrb10title_Equal(String lotatrb10title) {
        regLotatrb10title(CK_EQ, lotatrb10title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB10TITLE: {varchar(60)}
     * @param lotatrb10title The value of lotatrb10title as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb10title_NotEqual(String lotatrb10title) {
        doSetLotatrb10title_NotEqual(fRES(lotatrb10title));
    }

    protected void doSetLotatrb10title_NotEqual(String lotatrb10title) {
        regLotatrb10title(CK_NES, lotatrb10title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB10TITLE: {varchar(60)}
     * @param lotatrb10title The value of lotatrb10title as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb10title_GreaterThan(String lotatrb10title) {
        regLotatrb10title(CK_GT, fRES(lotatrb10title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB10TITLE: {varchar(60)}
     * @param lotatrb10title The value of lotatrb10title as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb10title_LessThan(String lotatrb10title) {
        regLotatrb10title(CK_LT, fRES(lotatrb10title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB10TITLE: {varchar(60)}
     * @param lotatrb10title The value of lotatrb10title as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb10title_GreaterEqual(String lotatrb10title) {
        regLotatrb10title(CK_GE, fRES(lotatrb10title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOTATRB10TITLE: {varchar(60)}
     * @param lotatrb10title The value of lotatrb10title as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb10title_LessEqual(String lotatrb10title) {
        regLotatrb10title(CK_LE, fRES(lotatrb10title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB10TITLE: {varchar(60)}
     * @param lotatrb10titleList The collection of lotatrb10title as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb10title_InScope(Collection<String> lotatrb10titleList) {
        doSetLotatrb10title_InScope(lotatrb10titleList);
    }

    protected void doSetLotatrb10title_InScope(Collection<String> lotatrb10titleList) {
        regINS(CK_INS, cTL(lotatrb10titleList), xgetCValueLotatrb10title(), "LOTATRB10TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOTATRB10TITLE: {varchar(60)}
     * @param lotatrb10titleList The collection of lotatrb10title as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb10title_NotInScope(Collection<String> lotatrb10titleList) {
        doSetLotatrb10title_NotInScope(lotatrb10titleList);
    }

    protected void doSetLotatrb10title_NotInScope(Collection<String> lotatrb10titleList) {
        regINS(CK_NINS, cTL(lotatrb10titleList), xgetCValueLotatrb10title(), "LOTATRB10TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB10TITLE: {varchar(60)} <br>
     * <pre>e.g. setLotatrb10title_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotatrb10title The value of lotatrb10title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotatrb10title_LikeSearch(String lotatrb10title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotatrb10title), xgetCValueLotatrb10title(), "LOTATRB10TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB10TITLE: {varchar(60)}
     * @param lotatrb10title The value of lotatrb10title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotatrb10title_NotLikeSearch(String lotatrb10title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotatrb10title), xgetCValueLotatrb10title(), "LOTATRB10TITLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOTATRB10TITLE: {varchar(60)}
     * @param lotatrb10title The value of lotatrb10title as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotatrb10title_PrefixSearch(String lotatrb10title) {
        setLotatrb10title_LikeSearch(lotatrb10title, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOTATRB10TITLE: {varchar(60)}
     */
    public void setLotatrb10title_IsNull() { regLotatrb10title(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOTATRB10TITLE: {varchar(60)}
     */
    public void setLotatrb10title_IsNullOrEmpty() { regLotatrb10title(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOTATRB10TITLE: {varchar(60)}
     */
    public void setLotatrb10title_IsNotNull() { regLotatrb10title(CK_ISNN, DOBJ); }

    protected void regLotatrb10title(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotatrb10title(), "LOTATRB10TITLE"); }
    protected abstract ConditionValue xgetCValueLotatrb10title();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_Equal(String fUser1) {
        doSetFUser1_Equal(fRES(fUser1));
    }

    protected void doSetFUser1_Equal(String fUser1) {
        regFUser1(CK_EQ, fUser1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_NotEqual(String fUser1) {
        doSetFUser1_NotEqual(fRES(fUser1));
    }

    protected void doSetFUser1_NotEqual(String fUser1) {
        regFUser1(CK_NES, fUser1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_GreaterThan(String fUser1) {
        regFUser1(CK_GT, fRES(fUser1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_LessThan(String fUser1) {
        regFUser1(CK_LT, fRES(fUser1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_GreaterEqual(String fUser1) {
        regFUser1(CK_GE, fRES(fUser1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_LessEqual(String fUser1) {
        regFUser1(CK_LE, fRES(fUser1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1List The collection of fUser1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_InScope(Collection<String> fUser1List) {
        doSetFUser1_InScope(fUser1List);
    }

    protected void doSetFUser1_InScope(Collection<String> fUser1List) {
        regINS(CK_INS, cTL(fUser1List), xgetCValueFUser1(), "F_USER1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1List The collection of fUser1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_NotInScope(Collection<String> fUser1List) {
        doSetFUser1_NotInScope(fUser1List);
    }

    protected void doSetFUser1_NotInScope(Collection<String> fUser1List) {
        regINS(CK_NINS, cTL(fUser1List), xgetCValueFUser1(), "F_USER1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)} <br>
     * <pre>e.g. setFUser1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fUser1 The value of fUser1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFUser1_LikeSearch(String fUser1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fUser1), xgetCValueFUser1(), "F_USER1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFUser1_NotLikeSearch(String fUser1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fUser1), xgetCValueFUser1(), "F_USER1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_PrefixSearch(String fUser1) {
        setFUser1_LikeSearch(fUser1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     */
    public void setFUser1_IsNull() { regFUser1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     */
    public void setFUser1_IsNullOrEmpty() { regFUser1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     */
    public void setFUser1_IsNotNull() { regFUser1(CK_ISNN, DOBJ); }

    protected void regFUser1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFUser1(), "F_USER1"); }
    protected abstract ConditionValue xgetCValueFUser1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_Equal(String fUser2) {
        doSetFUser2_Equal(fRES(fUser2));
    }

    protected void doSetFUser2_Equal(String fUser2) {
        regFUser2(CK_EQ, fUser2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_NotEqual(String fUser2) {
        doSetFUser2_NotEqual(fRES(fUser2));
    }

    protected void doSetFUser2_NotEqual(String fUser2) {
        regFUser2(CK_NES, fUser2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_GreaterThan(String fUser2) {
        regFUser2(CK_GT, fRES(fUser2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_LessThan(String fUser2) {
        regFUser2(CK_LT, fRES(fUser2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_GreaterEqual(String fUser2) {
        regFUser2(CK_GE, fRES(fUser2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_LessEqual(String fUser2) {
        regFUser2(CK_LE, fRES(fUser2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2List The collection of fUser2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_InScope(Collection<String> fUser2List) {
        doSetFUser2_InScope(fUser2List);
    }

    protected void doSetFUser2_InScope(Collection<String> fUser2List) {
        regINS(CK_INS, cTL(fUser2List), xgetCValueFUser2(), "F_USER2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2List The collection of fUser2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_NotInScope(Collection<String> fUser2List) {
        doSetFUser2_NotInScope(fUser2List);
    }

    protected void doSetFUser2_NotInScope(Collection<String> fUser2List) {
        regINS(CK_NINS, cTL(fUser2List), xgetCValueFUser2(), "F_USER2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER2: {varchar(30)} <br>
     * <pre>e.g. setFUser2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fUser2 The value of fUser2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFUser2_LikeSearch(String fUser2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fUser2), xgetCValueFUser2(), "F_USER2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFUser2_NotLikeSearch(String fUser2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fUser2), xgetCValueFUser2(), "F_USER2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_PrefixSearch(String fUser2) {
        setFUser2_LikeSearch(fUser2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     */
    public void setFUser2_IsNull() { regFUser2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     */
    public void setFUser2_IsNullOrEmpty() { regFUser2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     */
    public void setFUser2_IsNotNull() { regFUser2(CK_ISNN, DOBJ); }

    protected void regFUser2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFUser2(), "F_USER2"); }
    protected abstract ConditionValue xgetCValueFUser2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_Equal(String fUser3) {
        doSetFUser3_Equal(fRES(fUser3));
    }

    protected void doSetFUser3_Equal(String fUser3) {
        regFUser3(CK_EQ, fUser3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_NotEqual(String fUser3) {
        doSetFUser3_NotEqual(fRES(fUser3));
    }

    protected void doSetFUser3_NotEqual(String fUser3) {
        regFUser3(CK_NES, fUser3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_GreaterThan(String fUser3) {
        regFUser3(CK_GT, fRES(fUser3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_LessThan(String fUser3) {
        regFUser3(CK_LT, fRES(fUser3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_GreaterEqual(String fUser3) {
        regFUser3(CK_GE, fRES(fUser3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_LessEqual(String fUser3) {
        regFUser3(CK_LE, fRES(fUser3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3List The collection of fUser3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_InScope(Collection<String> fUser3List) {
        doSetFUser3_InScope(fUser3List);
    }

    protected void doSetFUser3_InScope(Collection<String> fUser3List) {
        regINS(CK_INS, cTL(fUser3List), xgetCValueFUser3(), "F_USER3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3List The collection of fUser3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_NotInScope(Collection<String> fUser3List) {
        doSetFUser3_NotInScope(fUser3List);
    }

    protected void doSetFUser3_NotInScope(Collection<String> fUser3List) {
        regINS(CK_NINS, cTL(fUser3List), xgetCValueFUser3(), "F_USER3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER3: {varchar(30)} <br>
     * <pre>e.g. setFUser3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fUser3 The value of fUser3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFUser3_LikeSearch(String fUser3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fUser3), xgetCValueFUser3(), "F_USER3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFUser3_NotLikeSearch(String fUser3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fUser3), xgetCValueFUser3(), "F_USER3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_PrefixSearch(String fUser3) {
        setFUser3_LikeSearch(fUser3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     */
    public void setFUser3_IsNull() { regFUser3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     */
    public void setFUser3_IsNullOrEmpty() { regFUser3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     */
    public void setFUser3_IsNotNull() { regFUser3(CK_ISNN, DOBJ); }

    protected void regFUser3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFUser3(), "F_USER3"); }
    protected abstract ConditionValue xgetCValueFUser3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_Equal(String fUser4) {
        doSetFUser4_Equal(fRES(fUser4));
    }

    protected void doSetFUser4_Equal(String fUser4) {
        regFUser4(CK_EQ, fUser4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_NotEqual(String fUser4) {
        doSetFUser4_NotEqual(fRES(fUser4));
    }

    protected void doSetFUser4_NotEqual(String fUser4) {
        regFUser4(CK_NES, fUser4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_GreaterThan(String fUser4) {
        regFUser4(CK_GT, fRES(fUser4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_LessThan(String fUser4) {
        regFUser4(CK_LT, fRES(fUser4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_GreaterEqual(String fUser4) {
        regFUser4(CK_GE, fRES(fUser4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_LessEqual(String fUser4) {
        regFUser4(CK_LE, fRES(fUser4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4List The collection of fUser4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_InScope(Collection<String> fUser4List) {
        doSetFUser4_InScope(fUser4List);
    }

    protected void doSetFUser4_InScope(Collection<String> fUser4List) {
        regINS(CK_INS, cTL(fUser4List), xgetCValueFUser4(), "F_USER4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4List The collection of fUser4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_NotInScope(Collection<String> fUser4List) {
        doSetFUser4_NotInScope(fUser4List);
    }

    protected void doSetFUser4_NotInScope(Collection<String> fUser4List) {
        regINS(CK_NINS, cTL(fUser4List), xgetCValueFUser4(), "F_USER4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER4: {varchar(30)} <br>
     * <pre>e.g. setFUser4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fUser4 The value of fUser4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFUser4_LikeSearch(String fUser4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fUser4), xgetCValueFUser4(), "F_USER4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFUser4_NotLikeSearch(String fUser4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fUser4), xgetCValueFUser4(), "F_USER4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_PrefixSearch(String fUser4) {
        setFUser4_LikeSearch(fUser4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     */
    public void setFUser4_IsNull() { regFUser4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     */
    public void setFUser4_IsNullOrEmpty() { regFUser4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     */
    public void setFUser4_IsNotNull() { regFUser4(CK_ISNN, DOBJ); }

    protected void regFUser4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFUser4(), "F_USER4"); }
    protected abstract ConditionValue xgetCValueFUser4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_Equal(String fUser5) {
        doSetFUser5_Equal(fRES(fUser5));
    }

    protected void doSetFUser5_Equal(String fUser5) {
        regFUser5(CK_EQ, fUser5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_NotEqual(String fUser5) {
        doSetFUser5_NotEqual(fRES(fUser5));
    }

    protected void doSetFUser5_NotEqual(String fUser5) {
        regFUser5(CK_NES, fUser5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_GreaterThan(String fUser5) {
        regFUser5(CK_GT, fRES(fUser5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_LessThan(String fUser5) {
        regFUser5(CK_LT, fRES(fUser5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_GreaterEqual(String fUser5) {
        regFUser5(CK_GE, fRES(fUser5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_LessEqual(String fUser5) {
        regFUser5(CK_LE, fRES(fUser5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5List The collection of fUser5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_InScope(Collection<String> fUser5List) {
        doSetFUser5_InScope(fUser5List);
    }

    protected void doSetFUser5_InScope(Collection<String> fUser5List) {
        regINS(CK_INS, cTL(fUser5List), xgetCValueFUser5(), "F_USER5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5List The collection of fUser5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_NotInScope(Collection<String> fUser5List) {
        doSetFUser5_NotInScope(fUser5List);
    }

    protected void doSetFUser5_NotInScope(Collection<String> fUser5List) {
        regINS(CK_NINS, cTL(fUser5List), xgetCValueFUser5(), "F_USER5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER5: {varchar(30)} <br>
     * <pre>e.g. setFUser5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fUser5 The value of fUser5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFUser5_LikeSearch(String fUser5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fUser5), xgetCValueFUser5(), "F_USER5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFUser5_NotLikeSearch(String fUser5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fUser5), xgetCValueFUser5(), "F_USER5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_PrefixSearch(String fUser5) {
        setFUser5_LikeSearch(fUser5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     */
    public void setFUser5_IsNull() { regFUser5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     */
    public void setFUser5_IsNullOrEmpty() { regFUser5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     */
    public void setFUser5_IsNotNull() { regFUser5(CK_ISNN, DOBJ); }

    protected void regFUser5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFUser5(), "F_USER5"); }
    protected abstract ConditionValue xgetCValueFUser5();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM40: {decimal(16, 6), default=[(0)]}
     * @param item40 The value of item40 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setItem40_Equal(java.math.BigDecimal item40) {
        doSetItem40_Equal(item40);
    }

    protected void doSetItem40_Equal(java.math.BigDecimal item40) {
        regItem40(CK_EQ, item40);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM40: {decimal(16, 6), default=[(0)]}
     * @param item40 The value of item40 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItem40_NotEqual(java.math.BigDecimal item40) {
        doSetItem40_NotEqual(item40);
    }

    protected void doSetItem40_NotEqual(java.math.BigDecimal item40) {
        regItem40(CK_NES, item40);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM40: {decimal(16, 6), default=[(0)]}
     * @param item40 The value of item40 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItem40_GreaterThan(java.math.BigDecimal item40) {
        regItem40(CK_GT, item40);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM40: {decimal(16, 6), default=[(0)]}
     * @param item40 The value of item40 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItem40_LessThan(java.math.BigDecimal item40) {
        regItem40(CK_LT, item40);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM40: {decimal(16, 6), default=[(0)]}
     * @param item40 The value of item40 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItem40_GreaterEqual(java.math.BigDecimal item40) {
        regItem40(CK_GE, item40);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM40: {decimal(16, 6), default=[(0)]}
     * @param item40 The value of item40 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItem40_LessEqual(java.math.BigDecimal item40) {
        regItem40(CK_LE, item40);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM40: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of item40. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of item40. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setItem40_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueItem40(), "ITEM40", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM40: {decimal(16, 6), default=[(0)]}
     * @param item40List The collection of item40 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItem40_InScope(Collection<java.math.BigDecimal> item40List) {
        doSetItem40_InScope(item40List);
    }

    protected void doSetItem40_InScope(Collection<java.math.BigDecimal> item40List) {
        regINS(CK_INS, cTL(item40List), xgetCValueItem40(), "ITEM40");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM40: {decimal(16, 6), default=[(0)]}
     * @param item40List The collection of item40 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItem40_NotInScope(Collection<java.math.BigDecimal> item40List) {
        doSetItem40_NotInScope(item40List);
    }

    protected void doSetItem40_NotInScope(Collection<java.math.BigDecimal> item40List) {
        regINS(CK_NINS, cTL(item40List), xgetCValueItem40(), "ITEM40");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM40: {decimal(16, 6), default=[(0)]}
     */
    public void setItem40_IsNull() { regItem40(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM40: {decimal(16, 6), default=[(0)]}
     */
    public void setItem40_IsNotNull() { regItem40(CK_ISNN, DOBJ); }

    protected void regItem40(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItem40(), "ITEM40"); }
    protected abstract ConditionValue xgetCValueItem40();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]}
     * @param priceInsurance The value of priceInsurance as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceInsurance_Equal(Long priceInsurance) {
        doSetPriceInsurance_Equal(priceInsurance);
    }

    protected void doSetPriceInsurance_Equal(Long priceInsurance) {
        regPriceInsurance(CK_EQ, priceInsurance);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]}
     * @param priceInsurance The value of priceInsurance as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceInsurance_NotEqual(Long priceInsurance) {
        doSetPriceInsurance_NotEqual(priceInsurance);
    }

    protected void doSetPriceInsurance_NotEqual(Long priceInsurance) {
        regPriceInsurance(CK_NES, priceInsurance);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]}
     * @param priceInsurance The value of priceInsurance as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceInsurance_GreaterThan(Long priceInsurance) {
        regPriceInsurance(CK_GT, priceInsurance);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]}
     * @param priceInsurance The value of priceInsurance as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceInsurance_LessThan(Long priceInsurance) {
        regPriceInsurance(CK_LT, priceInsurance);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]}
     * @param priceInsurance The value of priceInsurance as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceInsurance_GreaterEqual(Long priceInsurance) {
        regPriceInsurance(CK_GE, priceInsurance);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]}
     * @param priceInsurance The value of priceInsurance as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceInsurance_LessEqual(Long priceInsurance) {
        regPriceInsurance(CK_LE, priceInsurance);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of priceInsurance. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of priceInsurance. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPriceInsurance_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePriceInsurance(), "PRICE_INSURANCE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]}
     * @param priceInsuranceList The collection of priceInsurance as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceInsurance_InScope(Collection<Long> priceInsuranceList) {
        doSetPriceInsurance_InScope(priceInsuranceList);
    }

    protected void doSetPriceInsurance_InScope(Collection<Long> priceInsuranceList) {
        regINS(CK_INS, cTL(priceInsuranceList), xgetCValuePriceInsurance(), "PRICE_INSURANCE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]}
     * @param priceInsuranceList The collection of priceInsurance as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceInsurance_NotInScope(Collection<Long> priceInsuranceList) {
        doSetPriceInsurance_NotInScope(priceInsuranceList);
    }

    protected void doSetPriceInsurance_NotInScope(Collection<Long> priceInsuranceList) {
        regINS(CK_NINS, cTL(priceInsuranceList), xgetCValuePriceInsurance(), "PRICE_INSURANCE");
    }

    protected void regPriceInsurance(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriceInsurance(), "PRICE_INSURANCE"); }
    protected abstract ConditionValue xgetCValuePriceInsurance();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param limitday The value of limitday as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitday_Equal(java.math.BigDecimal limitday) {
        doSetLimitday_Equal(limitday);
    }

    protected void doSetLimitday_Equal(java.math.BigDecimal limitday) {
        regLimitday(CK_EQ, limitday);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param limitday The value of limitday as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitday_NotEqual(java.math.BigDecimal limitday) {
        doSetLimitday_NotEqual(limitday);
    }

    protected void doSetLimitday_NotEqual(java.math.BigDecimal limitday) {
        regLimitday(CK_NES, limitday);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param limitday The value of limitday as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitday_GreaterThan(java.math.BigDecimal limitday) {
        regLimitday(CK_GT, limitday);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param limitday The value of limitday as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitday_LessThan(java.math.BigDecimal limitday) {
        regLimitday(CK_LT, limitday);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param limitday The value of limitday as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitday_GreaterEqual(java.math.BigDecimal limitday) {
        regLimitday(CK_GE, limitday);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param limitday The value of limitday as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitday_LessEqual(java.math.BigDecimal limitday) {
        regLimitday(CK_LE, limitday);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of limitday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of limitday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLimitday_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLimitday(), "LIMITDAY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param limitdayList The collection of limitday as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_InScope(Collection<java.math.BigDecimal> limitdayList) {
        doSetLimitday_InScope(limitdayList);
    }

    protected void doSetLimitday_InScope(Collection<java.math.BigDecimal> limitdayList) {
        regINS(CK_INS, cTL(limitdayList), xgetCValueLimitday(), "LIMITDAY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param limitdayList The collection of limitday as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_NotInScope(Collection<java.math.BigDecimal> limitdayList) {
        doSetLimitday_NotInScope(limitdayList);
    }

    protected void doSetLimitday_NotInScope(Collection<java.math.BigDecimal> limitdayList) {
        regINS(CK_NINS, cTL(limitdayList), xgetCValueLimitday(), "LIMITDAY");
    }

    protected void regLimitday(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitday(), "LIMITDAY"); }
    protected abstract ConditionValue xgetCValueLimitday();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]}
     * @param deliverableday The value of deliverableday as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverableday_Equal(Long deliverableday) {
        doSetDeliverableday_Equal(deliverableday);
    }

    protected void doSetDeliverableday_Equal(Long deliverableday) {
        regDeliverableday(CK_EQ, deliverableday);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]}
     * @param deliverableday The value of deliverableday as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverableday_NotEqual(Long deliverableday) {
        doSetDeliverableday_NotEqual(deliverableday);
    }

    protected void doSetDeliverableday_NotEqual(Long deliverableday) {
        regDeliverableday(CK_NES, deliverableday);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]}
     * @param deliverableday The value of deliverableday as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverableday_GreaterThan(Long deliverableday) {
        regDeliverableday(CK_GT, deliverableday);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]}
     * @param deliverableday The value of deliverableday as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverableday_LessThan(Long deliverableday) {
        regDeliverableday(CK_LT, deliverableday);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]}
     * @param deliverableday The value of deliverableday as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverableday_GreaterEqual(Long deliverableday) {
        regDeliverableday(CK_GE, deliverableday);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]}
     * @param deliverableday The value of deliverableday as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverableday_LessEqual(Long deliverableday) {
        regDeliverableday(CK_LE, deliverableday);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of deliverableday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deliverableday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDeliverableday_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDeliverableday(), "DELIVERABLEDAY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]}
     * @param deliverabledayList The collection of deliverableday as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverableday_InScope(Collection<Long> deliverabledayList) {
        doSetDeliverableday_InScope(deliverabledayList);
    }

    protected void doSetDeliverableday_InScope(Collection<Long> deliverabledayList) {
        regINS(CK_INS, cTL(deliverabledayList), xgetCValueDeliverableday(), "DELIVERABLEDAY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]}
     * @param deliverabledayList The collection of deliverableday as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverableday_NotInScope(Collection<Long> deliverabledayList) {
        doSetDeliverableday_NotInScope(deliverabledayList);
    }

    protected void doSetDeliverableday_NotInScope(Collection<Long> deliverabledayList) {
        regINS(CK_NINS, cTL(deliverabledayList), xgetCValueDeliverableday(), "DELIVERABLEDAY");
    }

    protected void regDeliverableday(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliverableday(), "DELIVERABLEDAY"); }
    protected abstract ConditionValue xgetCValueDeliverableday();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param printdateflg The value of printdateflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintdateflg_Equal(java.math.BigDecimal printdateflg) {
        doSetPrintdateflg_Equal(printdateflg);
    }

    protected void doSetPrintdateflg_Equal(java.math.BigDecimal printdateflg) {
        regPrintdateflg(CK_EQ, printdateflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param printdateflg The value of printdateflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintdateflg_NotEqual(java.math.BigDecimal printdateflg) {
        doSetPrintdateflg_NotEqual(printdateflg);
    }

    protected void doSetPrintdateflg_NotEqual(java.math.BigDecimal printdateflg) {
        regPrintdateflg(CK_NES, printdateflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param printdateflg The value of printdateflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintdateflg_GreaterThan(java.math.BigDecimal printdateflg) {
        regPrintdateflg(CK_GT, printdateflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param printdateflg The value of printdateflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintdateflg_LessThan(java.math.BigDecimal printdateflg) {
        regPrintdateflg(CK_LT, printdateflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param printdateflg The value of printdateflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintdateflg_GreaterEqual(java.math.BigDecimal printdateflg) {
        regPrintdateflg(CK_GE, printdateflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param printdateflg The value of printdateflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintdateflg_LessEqual(java.math.BigDecimal printdateflg) {
        regPrintdateflg(CK_LE, printdateflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of printdateflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printdateflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintdateflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintdateflg(), "PRINTDATEFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param printdateflgList The collection of printdateflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintdateflg_InScope(Collection<java.math.BigDecimal> printdateflgList) {
        doSetPrintdateflg_InScope(printdateflgList);
    }

    protected void doSetPrintdateflg_InScope(Collection<java.math.BigDecimal> printdateflgList) {
        regINS(CK_INS, cTL(printdateflgList), xgetCValuePrintdateflg(), "PRINTDATEFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param printdateflgList The collection of printdateflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintdateflg_NotInScope(Collection<java.math.BigDecimal> printdateflgList) {
        doSetPrintdateflg_NotInScope(printdateflgList);
    }

    protected void doSetPrintdateflg_NotInScope(Collection<java.math.BigDecimal> printdateflgList) {
        regINS(CK_NINS, cTL(printdateflgList), xgetCValuePrintdateflg(), "PRINTDATEFLG");
    }

    protected void regPrintdateflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintdateflg(), "PRINTDATEFLG"); }
    protected abstract ConditionValue xgetCValuePrintdateflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_Equal(String suppliercd) {
        doSetSuppliercd_Equal(fRES(suppliercd));
    }

    protected void doSetSuppliercd_Equal(String suppliercd) {
        regSuppliercd(CK_EQ, suppliercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_NotEqual(String suppliercd) {
        doSetSuppliercd_NotEqual(fRES(suppliercd));
    }

    protected void doSetSuppliercd_NotEqual(String suppliercd) {
        regSuppliercd(CK_NES, suppliercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_GreaterThan(String suppliercd) {
        regSuppliercd(CK_GT, fRES(suppliercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_LessThan(String suppliercd) {
        regSuppliercd(CK_LT, fRES(suppliercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_GreaterEqual(String suppliercd) {
        regSuppliercd(CK_GE, fRES(suppliercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_LessEqual(String suppliercd) {
        regSuppliercd(CK_LE, fRES(suppliercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercdList The collection of suppliercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_InScope(Collection<String> suppliercdList) {
        doSetSuppliercd_InScope(suppliercdList);
    }

    protected void doSetSuppliercd_InScope(Collection<String> suppliercdList) {
        regINS(CK_INS, cTL(suppliercdList), xgetCValueSuppliercd(), "SUPPLIERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercdList The collection of suppliercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_NotInScope(Collection<String> suppliercdList) {
        doSetSuppliercd_NotInScope(suppliercdList);
    }

    protected void doSetSuppliercd_NotInScope(Collection<String> suppliercdList) {
        regINS(CK_NINS, cTL(suppliercdList), xgetCValueSuppliercd(), "SUPPLIERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)} <br>
     * <pre>e.g. setSuppliercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param suppliercd The value of suppliercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSuppliercd_LikeSearch(String suppliercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(suppliercd), xgetCValueSuppliercd(), "SUPPLIERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSuppliercd_NotLikeSearch(String suppliercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(suppliercd), xgetCValueSuppliercd(), "SUPPLIERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_PrefixSearch(String suppliercd) {
        setSuppliercd_LikeSearch(suppliercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     */
    public void setSuppliercd_IsNull() { regSuppliercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     */
    public void setSuppliercd_IsNullOrEmpty() { regSuppliercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     */
    public void setSuppliercd_IsNotNull() { regSuppliercd(CK_ISNN, DOBJ); }

    protected void regSuppliercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSuppliercd(), "SUPPLIERCD"); }
    protected abstract ConditionValue xgetCValueSuppliercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISPATCHQTYTYPE: {varchar(30)}
     * @param dispatchqtytype The value of dispatchqtytype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDispatchqtytype_Equal(String dispatchqtytype) {
        doSetDispatchqtytype_Equal(fRES(dispatchqtytype));
    }

    protected void doSetDispatchqtytype_Equal(String dispatchqtytype) {
        regDispatchqtytype(CK_EQ, dispatchqtytype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISPATCHQTYTYPE: {varchar(30)}
     * @param dispatchqtytype The value of dispatchqtytype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDispatchqtytype_NotEqual(String dispatchqtytype) {
        doSetDispatchqtytype_NotEqual(fRES(dispatchqtytype));
    }

    protected void doSetDispatchqtytype_NotEqual(String dispatchqtytype) {
        regDispatchqtytype(CK_NES, dispatchqtytype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISPATCHQTYTYPE: {varchar(30)}
     * @param dispatchqtytype The value of dispatchqtytype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDispatchqtytype_GreaterThan(String dispatchqtytype) {
        regDispatchqtytype(CK_GT, fRES(dispatchqtytype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISPATCHQTYTYPE: {varchar(30)}
     * @param dispatchqtytype The value of dispatchqtytype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDispatchqtytype_LessThan(String dispatchqtytype) {
        regDispatchqtytype(CK_LT, fRES(dispatchqtytype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISPATCHQTYTYPE: {varchar(30)}
     * @param dispatchqtytype The value of dispatchqtytype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDispatchqtytype_GreaterEqual(String dispatchqtytype) {
        regDispatchqtytype(CK_GE, fRES(dispatchqtytype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISPATCHQTYTYPE: {varchar(30)}
     * @param dispatchqtytype The value of dispatchqtytype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDispatchqtytype_LessEqual(String dispatchqtytype) {
        regDispatchqtytype(CK_LE, fRES(dispatchqtytype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISPATCHQTYTYPE: {varchar(30)}
     * @param dispatchqtytypeList The collection of dispatchqtytype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDispatchqtytype_InScope(Collection<String> dispatchqtytypeList) {
        doSetDispatchqtytype_InScope(dispatchqtytypeList);
    }

    protected void doSetDispatchqtytype_InScope(Collection<String> dispatchqtytypeList) {
        regINS(CK_INS, cTL(dispatchqtytypeList), xgetCValueDispatchqtytype(), "DISPATCHQTYTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISPATCHQTYTYPE: {varchar(30)}
     * @param dispatchqtytypeList The collection of dispatchqtytype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDispatchqtytype_NotInScope(Collection<String> dispatchqtytypeList) {
        doSetDispatchqtytype_NotInScope(dispatchqtytypeList);
    }

    protected void doSetDispatchqtytype_NotInScope(Collection<String> dispatchqtytypeList) {
        regINS(CK_NINS, cTL(dispatchqtytypeList), xgetCValueDispatchqtytype(), "DISPATCHQTYTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISPATCHQTYTYPE: {varchar(30)} <br>
     * <pre>e.g. setDispatchqtytype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dispatchqtytype The value of dispatchqtytype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDispatchqtytype_LikeSearch(String dispatchqtytype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dispatchqtytype), xgetCValueDispatchqtytype(), "DISPATCHQTYTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISPATCHQTYTYPE: {varchar(30)}
     * @param dispatchqtytype The value of dispatchqtytype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDispatchqtytype_NotLikeSearch(String dispatchqtytype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dispatchqtytype), xgetCValueDispatchqtytype(), "DISPATCHQTYTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISPATCHQTYTYPE: {varchar(30)}
     * @param dispatchqtytype The value of dispatchqtytype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDispatchqtytype_PrefixSearch(String dispatchqtytype) {
        setDispatchqtytype_LikeSearch(dispatchqtytype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DISPATCHQTYTYPE: {varchar(30)}
     */
    public void setDispatchqtytype_IsNull() { regDispatchqtytype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DISPATCHQTYTYPE: {varchar(30)}
     */
    public void setDispatchqtytype_IsNullOrEmpty() { regDispatchqtytype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DISPATCHQTYTYPE: {varchar(30)}
     */
    public void setDispatchqtytype_IsNotNull() { regDispatchqtytype(CK_ISNN, DOBJ); }

    protected void regDispatchqtytype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDispatchqtytype(), "DISPATCHQTYTYPE"); }
    protected abstract ConditionValue xgetCValueDispatchqtytype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARIFFQTYTYPE: {varchar(30)}
     * @param tariffqtytype The value of tariffqtytype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTariffqtytype_Equal(String tariffqtytype) {
        doSetTariffqtytype_Equal(fRES(tariffqtytype));
    }

    protected void doSetTariffqtytype_Equal(String tariffqtytype) {
        regTariffqtytype(CK_EQ, tariffqtytype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARIFFQTYTYPE: {varchar(30)}
     * @param tariffqtytype The value of tariffqtytype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTariffqtytype_NotEqual(String tariffqtytype) {
        doSetTariffqtytype_NotEqual(fRES(tariffqtytype));
    }

    protected void doSetTariffqtytype_NotEqual(String tariffqtytype) {
        regTariffqtytype(CK_NES, tariffqtytype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARIFFQTYTYPE: {varchar(30)}
     * @param tariffqtytype The value of tariffqtytype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTariffqtytype_GreaterThan(String tariffqtytype) {
        regTariffqtytype(CK_GT, fRES(tariffqtytype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARIFFQTYTYPE: {varchar(30)}
     * @param tariffqtytype The value of tariffqtytype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTariffqtytype_LessThan(String tariffqtytype) {
        regTariffqtytype(CK_LT, fRES(tariffqtytype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARIFFQTYTYPE: {varchar(30)}
     * @param tariffqtytype The value of tariffqtytype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTariffqtytype_GreaterEqual(String tariffqtytype) {
        regTariffqtytype(CK_GE, fRES(tariffqtytype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARIFFQTYTYPE: {varchar(30)}
     * @param tariffqtytype The value of tariffqtytype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTariffqtytype_LessEqual(String tariffqtytype) {
        regTariffqtytype(CK_LE, fRES(tariffqtytype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TARIFFQTYTYPE: {varchar(30)}
     * @param tariffqtytypeList The collection of tariffqtytype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTariffqtytype_InScope(Collection<String> tariffqtytypeList) {
        doSetTariffqtytype_InScope(tariffqtytypeList);
    }

    protected void doSetTariffqtytype_InScope(Collection<String> tariffqtytypeList) {
        regINS(CK_INS, cTL(tariffqtytypeList), xgetCValueTariffqtytype(), "TARIFFQTYTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TARIFFQTYTYPE: {varchar(30)}
     * @param tariffqtytypeList The collection of tariffqtytype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTariffqtytype_NotInScope(Collection<String> tariffqtytypeList) {
        doSetTariffqtytype_NotInScope(tariffqtytypeList);
    }

    protected void doSetTariffqtytype_NotInScope(Collection<String> tariffqtytypeList) {
        regINS(CK_NINS, cTL(tariffqtytypeList), xgetCValueTariffqtytype(), "TARIFFQTYTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TARIFFQTYTYPE: {varchar(30)} <br>
     * <pre>e.g. setTariffqtytype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tariffqtytype The value of tariffqtytype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTariffqtytype_LikeSearch(String tariffqtytype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tariffqtytype), xgetCValueTariffqtytype(), "TARIFFQTYTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TARIFFQTYTYPE: {varchar(30)}
     * @param tariffqtytype The value of tariffqtytype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTariffqtytype_NotLikeSearch(String tariffqtytype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tariffqtytype), xgetCValueTariffqtytype(), "TARIFFQTYTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TARIFFQTYTYPE: {varchar(30)}
     * @param tariffqtytype The value of tariffqtytype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTariffqtytype_PrefixSearch(String tariffqtytype) {
        setTariffqtytype_LikeSearch(tariffqtytype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TARIFFQTYTYPE: {varchar(30)}
     */
    public void setTariffqtytype_IsNull() { regTariffqtytype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TARIFFQTYTYPE: {varchar(30)}
     */
    public void setTariffqtytype_IsNullOrEmpty() { regTariffqtytype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TARIFFQTYTYPE: {varchar(30)}
     */
    public void setTariffqtytype_IsNotNull() { regTariffqtytype(CK_ISNN, DOBJ); }

    protected void regTariffqtytype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTariffqtytype(), "TARIFFQTYTYPE"); }
    protected abstract ConditionValue xgetCValueTariffqtytype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_Equal(String useruse1) {
        doSetUseruse1_Equal(fRES(useruse1));
    }

    protected void doSetUseruse1_Equal(String useruse1) {
        regUseruse1(CK_EQ, useruse1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_NotEqual(String useruse1) {
        doSetUseruse1_NotEqual(fRES(useruse1));
    }

    protected void doSetUseruse1_NotEqual(String useruse1) {
        regUseruse1(CK_NES, useruse1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_GreaterThan(String useruse1) {
        regUseruse1(CK_GT, fRES(useruse1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_LessThan(String useruse1) {
        regUseruse1(CK_LT, fRES(useruse1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_GreaterEqual(String useruse1) {
        regUseruse1(CK_GE, fRES(useruse1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_LessEqual(String useruse1) {
        regUseruse1(CK_LE, fRES(useruse1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1List The collection of useruse1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_InScope(Collection<String> useruse1List) {
        doSetUseruse1_InScope(useruse1List);
    }

    protected void doSetUseruse1_InScope(Collection<String> useruse1List) {
        regINS(CK_INS, cTL(useruse1List), xgetCValueUseruse1(), "USERUSE1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1List The collection of useruse1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_NotInScope(Collection<String> useruse1List) {
        doSetUseruse1_NotInScope(useruse1List);
    }

    protected void doSetUseruse1_NotInScope(Collection<String> useruse1List) {
        regINS(CK_NINS, cTL(useruse1List), xgetCValueUseruse1(), "USERUSE1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE1: {varchar(60)} <br>
     * <pre>e.g. setUseruse1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param useruse1 The value of useruse1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUseruse1_LikeSearch(String useruse1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(useruse1), xgetCValueUseruse1(), "USERUSE1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUseruse1_NotLikeSearch(String useruse1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(useruse1), xgetCValueUseruse1(), "USERUSE1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_PrefixSearch(String useruse1) {
        setUseruse1_LikeSearch(useruse1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     */
    public void setUseruse1_IsNull() { regUseruse1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     */
    public void setUseruse1_IsNullOrEmpty() { regUseruse1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     */
    public void setUseruse1_IsNotNull() { regUseruse1(CK_ISNN, DOBJ); }

    protected void regUseruse1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseruse1(), "USERUSE1"); }
    protected abstract ConditionValue xgetCValueUseruse1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_Equal(String useruse2) {
        doSetUseruse2_Equal(fRES(useruse2));
    }

    protected void doSetUseruse2_Equal(String useruse2) {
        regUseruse2(CK_EQ, useruse2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_NotEqual(String useruse2) {
        doSetUseruse2_NotEqual(fRES(useruse2));
    }

    protected void doSetUseruse2_NotEqual(String useruse2) {
        regUseruse2(CK_NES, useruse2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_GreaterThan(String useruse2) {
        regUseruse2(CK_GT, fRES(useruse2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_LessThan(String useruse2) {
        regUseruse2(CK_LT, fRES(useruse2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_GreaterEqual(String useruse2) {
        regUseruse2(CK_GE, fRES(useruse2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_LessEqual(String useruse2) {
        regUseruse2(CK_LE, fRES(useruse2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2List The collection of useruse2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_InScope(Collection<String> useruse2List) {
        doSetUseruse2_InScope(useruse2List);
    }

    protected void doSetUseruse2_InScope(Collection<String> useruse2List) {
        regINS(CK_INS, cTL(useruse2List), xgetCValueUseruse2(), "USERUSE2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2List The collection of useruse2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_NotInScope(Collection<String> useruse2List) {
        doSetUseruse2_NotInScope(useruse2List);
    }

    protected void doSetUseruse2_NotInScope(Collection<String> useruse2List) {
        regINS(CK_NINS, cTL(useruse2List), xgetCValueUseruse2(), "USERUSE2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE2: {varchar(60)} <br>
     * <pre>e.g. setUseruse2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param useruse2 The value of useruse2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUseruse2_LikeSearch(String useruse2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(useruse2), xgetCValueUseruse2(), "USERUSE2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUseruse2_NotLikeSearch(String useruse2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(useruse2), xgetCValueUseruse2(), "USERUSE2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_PrefixSearch(String useruse2) {
        setUseruse2_LikeSearch(useruse2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     */
    public void setUseruse2_IsNull() { regUseruse2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     */
    public void setUseruse2_IsNullOrEmpty() { regUseruse2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     */
    public void setUseruse2_IsNotNull() { regUseruse2(CK_ISNN, DOBJ); }

    protected void regUseruse2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseruse2(), "USERUSE2"); }
    protected abstract ConditionValue xgetCValueUseruse2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_Equal(String useruse3) {
        doSetUseruse3_Equal(fRES(useruse3));
    }

    protected void doSetUseruse3_Equal(String useruse3) {
        regUseruse3(CK_EQ, useruse3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_NotEqual(String useruse3) {
        doSetUseruse3_NotEqual(fRES(useruse3));
    }

    protected void doSetUseruse3_NotEqual(String useruse3) {
        regUseruse3(CK_NES, useruse3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_GreaterThan(String useruse3) {
        regUseruse3(CK_GT, fRES(useruse3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_LessThan(String useruse3) {
        regUseruse3(CK_LT, fRES(useruse3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_GreaterEqual(String useruse3) {
        regUseruse3(CK_GE, fRES(useruse3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_LessEqual(String useruse3) {
        regUseruse3(CK_LE, fRES(useruse3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3List The collection of useruse3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_InScope(Collection<String> useruse3List) {
        doSetUseruse3_InScope(useruse3List);
    }

    protected void doSetUseruse3_InScope(Collection<String> useruse3List) {
        regINS(CK_INS, cTL(useruse3List), xgetCValueUseruse3(), "USERUSE3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3List The collection of useruse3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_NotInScope(Collection<String> useruse3List) {
        doSetUseruse3_NotInScope(useruse3List);
    }

    protected void doSetUseruse3_NotInScope(Collection<String> useruse3List) {
        regINS(CK_NINS, cTL(useruse3List), xgetCValueUseruse3(), "USERUSE3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE3: {varchar(60)} <br>
     * <pre>e.g. setUseruse3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param useruse3 The value of useruse3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUseruse3_LikeSearch(String useruse3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(useruse3), xgetCValueUseruse3(), "USERUSE3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUseruse3_NotLikeSearch(String useruse3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(useruse3), xgetCValueUseruse3(), "USERUSE3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_PrefixSearch(String useruse3) {
        setUseruse3_LikeSearch(useruse3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     */
    public void setUseruse3_IsNull() { regUseruse3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     */
    public void setUseruse3_IsNullOrEmpty() { regUseruse3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     */
    public void setUseruse3_IsNotNull() { regUseruse3(CK_ISNN, DOBJ); }

    protected void regUseruse3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseruse3(), "USERUSE3"); }
    protected abstract ConditionValue xgetCValueUseruse3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_Equal(String useruse4) {
        doSetUseruse4_Equal(fRES(useruse4));
    }

    protected void doSetUseruse4_Equal(String useruse4) {
        regUseruse4(CK_EQ, useruse4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_NotEqual(String useruse4) {
        doSetUseruse4_NotEqual(fRES(useruse4));
    }

    protected void doSetUseruse4_NotEqual(String useruse4) {
        regUseruse4(CK_NES, useruse4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_GreaterThan(String useruse4) {
        regUseruse4(CK_GT, fRES(useruse4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_LessThan(String useruse4) {
        regUseruse4(CK_LT, fRES(useruse4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_GreaterEqual(String useruse4) {
        regUseruse4(CK_GE, fRES(useruse4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_LessEqual(String useruse4) {
        regUseruse4(CK_LE, fRES(useruse4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4List The collection of useruse4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_InScope(Collection<String> useruse4List) {
        doSetUseruse4_InScope(useruse4List);
    }

    protected void doSetUseruse4_InScope(Collection<String> useruse4List) {
        regINS(CK_INS, cTL(useruse4List), xgetCValueUseruse4(), "USERUSE4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4List The collection of useruse4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_NotInScope(Collection<String> useruse4List) {
        doSetUseruse4_NotInScope(useruse4List);
    }

    protected void doSetUseruse4_NotInScope(Collection<String> useruse4List) {
        regINS(CK_NINS, cTL(useruse4List), xgetCValueUseruse4(), "USERUSE4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE4: {varchar(60)} <br>
     * <pre>e.g. setUseruse4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param useruse4 The value of useruse4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUseruse4_LikeSearch(String useruse4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(useruse4), xgetCValueUseruse4(), "USERUSE4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUseruse4_NotLikeSearch(String useruse4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(useruse4), xgetCValueUseruse4(), "USERUSE4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_PrefixSearch(String useruse4) {
        setUseruse4_LikeSearch(useruse4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     */
    public void setUseruse4_IsNull() { regUseruse4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     */
    public void setUseruse4_IsNullOrEmpty() { regUseruse4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     */
    public void setUseruse4_IsNotNull() { regUseruse4(CK_ISNN, DOBJ); }

    protected void regUseruse4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseruse4(), "USERUSE4"); }
    protected abstract ConditionValue xgetCValueUseruse4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_Equal(String useruse5) {
        doSetUseruse5_Equal(fRES(useruse5));
    }

    protected void doSetUseruse5_Equal(String useruse5) {
        regUseruse5(CK_EQ, useruse5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_NotEqual(String useruse5) {
        doSetUseruse5_NotEqual(fRES(useruse5));
    }

    protected void doSetUseruse5_NotEqual(String useruse5) {
        regUseruse5(CK_NES, useruse5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_GreaterThan(String useruse5) {
        regUseruse5(CK_GT, fRES(useruse5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_LessThan(String useruse5) {
        regUseruse5(CK_LT, fRES(useruse5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_GreaterEqual(String useruse5) {
        regUseruse5(CK_GE, fRES(useruse5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_LessEqual(String useruse5) {
        regUseruse5(CK_LE, fRES(useruse5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5List The collection of useruse5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_InScope(Collection<String> useruse5List) {
        doSetUseruse5_InScope(useruse5List);
    }

    protected void doSetUseruse5_InScope(Collection<String> useruse5List) {
        regINS(CK_INS, cTL(useruse5List), xgetCValueUseruse5(), "USERUSE5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5List The collection of useruse5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_NotInScope(Collection<String> useruse5List) {
        doSetUseruse5_NotInScope(useruse5List);
    }

    protected void doSetUseruse5_NotInScope(Collection<String> useruse5List) {
        regINS(CK_NINS, cTL(useruse5List), xgetCValueUseruse5(), "USERUSE5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE5: {varchar(60)} <br>
     * <pre>e.g. setUseruse5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param useruse5 The value of useruse5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUseruse5_LikeSearch(String useruse5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(useruse5), xgetCValueUseruse5(), "USERUSE5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUseruse5_NotLikeSearch(String useruse5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(useruse5), xgetCValueUseruse5(), "USERUSE5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_PrefixSearch(String useruse5) {
        setUseruse5_LikeSearch(useruse5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     */
    public void setUseruse5_IsNull() { regUseruse5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     */
    public void setUseruse5_IsNullOrEmpty() { regUseruse5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     */
    public void setUseruse5_IsNotNull() { regUseruse5(CK_ISNN, DOBJ); }

    protected void regUseruse5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseruse5(), "USERUSE5"); }
    protected abstract ConditionValue xgetCValueUseruse5();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot1nullflg The value of lot1nullflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot1nullflg_Equal(java.math.BigDecimal lot1nullflg) {
        doSetLot1nullflg_Equal(lot1nullflg);
    }

    protected void doSetLot1nullflg_Equal(java.math.BigDecimal lot1nullflg) {
        regLot1nullflg(CK_EQ, lot1nullflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot1nullflg The value of lot1nullflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot1nullflg_NotEqual(java.math.BigDecimal lot1nullflg) {
        doSetLot1nullflg_NotEqual(lot1nullflg);
    }

    protected void doSetLot1nullflg_NotEqual(java.math.BigDecimal lot1nullflg) {
        regLot1nullflg(CK_NES, lot1nullflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot1nullflg The value of lot1nullflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot1nullflg_GreaterThan(java.math.BigDecimal lot1nullflg) {
        regLot1nullflg(CK_GT, lot1nullflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot1nullflg The value of lot1nullflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot1nullflg_LessThan(java.math.BigDecimal lot1nullflg) {
        regLot1nullflg(CK_LT, lot1nullflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot1nullflg The value of lot1nullflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot1nullflg_GreaterEqual(java.math.BigDecimal lot1nullflg) {
        regLot1nullflg(CK_GE, lot1nullflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot1nullflg The value of lot1nullflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot1nullflg_LessEqual(java.math.BigDecimal lot1nullflg) {
        regLot1nullflg(CK_LE, lot1nullflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of lot1nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lot1nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLot1nullflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLot1nullflg(), "LOT1NULLFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot1nullflgList The collection of lot1nullflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1nullflg_InScope(Collection<java.math.BigDecimal> lot1nullflgList) {
        doSetLot1nullflg_InScope(lot1nullflgList);
    }

    protected void doSetLot1nullflg_InScope(Collection<java.math.BigDecimal> lot1nullflgList) {
        regINS(CK_INS, cTL(lot1nullflgList), xgetCValueLot1nullflg(), "LOT1NULLFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot1nullflgList The collection of lot1nullflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1nullflg_NotInScope(Collection<java.math.BigDecimal> lot1nullflgList) {
        doSetLot1nullflg_NotInScope(lot1nullflgList);
    }

    protected void doSetLot1nullflg_NotInScope(Collection<java.math.BigDecimal> lot1nullflgList) {
        regINS(CK_NINS, cTL(lot1nullflgList), xgetCValueLot1nullflg(), "LOT1NULLFLG");
    }

    protected void regLot1nullflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot1nullflg(), "LOT1NULLFLG"); }
    protected abstract ConditionValue xgetCValueLot1nullflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot2nullflg The value of lot2nullflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot2nullflg_Equal(java.math.BigDecimal lot2nullflg) {
        doSetLot2nullflg_Equal(lot2nullflg);
    }

    protected void doSetLot2nullflg_Equal(java.math.BigDecimal lot2nullflg) {
        regLot2nullflg(CK_EQ, lot2nullflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot2nullflg The value of lot2nullflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot2nullflg_NotEqual(java.math.BigDecimal lot2nullflg) {
        doSetLot2nullflg_NotEqual(lot2nullflg);
    }

    protected void doSetLot2nullflg_NotEqual(java.math.BigDecimal lot2nullflg) {
        regLot2nullflg(CK_NES, lot2nullflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot2nullflg The value of lot2nullflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot2nullflg_GreaterThan(java.math.BigDecimal lot2nullflg) {
        regLot2nullflg(CK_GT, lot2nullflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot2nullflg The value of lot2nullflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot2nullflg_LessThan(java.math.BigDecimal lot2nullflg) {
        regLot2nullflg(CK_LT, lot2nullflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot2nullflg The value of lot2nullflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot2nullflg_GreaterEqual(java.math.BigDecimal lot2nullflg) {
        regLot2nullflg(CK_GE, lot2nullflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot2nullflg The value of lot2nullflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot2nullflg_LessEqual(java.math.BigDecimal lot2nullflg) {
        regLot2nullflg(CK_LE, lot2nullflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of lot2nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lot2nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLot2nullflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLot2nullflg(), "LOT2NULLFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot2nullflgList The collection of lot2nullflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2nullflg_InScope(Collection<java.math.BigDecimal> lot2nullflgList) {
        doSetLot2nullflg_InScope(lot2nullflgList);
    }

    protected void doSetLot2nullflg_InScope(Collection<java.math.BigDecimal> lot2nullflgList) {
        regINS(CK_INS, cTL(lot2nullflgList), xgetCValueLot2nullflg(), "LOT2NULLFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot2nullflgList The collection of lot2nullflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2nullflg_NotInScope(Collection<java.math.BigDecimal> lot2nullflgList) {
        doSetLot2nullflg_NotInScope(lot2nullflgList);
    }

    protected void doSetLot2nullflg_NotInScope(Collection<java.math.BigDecimal> lot2nullflgList) {
        regINS(CK_NINS, cTL(lot2nullflgList), xgetCValueLot2nullflg(), "LOT2NULLFLG");
    }

    protected void regLot2nullflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot2nullflg(), "LOT2NULLFLG"); }
    protected abstract ConditionValue xgetCValueLot2nullflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot3nullflg The value of lot3nullflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot3nullflg_Equal(java.math.BigDecimal lot3nullflg) {
        doSetLot3nullflg_Equal(lot3nullflg);
    }

    protected void doSetLot3nullflg_Equal(java.math.BigDecimal lot3nullflg) {
        regLot3nullflg(CK_EQ, lot3nullflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot3nullflg The value of lot3nullflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot3nullflg_NotEqual(java.math.BigDecimal lot3nullflg) {
        doSetLot3nullflg_NotEqual(lot3nullflg);
    }

    protected void doSetLot3nullflg_NotEqual(java.math.BigDecimal lot3nullflg) {
        regLot3nullflg(CK_NES, lot3nullflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot3nullflg The value of lot3nullflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot3nullflg_GreaterThan(java.math.BigDecimal lot3nullflg) {
        regLot3nullflg(CK_GT, lot3nullflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot3nullflg The value of lot3nullflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot3nullflg_LessThan(java.math.BigDecimal lot3nullflg) {
        regLot3nullflg(CK_LT, lot3nullflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot3nullflg The value of lot3nullflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot3nullflg_GreaterEqual(java.math.BigDecimal lot3nullflg) {
        regLot3nullflg(CK_GE, lot3nullflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot3nullflg The value of lot3nullflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot3nullflg_LessEqual(java.math.BigDecimal lot3nullflg) {
        regLot3nullflg(CK_LE, lot3nullflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of lot3nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lot3nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLot3nullflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLot3nullflg(), "LOT3NULLFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot3nullflgList The collection of lot3nullflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3nullflg_InScope(Collection<java.math.BigDecimal> lot3nullflgList) {
        doSetLot3nullflg_InScope(lot3nullflgList);
    }

    protected void doSetLot3nullflg_InScope(Collection<java.math.BigDecimal> lot3nullflgList) {
        regINS(CK_INS, cTL(lot3nullflgList), xgetCValueLot3nullflg(), "LOT3NULLFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot3nullflgList The collection of lot3nullflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3nullflg_NotInScope(Collection<java.math.BigDecimal> lot3nullflgList) {
        doSetLot3nullflg_NotInScope(lot3nullflgList);
    }

    protected void doSetLot3nullflg_NotInScope(Collection<java.math.BigDecimal> lot3nullflgList) {
        regINS(CK_NINS, cTL(lot3nullflgList), xgetCValueLot3nullflg(), "LOT3NULLFLG");
    }

    protected void regLot3nullflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot3nullflg(), "LOT3NULLFLG"); }
    protected abstract ConditionValue xgetCValueLot3nullflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot4nullflg The value of lot4nullflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot4nullflg_Equal(java.math.BigDecimal lot4nullflg) {
        doSetLot4nullflg_Equal(lot4nullflg);
    }

    protected void doSetLot4nullflg_Equal(java.math.BigDecimal lot4nullflg) {
        regLot4nullflg(CK_EQ, lot4nullflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot4nullflg The value of lot4nullflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot4nullflg_NotEqual(java.math.BigDecimal lot4nullflg) {
        doSetLot4nullflg_NotEqual(lot4nullflg);
    }

    protected void doSetLot4nullflg_NotEqual(java.math.BigDecimal lot4nullflg) {
        regLot4nullflg(CK_NES, lot4nullflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot4nullflg The value of lot4nullflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot4nullflg_GreaterThan(java.math.BigDecimal lot4nullflg) {
        regLot4nullflg(CK_GT, lot4nullflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot4nullflg The value of lot4nullflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot4nullflg_LessThan(java.math.BigDecimal lot4nullflg) {
        regLot4nullflg(CK_LT, lot4nullflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot4nullflg The value of lot4nullflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot4nullflg_GreaterEqual(java.math.BigDecimal lot4nullflg) {
        regLot4nullflg(CK_GE, lot4nullflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot4nullflg The value of lot4nullflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot4nullflg_LessEqual(java.math.BigDecimal lot4nullflg) {
        regLot4nullflg(CK_LE, lot4nullflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of lot4nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lot4nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLot4nullflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLot4nullflg(), "LOT4NULLFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot4nullflgList The collection of lot4nullflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4nullflg_InScope(Collection<java.math.BigDecimal> lot4nullflgList) {
        doSetLot4nullflg_InScope(lot4nullflgList);
    }

    protected void doSetLot4nullflg_InScope(Collection<java.math.BigDecimal> lot4nullflgList) {
        regINS(CK_INS, cTL(lot4nullflgList), xgetCValueLot4nullflg(), "LOT4NULLFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot4nullflgList The collection of lot4nullflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4nullflg_NotInScope(Collection<java.math.BigDecimal> lot4nullflgList) {
        doSetLot4nullflg_NotInScope(lot4nullflgList);
    }

    protected void doSetLot4nullflg_NotInScope(Collection<java.math.BigDecimal> lot4nullflgList) {
        regINS(CK_NINS, cTL(lot4nullflgList), xgetCValueLot4nullflg(), "LOT4NULLFLG");
    }

    protected void regLot4nullflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot4nullflg(), "LOT4NULLFLG"); }
    protected abstract ConditionValue xgetCValueLot4nullflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot5nullflg The value of lot5nullflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot5nullflg_Equal(java.math.BigDecimal lot5nullflg) {
        doSetLot5nullflg_Equal(lot5nullflg);
    }

    protected void doSetLot5nullflg_Equal(java.math.BigDecimal lot5nullflg) {
        regLot5nullflg(CK_EQ, lot5nullflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot5nullflg The value of lot5nullflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot5nullflg_NotEqual(java.math.BigDecimal lot5nullflg) {
        doSetLot5nullflg_NotEqual(lot5nullflg);
    }

    protected void doSetLot5nullflg_NotEqual(java.math.BigDecimal lot5nullflg) {
        regLot5nullflg(CK_NES, lot5nullflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot5nullflg The value of lot5nullflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot5nullflg_GreaterThan(java.math.BigDecimal lot5nullflg) {
        regLot5nullflg(CK_GT, lot5nullflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot5nullflg The value of lot5nullflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot5nullflg_LessThan(java.math.BigDecimal lot5nullflg) {
        regLot5nullflg(CK_LT, lot5nullflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot5nullflg The value of lot5nullflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot5nullflg_GreaterEqual(java.math.BigDecimal lot5nullflg) {
        regLot5nullflg(CK_GE, lot5nullflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot5nullflg The value of lot5nullflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLot5nullflg_LessEqual(java.math.BigDecimal lot5nullflg) {
        regLot5nullflg(CK_LE, lot5nullflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of lot5nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lot5nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLot5nullflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLot5nullflg(), "LOT5NULLFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot5nullflgList The collection of lot5nullflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5nullflg_InScope(Collection<java.math.BigDecimal> lot5nullflgList) {
        doSetLot5nullflg_InScope(lot5nullflgList);
    }

    protected void doSetLot5nullflg_InScope(Collection<java.math.BigDecimal> lot5nullflgList) {
        regINS(CK_INS, cTL(lot5nullflgList), xgetCValueLot5nullflg(), "LOT5NULLFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param lot5nullflgList The collection of lot5nullflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5nullflg_NotInScope(Collection<java.math.BigDecimal> lot5nullflgList) {
        doSetLot5nullflg_NotInScope(lot5nullflgList);
    }

    protected void doSetLot5nullflg_NotInScope(Collection<java.math.BigDecimal> lot5nullflgList) {
        regINS(CK_NINS, cTL(lot5nullflgList), xgetCValueLot5nullflg(), "LOT5NULLFLG");
    }

    protected void regLot5nullflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot5nullflg(), "LOT5NULLFLG"); }
    protected abstract ConditionValue xgetCValueLot5nullflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot1nullflg The value of otherlot1nullflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot1nullflg_Equal(java.math.BigDecimal otherlot1nullflg) {
        doSetOtherlot1nullflg_Equal(otherlot1nullflg);
    }

    protected void doSetOtherlot1nullflg_Equal(java.math.BigDecimal otherlot1nullflg) {
        regOtherlot1nullflg(CK_EQ, otherlot1nullflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot1nullflg The value of otherlot1nullflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot1nullflg_NotEqual(java.math.BigDecimal otherlot1nullflg) {
        doSetOtherlot1nullflg_NotEqual(otherlot1nullflg);
    }

    protected void doSetOtherlot1nullflg_NotEqual(java.math.BigDecimal otherlot1nullflg) {
        regOtherlot1nullflg(CK_NES, otherlot1nullflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot1nullflg The value of otherlot1nullflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot1nullflg_GreaterThan(java.math.BigDecimal otherlot1nullflg) {
        regOtherlot1nullflg(CK_GT, otherlot1nullflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot1nullflg The value of otherlot1nullflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot1nullflg_LessThan(java.math.BigDecimal otherlot1nullflg) {
        regOtherlot1nullflg(CK_LT, otherlot1nullflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot1nullflg The value of otherlot1nullflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot1nullflg_GreaterEqual(java.math.BigDecimal otherlot1nullflg) {
        regOtherlot1nullflg(CK_GE, otherlot1nullflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot1nullflg The value of otherlot1nullflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot1nullflg_LessEqual(java.math.BigDecimal otherlot1nullflg) {
        regOtherlot1nullflg(CK_LE, otherlot1nullflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of otherlot1nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of otherlot1nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOtherlot1nullflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOtherlot1nullflg(), "OTHERLOT1NULLFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot1nullflgList The collection of otherlot1nullflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1nullflg_InScope(Collection<java.math.BigDecimal> otherlot1nullflgList) {
        doSetOtherlot1nullflg_InScope(otherlot1nullflgList);
    }

    protected void doSetOtherlot1nullflg_InScope(Collection<java.math.BigDecimal> otherlot1nullflgList) {
        regINS(CK_INS, cTL(otherlot1nullflgList), xgetCValueOtherlot1nullflg(), "OTHERLOT1NULLFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot1nullflgList The collection of otherlot1nullflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1nullflg_NotInScope(Collection<java.math.BigDecimal> otherlot1nullflgList) {
        doSetOtherlot1nullflg_NotInScope(otherlot1nullflgList);
    }

    protected void doSetOtherlot1nullflg_NotInScope(Collection<java.math.BigDecimal> otherlot1nullflgList) {
        regINS(CK_NINS, cTL(otherlot1nullflgList), xgetCValueOtherlot1nullflg(), "OTHERLOT1NULLFLG");
    }

    protected void regOtherlot1nullflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot1nullflg(), "OTHERLOT1NULLFLG"); }
    protected abstract ConditionValue xgetCValueOtherlot1nullflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot2nullflg The value of otherlot2nullflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot2nullflg_Equal(java.math.BigDecimal otherlot2nullflg) {
        doSetOtherlot2nullflg_Equal(otherlot2nullflg);
    }

    protected void doSetOtherlot2nullflg_Equal(java.math.BigDecimal otherlot2nullflg) {
        regOtherlot2nullflg(CK_EQ, otherlot2nullflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot2nullflg The value of otherlot2nullflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot2nullflg_NotEqual(java.math.BigDecimal otherlot2nullflg) {
        doSetOtherlot2nullflg_NotEqual(otherlot2nullflg);
    }

    protected void doSetOtherlot2nullflg_NotEqual(java.math.BigDecimal otherlot2nullflg) {
        regOtherlot2nullflg(CK_NES, otherlot2nullflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot2nullflg The value of otherlot2nullflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot2nullflg_GreaterThan(java.math.BigDecimal otherlot2nullflg) {
        regOtherlot2nullflg(CK_GT, otherlot2nullflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot2nullflg The value of otherlot2nullflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot2nullflg_LessThan(java.math.BigDecimal otherlot2nullflg) {
        regOtherlot2nullflg(CK_LT, otherlot2nullflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot2nullflg The value of otherlot2nullflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot2nullflg_GreaterEqual(java.math.BigDecimal otherlot2nullflg) {
        regOtherlot2nullflg(CK_GE, otherlot2nullflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot2nullflg The value of otherlot2nullflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot2nullflg_LessEqual(java.math.BigDecimal otherlot2nullflg) {
        regOtherlot2nullflg(CK_LE, otherlot2nullflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of otherlot2nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of otherlot2nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOtherlot2nullflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOtherlot2nullflg(), "OTHERLOT2NULLFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot2nullflgList The collection of otherlot2nullflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2nullflg_InScope(Collection<java.math.BigDecimal> otherlot2nullflgList) {
        doSetOtherlot2nullflg_InScope(otherlot2nullflgList);
    }

    protected void doSetOtherlot2nullflg_InScope(Collection<java.math.BigDecimal> otherlot2nullflgList) {
        regINS(CK_INS, cTL(otherlot2nullflgList), xgetCValueOtherlot2nullflg(), "OTHERLOT2NULLFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot2nullflgList The collection of otherlot2nullflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2nullflg_NotInScope(Collection<java.math.BigDecimal> otherlot2nullflgList) {
        doSetOtherlot2nullflg_NotInScope(otherlot2nullflgList);
    }

    protected void doSetOtherlot2nullflg_NotInScope(Collection<java.math.BigDecimal> otherlot2nullflgList) {
        regINS(CK_NINS, cTL(otherlot2nullflgList), xgetCValueOtherlot2nullflg(), "OTHERLOT2NULLFLG");
    }

    protected void regOtherlot2nullflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot2nullflg(), "OTHERLOT2NULLFLG"); }
    protected abstract ConditionValue xgetCValueOtherlot2nullflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot3nullflg The value of otherlot3nullflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot3nullflg_Equal(java.math.BigDecimal otherlot3nullflg) {
        doSetOtherlot3nullflg_Equal(otherlot3nullflg);
    }

    protected void doSetOtherlot3nullflg_Equal(java.math.BigDecimal otherlot3nullflg) {
        regOtherlot3nullflg(CK_EQ, otherlot3nullflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot3nullflg The value of otherlot3nullflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot3nullflg_NotEqual(java.math.BigDecimal otherlot3nullflg) {
        doSetOtherlot3nullflg_NotEqual(otherlot3nullflg);
    }

    protected void doSetOtherlot3nullflg_NotEqual(java.math.BigDecimal otherlot3nullflg) {
        regOtherlot3nullflg(CK_NES, otherlot3nullflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot3nullflg The value of otherlot3nullflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot3nullflg_GreaterThan(java.math.BigDecimal otherlot3nullflg) {
        regOtherlot3nullflg(CK_GT, otherlot3nullflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot3nullflg The value of otherlot3nullflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot3nullflg_LessThan(java.math.BigDecimal otherlot3nullflg) {
        regOtherlot3nullflg(CK_LT, otherlot3nullflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot3nullflg The value of otherlot3nullflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot3nullflg_GreaterEqual(java.math.BigDecimal otherlot3nullflg) {
        regOtherlot3nullflg(CK_GE, otherlot3nullflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot3nullflg The value of otherlot3nullflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot3nullflg_LessEqual(java.math.BigDecimal otherlot3nullflg) {
        regOtherlot3nullflg(CK_LE, otherlot3nullflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of otherlot3nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of otherlot3nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOtherlot3nullflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOtherlot3nullflg(), "OTHERLOT3NULLFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot3nullflgList The collection of otherlot3nullflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3nullflg_InScope(Collection<java.math.BigDecimal> otherlot3nullflgList) {
        doSetOtherlot3nullflg_InScope(otherlot3nullflgList);
    }

    protected void doSetOtherlot3nullflg_InScope(Collection<java.math.BigDecimal> otherlot3nullflgList) {
        regINS(CK_INS, cTL(otherlot3nullflgList), xgetCValueOtherlot3nullflg(), "OTHERLOT3NULLFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot3nullflgList The collection of otherlot3nullflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3nullflg_NotInScope(Collection<java.math.BigDecimal> otherlot3nullflgList) {
        doSetOtherlot3nullflg_NotInScope(otherlot3nullflgList);
    }

    protected void doSetOtherlot3nullflg_NotInScope(Collection<java.math.BigDecimal> otherlot3nullflgList) {
        regINS(CK_NINS, cTL(otherlot3nullflgList), xgetCValueOtherlot3nullflg(), "OTHERLOT3NULLFLG");
    }

    protected void regOtherlot3nullflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot3nullflg(), "OTHERLOT3NULLFLG"); }
    protected abstract ConditionValue xgetCValueOtherlot3nullflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot4nullflg The value of otherlot4nullflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot4nullflg_Equal(java.math.BigDecimal otherlot4nullflg) {
        doSetOtherlot4nullflg_Equal(otherlot4nullflg);
    }

    protected void doSetOtherlot4nullflg_Equal(java.math.BigDecimal otherlot4nullflg) {
        regOtherlot4nullflg(CK_EQ, otherlot4nullflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot4nullflg The value of otherlot4nullflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot4nullflg_NotEqual(java.math.BigDecimal otherlot4nullflg) {
        doSetOtherlot4nullflg_NotEqual(otherlot4nullflg);
    }

    protected void doSetOtherlot4nullflg_NotEqual(java.math.BigDecimal otherlot4nullflg) {
        regOtherlot4nullflg(CK_NES, otherlot4nullflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot4nullflg The value of otherlot4nullflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot4nullflg_GreaterThan(java.math.BigDecimal otherlot4nullflg) {
        regOtherlot4nullflg(CK_GT, otherlot4nullflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot4nullflg The value of otherlot4nullflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot4nullflg_LessThan(java.math.BigDecimal otherlot4nullflg) {
        regOtherlot4nullflg(CK_LT, otherlot4nullflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot4nullflg The value of otherlot4nullflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot4nullflg_GreaterEqual(java.math.BigDecimal otherlot4nullflg) {
        regOtherlot4nullflg(CK_GE, otherlot4nullflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot4nullflg The value of otherlot4nullflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot4nullflg_LessEqual(java.math.BigDecimal otherlot4nullflg) {
        regOtherlot4nullflg(CK_LE, otherlot4nullflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of otherlot4nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of otherlot4nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOtherlot4nullflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOtherlot4nullflg(), "OTHERLOT4NULLFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot4nullflgList The collection of otherlot4nullflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4nullflg_InScope(Collection<java.math.BigDecimal> otherlot4nullflgList) {
        doSetOtherlot4nullflg_InScope(otherlot4nullflgList);
    }

    protected void doSetOtherlot4nullflg_InScope(Collection<java.math.BigDecimal> otherlot4nullflgList) {
        regINS(CK_INS, cTL(otherlot4nullflgList), xgetCValueOtherlot4nullflg(), "OTHERLOT4NULLFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot4nullflgList The collection of otherlot4nullflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4nullflg_NotInScope(Collection<java.math.BigDecimal> otherlot4nullflgList) {
        doSetOtherlot4nullflg_NotInScope(otherlot4nullflgList);
    }

    protected void doSetOtherlot4nullflg_NotInScope(Collection<java.math.BigDecimal> otherlot4nullflgList) {
        regINS(CK_NINS, cTL(otherlot4nullflgList), xgetCValueOtherlot4nullflg(), "OTHERLOT4NULLFLG");
    }

    protected void regOtherlot4nullflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot4nullflg(), "OTHERLOT4NULLFLG"); }
    protected abstract ConditionValue xgetCValueOtherlot4nullflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot5nullflg The value of otherlot5nullflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5nullflg_Equal(java.math.BigDecimal otherlot5nullflg) {
        doSetOtherlot5nullflg_Equal(otherlot5nullflg);
    }

    protected void doSetOtherlot5nullflg_Equal(java.math.BigDecimal otherlot5nullflg) {
        regOtherlot5nullflg(CK_EQ, otherlot5nullflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot5nullflg The value of otherlot5nullflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5nullflg_NotEqual(java.math.BigDecimal otherlot5nullflg) {
        doSetOtherlot5nullflg_NotEqual(otherlot5nullflg);
    }

    protected void doSetOtherlot5nullflg_NotEqual(java.math.BigDecimal otherlot5nullflg) {
        regOtherlot5nullflg(CK_NES, otherlot5nullflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot5nullflg The value of otherlot5nullflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5nullflg_GreaterThan(java.math.BigDecimal otherlot5nullflg) {
        regOtherlot5nullflg(CK_GT, otherlot5nullflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot5nullflg The value of otherlot5nullflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5nullflg_LessThan(java.math.BigDecimal otherlot5nullflg) {
        regOtherlot5nullflg(CK_LT, otherlot5nullflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot5nullflg The value of otherlot5nullflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5nullflg_GreaterEqual(java.math.BigDecimal otherlot5nullflg) {
        regOtherlot5nullflg(CK_GE, otherlot5nullflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot5nullflg The value of otherlot5nullflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5nullflg_LessEqual(java.math.BigDecimal otherlot5nullflg) {
        regOtherlot5nullflg(CK_LE, otherlot5nullflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of otherlot5nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of otherlot5nullflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOtherlot5nullflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOtherlot5nullflg(), "OTHERLOT5NULLFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot5nullflgList The collection of otherlot5nullflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot5nullflg_InScope(Collection<java.math.BigDecimal> otherlot5nullflgList) {
        doSetOtherlot5nullflg_InScope(otherlot5nullflgList);
    }

    protected void doSetOtherlot5nullflg_InScope(Collection<java.math.BigDecimal> otherlot5nullflgList) {
        regINS(CK_INS, cTL(otherlot5nullflgList), xgetCValueOtherlot5nullflg(), "OTHERLOT5NULLFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param otherlot5nullflgList The collection of otherlot5nullflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot5nullflg_NotInScope(Collection<java.math.BigDecimal> otherlot5nullflgList) {
        doSetOtherlot5nullflg_NotInScope(otherlot5nullflgList);
    }

    protected void doSetOtherlot5nullflg_NotInScope(Collection<java.math.BigDecimal> otherlot5nullflgList) {
        regINS(CK_NINS, cTL(otherlot5nullflgList), xgetCValueOtherlot5nullflg(), "OTHERLOT5NULLFLG");
    }

    protected void regOtherlot5nullflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot5nullflg(), "OTHERLOT5NULLFLG"); }
    protected abstract ConditionValue xgetCValueOtherlot5nullflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMPRINTNAME: {varchar(255)}
     * @param itemprintname The value of itemprintname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemprintname_Equal(String itemprintname) {
        doSetItemprintname_Equal(fRES(itemprintname));
    }

    protected void doSetItemprintname_Equal(String itemprintname) {
        regItemprintname(CK_EQ, itemprintname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMPRINTNAME: {varchar(255)}
     * @param itemprintname The value of itemprintname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemprintname_NotEqual(String itemprintname) {
        doSetItemprintname_NotEqual(fRES(itemprintname));
    }

    protected void doSetItemprintname_NotEqual(String itemprintname) {
        regItemprintname(CK_NES, itemprintname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMPRINTNAME: {varchar(255)}
     * @param itemprintname The value of itemprintname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemprintname_GreaterThan(String itemprintname) {
        regItemprintname(CK_GT, fRES(itemprintname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMPRINTNAME: {varchar(255)}
     * @param itemprintname The value of itemprintname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemprintname_LessThan(String itemprintname) {
        regItemprintname(CK_LT, fRES(itemprintname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMPRINTNAME: {varchar(255)}
     * @param itemprintname The value of itemprintname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemprintname_GreaterEqual(String itemprintname) {
        regItemprintname(CK_GE, fRES(itemprintname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMPRINTNAME: {varchar(255)}
     * @param itemprintname The value of itemprintname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemprintname_LessEqual(String itemprintname) {
        regItemprintname(CK_LE, fRES(itemprintname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMPRINTNAME: {varchar(255)}
     * @param itemprintnameList The collection of itemprintname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemprintname_InScope(Collection<String> itemprintnameList) {
        doSetItemprintname_InScope(itemprintnameList);
    }

    protected void doSetItemprintname_InScope(Collection<String> itemprintnameList) {
        regINS(CK_INS, cTL(itemprintnameList), xgetCValueItemprintname(), "ITEMPRINTNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMPRINTNAME: {varchar(255)}
     * @param itemprintnameList The collection of itemprintname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemprintname_NotInScope(Collection<String> itemprintnameList) {
        doSetItemprintname_NotInScope(itemprintnameList);
    }

    protected void doSetItemprintname_NotInScope(Collection<String> itemprintnameList) {
        regINS(CK_NINS, cTL(itemprintnameList), xgetCValueItemprintname(), "ITEMPRINTNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMPRINTNAME: {varchar(255)} <br>
     * <pre>e.g. setItemprintname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemprintname The value of itemprintname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemprintname_LikeSearch(String itemprintname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemprintname), xgetCValueItemprintname(), "ITEMPRINTNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMPRINTNAME: {varchar(255)}
     * @param itemprintname The value of itemprintname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemprintname_NotLikeSearch(String itemprintname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemprintname), xgetCValueItemprintname(), "ITEMPRINTNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMPRINTNAME: {varchar(255)}
     * @param itemprintname The value of itemprintname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemprintname_PrefixSearch(String itemprintname) {
        setItemprintname_LikeSearch(itemprintname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMPRINTNAME: {varchar(255)}
     */
    public void setItemprintname_IsNull() { regItemprintname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMPRINTNAME: {varchar(255)}
     */
    public void setItemprintname_IsNullOrEmpty() { regItemprintname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMPRINTNAME: {varchar(255)}
     */
    public void setItemprintname_IsNotNull() { regItemprintname(CK_ISNN, DOBJ); }

    protected void regItemprintname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemprintname(), "ITEMPRINTNAME"); }
    protected abstract ConditionValue xgetCValueItemprintname();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param pricelevel The value of pricelevel as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPricelevel_Equal(java.math.BigDecimal pricelevel) {
        doSetPricelevel_Equal(pricelevel);
    }

    protected void doSetPricelevel_Equal(java.math.BigDecimal pricelevel) {
        regPricelevel(CK_EQ, pricelevel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param pricelevel The value of pricelevel as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPricelevel_NotEqual(java.math.BigDecimal pricelevel) {
        doSetPricelevel_NotEqual(pricelevel);
    }

    protected void doSetPricelevel_NotEqual(java.math.BigDecimal pricelevel) {
        regPricelevel(CK_NES, pricelevel);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param pricelevel The value of pricelevel as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPricelevel_GreaterThan(java.math.BigDecimal pricelevel) {
        regPricelevel(CK_GT, pricelevel);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param pricelevel The value of pricelevel as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPricelevel_LessThan(java.math.BigDecimal pricelevel) {
        regPricelevel(CK_LT, pricelevel);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param pricelevel The value of pricelevel as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPricelevel_GreaterEqual(java.math.BigDecimal pricelevel) {
        regPricelevel(CK_GE, pricelevel);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param pricelevel The value of pricelevel as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPricelevel_LessEqual(java.math.BigDecimal pricelevel) {
        regPricelevel(CK_LE, pricelevel);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of pricelevel. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pricelevel. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPricelevel_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePricelevel(), "PRICELEVEL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param pricelevelList The collection of pricelevel as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPricelevel_InScope(Collection<java.math.BigDecimal> pricelevelList) {
        doSetPricelevel_InScope(pricelevelList);
    }

    protected void doSetPricelevel_InScope(Collection<java.math.BigDecimal> pricelevelList) {
        regINS(CK_INS, cTL(pricelevelList), xgetCValuePricelevel(), "PRICELEVEL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]}
     * @param pricelevelList The collection of pricelevel as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPricelevel_NotInScope(Collection<java.math.BigDecimal> pricelevelList) {
        doSetPricelevel_NotInScope(pricelevelList);
    }

    protected void doSetPricelevel_NotInScope(Collection<java.math.BigDecimal> pricelevelList) {
        regINS(CK_NINS, cTL(pricelevelList), xgetCValuePricelevel(), "PRICELEVEL");
    }

    protected void regPricelevel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePricelevel(), "PRICELEVEL"); }
    protected abstract ConditionValue xgetCValuePricelevel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurl The value of itemcatalogurl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_Equal(String itemcatalogurl) {
        doSetItemcatalogurl_Equal(fRES(itemcatalogurl));
    }

    protected void doSetItemcatalogurl_Equal(String itemcatalogurl) {
        regItemcatalogurl(CK_EQ, itemcatalogurl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurl The value of itemcatalogurl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_NotEqual(String itemcatalogurl) {
        doSetItemcatalogurl_NotEqual(fRES(itemcatalogurl));
    }

    protected void doSetItemcatalogurl_NotEqual(String itemcatalogurl) {
        regItemcatalogurl(CK_NES, itemcatalogurl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurl The value of itemcatalogurl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_GreaterThan(String itemcatalogurl) {
        regItemcatalogurl(CK_GT, fRES(itemcatalogurl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurl The value of itemcatalogurl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_LessThan(String itemcatalogurl) {
        regItemcatalogurl(CK_LT, fRES(itemcatalogurl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurl The value of itemcatalogurl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_GreaterEqual(String itemcatalogurl) {
        regItemcatalogurl(CK_GE, fRES(itemcatalogurl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurl The value of itemcatalogurl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_LessEqual(String itemcatalogurl) {
        regItemcatalogurl(CK_LE, fRES(itemcatalogurl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurlList The collection of itemcatalogurl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_InScope(Collection<String> itemcatalogurlList) {
        doSetItemcatalogurl_InScope(itemcatalogurlList);
    }

    protected void doSetItemcatalogurl_InScope(Collection<String> itemcatalogurlList) {
        regINS(CK_INS, cTL(itemcatalogurlList), xgetCValueItemcatalogurl(), "ITEMCATALOGURL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurlList The collection of itemcatalogurl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_NotInScope(Collection<String> itemcatalogurlList) {
        doSetItemcatalogurl_NotInScope(itemcatalogurlList);
    }

    protected void doSetItemcatalogurl_NotInScope(Collection<String> itemcatalogurlList) {
        regINS(CK_NINS, cTL(itemcatalogurlList), xgetCValueItemcatalogurl(), "ITEMCATALOGURL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)} <br>
     * <pre>e.g. setItemcatalogurl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcatalogurl The value of itemcatalogurl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcatalogurl_LikeSearch(String itemcatalogurl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcatalogurl), xgetCValueItemcatalogurl(), "ITEMCATALOGURL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurl The value of itemcatalogurl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcatalogurl_NotLikeSearch(String itemcatalogurl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcatalogurl), xgetCValueItemcatalogurl(), "ITEMCATALOGURL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurl The value of itemcatalogurl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_PrefixSearch(String itemcatalogurl) {
        setItemcatalogurl_LikeSearch(itemcatalogurl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     */
    public void setItemcatalogurl_IsNull() { regItemcatalogurl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     */
    public void setItemcatalogurl_IsNullOrEmpty() { regItemcatalogurl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     */
    public void setItemcatalogurl_IsNotNull() { regItemcatalogurl(CK_ISNN, DOBJ); }

    protected void regItemcatalogurl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcatalogurl(), "ITEMCATALOGURL"); }
    protected abstract ConditionValue xgetCValueItemcatalogurl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {bigint(19), default=[(0)]}
     * @param usernum1 The value of usernum1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum1_Equal(Long usernum1) {
        doSetUsernum1_Equal(usernum1);
    }

    protected void doSetUsernum1_Equal(Long usernum1) {
        regUsernum1(CK_EQ, usernum1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {bigint(19), default=[(0)]}
     * @param usernum1 The value of usernum1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum1_NotEqual(Long usernum1) {
        doSetUsernum1_NotEqual(usernum1);
    }

    protected void doSetUsernum1_NotEqual(Long usernum1) {
        regUsernum1(CK_NES, usernum1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {bigint(19), default=[(0)]}
     * @param usernum1 The value of usernum1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum1_GreaterThan(Long usernum1) {
        regUsernum1(CK_GT, usernum1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {bigint(19), default=[(0)]}
     * @param usernum1 The value of usernum1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum1_LessThan(Long usernum1) {
        regUsernum1(CK_LT, usernum1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {bigint(19), default=[(0)]}
     * @param usernum1 The value of usernum1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum1_GreaterEqual(Long usernum1) {
        regUsernum1(CK_GE, usernum1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {bigint(19), default=[(0)]}
     * @param usernum1 The value of usernum1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum1_LessEqual(Long usernum1) {
        regUsernum1(CK_LE, usernum1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {bigint(19), default=[(0)]}
     * @param minNumber The min number of usernum1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of usernum1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUsernum1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUsernum1(), "USERNUM1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USERNUM1: {bigint(19), default=[(0)]}
     * @param usernum1List The collection of usernum1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_InScope(Collection<Long> usernum1List) {
        doSetUsernum1_InScope(usernum1List);
    }

    protected void doSetUsernum1_InScope(Collection<Long> usernum1List) {
        regINS(CK_INS, cTL(usernum1List), xgetCValueUsernum1(), "USERNUM1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USERNUM1: {bigint(19), default=[(0)]}
     * @param usernum1List The collection of usernum1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_NotInScope(Collection<Long> usernum1List) {
        doSetUsernum1_NotInScope(usernum1List);
    }

    protected void doSetUsernum1_NotInScope(Collection<Long> usernum1List) {
        regINS(CK_NINS, cTL(usernum1List), xgetCValueUsernum1(), "USERNUM1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERNUM1: {bigint(19), default=[(0)]}
     */
    public void setUsernum1_IsNull() { regUsernum1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERNUM1: {bigint(19), default=[(0)]}
     */
    public void setUsernum1_IsNotNull() { regUsernum1(CK_ISNN, DOBJ); }

    protected void regUsernum1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsernum1(), "USERNUM1"); }
    protected abstract ConditionValue xgetCValueUsernum1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM2: {bigint(19), default=[(0)]}
     * @param usernum2 The value of usernum2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum2_Equal(Long usernum2) {
        doSetUsernum2_Equal(usernum2);
    }

    protected void doSetUsernum2_Equal(Long usernum2) {
        regUsernum2(CK_EQ, usernum2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM2: {bigint(19), default=[(0)]}
     * @param usernum2 The value of usernum2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum2_NotEqual(Long usernum2) {
        doSetUsernum2_NotEqual(usernum2);
    }

    protected void doSetUsernum2_NotEqual(Long usernum2) {
        regUsernum2(CK_NES, usernum2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM2: {bigint(19), default=[(0)]}
     * @param usernum2 The value of usernum2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum2_GreaterThan(Long usernum2) {
        regUsernum2(CK_GT, usernum2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM2: {bigint(19), default=[(0)]}
     * @param usernum2 The value of usernum2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum2_LessThan(Long usernum2) {
        regUsernum2(CK_LT, usernum2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM2: {bigint(19), default=[(0)]}
     * @param usernum2 The value of usernum2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum2_GreaterEqual(Long usernum2) {
        regUsernum2(CK_GE, usernum2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM2: {bigint(19), default=[(0)]}
     * @param usernum2 The value of usernum2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum2_LessEqual(Long usernum2) {
        regUsernum2(CK_LE, usernum2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM2: {bigint(19), default=[(0)]}
     * @param minNumber The min number of usernum2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of usernum2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUsernum2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUsernum2(), "USERNUM2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USERNUM2: {bigint(19), default=[(0)]}
     * @param usernum2List The collection of usernum2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum2_InScope(Collection<Long> usernum2List) {
        doSetUsernum2_InScope(usernum2List);
    }

    protected void doSetUsernum2_InScope(Collection<Long> usernum2List) {
        regINS(CK_INS, cTL(usernum2List), xgetCValueUsernum2(), "USERNUM2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USERNUM2: {bigint(19), default=[(0)]}
     * @param usernum2List The collection of usernum2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum2_NotInScope(Collection<Long> usernum2List) {
        doSetUsernum2_NotInScope(usernum2List);
    }

    protected void doSetUsernum2_NotInScope(Collection<Long> usernum2List) {
        regINS(CK_NINS, cTL(usernum2List), xgetCValueUsernum2(), "USERNUM2");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERNUM2: {bigint(19), default=[(0)]}
     */
    public void setUsernum2_IsNull() { regUsernum2(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERNUM2: {bigint(19), default=[(0)]}
     */
    public void setUsernum2_IsNotNull() { regUsernum2(CK_ISNN, DOBJ); }

    protected void regUsernum2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsernum2(), "USERNUM2"); }
    protected abstract ConditionValue xgetCValueUsernum2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {bigint(19), default=[(0)]}
     * @param usernum3 The value of usernum3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_Equal(Long usernum3) {
        doSetUsernum3_Equal(usernum3);
    }

    protected void doSetUsernum3_Equal(Long usernum3) {
        regUsernum3(CK_EQ, usernum3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {bigint(19), default=[(0)]}
     * @param usernum3 The value of usernum3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_NotEqual(Long usernum3) {
        doSetUsernum3_NotEqual(usernum3);
    }

    protected void doSetUsernum3_NotEqual(Long usernum3) {
        regUsernum3(CK_NES, usernum3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {bigint(19), default=[(0)]}
     * @param usernum3 The value of usernum3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_GreaterThan(Long usernum3) {
        regUsernum3(CK_GT, usernum3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {bigint(19), default=[(0)]}
     * @param usernum3 The value of usernum3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_LessThan(Long usernum3) {
        regUsernum3(CK_LT, usernum3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {bigint(19), default=[(0)]}
     * @param usernum3 The value of usernum3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_GreaterEqual(Long usernum3) {
        regUsernum3(CK_GE, usernum3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {bigint(19), default=[(0)]}
     * @param usernum3 The value of usernum3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_LessEqual(Long usernum3) {
        regUsernum3(CK_LE, usernum3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {bigint(19), default=[(0)]}
     * @param minNumber The min number of usernum3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of usernum3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUsernum3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUsernum3(), "USERNUM3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USERNUM3: {bigint(19), default=[(0)]}
     * @param usernum3List The collection of usernum3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_InScope(Collection<Long> usernum3List) {
        doSetUsernum3_InScope(usernum3List);
    }

    protected void doSetUsernum3_InScope(Collection<Long> usernum3List) {
        regINS(CK_INS, cTL(usernum3List), xgetCValueUsernum3(), "USERNUM3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USERNUM3: {bigint(19), default=[(0)]}
     * @param usernum3List The collection of usernum3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_NotInScope(Collection<Long> usernum3List) {
        doSetUsernum3_NotInScope(usernum3List);
    }

    protected void doSetUsernum3_NotInScope(Collection<Long> usernum3List) {
        regINS(CK_NINS, cTL(usernum3List), xgetCValueUsernum3(), "USERNUM3");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERNUM3: {bigint(19), default=[(0)]}
     */
    public void setUsernum3_IsNull() { regUsernum3(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERNUM3: {bigint(19), default=[(0)]}
     */
    public void setUsernum3_IsNotNull() { regUsernum3(CK_ISNN, DOBJ); }

    protected void regUsernum3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsernum3(), "USERNUM3"); }
    protected abstract ConditionValue xgetCValueUsernum3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM4: {bigint(19), default=[(0)]}
     * @param usernum4 The value of usernum4 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum4_Equal(Long usernum4) {
        doSetUsernum4_Equal(usernum4);
    }

    protected void doSetUsernum4_Equal(Long usernum4) {
        regUsernum4(CK_EQ, usernum4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM4: {bigint(19), default=[(0)]}
     * @param usernum4 The value of usernum4 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum4_NotEqual(Long usernum4) {
        doSetUsernum4_NotEqual(usernum4);
    }

    protected void doSetUsernum4_NotEqual(Long usernum4) {
        regUsernum4(CK_NES, usernum4);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM4: {bigint(19), default=[(0)]}
     * @param usernum4 The value of usernum4 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum4_GreaterThan(Long usernum4) {
        regUsernum4(CK_GT, usernum4);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM4: {bigint(19), default=[(0)]}
     * @param usernum4 The value of usernum4 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum4_LessThan(Long usernum4) {
        regUsernum4(CK_LT, usernum4);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM4: {bigint(19), default=[(0)]}
     * @param usernum4 The value of usernum4 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum4_GreaterEqual(Long usernum4) {
        regUsernum4(CK_GE, usernum4);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM4: {bigint(19), default=[(0)]}
     * @param usernum4 The value of usernum4 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum4_LessEqual(Long usernum4) {
        regUsernum4(CK_LE, usernum4);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM4: {bigint(19), default=[(0)]}
     * @param minNumber The min number of usernum4. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of usernum4. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUsernum4_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUsernum4(), "USERNUM4", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USERNUM4: {bigint(19), default=[(0)]}
     * @param usernum4List The collection of usernum4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum4_InScope(Collection<Long> usernum4List) {
        doSetUsernum4_InScope(usernum4List);
    }

    protected void doSetUsernum4_InScope(Collection<Long> usernum4List) {
        regINS(CK_INS, cTL(usernum4List), xgetCValueUsernum4(), "USERNUM4");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USERNUM4: {bigint(19), default=[(0)]}
     * @param usernum4List The collection of usernum4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum4_NotInScope(Collection<Long> usernum4List) {
        doSetUsernum4_NotInScope(usernum4List);
    }

    protected void doSetUsernum4_NotInScope(Collection<Long> usernum4List) {
        regINS(CK_NINS, cTL(usernum4List), xgetCValueUsernum4(), "USERNUM4");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERNUM4: {bigint(19), default=[(0)]}
     */
    public void setUsernum4_IsNull() { regUsernum4(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERNUM4: {bigint(19), default=[(0)]}
     */
    public void setUsernum4_IsNotNull() { regUsernum4(CK_ISNN, DOBJ); }

    protected void regUsernum4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsernum4(), "USERNUM4"); }
    protected abstract ConditionValue xgetCValueUsernum4();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM5: {bigint(19), default=[(0)]}
     * @param usernum5 The value of usernum5 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum5_Equal(Long usernum5) {
        doSetUsernum5_Equal(usernum5);
    }

    protected void doSetUsernum5_Equal(Long usernum5) {
        regUsernum5(CK_EQ, usernum5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM5: {bigint(19), default=[(0)]}
     * @param usernum5 The value of usernum5 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum5_NotEqual(Long usernum5) {
        doSetUsernum5_NotEqual(usernum5);
    }

    protected void doSetUsernum5_NotEqual(Long usernum5) {
        regUsernum5(CK_NES, usernum5);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM5: {bigint(19), default=[(0)]}
     * @param usernum5 The value of usernum5 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum5_GreaterThan(Long usernum5) {
        regUsernum5(CK_GT, usernum5);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM5: {bigint(19), default=[(0)]}
     * @param usernum5 The value of usernum5 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum5_LessThan(Long usernum5) {
        regUsernum5(CK_LT, usernum5);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM5: {bigint(19), default=[(0)]}
     * @param usernum5 The value of usernum5 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum5_GreaterEqual(Long usernum5) {
        regUsernum5(CK_GE, usernum5);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM5: {bigint(19), default=[(0)]}
     * @param usernum5 The value of usernum5 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum5_LessEqual(Long usernum5) {
        regUsernum5(CK_LE, usernum5);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM5: {bigint(19), default=[(0)]}
     * @param minNumber The min number of usernum5. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of usernum5. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUsernum5_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUsernum5(), "USERNUM5", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USERNUM5: {bigint(19), default=[(0)]}
     * @param usernum5List The collection of usernum5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum5_InScope(Collection<Long> usernum5List) {
        doSetUsernum5_InScope(usernum5List);
    }

    protected void doSetUsernum5_InScope(Collection<Long> usernum5List) {
        regINS(CK_INS, cTL(usernum5List), xgetCValueUsernum5(), "USERNUM5");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USERNUM5: {bigint(19), default=[(0)]}
     * @param usernum5List The collection of usernum5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum5_NotInScope(Collection<Long> usernum5List) {
        doSetUsernum5_NotInScope(usernum5List);
    }

    protected void doSetUsernum5_NotInScope(Collection<Long> usernum5List) {
        regINS(CK_NINS, cTL(usernum5List), xgetCValueUsernum5(), "USERNUM5");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERNUM5: {bigint(19), default=[(0)]}
     */
    public void setUsernum5_IsNull() { regUsernum5(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERNUM5: {bigint(19), default=[(0)]}
     */
    public void setUsernum5_IsNotNull() { regUsernum5(CK_ISNN, DOBJ); }

    protected void regUsernum5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsernum5(), "USERNUM5"); }
    protected abstract ConditionValue xgetCValueUsernum5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(8)}
     * @param userdate1 The value of userdate1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_Equal(String userdate1) {
        doSetUserdate1_Equal(fRES(userdate1));
    }

    protected void doSetUserdate1_Equal(String userdate1) {
        regUserdate1(CK_EQ, userdate1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(8)}
     * @param userdate1 The value of userdate1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_NotEqual(String userdate1) {
        doSetUserdate1_NotEqual(fRES(userdate1));
    }

    protected void doSetUserdate1_NotEqual(String userdate1) {
        regUserdate1(CK_NES, userdate1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(8)}
     * @param userdate1 The value of userdate1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_GreaterThan(String userdate1) {
        regUserdate1(CK_GT, fRES(userdate1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(8)}
     * @param userdate1 The value of userdate1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_LessThan(String userdate1) {
        regUserdate1(CK_LT, fRES(userdate1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(8)}
     * @param userdate1 The value of userdate1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_GreaterEqual(String userdate1) {
        regUserdate1(CK_GE, fRES(userdate1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(8)}
     * @param userdate1 The value of userdate1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_LessEqual(String userdate1) {
        regUserdate1(CK_LE, fRES(userdate1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE1: {varchar(8)}
     * @param userdate1List The collection of userdate1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_InScope(Collection<String> userdate1List) {
        doSetUserdate1_InScope(userdate1List);
    }

    protected void doSetUserdate1_InScope(Collection<String> userdate1List) {
        regINS(CK_INS, cTL(userdate1List), xgetCValueUserdate1(), "USERDATE1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE1: {varchar(8)}
     * @param userdate1List The collection of userdate1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_NotInScope(Collection<String> userdate1List) {
        doSetUserdate1_NotInScope(userdate1List);
    }

    protected void doSetUserdate1_NotInScope(Collection<String> userdate1List) {
        regINS(CK_NINS, cTL(userdate1List), xgetCValueUserdate1(), "USERDATE1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE1: {varchar(8)} <br>
     * <pre>e.g. setUserdate1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userdate1 The value of userdate1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserdate1_LikeSearch(String userdate1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userdate1), xgetCValueUserdate1(), "USERDATE1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE1: {varchar(8)}
     * @param userdate1 The value of userdate1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserdate1_NotLikeSearch(String userdate1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userdate1), xgetCValueUserdate1(), "USERDATE1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE1: {varchar(8)}
     * @param userdate1 The value of userdate1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_PrefixSearch(String userdate1) {
        setUserdate1_LikeSearch(userdate1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(8)}
     */
    public void setUserdate1_IsNull() { regUserdate1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(8)}
     */
    public void setUserdate1_IsNullOrEmpty() { regUserdate1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(8)}
     */
    public void setUserdate1_IsNotNull() { regUserdate1(CK_ISNN, DOBJ); }

    protected void regUserdate1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserdate1(), "USERDATE1"); }
    protected abstract ConditionValue xgetCValueUserdate1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(8)}
     * @param userdate2 The value of userdate2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_Equal(String userdate2) {
        doSetUserdate2_Equal(fRES(userdate2));
    }

    protected void doSetUserdate2_Equal(String userdate2) {
        regUserdate2(CK_EQ, userdate2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(8)}
     * @param userdate2 The value of userdate2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_NotEqual(String userdate2) {
        doSetUserdate2_NotEqual(fRES(userdate2));
    }

    protected void doSetUserdate2_NotEqual(String userdate2) {
        regUserdate2(CK_NES, userdate2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(8)}
     * @param userdate2 The value of userdate2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_GreaterThan(String userdate2) {
        regUserdate2(CK_GT, fRES(userdate2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(8)}
     * @param userdate2 The value of userdate2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_LessThan(String userdate2) {
        regUserdate2(CK_LT, fRES(userdate2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(8)}
     * @param userdate2 The value of userdate2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_GreaterEqual(String userdate2) {
        regUserdate2(CK_GE, fRES(userdate2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(8)}
     * @param userdate2 The value of userdate2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_LessEqual(String userdate2) {
        regUserdate2(CK_LE, fRES(userdate2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE2: {varchar(8)}
     * @param userdate2List The collection of userdate2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_InScope(Collection<String> userdate2List) {
        doSetUserdate2_InScope(userdate2List);
    }

    protected void doSetUserdate2_InScope(Collection<String> userdate2List) {
        regINS(CK_INS, cTL(userdate2List), xgetCValueUserdate2(), "USERDATE2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE2: {varchar(8)}
     * @param userdate2List The collection of userdate2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_NotInScope(Collection<String> userdate2List) {
        doSetUserdate2_NotInScope(userdate2List);
    }

    protected void doSetUserdate2_NotInScope(Collection<String> userdate2List) {
        regINS(CK_NINS, cTL(userdate2List), xgetCValueUserdate2(), "USERDATE2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE2: {varchar(8)} <br>
     * <pre>e.g. setUserdate2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userdate2 The value of userdate2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserdate2_LikeSearch(String userdate2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userdate2), xgetCValueUserdate2(), "USERDATE2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE2: {varchar(8)}
     * @param userdate2 The value of userdate2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserdate2_NotLikeSearch(String userdate2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userdate2), xgetCValueUserdate2(), "USERDATE2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE2: {varchar(8)}
     * @param userdate2 The value of userdate2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_PrefixSearch(String userdate2) {
        setUserdate2_LikeSearch(userdate2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(8)}
     */
    public void setUserdate2_IsNull() { regUserdate2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(8)}
     */
    public void setUserdate2_IsNullOrEmpty() { regUserdate2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(8)}
     */
    public void setUserdate2_IsNotNull() { regUserdate2(CK_ISNN, DOBJ); }

    protected void regUserdate2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserdate2(), "USERDATE2"); }
    protected abstract ConditionValue xgetCValueUserdate2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(8)}
     * @param userdate3 The value of userdate3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_Equal(String userdate3) {
        doSetUserdate3_Equal(fRES(userdate3));
    }

    protected void doSetUserdate3_Equal(String userdate3) {
        regUserdate3(CK_EQ, userdate3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(8)}
     * @param userdate3 The value of userdate3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_NotEqual(String userdate3) {
        doSetUserdate3_NotEqual(fRES(userdate3));
    }

    protected void doSetUserdate3_NotEqual(String userdate3) {
        regUserdate3(CK_NES, userdate3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(8)}
     * @param userdate3 The value of userdate3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_GreaterThan(String userdate3) {
        regUserdate3(CK_GT, fRES(userdate3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(8)}
     * @param userdate3 The value of userdate3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_LessThan(String userdate3) {
        regUserdate3(CK_LT, fRES(userdate3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(8)}
     * @param userdate3 The value of userdate3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_GreaterEqual(String userdate3) {
        regUserdate3(CK_GE, fRES(userdate3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(8)}
     * @param userdate3 The value of userdate3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_LessEqual(String userdate3) {
        regUserdate3(CK_LE, fRES(userdate3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE3: {varchar(8)}
     * @param userdate3List The collection of userdate3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_InScope(Collection<String> userdate3List) {
        doSetUserdate3_InScope(userdate3List);
    }

    protected void doSetUserdate3_InScope(Collection<String> userdate3List) {
        regINS(CK_INS, cTL(userdate3List), xgetCValueUserdate3(), "USERDATE3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE3: {varchar(8)}
     * @param userdate3List The collection of userdate3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_NotInScope(Collection<String> userdate3List) {
        doSetUserdate3_NotInScope(userdate3List);
    }

    protected void doSetUserdate3_NotInScope(Collection<String> userdate3List) {
        regINS(CK_NINS, cTL(userdate3List), xgetCValueUserdate3(), "USERDATE3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE3: {varchar(8)} <br>
     * <pre>e.g. setUserdate3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userdate3 The value of userdate3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserdate3_LikeSearch(String userdate3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userdate3), xgetCValueUserdate3(), "USERDATE3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE3: {varchar(8)}
     * @param userdate3 The value of userdate3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserdate3_NotLikeSearch(String userdate3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userdate3), xgetCValueUserdate3(), "USERDATE3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE3: {varchar(8)}
     * @param userdate3 The value of userdate3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_PrefixSearch(String userdate3) {
        setUserdate3_LikeSearch(userdate3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(8)}
     */
    public void setUserdate3_IsNull() { regUserdate3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(8)}
     */
    public void setUserdate3_IsNullOrEmpty() { regUserdate3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(8)}
     */
    public void setUserdate3_IsNotNull() { regUserdate3(CK_ISNN, DOBJ); }

    protected void regUserdate3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserdate3(), "USERDATE3"); }
    protected abstract ConditionValue xgetCValueUserdate3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(8)}
     * @param userdate4 The value of userdate4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_Equal(String userdate4) {
        doSetUserdate4_Equal(fRES(userdate4));
    }

    protected void doSetUserdate4_Equal(String userdate4) {
        regUserdate4(CK_EQ, userdate4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(8)}
     * @param userdate4 The value of userdate4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_NotEqual(String userdate4) {
        doSetUserdate4_NotEqual(fRES(userdate4));
    }

    protected void doSetUserdate4_NotEqual(String userdate4) {
        regUserdate4(CK_NES, userdate4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(8)}
     * @param userdate4 The value of userdate4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_GreaterThan(String userdate4) {
        regUserdate4(CK_GT, fRES(userdate4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(8)}
     * @param userdate4 The value of userdate4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_LessThan(String userdate4) {
        regUserdate4(CK_LT, fRES(userdate4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(8)}
     * @param userdate4 The value of userdate4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_GreaterEqual(String userdate4) {
        regUserdate4(CK_GE, fRES(userdate4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(8)}
     * @param userdate4 The value of userdate4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_LessEqual(String userdate4) {
        regUserdate4(CK_LE, fRES(userdate4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE4: {varchar(8)}
     * @param userdate4List The collection of userdate4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_InScope(Collection<String> userdate4List) {
        doSetUserdate4_InScope(userdate4List);
    }

    protected void doSetUserdate4_InScope(Collection<String> userdate4List) {
        regINS(CK_INS, cTL(userdate4List), xgetCValueUserdate4(), "USERDATE4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE4: {varchar(8)}
     * @param userdate4List The collection of userdate4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_NotInScope(Collection<String> userdate4List) {
        doSetUserdate4_NotInScope(userdate4List);
    }

    protected void doSetUserdate4_NotInScope(Collection<String> userdate4List) {
        regINS(CK_NINS, cTL(userdate4List), xgetCValueUserdate4(), "USERDATE4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE4: {varchar(8)} <br>
     * <pre>e.g. setUserdate4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userdate4 The value of userdate4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserdate4_LikeSearch(String userdate4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userdate4), xgetCValueUserdate4(), "USERDATE4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE4: {varchar(8)}
     * @param userdate4 The value of userdate4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserdate4_NotLikeSearch(String userdate4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userdate4), xgetCValueUserdate4(), "USERDATE4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE4: {varchar(8)}
     * @param userdate4 The value of userdate4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_PrefixSearch(String userdate4) {
        setUserdate4_LikeSearch(userdate4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(8)}
     */
    public void setUserdate4_IsNull() { regUserdate4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(8)}
     */
    public void setUserdate4_IsNullOrEmpty() { regUserdate4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(8)}
     */
    public void setUserdate4_IsNotNull() { regUserdate4(CK_ISNN, DOBJ); }

    protected void regUserdate4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserdate4(), "USERDATE4"); }
    protected abstract ConditionValue xgetCValueUserdate4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(8)}
     * @param userdate5 The value of userdate5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_Equal(String userdate5) {
        doSetUserdate5_Equal(fRES(userdate5));
    }

    protected void doSetUserdate5_Equal(String userdate5) {
        regUserdate5(CK_EQ, userdate5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(8)}
     * @param userdate5 The value of userdate5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_NotEqual(String userdate5) {
        doSetUserdate5_NotEqual(fRES(userdate5));
    }

    protected void doSetUserdate5_NotEqual(String userdate5) {
        regUserdate5(CK_NES, userdate5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(8)}
     * @param userdate5 The value of userdate5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_GreaterThan(String userdate5) {
        regUserdate5(CK_GT, fRES(userdate5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(8)}
     * @param userdate5 The value of userdate5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_LessThan(String userdate5) {
        regUserdate5(CK_LT, fRES(userdate5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(8)}
     * @param userdate5 The value of userdate5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_GreaterEqual(String userdate5) {
        regUserdate5(CK_GE, fRES(userdate5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(8)}
     * @param userdate5 The value of userdate5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_LessEqual(String userdate5) {
        regUserdate5(CK_LE, fRES(userdate5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE5: {varchar(8)}
     * @param userdate5List The collection of userdate5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_InScope(Collection<String> userdate5List) {
        doSetUserdate5_InScope(userdate5List);
    }

    protected void doSetUserdate5_InScope(Collection<String> userdate5List) {
        regINS(CK_INS, cTL(userdate5List), xgetCValueUserdate5(), "USERDATE5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE5: {varchar(8)}
     * @param userdate5List The collection of userdate5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_NotInScope(Collection<String> userdate5List) {
        doSetUserdate5_NotInScope(userdate5List);
    }

    protected void doSetUserdate5_NotInScope(Collection<String> userdate5List) {
        regINS(CK_NINS, cTL(userdate5List), xgetCValueUserdate5(), "USERDATE5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE5: {varchar(8)} <br>
     * <pre>e.g. setUserdate5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userdate5 The value of userdate5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserdate5_LikeSearch(String userdate5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userdate5), xgetCValueUserdate5(), "USERDATE5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE5: {varchar(8)}
     * @param userdate5 The value of userdate5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserdate5_NotLikeSearch(String userdate5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userdate5), xgetCValueUserdate5(), "USERDATE5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE5: {varchar(8)}
     * @param userdate5 The value of userdate5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_PrefixSearch(String userdate5) {
        setUserdate5_LikeSearch(userdate5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(8)}
     */
    public void setUserdate5_IsNull() { regUserdate5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(8)}
     */
    public void setUserdate5_IsNullOrEmpty() { regUserdate5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(8)}
     */
    public void setUserdate5_IsNotNull() { regUserdate5(CK_ISNN, DOBJ); }

    protected void regUserdate5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserdate5(), "USERDATE5"); }
    protected abstract ConditionValue xgetCValueUserdate5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_Equal(String cggdid) {
        doSetCggdid_Equal(fRES(cggdid));
    }

    protected void doSetCggdid_Equal(String cggdid) {
        regCggdid(CK_EQ, cggdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_NotEqual(String cggdid) {
        doSetCggdid_NotEqual(fRES(cggdid));
    }

    protected void doSetCggdid_NotEqual(String cggdid) {
        regCggdid(CK_NES, cggdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_GreaterThan(String cggdid) {
        regCggdid(CK_GT, fRES(cggdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_LessThan(String cggdid) {
        regCggdid(CK_LT, fRES(cggdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_GreaterEqual(String cggdid) {
        regCggdid(CK_GE, fRES(cggdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_LessEqual(String cggdid) {
        regCggdid(CK_LE, fRES(cggdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdidList The collection of cggdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_InScope(Collection<String> cggdidList) {
        doSetCggdid_InScope(cggdidList);
    }

    protected void doSetCggdid_InScope(Collection<String> cggdidList) {
        regINS(CK_INS, cTL(cggdidList), xgetCValueCggdid(), "CGGDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdidList The collection of cggdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_NotInScope(Collection<String> cggdidList) {
        doSetCggdid_NotInScope(cggdidList);
    }

    protected void doSetCggdid_NotInScope(Collection<String> cggdidList) {
        regINS(CK_NINS, cTL(cggdidList), xgetCValueCggdid(), "CGGDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(30)} <br>
     * <pre>e.g. setCggdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cggdid The value of cggdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCggdid_LikeSearch(String cggdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cggdid), xgetCValueCggdid(), "CGGDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCggdid_NotLikeSearch(String cggdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cggdid), xgetCValueCggdid(), "CGGDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_PrefixSearch(String cggdid) {
        setCggdid_LikeSearch(cggdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     */
    public void setCggdid_IsNull() { regCggdid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     */
    public void setCggdid_IsNullOrEmpty() { regCggdid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     */
    public void setCggdid_IsNotNull() { regCggdid(CK_ISNN, DOBJ); }

    protected void regCggdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCggdid(), "CGGDID"); }
    protected abstract ConditionValue xgetCValueCggdid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BRCTG: {NotNull, bigint(19), default=[(0)]}
     * @param brctg The value of brctg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBrctg_Equal(Long brctg) {
        doSetBrctg_Equal(brctg);
    }

    protected void doSetBrctg_Equal(Long brctg) {
        regBrctg(CK_EQ, brctg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BRCTG: {NotNull, bigint(19), default=[(0)]}
     * @param brctg The value of brctg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBrctg_NotEqual(Long brctg) {
        doSetBrctg_NotEqual(brctg);
    }

    protected void doSetBrctg_NotEqual(Long brctg) {
        regBrctg(CK_NES, brctg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BRCTG: {NotNull, bigint(19), default=[(0)]}
     * @param brctg The value of brctg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBrctg_GreaterThan(Long brctg) {
        regBrctg(CK_GT, brctg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BRCTG: {NotNull, bigint(19), default=[(0)]}
     * @param brctg The value of brctg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBrctg_LessThan(Long brctg) {
        regBrctg(CK_LT, brctg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BRCTG: {NotNull, bigint(19), default=[(0)]}
     * @param brctg The value of brctg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBrctg_GreaterEqual(Long brctg) {
        regBrctg(CK_GE, brctg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BRCTG: {NotNull, bigint(19), default=[(0)]}
     * @param brctg The value of brctg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBrctg_LessEqual(Long brctg) {
        regBrctg(CK_LE, brctg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BRCTG: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of brctg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of brctg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBrctg_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBrctg(), "BRCTG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BRCTG: {NotNull, bigint(19), default=[(0)]}
     * @param brctgList The collection of brctg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrctg_InScope(Collection<Long> brctgList) {
        doSetBrctg_InScope(brctgList);
    }

    protected void doSetBrctg_InScope(Collection<Long> brctgList) {
        regINS(CK_INS, cTL(brctgList), xgetCValueBrctg(), "BRCTG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BRCTG: {NotNull, bigint(19), default=[(0)]}
     * @param brctgList The collection of brctg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrctg_NotInScope(Collection<Long> brctgList) {
        doSetBrctg_NotInScope(brctgList);
    }

    protected void doSetBrctg_NotInScope(Collection<Long> brctgList) {
        regINS(CK_NINS, cTL(brctgList), xgetCValueBrctg(), "BRCTG");
    }

    protected void regBrctg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBrctg(), "BRCTG"); }
    protected abstract ConditionValue xgetCValueBrctg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {bigint(19)}
     * @param ctweight The value of ctweight as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtweight_Equal(Long ctweight) {
        doSetCtweight_Equal(ctweight);
    }

    protected void doSetCtweight_Equal(Long ctweight) {
        regCtweight(CK_EQ, ctweight);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {bigint(19)}
     * @param ctweight The value of ctweight as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtweight_NotEqual(Long ctweight) {
        doSetCtweight_NotEqual(ctweight);
    }

    protected void doSetCtweight_NotEqual(Long ctweight) {
        regCtweight(CK_NES, ctweight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {bigint(19)}
     * @param ctweight The value of ctweight as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtweight_GreaterThan(Long ctweight) {
        regCtweight(CK_GT, ctweight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {bigint(19)}
     * @param ctweight The value of ctweight as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtweight_LessThan(Long ctweight) {
        regCtweight(CK_LT, ctweight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {bigint(19)}
     * @param ctweight The value of ctweight as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtweight_GreaterEqual(Long ctweight) {
        regCtweight(CK_GE, ctweight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {bigint(19)}
     * @param ctweight The value of ctweight as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtweight_LessEqual(Long ctweight) {
        regCtweight(CK_LE, ctweight);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {bigint(19)}
     * @param minNumber The min number of ctweight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ctweight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCtweight_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCtweight(), "CTWEIGHT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTWEIGHT: {bigint(19)}
     * @param ctweightList The collection of ctweight as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtweight_InScope(Collection<Long> ctweightList) {
        doSetCtweight_InScope(ctweightList);
    }

    protected void doSetCtweight_InScope(Collection<Long> ctweightList) {
        regINS(CK_INS, cTL(ctweightList), xgetCValueCtweight(), "CTWEIGHT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTWEIGHT: {bigint(19)}
     * @param ctweightList The collection of ctweight as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtweight_NotInScope(Collection<Long> ctweightList) {
        doSetCtweight_NotInScope(ctweightList);
    }

    protected void doSetCtweight_NotInScope(Collection<Long> ctweightList) {
        regINS(CK_NINS, cTL(ctweightList), xgetCValueCtweight(), "CTWEIGHT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTWEIGHT: {bigint(19)}
     */
    public void setCtweight_IsNull() { regCtweight(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTWEIGHT: {bigint(19)}
     */
    public void setCtweight_IsNotNull() { regCtweight(CK_ISNN, DOBJ); }

    protected void regCtweight(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtweight(), "CTWEIGHT"); }
    protected abstract ConditionValue xgetCValueCtweight();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_Equal(Long bxoszl) {
        doSetBxoszl_Equal(bxoszl);
    }

    protected void doSetBxoszl_Equal(Long bxoszl) {
        regBxoszl(CK_EQ, bxoszl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_NotEqual(Long bxoszl) {
        doSetBxoszl_NotEqual(bxoszl);
    }

    protected void doSetBxoszl_NotEqual(Long bxoszl) {
        regBxoszl(CK_NES, bxoszl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_GreaterThan(Long bxoszl) {
        regBxoszl(CK_GT, bxoszl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_LessThan(Long bxoszl) {
        regBxoszl(CK_LT, bxoszl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_GreaterEqual(Long bxoszl) {
        regBxoszl(CK_GE, bxoszl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_LessEqual(Long bxoszl) {
        regBxoszl(CK_LE, bxoszl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param minNumber The min number of bxoszl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bxoszl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBxoszl_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBxoszl(), "BXOSZL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszlList The collection of bxoszl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszl_InScope(Collection<Long> bxoszlList) {
        doSetBxoszl_InScope(bxoszlList);
    }

    protected void doSetBxoszl_InScope(Collection<Long> bxoszlList) {
        regINS(CK_INS, cTL(bxoszlList), xgetCValueBxoszl(), "BXOSZL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszlList The collection of bxoszl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszl_NotInScope(Collection<Long> bxoszlList) {
        doSetBxoszl_NotInScope(bxoszlList);
    }

    protected void doSetBxoszl_NotInScope(Collection<Long> bxoszlList) {
        regINS(CK_NINS, cTL(bxoszlList), xgetCValueBxoszl(), "BXOSZL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     */
    public void setBxoszl_IsNull() { regBxoszl(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     */
    public void setBxoszl_IsNotNull() { regBxoszl(CK_ISNN, DOBJ); }

    protected void regBxoszl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxoszl(), "BXOSZL"); }
    protected abstract ConditionValue xgetCValueBxoszl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_Equal(Long bxoszw) {
        doSetBxoszw_Equal(bxoszw);
    }

    protected void doSetBxoszw_Equal(Long bxoszw) {
        regBxoszw(CK_EQ, bxoszw);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_NotEqual(Long bxoszw) {
        doSetBxoszw_NotEqual(bxoszw);
    }

    protected void doSetBxoszw_NotEqual(Long bxoszw) {
        regBxoszw(CK_NES, bxoszw);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_GreaterThan(Long bxoszw) {
        regBxoszw(CK_GT, bxoszw);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_LessThan(Long bxoszw) {
        regBxoszw(CK_LT, bxoszw);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_GreaterEqual(Long bxoszw) {
        regBxoszw(CK_GE, bxoszw);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_LessEqual(Long bxoszw) {
        regBxoszw(CK_LE, bxoszw);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param minNumber The min number of bxoszw. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bxoszw. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBxoszw_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBxoszw(), "BXOSZW", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszwList The collection of bxoszw as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszw_InScope(Collection<Long> bxoszwList) {
        doSetBxoszw_InScope(bxoszwList);
    }

    protected void doSetBxoszw_InScope(Collection<Long> bxoszwList) {
        regINS(CK_INS, cTL(bxoszwList), xgetCValueBxoszw(), "BXOSZW");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszwList The collection of bxoszw as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszw_NotInScope(Collection<Long> bxoszwList) {
        doSetBxoszw_NotInScope(bxoszwList);
    }

    protected void doSetBxoszw_NotInScope(Collection<Long> bxoszwList) {
        regINS(CK_NINS, cTL(bxoszwList), xgetCValueBxoszw(), "BXOSZW");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     */
    public void setBxoszw_IsNull() { regBxoszw(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     */
    public void setBxoszw_IsNotNull() { regBxoszw(CK_ISNN, DOBJ); }

    protected void regBxoszw(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxoszw(), "BXOSZW"); }
    protected abstract ConditionValue xgetCValueBxoszw();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_Equal(Long bxoszh) {
        doSetBxoszh_Equal(bxoszh);
    }

    protected void doSetBxoszh_Equal(Long bxoszh) {
        regBxoszh(CK_EQ, bxoszh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_NotEqual(Long bxoszh) {
        doSetBxoszh_NotEqual(bxoszh);
    }

    protected void doSetBxoszh_NotEqual(Long bxoszh) {
        regBxoszh(CK_NES, bxoszh);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_GreaterThan(Long bxoszh) {
        regBxoszh(CK_GT, bxoszh);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_LessThan(Long bxoszh) {
        regBxoszh(CK_LT, bxoszh);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_GreaterEqual(Long bxoszh) {
        regBxoszh(CK_GE, bxoszh);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_LessEqual(Long bxoszh) {
        regBxoszh(CK_LE, bxoszh);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param minNumber The min number of bxoszh. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bxoszh. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBxoszh_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBxoszh(), "BXOSZH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszhList The collection of bxoszh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszh_InScope(Collection<Long> bxoszhList) {
        doSetBxoszh_InScope(bxoszhList);
    }

    protected void doSetBxoszh_InScope(Collection<Long> bxoszhList) {
        regINS(CK_INS, cTL(bxoszhList), xgetCValueBxoszh(), "BXOSZH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszhList The collection of bxoszh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszh_NotInScope(Collection<Long> bxoszhList) {
        doSetBxoszh_NotInScope(bxoszhList);
    }

    protected void doSetBxoszh_NotInScope(Collection<Long> bxoszhList) {
        regINS(CK_NINS, cTL(bxoszhList), xgetCValueBxoszh(), "BXOSZH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     */
    public void setBxoszh_IsNull() { regBxoszh(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     */
    public void setBxoszh_IsNotNull() { regBxoszh(CK_ISNN, DOBJ); }

    protected void regBxoszh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxoszh(), "BXOSZH"); }
    protected abstract ConditionValue xgetCValueBxoszh();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXCPY: {bigint(19)}
     * @param bxcpy The value of bxcpy as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxcpy_Equal(Long bxcpy) {
        doSetBxcpy_Equal(bxcpy);
    }

    protected void doSetBxcpy_Equal(Long bxcpy) {
        regBxcpy(CK_EQ, bxcpy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXCPY: {bigint(19)}
     * @param bxcpy The value of bxcpy as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxcpy_NotEqual(Long bxcpy) {
        doSetBxcpy_NotEqual(bxcpy);
    }

    protected void doSetBxcpy_NotEqual(Long bxcpy) {
        regBxcpy(CK_NES, bxcpy);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXCPY: {bigint(19)}
     * @param bxcpy The value of bxcpy as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxcpy_GreaterThan(Long bxcpy) {
        regBxcpy(CK_GT, bxcpy);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXCPY: {bigint(19)}
     * @param bxcpy The value of bxcpy as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxcpy_LessThan(Long bxcpy) {
        regBxcpy(CK_LT, bxcpy);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXCPY: {bigint(19)}
     * @param bxcpy The value of bxcpy as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxcpy_GreaterEqual(Long bxcpy) {
        regBxcpy(CK_GE, bxcpy);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXCPY: {bigint(19)}
     * @param bxcpy The value of bxcpy as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxcpy_LessEqual(Long bxcpy) {
        regBxcpy(CK_LE, bxcpy);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BXCPY: {bigint(19)}
     * @param minNumber The min number of bxcpy. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bxcpy. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBxcpy_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBxcpy(), "BXCPY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXCPY: {bigint(19)}
     * @param bxcpyList The collection of bxcpy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxcpy_InScope(Collection<Long> bxcpyList) {
        doSetBxcpy_InScope(bxcpyList);
    }

    protected void doSetBxcpy_InScope(Collection<Long> bxcpyList) {
        regINS(CK_INS, cTL(bxcpyList), xgetCValueBxcpy(), "BXCPY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXCPY: {bigint(19)}
     * @param bxcpyList The collection of bxcpy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxcpy_NotInScope(Collection<Long> bxcpyList) {
        doSetBxcpy_NotInScope(bxcpyList);
    }

    protected void doSetBxcpy_NotInScope(Collection<Long> bxcpyList) {
        regINS(CK_NINS, cTL(bxcpyList), xgetCValueBxcpy(), "BXCPY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BXCPY: {bigint(19)}
     */
    public void setBxcpy_IsNull() { regBxcpy(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BXCPY: {bigint(19)}
     */
    public void setBxcpy_IsNotNull() { regBxcpy(CK_ISNN, DOBJ); }

    protected void regBxcpy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxcpy(), "BXCPY"); }
    protected abstract ConditionValue xgetCValueBxcpy();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXWEIGHT: {bigint(19)}
     * @param bxweight The value of bxweight as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxweight_Equal(Long bxweight) {
        doSetBxweight_Equal(bxweight);
    }

    protected void doSetBxweight_Equal(Long bxweight) {
        regBxweight(CK_EQ, bxweight);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXWEIGHT: {bigint(19)}
     * @param bxweight The value of bxweight as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxweight_NotEqual(Long bxweight) {
        doSetBxweight_NotEqual(bxweight);
    }

    protected void doSetBxweight_NotEqual(Long bxweight) {
        regBxweight(CK_NES, bxweight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXWEIGHT: {bigint(19)}
     * @param bxweight The value of bxweight as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxweight_GreaterThan(Long bxweight) {
        regBxweight(CK_GT, bxweight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXWEIGHT: {bigint(19)}
     * @param bxweight The value of bxweight as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxweight_LessThan(Long bxweight) {
        regBxweight(CK_LT, bxweight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXWEIGHT: {bigint(19)}
     * @param bxweight The value of bxweight as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxweight_GreaterEqual(Long bxweight) {
        regBxweight(CK_GE, bxweight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXWEIGHT: {bigint(19)}
     * @param bxweight The value of bxweight as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxweight_LessEqual(Long bxweight) {
        regBxweight(CK_LE, bxweight);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BXWEIGHT: {bigint(19)}
     * @param minNumber The min number of bxweight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bxweight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBxweight_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBxweight(), "BXWEIGHT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXWEIGHT: {bigint(19)}
     * @param bxweightList The collection of bxweight as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxweight_InScope(Collection<Long> bxweightList) {
        doSetBxweight_InScope(bxweightList);
    }

    protected void doSetBxweight_InScope(Collection<Long> bxweightList) {
        regINS(CK_INS, cTL(bxweightList), xgetCValueBxweight(), "BXWEIGHT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXWEIGHT: {bigint(19)}
     * @param bxweightList The collection of bxweight as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxweight_NotInScope(Collection<Long> bxweightList) {
        doSetBxweight_NotInScope(bxweightList);
    }

    protected void doSetBxweight_NotInScope(Collection<Long> bxweightList) {
        regINS(CK_NINS, cTL(bxweightList), xgetCValueBxweight(), "BXWEIGHT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BXWEIGHT: {bigint(19)}
     */
    public void setBxweight_IsNull() { regBxweight(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BXWEIGHT: {bigint(19)}
     */
    public void setBxweight_IsNotNull() { regBxweight(CK_ISNN, DOBJ); }

    protected void regBxweight(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxweight(), "BXWEIGHT"); }
    protected abstract ConditionValue xgetCValueBxweight();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ADMIN: {NotNull, varchar(255)}
     * @param itemAdmin The value of itemAdmin as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_Equal(String itemAdmin) {
        doSetItemAdmin_Equal(fRES(itemAdmin));
    }

    protected void doSetItemAdmin_Equal(String itemAdmin) {
        regItemAdmin(CK_EQ, itemAdmin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ADMIN: {NotNull, varchar(255)}
     * @param itemAdmin The value of itemAdmin as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_NotEqual(String itemAdmin) {
        doSetItemAdmin_NotEqual(fRES(itemAdmin));
    }

    protected void doSetItemAdmin_NotEqual(String itemAdmin) {
        regItemAdmin(CK_NES, itemAdmin);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ADMIN: {NotNull, varchar(255)}
     * @param itemAdmin The value of itemAdmin as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_GreaterThan(String itemAdmin) {
        regItemAdmin(CK_GT, fRES(itemAdmin));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ADMIN: {NotNull, varchar(255)}
     * @param itemAdmin The value of itemAdmin as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_LessThan(String itemAdmin) {
        regItemAdmin(CK_LT, fRES(itemAdmin));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ADMIN: {NotNull, varchar(255)}
     * @param itemAdmin The value of itemAdmin as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_GreaterEqual(String itemAdmin) {
        regItemAdmin(CK_GE, fRES(itemAdmin));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ADMIN: {NotNull, varchar(255)}
     * @param itemAdmin The value of itemAdmin as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_LessEqual(String itemAdmin) {
        regItemAdmin(CK_LE, fRES(itemAdmin));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_ADMIN: {NotNull, varchar(255)}
     * @param itemAdminList The collection of itemAdmin as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_InScope(Collection<String> itemAdminList) {
        doSetItemAdmin_InScope(itemAdminList);
    }

    protected void doSetItemAdmin_InScope(Collection<String> itemAdminList) {
        regINS(CK_INS, cTL(itemAdminList), xgetCValueItemAdmin(), "ITEM_ADMIN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_ADMIN: {NotNull, varchar(255)}
     * @param itemAdminList The collection of itemAdmin as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_NotInScope(Collection<String> itemAdminList) {
        doSetItemAdmin_NotInScope(itemAdminList);
    }

    protected void doSetItemAdmin_NotInScope(Collection<String> itemAdminList) {
        regINS(CK_NINS, cTL(itemAdminList), xgetCValueItemAdmin(), "ITEM_ADMIN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_ADMIN: {NotNull, varchar(255)} <br>
     * <pre>e.g. setItemAdmin_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemAdmin The value of itemAdmin as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemAdmin_LikeSearch(String itemAdmin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemAdmin), xgetCValueItemAdmin(), "ITEM_ADMIN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_ADMIN: {NotNull, varchar(255)}
     * @param itemAdmin The value of itemAdmin as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemAdmin_NotLikeSearch(String itemAdmin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemAdmin), xgetCValueItemAdmin(), "ITEM_ADMIN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_ADMIN: {NotNull, varchar(255)}
     * @param itemAdmin The value of itemAdmin as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_PrefixSearch(String itemAdmin) {
        setItemAdmin_LikeSearch(itemAdmin, xcLSOPPre());
    }

    protected void regItemAdmin(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemAdmin(), "ITEM_ADMIN"); }
    protected abstract ConditionValue xgetCValueItemAdmin();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {varchar(60)}
     * @param sname The value of sname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_Equal(String sname) {
        doSetSname_Equal(fRES(sname));
    }

    protected void doSetSname_Equal(String sname) {
        regSname(CK_EQ, sname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {varchar(60)}
     * @param sname The value of sname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_NotEqual(String sname) {
        doSetSname_NotEqual(fRES(sname));
    }

    protected void doSetSname_NotEqual(String sname) {
        regSname(CK_NES, sname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {varchar(60)}
     * @param sname The value of sname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_GreaterThan(String sname) {
        regSname(CK_GT, fRES(sname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {varchar(60)}
     * @param sname The value of sname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_LessThan(String sname) {
        regSname(CK_LT, fRES(sname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {varchar(60)}
     * @param sname The value of sname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_GreaterEqual(String sname) {
        regSname(CK_GE, fRES(sname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {varchar(60)}
     * @param sname The value of sname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_LessEqual(String sname) {
        regSname(CK_LE, fRES(sname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNAME: {varchar(60)}
     * @param snameList The collection of sname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_InScope(Collection<String> snameList) {
        doSetSname_InScope(snameList);
    }

    protected void doSetSname_InScope(Collection<String> snameList) {
        regINS(CK_INS, cTL(snameList), xgetCValueSname(), "SNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNAME: {varchar(60)}
     * @param snameList The collection of sname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_NotInScope(Collection<String> snameList) {
        doSetSname_NotInScope(snameList);
    }

    protected void doSetSname_NotInScope(Collection<String> snameList) {
        regINS(CK_NINS, cTL(snameList), xgetCValueSname(), "SNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNAME: {varchar(60)} <br>
     * <pre>e.g. setSname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sname The value of sname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSname_LikeSearch(String sname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sname), xgetCValueSname(), "SNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNAME: {varchar(60)}
     * @param sname The value of sname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSname_NotLikeSearch(String sname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sname), xgetCValueSname(), "SNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNAME: {varchar(60)}
     * @param sname The value of sname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_PrefixSearch(String sname) {
        setSname_LikeSearch(sname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SNAME: {varchar(60)}
     */
    public void setSname_IsNull() { regSname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SNAME: {varchar(60)}
     */
    public void setSname_IsNullOrEmpty() { regSname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SNAME: {varchar(60)}
     */
    public void setSname_IsNotNull() { regSname(CK_ISNN, DOBJ); }

    protected void regSname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSname(), "SNAME"); }
    protected abstract ConditionValue xgetCValueSname();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FractionPieceWeight: {decimal(16, 6)}
     * @param fractionpieceweight The value of fractionpieceweight as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFractionpieceweight_Equal(java.math.BigDecimal fractionpieceweight) {
        doSetFractionpieceweight_Equal(fractionpieceweight);
    }

    protected void doSetFractionpieceweight_Equal(java.math.BigDecimal fractionpieceweight) {
        regFractionpieceweight(CK_EQ, fractionpieceweight);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FractionPieceWeight: {decimal(16, 6)}
     * @param fractionpieceweight The value of fractionpieceweight as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFractionpieceweight_NotEqual(java.math.BigDecimal fractionpieceweight) {
        doSetFractionpieceweight_NotEqual(fractionpieceweight);
    }

    protected void doSetFractionpieceweight_NotEqual(java.math.BigDecimal fractionpieceweight) {
        regFractionpieceweight(CK_NES, fractionpieceweight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FractionPieceWeight: {decimal(16, 6)}
     * @param fractionpieceweight The value of fractionpieceweight as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFractionpieceweight_GreaterThan(java.math.BigDecimal fractionpieceweight) {
        regFractionpieceweight(CK_GT, fractionpieceweight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FractionPieceWeight: {decimal(16, 6)}
     * @param fractionpieceweight The value of fractionpieceweight as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFractionpieceweight_LessThan(java.math.BigDecimal fractionpieceweight) {
        regFractionpieceweight(CK_LT, fractionpieceweight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FractionPieceWeight: {decimal(16, 6)}
     * @param fractionpieceweight The value of fractionpieceweight as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFractionpieceweight_GreaterEqual(java.math.BigDecimal fractionpieceweight) {
        regFractionpieceweight(CK_GE, fractionpieceweight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FractionPieceWeight: {decimal(16, 6)}
     * @param fractionpieceweight The value of fractionpieceweight as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFractionpieceweight_LessEqual(java.math.BigDecimal fractionpieceweight) {
        regFractionpieceweight(CK_LE, fractionpieceweight);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FractionPieceWeight: {decimal(16, 6)}
     * @param minNumber The min number of fractionpieceweight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fractionpieceweight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFractionpieceweight_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFractionpieceweight(), "FractionPieceWeight", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FractionPieceWeight: {decimal(16, 6)}
     * @param fractionpieceweightList The collection of fractionpieceweight as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFractionpieceweight_InScope(Collection<java.math.BigDecimal> fractionpieceweightList) {
        doSetFractionpieceweight_InScope(fractionpieceweightList);
    }

    protected void doSetFractionpieceweight_InScope(Collection<java.math.BigDecimal> fractionpieceweightList) {
        regINS(CK_INS, cTL(fractionpieceweightList), xgetCValueFractionpieceweight(), "FractionPieceWeight");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FractionPieceWeight: {decimal(16, 6)}
     * @param fractionpieceweightList The collection of fractionpieceweight as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFractionpieceweight_NotInScope(Collection<java.math.BigDecimal> fractionpieceweightList) {
        doSetFractionpieceweight_NotInScope(fractionpieceweightList);
    }

    protected void doSetFractionpieceweight_NotInScope(Collection<java.math.BigDecimal> fractionpieceweightList) {
        regINS(CK_NINS, cTL(fractionpieceweightList), xgetCValueFractionpieceweight(), "FractionPieceWeight");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FractionPieceWeight: {decimal(16, 6)}
     */
    public void setFractionpieceweight_IsNull() { regFractionpieceweight(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FractionPieceWeight: {decimal(16, 6)}
     */
    public void setFractionpieceweight_IsNotNull() { regFractionpieceweight(CK_ISNN, DOBJ); }

    protected void regFractionpieceweight(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFractionpieceweight(), "FractionPieceWeight"); }
    protected abstract ConditionValue xgetCValueFractionpieceweight();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TaxEquivalentNumber: {decimal(16, 6)}
     * @param taxequivalentnumber The value of taxequivalentnumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxequivalentnumber_Equal(java.math.BigDecimal taxequivalentnumber) {
        doSetTaxequivalentnumber_Equal(taxequivalentnumber);
    }

    protected void doSetTaxequivalentnumber_Equal(java.math.BigDecimal taxequivalentnumber) {
        regTaxequivalentnumber(CK_EQ, taxequivalentnumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TaxEquivalentNumber: {decimal(16, 6)}
     * @param taxequivalentnumber The value of taxequivalentnumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxequivalentnumber_NotEqual(java.math.BigDecimal taxequivalentnumber) {
        doSetTaxequivalentnumber_NotEqual(taxequivalentnumber);
    }

    protected void doSetTaxequivalentnumber_NotEqual(java.math.BigDecimal taxequivalentnumber) {
        regTaxequivalentnumber(CK_NES, taxequivalentnumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TaxEquivalentNumber: {decimal(16, 6)}
     * @param taxequivalentnumber The value of taxequivalentnumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxequivalentnumber_GreaterThan(java.math.BigDecimal taxequivalentnumber) {
        regTaxequivalentnumber(CK_GT, taxequivalentnumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TaxEquivalentNumber: {decimal(16, 6)}
     * @param taxequivalentnumber The value of taxequivalentnumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxequivalentnumber_LessThan(java.math.BigDecimal taxequivalentnumber) {
        regTaxequivalentnumber(CK_LT, taxequivalentnumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TaxEquivalentNumber: {decimal(16, 6)}
     * @param taxequivalentnumber The value of taxequivalentnumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxequivalentnumber_GreaterEqual(java.math.BigDecimal taxequivalentnumber) {
        regTaxequivalentnumber(CK_GE, taxequivalentnumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TaxEquivalentNumber: {decimal(16, 6)}
     * @param taxequivalentnumber The value of taxequivalentnumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxequivalentnumber_LessEqual(java.math.BigDecimal taxequivalentnumber) {
        regTaxequivalentnumber(CK_LE, taxequivalentnumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TaxEquivalentNumber: {decimal(16, 6)}
     * @param minNumber The min number of taxequivalentnumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of taxequivalentnumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTaxequivalentnumber_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTaxequivalentnumber(), "TaxEquivalentNumber", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TaxEquivalentNumber: {decimal(16, 6)}
     * @param taxequivalentnumberList The collection of taxequivalentnumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxequivalentnumber_InScope(Collection<java.math.BigDecimal> taxequivalentnumberList) {
        doSetTaxequivalentnumber_InScope(taxequivalentnumberList);
    }

    protected void doSetTaxequivalentnumber_InScope(Collection<java.math.BigDecimal> taxequivalentnumberList) {
        regINS(CK_INS, cTL(taxequivalentnumberList), xgetCValueTaxequivalentnumber(), "TaxEquivalentNumber");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TaxEquivalentNumber: {decimal(16, 6)}
     * @param taxequivalentnumberList The collection of taxequivalentnumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxequivalentnumber_NotInScope(Collection<java.math.BigDecimal> taxequivalentnumberList) {
        doSetTaxequivalentnumber_NotInScope(taxequivalentnumberList);
    }

    protected void doSetTaxequivalentnumber_NotInScope(Collection<java.math.BigDecimal> taxequivalentnumberList) {
        regINS(CK_NINS, cTL(taxequivalentnumberList), xgetCValueTaxequivalentnumber(), "TaxEquivalentNumber");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TaxEquivalentNumber: {decimal(16, 6)}
     */
    public void setTaxequivalentnumber_IsNull() { regTaxequivalentnumber(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TaxEquivalentNumber: {decimal(16, 6)}
     */
    public void setTaxequivalentnumber_IsNotNull() { regTaxequivalentnumber(CK_ISNN, DOBJ); }

    protected void regTaxequivalentnumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaxequivalentnumber(), "TaxEquivalentNumber"); }
    protected abstract ConditionValue xgetCValueTaxequivalentnumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYHNKBNJT: {varchar(30)}
     * @param syhnkbnjt The value of syhnkbnjt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnkbnjt_Equal(String syhnkbnjt) {
        doSetSyhnkbnjt_Equal(fRES(syhnkbnjt));
    }

    protected void doSetSyhnkbnjt_Equal(String syhnkbnjt) {
        regSyhnkbnjt(CK_EQ, syhnkbnjt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYHNKBNJT: {varchar(30)}
     * @param syhnkbnjt The value of syhnkbnjt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnkbnjt_NotEqual(String syhnkbnjt) {
        doSetSyhnkbnjt_NotEqual(fRES(syhnkbnjt));
    }

    protected void doSetSyhnkbnjt_NotEqual(String syhnkbnjt) {
        regSyhnkbnjt(CK_NES, syhnkbnjt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYHNKBNJT: {varchar(30)}
     * @param syhnkbnjt The value of syhnkbnjt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnkbnjt_GreaterThan(String syhnkbnjt) {
        regSyhnkbnjt(CK_GT, fRES(syhnkbnjt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYHNKBNJT: {varchar(30)}
     * @param syhnkbnjt The value of syhnkbnjt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnkbnjt_LessThan(String syhnkbnjt) {
        regSyhnkbnjt(CK_LT, fRES(syhnkbnjt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYHNKBNJT: {varchar(30)}
     * @param syhnkbnjt The value of syhnkbnjt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnkbnjt_GreaterEqual(String syhnkbnjt) {
        regSyhnkbnjt(CK_GE, fRES(syhnkbnjt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYHNKBNJT: {varchar(30)}
     * @param syhnkbnjt The value of syhnkbnjt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnkbnjt_LessEqual(String syhnkbnjt) {
        regSyhnkbnjt(CK_LE, fRES(syhnkbnjt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYHNKBNJT: {varchar(30)}
     * @param syhnkbnjtList The collection of syhnkbnjt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnkbnjt_InScope(Collection<String> syhnkbnjtList) {
        doSetSyhnkbnjt_InScope(syhnkbnjtList);
    }

    protected void doSetSyhnkbnjt_InScope(Collection<String> syhnkbnjtList) {
        regINS(CK_INS, cTL(syhnkbnjtList), xgetCValueSyhnkbnjt(), "SYHNKBNJT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYHNKBNJT: {varchar(30)}
     * @param syhnkbnjtList The collection of syhnkbnjt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnkbnjt_NotInScope(Collection<String> syhnkbnjtList) {
        doSetSyhnkbnjt_NotInScope(syhnkbnjtList);
    }

    protected void doSetSyhnkbnjt_NotInScope(Collection<String> syhnkbnjtList) {
        regINS(CK_NINS, cTL(syhnkbnjtList), xgetCValueSyhnkbnjt(), "SYHNKBNJT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYHNKBNJT: {varchar(30)} <br>
     * <pre>e.g. setSyhnkbnjt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param syhnkbnjt The value of syhnkbnjt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSyhnkbnjt_LikeSearch(String syhnkbnjt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(syhnkbnjt), xgetCValueSyhnkbnjt(), "SYHNKBNJT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYHNKBNJT: {varchar(30)}
     * @param syhnkbnjt The value of syhnkbnjt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSyhnkbnjt_NotLikeSearch(String syhnkbnjt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(syhnkbnjt), xgetCValueSyhnkbnjt(), "SYHNKBNJT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYHNKBNJT: {varchar(30)}
     * @param syhnkbnjt The value of syhnkbnjt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnkbnjt_PrefixSearch(String syhnkbnjt) {
        setSyhnkbnjt_LikeSearch(syhnkbnjt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYHNKBNJT: {varchar(30)}
     */
    public void setSyhnkbnjt_IsNull() { regSyhnkbnjt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYHNKBNJT: {varchar(30)}
     */
    public void setSyhnkbnjt_IsNullOrEmpty() { regSyhnkbnjt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYHNKBNJT: {varchar(30)}
     */
    public void setSyhnkbnjt_IsNotNull() { regSyhnkbnjt(CK_ISNN, DOBJ); }

    protected void regSyhnkbnjt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSyhnkbnjt(), "SYHNKBNJT"); }
    protected abstract ConditionValue xgetCValueSyhnkbnjt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidCls The value of ioidCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_Equal(String ioidCls) {
        doSetIoidCls_Equal(fRES(ioidCls));
    }

    protected void doSetIoidCls_Equal(String ioidCls) {
        regIoidCls(CK_EQ, ioidCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidCls The value of ioidCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_NotEqual(String ioidCls) {
        doSetIoidCls_NotEqual(fRES(ioidCls));
    }

    protected void doSetIoidCls_NotEqual(String ioidCls) {
        regIoidCls(CK_NES, ioidCls);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidCls The value of ioidCls as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_GreaterThan(String ioidCls) {
        regIoidCls(CK_GT, fRES(ioidCls));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidCls The value of ioidCls as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_LessThan(String ioidCls) {
        regIoidCls(CK_LT, fRES(ioidCls));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidCls The value of ioidCls as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_GreaterEqual(String ioidCls) {
        regIoidCls(CK_GE, fRES(ioidCls));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidCls The value of ioidCls as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_LessEqual(String ioidCls) {
        regIoidCls(CK_LE, fRES(ioidCls));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidClsList The collection of ioidCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_InScope(Collection<String> ioidClsList) {
        doSetIoidCls_InScope(ioidClsList);
    }

    protected void doSetIoidCls_InScope(Collection<String> ioidClsList) {
        regINS(CK_INS, cTL(ioidClsList), xgetCValueIoidCls(), "IOID_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidClsList The collection of ioidCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_NotInScope(Collection<String> ioidClsList) {
        doSetIoidCls_NotInScope(ioidClsList);
    }

    protected void doSetIoidCls_NotInScope(Collection<String> ioidClsList) {
        regINS(CK_NINS, cTL(ioidClsList), xgetCValueIoidCls(), "IOID_CLS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IOID_CLS: {varchar(30)} <br>
     * <pre>e.g. setIoidCls_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ioidCls The value of ioidCls as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIoidCls_LikeSearch(String ioidCls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ioidCls), xgetCValueIoidCls(), "IOID_CLS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidCls The value of ioidCls as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIoidCls_NotLikeSearch(String ioidCls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ioidCls), xgetCValueIoidCls(), "IOID_CLS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidCls The value of ioidCls as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_PrefixSearch(String ioidCls) {
        setIoidCls_LikeSearch(ioidCls, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     */
    public void setIoidCls_IsNull() { regIoidCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     */
    public void setIoidCls_IsNullOrEmpty() { regIoidCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     */
    public void setIoidCls_IsNotNull() { regIoidCls(CK_ISNN, DOBJ); }

    protected void regIoidCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIoidCls(), "IOID_CLS"); }
    protected abstract ConditionValue xgetCValueIoidCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD_CLS: {varchar(30)}
     * @param itfcdCls The value of itfcdCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcdCls_Equal(String itfcdCls) {
        doSetItfcdCls_Equal(fRES(itfcdCls));
    }

    protected void doSetItfcdCls_Equal(String itfcdCls) {
        regItfcdCls(CK_EQ, itfcdCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD_CLS: {varchar(30)}
     * @param itfcdCls The value of itfcdCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcdCls_NotEqual(String itfcdCls) {
        doSetItfcdCls_NotEqual(fRES(itfcdCls));
    }

    protected void doSetItfcdCls_NotEqual(String itfcdCls) {
        regItfcdCls(CK_NES, itfcdCls);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD_CLS: {varchar(30)}
     * @param itfcdCls The value of itfcdCls as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcdCls_GreaterThan(String itfcdCls) {
        regItfcdCls(CK_GT, fRES(itfcdCls));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD_CLS: {varchar(30)}
     * @param itfcdCls The value of itfcdCls as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcdCls_LessThan(String itfcdCls) {
        regItfcdCls(CK_LT, fRES(itfcdCls));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD_CLS: {varchar(30)}
     * @param itfcdCls The value of itfcdCls as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcdCls_GreaterEqual(String itfcdCls) {
        regItfcdCls(CK_GE, fRES(itfcdCls));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD_CLS: {varchar(30)}
     * @param itfcdCls The value of itfcdCls as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcdCls_LessEqual(String itfcdCls) {
        regItfcdCls(CK_LE, fRES(itfcdCls));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITFCD_CLS: {varchar(30)}
     * @param itfcdClsList The collection of itfcdCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcdCls_InScope(Collection<String> itfcdClsList) {
        doSetItfcdCls_InScope(itfcdClsList);
    }

    protected void doSetItfcdCls_InScope(Collection<String> itfcdClsList) {
        regINS(CK_INS, cTL(itfcdClsList), xgetCValueItfcdCls(), "ITFCD_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITFCD_CLS: {varchar(30)}
     * @param itfcdClsList The collection of itfcdCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcdCls_NotInScope(Collection<String> itfcdClsList) {
        doSetItfcdCls_NotInScope(itfcdClsList);
    }

    protected void doSetItfcdCls_NotInScope(Collection<String> itfcdClsList) {
        regINS(CK_NINS, cTL(itfcdClsList), xgetCValueItfcdCls(), "ITFCD_CLS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITFCD_CLS: {varchar(30)} <br>
     * <pre>e.g. setItfcdCls_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itfcdCls The value of itfcdCls as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItfcdCls_LikeSearch(String itfcdCls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itfcdCls), xgetCValueItfcdCls(), "ITFCD_CLS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITFCD_CLS: {varchar(30)}
     * @param itfcdCls The value of itfcdCls as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItfcdCls_NotLikeSearch(String itfcdCls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itfcdCls), xgetCValueItfcdCls(), "ITFCD_CLS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITFCD_CLS: {varchar(30)}
     * @param itfcdCls The value of itfcdCls as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcdCls_PrefixSearch(String itfcdCls) {
        setItfcdCls_LikeSearch(itfcdCls, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITFCD_CLS: {varchar(30)}
     */
    public void setItfcdCls_IsNull() { regItfcdCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITFCD_CLS: {varchar(30)}
     */
    public void setItfcdCls_IsNullOrEmpty() { regItfcdCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITFCD_CLS: {varchar(30)}
     */
    public void setItfcdCls_IsNotNull() { regItfcdCls(CK_ISNN, DOBJ); }

    protected void regItfcdCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItfcdCls(), "ITFCD_CLS"); }
    protected abstract ConditionValue xgetCValueItfcdCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD_CLS: {varchar(30)}
     * @param manuitemcdCls The value of manuitemcdCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcdCls_Equal(String manuitemcdCls) {
        doSetManuitemcdCls_Equal(fRES(manuitemcdCls));
    }

    protected void doSetManuitemcdCls_Equal(String manuitemcdCls) {
        regManuitemcdCls(CK_EQ, manuitemcdCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD_CLS: {varchar(30)}
     * @param manuitemcdCls The value of manuitemcdCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcdCls_NotEqual(String manuitemcdCls) {
        doSetManuitemcdCls_NotEqual(fRES(manuitemcdCls));
    }

    protected void doSetManuitemcdCls_NotEqual(String manuitemcdCls) {
        regManuitemcdCls(CK_NES, manuitemcdCls);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD_CLS: {varchar(30)}
     * @param manuitemcdCls The value of manuitemcdCls as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcdCls_GreaterThan(String manuitemcdCls) {
        regManuitemcdCls(CK_GT, fRES(manuitemcdCls));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD_CLS: {varchar(30)}
     * @param manuitemcdCls The value of manuitemcdCls as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcdCls_LessThan(String manuitemcdCls) {
        regManuitemcdCls(CK_LT, fRES(manuitemcdCls));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD_CLS: {varchar(30)}
     * @param manuitemcdCls The value of manuitemcdCls as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcdCls_GreaterEqual(String manuitemcdCls) {
        regManuitemcdCls(CK_GE, fRES(manuitemcdCls));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD_CLS: {varchar(30)}
     * @param manuitemcdCls The value of manuitemcdCls as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcdCls_LessEqual(String manuitemcdCls) {
        regManuitemcdCls(CK_LE, fRES(manuitemcdCls));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUITEMCD_CLS: {varchar(30)}
     * @param manuitemcdClsList The collection of manuitemcdCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcdCls_InScope(Collection<String> manuitemcdClsList) {
        doSetManuitemcdCls_InScope(manuitemcdClsList);
    }

    protected void doSetManuitemcdCls_InScope(Collection<String> manuitemcdClsList) {
        regINS(CK_INS, cTL(manuitemcdClsList), xgetCValueManuitemcdCls(), "MANUITEMCD_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUITEMCD_CLS: {varchar(30)}
     * @param manuitemcdClsList The collection of manuitemcdCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcdCls_NotInScope(Collection<String> manuitemcdClsList) {
        doSetManuitemcdCls_NotInScope(manuitemcdClsList);
    }

    protected void doSetManuitemcdCls_NotInScope(Collection<String> manuitemcdClsList) {
        regINS(CK_NINS, cTL(manuitemcdClsList), xgetCValueManuitemcdCls(), "MANUITEMCD_CLS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUITEMCD_CLS: {varchar(30)} <br>
     * <pre>e.g. setManuitemcdCls_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manuitemcdCls The value of manuitemcdCls as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManuitemcdCls_LikeSearch(String manuitemcdCls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manuitemcdCls), xgetCValueManuitemcdCls(), "MANUITEMCD_CLS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUITEMCD_CLS: {varchar(30)}
     * @param manuitemcdCls The value of manuitemcdCls as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManuitemcdCls_NotLikeSearch(String manuitemcdCls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manuitemcdCls), xgetCValueManuitemcdCls(), "MANUITEMCD_CLS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUITEMCD_CLS: {varchar(30)}
     * @param manuitemcdCls The value of manuitemcdCls as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcdCls_PrefixSearch(String manuitemcdCls) {
        setManuitemcdCls_LikeSearch(manuitemcdCls, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUITEMCD_CLS: {varchar(30)}
     */
    public void setManuitemcdCls_IsNull() { regManuitemcdCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUITEMCD_CLS: {varchar(30)}
     */
    public void setManuitemcdCls_IsNullOrEmpty() { regManuitemcdCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUITEMCD_CLS: {varchar(30)}
     */
    public void setManuitemcdCls_IsNotNull() { regManuitemcdCls(CK_ISNN, DOBJ); }

    protected void regManuitemcdCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManuitemcdCls(), "MANUITEMCD_CLS"); }
    protected abstract ConditionValue xgetCValueManuitemcdCls();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTCPY: {bigint(19)}
     * @param ctcpy The value of ctcpy as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtcpy_Equal(Long ctcpy) {
        doSetCtcpy_Equal(ctcpy);
    }

    protected void doSetCtcpy_Equal(Long ctcpy) {
        regCtcpy(CK_EQ, ctcpy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTCPY: {bigint(19)}
     * @param ctcpy The value of ctcpy as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtcpy_NotEqual(Long ctcpy) {
        doSetCtcpy_NotEqual(ctcpy);
    }

    protected void doSetCtcpy_NotEqual(Long ctcpy) {
        regCtcpy(CK_NES, ctcpy);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTCPY: {bigint(19)}
     * @param ctcpy The value of ctcpy as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtcpy_GreaterThan(Long ctcpy) {
        regCtcpy(CK_GT, ctcpy);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTCPY: {bigint(19)}
     * @param ctcpy The value of ctcpy as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtcpy_LessThan(Long ctcpy) {
        regCtcpy(CK_LT, ctcpy);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTCPY: {bigint(19)}
     * @param ctcpy The value of ctcpy as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtcpy_GreaterEqual(Long ctcpy) {
        regCtcpy(CK_GE, ctcpy);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTCPY: {bigint(19)}
     * @param ctcpy The value of ctcpy as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtcpy_LessEqual(Long ctcpy) {
        regCtcpy(CK_LE, ctcpy);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CTCPY: {bigint(19)}
     * @param minNumber The min number of ctcpy. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ctcpy. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCtcpy_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCtcpy(), "CTCPY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTCPY: {bigint(19)}
     * @param ctcpyList The collection of ctcpy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtcpy_InScope(Collection<Long> ctcpyList) {
        doSetCtcpy_InScope(ctcpyList);
    }

    protected void doSetCtcpy_InScope(Collection<Long> ctcpyList) {
        regINS(CK_INS, cTL(ctcpyList), xgetCValueCtcpy(), "CTCPY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTCPY: {bigint(19)}
     * @param ctcpyList The collection of ctcpy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtcpy_NotInScope(Collection<Long> ctcpyList) {
        doSetCtcpy_NotInScope(ctcpyList);
    }

    protected void doSetCtcpy_NotInScope(Collection<Long> ctcpyList) {
        regINS(CK_NINS, cTL(ctcpyList), xgetCValueCtcpy(), "CTCPY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTCPY: {bigint(19)}
     */
    public void setCtcpy_IsNull() { regCtcpy(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTCPY: {bigint(19)}
     */
    public void setCtcpy_IsNotNull() { regCtcpy(CK_ISNN, DOBJ); }

    protected void regCtcpy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtcpy(), "CTCPY"); }
    protected abstract ConditionValue xgetCValueCtcpy();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As DelFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlgList The collection of delFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope(Collection<String> delFlgList) {
        doSetDelFlg_InScope(delFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As DelFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope_AsDelFlg(Collection<CDef.DelFlg> cdefList) {
        doSetDelFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDelFlg_InScope(Collection<String> delFlgList) {
        regINS(CK_INS, cTL(delFlgList), xgetCValueDelFlg(), "DEL_FLG");
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
    public HpSLCFunction<MProductCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MProductCB.class);
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
    public HpSLCFunction<MProductCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MProductCB.class);
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
    public HpSLCFunction<MProductCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MProductCB.class);
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
    public HpSLCFunction<MProductCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MProductCB.class);
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
    public HpSLCFunction<MProductCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MProductCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MProductCB&gt;() {
     *     public void query(MProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MProductCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MProductCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MProductCQ sq);

    protected MProductCB xcreateScalarConditionCB() {
        MProductCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MProductCB xcreateScalarConditionPartitionByCB() {
        MProductCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductCB cb = new MProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRODUCT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MProductCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MProductCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MProductCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductCB cb = new MProductCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRODUCT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MProductCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MProductCQ sq);

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
    protected MProductCB newMyCB() {
        return new MProductCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MProductCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
