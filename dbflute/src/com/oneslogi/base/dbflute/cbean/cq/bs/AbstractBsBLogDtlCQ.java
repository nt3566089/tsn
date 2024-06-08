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
 * The abstract condition-query of B_LOG_DTL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBLogDtlCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBLogDtlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_LOG_DTL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param logDtlId The value of logDtlId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogDtlId_Equal(Long logDtlId) {
        doSetLogDtlId_Equal(logDtlId);
    }

    protected void doSetLogDtlId_Equal(Long logDtlId) {
        regLogDtlId(CK_EQ, logDtlId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param logDtlId The value of logDtlId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogDtlId_NotEqual(Long logDtlId) {
        doSetLogDtlId_NotEqual(logDtlId);
    }

    protected void doSetLogDtlId_NotEqual(Long logDtlId) {
        regLogDtlId(CK_NES, logDtlId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param logDtlId The value of logDtlId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogDtlId_GreaterThan(Long logDtlId) {
        regLogDtlId(CK_GT, logDtlId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param logDtlId The value of logDtlId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogDtlId_LessThan(Long logDtlId) {
        regLogDtlId(CK_LT, logDtlId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param logDtlId The value of logDtlId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogDtlId_GreaterEqual(Long logDtlId) {
        regLogDtlId(CK_GE, logDtlId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param logDtlId The value of logDtlId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogDtlId_LessEqual(Long logDtlId) {
        regLogDtlId(CK_LE, logDtlId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of logDtlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of logDtlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLogDtlId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLogDtlId(), "LOG_DTL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param logDtlIdList The collection of logDtlId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlId_InScope(Collection<Long> logDtlIdList) {
        doSetLogDtlId_InScope(logDtlIdList);
    }

    protected void doSetLogDtlId_InScope(Collection<Long> logDtlIdList) {
        regINS(CK_INS, cTL(logDtlIdList), xgetCValueLogDtlId(), "LOG_DTL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param logDtlIdList The collection of logDtlId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlId_NotInScope(Collection<Long> logDtlIdList) {
        doSetLogDtlId_NotInScope(logDtlIdList);
    }

    protected void doSetLogDtlId_NotInScope(Collection<Long> logDtlIdList) {
        regINS(CK_NINS, cTL(logDtlIdList), xgetCValueLogDtlId(), "LOG_DTL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setLogDtlId_IsNull() { regLogDtlId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setLogDtlId_IsNotNull() { regLogDtlId(CK_ISNN, DOBJ); }

    protected void regLogDtlId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogDtlId(), "LOG_DTL_ID"); }
    protected abstract ConditionValue xgetCValueLogDtlId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG}
     * @param logId The value of logId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogId_Equal(Long logId) {
        doSetLogId_Equal(logId);
    }

    protected void doSetLogId_Equal(Long logId) {
        regLogId(CK_EQ, logId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG}
     * @param logId The value of logId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogId_NotEqual(Long logId) {
        doSetLogId_NotEqual(logId);
    }

    protected void doSetLogId_NotEqual(Long logId) {
        regLogId(CK_NES, logId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG}
     * @param logId The value of logId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogId_GreaterThan(Long logId) {
        regLogId(CK_GT, logId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG}
     * @param logId The value of logId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogId_LessThan(Long logId) {
        regLogId(CK_LT, logId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG}
     * @param logId The value of logId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogId_GreaterEqual(Long logId) {
        regLogId(CK_GE, logId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG}
     * @param logId The value of logId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogId_LessEqual(Long logId) {
        regLogId(CK_LE, logId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG}
     * @param minNumber The min number of logId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of logId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLogId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLogId(), "LOG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG}
     * @param logIdList The collection of logId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogId_InScope(Collection<Long> logIdList) {
        doSetLogId_InScope(logIdList);
    }

    protected void doSetLogId_InScope(Collection<Long> logIdList) {
        regINS(CK_INS, cTL(logIdList), xgetCValueLogId(), "LOG_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG}
     * @param logIdList The collection of logId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogId_NotInScope(Collection<Long> logIdList) {
        doSetLogId_NotInScope(logIdList);
    }

    protected void doSetLogId_NotInScope(Collection<Long> logIdList) {
        regINS(CK_NINS, cTL(logIdList), xgetCValueLogId(), "LOG_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LOG_ID from B_LOG where ...)} <br />
     * B_LOG by my LOG_ID, named 'BLog'.
     * @param subCBLambda The callback for sub-query of BLog for 'in-scope'. (NotNull)
     */
    public void inScopeBLog(SubQuery<BLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BLogCB cb = new BLogCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLogId_InScopeRelation_BLog(cb.query());
        registerInScopeRelation(cb.query(), "LOG_ID", "LOG_ID", pp, "bLog", false);
    }
    public abstract String keepLogId_InScopeRelation_BLog(BLogCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LOG_ID from B_LOG where ...)} <br />
     * B_LOG by my LOG_ID, named 'BLog'.
     * @param subCBLambda The callback for sub-query of BLog for 'not in-scope'. (NotNull)
     */
    public void notInScopeBLog(SubQuery<BLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BLogCB cb = new BLogCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLogId_NotInScopeRelation_BLog(cb.query());
        registerInScopeRelation(cb.query(), "LOG_ID", "LOG_ID", pp, "bLog", true);
    }
    public abstract String keepLogId_NotInScopeRelation_BLog(BLogCQ sq);

    protected void regLogId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogId(), "LOG_ID"); }
    protected abstract ConditionValue xgetCValueLogId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType}
     * @param logDtlType The value of logDtlType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlType_Equal(String logDtlType) {
        doSetLogDtlType_Equal(fRES(logDtlType));
    }

    /**
     * Equal(=). As LogDtlType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType} <br>
     * ログ明細種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLogDtlType_Equal_AsLogDtlType(CDef.LogDtlType cdef) {
        doSetLogDtlType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: セクション開始ログ
     */
    public void setLogDtlType_Equal_$1() {
        setLogDtlType_Equal_AsLogDtlType(CDef.LogDtlType.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: セクション終了ログ
     */
    public void setLogDtlType_Equal_$2() {
        setLogDtlType_Equal_AsLogDtlType(CDef.LogDtlType.$2);
    }

    /**
     * Equal(=). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: 明細ログ
     */
    public void setLogDtlType_Equal_$3() {
        setLogDtlType_Equal_AsLogDtlType(CDef.LogDtlType.$3);
    }

    /**
     * Equal(=). As $4 (4). And OnlyOnceRegistered. <br>
     * $4: 基盤出力ログ
     */
    public void setLogDtlType_Equal_$4() {
        setLogDtlType_Equal_AsLogDtlType(CDef.LogDtlType.$4);
    }

    protected void doSetLogDtlType_Equal(String logDtlType) {
        regLogDtlType(CK_EQ, logDtlType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType}
     * @param logDtlType The value of logDtlType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlType_NotEqual(String logDtlType) {
        doSetLogDtlType_NotEqual(fRES(logDtlType));
    }

    /**
     * NotEqual(&lt;&gt;). As LogDtlType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType} <br>
     * ログ明細種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLogDtlType_NotEqual_AsLogDtlType(CDef.LogDtlType cdef) {
        doSetLogDtlType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: セクション開始ログ
     */
    public void setLogDtlType_NotEqual_$1() {
        setLogDtlType_NotEqual_AsLogDtlType(CDef.LogDtlType.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: セクション終了ログ
     */
    public void setLogDtlType_NotEqual_$2() {
        setLogDtlType_NotEqual_AsLogDtlType(CDef.LogDtlType.$2);
    }

    /**
     * NotEqual(&lt;&gt;). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: 明細ログ
     */
    public void setLogDtlType_NotEqual_$3() {
        setLogDtlType_NotEqual_AsLogDtlType(CDef.LogDtlType.$3);
    }

    /**
     * NotEqual(&lt;&gt;). As $4 (4). And OnlyOnceRegistered. <br>
     * $4: 基盤出力ログ
     */
    public void setLogDtlType_NotEqual_$4() {
        setLogDtlType_NotEqual_AsLogDtlType(CDef.LogDtlType.$4);
    }

    protected void doSetLogDtlType_NotEqual(String logDtlType) {
        regLogDtlType(CK_NES, logDtlType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType}
     * @param logDtlTypeList The collection of logDtlType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlType_InScope(Collection<String> logDtlTypeList) {
        doSetLogDtlType_InScope(logDtlTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As LogDtlType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType} <br>
     * ログ明細種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlType_InScope_AsLogDtlType(Collection<CDef.LogDtlType> cdefList) {
        doSetLogDtlType_InScope(cTStrL(cdefList));
    }

    protected void doSetLogDtlType_InScope(Collection<String> logDtlTypeList) {
        regINS(CK_INS, cTL(logDtlTypeList), xgetCValueLogDtlType(), "LOG_DTL_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType}
     * @param logDtlTypeList The collection of logDtlType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlType_NotInScope(Collection<String> logDtlTypeList) {
        doSetLogDtlType_NotInScope(logDtlTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LogDtlType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType} <br>
     * ログ明細種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlType_NotInScope_AsLogDtlType(Collection<CDef.LogDtlType> cdefList) {
        doSetLogDtlType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLogDtlType_NotInScope(Collection<String> logDtlTypeList) {
        regINS(CK_NINS, cTL(logDtlTypeList), xgetCValueLogDtlType(), "LOG_DTL_TYPE");
    }

    protected void regLogDtlType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogDtlType(), "LOG_DTL_TYPE"); }
    protected abstract ConditionValue xgetCValueLogDtlType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus}
     * @param logDtlStatus The value of logDtlStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlStatus_Equal(String logDtlStatus) {
        doSetLogDtlStatus_Equal(fRES(logDtlStatus));
    }

    /**
     * Equal(=). As LogDtlStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus} <br>
     * ログ明細ステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLogDtlStatus_Equal_AsLogDtlStatus(CDef.LogDtlStatus cdef) {
        doSetLogDtlStatus_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 情報
     */
    public void setLogDtlStatus_Equal_$1() {
        setLogDtlStatus_Equal_AsLogDtlStatus(CDef.LogDtlStatus.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 警告
     */
    public void setLogDtlStatus_Equal_$2() {
        setLogDtlStatus_Equal_AsLogDtlStatus(CDef.LogDtlStatus.$2);
    }

    /**
     * Equal(=). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: エラー
     */
    public void setLogDtlStatus_Equal_$3() {
        setLogDtlStatus_Equal_AsLogDtlStatus(CDef.LogDtlStatus.$3);
    }

    protected void doSetLogDtlStatus_Equal(String logDtlStatus) {
        regLogDtlStatus(CK_EQ, logDtlStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus}
     * @param logDtlStatus The value of logDtlStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlStatus_NotEqual(String logDtlStatus) {
        doSetLogDtlStatus_NotEqual(fRES(logDtlStatus));
    }

    /**
     * NotEqual(&lt;&gt;). As LogDtlStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus} <br>
     * ログ明細ステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLogDtlStatus_NotEqual_AsLogDtlStatus(CDef.LogDtlStatus cdef) {
        doSetLogDtlStatus_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 情報
     */
    public void setLogDtlStatus_NotEqual_$1() {
        setLogDtlStatus_NotEqual_AsLogDtlStatus(CDef.LogDtlStatus.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 警告
     */
    public void setLogDtlStatus_NotEqual_$2() {
        setLogDtlStatus_NotEqual_AsLogDtlStatus(CDef.LogDtlStatus.$2);
    }

    /**
     * NotEqual(&lt;&gt;). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: エラー
     */
    public void setLogDtlStatus_NotEqual_$3() {
        setLogDtlStatus_NotEqual_AsLogDtlStatus(CDef.LogDtlStatus.$3);
    }

    protected void doSetLogDtlStatus_NotEqual(String logDtlStatus) {
        regLogDtlStatus(CK_NES, logDtlStatus);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus}
     * @param logDtlStatusList The collection of logDtlStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlStatus_InScope(Collection<String> logDtlStatusList) {
        doSetLogDtlStatus_InScope(logDtlStatusList);
    }

    /**
     * InScope {in ('a', 'b')}. As LogDtlStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus} <br>
     * ログ明細ステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlStatus_InScope_AsLogDtlStatus(Collection<CDef.LogDtlStatus> cdefList) {
        doSetLogDtlStatus_InScope(cTStrL(cdefList));
    }

    protected void doSetLogDtlStatus_InScope(Collection<String> logDtlStatusList) {
        regINS(CK_INS, cTL(logDtlStatusList), xgetCValueLogDtlStatus(), "LOG_DTL_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus}
     * @param logDtlStatusList The collection of logDtlStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlStatus_NotInScope(Collection<String> logDtlStatusList) {
        doSetLogDtlStatus_NotInScope(logDtlStatusList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LogDtlStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus} <br>
     * ログ明細ステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlStatus_NotInScope_AsLogDtlStatus(Collection<CDef.LogDtlStatus> cdefList) {
        doSetLogDtlStatus_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLogDtlStatus_NotInScope(Collection<String> logDtlStatusList) {
        regINS(CK_NINS, cTL(logDtlStatusList), xgetCValueLogDtlStatus(), "LOG_DTL_STATUS");
    }

    protected void regLogDtlStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogDtlStatus(), "LOG_DTL_STATUS"); }
    protected abstract ConditionValue xgetCValueLogDtlStatus();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_ID: {bigint(19)}
     * @param logDtlSectionId The value of logDtlSectionId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogDtlSectionId_Equal(Long logDtlSectionId) {
        doSetLogDtlSectionId_Equal(logDtlSectionId);
    }

    protected void doSetLogDtlSectionId_Equal(Long logDtlSectionId) {
        regLogDtlSectionId(CK_EQ, logDtlSectionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_ID: {bigint(19)}
     * @param logDtlSectionId The value of logDtlSectionId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogDtlSectionId_NotEqual(Long logDtlSectionId) {
        doSetLogDtlSectionId_NotEqual(logDtlSectionId);
    }

    protected void doSetLogDtlSectionId_NotEqual(Long logDtlSectionId) {
        regLogDtlSectionId(CK_NES, logDtlSectionId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_ID: {bigint(19)}
     * @param logDtlSectionId The value of logDtlSectionId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogDtlSectionId_GreaterThan(Long logDtlSectionId) {
        regLogDtlSectionId(CK_GT, logDtlSectionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_ID: {bigint(19)}
     * @param logDtlSectionId The value of logDtlSectionId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogDtlSectionId_LessThan(Long logDtlSectionId) {
        regLogDtlSectionId(CK_LT, logDtlSectionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_ID: {bigint(19)}
     * @param logDtlSectionId The value of logDtlSectionId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogDtlSectionId_GreaterEqual(Long logDtlSectionId) {
        regLogDtlSectionId(CK_GE, logDtlSectionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_ID: {bigint(19)}
     * @param logDtlSectionId The value of logDtlSectionId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogDtlSectionId_LessEqual(Long logDtlSectionId) {
        regLogDtlSectionId(CK_LE, logDtlSectionId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_ID: {bigint(19)}
     * @param minNumber The min number of logDtlSectionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of logDtlSectionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLogDtlSectionId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLogDtlSectionId(), "LOG_DTL_SECTION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOG_DTL_SECTION_ID: {bigint(19)}
     * @param logDtlSectionIdList The collection of logDtlSectionId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlSectionId_InScope(Collection<Long> logDtlSectionIdList) {
        doSetLogDtlSectionId_InScope(logDtlSectionIdList);
    }

    protected void doSetLogDtlSectionId_InScope(Collection<Long> logDtlSectionIdList) {
        regINS(CK_INS, cTL(logDtlSectionIdList), xgetCValueLogDtlSectionId(), "LOG_DTL_SECTION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOG_DTL_SECTION_ID: {bigint(19)}
     * @param logDtlSectionIdList The collection of logDtlSectionId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlSectionId_NotInScope(Collection<Long> logDtlSectionIdList) {
        doSetLogDtlSectionId_NotInScope(logDtlSectionIdList);
    }

    protected void doSetLogDtlSectionId_NotInScope(Collection<Long> logDtlSectionIdList) {
        regINS(CK_NINS, cTL(logDtlSectionIdList), xgetCValueLogDtlSectionId(), "LOG_DTL_SECTION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_ID: {bigint(19)}
     */
    public void setLogDtlSectionId_IsNull() { regLogDtlSectionId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_ID: {bigint(19)}
     */
    public void setLogDtlSectionId_IsNotNull() { regLogDtlSectionId(CK_ISNN, DOBJ); }

    protected void regLogDtlSectionId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogDtlSectionId(), "LOG_DTL_SECTION_ID"); }
    protected abstract ConditionValue xgetCValueLogDtlSectionId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_NM: {varchar(60)}
     * @param logDtlSectionNm The value of logDtlSectionNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlSectionNm_Equal(String logDtlSectionNm) {
        doSetLogDtlSectionNm_Equal(fRES(logDtlSectionNm));
    }

    protected void doSetLogDtlSectionNm_Equal(String logDtlSectionNm) {
        regLogDtlSectionNm(CK_EQ, logDtlSectionNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_NM: {varchar(60)}
     * @param logDtlSectionNm The value of logDtlSectionNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlSectionNm_NotEqual(String logDtlSectionNm) {
        doSetLogDtlSectionNm_NotEqual(fRES(logDtlSectionNm));
    }

    protected void doSetLogDtlSectionNm_NotEqual(String logDtlSectionNm) {
        regLogDtlSectionNm(CK_NES, logDtlSectionNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_NM: {varchar(60)}
     * @param logDtlSectionNm The value of logDtlSectionNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlSectionNm_GreaterThan(String logDtlSectionNm) {
        regLogDtlSectionNm(CK_GT, fRES(logDtlSectionNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_NM: {varchar(60)}
     * @param logDtlSectionNm The value of logDtlSectionNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlSectionNm_LessThan(String logDtlSectionNm) {
        regLogDtlSectionNm(CK_LT, fRES(logDtlSectionNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_NM: {varchar(60)}
     * @param logDtlSectionNm The value of logDtlSectionNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlSectionNm_GreaterEqual(String logDtlSectionNm) {
        regLogDtlSectionNm(CK_GE, fRES(logDtlSectionNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_NM: {varchar(60)}
     * @param logDtlSectionNm The value of logDtlSectionNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlSectionNm_LessEqual(String logDtlSectionNm) {
        regLogDtlSectionNm(CK_LE, fRES(logDtlSectionNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_DTL_SECTION_NM: {varchar(60)}
     * @param logDtlSectionNmList The collection of logDtlSectionNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlSectionNm_InScope(Collection<String> logDtlSectionNmList) {
        doSetLogDtlSectionNm_InScope(logDtlSectionNmList);
    }

    protected void doSetLogDtlSectionNm_InScope(Collection<String> logDtlSectionNmList) {
        regINS(CK_INS, cTL(logDtlSectionNmList), xgetCValueLogDtlSectionNm(), "LOG_DTL_SECTION_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_DTL_SECTION_NM: {varchar(60)}
     * @param logDtlSectionNmList The collection of logDtlSectionNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlSectionNm_NotInScope(Collection<String> logDtlSectionNmList) {
        doSetLogDtlSectionNm_NotInScope(logDtlSectionNmList);
    }

    protected void doSetLogDtlSectionNm_NotInScope(Collection<String> logDtlSectionNmList) {
        regINS(CK_NINS, cTL(logDtlSectionNmList), xgetCValueLogDtlSectionNm(), "LOG_DTL_SECTION_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOG_DTL_SECTION_NM: {varchar(60)} <br>
     * <pre>e.g. setLogDtlSectionNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logDtlSectionNm The value of logDtlSectionNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogDtlSectionNm_LikeSearch(String logDtlSectionNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logDtlSectionNm), xgetCValueLogDtlSectionNm(), "LOG_DTL_SECTION_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOG_DTL_SECTION_NM: {varchar(60)}
     * @param logDtlSectionNm The value of logDtlSectionNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogDtlSectionNm_NotLikeSearch(String logDtlSectionNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logDtlSectionNm), xgetCValueLogDtlSectionNm(), "LOG_DTL_SECTION_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOG_DTL_SECTION_NM: {varchar(60)}
     * @param logDtlSectionNm The value of logDtlSectionNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogDtlSectionNm_PrefixSearch(String logDtlSectionNm) {
        setLogDtlSectionNm_LikeSearch(logDtlSectionNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_NM: {varchar(60)}
     */
    public void setLogDtlSectionNm_IsNull() { regLogDtlSectionNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_NM: {varchar(60)}
     */
    public void setLogDtlSectionNm_IsNullOrEmpty() { regLogDtlSectionNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOG_DTL_SECTION_NM: {varchar(60)}
     */
    public void setLogDtlSectionNm_IsNotNull() { regLogDtlSectionNm(CK_ISNN, DOBJ); }

    protected void regLogDtlSectionNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogDtlSectionNm(), "LOG_DTL_SECTION_NM"); }
    protected abstract ConditionValue xgetCValueLogDtlSectionNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_INFO: {NotNull, varchar(2147483647)}
     * @param processInfo The value of processInfo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_Equal(String processInfo) {
        doSetProcessInfo_Equal(fRES(processInfo));
    }

    protected void doSetProcessInfo_Equal(String processInfo) {
        regProcessInfo(CK_EQ, processInfo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_INFO: {NotNull, varchar(2147483647)}
     * @param processInfo The value of processInfo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_NotEqual(String processInfo) {
        doSetProcessInfo_NotEqual(fRES(processInfo));
    }

    protected void doSetProcessInfo_NotEqual(String processInfo) {
        regProcessInfo(CK_NES, processInfo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_INFO: {NotNull, varchar(2147483647)}
     * @param processInfo The value of processInfo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_GreaterThan(String processInfo) {
        regProcessInfo(CK_GT, fRES(processInfo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_INFO: {NotNull, varchar(2147483647)}
     * @param processInfo The value of processInfo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_LessThan(String processInfo) {
        regProcessInfo(CK_LT, fRES(processInfo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_INFO: {NotNull, varchar(2147483647)}
     * @param processInfo The value of processInfo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_GreaterEqual(String processInfo) {
        regProcessInfo(CK_GE, fRES(processInfo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_INFO: {NotNull, varchar(2147483647)}
     * @param processInfo The value of processInfo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_LessEqual(String processInfo) {
        regProcessInfo(CK_LE, fRES(processInfo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_INFO: {NotNull, varchar(2147483647)}
     * @param processInfoList The collection of processInfo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_InScope(Collection<String> processInfoList) {
        doSetProcessInfo_InScope(processInfoList);
    }

    protected void doSetProcessInfo_InScope(Collection<String> processInfoList) {
        regINS(CK_INS, cTL(processInfoList), xgetCValueProcessInfo(), "PROCESS_INFO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_INFO: {NotNull, varchar(2147483647)}
     * @param processInfoList The collection of processInfo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_NotInScope(Collection<String> processInfoList) {
        doSetProcessInfo_NotInScope(processInfoList);
    }

    protected void doSetProcessInfo_NotInScope(Collection<String> processInfoList) {
        regINS(CK_NINS, cTL(processInfoList), xgetCValueProcessInfo(), "PROCESS_INFO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_INFO: {NotNull, varchar(2147483647)} <br>
     * <pre>e.g. setProcessInfo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param processInfo The value of processInfo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProcessInfo_LikeSearch(String processInfo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(processInfo), xgetCValueProcessInfo(), "PROCESS_INFO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_INFO: {NotNull, varchar(2147483647)}
     * @param processInfo The value of processInfo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProcessInfo_NotLikeSearch(String processInfo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(processInfo), xgetCValueProcessInfo(), "PROCESS_INFO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_INFO: {NotNull, varchar(2147483647)}
     * @param processInfo The value of processInfo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessInfo_PrefixSearch(String processInfo) {
        setProcessInfo_LikeSearch(processInfo, xcLSOPPre());
    }

    protected void regProcessInfo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessInfo(), "PROCESS_INFO"); }
    protected abstract ConditionValue xgetCValueProcessInfo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {NotNull, datetime2(26, 6)}
     * @param processDt The value of processDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessDt_Equal(java.sql.Timestamp processDt) {
        regProcessDt(CK_EQ,  processDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {NotNull, datetime2(26, 6)}
     * @param processDt The value of processDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessDt_GreaterThan(java.sql.Timestamp processDt) {
        regProcessDt(CK_GT,  processDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {NotNull, datetime2(26, 6)}
     * @param processDt The value of processDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessDt_LessThan(java.sql.Timestamp processDt) {
        regProcessDt(CK_LT,  processDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {NotNull, datetime2(26, 6)}
     * @param processDt The value of processDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessDt_GreaterEqual(java.sql.Timestamp processDt) {
        regProcessDt(CK_GE,  processDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {NotNull, datetime2(26, 6)}
     * @param processDt The value of processDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessDt_LessEqual(java.sql.Timestamp processDt) {
        regProcessDt(CK_LE, processDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {NotNull, datetime2(26, 6)}
     * <pre>e.g. setProcessDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of processDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of processDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setProcessDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueProcessDt(), "PROCESS_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {NotNull, datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of processDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of processDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setProcessDt_DateFromTo(Date fromDate, Date toDate) {
        setProcessDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    protected void regProcessDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessDt(), "PROCESS_DT"); }
    protected abstract ConditionValue xgetCValueProcessDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING1: {varchar(2147483647)}
     * @param messageReplaceString1 The value of messageReplaceString1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString1_Equal(String messageReplaceString1) {
        doSetMessageReplaceString1_Equal(fRES(messageReplaceString1));
    }

    protected void doSetMessageReplaceString1_Equal(String messageReplaceString1) {
        regMessageReplaceString1(CK_EQ, messageReplaceString1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING1: {varchar(2147483647)}
     * @param messageReplaceString1 The value of messageReplaceString1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString1_NotEqual(String messageReplaceString1) {
        doSetMessageReplaceString1_NotEqual(fRES(messageReplaceString1));
    }

    protected void doSetMessageReplaceString1_NotEqual(String messageReplaceString1) {
        regMessageReplaceString1(CK_NES, messageReplaceString1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING1: {varchar(2147483647)}
     * @param messageReplaceString1 The value of messageReplaceString1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString1_GreaterThan(String messageReplaceString1) {
        regMessageReplaceString1(CK_GT, fRES(messageReplaceString1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING1: {varchar(2147483647)}
     * @param messageReplaceString1 The value of messageReplaceString1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString1_LessThan(String messageReplaceString1) {
        regMessageReplaceString1(CK_LT, fRES(messageReplaceString1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING1: {varchar(2147483647)}
     * @param messageReplaceString1 The value of messageReplaceString1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString1_GreaterEqual(String messageReplaceString1) {
        regMessageReplaceString1(CK_GE, fRES(messageReplaceString1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING1: {varchar(2147483647)}
     * @param messageReplaceString1 The value of messageReplaceString1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString1_LessEqual(String messageReplaceString1) {
        regMessageReplaceString1(CK_LE, fRES(messageReplaceString1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING1: {varchar(2147483647)}
     * @param messageReplaceString1List The collection of messageReplaceString1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString1_InScope(Collection<String> messageReplaceString1List) {
        doSetMessageReplaceString1_InScope(messageReplaceString1List);
    }

    protected void doSetMessageReplaceString1_InScope(Collection<String> messageReplaceString1List) {
        regINS(CK_INS, cTL(messageReplaceString1List), xgetCValueMessageReplaceString1(), "MESSAGE_REPLACE_STRING1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING1: {varchar(2147483647)}
     * @param messageReplaceString1List The collection of messageReplaceString1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString1_NotInScope(Collection<String> messageReplaceString1List) {
        doSetMessageReplaceString1_NotInScope(messageReplaceString1List);
    }

    protected void doSetMessageReplaceString1_NotInScope(Collection<String> messageReplaceString1List) {
        regINS(CK_NINS, cTL(messageReplaceString1List), xgetCValueMessageReplaceString1(), "MESSAGE_REPLACE_STRING1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING1: {varchar(2147483647)} <br>
     * <pre>e.g. setMessageReplaceString1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param messageReplaceString1 The value of messageReplaceString1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMessageReplaceString1_LikeSearch(String messageReplaceString1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(messageReplaceString1), xgetCValueMessageReplaceString1(), "MESSAGE_REPLACE_STRING1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING1: {varchar(2147483647)}
     * @param messageReplaceString1 The value of messageReplaceString1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMessageReplaceString1_NotLikeSearch(String messageReplaceString1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(messageReplaceString1), xgetCValueMessageReplaceString1(), "MESSAGE_REPLACE_STRING1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING1: {varchar(2147483647)}
     * @param messageReplaceString1 The value of messageReplaceString1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString1_PrefixSearch(String messageReplaceString1) {
        setMessageReplaceString1_LikeSearch(messageReplaceString1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING1: {varchar(2147483647)}
     */
    public void setMessageReplaceString1_IsNull() { regMessageReplaceString1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING1: {varchar(2147483647)}
     */
    public void setMessageReplaceString1_IsNullOrEmpty() { regMessageReplaceString1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING1: {varchar(2147483647)}
     */
    public void setMessageReplaceString1_IsNotNull() { regMessageReplaceString1(CK_ISNN, DOBJ); }

    protected void regMessageReplaceString1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMessageReplaceString1(), "MESSAGE_REPLACE_STRING1"); }
    protected abstract ConditionValue xgetCValueMessageReplaceString1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING2: {varchar(2147483647)}
     * @param messageReplaceString2 The value of messageReplaceString2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString2_Equal(String messageReplaceString2) {
        doSetMessageReplaceString2_Equal(fRES(messageReplaceString2));
    }

    protected void doSetMessageReplaceString2_Equal(String messageReplaceString2) {
        regMessageReplaceString2(CK_EQ, messageReplaceString2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING2: {varchar(2147483647)}
     * @param messageReplaceString2 The value of messageReplaceString2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString2_NotEqual(String messageReplaceString2) {
        doSetMessageReplaceString2_NotEqual(fRES(messageReplaceString2));
    }

    protected void doSetMessageReplaceString2_NotEqual(String messageReplaceString2) {
        regMessageReplaceString2(CK_NES, messageReplaceString2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING2: {varchar(2147483647)}
     * @param messageReplaceString2 The value of messageReplaceString2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString2_GreaterThan(String messageReplaceString2) {
        regMessageReplaceString2(CK_GT, fRES(messageReplaceString2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING2: {varchar(2147483647)}
     * @param messageReplaceString2 The value of messageReplaceString2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString2_LessThan(String messageReplaceString2) {
        regMessageReplaceString2(CK_LT, fRES(messageReplaceString2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING2: {varchar(2147483647)}
     * @param messageReplaceString2 The value of messageReplaceString2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString2_GreaterEqual(String messageReplaceString2) {
        regMessageReplaceString2(CK_GE, fRES(messageReplaceString2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING2: {varchar(2147483647)}
     * @param messageReplaceString2 The value of messageReplaceString2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString2_LessEqual(String messageReplaceString2) {
        regMessageReplaceString2(CK_LE, fRES(messageReplaceString2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING2: {varchar(2147483647)}
     * @param messageReplaceString2List The collection of messageReplaceString2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString2_InScope(Collection<String> messageReplaceString2List) {
        doSetMessageReplaceString2_InScope(messageReplaceString2List);
    }

    protected void doSetMessageReplaceString2_InScope(Collection<String> messageReplaceString2List) {
        regINS(CK_INS, cTL(messageReplaceString2List), xgetCValueMessageReplaceString2(), "MESSAGE_REPLACE_STRING2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING2: {varchar(2147483647)}
     * @param messageReplaceString2List The collection of messageReplaceString2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString2_NotInScope(Collection<String> messageReplaceString2List) {
        doSetMessageReplaceString2_NotInScope(messageReplaceString2List);
    }

    protected void doSetMessageReplaceString2_NotInScope(Collection<String> messageReplaceString2List) {
        regINS(CK_NINS, cTL(messageReplaceString2List), xgetCValueMessageReplaceString2(), "MESSAGE_REPLACE_STRING2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING2: {varchar(2147483647)} <br>
     * <pre>e.g. setMessageReplaceString2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param messageReplaceString2 The value of messageReplaceString2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMessageReplaceString2_LikeSearch(String messageReplaceString2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(messageReplaceString2), xgetCValueMessageReplaceString2(), "MESSAGE_REPLACE_STRING2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING2: {varchar(2147483647)}
     * @param messageReplaceString2 The value of messageReplaceString2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMessageReplaceString2_NotLikeSearch(String messageReplaceString2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(messageReplaceString2), xgetCValueMessageReplaceString2(), "MESSAGE_REPLACE_STRING2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING2: {varchar(2147483647)}
     * @param messageReplaceString2 The value of messageReplaceString2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString2_PrefixSearch(String messageReplaceString2) {
        setMessageReplaceString2_LikeSearch(messageReplaceString2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING2: {varchar(2147483647)}
     */
    public void setMessageReplaceString2_IsNull() { regMessageReplaceString2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING2: {varchar(2147483647)}
     */
    public void setMessageReplaceString2_IsNullOrEmpty() { regMessageReplaceString2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING2: {varchar(2147483647)}
     */
    public void setMessageReplaceString2_IsNotNull() { regMessageReplaceString2(CK_ISNN, DOBJ); }

    protected void regMessageReplaceString2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMessageReplaceString2(), "MESSAGE_REPLACE_STRING2"); }
    protected abstract ConditionValue xgetCValueMessageReplaceString2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING3: {varchar(2147483647)}
     * @param messageReplaceString3 The value of messageReplaceString3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString3_Equal(String messageReplaceString3) {
        doSetMessageReplaceString3_Equal(fRES(messageReplaceString3));
    }

    protected void doSetMessageReplaceString3_Equal(String messageReplaceString3) {
        regMessageReplaceString3(CK_EQ, messageReplaceString3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING3: {varchar(2147483647)}
     * @param messageReplaceString3 The value of messageReplaceString3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString3_NotEqual(String messageReplaceString3) {
        doSetMessageReplaceString3_NotEqual(fRES(messageReplaceString3));
    }

    protected void doSetMessageReplaceString3_NotEqual(String messageReplaceString3) {
        regMessageReplaceString3(CK_NES, messageReplaceString3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING3: {varchar(2147483647)}
     * @param messageReplaceString3 The value of messageReplaceString3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString3_GreaterThan(String messageReplaceString3) {
        regMessageReplaceString3(CK_GT, fRES(messageReplaceString3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING3: {varchar(2147483647)}
     * @param messageReplaceString3 The value of messageReplaceString3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString3_LessThan(String messageReplaceString3) {
        regMessageReplaceString3(CK_LT, fRES(messageReplaceString3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING3: {varchar(2147483647)}
     * @param messageReplaceString3 The value of messageReplaceString3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString3_GreaterEqual(String messageReplaceString3) {
        regMessageReplaceString3(CK_GE, fRES(messageReplaceString3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING3: {varchar(2147483647)}
     * @param messageReplaceString3 The value of messageReplaceString3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString3_LessEqual(String messageReplaceString3) {
        regMessageReplaceString3(CK_LE, fRES(messageReplaceString3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING3: {varchar(2147483647)}
     * @param messageReplaceString3List The collection of messageReplaceString3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString3_InScope(Collection<String> messageReplaceString3List) {
        doSetMessageReplaceString3_InScope(messageReplaceString3List);
    }

    protected void doSetMessageReplaceString3_InScope(Collection<String> messageReplaceString3List) {
        regINS(CK_INS, cTL(messageReplaceString3List), xgetCValueMessageReplaceString3(), "MESSAGE_REPLACE_STRING3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING3: {varchar(2147483647)}
     * @param messageReplaceString3List The collection of messageReplaceString3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString3_NotInScope(Collection<String> messageReplaceString3List) {
        doSetMessageReplaceString3_NotInScope(messageReplaceString3List);
    }

    protected void doSetMessageReplaceString3_NotInScope(Collection<String> messageReplaceString3List) {
        regINS(CK_NINS, cTL(messageReplaceString3List), xgetCValueMessageReplaceString3(), "MESSAGE_REPLACE_STRING3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING3: {varchar(2147483647)} <br>
     * <pre>e.g. setMessageReplaceString3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param messageReplaceString3 The value of messageReplaceString3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMessageReplaceString3_LikeSearch(String messageReplaceString3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(messageReplaceString3), xgetCValueMessageReplaceString3(), "MESSAGE_REPLACE_STRING3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING3: {varchar(2147483647)}
     * @param messageReplaceString3 The value of messageReplaceString3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMessageReplaceString3_NotLikeSearch(String messageReplaceString3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(messageReplaceString3), xgetCValueMessageReplaceString3(), "MESSAGE_REPLACE_STRING3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING3: {varchar(2147483647)}
     * @param messageReplaceString3 The value of messageReplaceString3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString3_PrefixSearch(String messageReplaceString3) {
        setMessageReplaceString3_LikeSearch(messageReplaceString3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING3: {varchar(2147483647)}
     */
    public void setMessageReplaceString3_IsNull() { regMessageReplaceString3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING3: {varchar(2147483647)}
     */
    public void setMessageReplaceString3_IsNullOrEmpty() { regMessageReplaceString3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING3: {varchar(2147483647)}
     */
    public void setMessageReplaceString3_IsNotNull() { regMessageReplaceString3(CK_ISNN, DOBJ); }

    protected void regMessageReplaceString3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMessageReplaceString3(), "MESSAGE_REPLACE_STRING3"); }
    protected abstract ConditionValue xgetCValueMessageReplaceString3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING4: {varchar(2147483647)}
     * @param messageReplaceString4 The value of messageReplaceString4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString4_Equal(String messageReplaceString4) {
        doSetMessageReplaceString4_Equal(fRES(messageReplaceString4));
    }

    protected void doSetMessageReplaceString4_Equal(String messageReplaceString4) {
        regMessageReplaceString4(CK_EQ, messageReplaceString4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING4: {varchar(2147483647)}
     * @param messageReplaceString4 The value of messageReplaceString4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString4_NotEqual(String messageReplaceString4) {
        doSetMessageReplaceString4_NotEqual(fRES(messageReplaceString4));
    }

    protected void doSetMessageReplaceString4_NotEqual(String messageReplaceString4) {
        regMessageReplaceString4(CK_NES, messageReplaceString4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING4: {varchar(2147483647)}
     * @param messageReplaceString4 The value of messageReplaceString4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString4_GreaterThan(String messageReplaceString4) {
        regMessageReplaceString4(CK_GT, fRES(messageReplaceString4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING4: {varchar(2147483647)}
     * @param messageReplaceString4 The value of messageReplaceString4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString4_LessThan(String messageReplaceString4) {
        regMessageReplaceString4(CK_LT, fRES(messageReplaceString4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING4: {varchar(2147483647)}
     * @param messageReplaceString4 The value of messageReplaceString4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString4_GreaterEqual(String messageReplaceString4) {
        regMessageReplaceString4(CK_GE, fRES(messageReplaceString4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING4: {varchar(2147483647)}
     * @param messageReplaceString4 The value of messageReplaceString4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString4_LessEqual(String messageReplaceString4) {
        regMessageReplaceString4(CK_LE, fRES(messageReplaceString4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING4: {varchar(2147483647)}
     * @param messageReplaceString4List The collection of messageReplaceString4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString4_InScope(Collection<String> messageReplaceString4List) {
        doSetMessageReplaceString4_InScope(messageReplaceString4List);
    }

    protected void doSetMessageReplaceString4_InScope(Collection<String> messageReplaceString4List) {
        regINS(CK_INS, cTL(messageReplaceString4List), xgetCValueMessageReplaceString4(), "MESSAGE_REPLACE_STRING4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING4: {varchar(2147483647)}
     * @param messageReplaceString4List The collection of messageReplaceString4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString4_NotInScope(Collection<String> messageReplaceString4List) {
        doSetMessageReplaceString4_NotInScope(messageReplaceString4List);
    }

    protected void doSetMessageReplaceString4_NotInScope(Collection<String> messageReplaceString4List) {
        regINS(CK_NINS, cTL(messageReplaceString4List), xgetCValueMessageReplaceString4(), "MESSAGE_REPLACE_STRING4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING4: {varchar(2147483647)} <br>
     * <pre>e.g. setMessageReplaceString4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param messageReplaceString4 The value of messageReplaceString4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMessageReplaceString4_LikeSearch(String messageReplaceString4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(messageReplaceString4), xgetCValueMessageReplaceString4(), "MESSAGE_REPLACE_STRING4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING4: {varchar(2147483647)}
     * @param messageReplaceString4 The value of messageReplaceString4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMessageReplaceString4_NotLikeSearch(String messageReplaceString4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(messageReplaceString4), xgetCValueMessageReplaceString4(), "MESSAGE_REPLACE_STRING4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING4: {varchar(2147483647)}
     * @param messageReplaceString4 The value of messageReplaceString4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString4_PrefixSearch(String messageReplaceString4) {
        setMessageReplaceString4_LikeSearch(messageReplaceString4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING4: {varchar(2147483647)}
     */
    public void setMessageReplaceString4_IsNull() { regMessageReplaceString4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING4: {varchar(2147483647)}
     */
    public void setMessageReplaceString4_IsNullOrEmpty() { regMessageReplaceString4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING4: {varchar(2147483647)}
     */
    public void setMessageReplaceString4_IsNotNull() { regMessageReplaceString4(CK_ISNN, DOBJ); }

    protected void regMessageReplaceString4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMessageReplaceString4(), "MESSAGE_REPLACE_STRING4"); }
    protected abstract ConditionValue xgetCValueMessageReplaceString4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING5: {varchar(2147483647)}
     * @param messageReplaceString5 The value of messageReplaceString5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString5_Equal(String messageReplaceString5) {
        doSetMessageReplaceString5_Equal(fRES(messageReplaceString5));
    }

    protected void doSetMessageReplaceString5_Equal(String messageReplaceString5) {
        regMessageReplaceString5(CK_EQ, messageReplaceString5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING5: {varchar(2147483647)}
     * @param messageReplaceString5 The value of messageReplaceString5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString5_NotEqual(String messageReplaceString5) {
        doSetMessageReplaceString5_NotEqual(fRES(messageReplaceString5));
    }

    protected void doSetMessageReplaceString5_NotEqual(String messageReplaceString5) {
        regMessageReplaceString5(CK_NES, messageReplaceString5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING5: {varchar(2147483647)}
     * @param messageReplaceString5 The value of messageReplaceString5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString5_GreaterThan(String messageReplaceString5) {
        regMessageReplaceString5(CK_GT, fRES(messageReplaceString5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING5: {varchar(2147483647)}
     * @param messageReplaceString5 The value of messageReplaceString5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString5_LessThan(String messageReplaceString5) {
        regMessageReplaceString5(CK_LT, fRES(messageReplaceString5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING5: {varchar(2147483647)}
     * @param messageReplaceString5 The value of messageReplaceString5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString5_GreaterEqual(String messageReplaceString5) {
        regMessageReplaceString5(CK_GE, fRES(messageReplaceString5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING5: {varchar(2147483647)}
     * @param messageReplaceString5 The value of messageReplaceString5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString5_LessEqual(String messageReplaceString5) {
        regMessageReplaceString5(CK_LE, fRES(messageReplaceString5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING5: {varchar(2147483647)}
     * @param messageReplaceString5List The collection of messageReplaceString5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString5_InScope(Collection<String> messageReplaceString5List) {
        doSetMessageReplaceString5_InScope(messageReplaceString5List);
    }

    protected void doSetMessageReplaceString5_InScope(Collection<String> messageReplaceString5List) {
        regINS(CK_INS, cTL(messageReplaceString5List), xgetCValueMessageReplaceString5(), "MESSAGE_REPLACE_STRING5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING5: {varchar(2147483647)}
     * @param messageReplaceString5List The collection of messageReplaceString5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString5_NotInScope(Collection<String> messageReplaceString5List) {
        doSetMessageReplaceString5_NotInScope(messageReplaceString5List);
    }

    protected void doSetMessageReplaceString5_NotInScope(Collection<String> messageReplaceString5List) {
        regINS(CK_NINS, cTL(messageReplaceString5List), xgetCValueMessageReplaceString5(), "MESSAGE_REPLACE_STRING5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING5: {varchar(2147483647)} <br>
     * <pre>e.g. setMessageReplaceString5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param messageReplaceString5 The value of messageReplaceString5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMessageReplaceString5_LikeSearch(String messageReplaceString5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(messageReplaceString5), xgetCValueMessageReplaceString5(), "MESSAGE_REPLACE_STRING5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING5: {varchar(2147483647)}
     * @param messageReplaceString5 The value of messageReplaceString5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMessageReplaceString5_NotLikeSearch(String messageReplaceString5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(messageReplaceString5), xgetCValueMessageReplaceString5(), "MESSAGE_REPLACE_STRING5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_REPLACE_STRING5: {varchar(2147483647)}
     * @param messageReplaceString5 The value of messageReplaceString5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageReplaceString5_PrefixSearch(String messageReplaceString5) {
        setMessageReplaceString5_LikeSearch(messageReplaceString5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING5: {varchar(2147483647)}
     */
    public void setMessageReplaceString5_IsNull() { regMessageReplaceString5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING5: {varchar(2147483647)}
     */
    public void setMessageReplaceString5_IsNullOrEmpty() { regMessageReplaceString5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MESSAGE_REPLACE_STRING5: {varchar(2147483647)}
     */
    public void setMessageReplaceString5_IsNotNull() { regMessageReplaceString5(CK_ISNN, DOBJ); }

    protected void regMessageReplaceString5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMessageReplaceString5(), "MESSAGE_REPLACE_STRING5"); }
    protected abstract ConditionValue xgetCValueMessageReplaceString5();

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
    public HpSLCFunction<BLogDtlCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BLogDtlCB.class);
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
    public HpSLCFunction<BLogDtlCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BLogDtlCB.class);
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
    public HpSLCFunction<BLogDtlCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BLogDtlCB.class);
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
    public HpSLCFunction<BLogDtlCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BLogDtlCB.class);
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
    public HpSLCFunction<BLogDtlCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BLogDtlCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BLogDtlCB&gt;() {
     *     public void query(BLogDtlCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BLogDtlCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BLogDtlCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BLogDtlCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BLogDtlCQ sq);

    protected BLogDtlCB xcreateScalarConditionCB() {
        BLogDtlCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BLogDtlCB xcreateScalarConditionPartitionByCB() {
        BLogDtlCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BLogDtlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BLogDtlCB cb = new BLogDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LOG_DTL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BLogDtlCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BLogDtlCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BLogDtlCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BLogDtlCB cb = new BLogDtlCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LOG_DTL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BLogDtlCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BLogDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BLogDtlCB cb = new BLogDtlCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BLogDtlCQ sq);

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
    protected BLogDtlCB newMyCB() {
        return new BLogDtlCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BLogDtlCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
