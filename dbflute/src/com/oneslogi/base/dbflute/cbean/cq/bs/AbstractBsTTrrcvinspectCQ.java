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
 * The abstract condition-query of T_TRRCVINSPECT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrrcvinspectCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrrcvinspectCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRRCVINSPECT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVINSPECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvinspectId The value of trrcvinspectId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvinspectId_Equal(Long trrcvinspectId) {
        doSetTrrcvinspectId_Equal(trrcvinspectId);
    }

    protected void doSetTrrcvinspectId_Equal(Long trrcvinspectId) {
        regTrrcvinspectId(CK_EQ, trrcvinspectId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVINSPECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvinspectId The value of trrcvinspectId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvinspectId_NotEqual(Long trrcvinspectId) {
        doSetTrrcvinspectId_NotEqual(trrcvinspectId);
    }

    protected void doSetTrrcvinspectId_NotEqual(Long trrcvinspectId) {
        regTrrcvinspectId(CK_NES, trrcvinspectId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVINSPECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvinspectId The value of trrcvinspectId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvinspectId_GreaterThan(Long trrcvinspectId) {
        regTrrcvinspectId(CK_GT, trrcvinspectId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVINSPECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvinspectId The value of trrcvinspectId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvinspectId_LessThan(Long trrcvinspectId) {
        regTrrcvinspectId(CK_LT, trrcvinspectId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVINSPECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvinspectId The value of trrcvinspectId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvinspectId_GreaterEqual(Long trrcvinspectId) {
        regTrrcvinspectId(CK_GE, trrcvinspectId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVINSPECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvinspectId The value of trrcvinspectId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvinspectId_LessEqual(Long trrcvinspectId) {
        regTrrcvinspectId(CK_LE, trrcvinspectId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVINSPECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trrcvinspectId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trrcvinspectId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrrcvinspectId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrrcvinspectId(), "TRRCVINSPECT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRRCVINSPECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvinspectIdList The collection of trrcvinspectId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrrcvinspectId_InScope(Collection<Long> trrcvinspectIdList) {
        doSetTrrcvinspectId_InScope(trrcvinspectIdList);
    }

    protected void doSetTrrcvinspectId_InScope(Collection<Long> trrcvinspectIdList) {
        regINS(CK_INS, cTL(trrcvinspectIdList), xgetCValueTrrcvinspectId(), "TRRCVINSPECT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRRCVINSPECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvinspectIdList The collection of trrcvinspectId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrrcvinspectId_NotInScope(Collection<Long> trrcvinspectIdList) {
        doSetTrrcvinspectId_NotInScope(trrcvinspectIdList);
    }

    protected void doSetTrrcvinspectId_NotInScope(Collection<Long> trrcvinspectIdList) {
        regINS(CK_NINS, cTL(trrcvinspectIdList), xgetCValueTrrcvinspectId(), "TRRCVINSPECT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRRCVINSPECT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrrcvinspectId_IsNull() { regTrrcvinspectId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRRCVINSPECT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrrcvinspectId_IsNotNull() { regTrrcvinspectId(CK_ISNN, DOBJ); }

    protected void regTrrcvinspectId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrrcvinspectId(), "TRRCVINSPECT_ID"); }
    protected abstract ConditionValue xgetCValueTrrcvinspectId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {IX, decimal(16, 6)}
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
     * ACCEPTKEY: {IX, decimal(16, 6)}
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
     * ACCEPTKEY: {IX, decimal(16, 6)}
     * @param acceptkey The value of acceptkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptkey_GreaterThan(java.math.BigDecimal acceptkey) {
        regAcceptkey(CK_GT, acceptkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {IX, decimal(16, 6)}
     * @param acceptkey The value of acceptkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptkey_LessThan(java.math.BigDecimal acceptkey) {
        regAcceptkey(CK_LT, acceptkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {IX, decimal(16, 6)}
     * @param acceptkey The value of acceptkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptkey_GreaterEqual(java.math.BigDecimal acceptkey) {
        regAcceptkey(CK_GE, acceptkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {IX, decimal(16, 6)}
     * @param acceptkey The value of acceptkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptkey_LessEqual(java.math.BigDecimal acceptkey) {
        regAcceptkey(CK_LE, acceptkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {IX, decimal(16, 6)}
     * @param minNumber The min number of acceptkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of acceptkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAcceptkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAcceptkey(), "ACCEPTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACCEPTKEY: {IX, decimal(16, 6)}
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
     * ACCEPTKEY: {IX, decimal(16, 6)}
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
     * ACCEPTKEY: {IX, decimal(16, 6)}
     */
    public void setAcceptkey_IsNull() { regAcceptkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACCEPTKEY: {IX, decimal(16, 6)}
     */
    public void setAcceptkey_IsNotNull() { regAcceptkey(CK_ISNN, DOBJ); }

    protected void regAcceptkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAcceptkey(), "ACCEPTKEY"); }
    protected abstract ConditionValue xgetCValueAcceptkey();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercd The value of inspectusercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_Equal(String inspectusercd) {
        doSetInspectusercd_Equal(fRES(inspectusercd));
    }

    protected void doSetInspectusercd_Equal(String inspectusercd) {
        regInspectusercd(CK_EQ, inspectusercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercd The value of inspectusercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_NotEqual(String inspectusercd) {
        doSetInspectusercd_NotEqual(fRES(inspectusercd));
    }

    protected void doSetInspectusercd_NotEqual(String inspectusercd) {
        regInspectusercd(CK_NES, inspectusercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercd The value of inspectusercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_GreaterThan(String inspectusercd) {
        regInspectusercd(CK_GT, fRES(inspectusercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercd The value of inspectusercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_LessThan(String inspectusercd) {
        regInspectusercd(CK_LT, fRES(inspectusercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercd The value of inspectusercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_GreaterEqual(String inspectusercd) {
        regInspectusercd(CK_GE, fRES(inspectusercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercd The value of inspectusercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_LessEqual(String inspectusercd) {
        regInspectusercd(CK_LE, fRES(inspectusercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercdList The collection of inspectusercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_InScope(Collection<String> inspectusercdList) {
        doSetInspectusercd_InScope(inspectusercdList);
    }

    protected void doSetInspectusercd_InScope(Collection<String> inspectusercdList) {
        regINS(CK_INS, cTL(inspectusercdList), xgetCValueInspectusercd(), "INSPECTUSERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercdList The collection of inspectusercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_NotInScope(Collection<String> inspectusercdList) {
        doSetInspectusercd_NotInScope(inspectusercdList);
    }

    protected void doSetInspectusercd_NotInScope(Collection<String> inspectusercdList) {
        regINS(CK_NINS, cTL(inspectusercdList), xgetCValueInspectusercd(), "INSPECTUSERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSPECTUSERCD: {varchar(30)} <br>
     * <pre>e.g. setInspectusercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inspectusercd The value of inspectusercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInspectusercd_LikeSearch(String inspectusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inspectusercd), xgetCValueInspectusercd(), "INSPECTUSERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercd The value of inspectusercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInspectusercd_NotLikeSearch(String inspectusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inspectusercd), xgetCValueInspectusercd(), "INSPECTUSERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercd The value of inspectusercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_PrefixSearch(String inspectusercd) {
        setInspectusercd_LikeSearch(inspectusercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     */
    public void setInspectusercd_IsNull() { regInspectusercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     */
    public void setInspectusercd_IsNullOrEmpty() { regInspectusercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     */
    public void setInspectusercd_IsNotNull() { regInspectusercd(CK_ISNN, DOBJ); }

    protected void regInspectusercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectusercd(), "INSPECTUSERCD"); }
    protected abstract ConditionValue xgetCValueInspectusercd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_Equal(java.math.BigDecimal inspectedqty1) {
        doSetInspectedqty1_Equal(inspectedqty1);
    }

    protected void doSetInspectedqty1_Equal(java.math.BigDecimal inspectedqty1) {
        regInspectedqty1(CK_EQ, inspectedqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_NotEqual(java.math.BigDecimal inspectedqty1) {
        doSetInspectedqty1_NotEqual(inspectedqty1);
    }

    protected void doSetInspectedqty1_NotEqual(java.math.BigDecimal inspectedqty1) {
        regInspectedqty1(CK_NES, inspectedqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_GreaterThan(java.math.BigDecimal inspectedqty1) {
        regInspectedqty1(CK_GT, inspectedqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_LessThan(java.math.BigDecimal inspectedqty1) {
        regInspectedqty1(CK_LT, inspectedqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_GreaterEqual(java.math.BigDecimal inspectedqty1) {
        regInspectedqty1(CK_GE, inspectedqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_LessEqual(java.math.BigDecimal inspectedqty1) {
        regInspectedqty1(CK_LE, inspectedqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of inspectedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inspectedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInspectedqty1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInspectedqty1(), "INSPECTEDQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inspectedqty1List The collection of inspectedqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedqty1_InScope(Collection<java.math.BigDecimal> inspectedqty1List) {
        doSetInspectedqty1_InScope(inspectedqty1List);
    }

    protected void doSetInspectedqty1_InScope(Collection<java.math.BigDecimal> inspectedqty1List) {
        regINS(CK_INS, cTL(inspectedqty1List), xgetCValueInspectedqty1(), "INSPECTEDQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inspectedqty1List The collection of inspectedqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedqty1_NotInScope(Collection<java.math.BigDecimal> inspectedqty1List) {
        doSetInspectedqty1_NotInScope(inspectedqty1List);
    }

    protected void doSetInspectedqty1_NotInScope(Collection<java.math.BigDecimal> inspectedqty1List) {
        regINS(CK_NINS, cTL(inspectedqty1List), xgetCValueInspectedqty1(), "INSPECTEDQTY1");
    }

    protected void regInspectedqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectedqty1(), "INSPECTEDQTY1"); }
    protected abstract ConditionValue xgetCValueInspectedqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty2 The value of inspectedqty2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty2_Equal(Long inspectedqty2) {
        doSetInspectedqty2_Equal(inspectedqty2);
    }

    protected void doSetInspectedqty2_Equal(Long inspectedqty2) {
        regInspectedqty2(CK_EQ, inspectedqty2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty2 The value of inspectedqty2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty2_NotEqual(Long inspectedqty2) {
        doSetInspectedqty2_NotEqual(inspectedqty2);
    }

    protected void doSetInspectedqty2_NotEqual(Long inspectedqty2) {
        regInspectedqty2(CK_NES, inspectedqty2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty2 The value of inspectedqty2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty2_GreaterThan(Long inspectedqty2) {
        regInspectedqty2(CK_GT, inspectedqty2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty2 The value of inspectedqty2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty2_LessThan(Long inspectedqty2) {
        regInspectedqty2(CK_LT, inspectedqty2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty2 The value of inspectedqty2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty2_GreaterEqual(Long inspectedqty2) {
        regInspectedqty2(CK_GE, inspectedqty2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty2 The value of inspectedqty2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty2_LessEqual(Long inspectedqty2) {
        regInspectedqty2(CK_LE, inspectedqty2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of inspectedqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inspectedqty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInspectedqty2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInspectedqty2(), "INSPECTEDQTY2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty2List The collection of inspectedqty2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedqty2_InScope(Collection<Long> inspectedqty2List) {
        doSetInspectedqty2_InScope(inspectedqty2List);
    }

    protected void doSetInspectedqty2_InScope(Collection<Long> inspectedqty2List) {
        regINS(CK_INS, cTL(inspectedqty2List), xgetCValueInspectedqty2(), "INSPECTEDQTY2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty2List The collection of inspectedqty2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedqty2_NotInScope(Collection<Long> inspectedqty2List) {
        doSetInspectedqty2_NotInScope(inspectedqty2List);
    }

    protected void doSetInspectedqty2_NotInScope(Collection<Long> inspectedqty2List) {
        regINS(CK_NINS, cTL(inspectedqty2List), xgetCValueInspectedqty2(), "INSPECTEDQTY2");
    }

    protected void regInspectedqty2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectedqty2(), "INSPECTEDQTY2"); }
    protected abstract ConditionValue xgetCValueInspectedqty2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty3 The value of inspectedqty3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty3_Equal(Long inspectedqty3) {
        doSetInspectedqty3_Equal(inspectedqty3);
    }

    protected void doSetInspectedqty3_Equal(Long inspectedqty3) {
        regInspectedqty3(CK_EQ, inspectedqty3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty3 The value of inspectedqty3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty3_NotEqual(Long inspectedqty3) {
        doSetInspectedqty3_NotEqual(inspectedqty3);
    }

    protected void doSetInspectedqty3_NotEqual(Long inspectedqty3) {
        regInspectedqty3(CK_NES, inspectedqty3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty3 The value of inspectedqty3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty3_GreaterThan(Long inspectedqty3) {
        regInspectedqty3(CK_GT, inspectedqty3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty3 The value of inspectedqty3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty3_LessThan(Long inspectedqty3) {
        regInspectedqty3(CK_LT, inspectedqty3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty3 The value of inspectedqty3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty3_GreaterEqual(Long inspectedqty3) {
        regInspectedqty3(CK_GE, inspectedqty3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty3 The value of inspectedqty3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty3_LessEqual(Long inspectedqty3) {
        regInspectedqty3(CK_LE, inspectedqty3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of inspectedqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inspectedqty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInspectedqty3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInspectedqty3(), "INSPECTEDQTY3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty3List The collection of inspectedqty3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedqty3_InScope(Collection<Long> inspectedqty3List) {
        doSetInspectedqty3_InScope(inspectedqty3List);
    }

    protected void doSetInspectedqty3_InScope(Collection<Long> inspectedqty3List) {
        regINS(CK_INS, cTL(inspectedqty3List), xgetCValueInspectedqty3(), "INSPECTEDQTY3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty3List The collection of inspectedqty3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedqty3_NotInScope(Collection<Long> inspectedqty3List) {
        doSetInspectedqty3_NotInScope(inspectedqty3List);
    }

    protected void doSetInspectedqty3_NotInScope(Collection<Long> inspectedqty3List) {
        regINS(CK_NINS, cTL(inspectedqty3List), xgetCValueInspectedqty3(), "INSPECTEDQTY3");
    }

    protected void regInspectedqty3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectedqty3(), "INSPECTEDQTY3"); }
    protected abstract ConditionValue xgetCValueInspectedqty3();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
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
     * WAREHOUSECD: {varchar(30)}
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
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterThan(String warehousecd) {
        regWarehousecd(CK_GT, fRES(warehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessThan(String warehousecd) {
        regWarehousecd(CK_LT, fRES(warehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterEqual(String warehousecd) {
        regWarehousecd(CK_GE, fRES(warehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessEqual(String warehousecd) {
        regWarehousecd(CK_LE, fRES(warehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
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
     * WAREHOUSECD: {varchar(30)}
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
     * WAREHOUSECD: {varchar(30)} <br>
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
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecd_NotLikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     * @param warehousecd The value of warehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_PrefixSearch(String warehousecd) {
        setWarehousecd_LikeSearch(warehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     */
    public void setWarehousecd_IsNull() { regWarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     */
    public void setWarehousecd_IsNullOrEmpty() { regWarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(30)}
     */
    public void setWarehousecd_IsNotNull() { regWarehousecd(CK_ISNN, DOBJ); }

    protected void regWarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecd(), "WAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueWarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
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
     * OWNERCD: {NotNull, varchar(30)}
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
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_GreaterThan(String ownercd) {
        regOwnercd(CK_GT, fRES(ownercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_LessThan(String ownercd) {
        regOwnercd(CK_LT, fRES(ownercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_GreaterEqual(String ownercd) {
        regOwnercd(CK_GE, fRES(ownercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_LessEqual(String ownercd) {
        regOwnercd(CK_LE, fRES(ownercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
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
     * OWNERCD: {NotNull, varchar(30)}
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
     * OWNERCD: {NotNull, varchar(30)} <br>
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
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnercd_NotLikeSearch(String ownercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownercd), xgetCValueOwnercd(), "OWNERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_PrefixSearch(String ownercd) {
        setOwnercd_LikeSearch(ownercd, xcLSOPPre());
    }

    protected void regOwnercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnercd(), "OWNERCD"); }
    protected abstract ConditionValue xgetCValueOwnercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {IX+, NotNull, varchar(30)}
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
     * ITEMADMIN: {IX+, NotNull, varchar(30)}
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
     * ITEMADMIN: {IX+, NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_GreaterThan(String itemadmin) {
        regItemadmin(CK_GT, fRES(itemadmin));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {IX+, NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_LessThan(String itemadmin) {
        regItemadmin(CK_LT, fRES(itemadmin));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {IX+, NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_GreaterEqual(String itemadmin) {
        regItemadmin(CK_GE, fRES(itemadmin));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {IX+, NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_LessEqual(String itemadmin) {
        regItemadmin(CK_LE, fRES(itemadmin));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {IX+, NotNull, varchar(30)}
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
     * ITEMADMIN: {IX+, NotNull, varchar(30)}
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
     * ITEMADMIN: {IX+, NotNull, varchar(30)} <br>
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
     * ITEMADMIN: {IX+, NotNull, varchar(30)}
     * @param itemadmin The value of itemadmin as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemadmin_NotLikeSearch(String itemadmin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemadmin), xgetCValueItemadmin(), "ITEMADMIN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {IX+, NotNull, varchar(30)}
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, bigint(19)}
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
     * LOTKEY: {IX, bigint(19)}
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
     * LOTKEY: {IX, bigint(19)}
     * @param lotkey The value of lotkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_GreaterThan(Long lotkey) {
        regLotkey(CK_GT, lotkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, bigint(19)}
     * @param lotkey The value of lotkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_LessThan(Long lotkey) {
        regLotkey(CK_LT, lotkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, bigint(19)}
     * @param lotkey The value of lotkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_GreaterEqual(Long lotkey) {
        regLotkey(CK_GE, lotkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, bigint(19)}
     * @param lotkey The value of lotkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotkey_LessEqual(Long lotkey) {
        regLotkey(CK_LE, lotkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOTKEY: {IX, bigint(19)}
     * @param minNumber The min number of lotkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotkey(), "LOTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOTKEY: {IX, bigint(19)}
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
     * LOTKEY: {IX, bigint(19)}
     * @param lotkeyList The collection of lotkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotkey_NotInScope(Collection<Long> lotkeyList) {
        doSetLotkey_NotInScope(lotkeyList);
    }

    protected void doSetLotkey_NotInScope(Collection<Long> lotkeyList) {
        regINS(CK_NINS, cTL(lotkeyList), xgetCValueLotkey(), "LOTKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOTKEY: {IX, bigint(19)}
     */
    public void setLotkey_IsNull() { regLotkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOTKEY: {IX, bigint(19)}
     */
    public void setLotkey_IsNotNull() { regLotkey(CK_ISNN, DOBJ); }

    protected void regLotkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotkey(), "LOTKEY"); }
    protected abstract ConditionValue xgetCValueLotkey();

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
    public HpSLCFunction<TTrrcvinspectCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrrcvinspectCB.class);
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
    public HpSLCFunction<TTrrcvinspectCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrrcvinspectCB.class);
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
    public HpSLCFunction<TTrrcvinspectCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrrcvinspectCB.class);
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
    public HpSLCFunction<TTrrcvinspectCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrrcvinspectCB.class);
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
    public HpSLCFunction<TTrrcvinspectCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrrcvinspectCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrrcvinspectCB&gt;() {
     *     public void query(TTrrcvinspectCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrrcvinspectCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrrcvinspectCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrrcvinspectCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrrcvinspectCQ sq);

    protected TTrrcvinspectCB xcreateScalarConditionCB() {
        TTrrcvinspectCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrrcvinspectCB xcreateScalarConditionPartitionByCB() {
        TTrrcvinspectCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrrcvinspectCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrrcvinspectCB cb = new TTrrcvinspectCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRRCVINSPECT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrrcvinspectCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrrcvinspectCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrrcvinspectCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrrcvinspectCB cb = new TTrrcvinspectCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRRCVINSPECT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrrcvinspectCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrrcvinspectCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrrcvinspectCB cb = new TTrrcvinspectCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrrcvinspectCQ sq);

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
    protected TTrrcvinspectCB newMyCB() {
        return new TTrrcvinspectCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrrcvinspectCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
