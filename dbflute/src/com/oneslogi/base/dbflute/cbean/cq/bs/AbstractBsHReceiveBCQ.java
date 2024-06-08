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
 * The abstract condition-query of H_RECEIVE_B.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsHReceiveBCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsHReceiveBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "H_RECEIVE_B";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param storeRecordBId The value of storeRecordBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_Equal(Long storeRecordBId) {
        doSetStoreRecordBId_Equal(storeRecordBId);
    }

    protected void doSetStoreRecordBId_Equal(Long storeRecordBId) {
        regStoreRecordBId(CK_EQ, storeRecordBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param storeRecordBId The value of storeRecordBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_NotEqual(Long storeRecordBId) {
        doSetStoreRecordBId_NotEqual(storeRecordBId);
    }

    protected void doSetStoreRecordBId_NotEqual(Long storeRecordBId) {
        regStoreRecordBId(CK_NES, storeRecordBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param storeRecordBId The value of storeRecordBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_GreaterThan(Long storeRecordBId) {
        regStoreRecordBId(CK_GT, storeRecordBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param storeRecordBId The value of storeRecordBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_LessThan(Long storeRecordBId) {
        regStoreRecordBId(CK_LT, storeRecordBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param storeRecordBId The value of storeRecordBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_GreaterEqual(Long storeRecordBId) {
        regStoreRecordBId(CK_GE, storeRecordBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param storeRecordBId The value of storeRecordBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_LessEqual(Long storeRecordBId) {
        regStoreRecordBId(CK_LE, storeRecordBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of storeRecordBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeRecordBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreRecordBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreRecordBId(), "STORE_RECORD_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param storeRecordBIdList The collection of storeRecordBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordBId_InScope(Collection<Long> storeRecordBIdList) {
        doSetStoreRecordBId_InScope(storeRecordBIdList);
    }

    protected void doSetStoreRecordBId_InScope(Collection<Long> storeRecordBIdList) {
        regINS(CK_INS, cTL(storeRecordBIdList), xgetCValueStoreRecordBId(), "STORE_RECORD_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param storeRecordBIdList The collection of storeRecordBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordBId_NotInScope(Collection<Long> storeRecordBIdList) {
        doSetStoreRecordBId_NotInScope(storeRecordBIdList);
    }

    protected void doSetStoreRecordBId_NotInScope(Collection<Long> storeRecordBIdList) {
        regINS(CK_NINS, cTL(storeRecordBIdList), xgetCValueStoreRecordBId(), "STORE_RECORD_B_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select STORE_RECORD_B_ID from H_RECEIVE_SPARE where ...)} <br>
     * H_RECEIVE_SPARE by STORE_RECORD_B_ID, named 'HReceiveSpareAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsHReceiveSpareAsOne</span>(spareCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     spareCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of HReceiveSpareAsOne for 'exists'. (NotNull)
     */
    public void existsHReceiveSpareAsOne(SubQuery<HReceiveSpareCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HReceiveSpareCB cb = new HReceiveSpareCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStoreRecordBId_ExistsReferrer_HReceiveSpareAsOne(cb.query());
        registerExistsReferrer(cb.query(), "STORE_RECORD_B_ID", "STORE_RECORD_B_ID", pp, "hReceiveSpareAsOne");
    }
    public abstract String keepStoreRecordBId_ExistsReferrer_HReceiveSpareAsOne(HReceiveSpareCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select STORE_RECORD_B_ID from H_RECEIVE_SPARE where ...)} <br>
     * H_RECEIVE_SPARE by STORE_RECORD_B_ID, named 'HReceiveSpareAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsHReceiveSpareAsOne</span>(spareCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     spareCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of StoreRecordBId_NotExistsReferrer_HReceiveSpareAsOne for 'not exists'. (NotNull)
     */
    public void notExistsHReceiveSpareAsOne(SubQuery<HReceiveSpareCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HReceiveSpareCB cb = new HReceiveSpareCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStoreRecordBId_NotExistsReferrer_HReceiveSpareAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "STORE_RECORD_B_ID", "STORE_RECORD_B_ID", pp, "hReceiveSpareAsOne");
    }
    public abstract String keepStoreRecordBId_NotExistsReferrer_HReceiveSpareAsOne(HReceiveSpareCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setStoreRecordBId_IsNull() { regStoreRecordBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setStoreRecordBId_IsNotNull() { regStoreRecordBId(CK_ISNN, DOBJ); }

    protected void regStoreRecordBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreRecordBId(), "STORE_RECORD_B_ID"); }
    protected abstract ConditionValue xgetCValueStoreRecordBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H}
     * @param storeRecordHId The value of storeRecordHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordHId_Equal(Long storeRecordHId) {
        doSetStoreRecordHId_Equal(storeRecordHId);
    }

    protected void doSetStoreRecordHId_Equal(Long storeRecordHId) {
        regStoreRecordHId(CK_EQ, storeRecordHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H}
     * @param storeRecordHId The value of storeRecordHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordHId_NotEqual(Long storeRecordHId) {
        doSetStoreRecordHId_NotEqual(storeRecordHId);
    }

    protected void doSetStoreRecordHId_NotEqual(Long storeRecordHId) {
        regStoreRecordHId(CK_NES, storeRecordHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H}
     * @param storeRecordHId The value of storeRecordHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordHId_GreaterThan(Long storeRecordHId) {
        regStoreRecordHId(CK_GT, storeRecordHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H}
     * @param storeRecordHId The value of storeRecordHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordHId_LessThan(Long storeRecordHId) {
        regStoreRecordHId(CK_LT, storeRecordHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H}
     * @param storeRecordHId The value of storeRecordHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordHId_GreaterEqual(Long storeRecordHId) {
        regStoreRecordHId(CK_GE, storeRecordHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H}
     * @param storeRecordHId The value of storeRecordHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordHId_LessEqual(Long storeRecordHId) {
        regStoreRecordHId(CK_LE, storeRecordHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H}
     * @param minNumber The min number of storeRecordHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeRecordHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreRecordHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreRecordHId(), "STORE_RECORD_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H}
     * @param storeRecordHIdList The collection of storeRecordHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordHId_InScope(Collection<Long> storeRecordHIdList) {
        doSetStoreRecordHId_InScope(storeRecordHIdList);
    }

    protected void doSetStoreRecordHId_InScope(Collection<Long> storeRecordHIdList) {
        regINS(CK_INS, cTL(storeRecordHIdList), xgetCValueStoreRecordHId(), "STORE_RECORD_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H}
     * @param storeRecordHIdList The collection of storeRecordHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordHId_NotInScope(Collection<Long> storeRecordHIdList) {
        doSetStoreRecordHId_NotInScope(storeRecordHIdList);
    }

    protected void doSetStoreRecordHId_NotInScope(Collection<Long> storeRecordHIdList) {
        regINS(CK_NINS, cTL(storeRecordHIdList), xgetCValueStoreRecordHId(), "STORE_RECORD_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STORE_RECORD_H_ID from H_RECEIVE_H where ...)} <br />
     * H_RECEIVE_H by my STORE_RECORD_H_ID, named 'HReceiveH'.
     * @param subCBLambda The callback for sub-query of HReceiveH for 'in-scope'. (NotNull)
     */
    public void inScopeHReceiveH(SubQuery<HReceiveHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HReceiveHCB cb = new HReceiveHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStoreRecordHId_InScopeRelation_HReceiveH(cb.query());
        registerInScopeRelation(cb.query(), "STORE_RECORD_H_ID", "STORE_RECORD_H_ID", pp, "hReceiveH", false);
    }
    public abstract String keepStoreRecordHId_InScopeRelation_HReceiveH(HReceiveHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STORE_RECORD_H_ID from H_RECEIVE_H where ...)} <br />
     * H_RECEIVE_H by my STORE_RECORD_H_ID, named 'HReceiveH'.
     * @param subCBLambda The callback for sub-query of HReceiveH for 'not in-scope'. (NotNull)
     */
    public void notInScopeHReceiveH(SubQuery<HReceiveHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HReceiveHCB cb = new HReceiveHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStoreRecordHId_NotInScopeRelation_HReceiveH(cb.query());
        registerInScopeRelation(cb.query(), "STORE_RECORD_H_ID", "STORE_RECORD_H_ID", pp, "hReceiveH", true);
    }
    public abstract String keepStoreRecordHId_NotInScopeRelation_HReceiveH(HReceiveHCQ sq);

    protected void regStoreRecordHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreRecordHId(), "STORE_RECORD_H_ID"); }
    protected abstract ConditionValue xgetCValueStoreRecordHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
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
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
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
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterThan(Long stockId) {
        regStockId(CK_GT, stockId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessThan(Long stockId) {
        regStockId(CK_LT, stockId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterEqual(Long stockId) {
        regStockId(CK_GE, stockId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockId The value of stockId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessEqual(Long stockId) {
        regStockId(CK_LE, stockId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param minNumber The min number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockId(), "STOCK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
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
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @param stockIdList The collection of stockId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_NotInScope(Collection<Long> stockIdList) {
        doSetStockId_NotInScope(stockIdList);
    }

    protected void doSetStockId_NotInScope(Collection<Long> stockIdList) {
        regINS(CK_NINS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STOCK_ID from H_STOCK where ...)} <br />
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * @param subCBLambda The callback for sub-query of HStock for 'in-scope'. (NotNull)
     */
    public void inScopeHStock(SubQuery<HStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HStockCB cb = new HStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_InScopeRelation_HStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "hStock", false);
    }
    public abstract String keepStockId_InScopeRelation_HStock(HStockCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STOCK_ID from H_STOCK where ...)} <br />
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * @param subCBLambda The callback for sub-query of HStock for 'not in-scope'. (NotNull)
     */
    public void notInScopeHStock(SubQuery<HStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HStockCB cb = new HStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_NotInScopeRelation_HStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "hStock", true);
    }
    public abstract String keepStockId_NotInScopeRelation_HStock(HStockCQ sq);

    protected void regStockId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockId(), "STOCK_ID"); }
    protected abstract ConditionValue xgetCValueStockId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param planNum The value of planNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_Equal(java.math.BigDecimal planNum) {
        doSetPlanNum_Equal(planNum);
    }

    protected void doSetPlanNum_Equal(java.math.BigDecimal planNum) {
        regPlanNum(CK_EQ, planNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param planNum The value of planNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_NotEqual(java.math.BigDecimal planNum) {
        doSetPlanNum_NotEqual(planNum);
    }

    protected void doSetPlanNum_NotEqual(java.math.BigDecimal planNum) {
        regPlanNum(CK_NES, planNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param planNum The value of planNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_GreaterThan(java.math.BigDecimal planNum) {
        regPlanNum(CK_GT, planNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param planNum The value of planNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_LessThan(java.math.BigDecimal planNum) {
        regPlanNum(CK_LT, planNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param planNum The value of planNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_GreaterEqual(java.math.BigDecimal planNum) {
        regPlanNum(CK_GE, planNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param planNum The value of planNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_LessEqual(java.math.BigDecimal planNum) {
        regPlanNum(CK_LE, planNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param minNumber The min number of planNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of planNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPlanNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlanNum(), "PLAN_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param planNumList The collection of planNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanNum_InScope(Collection<java.math.BigDecimal> planNumList) {
        doSetPlanNum_InScope(planNumList);
    }

    protected void doSetPlanNum_InScope(Collection<java.math.BigDecimal> planNumList) {
        regINS(CK_INS, cTL(planNumList), xgetCValuePlanNum(), "PLAN_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @param planNumList The collection of planNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanNum_NotInScope(Collection<java.math.BigDecimal> planNumList) {
        doSetPlanNum_NotInScope(planNumList);
    }

    protected void doSetPlanNum_NotInScope(Collection<java.math.BigDecimal> planNumList) {
        regINS(CK_NINS, cTL(planNumList), xgetCValuePlanNum(), "PLAN_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     */
    public void setPlanNum_IsNull() { regPlanNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_NUM: {decimal(16, 6)}
     */
    public void setPlanNum_IsNotNull() { regPlanNum(CK_ISNN, DOBJ); }

    protected void regPlanNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanNum(), "PLAN_NUM"); }
    protected abstract ConditionValue xgetCValuePlanNum();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {IX, varchar(8)}
     * @param storeDt The value of storeDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_Equal(String storeDt) {
        doSetStoreDt_Equal(fRES(storeDt));
    }

    protected void doSetStoreDt_Equal(String storeDt) {
        regStoreDt(CK_EQ, storeDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {IX, varchar(8)}
     * @param storeDt The value of storeDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_NotEqual(String storeDt) {
        doSetStoreDt_NotEqual(fRES(storeDt));
    }

    protected void doSetStoreDt_NotEqual(String storeDt) {
        regStoreDt(CK_NES, storeDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {IX, varchar(8)}
     * @param storeDt The value of storeDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_GreaterThan(String storeDt) {
        regStoreDt(CK_GT, fRES(storeDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {IX, varchar(8)}
     * @param storeDt The value of storeDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_LessThan(String storeDt) {
        regStoreDt(CK_LT, fRES(storeDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {IX, varchar(8)}
     * @param storeDt The value of storeDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_GreaterEqual(String storeDt) {
        regStoreDt(CK_GE, fRES(storeDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {IX, varchar(8)}
     * @param storeDt The value of storeDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_LessEqual(String storeDt) {
        regStoreDt(CK_LE, fRES(storeDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_DT: {IX, varchar(8)}
     * @param storeDtList The collection of storeDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_InScope(Collection<String> storeDtList) {
        doSetStoreDt_InScope(storeDtList);
    }

    protected void doSetStoreDt_InScope(Collection<String> storeDtList) {
        regINS(CK_INS, cTL(storeDtList), xgetCValueStoreDt(), "STORE_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_DT: {IX, varchar(8)}
     * @param storeDtList The collection of storeDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_NotInScope(Collection<String> storeDtList) {
        doSetStoreDt_NotInScope(storeDtList);
    }

    protected void doSetStoreDt_NotInScope(Collection<String> storeDtList) {
        regINS(CK_NINS, cTL(storeDtList), xgetCValueStoreDt(), "STORE_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_DT: {IX, varchar(8)} <br>
     * <pre>e.g. setStoreDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeDt The value of storeDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreDt_LikeSearch(String storeDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeDt), xgetCValueStoreDt(), "STORE_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_DT: {IX, varchar(8)}
     * @param storeDt The value of storeDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreDt_NotLikeSearch(String storeDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeDt), xgetCValueStoreDt(), "STORE_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_DT: {IX, varchar(8)}
     * @param storeDt The value of storeDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_PrefixSearch(String storeDt) {
        setStoreDt_LikeSearch(storeDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_DT: {IX, varchar(8)}
     */
    public void setStoreDt_IsNull() { regStoreDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_DT: {IX, varchar(8)}
     */
    public void setStoreDt_IsNullOrEmpty() { regStoreDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_DT: {IX, varchar(8)}
     */
    public void setStoreDt_IsNotNull() { regStoreDt(CK_ISNN, DOBJ); }

    protected void regStoreDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreDt(), "STORE_DT"); }
    protected abstract ConditionValue xgetCValueStoreDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param storeNum The value of storeNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_Equal(java.math.BigDecimal storeNum) {
        doSetStoreNum_Equal(storeNum);
    }

    protected void doSetStoreNum_Equal(java.math.BigDecimal storeNum) {
        regStoreNum(CK_EQ, storeNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param storeNum The value of storeNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_NotEqual(java.math.BigDecimal storeNum) {
        doSetStoreNum_NotEqual(storeNum);
    }

    protected void doSetStoreNum_NotEqual(java.math.BigDecimal storeNum) {
        regStoreNum(CK_NES, storeNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param storeNum The value of storeNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_GreaterThan(java.math.BigDecimal storeNum) {
        regStoreNum(CK_GT, storeNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param storeNum The value of storeNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_LessThan(java.math.BigDecimal storeNum) {
        regStoreNum(CK_LT, storeNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param storeNum The value of storeNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_GreaterEqual(java.math.BigDecimal storeNum) {
        regStoreNum(CK_GE, storeNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param storeNum The value of storeNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_LessEqual(java.math.BigDecimal storeNum) {
        regStoreNum(CK_LE, storeNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param minNumber The min number of storeNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreNum(), "STORE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param storeNumList The collection of storeNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNum_InScope(Collection<java.math.BigDecimal> storeNumList) {
        doSetStoreNum_InScope(storeNumList);
    }

    protected void doSetStoreNum_InScope(Collection<java.math.BigDecimal> storeNumList) {
        regINS(CK_INS, cTL(storeNumList), xgetCValueStoreNum(), "STORE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @param storeNumList The collection of storeNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNum_NotInScope(Collection<java.math.BigDecimal> storeNumList) {
        doSetStoreNum_NotInScope(storeNumList);
    }

    protected void doSetStoreNum_NotInScope(Collection<java.math.BigDecimal> storeNumList) {
        regINS(CK_NINS, cTL(storeNumList), xgetCValueStoreNum(), "STORE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     */
    public void setStoreNum_IsNull() { regStoreNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_NUM: {decimal(16, 6)}
     */
    public void setStoreNum_IsNotNull() { regStoreNum(CK_ISNN, DOBJ); }

    protected void regStoreNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreNum(), "STORE_NUM"); }
    protected abstract ConditionValue xgetCValueStoreNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg}
     * @param storeFlg The value of storeFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreFlg_Equal(String storeFlg) {
        doSetStoreFlg_Equal(fRES(storeFlg));
    }

    /**
     * Equal(=). As StoreFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 格納フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreFlg_Equal_AsStoreFlg(CDef.StoreFlg cdef) {
        doSetStoreFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未格納
     */
    public void setStoreFlg_Equal_$0() {
        setStoreFlg_Equal_AsStoreFlg(CDef.StoreFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 格納
     */
    public void setStoreFlg_Equal_$1() {
        setStoreFlg_Equal_AsStoreFlg(CDef.StoreFlg.$1);
    }

    protected void doSetStoreFlg_Equal(String storeFlg) {
        regStoreFlg(CK_EQ, storeFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg}
     * @param storeFlg The value of storeFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreFlg_NotEqual(String storeFlg) {
        doSetStoreFlg_NotEqual(fRES(storeFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As StoreFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 格納フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreFlg_NotEqual_AsStoreFlg(CDef.StoreFlg cdef) {
        doSetStoreFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未格納
     */
    public void setStoreFlg_NotEqual_$0() {
        setStoreFlg_NotEqual_AsStoreFlg(CDef.StoreFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 格納
     */
    public void setStoreFlg_NotEqual_$1() {
        setStoreFlg_NotEqual_AsStoreFlg(CDef.StoreFlg.$1);
    }

    protected void doSetStoreFlg_NotEqual(String storeFlg) {
        regStoreFlg(CK_NES, storeFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg}
     * @param storeFlgList The collection of storeFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreFlg_InScope(Collection<String> storeFlgList) {
        doSetStoreFlg_InScope(storeFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As StoreFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 格納フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreFlg_InScope_AsStoreFlg(Collection<CDef.StoreFlg> cdefList) {
        doSetStoreFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetStoreFlg_InScope(Collection<String> storeFlgList) {
        regINS(CK_INS, cTL(storeFlgList), xgetCValueStoreFlg(), "STORE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg}
     * @param storeFlgList The collection of storeFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreFlg_NotInScope(Collection<String> storeFlgList) {
        doSetStoreFlg_NotInScope(storeFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As StoreFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 格納フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreFlg_NotInScope_AsStoreFlg(Collection<CDef.StoreFlg> cdefList) {
        doSetStoreFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetStoreFlg_NotInScope(Collection<String> storeFlgList) {
        regINS(CK_NINS, cTL(storeFlgList), xgetCValueStoreFlg(), "STORE_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg}
     */
    public void setStoreFlg_IsNull() { regStoreFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg}
     */
    public void setStoreFlg_IsNotNull() { regStoreFlg(CK_ISNN, DOBJ); }

    protected void regStoreFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreFlg(), "STORE_FLG"); }
    protected abstract ConditionValue xgetCValueStoreFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {bigint(19)}
     * @param storeLocationId The value of storeLocationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreLocationId_Equal(Long storeLocationId) {
        doSetStoreLocationId_Equal(storeLocationId);
    }

    protected void doSetStoreLocationId_Equal(Long storeLocationId) {
        regStoreLocationId(CK_EQ, storeLocationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {bigint(19)}
     * @param storeLocationId The value of storeLocationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreLocationId_NotEqual(Long storeLocationId) {
        doSetStoreLocationId_NotEqual(storeLocationId);
    }

    protected void doSetStoreLocationId_NotEqual(Long storeLocationId) {
        regStoreLocationId(CK_NES, storeLocationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {bigint(19)}
     * @param storeLocationId The value of storeLocationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreLocationId_GreaterThan(Long storeLocationId) {
        regStoreLocationId(CK_GT, storeLocationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {bigint(19)}
     * @param storeLocationId The value of storeLocationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreLocationId_LessThan(Long storeLocationId) {
        regStoreLocationId(CK_LT, storeLocationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {bigint(19)}
     * @param storeLocationId The value of storeLocationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreLocationId_GreaterEqual(Long storeLocationId) {
        regStoreLocationId(CK_GE, storeLocationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {bigint(19)}
     * @param storeLocationId The value of storeLocationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreLocationId_LessEqual(Long storeLocationId) {
        regStoreLocationId(CK_LE, storeLocationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {bigint(19)}
     * @param minNumber The min number of storeLocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeLocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreLocationId(), "STORE_LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_LOCATION_ID: {bigint(19)}
     * @param storeLocationIdList The collection of storeLocationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationId_InScope(Collection<Long> storeLocationIdList) {
        doSetStoreLocationId_InScope(storeLocationIdList);
    }

    protected void doSetStoreLocationId_InScope(Collection<Long> storeLocationIdList) {
        regINS(CK_INS, cTL(storeLocationIdList), xgetCValueStoreLocationId(), "STORE_LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_LOCATION_ID: {bigint(19)}
     * @param storeLocationIdList The collection of storeLocationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationId_NotInScope(Collection<Long> storeLocationIdList) {
        doSetStoreLocationId_NotInScope(storeLocationIdList);
    }

    protected void doSetStoreLocationId_NotInScope(Collection<Long> storeLocationIdList) {
        regINS(CK_NINS, cTL(storeLocationIdList), xgetCValueStoreLocationId(), "STORE_LOCATION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {bigint(19)}
     */
    public void setStoreLocationId_IsNull() { regStoreLocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {bigint(19)}
     */
    public void setStoreLocationId_IsNotNull() { regStoreLocationId(CK_ISNN, DOBJ); }

    protected void regStoreLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreLocationId(), "STORE_LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueStoreLocationId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_CD: {varchar(30)}
     * @param storeLocationCd The value of storeLocationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationCd_Equal(String storeLocationCd) {
        doSetStoreLocationCd_Equal(fRES(storeLocationCd));
    }

    protected void doSetStoreLocationCd_Equal(String storeLocationCd) {
        regStoreLocationCd(CK_EQ, storeLocationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_CD: {varchar(30)}
     * @param storeLocationCd The value of storeLocationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationCd_NotEqual(String storeLocationCd) {
        doSetStoreLocationCd_NotEqual(fRES(storeLocationCd));
    }

    protected void doSetStoreLocationCd_NotEqual(String storeLocationCd) {
        regStoreLocationCd(CK_NES, storeLocationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_CD: {varchar(30)}
     * @param storeLocationCd The value of storeLocationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationCd_GreaterThan(String storeLocationCd) {
        regStoreLocationCd(CK_GT, fRES(storeLocationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_CD: {varchar(30)}
     * @param storeLocationCd The value of storeLocationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationCd_LessThan(String storeLocationCd) {
        regStoreLocationCd(CK_LT, fRES(storeLocationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_CD: {varchar(30)}
     * @param storeLocationCd The value of storeLocationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationCd_GreaterEqual(String storeLocationCd) {
        regStoreLocationCd(CK_GE, fRES(storeLocationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_CD: {varchar(30)}
     * @param storeLocationCd The value of storeLocationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationCd_LessEqual(String storeLocationCd) {
        regStoreLocationCd(CK_LE, fRES(storeLocationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_LOCATION_CD: {varchar(30)}
     * @param storeLocationCdList The collection of storeLocationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationCd_InScope(Collection<String> storeLocationCdList) {
        doSetStoreLocationCd_InScope(storeLocationCdList);
    }

    protected void doSetStoreLocationCd_InScope(Collection<String> storeLocationCdList) {
        regINS(CK_INS, cTL(storeLocationCdList), xgetCValueStoreLocationCd(), "STORE_LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_LOCATION_CD: {varchar(30)}
     * @param storeLocationCdList The collection of storeLocationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationCd_NotInScope(Collection<String> storeLocationCdList) {
        doSetStoreLocationCd_NotInScope(storeLocationCdList);
    }

    protected void doSetStoreLocationCd_NotInScope(Collection<String> storeLocationCdList) {
        regINS(CK_NINS, cTL(storeLocationCdList), xgetCValueStoreLocationCd(), "STORE_LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_LOCATION_CD: {varchar(30)} <br>
     * <pre>e.g. setStoreLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeLocationCd The value of storeLocationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreLocationCd_LikeSearch(String storeLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeLocationCd), xgetCValueStoreLocationCd(), "STORE_LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_LOCATION_CD: {varchar(30)}
     * @param storeLocationCd The value of storeLocationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreLocationCd_NotLikeSearch(String storeLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeLocationCd), xgetCValueStoreLocationCd(), "STORE_LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_LOCATION_CD: {varchar(30)}
     * @param storeLocationCd The value of storeLocationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationCd_PrefixSearch(String storeLocationCd) {
        setStoreLocationCd_LikeSearch(storeLocationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_LOCATION_CD: {varchar(30)}
     */
    public void setStoreLocationCd_IsNull() { regStoreLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_LOCATION_CD: {varchar(30)}
     */
    public void setStoreLocationCd_IsNullOrEmpty() { regStoreLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_LOCATION_CD: {varchar(30)}
     */
    public void setStoreLocationCd_IsNotNull() { regStoreLocationCd(CK_ISNN, DOBJ); }

    protected void regStoreLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreLocationCd(), "STORE_LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueStoreLocationCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_NM: {varchar(60)}
     * @param storeLocationNm The value of storeLocationNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationNm_Equal(String storeLocationNm) {
        doSetStoreLocationNm_Equal(fRES(storeLocationNm));
    }

    protected void doSetStoreLocationNm_Equal(String storeLocationNm) {
        regStoreLocationNm(CK_EQ, storeLocationNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_NM: {varchar(60)}
     * @param storeLocationNm The value of storeLocationNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationNm_NotEqual(String storeLocationNm) {
        doSetStoreLocationNm_NotEqual(fRES(storeLocationNm));
    }

    protected void doSetStoreLocationNm_NotEqual(String storeLocationNm) {
        regStoreLocationNm(CK_NES, storeLocationNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_NM: {varchar(60)}
     * @param storeLocationNm The value of storeLocationNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationNm_GreaterThan(String storeLocationNm) {
        regStoreLocationNm(CK_GT, fRES(storeLocationNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_NM: {varchar(60)}
     * @param storeLocationNm The value of storeLocationNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationNm_LessThan(String storeLocationNm) {
        regStoreLocationNm(CK_LT, fRES(storeLocationNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_NM: {varchar(60)}
     * @param storeLocationNm The value of storeLocationNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationNm_GreaterEqual(String storeLocationNm) {
        regStoreLocationNm(CK_GE, fRES(storeLocationNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_NM: {varchar(60)}
     * @param storeLocationNm The value of storeLocationNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationNm_LessEqual(String storeLocationNm) {
        regStoreLocationNm(CK_LE, fRES(storeLocationNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_LOCATION_NM: {varchar(60)}
     * @param storeLocationNmList The collection of storeLocationNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationNm_InScope(Collection<String> storeLocationNmList) {
        doSetStoreLocationNm_InScope(storeLocationNmList);
    }

    protected void doSetStoreLocationNm_InScope(Collection<String> storeLocationNmList) {
        regINS(CK_INS, cTL(storeLocationNmList), xgetCValueStoreLocationNm(), "STORE_LOCATION_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_LOCATION_NM: {varchar(60)}
     * @param storeLocationNmList The collection of storeLocationNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationNm_NotInScope(Collection<String> storeLocationNmList) {
        doSetStoreLocationNm_NotInScope(storeLocationNmList);
    }

    protected void doSetStoreLocationNm_NotInScope(Collection<String> storeLocationNmList) {
        regINS(CK_NINS, cTL(storeLocationNmList), xgetCValueStoreLocationNm(), "STORE_LOCATION_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_LOCATION_NM: {varchar(60)} <br>
     * <pre>e.g. setStoreLocationNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeLocationNm The value of storeLocationNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreLocationNm_LikeSearch(String storeLocationNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeLocationNm), xgetCValueStoreLocationNm(), "STORE_LOCATION_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_LOCATION_NM: {varchar(60)}
     * @param storeLocationNm The value of storeLocationNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreLocationNm_NotLikeSearch(String storeLocationNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeLocationNm), xgetCValueStoreLocationNm(), "STORE_LOCATION_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_LOCATION_NM: {varchar(60)}
     * @param storeLocationNm The value of storeLocationNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationNm_PrefixSearch(String storeLocationNm) {
        setStoreLocationNm_LikeSearch(storeLocationNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_LOCATION_NM: {varchar(60)}
     */
    public void setStoreLocationNm_IsNull() { regStoreLocationNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_LOCATION_NM: {varchar(60)}
     */
    public void setStoreLocationNm_IsNullOrEmpty() { regStoreLocationNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_LOCATION_NM: {varchar(60)}
     */
    public void setStoreLocationNm_IsNotNull() { regStoreLocationNm(CK_ISNN, DOBJ); }

    protected void regStoreLocationNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreLocationNm(), "STORE_LOCATION_NM"); }
    protected abstract ConditionValue xgetCValueStoreLocationNm();

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
    public HpSLCFunction<HReceiveBCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, HReceiveBCB.class);
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
    public HpSLCFunction<HReceiveBCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, HReceiveBCB.class);
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
    public HpSLCFunction<HReceiveBCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, HReceiveBCB.class);
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
    public HpSLCFunction<HReceiveBCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, HReceiveBCB.class);
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
    public HpSLCFunction<HReceiveBCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, HReceiveBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;HReceiveBCB&gt;() {
     *     public void query(HReceiveBCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<HReceiveBCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, HReceiveBCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        HReceiveBCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(HReceiveBCQ sq);

    protected HReceiveBCB xcreateScalarConditionCB() {
        HReceiveBCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected HReceiveBCB xcreateScalarConditionPartitionByCB() {
        HReceiveBCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<HReceiveBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HReceiveBCB cb = new HReceiveBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "STORE_RECORD_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(HReceiveBCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<HReceiveBCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(HReceiveBCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HReceiveBCB cb = new HReceiveBCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "STORE_RECORD_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(HReceiveBCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<HReceiveBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HReceiveBCB cb = new HReceiveBCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(HReceiveBCQ sq);

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
    protected HReceiveBCB newMyCB() {
        return new HReceiveBCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return HReceiveBCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
