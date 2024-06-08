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
 * The abstract condition-query of T_MOVE_INST_B.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTMoveInstBCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTMoveInstBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_MOVE_INST_B";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param moveInstBId The value of moveInstBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstBId_GreaterThan(Long moveInstBId) {
        regMoveInstBId(CK_GT, moveInstBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param moveInstBId The value of moveInstBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstBId_LessThan(Long moveInstBId) {
        regMoveInstBId(CK_LT, moveInstBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param moveInstBId The value of moveInstBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstBId_GreaterEqual(Long moveInstBId) {
        regMoveInstBId(CK_GE, moveInstBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param moveInstBId The value of moveInstBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstBId_LessEqual(Long moveInstBId) {
        regMoveInstBId(CK_LE, moveInstBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of moveInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveInstBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveInstBId(), "MOVE_INST_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param moveInstBIdList The collection of moveInstBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstBId_NotInScope(Collection<Long> moveInstBIdList) {
        doSetMoveInstBId_NotInScope(moveInstBIdList);
    }

    protected void doSetMoveInstBId_NotInScope(Collection<Long> moveInstBIdList) {
        regINS(CK_NINS, cTL(moveInstBIdList), xgetCValueMoveInstBId(), "MOVE_INST_B_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select T_MOVE_INST_B_SUB_ID from T_MOVE_INST_B_SUB where ...)} <br>
     * T_MOVE_INST_B_SUB by T_MOVE_INST_B_SUB_ID, named 'TMoveInstBSubAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTMoveInstBSubAsOne</span>(subCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     subCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TMoveInstBSubAsOne for 'exists'. (NotNull)
     */
    public void existsTMoveInstBSubAsOne(SubQuery<TMoveInstBSubCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBSubCB cb = new TMoveInstBSubCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMoveInstBId_ExistsReferrer_TMoveInstBSubAsOne(cb.query());
        registerExistsReferrer(cb.query(), "MOVE_INST_B_ID", "T_MOVE_INST_B_SUB_ID", pp, "tMoveInstBSubAsOne");
    }
    public abstract String keepMoveInstBId_ExistsReferrer_TMoveInstBSubAsOne(TMoveInstBSubCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MOVE_INST_B_ID from T_MOVE_RECORD_B where ...)} <br>
     * T_MOVE_RECORD_B by MOVE_INST_B_ID, named 'TMoveRecordBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTMoveRecordBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TMoveRecordBList for 'exists'. (NotNull)
     */
    public void existsTMoveRecordBList(SubQuery<TMoveRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveRecordBCB cb = new TMoveRecordBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMoveInstBId_ExistsReferrer_TMoveRecordBList(cb.query());
        registerExistsReferrer(cb.query(), "MOVE_INST_B_ID", "MOVE_INST_B_ID", pp, "tMoveRecordBList");
    }
    public abstract String keepMoveInstBId_ExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select T_MOVE_INST_B_SUB_ID from T_MOVE_INST_B_SUB where ...)} <br>
     * T_MOVE_INST_B_SUB by T_MOVE_INST_B_SUB_ID, named 'TMoveInstBSubAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveInstBSubAsOne</span>(subCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     subCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MoveInstBId_NotExistsReferrer_TMoveInstBSubAsOne for 'not exists'. (NotNull)
     */
    public void notExistsTMoveInstBSubAsOne(SubQuery<TMoveInstBSubCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBSubCB cb = new TMoveInstBSubCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMoveInstBId_NotExistsReferrer_TMoveInstBSubAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "MOVE_INST_B_ID", "T_MOVE_INST_B_SUB_ID", pp, "tMoveInstBSubAsOne");
    }
    public abstract String keepMoveInstBId_NotExistsReferrer_TMoveInstBSubAsOne(TMoveInstBSubCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MOVE_INST_B_ID from T_MOVE_RECORD_B where ...)} <br>
     * T_MOVE_RECORD_B by MOVE_INST_B_ID, named 'TMoveRecordBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveRecordBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MoveInstBId_NotExistsReferrer_TMoveRecordBList for 'not exists'. (NotNull)
     */
    public void notExistsTMoveRecordBList(SubQuery<TMoveRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveRecordBCB cb = new TMoveRecordBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMoveInstBId_NotExistsReferrer_TMoveRecordBList(cb.query());
        registerNotExistsReferrer(cb.query(), "MOVE_INST_B_ID", "MOVE_INST_B_ID", pp, "tMoveRecordBList");
    }
    public abstract String keepMoveInstBId_NotExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq);

    public void xsderiveTMoveRecordBList(String fn, SubQuery<TMoveRecordBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveRecordBCB cb = new TMoveRecordBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMoveInstBId_SpecifyDerivedReferrer_TMoveRecordBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MOVE_INST_B_ID", "MOVE_INST_B_ID", pp, "tMoveRecordBList", al, op);
    }
    public abstract String keepMoveInstBId_SpecifyDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_MOVE_RECORD_B where ...)} <br>
     * T_MOVE_RECORD_B by MOVE_INST_B_ID, named 'TMoveRecordBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTMoveRecordBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TMoveRecordBCB> derivedTMoveRecordBList() {
        return xcreateQDRFunctionTMoveRecordBList();
    }
    protected HpQDRFunction<TMoveRecordBCB> xcreateQDRFunctionTMoveRecordBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTMoveRecordBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTMoveRecordBList(String fn, SubQuery<TMoveRecordBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveRecordBCB cb = new TMoveRecordBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMoveInstBId_QueryDerivedReferrer_TMoveRecordBList(cb.query()); String prpp = keepMoveInstBId_QueryDerivedReferrer_TMoveRecordBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MOVE_INST_B_ID", "MOVE_INST_B_ID", sqpp, "tMoveRecordBList", rd, vl, prpp, op);
    }
    public abstract String keepMoveInstBId_QueryDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq);
    public abstract String keepMoveInstBId_QueryDerivedReferrer_TMoveRecordBListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMoveInstBId_IsNull() { regMoveInstBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMoveInstBId_IsNotNull() { regMoveInstBId(CK_ISNN, DOBJ); }

    protected void regMoveInstBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveInstBId(), "MOVE_INST_B_ID"); }
    protected abstract ConditionValue xgetCValueMoveInstBId();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus}
     * @param moveInstStatus The value of moveInstStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstStatus_Equal(String moveInstStatus) {
        doSetMoveInstStatus_Equal(fRES(moveInstStatus));
    }

    /**
     * Equal(=). As MoveInstStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus} <br>
     * 在庫移動指示ステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstStatus_Equal_AsMoveInstStatus(CDef.MoveInstStatus cdef) {
        doSetMoveInstStatus_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: 未作業
     */
    public void setMoveInstStatus_Equal_$00() {
        setMoveInstStatus_Equal_AsMoveInstStatus(CDef.MoveInstStatus.$00);
    }

    /**
     * Equal(=). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: 作業中
     */
    public void setMoveInstStatus_Equal_$01() {
        setMoveInstStatus_Equal_AsMoveInstStatus(CDef.MoveInstStatus.$01);
    }

    /**
     * Equal(=). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 完了
     */
    public void setMoveInstStatus_Equal_$02() {
        setMoveInstStatus_Equal_AsMoveInstStatus(CDef.MoveInstStatus.$02);
    }

    /**
     * Equal(=). As $99 (99). And OnlyOnceRegistered. <br>
     * $99: 取消
     */
    public void setMoveInstStatus_Equal_$99() {
        setMoveInstStatus_Equal_AsMoveInstStatus(CDef.MoveInstStatus.$99);
    }

    protected void doSetMoveInstStatus_Equal(String moveInstStatus) {
        regMoveInstStatus(CK_EQ, moveInstStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus}
     * @param moveInstStatus The value of moveInstStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstStatus_NotEqual(String moveInstStatus) {
        doSetMoveInstStatus_NotEqual(fRES(moveInstStatus));
    }

    /**
     * NotEqual(&lt;&gt;). As MoveInstStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus} <br>
     * 在庫移動指示ステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstStatus_NotEqual_AsMoveInstStatus(CDef.MoveInstStatus cdef) {
        doSetMoveInstStatus_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: 未作業
     */
    public void setMoveInstStatus_NotEqual_$00() {
        setMoveInstStatus_NotEqual_AsMoveInstStatus(CDef.MoveInstStatus.$00);
    }

    /**
     * NotEqual(&lt;&gt;). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: 作業中
     */
    public void setMoveInstStatus_NotEqual_$01() {
        setMoveInstStatus_NotEqual_AsMoveInstStatus(CDef.MoveInstStatus.$01);
    }

    /**
     * NotEqual(&lt;&gt;). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 完了
     */
    public void setMoveInstStatus_NotEqual_$02() {
        setMoveInstStatus_NotEqual_AsMoveInstStatus(CDef.MoveInstStatus.$02);
    }

    /**
     * NotEqual(&lt;&gt;). As $99 (99). And OnlyOnceRegistered. <br>
     * $99: 取消
     */
    public void setMoveInstStatus_NotEqual_$99() {
        setMoveInstStatus_NotEqual_AsMoveInstStatus(CDef.MoveInstStatus.$99);
    }

    protected void doSetMoveInstStatus_NotEqual(String moveInstStatus) {
        regMoveInstStatus(CK_NES, moveInstStatus);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus}
     * @param moveInstStatusList The collection of moveInstStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstStatus_InScope(Collection<String> moveInstStatusList) {
        doSetMoveInstStatus_InScope(moveInstStatusList);
    }

    /**
     * InScope {in ('a', 'b')}. As MoveInstStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus} <br>
     * 在庫移動指示ステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstStatus_InScope_AsMoveInstStatus(Collection<CDef.MoveInstStatus> cdefList) {
        doSetMoveInstStatus_InScope(cTStrL(cdefList));
    }

    protected void doSetMoveInstStatus_InScope(Collection<String> moveInstStatusList) {
        regINS(CK_INS, cTL(moveInstStatusList), xgetCValueMoveInstStatus(), "MOVE_INST_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus}
     * @param moveInstStatusList The collection of moveInstStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstStatus_NotInScope(Collection<String> moveInstStatusList) {
        doSetMoveInstStatus_NotInScope(moveInstStatusList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MoveInstStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus} <br>
     * 在庫移動指示ステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstStatus_NotInScope_AsMoveInstStatus(Collection<CDef.MoveInstStatus> cdefList) {
        doSetMoveInstStatus_NotInScope(cTStrL(cdefList));
    }

    protected void doSetMoveInstStatus_NotInScope(Collection<String> moveInstStatusList) {
        regINS(CK_NINS, cTL(moveInstStatusList), xgetCValueMoveInstStatus(), "MOVE_INST_STATUS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus}
     */
    public void setMoveInstStatus_IsNull() { regMoveInstStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus}
     */
    public void setMoveInstStatus_IsNullOrEmpty() { regMoveInstStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus}
     */
    public void setMoveInstStatus_IsNotNull() { regMoveInstStatus(CK_ISNN, DOBJ); }

    protected void regMoveInstStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveInstStatus(), "MOVE_INST_STATUS"); }
    protected abstract ConditionValue xgetCValueMoveInstStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @param inoutType The value of inoutType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_Equal(String inoutType) {
        doSetInoutType_Equal(fRES(inoutType));
    }

    /**
     * Equal(=). As InoutType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInoutType_Equal_AsInoutType(CDef.InoutType cdef) {
        doSetInoutType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 入庫
     */
    public void setInoutType_Equal_$0() {
        setInoutType_Equal_AsInoutType(CDef.InoutType.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出庫
     */
    public void setInoutType_Equal_$1() {
        setInoutType_Equal_AsInoutType(CDef.InoutType.$1);
    }

    protected void doSetInoutType_Equal(String inoutType) {
        regInoutType(CK_EQ, inoutType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @param inoutType The value of inoutType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_NotEqual(String inoutType) {
        doSetInoutType_NotEqual(fRES(inoutType));
    }

    /**
     * NotEqual(&lt;&gt;). As InoutType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInoutType_NotEqual_AsInoutType(CDef.InoutType cdef) {
        doSetInoutType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 入庫
     */
    public void setInoutType_NotEqual_$0() {
        setInoutType_NotEqual_AsInoutType(CDef.InoutType.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出庫
     */
    public void setInoutType_NotEqual_$1() {
        setInoutType_NotEqual_AsInoutType(CDef.InoutType.$1);
    }

    protected void doSetInoutType_NotEqual(String inoutType) {
        regInoutType(CK_NES, inoutType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @param inoutTypeList The collection of inoutType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_InScope(Collection<String> inoutTypeList) {
        doSetInoutType_InScope(inoutTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As InoutType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_InScope_AsInoutType(Collection<CDef.InoutType> cdefList) {
        doSetInoutType_InScope(cTStrL(cdefList));
    }

    protected void doSetInoutType_InScope(Collection<String> inoutTypeList) {
        regINS(CK_INS, cTL(inoutTypeList), xgetCValueInoutType(), "INOUT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @param inoutTypeList The collection of inoutType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_NotInScope(Collection<String> inoutTypeList) {
        doSetInoutType_NotInScope(inoutTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InoutType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_NotInScope_AsInoutType(Collection<CDef.InoutType> cdefList) {
        doSetInoutType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInoutType_NotInScope(Collection<String> inoutTypeList) {
        regINS(CK_NINS, cTL(inoutTypeList), xgetCValueInoutType(), "INOUT_TYPE");
    }

    protected void regInoutType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInoutType(), "INOUT_TYPE"); }
    protected abstract ConditionValue xgetCValueInoutType();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @param warehouseCd The value of warehouseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_Equal(String warehouseCd) {
        doSetWarehouseCd_Equal(fRES(warehouseCd));
    }

    protected void doSetWarehouseCd_Equal(String warehouseCd) {
        regWarehouseCd(CK_EQ, warehouseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @param warehouseCd The value of warehouseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_NotEqual(String warehouseCd) {
        doSetWarehouseCd_NotEqual(fRES(warehouseCd));
    }

    protected void doSetWarehouseCd_NotEqual(String warehouseCd) {
        regWarehouseCd(CK_NES, warehouseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @param warehouseCd The value of warehouseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterThan(String warehouseCd) {
        regWarehouseCd(CK_GT, fRES(warehouseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @param warehouseCd The value of warehouseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessThan(String warehouseCd) {
        regWarehouseCd(CK_LT, fRES(warehouseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @param warehouseCd The value of warehouseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterEqual(String warehouseCd) {
        regWarehouseCd(CK_GE, fRES(warehouseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @param warehouseCd The value of warehouseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessEqual(String warehouseCd) {
        regWarehouseCd(CK_LE, fRES(warehouseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @param warehouseCdList The collection of warehouseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_InScope(Collection<String> warehouseCdList) {
        doSetWarehouseCd_InScope(warehouseCdList);
    }

    protected void doSetWarehouseCd_InScope(Collection<String> warehouseCdList) {
        regINS(CK_INS, cTL(warehouseCdList), xgetCValueWarehouseCd(), "WAREHOUSE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @param warehouseCdList The collection of warehouseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_NotInScope(Collection<String> warehouseCdList) {
        doSetWarehouseCd_NotInScope(warehouseCdList);
    }

    protected void doSetWarehouseCd_NotInScope(Collection<String> warehouseCdList) {
        regINS(CK_NINS, cTL(warehouseCdList), xgetCValueWarehouseCd(), "WAREHOUSE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(30)} <br>
     * <pre>e.g. setWarehouseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehouseCd The value of warehouseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehouseCd_LikeSearch(String warehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehouseCd), xgetCValueWarehouseCd(), "WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @param warehouseCd The value of warehouseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehouseCd_NotLikeSearch(String warehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehouseCd), xgetCValueWarehouseCd(), "WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @param warehouseCd The value of warehouseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_PrefixSearch(String warehouseCd) {
        setWarehouseCd_LikeSearch(warehouseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(30)}
     */
    public void setWarehouseCd_IsNull() { regWarehouseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(30)}
     */
    public void setWarehouseCd_IsNullOrEmpty() { regWarehouseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(30)}
     */
    public void setWarehouseCd_IsNotNull() { regWarehouseCd(CK_ISNN, DOBJ); }

    protected void regWarehouseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseCd(), "WAREHOUSE_CD"); }
    protected abstract ConditionValue xgetCValueWarehouseCd();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, varchar(100)}
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
     * PRODUCT_CD: {IX, varchar(100)}
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
     * PRODUCT_CD: {IX, varchar(100)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, varchar(100)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, varchar(100)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, varchar(100)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, varchar(100)}
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
     * PRODUCT_CD: {IX, varchar(100)}
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
     * PRODUCT_CD: {IX, varchar(100)} <br>
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
     * PRODUCT_CD: {IX, varchar(100)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, varchar(100)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, varchar(100)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, varchar(100)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, varchar(100)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

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
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_Equal(String stockTypeCd) {
        doSetStockTypeCd_Equal(fRES(stockTypeCd));
    }

    protected void doSetStockTypeCd_Equal(String stockTypeCd) {
        regStockTypeCd(CK_EQ, stockTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_NotEqual(String stockTypeCd) {
        doSetStockTypeCd_NotEqual(fRES(stockTypeCd));
    }

    protected void doSetStockTypeCd_NotEqual(String stockTypeCd) {
        regStockTypeCd(CK_NES, stockTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_GreaterThan(String stockTypeCd) {
        regStockTypeCd(CK_GT, fRES(stockTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_LessThan(String stockTypeCd) {
        regStockTypeCd(CK_LT, fRES(stockTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_GreaterEqual(String stockTypeCd) {
        regStockTypeCd(CK_GE, fRES(stockTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_LessEqual(String stockTypeCd) {
        regStockTypeCd(CK_LE, fRES(stockTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCdList The collection of stockTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_InScope(Collection<String> stockTypeCdList) {
        doSetStockTypeCd_InScope(stockTypeCdList);
    }

    protected void doSetStockTypeCd_InScope(Collection<String> stockTypeCdList) {
        regINS(CK_INS, cTL(stockTypeCdList), xgetCValueStockTypeCd(), "STOCK_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCdList The collection of stockTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_NotInScope(Collection<String> stockTypeCdList) {
        doSetStockTypeCd_NotInScope(stockTypeCdList);
    }

    protected void doSetStockTypeCd_NotInScope(Collection<String> stockTypeCdList) {
        regINS(CK_NINS, cTL(stockTypeCdList), xgetCValueStockTypeCd(), "STOCK_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)} <br>
     * <pre>e.g. setStockTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stockTypeCd The value of stockTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStockTypeCd_LikeSearch(String stockTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stockTypeCd), xgetCValueStockTypeCd(), "STOCK_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStockTypeCd_NotLikeSearch(String stockTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stockTypeCd), xgetCValueStockTypeCd(), "STOCK_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_PrefixSearch(String stockTypeCd) {
        setStockTypeCd_LikeSearch(stockTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     */
    public void setStockTypeCd_IsNull() { regStockTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     */
    public void setStockTypeCd_IsNullOrEmpty() { regStockTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     */
    public void setStockTypeCd_IsNotNull() { regStockTypeCd(CK_ISNN, DOBJ); }

    protected void regStockTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockTypeCd(), "STOCK_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueStockTypeCd();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {varchar(30)}
     * @param depositCd The value of depositCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_Equal(String depositCd) {
        doSetDepositCd_Equal(fRES(depositCd));
    }

    protected void doSetDepositCd_Equal(String depositCd) {
        regDepositCd(CK_EQ, depositCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {varchar(30)}
     * @param depositCd The value of depositCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_NotEqual(String depositCd) {
        doSetDepositCd_NotEqual(fRES(depositCd));
    }

    protected void doSetDepositCd_NotEqual(String depositCd) {
        regDepositCd(CK_NES, depositCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {varchar(30)}
     * @param depositCd The value of depositCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_GreaterThan(String depositCd) {
        regDepositCd(CK_GT, fRES(depositCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {varchar(30)}
     * @param depositCd The value of depositCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_LessThan(String depositCd) {
        regDepositCd(CK_LT, fRES(depositCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {varchar(30)}
     * @param depositCd The value of depositCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_GreaterEqual(String depositCd) {
        regDepositCd(CK_GE, fRES(depositCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {varchar(30)}
     * @param depositCd The value of depositCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_LessEqual(String depositCd) {
        regDepositCd(CK_LE, fRES(depositCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_CD: {varchar(30)}
     * @param depositCdList The collection of depositCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_InScope(Collection<String> depositCdList) {
        doSetDepositCd_InScope(depositCdList);
    }

    protected void doSetDepositCd_InScope(Collection<String> depositCdList) {
        regINS(CK_INS, cTL(depositCdList), xgetCValueDepositCd(), "DEPOSIT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_CD: {varchar(30)}
     * @param depositCdList The collection of depositCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_NotInScope(Collection<String> depositCdList) {
        doSetDepositCd_NotInScope(depositCdList);
    }

    protected void doSetDepositCd_NotInScope(Collection<String> depositCdList) {
        regINS(CK_NINS, cTL(depositCdList), xgetCValueDepositCd(), "DEPOSIT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPOSIT_CD: {varchar(30)} <br>
     * <pre>e.g. setDepositCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param depositCd The value of depositCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDepositCd_LikeSearch(String depositCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(depositCd), xgetCValueDepositCd(), "DEPOSIT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPOSIT_CD: {varchar(30)}
     * @param depositCd The value of depositCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDepositCd_NotLikeSearch(String depositCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(depositCd), xgetCValueDepositCd(), "DEPOSIT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPOSIT_CD: {varchar(30)}
     * @param depositCd The value of depositCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_PrefixSearch(String depositCd) {
        setDepositCd_LikeSearch(depositCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {varchar(30)}
     */
    public void setDepositCd_IsNull() { regDepositCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {varchar(30)}
     */
    public void setDepositCd_IsNullOrEmpty() { regDepositCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {varchar(30)}
     */
    public void setDepositCd_IsNotNull() { regDepositCd(CK_ISNN, DOBJ); }

    protected void regDepositCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDepositCd(), "DEPOSIT_CD"); }
    protected abstract ConditionValue xgetCValueDepositCd();

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
     * TAXFLG: {NotNull, char(1)}
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
     * TAXFLG: {NotNull, char(1)}
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
     * TAXFLG: {NotNull, char(1)}
     * @param taxflg The value of taxflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_GreaterThan(String taxflg) {
        regTaxflg(CK_GT, fRES(taxflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, char(1)}
     * @param taxflg The value of taxflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_LessThan(String taxflg) {
        regTaxflg(CK_LT, fRES(taxflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, char(1)}
     * @param taxflg The value of taxflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_GreaterEqual(String taxflg) {
        regTaxflg(CK_GE, fRES(taxflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, char(1)}
     * @param taxflg The value of taxflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_LessEqual(String taxflg) {
        regTaxflg(CK_LE, fRES(taxflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAXFLG: {NotNull, char(1)}
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
     * TAXFLG: {NotNull, char(1)}
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
     * TAXFLG: {NotNull, char(1)} <br>
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
     * TAXFLG: {NotNull, char(1)}
     * @param taxflg The value of taxflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTaxflg_NotLikeSearch(String taxflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(taxflg), xgetCValueTaxflg(), "TAXFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAXFLG: {NotNull, char(1)}
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
    public HpSLCFunction<TMoveInstBCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TMoveInstBCB.class);
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
    public HpSLCFunction<TMoveInstBCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TMoveInstBCB.class);
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
    public HpSLCFunction<TMoveInstBCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TMoveInstBCB.class);
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
    public HpSLCFunction<TMoveInstBCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TMoveInstBCB.class);
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
    public HpSLCFunction<TMoveInstBCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TMoveInstBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TMoveInstBCB&gt;() {
     *     public void query(TMoveInstBCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TMoveInstBCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TMoveInstBCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TMoveInstBCQ sq);

    protected TMoveInstBCB xcreateScalarConditionCB() {
        TMoveInstBCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TMoveInstBCB xcreateScalarConditionPartitionByCB() {
        TMoveInstBCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TMoveInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MOVE_INST_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TMoveInstBCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TMoveInstBCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TMoveInstBCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MOVE_INST_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TMoveInstBCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TMoveInstBCQ sq);

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
    protected TMoveInstBCB newMyCB() {
        return new TMoveInstBCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TMoveInstBCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
