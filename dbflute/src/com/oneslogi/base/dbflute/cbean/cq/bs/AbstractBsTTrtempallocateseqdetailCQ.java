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
 * The abstract condition-query of T_TRTEMPALLOCATESEQDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrtempallocateseqdetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrtempallocateseqdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRTEMPALLOCATESEQDETAIL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param temporaryAllocDetailId The value of temporaryAllocDetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemporaryAllocDetailId_Equal(Long temporaryAllocDetailId) {
        doSetTemporaryAllocDetailId_Equal(temporaryAllocDetailId);
    }

    protected void doSetTemporaryAllocDetailId_Equal(Long temporaryAllocDetailId) {
        regTemporaryAllocDetailId(CK_EQ, temporaryAllocDetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param temporaryAllocDetailId The value of temporaryAllocDetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemporaryAllocDetailId_NotEqual(Long temporaryAllocDetailId) {
        doSetTemporaryAllocDetailId_NotEqual(temporaryAllocDetailId);
    }

    protected void doSetTemporaryAllocDetailId_NotEqual(Long temporaryAllocDetailId) {
        regTemporaryAllocDetailId(CK_NES, temporaryAllocDetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param temporaryAllocDetailId The value of temporaryAllocDetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemporaryAllocDetailId_GreaterThan(Long temporaryAllocDetailId) {
        regTemporaryAllocDetailId(CK_GT, temporaryAllocDetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param temporaryAllocDetailId The value of temporaryAllocDetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemporaryAllocDetailId_LessThan(Long temporaryAllocDetailId) {
        regTemporaryAllocDetailId(CK_LT, temporaryAllocDetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param temporaryAllocDetailId The value of temporaryAllocDetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemporaryAllocDetailId_GreaterEqual(Long temporaryAllocDetailId) {
        regTemporaryAllocDetailId(CK_GE, temporaryAllocDetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param temporaryAllocDetailId The value of temporaryAllocDetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemporaryAllocDetailId_LessEqual(Long temporaryAllocDetailId) {
        regTemporaryAllocDetailId(CK_LE, temporaryAllocDetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of temporaryAllocDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of temporaryAllocDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTemporaryAllocDetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTemporaryAllocDetailId(), "TEMPORARY_ALLOC_DETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param temporaryAllocDetailIdList The collection of temporaryAllocDetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTemporaryAllocDetailId_InScope(Collection<Long> temporaryAllocDetailIdList) {
        doSetTemporaryAllocDetailId_InScope(temporaryAllocDetailIdList);
    }

    protected void doSetTemporaryAllocDetailId_InScope(Collection<Long> temporaryAllocDetailIdList) {
        regINS(CK_INS, cTL(temporaryAllocDetailIdList), xgetCValueTemporaryAllocDetailId(), "TEMPORARY_ALLOC_DETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param temporaryAllocDetailIdList The collection of temporaryAllocDetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTemporaryAllocDetailId_NotInScope(Collection<Long> temporaryAllocDetailIdList) {
        doSetTemporaryAllocDetailId_NotInScope(temporaryAllocDetailIdList);
    }

    protected void doSetTemporaryAllocDetailId_NotInScope(Collection<Long> temporaryAllocDetailIdList) {
        regINS(CK_NINS, cTL(temporaryAllocDetailIdList), xgetCValueTemporaryAllocDetailId(), "TEMPORARY_ALLOC_DETAIL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTemporaryAllocDetailId_IsNull() { regTemporaryAllocDetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTemporaryAllocDetailId_IsNotNull() { regTemporaryAllocDetailId(CK_ISNN, DOBJ); }

    protected void regTemporaryAllocDetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTemporaryAllocDetailId(), "TEMPORARY_ALLOC_DETAIL_ID"); }
    protected abstract ConditionValue xgetCValueTemporaryAllocDetailId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ}
     * @param temporaryAllocId The value of temporaryAllocId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemporaryAllocId_Equal(Long temporaryAllocId) {
        doSetTemporaryAllocId_Equal(temporaryAllocId);
    }

    protected void doSetTemporaryAllocId_Equal(Long temporaryAllocId) {
        regTemporaryAllocId(CK_EQ, temporaryAllocId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ}
     * @param temporaryAllocId The value of temporaryAllocId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemporaryAllocId_NotEqual(Long temporaryAllocId) {
        doSetTemporaryAllocId_NotEqual(temporaryAllocId);
    }

    protected void doSetTemporaryAllocId_NotEqual(Long temporaryAllocId) {
        regTemporaryAllocId(CK_NES, temporaryAllocId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ}
     * @param temporaryAllocId The value of temporaryAllocId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemporaryAllocId_GreaterThan(Long temporaryAllocId) {
        regTemporaryAllocId(CK_GT, temporaryAllocId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ}
     * @param temporaryAllocId The value of temporaryAllocId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemporaryAllocId_LessThan(Long temporaryAllocId) {
        regTemporaryAllocId(CK_LT, temporaryAllocId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ}
     * @param temporaryAllocId The value of temporaryAllocId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemporaryAllocId_GreaterEqual(Long temporaryAllocId) {
        regTemporaryAllocId(CK_GE, temporaryAllocId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ}
     * @param temporaryAllocId The value of temporaryAllocId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemporaryAllocId_LessEqual(Long temporaryAllocId) {
        regTemporaryAllocId(CK_LE, temporaryAllocId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ}
     * @param minNumber The min number of temporaryAllocId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of temporaryAllocId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTemporaryAllocId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTemporaryAllocId(), "TEMPORARY_ALLOC_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ}
     * @param temporaryAllocIdList The collection of temporaryAllocId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTemporaryAllocId_InScope(Collection<Long> temporaryAllocIdList) {
        doSetTemporaryAllocId_InScope(temporaryAllocIdList);
    }

    protected void doSetTemporaryAllocId_InScope(Collection<Long> temporaryAllocIdList) {
        regINS(CK_INS, cTL(temporaryAllocIdList), xgetCValueTemporaryAllocId(), "TEMPORARY_ALLOC_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ}
     * @param temporaryAllocIdList The collection of temporaryAllocId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTemporaryAllocId_NotInScope(Collection<Long> temporaryAllocIdList) {
        doSetTemporaryAllocId_NotInScope(temporaryAllocIdList);
    }

    protected void doSetTemporaryAllocId_NotInScope(Collection<Long> temporaryAllocIdList) {
        regINS(CK_NINS, cTL(temporaryAllocIdList), xgetCValueTemporaryAllocId(), "TEMPORARY_ALLOC_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TEMPORARY_ALLOC_ID from T_TRTEMPALLOCATESEQ where ...)} <br />
     * T_TRTEMPALLOCATESEQ by my TEMPORARY_ALLOC_ID, named 'TTrtempallocateseq'.
     * @param subCBLambda The callback for sub-query of TTrtempallocateseq for 'in-scope'. (NotNull)
     */
    public void inScopeTTrtempallocateseq(SubQuery<TTrtempallocateseqCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrtempallocateseqCB cb = new TTrtempallocateseqCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTemporaryAllocId_InScopeRelation_TTrtempallocateseq(cb.query());
        registerInScopeRelation(cb.query(), "TEMPORARY_ALLOC_ID", "TEMPORARY_ALLOC_ID", pp, "tTrtempallocateseq", false);
    }
    public abstract String keepTemporaryAllocId_InScopeRelation_TTrtempallocateseq(TTrtempallocateseqCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TEMPORARY_ALLOC_ID from T_TRTEMPALLOCATESEQ where ...)} <br />
     * T_TRTEMPALLOCATESEQ by my TEMPORARY_ALLOC_ID, named 'TTrtempallocateseq'.
     * @param subCBLambda The callback for sub-query of TTrtempallocateseq for 'not in-scope'. (NotNull)
     */
    public void notInScopeTTrtempallocateseq(SubQuery<TTrtempallocateseqCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrtempallocateseqCB cb = new TTrtempallocateseqCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTemporaryAllocId_NotInScopeRelation_TTrtempallocateseq(cb.query());
        registerInScopeRelation(cb.query(), "TEMPORARY_ALLOC_ID", "TEMPORARY_ALLOC_ID", pp, "tTrtempallocateseq", true);
    }
    public abstract String keepTemporaryAllocId_NotInScopeRelation_TTrtempallocateseq(TTrtempallocateseqCQ sq);

    protected void regTemporaryAllocId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTemporaryAllocId(), "TEMPORARY_ALLOC_ID"); }
    protected abstract ConditionValue xgetCValueTemporaryAllocId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCATESEQ: {NotNull, bigint(19)}
     * @param allocateseq The value of allocateseq as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocateseq_Equal(Long allocateseq) {
        doSetAllocateseq_Equal(allocateseq);
    }

    protected void doSetAllocateseq_Equal(Long allocateseq) {
        regAllocateseq(CK_EQ, allocateseq);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCATESEQ: {NotNull, bigint(19)}
     * @param allocateseq The value of allocateseq as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocateseq_NotEqual(Long allocateseq) {
        doSetAllocateseq_NotEqual(allocateseq);
    }

    protected void doSetAllocateseq_NotEqual(Long allocateseq) {
        regAllocateseq(CK_NES, allocateseq);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCATESEQ: {NotNull, bigint(19)}
     * @param allocateseq The value of allocateseq as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocateseq_GreaterThan(Long allocateseq) {
        regAllocateseq(CK_GT, allocateseq);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCATESEQ: {NotNull, bigint(19)}
     * @param allocateseq The value of allocateseq as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocateseq_LessThan(Long allocateseq) {
        regAllocateseq(CK_LT, allocateseq);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCATESEQ: {NotNull, bigint(19)}
     * @param allocateseq The value of allocateseq as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocateseq_GreaterEqual(Long allocateseq) {
        regAllocateseq(CK_GE, allocateseq);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCATESEQ: {NotNull, bigint(19)}
     * @param allocateseq The value of allocateseq as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocateseq_LessEqual(Long allocateseq) {
        regAllocateseq(CK_LE, allocateseq);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOCATESEQ: {NotNull, bigint(19)}
     * @param minNumber The min number of allocateseq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocateseq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocateseq_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocateseq(), "ALLOCATESEQ", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOCATESEQ: {NotNull, bigint(19)}
     * @param allocateseqList The collection of allocateseq as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocateseq_InScope(Collection<Long> allocateseqList) {
        doSetAllocateseq_InScope(allocateseqList);
    }

    protected void doSetAllocateseq_InScope(Collection<Long> allocateseqList) {
        regINS(CK_INS, cTL(allocateseqList), xgetCValueAllocateseq(), "ALLOCATESEQ");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOCATESEQ: {NotNull, bigint(19)}
     * @param allocateseqList The collection of allocateseq as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocateseq_NotInScope(Collection<Long> allocateseqList) {
        doSetAllocateseq_NotInScope(allocateseqList);
    }

    protected void doSetAllocateseq_NotInScope(Collection<Long> allocateseqList) {
        regINS(CK_NINS, cTL(allocateseqList), xgetCValueAllocateseq(), "ALLOCATESEQ");
    }

    protected void regAllocateseq(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocateseq(), "ALLOCATESEQ"); }
    protected abstract ConditionValue xgetCValueAllocateseq();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {NotNull, bigint(19)}
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
     * LOT_ID: {NotNull, bigint(19)}
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
     * LOT_ID: {NotNull, bigint(19)}
     * @param lotId The value of lotId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterThan(Long lotId) {
        regLotId(CK_GT, lotId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @param lotId The value of lotId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessThan(Long lotId) {
        regLotId(CK_LT, lotId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @param lotId The value of lotId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterEqual(Long lotId) {
        regLotId(CK_GE, lotId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @param lotId The value of lotId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessEqual(Long lotId) {
        regLotId(CK_LE, lotId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotId(), "LOT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {NotNull, bigint(19)}
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
     * LOT_ID: {NotNull, bigint(19)}
     * @param lotIdList The collection of lotId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_NotInScope(Collection<Long> lotIdList) {
        doSetLotId_NotInScope(lotIdList);
    }

    protected void doSetLotId_NotInScope(Collection<Long> lotIdList) {
        regINS(CK_NINS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    protected void regLotId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotId(), "LOT_ID"); }
    protected abstract ConditionValue xgetCValueLotId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationId The value of locationId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_Equal(String locationId) {
        doSetLocationId_Equal(fRES(locationId));
    }

    protected void doSetLocationId_Equal(String locationId) {
        regLocationId(CK_EQ, locationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationId The value of locationId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotEqual(String locationId) {
        doSetLocationId_NotEqual(fRES(locationId));
    }

    protected void doSetLocationId_NotEqual(String locationId) {
        regLocationId(CK_NES, locationId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationId The value of locationId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_GreaterThan(String locationId) {
        regLocationId(CK_GT, fRES(locationId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationId The value of locationId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_LessThan(String locationId) {
        regLocationId(CK_LT, fRES(locationId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationId The value of locationId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_GreaterEqual(String locationId) {
        regLocationId(CK_GE, fRES(locationId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationId The value of locationId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_LessEqual(String locationId) {
        regLocationId(CK_LE, fRES(locationId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationIdList The collection of locationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_InScope(Collection<String> locationIdList) {
        doSetLocationId_InScope(locationIdList);
    }

    protected void doSetLocationId_InScope(Collection<String> locationIdList) {
        regINS(CK_INS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationIdList The collection of locationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotInScope(Collection<String> locationIdList) {
        doSetLocationId_NotInScope(locationIdList);
    }

    protected void doSetLocationId_NotInScope(Collection<String> locationIdList) {
        regINS(CK_NINS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)} <br>
     * <pre>e.g. setLocationId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationId The value of locationId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationId_LikeSearch(String locationId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationId), xgetCValueLocationId(), "LOCATION_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationId The value of locationId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationId_NotLikeSearch(String locationId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationId), xgetCValueLocationId(), "LOCATION_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationId The value of locationId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_PrefixSearch(String locationId) {
        setLocationId_LikeSearch(locationId, xcLSOPPre());
    }

    protected void regLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationId(), "LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueLocationId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {NotNull, char(1)}
     * @param listkbn The value of listkbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_Equal(String listkbn) {
        doSetListkbn_Equal(fRES(listkbn));
    }

    protected void doSetListkbn_Equal(String listkbn) {
        regListkbn(CK_EQ, listkbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {NotNull, char(1)}
     * @param listkbn The value of listkbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_NotEqual(String listkbn) {
        doSetListkbn_NotEqual(fRES(listkbn));
    }

    protected void doSetListkbn_NotEqual(String listkbn) {
        regListkbn(CK_NES, listkbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {NotNull, char(1)}
     * @param listkbn The value of listkbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_GreaterThan(String listkbn) {
        regListkbn(CK_GT, fRES(listkbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {NotNull, char(1)}
     * @param listkbn The value of listkbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_LessThan(String listkbn) {
        regListkbn(CK_LT, fRES(listkbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {NotNull, char(1)}
     * @param listkbn The value of listkbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_GreaterEqual(String listkbn) {
        regListkbn(CK_GE, fRES(listkbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {NotNull, char(1)}
     * @param listkbn The value of listkbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_LessEqual(String listkbn) {
        regListkbn(CK_LE, fRES(listkbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LISTKBN: {NotNull, char(1)}
     * @param listkbnList The collection of listkbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_InScope(Collection<String> listkbnList) {
        doSetListkbn_InScope(listkbnList);
    }

    protected void doSetListkbn_InScope(Collection<String> listkbnList) {
        regINS(CK_INS, cTL(listkbnList), xgetCValueListkbn(), "LISTKBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LISTKBN: {NotNull, char(1)}
     * @param listkbnList The collection of listkbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_NotInScope(Collection<String> listkbnList) {
        doSetListkbn_NotInScope(listkbnList);
    }

    protected void doSetListkbn_NotInScope(Collection<String> listkbnList) {
        regINS(CK_NINS, cTL(listkbnList), xgetCValueListkbn(), "LISTKBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LISTKBN: {NotNull, char(1)} <br>
     * <pre>e.g. setListkbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param listkbn The value of listkbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setListkbn_LikeSearch(String listkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(listkbn), xgetCValueListkbn(), "LISTKBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LISTKBN: {NotNull, char(1)}
     * @param listkbn The value of listkbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setListkbn_NotLikeSearch(String listkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(listkbn), xgetCValueListkbn(), "LISTKBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LISTKBN: {NotNull, char(1)}
     * @param listkbn The value of listkbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_PrefixSearch(String listkbn) {
        setListkbn_LikeSearch(listkbn, xcLSOPPre());
    }

    protected void regListkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueListkbn(), "LISTKBN"); }
    protected abstract ConditionValue xgetCValueListkbn();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DETAILLINENO: {NotNull, bigint(19)}
     * @param detaillineno The value of detaillineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDetaillineno_Equal(Long detaillineno) {
        doSetDetaillineno_Equal(detaillineno);
    }

    protected void doSetDetaillineno_Equal(Long detaillineno) {
        regDetaillineno(CK_EQ, detaillineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DETAILLINENO: {NotNull, bigint(19)}
     * @param detaillineno The value of detaillineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDetaillineno_NotEqual(Long detaillineno) {
        doSetDetaillineno_NotEqual(detaillineno);
    }

    protected void doSetDetaillineno_NotEqual(Long detaillineno) {
        regDetaillineno(CK_NES, detaillineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DETAILLINENO: {NotNull, bigint(19)}
     * @param detaillineno The value of detaillineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDetaillineno_GreaterThan(Long detaillineno) {
        regDetaillineno(CK_GT, detaillineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DETAILLINENO: {NotNull, bigint(19)}
     * @param detaillineno The value of detaillineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDetaillineno_LessThan(Long detaillineno) {
        regDetaillineno(CK_LT, detaillineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DETAILLINENO: {NotNull, bigint(19)}
     * @param detaillineno The value of detaillineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDetaillineno_GreaterEqual(Long detaillineno) {
        regDetaillineno(CK_GE, detaillineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DETAILLINENO: {NotNull, bigint(19)}
     * @param detaillineno The value of detaillineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDetaillineno_LessEqual(Long detaillineno) {
        regDetaillineno(CK_LE, detaillineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DETAILLINENO: {NotNull, bigint(19)}
     * @param minNumber The min number of detaillineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of detaillineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDetaillineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDetaillineno(), "DETAILLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DETAILLINENO: {NotNull, bigint(19)}
     * @param detaillinenoList The collection of detaillineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetaillineno_InScope(Collection<Long> detaillinenoList) {
        doSetDetaillineno_InScope(detaillinenoList);
    }

    protected void doSetDetaillineno_InScope(Collection<Long> detaillinenoList) {
        regINS(CK_INS, cTL(detaillinenoList), xgetCValueDetaillineno(), "DETAILLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DETAILLINENO: {NotNull, bigint(19)}
     * @param detaillinenoList The collection of detaillineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetaillineno_NotInScope(Collection<Long> detaillinenoList) {
        doSetDetaillineno_NotInScope(detaillinenoList);
    }

    protected void doSetDetaillineno_NotInScope(Collection<Long> detaillinenoList) {
        regINS(CK_NINS, cTL(detaillinenoList), xgetCValueDetaillineno(), "DETAILLINENO");
    }

    protected void regDetaillineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDetaillineno(), "DETAILLINENO"); }
    protected abstract ConditionValue xgetCValueDetaillineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_Equal(Long palletId) {
        doSetPalletId_Equal(palletId);
    }

    protected void doSetPalletId_Equal(Long palletId) {
        regPalletId(CK_EQ, palletId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_NotEqual(Long palletId) {
        doSetPalletId_NotEqual(palletId);
    }

    protected void doSetPalletId_NotEqual(Long palletId) {
        regPalletId(CK_NES, palletId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_GreaterThan(Long palletId) {
        regPalletId(CK_GT, palletId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_LessThan(Long palletId) {
        regPalletId(CK_LT, palletId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_GreaterEqual(Long palletId) {
        regPalletId(CK_GE, palletId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_LessEqual(Long palletId) {
        regPalletId(CK_LE, palletId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param minNumber The min number of palletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPalletId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePalletId(), "PALLET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletIdList The collection of palletId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_InScope(Collection<Long> palletIdList) {
        doSetPalletId_InScope(palletIdList);
    }

    protected void doSetPalletId_InScope(Collection<Long> palletIdList) {
        regINS(CK_INS, cTL(palletIdList), xgetCValuePalletId(), "PALLET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletIdList The collection of palletId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_NotInScope(Collection<Long> palletIdList) {
        doSetPalletId_NotInScope(palletIdList);
    }

    protected void doSetPalletId_NotInScope(Collection<Long> palletIdList) {
        regINS(CK_NINS, cTL(palletIdList), xgetCValuePalletId(), "PALLET_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     */
    public void setPalletId_IsNull() { regPalletId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     */
    public void setPalletId_IsNotNull() { regPalletId(CK_ISNN, DOBJ); }

    protected void regPalletId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletId(), "PALLET_ID"); }
    protected abstract ConditionValue xgetCValuePalletId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY1: {bigint(19)}
     * @param temppickedqty1 The value of temppickedqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty1_Equal(Long temppickedqty1) {
        doSetTemppickedqty1_Equal(temppickedqty1);
    }

    protected void doSetTemppickedqty1_Equal(Long temppickedqty1) {
        regTemppickedqty1(CK_EQ, temppickedqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY1: {bigint(19)}
     * @param temppickedqty1 The value of temppickedqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty1_NotEqual(Long temppickedqty1) {
        doSetTemppickedqty1_NotEqual(temppickedqty1);
    }

    protected void doSetTemppickedqty1_NotEqual(Long temppickedqty1) {
        regTemppickedqty1(CK_NES, temppickedqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY1: {bigint(19)}
     * @param temppickedqty1 The value of temppickedqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty1_GreaterThan(Long temppickedqty1) {
        regTemppickedqty1(CK_GT, temppickedqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY1: {bigint(19)}
     * @param temppickedqty1 The value of temppickedqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty1_LessThan(Long temppickedqty1) {
        regTemppickedqty1(CK_LT, temppickedqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY1: {bigint(19)}
     * @param temppickedqty1 The value of temppickedqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty1_GreaterEqual(Long temppickedqty1) {
        regTemppickedqty1(CK_GE, temppickedqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY1: {bigint(19)}
     * @param temppickedqty1 The value of temppickedqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty1_LessEqual(Long temppickedqty1) {
        regTemppickedqty1(CK_LE, temppickedqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY1: {bigint(19)}
     * @param minNumber The min number of temppickedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of temppickedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTemppickedqty1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTemppickedqty1(), "TEMPPICKEDQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEMPPICKEDQTY1: {bigint(19)}
     * @param temppickedqty1List The collection of temppickedqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTemppickedqty1_InScope(Collection<Long> temppickedqty1List) {
        doSetTemppickedqty1_InScope(temppickedqty1List);
    }

    protected void doSetTemppickedqty1_InScope(Collection<Long> temppickedqty1List) {
        regINS(CK_INS, cTL(temppickedqty1List), xgetCValueTemppickedqty1(), "TEMPPICKEDQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEMPPICKEDQTY1: {bigint(19)}
     * @param temppickedqty1List The collection of temppickedqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTemppickedqty1_NotInScope(Collection<Long> temppickedqty1List) {
        doSetTemppickedqty1_NotInScope(temppickedqty1List);
    }

    protected void doSetTemppickedqty1_NotInScope(Collection<Long> temppickedqty1List) {
        regINS(CK_NINS, cTL(temppickedqty1List), xgetCValueTemppickedqty1(), "TEMPPICKEDQTY1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY1: {bigint(19)}
     */
    public void setTemppickedqty1_IsNull() { regTemppickedqty1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY1: {bigint(19)}
     */
    public void setTemppickedqty1_IsNotNull() { regTemppickedqty1(CK_ISNN, DOBJ); }

    protected void regTemppickedqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTemppickedqty1(), "TEMPPICKEDQTY1"); }
    protected abstract ConditionValue xgetCValueTemppickedqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY2: {bigint(19)}
     * @param temppickedqty2 The value of temppickedqty2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty2_Equal(Long temppickedqty2) {
        doSetTemppickedqty2_Equal(temppickedqty2);
    }

    protected void doSetTemppickedqty2_Equal(Long temppickedqty2) {
        regTemppickedqty2(CK_EQ, temppickedqty2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY2: {bigint(19)}
     * @param temppickedqty2 The value of temppickedqty2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty2_NotEqual(Long temppickedqty2) {
        doSetTemppickedqty2_NotEqual(temppickedqty2);
    }

    protected void doSetTemppickedqty2_NotEqual(Long temppickedqty2) {
        regTemppickedqty2(CK_NES, temppickedqty2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY2: {bigint(19)}
     * @param temppickedqty2 The value of temppickedqty2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty2_GreaterThan(Long temppickedqty2) {
        regTemppickedqty2(CK_GT, temppickedqty2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY2: {bigint(19)}
     * @param temppickedqty2 The value of temppickedqty2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty2_LessThan(Long temppickedqty2) {
        regTemppickedqty2(CK_LT, temppickedqty2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY2: {bigint(19)}
     * @param temppickedqty2 The value of temppickedqty2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty2_GreaterEqual(Long temppickedqty2) {
        regTemppickedqty2(CK_GE, temppickedqty2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY2: {bigint(19)}
     * @param temppickedqty2 The value of temppickedqty2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty2_LessEqual(Long temppickedqty2) {
        regTemppickedqty2(CK_LE, temppickedqty2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY2: {bigint(19)}
     * @param minNumber The min number of temppickedqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of temppickedqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTemppickedqty2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTemppickedqty2(), "TEMPPICKEDQTY2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEMPPICKEDQTY2: {bigint(19)}
     * @param temppickedqty2List The collection of temppickedqty2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTemppickedqty2_InScope(Collection<Long> temppickedqty2List) {
        doSetTemppickedqty2_InScope(temppickedqty2List);
    }

    protected void doSetTemppickedqty2_InScope(Collection<Long> temppickedqty2List) {
        regINS(CK_INS, cTL(temppickedqty2List), xgetCValueTemppickedqty2(), "TEMPPICKEDQTY2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEMPPICKEDQTY2: {bigint(19)}
     * @param temppickedqty2List The collection of temppickedqty2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTemppickedqty2_NotInScope(Collection<Long> temppickedqty2List) {
        doSetTemppickedqty2_NotInScope(temppickedqty2List);
    }

    protected void doSetTemppickedqty2_NotInScope(Collection<Long> temppickedqty2List) {
        regINS(CK_NINS, cTL(temppickedqty2List), xgetCValueTemppickedqty2(), "TEMPPICKEDQTY2");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY2: {bigint(19)}
     */
    public void setTemppickedqty2_IsNull() { regTemppickedqty2(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY2: {bigint(19)}
     */
    public void setTemppickedqty2_IsNotNull() { regTemppickedqty2(CK_ISNN, DOBJ); }

    protected void regTemppickedqty2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTemppickedqty2(), "TEMPPICKEDQTY2"); }
    protected abstract ConditionValue xgetCValueTemppickedqty2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY3: {bigint(19)}
     * @param temppickedqty3 The value of temppickedqty3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty3_Equal(Long temppickedqty3) {
        doSetTemppickedqty3_Equal(temppickedqty3);
    }

    protected void doSetTemppickedqty3_Equal(Long temppickedqty3) {
        regTemppickedqty3(CK_EQ, temppickedqty3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY3: {bigint(19)}
     * @param temppickedqty3 The value of temppickedqty3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty3_NotEqual(Long temppickedqty3) {
        doSetTemppickedqty3_NotEqual(temppickedqty3);
    }

    protected void doSetTemppickedqty3_NotEqual(Long temppickedqty3) {
        regTemppickedqty3(CK_NES, temppickedqty3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY3: {bigint(19)}
     * @param temppickedqty3 The value of temppickedqty3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty3_GreaterThan(Long temppickedqty3) {
        regTemppickedqty3(CK_GT, temppickedqty3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY3: {bigint(19)}
     * @param temppickedqty3 The value of temppickedqty3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty3_LessThan(Long temppickedqty3) {
        regTemppickedqty3(CK_LT, temppickedqty3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY3: {bigint(19)}
     * @param temppickedqty3 The value of temppickedqty3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty3_GreaterEqual(Long temppickedqty3) {
        regTemppickedqty3(CK_GE, temppickedqty3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY3: {bigint(19)}
     * @param temppickedqty3 The value of temppickedqty3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemppickedqty3_LessEqual(Long temppickedqty3) {
        regTemppickedqty3(CK_LE, temppickedqty3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY3: {bigint(19)}
     * @param minNumber The min number of temppickedqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of temppickedqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTemppickedqty3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTemppickedqty3(), "TEMPPICKEDQTY3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEMPPICKEDQTY3: {bigint(19)}
     * @param temppickedqty3List The collection of temppickedqty3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTemppickedqty3_InScope(Collection<Long> temppickedqty3List) {
        doSetTemppickedqty3_InScope(temppickedqty3List);
    }

    protected void doSetTemppickedqty3_InScope(Collection<Long> temppickedqty3List) {
        regINS(CK_INS, cTL(temppickedqty3List), xgetCValueTemppickedqty3(), "TEMPPICKEDQTY3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEMPPICKEDQTY3: {bigint(19)}
     * @param temppickedqty3List The collection of temppickedqty3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTemppickedqty3_NotInScope(Collection<Long> temppickedqty3List) {
        doSetTemppickedqty3_NotInScope(temppickedqty3List);
    }

    protected void doSetTemppickedqty3_NotInScope(Collection<Long> temppickedqty3List) {
        regINS(CK_NINS, cTL(temppickedqty3List), xgetCValueTemppickedqty3(), "TEMPPICKEDQTY3");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY3: {bigint(19)}
     */
    public void setTemppickedqty3_IsNull() { regTemppickedqty3(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TEMPPICKEDQTY3: {bigint(19)}
     */
    public void setTemppickedqty3_IsNotNull() { regTemppickedqty3(CK_ISNN, DOBJ); }

    protected void regTemppickedqty3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTemppickedqty3(), "TEMPPICKEDQTY3"); }
    protected abstract ConditionValue xgetCValueTemppickedqty3();

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
    public HpSLCFunction<TTrtempallocateseqdetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrtempallocateseqdetailCB.class);
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
    public HpSLCFunction<TTrtempallocateseqdetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrtempallocateseqdetailCB.class);
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
    public HpSLCFunction<TTrtempallocateseqdetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrtempallocateseqdetailCB.class);
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
    public HpSLCFunction<TTrtempallocateseqdetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrtempallocateseqdetailCB.class);
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
    public HpSLCFunction<TTrtempallocateseqdetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrtempallocateseqdetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrtempallocateseqdetailCB&gt;() {
     *     public void query(TTrtempallocateseqdetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrtempallocateseqdetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrtempallocateseqdetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrtempallocateseqdetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrtempallocateseqdetailCQ sq);

    protected TTrtempallocateseqdetailCB xcreateScalarConditionCB() {
        TTrtempallocateseqdetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrtempallocateseqdetailCB xcreateScalarConditionPartitionByCB() {
        TTrtempallocateseqdetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrtempallocateseqdetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrtempallocateseqdetailCB cb = new TTrtempallocateseqdetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TEMPORARY_ALLOC_DETAIL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrtempallocateseqdetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrtempallocateseqdetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrtempallocateseqdetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrtempallocateseqdetailCB cb = new TTrtempallocateseqdetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TEMPORARY_ALLOC_DETAIL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrtempallocateseqdetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrtempallocateseqdetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrtempallocateseqdetailCB cb = new TTrtempallocateseqdetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrtempallocateseqdetailCQ sq);

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
    protected TTrtempallocateseqdetailCB newMyCB() {
        return new TTrtempallocateseqdetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrtempallocateseqdetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
