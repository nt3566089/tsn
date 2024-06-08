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
 * The abstract condition-query of T_INVENTORY_B.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTInventoryBCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTInventoryBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_INVENTORY_B";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryBId The value of inventoryBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_Equal(Long inventoryBId) {
        doSetInventoryBId_Equal(inventoryBId);
    }

    protected void doSetInventoryBId_Equal(Long inventoryBId) {
        regInventoryBId(CK_EQ, inventoryBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryBId The value of inventoryBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_NotEqual(Long inventoryBId) {
        doSetInventoryBId_NotEqual(inventoryBId);
    }

    protected void doSetInventoryBId_NotEqual(Long inventoryBId) {
        regInventoryBId(CK_NES, inventoryBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryBId The value of inventoryBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_GreaterThan(Long inventoryBId) {
        regInventoryBId(CK_GT, inventoryBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryBId The value of inventoryBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_LessThan(Long inventoryBId) {
        regInventoryBId(CK_LT, inventoryBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryBId The value of inventoryBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_GreaterEqual(Long inventoryBId) {
        regInventoryBId(CK_GE, inventoryBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryBId The value of inventoryBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_LessEqual(Long inventoryBId) {
        regInventoryBId(CK_LE, inventoryBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of inventoryBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryBId(), "INVENTORY_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryBIdList The collection of inventoryBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryBId_InScope(Collection<Long> inventoryBIdList) {
        doSetInventoryBId_InScope(inventoryBIdList);
    }

    protected void doSetInventoryBId_InScope(Collection<Long> inventoryBIdList) {
        regINS(CK_INS, cTL(inventoryBIdList), xgetCValueInventoryBId(), "INVENTORY_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryBIdList The collection of inventoryBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryBId_NotInScope(Collection<Long> inventoryBIdList) {
        doSetInventoryBId_NotInScope(inventoryBIdList);
    }

    protected void doSetInventoryBId_NotInScope(Collection<Long> inventoryBIdList) {
        regINS(CK_NINS, cTL(inventoryBIdList), xgetCValueInventoryBId(), "INVENTORY_B_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select INVENTORY_B_ID from T_INVENTORY_INP_HIST where ...)} <br>
     * T_INVENTORY_INP_HIST by INVENTORY_B_ID, named 'TInventoryInpHistAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryInpHistList</span>(histCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     histCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryInpHistList for 'exists'. (NotNull)
     */
    public void existsTInventoryInpHistList(SubQuery<TInventoryInpHistCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryInpHistCB cb = new TInventoryInpHistCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepInventoryBId_ExistsReferrer_TInventoryInpHistList(cb.query());
        registerExistsReferrer(cb.query(), "INVENTORY_B_ID", "INVENTORY_B_ID", pp, "tInventoryInpHistList");
    }
    public abstract String keepInventoryBId_ExistsReferrer_TInventoryInpHistList(TInventoryInpHistCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select INVENTORY_B_ID from T_INVENTORY_R where ...)} <br>
     * T_INVENTORY_R by INVENTORY_B_ID, named 'TInventoryRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryRAsOne</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryRAsOne for 'exists'. (NotNull)
     */
    public void existsTInventoryRAsOne(SubQuery<TInventoryRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepInventoryBId_ExistsReferrer_TInventoryRAsOne(cb.query());
        registerExistsReferrer(cb.query(), "INVENTORY_B_ID", "INVENTORY_B_ID", pp, "tInventoryRAsOne");
    }
    public abstract String keepInventoryBId_ExistsReferrer_TInventoryRAsOne(TInventoryRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select INVENTORY_B_ID from T_INVENTORY_INP_HIST where ...)} <br>
     * T_INVENTORY_INP_HIST by INVENTORY_B_ID, named 'TInventoryInpHistAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryInpHistList</span>(histCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     histCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of InventoryBId_NotExistsReferrer_TInventoryInpHistList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryInpHistList(SubQuery<TInventoryInpHistCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryInpHistCB cb = new TInventoryInpHistCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepInventoryBId_NotExistsReferrer_TInventoryInpHistList(cb.query());
        registerNotExistsReferrer(cb.query(), "INVENTORY_B_ID", "INVENTORY_B_ID", pp, "tInventoryInpHistList");
    }
    public abstract String keepInventoryBId_NotExistsReferrer_TInventoryInpHistList(TInventoryInpHistCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select INVENTORY_B_ID from T_INVENTORY_R where ...)} <br>
     * T_INVENTORY_R by INVENTORY_B_ID, named 'TInventoryRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryRAsOne</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of InventoryBId_NotExistsReferrer_TInventoryRAsOne for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryRAsOne(SubQuery<TInventoryRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepInventoryBId_NotExistsReferrer_TInventoryRAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "INVENTORY_B_ID", "INVENTORY_B_ID", pp, "tInventoryRAsOne");
    }
    public abstract String keepInventoryBId_NotExistsReferrer_TInventoryRAsOne(TInventoryRCQ sq);

    public void xsderiveTInventoryInpHistList(String fn, SubQuery<TInventoryInpHistCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryInpHistCB cb = new TInventoryInpHistCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepInventoryBId_SpecifyDerivedReferrer_TInventoryInpHistList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "INVENTORY_B_ID", "INVENTORY_B_ID", pp, "tInventoryInpHistList", al, op);
    }
    public abstract String keepInventoryBId_SpecifyDerivedReferrer_TInventoryInpHistList(TInventoryInpHistCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_INVENTORY_INP_HIST where ...)} <br>
     * T_INVENTORY_INP_HIST by INVENTORY_B_ID, named 'TInventoryInpHistAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryInpHistList()</span>.<span style="color: #CC4747">max</span>(histCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     histCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     histCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryInpHistCB> derivedTInventoryInpHistList() {
        return xcreateQDRFunctionTInventoryInpHistList();
    }
    protected HpQDRFunction<TInventoryInpHistCB> xcreateQDRFunctionTInventoryInpHistList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryInpHistList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryInpHistList(String fn, SubQuery<TInventoryInpHistCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryInpHistCB cb = new TInventoryInpHistCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepInventoryBId_QueryDerivedReferrer_TInventoryInpHistList(cb.query()); String prpp = keepInventoryBId_QueryDerivedReferrer_TInventoryInpHistListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "INVENTORY_B_ID", "INVENTORY_B_ID", sqpp, "tInventoryInpHistList", rd, vl, prpp, op);
    }
    public abstract String keepInventoryBId_QueryDerivedReferrer_TInventoryInpHistList(TInventoryInpHistCQ sq);
    public abstract String keepInventoryBId_QueryDerivedReferrer_TInventoryInpHistListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setInventoryBId_IsNull() { regInventoryBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setInventoryBId_IsNotNull() { regInventoryBId(CK_ISNN, DOBJ); }

    protected void regInventoryBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryBId(), "INVENTORY_B_ID"); }
    protected abstract ConditionValue xgetCValueInventoryBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param inventoryHId The value of inventoryHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_Equal(Long inventoryHId) {
        doSetInventoryHId_Equal(inventoryHId);
    }

    protected void doSetInventoryHId_Equal(Long inventoryHId) {
        regInventoryHId(CK_EQ, inventoryHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param inventoryHId The value of inventoryHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_NotEqual(Long inventoryHId) {
        doSetInventoryHId_NotEqual(inventoryHId);
    }

    protected void doSetInventoryHId_NotEqual(Long inventoryHId) {
        regInventoryHId(CK_NES, inventoryHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param inventoryHId The value of inventoryHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_GreaterThan(Long inventoryHId) {
        regInventoryHId(CK_GT, inventoryHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param inventoryHId The value of inventoryHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_LessThan(Long inventoryHId) {
        regInventoryHId(CK_LT, inventoryHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param inventoryHId The value of inventoryHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_GreaterEqual(Long inventoryHId) {
        regInventoryHId(CK_GE, inventoryHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param inventoryHId The value of inventoryHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_LessEqual(Long inventoryHId) {
        regInventoryHId(CK_LE, inventoryHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param minNumber The min number of inventoryHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryHId(), "INVENTORY_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param inventoryHIdList The collection of inventoryHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryHId_InScope(Collection<Long> inventoryHIdList) {
        doSetInventoryHId_InScope(inventoryHIdList);
    }

    protected void doSetInventoryHId_InScope(Collection<Long> inventoryHIdList) {
        regINS(CK_INS, cTL(inventoryHIdList), xgetCValueInventoryHId(), "INVENTORY_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @param inventoryHIdList The collection of inventoryHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryHId_NotInScope(Collection<Long> inventoryHIdList) {
        doSetInventoryHId_NotInScope(inventoryHIdList);
    }

    protected void doSetInventoryHId_NotInScope(Collection<Long> inventoryHIdList) {
        regINS(CK_NINS, cTL(inventoryHIdList), xgetCValueInventoryHId(), "INVENTORY_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select INVENTORY_H_ID from T_INVENTORY_H where ...)} <br />
     * T_INVENTORY_H by my INVENTORY_H_ID, named 'TInventoryH'.
     * @param subCBLambda The callback for sub-query of TInventoryH for 'in-scope'. (NotNull)
     */
    public void inScopeTInventoryH(SubQuery<TInventoryHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryHCB cb = new TInventoryHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInventoryHId_InScopeRelation_TInventoryH(cb.query());
        registerInScopeRelation(cb.query(), "INVENTORY_H_ID", "INVENTORY_H_ID", pp, "tInventoryH", false);
    }
    public abstract String keepInventoryHId_InScopeRelation_TInventoryH(TInventoryHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select INVENTORY_H_ID from T_INVENTORY_H where ...)} <br />
     * T_INVENTORY_H by my INVENTORY_H_ID, named 'TInventoryH'.
     * @param subCBLambda The callback for sub-query of TInventoryH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTInventoryH(SubQuery<TInventoryHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryHCB cb = new TInventoryHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInventoryHId_NotInScopeRelation_TInventoryH(cb.query());
        registerInScopeRelation(cb.query(), "INVENTORY_H_ID", "INVENTORY_H_ID", pp, "tInventoryH", true);
    }
    public abstract String keepInventoryHId_NotInScopeRelation_TInventoryH(TInventoryHCQ sq);

    protected void regInventoryHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryHId(), "INVENTORY_H_ID"); }
    protected abstract ConditionValue xgetCValueInventoryHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, bigint(19), FK to T_STOCK}
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
     * STOCK_ID: {IX, bigint(19), FK to T_STOCK}
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
     * STOCK_ID: {IX, bigint(19), FK to T_STOCK}
     * @param stockId The value of stockId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterThan(Long stockId) {
        regStockId(CK_GT, stockId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, bigint(19), FK to T_STOCK}
     * @param stockId The value of stockId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessThan(Long stockId) {
        regStockId(CK_LT, stockId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, bigint(19), FK to T_STOCK}
     * @param stockId The value of stockId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterEqual(Long stockId) {
        regStockId(CK_GE, stockId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, bigint(19), FK to T_STOCK}
     * @param stockId The value of stockId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessEqual(Long stockId) {
        regStockId(CK_LE, stockId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, bigint(19), FK to T_STOCK}
     * @param minNumber The min number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockId(), "STOCK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {IX, bigint(19), FK to T_STOCK}
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
     * STOCK_ID: {IX, bigint(19), FK to T_STOCK}
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
     * {in (select STOCK_ID from T_STOCK where ...)} <br />
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @param subCBLambda The callback for sub-query of TStock for 'in-scope'. (NotNull)
     */
    public void inScopeTStock(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_InScopeRelation_TStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tStock", false);
    }
    public abstract String keepStockId_InScopeRelation_TStock(TStockCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STOCK_ID from T_STOCK where ...)} <br />
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @param subCBLambda The callback for sub-query of TStock for 'not in-scope'. (NotNull)
     */
    public void notInScopeTStock(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_NotInScopeRelation_TStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tStock", true);
    }
    public abstract String keepStockId_NotInScopeRelation_TStock(TStockCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, bigint(19), FK to T_STOCK}
     */
    public void setStockId_IsNull() { regStockId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, bigint(19), FK to T_STOCK}
     */
    public void setStockId_IsNotNull() { regStockId(CK_ISNN, DOBJ); }

    protected void regStockId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockId(), "STOCK_ID"); }
    protected abstract ConditionValue xgetCValueStockId();

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
     * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomerByDepositId'.
     * @param subCBLambda The callback for sub-query of MCustomerByDepositId for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomerByDepositId(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDepositId_InScopeRelation_MCustomerByDepositId(cb.query());
        registerInScopeRelation(cb.query(), "DEPOSIT_ID", "CUSTOMER_ID", pp, "mCustomerByDepositId", false);
    }
    public abstract String keepDepositId_InScopeRelation_MCustomerByDepositId(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DEPOSIT_ID from M_CUSTOMER where ...)} <br />
     * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomerByDepositId'.
     * @param subCBLambda The callback for sub-query of MCustomerByDepositId for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomerByDepositId(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDepositId_NotInScopeRelation_MCustomerByDepositId(cb.query());
        registerInScopeRelation(cb.query(), "DEPOSIT_ID", "CUSTOMER_ID", pp, "mCustomerByDepositId", true);
    }
    public abstract String keepDepositId_NotInScopeRelation_MCustomerByDepositId(MCustomerCQ sq);

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
     * STORE_LABEL_NO: {IX, varchar(30)}
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
     * STORE_LABEL_NO: {IX, varchar(30)}
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
     * STORE_LABEL_NO: {IX, varchar(30)}
     * @param storeLabelNo The value of storeLabelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_GreaterThan(String storeLabelNo) {
        regStoreLabelNo(CK_GT, fRES(storeLabelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {IX, varchar(30)}
     * @param storeLabelNo The value of storeLabelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_LessThan(String storeLabelNo) {
        regStoreLabelNo(CK_LT, fRES(storeLabelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {IX, varchar(30)}
     * @param storeLabelNo The value of storeLabelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_GreaterEqual(String storeLabelNo) {
        regStoreLabelNo(CK_GE, fRES(storeLabelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {IX, varchar(30)}
     * @param storeLabelNo The value of storeLabelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_LessEqual(String storeLabelNo) {
        regStoreLabelNo(CK_LE, fRES(storeLabelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_LABEL_NO: {IX, varchar(30)}
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
     * STORE_LABEL_NO: {IX, varchar(30)}
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
     * STORE_LABEL_NO: {IX, varchar(30)} <br>
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
     * STORE_LABEL_NO: {IX, varchar(30)}
     * @param storeLabelNo The value of storeLabelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreLabelNo_NotLikeSearch(String storeLabelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeLabelNo), xgetCValueStoreLabelNo(), "STORE_LABEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_LABEL_NO: {IX, varchar(30)}
     * @param storeLabelNo The value of storeLabelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_PrefixSearch(String storeLabelNo) {
        setStoreLabelNo_LikeSearch(storeLabelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {IX, varchar(30)}
     */
    public void setStoreLabelNo_IsNull() { regStoreLabelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {IX, varchar(30)}
     */
    public void setStoreLabelNo_IsNullOrEmpty() { regStoreLabelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {IX, varchar(30)}
     */
    public void setStoreLabelNo_IsNotNull() { regStoreLabelNo(CK_ISNN, DOBJ); }

    protected void regStoreLabelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreLabelNo(), "STORE_LABEL_NO"); }
    protected abstract ConditionValue xgetCValueStoreLabelNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {varchar(8)}
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
     * STORE_DT: {varchar(8)}
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
     * STORE_DT: {varchar(8)}
     * @param storeDt The value of storeDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_GreaterThan(String storeDt) {
        regStoreDt(CK_GT, fRES(storeDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {varchar(8)}
     * @param storeDt The value of storeDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_LessThan(String storeDt) {
        regStoreDt(CK_LT, fRES(storeDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {varchar(8)}
     * @param storeDt The value of storeDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_GreaterEqual(String storeDt) {
        regStoreDt(CK_GE, fRES(storeDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {varchar(8)}
     * @param storeDt The value of storeDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_LessEqual(String storeDt) {
        regStoreDt(CK_LE, fRES(storeDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_DT: {varchar(8)}
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
     * STORE_DT: {varchar(8)}
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
     * STORE_DT: {varchar(8)} <br>
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
     * STORE_DT: {varchar(8)}
     * @param storeDt The value of storeDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreDt_NotLikeSearch(String storeDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeDt), xgetCValueStoreDt(), "STORE_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_DT: {varchar(8)}
     * @param storeDt The value of storeDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_PrefixSearch(String storeDt) {
        setStoreDt_LikeSearch(storeDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_DT: {varchar(8)}
     */
    public void setStoreDt_IsNull() { regStoreDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_DT: {varchar(8)}
     */
    public void setStoreDt_IsNullOrEmpty() { regStoreDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_DT: {varchar(8)}
     */
    public void setStoreDt_IsNotNull() { regStoreDt(CK_ISNN, DOBJ); }

    protected void regStoreDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreDt(), "STORE_DT"); }
    protected abstract ConditionValue xgetCValueStoreDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param supplierId The value of supplierId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplierId_Equal(Long supplierId) {
        doSetSupplierId_Equal(supplierId);
    }

    protected void doSetSupplierId_Equal(Long supplierId) {
        regSupplierId(CK_EQ, supplierId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param supplierId The value of supplierId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplierId_NotEqual(Long supplierId) {
        doSetSupplierId_NotEqual(supplierId);
    }

    protected void doSetSupplierId_NotEqual(Long supplierId) {
        regSupplierId(CK_NES, supplierId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param supplierId The value of supplierId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplierId_GreaterThan(Long supplierId) {
        regSupplierId(CK_GT, supplierId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param supplierId The value of supplierId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplierId_LessThan(Long supplierId) {
        regSupplierId(CK_LT, supplierId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param supplierId The value of supplierId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplierId_GreaterEqual(Long supplierId) {
        regSupplierId(CK_GE, supplierId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param supplierId The value of supplierId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplierId_LessEqual(Long supplierId) {
        regSupplierId(CK_LE, supplierId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param minNumber The min number of supplierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of supplierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSupplierId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSupplierId(), "SUPPLIER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param supplierIdList The collection of supplierId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierId_InScope(Collection<Long> supplierIdList) {
        doSetSupplierId_InScope(supplierIdList);
    }

    protected void doSetSupplierId_InScope(Collection<Long> supplierIdList) {
        regINS(CK_INS, cTL(supplierIdList), xgetCValueSupplierId(), "SUPPLIER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param supplierIdList The collection of supplierId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierId_NotInScope(Collection<Long> supplierIdList) {
        doSetSupplierId_NotInScope(supplierIdList);
    }

    protected void doSetSupplierId_NotInScope(Collection<Long> supplierIdList) {
        regINS(CK_NINS, cTL(supplierIdList), xgetCValueSupplierId(), "SUPPLIER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SUPPLIER_ID from M_CUSTOMER where ...)} <br />
     * M_CUSTOMER by my SUPPLIER_ID, named 'MCustomerBySupplierId'.
     * @param subCBLambda The callback for sub-query of MCustomerBySupplierId for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomerBySupplierId(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepSupplierId_InScopeRelation_MCustomerBySupplierId(cb.query());
        registerInScopeRelation(cb.query(), "SUPPLIER_ID", "CUSTOMER_ID", pp, "mCustomerBySupplierId", false);
    }
    public abstract String keepSupplierId_InScopeRelation_MCustomerBySupplierId(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SUPPLIER_ID from M_CUSTOMER where ...)} <br />
     * M_CUSTOMER by my SUPPLIER_ID, named 'MCustomerBySupplierId'.
     * @param subCBLambda The callback for sub-query of MCustomerBySupplierId for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomerBySupplierId(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepSupplierId_NotInScopeRelation_MCustomerBySupplierId(cb.query());
        registerInScopeRelation(cb.query(), "SUPPLIER_ID", "CUSTOMER_ID", pp, "mCustomerBySupplierId", true);
    }
    public abstract String keepSupplierId_NotInScopeRelation_MCustomerBySupplierId(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     */
    public void setSupplierId_IsNull() { regSupplierId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     */
    public void setSupplierId_IsNotNull() { regSupplierId(CK_ISNN, DOBJ); }

    protected void regSupplierId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplierId(), "SUPPLIER_ID"); }
    protected abstract ConditionValue xgetCValueSupplierId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_CD: {varchar(30)}
     * @param supplierCd The value of supplierCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierCd_Equal(String supplierCd) {
        doSetSupplierCd_Equal(fRES(supplierCd));
    }

    protected void doSetSupplierCd_Equal(String supplierCd) {
        regSupplierCd(CK_EQ, supplierCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_CD: {varchar(30)}
     * @param supplierCd The value of supplierCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierCd_NotEqual(String supplierCd) {
        doSetSupplierCd_NotEqual(fRES(supplierCd));
    }

    protected void doSetSupplierCd_NotEqual(String supplierCd) {
        regSupplierCd(CK_NES, supplierCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_CD: {varchar(30)}
     * @param supplierCd The value of supplierCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierCd_GreaterThan(String supplierCd) {
        regSupplierCd(CK_GT, fRES(supplierCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_CD: {varchar(30)}
     * @param supplierCd The value of supplierCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierCd_LessThan(String supplierCd) {
        regSupplierCd(CK_LT, fRES(supplierCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_CD: {varchar(30)}
     * @param supplierCd The value of supplierCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierCd_GreaterEqual(String supplierCd) {
        regSupplierCd(CK_GE, fRES(supplierCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_CD: {varchar(30)}
     * @param supplierCd The value of supplierCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierCd_LessEqual(String supplierCd) {
        regSupplierCd(CK_LE, fRES(supplierCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIER_CD: {varchar(30)}
     * @param supplierCdList The collection of supplierCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierCd_InScope(Collection<String> supplierCdList) {
        doSetSupplierCd_InScope(supplierCdList);
    }

    protected void doSetSupplierCd_InScope(Collection<String> supplierCdList) {
        regINS(CK_INS, cTL(supplierCdList), xgetCValueSupplierCd(), "SUPPLIER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIER_CD: {varchar(30)}
     * @param supplierCdList The collection of supplierCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierCd_NotInScope(Collection<String> supplierCdList) {
        doSetSupplierCd_NotInScope(supplierCdList);
    }

    protected void doSetSupplierCd_NotInScope(Collection<String> supplierCdList) {
        regINS(CK_NINS, cTL(supplierCdList), xgetCValueSupplierCd(), "SUPPLIER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIER_CD: {varchar(30)} <br>
     * <pre>e.g. setSupplierCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplierCd The value of supplierCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplierCd_LikeSearch(String supplierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplierCd), xgetCValueSupplierCd(), "SUPPLIER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIER_CD: {varchar(30)}
     * @param supplierCd The value of supplierCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplierCd_NotLikeSearch(String supplierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplierCd), xgetCValueSupplierCd(), "SUPPLIER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIER_CD: {varchar(30)}
     * @param supplierCd The value of supplierCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierCd_PrefixSearch(String supplierCd) {
        setSupplierCd_LikeSearch(supplierCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIER_CD: {varchar(30)}
     */
    public void setSupplierCd_IsNull() { regSupplierCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIER_CD: {varchar(30)}
     */
    public void setSupplierCd_IsNullOrEmpty() { regSupplierCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIER_CD: {varchar(30)}
     */
    public void setSupplierCd_IsNotNull() { regSupplierCd(CK_ISNN, DOBJ); }

    protected void regSupplierCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplierCd(), "SUPPLIER_CD"); }
    protected abstract ConditionValue xgetCValueSupplierCd();

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
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inventoryNum The value of inventoryNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_Equal(java.math.BigDecimal inventoryNum) {
        doSetInventoryNum_Equal(inventoryNum);
    }

    protected void doSetInventoryNum_Equal(java.math.BigDecimal inventoryNum) {
        regInventoryNum(CK_EQ, inventoryNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inventoryNum The value of inventoryNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_NotEqual(java.math.BigDecimal inventoryNum) {
        doSetInventoryNum_NotEqual(inventoryNum);
    }

    protected void doSetInventoryNum_NotEqual(java.math.BigDecimal inventoryNum) {
        regInventoryNum(CK_NES, inventoryNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inventoryNum The value of inventoryNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_GreaterThan(java.math.BigDecimal inventoryNum) {
        regInventoryNum(CK_GT, inventoryNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inventoryNum The value of inventoryNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_LessThan(java.math.BigDecimal inventoryNum) {
        regInventoryNum(CK_LT, inventoryNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inventoryNum The value of inventoryNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_GreaterEqual(java.math.BigDecimal inventoryNum) {
        regInventoryNum(CK_GE, inventoryNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inventoryNum The value of inventoryNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_LessEqual(java.math.BigDecimal inventoryNum) {
        regInventoryNum(CK_LE, inventoryNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of inventoryNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryNum(), "INVENTORY_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inventoryNumList The collection of inventoryNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryNum_InScope(Collection<java.math.BigDecimal> inventoryNumList) {
        doSetInventoryNum_InScope(inventoryNumList);
    }

    protected void doSetInventoryNum_InScope(Collection<java.math.BigDecimal> inventoryNumList) {
        regINS(CK_INS, cTL(inventoryNumList), xgetCValueInventoryNum(), "INVENTORY_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inventoryNumList The collection of inventoryNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryNum_NotInScope(Collection<java.math.BigDecimal> inventoryNumList) {
        doSetInventoryNum_NotInScope(inventoryNumList);
    }

    protected void doSetInventoryNum_NotInScope(Collection<java.math.BigDecimal> inventoryNumList) {
        regINS(CK_NINS, cTL(inventoryNumList), xgetCValueInventoryNum(), "INVENTORY_NUM");
    }

    protected void regInventoryNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryNum(), "INVENTORY_NUM"); }
    protected abstract ConditionValue xgetCValueInventoryNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType}
     * @param inputType The value of inputType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_Equal(String inputType) {
        doSetInputType_Equal(fRES(inputType));
    }

    /**
     * Equal(=). As InputType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInputType_Equal_AsInputType(CDef.InputType cdef) {
        doSetInputType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: 画面入力
     */
    public void setInputType_Equal_$00() {
        setInputType_Equal_AsInputType(CDef.InputType.$00);
    }

    /**
     * Equal(=). As $10 (10). And OnlyOnceRegistered. <br>
     * $10: アップロード
     */
    public void setInputType_Equal_$10() {
        setInputType_Equal_AsInputType(CDef.InputType.$10);
    }

    /**
     * Equal(=). As $20 (20). And OnlyOnceRegistered. <br>
     * $20: EDI
     */
    public void setInputType_Equal_$20() {
        setInputType_Equal_AsInputType(CDef.InputType.$20);
    }

    /**
     * Equal(=). As $30 (30). And OnlyOnceRegistered. <br>
     * $30: HT
     */
    public void setInputType_Equal_$30() {
        setInputType_Equal_AsInputType(CDef.InputType.$30);
    }

    protected void doSetInputType_Equal(String inputType) {
        regInputType(CK_EQ, inputType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType}
     * @param inputType The value of inputType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_NotEqual(String inputType) {
        doSetInputType_NotEqual(fRES(inputType));
    }

    /**
     * NotEqual(&lt;&gt;). As InputType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInputType_NotEqual_AsInputType(CDef.InputType cdef) {
        doSetInputType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: 画面入力
     */
    public void setInputType_NotEqual_$00() {
        setInputType_NotEqual_AsInputType(CDef.InputType.$00);
    }

    /**
     * NotEqual(&lt;&gt;). As $10 (10). And OnlyOnceRegistered. <br>
     * $10: アップロード
     */
    public void setInputType_NotEqual_$10() {
        setInputType_NotEqual_AsInputType(CDef.InputType.$10);
    }

    /**
     * NotEqual(&lt;&gt;). As $20 (20). And OnlyOnceRegistered. <br>
     * $20: EDI
     */
    public void setInputType_NotEqual_$20() {
        setInputType_NotEqual_AsInputType(CDef.InputType.$20);
    }

    /**
     * NotEqual(&lt;&gt;). As $30 (30). And OnlyOnceRegistered. <br>
     * $30: HT
     */
    public void setInputType_NotEqual_$30() {
        setInputType_NotEqual_AsInputType(CDef.InputType.$30);
    }

    protected void doSetInputType_NotEqual(String inputType) {
        regInputType(CK_NES, inputType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType}
     * @param inputTypeList The collection of inputType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_InScope(Collection<String> inputTypeList) {
        doSetInputType_InScope(inputTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As InputType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_InScope_AsInputType(Collection<CDef.InputType> cdefList) {
        doSetInputType_InScope(cTStrL(cdefList));
    }

    protected void doSetInputType_InScope(Collection<String> inputTypeList) {
        regINS(CK_INS, cTL(inputTypeList), xgetCValueInputType(), "INPUT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType}
     * @param inputTypeList The collection of inputType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_NotInScope(Collection<String> inputTypeList) {
        doSetInputType_NotInScope(inputTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InputType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_NotInScope_AsInputType(Collection<CDef.InputType> cdefList) {
        doSetInputType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInputType_NotInScope(Collection<String> inputTypeList) {
        regINS(CK_NINS, cTL(inputTypeList), xgetCValueInputType(), "INPUT_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType}
     */
    public void setInputType_IsNull() { regInputType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType}
     */
    public void setInputType_IsNullOrEmpty() { regInputType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType}
     */
    public void setInputType_IsNotNull() { regInputType(CK_ISNN, DOBJ); }

    protected void regInputType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInputType(), "INPUT_TYPE"); }
    protected abstract ConditionValue xgetCValueInputType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg}
     * @param stockAdjustFlg The value of stockAdjustFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockAdjustFlg_Equal(String stockAdjustFlg) {
        doSetStockAdjustFlg_Equal(fRES(stockAdjustFlg));
    }

    /**
     * Equal(=). As StockMoveFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg} <br>
     * 在庫調整フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStockAdjustFlg_Equal_AsStockMoveFlg(CDef.StockMoveFlg cdef) {
        doSetStockAdjustFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未調整
     */
    public void setStockAdjustFlg_Equal_$0() {
        setStockAdjustFlg_Equal_AsStockMoveFlg(CDef.StockMoveFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 調整済
     */
    public void setStockAdjustFlg_Equal_$1() {
        setStockAdjustFlg_Equal_AsStockMoveFlg(CDef.StockMoveFlg.$1);
    }

    protected void doSetStockAdjustFlg_Equal(String stockAdjustFlg) {
        regStockAdjustFlg(CK_EQ, stockAdjustFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg}
     * @param stockAdjustFlg The value of stockAdjustFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockAdjustFlg_NotEqual(String stockAdjustFlg) {
        doSetStockAdjustFlg_NotEqual(fRES(stockAdjustFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As StockMoveFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg} <br>
     * 在庫調整フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStockAdjustFlg_NotEqual_AsStockMoveFlg(CDef.StockMoveFlg cdef) {
        doSetStockAdjustFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未調整
     */
    public void setStockAdjustFlg_NotEqual_$0() {
        setStockAdjustFlg_NotEqual_AsStockMoveFlg(CDef.StockMoveFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 調整済
     */
    public void setStockAdjustFlg_NotEqual_$1() {
        setStockAdjustFlg_NotEqual_AsStockMoveFlg(CDef.StockMoveFlg.$1);
    }

    protected void doSetStockAdjustFlg_NotEqual(String stockAdjustFlg) {
        regStockAdjustFlg(CK_NES, stockAdjustFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg}
     * @param stockAdjustFlgList The collection of stockAdjustFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockAdjustFlg_InScope(Collection<String> stockAdjustFlgList) {
        doSetStockAdjustFlg_InScope(stockAdjustFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As StockMoveFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg} <br>
     * 在庫調整フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockAdjustFlg_InScope_AsStockMoveFlg(Collection<CDef.StockMoveFlg> cdefList) {
        doSetStockAdjustFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetStockAdjustFlg_InScope(Collection<String> stockAdjustFlgList) {
        regINS(CK_INS, cTL(stockAdjustFlgList), xgetCValueStockAdjustFlg(), "STOCK_ADJUST_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg}
     * @param stockAdjustFlgList The collection of stockAdjustFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockAdjustFlg_NotInScope(Collection<String> stockAdjustFlgList) {
        doSetStockAdjustFlg_NotInScope(stockAdjustFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As StockMoveFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg} <br>
     * 在庫調整フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockAdjustFlg_NotInScope_AsStockMoveFlg(Collection<CDef.StockMoveFlg> cdefList) {
        doSetStockAdjustFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetStockAdjustFlg_NotInScope(Collection<String> stockAdjustFlgList) {
        regINS(CK_NINS, cTL(stockAdjustFlgList), xgetCValueStockAdjustFlg(), "STOCK_ADJUST_FLG");
    }

    protected void regStockAdjustFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockAdjustFlg(), "STOCK_ADJUST_FLG"); }
    protected abstract ConditionValue xgetCValueStockAdjustFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H}
     * @param moveInstHId The value of moveInstHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_Equal(Long moveInstHId) {
        doSetMoveInstHId_Equal(moveInstHId);
    }

    protected void doSetMoveInstHId_Equal(Long moveInstHId) {
        regMoveInstHId(CK_EQ, moveInstHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H}
     * @param moveInstHId The value of moveInstHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_NotEqual(Long moveInstHId) {
        doSetMoveInstHId_NotEqual(moveInstHId);
    }

    protected void doSetMoveInstHId_NotEqual(Long moveInstHId) {
        regMoveInstHId(CK_NES, moveInstHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H}
     * @param moveInstHId The value of moveInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_GreaterThan(Long moveInstHId) {
        regMoveInstHId(CK_GT, moveInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H}
     * @param moveInstHId The value of moveInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_LessThan(Long moveInstHId) {
        regMoveInstHId(CK_LT, moveInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H}
     * @param moveInstHId The value of moveInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_GreaterEqual(Long moveInstHId) {
        regMoveInstHId(CK_GE, moveInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H}
     * @param moveInstHId The value of moveInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_LessEqual(Long moveInstHId) {
        regMoveInstHId(CK_LE, moveInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H}
     * @param minNumber The min number of moveInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveInstHId(), "MOVE_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H}
     * @param moveInstHIdList The collection of moveInstHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstHId_InScope(Collection<Long> moveInstHIdList) {
        doSetMoveInstHId_InScope(moveInstHIdList);
    }

    protected void doSetMoveInstHId_InScope(Collection<Long> moveInstHIdList) {
        regINS(CK_INS, cTL(moveInstHIdList), xgetCValueMoveInstHId(), "MOVE_INST_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H}
     * @param moveInstHIdList The collection of moveInstHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstHId_NotInScope(Collection<Long> moveInstHIdList) {
        doSetMoveInstHId_NotInScope(moveInstHIdList);
    }

    protected void doSetMoveInstHId_NotInScope(Collection<Long> moveInstHIdList) {
        regINS(CK_NINS, cTL(moveInstHIdList), xgetCValueMoveInstHId(), "MOVE_INST_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MOVE_INST_H_ID from T_MOVE_INST_H where ...)} <br />
     * T_MOVE_INST_H by my MOVE_INST_H_ID, named 'TMoveInstH'.
     * @param subCBLambda The callback for sub-query of TMoveInstH for 'in-scope'. (NotNull)
     */
    public void inScopeTMoveInstH(SubQuery<TMoveInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstHCB cb = new TMoveInstHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepMoveInstHId_InScopeRelation_TMoveInstH(cb.query());
        registerInScopeRelation(cb.query(), "MOVE_INST_H_ID", "MOVE_INST_H_ID", pp, "tMoveInstH", false);
    }
    public abstract String keepMoveInstHId_InScopeRelation_TMoveInstH(TMoveInstHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MOVE_INST_H_ID from T_MOVE_INST_H where ...)} <br />
     * T_MOVE_INST_H by my MOVE_INST_H_ID, named 'TMoveInstH'.
     * @param subCBLambda The callback for sub-query of TMoveInstH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTMoveInstH(SubQuery<TMoveInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstHCB cb = new TMoveInstHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepMoveInstHId_NotInScopeRelation_TMoveInstH(cb.query());
        registerInScopeRelation(cb.query(), "MOVE_INST_H_ID", "MOVE_INST_H_ID", pp, "tMoveInstH", true);
    }
    public abstract String keepMoveInstHId_NotInScopeRelation_TMoveInstH(TMoveInstHCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H}
     */
    public void setMoveInstHId_IsNull() { regMoveInstHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H}
     */
    public void setMoveInstHId_IsNotNull() { regMoveInstHId(CK_ISNN, DOBJ); }

    protected void regMoveInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveInstHId(), "MOVE_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueMoveInstHId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)} <br>
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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCd The value of firmtransportCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_Equal(String firmtransportCd) {
        doSetFirmtransportCd_Equal(fRES(firmtransportCd));
    }

    protected void doSetFirmtransportCd_Equal(String firmtransportCd) {
        regFirmtransportCd(CK_EQ, firmtransportCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCd The value of firmtransportCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_NotEqual(String firmtransportCd) {
        doSetFirmtransportCd_NotEqual(fRES(firmtransportCd));
    }

    protected void doSetFirmtransportCd_NotEqual(String firmtransportCd) {
        regFirmtransportCd(CK_NES, firmtransportCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCd The value of firmtransportCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_GreaterThan(String firmtransportCd) {
        regFirmtransportCd(CK_GT, fRES(firmtransportCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCd The value of firmtransportCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_LessThan(String firmtransportCd) {
        regFirmtransportCd(CK_LT, fRES(firmtransportCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCd The value of firmtransportCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_GreaterEqual(String firmtransportCd) {
        regFirmtransportCd(CK_GE, fRES(firmtransportCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCd The value of firmtransportCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_LessEqual(String firmtransportCd) {
        regFirmtransportCd(CK_LE, fRES(firmtransportCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCdList The collection of firmtransportCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_InScope(Collection<String> firmtransportCdList) {
        doSetFirmtransportCd_InScope(firmtransportCdList);
    }

    protected void doSetFirmtransportCd_InScope(Collection<String> firmtransportCdList) {
        regINS(CK_INS, cTL(firmtransportCdList), xgetCValueFirmtransportCd(), "FIRMTRANSPORT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCdList The collection of firmtransportCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_NotInScope(Collection<String> firmtransportCdList) {
        doSetFirmtransportCd_NotInScope(firmtransportCdList);
    }

    protected void doSetFirmtransportCd_NotInScope(Collection<String> firmtransportCdList) {
        regINS(CK_NINS, cTL(firmtransportCdList), xgetCValueFirmtransportCd(), "FIRMTRANSPORT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)} <br>
     * <pre>e.g. setFirmtransportCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firmtransportCd The value of firmtransportCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFirmtransportCd_LikeSearch(String firmtransportCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firmtransportCd), xgetCValueFirmtransportCd(), "FIRMTRANSPORT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCd The value of firmtransportCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFirmtransportCd_NotLikeSearch(String firmtransportCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firmtransportCd), xgetCValueFirmtransportCd(), "FIRMTRANSPORT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCd The value of firmtransportCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_PrefixSearch(String firmtransportCd) {
        setFirmtransportCd_LikeSearch(firmtransportCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     */
    public void setFirmtransportCd_IsNull() { regFirmtransportCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     */
    public void setFirmtransportCd_IsNullOrEmpty() { regFirmtransportCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     */
    public void setFirmtransportCd_IsNotNull() { regFirmtransportCd(CK_ISNN, DOBJ); }

    protected void regFirmtransportCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirmtransportCd(), "FIRMTRANSPORT_CD"); }
    protected abstract ConditionValue xgetCValueFirmtransportCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DT: {varchar(8)}
     * @param manufactureDt The value of manufactureDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDt_Equal(String manufactureDt) {
        doSetManufactureDt_Equal(fRES(manufactureDt));
    }

    protected void doSetManufactureDt_Equal(String manufactureDt) {
        regManufactureDt(CK_EQ, manufactureDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DT: {varchar(8)}
     * @param manufactureDt The value of manufactureDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDt_NotEqual(String manufactureDt) {
        doSetManufactureDt_NotEqual(fRES(manufactureDt));
    }

    protected void doSetManufactureDt_NotEqual(String manufactureDt) {
        regManufactureDt(CK_NES, manufactureDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DT: {varchar(8)}
     * @param manufactureDt The value of manufactureDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDt_GreaterThan(String manufactureDt) {
        regManufactureDt(CK_GT, fRES(manufactureDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DT: {varchar(8)}
     * @param manufactureDt The value of manufactureDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDt_LessThan(String manufactureDt) {
        regManufactureDt(CK_LT, fRES(manufactureDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DT: {varchar(8)}
     * @param manufactureDt The value of manufactureDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDt_GreaterEqual(String manufactureDt) {
        regManufactureDt(CK_GE, fRES(manufactureDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DT: {varchar(8)}
     * @param manufactureDt The value of manufactureDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDt_LessEqual(String manufactureDt) {
        regManufactureDt(CK_LE, fRES(manufactureDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DT: {varchar(8)}
     * @param manufactureDtList The collection of manufactureDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDt_InScope(Collection<String> manufactureDtList) {
        doSetManufactureDt_InScope(manufactureDtList);
    }

    protected void doSetManufactureDt_InScope(Collection<String> manufactureDtList) {
        regINS(CK_INS, cTL(manufactureDtList), xgetCValueManufactureDt(), "MANUFACTURE_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DT: {varchar(8)}
     * @param manufactureDtList The collection of manufactureDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDt_NotInScope(Collection<String> manufactureDtList) {
        doSetManufactureDt_NotInScope(manufactureDtList);
    }

    protected void doSetManufactureDt_NotInScope(Collection<String> manufactureDtList) {
        regINS(CK_NINS, cTL(manufactureDtList), xgetCValueManufactureDt(), "MANUFACTURE_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DT: {varchar(8)} <br>
     * <pre>e.g. setManufactureDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufactureDt The value of manufactureDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufactureDt_LikeSearch(String manufactureDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufactureDt), xgetCValueManufactureDt(), "MANUFACTURE_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DT: {varchar(8)}
     * @param manufactureDt The value of manufactureDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufactureDt_NotLikeSearch(String manufactureDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufactureDt), xgetCValueManufactureDt(), "MANUFACTURE_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DT: {varchar(8)}
     * @param manufactureDt The value of manufactureDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDt_PrefixSearch(String manufactureDt) {
        setManufactureDt_LikeSearch(manufactureDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUFACTURE_DT: {varchar(8)}
     */
    public void setManufactureDt_IsNull() { regManufactureDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUFACTURE_DT: {varchar(8)}
     */
    public void setManufactureDt_IsNullOrEmpty() { regManufactureDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUFACTURE_DT: {varchar(8)}
     */
    public void setManufactureDt_IsNotNull() { regManufactureDt(CK_ISNN, DOBJ); }

    protected void regManufactureDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufactureDt(), "MANUFACTURE_DT"); }
    protected abstract ConditionValue xgetCValueManufactureDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_SYMBOL: {varchar(30)}
     * @param manufactureSymbol The value of manufactureSymbol as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureSymbol_Equal(String manufactureSymbol) {
        doSetManufactureSymbol_Equal(fRES(manufactureSymbol));
    }

    protected void doSetManufactureSymbol_Equal(String manufactureSymbol) {
        regManufactureSymbol(CK_EQ, manufactureSymbol);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_SYMBOL: {varchar(30)}
     * @param manufactureSymbol The value of manufactureSymbol as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureSymbol_NotEqual(String manufactureSymbol) {
        doSetManufactureSymbol_NotEqual(fRES(manufactureSymbol));
    }

    protected void doSetManufactureSymbol_NotEqual(String manufactureSymbol) {
        regManufactureSymbol(CK_NES, manufactureSymbol);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_SYMBOL: {varchar(30)}
     * @param manufactureSymbol The value of manufactureSymbol as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureSymbol_GreaterThan(String manufactureSymbol) {
        regManufactureSymbol(CK_GT, fRES(manufactureSymbol));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_SYMBOL: {varchar(30)}
     * @param manufactureSymbol The value of manufactureSymbol as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureSymbol_LessThan(String manufactureSymbol) {
        regManufactureSymbol(CK_LT, fRES(manufactureSymbol));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_SYMBOL: {varchar(30)}
     * @param manufactureSymbol The value of manufactureSymbol as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureSymbol_GreaterEqual(String manufactureSymbol) {
        regManufactureSymbol(CK_GE, fRES(manufactureSymbol));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_SYMBOL: {varchar(30)}
     * @param manufactureSymbol The value of manufactureSymbol as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureSymbol_LessEqual(String manufactureSymbol) {
        regManufactureSymbol(CK_LE, fRES(manufactureSymbol));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURE_SYMBOL: {varchar(30)}
     * @param manufactureSymbolList The collection of manufactureSymbol as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureSymbol_InScope(Collection<String> manufactureSymbolList) {
        doSetManufactureSymbol_InScope(manufactureSymbolList);
    }

    protected void doSetManufactureSymbol_InScope(Collection<String> manufactureSymbolList) {
        regINS(CK_INS, cTL(manufactureSymbolList), xgetCValueManufactureSymbol(), "MANUFACTURE_SYMBOL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURE_SYMBOL: {varchar(30)}
     * @param manufactureSymbolList The collection of manufactureSymbol as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureSymbol_NotInScope(Collection<String> manufactureSymbolList) {
        doSetManufactureSymbol_NotInScope(manufactureSymbolList);
    }

    protected void doSetManufactureSymbol_NotInScope(Collection<String> manufactureSymbolList) {
        regINS(CK_NINS, cTL(manufactureSymbolList), xgetCValueManufactureSymbol(), "MANUFACTURE_SYMBOL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_SYMBOL: {varchar(30)} <br>
     * <pre>e.g. setManufactureSymbol_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufactureSymbol The value of manufactureSymbol as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufactureSymbol_LikeSearch(String manufactureSymbol, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufactureSymbol), xgetCValueManufactureSymbol(), "MANUFACTURE_SYMBOL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_SYMBOL: {varchar(30)}
     * @param manufactureSymbol The value of manufactureSymbol as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufactureSymbol_NotLikeSearch(String manufactureSymbol, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufactureSymbol), xgetCValueManufactureSymbol(), "MANUFACTURE_SYMBOL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_SYMBOL: {varchar(30)}
     * @param manufactureSymbol The value of manufactureSymbol as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureSymbol_PrefixSearch(String manufactureSymbol) {
        setManufactureSymbol_LikeSearch(manufactureSymbol, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUFACTURE_SYMBOL: {varchar(30)}
     */
    public void setManufactureSymbol_IsNull() { regManufactureSymbol(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUFACTURE_SYMBOL: {varchar(30)}
     */
    public void setManufactureSymbol_IsNullOrEmpty() { regManufactureSymbol(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUFACTURE_SYMBOL: {varchar(30)}
     */
    public void setManufactureSymbol_IsNotNull() { regManufactureSymbol(CK_ISNN, DOBJ); }

    protected void regManufactureSymbol(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufactureSymbol(), "MANUFACTURE_SYMBOL"); }
    protected abstract ConditionValue xgetCValueManufactureSymbol();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflg The value of fcflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_Equal(String fcflg) {
        doSetFcflg_Equal(fRES(fcflg));
    }

    protected void doSetFcflg_Equal(String fcflg) {
        regFcflg(CK_EQ, fcflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflg The value of fcflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_NotEqual(String fcflg) {
        doSetFcflg_NotEqual(fRES(fcflg));
    }

    protected void doSetFcflg_NotEqual(String fcflg) {
        regFcflg(CK_NES, fcflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflg The value of fcflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_GreaterThan(String fcflg) {
        regFcflg(CK_GT, fRES(fcflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflg The value of fcflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_LessThan(String fcflg) {
        regFcflg(CK_LT, fRES(fcflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflg The value of fcflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_GreaterEqual(String fcflg) {
        regFcflg(CK_GE, fRES(fcflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflg The value of fcflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_LessEqual(String fcflg) {
        regFcflg(CK_LE, fRES(fcflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflgList The collection of fcflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_InScope(Collection<String> fcflgList) {
        doSetFcflg_InScope(fcflgList);
    }

    protected void doSetFcflg_InScope(Collection<String> fcflgList) {
        regINS(CK_INS, cTL(fcflgList), xgetCValueFcflg(), "FCFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflgList The collection of fcflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_NotInScope(Collection<String> fcflgList) {
        doSetFcflg_NotInScope(fcflgList);
    }

    protected void doSetFcflg_NotInScope(Collection<String> fcflgList) {
        regINS(CK_NINS, cTL(fcflgList), xgetCValueFcflg(), "FCFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FCFLG: {varchar(30)} <br>
     * <pre>e.g. setFcflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fcflg The value of fcflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFcflg_LikeSearch(String fcflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fcflg), xgetCValueFcflg(), "FCFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflg The value of fcflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFcflg_NotLikeSearch(String fcflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fcflg), xgetCValueFcflg(), "FCFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflg The value of fcflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_PrefixSearch(String fcflg) {
        setFcflg_LikeSearch(fcflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     */
    public void setFcflg_IsNull() { regFcflg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     */
    public void setFcflg_IsNullOrEmpty() { regFcflg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     */
    public void setFcflg_IsNotNull() { regFcflg(CK_ISNN, DOBJ); }

    protected void regFcflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFcflg(), "FCFLG"); }
    protected abstract ConditionValue xgetCValueFcflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY_HENPIN: {bigint(19)}
     * @param diffqtyHenpin The value of diffqtyHenpin as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqtyHenpin_Equal(Long diffqtyHenpin) {
        doSetDiffqtyHenpin_Equal(diffqtyHenpin);
    }

    protected void doSetDiffqtyHenpin_Equal(Long diffqtyHenpin) {
        regDiffqtyHenpin(CK_EQ, diffqtyHenpin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY_HENPIN: {bigint(19)}
     * @param diffqtyHenpin The value of diffqtyHenpin as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqtyHenpin_NotEqual(Long diffqtyHenpin) {
        doSetDiffqtyHenpin_NotEqual(diffqtyHenpin);
    }

    protected void doSetDiffqtyHenpin_NotEqual(Long diffqtyHenpin) {
        regDiffqtyHenpin(CK_NES, diffqtyHenpin);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY_HENPIN: {bigint(19)}
     * @param diffqtyHenpin The value of diffqtyHenpin as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqtyHenpin_GreaterThan(Long diffqtyHenpin) {
        regDiffqtyHenpin(CK_GT, diffqtyHenpin);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY_HENPIN: {bigint(19)}
     * @param diffqtyHenpin The value of diffqtyHenpin as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqtyHenpin_LessThan(Long diffqtyHenpin) {
        regDiffqtyHenpin(CK_LT, diffqtyHenpin);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY_HENPIN: {bigint(19)}
     * @param diffqtyHenpin The value of diffqtyHenpin as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqtyHenpin_GreaterEqual(Long diffqtyHenpin) {
        regDiffqtyHenpin(CK_GE, diffqtyHenpin);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY_HENPIN: {bigint(19)}
     * @param diffqtyHenpin The value of diffqtyHenpin as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqtyHenpin_LessEqual(Long diffqtyHenpin) {
        regDiffqtyHenpin(CK_LE, diffqtyHenpin);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY_HENPIN: {bigint(19)}
     * @param minNumber The min number of diffqtyHenpin. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of diffqtyHenpin. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDiffqtyHenpin_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDiffqtyHenpin(), "DIFFQTY_HENPIN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIFFQTY_HENPIN: {bigint(19)}
     * @param diffqtyHenpinList The collection of diffqtyHenpin as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffqtyHenpin_InScope(Collection<Long> diffqtyHenpinList) {
        doSetDiffqtyHenpin_InScope(diffqtyHenpinList);
    }

    protected void doSetDiffqtyHenpin_InScope(Collection<Long> diffqtyHenpinList) {
        regINS(CK_INS, cTL(diffqtyHenpinList), xgetCValueDiffqtyHenpin(), "DIFFQTY_HENPIN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIFFQTY_HENPIN: {bigint(19)}
     * @param diffqtyHenpinList The collection of diffqtyHenpin as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffqtyHenpin_NotInScope(Collection<Long> diffqtyHenpinList) {
        doSetDiffqtyHenpin_NotInScope(diffqtyHenpinList);
    }

    protected void doSetDiffqtyHenpin_NotInScope(Collection<Long> diffqtyHenpinList) {
        regINS(CK_NINS, cTL(diffqtyHenpinList), xgetCValueDiffqtyHenpin(), "DIFFQTY_HENPIN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIFFQTY_HENPIN: {bigint(19)}
     */
    public void setDiffqtyHenpin_IsNull() { regDiffqtyHenpin(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIFFQTY_HENPIN: {bigint(19)}
     */
    public void setDiffqtyHenpin_IsNotNull() { regDiffqtyHenpin(CK_ISNN, DOBJ); }

    protected void regDiffqtyHenpin(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDiffqtyHenpin(), "DIFFQTY_HENPIN"); }
    protected abstract ConditionValue xgetCValueDiffqtyHenpin();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY_TAXREFOND: {bigint(19)}
     * @param diffqtyTaxrefond The value of diffqtyTaxrefond as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqtyTaxrefond_Equal(Long diffqtyTaxrefond) {
        doSetDiffqtyTaxrefond_Equal(diffqtyTaxrefond);
    }

    protected void doSetDiffqtyTaxrefond_Equal(Long diffqtyTaxrefond) {
        regDiffqtyTaxrefond(CK_EQ, diffqtyTaxrefond);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY_TAXREFOND: {bigint(19)}
     * @param diffqtyTaxrefond The value of diffqtyTaxrefond as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqtyTaxrefond_NotEqual(Long diffqtyTaxrefond) {
        doSetDiffqtyTaxrefond_NotEqual(diffqtyTaxrefond);
    }

    protected void doSetDiffqtyTaxrefond_NotEqual(Long diffqtyTaxrefond) {
        regDiffqtyTaxrefond(CK_NES, diffqtyTaxrefond);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY_TAXREFOND: {bigint(19)}
     * @param diffqtyTaxrefond The value of diffqtyTaxrefond as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqtyTaxrefond_GreaterThan(Long diffqtyTaxrefond) {
        regDiffqtyTaxrefond(CK_GT, diffqtyTaxrefond);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY_TAXREFOND: {bigint(19)}
     * @param diffqtyTaxrefond The value of diffqtyTaxrefond as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqtyTaxrefond_LessThan(Long diffqtyTaxrefond) {
        regDiffqtyTaxrefond(CK_LT, diffqtyTaxrefond);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY_TAXREFOND: {bigint(19)}
     * @param diffqtyTaxrefond The value of diffqtyTaxrefond as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqtyTaxrefond_GreaterEqual(Long diffqtyTaxrefond) {
        regDiffqtyTaxrefond(CK_GE, diffqtyTaxrefond);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY_TAXREFOND: {bigint(19)}
     * @param diffqtyTaxrefond The value of diffqtyTaxrefond as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqtyTaxrefond_LessEqual(Long diffqtyTaxrefond) {
        regDiffqtyTaxrefond(CK_LE, diffqtyTaxrefond);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY_TAXREFOND: {bigint(19)}
     * @param minNumber The min number of diffqtyTaxrefond. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of diffqtyTaxrefond. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDiffqtyTaxrefond_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDiffqtyTaxrefond(), "DIFFQTY_TAXREFOND", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIFFQTY_TAXREFOND: {bigint(19)}
     * @param diffqtyTaxrefondList The collection of diffqtyTaxrefond as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffqtyTaxrefond_InScope(Collection<Long> diffqtyTaxrefondList) {
        doSetDiffqtyTaxrefond_InScope(diffqtyTaxrefondList);
    }

    protected void doSetDiffqtyTaxrefond_InScope(Collection<Long> diffqtyTaxrefondList) {
        regINS(CK_INS, cTL(diffqtyTaxrefondList), xgetCValueDiffqtyTaxrefond(), "DIFFQTY_TAXREFOND");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIFFQTY_TAXREFOND: {bigint(19)}
     * @param diffqtyTaxrefondList The collection of diffqtyTaxrefond as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffqtyTaxrefond_NotInScope(Collection<Long> diffqtyTaxrefondList) {
        doSetDiffqtyTaxrefond_NotInScope(diffqtyTaxrefondList);
    }

    protected void doSetDiffqtyTaxrefond_NotInScope(Collection<Long> diffqtyTaxrefondList) {
        regINS(CK_NINS, cTL(diffqtyTaxrefondList), xgetCValueDiffqtyTaxrefond(), "DIFFQTY_TAXREFOND");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIFFQTY_TAXREFOND: {bigint(19)}
     */
    public void setDiffqtyTaxrefond_IsNull() { regDiffqtyTaxrefond(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIFFQTY_TAXREFOND: {bigint(19)}
     */
    public void setDiffqtyTaxrefond_IsNotNull() { regDiffqtyTaxrefond(CK_ISNN, DOBJ); }

    protected void regDiffqtyTaxrefond(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDiffqtyTaxrefond(), "DIFFQTY_TAXREFOND"); }
    protected abstract ConditionValue xgetCValueDiffqtyTaxrefond();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUFFERER_QTY: {bigint(19)}
     * @param suffererQty The value of suffererQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSuffererQty_Equal(Long suffererQty) {
        doSetSuffererQty_Equal(suffererQty);
    }

    protected void doSetSuffererQty_Equal(Long suffererQty) {
        regSuffererQty(CK_EQ, suffererQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUFFERER_QTY: {bigint(19)}
     * @param suffererQty The value of suffererQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSuffererQty_NotEqual(Long suffererQty) {
        doSetSuffererQty_NotEqual(suffererQty);
    }

    protected void doSetSuffererQty_NotEqual(Long suffererQty) {
        regSuffererQty(CK_NES, suffererQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUFFERER_QTY: {bigint(19)}
     * @param suffererQty The value of suffererQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSuffererQty_GreaterThan(Long suffererQty) {
        regSuffererQty(CK_GT, suffererQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUFFERER_QTY: {bigint(19)}
     * @param suffererQty The value of suffererQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSuffererQty_LessThan(Long suffererQty) {
        regSuffererQty(CK_LT, suffererQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUFFERER_QTY: {bigint(19)}
     * @param suffererQty The value of suffererQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSuffererQty_GreaterEqual(Long suffererQty) {
        regSuffererQty(CK_GE, suffererQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUFFERER_QTY: {bigint(19)}
     * @param suffererQty The value of suffererQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSuffererQty_LessEqual(Long suffererQty) {
        regSuffererQty(CK_LE, suffererQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SUFFERER_QTY: {bigint(19)}
     * @param minNumber The min number of suffererQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of suffererQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSuffererQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSuffererQty(), "SUFFERER_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUFFERER_QTY: {bigint(19)}
     * @param suffererQtyList The collection of suffererQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuffererQty_InScope(Collection<Long> suffererQtyList) {
        doSetSuffererQty_InScope(suffererQtyList);
    }

    protected void doSetSuffererQty_InScope(Collection<Long> suffererQtyList) {
        regINS(CK_INS, cTL(suffererQtyList), xgetCValueSuffererQty(), "SUFFERER_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUFFERER_QTY: {bigint(19)}
     * @param suffererQtyList The collection of suffererQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuffererQty_NotInScope(Collection<Long> suffererQtyList) {
        doSetSuffererQty_NotInScope(suffererQtyList);
    }

    protected void doSetSuffererQty_NotInScope(Collection<Long> suffererQtyList) {
        regINS(CK_NINS, cTL(suffererQtyList), xgetCValueSuffererQty(), "SUFFERER_QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUFFERER_QTY: {bigint(19)}
     */
    public void setSuffererQty_IsNull() { regSuffererQty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUFFERER_QTY: {bigint(19)}
     */
    public void setSuffererQty_IsNotNull() { regSuffererQty(CK_ISNN, DOBJ); }

    protected void regSuffererQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSuffererQty(), "SUFFERER_QTY"); }
    protected abstract ConditionValue xgetCValueSuffererQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MONTH_STATUSSU: {bigint(19)}
     * @param monthStatussu The value of monthStatussu as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMonthStatussu_Equal(Long monthStatussu) {
        doSetMonthStatussu_Equal(monthStatussu);
    }

    protected void doSetMonthStatussu_Equal(Long monthStatussu) {
        regMonthStatussu(CK_EQ, monthStatussu);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MONTH_STATUSSU: {bigint(19)}
     * @param monthStatussu The value of monthStatussu as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMonthStatussu_NotEqual(Long monthStatussu) {
        doSetMonthStatussu_NotEqual(monthStatussu);
    }

    protected void doSetMonthStatussu_NotEqual(Long monthStatussu) {
        regMonthStatussu(CK_NES, monthStatussu);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MONTH_STATUSSU: {bigint(19)}
     * @param monthStatussu The value of monthStatussu as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMonthStatussu_GreaterThan(Long monthStatussu) {
        regMonthStatussu(CK_GT, monthStatussu);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MONTH_STATUSSU: {bigint(19)}
     * @param monthStatussu The value of monthStatussu as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMonthStatussu_LessThan(Long monthStatussu) {
        regMonthStatussu(CK_LT, monthStatussu);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MONTH_STATUSSU: {bigint(19)}
     * @param monthStatussu The value of monthStatussu as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMonthStatussu_GreaterEqual(Long monthStatussu) {
        regMonthStatussu(CK_GE, monthStatussu);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MONTH_STATUSSU: {bigint(19)}
     * @param monthStatussu The value of monthStatussu as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMonthStatussu_LessEqual(Long monthStatussu) {
        regMonthStatussu(CK_LE, monthStatussu);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MONTH_STATUSSU: {bigint(19)}
     * @param minNumber The min number of monthStatussu. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of monthStatussu. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMonthStatussu_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMonthStatussu(), "MONTH_STATUSSU", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MONTH_STATUSSU: {bigint(19)}
     * @param monthStatussuList The collection of monthStatussu as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthStatussu_InScope(Collection<Long> monthStatussuList) {
        doSetMonthStatussu_InScope(monthStatussuList);
    }

    protected void doSetMonthStatussu_InScope(Collection<Long> monthStatussuList) {
        regINS(CK_INS, cTL(monthStatussuList), xgetCValueMonthStatussu(), "MONTH_STATUSSU");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MONTH_STATUSSU: {bigint(19)}
     * @param monthStatussuList The collection of monthStatussu as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthStatussu_NotInScope(Collection<Long> monthStatussuList) {
        doSetMonthStatussu_NotInScope(monthStatussuList);
    }

    protected void doSetMonthStatussu_NotInScope(Collection<Long> monthStatussuList) {
        regINS(CK_NINS, cTL(monthStatussuList), xgetCValueMonthStatussu(), "MONTH_STATUSSU");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MONTH_STATUSSU: {bigint(19)}
     */
    public void setMonthStatussu_IsNull() { regMonthStatussu(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MONTH_STATUSSU: {bigint(19)}
     */
    public void setMonthStatussu_IsNotNull() { regMonthStatussu(CK_ISNN, DOBJ); }

    protected void regMonthStatussu(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMonthStatussu(), "MONTH_STATUSSU"); }
    protected abstract ConditionValue xgetCValueMonthStatussu();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLUK_RECIVED_QTY: {bigint(19)}
     * @param blukRecivedQty The value of blukRecivedQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlukRecivedQty_Equal(Long blukRecivedQty) {
        doSetBlukRecivedQty_Equal(blukRecivedQty);
    }

    protected void doSetBlukRecivedQty_Equal(Long blukRecivedQty) {
        regBlukRecivedQty(CK_EQ, blukRecivedQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLUK_RECIVED_QTY: {bigint(19)}
     * @param blukRecivedQty The value of blukRecivedQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlukRecivedQty_NotEqual(Long blukRecivedQty) {
        doSetBlukRecivedQty_NotEqual(blukRecivedQty);
    }

    protected void doSetBlukRecivedQty_NotEqual(Long blukRecivedQty) {
        regBlukRecivedQty(CK_NES, blukRecivedQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLUK_RECIVED_QTY: {bigint(19)}
     * @param blukRecivedQty The value of blukRecivedQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlukRecivedQty_GreaterThan(Long blukRecivedQty) {
        regBlukRecivedQty(CK_GT, blukRecivedQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLUK_RECIVED_QTY: {bigint(19)}
     * @param blukRecivedQty The value of blukRecivedQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlukRecivedQty_LessThan(Long blukRecivedQty) {
        regBlukRecivedQty(CK_LT, blukRecivedQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLUK_RECIVED_QTY: {bigint(19)}
     * @param blukRecivedQty The value of blukRecivedQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlukRecivedQty_GreaterEqual(Long blukRecivedQty) {
        regBlukRecivedQty(CK_GE, blukRecivedQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLUK_RECIVED_QTY: {bigint(19)}
     * @param blukRecivedQty The value of blukRecivedQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlukRecivedQty_LessEqual(Long blukRecivedQty) {
        regBlukRecivedQty(CK_LE, blukRecivedQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BLUK_RECIVED_QTY: {bigint(19)}
     * @param minNumber The min number of blukRecivedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of blukRecivedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBlukRecivedQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBlukRecivedQty(), "BLUK_RECIVED_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLUK_RECIVED_QTY: {bigint(19)}
     * @param blukRecivedQtyList The collection of blukRecivedQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlukRecivedQty_InScope(Collection<Long> blukRecivedQtyList) {
        doSetBlukRecivedQty_InScope(blukRecivedQtyList);
    }

    protected void doSetBlukRecivedQty_InScope(Collection<Long> blukRecivedQtyList) {
        regINS(CK_INS, cTL(blukRecivedQtyList), xgetCValueBlukRecivedQty(), "BLUK_RECIVED_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLUK_RECIVED_QTY: {bigint(19)}
     * @param blukRecivedQtyList The collection of blukRecivedQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlukRecivedQty_NotInScope(Collection<Long> blukRecivedQtyList) {
        doSetBlukRecivedQty_NotInScope(blukRecivedQtyList);
    }

    protected void doSetBlukRecivedQty_NotInScope(Collection<Long> blukRecivedQtyList) {
        regINS(CK_NINS, cTL(blukRecivedQtyList), xgetCValueBlukRecivedQty(), "BLUK_RECIVED_QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLUK_RECIVED_QTY: {bigint(19)}
     */
    public void setBlukRecivedQty_IsNull() { regBlukRecivedQty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLUK_RECIVED_QTY: {bigint(19)}
     */
    public void setBlukRecivedQty_IsNotNull() { regBlukRecivedQty(CK_ISNN, DOBJ); }

    protected void regBlukRecivedQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBlukRecivedQty(), "BLUK_RECIVED_QTY"); }
    protected abstract ConditionValue xgetCValueBlukRecivedQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFUNDITEM_QTY: {bigint(19)}
     * @param refunditemQty The value of refunditemQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefunditemQty_Equal(Long refunditemQty) {
        doSetRefunditemQty_Equal(refunditemQty);
    }

    protected void doSetRefunditemQty_Equal(Long refunditemQty) {
        regRefunditemQty(CK_EQ, refunditemQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFUNDITEM_QTY: {bigint(19)}
     * @param refunditemQty The value of refunditemQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefunditemQty_NotEqual(Long refunditemQty) {
        doSetRefunditemQty_NotEqual(refunditemQty);
    }

    protected void doSetRefunditemQty_NotEqual(Long refunditemQty) {
        regRefunditemQty(CK_NES, refunditemQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFUNDITEM_QTY: {bigint(19)}
     * @param refunditemQty The value of refunditemQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefunditemQty_GreaterThan(Long refunditemQty) {
        regRefunditemQty(CK_GT, refunditemQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFUNDITEM_QTY: {bigint(19)}
     * @param refunditemQty The value of refunditemQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefunditemQty_LessThan(Long refunditemQty) {
        regRefunditemQty(CK_LT, refunditemQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFUNDITEM_QTY: {bigint(19)}
     * @param refunditemQty The value of refunditemQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefunditemQty_GreaterEqual(Long refunditemQty) {
        regRefunditemQty(CK_GE, refunditemQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFUNDITEM_QTY: {bigint(19)}
     * @param refunditemQty The value of refunditemQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefunditemQty_LessEqual(Long refunditemQty) {
        regRefunditemQty(CK_LE, refunditemQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REFUNDITEM_QTY: {bigint(19)}
     * @param minNumber The min number of refunditemQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of refunditemQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefunditemQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRefunditemQty(), "REFUNDITEM_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REFUNDITEM_QTY: {bigint(19)}
     * @param refunditemQtyList The collection of refunditemQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefunditemQty_InScope(Collection<Long> refunditemQtyList) {
        doSetRefunditemQty_InScope(refunditemQtyList);
    }

    protected void doSetRefunditemQty_InScope(Collection<Long> refunditemQtyList) {
        regINS(CK_INS, cTL(refunditemQtyList), xgetCValueRefunditemQty(), "REFUNDITEM_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REFUNDITEM_QTY: {bigint(19)}
     * @param refunditemQtyList The collection of refunditemQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefunditemQty_NotInScope(Collection<Long> refunditemQtyList) {
        doSetRefunditemQty_NotInScope(refunditemQtyList);
    }

    protected void doSetRefunditemQty_NotInScope(Collection<Long> refunditemQtyList) {
        regINS(CK_NINS, cTL(refunditemQtyList), xgetCValueRefunditemQty(), "REFUNDITEM_QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REFUNDITEM_QTY: {bigint(19)}
     */
    public void setRefunditemQty_IsNull() { regRefunditemQty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REFUNDITEM_QTY: {bigint(19)}
     */
    public void setRefunditemQty_IsNotNull() { regRefunditemQty(CK_ISNN, DOBJ); }

    protected void regRefunditemQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefunditemQty(), "REFUNDITEM_QTY"); }
    protected abstract ConditionValue xgetCValueRefunditemQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]}
     * @param inventoryInputFlg The value of inventoryInputFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInputFlg_Equal(String inventoryInputFlg) {
        doSetInventoryInputFlg_Equal(fRES(inventoryInputFlg));
    }

    protected void doSetInventoryInputFlg_Equal(String inventoryInputFlg) {
        regInventoryInputFlg(CK_EQ, inventoryInputFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]}
     * @param inventoryInputFlg The value of inventoryInputFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInputFlg_NotEqual(String inventoryInputFlg) {
        doSetInventoryInputFlg_NotEqual(fRES(inventoryInputFlg));
    }

    protected void doSetInventoryInputFlg_NotEqual(String inventoryInputFlg) {
        regInventoryInputFlg(CK_NES, inventoryInputFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]}
     * @param inventoryInputFlg The value of inventoryInputFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInputFlg_GreaterThan(String inventoryInputFlg) {
        regInventoryInputFlg(CK_GT, fRES(inventoryInputFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]}
     * @param inventoryInputFlg The value of inventoryInputFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInputFlg_LessThan(String inventoryInputFlg) {
        regInventoryInputFlg(CK_LT, fRES(inventoryInputFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]}
     * @param inventoryInputFlg The value of inventoryInputFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInputFlg_GreaterEqual(String inventoryInputFlg) {
        regInventoryInputFlg(CK_GE, fRES(inventoryInputFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]}
     * @param inventoryInputFlg The value of inventoryInputFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInputFlg_LessEqual(String inventoryInputFlg) {
        regInventoryInputFlg(CK_LE, fRES(inventoryInputFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]}
     * @param inventoryInputFlgList The collection of inventoryInputFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInputFlg_InScope(Collection<String> inventoryInputFlgList) {
        doSetInventoryInputFlg_InScope(inventoryInputFlgList);
    }

    protected void doSetInventoryInputFlg_InScope(Collection<String> inventoryInputFlgList) {
        regINS(CK_INS, cTL(inventoryInputFlgList), xgetCValueInventoryInputFlg(), "INVENTORY_INPUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]}
     * @param inventoryInputFlgList The collection of inventoryInputFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInputFlg_NotInScope(Collection<String> inventoryInputFlgList) {
        doSetInventoryInputFlg_NotInScope(inventoryInputFlgList);
    }

    protected void doSetInventoryInputFlg_NotInScope(Collection<String> inventoryInputFlgList) {
        regINS(CK_NINS, cTL(inventoryInputFlgList), xgetCValueInventoryInputFlg(), "INVENTORY_INPUT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setInventoryInputFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventoryInputFlg The value of inventoryInputFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventoryInputFlg_LikeSearch(String inventoryInputFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventoryInputFlg), xgetCValueInventoryInputFlg(), "INVENTORY_INPUT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]}
     * @param inventoryInputFlg The value of inventoryInputFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventoryInputFlg_NotLikeSearch(String inventoryInputFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventoryInputFlg), xgetCValueInventoryInputFlg(), "INVENTORY_INPUT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]}
     * @param inventoryInputFlg The value of inventoryInputFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInputFlg_PrefixSearch(String inventoryInputFlg) {
        setInventoryInputFlg_LikeSearch(inventoryInputFlg, xcLSOPPre());
    }

    protected void regInventoryInputFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryInputFlg(), "INVENTORY_INPUT_FLG"); }
    protected abstract ConditionValue xgetCValueInventoryInputFlg();

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
    public HpSLCFunction<TInventoryBCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TInventoryBCB.class);
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
    public HpSLCFunction<TInventoryBCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TInventoryBCB.class);
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
    public HpSLCFunction<TInventoryBCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TInventoryBCB.class);
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
    public HpSLCFunction<TInventoryBCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TInventoryBCB.class);
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
    public HpSLCFunction<TInventoryBCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TInventoryBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TInventoryBCB&gt;() {
     *     public void query(TInventoryBCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TInventoryBCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TInventoryBCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TInventoryBCQ sq);

    protected TInventoryBCB xcreateScalarConditionCB() {
        TInventoryBCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TInventoryBCB xcreateScalarConditionPartitionByCB() {
        TInventoryBCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TInventoryBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "INVENTORY_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TInventoryBCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TInventoryBCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TInventoryBCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "INVENTORY_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TInventoryBCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TInventoryBCQ sq);

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
    protected TInventoryBCB newMyCB() {
        return new TInventoryBCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TInventoryBCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
