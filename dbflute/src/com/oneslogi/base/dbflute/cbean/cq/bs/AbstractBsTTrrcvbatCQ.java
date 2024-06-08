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
 * The abstract condition-query of T_TRRCVBAT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrrcvbatCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrrcvbatCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRRCVBAT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVBAT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvbatId The value of trrcvbatId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvbatId_Equal(Long trrcvbatId) {
        doSetTrrcvbatId_Equal(trrcvbatId);
    }

    protected void doSetTrrcvbatId_Equal(Long trrcvbatId) {
        regTrrcvbatId(CK_EQ, trrcvbatId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVBAT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvbatId The value of trrcvbatId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvbatId_NotEqual(Long trrcvbatId) {
        doSetTrrcvbatId_NotEqual(trrcvbatId);
    }

    protected void doSetTrrcvbatId_NotEqual(Long trrcvbatId) {
        regTrrcvbatId(CK_NES, trrcvbatId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVBAT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvbatId The value of trrcvbatId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvbatId_GreaterThan(Long trrcvbatId) {
        regTrrcvbatId(CK_GT, trrcvbatId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVBAT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvbatId The value of trrcvbatId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvbatId_LessThan(Long trrcvbatId) {
        regTrrcvbatId(CK_LT, trrcvbatId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVBAT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvbatId The value of trrcvbatId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvbatId_GreaterEqual(Long trrcvbatId) {
        regTrrcvbatId(CK_GE, trrcvbatId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVBAT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvbatId The value of trrcvbatId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrcvbatId_LessEqual(Long trrcvbatId) {
        regTrrcvbatId(CK_LE, trrcvbatId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRRCVBAT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trrcvbatId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trrcvbatId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrrcvbatId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrrcvbatId(), "TRRCVBAT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRRCVBAT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvbatIdList The collection of trrcvbatId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrrcvbatId_InScope(Collection<Long> trrcvbatIdList) {
        doSetTrrcvbatId_InScope(trrcvbatIdList);
    }

    protected void doSetTrrcvbatId_InScope(Collection<Long> trrcvbatIdList) {
        regINS(CK_INS, cTL(trrcvbatIdList), xgetCValueTrrcvbatId(), "TRRCVBAT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRRCVBAT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrcvbatIdList The collection of trrcvbatId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrrcvbatId_NotInScope(Collection<Long> trrcvbatIdList) {
        doSetTrrcvbatId_NotInScope(trrcvbatIdList);
    }

    protected void doSetTrrcvbatId_NotInScope(Collection<Long> trrcvbatIdList) {
        regINS(CK_NINS, cTL(trrcvbatIdList), xgetCValueTrrcvbatId(), "TRRCVBAT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRRCVBAT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrrcvbatId_IsNull() { regTrrcvbatId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRRCVBAT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrrcvbatId_IsNotNull() { regTrrcvbatId(CK_ISNN, DOBJ); }

    protected void regTrrcvbatId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrrcvbatId(), "TRRCVBAT_ID"); }
    protected abstract ConditionValue xgetCValueTrrcvbatId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BATNO: {decimal(16, 6)}
     * @param batno The value of batno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatno_Equal(java.math.BigDecimal batno) {
        doSetBatno_Equal(batno);
    }

    protected void doSetBatno_Equal(java.math.BigDecimal batno) {
        regBatno(CK_EQ, batno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BATNO: {decimal(16, 6)}
     * @param batno The value of batno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatno_NotEqual(java.math.BigDecimal batno) {
        doSetBatno_NotEqual(batno);
    }

    protected void doSetBatno_NotEqual(java.math.BigDecimal batno) {
        regBatno(CK_NES, batno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BATNO: {decimal(16, 6)}
     * @param batno The value of batno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatno_GreaterThan(java.math.BigDecimal batno) {
        regBatno(CK_GT, batno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BATNO: {decimal(16, 6)}
     * @param batno The value of batno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatno_LessThan(java.math.BigDecimal batno) {
        regBatno(CK_LT, batno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BATNO: {decimal(16, 6)}
     * @param batno The value of batno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatno_GreaterEqual(java.math.BigDecimal batno) {
        regBatno(CK_GE, batno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BATNO: {decimal(16, 6)}
     * @param batno The value of batno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatno_LessEqual(java.math.BigDecimal batno) {
        regBatno(CK_LE, batno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BATNO: {decimal(16, 6)}
     * @param minNumber The min number of batno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of batno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBatno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBatno(), "BATNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BATNO: {decimal(16, 6)}
     * @param batnoList The collection of batno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatno_InScope(Collection<java.math.BigDecimal> batnoList) {
        doSetBatno_InScope(batnoList);
    }

    protected void doSetBatno_InScope(Collection<java.math.BigDecimal> batnoList) {
        regINS(CK_INS, cTL(batnoList), xgetCValueBatno(), "BATNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BATNO: {decimal(16, 6)}
     * @param batnoList The collection of batno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatno_NotInScope(Collection<java.math.BigDecimal> batnoList) {
        doSetBatno_NotInScope(batnoList);
    }

    protected void doSetBatno_NotInScope(Collection<java.math.BigDecimal> batnoList) {
        regINS(CK_NINS, cTL(batnoList), xgetCValueBatno(), "BATNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATNO: {decimal(16, 6)}
     */
    public void setBatno_IsNull() { regBatno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATNO: {decimal(16, 6)}
     */
    public void setBatno_IsNotNull() { regBatno(CK_ISNN, DOBJ); }

    protected void regBatno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatno(), "BATNO"); }
    protected abstract ConditionValue xgetCValueBatno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(30)}
     * @param batdelino The value of batdelino as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_Equal(String batdelino) {
        doSetBatdelino_Equal(fRES(batdelino));
    }

    protected void doSetBatdelino_Equal(String batdelino) {
        regBatdelino(CK_EQ, batdelino);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(30)}
     * @param batdelino The value of batdelino as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_NotEqual(String batdelino) {
        doSetBatdelino_NotEqual(fRES(batdelino));
    }

    protected void doSetBatdelino_NotEqual(String batdelino) {
        regBatdelino(CK_NES, batdelino);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(30)}
     * @param batdelino The value of batdelino as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_GreaterThan(String batdelino) {
        regBatdelino(CK_GT, fRES(batdelino));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(30)}
     * @param batdelino The value of batdelino as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_LessThan(String batdelino) {
        regBatdelino(CK_LT, fRES(batdelino));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(30)}
     * @param batdelino The value of batdelino as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_GreaterEqual(String batdelino) {
        regBatdelino(CK_GE, fRES(batdelino));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(30)}
     * @param batdelino The value of batdelino as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_LessEqual(String batdelino) {
        regBatdelino(CK_LE, fRES(batdelino));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATDELINO: {varchar(30)}
     * @param batdelinoList The collection of batdelino as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_InScope(Collection<String> batdelinoList) {
        doSetBatdelino_InScope(batdelinoList);
    }

    protected void doSetBatdelino_InScope(Collection<String> batdelinoList) {
        regINS(CK_INS, cTL(batdelinoList), xgetCValueBatdelino(), "BATDELINO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATDELINO: {varchar(30)}
     * @param batdelinoList The collection of batdelino as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_NotInScope(Collection<String> batdelinoList) {
        doSetBatdelino_NotInScope(batdelinoList);
    }

    protected void doSetBatdelino_NotInScope(Collection<String> batdelinoList) {
        regINS(CK_NINS, cTL(batdelinoList), xgetCValueBatdelino(), "BATDELINO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATDELINO: {varchar(30)} <br>
     * <pre>e.g. setBatdelino_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batdelino The value of batdelino as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatdelino_LikeSearch(String batdelino, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batdelino), xgetCValueBatdelino(), "BATDELINO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATDELINO: {varchar(30)}
     * @param batdelino The value of batdelino as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatdelino_NotLikeSearch(String batdelino, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batdelino), xgetCValueBatdelino(), "BATDELINO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATDELINO: {varchar(30)}
     * @param batdelino The value of batdelino as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_PrefixSearch(String batdelino) {
        setBatdelino_LikeSearch(batdelino, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(30)}
     */
    public void setBatdelino_IsNull() { regBatdelino(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(30)}
     */
    public void setBatdelino_IsNullOrEmpty() { regBatdelino(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(30)}
     */
    public void setBatdelino_IsNotNull() { regBatdelino(CK_ISNN, DOBJ); }

    protected void regBatdelino(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatdelino(), "BATDELINO"); }
    protected abstract ConditionValue xgetCValueBatdelino();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {bigint(19)}
     * @param batdelidetailno The value of batdelidetailno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatdelidetailno_Equal(Long batdelidetailno) {
        doSetBatdelidetailno_Equal(batdelidetailno);
    }

    protected void doSetBatdelidetailno_Equal(Long batdelidetailno) {
        regBatdelidetailno(CK_EQ, batdelidetailno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {bigint(19)}
     * @param batdelidetailno The value of batdelidetailno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatdelidetailno_NotEqual(Long batdelidetailno) {
        doSetBatdelidetailno_NotEqual(batdelidetailno);
    }

    protected void doSetBatdelidetailno_NotEqual(Long batdelidetailno) {
        regBatdelidetailno(CK_NES, batdelidetailno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {bigint(19)}
     * @param batdelidetailno The value of batdelidetailno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatdelidetailno_GreaterThan(Long batdelidetailno) {
        regBatdelidetailno(CK_GT, batdelidetailno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {bigint(19)}
     * @param batdelidetailno The value of batdelidetailno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatdelidetailno_LessThan(Long batdelidetailno) {
        regBatdelidetailno(CK_LT, batdelidetailno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {bigint(19)}
     * @param batdelidetailno The value of batdelidetailno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatdelidetailno_GreaterEqual(Long batdelidetailno) {
        regBatdelidetailno(CK_GE, batdelidetailno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {bigint(19)}
     * @param batdelidetailno The value of batdelidetailno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatdelidetailno_LessEqual(Long batdelidetailno) {
        regBatdelidetailno(CK_LE, batdelidetailno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {bigint(19)}
     * @param minNumber The min number of batdelidetailno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of batdelidetailno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBatdelidetailno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBatdelidetailno(), "BATDELIDETAILNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BATDELIDETAILNO: {bigint(19)}
     * @param batdelidetailnoList The collection of batdelidetailno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailno_InScope(Collection<Long> batdelidetailnoList) {
        doSetBatdelidetailno_InScope(batdelidetailnoList);
    }

    protected void doSetBatdelidetailno_InScope(Collection<Long> batdelidetailnoList) {
        regINS(CK_INS, cTL(batdelidetailnoList), xgetCValueBatdelidetailno(), "BATDELIDETAILNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BATDELIDETAILNO: {bigint(19)}
     * @param batdelidetailnoList The collection of batdelidetailno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailno_NotInScope(Collection<Long> batdelidetailnoList) {
        doSetBatdelidetailno_NotInScope(batdelidetailnoList);
    }

    protected void doSetBatdelidetailno_NotInScope(Collection<Long> batdelidetailnoList) {
        regINS(CK_NINS, cTL(batdelidetailnoList), xgetCValueBatdelidetailno(), "BATDELIDETAILNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {bigint(19)}
     */
    public void setBatdelidetailno_IsNull() { regBatdelidetailno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {bigint(19)}
     */
    public void setBatdelidetailno_IsNotNull() { regBatdelidetailno(CK_ISNN, DOBJ); }

    protected void regBatdelidetailno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatdelidetailno(), "BATDELIDETAILNO"); }
    protected abstract ConditionValue xgetCValueBatdelidetailno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(30)}
     * @param batwarehousecd The value of batwarehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_Equal(String batwarehousecd) {
        doSetBatwarehousecd_Equal(fRES(batwarehousecd));
    }

    protected void doSetBatwarehousecd_Equal(String batwarehousecd) {
        regBatwarehousecd(CK_EQ, batwarehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(30)}
     * @param batwarehousecd The value of batwarehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_NotEqual(String batwarehousecd) {
        doSetBatwarehousecd_NotEqual(fRES(batwarehousecd));
    }

    protected void doSetBatwarehousecd_NotEqual(String batwarehousecd) {
        regBatwarehousecd(CK_NES, batwarehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(30)}
     * @param batwarehousecd The value of batwarehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_GreaterThan(String batwarehousecd) {
        regBatwarehousecd(CK_GT, fRES(batwarehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(30)}
     * @param batwarehousecd The value of batwarehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_LessThan(String batwarehousecd) {
        regBatwarehousecd(CK_LT, fRES(batwarehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(30)}
     * @param batwarehousecd The value of batwarehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_GreaterEqual(String batwarehousecd) {
        regBatwarehousecd(CK_GE, fRES(batwarehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(30)}
     * @param batwarehousecd The value of batwarehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_LessEqual(String batwarehousecd) {
        regBatwarehousecd(CK_LE, fRES(batwarehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATWAREHOUSECD: {varchar(30)}
     * @param batwarehousecdList The collection of batwarehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_InScope(Collection<String> batwarehousecdList) {
        doSetBatwarehousecd_InScope(batwarehousecdList);
    }

    protected void doSetBatwarehousecd_InScope(Collection<String> batwarehousecdList) {
        regINS(CK_INS, cTL(batwarehousecdList), xgetCValueBatwarehousecd(), "BATWAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATWAREHOUSECD: {varchar(30)}
     * @param batwarehousecdList The collection of batwarehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_NotInScope(Collection<String> batwarehousecdList) {
        doSetBatwarehousecd_NotInScope(batwarehousecdList);
    }

    protected void doSetBatwarehousecd_NotInScope(Collection<String> batwarehousecdList) {
        regINS(CK_NINS, cTL(batwarehousecdList), xgetCValueBatwarehousecd(), "BATWAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATWAREHOUSECD: {varchar(30)} <br>
     * <pre>e.g. setBatwarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batwarehousecd The value of batwarehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatwarehousecd_LikeSearch(String batwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batwarehousecd), xgetCValueBatwarehousecd(), "BATWAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATWAREHOUSECD: {varchar(30)}
     * @param batwarehousecd The value of batwarehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatwarehousecd_NotLikeSearch(String batwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batwarehousecd), xgetCValueBatwarehousecd(), "BATWAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATWAREHOUSECD: {varchar(30)}
     * @param batwarehousecd The value of batwarehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_PrefixSearch(String batwarehousecd) {
        setBatwarehousecd_LikeSearch(batwarehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(30)}
     */
    public void setBatwarehousecd_IsNull() { regBatwarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(30)}
     */
    public void setBatwarehousecd_IsNullOrEmpty() { regBatwarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(30)}
     */
    public void setBatwarehousecd_IsNotNull() { regBatwarehousecd(CK_ISNN, DOBJ); }

    protected void regBatwarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatwarehousecd(), "BATWAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueBatwarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)}
     * @param batkeepwarehousecd The value of batkeepwarehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_Equal(String batkeepwarehousecd) {
        doSetBatkeepwarehousecd_Equal(fRES(batkeepwarehousecd));
    }

    protected void doSetBatkeepwarehousecd_Equal(String batkeepwarehousecd) {
        regBatkeepwarehousecd(CK_EQ, batkeepwarehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)}
     * @param batkeepwarehousecd The value of batkeepwarehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_NotEqual(String batkeepwarehousecd) {
        doSetBatkeepwarehousecd_NotEqual(fRES(batkeepwarehousecd));
    }

    protected void doSetBatkeepwarehousecd_NotEqual(String batkeepwarehousecd) {
        regBatkeepwarehousecd(CK_NES, batkeepwarehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)}
     * @param batkeepwarehousecd The value of batkeepwarehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_GreaterThan(String batkeepwarehousecd) {
        regBatkeepwarehousecd(CK_GT, fRES(batkeepwarehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)}
     * @param batkeepwarehousecd The value of batkeepwarehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_LessThan(String batkeepwarehousecd) {
        regBatkeepwarehousecd(CK_LT, fRES(batkeepwarehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)}
     * @param batkeepwarehousecd The value of batkeepwarehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_GreaterEqual(String batkeepwarehousecd) {
        regBatkeepwarehousecd(CK_GE, fRES(batkeepwarehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)}
     * @param batkeepwarehousecd The value of batkeepwarehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_LessEqual(String batkeepwarehousecd) {
        regBatkeepwarehousecd(CK_LE, fRES(batkeepwarehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)}
     * @param batkeepwarehousecdList The collection of batkeepwarehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_InScope(Collection<String> batkeepwarehousecdList) {
        doSetBatkeepwarehousecd_InScope(batkeepwarehousecdList);
    }

    protected void doSetBatkeepwarehousecd_InScope(Collection<String> batkeepwarehousecdList) {
        regINS(CK_INS, cTL(batkeepwarehousecdList), xgetCValueBatkeepwarehousecd(), "BATKEEPWAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)}
     * @param batkeepwarehousecdList The collection of batkeepwarehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_NotInScope(Collection<String> batkeepwarehousecdList) {
        doSetBatkeepwarehousecd_NotInScope(batkeepwarehousecdList);
    }

    protected void doSetBatkeepwarehousecd_NotInScope(Collection<String> batkeepwarehousecdList) {
        regINS(CK_NINS, cTL(batkeepwarehousecdList), xgetCValueBatkeepwarehousecd(), "BATKEEPWAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)} <br>
     * <pre>e.g. setBatkeepwarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batkeepwarehousecd The value of batkeepwarehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatkeepwarehousecd_LikeSearch(String batkeepwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batkeepwarehousecd), xgetCValueBatkeepwarehousecd(), "BATKEEPWAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)}
     * @param batkeepwarehousecd The value of batkeepwarehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatkeepwarehousecd_NotLikeSearch(String batkeepwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batkeepwarehousecd), xgetCValueBatkeepwarehousecd(), "BATKEEPWAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)}
     * @param batkeepwarehousecd The value of batkeepwarehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_PrefixSearch(String batkeepwarehousecd) {
        setBatkeepwarehousecd_LikeSearch(batkeepwarehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)}
     */
    public void setBatkeepwarehousecd_IsNull() { regBatkeepwarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)}
     */
    public void setBatkeepwarehousecd_IsNullOrEmpty() { regBatkeepwarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)}
     */
    public void setBatkeepwarehousecd_IsNotNull() { regBatkeepwarehousecd(CK_ISNN, DOBJ); }

    protected void regBatkeepwarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatkeepwarehousecd(), "BATKEEPWAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueBatkeepwarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(30)}
     * @param batpartnernorcv The value of batpartnernorcv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_Equal(String batpartnernorcv) {
        doSetBatpartnernorcv_Equal(fRES(batpartnernorcv));
    }

    protected void doSetBatpartnernorcv_Equal(String batpartnernorcv) {
        regBatpartnernorcv(CK_EQ, batpartnernorcv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(30)}
     * @param batpartnernorcv The value of batpartnernorcv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_NotEqual(String batpartnernorcv) {
        doSetBatpartnernorcv_NotEqual(fRES(batpartnernorcv));
    }

    protected void doSetBatpartnernorcv_NotEqual(String batpartnernorcv) {
        regBatpartnernorcv(CK_NES, batpartnernorcv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(30)}
     * @param batpartnernorcv The value of batpartnernorcv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_GreaterThan(String batpartnernorcv) {
        regBatpartnernorcv(CK_GT, fRES(batpartnernorcv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(30)}
     * @param batpartnernorcv The value of batpartnernorcv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_LessThan(String batpartnernorcv) {
        regBatpartnernorcv(CK_LT, fRES(batpartnernorcv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(30)}
     * @param batpartnernorcv The value of batpartnernorcv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_GreaterEqual(String batpartnernorcv) {
        regBatpartnernorcv(CK_GE, fRES(batpartnernorcv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(30)}
     * @param batpartnernorcv The value of batpartnernorcv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_LessEqual(String batpartnernorcv) {
        regBatpartnernorcv(CK_LE, fRES(batpartnernorcv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATPARTNERNORCV: {varchar(30)}
     * @param batpartnernorcvList The collection of batpartnernorcv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_InScope(Collection<String> batpartnernorcvList) {
        doSetBatpartnernorcv_InScope(batpartnernorcvList);
    }

    protected void doSetBatpartnernorcv_InScope(Collection<String> batpartnernorcvList) {
        regINS(CK_INS, cTL(batpartnernorcvList), xgetCValueBatpartnernorcv(), "BATPARTNERNORCV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATPARTNERNORCV: {varchar(30)}
     * @param batpartnernorcvList The collection of batpartnernorcv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_NotInScope(Collection<String> batpartnernorcvList) {
        doSetBatpartnernorcv_NotInScope(batpartnernorcvList);
    }

    protected void doSetBatpartnernorcv_NotInScope(Collection<String> batpartnernorcvList) {
        regINS(CK_NINS, cTL(batpartnernorcvList), xgetCValueBatpartnernorcv(), "BATPARTNERNORCV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATPARTNERNORCV: {varchar(30)} <br>
     * <pre>e.g. setBatpartnernorcv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batpartnernorcv The value of batpartnernorcv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatpartnernorcv_LikeSearch(String batpartnernorcv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batpartnernorcv), xgetCValueBatpartnernorcv(), "BATPARTNERNORCV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATPARTNERNORCV: {varchar(30)}
     * @param batpartnernorcv The value of batpartnernorcv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatpartnernorcv_NotLikeSearch(String batpartnernorcv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batpartnernorcv), xgetCValueBatpartnernorcv(), "BATPARTNERNORCV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATPARTNERNORCV: {varchar(30)}
     * @param batpartnernorcv The value of batpartnernorcv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_PrefixSearch(String batpartnernorcv) {
        setBatpartnernorcv_LikeSearch(batpartnernorcv, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(30)}
     */
    public void setBatpartnernorcv_IsNull() { regBatpartnernorcv(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(30)}
     */
    public void setBatpartnernorcv_IsNullOrEmpty() { regBatpartnernorcv(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(30)}
     */
    public void setBatpartnernorcv_IsNotNull() { regBatpartnernorcv(CK_ISNN, DOBJ); }

    protected void regBatpartnernorcv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatpartnernorcv(), "BATPARTNERNORCV"); }
    protected abstract ConditionValue xgetCValueBatpartnernorcv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(30)}
     * @param batpartnernosnd The value of batpartnernosnd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_Equal(String batpartnernosnd) {
        doSetBatpartnernosnd_Equal(fRES(batpartnernosnd));
    }

    protected void doSetBatpartnernosnd_Equal(String batpartnernosnd) {
        regBatpartnernosnd(CK_EQ, batpartnernosnd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(30)}
     * @param batpartnernosnd The value of batpartnernosnd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_NotEqual(String batpartnernosnd) {
        doSetBatpartnernosnd_NotEqual(fRES(batpartnernosnd));
    }

    protected void doSetBatpartnernosnd_NotEqual(String batpartnernosnd) {
        regBatpartnernosnd(CK_NES, batpartnernosnd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(30)}
     * @param batpartnernosnd The value of batpartnernosnd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_GreaterThan(String batpartnernosnd) {
        regBatpartnernosnd(CK_GT, fRES(batpartnernosnd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(30)}
     * @param batpartnernosnd The value of batpartnernosnd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_LessThan(String batpartnernosnd) {
        regBatpartnernosnd(CK_LT, fRES(batpartnernosnd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(30)}
     * @param batpartnernosnd The value of batpartnernosnd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_GreaterEqual(String batpartnernosnd) {
        regBatpartnernosnd(CK_GE, fRES(batpartnernosnd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(30)}
     * @param batpartnernosnd The value of batpartnernosnd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_LessEqual(String batpartnernosnd) {
        regBatpartnernosnd(CK_LE, fRES(batpartnernosnd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATPARTNERNOSND: {varchar(30)}
     * @param batpartnernosndList The collection of batpartnernosnd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_InScope(Collection<String> batpartnernosndList) {
        doSetBatpartnernosnd_InScope(batpartnernosndList);
    }

    protected void doSetBatpartnernosnd_InScope(Collection<String> batpartnernosndList) {
        regINS(CK_INS, cTL(batpartnernosndList), xgetCValueBatpartnernosnd(), "BATPARTNERNOSND");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATPARTNERNOSND: {varchar(30)}
     * @param batpartnernosndList The collection of batpartnernosnd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_NotInScope(Collection<String> batpartnernosndList) {
        doSetBatpartnernosnd_NotInScope(batpartnernosndList);
    }

    protected void doSetBatpartnernosnd_NotInScope(Collection<String> batpartnernosndList) {
        regINS(CK_NINS, cTL(batpartnernosndList), xgetCValueBatpartnernosnd(), "BATPARTNERNOSND");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATPARTNERNOSND: {varchar(30)} <br>
     * <pre>e.g. setBatpartnernosnd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batpartnernosnd The value of batpartnernosnd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatpartnernosnd_LikeSearch(String batpartnernosnd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batpartnernosnd), xgetCValueBatpartnernosnd(), "BATPARTNERNOSND", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATPARTNERNOSND: {varchar(30)}
     * @param batpartnernosnd The value of batpartnernosnd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatpartnernosnd_NotLikeSearch(String batpartnernosnd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batpartnernosnd), xgetCValueBatpartnernosnd(), "BATPARTNERNOSND", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATPARTNERNOSND: {varchar(30)}
     * @param batpartnernosnd The value of batpartnernosnd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_PrefixSearch(String batpartnernosnd) {
        setBatpartnernosnd_LikeSearch(batpartnernosnd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(30)}
     */
    public void setBatpartnernosnd_IsNull() { regBatpartnernosnd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(30)}
     */
    public void setBatpartnernosnd_IsNullOrEmpty() { regBatpartnernosnd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(30)}
     */
    public void setBatpartnernosnd_IsNotNull() { regBatpartnernosnd(CK_ISNN, DOBJ); }

    protected void regBatpartnernosnd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatpartnernosnd(), "BATPARTNERNOSND"); }
    protected abstract ConditionValue xgetCValueBatpartnernosnd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {bigint(19)}
     * @param batdelidetailnum The value of batdelidetailnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatdelidetailnum_Equal(Long batdelidetailnum) {
        doSetBatdelidetailnum_Equal(batdelidetailnum);
    }

    protected void doSetBatdelidetailnum_Equal(Long batdelidetailnum) {
        regBatdelidetailnum(CK_EQ, batdelidetailnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {bigint(19)}
     * @param batdelidetailnum The value of batdelidetailnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatdelidetailnum_NotEqual(Long batdelidetailnum) {
        doSetBatdelidetailnum_NotEqual(batdelidetailnum);
    }

    protected void doSetBatdelidetailnum_NotEqual(Long batdelidetailnum) {
        regBatdelidetailnum(CK_NES, batdelidetailnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {bigint(19)}
     * @param batdelidetailnum The value of batdelidetailnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatdelidetailnum_GreaterThan(Long batdelidetailnum) {
        regBatdelidetailnum(CK_GT, batdelidetailnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {bigint(19)}
     * @param batdelidetailnum The value of batdelidetailnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatdelidetailnum_LessThan(Long batdelidetailnum) {
        regBatdelidetailnum(CK_LT, batdelidetailnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {bigint(19)}
     * @param batdelidetailnum The value of batdelidetailnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatdelidetailnum_GreaterEqual(Long batdelidetailnum) {
        regBatdelidetailnum(CK_GE, batdelidetailnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {bigint(19)}
     * @param batdelidetailnum The value of batdelidetailnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatdelidetailnum_LessEqual(Long batdelidetailnum) {
        regBatdelidetailnum(CK_LE, batdelidetailnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {bigint(19)}
     * @param minNumber The min number of batdelidetailnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of batdelidetailnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBatdelidetailnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBatdelidetailnum(), "BATDELIDETAILNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BATDELIDETAILNUM: {bigint(19)}
     * @param batdelidetailnumList The collection of batdelidetailnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailnum_InScope(Collection<Long> batdelidetailnumList) {
        doSetBatdelidetailnum_InScope(batdelidetailnumList);
    }

    protected void doSetBatdelidetailnum_InScope(Collection<Long> batdelidetailnumList) {
        regINS(CK_INS, cTL(batdelidetailnumList), xgetCValueBatdelidetailnum(), "BATDELIDETAILNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BATDELIDETAILNUM: {bigint(19)}
     * @param batdelidetailnumList The collection of batdelidetailnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailnum_NotInScope(Collection<Long> batdelidetailnumList) {
        doSetBatdelidetailnum_NotInScope(batdelidetailnumList);
    }

    protected void doSetBatdelidetailnum_NotInScope(Collection<Long> batdelidetailnumList) {
        regINS(CK_NINS, cTL(batdelidetailnumList), xgetCValueBatdelidetailnum(), "BATDELIDETAILNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {bigint(19)}
     */
    public void setBatdelidetailnum_IsNull() { regBatdelidetailnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {bigint(19)}
     */
    public void setBatdelidetailnum_IsNotNull() { regBatdelidetailnum(CK_ISNN, DOBJ); }

    protected void regBatdelidetailnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatdelidetailnum(), "BATDELIDETAILNUM"); }
    protected abstract ConditionValue xgetCValueBatdelidetailnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
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
     * PRODUCT_CD: {varchar(30)}
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
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
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
     * PRODUCT_CD: {varchar(30)}
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
     * PRODUCT_CD: {varchar(30)} <br>
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
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {decimal(16, 6)}
     * @param expectqty1 The value of expectqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_Equal(java.math.BigDecimal expectqty1) {
        doSetExpectqty1_Equal(expectqty1);
    }

    protected void doSetExpectqty1_Equal(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_EQ, expectqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {decimal(16, 6)}
     * @param expectqty1 The value of expectqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_NotEqual(java.math.BigDecimal expectqty1) {
        doSetExpectqty1_NotEqual(expectqty1);
    }

    protected void doSetExpectqty1_NotEqual(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_NES, expectqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {decimal(16, 6)}
     * @param expectqty1 The value of expectqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_GreaterThan(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_GT, expectqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {decimal(16, 6)}
     * @param expectqty1 The value of expectqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_LessThan(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_LT, expectqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {decimal(16, 6)}
     * @param expectqty1 The value of expectqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_GreaterEqual(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_GE, expectqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {decimal(16, 6)}
     * @param expectqty1 The value of expectqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_LessEqual(java.math.BigDecimal expectqty1) {
        regExpectqty1(CK_LE, expectqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {decimal(16, 6)}
     * @param minNumber The min number of expectqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of expectqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExpectqty1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExpectqty1(), "EXPECTQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {decimal(16, 6)}
     * @param expectqty1List The collection of expectqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_InScope(Collection<java.math.BigDecimal> expectqty1List) {
        doSetExpectqty1_InScope(expectqty1List);
    }

    protected void doSetExpectqty1_InScope(Collection<java.math.BigDecimal> expectqty1List) {
        regINS(CK_INS, cTL(expectqty1List), xgetCValueExpectqty1(), "EXPECTQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {decimal(16, 6)}
     * @param expectqty1List The collection of expectqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_NotInScope(Collection<java.math.BigDecimal> expectqty1List) {
        doSetExpectqty1_NotInScope(expectqty1List);
    }

    protected void doSetExpectqty1_NotInScope(Collection<java.math.BigDecimal> expectqty1List) {
        regINS(CK_NINS, cTL(expectqty1List), xgetCValueExpectqty1(), "EXPECTQTY1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXPECTQTY1: {decimal(16, 6)}
     */
    public void setExpectqty1_IsNull() { regExpectqty1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXPECTQTY1: {decimal(16, 6)}
     */
    public void setExpectqty1_IsNotNull() { regExpectqty1(CK_ISNN, DOBJ); }

    protected void regExpectqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpectqty1(), "EXPECTQTY1"); }
    protected abstract ConditionValue xgetCValueExpectqty1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_MAKE_FLG: {char(1)}
     * @param dataMakeFlg The value of dataMakeFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataMakeFlg_Equal(String dataMakeFlg) {
        doSetDataMakeFlg_Equal(fRES(dataMakeFlg));
    }

    protected void doSetDataMakeFlg_Equal(String dataMakeFlg) {
        regDataMakeFlg(CK_EQ, dataMakeFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_MAKE_FLG: {char(1)}
     * @param dataMakeFlg The value of dataMakeFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataMakeFlg_NotEqual(String dataMakeFlg) {
        doSetDataMakeFlg_NotEqual(fRES(dataMakeFlg));
    }

    protected void doSetDataMakeFlg_NotEqual(String dataMakeFlg) {
        regDataMakeFlg(CK_NES, dataMakeFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_MAKE_FLG: {char(1)}
     * @param dataMakeFlg The value of dataMakeFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataMakeFlg_GreaterThan(String dataMakeFlg) {
        regDataMakeFlg(CK_GT, fRES(dataMakeFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_MAKE_FLG: {char(1)}
     * @param dataMakeFlg The value of dataMakeFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataMakeFlg_LessThan(String dataMakeFlg) {
        regDataMakeFlg(CK_LT, fRES(dataMakeFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_MAKE_FLG: {char(1)}
     * @param dataMakeFlg The value of dataMakeFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataMakeFlg_GreaterEqual(String dataMakeFlg) {
        regDataMakeFlg(CK_GE, fRES(dataMakeFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_MAKE_FLG: {char(1)}
     * @param dataMakeFlg The value of dataMakeFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataMakeFlg_LessEqual(String dataMakeFlg) {
        regDataMakeFlg(CK_LE, fRES(dataMakeFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_MAKE_FLG: {char(1)}
     * @param dataMakeFlgList The collection of dataMakeFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataMakeFlg_InScope(Collection<String> dataMakeFlgList) {
        doSetDataMakeFlg_InScope(dataMakeFlgList);
    }

    protected void doSetDataMakeFlg_InScope(Collection<String> dataMakeFlgList) {
        regINS(CK_INS, cTL(dataMakeFlgList), xgetCValueDataMakeFlg(), "DATA_MAKE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_MAKE_FLG: {char(1)}
     * @param dataMakeFlgList The collection of dataMakeFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataMakeFlg_NotInScope(Collection<String> dataMakeFlgList) {
        doSetDataMakeFlg_NotInScope(dataMakeFlgList);
    }

    protected void doSetDataMakeFlg_NotInScope(Collection<String> dataMakeFlgList) {
        regINS(CK_NINS, cTL(dataMakeFlgList), xgetCValueDataMakeFlg(), "DATA_MAKE_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_MAKE_FLG: {char(1)} <br>
     * <pre>e.g. setDataMakeFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataMakeFlg The value of dataMakeFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataMakeFlg_LikeSearch(String dataMakeFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataMakeFlg), xgetCValueDataMakeFlg(), "DATA_MAKE_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_MAKE_FLG: {char(1)}
     * @param dataMakeFlg The value of dataMakeFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataMakeFlg_NotLikeSearch(String dataMakeFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataMakeFlg), xgetCValueDataMakeFlg(), "DATA_MAKE_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_MAKE_FLG: {char(1)}
     * @param dataMakeFlg The value of dataMakeFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataMakeFlg_PrefixSearch(String dataMakeFlg) {
        setDataMakeFlg_LikeSearch(dataMakeFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_MAKE_FLG: {char(1)}
     */
    public void setDataMakeFlg_IsNull() { regDataMakeFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_MAKE_FLG: {char(1)}
     */
    public void setDataMakeFlg_IsNotNull() { regDataMakeFlg(CK_ISNN, DOBJ); }

    protected void regDataMakeFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataMakeFlg(), "DATA_MAKE_FLG"); }
    protected abstract ConditionValue xgetCValueDataMakeFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_Equal(String vaExtdata1) {
        doSetVaExtdata1_Equal(fRES(vaExtdata1));
    }

    protected void doSetVaExtdata1_Equal(String vaExtdata1) {
        regVaExtdata1(CK_EQ, vaExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_NotEqual(String vaExtdata1) {
        doSetVaExtdata1_NotEqual(fRES(vaExtdata1));
    }

    protected void doSetVaExtdata1_NotEqual(String vaExtdata1) {
        regVaExtdata1(CK_NES, vaExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_GreaterThan(String vaExtdata1) {
        regVaExtdata1(CK_GT, fRES(vaExtdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_LessThan(String vaExtdata1) {
        regVaExtdata1(CK_LT, fRES(vaExtdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_GreaterEqual(String vaExtdata1) {
        regVaExtdata1(CK_GE, fRES(vaExtdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_LessEqual(String vaExtdata1) {
        regVaExtdata1(CK_LE, fRES(vaExtdata1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1List The collection of vaExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_InScope(Collection<String> vaExtdata1List) {
        doSetVaExtdata1_InScope(vaExtdata1List);
    }

    protected void doSetVaExtdata1_InScope(Collection<String> vaExtdata1List) {
        regINS(CK_INS, cTL(vaExtdata1List), xgetCValueVaExtdata1(), "VA_EXTDATA1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1List The collection of vaExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_NotInScope(Collection<String> vaExtdata1List) {
        doSetVaExtdata1_NotInScope(vaExtdata1List);
    }

    protected void doSetVaExtdata1_NotInScope(Collection<String> vaExtdata1List) {
        regINS(CK_NINS, cTL(vaExtdata1List), xgetCValueVaExtdata1(), "VA_EXTDATA1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)} <br>
     * <pre>e.g. setVaExtdata1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vaExtdata1 The value of vaExtdata1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVaExtdata1_LikeSearch(String vaExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vaExtdata1), xgetCValueVaExtdata1(), "VA_EXTDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVaExtdata1_NotLikeSearch(String vaExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vaExtdata1), xgetCValueVaExtdata1(), "VA_EXTDATA1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_PrefixSearch(String vaExtdata1) {
        setVaExtdata1_LikeSearch(vaExtdata1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     */
    public void setVaExtdata1_IsNull() { regVaExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     */
    public void setVaExtdata1_IsNullOrEmpty() { regVaExtdata1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     */
    public void setVaExtdata1_IsNotNull() { regVaExtdata1(CK_ISNN, DOBJ); }

    protected void regVaExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVaExtdata1(), "VA_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueVaExtdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_Equal(String vaExtdata2) {
        doSetVaExtdata2_Equal(fRES(vaExtdata2));
    }

    protected void doSetVaExtdata2_Equal(String vaExtdata2) {
        regVaExtdata2(CK_EQ, vaExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_NotEqual(String vaExtdata2) {
        doSetVaExtdata2_NotEqual(fRES(vaExtdata2));
    }

    protected void doSetVaExtdata2_NotEqual(String vaExtdata2) {
        regVaExtdata2(CK_NES, vaExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_GreaterThan(String vaExtdata2) {
        regVaExtdata2(CK_GT, fRES(vaExtdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_LessThan(String vaExtdata2) {
        regVaExtdata2(CK_LT, fRES(vaExtdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_GreaterEqual(String vaExtdata2) {
        regVaExtdata2(CK_GE, fRES(vaExtdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_LessEqual(String vaExtdata2) {
        regVaExtdata2(CK_LE, fRES(vaExtdata2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2List The collection of vaExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_InScope(Collection<String> vaExtdata2List) {
        doSetVaExtdata2_InScope(vaExtdata2List);
    }

    protected void doSetVaExtdata2_InScope(Collection<String> vaExtdata2List) {
        regINS(CK_INS, cTL(vaExtdata2List), xgetCValueVaExtdata2(), "VA_EXTDATA2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2List The collection of vaExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_NotInScope(Collection<String> vaExtdata2List) {
        doSetVaExtdata2_NotInScope(vaExtdata2List);
    }

    protected void doSetVaExtdata2_NotInScope(Collection<String> vaExtdata2List) {
        regINS(CK_NINS, cTL(vaExtdata2List), xgetCValueVaExtdata2(), "VA_EXTDATA2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)} <br>
     * <pre>e.g. setVaExtdata2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vaExtdata2 The value of vaExtdata2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVaExtdata2_LikeSearch(String vaExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vaExtdata2), xgetCValueVaExtdata2(), "VA_EXTDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVaExtdata2_NotLikeSearch(String vaExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vaExtdata2), xgetCValueVaExtdata2(), "VA_EXTDATA2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_PrefixSearch(String vaExtdata2) {
        setVaExtdata2_LikeSearch(vaExtdata2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     */
    public void setVaExtdata2_IsNull() { regVaExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     */
    public void setVaExtdata2_IsNullOrEmpty() { regVaExtdata2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     */
    public void setVaExtdata2_IsNotNull() { regVaExtdata2(CK_ISNN, DOBJ); }

    protected void regVaExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVaExtdata2(), "VA_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueVaExtdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_Equal(String vaExtdata3) {
        doSetVaExtdata3_Equal(fRES(vaExtdata3));
    }

    protected void doSetVaExtdata3_Equal(String vaExtdata3) {
        regVaExtdata3(CK_EQ, vaExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_NotEqual(String vaExtdata3) {
        doSetVaExtdata3_NotEqual(fRES(vaExtdata3));
    }

    protected void doSetVaExtdata3_NotEqual(String vaExtdata3) {
        regVaExtdata3(CK_NES, vaExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_GreaterThan(String vaExtdata3) {
        regVaExtdata3(CK_GT, fRES(vaExtdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_LessThan(String vaExtdata3) {
        regVaExtdata3(CK_LT, fRES(vaExtdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_GreaterEqual(String vaExtdata3) {
        regVaExtdata3(CK_GE, fRES(vaExtdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_LessEqual(String vaExtdata3) {
        regVaExtdata3(CK_LE, fRES(vaExtdata3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3List The collection of vaExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_InScope(Collection<String> vaExtdata3List) {
        doSetVaExtdata3_InScope(vaExtdata3List);
    }

    protected void doSetVaExtdata3_InScope(Collection<String> vaExtdata3List) {
        regINS(CK_INS, cTL(vaExtdata3List), xgetCValueVaExtdata3(), "VA_EXTDATA3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3List The collection of vaExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_NotInScope(Collection<String> vaExtdata3List) {
        doSetVaExtdata3_NotInScope(vaExtdata3List);
    }

    protected void doSetVaExtdata3_NotInScope(Collection<String> vaExtdata3List) {
        regINS(CK_NINS, cTL(vaExtdata3List), xgetCValueVaExtdata3(), "VA_EXTDATA3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)} <br>
     * <pre>e.g. setVaExtdata3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vaExtdata3 The value of vaExtdata3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVaExtdata3_LikeSearch(String vaExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vaExtdata3), xgetCValueVaExtdata3(), "VA_EXTDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVaExtdata3_NotLikeSearch(String vaExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vaExtdata3), xgetCValueVaExtdata3(), "VA_EXTDATA3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_PrefixSearch(String vaExtdata3) {
        setVaExtdata3_LikeSearch(vaExtdata3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     */
    public void setVaExtdata3_IsNull() { regVaExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     */
    public void setVaExtdata3_IsNullOrEmpty() { regVaExtdata3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     */
    public void setVaExtdata3_IsNotNull() { regVaExtdata3(CK_ISNN, DOBJ); }

    protected void regVaExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVaExtdata3(), "VA_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueVaExtdata3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_Equal(String nvExtdata1) {
        doSetNvExtdata1_Equal(fRES(nvExtdata1));
    }

    protected void doSetNvExtdata1_Equal(String nvExtdata1) {
        regNvExtdata1(CK_EQ, nvExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_NotEqual(String nvExtdata1) {
        doSetNvExtdata1_NotEqual(fRES(nvExtdata1));
    }

    protected void doSetNvExtdata1_NotEqual(String nvExtdata1) {
        regNvExtdata1(CK_NES, nvExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_GreaterThan(String nvExtdata1) {
        regNvExtdata1(CK_GT, fRES(nvExtdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_LessThan(String nvExtdata1) {
        regNvExtdata1(CK_LT, fRES(nvExtdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_GreaterEqual(String nvExtdata1) {
        regNvExtdata1(CK_GE, fRES(nvExtdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_LessEqual(String nvExtdata1) {
        regNvExtdata1(CK_LE, fRES(nvExtdata1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1List The collection of nvExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_InScope(Collection<String> nvExtdata1List) {
        doSetNvExtdata1_InScope(nvExtdata1List);
    }

    protected void doSetNvExtdata1_InScope(Collection<String> nvExtdata1List) {
        regINS(CK_INS, cTL(nvExtdata1List), xgetCValueNvExtdata1(), "NV_EXTDATA1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1List The collection of nvExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_NotInScope(Collection<String> nvExtdata1List) {
        doSetNvExtdata1_NotInScope(nvExtdata1List);
    }

    protected void doSetNvExtdata1_NotInScope(Collection<String> nvExtdata1List) {
        regINS(CK_NINS, cTL(nvExtdata1List), xgetCValueNvExtdata1(), "NV_EXTDATA1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)} <br>
     * <pre>e.g. setNvExtdata1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nvExtdata1 The value of nvExtdata1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNvExtdata1_LikeSearch(String nvExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nvExtdata1), xgetCValueNvExtdata1(), "NV_EXTDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNvExtdata1_NotLikeSearch(String nvExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nvExtdata1), xgetCValueNvExtdata1(), "NV_EXTDATA1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_PrefixSearch(String nvExtdata1) {
        setNvExtdata1_LikeSearch(nvExtdata1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     */
    public void setNvExtdata1_IsNull() { regNvExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     */
    public void setNvExtdata1_IsNullOrEmpty() { regNvExtdata1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     */
    public void setNvExtdata1_IsNotNull() { regNvExtdata1(CK_ISNN, DOBJ); }

    protected void regNvExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNvExtdata1(), "NV_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueNvExtdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_Equal(String nvExtdata2) {
        doSetNvExtdata2_Equal(fRES(nvExtdata2));
    }

    protected void doSetNvExtdata2_Equal(String nvExtdata2) {
        regNvExtdata2(CK_EQ, nvExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_NotEqual(String nvExtdata2) {
        doSetNvExtdata2_NotEqual(fRES(nvExtdata2));
    }

    protected void doSetNvExtdata2_NotEqual(String nvExtdata2) {
        regNvExtdata2(CK_NES, nvExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_GreaterThan(String nvExtdata2) {
        regNvExtdata2(CK_GT, fRES(nvExtdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_LessThan(String nvExtdata2) {
        regNvExtdata2(CK_LT, fRES(nvExtdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_GreaterEqual(String nvExtdata2) {
        regNvExtdata2(CK_GE, fRES(nvExtdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_LessEqual(String nvExtdata2) {
        regNvExtdata2(CK_LE, fRES(nvExtdata2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2List The collection of nvExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_InScope(Collection<String> nvExtdata2List) {
        doSetNvExtdata2_InScope(nvExtdata2List);
    }

    protected void doSetNvExtdata2_InScope(Collection<String> nvExtdata2List) {
        regINS(CK_INS, cTL(nvExtdata2List), xgetCValueNvExtdata2(), "NV_EXTDATA2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2List The collection of nvExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_NotInScope(Collection<String> nvExtdata2List) {
        doSetNvExtdata2_NotInScope(nvExtdata2List);
    }

    protected void doSetNvExtdata2_NotInScope(Collection<String> nvExtdata2List) {
        regINS(CK_NINS, cTL(nvExtdata2List), xgetCValueNvExtdata2(), "NV_EXTDATA2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)} <br>
     * <pre>e.g. setNvExtdata2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nvExtdata2 The value of nvExtdata2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNvExtdata2_LikeSearch(String nvExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nvExtdata2), xgetCValueNvExtdata2(), "NV_EXTDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNvExtdata2_NotLikeSearch(String nvExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nvExtdata2), xgetCValueNvExtdata2(), "NV_EXTDATA2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_PrefixSearch(String nvExtdata2) {
        setNvExtdata2_LikeSearch(nvExtdata2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     */
    public void setNvExtdata2_IsNull() { regNvExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     */
    public void setNvExtdata2_IsNullOrEmpty() { regNvExtdata2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     */
    public void setNvExtdata2_IsNotNull() { regNvExtdata2(CK_ISNN, DOBJ); }

    protected void regNvExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNvExtdata2(), "NV_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueNvExtdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_Equal(String nvExtdata3) {
        doSetNvExtdata3_Equal(fRES(nvExtdata3));
    }

    protected void doSetNvExtdata3_Equal(String nvExtdata3) {
        regNvExtdata3(CK_EQ, nvExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_NotEqual(String nvExtdata3) {
        doSetNvExtdata3_NotEqual(fRES(nvExtdata3));
    }

    protected void doSetNvExtdata3_NotEqual(String nvExtdata3) {
        regNvExtdata3(CK_NES, nvExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_GreaterThan(String nvExtdata3) {
        regNvExtdata3(CK_GT, fRES(nvExtdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_LessThan(String nvExtdata3) {
        regNvExtdata3(CK_LT, fRES(nvExtdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_GreaterEqual(String nvExtdata3) {
        regNvExtdata3(CK_GE, fRES(nvExtdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_LessEqual(String nvExtdata3) {
        regNvExtdata3(CK_LE, fRES(nvExtdata3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3List The collection of nvExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_InScope(Collection<String> nvExtdata3List) {
        doSetNvExtdata3_InScope(nvExtdata3List);
    }

    protected void doSetNvExtdata3_InScope(Collection<String> nvExtdata3List) {
        regINS(CK_INS, cTL(nvExtdata3List), xgetCValueNvExtdata3(), "NV_EXTDATA3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3List The collection of nvExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_NotInScope(Collection<String> nvExtdata3List) {
        doSetNvExtdata3_NotInScope(nvExtdata3List);
    }

    protected void doSetNvExtdata3_NotInScope(Collection<String> nvExtdata3List) {
        regINS(CK_NINS, cTL(nvExtdata3List), xgetCValueNvExtdata3(), "NV_EXTDATA3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)} <br>
     * <pre>e.g. setNvExtdata3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nvExtdata3 The value of nvExtdata3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNvExtdata3_LikeSearch(String nvExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nvExtdata3), xgetCValueNvExtdata3(), "NV_EXTDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNvExtdata3_NotLikeSearch(String nvExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nvExtdata3), xgetCValueNvExtdata3(), "NV_EXTDATA3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_PrefixSearch(String nvExtdata3) {
        setNvExtdata3_LikeSearch(nvExtdata3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     */
    public void setNvExtdata3_IsNull() { regNvExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     */
    public void setNvExtdata3_IsNullOrEmpty() { regNvExtdata3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     */
    public void setNvExtdata3_IsNotNull() { regNvExtdata3(CK_ISNN, DOBJ); }

    protected void regNvExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNvExtdata3(), "NV_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueNvExtdata3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_Equal(Long nmExtdata1) {
        doSetNmExtdata1_Equal(nmExtdata1);
    }

    protected void doSetNmExtdata1_Equal(Long nmExtdata1) {
        regNmExtdata1(CK_EQ, nmExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_NotEqual(Long nmExtdata1) {
        doSetNmExtdata1_NotEqual(nmExtdata1);
    }

    protected void doSetNmExtdata1_NotEqual(Long nmExtdata1) {
        regNmExtdata1(CK_NES, nmExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_GreaterThan(Long nmExtdata1) {
        regNmExtdata1(CK_GT, nmExtdata1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_LessThan(Long nmExtdata1) {
        regNmExtdata1(CK_LT, nmExtdata1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_GreaterEqual(Long nmExtdata1) {
        regNmExtdata1(CK_GE, nmExtdata1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_LessEqual(Long nmExtdata1) {
        regNmExtdata1(CK_LE, nmExtdata1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param minNumber The min number of nmExtdata1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nmExtdata1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNmExtdata1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNmExtdata1(), "NM_EXTDATA1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1List The collection of nmExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata1_InScope(Collection<Long> nmExtdata1List) {
        doSetNmExtdata1_InScope(nmExtdata1List);
    }

    protected void doSetNmExtdata1_InScope(Collection<Long> nmExtdata1List) {
        regINS(CK_INS, cTL(nmExtdata1List), xgetCValueNmExtdata1(), "NM_EXTDATA1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1List The collection of nmExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata1_NotInScope(Collection<Long> nmExtdata1List) {
        doSetNmExtdata1_NotInScope(nmExtdata1List);
    }

    protected void doSetNmExtdata1_NotInScope(Collection<Long> nmExtdata1List) {
        regINS(CK_NINS, cTL(nmExtdata1List), xgetCValueNmExtdata1(), "NM_EXTDATA1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     */
    public void setNmExtdata1_IsNull() { regNmExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     */
    public void setNmExtdata1_IsNotNull() { regNmExtdata1(CK_ISNN, DOBJ); }

    protected void regNmExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNmExtdata1(), "NM_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueNmExtdata1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_Equal(Long nmExtdata2) {
        doSetNmExtdata2_Equal(nmExtdata2);
    }

    protected void doSetNmExtdata2_Equal(Long nmExtdata2) {
        regNmExtdata2(CK_EQ, nmExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_NotEqual(Long nmExtdata2) {
        doSetNmExtdata2_NotEqual(nmExtdata2);
    }

    protected void doSetNmExtdata2_NotEqual(Long nmExtdata2) {
        regNmExtdata2(CK_NES, nmExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_GreaterThan(Long nmExtdata2) {
        regNmExtdata2(CK_GT, nmExtdata2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_LessThan(Long nmExtdata2) {
        regNmExtdata2(CK_LT, nmExtdata2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_GreaterEqual(Long nmExtdata2) {
        regNmExtdata2(CK_GE, nmExtdata2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_LessEqual(Long nmExtdata2) {
        regNmExtdata2(CK_LE, nmExtdata2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param minNumber The min number of nmExtdata2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nmExtdata2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNmExtdata2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNmExtdata2(), "NM_EXTDATA2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2List The collection of nmExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata2_InScope(Collection<Long> nmExtdata2List) {
        doSetNmExtdata2_InScope(nmExtdata2List);
    }

    protected void doSetNmExtdata2_InScope(Collection<Long> nmExtdata2List) {
        regINS(CK_INS, cTL(nmExtdata2List), xgetCValueNmExtdata2(), "NM_EXTDATA2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2List The collection of nmExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata2_NotInScope(Collection<Long> nmExtdata2List) {
        doSetNmExtdata2_NotInScope(nmExtdata2List);
    }

    protected void doSetNmExtdata2_NotInScope(Collection<Long> nmExtdata2List) {
        regINS(CK_NINS, cTL(nmExtdata2List), xgetCValueNmExtdata2(), "NM_EXTDATA2");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     */
    public void setNmExtdata2_IsNull() { regNmExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     */
    public void setNmExtdata2_IsNotNull() { regNmExtdata2(CK_ISNN, DOBJ); }

    protected void regNmExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNmExtdata2(), "NM_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueNmExtdata2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_Equal(Long nmExtdata3) {
        doSetNmExtdata3_Equal(nmExtdata3);
    }

    protected void doSetNmExtdata3_Equal(Long nmExtdata3) {
        regNmExtdata3(CK_EQ, nmExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_NotEqual(Long nmExtdata3) {
        doSetNmExtdata3_NotEqual(nmExtdata3);
    }

    protected void doSetNmExtdata3_NotEqual(Long nmExtdata3) {
        regNmExtdata3(CK_NES, nmExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_GreaterThan(Long nmExtdata3) {
        regNmExtdata3(CK_GT, nmExtdata3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_LessThan(Long nmExtdata3) {
        regNmExtdata3(CK_LT, nmExtdata3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_GreaterEqual(Long nmExtdata3) {
        regNmExtdata3(CK_GE, nmExtdata3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_LessEqual(Long nmExtdata3) {
        regNmExtdata3(CK_LE, nmExtdata3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param minNumber The min number of nmExtdata3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nmExtdata3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNmExtdata3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNmExtdata3(), "NM_EXTDATA3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3List The collection of nmExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata3_InScope(Collection<Long> nmExtdata3List) {
        doSetNmExtdata3_InScope(nmExtdata3List);
    }

    protected void doSetNmExtdata3_InScope(Collection<Long> nmExtdata3List) {
        regINS(CK_INS, cTL(nmExtdata3List), xgetCValueNmExtdata3(), "NM_EXTDATA3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3List The collection of nmExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata3_NotInScope(Collection<Long> nmExtdata3List) {
        doSetNmExtdata3_NotInScope(nmExtdata3List);
    }

    protected void doSetNmExtdata3_NotInScope(Collection<Long> nmExtdata3List) {
        regINS(CK_NINS, cTL(nmExtdata3List), xgetCValueNmExtdata3(), "NM_EXTDATA3");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     */
    public void setNmExtdata3_IsNull() { regNmExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     */
    public void setNmExtdata3_IsNotNull() { regNmExtdata3(CK_ISNN, DOBJ); }

    protected void regNmExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNmExtdata3(), "NM_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueNmExtdata3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_Equal(String dtExtdata1) {
        doSetDtExtdata1_Equal(fRES(dtExtdata1));
    }

    protected void doSetDtExtdata1_Equal(String dtExtdata1) {
        regDtExtdata1(CK_EQ, dtExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_NotEqual(String dtExtdata1) {
        doSetDtExtdata1_NotEqual(fRES(dtExtdata1));
    }

    protected void doSetDtExtdata1_NotEqual(String dtExtdata1) {
        regDtExtdata1(CK_NES, dtExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_GreaterThan(String dtExtdata1) {
        regDtExtdata1(CK_GT, fRES(dtExtdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_LessThan(String dtExtdata1) {
        regDtExtdata1(CK_LT, fRES(dtExtdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_GreaterEqual(String dtExtdata1) {
        regDtExtdata1(CK_GE, fRES(dtExtdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_LessEqual(String dtExtdata1) {
        regDtExtdata1(CK_LE, fRES(dtExtdata1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1List The collection of dtExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_InScope(Collection<String> dtExtdata1List) {
        doSetDtExtdata1_InScope(dtExtdata1List);
    }

    protected void doSetDtExtdata1_InScope(Collection<String> dtExtdata1List) {
        regINS(CK_INS, cTL(dtExtdata1List), xgetCValueDtExtdata1(), "DT_EXTDATA1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1List The collection of dtExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_NotInScope(Collection<String> dtExtdata1List) {
        doSetDtExtdata1_NotInScope(dtExtdata1List);
    }

    protected void doSetDtExtdata1_NotInScope(Collection<String> dtExtdata1List) {
        regINS(CK_NINS, cTL(dtExtdata1List), xgetCValueDtExtdata1(), "DT_EXTDATA1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)} <br>
     * <pre>e.g. setDtExtdata1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtExtdata1 The value of dtExtdata1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtExtdata1_LikeSearch(String dtExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtExtdata1), xgetCValueDtExtdata1(), "DT_EXTDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtExtdata1_NotLikeSearch(String dtExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtExtdata1), xgetCValueDtExtdata1(), "DT_EXTDATA1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_PrefixSearch(String dtExtdata1) {
        setDtExtdata1_LikeSearch(dtExtdata1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     */
    public void setDtExtdata1_IsNull() { regDtExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     */
    public void setDtExtdata1_IsNullOrEmpty() { regDtExtdata1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     */
    public void setDtExtdata1_IsNotNull() { regDtExtdata1(CK_ISNN, DOBJ); }

    protected void regDtExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtExtdata1(), "DT_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueDtExtdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_Equal(String dtExtdata2) {
        doSetDtExtdata2_Equal(fRES(dtExtdata2));
    }

    protected void doSetDtExtdata2_Equal(String dtExtdata2) {
        regDtExtdata2(CK_EQ, dtExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_NotEqual(String dtExtdata2) {
        doSetDtExtdata2_NotEqual(fRES(dtExtdata2));
    }

    protected void doSetDtExtdata2_NotEqual(String dtExtdata2) {
        regDtExtdata2(CK_NES, dtExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_GreaterThan(String dtExtdata2) {
        regDtExtdata2(CK_GT, fRES(dtExtdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_LessThan(String dtExtdata2) {
        regDtExtdata2(CK_LT, fRES(dtExtdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_GreaterEqual(String dtExtdata2) {
        regDtExtdata2(CK_GE, fRES(dtExtdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_LessEqual(String dtExtdata2) {
        regDtExtdata2(CK_LE, fRES(dtExtdata2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2List The collection of dtExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_InScope(Collection<String> dtExtdata2List) {
        doSetDtExtdata2_InScope(dtExtdata2List);
    }

    protected void doSetDtExtdata2_InScope(Collection<String> dtExtdata2List) {
        regINS(CK_INS, cTL(dtExtdata2List), xgetCValueDtExtdata2(), "DT_EXTDATA2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2List The collection of dtExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_NotInScope(Collection<String> dtExtdata2List) {
        doSetDtExtdata2_NotInScope(dtExtdata2List);
    }

    protected void doSetDtExtdata2_NotInScope(Collection<String> dtExtdata2List) {
        regINS(CK_NINS, cTL(dtExtdata2List), xgetCValueDtExtdata2(), "DT_EXTDATA2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)} <br>
     * <pre>e.g. setDtExtdata2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtExtdata2 The value of dtExtdata2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtExtdata2_LikeSearch(String dtExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtExtdata2), xgetCValueDtExtdata2(), "DT_EXTDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtExtdata2_NotLikeSearch(String dtExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtExtdata2), xgetCValueDtExtdata2(), "DT_EXTDATA2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_PrefixSearch(String dtExtdata2) {
        setDtExtdata2_LikeSearch(dtExtdata2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     */
    public void setDtExtdata2_IsNull() { regDtExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     */
    public void setDtExtdata2_IsNullOrEmpty() { regDtExtdata2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     */
    public void setDtExtdata2_IsNotNull() { regDtExtdata2(CK_ISNN, DOBJ); }

    protected void regDtExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtExtdata2(), "DT_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueDtExtdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_Equal(String dtExtdata3) {
        doSetDtExtdata3_Equal(fRES(dtExtdata3));
    }

    protected void doSetDtExtdata3_Equal(String dtExtdata3) {
        regDtExtdata3(CK_EQ, dtExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_NotEqual(String dtExtdata3) {
        doSetDtExtdata3_NotEqual(fRES(dtExtdata3));
    }

    protected void doSetDtExtdata3_NotEqual(String dtExtdata3) {
        regDtExtdata3(CK_NES, dtExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_GreaterThan(String dtExtdata3) {
        regDtExtdata3(CK_GT, fRES(dtExtdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_LessThan(String dtExtdata3) {
        regDtExtdata3(CK_LT, fRES(dtExtdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_GreaterEqual(String dtExtdata3) {
        regDtExtdata3(CK_GE, fRES(dtExtdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_LessEqual(String dtExtdata3) {
        regDtExtdata3(CK_LE, fRES(dtExtdata3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3List The collection of dtExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_InScope(Collection<String> dtExtdata3List) {
        doSetDtExtdata3_InScope(dtExtdata3List);
    }

    protected void doSetDtExtdata3_InScope(Collection<String> dtExtdata3List) {
        regINS(CK_INS, cTL(dtExtdata3List), xgetCValueDtExtdata3(), "DT_EXTDATA3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3List The collection of dtExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_NotInScope(Collection<String> dtExtdata3List) {
        doSetDtExtdata3_NotInScope(dtExtdata3List);
    }

    protected void doSetDtExtdata3_NotInScope(Collection<String> dtExtdata3List) {
        regINS(CK_NINS, cTL(dtExtdata3List), xgetCValueDtExtdata3(), "DT_EXTDATA3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)} <br>
     * <pre>e.g. setDtExtdata3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtExtdata3 The value of dtExtdata3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtExtdata3_LikeSearch(String dtExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtExtdata3), xgetCValueDtExtdata3(), "DT_EXTDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtExtdata3_NotLikeSearch(String dtExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtExtdata3), xgetCValueDtExtdata3(), "DT_EXTDATA3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_PrefixSearch(String dtExtdata3) {
        setDtExtdata3_LikeSearch(dtExtdata3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     */
    public void setDtExtdata3_IsNull() { regDtExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     */
    public void setDtExtdata3_IsNullOrEmpty() { regDtExtdata3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     */
    public void setDtExtdata3_IsNotNull() { regDtExtdata3(CK_ISNN, DOBJ); }

    protected void regDtExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtExtdata3(), "DT_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueDtExtdata3();

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
    public HpSLCFunction<TTrrcvbatCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrrcvbatCB.class);
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
    public HpSLCFunction<TTrrcvbatCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrrcvbatCB.class);
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
    public HpSLCFunction<TTrrcvbatCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrrcvbatCB.class);
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
    public HpSLCFunction<TTrrcvbatCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrrcvbatCB.class);
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
    public HpSLCFunction<TTrrcvbatCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrrcvbatCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrrcvbatCB&gt;() {
     *     public void query(TTrrcvbatCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrrcvbatCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrrcvbatCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrrcvbatCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrrcvbatCQ sq);

    protected TTrrcvbatCB xcreateScalarConditionCB() {
        TTrrcvbatCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrrcvbatCB xcreateScalarConditionPartitionByCB() {
        TTrrcvbatCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrrcvbatCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrrcvbatCB cb = new TTrrcvbatCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRRCVBAT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrrcvbatCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrrcvbatCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrrcvbatCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrrcvbatCB cb = new TTrrcvbatCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRRCVBAT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrrcvbatCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrrcvbatCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrrcvbatCB cb = new TTrrcvbatCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrrcvbatCQ sq);

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
    protected TTrrcvbatCB newMyCB() {
        return new TTrrcvbatCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrrcvbatCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
