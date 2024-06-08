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
 * The abstract condition-query of T_PACKING_R.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTPackingRCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTPackingRCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_PACKING_R";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H}
     * @param packingHId The value of packingHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_Equal(Long packingHId) {
        doSetPackingHId_Equal(packingHId);
    }

    protected void doSetPackingHId_Equal(Long packingHId) {
        regPackingHId(CK_EQ, packingHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H}
     * @param packingHId The value of packingHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_NotEqual(Long packingHId) {
        doSetPackingHId_NotEqual(packingHId);
    }

    protected void doSetPackingHId_NotEqual(Long packingHId) {
        regPackingHId(CK_NES, packingHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H}
     * @param packingHId The value of packingHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_GreaterThan(Long packingHId) {
        regPackingHId(CK_GT, packingHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H}
     * @param packingHId The value of packingHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_LessThan(Long packingHId) {
        regPackingHId(CK_LT, packingHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H}
     * @param packingHId The value of packingHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_GreaterEqual(Long packingHId) {
        regPackingHId(CK_GE, packingHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H}
     * @param packingHId The value of packingHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_LessEqual(Long packingHId) {
        regPackingHId(CK_LE, packingHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H}
     * @param minNumber The min number of packingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackingHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackingHId(), "PACKING_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H}
     * @param packingHIdList The collection of packingHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingHId_InScope(Collection<Long> packingHIdList) {
        doSetPackingHId_InScope(packingHIdList);
    }

    protected void doSetPackingHId_InScope(Collection<Long> packingHIdList) {
        regINS(CK_INS, cTL(packingHIdList), xgetCValuePackingHId(), "PACKING_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H}
     * @param packingHIdList The collection of packingHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingHId_NotInScope(Collection<Long> packingHIdList) {
        doSetPackingHId_NotInScope(packingHIdList);
    }

    protected void doSetPackingHId_NotInScope(Collection<Long> packingHIdList) {
        regINS(CK_NINS, cTL(packingHIdList), xgetCValuePackingHId(), "PACKING_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PACKING_H_ID from T_PACKING_H where ...)} <br />
     * T_PACKING_H by my PACKING_H_ID, named 'TPackingH'.
     * @param subCBLambda The callback for sub-query of TPackingH for 'in-scope'. (NotNull)
     */
    public void inScopeTPackingH(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPackingHId_InScopeRelation_TPackingH(cb.query());
        registerInScopeRelation(cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "tPackingH", false);
    }
    public abstract String keepPackingHId_InScopeRelation_TPackingH(TPackingHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PACKING_H_ID from T_PACKING_H where ...)} <br />
     * T_PACKING_H by my PACKING_H_ID, named 'TPackingH'.
     * @param subCBLambda The callback for sub-query of TPackingH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTPackingH(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPackingHId_NotInScopeRelation_TPackingH(cb.query());
        registerInScopeRelation(cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "tPackingH", true);
    }
    public abstract String keepPackingHId_NotInScopeRelation_TPackingH(TPackingHCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H}
     */
    public void setPackingHId_IsNull() { regPackingHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H}
     */
    public void setPackingHId_IsNotNull() { regPackingHId(CK_ISNN, DOBJ); }

    protected void regPackingHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingHId(), "PACKING_H_ID"); }
    protected abstract ConditionValue xgetCValuePackingHId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param stwOutFlg The value of stwOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStwOutFlg_Equal(String stwOutFlg) {
        doSetStwOutFlg_Equal(fRES(stwOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStwOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetStwOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setStwOutFlg_Equal_$0() {
        setStwOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setStwOutFlg_Equal_$1() {
        setStwOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetStwOutFlg_Equal(String stwOutFlg) {
        regStwOutFlg(CK_EQ, stwOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param stwOutFlg The value of stwOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStwOutFlg_NotEqual(String stwOutFlg) {
        doSetStwOutFlg_NotEqual(fRES(stwOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStwOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetStwOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setStwOutFlg_NotEqual_$0() {
        setStwOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setStwOutFlg_NotEqual_$1() {
        setStwOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetStwOutFlg_NotEqual(String stwOutFlg) {
        regStwOutFlg(CK_NES, stwOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param stwOutFlgList The collection of stwOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStwOutFlg_InScope(Collection<String> stwOutFlgList) {
        doSetStwOutFlg_InScope(stwOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStwOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetStwOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetStwOutFlg_InScope(Collection<String> stwOutFlgList) {
        regINS(CK_INS, cTL(stwOutFlgList), xgetCValueStwOutFlg(), "STW_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param stwOutFlgList The collection of stwOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStwOutFlg_NotInScope(Collection<String> stwOutFlgList) {
        doSetStwOutFlg_NotInScope(stwOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStwOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetStwOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetStwOutFlg_NotInScope(Collection<String> stwOutFlgList) {
        regINS(CK_NINS, cTL(stwOutFlgList), xgetCValueStwOutFlg(), "STW_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setStwOutFlg_IsNull() { regStwOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setStwOutFlg_IsNotNull() { regStwOutFlg(CK_ISNN, DOBJ); }

    protected void regStwOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStwOutFlg(), "STW_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueStwOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param stwOutUserId The value of stwOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStwOutUserId_Equal(Long stwOutUserId) {
        doSetStwOutUserId_Equal(stwOutUserId);
    }

    protected void doSetStwOutUserId_Equal(Long stwOutUserId) {
        regStwOutUserId(CK_EQ, stwOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param stwOutUserId The value of stwOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStwOutUserId_NotEqual(Long stwOutUserId) {
        doSetStwOutUserId_NotEqual(stwOutUserId);
    }

    protected void doSetStwOutUserId_NotEqual(Long stwOutUserId) {
        regStwOutUserId(CK_NES, stwOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param stwOutUserId The value of stwOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStwOutUserId_GreaterThan(Long stwOutUserId) {
        regStwOutUserId(CK_GT, stwOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param stwOutUserId The value of stwOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStwOutUserId_LessThan(Long stwOutUserId) {
        regStwOutUserId(CK_LT, stwOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param stwOutUserId The value of stwOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStwOutUserId_GreaterEqual(Long stwOutUserId) {
        regStwOutUserId(CK_GE, stwOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param stwOutUserId The value of stwOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStwOutUserId_LessEqual(Long stwOutUserId) {
        regStwOutUserId(CK_LE, stwOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param minNumber The min number of stwOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stwOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStwOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStwOutUserId(), "STW_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param stwOutUserIdList The collection of stwOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStwOutUserId_InScope(Collection<Long> stwOutUserIdList) {
        doSetStwOutUserId_InScope(stwOutUserIdList);
    }

    protected void doSetStwOutUserId_InScope(Collection<Long> stwOutUserIdList) {
        regINS(CK_INS, cTL(stwOutUserIdList), xgetCValueStwOutUserId(), "STW_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param stwOutUserIdList The collection of stwOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStwOutUserId_NotInScope(Collection<Long> stwOutUserIdList) {
        doSetStwOutUserId_NotInScope(stwOutUserIdList);
    }

    protected void doSetStwOutUserId_NotInScope(Collection<Long> stwOutUserIdList) {
        regINS(CK_NINS, cTL(stwOutUserIdList), xgetCValueStwOutUserId(), "STW_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STW_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my STW_OUT_USER_ID, named 'BUserByStwOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByStwOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByStwOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStwOutUserId_InScopeRelation_BUserByStwOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "STW_OUT_USER_ID", "USER_ID", pp, "bUserByStwOutUserId", false);
    }
    public abstract String keepStwOutUserId_InScopeRelation_BUserByStwOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STW_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my STW_OUT_USER_ID, named 'BUserByStwOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByStwOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByStwOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStwOutUserId_NotInScopeRelation_BUserByStwOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "STW_OUT_USER_ID", "USER_ID", pp, "bUserByStwOutUserId", true);
    }
    public abstract String keepStwOutUserId_NotInScopeRelation_BUserByStwOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setStwOutUserId_IsNull() { regStwOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setStwOutUserId_IsNotNull() { regStwOutUserId(CK_ISNN, DOBJ); }

    protected void regStwOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStwOutUserId(), "STW_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueStwOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_DT: {datetime2(26, 6)}
     * @param stwOutDt The value of stwOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStwOutDt_Equal(java.sql.Timestamp stwOutDt) {
        regStwOutDt(CK_EQ,  stwOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_DT: {datetime2(26, 6)}
     * @param stwOutDt The value of stwOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStwOutDt_GreaterThan(java.sql.Timestamp stwOutDt) {
        regStwOutDt(CK_GT,  stwOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_DT: {datetime2(26, 6)}
     * @param stwOutDt The value of stwOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStwOutDt_LessThan(java.sql.Timestamp stwOutDt) {
        regStwOutDt(CK_LT,  stwOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_DT: {datetime2(26, 6)}
     * @param stwOutDt The value of stwOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStwOutDt_GreaterEqual(java.sql.Timestamp stwOutDt) {
        regStwOutDt(CK_GE,  stwOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_DT: {datetime2(26, 6)}
     * @param stwOutDt The value of stwOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStwOutDt_LessEqual(java.sql.Timestamp stwOutDt) {
        regStwOutDt(CK_LE, stwOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_DT: {datetime2(26, 6)}
     * <pre>e.g. setStwOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of stwOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of stwOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setStwOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueStwOutDt(), "STW_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STW_OUT_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of stwOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of stwOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setStwOutDt_DateFromTo(Date fromDate, Date toDate) {
        setStwOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STW_OUT_DT: {datetime2(26, 6)}
     */
    public void setStwOutDt_IsNull() { regStwOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STW_OUT_DT: {datetime2(26, 6)}
     */
    public void setStwOutDt_IsNotNull() { regStwOutDt(CK_ISNN, DOBJ); }

    protected void regStwOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStwOutDt(), "STW_OUT_DT"); }
    protected abstract ConditionValue xgetCValueStwOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param tagOutFlg The value of tagOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutFlg_Equal(String tagOutFlg) {
        doSetTagOutFlg_Equal(fRES(tagOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetTagOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setTagOutFlg_Equal_$0() {
        setTagOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setTagOutFlg_Equal_$1() {
        setTagOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetTagOutFlg_Equal(String tagOutFlg) {
        regTagOutFlg(CK_EQ, tagOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param tagOutFlg The value of tagOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutFlg_NotEqual(String tagOutFlg) {
        doSetTagOutFlg_NotEqual(fRES(tagOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetTagOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setTagOutFlg_NotEqual_$0() {
        setTagOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setTagOutFlg_NotEqual_$1() {
        setTagOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetTagOutFlg_NotEqual(String tagOutFlg) {
        regTagOutFlg(CK_NES, tagOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param tagOutFlgList The collection of tagOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutFlg_InScope(Collection<String> tagOutFlgList) {
        doSetTagOutFlg_InScope(tagOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetTagOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetTagOutFlg_InScope(Collection<String> tagOutFlgList) {
        regINS(CK_INS, cTL(tagOutFlgList), xgetCValueTagOutFlg(), "TAG_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param tagOutFlgList The collection of tagOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutFlg_NotInScope(Collection<String> tagOutFlgList) {
        doSetTagOutFlg_NotInScope(tagOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetTagOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTagOutFlg_NotInScope(Collection<String> tagOutFlgList) {
        regINS(CK_NINS, cTL(tagOutFlgList), xgetCValueTagOutFlg(), "TAG_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setTagOutFlg_IsNull() { regTagOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setTagOutFlg_IsNotNull() { regTagOutFlg(CK_ISNN, DOBJ); }

    protected void regTagOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagOutFlg(), "TAG_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueTagOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param tagOutUserId The value of tagOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutUserId_Equal(Long tagOutUserId) {
        doSetTagOutUserId_Equal(tagOutUserId);
    }

    protected void doSetTagOutUserId_Equal(Long tagOutUserId) {
        regTagOutUserId(CK_EQ, tagOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param tagOutUserId The value of tagOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutUserId_NotEqual(Long tagOutUserId) {
        doSetTagOutUserId_NotEqual(tagOutUserId);
    }

    protected void doSetTagOutUserId_NotEqual(Long tagOutUserId) {
        regTagOutUserId(CK_NES, tagOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param tagOutUserId The value of tagOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutUserId_GreaterThan(Long tagOutUserId) {
        regTagOutUserId(CK_GT, tagOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param tagOutUserId The value of tagOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutUserId_LessThan(Long tagOutUserId) {
        regTagOutUserId(CK_LT, tagOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param tagOutUserId The value of tagOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutUserId_GreaterEqual(Long tagOutUserId) {
        regTagOutUserId(CK_GE, tagOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param tagOutUserId The value of tagOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutUserId_LessEqual(Long tagOutUserId) {
        regTagOutUserId(CK_LE, tagOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param minNumber The min number of tagOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tagOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTagOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTagOutUserId(), "TAG_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param tagOutUserIdList The collection of tagOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutUserId_InScope(Collection<Long> tagOutUserIdList) {
        doSetTagOutUserId_InScope(tagOutUserIdList);
    }

    protected void doSetTagOutUserId_InScope(Collection<Long> tagOutUserIdList) {
        regINS(CK_INS, cTL(tagOutUserIdList), xgetCValueTagOutUserId(), "TAG_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param tagOutUserIdList The collection of tagOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutUserId_NotInScope(Collection<Long> tagOutUserIdList) {
        doSetTagOutUserId_NotInScope(tagOutUserIdList);
    }

    protected void doSetTagOutUserId_NotInScope(Collection<Long> tagOutUserIdList) {
        regINS(CK_NINS, cTL(tagOutUserIdList), xgetCValueTagOutUserId(), "TAG_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TAG_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my TAG_OUT_USER_ID, named 'BUserByTagOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByTagOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByTagOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTagOutUserId_InScopeRelation_BUserByTagOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "TAG_OUT_USER_ID", "USER_ID", pp, "bUserByTagOutUserId", false);
    }
    public abstract String keepTagOutUserId_InScopeRelation_BUserByTagOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TAG_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my TAG_OUT_USER_ID, named 'BUserByTagOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByTagOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByTagOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTagOutUserId_NotInScopeRelation_BUserByTagOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "TAG_OUT_USER_ID", "USER_ID", pp, "bUserByTagOutUserId", true);
    }
    public abstract String keepTagOutUserId_NotInScopeRelation_BUserByTagOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setTagOutUserId_IsNull() { regTagOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setTagOutUserId_IsNotNull() { regTagOutUserId(CK_ISNN, DOBJ); }

    protected void regTagOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagOutUserId(), "TAG_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueTagOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {datetime2(26, 6)}
     * @param tagOutDt The value of tagOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutDt_Equal(java.sql.Timestamp tagOutDt) {
        regTagOutDt(CK_EQ,  tagOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {datetime2(26, 6)}
     * @param tagOutDt The value of tagOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutDt_GreaterThan(java.sql.Timestamp tagOutDt) {
        regTagOutDt(CK_GT,  tagOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {datetime2(26, 6)}
     * @param tagOutDt The value of tagOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutDt_LessThan(java.sql.Timestamp tagOutDt) {
        regTagOutDt(CK_LT,  tagOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {datetime2(26, 6)}
     * @param tagOutDt The value of tagOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutDt_GreaterEqual(java.sql.Timestamp tagOutDt) {
        regTagOutDt(CK_GE,  tagOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {datetime2(26, 6)}
     * @param tagOutDt The value of tagOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutDt_LessEqual(java.sql.Timestamp tagOutDt) {
        regTagOutDt(CK_LE, tagOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {datetime2(26, 6)}
     * <pre>e.g. setTagOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of tagOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of tagOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTagOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueTagOutDt(), "TAG_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of tagOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of tagOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setTagOutDt_DateFromTo(Date fromDate, Date toDate) {
        setTagOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {datetime2(26, 6)}
     */
    public void setTagOutDt_IsNull() { regTagOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {datetime2(26, 6)}
     */
    public void setTagOutDt_IsNotNull() { regTagOutDt(CK_ISNN, DOBJ); }

    protected void regTagOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagOutDt(), "TAG_OUT_DT"); }
    protected abstract ConditionValue xgetCValueTagOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_DL_URL: {varchar(255)}
     * @param tagDlUrl The value of tagDlUrl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDlUrl_Equal(String tagDlUrl) {
        doSetTagDlUrl_Equal(fRES(tagDlUrl));
    }

    protected void doSetTagDlUrl_Equal(String tagDlUrl) {
        regTagDlUrl(CK_EQ, tagDlUrl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_DL_URL: {varchar(255)}
     * @param tagDlUrl The value of tagDlUrl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDlUrl_NotEqual(String tagDlUrl) {
        doSetTagDlUrl_NotEqual(fRES(tagDlUrl));
    }

    protected void doSetTagDlUrl_NotEqual(String tagDlUrl) {
        regTagDlUrl(CK_NES, tagDlUrl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_DL_URL: {varchar(255)}
     * @param tagDlUrl The value of tagDlUrl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDlUrl_GreaterThan(String tagDlUrl) {
        regTagDlUrl(CK_GT, fRES(tagDlUrl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_DL_URL: {varchar(255)}
     * @param tagDlUrl The value of tagDlUrl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDlUrl_LessThan(String tagDlUrl) {
        regTagDlUrl(CK_LT, fRES(tagDlUrl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_DL_URL: {varchar(255)}
     * @param tagDlUrl The value of tagDlUrl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDlUrl_GreaterEqual(String tagDlUrl) {
        regTagDlUrl(CK_GE, fRES(tagDlUrl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_DL_URL: {varchar(255)}
     * @param tagDlUrl The value of tagDlUrl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDlUrl_LessEqual(String tagDlUrl) {
        regTagDlUrl(CK_LE, fRES(tagDlUrl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_DL_URL: {varchar(255)}
     * @param tagDlUrlList The collection of tagDlUrl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDlUrl_InScope(Collection<String> tagDlUrlList) {
        doSetTagDlUrl_InScope(tagDlUrlList);
    }

    protected void doSetTagDlUrl_InScope(Collection<String> tagDlUrlList) {
        regINS(CK_INS, cTL(tagDlUrlList), xgetCValueTagDlUrl(), "TAG_DL_URL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_DL_URL: {varchar(255)}
     * @param tagDlUrlList The collection of tagDlUrl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDlUrl_NotInScope(Collection<String> tagDlUrlList) {
        doSetTagDlUrl_NotInScope(tagDlUrlList);
    }

    protected void doSetTagDlUrl_NotInScope(Collection<String> tagDlUrlList) {
        regINS(CK_NINS, cTL(tagDlUrlList), xgetCValueTagDlUrl(), "TAG_DL_URL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_DL_URL: {varchar(255)} <br>
     * <pre>e.g. setTagDlUrl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tagDlUrl The value of tagDlUrl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTagDlUrl_LikeSearch(String tagDlUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tagDlUrl), xgetCValueTagDlUrl(), "TAG_DL_URL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_DL_URL: {varchar(255)}
     * @param tagDlUrl The value of tagDlUrl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTagDlUrl_NotLikeSearch(String tagDlUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tagDlUrl), xgetCValueTagDlUrl(), "TAG_DL_URL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_DL_URL: {varchar(255)}
     * @param tagDlUrl The value of tagDlUrl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDlUrl_PrefixSearch(String tagDlUrl) {
        setTagDlUrl_LikeSearch(tagDlUrl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAG_DL_URL: {varchar(255)}
     */
    public void setTagDlUrl_IsNull() { regTagDlUrl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TAG_DL_URL: {varchar(255)}
     */
    public void setTagDlUrl_IsNullOrEmpty() { regTagDlUrl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAG_DL_URL: {varchar(255)}
     */
    public void setTagDlUrl_IsNotNull() { regTagDlUrl(CK_ISNN, DOBJ); }

    protected void regTagDlUrl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagDlUrl(), "TAG_DL_URL"); }
    protected abstract ConditionValue xgetCValueTagDlUrl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param inspectionOutFlg The value of inspectionOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionOutFlg_Equal(String inspectionOutFlg) {
        doSetInspectionOutFlg_Equal(fRES(inspectionOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetInspectionOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setInspectionOutFlg_Equal_$0() {
        setInspectionOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setInspectionOutFlg_Equal_$1() {
        setInspectionOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetInspectionOutFlg_Equal(String inspectionOutFlg) {
        regInspectionOutFlg(CK_EQ, inspectionOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param inspectionOutFlg The value of inspectionOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionOutFlg_NotEqual(String inspectionOutFlg) {
        doSetInspectionOutFlg_NotEqual(fRES(inspectionOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetInspectionOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setInspectionOutFlg_NotEqual_$0() {
        setInspectionOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setInspectionOutFlg_NotEqual_$1() {
        setInspectionOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetInspectionOutFlg_NotEqual(String inspectionOutFlg) {
        regInspectionOutFlg(CK_NES, inspectionOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param inspectionOutFlgList The collection of inspectionOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionOutFlg_InScope(Collection<String> inspectionOutFlgList) {
        doSetInspectionOutFlg_InScope(inspectionOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetInspectionOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetInspectionOutFlg_InScope(Collection<String> inspectionOutFlgList) {
        regINS(CK_INS, cTL(inspectionOutFlgList), xgetCValueInspectionOutFlg(), "INSPECTION_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param inspectionOutFlgList The collection of inspectionOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionOutFlg_NotInScope(Collection<String> inspectionOutFlgList) {
        doSetInspectionOutFlg_NotInScope(inspectionOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetInspectionOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInspectionOutFlg_NotInScope(Collection<String> inspectionOutFlgList) {
        regINS(CK_NINS, cTL(inspectionOutFlgList), xgetCValueInspectionOutFlg(), "INSPECTION_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setInspectionOutFlg_IsNull() { regInspectionOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setInspectionOutFlg_IsNotNull() { regInspectionOutFlg(CK_ISNN, DOBJ); }

    protected void regInspectionOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectionOutFlg(), "INSPECTION_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueInspectionOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param inspectionOutUserId The value of inspectionOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionOutUserId_Equal(Long inspectionOutUserId) {
        doSetInspectionOutUserId_Equal(inspectionOutUserId);
    }

    protected void doSetInspectionOutUserId_Equal(Long inspectionOutUserId) {
        regInspectionOutUserId(CK_EQ, inspectionOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param inspectionOutUserId The value of inspectionOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionOutUserId_NotEqual(Long inspectionOutUserId) {
        doSetInspectionOutUserId_NotEqual(inspectionOutUserId);
    }

    protected void doSetInspectionOutUserId_NotEqual(Long inspectionOutUserId) {
        regInspectionOutUserId(CK_NES, inspectionOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param inspectionOutUserId The value of inspectionOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionOutUserId_GreaterThan(Long inspectionOutUserId) {
        regInspectionOutUserId(CK_GT, inspectionOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param inspectionOutUserId The value of inspectionOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionOutUserId_LessThan(Long inspectionOutUserId) {
        regInspectionOutUserId(CK_LT, inspectionOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param inspectionOutUserId The value of inspectionOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionOutUserId_GreaterEqual(Long inspectionOutUserId) {
        regInspectionOutUserId(CK_GE, inspectionOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param inspectionOutUserId The value of inspectionOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionOutUserId_LessEqual(Long inspectionOutUserId) {
        regInspectionOutUserId(CK_LE, inspectionOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param minNumber The min number of inspectionOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inspectionOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInspectionOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInspectionOutUserId(), "INSPECTION_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param inspectionOutUserIdList The collection of inspectionOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionOutUserId_InScope(Collection<Long> inspectionOutUserIdList) {
        doSetInspectionOutUserId_InScope(inspectionOutUserIdList);
    }

    protected void doSetInspectionOutUserId_InScope(Collection<Long> inspectionOutUserIdList) {
        regINS(CK_INS, cTL(inspectionOutUserIdList), xgetCValueInspectionOutUserId(), "INSPECTION_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param inspectionOutUserIdList The collection of inspectionOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionOutUserId_NotInScope(Collection<Long> inspectionOutUserIdList) {
        doSetInspectionOutUserId_NotInScope(inspectionOutUserIdList);
    }

    protected void doSetInspectionOutUserId_NotInScope(Collection<Long> inspectionOutUserIdList) {
        regINS(CK_NINS, cTL(inspectionOutUserIdList), xgetCValueInspectionOutUserId(), "INSPECTION_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select INSPECTION_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my INSPECTION_OUT_USER_ID, named 'BUserByInspectionOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByInspectionOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByInspectionOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInspectionOutUserId_InScopeRelation_BUserByInspectionOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "INSPECTION_OUT_USER_ID", "USER_ID", pp, "bUserByInspectionOutUserId", false);
    }
    public abstract String keepInspectionOutUserId_InScopeRelation_BUserByInspectionOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select INSPECTION_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my INSPECTION_OUT_USER_ID, named 'BUserByInspectionOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByInspectionOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByInspectionOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInspectionOutUserId_NotInScopeRelation_BUserByInspectionOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "INSPECTION_OUT_USER_ID", "USER_ID", pp, "bUserByInspectionOutUserId", true);
    }
    public abstract String keepInspectionOutUserId_NotInScopeRelation_BUserByInspectionOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setInspectionOutUserId_IsNull() { regInspectionOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setInspectionOutUserId_IsNotNull() { regInspectionOutUserId(CK_ISNN, DOBJ); }

    protected void regInspectionOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectionOutUserId(), "INSPECTION_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueInspectionOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_DT: {datetime2(26, 6)}
     * @param inspectionOutDt The value of inspectionOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionOutDt_Equal(java.sql.Timestamp inspectionOutDt) {
        regInspectionOutDt(CK_EQ,  inspectionOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_DT: {datetime2(26, 6)}
     * @param inspectionOutDt The value of inspectionOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionOutDt_GreaterThan(java.sql.Timestamp inspectionOutDt) {
        regInspectionOutDt(CK_GT,  inspectionOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_DT: {datetime2(26, 6)}
     * @param inspectionOutDt The value of inspectionOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionOutDt_LessThan(java.sql.Timestamp inspectionOutDt) {
        regInspectionOutDt(CK_LT,  inspectionOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_DT: {datetime2(26, 6)}
     * @param inspectionOutDt The value of inspectionOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionOutDt_GreaterEqual(java.sql.Timestamp inspectionOutDt) {
        regInspectionOutDt(CK_GE,  inspectionOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_DT: {datetime2(26, 6)}
     * @param inspectionOutDt The value of inspectionOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionOutDt_LessEqual(java.sql.Timestamp inspectionOutDt) {
        regInspectionOutDt(CK_LE, inspectionOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_DT: {datetime2(26, 6)}
     * <pre>e.g. setInspectionOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of inspectionOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of inspectionOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setInspectionOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueInspectionOutDt(), "INSPECTION_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_OUT_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of inspectionOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of inspectionOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setInspectionOutDt_DateFromTo(Date fromDate, Date toDate) {
        setInspectionOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSPECTION_OUT_DT: {datetime2(26, 6)}
     */
    public void setInspectionOutDt_IsNull() { regInspectionOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSPECTION_OUT_DT: {datetime2(26, 6)}
     */
    public void setInspectionOutDt_IsNotNull() { regInspectionOutDt(CK_ISNN, DOBJ); }

    protected void regInspectionOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectionOutDt(), "INSPECTION_OUT_DT"); }
    protected abstract ConditionValue xgetCValueInspectionOutDt();

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
    public HpSLCFunction<TPackingRCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TPackingRCB.class);
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
    public HpSLCFunction<TPackingRCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TPackingRCB.class);
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
    public HpSLCFunction<TPackingRCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TPackingRCB.class);
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
    public HpSLCFunction<TPackingRCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TPackingRCB.class);
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
    public HpSLCFunction<TPackingRCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TPackingRCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TPackingRCB&gt;() {
     *     public void query(TPackingRCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPackingRCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TPackingRCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingRCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TPackingRCQ sq);

    protected TPackingRCB xcreateScalarConditionCB() {
        TPackingRCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TPackingRCB xcreateScalarConditionPartitionByCB() {
        TPackingRCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TPackingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingRCB cb = new TPackingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PACKING_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TPackingRCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TPackingRCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TPackingRCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingRCB cb = new TPackingRCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PACKING_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TPackingRCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TPackingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingRCB cb = new TPackingRCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TPackingRCQ sq);

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
    protected TPackingRCB newMyCB() {
        return new TPackingRCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TPackingRCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
