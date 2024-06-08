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
 * The abstract condition-query of T_MOVE_RECORD_B.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTMoveRecordBCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTMoveRecordBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_MOVE_RECORD_B";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param moveRecordBId The value of moveRecordBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveRecordBId_Equal(Long moveRecordBId) {
        doSetMoveRecordBId_Equal(moveRecordBId);
    }

    protected void doSetMoveRecordBId_Equal(Long moveRecordBId) {
        regMoveRecordBId(CK_EQ, moveRecordBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param moveRecordBId The value of moveRecordBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveRecordBId_NotEqual(Long moveRecordBId) {
        doSetMoveRecordBId_NotEqual(moveRecordBId);
    }

    protected void doSetMoveRecordBId_NotEqual(Long moveRecordBId) {
        regMoveRecordBId(CK_NES, moveRecordBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param moveRecordBId The value of moveRecordBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveRecordBId_GreaterThan(Long moveRecordBId) {
        regMoveRecordBId(CK_GT, moveRecordBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param moveRecordBId The value of moveRecordBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveRecordBId_LessThan(Long moveRecordBId) {
        regMoveRecordBId(CK_LT, moveRecordBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param moveRecordBId The value of moveRecordBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveRecordBId_GreaterEqual(Long moveRecordBId) {
        regMoveRecordBId(CK_GE, moveRecordBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param moveRecordBId The value of moveRecordBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveRecordBId_LessEqual(Long moveRecordBId) {
        regMoveRecordBId(CK_LE, moveRecordBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of moveRecordBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveRecordBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveRecordBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveRecordBId(), "MOVE_RECORD_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param moveRecordBIdList The collection of moveRecordBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveRecordBId_InScope(Collection<Long> moveRecordBIdList) {
        doSetMoveRecordBId_InScope(moveRecordBIdList);
    }

    protected void doSetMoveRecordBId_InScope(Collection<Long> moveRecordBIdList) {
        regINS(CK_INS, cTL(moveRecordBIdList), xgetCValueMoveRecordBId(), "MOVE_RECORD_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param moveRecordBIdList The collection of moveRecordBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveRecordBId_NotInScope(Collection<Long> moveRecordBIdList) {
        doSetMoveRecordBId_NotInScope(moveRecordBIdList);
    }

    protected void doSetMoveRecordBId_NotInScope(Collection<Long> moveRecordBIdList) {
        regINS(CK_NINS, cTL(moveRecordBIdList), xgetCValueMoveRecordBId(), "MOVE_RECORD_B_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MOVE_RECORD_B_ID from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by MOVE_RECORD_B_ID, named 'TStockInoutAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMoveRecordBId_ExistsReferrer_TStockInoutList(cb.query());
        registerExistsReferrer(cb.query(), "MOVE_RECORD_B_ID", "MOVE_RECORD_B_ID", pp, "tStockInoutList");
    }
    public abstract String keepMoveRecordBId_ExistsReferrer_TStockInoutList(TStockInoutCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MOVE_RECORD_B_ID from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by MOVE_RECORD_B_ID, named 'TStockInoutAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStockInoutList</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MoveRecordBId_NotExistsReferrer_TStockInoutList for 'not exists'. (NotNull)
     */
    public void notExistsTStockInoutList(SubQuery<TStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMoveRecordBId_NotExistsReferrer_TStockInoutList(cb.query());
        registerNotExistsReferrer(cb.query(), "MOVE_RECORD_B_ID", "MOVE_RECORD_B_ID", pp, "tStockInoutList");
    }
    public abstract String keepMoveRecordBId_NotExistsReferrer_TStockInoutList(TStockInoutCQ sq);

    public void xsderiveTStockInoutList(String fn, SubQuery<TStockInoutCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMoveRecordBId_SpecifyDerivedReferrer_TStockInoutList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MOVE_RECORD_B_ID", "MOVE_RECORD_B_ID", pp, "tStockInoutList", al, op);
    }
    public abstract String keepMoveRecordBId_SpecifyDerivedReferrer_TStockInoutList(TStockInoutCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by MOVE_RECORD_B_ID, named 'TStockInoutAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepMoveRecordBId_QueryDerivedReferrer_TStockInoutList(cb.query()); String prpp = keepMoveRecordBId_QueryDerivedReferrer_TStockInoutListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MOVE_RECORD_B_ID", "MOVE_RECORD_B_ID", sqpp, "tStockInoutList", rd, vl, prpp, op);
    }
    public abstract String keepMoveRecordBId_QueryDerivedReferrer_TStockInoutList(TStockInoutCQ sq);
    public abstract String keepMoveRecordBId_QueryDerivedReferrer_TStockInoutListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMoveRecordBId_IsNull() { regMoveRecordBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMoveRecordBId_IsNotNull() { regMoveRecordBId(CK_ISNN, DOBJ); }

    protected void regMoveRecordBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveRecordBId(), "MOVE_RECORD_B_ID"); }
    protected abstract ConditionValue xgetCValueMoveRecordBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H}
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
     * MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H}
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
     * MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H}
     * @param moveInstHId The value of moveInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_GreaterThan(Long moveInstHId) {
        regMoveInstHId(CK_GT, moveInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H}
     * @param moveInstHId The value of moveInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_LessThan(Long moveInstHId) {
        regMoveInstHId(CK_LT, moveInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H}
     * @param moveInstHId The value of moveInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_GreaterEqual(Long moveInstHId) {
        regMoveInstHId(CK_GE, moveInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H}
     * @param moveInstHId The value of moveInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_LessEqual(Long moveInstHId) {
        regMoveInstHId(CK_LE, moveInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H}
     * @param minNumber The min number of moveInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveInstHId(), "MOVE_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H}
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
     * MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H}
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

    protected void regMoveInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveInstHId(), "MOVE_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueMoveInstHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_B_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_B}
     * @param moveInstBId The value of moveInstBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstBId_Equal(Long moveInstBId) {
        doSetMoveInstBId_Equal(moveInstBId);
    }

    protected void doSetMoveInstBId_Equal(Long moveInstBId) {
        regMoveInstBId(CK_EQ, moveInstBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_B_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_B}
     * @param moveInstBId The value of moveInstBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstBId_NotEqual(Long moveInstBId) {
        doSetMoveInstBId_NotEqual(moveInstBId);
    }

    protected void doSetMoveInstBId_NotEqual(Long moveInstBId) {
        regMoveInstBId(CK_NES, moveInstBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_B_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_B}
     * @param moveInstBId The value of moveInstBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstBId_GreaterThan(Long moveInstBId) {
        regMoveInstBId(CK_GT, moveInstBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_B_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_B}
     * @param moveInstBId The value of moveInstBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstBId_LessThan(Long moveInstBId) {
        regMoveInstBId(CK_LT, moveInstBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_B_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_B}
     * @param moveInstBId The value of moveInstBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstBId_GreaterEqual(Long moveInstBId) {
        regMoveInstBId(CK_GE, moveInstBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_B_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_B}
     * @param moveInstBId The value of moveInstBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstBId_LessEqual(Long moveInstBId) {
        regMoveInstBId(CK_LE, moveInstBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_B_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_B}
     * @param minNumber The min number of moveInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveInstBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveInstBId(), "MOVE_INST_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_INST_B_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_B}
     * @param moveInstBIdList The collection of moveInstBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstBId_InScope(Collection<Long> moveInstBIdList) {
        doSetMoveInstBId_InScope(moveInstBIdList);
    }

    protected void doSetMoveInstBId_InScope(Collection<Long> moveInstBIdList) {
        regINS(CK_INS, cTL(moveInstBIdList), xgetCValueMoveInstBId(), "MOVE_INST_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_INST_B_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_B}
     * @param moveInstBIdList The collection of moveInstBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstBId_NotInScope(Collection<Long> moveInstBIdList) {
        doSetMoveInstBId_NotInScope(moveInstBIdList);
    }

    protected void doSetMoveInstBId_NotInScope(Collection<Long> moveInstBIdList) {
        regINS(CK_NINS, cTL(moveInstBIdList), xgetCValueMoveInstBId(), "MOVE_INST_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MOVE_INST_B_ID from T_MOVE_INST_B where ...)} <br />
     * T_MOVE_INST_B by my MOVE_INST_B_ID, named 'TMoveInstB'.
     * @param subCBLambda The callback for sub-query of TMoveInstB for 'in-scope'. (NotNull)
     */
    public void inScopeTMoveInstB(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepMoveInstBId_InScopeRelation_TMoveInstB(cb.query());
        registerInScopeRelation(cb.query(), "MOVE_INST_B_ID", "MOVE_INST_B_ID", pp, "tMoveInstB", false);
    }
    public abstract String keepMoveInstBId_InScopeRelation_TMoveInstB(TMoveInstBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MOVE_INST_B_ID from T_MOVE_INST_B where ...)} <br />
     * T_MOVE_INST_B by my MOVE_INST_B_ID, named 'TMoveInstB'.
     * @param subCBLambda The callback for sub-query of TMoveInstB for 'not in-scope'. (NotNull)
     */
    public void notInScopeTMoveInstB(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepMoveInstBId_NotInScopeRelation_TMoveInstB(cb.query());
        registerInScopeRelation(cb.query(), "MOVE_INST_B_ID", "MOVE_INST_B_ID", pp, "tMoveInstB", true);
    }
    public abstract String keepMoveInstBId_NotInScopeRelation_TMoveInstB(TMoveInstBCQ sq);

    protected void regMoveInstBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveInstBId(), "MOVE_INST_B_ID"); }
    protected abstract ConditionValue xgetCValueMoveInstBId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
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
     * PROCESS_NO: {NotNull, varchar(30)}
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
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_GreaterThan(String processNo) {
        regProcessNo(CK_GT, fRES(processNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_LessThan(String processNo) {
        regProcessNo(CK_LT, fRES(processNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_GreaterEqual(String processNo) {
        regProcessNo(CK_GE, fRES(processNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_LessEqual(String processNo) {
        regProcessNo(CK_LE, fRES(processNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
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
     * PROCESS_NO: {NotNull, varchar(30)}
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
     * PROCESS_NO: {NotNull, varchar(30)} <br>
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
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProcessNo_NotLikeSearch(String processNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(processNo), xgetCValueProcessNo(), "PROCESS_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_PrefixSearch(String processNo) {
        setProcessNo_LikeSearch(processNo, xcLSOPPre());
    }

    protected void regProcessNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessNo(), "PROCESS_NO"); }
    protected abstract ConditionValue xgetCValueProcessNo();

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
     * MOVE_DT: {NotNull, varchar(8)}
     * @param moveDt The value of moveDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveDt_Equal(String moveDt) {
        doSetMoveDt_Equal(fRES(moveDt));
    }

    protected void doSetMoveDt_Equal(String moveDt) {
        regMoveDt(CK_EQ, moveDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_DT: {NotNull, varchar(8)}
     * @param moveDt The value of moveDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveDt_NotEqual(String moveDt) {
        doSetMoveDt_NotEqual(fRES(moveDt));
    }

    protected void doSetMoveDt_NotEqual(String moveDt) {
        regMoveDt(CK_NES, moveDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_DT: {NotNull, varchar(8)}
     * @param moveDt The value of moveDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveDt_GreaterThan(String moveDt) {
        regMoveDt(CK_GT, fRES(moveDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_DT: {NotNull, varchar(8)}
     * @param moveDt The value of moveDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveDt_LessThan(String moveDt) {
        regMoveDt(CK_LT, fRES(moveDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_DT: {NotNull, varchar(8)}
     * @param moveDt The value of moveDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveDt_GreaterEqual(String moveDt) {
        regMoveDt(CK_GE, fRES(moveDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_DT: {NotNull, varchar(8)}
     * @param moveDt The value of moveDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveDt_LessEqual(String moveDt) {
        regMoveDt(CK_LE, fRES(moveDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOVE_DT: {NotNull, varchar(8)}
     * @param moveDtList The collection of moveDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveDt_InScope(Collection<String> moveDtList) {
        doSetMoveDt_InScope(moveDtList);
    }

    protected void doSetMoveDt_InScope(Collection<String> moveDtList) {
        regINS(CK_INS, cTL(moveDtList), xgetCValueMoveDt(), "MOVE_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOVE_DT: {NotNull, varchar(8)}
     * @param moveDtList The collection of moveDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveDt_NotInScope(Collection<String> moveDtList) {
        doSetMoveDt_NotInScope(moveDtList);
    }

    protected void doSetMoveDt_NotInScope(Collection<String> moveDtList) {
        regINS(CK_NINS, cTL(moveDtList), xgetCValueMoveDt(), "MOVE_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOVE_DT: {NotNull, varchar(8)} <br>
     * <pre>e.g. setMoveDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param moveDt The value of moveDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMoveDt_LikeSearch(String moveDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(moveDt), xgetCValueMoveDt(), "MOVE_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOVE_DT: {NotNull, varchar(8)}
     * @param moveDt The value of moveDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMoveDt_NotLikeSearch(String moveDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(moveDt), xgetCValueMoveDt(), "MOVE_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOVE_DT: {NotNull, varchar(8)}
     * @param moveDt The value of moveDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveDt_PrefixSearch(String moveDt) {
        setMoveDt_LikeSearch(moveDt, xcLSOPPre());
    }

    protected void regMoveDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveDt(), "MOVE_DT"); }
    protected abstract ConditionValue xgetCValueMoveDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {decimal(16, 6)}
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
     * MOVE_NUM: {decimal(16, 6)}
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
     * MOVE_NUM: {decimal(16, 6)}
     * @param moveNum The value of moveNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum_GreaterThan(java.math.BigDecimal moveNum) {
        regMoveNum(CK_GT, moveNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {decimal(16, 6)}
     * @param moveNum The value of moveNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum_LessThan(java.math.BigDecimal moveNum) {
        regMoveNum(CK_LT, moveNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {decimal(16, 6)}
     * @param moveNum The value of moveNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum_GreaterEqual(java.math.BigDecimal moveNum) {
        regMoveNum(CK_GE, moveNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {decimal(16, 6)}
     * @param moveNum The value of moveNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveNum_LessEqual(java.math.BigDecimal moveNum) {
        regMoveNum(CK_LE, moveNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_NUM: {decimal(16, 6)}
     * @param minNumber The min number of moveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveNum(), "MOVE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_NUM: {decimal(16, 6)}
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
     * MOVE_NUM: {decimal(16, 6)}
     * @param moveNumList The collection of moveNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveNum_NotInScope(Collection<java.math.BigDecimal> moveNumList) {
        doSetMoveNum_NotInScope(moveNumList);
    }

    protected void doSetMoveNum_NotInScope(Collection<java.math.BigDecimal> moveNumList) {
        regINS(CK_NINS, cTL(moveNumList), xgetCValueMoveNum(), "MOVE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_NUM: {decimal(16, 6)}
     */
    public void setMoveNum_IsNull() { regMoveNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_NUM: {decimal(16, 6)}
     */
    public void setMoveNum_IsNotNull() { regMoveNum(CK_ISNN, DOBJ); }

    protected void regMoveNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveNum(), "MOVE_NUM"); }
    protected abstract ConditionValue xgetCValueMoveNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_MERGE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg}
     * @param storeNoMergeFlg The value of storeNoMergeFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoMergeFlg_Equal(String storeNoMergeFlg) {
        doSetStoreNoMergeFlg_Equal(fRES(storeNoMergeFlg));
    }

    /**
     * Equal(=). As StoreNoMergeFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_MERGE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg} <br>
     * 入庫No.マージフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoMergeFlg_Equal_AsStoreNoMergeFlg(CDef.StoreNoMergeFlg cdef) {
        doSetStoreNoMergeFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: マージしない
     */
    public void setStoreNoMergeFlg_Equal_$0() {
        setStoreNoMergeFlg_Equal_AsStoreNoMergeFlg(CDef.StoreNoMergeFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: マージする
     */
    public void setStoreNoMergeFlg_Equal_$1() {
        setStoreNoMergeFlg_Equal_AsStoreNoMergeFlg(CDef.StoreNoMergeFlg.$1);
    }

    protected void doSetStoreNoMergeFlg_Equal(String storeNoMergeFlg) {
        regStoreNoMergeFlg(CK_EQ, storeNoMergeFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_MERGE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg}
     * @param storeNoMergeFlg The value of storeNoMergeFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoMergeFlg_NotEqual(String storeNoMergeFlg) {
        doSetStoreNoMergeFlg_NotEqual(fRES(storeNoMergeFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As StoreNoMergeFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_MERGE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg} <br>
     * 入庫No.マージフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoMergeFlg_NotEqual_AsStoreNoMergeFlg(CDef.StoreNoMergeFlg cdef) {
        doSetStoreNoMergeFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: マージしない
     */
    public void setStoreNoMergeFlg_NotEqual_$0() {
        setStoreNoMergeFlg_NotEqual_AsStoreNoMergeFlg(CDef.StoreNoMergeFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: マージする
     */
    public void setStoreNoMergeFlg_NotEqual_$1() {
        setStoreNoMergeFlg_NotEqual_AsStoreNoMergeFlg(CDef.StoreNoMergeFlg.$1);
    }

    protected void doSetStoreNoMergeFlg_NotEqual(String storeNoMergeFlg) {
        regStoreNoMergeFlg(CK_NES, storeNoMergeFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_NO_MERGE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg}
     * @param storeNoMergeFlgList The collection of storeNoMergeFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoMergeFlg_InScope(Collection<String> storeNoMergeFlgList) {
        doSetStoreNoMergeFlg_InScope(storeNoMergeFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As StoreNoMergeFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_NO_MERGE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg} <br>
     * 入庫No.マージフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoMergeFlg_InScope_AsStoreNoMergeFlg(Collection<CDef.StoreNoMergeFlg> cdefList) {
        doSetStoreNoMergeFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetStoreNoMergeFlg_InScope(Collection<String> storeNoMergeFlgList) {
        regINS(CK_INS, cTL(storeNoMergeFlgList), xgetCValueStoreNoMergeFlg(), "STORE_NO_MERGE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_NO_MERGE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg}
     * @param storeNoMergeFlgList The collection of storeNoMergeFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoMergeFlg_NotInScope(Collection<String> storeNoMergeFlgList) {
        doSetStoreNoMergeFlg_NotInScope(storeNoMergeFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As StoreNoMergeFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_NO_MERGE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg} <br>
     * 入庫No.マージフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoMergeFlg_NotInScope_AsStoreNoMergeFlg(Collection<CDef.StoreNoMergeFlg> cdefList) {
        doSetStoreNoMergeFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetStoreNoMergeFlg_NotInScope(Collection<String> storeNoMergeFlgList) {
        regINS(CK_NINS, cTL(storeNoMergeFlgList), xgetCValueStoreNoMergeFlg(), "STORE_NO_MERGE_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_NO_MERGE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg}
     */
    public void setStoreNoMergeFlg_IsNull() { regStoreNoMergeFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_NO_MERGE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg}
     */
    public void setStoreNoMergeFlg_IsNotNull() { regStoreNoMergeFlg(CK_ISNN, DOBJ); }

    protected void regStoreNoMergeFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreNoMergeFlg(), "STORE_NO_MERGE_FLG"); }
    protected abstract ConditionValue xgetCValueStoreNoMergeFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALL_SHIPPING_FLG: {char(1), FK to B_CLASS_DTL, classification=AllShippingFlg}
     * @param allShippingFlg The value of allShippingFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllShippingFlg_Equal(String allShippingFlg) {
        doSetAllShippingFlg_Equal(fRES(allShippingFlg));
    }

    /**
     * Equal(=). As AllShippingFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALL_SHIPPING_FLG: {char(1), FK to B_CLASS_DTL, classification=AllShippingFlg} <br>
     * 全数出庫フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAllShippingFlg_Equal_AsAllShippingFlg(CDef.AllShippingFlg cdef) {
        doSetAllShippingFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 部分出庫
     */
    public void setAllShippingFlg_Equal_$0() {
        setAllShippingFlg_Equal_AsAllShippingFlg(CDef.AllShippingFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 全数出庫
     */
    public void setAllShippingFlg_Equal_$1() {
        setAllShippingFlg_Equal_AsAllShippingFlg(CDef.AllShippingFlg.$1);
    }

    protected void doSetAllShippingFlg_Equal(String allShippingFlg) {
        regAllShippingFlg(CK_EQ, allShippingFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALL_SHIPPING_FLG: {char(1), FK to B_CLASS_DTL, classification=AllShippingFlg}
     * @param allShippingFlg The value of allShippingFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllShippingFlg_NotEqual(String allShippingFlg) {
        doSetAllShippingFlg_NotEqual(fRES(allShippingFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As AllShippingFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALL_SHIPPING_FLG: {char(1), FK to B_CLASS_DTL, classification=AllShippingFlg} <br>
     * 全数出庫フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAllShippingFlg_NotEqual_AsAllShippingFlg(CDef.AllShippingFlg cdef) {
        doSetAllShippingFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 部分出庫
     */
    public void setAllShippingFlg_NotEqual_$0() {
        setAllShippingFlg_NotEqual_AsAllShippingFlg(CDef.AllShippingFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 全数出庫
     */
    public void setAllShippingFlg_NotEqual_$1() {
        setAllShippingFlg_NotEqual_AsAllShippingFlg(CDef.AllShippingFlg.$1);
    }

    protected void doSetAllShippingFlg_NotEqual(String allShippingFlg) {
        regAllShippingFlg(CK_NES, allShippingFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALL_SHIPPING_FLG: {char(1), FK to B_CLASS_DTL, classification=AllShippingFlg}
     * @param allShippingFlgList The collection of allShippingFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllShippingFlg_InScope(Collection<String> allShippingFlgList) {
        doSetAllShippingFlg_InScope(allShippingFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As AllShippingFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALL_SHIPPING_FLG: {char(1), FK to B_CLASS_DTL, classification=AllShippingFlg} <br>
     * 全数出庫フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllShippingFlg_InScope_AsAllShippingFlg(Collection<CDef.AllShippingFlg> cdefList) {
        doSetAllShippingFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetAllShippingFlg_InScope(Collection<String> allShippingFlgList) {
        regINS(CK_INS, cTL(allShippingFlgList), xgetCValueAllShippingFlg(), "ALL_SHIPPING_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALL_SHIPPING_FLG: {char(1), FK to B_CLASS_DTL, classification=AllShippingFlg}
     * @param allShippingFlgList The collection of allShippingFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllShippingFlg_NotInScope(Collection<String> allShippingFlgList) {
        doSetAllShippingFlg_NotInScope(allShippingFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As AllShippingFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALL_SHIPPING_FLG: {char(1), FK to B_CLASS_DTL, classification=AllShippingFlg} <br>
     * 全数出庫フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllShippingFlg_NotInScope_AsAllShippingFlg(Collection<CDef.AllShippingFlg> cdefList) {
        doSetAllShippingFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetAllShippingFlg_NotInScope(Collection<String> allShippingFlgList) {
        regINS(CK_NINS, cTL(allShippingFlgList), xgetCValueAllShippingFlg(), "ALL_SHIPPING_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALL_SHIPPING_FLG: {char(1), FK to B_CLASS_DTL, classification=AllShippingFlg}
     */
    public void setAllShippingFlg_IsNull() { regAllShippingFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALL_SHIPPING_FLG: {char(1), FK to B_CLASS_DTL, classification=AllShippingFlg}
     */
    public void setAllShippingFlg_IsNotNull() { regAllShippingFlg(CK_ISNN, DOBJ); }

    protected void regAllShippingFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllShippingFlg(), "ALL_SHIPPING_FLG"); }
    protected abstract ConditionValue xgetCValueAllShippingFlg();

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
    public HpSLCFunction<TMoveRecordBCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TMoveRecordBCB.class);
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
    public HpSLCFunction<TMoveRecordBCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TMoveRecordBCB.class);
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
    public HpSLCFunction<TMoveRecordBCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TMoveRecordBCB.class);
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
    public HpSLCFunction<TMoveRecordBCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TMoveRecordBCB.class);
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
    public HpSLCFunction<TMoveRecordBCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TMoveRecordBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TMoveRecordBCB&gt;() {
     *     public void query(TMoveRecordBCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TMoveRecordBCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TMoveRecordBCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveRecordBCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TMoveRecordBCQ sq);

    protected TMoveRecordBCB xcreateScalarConditionCB() {
        TMoveRecordBCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TMoveRecordBCB xcreateScalarConditionPartitionByCB() {
        TMoveRecordBCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TMoveRecordBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveRecordBCB cb = new TMoveRecordBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MOVE_RECORD_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TMoveRecordBCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TMoveRecordBCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TMoveRecordBCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveRecordBCB cb = new TMoveRecordBCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MOVE_RECORD_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TMoveRecordBCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TMoveRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveRecordBCB cb = new TMoveRecordBCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TMoveRecordBCQ sq);

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
    protected TMoveRecordBCB newMyCB() {
        return new TMoveRecordBCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TMoveRecordBCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
