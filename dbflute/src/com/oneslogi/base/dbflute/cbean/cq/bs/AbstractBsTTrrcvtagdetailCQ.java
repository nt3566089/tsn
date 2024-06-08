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
 * The abstract condition-query of T_TRRCVTAGDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrrcvtagdetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrrcvtagdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRRCVTAGDETAIL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvtagdetailId The value of trrcvtagdetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvtagdetailId_Equal(Long trrcvtagdetailId) {
        doSetTrrcvtagdetailId_Equal(trrcvtagdetailId);
    }

    protected void doSetTrrcvtagdetailId_Equal(Long trrcvtagdetailId) {
        regTrrcvtagdetailId(CK_EQ, trrcvtagdetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvtagdetailId The value of trrcvtagdetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvtagdetailId_NotEqual(Long trrcvtagdetailId) {
        doSetTrrcvtagdetailId_NotEqual(trrcvtagdetailId);
    }

    protected void doSetTrrcvtagdetailId_NotEqual(Long trrcvtagdetailId) {
        regTrrcvtagdetailId(CK_NES, trrcvtagdetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvtagdetailId The value of trrcvtagdetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvtagdetailId_GreaterThan(Long trrcvtagdetailId) {
        regTrrcvtagdetailId(CK_GT, trrcvtagdetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvtagdetailId The value of trrcvtagdetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvtagdetailId_LessThan(Long trrcvtagdetailId) {
        regTrrcvtagdetailId(CK_LT, trrcvtagdetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvtagdetailId The value of trrcvtagdetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvtagdetailId_GreaterEqual(Long trrcvtagdetailId) {
        regTrrcvtagdetailId(CK_GE, trrcvtagdetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvtagdetailId The value of trrcvtagdetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvtagdetailId_LessEqual(Long trrcvtagdetailId) {
        regTrrcvtagdetailId(CK_LE, trrcvtagdetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trrcvtagdetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trrcvtagdetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrrcvtagdetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrrcvtagdetailId(), "TRRCVTAGDETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvtagdetailIdList The collection of trrcvtagdetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrrcvtagdetailId_InScope(Collection<Long> trrcvtagdetailIdList) {
        doSetTrrcvtagdetailId_InScope(trrcvtagdetailIdList);
    }

    protected void doSetTrrcvtagdetailId_InScope(Collection<Long> trrcvtagdetailIdList) {
        regINS(CK_INS, cTL(trrcvtagdetailIdList), xgetCValueTrrcvtagdetailId(), "TRRCVTAGDETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvtagdetailIdList The collection of trrcvtagdetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrrcvtagdetailId_NotInScope(Collection<Long> trrcvtagdetailIdList) {
        doSetTrrcvtagdetailId_NotInScope(trrcvtagdetailIdList);
    }

    protected void doSetTrrcvtagdetailId_NotInScope(Collection<Long> trrcvtagdetailIdList) {
        regINS(CK_NINS, cTL(trrcvtagdetailIdList), xgetCValueTrrcvtagdetailId(), "TRRCVTAGDETAIL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrrcvtagdetailId_IsNull() { regTrrcvtagdetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrrcvtagdetailId_IsNotNull() { regTrrcvtagdetailId(CK_ISNN, DOBJ); }

    protected void regTrrcvtagdetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrrcvtagdetailId(), "TRRCVTAGDETAIL_ID"); }
    protected abstract ConditionValue xgetCValueTrrcvtagdetailId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVTAGKEY: {NotNull, decimal(16, 6)}
     * @param rcvtagkey The value of rcvtagkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvtagkey_Equal(java.math.BigDecimal rcvtagkey) {
        doSetRcvtagkey_Equal(rcvtagkey);
    }

    protected void doSetRcvtagkey_Equal(java.math.BigDecimal rcvtagkey) {
        regRcvtagkey(CK_EQ, rcvtagkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVTAGKEY: {NotNull, decimal(16, 6)}
     * @param rcvtagkey The value of rcvtagkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvtagkey_NotEqual(java.math.BigDecimal rcvtagkey) {
        doSetRcvtagkey_NotEqual(rcvtagkey);
    }

    protected void doSetRcvtagkey_NotEqual(java.math.BigDecimal rcvtagkey) {
        regRcvtagkey(CK_NES, rcvtagkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVTAGKEY: {NotNull, decimal(16, 6)}
     * @param rcvtagkey The value of rcvtagkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvtagkey_GreaterThan(java.math.BigDecimal rcvtagkey) {
        regRcvtagkey(CK_GT, rcvtagkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVTAGKEY: {NotNull, decimal(16, 6)}
     * @param rcvtagkey The value of rcvtagkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvtagkey_LessThan(java.math.BigDecimal rcvtagkey) {
        regRcvtagkey(CK_LT, rcvtagkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVTAGKEY: {NotNull, decimal(16, 6)}
     * @param rcvtagkey The value of rcvtagkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvtagkey_GreaterEqual(java.math.BigDecimal rcvtagkey) {
        regRcvtagkey(CK_GE, rcvtagkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVTAGKEY: {NotNull, decimal(16, 6)}
     * @param rcvtagkey The value of rcvtagkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvtagkey_LessEqual(java.math.BigDecimal rcvtagkey) {
        regRcvtagkey(CK_LE, rcvtagkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVTAGKEY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of rcvtagkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvtagkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvtagkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvtagkey(), "RCVTAGKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVTAGKEY: {NotNull, decimal(16, 6)}
     * @param rcvtagkeyList The collection of rcvtagkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvtagkey_InScope(Collection<java.math.BigDecimal> rcvtagkeyList) {
        doSetRcvtagkey_InScope(rcvtagkeyList);
    }

    protected void doSetRcvtagkey_InScope(Collection<java.math.BigDecimal> rcvtagkeyList) {
        regINS(CK_INS, cTL(rcvtagkeyList), xgetCValueRcvtagkey(), "RCVTAGKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVTAGKEY: {NotNull, decimal(16, 6)}
     * @param rcvtagkeyList The collection of rcvtagkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvtagkey_NotInScope(Collection<java.math.BigDecimal> rcvtagkeyList) {
        doSetRcvtagkey_NotInScope(rcvtagkeyList);
    }

    protected void doSetRcvtagkey_NotInScope(Collection<java.math.BigDecimal> rcvtagkeyList) {
        regINS(CK_NINS, cTL(rcvtagkeyList), xgetCValueRcvtagkey(), "RCVTAGKEY");
    }

    protected void regRcvtagkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvtagkey(), "RCVTAGKEY"); }
    protected abstract ConditionValue xgetCValueRcvtagkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {IX+, decimal(16, 6)}
     * @param acceptkey The value of acceptkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptkey_Equal(java.math.BigDecimal acceptkey) {
        doSetAcceptkey_Equal(acceptkey);
    }

    protected void doSetAcceptkey_Equal(java.math.BigDecimal acceptkey) {
        regAcceptkey(CK_EQ, acceptkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {IX+, decimal(16, 6)}
     * @param acceptkey The value of acceptkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptkey_NotEqual(java.math.BigDecimal acceptkey) {
        doSetAcceptkey_NotEqual(acceptkey);
    }

    protected void doSetAcceptkey_NotEqual(java.math.BigDecimal acceptkey) {
        regAcceptkey(CK_NES, acceptkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {IX+, decimal(16, 6)}
     * @param acceptkey The value of acceptkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptkey_GreaterThan(java.math.BigDecimal acceptkey) {
        regAcceptkey(CK_GT, acceptkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {IX+, decimal(16, 6)}
     * @param acceptkey The value of acceptkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptkey_LessThan(java.math.BigDecimal acceptkey) {
        regAcceptkey(CK_LT, acceptkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {IX+, decimal(16, 6)}
     * @param acceptkey The value of acceptkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptkey_GreaterEqual(java.math.BigDecimal acceptkey) {
        regAcceptkey(CK_GE, acceptkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {IX+, decimal(16, 6)}
     * @param acceptkey The value of acceptkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptkey_LessEqual(java.math.BigDecimal acceptkey) {
        regAcceptkey(CK_LE, acceptkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {IX+, decimal(16, 6)}
     * @param minNumber The min number of acceptkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of acceptkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAcceptkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAcceptkey(), "ACCEPTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACCEPTKEY: {IX+, decimal(16, 6)}
     * @param acceptkeyList The collection of acceptkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptkey_InScope(Collection<java.math.BigDecimal> acceptkeyList) {
        doSetAcceptkey_InScope(acceptkeyList);
    }

    protected void doSetAcceptkey_InScope(Collection<java.math.BigDecimal> acceptkeyList) {
        regINS(CK_INS, cTL(acceptkeyList), xgetCValueAcceptkey(), "ACCEPTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACCEPTKEY: {IX+, decimal(16, 6)}
     * @param acceptkeyList The collection of acceptkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptkey_NotInScope(Collection<java.math.BigDecimal> acceptkeyList) {
        doSetAcceptkey_NotInScope(acceptkeyList);
    }

    protected void doSetAcceptkey_NotInScope(Collection<java.math.BigDecimal> acceptkeyList) {
        regINS(CK_NINS, cTL(acceptkeyList), xgetCValueAcceptkey(), "ACCEPTKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACCEPTKEY: {IX+, decimal(16, 6)}
     */
    public void setAcceptkey_IsNull() { regAcceptkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACCEPTKEY: {IX+, decimal(16, 6)}
     */
    public void setAcceptkey_IsNotNull() { regAcceptkey(CK_ISNN, DOBJ); }

    protected void regAcceptkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAcceptkey(), "ACCEPTKEY"); }
    protected abstract ConditionValue xgetCValueAcceptkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTLINENO: {bigint(19)}
     * @param acceptlineno The value of acceptlineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptlineno_Equal(Long acceptlineno) {
        doSetAcceptlineno_Equal(acceptlineno);
    }

    protected void doSetAcceptlineno_Equal(Long acceptlineno) {
        regAcceptlineno(CK_EQ, acceptlineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTLINENO: {bigint(19)}
     * @param acceptlineno The value of acceptlineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptlineno_NotEqual(Long acceptlineno) {
        doSetAcceptlineno_NotEqual(acceptlineno);
    }

    protected void doSetAcceptlineno_NotEqual(Long acceptlineno) {
        regAcceptlineno(CK_NES, acceptlineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTLINENO: {bigint(19)}
     * @param acceptlineno The value of acceptlineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptlineno_GreaterThan(Long acceptlineno) {
        regAcceptlineno(CK_GT, acceptlineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTLINENO: {bigint(19)}
     * @param acceptlineno The value of acceptlineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptlineno_LessThan(Long acceptlineno) {
        regAcceptlineno(CK_LT, acceptlineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTLINENO: {bigint(19)}
     * @param acceptlineno The value of acceptlineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptlineno_GreaterEqual(Long acceptlineno) {
        regAcceptlineno(CK_GE, acceptlineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTLINENO: {bigint(19)}
     * @param acceptlineno The value of acceptlineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptlineno_LessEqual(Long acceptlineno) {
        regAcceptlineno(CK_LE, acceptlineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTLINENO: {bigint(19)}
     * @param minNumber The min number of acceptlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of acceptlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAcceptlineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAcceptlineno(), "ACCEPTLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACCEPTLINENO: {bigint(19)}
     * @param acceptlinenoList The collection of acceptlineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptlineno_InScope(Collection<Long> acceptlinenoList) {
        doSetAcceptlineno_InScope(acceptlinenoList);
    }

    protected void doSetAcceptlineno_InScope(Collection<Long> acceptlinenoList) {
        regINS(CK_INS, cTL(acceptlinenoList), xgetCValueAcceptlineno(), "ACCEPTLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACCEPTLINENO: {bigint(19)}
     * @param acceptlinenoList The collection of acceptlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptlineno_NotInScope(Collection<Long> acceptlinenoList) {
        doSetAcceptlineno_NotInScope(acceptlinenoList);
    }

    protected void doSetAcceptlineno_NotInScope(Collection<Long> acceptlinenoList) {
        regINS(CK_NINS, cTL(acceptlinenoList), xgetCValueAcceptlineno(), "ACCEPTLINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACCEPTLINENO: {bigint(19)}
     */
    public void setAcceptlineno_IsNull() { regAcceptlineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACCEPTLINENO: {bigint(19)}
     */
    public void setAcceptlineno_IsNotNull() { regAcceptlineno(CK_ISNN, DOBJ); }

    protected void regAcceptlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAcceptlineno(), "ACCEPTLINENO"); }
    protected abstract ConditionValue xgetCValueAcceptlineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {IX+, NotNull, decimal(16, 6)}
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
     * RCVKEY: {IX+, NotNull, decimal(16, 6)}
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
     * RCVKEY: {IX+, NotNull, decimal(16, 6)}
     * @param rcvkey The value of rcvkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterThan(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_GT, rcvkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {IX+, NotNull, decimal(16, 6)}
     * @param rcvkey The value of rcvkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessThan(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_LT, rcvkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {IX+, NotNull, decimal(16, 6)}
     * @param rcvkey The value of rcvkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_GE, rcvkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {IX+, NotNull, decimal(16, 6)}
     * @param rcvkey The value of rcvkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_LE, rcvkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {IX+, NotNull, decimal(16, 6)}
     * @param minNumber The min number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvkey(), "RCVKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVKEY: {IX+, NotNull, decimal(16, 6)}
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
     * RCVKEY: {IX+, NotNull, decimal(16, 6)}
     * @param rcvkeyList The collection of rcvkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_NotInScope(Collection<java.math.BigDecimal> rcvkeyList) {
        doSetRcvkey_NotInScope(rcvkeyList);
    }

    protected void doSetRcvkey_NotInScope(Collection<java.math.BigDecimal> rcvkeyList) {
        regINS(CK_NINS, cTL(rcvkeyList), xgetCValueRcvkey(), "RCVKEY");
    }

    protected void regRcvkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvkey(), "RCVKEY"); }
    protected abstract ConditionValue xgetCValueRcvkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {NotNull, bigint(19)}
     * @param rcvlineno The value of rcvlineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_Equal(Long rcvlineno) {
        doSetRcvlineno_Equal(rcvlineno);
    }

    protected void doSetRcvlineno_Equal(Long rcvlineno) {
        regRcvlineno(CK_EQ, rcvlineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {NotNull, bigint(19)}
     * @param rcvlineno The value of rcvlineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_NotEqual(Long rcvlineno) {
        doSetRcvlineno_NotEqual(rcvlineno);
    }

    protected void doSetRcvlineno_NotEqual(Long rcvlineno) {
        regRcvlineno(CK_NES, rcvlineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {NotNull, bigint(19)}
     * @param rcvlineno The value of rcvlineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_GreaterThan(Long rcvlineno) {
        regRcvlineno(CK_GT, rcvlineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {NotNull, bigint(19)}
     * @param rcvlineno The value of rcvlineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_LessThan(Long rcvlineno) {
        regRcvlineno(CK_LT, rcvlineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {NotNull, bigint(19)}
     * @param rcvlineno The value of rcvlineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_GreaterEqual(Long rcvlineno) {
        regRcvlineno(CK_GE, rcvlineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {NotNull, bigint(19)}
     * @param rcvlineno The value of rcvlineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_LessEqual(Long rcvlineno) {
        regRcvlineno(CK_LE, rcvlineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {NotNull, bigint(19)}
     * @param minNumber The min number of rcvlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvlineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvlineno(), "RCVLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVLINENO: {NotNull, bigint(19)}
     * @param rcvlinenoList The collection of rcvlineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlineno_InScope(Collection<Long> rcvlinenoList) {
        doSetRcvlineno_InScope(rcvlinenoList);
    }

    protected void doSetRcvlineno_InScope(Collection<Long> rcvlinenoList) {
        regINS(CK_INS, cTL(rcvlinenoList), xgetCValueRcvlineno(), "RCVLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVLINENO: {NotNull, bigint(19)}
     * @param rcvlinenoList The collection of rcvlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlineno_NotInScope(Collection<Long> rcvlinenoList) {
        doSetRcvlineno_NotInScope(rcvlinenoList);
    }

    protected void doSetRcvlineno_NotInScope(Collection<Long> rcvlinenoList) {
        regINS(CK_NINS, cTL(rcvlinenoList), xgetCValueRcvlineno(), "RCVLINENO");
    }

    protected void regRcvlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvlineno(), "RCVLINENO"); }
    protected abstract ConditionValue xgetCValueRcvlineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param sts The value of sts as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_Equal(Long sts) {
        doSetSts_Equal(sts);
    }

    protected void doSetSts_Equal(Long sts) {
        regSts(CK_EQ, sts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param sts The value of sts as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_NotEqual(Long sts) {
        doSetSts_NotEqual(sts);
    }

    protected void doSetSts_NotEqual(Long sts) {
        regSts(CK_NES, sts);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param sts The value of sts as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_GreaterThan(Long sts) {
        regSts(CK_GT, sts);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param sts The value of sts as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_LessThan(Long sts) {
        regSts(CK_LT, sts);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param sts The value of sts as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_GreaterEqual(Long sts) {
        regSts(CK_GE, sts);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param sts The value of sts as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_LessEqual(Long sts) {
        regSts(CK_LE, sts);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param minNumber The min number of sts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSts_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSts(), "STS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param stsList The collection of sts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_InScope(Collection<Long> stsList) {
        doSetSts_InScope(stsList);
    }

    protected void doSetSts_InScope(Collection<Long> stsList) {
        regINS(CK_INS, cTL(stsList), xgetCValueSts(), "STS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @param stsList The collection of sts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_NotInScope(Collection<Long> stsList) {
        doSetSts_NotInScope(stsList);
    }

    protected void doSetSts_NotInScope(Collection<Long> stsList) {
        regINS(CK_NINS, cTL(stsList), xgetCValueSts(), "STS");
    }

    protected void regSts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSts(), "STS"); }
    protected abstract ConditionValue xgetCValueSts();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercd The value of ownercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_Equal(String ownercd) {
        doSetOwnercd_Equal(fRES(ownercd));
    }

    protected void doSetOwnercd_Equal(String ownercd) {
        regOwnercd(CK_EQ, ownercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercd The value of ownercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_NotEqual(String ownercd) {
        doSetOwnercd_NotEqual(fRES(ownercd));
    }

    protected void doSetOwnercd_NotEqual(String ownercd) {
        regOwnercd(CK_NES, ownercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercd The value of ownercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_GreaterThan(String ownercd) {
        regOwnercd(CK_GT, fRES(ownercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercd The value of ownercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_LessThan(String ownercd) {
        regOwnercd(CK_LT, fRES(ownercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercd The value of ownercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_GreaterEqual(String ownercd) {
        regOwnercd(CK_GE, fRES(ownercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercd The value of ownercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_LessEqual(String ownercd) {
        regOwnercd(CK_LE, fRES(ownercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercdList The collection of ownercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_InScope(Collection<String> ownercdList) {
        doSetOwnercd_InScope(ownercdList);
    }

    protected void doSetOwnercd_InScope(Collection<String> ownercdList) {
        regINS(CK_INS, cTL(ownercdList), xgetCValueOwnercd(), "OWNERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercdList The collection of ownercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_NotInScope(Collection<String> ownercdList) {
        doSetOwnercd_NotInScope(ownercdList);
    }

    protected void doSetOwnercd_NotInScope(Collection<String> ownercdList) {
        regINS(CK_NINS, cTL(ownercdList), xgetCValueOwnercd(), "OWNERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)} <br>
     * <pre>e.g. setOwnercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownercd The value of ownercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnercd_LikeSearch(String ownercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownercd), xgetCValueOwnercd(), "OWNERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercd The value of ownercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnercd_NotLikeSearch(String ownercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownercd), xgetCValueOwnercd(), "OWNERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @param ownercd The value of ownercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_PrefixSearch(String ownercd) {
        setOwnercd_LikeSearch(ownercd, xcLSOPPre());
    }

    protected void regOwnercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnercd(), "OWNERCD"); }
    protected abstract ConditionValue xgetCValueOwnercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_Equal(String itemadmin) {
        doSetItemadmin_Equal(fRES(itemadmin));
    }

    protected void doSetItemadmin_Equal(String itemadmin) {
        regItemadmin(CK_EQ, itemadmin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_NotEqual(String itemadmin) {
        doSetItemadmin_NotEqual(fRES(itemadmin));
    }

    protected void doSetItemadmin_NotEqual(String itemadmin) {
        regItemadmin(CK_NES, itemadmin);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_GreaterThan(String itemadmin) {
        regItemadmin(CK_GT, fRES(itemadmin));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_LessThan(String itemadmin) {
        regItemadmin(CK_LT, fRES(itemadmin));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_GreaterEqual(String itemadmin) {
        regItemadmin(CK_GE, fRES(itemadmin));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_LessEqual(String itemadmin) {
        regItemadmin(CK_LE, fRES(itemadmin));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadminList The collection of itemadmin as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_InScope(Collection<String> itemadminList) {
        doSetItemadmin_InScope(itemadminList);
    }

    protected void doSetItemadmin_InScope(Collection<String> itemadminList) {
        regINS(CK_INS, cTL(itemadminList), xgetCValueItemadmin(), "ITEMADMIN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadminList The collection of itemadmin as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_NotInScope(Collection<String> itemadminList) {
        doSetItemadmin_NotInScope(itemadminList);
    }

    protected void doSetItemadmin_NotInScope(Collection<String> itemadminList) {
        regINS(CK_NINS, cTL(itemadminList), xgetCValueItemadmin(), "ITEMADMIN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)} <br>
     * <pre>e.g. setItemadmin_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemadmin The value of itemadmin as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemadmin_LikeSearch(String itemadmin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemadmin), xgetCValueItemadmin(), "ITEMADMIN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemadmin_NotLikeSearch(String itemadmin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemadmin), xgetCValueItemadmin(), "ITEMADMIN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_PrefixSearch(String itemadmin) {
        setItemadmin_LikeSearch(itemadmin, xcLSOPPre());
    }

    protected void regItemadmin(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemadmin(), "ITEMADMIN"); }
    protected abstract ConditionValue xgetCValueItemadmin();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)} <br>
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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_Equal(String ifitemcd) {
        doSetIfitemcd_Equal(fRES(ifitemcd));
    }

    protected void doSetIfitemcd_Equal(String ifitemcd) {
        regIfitemcd(CK_EQ, ifitemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_NotEqual(String ifitemcd) {
        doSetIfitemcd_NotEqual(fRES(ifitemcd));
    }

    protected void doSetIfitemcd_NotEqual(String ifitemcd) {
        regIfitemcd(CK_NES, ifitemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_GreaterThan(String ifitemcd) {
        regIfitemcd(CK_GT, fRES(ifitemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_LessThan(String ifitemcd) {
        regIfitemcd(CK_LT, fRES(ifitemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_GreaterEqual(String ifitemcd) {
        regIfitemcd(CK_GE, fRES(ifitemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_LessEqual(String ifitemcd) {
        regIfitemcd(CK_LE, fRES(ifitemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcdList The collection of ifitemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_InScope(Collection<String> ifitemcdList) {
        doSetIfitemcd_InScope(ifitemcdList);
    }

    protected void doSetIfitemcd_InScope(Collection<String> ifitemcdList) {
        regINS(CK_INS, cTL(ifitemcdList), xgetCValueIfitemcd(), "IFITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcdList The collection of ifitemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_NotInScope(Collection<String> ifitemcdList) {
        doSetIfitemcd_NotInScope(ifitemcdList);
    }

    protected void doSetIfitemcd_NotInScope(Collection<String> ifitemcdList) {
        regINS(CK_NINS, cTL(ifitemcdList), xgetCValueIfitemcd(), "IFITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFITEMCD: {varchar(30)} <br>
     * <pre>e.g. setIfitemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ifitemcd The value of ifitemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIfitemcd_LikeSearch(String ifitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ifitemcd), xgetCValueIfitemcd(), "IFITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIfitemcd_NotLikeSearch(String ifitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ifitemcd), xgetCValueIfitemcd(), "IFITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_PrefixSearch(String ifitemcd) {
        setIfitemcd_LikeSearch(ifitemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     */
    public void setIfitemcd_IsNull() { regIfitemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     */
    public void setIfitemcd_IsNullOrEmpty() { regIfitemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     */
    public void setIfitemcd_IsNotNull() { regIfitemcd(CK_ISNN, DOBJ); }

    protected void regIfitemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIfitemcd(), "IFITEMCD"); }
    protected abstract ConditionValue xgetCValueIfitemcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
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
     * LOT1: {varchar(60)}
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
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterThan(String lot1) {
        regLot1(CK_GT, fRES(lot1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessThan(String lot1) {
        regLot1(CK_LT, fRES(lot1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterEqual(String lot1) {
        regLot1(CK_GE, fRES(lot1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessEqual(String lot1) {
        regLot1(CK_LE, fRES(lot1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
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
     * LOT1: {varchar(60)}
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
     * LOT1: {varchar(60)} <br>
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
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot1_NotLikeSearch(String lot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot1), xgetCValueLot1(), "LOT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_PrefixSearch(String lot1) {
        setLot1_LikeSearch(lot1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNull() { regLot1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNullOrEmpty() { regLot1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNotNull() { regLot1(CK_ISNN, DOBJ); }

    protected void regLot1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot1(), "LOT1"); }
    protected abstract ConditionValue xgetCValueLot1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
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
     * LOT2: {varchar(60)}
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
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_GreaterThan(String lot2) {
        regLot2(CK_GT, fRES(lot2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_LessThan(String lot2) {
        regLot2(CK_LT, fRES(lot2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_GreaterEqual(String lot2) {
        regLot2(CK_GE, fRES(lot2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_LessEqual(String lot2) {
        regLot2(CK_LE, fRES(lot2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)}
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
     * LOT2: {varchar(60)}
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
     * LOT2: {varchar(60)} <br>
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
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot2_NotLikeSearch(String lot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot2), xgetCValueLot2(), "LOT2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_PrefixSearch(String lot2) {
        setLot2_LikeSearch(lot2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     */
    public void setLot2_IsNull() { regLot2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     */
    public void setLot2_IsNullOrEmpty() { regLot2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     */
    public void setLot2_IsNotNull() { regLot2(CK_ISNN, DOBJ); }

    protected void regLot2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot2(), "LOT2"); }
    protected abstract ConditionValue xgetCValueLot2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
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
     * LOT3: {varchar(60)}
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
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterThan(String lot3) {
        regLot3(CK_GT, fRES(lot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessThan(String lot3) {
        regLot3(CK_LT, fRES(lot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterEqual(String lot3) {
        regLot3(CK_GE, fRES(lot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessEqual(String lot3) {
        regLot3(CK_LE, fRES(lot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
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
     * LOT3: {varchar(60)}
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
     * LOT3: {varchar(60)} <br>
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
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot3_NotLikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_PrefixSearch(String lot3) {
        setLot3_LikeSearch(lot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     */
    public void setLot3_IsNull() { regLot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     */
    public void setLot3_IsNullOrEmpty() { regLot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
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
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_Equal(String lot5) {
        doSetLot5_Equal(fRES(lot5));
    }

    protected void doSetLot5_Equal(String lot5) {
        regLot5(CK_EQ, lot5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_NotEqual(String lot5) {
        doSetLot5_NotEqual(fRES(lot5));
    }

    protected void doSetLot5_NotEqual(String lot5) {
        regLot5(CK_NES, lot5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_GreaterThan(String lot5) {
        regLot5(CK_GT, fRES(lot5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_LessThan(String lot5) {
        regLot5(CK_LT, fRES(lot5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_GreaterEqual(String lot5) {
        regLot5(CK_GE, fRES(lot5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_LessEqual(String lot5) {
        regLot5(CK_LE, fRES(lot5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5List The collection of lot5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_InScope(Collection<String> lot5List) {
        doSetLot5_InScope(lot5List);
    }

    protected void doSetLot5_InScope(Collection<String> lot5List) {
        regINS(CK_INS, cTL(lot5List), xgetCValueLot5(), "LOT5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5List The collection of lot5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_NotInScope(Collection<String> lot5List) {
        doSetLot5_NotInScope(lot5List);
    }

    protected void doSetLot5_NotInScope(Collection<String> lot5List) {
        regINS(CK_NINS, cTL(lot5List), xgetCValueLot5(), "LOT5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT5: {varchar(8)} <br>
     * <pre>e.g. setLot5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot5 The value of lot5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot5_LikeSearch(String lot5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot5), xgetCValueLot5(), "LOT5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot5_NotLikeSearch(String lot5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot5), xgetCValueLot5(), "LOT5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_PrefixSearch(String lot5) {
        setLot5_LikeSearch(lot5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     */
    public void setLot5_IsNull() { regLot5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     */
    public void setLot5_IsNullOrEmpty() { regLot5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     */
    public void setLot5_IsNotNull() { regLot5(CK_ISNN, DOBJ); }

    protected void regLot5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot5(), "LOT5"); }
    protected abstract ConditionValue xgetCValueLot5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_Equal(String otherlot1) {
        doSetOtherlot1_Equal(fRES(otherlot1));
    }

    protected void doSetOtherlot1_Equal(String otherlot1) {
        regOtherlot1(CK_EQ, otherlot1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_NotEqual(String otherlot1) {
        doSetOtherlot1_NotEqual(fRES(otherlot1));
    }

    protected void doSetOtherlot1_NotEqual(String otherlot1) {
        regOtherlot1(CK_NES, otherlot1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_GreaterThan(String otherlot1) {
        regOtherlot1(CK_GT, fRES(otherlot1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_LessThan(String otherlot1) {
        regOtherlot1(CK_LT, fRES(otherlot1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_GreaterEqual(String otherlot1) {
        regOtherlot1(CK_GE, fRES(otherlot1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_LessEqual(String otherlot1) {
        regOtherlot1(CK_LE, fRES(otherlot1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1List The collection of otherlot1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_InScope(Collection<String> otherlot1List) {
        doSetOtherlot1_InScope(otherlot1List);
    }

    protected void doSetOtherlot1_InScope(Collection<String> otherlot1List) {
        regINS(CK_INS, cTL(otherlot1List), xgetCValueOtherlot1(), "OTHERLOT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1List The collection of otherlot1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_NotInScope(Collection<String> otherlot1List) {
        doSetOtherlot1_NotInScope(otherlot1List);
    }

    protected void doSetOtherlot1_NotInScope(Collection<String> otherlot1List) {
        regINS(CK_NINS, cTL(otherlot1List), xgetCValueOtherlot1(), "OTHERLOT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)} <br>
     * <pre>e.g. setOtherlot1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherlot1 The value of otherlot1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherlot1_LikeSearch(String otherlot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherlot1), xgetCValueOtherlot1(), "OTHERLOT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherlot1_NotLikeSearch(String otherlot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherlot1), xgetCValueOtherlot1(), "OTHERLOT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_PrefixSearch(String otherlot1) {
        setOtherlot1_LikeSearch(otherlot1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     */
    public void setOtherlot1_IsNull() { regOtherlot1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     */
    public void setOtherlot1_IsNullOrEmpty() { regOtherlot1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     */
    public void setOtherlot1_IsNotNull() { regOtherlot1(CK_ISNN, DOBJ); }

    protected void regOtherlot1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot1(), "OTHERLOT1"); }
    protected abstract ConditionValue xgetCValueOtherlot1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_Equal(String otherlot2) {
        doSetOtherlot2_Equal(fRES(otherlot2));
    }

    protected void doSetOtherlot2_Equal(String otherlot2) {
        regOtherlot2(CK_EQ, otherlot2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_NotEqual(String otherlot2) {
        doSetOtherlot2_NotEqual(fRES(otherlot2));
    }

    protected void doSetOtherlot2_NotEqual(String otherlot2) {
        regOtherlot2(CK_NES, otherlot2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_GreaterThan(String otherlot2) {
        regOtherlot2(CK_GT, fRES(otherlot2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_LessThan(String otherlot2) {
        regOtherlot2(CK_LT, fRES(otherlot2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_GreaterEqual(String otherlot2) {
        regOtherlot2(CK_GE, fRES(otherlot2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_LessEqual(String otherlot2) {
        regOtherlot2(CK_LE, fRES(otherlot2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2List The collection of otherlot2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_InScope(Collection<String> otherlot2List) {
        doSetOtherlot2_InScope(otherlot2List);
    }

    protected void doSetOtherlot2_InScope(Collection<String> otherlot2List) {
        regINS(CK_INS, cTL(otherlot2List), xgetCValueOtherlot2(), "OTHERLOT2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2List The collection of otherlot2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_NotInScope(Collection<String> otherlot2List) {
        doSetOtherlot2_NotInScope(otherlot2List);
    }

    protected void doSetOtherlot2_NotInScope(Collection<String> otherlot2List) {
        regINS(CK_NINS, cTL(otherlot2List), xgetCValueOtherlot2(), "OTHERLOT2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT2: {varchar(60)} <br>
     * <pre>e.g. setOtherlot2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherlot2 The value of otherlot2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherlot2_LikeSearch(String otherlot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherlot2), xgetCValueOtherlot2(), "OTHERLOT2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherlot2_NotLikeSearch(String otherlot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherlot2), xgetCValueOtherlot2(), "OTHERLOT2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_PrefixSearch(String otherlot2) {
        setOtherlot2_LikeSearch(otherlot2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     */
    public void setOtherlot2_IsNull() { regOtherlot2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     */
    public void setOtherlot2_IsNullOrEmpty() { regOtherlot2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     */
    public void setOtherlot2_IsNotNull() { regOtherlot2(CK_ISNN, DOBJ); }

    protected void regOtherlot2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot2(), "OTHERLOT2"); }
    protected abstract ConditionValue xgetCValueOtherlot2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_Equal(String otherlot3) {
        doSetOtherlot3_Equal(fRES(otherlot3));
    }

    protected void doSetOtherlot3_Equal(String otherlot3) {
        regOtherlot3(CK_EQ, otherlot3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_NotEqual(String otherlot3) {
        doSetOtherlot3_NotEqual(fRES(otherlot3));
    }

    protected void doSetOtherlot3_NotEqual(String otherlot3) {
        regOtherlot3(CK_NES, otherlot3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_GreaterThan(String otherlot3) {
        regOtherlot3(CK_GT, fRES(otherlot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_LessThan(String otherlot3) {
        regOtherlot3(CK_LT, fRES(otherlot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_GreaterEqual(String otherlot3) {
        regOtherlot3(CK_GE, fRES(otherlot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_LessEqual(String otherlot3) {
        regOtherlot3(CK_LE, fRES(otherlot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3List The collection of otherlot3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_InScope(Collection<String> otherlot3List) {
        doSetOtherlot3_InScope(otherlot3List);
    }

    protected void doSetOtherlot3_InScope(Collection<String> otherlot3List) {
        regINS(CK_INS, cTL(otherlot3List), xgetCValueOtherlot3(), "OTHERLOT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3List The collection of otherlot3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_NotInScope(Collection<String> otherlot3List) {
        doSetOtherlot3_NotInScope(otherlot3List);
    }

    protected void doSetOtherlot3_NotInScope(Collection<String> otherlot3List) {
        regINS(CK_NINS, cTL(otherlot3List), xgetCValueOtherlot3(), "OTHERLOT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT3: {varchar(60)} <br>
     * <pre>e.g. setOtherlot3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherlot3 The value of otherlot3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherlot3_LikeSearch(String otherlot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherlot3), xgetCValueOtherlot3(), "OTHERLOT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherlot3_NotLikeSearch(String otherlot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherlot3), xgetCValueOtherlot3(), "OTHERLOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_PrefixSearch(String otherlot3) {
        setOtherlot3_LikeSearch(otherlot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     */
    public void setOtherlot3_IsNull() { regOtherlot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     */
    public void setOtherlot3_IsNullOrEmpty() { regOtherlot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     */
    public void setOtherlot3_IsNotNull() { regOtherlot3(CK_ISNN, DOBJ); }

    protected void regOtherlot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot3(), "OTHERLOT3"); }
    protected abstract ConditionValue xgetCValueOtherlot3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_Equal(String otherlot4) {
        doSetOtherlot4_Equal(fRES(otherlot4));
    }

    protected void doSetOtherlot4_Equal(String otherlot4) {
        regOtherlot4(CK_EQ, otherlot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_NotEqual(String otherlot4) {
        doSetOtherlot4_NotEqual(fRES(otherlot4));
    }

    protected void doSetOtherlot4_NotEqual(String otherlot4) {
        regOtherlot4(CK_NES, otherlot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_GreaterThan(String otherlot4) {
        regOtherlot4(CK_GT, fRES(otherlot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_LessThan(String otherlot4) {
        regOtherlot4(CK_LT, fRES(otherlot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_GreaterEqual(String otherlot4) {
        regOtherlot4(CK_GE, fRES(otherlot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_LessEqual(String otherlot4) {
        regOtherlot4(CK_LE, fRES(otherlot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4List The collection of otherlot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_InScope(Collection<String> otherlot4List) {
        doSetOtherlot4_InScope(otherlot4List);
    }

    protected void doSetOtherlot4_InScope(Collection<String> otherlot4List) {
        regINS(CK_INS, cTL(otherlot4List), xgetCValueOtherlot4(), "OTHERLOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4List The collection of otherlot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_NotInScope(Collection<String> otherlot4List) {
        doSetOtherlot4_NotInScope(otherlot4List);
    }

    protected void doSetOtherlot4_NotInScope(Collection<String> otherlot4List) {
        regINS(CK_NINS, cTL(otherlot4List), xgetCValueOtherlot4(), "OTHERLOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT4: {varchar(60)} <br>
     * <pre>e.g. setOtherlot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherlot4 The value of otherlot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherlot4_LikeSearch(String otherlot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherlot4), xgetCValueOtherlot4(), "OTHERLOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherlot4_NotLikeSearch(String otherlot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherlot4), xgetCValueOtherlot4(), "OTHERLOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_PrefixSearch(String otherlot4) {
        setOtherlot4_LikeSearch(otherlot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     */
    public void setOtherlot4_IsNull() { regOtherlot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     */
    public void setOtherlot4_IsNullOrEmpty() { regOtherlot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     */
    public void setOtherlot4_IsNotNull() { regOtherlot4(CK_ISNN, DOBJ); }

    protected void regOtherlot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot4(), "OTHERLOT4"); }
    protected abstract ConditionValue xgetCValueOtherlot4();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_Equal(java.math.BigDecimal otherlot5) {
        doSetOtherlot5_Equal(otherlot5);
    }

    protected void doSetOtherlot5_Equal(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_EQ, otherlot5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_NotEqual(java.math.BigDecimal otherlot5) {
        doSetOtherlot5_NotEqual(otherlot5);
    }

    protected void doSetOtherlot5_NotEqual(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_NES, otherlot5);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_GreaterThan(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_GT, otherlot5);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_LessThan(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_LT, otherlot5);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_GreaterEqual(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_GE, otherlot5);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_LessEqual(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_LE, otherlot5);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param minNumber The min number of otherlot5. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of otherlot5. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOtherlot5_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOtherlot5(), "OTHERLOT5", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5List The collection of otherlot5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot5_InScope(Collection<java.math.BigDecimal> otherlot5List) {
        doSetOtherlot5_InScope(otherlot5List);
    }

    protected void doSetOtherlot5_InScope(Collection<java.math.BigDecimal> otherlot5List) {
        regINS(CK_INS, cTL(otherlot5List), xgetCValueOtherlot5(), "OTHERLOT5");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5List The collection of otherlot5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot5_NotInScope(Collection<java.math.BigDecimal> otherlot5List) {
        doSetOtherlot5_NotInScope(otherlot5List);
    }

    protected void doSetOtherlot5_NotInScope(Collection<java.math.BigDecimal> otherlot5List) {
        regINS(CK_NINS, cTL(otherlot5List), xgetCValueOtherlot5(), "OTHERLOT5");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     */
    public void setOtherlot5_IsNull() { regOtherlot5(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     */
    public void setOtherlot5_IsNotNull() { regOtherlot5(CK_ISNN, DOBJ); }

    protected void regOtherlot5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot5(), "OTHERLOT5"); }
    protected abstract ConditionValue xgetCValueOtherlot5();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_Equal(java.math.BigDecimal damageflg) {
        doSetDamageflg_Equal(damageflg);
    }

    protected void doSetDamageflg_Equal(java.math.BigDecimal damageflg) {
        regDamageflg(CK_EQ, damageflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_NotEqual(java.math.BigDecimal damageflg) {
        doSetDamageflg_NotEqual(damageflg);
    }

    protected void doSetDamageflg_NotEqual(java.math.BigDecimal damageflg) {
        regDamageflg(CK_NES, damageflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_GreaterThan(java.math.BigDecimal damageflg) {
        regDamageflg(CK_GT, damageflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_LessThan(java.math.BigDecimal damageflg) {
        regDamageflg(CK_LT, damageflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_GreaterEqual(java.math.BigDecimal damageflg) {
        regDamageflg(CK_GE, damageflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_LessEqual(java.math.BigDecimal damageflg) {
        regDamageflg(CK_LE, damageflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of damageflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of damageflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDamageflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDamageflg(), "DAMAGEFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param damageflgList The collection of damageflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_InScope(Collection<java.math.BigDecimal> damageflgList) {
        doSetDamageflg_InScope(damageflgList);
    }

    protected void doSetDamageflg_InScope(Collection<java.math.BigDecimal> damageflgList) {
        regINS(CK_INS, cTL(damageflgList), xgetCValueDamageflg(), "DAMAGEFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param damageflgList The collection of damageflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_NotInScope(Collection<java.math.BigDecimal> damageflgList) {
        doSetDamageflg_NotInScope(damageflgList);
    }

    protected void doSetDamageflg_NotInScope(Collection<java.math.BigDecimal> damageflgList) {
        regINS(CK_NINS, cTL(damageflgList), xgetCValueDamageflg(), "DAMAGEFLG");
    }

    protected void regDamageflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDamageflg(), "DAMAGEFLG"); }
    protected abstract ConditionValue xgetCValueDamageflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_Equal(java.math.BigDecimal noshippingflg) {
        doSetNoshippingflg_Equal(noshippingflg);
    }

    protected void doSetNoshippingflg_Equal(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_EQ, noshippingflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_NotEqual(java.math.BigDecimal noshippingflg) {
        doSetNoshippingflg_NotEqual(noshippingflg);
    }

    protected void doSetNoshippingflg_NotEqual(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_NES, noshippingflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_GreaterThan(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_GT, noshippingflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_LessThan(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_LT, noshippingflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_GreaterEqual(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_GE, noshippingflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_LessEqual(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_LE, noshippingflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of noshippingflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of noshippingflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNoshippingflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNoshippingflg(), "NOSHIPPINGFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param noshippingflgList The collection of noshippingflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_InScope(Collection<java.math.BigDecimal> noshippingflgList) {
        doSetNoshippingflg_InScope(noshippingflgList);
    }

    protected void doSetNoshippingflg_InScope(Collection<java.math.BigDecimal> noshippingflgList) {
        regINS(CK_INS, cTL(noshippingflgList), xgetCValueNoshippingflg(), "NOSHIPPINGFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param noshippingflgList The collection of noshippingflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_NotInScope(Collection<java.math.BigDecimal> noshippingflgList) {
        doSetNoshippingflg_NotInScope(noshippingflgList);
    }

    protected void doSetNoshippingflg_NotInScope(Collection<java.math.BigDecimal> noshippingflgList) {
        regINS(CK_NINS, cTL(noshippingflgList), xgetCValueNoshippingflg(), "NOSHIPPINGFLG");
    }

    protected void regNoshippingflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNoshippingflg(), "NOSHIPPINGFLG"); }
    protected abstract ConditionValue xgetCValueNoshippingflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_Equal(java.math.BigDecimal foreigncargoflg) {
        doSetForeigncargoflg_Equal(foreigncargoflg);
    }

    protected void doSetForeigncargoflg_Equal(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_EQ, foreigncargoflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_NotEqual(java.math.BigDecimal foreigncargoflg) {
        doSetForeigncargoflg_NotEqual(foreigncargoflg);
    }

    protected void doSetForeigncargoflg_NotEqual(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_NES, foreigncargoflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_GreaterThan(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_GT, foreigncargoflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_LessThan(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_LT, foreigncargoflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_GreaterEqual(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_GE, foreigncargoflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_LessEqual(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_LE, foreigncargoflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of foreigncargoflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of foreigncargoflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setForeigncargoflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param foreigncargoflgList The collection of foreigncargoflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_InScope(Collection<java.math.BigDecimal> foreigncargoflgList) {
        doSetForeigncargoflg_InScope(foreigncargoflgList);
    }

    protected void doSetForeigncargoflg_InScope(Collection<java.math.BigDecimal> foreigncargoflgList) {
        regINS(CK_INS, cTL(foreigncargoflgList), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param foreigncargoflgList The collection of foreigncargoflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_NotInScope(Collection<java.math.BigDecimal> foreigncargoflgList) {
        doSetForeigncargoflg_NotInScope(foreigncargoflgList);
    }

    protected void doSetForeigncargoflg_NotInScope(Collection<java.math.BigDecimal> foreigncargoflgList) {
        regINS(CK_NINS, cTL(foreigncargoflgList), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG");
    }

    protected void regForeigncargoflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG"); }
    protected abstract ConditionValue xgetCValueForeigncargoflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_Equal(java.math.BigDecimal customsreleaseflg) {
        doSetCustomsreleaseflg_Equal(customsreleaseflg);
    }

    protected void doSetCustomsreleaseflg_Equal(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_EQ, customsreleaseflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_NotEqual(java.math.BigDecimal customsreleaseflg) {
        doSetCustomsreleaseflg_NotEqual(customsreleaseflg);
    }

    protected void doSetCustomsreleaseflg_NotEqual(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_NES, customsreleaseflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_GreaterThan(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_GT, customsreleaseflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_LessThan(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_LT, customsreleaseflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_GreaterEqual(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_GE, customsreleaseflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_LessEqual(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_LE, customsreleaseflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of customsreleaseflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of customsreleaseflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCustomsreleaseflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param customsreleaseflgList The collection of customsreleaseflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_InScope(Collection<java.math.BigDecimal> customsreleaseflgList) {
        doSetCustomsreleaseflg_InScope(customsreleaseflgList);
    }

    protected void doSetCustomsreleaseflg_InScope(Collection<java.math.BigDecimal> customsreleaseflgList) {
        regINS(CK_INS, cTL(customsreleaseflgList), xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param customsreleaseflgList The collection of customsreleaseflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_NotInScope(Collection<java.math.BigDecimal> customsreleaseflgList) {
        doSetCustomsreleaseflg_NotInScope(customsreleaseflgList);
    }

    protected void doSetCustomsreleaseflg_NotInScope(Collection<java.math.BigDecimal> customsreleaseflgList) {
        regINS(CK_NINS, cTL(customsreleaseflgList), xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG");
    }

    protected void regCustomsreleaseflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG"); }
    protected abstract ConditionValue xgetCValueCustomsreleaseflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_Equal(java.math.BigDecimal taxflg) {
        doSetTaxflg_Equal(taxflg);
    }

    protected void doSetTaxflg_Equal(java.math.BigDecimal taxflg) {
        regTaxflg(CK_EQ, taxflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_NotEqual(java.math.BigDecimal taxflg) {
        doSetTaxflg_NotEqual(taxflg);
    }

    protected void doSetTaxflg_NotEqual(java.math.BigDecimal taxflg) {
        regTaxflg(CK_NES, taxflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_GreaterThan(java.math.BigDecimal taxflg) {
        regTaxflg(CK_GT, taxflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_LessThan(java.math.BigDecimal taxflg) {
        regTaxflg(CK_LT, taxflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_GreaterEqual(java.math.BigDecimal taxflg) {
        regTaxflg(CK_GE, taxflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_LessEqual(java.math.BigDecimal taxflg) {
        regTaxflg(CK_LE, taxflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of taxflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of taxflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTaxflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTaxflg(), "TAXFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param taxflgList The collection of taxflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_InScope(Collection<java.math.BigDecimal> taxflgList) {
        doSetTaxflg_InScope(taxflgList);
    }

    protected void doSetTaxflg_InScope(Collection<java.math.BigDecimal> taxflgList) {
        regINS(CK_INS, cTL(taxflgList), xgetCValueTaxflg(), "TAXFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param taxflgList The collection of taxflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_NotInScope(Collection<java.math.BigDecimal> taxflgList) {
        doSetTaxflg_NotInScope(taxflgList);
    }

    protected void doSetTaxflg_NotInScope(Collection<java.math.BigDecimal> taxflgList) {
        regINS(CK_NINS, cTL(taxflgList), xgetCValueTaxflg(), "TAXFLG");
    }

    protected void regTaxflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaxflg(), "TAXFLG"); }
    protected abstract ConditionValue xgetCValueTaxflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(30)}
     * @param logisticscd The value of logisticscd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_Equal(String logisticscd) {
        doSetLogisticscd_Equal(fRES(logisticscd));
    }

    protected void doSetLogisticscd_Equal(String logisticscd) {
        regLogisticscd(CK_EQ, logisticscd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(30)}
     * @param logisticscd The value of logisticscd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_NotEqual(String logisticscd) {
        doSetLogisticscd_NotEqual(fRES(logisticscd));
    }

    protected void doSetLogisticscd_NotEqual(String logisticscd) {
        regLogisticscd(CK_NES, logisticscd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(30)}
     * @param logisticscd The value of logisticscd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_GreaterThan(String logisticscd) {
        regLogisticscd(CK_GT, fRES(logisticscd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(30)}
     * @param logisticscd The value of logisticscd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_LessThan(String logisticscd) {
        regLogisticscd(CK_LT, fRES(logisticscd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(30)}
     * @param logisticscd The value of logisticscd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_GreaterEqual(String logisticscd) {
        regLogisticscd(CK_GE, fRES(logisticscd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(30)}
     * @param logisticscd The value of logisticscd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_LessEqual(String logisticscd) {
        regLogisticscd(CK_LE, fRES(logisticscd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {varchar(30)}
     * @param logisticscdList The collection of logisticscd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_InScope(Collection<String> logisticscdList) {
        doSetLogisticscd_InScope(logisticscdList);
    }

    protected void doSetLogisticscd_InScope(Collection<String> logisticscdList) {
        regINS(CK_INS, cTL(logisticscdList), xgetCValueLogisticscd(), "LOGISTICSCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {varchar(30)}
     * @param logisticscdList The collection of logisticscd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_NotInScope(Collection<String> logisticscdList) {
        doSetLogisticscd_NotInScope(logisticscdList);
    }

    protected void doSetLogisticscd_NotInScope(Collection<String> logisticscdList) {
        regINS(CK_NINS, cTL(logisticscdList), xgetCValueLogisticscd(), "LOGISTICSCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {varchar(30)} <br>
     * <pre>e.g. setLogisticscd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logisticscd The value of logisticscd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogisticscd_LikeSearch(String logisticscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logisticscd), xgetCValueLogisticscd(), "LOGISTICSCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {varchar(30)}
     * @param logisticscd The value of logisticscd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogisticscd_NotLikeSearch(String logisticscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logisticscd), xgetCValueLogisticscd(), "LOGISTICSCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {varchar(30)}
     * @param logisticscd The value of logisticscd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_PrefixSearch(String logisticscd) {
        setLogisticscd_LikeSearch(logisticscd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(30)}
     */
    public void setLogisticscd_IsNull() { regLogisticscd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(30)}
     */
    public void setLogisticscd_IsNullOrEmpty() { regLogisticscd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(30)}
     */
    public void setLogisticscd_IsNotNull() { regLogisticscd(CK_ISNN, DOBJ); }

    protected void regLogisticscd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogisticscd(), "LOGISTICSCD"); }
    protected abstract ConditionValue xgetCValueLogisticscd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX+, varchar(30)}
     * @param warehousecd The value of warehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_Equal(String warehousecd) {
        doSetWarehousecd_Equal(fRES(warehousecd));
    }

    protected void doSetWarehousecd_Equal(String warehousecd) {
        regWarehousecd(CK_EQ, warehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX+, varchar(30)}
     * @param warehousecd The value of warehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_NotEqual(String warehousecd) {
        doSetWarehousecd_NotEqual(fRES(warehousecd));
    }

    protected void doSetWarehousecd_NotEqual(String warehousecd) {
        regWarehousecd(CK_NES, warehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX+, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterThan(String warehousecd) {
        regWarehousecd(CK_GT, fRES(warehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX+, varchar(30)}
     * @param warehousecd The value of warehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessThan(String warehousecd) {
        regWarehousecd(CK_LT, fRES(warehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX+, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterEqual(String warehousecd) {
        regWarehousecd(CK_GE, fRES(warehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX+, varchar(30)}
     * @param warehousecd The value of warehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessEqual(String warehousecd) {
        regWarehousecd(CK_LE, fRES(warehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {IX+, varchar(30)}
     * @param warehousecdList The collection of warehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_InScope(Collection<String> warehousecdList) {
        doSetWarehousecd_InScope(warehousecdList);
    }

    protected void doSetWarehousecd_InScope(Collection<String> warehousecdList) {
        regINS(CK_INS, cTL(warehousecdList), xgetCValueWarehousecd(), "WAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {IX+, varchar(30)}
     * @param warehousecdList The collection of warehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_NotInScope(Collection<String> warehousecdList) {
        doSetWarehousecd_NotInScope(warehousecdList);
    }

    protected void doSetWarehousecd_NotInScope(Collection<String> warehousecdList) {
        regINS(CK_NINS, cTL(warehousecdList), xgetCValueWarehousecd(), "WAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {IX+, varchar(30)} <br>
     * <pre>e.g. setWarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehousecd The value of warehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehousecd_LikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {IX+, varchar(30)}
     * @param warehousecd The value of warehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecd_NotLikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {IX+, varchar(30)}
     * @param warehousecd The value of warehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_PrefixSearch(String warehousecd) {
        setWarehousecd_LikeSearch(warehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX+, varchar(30)}
     */
    public void setWarehousecd_IsNull() { regWarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX+, varchar(30)}
     */
    public void setWarehousecd_IsNullOrEmpty() { regWarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX+, varchar(30)}
     */
    public void setWarehousecd_IsNotNull() { regWarehousecd(CK_ISNN, DOBJ); }

    protected void regWarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecd(), "WAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueWarehousecd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param slotflg The value of slotflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotflg_Equal(java.math.BigDecimal slotflg) {
        doSetSlotflg_Equal(slotflg);
    }

    protected void doSetSlotflg_Equal(java.math.BigDecimal slotflg) {
        regSlotflg(CK_EQ, slotflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param slotflg The value of slotflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotflg_NotEqual(java.math.BigDecimal slotflg) {
        doSetSlotflg_NotEqual(slotflg);
    }

    protected void doSetSlotflg_NotEqual(java.math.BigDecimal slotflg) {
        regSlotflg(CK_NES, slotflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param slotflg The value of slotflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotflg_GreaterThan(java.math.BigDecimal slotflg) {
        regSlotflg(CK_GT, slotflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param slotflg The value of slotflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotflg_LessThan(java.math.BigDecimal slotflg) {
        regSlotflg(CK_LT, slotflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param slotflg The value of slotflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotflg_GreaterEqual(java.math.BigDecimal slotflg) {
        regSlotflg(CK_GE, slotflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param slotflg The value of slotflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotflg_LessEqual(java.math.BigDecimal slotflg) {
        regSlotflg(CK_LE, slotflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of slotflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of slotflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSlotflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSlotflg(), "SLOTFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param slotflgList The collection of slotflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotflg_InScope(Collection<java.math.BigDecimal> slotflgList) {
        doSetSlotflg_InScope(slotflgList);
    }

    protected void doSetSlotflg_InScope(Collection<java.math.BigDecimal> slotflgList) {
        regINS(CK_INS, cTL(slotflgList), xgetCValueSlotflg(), "SLOTFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param slotflgList The collection of slotflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotflg_NotInScope(Collection<java.math.BigDecimal> slotflgList) {
        doSetSlotflg_NotInScope(slotflgList);
    }

    protected void doSetSlotflg_NotInScope(Collection<java.math.BigDecimal> slotflgList) {
        regINS(CK_NINS, cTL(slotflgList), xgetCValueSlotflg(), "SLOTFLG");
    }

    protected void regSlotflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlotflg(), "SLOTFLG"); }
    protected abstract ConditionValue xgetCValueSlotflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOLOCCD: {varchar(30)}
     * @param toloccd The value of toloccd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToloccd_Equal(String toloccd) {
        doSetToloccd_Equal(fRES(toloccd));
    }

    protected void doSetToloccd_Equal(String toloccd) {
        regToloccd(CK_EQ, toloccd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOLOCCD: {varchar(30)}
     * @param toloccd The value of toloccd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToloccd_NotEqual(String toloccd) {
        doSetToloccd_NotEqual(fRES(toloccd));
    }

    protected void doSetToloccd_NotEqual(String toloccd) {
        regToloccd(CK_NES, toloccd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOLOCCD: {varchar(30)}
     * @param toloccd The value of toloccd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToloccd_GreaterThan(String toloccd) {
        regToloccd(CK_GT, fRES(toloccd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOLOCCD: {varchar(30)}
     * @param toloccd The value of toloccd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToloccd_LessThan(String toloccd) {
        regToloccd(CK_LT, fRES(toloccd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOLOCCD: {varchar(30)}
     * @param toloccd The value of toloccd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToloccd_GreaterEqual(String toloccd) {
        regToloccd(CK_GE, fRES(toloccd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOLOCCD: {varchar(30)}
     * @param toloccd The value of toloccd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToloccd_LessEqual(String toloccd) {
        regToloccd(CK_LE, fRES(toloccd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOLOCCD: {varchar(30)}
     * @param toloccdList The collection of toloccd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToloccd_InScope(Collection<String> toloccdList) {
        doSetToloccd_InScope(toloccdList);
    }

    protected void doSetToloccd_InScope(Collection<String> toloccdList) {
        regINS(CK_INS, cTL(toloccdList), xgetCValueToloccd(), "TOLOCCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOLOCCD: {varchar(30)}
     * @param toloccdList The collection of toloccd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToloccd_NotInScope(Collection<String> toloccdList) {
        doSetToloccd_NotInScope(toloccdList);
    }

    protected void doSetToloccd_NotInScope(Collection<String> toloccdList) {
        regINS(CK_NINS, cTL(toloccdList), xgetCValueToloccd(), "TOLOCCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOLOCCD: {varchar(30)} <br>
     * <pre>e.g. setToloccd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param toloccd The value of toloccd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setToloccd_LikeSearch(String toloccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(toloccd), xgetCValueToloccd(), "TOLOCCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOLOCCD: {varchar(30)}
     * @param toloccd The value of toloccd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setToloccd_NotLikeSearch(String toloccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(toloccd), xgetCValueToloccd(), "TOLOCCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOLOCCD: {varchar(30)}
     * @param toloccd The value of toloccd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToloccd_PrefixSearch(String toloccd) {
        setToloccd_LikeSearch(toloccd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOLOCCD: {varchar(30)}
     */
    public void setToloccd_IsNull() { regToloccd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TOLOCCD: {varchar(30)}
     */
    public void setToloccd_IsNullOrEmpty() { regToloccd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOLOCCD: {varchar(30)}
     */
    public void setToloccd_IsNotNull() { regToloccd(CK_ISNN, DOBJ); }

    protected void regToloccd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueToloccd(), "TOLOCCD"); }
    protected abstract ConditionValue xgetCValueToloccd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_Equal(String loccd) {
        doSetLoccd_Equal(fRES(loccd));
    }

    protected void doSetLoccd_Equal(String loccd) {
        regLoccd(CK_EQ, loccd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_NotEqual(String loccd) {
        doSetLoccd_NotEqual(fRES(loccd));
    }

    protected void doSetLoccd_NotEqual(String loccd) {
        regLoccd(CK_NES, loccd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_GreaterThan(String loccd) {
        regLoccd(CK_GT, fRES(loccd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_LessThan(String loccd) {
        regLoccd(CK_LT, fRES(loccd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_GreaterEqual(String loccd) {
        regLoccd(CK_GE, fRES(loccd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_LessEqual(String loccd) {
        regLoccd(CK_LE, fRES(loccd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccdList The collection of loccd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_InScope(Collection<String> loccdList) {
        doSetLoccd_InScope(loccdList);
    }

    protected void doSetLoccd_InScope(Collection<String> loccdList) {
        regINS(CK_INS, cTL(loccdList), xgetCValueLoccd(), "LOCCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccdList The collection of loccd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_NotInScope(Collection<String> loccdList) {
        doSetLoccd_NotInScope(loccdList);
    }

    protected void doSetLoccd_NotInScope(Collection<String> loccdList) {
        regINS(CK_NINS, cTL(loccdList), xgetCValueLoccd(), "LOCCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)} <br>
     * <pre>e.g. setLoccd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loccd The value of loccd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLoccd_LikeSearch(String loccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(loccd), xgetCValueLoccd(), "LOCCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLoccd_NotLikeSearch(String loccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loccd), xgetCValueLoccd(), "LOCCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_PrefixSearch(String loccd) {
        setLoccd_LikeSearch(loccd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNull() { regLoccd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNullOrEmpty() { regLoccd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNotNull() { regLoccd(CK_ISNN, DOBJ); }

    protected void regLoccd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoccd(), "LOCCD"); }
    protected abstract ConditionValue xgetCValueLoccd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param lotkey The value of lotkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_Equal(Long lotkey) {
        doSetLotkey_Equal(lotkey);
    }

    protected void doSetLotkey_Equal(Long lotkey) {
        regLotkey(CK_EQ, lotkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param lotkey The value of lotkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_NotEqual(Long lotkey) {
        doSetLotkey_NotEqual(lotkey);
    }

    protected void doSetLotkey_NotEqual(Long lotkey) {
        regLotkey(CK_NES, lotkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param lotkey The value of lotkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_GreaterThan(Long lotkey) {
        regLotkey(CK_GT, lotkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param lotkey The value of lotkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_LessThan(Long lotkey) {
        regLotkey(CK_LT, lotkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param lotkey The value of lotkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_GreaterEqual(Long lotkey) {
        regLotkey(CK_GE, lotkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param lotkey The value of lotkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_LessEqual(Long lotkey) {
        regLotkey(CK_LE, lotkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param minNumber The min number of lotkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotkey(), "LOTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param lotkeyList The collection of lotkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotkey_InScope(Collection<Long> lotkeyList) {
        doSetLotkey_InScope(lotkeyList);
    }

    protected void doSetLotkey_InScope(Collection<Long> lotkeyList) {
        regINS(CK_INS, cTL(lotkeyList), xgetCValueLotkey(), "LOTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @param lotkeyList The collection of lotkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotkey_NotInScope(Collection<Long> lotkeyList) {
        doSetLotkey_NotInScope(lotkeyList);
    }

    protected void doSetLotkey_NotInScope(Collection<Long> lotkeyList) {
        regINS(CK_NINS, cTL(lotkeyList), xgetCValueLotkey(), "LOTKEY");
    }

    protected void regLotkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotkey(), "LOTKEY"); }
    protected abstract ConditionValue xgetCValueLotkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_Equal(String tagcd) {
        doSetTagcd_Equal(fRES(tagcd));
    }

    protected void doSetTagcd_Equal(String tagcd) {
        regTagcd(CK_EQ, tagcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_NotEqual(String tagcd) {
        doSetTagcd_NotEqual(fRES(tagcd));
    }

    protected void doSetTagcd_NotEqual(String tagcd) {
        regTagcd(CK_NES, tagcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_GreaterThan(String tagcd) {
        regTagcd(CK_GT, fRES(tagcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_LessThan(String tagcd) {
        regTagcd(CK_LT, fRES(tagcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_GreaterEqual(String tagcd) {
        regTagcd(CK_GE, fRES(tagcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_LessEqual(String tagcd) {
        regTagcd(CK_LE, fRES(tagcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcdList The collection of tagcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_InScope(Collection<String> tagcdList) {
        doSetTagcd_InScope(tagcdList);
    }

    protected void doSetTagcd_InScope(Collection<String> tagcdList) {
        regINS(CK_INS, cTL(tagcdList), xgetCValueTagcd(), "TAGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcdList The collection of tagcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_NotInScope(Collection<String> tagcdList) {
        doSetTagcd_NotInScope(tagcdList);
    }

    protected void doSetTagcd_NotInScope(Collection<String> tagcdList) {
        regINS(CK_NINS, cTL(tagcdList), xgetCValueTagcd(), "TAGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAGCD: {varchar(30)} <br>
     * <pre>e.g. setTagcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tagcd The value of tagcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTagcd_LikeSearch(String tagcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tagcd), xgetCValueTagcd(), "TAGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTagcd_NotLikeSearch(String tagcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tagcd), xgetCValueTagcd(), "TAGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_PrefixSearch(String tagcd) {
        setTagcd_LikeSearch(tagcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     */
    public void setTagcd_IsNull() { regTagcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     */
    public void setTagcd_IsNullOrEmpty() { regTagcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     */
    public void setTagcd_IsNotNull() { regTagcd(CK_ISNN, DOBJ); }

    protected void regTagcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagcd(), "TAGCD"); }
    protected abstract ConditionValue xgetCValueTagcd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ODDSFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param oddsflg The value of oddsflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOddsflg_Equal(java.math.BigDecimal oddsflg) {
        doSetOddsflg_Equal(oddsflg);
    }

    protected void doSetOddsflg_Equal(java.math.BigDecimal oddsflg) {
        regOddsflg(CK_EQ, oddsflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ODDSFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param oddsflg The value of oddsflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOddsflg_NotEqual(java.math.BigDecimal oddsflg) {
        doSetOddsflg_NotEqual(oddsflg);
    }

    protected void doSetOddsflg_NotEqual(java.math.BigDecimal oddsflg) {
        regOddsflg(CK_NES, oddsflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ODDSFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param oddsflg The value of oddsflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOddsflg_GreaterThan(java.math.BigDecimal oddsflg) {
        regOddsflg(CK_GT, oddsflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ODDSFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param oddsflg The value of oddsflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOddsflg_LessThan(java.math.BigDecimal oddsflg) {
        regOddsflg(CK_LT, oddsflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ODDSFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param oddsflg The value of oddsflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOddsflg_GreaterEqual(java.math.BigDecimal oddsflg) {
        regOddsflg(CK_GE, oddsflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ODDSFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param oddsflg The value of oddsflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOddsflg_LessEqual(java.math.BigDecimal oddsflg) {
        regOddsflg(CK_LE, oddsflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ODDSFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of oddsflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of oddsflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOddsflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOddsflg(), "ODDSFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ODDSFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param oddsflgList The collection of oddsflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOddsflg_InScope(Collection<java.math.BigDecimal> oddsflgList) {
        doSetOddsflg_InScope(oddsflgList);
    }

    protected void doSetOddsflg_InScope(Collection<java.math.BigDecimal> oddsflgList) {
        regINS(CK_INS, cTL(oddsflgList), xgetCValueOddsflg(), "ODDSFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ODDSFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param oddsflgList The collection of oddsflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOddsflg_NotInScope(Collection<java.math.BigDecimal> oddsflgList) {
        doSetOddsflg_NotInScope(oddsflgList);
    }

    protected void doSetOddsflg_NotInScope(Collection<java.math.BigDecimal> oddsflgList) {
        regINS(CK_NINS, cTL(oddsflgList), xgetCValueOddsflg(), "ODDSFLG");
    }

    protected void regOddsflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOddsflg(), "ODDSFLG"); }
    protected abstract ConditionValue xgetCValueOddsflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param instructqty1 The value of instructqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty1_Equal(java.math.BigDecimal instructqty1) {
        doSetInstructqty1_Equal(instructqty1);
    }

    protected void doSetInstructqty1_Equal(java.math.BigDecimal instructqty1) {
        regInstructqty1(CK_EQ, instructqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param instructqty1 The value of instructqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty1_NotEqual(java.math.BigDecimal instructqty1) {
        doSetInstructqty1_NotEqual(instructqty1);
    }

    protected void doSetInstructqty1_NotEqual(java.math.BigDecimal instructqty1) {
        regInstructqty1(CK_NES, instructqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param instructqty1 The value of instructqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty1_GreaterThan(java.math.BigDecimal instructqty1) {
        regInstructqty1(CK_GT, instructqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param instructqty1 The value of instructqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty1_LessThan(java.math.BigDecimal instructqty1) {
        regInstructqty1(CK_LT, instructqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param instructqty1 The value of instructqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty1_GreaterEqual(java.math.BigDecimal instructqty1) {
        regInstructqty1(CK_GE, instructqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param instructqty1 The value of instructqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty1_LessEqual(java.math.BigDecimal instructqty1) {
        regInstructqty1(CK_LE, instructqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of instructqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of instructqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInstructqty1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInstructqty1(), "INSTRUCTQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param instructqty1List The collection of instructqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructqty1_InScope(Collection<java.math.BigDecimal> instructqty1List) {
        doSetInstructqty1_InScope(instructqty1List);
    }

    protected void doSetInstructqty1_InScope(Collection<java.math.BigDecimal> instructqty1List) {
        regINS(CK_INS, cTL(instructqty1List), xgetCValueInstructqty1(), "INSTRUCTQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param instructqty1List The collection of instructqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructqty1_NotInScope(Collection<java.math.BigDecimal> instructqty1List) {
        doSetInstructqty1_NotInScope(instructqty1List);
    }

    protected void doSetInstructqty1_NotInScope(Collection<java.math.BigDecimal> instructqty1List) {
        regINS(CK_NINS, cTL(instructqty1List), xgetCValueInstructqty1(), "INSTRUCTQTY1");
    }

    protected void regInstructqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstructqty1(), "INSTRUCTQTY1"); }
    protected abstract ConditionValue xgetCValueInstructqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param instructqty2 The value of instructqty2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty2_Equal(Long instructqty2) {
        doSetInstructqty2_Equal(instructqty2);
    }

    protected void doSetInstructqty2_Equal(Long instructqty2) {
        regInstructqty2(CK_EQ, instructqty2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param instructqty2 The value of instructqty2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty2_NotEqual(Long instructqty2) {
        doSetInstructqty2_NotEqual(instructqty2);
    }

    protected void doSetInstructqty2_NotEqual(Long instructqty2) {
        regInstructqty2(CK_NES, instructqty2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param instructqty2 The value of instructqty2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty2_GreaterThan(Long instructqty2) {
        regInstructqty2(CK_GT, instructqty2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param instructqty2 The value of instructqty2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty2_LessThan(Long instructqty2) {
        regInstructqty2(CK_LT, instructqty2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param instructqty2 The value of instructqty2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty2_GreaterEqual(Long instructqty2) {
        regInstructqty2(CK_GE, instructqty2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param instructqty2 The value of instructqty2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty2_LessEqual(Long instructqty2) {
        regInstructqty2(CK_LE, instructqty2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of instructqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of instructqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInstructqty2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInstructqty2(), "INSTRUCTQTY2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param instructqty2List The collection of instructqty2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructqty2_InScope(Collection<Long> instructqty2List) {
        doSetInstructqty2_InScope(instructqty2List);
    }

    protected void doSetInstructqty2_InScope(Collection<Long> instructqty2List) {
        regINS(CK_INS, cTL(instructqty2List), xgetCValueInstructqty2(), "INSTRUCTQTY2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param instructqty2List The collection of instructqty2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructqty2_NotInScope(Collection<Long> instructqty2List) {
        doSetInstructqty2_NotInScope(instructqty2List);
    }

    protected void doSetInstructqty2_NotInScope(Collection<Long> instructqty2List) {
        regINS(CK_NINS, cTL(instructqty2List), xgetCValueInstructqty2(), "INSTRUCTQTY2");
    }

    protected void regInstructqty2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstructqty2(), "INSTRUCTQTY2"); }
    protected abstract ConditionValue xgetCValueInstructqty2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param instructqty3 The value of instructqty3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty3_Equal(Long instructqty3) {
        doSetInstructqty3_Equal(instructqty3);
    }

    protected void doSetInstructqty3_Equal(Long instructqty3) {
        regInstructqty3(CK_EQ, instructqty3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param instructqty3 The value of instructqty3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty3_NotEqual(Long instructqty3) {
        doSetInstructqty3_NotEqual(instructqty3);
    }

    protected void doSetInstructqty3_NotEqual(Long instructqty3) {
        regInstructqty3(CK_NES, instructqty3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param instructqty3 The value of instructqty3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty3_GreaterThan(Long instructqty3) {
        regInstructqty3(CK_GT, instructqty3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param instructqty3 The value of instructqty3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty3_LessThan(Long instructqty3) {
        regInstructqty3(CK_LT, instructqty3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param instructqty3 The value of instructqty3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty3_GreaterEqual(Long instructqty3) {
        regInstructqty3(CK_GE, instructqty3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param instructqty3 The value of instructqty3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstructqty3_LessEqual(Long instructqty3) {
        regInstructqty3(CK_LE, instructqty3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of instructqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of instructqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInstructqty3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInstructqty3(), "INSTRUCTQTY3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param instructqty3List The collection of instructqty3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructqty3_InScope(Collection<Long> instructqty3List) {
        doSetInstructqty3_InScope(instructqty3List);
    }

    protected void doSetInstructqty3_InScope(Collection<Long> instructqty3List) {
        regINS(CK_INS, cTL(instructqty3List), xgetCValueInstructqty3(), "INSTRUCTQTY3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param instructqty3List The collection of instructqty3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructqty3_NotInScope(Collection<Long> instructqty3List) {
        doSetInstructqty3_NotInScope(instructqty3List);
    }

    protected void doSetInstructqty3_NotInScope(Collection<Long> instructqty3List) {
        regINS(CK_NINS, cTL(instructqty3List), xgetCValueInstructqty3(), "INSTRUCTQTY3");
    }

    protected void regInstructqty3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstructqty3(), "INSTRUCTQTY3"); }
    protected abstract ConditionValue xgetCValueInstructqty3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param loadqty1 The value of loadqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty1_Equal(java.math.BigDecimal loadqty1) {
        doSetLoadqty1_Equal(loadqty1);
    }

    protected void doSetLoadqty1_Equal(java.math.BigDecimal loadqty1) {
        regLoadqty1(CK_EQ, loadqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param loadqty1 The value of loadqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty1_NotEqual(java.math.BigDecimal loadqty1) {
        doSetLoadqty1_NotEqual(loadqty1);
    }

    protected void doSetLoadqty1_NotEqual(java.math.BigDecimal loadqty1) {
        regLoadqty1(CK_NES, loadqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param loadqty1 The value of loadqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty1_GreaterThan(java.math.BigDecimal loadqty1) {
        regLoadqty1(CK_GT, loadqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param loadqty1 The value of loadqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty1_LessThan(java.math.BigDecimal loadqty1) {
        regLoadqty1(CK_LT, loadqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param loadqty1 The value of loadqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty1_GreaterEqual(java.math.BigDecimal loadqty1) {
        regLoadqty1(CK_GE, loadqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param loadqty1 The value of loadqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty1_LessEqual(java.math.BigDecimal loadqty1) {
        regLoadqty1(CK_LE, loadqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of loadqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of loadqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLoadqty1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLoadqty1(), "LOADQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOADQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param loadqty1List The collection of loadqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadqty1_InScope(Collection<java.math.BigDecimal> loadqty1List) {
        doSetLoadqty1_InScope(loadqty1List);
    }

    protected void doSetLoadqty1_InScope(Collection<java.math.BigDecimal> loadqty1List) {
        regINS(CK_INS, cTL(loadqty1List), xgetCValueLoadqty1(), "LOADQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOADQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param loadqty1List The collection of loadqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadqty1_NotInScope(Collection<java.math.BigDecimal> loadqty1List) {
        doSetLoadqty1_NotInScope(loadqty1List);
    }

    protected void doSetLoadqty1_NotInScope(Collection<java.math.BigDecimal> loadqty1List) {
        regINS(CK_NINS, cTL(loadqty1List), xgetCValueLoadqty1(), "LOADQTY1");
    }

    protected void regLoadqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoadqty1(), "LOADQTY1"); }
    protected abstract ConditionValue xgetCValueLoadqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param loadqty2 The value of loadqty2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty2_Equal(Long loadqty2) {
        doSetLoadqty2_Equal(loadqty2);
    }

    protected void doSetLoadqty2_Equal(Long loadqty2) {
        regLoadqty2(CK_EQ, loadqty2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param loadqty2 The value of loadqty2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty2_NotEqual(Long loadqty2) {
        doSetLoadqty2_NotEqual(loadqty2);
    }

    protected void doSetLoadqty2_NotEqual(Long loadqty2) {
        regLoadqty2(CK_NES, loadqty2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param loadqty2 The value of loadqty2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty2_GreaterThan(Long loadqty2) {
        regLoadqty2(CK_GT, loadqty2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param loadqty2 The value of loadqty2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty2_LessThan(Long loadqty2) {
        regLoadqty2(CK_LT, loadqty2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param loadqty2 The value of loadqty2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty2_GreaterEqual(Long loadqty2) {
        regLoadqty2(CK_GE, loadqty2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param loadqty2 The value of loadqty2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty2_LessEqual(Long loadqty2) {
        regLoadqty2(CK_LE, loadqty2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of loadqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of loadqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLoadqty2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLoadqty2(), "LOADQTY2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOADQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param loadqty2List The collection of loadqty2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadqty2_InScope(Collection<Long> loadqty2List) {
        doSetLoadqty2_InScope(loadqty2List);
    }

    protected void doSetLoadqty2_InScope(Collection<Long> loadqty2List) {
        regINS(CK_INS, cTL(loadqty2List), xgetCValueLoadqty2(), "LOADQTY2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOADQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param loadqty2List The collection of loadqty2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadqty2_NotInScope(Collection<Long> loadqty2List) {
        doSetLoadqty2_NotInScope(loadqty2List);
    }

    protected void doSetLoadqty2_NotInScope(Collection<Long> loadqty2List) {
        regINS(CK_NINS, cTL(loadqty2List), xgetCValueLoadqty2(), "LOADQTY2");
    }

    protected void regLoadqty2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoadqty2(), "LOADQTY2"); }
    protected abstract ConditionValue xgetCValueLoadqty2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param loadqty3 The value of loadqty3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty3_Equal(Long loadqty3) {
        doSetLoadqty3_Equal(loadqty3);
    }

    protected void doSetLoadqty3_Equal(Long loadqty3) {
        regLoadqty3(CK_EQ, loadqty3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param loadqty3 The value of loadqty3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty3_NotEqual(Long loadqty3) {
        doSetLoadqty3_NotEqual(loadqty3);
    }

    protected void doSetLoadqty3_NotEqual(Long loadqty3) {
        regLoadqty3(CK_NES, loadqty3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param loadqty3 The value of loadqty3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty3_GreaterThan(Long loadqty3) {
        regLoadqty3(CK_GT, loadqty3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param loadqty3 The value of loadqty3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty3_LessThan(Long loadqty3) {
        regLoadqty3(CK_LT, loadqty3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param loadqty3 The value of loadqty3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty3_GreaterEqual(Long loadqty3) {
        regLoadqty3(CK_GE, loadqty3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param loadqty3 The value of loadqty3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadqty3_LessEqual(Long loadqty3) {
        regLoadqty3(CK_LE, loadqty3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOADQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of loadqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of loadqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLoadqty3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLoadqty3(), "LOADQTY3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOADQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param loadqty3List The collection of loadqty3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadqty3_InScope(Collection<Long> loadqty3List) {
        doSetLoadqty3_InScope(loadqty3List);
    }

    protected void doSetLoadqty3_InScope(Collection<Long> loadqty3List) {
        regINS(CK_INS, cTL(loadqty3List), xgetCValueLoadqty3(), "LOADQTY3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOADQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param loadqty3List The collection of loadqty3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadqty3_NotInScope(Collection<Long> loadqty3List) {
        doSetLoadqty3_NotInScope(loadqty3List);
    }

    protected void doSetLoadqty3_NotInScope(Collection<Long> loadqty3List) {
        regINS(CK_NINS, cTL(loadqty3List), xgetCValueLoadqty3(), "LOADQTY3");
    }

    protected void regLoadqty3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoadqty3(), "LOADQTY3"); }
    protected abstract ConditionValue xgetCValueLoadqty3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param labelprintedflg The value of labelprintedflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelprintedflg_Equal(java.math.BigDecimal labelprintedflg) {
        doSetLabelprintedflg_Equal(labelprintedflg);
    }

    protected void doSetLabelprintedflg_Equal(java.math.BigDecimal labelprintedflg) {
        regLabelprintedflg(CK_EQ, labelprintedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param labelprintedflg The value of labelprintedflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelprintedflg_NotEqual(java.math.BigDecimal labelprintedflg) {
        doSetLabelprintedflg_NotEqual(labelprintedflg);
    }

    protected void doSetLabelprintedflg_NotEqual(java.math.BigDecimal labelprintedflg) {
        regLabelprintedflg(CK_NES, labelprintedflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param labelprintedflg The value of labelprintedflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelprintedflg_GreaterThan(java.math.BigDecimal labelprintedflg) {
        regLabelprintedflg(CK_GT, labelprintedflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param labelprintedflg The value of labelprintedflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelprintedflg_LessThan(java.math.BigDecimal labelprintedflg) {
        regLabelprintedflg(CK_LT, labelprintedflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param labelprintedflg The value of labelprintedflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelprintedflg_GreaterEqual(java.math.BigDecimal labelprintedflg) {
        regLabelprintedflg(CK_GE, labelprintedflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param labelprintedflg The value of labelprintedflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelprintedflg_LessEqual(java.math.BigDecimal labelprintedflg) {
        regLabelprintedflg(CK_LE, labelprintedflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of labelprintedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of labelprintedflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLabelprintedflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLabelprintedflg(), "LABELPRINTEDFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param labelprintedflgList The collection of labelprintedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabelprintedflg_InScope(Collection<java.math.BigDecimal> labelprintedflgList) {
        doSetLabelprintedflg_InScope(labelprintedflgList);
    }

    protected void doSetLabelprintedflg_InScope(Collection<java.math.BigDecimal> labelprintedflgList) {
        regINS(CK_INS, cTL(labelprintedflgList), xgetCValueLabelprintedflg(), "LABELPRINTEDFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LABELPRINTEDFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param labelprintedflgList The collection of labelprintedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabelprintedflg_NotInScope(Collection<java.math.BigDecimal> labelprintedflgList) {
        doSetLabelprintedflg_NotInScope(labelprintedflgList);
    }

    protected void doSetLabelprintedflg_NotInScope(Collection<java.math.BigDecimal> labelprintedflgList) {
        regINS(CK_NINS, cTL(labelprintedflgList), xgetCValueLabelprintedflg(), "LABELPRINTEDFLG");
    }

    protected void regLabelprintedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLabelprintedflg(), "LABELPRINTEDFLG"); }
    protected abstract ConditionValue xgetCValueLabelprintedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_Equal(String notes) {
        doSetNotes_Equal(fRES(notes));
    }

    protected void doSetNotes_Equal(String notes) {
        regNotes(CK_EQ, notes);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotEqual(String notes) {
        doSetNotes_NotEqual(fRES(notes));
    }

    protected void doSetNotes_NotEqual(String notes) {
        regNotes(CK_NES, notes);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notesList The collection of notes as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_InScope(Collection<String> notesList) {
        doSetNotes_InScope(notesList);
    }

    protected void doSetNotes_InScope(Collection<String> notesList) {
        regINS(CK_INS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notesList The collection of notes as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotInScope(Collection<String> notesList) {
        doSetNotes_NotInScope(notesList);
    }

    protected void doSetNotes_NotInScope(Collection<String> notesList) {
        regINS(CK_NINS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)} <br>
     * <pre>e.g. setNotes_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param notes The value of notes as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_PrefixSearch(String notes) {
        setNotes_LikeSearch(notes, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNullOrEmpty() { regNotes(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DOBJ); }

    protected void regNotes(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotes(), "NOTES"); }
    protected abstract ConditionValue xgetCValueNotes();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {IX+, decimal(16, 6)}
     * @param sokey The value of sokey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_Equal(java.math.BigDecimal sokey) {
        doSetSokey_Equal(sokey);
    }

    protected void doSetSokey_Equal(java.math.BigDecimal sokey) {
        regSokey(CK_EQ, sokey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {IX+, decimal(16, 6)}
     * @param sokey The value of sokey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_NotEqual(java.math.BigDecimal sokey) {
        doSetSokey_NotEqual(sokey);
    }

    protected void doSetSokey_NotEqual(java.math.BigDecimal sokey) {
        regSokey(CK_NES, sokey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {IX+, decimal(16, 6)}
     * @param sokey The value of sokey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_GreaterThan(java.math.BigDecimal sokey) {
        regSokey(CK_GT, sokey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {IX+, decimal(16, 6)}
     * @param sokey The value of sokey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_LessThan(java.math.BigDecimal sokey) {
        regSokey(CK_LT, sokey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {IX+, decimal(16, 6)}
     * @param sokey The value of sokey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_GreaterEqual(java.math.BigDecimal sokey) {
        regSokey(CK_GE, sokey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {IX+, decimal(16, 6)}
     * @param sokey The value of sokey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_LessEqual(java.math.BigDecimal sokey) {
        regSokey(CK_LE, sokey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {IX+, decimal(16, 6)}
     * @param minNumber The min number of sokey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sokey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSokey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSokey(), "SOKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOKEY: {IX+, decimal(16, 6)}
     * @param sokeyList The collection of sokey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSokey_InScope(Collection<java.math.BigDecimal> sokeyList) {
        doSetSokey_InScope(sokeyList);
    }

    protected void doSetSokey_InScope(Collection<java.math.BigDecimal> sokeyList) {
        regINS(CK_INS, cTL(sokeyList), xgetCValueSokey(), "SOKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOKEY: {IX+, decimal(16, 6)}
     * @param sokeyList The collection of sokey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSokey_NotInScope(Collection<java.math.BigDecimal> sokeyList) {
        doSetSokey_NotInScope(sokeyList);
    }

    protected void doSetSokey_NotInScope(Collection<java.math.BigDecimal> sokeyList) {
        regINS(CK_NINS, cTL(sokeyList), xgetCValueSokey(), "SOKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOKEY: {IX+, decimal(16, 6)}
     */
    public void setSokey_IsNull() { regSokey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOKEY: {IX+, decimal(16, 6)}
     */
    public void setSokey_IsNotNull() { regSokey(CK_ISNN, DOBJ); }

    protected void regSokey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSokey(), "SOKEY"); }
    protected abstract ConditionValue xgetCValueSokey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {bigint(19)}
     * @param solineno The value of solineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_Equal(Long solineno) {
        doSetSolineno_Equal(solineno);
    }

    protected void doSetSolineno_Equal(Long solineno) {
        regSolineno(CK_EQ, solineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {bigint(19)}
     * @param solineno The value of solineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_NotEqual(Long solineno) {
        doSetSolineno_NotEqual(solineno);
    }

    protected void doSetSolineno_NotEqual(Long solineno) {
        regSolineno(CK_NES, solineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {bigint(19)}
     * @param solineno The value of solineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_GreaterThan(Long solineno) {
        regSolineno(CK_GT, solineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {bigint(19)}
     * @param solineno The value of solineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_LessThan(Long solineno) {
        regSolineno(CK_LT, solineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {bigint(19)}
     * @param solineno The value of solineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_GreaterEqual(Long solineno) {
        regSolineno(CK_GE, solineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {bigint(19)}
     * @param solineno The value of solineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSolineno_LessEqual(Long solineno) {
        regSolineno(CK_LE, solineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOLINENO: {bigint(19)}
     * @param minNumber The min number of solineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of solineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSolineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSolineno(), "SOLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOLINENO: {bigint(19)}
     * @param solinenoList The collection of solineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSolineno_InScope(Collection<Long> solinenoList) {
        doSetSolineno_InScope(solinenoList);
    }

    protected void doSetSolineno_InScope(Collection<Long> solinenoList) {
        regINS(CK_INS, cTL(solinenoList), xgetCValueSolineno(), "SOLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOLINENO: {bigint(19)}
     * @param solinenoList The collection of solineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSolineno_NotInScope(Collection<Long> solinenoList) {
        doSetSolineno_NotInScope(solinenoList);
    }

    protected void doSetSolineno_NotInScope(Collection<Long> solinenoList) {
        regINS(CK_NINS, cTL(solinenoList), xgetCValueSolineno(), "SOLINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOLINENO: {bigint(19)}
     */
    public void setSolineno_IsNull() { regSolineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOLINENO: {bigint(19)}
     */
    public void setSolineno_IsNotNull() { regSolineno(CK_ISNN, DOBJ); }

    protected void regSolineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSolineno(), "SOLINENO"); }
    protected abstract ConditionValue xgetCValueSolineno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRIGGERTYPE: {varchar(30)}
     * @param triggertype The value of triggertype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTriggertype_Equal(String triggertype) {
        doSetTriggertype_Equal(fRES(triggertype));
    }

    protected void doSetTriggertype_Equal(String triggertype) {
        regTriggertype(CK_EQ, triggertype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRIGGERTYPE: {varchar(30)}
     * @param triggertype The value of triggertype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTriggertype_NotEqual(String triggertype) {
        doSetTriggertype_NotEqual(fRES(triggertype));
    }

    protected void doSetTriggertype_NotEqual(String triggertype) {
        regTriggertype(CK_NES, triggertype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRIGGERTYPE: {varchar(30)}
     * @param triggertype The value of triggertype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTriggertype_GreaterThan(String triggertype) {
        regTriggertype(CK_GT, fRES(triggertype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRIGGERTYPE: {varchar(30)}
     * @param triggertype The value of triggertype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTriggertype_LessThan(String triggertype) {
        regTriggertype(CK_LT, fRES(triggertype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRIGGERTYPE: {varchar(30)}
     * @param triggertype The value of triggertype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTriggertype_GreaterEqual(String triggertype) {
        regTriggertype(CK_GE, fRES(triggertype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRIGGERTYPE: {varchar(30)}
     * @param triggertype The value of triggertype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTriggertype_LessEqual(String triggertype) {
        regTriggertype(CK_LE, fRES(triggertype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRIGGERTYPE: {varchar(30)}
     * @param triggertypeList The collection of triggertype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTriggertype_InScope(Collection<String> triggertypeList) {
        doSetTriggertype_InScope(triggertypeList);
    }

    protected void doSetTriggertype_InScope(Collection<String> triggertypeList) {
        regINS(CK_INS, cTL(triggertypeList), xgetCValueTriggertype(), "TRIGGERTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRIGGERTYPE: {varchar(30)}
     * @param triggertypeList The collection of triggertype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTriggertype_NotInScope(Collection<String> triggertypeList) {
        doSetTriggertype_NotInScope(triggertypeList);
    }

    protected void doSetTriggertype_NotInScope(Collection<String> triggertypeList) {
        regINS(CK_NINS, cTL(triggertypeList), xgetCValueTriggertype(), "TRIGGERTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRIGGERTYPE: {varchar(30)} <br>
     * <pre>e.g. setTriggertype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param triggertype The value of triggertype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTriggertype_LikeSearch(String triggertype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(triggertype), xgetCValueTriggertype(), "TRIGGERTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRIGGERTYPE: {varchar(30)}
     * @param triggertype The value of triggertype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTriggertype_NotLikeSearch(String triggertype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(triggertype), xgetCValueTriggertype(), "TRIGGERTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRIGGERTYPE: {varchar(30)}
     * @param triggertype The value of triggertype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTriggertype_PrefixSearch(String triggertype) {
        setTriggertype_LikeSearch(triggertype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRIGGERTYPE: {varchar(30)}
     */
    public void setTriggertype_IsNull() { regTriggertype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRIGGERTYPE: {varchar(30)}
     */
    public void setTriggertype_IsNullOrEmpty() { regTriggertype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRIGGERTYPE: {varchar(30)}
     */
    public void setTriggertype_IsNotNull() { regTriggertype(CK_ISNN, DOBJ); }

    protected void regTriggertype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTriggertype(), "TRIGGERTYPE"); }
    protected abstract ConditionValue xgetCValueTriggertype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROSPECTFLG: {decimal(16, 6), default=[(0)]}
     * @param prospectflg The value of prospectflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProspectflg_Equal(java.math.BigDecimal prospectflg) {
        doSetProspectflg_Equal(prospectflg);
    }

    protected void doSetProspectflg_Equal(java.math.BigDecimal prospectflg) {
        regProspectflg(CK_EQ, prospectflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROSPECTFLG: {decimal(16, 6), default=[(0)]}
     * @param prospectflg The value of prospectflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProspectflg_NotEqual(java.math.BigDecimal prospectflg) {
        doSetProspectflg_NotEqual(prospectflg);
    }

    protected void doSetProspectflg_NotEqual(java.math.BigDecimal prospectflg) {
        regProspectflg(CK_NES, prospectflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROSPECTFLG: {decimal(16, 6), default=[(0)]}
     * @param prospectflg The value of prospectflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProspectflg_GreaterThan(java.math.BigDecimal prospectflg) {
        regProspectflg(CK_GT, prospectflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROSPECTFLG: {decimal(16, 6), default=[(0)]}
     * @param prospectflg The value of prospectflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProspectflg_LessThan(java.math.BigDecimal prospectflg) {
        regProspectflg(CK_LT, prospectflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROSPECTFLG: {decimal(16, 6), default=[(0)]}
     * @param prospectflg The value of prospectflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProspectflg_GreaterEqual(java.math.BigDecimal prospectflg) {
        regProspectflg(CK_GE, prospectflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROSPECTFLG: {decimal(16, 6), default=[(0)]}
     * @param prospectflg The value of prospectflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProspectflg_LessEqual(java.math.BigDecimal prospectflg) {
        regProspectflg(CK_LE, prospectflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROSPECTFLG: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of prospectflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of prospectflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProspectflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProspectflg(), "PROSPECTFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROSPECTFLG: {decimal(16, 6), default=[(0)]}
     * @param prospectflgList The collection of prospectflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProspectflg_InScope(Collection<java.math.BigDecimal> prospectflgList) {
        doSetProspectflg_InScope(prospectflgList);
    }

    protected void doSetProspectflg_InScope(Collection<java.math.BigDecimal> prospectflgList) {
        regINS(CK_INS, cTL(prospectflgList), xgetCValueProspectflg(), "PROSPECTFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROSPECTFLG: {decimal(16, 6), default=[(0)]}
     * @param prospectflgList The collection of prospectflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProspectflg_NotInScope(Collection<java.math.BigDecimal> prospectflgList) {
        doSetProspectflg_NotInScope(prospectflgList);
    }

    protected void doSetProspectflg_NotInScope(Collection<java.math.BigDecimal> prospectflgList) {
        regINS(CK_NINS, cTL(prospectflgList), xgetCValueProspectflg(), "PROSPECTFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROSPECTFLG: {decimal(16, 6), default=[(0)]}
     */
    public void setProspectflg_IsNull() { regProspectflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROSPECTFLG: {decimal(16, 6), default=[(0)]}
     */
    public void setProspectflg_IsNotNull() { regProspectflg(CK_ISNN, DOBJ); }

    protected void regProspectflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProspectflg(), "PROSPECTFLG"); }
    protected abstract ConditionValue xgetCValueProspectflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]}
     * @param prospectupdateflg The value of prospectupdateflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProspectupdateflg_Equal(java.math.BigDecimal prospectupdateflg) {
        doSetProspectupdateflg_Equal(prospectupdateflg);
    }

    protected void doSetProspectupdateflg_Equal(java.math.BigDecimal prospectupdateflg) {
        regProspectupdateflg(CK_EQ, prospectupdateflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]}
     * @param prospectupdateflg The value of prospectupdateflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProspectupdateflg_NotEqual(java.math.BigDecimal prospectupdateflg) {
        doSetProspectupdateflg_NotEqual(prospectupdateflg);
    }

    protected void doSetProspectupdateflg_NotEqual(java.math.BigDecimal prospectupdateflg) {
        regProspectupdateflg(CK_NES, prospectupdateflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]}
     * @param prospectupdateflg The value of prospectupdateflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProspectupdateflg_GreaterThan(java.math.BigDecimal prospectupdateflg) {
        regProspectupdateflg(CK_GT, prospectupdateflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]}
     * @param prospectupdateflg The value of prospectupdateflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProspectupdateflg_LessThan(java.math.BigDecimal prospectupdateflg) {
        regProspectupdateflg(CK_LT, prospectupdateflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]}
     * @param prospectupdateflg The value of prospectupdateflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProspectupdateflg_GreaterEqual(java.math.BigDecimal prospectupdateflg) {
        regProspectupdateflg(CK_GE, prospectupdateflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]}
     * @param prospectupdateflg The value of prospectupdateflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProspectupdateflg_LessEqual(java.math.BigDecimal prospectupdateflg) {
        regProspectupdateflg(CK_LE, prospectupdateflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of prospectupdateflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of prospectupdateflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProspectupdateflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProspectupdateflg(), "PROSPECTUPDATEFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]}
     * @param prospectupdateflgList The collection of prospectupdateflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProspectupdateflg_InScope(Collection<java.math.BigDecimal> prospectupdateflgList) {
        doSetProspectupdateflg_InScope(prospectupdateflgList);
    }

    protected void doSetProspectupdateflg_InScope(Collection<java.math.BigDecimal> prospectupdateflgList) {
        regINS(CK_INS, cTL(prospectupdateflgList), xgetCValueProspectupdateflg(), "PROSPECTUPDATEFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]}
     * @param prospectupdateflgList The collection of prospectupdateflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProspectupdateflg_NotInScope(Collection<java.math.BigDecimal> prospectupdateflgList) {
        doSetProspectupdateflg_NotInScope(prospectupdateflgList);
    }

    protected void doSetProspectupdateflg_NotInScope(Collection<java.math.BigDecimal> prospectupdateflgList) {
        regINS(CK_NINS, cTL(prospectupdateflgList), xgetCValueProspectupdateflg(), "PROSPECTUPDATEFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]}
     */
    public void setProspectupdateflg_IsNull() { regProspectupdateflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]}
     */
    public void setProspectupdateflg_IsNotNull() { regProspectupdateflg(CK_ISNN, DOBJ); }

    protected void regProspectupdateflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProspectupdateflg(), "PROSPECTUPDATEFLG"); }
    protected abstract ConditionValue xgetCValueProspectupdateflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTTYPE: {varchar(30)}
     * @param slottype The value of slottype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottype_Equal(String slottype) {
        doSetSlottype_Equal(fRES(slottype));
    }

    protected void doSetSlottype_Equal(String slottype) {
        regSlottype(CK_EQ, slottype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTTYPE: {varchar(30)}
     * @param slottype The value of slottype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottype_NotEqual(String slottype) {
        doSetSlottype_NotEqual(fRES(slottype));
    }

    protected void doSetSlottype_NotEqual(String slottype) {
        regSlottype(CK_NES, slottype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTTYPE: {varchar(30)}
     * @param slottype The value of slottype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottype_GreaterThan(String slottype) {
        regSlottype(CK_GT, fRES(slottype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTTYPE: {varchar(30)}
     * @param slottype The value of slottype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottype_LessThan(String slottype) {
        regSlottype(CK_LT, fRES(slottype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTTYPE: {varchar(30)}
     * @param slottype The value of slottype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottype_GreaterEqual(String slottype) {
        regSlottype(CK_GE, fRES(slottype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTTYPE: {varchar(30)}
     * @param slottype The value of slottype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottype_LessEqual(String slottype) {
        regSlottype(CK_LE, fRES(slottype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLOTTYPE: {varchar(30)}
     * @param slottypeList The collection of slottype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottype_InScope(Collection<String> slottypeList) {
        doSetSlottype_InScope(slottypeList);
    }

    protected void doSetSlottype_InScope(Collection<String> slottypeList) {
        regINS(CK_INS, cTL(slottypeList), xgetCValueSlottype(), "SLOTTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLOTTYPE: {varchar(30)}
     * @param slottypeList The collection of slottype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottype_NotInScope(Collection<String> slottypeList) {
        doSetSlottype_NotInScope(slottypeList);
    }

    protected void doSetSlottype_NotInScope(Collection<String> slottypeList) {
        regINS(CK_NINS, cTL(slottypeList), xgetCValueSlottype(), "SLOTTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLOTTYPE: {varchar(30)} <br>
     * <pre>e.g. setSlottype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slottype The value of slottype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlottype_LikeSearch(String slottype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slottype), xgetCValueSlottype(), "SLOTTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLOTTYPE: {varchar(30)}
     * @param slottype The value of slottype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlottype_NotLikeSearch(String slottype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slottype), xgetCValueSlottype(), "SLOTTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLOTTYPE: {varchar(30)}
     * @param slottype The value of slottype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottype_PrefixSearch(String slottype) {
        setSlottype_LikeSearch(slottype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLOTTYPE: {varchar(30)}
     */
    public void setSlottype_IsNull() { regSlottype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLOTTYPE: {varchar(30)}
     */
    public void setSlottype_IsNullOrEmpty() { regSlottype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLOTTYPE: {varchar(30)}
     */
    public void setSlottype_IsNotNull() { regSlottype(CK_ISNN, DOBJ); }

    protected void regSlottype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlottype(), "SLOTTYPE"); }
    protected abstract ConditionValue xgetCValueSlottype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTTEDUSERCD: {varchar(30)}
     * @param slottedusercd The value of slottedusercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottedusercd_Equal(String slottedusercd) {
        doSetSlottedusercd_Equal(fRES(slottedusercd));
    }

    protected void doSetSlottedusercd_Equal(String slottedusercd) {
        regSlottedusercd(CK_EQ, slottedusercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTTEDUSERCD: {varchar(30)}
     * @param slottedusercd The value of slottedusercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottedusercd_NotEqual(String slottedusercd) {
        doSetSlottedusercd_NotEqual(fRES(slottedusercd));
    }

    protected void doSetSlottedusercd_NotEqual(String slottedusercd) {
        regSlottedusercd(CK_NES, slottedusercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTTEDUSERCD: {varchar(30)}
     * @param slottedusercd The value of slottedusercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottedusercd_GreaterThan(String slottedusercd) {
        regSlottedusercd(CK_GT, fRES(slottedusercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTTEDUSERCD: {varchar(30)}
     * @param slottedusercd The value of slottedusercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottedusercd_LessThan(String slottedusercd) {
        regSlottedusercd(CK_LT, fRES(slottedusercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTTEDUSERCD: {varchar(30)}
     * @param slottedusercd The value of slottedusercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottedusercd_GreaterEqual(String slottedusercd) {
        regSlottedusercd(CK_GE, fRES(slottedusercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTTEDUSERCD: {varchar(30)}
     * @param slottedusercd The value of slottedusercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottedusercd_LessEqual(String slottedusercd) {
        regSlottedusercd(CK_LE, fRES(slottedusercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLOTTEDUSERCD: {varchar(30)}
     * @param slottedusercdList The collection of slottedusercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottedusercd_InScope(Collection<String> slottedusercdList) {
        doSetSlottedusercd_InScope(slottedusercdList);
    }

    protected void doSetSlottedusercd_InScope(Collection<String> slottedusercdList) {
        regINS(CK_INS, cTL(slottedusercdList), xgetCValueSlottedusercd(), "SLOTTEDUSERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLOTTEDUSERCD: {varchar(30)}
     * @param slottedusercdList The collection of slottedusercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottedusercd_NotInScope(Collection<String> slottedusercdList) {
        doSetSlottedusercd_NotInScope(slottedusercdList);
    }

    protected void doSetSlottedusercd_NotInScope(Collection<String> slottedusercdList) {
        regINS(CK_NINS, cTL(slottedusercdList), xgetCValueSlottedusercd(), "SLOTTEDUSERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLOTTEDUSERCD: {varchar(30)} <br>
     * <pre>e.g. setSlottedusercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slottedusercd The value of slottedusercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlottedusercd_LikeSearch(String slottedusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slottedusercd), xgetCValueSlottedusercd(), "SLOTTEDUSERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLOTTEDUSERCD: {varchar(30)}
     * @param slottedusercd The value of slottedusercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlottedusercd_NotLikeSearch(String slottedusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slottedusercd), xgetCValueSlottedusercd(), "SLOTTEDUSERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLOTTEDUSERCD: {varchar(30)}
     * @param slottedusercd The value of slottedusercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlottedusercd_PrefixSearch(String slottedusercd) {
        setSlottedusercd_LikeSearch(slottedusercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLOTTEDUSERCD: {varchar(30)}
     */
    public void setSlottedusercd_IsNull() { regSlottedusercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLOTTEDUSERCD: {varchar(30)}
     */
    public void setSlottedusercd_IsNullOrEmpty() { regSlottedusercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLOTTEDUSERCD: {varchar(30)}
     */
    public void setSlottedusercd_IsNotNull() { regSlottedusercd(CK_ISNN, DOBJ); }

    protected void regSlottedusercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlottedusercd(), "SLOTTEDUSERCD"); }
    protected abstract ConditionValue xgetCValueSlottedusercd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCKORDERKEY: {decimal(16, 6)}
     * @param xdockorderkey The value of xdockorderkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdockorderkey_Equal(java.math.BigDecimal xdockorderkey) {
        doSetXdockorderkey_Equal(xdockorderkey);
    }

    protected void doSetXdockorderkey_Equal(java.math.BigDecimal xdockorderkey) {
        regXdockorderkey(CK_EQ, xdockorderkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCKORDERKEY: {decimal(16, 6)}
     * @param xdockorderkey The value of xdockorderkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdockorderkey_NotEqual(java.math.BigDecimal xdockorderkey) {
        doSetXdockorderkey_NotEqual(xdockorderkey);
    }

    protected void doSetXdockorderkey_NotEqual(java.math.BigDecimal xdockorderkey) {
        regXdockorderkey(CK_NES, xdockorderkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCKORDERKEY: {decimal(16, 6)}
     * @param xdockorderkey The value of xdockorderkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdockorderkey_GreaterThan(java.math.BigDecimal xdockorderkey) {
        regXdockorderkey(CK_GT, xdockorderkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCKORDERKEY: {decimal(16, 6)}
     * @param xdockorderkey The value of xdockorderkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdockorderkey_LessThan(java.math.BigDecimal xdockorderkey) {
        regXdockorderkey(CK_LT, xdockorderkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCKORDERKEY: {decimal(16, 6)}
     * @param xdockorderkey The value of xdockorderkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdockorderkey_GreaterEqual(java.math.BigDecimal xdockorderkey) {
        regXdockorderkey(CK_GE, xdockorderkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCKORDERKEY: {decimal(16, 6)}
     * @param xdockorderkey The value of xdockorderkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setXdockorderkey_LessEqual(java.math.BigDecimal xdockorderkey) {
        regXdockorderkey(CK_LE, xdockorderkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * XDOCKORDERKEY: {decimal(16, 6)}
     * @param minNumber The min number of xdockorderkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of xdockorderkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setXdockorderkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueXdockorderkey(), "XDOCKORDERKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * XDOCKORDERKEY: {decimal(16, 6)}
     * @param xdockorderkeyList The collection of xdockorderkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setXdockorderkey_InScope(Collection<java.math.BigDecimal> xdockorderkeyList) {
        doSetXdockorderkey_InScope(xdockorderkeyList);
    }

    protected void doSetXdockorderkey_InScope(Collection<java.math.BigDecimal> xdockorderkeyList) {
        regINS(CK_INS, cTL(xdockorderkeyList), xgetCValueXdockorderkey(), "XDOCKORDERKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * XDOCKORDERKEY: {decimal(16, 6)}
     * @param xdockorderkeyList The collection of xdockorderkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setXdockorderkey_NotInScope(Collection<java.math.BigDecimal> xdockorderkeyList) {
        doSetXdockorderkey_NotInScope(xdockorderkeyList);
    }

    protected void doSetXdockorderkey_NotInScope(Collection<java.math.BigDecimal> xdockorderkeyList) {
        regINS(CK_NINS, cTL(xdockorderkeyList), xgetCValueXdockorderkey(), "XDOCKORDERKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * XDOCKORDERKEY: {decimal(16, 6)}
     */
    public void setXdockorderkey_IsNull() { regXdockorderkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * XDOCKORDERKEY: {decimal(16, 6)}
     */
    public void setXdockorderkey_IsNotNull() { regXdockorderkey(CK_ISNN, DOBJ); }

    protected void regXdockorderkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueXdockorderkey(), "XDOCKORDERKEY"); }
    protected abstract ConditionValue xgetCValueXdockorderkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKKEY: {IX, bigint(19)}
     * @param pickkey The value of pickkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickkey_Equal(Long pickkey) {
        doSetPickkey_Equal(pickkey);
    }

    protected void doSetPickkey_Equal(Long pickkey) {
        regPickkey(CK_EQ, pickkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKKEY: {IX, bigint(19)}
     * @param pickkey The value of pickkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickkey_NotEqual(Long pickkey) {
        doSetPickkey_NotEqual(pickkey);
    }

    protected void doSetPickkey_NotEqual(Long pickkey) {
        regPickkey(CK_NES, pickkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKKEY: {IX, bigint(19)}
     * @param pickkey The value of pickkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickkey_GreaterThan(Long pickkey) {
        regPickkey(CK_GT, pickkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKKEY: {IX, bigint(19)}
     * @param pickkey The value of pickkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickkey_LessThan(Long pickkey) {
        regPickkey(CK_LT, pickkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKKEY: {IX, bigint(19)}
     * @param pickkey The value of pickkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickkey_GreaterEqual(Long pickkey) {
        regPickkey(CK_GE, pickkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKKEY: {IX, bigint(19)}
     * @param pickkey The value of pickkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickkey_LessEqual(Long pickkey) {
        regPickkey(CK_LE, pickkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKKEY: {IX, bigint(19)}
     * @param minNumber The min number of pickkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickkey(), "PICKKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKKEY: {IX, bigint(19)}
     * @param pickkeyList The collection of pickkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickkey_InScope(Collection<Long> pickkeyList) {
        doSetPickkey_InScope(pickkeyList);
    }

    protected void doSetPickkey_InScope(Collection<Long> pickkeyList) {
        regINS(CK_INS, cTL(pickkeyList), xgetCValuePickkey(), "PICKKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKKEY: {IX, bigint(19)}
     * @param pickkeyList The collection of pickkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickkey_NotInScope(Collection<Long> pickkeyList) {
        doSetPickkey_NotInScope(pickkeyList);
    }

    protected void doSetPickkey_NotInScope(Collection<Long> pickkeyList) {
        regINS(CK_NINS, cTL(pickkeyList), xgetCValuePickkey(), "PICKKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKKEY: {IX, bigint(19)}
     */
    public void setPickkey_IsNull() { regPickkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKKEY: {IX, bigint(19)}
     */
    public void setPickkey_IsNotNull() { regPickkey(CK_ISNN, DOBJ); }

    protected void regPickkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickkey(), "PICKKEY"); }
    protected abstract ConditionValue xgetCValuePickkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {decimal(16, 6)}
     * @param fullpalletkey The value of fullpalletkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletkey_Equal(java.math.BigDecimal fullpalletkey) {
        doSetFullpalletkey_Equal(fullpalletkey);
    }

    protected void doSetFullpalletkey_Equal(java.math.BigDecimal fullpalletkey) {
        regFullpalletkey(CK_EQ, fullpalletkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {decimal(16, 6)}
     * @param fullpalletkey The value of fullpalletkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletkey_NotEqual(java.math.BigDecimal fullpalletkey) {
        doSetFullpalletkey_NotEqual(fullpalletkey);
    }

    protected void doSetFullpalletkey_NotEqual(java.math.BigDecimal fullpalletkey) {
        regFullpalletkey(CK_NES, fullpalletkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {decimal(16, 6)}
     * @param fullpalletkey The value of fullpalletkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletkey_GreaterThan(java.math.BigDecimal fullpalletkey) {
        regFullpalletkey(CK_GT, fullpalletkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {decimal(16, 6)}
     * @param fullpalletkey The value of fullpalletkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletkey_LessThan(java.math.BigDecimal fullpalletkey) {
        regFullpalletkey(CK_LT, fullpalletkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {decimal(16, 6)}
     * @param fullpalletkey The value of fullpalletkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletkey_GreaterEqual(java.math.BigDecimal fullpalletkey) {
        regFullpalletkey(CK_GE, fullpalletkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {decimal(16, 6)}
     * @param fullpalletkey The value of fullpalletkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletkey_LessEqual(java.math.BigDecimal fullpalletkey) {
        regFullpalletkey(CK_LE, fullpalletkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {decimal(16, 6)}
     * @param minNumber The min number of fullpalletkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fullpalletkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFullpalletkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFullpalletkey(), "FULLPALLETKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FULLPALLETKEY: {decimal(16, 6)}
     * @param fullpalletkeyList The collection of fullpalletkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFullpalletkey_InScope(Collection<java.math.BigDecimal> fullpalletkeyList) {
        doSetFullpalletkey_InScope(fullpalletkeyList);
    }

    protected void doSetFullpalletkey_InScope(Collection<java.math.BigDecimal> fullpalletkeyList) {
        regINS(CK_INS, cTL(fullpalletkeyList), xgetCValueFullpalletkey(), "FULLPALLETKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FULLPALLETKEY: {decimal(16, 6)}
     * @param fullpalletkeyList The collection of fullpalletkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFullpalletkey_NotInScope(Collection<java.math.BigDecimal> fullpalletkeyList) {
        doSetFullpalletkey_NotInScope(fullpalletkeyList);
    }

    protected void doSetFullpalletkey_NotInScope(Collection<java.math.BigDecimal> fullpalletkeyList) {
        regINS(CK_NINS, cTL(fullpalletkeyList), xgetCValueFullpalletkey(), "FULLPALLETKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {decimal(16, 6)}
     */
    public void setFullpalletkey_IsNull() { regFullpalletkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FULLPALLETKEY: {decimal(16, 6)}
     */
    public void setFullpalletkey_IsNotNull() { regFullpalletkey(CK_ISNN, DOBJ); }

    protected void regFullpalletkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFullpalletkey(), "FULLPALLETKEY"); }
    protected abstract ConditionValue xgetCValueFullpalletkey();

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
    public HpSLCFunction<TTrrcvtagdetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrrcvtagdetailCB.class);
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
    public HpSLCFunction<TTrrcvtagdetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrrcvtagdetailCB.class);
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
    public HpSLCFunction<TTrrcvtagdetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrrcvtagdetailCB.class);
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
    public HpSLCFunction<TTrrcvtagdetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrrcvtagdetailCB.class);
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
    public HpSLCFunction<TTrrcvtagdetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrrcvtagdetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrrcvtagdetailCB&gt;() {
     *     public void query(TTrrcvtagdetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrrcvtagdetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrrcvtagdetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrrcvtagdetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrrcvtagdetailCQ sq);

    protected TTrrcvtagdetailCB xcreateScalarConditionCB() {
        TTrrcvtagdetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrrcvtagdetailCB xcreateScalarConditionPartitionByCB() {
        TTrrcvtagdetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrrcvtagdetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrrcvtagdetailCB cb = new TTrrcvtagdetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRRCVTAGDETAIL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrrcvtagdetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrrcvtagdetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrrcvtagdetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrrcvtagdetailCB cb = new TTrrcvtagdetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRRCVTAGDETAIL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrrcvtagdetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrrcvtagdetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrrcvtagdetailCB cb = new TTrrcvtagdetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrrcvtagdetailCQ sq);

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
    protected TTrrcvtagdetailCB newMyCB() {
        return new TTrrcvtagdetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrrcvtagdetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
