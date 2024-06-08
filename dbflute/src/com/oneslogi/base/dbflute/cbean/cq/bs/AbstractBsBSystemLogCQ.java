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
 * The abstract condition-query of B_SYSTEM_LOG.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBSystemLogCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBSystemLogCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_SYSTEM_LOG";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param systemLogId The value of systemLogId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemLogId_Equal(Long systemLogId) {
        doSetSystemLogId_Equal(systemLogId);
    }

    protected void doSetSystemLogId_Equal(Long systemLogId) {
        regSystemLogId(CK_EQ, systemLogId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param systemLogId The value of systemLogId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemLogId_NotEqual(Long systemLogId) {
        doSetSystemLogId_NotEqual(systemLogId);
    }

    protected void doSetSystemLogId_NotEqual(Long systemLogId) {
        regSystemLogId(CK_NES, systemLogId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param systemLogId The value of systemLogId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemLogId_GreaterThan(Long systemLogId) {
        regSystemLogId(CK_GT, systemLogId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param systemLogId The value of systemLogId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemLogId_LessThan(Long systemLogId) {
        regSystemLogId(CK_LT, systemLogId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param systemLogId The value of systemLogId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemLogId_GreaterEqual(Long systemLogId) {
        regSystemLogId(CK_GE, systemLogId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param systemLogId The value of systemLogId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemLogId_LessEqual(Long systemLogId) {
        regSystemLogId(CK_LE, systemLogId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of systemLogId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of systemLogId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSystemLogId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSystemLogId(), "SYSTEM_LOG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param systemLogIdList The collection of systemLogId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemLogId_InScope(Collection<Long> systemLogIdList) {
        doSetSystemLogId_InScope(systemLogIdList);
    }

    protected void doSetSystemLogId_InScope(Collection<Long> systemLogIdList) {
        regINS(CK_INS, cTL(systemLogIdList), xgetCValueSystemLogId(), "SYSTEM_LOG_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param systemLogIdList The collection of systemLogId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemLogId_NotInScope(Collection<Long> systemLogIdList) {
        doSetSystemLogId_NotInScope(systemLogIdList);
    }

    protected void doSetSystemLogId_NotInScope(Collection<Long> systemLogIdList) {
        regINS(CK_NINS, cTL(systemLogIdList), xgetCValueSystemLogId(), "SYSTEM_LOG_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSystemLogId_IsNull() { regSystemLogId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSystemLogId_IsNotNull() { regSystemLogId(CK_ISNN, DOBJ); }

    protected void regSystemLogId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSystemLogId(), "SYSTEM_LOG_ID"); }
    protected abstract ConditionValue xgetCValueSystemLogId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)}
     * @param systemLogProcessId The value of systemLogProcessId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemLogProcessId_Equal(Long systemLogProcessId) {
        doSetSystemLogProcessId_Equal(systemLogProcessId);
    }

    protected void doSetSystemLogProcessId_Equal(Long systemLogProcessId) {
        regSystemLogProcessId(CK_EQ, systemLogProcessId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)}
     * @param systemLogProcessId The value of systemLogProcessId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemLogProcessId_NotEqual(Long systemLogProcessId) {
        doSetSystemLogProcessId_NotEqual(systemLogProcessId);
    }

    protected void doSetSystemLogProcessId_NotEqual(Long systemLogProcessId) {
        regSystemLogProcessId(CK_NES, systemLogProcessId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)}
     * @param systemLogProcessId The value of systemLogProcessId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemLogProcessId_GreaterThan(Long systemLogProcessId) {
        regSystemLogProcessId(CK_GT, systemLogProcessId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)}
     * @param systemLogProcessId The value of systemLogProcessId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemLogProcessId_LessThan(Long systemLogProcessId) {
        regSystemLogProcessId(CK_LT, systemLogProcessId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)}
     * @param systemLogProcessId The value of systemLogProcessId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemLogProcessId_GreaterEqual(Long systemLogProcessId) {
        regSystemLogProcessId(CK_GE, systemLogProcessId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)}
     * @param systemLogProcessId The value of systemLogProcessId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemLogProcessId_LessEqual(Long systemLogProcessId) {
        regSystemLogProcessId(CK_LE, systemLogProcessId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of systemLogProcessId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of systemLogProcessId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSystemLogProcessId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSystemLogProcessId(), "SYSTEM_LOG_PROCESS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)}
     * @param systemLogProcessIdList The collection of systemLogProcessId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemLogProcessId_InScope(Collection<Long> systemLogProcessIdList) {
        doSetSystemLogProcessId_InScope(systemLogProcessIdList);
    }

    protected void doSetSystemLogProcessId_InScope(Collection<Long> systemLogProcessIdList) {
        regINS(CK_INS, cTL(systemLogProcessIdList), xgetCValueSystemLogProcessId(), "SYSTEM_LOG_PROCESS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)}
     * @param systemLogProcessIdList The collection of systemLogProcessId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemLogProcessId_NotInScope(Collection<Long> systemLogProcessIdList) {
        doSetSystemLogProcessId_NotInScope(systemLogProcessIdList);
    }

    protected void doSetSystemLogProcessId_NotInScope(Collection<Long> systemLogProcessIdList) {
        regINS(CK_NINS, cTL(systemLogProcessIdList), xgetCValueSystemLogProcessId(), "SYSTEM_LOG_PROCESS_ID");
    }

    protected void regSystemLogProcessId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSystemLogProcessId(), "SYSTEM_LOG_PROCESS_ID"); }
    protected abstract ConditionValue xgetCValueSystemLogProcessId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType}
     * @param systemLogType The value of systemLogType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemLogType_Equal(String systemLogType) {
        doSetSystemLogType_Equal(fRES(systemLogType));
    }

    /**
     * Equal(=). As SystemLogType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType} <br>
     * システムログ種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemLogType_Equal_AsSystemLogType(CDef.SystemLogType cdef) {
        doSetSystemLogType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 通常
     */
    public void setSystemLogType_Equal_$1() {
        setSystemLogType_Equal_AsSystemLogType(CDef.SystemLogType.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: SQL(SELECT)
     */
    public void setSystemLogType_Equal_$2() {
        setSystemLogType_Equal_AsSystemLogType(CDef.SystemLogType.$2);
    }

    /**
     * Equal(=). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: SQL(INSERT)
     */
    public void setSystemLogType_Equal_$3() {
        setSystemLogType_Equal_AsSystemLogType(CDef.SystemLogType.$3);
    }

    /**
     * Equal(=). As $4 (4). And OnlyOnceRegistered. <br>
     * $4: SQL(UPDATE)
     */
    public void setSystemLogType_Equal_$4() {
        setSystemLogType_Equal_AsSystemLogType(CDef.SystemLogType.$4);
    }

    /**
     * Equal(=). As $5 (5). And OnlyOnceRegistered. <br>
     * $5: SQL(DELETE)
     */
    public void setSystemLogType_Equal_$5() {
        setSystemLogType_Equal_AsSystemLogType(CDef.SystemLogType.$5);
    }

    /**
     * Equal(=). As $6 (6). And OnlyOnceRegistered. <br>
     * $6: SQL(OTHERS)
     */
    public void setSystemLogType_Equal_$6() {
        setSystemLogType_Equal_AsSystemLogType(CDef.SystemLogType.$6);
    }

    protected void doSetSystemLogType_Equal(String systemLogType) {
        regSystemLogType(CK_EQ, systemLogType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType}
     * @param systemLogType The value of systemLogType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemLogType_NotEqual(String systemLogType) {
        doSetSystemLogType_NotEqual(fRES(systemLogType));
    }

    /**
     * NotEqual(&lt;&gt;). As SystemLogType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType} <br>
     * システムログ種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemLogType_NotEqual_AsSystemLogType(CDef.SystemLogType cdef) {
        doSetSystemLogType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 通常
     */
    public void setSystemLogType_NotEqual_$1() {
        setSystemLogType_NotEqual_AsSystemLogType(CDef.SystemLogType.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: SQL(SELECT)
     */
    public void setSystemLogType_NotEqual_$2() {
        setSystemLogType_NotEqual_AsSystemLogType(CDef.SystemLogType.$2);
    }

    /**
     * NotEqual(&lt;&gt;). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: SQL(INSERT)
     */
    public void setSystemLogType_NotEqual_$3() {
        setSystemLogType_NotEqual_AsSystemLogType(CDef.SystemLogType.$3);
    }

    /**
     * NotEqual(&lt;&gt;). As $4 (4). And OnlyOnceRegistered. <br>
     * $4: SQL(UPDATE)
     */
    public void setSystemLogType_NotEqual_$4() {
        setSystemLogType_NotEqual_AsSystemLogType(CDef.SystemLogType.$4);
    }

    /**
     * NotEqual(&lt;&gt;). As $5 (5). And OnlyOnceRegistered. <br>
     * $5: SQL(DELETE)
     */
    public void setSystemLogType_NotEqual_$5() {
        setSystemLogType_NotEqual_AsSystemLogType(CDef.SystemLogType.$5);
    }

    /**
     * NotEqual(&lt;&gt;). As $6 (6). And OnlyOnceRegistered. <br>
     * $6: SQL(OTHERS)
     */
    public void setSystemLogType_NotEqual_$6() {
        setSystemLogType_NotEqual_AsSystemLogType(CDef.SystemLogType.$6);
    }

    protected void doSetSystemLogType_NotEqual(String systemLogType) {
        regSystemLogType(CK_NES, systemLogType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType}
     * @param systemLogTypeList The collection of systemLogType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemLogType_InScope(Collection<String> systemLogTypeList) {
        doSetSystemLogType_InScope(systemLogTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As SystemLogType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType} <br>
     * システムログ種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemLogType_InScope_AsSystemLogType(Collection<CDef.SystemLogType> cdefList) {
        doSetSystemLogType_InScope(cTStrL(cdefList));
    }

    protected void doSetSystemLogType_InScope(Collection<String> systemLogTypeList) {
        regINS(CK_INS, cTL(systemLogTypeList), xgetCValueSystemLogType(), "SYSTEM_LOG_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType}
     * @param systemLogTypeList The collection of systemLogType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemLogType_NotInScope(Collection<String> systemLogTypeList) {
        doSetSystemLogType_NotInScope(systemLogTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As SystemLogType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType} <br>
     * システムログ種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemLogType_NotInScope_AsSystemLogType(Collection<CDef.SystemLogType> cdefList) {
        doSetSystemLogType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSystemLogType_NotInScope(Collection<String> systemLogTypeList) {
        regINS(CK_NINS, cTL(systemLogTypeList), xgetCValueSystemLogType(), "SYSTEM_LOG_TYPE");
    }

    protected void regSystemLogType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSystemLogType(), "SYSTEM_LOG_TYPE"); }
    protected abstract ConditionValue xgetCValueSystemLogType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus}
     * @param systemLogStatus The value of systemLogStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemLogStatus_Equal(String systemLogStatus) {
        doSetSystemLogStatus_Equal(fRES(systemLogStatus));
    }

    /**
     * Equal(=). As SystemLogStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus} <br>
     * システムログステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemLogStatus_Equal_AsSystemLogStatus(CDef.SystemLogStatus cdef) {
        doSetSystemLogStatus_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 正常
     */
    public void setSystemLogStatus_Equal_$1() {
        setSystemLogStatus_Equal_AsSystemLogStatus(CDef.SystemLogStatus.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 異常
     */
    public void setSystemLogStatus_Equal_$2() {
        setSystemLogStatus_Equal_AsSystemLogStatus(CDef.SystemLogStatus.$2);
    }

    protected void doSetSystemLogStatus_Equal(String systemLogStatus) {
        regSystemLogStatus(CK_EQ, systemLogStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus}
     * @param systemLogStatus The value of systemLogStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemLogStatus_NotEqual(String systemLogStatus) {
        doSetSystemLogStatus_NotEqual(fRES(systemLogStatus));
    }

    /**
     * NotEqual(&lt;&gt;). As SystemLogStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus} <br>
     * システムログステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemLogStatus_NotEqual_AsSystemLogStatus(CDef.SystemLogStatus cdef) {
        doSetSystemLogStatus_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 正常
     */
    public void setSystemLogStatus_NotEqual_$1() {
        setSystemLogStatus_NotEqual_AsSystemLogStatus(CDef.SystemLogStatus.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 異常
     */
    public void setSystemLogStatus_NotEqual_$2() {
        setSystemLogStatus_NotEqual_AsSystemLogStatus(CDef.SystemLogStatus.$2);
    }

    protected void doSetSystemLogStatus_NotEqual(String systemLogStatus) {
        regSystemLogStatus(CK_NES, systemLogStatus);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus}
     * @param systemLogStatusList The collection of systemLogStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemLogStatus_InScope(Collection<String> systemLogStatusList) {
        doSetSystemLogStatus_InScope(systemLogStatusList);
    }

    /**
     * InScope {in ('a', 'b')}. As SystemLogStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus} <br>
     * システムログステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemLogStatus_InScope_AsSystemLogStatus(Collection<CDef.SystemLogStatus> cdefList) {
        doSetSystemLogStatus_InScope(cTStrL(cdefList));
    }

    protected void doSetSystemLogStatus_InScope(Collection<String> systemLogStatusList) {
        regINS(CK_INS, cTL(systemLogStatusList), xgetCValueSystemLogStatus(), "SYSTEM_LOG_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus}
     * @param systemLogStatusList The collection of systemLogStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemLogStatus_NotInScope(Collection<String> systemLogStatusList) {
        doSetSystemLogStatus_NotInScope(systemLogStatusList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As SystemLogStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus} <br>
     * システムログステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemLogStatus_NotInScope_AsSystemLogStatus(Collection<CDef.SystemLogStatus> cdefList) {
        doSetSystemLogStatus_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSystemLogStatus_NotInScope(Collection<String> systemLogStatusList) {
        regINS(CK_NINS, cTL(systemLogStatusList), xgetCValueSystemLogStatus(), "SYSTEM_LOG_STATUS");
    }

    protected void regSystemLogStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSystemLogStatus(), "SYSTEM_LOG_STATUS"); }
    protected abstract ConditionValue xgetCValueSystemLogStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_CD: {NotNull, varchar(100)}
     * @param classCd The value of classCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_Equal(String classCd) {
        doSetClassCd_Equal(fRES(classCd));
    }

    protected void doSetClassCd_Equal(String classCd) {
        regClassCd(CK_EQ, classCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_CD: {NotNull, varchar(100)}
     * @param classCd The value of classCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_NotEqual(String classCd) {
        doSetClassCd_NotEqual(fRES(classCd));
    }

    protected void doSetClassCd_NotEqual(String classCd) {
        regClassCd(CK_NES, classCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_CD: {NotNull, varchar(100)}
     * @param classCd The value of classCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_GreaterThan(String classCd) {
        regClassCd(CK_GT, fRES(classCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_CD: {NotNull, varchar(100)}
     * @param classCd The value of classCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_LessThan(String classCd) {
        regClassCd(CK_LT, fRES(classCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_CD: {NotNull, varchar(100)}
     * @param classCd The value of classCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_GreaterEqual(String classCd) {
        regClassCd(CK_GE, fRES(classCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_CD: {NotNull, varchar(100)}
     * @param classCd The value of classCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_LessEqual(String classCd) {
        regClassCd(CK_LE, fRES(classCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLASS_CD: {NotNull, varchar(100)}
     * @param classCdList The collection of classCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_InScope(Collection<String> classCdList) {
        doSetClassCd_InScope(classCdList);
    }

    protected void doSetClassCd_InScope(Collection<String> classCdList) {
        regINS(CK_INS, cTL(classCdList), xgetCValueClassCd(), "CLASS_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLASS_CD: {NotNull, varchar(100)}
     * @param classCdList The collection of classCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_NotInScope(Collection<String> classCdList) {
        doSetClassCd_NotInScope(classCdList);
    }

    protected void doSetClassCd_NotInScope(Collection<String> classCdList) {
        regINS(CK_NINS, cTL(classCdList), xgetCValueClassCd(), "CLASS_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_CD: {NotNull, varchar(100)} <br>
     * <pre>e.g. setClassCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param classCd The value of classCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClassCd_LikeSearch(String classCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(classCd), xgetCValueClassCd(), "CLASS_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_CD: {NotNull, varchar(100)}
     * @param classCd The value of classCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClassCd_NotLikeSearch(String classCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(classCd), xgetCValueClassCd(), "CLASS_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_CD: {NotNull, varchar(100)}
     * @param classCd The value of classCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_PrefixSearch(String classCd) {
        setClassCd_LikeSearch(classCd, xcLSOPPre());
    }

    protected void regClassCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClassCd(), "CLASS_CD"); }
    protected abstract ConditionValue xgetCValueClassCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * METHOD_CD: {NotNull, varchar(100)}
     * @param methodCd The value of methodCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_Equal(String methodCd) {
        doSetMethodCd_Equal(fRES(methodCd));
    }

    protected void doSetMethodCd_Equal(String methodCd) {
        regMethodCd(CK_EQ, methodCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * METHOD_CD: {NotNull, varchar(100)}
     * @param methodCd The value of methodCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_NotEqual(String methodCd) {
        doSetMethodCd_NotEqual(fRES(methodCd));
    }

    protected void doSetMethodCd_NotEqual(String methodCd) {
        regMethodCd(CK_NES, methodCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * METHOD_CD: {NotNull, varchar(100)}
     * @param methodCd The value of methodCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_GreaterThan(String methodCd) {
        regMethodCd(CK_GT, fRES(methodCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * METHOD_CD: {NotNull, varchar(100)}
     * @param methodCd The value of methodCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_LessThan(String methodCd) {
        regMethodCd(CK_LT, fRES(methodCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * METHOD_CD: {NotNull, varchar(100)}
     * @param methodCd The value of methodCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_GreaterEqual(String methodCd) {
        regMethodCd(CK_GE, fRES(methodCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * METHOD_CD: {NotNull, varchar(100)}
     * @param methodCd The value of methodCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_LessEqual(String methodCd) {
        regMethodCd(CK_LE, fRES(methodCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * METHOD_CD: {NotNull, varchar(100)}
     * @param methodCdList The collection of methodCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_InScope(Collection<String> methodCdList) {
        doSetMethodCd_InScope(methodCdList);
    }

    protected void doSetMethodCd_InScope(Collection<String> methodCdList) {
        regINS(CK_INS, cTL(methodCdList), xgetCValueMethodCd(), "METHOD_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * METHOD_CD: {NotNull, varchar(100)}
     * @param methodCdList The collection of methodCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_NotInScope(Collection<String> methodCdList) {
        doSetMethodCd_NotInScope(methodCdList);
    }

    protected void doSetMethodCd_NotInScope(Collection<String> methodCdList) {
        regINS(CK_NINS, cTL(methodCdList), xgetCValueMethodCd(), "METHOD_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * METHOD_CD: {NotNull, varchar(100)} <br>
     * <pre>e.g. setMethodCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param methodCd The value of methodCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMethodCd_LikeSearch(String methodCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(methodCd), xgetCValueMethodCd(), "METHOD_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * METHOD_CD: {NotNull, varchar(100)}
     * @param methodCd The value of methodCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMethodCd_NotLikeSearch(String methodCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(methodCd), xgetCValueMethodCd(), "METHOD_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * METHOD_CD: {NotNull, varchar(100)}
     * @param methodCd The value of methodCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_PrefixSearch(String methodCd) {
        setMethodCd_LikeSearch(methodCd, xcLSOPPre());
    }

    protected void regMethodCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMethodCd(), "METHOD_CD"); }
    protected abstract ConditionValue xgetCValueMethodCd();

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
    public HpSLCFunction<BSystemLogCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BSystemLogCB.class);
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
    public HpSLCFunction<BSystemLogCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BSystemLogCB.class);
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
    public HpSLCFunction<BSystemLogCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BSystemLogCB.class);
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
    public HpSLCFunction<BSystemLogCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BSystemLogCB.class);
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
    public HpSLCFunction<BSystemLogCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BSystemLogCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BSystemLogCB&gt;() {
     *     public void query(BSystemLogCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BSystemLogCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BSystemLogCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BSystemLogCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BSystemLogCQ sq);

    protected BSystemLogCB xcreateScalarConditionCB() {
        BSystemLogCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BSystemLogCB xcreateScalarConditionPartitionByCB() {
        BSystemLogCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BSystemLogCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BSystemLogCB cb = new BSystemLogCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SYSTEM_LOG_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BSystemLogCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BSystemLogCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BSystemLogCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BSystemLogCB cb = new BSystemLogCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SYSTEM_LOG_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BSystemLogCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BSystemLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BSystemLogCB cb = new BSystemLogCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BSystemLogCQ sq);

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
    protected BSystemLogCB newMyCB() {
        return new BSystemLogCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BSystemLogCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
