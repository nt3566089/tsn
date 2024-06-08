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
 * The abstract condition-query of T_MOVE_INST_R.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTMoveInstRCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTMoveInstRCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_MOVE_INST_R";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_H}
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
     * MOVE_INST_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_H}
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
     * MOVE_INST_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_H}
     * @param moveInstHId The value of moveInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_GreaterThan(Long moveInstHId) {
        regMoveInstHId(CK_GT, moveInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_H}
     * @param moveInstHId The value of moveInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_LessThan(Long moveInstHId) {
        regMoveInstHId(CK_LT, moveInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_H}
     * @param moveInstHId The value of moveInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_GreaterEqual(Long moveInstHId) {
        regMoveInstHId(CK_GE, moveInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_H}
     * @param moveInstHId The value of moveInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_LessEqual(Long moveInstHId) {
        regMoveInstHId(CK_LE, moveInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_H}
     * @param minNumber The min number of moveInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveInstHId(), "MOVE_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_INST_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_H}
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
     * MOVE_INST_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_H}
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
     * MOVE_INST_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_H}
     */
    public void setMoveInstHId_IsNull() { regMoveInstHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_H}
     */
    public void setMoveInstHId_IsNotNull() { regMoveInstHId(CK_ISNN, DOBJ); }

    protected void regMoveInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveInstHId(), "MOVE_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueMoveInstHId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param instOutFlg The value of instOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstOutFlg_Equal(String instOutFlg) {
        doSetInstOutFlg_Equal(fRES(instOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInstOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetInstOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setInstOutFlg_Equal_$0() {
        setInstOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setInstOutFlg_Equal_$1() {
        setInstOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetInstOutFlg_Equal(String instOutFlg) {
        regInstOutFlg(CK_EQ, instOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param instOutFlg The value of instOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstOutFlg_NotEqual(String instOutFlg) {
        doSetInstOutFlg_NotEqual(fRES(instOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInstOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetInstOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setInstOutFlg_NotEqual_$0() {
        setInstOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setInstOutFlg_NotEqual_$1() {
        setInstOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetInstOutFlg_NotEqual(String instOutFlg) {
        regInstOutFlg(CK_NES, instOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INST_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param instOutFlgList The collection of instOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstOutFlg_InScope(Collection<String> instOutFlgList) {
        doSetInstOutFlg_InScope(instOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INST_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetInstOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetInstOutFlg_InScope(Collection<String> instOutFlgList) {
        regINS(CK_INS, cTL(instOutFlgList), xgetCValueInstOutFlg(), "INST_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INST_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param instOutFlgList The collection of instOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstOutFlg_NotInScope(Collection<String> instOutFlgList) {
        doSetInstOutFlg_NotInScope(instOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INST_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetInstOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInstOutFlg_NotInScope(Collection<String> instOutFlgList) {
        regINS(CK_NINS, cTL(instOutFlgList), xgetCValueInstOutFlg(), "INST_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INST_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setInstOutFlg_IsNull() { regInstOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INST_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setInstOutFlg_IsNotNull() { regInstOutFlg(CK_ISNN, DOBJ); }

    protected void regInstOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstOutFlg(), "INST_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueInstOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param instOutUserId The value of instOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstOutUserId_Equal(Long instOutUserId) {
        doSetInstOutUserId_Equal(instOutUserId);
    }

    protected void doSetInstOutUserId_Equal(Long instOutUserId) {
        regInstOutUserId(CK_EQ, instOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param instOutUserId The value of instOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstOutUserId_NotEqual(Long instOutUserId) {
        doSetInstOutUserId_NotEqual(instOutUserId);
    }

    protected void doSetInstOutUserId_NotEqual(Long instOutUserId) {
        regInstOutUserId(CK_NES, instOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param instOutUserId The value of instOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstOutUserId_GreaterThan(Long instOutUserId) {
        regInstOutUserId(CK_GT, instOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param instOutUserId The value of instOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstOutUserId_LessThan(Long instOutUserId) {
        regInstOutUserId(CK_LT, instOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param instOutUserId The value of instOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstOutUserId_GreaterEqual(Long instOutUserId) {
        regInstOutUserId(CK_GE, instOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param instOutUserId The value of instOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstOutUserId_LessEqual(Long instOutUserId) {
        regInstOutUserId(CK_LE, instOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param minNumber The min number of instOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of instOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInstOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInstOutUserId(), "INST_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INST_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param instOutUserIdList The collection of instOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstOutUserId_InScope(Collection<Long> instOutUserIdList) {
        doSetInstOutUserId_InScope(instOutUserIdList);
    }

    protected void doSetInstOutUserId_InScope(Collection<Long> instOutUserIdList) {
        regINS(CK_INS, cTL(instOutUserIdList), xgetCValueInstOutUserId(), "INST_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INST_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param instOutUserIdList The collection of instOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstOutUserId_NotInScope(Collection<Long> instOutUserIdList) {
        doSetInstOutUserId_NotInScope(instOutUserIdList);
    }

    protected void doSetInstOutUserId_NotInScope(Collection<Long> instOutUserIdList) {
        regINS(CK_NINS, cTL(instOutUserIdList), xgetCValueInstOutUserId(), "INST_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select INST_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my INST_OUT_USER_ID, named 'BUser'.
     * @param subCBLambda The callback for sub-query of BUser for 'in-scope'. (NotNull)
     */
    public void inScopeBUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInstOutUserId_InScopeRelation_BUser(cb.query());
        registerInScopeRelation(cb.query(), "INST_OUT_USER_ID", "USER_ID", pp, "bUser", false);
    }
    public abstract String keepInstOutUserId_InScopeRelation_BUser(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select INST_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my INST_OUT_USER_ID, named 'BUser'.
     * @param subCBLambda The callback for sub-query of BUser for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInstOutUserId_NotInScopeRelation_BUser(cb.query());
        registerInScopeRelation(cb.query(), "INST_OUT_USER_ID", "USER_ID", pp, "bUser", true);
    }
    public abstract String keepInstOutUserId_NotInScopeRelation_BUser(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INST_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setInstOutUserId_IsNull() { regInstOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INST_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setInstOutUserId_IsNotNull() { regInstOutUserId(CK_ISNN, DOBJ); }

    protected void regInstOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstOutUserId(), "INST_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueInstOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_DT: {datetime2(26, 6)}
     * @param instOutDt The value of instOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstOutDt_Equal(java.sql.Timestamp instOutDt) {
        regInstOutDt(CK_EQ,  instOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_DT: {datetime2(26, 6)}
     * @param instOutDt The value of instOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstOutDt_GreaterThan(java.sql.Timestamp instOutDt) {
        regInstOutDt(CK_GT,  instOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_DT: {datetime2(26, 6)}
     * @param instOutDt The value of instOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstOutDt_LessThan(java.sql.Timestamp instOutDt) {
        regInstOutDt(CK_LT,  instOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_DT: {datetime2(26, 6)}
     * @param instOutDt The value of instOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstOutDt_GreaterEqual(java.sql.Timestamp instOutDt) {
        regInstOutDt(CK_GE,  instOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_DT: {datetime2(26, 6)}
     * @param instOutDt The value of instOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstOutDt_LessEqual(java.sql.Timestamp instOutDt) {
        regInstOutDt(CK_LE, instOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_DT: {datetime2(26, 6)}
     * <pre>e.g. setInstOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of instOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of instOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setInstOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueInstOutDt(), "INST_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INST_OUT_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of instOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of instOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setInstOutDt_DateFromTo(Date fromDate, Date toDate) {
        setInstOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INST_OUT_DT: {datetime2(26, 6)}
     */
    public void setInstOutDt_IsNull() { regInstOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INST_OUT_DT: {datetime2(26, 6)}
     */
    public void setInstOutDt_IsNotNull() { regInstOutDt(CK_ISNN, DOBJ); }

    protected void regInstOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstOutDt(), "INST_OUT_DT"); }
    protected abstract ConditionValue xgetCValueInstOutDt();

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
    public HpSLCFunction<TMoveInstRCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TMoveInstRCB.class);
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
    public HpSLCFunction<TMoveInstRCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TMoveInstRCB.class);
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
    public HpSLCFunction<TMoveInstRCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TMoveInstRCB.class);
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
    public HpSLCFunction<TMoveInstRCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TMoveInstRCB.class);
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
    public HpSLCFunction<TMoveInstRCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TMoveInstRCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TMoveInstRCB&gt;() {
     *     public void query(TMoveInstRCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TMoveInstRCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TMoveInstRCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstRCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TMoveInstRCQ sq);

    protected TMoveInstRCB xcreateScalarConditionCB() {
        TMoveInstRCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TMoveInstRCB xcreateScalarConditionPartitionByCB() {
        TMoveInstRCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TMoveInstRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstRCB cb = new TMoveInstRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MOVE_INST_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TMoveInstRCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TMoveInstRCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TMoveInstRCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstRCB cb = new TMoveInstRCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MOVE_INST_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TMoveInstRCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TMoveInstRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstRCB cb = new TMoveInstRCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TMoveInstRCQ sq);

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
    protected TMoveInstRCB newMyCB() {
        return new TMoveInstRCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TMoveInstRCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
