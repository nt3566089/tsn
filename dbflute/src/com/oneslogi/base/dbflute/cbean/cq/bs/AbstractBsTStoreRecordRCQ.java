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
 * The abstract condition-query of T_STORE_RECORD_R.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTStoreRecordRCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTStoreRecordRCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_STORE_RECORD_R";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H}
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
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H}
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
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H}
     * @param storeRecordHId The value of storeRecordHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordHId_GreaterThan(Long storeRecordHId) {
        regStoreRecordHId(CK_GT, storeRecordHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H}
     * @param storeRecordHId The value of storeRecordHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordHId_LessThan(Long storeRecordHId) {
        regStoreRecordHId(CK_LT, storeRecordHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H}
     * @param storeRecordHId The value of storeRecordHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordHId_GreaterEqual(Long storeRecordHId) {
        regStoreRecordHId(CK_GE, storeRecordHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H}
     * @param storeRecordHId The value of storeRecordHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordHId_LessEqual(Long storeRecordHId) {
        regStoreRecordHId(CK_LE, storeRecordHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H}
     * @param minNumber The min number of storeRecordHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeRecordHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreRecordHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreRecordHId(), "STORE_RECORD_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H}
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
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H}
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
     * {in (select STORE_RECORD_H_ID from T_STORE_RECORD_H where ...)} <br />
     * T_STORE_RECORD_H by my STORE_RECORD_H_ID, named 'TStoreRecordH'.
     * @param subCBLambda The callback for sub-query of TStoreRecordH for 'in-scope'. (NotNull)
     */
    public void inScopeTStoreRecordH(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStoreRecordHId_InScopeRelation_TStoreRecordH(cb.query());
        registerInScopeRelation(cb.query(), "STORE_RECORD_H_ID", "STORE_RECORD_H_ID", pp, "tStoreRecordH", false);
    }
    public abstract String keepStoreRecordHId_InScopeRelation_TStoreRecordH(TStoreRecordHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STORE_RECORD_H_ID from T_STORE_RECORD_H where ...)} <br />
     * T_STORE_RECORD_H by my STORE_RECORD_H_ID, named 'TStoreRecordH'.
     * @param subCBLambda The callback for sub-query of TStoreRecordH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTStoreRecordH(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStoreRecordHId_NotInScopeRelation_TStoreRecordH(cb.query());
        registerInScopeRelation(cb.query(), "STORE_RECORD_H_ID", "STORE_RECORD_H_ID", pp, "tStoreRecordH", true);
    }
    public abstract String keepStoreRecordHId_NotInScopeRelation_TStoreRecordH(TStoreRecordHCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H}
     */
    public void setStoreRecordHId_IsNull() { regStoreRecordHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H}
     */
    public void setStoreRecordHId_IsNotNull() { regStoreRecordHId(CK_ISNN, DOBJ); }

    protected void regStoreRecordHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreRecordHId(), "STORE_RECORD_H_ID"); }
    protected abstract ConditionValue xgetCValueStoreRecordHId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param receiveRecordOutFlg The value of receiveRecordOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRecordOutFlg_Equal(String receiveRecordOutFlg) {
        doSetReceiveRecordOutFlg_Equal(fRES(receiveRecordOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRecordOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetReceiveRecordOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setReceiveRecordOutFlg_Equal_$0() {
        setReceiveRecordOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setReceiveRecordOutFlg_Equal_$1() {
        setReceiveRecordOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetReceiveRecordOutFlg_Equal(String receiveRecordOutFlg) {
        regReceiveRecordOutFlg(CK_EQ, receiveRecordOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param receiveRecordOutFlg The value of receiveRecordOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRecordOutFlg_NotEqual(String receiveRecordOutFlg) {
        doSetReceiveRecordOutFlg_NotEqual(fRES(receiveRecordOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRecordOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetReceiveRecordOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setReceiveRecordOutFlg_NotEqual_$0() {
        setReceiveRecordOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setReceiveRecordOutFlg_NotEqual_$1() {
        setReceiveRecordOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetReceiveRecordOutFlg_NotEqual(String receiveRecordOutFlg) {
        regReceiveRecordOutFlg(CK_NES, receiveRecordOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param receiveRecordOutFlgList The collection of receiveRecordOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRecordOutFlg_InScope(Collection<String> receiveRecordOutFlgList) {
        doSetReceiveRecordOutFlg_InScope(receiveRecordOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRecordOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetReceiveRecordOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetReceiveRecordOutFlg_InScope(Collection<String> receiveRecordOutFlgList) {
        regINS(CK_INS, cTL(receiveRecordOutFlgList), xgetCValueReceiveRecordOutFlg(), "RECEIVE_RECORD_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param receiveRecordOutFlgList The collection of receiveRecordOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRecordOutFlg_NotInScope(Collection<String> receiveRecordOutFlgList) {
        doSetReceiveRecordOutFlg_NotInScope(receiveRecordOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRecordOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetReceiveRecordOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetReceiveRecordOutFlg_NotInScope(Collection<String> receiveRecordOutFlgList) {
        regINS(CK_NINS, cTL(receiveRecordOutFlgList), xgetCValueReceiveRecordOutFlg(), "RECEIVE_RECORD_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setReceiveRecordOutFlg_IsNull() { regReceiveRecordOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setReceiveRecordOutFlg_IsNotNull() { regReceiveRecordOutFlg(CK_ISNN, DOBJ); }

    protected void regReceiveRecordOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveRecordOutFlg(), "RECEIVE_RECORD_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueReceiveRecordOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param receiveRecordOutUserId The value of receiveRecordOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRecordOutUserId_Equal(Long receiveRecordOutUserId) {
        doSetReceiveRecordOutUserId_Equal(receiveRecordOutUserId);
    }

    protected void doSetReceiveRecordOutUserId_Equal(Long receiveRecordOutUserId) {
        regReceiveRecordOutUserId(CK_EQ, receiveRecordOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param receiveRecordOutUserId The value of receiveRecordOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRecordOutUserId_NotEqual(Long receiveRecordOutUserId) {
        doSetReceiveRecordOutUserId_NotEqual(receiveRecordOutUserId);
    }

    protected void doSetReceiveRecordOutUserId_NotEqual(Long receiveRecordOutUserId) {
        regReceiveRecordOutUserId(CK_NES, receiveRecordOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param receiveRecordOutUserId The value of receiveRecordOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRecordOutUserId_GreaterThan(Long receiveRecordOutUserId) {
        regReceiveRecordOutUserId(CK_GT, receiveRecordOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param receiveRecordOutUserId The value of receiveRecordOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRecordOutUserId_LessThan(Long receiveRecordOutUserId) {
        regReceiveRecordOutUserId(CK_LT, receiveRecordOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param receiveRecordOutUserId The value of receiveRecordOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRecordOutUserId_GreaterEqual(Long receiveRecordOutUserId) {
        regReceiveRecordOutUserId(CK_GE, receiveRecordOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param receiveRecordOutUserId The value of receiveRecordOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRecordOutUserId_LessEqual(Long receiveRecordOutUserId) {
        regReceiveRecordOutUserId(CK_LE, receiveRecordOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param minNumber The min number of receiveRecordOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveRecordOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveRecordOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveRecordOutUserId(), "RECEIVE_RECORD_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param receiveRecordOutUserIdList The collection of receiveRecordOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRecordOutUserId_InScope(Collection<Long> receiveRecordOutUserIdList) {
        doSetReceiveRecordOutUserId_InScope(receiveRecordOutUserIdList);
    }

    protected void doSetReceiveRecordOutUserId_InScope(Collection<Long> receiveRecordOutUserIdList) {
        regINS(CK_INS, cTL(receiveRecordOutUserIdList), xgetCValueReceiveRecordOutUserId(), "RECEIVE_RECORD_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param receiveRecordOutUserIdList The collection of receiveRecordOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRecordOutUserId_NotInScope(Collection<Long> receiveRecordOutUserIdList) {
        doSetReceiveRecordOutUserId_NotInScope(receiveRecordOutUserIdList);
    }

    protected void doSetReceiveRecordOutUserId_NotInScope(Collection<Long> receiveRecordOutUserIdList) {
        regINS(CK_NINS, cTL(receiveRecordOutUserIdList), xgetCValueReceiveRecordOutUserId(), "RECEIVE_RECORD_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select RECEIVE_RECORD_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my RECEIVE_RECORD_OUT_USER_ID, named 'BUser'.
     * @param subCBLambda The callback for sub-query of BUser for 'in-scope'. (NotNull)
     */
    public void inScopeBUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReceiveRecordOutUserId_InScopeRelation_BUser(cb.query());
        registerInScopeRelation(cb.query(), "RECEIVE_RECORD_OUT_USER_ID", "USER_ID", pp, "bUser", false);
    }
    public abstract String keepReceiveRecordOutUserId_InScopeRelation_BUser(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select RECEIVE_RECORD_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my RECEIVE_RECORD_OUT_USER_ID, named 'BUser'.
     * @param subCBLambda The callback for sub-query of BUser for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReceiveRecordOutUserId_NotInScopeRelation_BUser(cb.query());
        registerInScopeRelation(cb.query(), "RECEIVE_RECORD_OUT_USER_ID", "USER_ID", pp, "bUser", true);
    }
    public abstract String keepReceiveRecordOutUserId_NotInScopeRelation_BUser(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setReceiveRecordOutUserId_IsNull() { regReceiveRecordOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setReceiveRecordOutUserId_IsNotNull() { regReceiveRecordOutUserId(CK_ISNN, DOBJ); }

    protected void regReceiveRecordOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveRecordOutUserId(), "RECEIVE_RECORD_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueReceiveRecordOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_DT: {datetime2(26, 6)}
     * @param receiveRecordOutDt The value of receiveRecordOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRecordOutDt_Equal(java.sql.Timestamp receiveRecordOutDt) {
        regReceiveRecordOutDt(CK_EQ,  receiveRecordOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_DT: {datetime2(26, 6)}
     * @param receiveRecordOutDt The value of receiveRecordOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRecordOutDt_GreaterThan(java.sql.Timestamp receiveRecordOutDt) {
        regReceiveRecordOutDt(CK_GT,  receiveRecordOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_DT: {datetime2(26, 6)}
     * @param receiveRecordOutDt The value of receiveRecordOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRecordOutDt_LessThan(java.sql.Timestamp receiveRecordOutDt) {
        regReceiveRecordOutDt(CK_LT,  receiveRecordOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_DT: {datetime2(26, 6)}
     * @param receiveRecordOutDt The value of receiveRecordOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRecordOutDt_GreaterEqual(java.sql.Timestamp receiveRecordOutDt) {
        regReceiveRecordOutDt(CK_GE,  receiveRecordOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_DT: {datetime2(26, 6)}
     * @param receiveRecordOutDt The value of receiveRecordOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRecordOutDt_LessEqual(java.sql.Timestamp receiveRecordOutDt) {
        regReceiveRecordOutDt(CK_LE, receiveRecordOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_DT: {datetime2(26, 6)}
     * <pre>e.g. setReceiveRecordOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of receiveRecordOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of receiveRecordOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setReceiveRecordOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueReceiveRecordOutDt(), "RECEIVE_RECORD_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of receiveRecordOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of receiveRecordOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setReceiveRecordOutDt_DateFromTo(Date fromDate, Date toDate) {
        setReceiveRecordOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_DT: {datetime2(26, 6)}
     */
    public void setReceiveRecordOutDt_IsNull() { regReceiveRecordOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_RECORD_OUT_DT: {datetime2(26, 6)}
     */
    public void setReceiveRecordOutDt_IsNotNull() { regReceiveRecordOutDt(CK_ISNN, DOBJ); }

    protected void regReceiveRecordOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveRecordOutDt(), "RECEIVE_RECORD_OUT_DT"); }
    protected abstract ConditionValue xgetCValueReceiveRecordOutDt();

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
    public HpSLCFunction<TStoreRecordRCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TStoreRecordRCB.class);
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
    public HpSLCFunction<TStoreRecordRCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TStoreRecordRCB.class);
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
    public HpSLCFunction<TStoreRecordRCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TStoreRecordRCB.class);
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
    public HpSLCFunction<TStoreRecordRCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TStoreRecordRCB.class);
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
    public HpSLCFunction<TStoreRecordRCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TStoreRecordRCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TStoreRecordRCB&gt;() {
     *     public void query(TStoreRecordRCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TStoreRecordRCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TStoreRecordRCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordRCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TStoreRecordRCQ sq);

    protected TStoreRecordRCB xcreateScalarConditionCB() {
        TStoreRecordRCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TStoreRecordRCB xcreateScalarConditionPartitionByCB() {
        TStoreRecordRCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TStoreRecordRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordRCB cb = new TStoreRecordRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "STORE_RECORD_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TStoreRecordRCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TStoreRecordRCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TStoreRecordRCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordRCB cb = new TStoreRecordRCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "STORE_RECORD_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TStoreRecordRCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TStoreRecordRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordRCB cb = new TStoreRecordRCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TStoreRecordRCQ sq);

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
    protected TStoreRecordRCB newMyCB() {
        return new TStoreRecordRCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TStoreRecordRCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
