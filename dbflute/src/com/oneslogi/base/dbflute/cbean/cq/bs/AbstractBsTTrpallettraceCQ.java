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
 * The abstract condition-query of T_TRPALLETTRACE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrpallettraceCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrpallettraceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRPALLETTRACE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpallettraceId The value of trpallettraceId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpallettraceId_Equal(Long trpallettraceId) {
        doSetTrpallettraceId_Equal(trpallettraceId);
    }

    protected void doSetTrpallettraceId_Equal(Long trpallettraceId) {
        regTrpallettraceId(CK_EQ, trpallettraceId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpallettraceId The value of trpallettraceId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpallettraceId_NotEqual(Long trpallettraceId) {
        doSetTrpallettraceId_NotEqual(trpallettraceId);
    }

    protected void doSetTrpallettraceId_NotEqual(Long trpallettraceId) {
        regTrpallettraceId(CK_NES, trpallettraceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpallettraceId The value of trpallettraceId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpallettraceId_GreaterThan(Long trpallettraceId) {
        regTrpallettraceId(CK_GT, trpallettraceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpallettraceId The value of trpallettraceId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpallettraceId_LessThan(Long trpallettraceId) {
        regTrpallettraceId(CK_LT, trpallettraceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpallettraceId The value of trpallettraceId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpallettraceId_GreaterEqual(Long trpallettraceId) {
        regTrpallettraceId(CK_GE, trpallettraceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpallettraceId The value of trpallettraceId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpallettraceId_LessEqual(Long trpallettraceId) {
        regTrpallettraceId(CK_LE, trpallettraceId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRPALLETTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trpallettraceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trpallettraceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrpallettraceId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrpallettraceId(), "TRPALLETTRACE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPALLETTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpallettraceIdList The collection of trpallettraceId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrpallettraceId_InScope(Collection<Long> trpallettraceIdList) {
        doSetTrpallettraceId_InScope(trpallettraceIdList);
    }

    protected void doSetTrpallettraceId_InScope(Collection<Long> trpallettraceIdList) {
        regINS(CK_INS, cTL(trpallettraceIdList), xgetCValueTrpallettraceId(), "TRPALLETTRACE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPALLETTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpallettraceIdList The collection of trpallettraceId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrpallettraceId_NotInScope(Collection<Long> trpallettraceIdList) {
        doSetTrpallettraceId_NotInScope(trpallettraceIdList);
    }

    protected void doSetTrpallettraceId_NotInScope(Collection<Long> trpallettraceIdList) {
        regINS(CK_NINS, cTL(trpallettraceIdList), xgetCValueTrpallettraceId(), "TRPALLETTRACE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRPALLETTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrpallettraceId_IsNull() { regTrpallettraceId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRPALLETTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrpallettraceId_IsNotNull() { regTrpallettraceId(CK_ISNN, DOBJ); }

    protected void regTrpallettraceId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrpallettraceId(), "TRPALLETTRACE_ID"); }
    protected abstract ConditionValue xgetCValueTrpallettraceId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETTRACENO: {NotNull, decimal(16, 6)}
     * @param pallettraceno The value of pallettraceno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPallettraceno_Equal(java.math.BigDecimal pallettraceno) {
        doSetPallettraceno_Equal(pallettraceno);
    }

    protected void doSetPallettraceno_Equal(java.math.BigDecimal pallettraceno) {
        regPallettraceno(CK_EQ, pallettraceno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETTRACENO: {NotNull, decimal(16, 6)}
     * @param pallettraceno The value of pallettraceno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPallettraceno_NotEqual(java.math.BigDecimal pallettraceno) {
        doSetPallettraceno_NotEqual(pallettraceno);
    }

    protected void doSetPallettraceno_NotEqual(java.math.BigDecimal pallettraceno) {
        regPallettraceno(CK_NES, pallettraceno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETTRACENO: {NotNull, decimal(16, 6)}
     * @param pallettraceno The value of pallettraceno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPallettraceno_GreaterThan(java.math.BigDecimal pallettraceno) {
        regPallettraceno(CK_GT, pallettraceno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETTRACENO: {NotNull, decimal(16, 6)}
     * @param pallettraceno The value of pallettraceno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPallettraceno_LessThan(java.math.BigDecimal pallettraceno) {
        regPallettraceno(CK_LT, pallettraceno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETTRACENO: {NotNull, decimal(16, 6)}
     * @param pallettraceno The value of pallettraceno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPallettraceno_GreaterEqual(java.math.BigDecimal pallettraceno) {
        regPallettraceno(CK_GE, pallettraceno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETTRACENO: {NotNull, decimal(16, 6)}
     * @param pallettraceno The value of pallettraceno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPallettraceno_LessEqual(java.math.BigDecimal pallettraceno) {
        regPallettraceno(CK_LE, pallettraceno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETTRACENO: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of pallettraceno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pallettraceno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPallettraceno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePallettraceno(), "PALLETTRACENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETTRACENO: {NotNull, decimal(16, 6)}
     * @param pallettracenoList The collection of pallettraceno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettraceno_InScope(Collection<java.math.BigDecimal> pallettracenoList) {
        doSetPallettraceno_InScope(pallettracenoList);
    }

    protected void doSetPallettraceno_InScope(Collection<java.math.BigDecimal> pallettracenoList) {
        regINS(CK_INS, cTL(pallettracenoList), xgetCValuePallettraceno(), "PALLETTRACENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETTRACENO: {NotNull, decimal(16, 6)}
     * @param pallettracenoList The collection of pallettraceno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettraceno_NotInScope(Collection<java.math.BigDecimal> pallettracenoList) {
        doSetPallettraceno_NotInScope(pallettracenoList);
    }

    protected void doSetPallettraceno_NotInScope(Collection<java.math.BigDecimal> pallettracenoList) {
        regINS(CK_NINS, cTL(pallettracenoList), xgetCValuePallettraceno(), "PALLETTRACENO");
    }

    protected void regPallettraceno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePallettraceno(), "PALLETTRACENO"); }
    protected abstract ConditionValue xgetCValuePallettraceno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETTRACETYPE: {NotNull, varchar(30)}
     * @param pallettracetype The value of pallettracetype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettracetype_Equal(String pallettracetype) {
        doSetPallettracetype_Equal(fRES(pallettracetype));
    }

    protected void doSetPallettracetype_Equal(String pallettracetype) {
        regPallettracetype(CK_EQ, pallettracetype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETTRACETYPE: {NotNull, varchar(30)}
     * @param pallettracetype The value of pallettracetype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettracetype_NotEqual(String pallettracetype) {
        doSetPallettracetype_NotEqual(fRES(pallettracetype));
    }

    protected void doSetPallettracetype_NotEqual(String pallettracetype) {
        regPallettracetype(CK_NES, pallettracetype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETTRACETYPE: {NotNull, varchar(30)}
     * @param pallettracetype The value of pallettracetype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettracetype_GreaterThan(String pallettracetype) {
        regPallettracetype(CK_GT, fRES(pallettracetype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETTRACETYPE: {NotNull, varchar(30)}
     * @param pallettracetype The value of pallettracetype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettracetype_LessThan(String pallettracetype) {
        regPallettracetype(CK_LT, fRES(pallettracetype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETTRACETYPE: {NotNull, varchar(30)}
     * @param pallettracetype The value of pallettracetype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettracetype_GreaterEqual(String pallettracetype) {
        regPallettracetype(CK_GE, fRES(pallettracetype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETTRACETYPE: {NotNull, varchar(30)}
     * @param pallettracetype The value of pallettracetype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettracetype_LessEqual(String pallettracetype) {
        regPallettracetype(CK_LE, fRES(pallettracetype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETTRACETYPE: {NotNull, varchar(30)}
     * @param pallettracetypeList The collection of pallettracetype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettracetype_InScope(Collection<String> pallettracetypeList) {
        doSetPallettracetype_InScope(pallettracetypeList);
    }

    protected void doSetPallettracetype_InScope(Collection<String> pallettracetypeList) {
        regINS(CK_INS, cTL(pallettracetypeList), xgetCValuePallettracetype(), "PALLETTRACETYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETTRACETYPE: {NotNull, varchar(30)}
     * @param pallettracetypeList The collection of pallettracetype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettracetype_NotInScope(Collection<String> pallettracetypeList) {
        doSetPallettracetype_NotInScope(pallettracetypeList);
    }

    protected void doSetPallettracetype_NotInScope(Collection<String> pallettracetypeList) {
        regINS(CK_NINS, cTL(pallettracetypeList), xgetCValuePallettracetype(), "PALLETTRACETYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETTRACETYPE: {NotNull, varchar(30)} <br>
     * <pre>e.g. setPallettracetype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pallettracetype The value of pallettracetype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPallettracetype_LikeSearch(String pallettracetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pallettracetype), xgetCValuePallettracetype(), "PALLETTRACETYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETTRACETYPE: {NotNull, varchar(30)}
     * @param pallettracetype The value of pallettracetype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPallettracetype_NotLikeSearch(String pallettracetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pallettracetype), xgetCValuePallettracetype(), "PALLETTRACETYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETTRACETYPE: {NotNull, varchar(30)}
     * @param pallettracetype The value of pallettracetype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettracetype_PrefixSearch(String pallettracetype) {
        setPallettracetype_LikeSearch(pallettracetype, xcLSOPPre());
    }

    protected void regPallettracetype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePallettracetype(), "PALLETTRACETYPE"); }
    protected abstract ConditionValue xgetCValuePallettracetype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENTPALLETNO: {decimal(16, 6)}
     * @param parentpalletno The value of parentpalletno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentpalletno_Equal(java.math.BigDecimal parentpalletno) {
        doSetParentpalletno_Equal(parentpalletno);
    }

    protected void doSetParentpalletno_Equal(java.math.BigDecimal parentpalletno) {
        regParentpalletno(CK_EQ, parentpalletno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENTPALLETNO: {decimal(16, 6)}
     * @param parentpalletno The value of parentpalletno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentpalletno_NotEqual(java.math.BigDecimal parentpalletno) {
        doSetParentpalletno_NotEqual(parentpalletno);
    }

    protected void doSetParentpalletno_NotEqual(java.math.BigDecimal parentpalletno) {
        regParentpalletno(CK_NES, parentpalletno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENTPALLETNO: {decimal(16, 6)}
     * @param parentpalletno The value of parentpalletno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentpalletno_GreaterThan(java.math.BigDecimal parentpalletno) {
        regParentpalletno(CK_GT, parentpalletno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENTPALLETNO: {decimal(16, 6)}
     * @param parentpalletno The value of parentpalletno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentpalletno_LessThan(java.math.BigDecimal parentpalletno) {
        regParentpalletno(CK_LT, parentpalletno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENTPALLETNO: {decimal(16, 6)}
     * @param parentpalletno The value of parentpalletno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentpalletno_GreaterEqual(java.math.BigDecimal parentpalletno) {
        regParentpalletno(CK_GE, parentpalletno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENTPALLETNO: {decimal(16, 6)}
     * @param parentpalletno The value of parentpalletno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentpalletno_LessEqual(java.math.BigDecimal parentpalletno) {
        regParentpalletno(CK_LE, parentpalletno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PARENTPALLETNO: {decimal(16, 6)}
     * @param minNumber The min number of parentpalletno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of parentpalletno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setParentpalletno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueParentpalletno(), "PARENTPALLETNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARENTPALLETNO: {decimal(16, 6)}
     * @param parentpalletnoList The collection of parentpalletno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentpalletno_InScope(Collection<java.math.BigDecimal> parentpalletnoList) {
        doSetParentpalletno_InScope(parentpalletnoList);
    }

    protected void doSetParentpalletno_InScope(Collection<java.math.BigDecimal> parentpalletnoList) {
        regINS(CK_INS, cTL(parentpalletnoList), xgetCValueParentpalletno(), "PARENTPALLETNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARENTPALLETNO: {decimal(16, 6)}
     * @param parentpalletnoList The collection of parentpalletno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentpalletno_NotInScope(Collection<java.math.BigDecimal> parentpalletnoList) {
        doSetParentpalletno_NotInScope(parentpalletnoList);
    }

    protected void doSetParentpalletno_NotInScope(Collection<java.math.BigDecimal> parentpalletnoList) {
        regINS(CK_NINS, cTL(parentpalletnoList), xgetCValueParentpalletno(), "PARENTPALLETNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PARENTPALLETNO: {decimal(16, 6)}
     */
    public void setParentpalletno_IsNull() { regParentpalletno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PARENTPALLETNO: {decimal(16, 6)}
     */
    public void setParentpalletno_IsNotNull() { regParentpalletno(CK_ISNN, DOBJ); }

    protected void regParentpalletno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueParentpalletno(), "PARENTPALLETNO"); }
    protected abstract ConditionValue xgetCValueParentpalletno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILDPALLETNO: {decimal(16, 6)}
     * @param childpalletno The value of childpalletno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildpalletno_Equal(java.math.BigDecimal childpalletno) {
        doSetChildpalletno_Equal(childpalletno);
    }

    protected void doSetChildpalletno_Equal(java.math.BigDecimal childpalletno) {
        regChildpalletno(CK_EQ, childpalletno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILDPALLETNO: {decimal(16, 6)}
     * @param childpalletno The value of childpalletno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildpalletno_NotEqual(java.math.BigDecimal childpalletno) {
        doSetChildpalletno_NotEqual(childpalletno);
    }

    protected void doSetChildpalletno_NotEqual(java.math.BigDecimal childpalletno) {
        regChildpalletno(CK_NES, childpalletno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILDPALLETNO: {decimal(16, 6)}
     * @param childpalletno The value of childpalletno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildpalletno_GreaterThan(java.math.BigDecimal childpalletno) {
        regChildpalletno(CK_GT, childpalletno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILDPALLETNO: {decimal(16, 6)}
     * @param childpalletno The value of childpalletno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildpalletno_LessThan(java.math.BigDecimal childpalletno) {
        regChildpalletno(CK_LT, childpalletno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILDPALLETNO: {decimal(16, 6)}
     * @param childpalletno The value of childpalletno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildpalletno_GreaterEqual(java.math.BigDecimal childpalletno) {
        regChildpalletno(CK_GE, childpalletno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILDPALLETNO: {decimal(16, 6)}
     * @param childpalletno The value of childpalletno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildpalletno_LessEqual(java.math.BigDecimal childpalletno) {
        regChildpalletno(CK_LE, childpalletno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CHILDPALLETNO: {decimal(16, 6)}
     * @param minNumber The min number of childpalletno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of childpalletno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setChildpalletno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueChildpalletno(), "CHILDPALLETNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHILDPALLETNO: {decimal(16, 6)}
     * @param childpalletnoList The collection of childpalletno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChildpalletno_InScope(Collection<java.math.BigDecimal> childpalletnoList) {
        doSetChildpalletno_InScope(childpalletnoList);
    }

    protected void doSetChildpalletno_InScope(Collection<java.math.BigDecimal> childpalletnoList) {
        regINS(CK_INS, cTL(childpalletnoList), xgetCValueChildpalletno(), "CHILDPALLETNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHILDPALLETNO: {decimal(16, 6)}
     * @param childpalletnoList The collection of childpalletno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChildpalletno_NotInScope(Collection<java.math.BigDecimal> childpalletnoList) {
        doSetChildpalletno_NotInScope(childpalletnoList);
    }

    protected void doSetChildpalletno_NotInScope(Collection<java.math.BigDecimal> childpalletnoList) {
        regINS(CK_NINS, cTL(childpalletnoList), xgetCValueChildpalletno(), "CHILDPALLETNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHILDPALLETNO: {decimal(16, 6)}
     */
    public void setChildpalletno_IsNull() { regChildpalletno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHILDPALLETNO: {decimal(16, 6)}
     */
    public void setChildpalletno_IsNotNull() { regChildpalletno(CK_ISNN, DOBJ); }

    protected void regChildpalletno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChildpalletno(), "CHILDPALLETNO"); }
    protected abstract ConditionValue xgetCValueChildpalletno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param picklistkey The value of picklistkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistkey_Equal(Long picklistkey) {
        doSetPicklistkey_Equal(picklistkey);
    }

    protected void doSetPicklistkey_Equal(Long picklistkey) {
        regPicklistkey(CK_EQ, picklistkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param picklistkey The value of picklistkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistkey_NotEqual(Long picklistkey) {
        doSetPicklistkey_NotEqual(picklistkey);
    }

    protected void doSetPicklistkey_NotEqual(Long picklistkey) {
        regPicklistkey(CK_NES, picklistkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param picklistkey The value of picklistkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistkey_GreaterThan(Long picklistkey) {
        regPicklistkey(CK_GT, picklistkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param picklistkey The value of picklistkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistkey_LessThan(Long picklistkey) {
        regPicklistkey(CK_LT, picklistkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param picklistkey The value of picklistkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistkey_GreaterEqual(Long picklistkey) {
        regPicklistkey(CK_GE, picklistkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param picklistkey The value of picklistkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistkey_LessEqual(Long picklistkey) {
        regPicklistkey(CK_LE, picklistkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param minNumber The min number of picklistkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of picklistkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPicklistkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePicklistkey(), "PICKLISTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param picklistkeyList The collection of picklistkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistkey_InScope(Collection<Long> picklistkeyList) {
        doSetPicklistkey_InScope(picklistkeyList);
    }

    protected void doSetPicklistkey_InScope(Collection<Long> picklistkeyList) {
        regINS(CK_INS, cTL(picklistkeyList), xgetCValuePicklistkey(), "PICKLISTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     * @param picklistkeyList The collection of picklistkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistkey_NotInScope(Collection<Long> picklistkeyList) {
        doSetPicklistkey_NotInScope(picklistkeyList);
    }

    protected void doSetPicklistkey_NotInScope(Collection<Long> picklistkeyList) {
        regINS(CK_NINS, cTL(picklistkeyList), xgetCValuePicklistkey(), "PICKLISTKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     */
    public void setPicklistkey_IsNull() { regPicklistkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKLISTKEY: {bigint(19)}
     */
    public void setPicklistkey_IsNotNull() { regPicklistkey(CK_ISNN, DOBJ); }

    protected void regPicklistkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicklistkey(), "PICKLISTKEY"); }
    protected abstract ConditionValue xgetCValuePicklistkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param picklistgno The value of picklistgno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_Equal(Long picklistgno) {
        doSetPicklistgno_Equal(picklistgno);
    }

    protected void doSetPicklistgno_Equal(Long picklistgno) {
        regPicklistgno(CK_EQ, picklistgno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param picklistgno The value of picklistgno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_NotEqual(Long picklistgno) {
        doSetPicklistgno_NotEqual(picklistgno);
    }

    protected void doSetPicklistgno_NotEqual(Long picklistgno) {
        regPicklistgno(CK_NES, picklistgno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param picklistgno The value of picklistgno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_GreaterThan(Long picklistgno) {
        regPicklistgno(CK_GT, picklistgno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param picklistgno The value of picklistgno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_LessThan(Long picklistgno) {
        regPicklistgno(CK_LT, picklistgno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param picklistgno The value of picklistgno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_GreaterEqual(Long picklistgno) {
        regPicklistgno(CK_GE, picklistgno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param picklistgno The value of picklistgno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_LessEqual(Long picklistgno) {
        regPicklistgno(CK_LE, picklistgno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param minNumber The min number of picklistgno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of picklistgno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPicklistgno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePicklistgno(), "PICKLISTGNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param picklistgnoList The collection of picklistgno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistgno_InScope(Collection<Long> picklistgnoList) {
        doSetPicklistgno_InScope(picklistgnoList);
    }

    protected void doSetPicklistgno_InScope(Collection<Long> picklistgnoList) {
        regINS(CK_INS, cTL(picklistgnoList), xgetCValuePicklistgno(), "PICKLISTGNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     * @param picklistgnoList The collection of picklistgno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistgno_NotInScope(Collection<Long> picklistgnoList) {
        doSetPicklistgno_NotInScope(picklistgnoList);
    }

    protected void doSetPicklistgno_NotInScope(Collection<Long> picklistgnoList) {
        regINS(CK_NINS, cTL(picklistgnoList), xgetCValuePicklistgno(), "PICKLISTGNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     */
    public void setPicklistgno_IsNull() { regPicklistgno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKLISTGNO: {bigint(19)}
     */
    public void setPicklistgno_IsNotNull() { regPicklistgno(CK_ISNN, DOBJ); }

    protected void regPicklistgno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicklistgno(), "PICKLISTGNO"); }
    protected abstract ConditionValue xgetCValuePicklistgno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {NotNull, varchar(8), default=[sysdatetime()]}
     * @param createdatetime The value of createdatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_Equal(String createdatetime) {
        doSetCreatedatetime_Equal(fRES(createdatetime));
    }

    protected void doSetCreatedatetime_Equal(String createdatetime) {
        regCreatedatetime(CK_EQ, createdatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {NotNull, varchar(8), default=[sysdatetime()]}
     * @param createdatetime The value of createdatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_NotEqual(String createdatetime) {
        doSetCreatedatetime_NotEqual(fRES(createdatetime));
    }

    protected void doSetCreatedatetime_NotEqual(String createdatetime) {
        regCreatedatetime(CK_NES, createdatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {NotNull, varchar(8), default=[sysdatetime()]}
     * @param createdatetime The value of createdatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_GreaterThan(String createdatetime) {
        regCreatedatetime(CK_GT, fRES(createdatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {NotNull, varchar(8), default=[sysdatetime()]}
     * @param createdatetime The value of createdatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_LessThan(String createdatetime) {
        regCreatedatetime(CK_LT, fRES(createdatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {NotNull, varchar(8), default=[sysdatetime()]}
     * @param createdatetime The value of createdatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_GreaterEqual(String createdatetime) {
        regCreatedatetime(CK_GE, fRES(createdatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {NotNull, varchar(8), default=[sysdatetime()]}
     * @param createdatetime The value of createdatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_LessEqual(String createdatetime) {
        regCreatedatetime(CK_LE, fRES(createdatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {NotNull, varchar(8), default=[sysdatetime()]}
     * @param createdatetimeList The collection of createdatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_InScope(Collection<String> createdatetimeList) {
        doSetCreatedatetime_InScope(createdatetimeList);
    }

    protected void doSetCreatedatetime_InScope(Collection<String> createdatetimeList) {
        regINS(CK_INS, cTL(createdatetimeList), xgetCValueCreatedatetime(), "CREATEDATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {NotNull, varchar(8), default=[sysdatetime()]}
     * @param createdatetimeList The collection of createdatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_NotInScope(Collection<String> createdatetimeList) {
        doSetCreatedatetime_NotInScope(createdatetimeList);
    }

    protected void doSetCreatedatetime_NotInScope(Collection<String> createdatetimeList) {
        regINS(CK_NINS, cTL(createdatetimeList), xgetCValueCreatedatetime(), "CREATEDATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {NotNull, varchar(8), default=[sysdatetime()]} <br>
     * <pre>e.g. setCreatedatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createdatetime The value of createdatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCreatedatetime_LikeSearch(String createdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createdatetime), xgetCValueCreatedatetime(), "CREATEDATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {NotNull, varchar(8), default=[sysdatetime()]}
     * @param createdatetime The value of createdatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCreatedatetime_NotLikeSearch(String createdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createdatetime), xgetCValueCreatedatetime(), "CREATEDATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {NotNull, varchar(8), default=[sysdatetime()]}
     * @param createdatetime The value of createdatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_PrefixSearch(String createdatetime) {
        setCreatedatetime_LikeSearch(createdatetime, xcLSOPPre());
    }

    protected void regCreatedatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedatetime(), "CREATEDATETIME"); }
    protected abstract ConditionValue xgetCValueCreatedatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CENTER_ID from M_CENTER where ...)} <br />
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'in-scope'. (NotNull)
     */
    public void inScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_InScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", false);
    }
    public abstract String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CENTER_ID from M_CENTER where ...)} <br />
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_NotInScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", true);
    }
    public abstract String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq);

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLIENT_ID from M_CLIENT where ...)} <br />
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'in-scope'. (NotNull)
     */
    public void inScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_InScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", false);
    }
    public abstract String keepClientId_InScopeRelation_MClient(MClientCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLIENT_ID from M_CLIENT where ...)} <br />
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'not in-scope'. (NotNull)
     */
    public void notInScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_NotInScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", true);
    }
    public abstract String keepClientId_NotInScopeRelation_MClient(MClientCQ sq);

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

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
    public HpSLCFunction<TTrpallettraceCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrpallettraceCB.class);
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
    public HpSLCFunction<TTrpallettraceCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrpallettraceCB.class);
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
    public HpSLCFunction<TTrpallettraceCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrpallettraceCB.class);
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
    public HpSLCFunction<TTrpallettraceCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrpallettraceCB.class);
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
    public HpSLCFunction<TTrpallettraceCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrpallettraceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrpallettraceCB&gt;() {
     *     public void query(TTrpallettraceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrpallettraceCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrpallettraceCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpallettraceCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrpallettraceCQ sq);

    protected TTrpallettraceCB xcreateScalarConditionCB() {
        TTrpallettraceCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrpallettraceCB xcreateScalarConditionPartitionByCB() {
        TTrpallettraceCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrpallettraceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpallettraceCB cb = new TTrpallettraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRPALLETTRACE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrpallettraceCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrpallettraceCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrpallettraceCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpallettraceCB cb = new TTrpallettraceCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRPALLETTRACE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrpallettraceCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrpallettraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpallettraceCB cb = new TTrpallettraceCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrpallettraceCQ sq);

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
    protected TTrpallettraceCB newMyCB() {
        return new TTrpallettraceCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrpallettraceCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
