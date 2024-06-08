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
 * The abstract condition-query of T_MOVE_INST_B_SUB.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTMoveInstBSubCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTMoveInstBSubCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_MOVE_INST_B_SUB";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_MOVE_INST_B_SUB_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_B}
     * @param tMoveInstBSubId The value of tMoveInstBSubId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTMoveInstBSubId_Equal(Long tMoveInstBSubId) {
        doSetTMoveInstBSubId_Equal(tMoveInstBSubId);
    }

    protected void doSetTMoveInstBSubId_Equal(Long tMoveInstBSubId) {
        regTMoveInstBSubId(CK_EQ, tMoveInstBSubId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_MOVE_INST_B_SUB_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_B}
     * @param tMoveInstBSubId The value of tMoveInstBSubId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTMoveInstBSubId_NotEqual(Long tMoveInstBSubId) {
        doSetTMoveInstBSubId_NotEqual(tMoveInstBSubId);
    }

    protected void doSetTMoveInstBSubId_NotEqual(Long tMoveInstBSubId) {
        regTMoveInstBSubId(CK_NES, tMoveInstBSubId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_MOVE_INST_B_SUB_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_B}
     * @param tMoveInstBSubId The value of tMoveInstBSubId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTMoveInstBSubId_GreaterThan(Long tMoveInstBSubId) {
        regTMoveInstBSubId(CK_GT, tMoveInstBSubId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_MOVE_INST_B_SUB_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_B}
     * @param tMoveInstBSubId The value of tMoveInstBSubId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTMoveInstBSubId_LessThan(Long tMoveInstBSubId) {
        regTMoveInstBSubId(CK_LT, tMoveInstBSubId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_MOVE_INST_B_SUB_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_B}
     * @param tMoveInstBSubId The value of tMoveInstBSubId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTMoveInstBSubId_GreaterEqual(Long tMoveInstBSubId) {
        regTMoveInstBSubId(CK_GE, tMoveInstBSubId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_MOVE_INST_B_SUB_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_B}
     * @param tMoveInstBSubId The value of tMoveInstBSubId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTMoveInstBSubId_LessEqual(Long tMoveInstBSubId) {
        regTMoveInstBSubId(CK_LE, tMoveInstBSubId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * T_MOVE_INST_B_SUB_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_B}
     * @param minNumber The min number of tMoveInstBSubId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tMoveInstBSubId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTMoveInstBSubId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTMoveInstBSubId(), "T_MOVE_INST_B_SUB_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * T_MOVE_INST_B_SUB_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_B}
     * @param tMoveInstBSubIdList The collection of tMoveInstBSubId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTMoveInstBSubId_InScope(Collection<Long> tMoveInstBSubIdList) {
        doSetTMoveInstBSubId_InScope(tMoveInstBSubIdList);
    }

    protected void doSetTMoveInstBSubId_InScope(Collection<Long> tMoveInstBSubIdList) {
        regINS(CK_INS, cTL(tMoveInstBSubIdList), xgetCValueTMoveInstBSubId(), "T_MOVE_INST_B_SUB_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * T_MOVE_INST_B_SUB_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_B}
     * @param tMoveInstBSubIdList The collection of tMoveInstBSubId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTMoveInstBSubId_NotInScope(Collection<Long> tMoveInstBSubIdList) {
        doSetTMoveInstBSubId_NotInScope(tMoveInstBSubIdList);
    }

    protected void doSetTMoveInstBSubId_NotInScope(Collection<Long> tMoveInstBSubIdList) {
        regINS(CK_NINS, cTL(tMoveInstBSubIdList), xgetCValueTMoveInstBSubId(), "T_MOVE_INST_B_SUB_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select T_MOVE_INST_B_SUB_ID from T_MOVE_INST_B where ...)} <br />
     * T_MOVE_INST_B by my T_MOVE_INST_B_SUB_ID, named 'TMoveInstB'.
     * @param subCBLambda The callback for sub-query of TMoveInstB for 'in-scope'. (NotNull)
     */
    public void inScopeTMoveInstB(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTMoveInstBSubId_InScopeRelation_TMoveInstB(cb.query());
        registerInScopeRelation(cb.query(), "T_MOVE_INST_B_SUB_ID", "MOVE_INST_B_ID", pp, "tMoveInstB", false);
    }
    public abstract String keepTMoveInstBSubId_InScopeRelation_TMoveInstB(TMoveInstBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select T_MOVE_INST_B_SUB_ID from T_MOVE_INST_B where ...)} <br />
     * T_MOVE_INST_B by my T_MOVE_INST_B_SUB_ID, named 'TMoveInstB'.
     * @param subCBLambda The callback for sub-query of TMoveInstB for 'not in-scope'. (NotNull)
     */
    public void notInScopeTMoveInstB(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTMoveInstBSubId_NotInScopeRelation_TMoveInstB(cb.query());
        registerInScopeRelation(cb.query(), "T_MOVE_INST_B_SUB_ID", "MOVE_INST_B_ID", pp, "tMoveInstB", true);
    }
    public abstract String keepTMoveInstBSubId_NotInScopeRelation_TMoveInstB(TMoveInstBCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * T_MOVE_INST_B_SUB_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_B}
     */
    public void setTMoveInstBSubId_IsNull() { regTMoveInstBSubId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * T_MOVE_INST_B_SUB_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_B}
     */
    public void setTMoveInstBSubId_IsNotNull() { regTMoveInstBSubId(CK_ISNN, DOBJ); }

    protected void regTMoveInstBSubId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTMoveInstBSubId(), "T_MOVE_INST_B_SUB_ID"); }
    protected abstract ConditionValue xgetCValueTMoveInstBSubId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_MOVE_INST_B_ID: {NotNull, bigint(19)}
     * @param tMoveInstBId The value of tMoveInstBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTMoveInstBId_Equal(Long tMoveInstBId) {
        doSetTMoveInstBId_Equal(tMoveInstBId);
    }

    protected void doSetTMoveInstBId_Equal(Long tMoveInstBId) {
        regTMoveInstBId(CK_EQ, tMoveInstBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_MOVE_INST_B_ID: {NotNull, bigint(19)}
     * @param tMoveInstBId The value of tMoveInstBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTMoveInstBId_NotEqual(Long tMoveInstBId) {
        doSetTMoveInstBId_NotEqual(tMoveInstBId);
    }

    protected void doSetTMoveInstBId_NotEqual(Long tMoveInstBId) {
        regTMoveInstBId(CK_NES, tMoveInstBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_MOVE_INST_B_ID: {NotNull, bigint(19)}
     * @param tMoveInstBId The value of tMoveInstBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTMoveInstBId_GreaterThan(Long tMoveInstBId) {
        regTMoveInstBId(CK_GT, tMoveInstBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_MOVE_INST_B_ID: {NotNull, bigint(19)}
     * @param tMoveInstBId The value of tMoveInstBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTMoveInstBId_LessThan(Long tMoveInstBId) {
        regTMoveInstBId(CK_LT, tMoveInstBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_MOVE_INST_B_ID: {NotNull, bigint(19)}
     * @param tMoveInstBId The value of tMoveInstBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTMoveInstBId_GreaterEqual(Long tMoveInstBId) {
        regTMoveInstBId(CK_GE, tMoveInstBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_MOVE_INST_B_ID: {NotNull, bigint(19)}
     * @param tMoveInstBId The value of tMoveInstBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTMoveInstBId_LessEqual(Long tMoveInstBId) {
        regTMoveInstBId(CK_LE, tMoveInstBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * T_MOVE_INST_B_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of tMoveInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tMoveInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTMoveInstBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTMoveInstBId(), "T_MOVE_INST_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * T_MOVE_INST_B_ID: {NotNull, bigint(19)}
     * @param tMoveInstBIdList The collection of tMoveInstBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTMoveInstBId_InScope(Collection<Long> tMoveInstBIdList) {
        doSetTMoveInstBId_InScope(tMoveInstBIdList);
    }

    protected void doSetTMoveInstBId_InScope(Collection<Long> tMoveInstBIdList) {
        regINS(CK_INS, cTL(tMoveInstBIdList), xgetCValueTMoveInstBId(), "T_MOVE_INST_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * T_MOVE_INST_B_ID: {NotNull, bigint(19)}
     * @param tMoveInstBIdList The collection of tMoveInstBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTMoveInstBId_NotInScope(Collection<Long> tMoveInstBIdList) {
        doSetTMoveInstBId_NotInScope(tMoveInstBIdList);
    }

    protected void doSetTMoveInstBId_NotInScope(Collection<Long> tMoveInstBIdList) {
        regINS(CK_NINS, cTL(tMoveInstBIdList), xgetCValueTMoveInstBId(), "T_MOVE_INST_B_ID");
    }

    protected void regTMoveInstBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTMoveInstBId(), "T_MOVE_INST_B_ID"); }
    protected abstract ConditionValue xgetCValueTMoveInstBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
     * @param trpalletId The value of trpalletId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_Equal(Long trpalletId) {
        doSetTrpalletId_Equal(trpalletId);
    }

    protected void doSetTrpalletId_Equal(Long trpalletId) {
        regTrpalletId(CK_EQ, trpalletId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
     * @param trpalletId The value of trpalletId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_NotEqual(Long trpalletId) {
        doSetTrpalletId_NotEqual(trpalletId);
    }

    protected void doSetTrpalletId_NotEqual(Long trpalletId) {
        regTrpalletId(CK_NES, trpalletId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
     * @param trpalletId The value of trpalletId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_GreaterThan(Long trpalletId) {
        regTrpalletId(CK_GT, trpalletId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
     * @param trpalletId The value of trpalletId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_LessThan(Long trpalletId) {
        regTrpalletId(CK_LT, trpalletId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
     * @param trpalletId The value of trpalletId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_GreaterEqual(Long trpalletId) {
        regTrpalletId(CK_GE, trpalletId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
     * @param trpalletId The value of trpalletId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpalletId_LessEqual(Long trpalletId) {
        regTrpalletId(CK_LE, trpalletId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
     * @param minNumber The min number of trpalletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trpalletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrpalletId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrpalletId(), "TRPALLET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
     * @param trpalletIdList The collection of trpalletId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrpalletId_InScope(Collection<Long> trpalletIdList) {
        doSetTrpalletId_InScope(trpalletIdList);
    }

    protected void doSetTrpalletId_InScope(Collection<Long> trpalletIdList) {
        regINS(CK_INS, cTL(trpalletIdList), xgetCValueTrpalletId(), "TRPALLET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
     * @param trpalletIdList The collection of trpalletId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrpalletId_NotInScope(Collection<Long> trpalletIdList) {
        doSetTrpalletId_NotInScope(trpalletIdList);
    }

    protected void doSetTrpalletId_NotInScope(Collection<Long> trpalletIdList) {
        regINS(CK_NINS, cTL(trpalletIdList), xgetCValueTrpalletId(), "TRPALLET_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
     */
    public void setTrpalletId_IsNull() { regTrpalletId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRPALLET_ID: {bigint(19)}
     */
    public void setTrpalletId_IsNotNull() { regTrpalletId(CK_ISNN, DOBJ); }

    protected void regTrpalletId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrpalletId(), "TRPALLET_ID"); }
    protected abstract ConditionValue xgetCValueTrpalletId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19)}
     * @param trsymbolId The value of trsymbolId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_Equal(Long trsymbolId) {
        doSetTrsymbolId_Equal(trsymbolId);
    }

    protected void doSetTrsymbolId_Equal(Long trsymbolId) {
        regTrsymbolId(CK_EQ, trsymbolId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19)}
     * @param trsymbolId The value of trsymbolId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_NotEqual(Long trsymbolId) {
        doSetTrsymbolId_NotEqual(trsymbolId);
    }

    protected void doSetTrsymbolId_NotEqual(Long trsymbolId) {
        regTrsymbolId(CK_NES, trsymbolId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19)}
     * @param trsymbolId The value of trsymbolId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_GreaterThan(Long trsymbolId) {
        regTrsymbolId(CK_GT, trsymbolId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19)}
     * @param trsymbolId The value of trsymbolId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_LessThan(Long trsymbolId) {
        regTrsymbolId(CK_LT, trsymbolId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19)}
     * @param trsymbolId The value of trsymbolId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_GreaterEqual(Long trsymbolId) {
        regTrsymbolId(CK_GE, trsymbolId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19)}
     * @param trsymbolId The value of trsymbolId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_LessEqual(Long trsymbolId) {
        regTrsymbolId(CK_LE, trsymbolId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19)}
     * @param minNumber The min number of trsymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsymbolId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsymbolId(), "TRSYMBOL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOL_ID: {bigint(19)}
     * @param trsymbolIdList The collection of trsymbolId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymbolId_InScope(Collection<Long> trsymbolIdList) {
        doSetTrsymbolId_InScope(trsymbolIdList);
    }

    protected void doSetTrsymbolId_InScope(Collection<Long> trsymbolIdList) {
        regINS(CK_INS, cTL(trsymbolIdList), xgetCValueTrsymbolId(), "TRSYMBOL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOL_ID: {bigint(19)}
     * @param trsymbolIdList The collection of trsymbolId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymbolId_NotInScope(Collection<Long> trsymbolIdList) {
        doSetTrsymbolId_NotInScope(trsymbolIdList);
    }

    protected void doSetTrsymbolId_NotInScope(Collection<Long> trsymbolIdList) {
        regINS(CK_NINS, cTL(trsymbolIdList), xgetCValueTrsymbolId(), "TRSYMBOL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19)}
     */
    public void setTrsymbolId_IsNull() { regTrsymbolId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {bigint(19)}
     */
    public void setTrsymbolId_IsNotNull() { regTrsymbolId(CK_ISNN, DOBJ); }

    protected void regTrsymbolId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsymbolId(), "TRSYMBOL_ID"); }
    protected abstract ConditionValue xgetCValueTrsymbolId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30)}
     * @param moveInstStatus The value of moveInstStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstStatus_Equal(String moveInstStatus) {
        doSetMoveInstStatus_Equal(fRES(moveInstStatus));
    }

    protected void doSetMoveInstStatus_Equal(String moveInstStatus) {
        regMoveInstStatus(CK_EQ, moveInstStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30)}
     * @param moveInstStatus The value of moveInstStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstStatus_NotEqual(String moveInstStatus) {
        doSetMoveInstStatus_NotEqual(fRES(moveInstStatus));
    }

    protected void doSetMoveInstStatus_NotEqual(String moveInstStatus) {
        regMoveInstStatus(CK_NES, moveInstStatus);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30)}
     * @param moveInstStatus The value of moveInstStatus as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstStatus_GreaterThan(String moveInstStatus) {
        regMoveInstStatus(CK_GT, fRES(moveInstStatus));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30)}
     * @param moveInstStatus The value of moveInstStatus as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstStatus_LessThan(String moveInstStatus) {
        regMoveInstStatus(CK_LT, fRES(moveInstStatus));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30)}
     * @param moveInstStatus The value of moveInstStatus as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstStatus_GreaterEqual(String moveInstStatus) {
        regMoveInstStatus(CK_GE, fRES(moveInstStatus));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30)}
     * @param moveInstStatus The value of moveInstStatus as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstStatus_LessEqual(String moveInstStatus) {
        regMoveInstStatus(CK_LE, fRES(moveInstStatus));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30)}
     * @param moveInstStatusList The collection of moveInstStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstStatus_InScope(Collection<String> moveInstStatusList) {
        doSetMoveInstStatus_InScope(moveInstStatusList);
    }

    protected void doSetMoveInstStatus_InScope(Collection<String> moveInstStatusList) {
        regINS(CK_INS, cTL(moveInstStatusList), xgetCValueMoveInstStatus(), "MOVE_INST_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30)}
     * @param moveInstStatusList The collection of moveInstStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstStatus_NotInScope(Collection<String> moveInstStatusList) {
        doSetMoveInstStatus_NotInScope(moveInstStatusList);
    }

    protected void doSetMoveInstStatus_NotInScope(Collection<String> moveInstStatusList) {
        regINS(CK_NINS, cTL(moveInstStatusList), xgetCValueMoveInstStatus(), "MOVE_INST_STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30)} <br>
     * <pre>e.g. setMoveInstStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param moveInstStatus The value of moveInstStatus as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMoveInstStatus_LikeSearch(String moveInstStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(moveInstStatus), xgetCValueMoveInstStatus(), "MOVE_INST_STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30)}
     * @param moveInstStatus The value of moveInstStatus as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMoveInstStatus_NotLikeSearch(String moveInstStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(moveInstStatus), xgetCValueMoveInstStatus(), "MOVE_INST_STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30)}
     * @param moveInstStatus The value of moveInstStatus as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstStatus_PrefixSearch(String moveInstStatus) {
        setMoveInstStatus_LikeSearch(moveInstStatus, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30)}
     */
    public void setMoveInstStatus_IsNull() { regMoveInstStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30)}
     */
    public void setMoveInstStatus_IsNullOrEmpty() { regMoveInstStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_INST_STATUS: {varchar(30)}
     */
    public void setMoveInstStatus_IsNotNull() { regMoveInstStatus(CK_ISNN, DOBJ); }

    protected void regMoveInstStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveInstStatus(), "MOVE_INST_STATUS"); }
    protected abstract ConditionValue xgetCValueMoveInstStatus();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
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
     * INST_NUM: {decimal(16, 6)}
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
     * INST_NUM: {decimal(16, 6)}
     * @param instNum The value of instNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_GreaterThan(java.math.BigDecimal instNum) {
        regInstNum(CK_GT, instNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
     * @param instNum The value of instNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_LessThan(java.math.BigDecimal instNum) {
        regInstNum(CK_LT, instNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
     * @param instNum The value of instNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_GreaterEqual(java.math.BigDecimal instNum) {
        regInstNum(CK_GE, instNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
     * @param instNum The value of instNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_LessEqual(java.math.BigDecimal instNum) {
        regInstNum(CK_LE, instNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
     * @param minNumber The min number of instNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of instNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInstNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInstNum(), "INST_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
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
     * INST_NUM: {decimal(16, 6)}
     * @param instNumList The collection of instNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstNum_NotInScope(Collection<java.math.BigDecimal> instNumList) {
        doSetInstNum_NotInScope(instNumList);
    }

    protected void doSetInstNum_NotInScope(Collection<java.math.BigDecimal> instNumList) {
        regINS(CK_NINS, cTL(instNumList), xgetCValueInstNum(), "INST_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
     */
    public void setInstNum_IsNull() { regInstNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INST_NUM: {decimal(16, 6)}
     */
    public void setInstNum_IsNotNull() { regInstNum(CK_ISNN, DOBJ); }

    protected void regInstNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstNum(), "INST_NUM"); }
    protected abstract ConditionValue xgetCValueInstNum();

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
    public HpSLCFunction<TMoveInstBSubCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TMoveInstBSubCB.class);
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
    public HpSLCFunction<TMoveInstBSubCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TMoveInstBSubCB.class);
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
    public HpSLCFunction<TMoveInstBSubCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TMoveInstBSubCB.class);
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
    public HpSLCFunction<TMoveInstBSubCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TMoveInstBSubCB.class);
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
    public HpSLCFunction<TMoveInstBSubCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TMoveInstBSubCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TMoveInstBSubCB&gt;() {
     *     public void query(TMoveInstBSubCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TMoveInstBSubCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TMoveInstBSubCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBSubCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TMoveInstBSubCQ sq);

    protected TMoveInstBSubCB xcreateScalarConditionCB() {
        TMoveInstBSubCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TMoveInstBSubCB xcreateScalarConditionPartitionByCB() {
        TMoveInstBSubCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TMoveInstBSubCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBSubCB cb = new TMoveInstBSubCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "T_MOVE_INST_B_SUB_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TMoveInstBSubCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TMoveInstBSubCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TMoveInstBSubCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBSubCB cb = new TMoveInstBSubCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "T_MOVE_INST_B_SUB_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TMoveInstBSubCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TMoveInstBSubCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBSubCB cb = new TMoveInstBSubCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TMoveInstBSubCQ sq);

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
    protected TMoveInstBSubCB newMyCB() {
        return new TMoveInstBSubCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TMoveInstBSubCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
