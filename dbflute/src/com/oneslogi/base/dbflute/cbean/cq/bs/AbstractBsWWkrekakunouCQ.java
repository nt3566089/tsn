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
 * The abstract condition-query of W_WKREKAKUNOU.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWWkrekakunouCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWWkrekakunouCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_WKREKAKUNOU";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rekakunouId The value of rekakunouId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunouId_Equal(Long rekakunouId) {
        doSetRekakunouId_Equal(rekakunouId);
    }

    protected void doSetRekakunouId_Equal(Long rekakunouId) {
        regRekakunouId(CK_EQ, rekakunouId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rekakunouId The value of rekakunouId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunouId_NotEqual(Long rekakunouId) {
        doSetRekakunouId_NotEqual(rekakunouId);
    }

    protected void doSetRekakunouId_NotEqual(Long rekakunouId) {
        regRekakunouId(CK_NES, rekakunouId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rekakunouId The value of rekakunouId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunouId_GreaterThan(Long rekakunouId) {
        regRekakunouId(CK_GT, rekakunouId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rekakunouId The value of rekakunouId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunouId_LessThan(Long rekakunouId) {
        regRekakunouId(CK_LT, rekakunouId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rekakunouId The value of rekakunouId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunouId_GreaterEqual(Long rekakunouId) {
        regRekakunouId(CK_GE, rekakunouId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rekakunouId The value of rekakunouId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunouId_LessEqual(Long rekakunouId) {
        regRekakunouId(CK_LE, rekakunouId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of rekakunouId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rekakunouId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRekakunouId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRekakunouId(), "REKAKUNOU_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rekakunouIdList The collection of rekakunouId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRekakunouId_InScope(Collection<Long> rekakunouIdList) {
        doSetRekakunouId_InScope(rekakunouIdList);
    }

    protected void doSetRekakunouId_InScope(Collection<Long> rekakunouIdList) {
        regINS(CK_INS, cTL(rekakunouIdList), xgetCValueRekakunouId(), "REKAKUNOU_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rekakunouIdList The collection of rekakunouId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRekakunouId_NotInScope(Collection<Long> rekakunouIdList) {
        doSetRekakunouId_NotInScope(rekakunouIdList);
    }

    protected void doSetRekakunouId_NotInScope(Collection<Long> rekakunouIdList) {
        regINS(CK_NINS, cTL(rekakunouIdList), xgetCValueRekakunouId(), "REKAKUNOU_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setRekakunouId_IsNull() { regRekakunouId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setRekakunouId_IsNotNull() { regRekakunouId(CK_ISNN, DOBJ); }

    protected void regRekakunouId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRekakunouId(), "REKAKUNOU_ID"); }
    protected abstract ConditionValue xgetCValueRekakunouId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_Equal(Long centerId) {
        doSetCenterId_Equal(centerId);
    }

    protected void doSetCenterId_Equal(Long centerId) {
        regCenterId(CK_EQ, centerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_NotEqual(Long centerId) {
        doSetCenterId_NotEqual(centerId);
    }

    protected void doSetCenterId_NotEqual(Long centerId) {
        regCenterId(CK_NES, centerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerIdList The collection of centerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_InScope(Collection<Long> centerIdList) {
        doSetCenterId_InScope(centerIdList);
    }

    protected void doSetCenterId_InScope(Collection<Long> centerIdList) {
        regINS(CK_INS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_Equal(Long clientId) {
        doSetClientId_Equal(clientId);
    }

    protected void doSetClientId_Equal(Long clientId) {
        regClientId(CK_EQ, clientId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_NotEqual(Long clientId) {
        doSetClientId_NotEqual(clientId);
    }

    protected void doSetClientId_NotEqual(Long clientId) {
        regClientId(CK_NES, clientId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientIdList The collection of clientId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_InScope(Collection<Long> clientIdList) {
        doSetClientId_InScope(clientIdList);
    }

    protected void doSetClientId_InScope(Collection<Long> clientIdList) {
        regINS(CK_INS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOUKEY: {NotNull, decimal(16, 6)}
     * @param rekakunoukey The value of rekakunoukey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunoukey_Equal(java.math.BigDecimal rekakunoukey) {
        doSetRekakunoukey_Equal(rekakunoukey);
    }

    protected void doSetRekakunoukey_Equal(java.math.BigDecimal rekakunoukey) {
        regRekakunoukey(CK_EQ, rekakunoukey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOUKEY: {NotNull, decimal(16, 6)}
     * @param rekakunoukey The value of rekakunoukey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunoukey_NotEqual(java.math.BigDecimal rekakunoukey) {
        doSetRekakunoukey_NotEqual(rekakunoukey);
    }

    protected void doSetRekakunoukey_NotEqual(java.math.BigDecimal rekakunoukey) {
        regRekakunoukey(CK_NES, rekakunoukey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOUKEY: {NotNull, decimal(16, 6)}
     * @param rekakunoukey The value of rekakunoukey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunoukey_GreaterThan(java.math.BigDecimal rekakunoukey) {
        regRekakunoukey(CK_GT, rekakunoukey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOUKEY: {NotNull, decimal(16, 6)}
     * @param rekakunoukey The value of rekakunoukey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunoukey_LessThan(java.math.BigDecimal rekakunoukey) {
        regRekakunoukey(CK_LT, rekakunoukey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOUKEY: {NotNull, decimal(16, 6)}
     * @param rekakunoukey The value of rekakunoukey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunoukey_GreaterEqual(java.math.BigDecimal rekakunoukey) {
        regRekakunoukey(CK_GE, rekakunoukey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOUKEY: {NotNull, decimal(16, 6)}
     * @param rekakunoukey The value of rekakunoukey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunoukey_LessEqual(java.math.BigDecimal rekakunoukey) {
        regRekakunoukey(CK_LE, rekakunoukey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOUKEY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of rekakunoukey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rekakunoukey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRekakunoukey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRekakunoukey(), "REKAKUNOUKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REKAKUNOUKEY: {NotNull, decimal(16, 6)}
     * @param rekakunoukeyList The collection of rekakunoukey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRekakunoukey_InScope(Collection<java.math.BigDecimal> rekakunoukeyList) {
        doSetRekakunoukey_InScope(rekakunoukeyList);
    }

    protected void doSetRekakunoukey_InScope(Collection<java.math.BigDecimal> rekakunoukeyList) {
        regINS(CK_INS, cTL(rekakunoukeyList), xgetCValueRekakunoukey(), "REKAKUNOUKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REKAKUNOUKEY: {NotNull, decimal(16, 6)}
     * @param rekakunoukeyList The collection of rekakunoukey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRekakunoukey_NotInScope(Collection<java.math.BigDecimal> rekakunoukeyList) {
        doSetRekakunoukey_NotInScope(rekakunoukeyList);
    }

    protected void doSetRekakunoukey_NotInScope(Collection<java.math.BigDecimal> rekakunoukeyList) {
        regINS(CK_NINS, cTL(rekakunoukeyList), xgetCValueRekakunoukey(), "REKAKUNOUKEY");
    }

    protected void regRekakunoukey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRekakunoukey(), "REKAKUNOUKEY"); }
    protected abstract ConditionValue xgetCValueRekakunoukey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOULINENO: {NotNull, bigint(19)}
     * @param rekakunoulineno The value of rekakunoulineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunoulineno_Equal(Long rekakunoulineno) {
        doSetRekakunoulineno_Equal(rekakunoulineno);
    }

    protected void doSetRekakunoulineno_Equal(Long rekakunoulineno) {
        regRekakunoulineno(CK_EQ, rekakunoulineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOULINENO: {NotNull, bigint(19)}
     * @param rekakunoulineno The value of rekakunoulineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunoulineno_NotEqual(Long rekakunoulineno) {
        doSetRekakunoulineno_NotEqual(rekakunoulineno);
    }

    protected void doSetRekakunoulineno_NotEqual(Long rekakunoulineno) {
        regRekakunoulineno(CK_NES, rekakunoulineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOULINENO: {NotNull, bigint(19)}
     * @param rekakunoulineno The value of rekakunoulineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunoulineno_GreaterThan(Long rekakunoulineno) {
        regRekakunoulineno(CK_GT, rekakunoulineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOULINENO: {NotNull, bigint(19)}
     * @param rekakunoulineno The value of rekakunoulineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunoulineno_LessThan(Long rekakunoulineno) {
        regRekakunoulineno(CK_LT, rekakunoulineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOULINENO: {NotNull, bigint(19)}
     * @param rekakunoulineno The value of rekakunoulineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunoulineno_GreaterEqual(Long rekakunoulineno) {
        regRekakunoulineno(CK_GE, rekakunoulineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOULINENO: {NotNull, bigint(19)}
     * @param rekakunoulineno The value of rekakunoulineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRekakunoulineno_LessEqual(Long rekakunoulineno) {
        regRekakunoulineno(CK_LE, rekakunoulineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REKAKUNOULINENO: {NotNull, bigint(19)}
     * @param minNumber The min number of rekakunoulineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rekakunoulineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRekakunoulineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRekakunoulineno(), "REKAKUNOULINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REKAKUNOULINENO: {NotNull, bigint(19)}
     * @param rekakunoulinenoList The collection of rekakunoulineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRekakunoulineno_InScope(Collection<Long> rekakunoulinenoList) {
        doSetRekakunoulineno_InScope(rekakunoulinenoList);
    }

    protected void doSetRekakunoulineno_InScope(Collection<Long> rekakunoulinenoList) {
        regINS(CK_INS, cTL(rekakunoulinenoList), xgetCValueRekakunoulineno(), "REKAKUNOULINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REKAKUNOULINENO: {NotNull, bigint(19)}
     * @param rekakunoulinenoList The collection of rekakunoulineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRekakunoulineno_NotInScope(Collection<Long> rekakunoulinenoList) {
        doSetRekakunoulineno_NotInScope(rekakunoulinenoList);
    }

    protected void doSetRekakunoulineno_NotInScope(Collection<Long> rekakunoulinenoList) {
        regINS(CK_NINS, cTL(rekakunoulinenoList), xgetCValueRekakunoulineno(), "REKAKUNOULINENO");
    }

    protected void regRekakunoulineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRekakunoulineno(), "REKAKUNOULINENO"); }
    protected abstract ConditionValue xgetCValueRekakunoulineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETSYMBOLKEY: {decimal(16, 6)}
     * @param palletsymbolkey The value of palletsymbolkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletsymbolkey_Equal(java.math.BigDecimal palletsymbolkey) {
        doSetPalletsymbolkey_Equal(palletsymbolkey);
    }

    protected void doSetPalletsymbolkey_Equal(java.math.BigDecimal palletsymbolkey) {
        regPalletsymbolkey(CK_EQ, palletsymbolkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETSYMBOLKEY: {decimal(16, 6)}
     * @param palletsymbolkey The value of palletsymbolkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletsymbolkey_NotEqual(java.math.BigDecimal palletsymbolkey) {
        doSetPalletsymbolkey_NotEqual(palletsymbolkey);
    }

    protected void doSetPalletsymbolkey_NotEqual(java.math.BigDecimal palletsymbolkey) {
        regPalletsymbolkey(CK_NES, palletsymbolkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETSYMBOLKEY: {decimal(16, 6)}
     * @param palletsymbolkey The value of palletsymbolkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletsymbolkey_GreaterThan(java.math.BigDecimal palletsymbolkey) {
        regPalletsymbolkey(CK_GT, palletsymbolkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETSYMBOLKEY: {decimal(16, 6)}
     * @param palletsymbolkey The value of palletsymbolkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletsymbolkey_LessThan(java.math.BigDecimal palletsymbolkey) {
        regPalletsymbolkey(CK_LT, palletsymbolkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETSYMBOLKEY: {decimal(16, 6)}
     * @param palletsymbolkey The value of palletsymbolkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletsymbolkey_GreaterEqual(java.math.BigDecimal palletsymbolkey) {
        regPalletsymbolkey(CK_GE, palletsymbolkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETSYMBOLKEY: {decimal(16, 6)}
     * @param palletsymbolkey The value of palletsymbolkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletsymbolkey_LessEqual(java.math.BigDecimal palletsymbolkey) {
        regPalletsymbolkey(CK_LE, palletsymbolkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETSYMBOLKEY: {decimal(16, 6)}
     * @param minNumber The min number of palletsymbolkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palletsymbolkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPalletsymbolkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePalletsymbolkey(), "PALLETSYMBOLKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETSYMBOLKEY: {decimal(16, 6)}
     * @param palletsymbolkeyList The collection of palletsymbolkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsymbolkey_InScope(Collection<java.math.BigDecimal> palletsymbolkeyList) {
        doSetPalletsymbolkey_InScope(palletsymbolkeyList);
    }

    protected void doSetPalletsymbolkey_InScope(Collection<java.math.BigDecimal> palletsymbolkeyList) {
        regINS(CK_INS, cTL(palletsymbolkeyList), xgetCValuePalletsymbolkey(), "PALLETSYMBOLKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETSYMBOLKEY: {decimal(16, 6)}
     * @param palletsymbolkeyList The collection of palletsymbolkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletsymbolkey_NotInScope(Collection<java.math.BigDecimal> palletsymbolkeyList) {
        doSetPalletsymbolkey_NotInScope(palletsymbolkeyList);
    }

    protected void doSetPalletsymbolkey_NotInScope(Collection<java.math.BigDecimal> palletsymbolkeyList) {
        regINS(CK_NINS, cTL(palletsymbolkeyList), xgetCValuePalletsymbolkey(), "PALLETSYMBOLKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLETSYMBOLKEY: {decimal(16, 6)}
     */
    public void setPalletsymbolkey_IsNull() { regPalletsymbolkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLETSYMBOLKEY: {decimal(16, 6)}
     */
    public void setPalletsymbolkey_IsNotNull() { regPalletsymbolkey(CK_ISNN, DOBJ); }

    protected void regPalletsymbolkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletsymbolkey(), "PALLETSYMBOLKEY"); }
    protected abstract ConditionValue xgetCValuePalletsymbolkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETKEY: {varchar(30)}
     * @param palletkey The value of palletkey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletkey_Equal(String palletkey) {
        doSetPalletkey_Equal(fRES(palletkey));
    }

    protected void doSetPalletkey_Equal(String palletkey) {
        regPalletkey(CK_EQ, palletkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETKEY: {varchar(30)}
     * @param palletkey The value of palletkey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletkey_NotEqual(String palletkey) {
        doSetPalletkey_NotEqual(fRES(palletkey));
    }

    protected void doSetPalletkey_NotEqual(String palletkey) {
        regPalletkey(CK_NES, palletkey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETKEY: {varchar(30)}
     * @param palletkey The value of palletkey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletkey_GreaterThan(String palletkey) {
        regPalletkey(CK_GT, fRES(palletkey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETKEY: {varchar(30)}
     * @param palletkey The value of palletkey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletkey_LessThan(String palletkey) {
        regPalletkey(CK_LT, fRES(palletkey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETKEY: {varchar(30)}
     * @param palletkey The value of palletkey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletkey_GreaterEqual(String palletkey) {
        regPalletkey(CK_GE, fRES(palletkey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETKEY: {varchar(30)}
     * @param palletkey The value of palletkey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletkey_LessEqual(String palletkey) {
        regPalletkey(CK_LE, fRES(palletkey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETKEY: {varchar(30)}
     * @param palletkeyList The collection of palletkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletkey_InScope(Collection<String> palletkeyList) {
        doSetPalletkey_InScope(palletkeyList);
    }

    protected void doSetPalletkey_InScope(Collection<String> palletkeyList) {
        regINS(CK_INS, cTL(palletkeyList), xgetCValuePalletkey(), "PALLETKEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETKEY: {varchar(30)}
     * @param palletkeyList The collection of palletkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletkey_NotInScope(Collection<String> palletkeyList) {
        doSetPalletkey_NotInScope(palletkeyList);
    }

    protected void doSetPalletkey_NotInScope(Collection<String> palletkeyList) {
        regINS(CK_NINS, cTL(palletkeyList), xgetCValuePalletkey(), "PALLETKEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETKEY: {varchar(30)} <br>
     * <pre>e.g. setPalletkey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param palletkey The value of palletkey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPalletkey_LikeSearch(String palletkey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(palletkey), xgetCValuePalletkey(), "PALLETKEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETKEY: {varchar(30)}
     * @param palletkey The value of palletkey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPalletkey_NotLikeSearch(String palletkey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(palletkey), xgetCValuePalletkey(), "PALLETKEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETKEY: {varchar(30)}
     * @param palletkey The value of palletkey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletkey_PrefixSearch(String palletkey) {
        setPalletkey_LikeSearch(palletkey, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLETKEY: {varchar(30)}
     */
    public void setPalletkey_IsNull() { regPalletkey(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PALLETKEY: {varchar(30)}
     */
    public void setPalletkey_IsNullOrEmpty() { regPalletkey(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLETKEY: {varchar(30)}
     */
    public void setPalletkey_IsNotNull() { regPalletkey(CK_ISNN, DOBJ); }

    protected void regPalletkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletkey(), "PALLETKEY"); }
    protected abstract ConditionValue xgetCValuePalletkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param sojtkey The value of sojtkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtkey_Equal(java.math.BigDecimal sojtkey) {
        doSetSojtkey_Equal(sojtkey);
    }

    protected void doSetSojtkey_Equal(java.math.BigDecimal sojtkey) {
        regSojtkey(CK_EQ, sojtkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param sojtkey The value of sojtkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtkey_NotEqual(java.math.BigDecimal sojtkey) {
        doSetSojtkey_NotEqual(sojtkey);
    }

    protected void doSetSojtkey_NotEqual(java.math.BigDecimal sojtkey) {
        regSojtkey(CK_NES, sojtkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param sojtkey The value of sojtkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtkey_GreaterThan(java.math.BigDecimal sojtkey) {
        regSojtkey(CK_GT, sojtkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param sojtkey The value of sojtkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtkey_LessThan(java.math.BigDecimal sojtkey) {
        regSojtkey(CK_LT, sojtkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param sojtkey The value of sojtkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtkey_GreaterEqual(java.math.BigDecimal sojtkey) {
        regSojtkey(CK_GE, sojtkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param sojtkey The value of sojtkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtkey_LessEqual(java.math.BigDecimal sojtkey) {
        regSojtkey(CK_LE, sojtkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of sojtkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sojtkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSojtkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSojtkey(), "SOJTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param sojtkeyList The collection of sojtkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSojtkey_InScope(Collection<java.math.BigDecimal> sojtkeyList) {
        doSetSojtkey_InScope(sojtkeyList);
    }

    protected void doSetSojtkey_InScope(Collection<java.math.BigDecimal> sojtkeyList) {
        regINS(CK_INS, cTL(sojtkeyList), xgetCValueSojtkey(), "SOJTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @param sojtkeyList The collection of sojtkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSojtkey_NotInScope(Collection<java.math.BigDecimal> sojtkeyList) {
        doSetSojtkey_NotInScope(sojtkeyList);
    }

    protected void doSetSojtkey_NotInScope(Collection<java.math.BigDecimal> sojtkeyList) {
        regINS(CK_NINS, cTL(sojtkeyList), xgetCValueSojtkey(), "SOJTKEY");
    }

    protected void regSojtkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSojtkey(), "SOJTKEY"); }
    protected abstract ConditionValue xgetCValueSojtkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param sojtlineno The value of sojtlineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineno_Equal(Long sojtlineno) {
        doSetSojtlineno_Equal(sojtlineno);
    }

    protected void doSetSojtlineno_Equal(Long sojtlineno) {
        regSojtlineno(CK_EQ, sojtlineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param sojtlineno The value of sojtlineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineno_NotEqual(Long sojtlineno) {
        doSetSojtlineno_NotEqual(sojtlineno);
    }

    protected void doSetSojtlineno_NotEqual(Long sojtlineno) {
        regSojtlineno(CK_NES, sojtlineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param sojtlineno The value of sojtlineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineno_GreaterThan(Long sojtlineno) {
        regSojtlineno(CK_GT, sojtlineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param sojtlineno The value of sojtlineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineno_LessThan(Long sojtlineno) {
        regSojtlineno(CK_LT, sojtlineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param sojtlineno The value of sojtlineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineno_GreaterEqual(Long sojtlineno) {
        regSojtlineno(CK_GE, sojtlineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param sojtlineno The value of sojtlineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineno_LessEqual(Long sojtlineno) {
        regSojtlineno(CK_LE, sojtlineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param minNumber The min number of sojtlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sojtlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSojtlineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSojtlineno(), "SOJTLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param sojtlinenoList The collection of sojtlineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSojtlineno_InScope(Collection<Long> sojtlinenoList) {
        doSetSojtlineno_InScope(sojtlinenoList);
    }

    protected void doSetSojtlineno_InScope(Collection<Long> sojtlinenoList) {
        regINS(CK_INS, cTL(sojtlinenoList), xgetCValueSojtlineno(), "SOJTLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param sojtlinenoList The collection of sojtlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSojtlineno_NotInScope(Collection<Long> sojtlinenoList) {
        doSetSojtlineno_NotInScope(sojtlinenoList);
    }

    protected void doSetSojtlineno_NotInScope(Collection<Long> sojtlinenoList) {
        regINS(CK_NINS, cTL(sojtlinenoList), xgetCValueSojtlineno(), "SOJTLINENO");
    }

    protected void regSojtlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSojtlineno(), "SOJTLINENO"); }
    protected abstract ConditionValue xgetCValueSojtlineno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersono The value of ownersono as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_Equal(String ownersono) {
        doSetOwnersono_Equal(fRES(ownersono));
    }

    protected void doSetOwnersono_Equal(String ownersono) {
        regOwnersono(CK_EQ, ownersono);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersono The value of ownersono as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_NotEqual(String ownersono) {
        doSetOwnersono_NotEqual(fRES(ownersono));
    }

    protected void doSetOwnersono_NotEqual(String ownersono) {
        regOwnersono(CK_NES, ownersono);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersono The value of ownersono as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_GreaterThan(String ownersono) {
        regOwnersono(CK_GT, fRES(ownersono));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersono The value of ownersono as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_LessThan(String ownersono) {
        regOwnersono(CK_LT, fRES(ownersono));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersono The value of ownersono as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_GreaterEqual(String ownersono) {
        regOwnersono(CK_GE, fRES(ownersono));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersono The value of ownersono as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_LessEqual(String ownersono) {
        regOwnersono(CK_LE, fRES(ownersono));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersonoList The collection of ownersono as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_InScope(Collection<String> ownersonoList) {
        doSetOwnersono_InScope(ownersonoList);
    }

    protected void doSetOwnersono_InScope(Collection<String> ownersonoList) {
        regINS(CK_INS, cTL(ownersonoList), xgetCValueOwnersono(), "OWNERSONO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersonoList The collection of ownersono as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_NotInScope(Collection<String> ownersonoList) {
        doSetOwnersono_NotInScope(ownersonoList);
    }

    protected void doSetOwnersono_NotInScope(Collection<String> ownersonoList) {
        regINS(CK_NINS, cTL(ownersonoList), xgetCValueOwnersono(), "OWNERSONO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)} <br>
     * <pre>e.g. setOwnersono_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownersono The value of ownersono as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnersono_LikeSearch(String ownersono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownersono), xgetCValueOwnersono(), "OWNERSONO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersono The value of ownersono as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnersono_NotLikeSearch(String ownersono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownersono), xgetCValueOwnersono(), "OWNERSONO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @param ownersono The value of ownersono as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_PrefixSearch(String ownersono) {
        setOwnersono_LikeSearch(ownersono, xcLSOPPre());
    }

    protected void regOwnersono(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnersono(), "OWNERSONO"); }
    protected abstract ConditionValue xgetCValueOwnersono();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletno The value of sopalletno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_Equal(String sopalletno) {
        doSetSopalletno_Equal(fRES(sopalletno));
    }

    protected void doSetSopalletno_Equal(String sopalletno) {
        regSopalletno(CK_EQ, sopalletno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletno The value of sopalletno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_NotEqual(String sopalletno) {
        doSetSopalletno_NotEqual(fRES(sopalletno));
    }

    protected void doSetSopalletno_NotEqual(String sopalletno) {
        regSopalletno(CK_NES, sopalletno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletno The value of sopalletno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_GreaterThan(String sopalletno) {
        regSopalletno(CK_GT, fRES(sopalletno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletno The value of sopalletno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_LessThan(String sopalletno) {
        regSopalletno(CK_LT, fRES(sopalletno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletno The value of sopalletno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_GreaterEqual(String sopalletno) {
        regSopalletno(CK_GE, fRES(sopalletno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletno The value of sopalletno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_LessEqual(String sopalletno) {
        regSopalletno(CK_LE, fRES(sopalletno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletnoList The collection of sopalletno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_InScope(Collection<String> sopalletnoList) {
        doSetSopalletno_InScope(sopalletnoList);
    }

    protected void doSetSopalletno_InScope(Collection<String> sopalletnoList) {
        regINS(CK_INS, cTL(sopalletnoList), xgetCValueSopalletno(), "SOPALLETNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletnoList The collection of sopalletno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_NotInScope(Collection<String> sopalletnoList) {
        doSetSopalletno_NotInScope(sopalletnoList);
    }

    protected void doSetSopalletno_NotInScope(Collection<String> sopalletnoList) {
        regINS(CK_NINS, cTL(sopalletnoList), xgetCValueSopalletno(), "SOPALLETNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSopalletno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sopalletno The value of sopalletno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSopalletno_LikeSearch(String sopalletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sopalletno), xgetCValueSopalletno(), "SOPALLETNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletno The value of sopalletno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSopalletno_NotLikeSearch(String sopalletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sopalletno), xgetCValueSopalletno(), "SOPALLETNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @param sopalletno The value of sopalletno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_PrefixSearch(String sopalletno) {
        setSopalletno_LikeSearch(sopalletno, xcLSOPPre());
    }

    protected void regSopalletno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSopalletno(), "SOPALLETNO"); }
    protected abstract ConditionValue xgetCValueSopalletno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_Equal(java.math.BigDecimal rcvkey) {
        doSetRcvkey_Equal(rcvkey);
    }

    protected void doSetRcvkey_Equal(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_EQ, rcvkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_NotEqual(java.math.BigDecimal rcvkey) {
        doSetRcvkey_NotEqual(rcvkey);
    }

    protected void doSetRcvkey_NotEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_NES, rcvkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterThan(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_GT, rcvkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessThan(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_LT, rcvkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_GE, rcvkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_LE, rcvkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param minNumber The min number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvkey(), "RCVKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkeyList The collection of rcvkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_InScope(Collection<java.math.BigDecimal> rcvkeyList) {
        doSetRcvkey_InScope(rcvkeyList);
    }

    protected void doSetRcvkey_InScope(Collection<java.math.BigDecimal> rcvkeyList) {
        regINS(CK_INS, cTL(rcvkeyList), xgetCValueRcvkey(), "RCVKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkeyList The collection of rcvkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_NotInScope(Collection<java.math.BigDecimal> rcvkeyList) {
        doSetRcvkey_NotInScope(rcvkeyList);
    }

    protected void doSetRcvkey_NotInScope(Collection<java.math.BigDecimal> rcvkeyList) {
        regINS(CK_NINS, cTL(rcvkeyList), xgetCValueRcvkey(), "RCVKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     */
    public void setRcvkey_IsNull() { regRcvkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     */
    public void setRcvkey_IsNotNull() { regRcvkey(CK_ISNN, DOBJ); }

    protected void regRcvkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvkey(), "RCVKEY"); }
    protected abstract ConditionValue xgetCValueRcvkey();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param sortedqty1 The value of sortedqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_Equal(java.math.BigDecimal sortedqty1) {
        doSetSortedqty1_Equal(sortedqty1);
    }

    protected void doSetSortedqty1_Equal(java.math.BigDecimal sortedqty1) {
        regSortedqty1(CK_EQ, sortedqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param sortedqty1 The value of sortedqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_NotEqual(java.math.BigDecimal sortedqty1) {
        doSetSortedqty1_NotEqual(sortedqty1);
    }

    protected void doSetSortedqty1_NotEqual(java.math.BigDecimal sortedqty1) {
        regSortedqty1(CK_NES, sortedqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param sortedqty1 The value of sortedqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_GreaterThan(java.math.BigDecimal sortedqty1) {
        regSortedqty1(CK_GT, sortedqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param sortedqty1 The value of sortedqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_LessThan(java.math.BigDecimal sortedqty1) {
        regSortedqty1(CK_LT, sortedqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param sortedqty1 The value of sortedqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_GreaterEqual(java.math.BigDecimal sortedqty1) {
        regSortedqty1(CK_GE, sortedqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param sortedqty1 The value of sortedqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_LessEqual(java.math.BigDecimal sortedqty1) {
        regSortedqty1(CK_LE, sortedqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of sortedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortedqty1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortedqty1(), "SORTEDQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param sortedqty1List The collection of sortedqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedqty1_InScope(Collection<java.math.BigDecimal> sortedqty1List) {
        doSetSortedqty1_InScope(sortedqty1List);
    }

    protected void doSetSortedqty1_InScope(Collection<java.math.BigDecimal> sortedqty1List) {
        regINS(CK_INS, cTL(sortedqty1List), xgetCValueSortedqty1(), "SORTEDQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @param sortedqty1List The collection of sortedqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedqty1_NotInScope(Collection<java.math.BigDecimal> sortedqty1List) {
        doSetSortedqty1_NotInScope(sortedqty1List);
    }

    protected void doSetSortedqty1_NotInScope(Collection<java.math.BigDecimal> sortedqty1List) {
        regINS(CK_NINS, cTL(sortedqty1List), xgetCValueSortedqty1(), "SORTEDQTY1");
    }

    protected void regSortedqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortedqty1(), "SORTEDQTY1"); }
    protected abstract ConditionValue xgetCValueSortedqty1();

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
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflg The value of packedflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_Equal(String packedflg) {
        doSetPackedflg_Equal(fRES(packedflg));
    }

    protected void doSetPackedflg_Equal(String packedflg) {
        regPackedflg(CK_EQ, packedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflg The value of packedflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_NotEqual(String packedflg) {
        doSetPackedflg_NotEqual(fRES(packedflg));
    }

    protected void doSetPackedflg_NotEqual(String packedflg) {
        regPackedflg(CK_NES, packedflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflg The value of packedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_GreaterThan(String packedflg) {
        regPackedflg(CK_GT, fRES(packedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflg The value of packedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_LessThan(String packedflg) {
        regPackedflg(CK_LT, fRES(packedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflg The value of packedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_GreaterEqual(String packedflg) {
        regPackedflg(CK_GE, fRES(packedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflg The value of packedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_LessEqual(String packedflg) {
        regPackedflg(CK_LE, fRES(packedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflgList The collection of packedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_InScope(Collection<String> packedflgList) {
        doSetPackedflg_InScope(packedflgList);
    }

    protected void doSetPackedflg_InScope(Collection<String> packedflgList) {
        regINS(CK_INS, cTL(packedflgList), xgetCValuePackedflg(), "PACKEDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflgList The collection of packedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_NotInScope(Collection<String> packedflgList) {
        doSetPackedflg_NotInScope(packedflgList);
    }

    protected void doSetPackedflg_NotInScope(Collection<String> packedflgList) {
        regINS(CK_NINS, cTL(packedflgList), xgetCValuePackedflg(), "PACKEDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)} <br>
     * <pre>e.g. setPackedflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param packedflg The value of packedflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPackedflg_LikeSearch(String packedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(packedflg), xgetCValuePackedflg(), "PACKEDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflg The value of packedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPackedflg_NotLikeSearch(String packedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(packedflg), xgetCValuePackedflg(), "PACKEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @param packedflg The value of packedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackedflg_PrefixSearch(String packedflg) {
        setPackedflg_LikeSearch(packedflg, xcLSOPPre());
    }

    protected void regPackedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackedflg(), "PACKEDFLG"); }
    protected abstract ConditionValue xgetCValuePackedflg();

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
    public HpSLCFunction<WWkrekakunouCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WWkrekakunouCB.class);
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
    public HpSLCFunction<WWkrekakunouCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WWkrekakunouCB.class);
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
    public HpSLCFunction<WWkrekakunouCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WWkrekakunouCB.class);
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
    public HpSLCFunction<WWkrekakunouCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WWkrekakunouCB.class);
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
    public HpSLCFunction<WWkrekakunouCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WWkrekakunouCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WWkrekakunouCB&gt;() {
     *     public void query(WWkrekakunouCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WWkrekakunouCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WWkrekakunouCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WWkrekakunouCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WWkrekakunouCQ sq);

    protected WWkrekakunouCB xcreateScalarConditionCB() {
        WWkrekakunouCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WWkrekakunouCB xcreateScalarConditionPartitionByCB() {
        WWkrekakunouCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WWkrekakunouCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WWkrekakunouCB cb = new WWkrekakunouCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "REKAKUNOU_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WWkrekakunouCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WWkrekakunouCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WWkrekakunouCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WWkrekakunouCB cb = new WWkrekakunouCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REKAKUNOU_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WWkrekakunouCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WWkrekakunouCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WWkrekakunouCB cb = new WWkrekakunouCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WWkrekakunouCQ sq);

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
    protected WWkrekakunouCB newMyCB() {
        return new WWkrekakunouCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WWkrekakunouCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
