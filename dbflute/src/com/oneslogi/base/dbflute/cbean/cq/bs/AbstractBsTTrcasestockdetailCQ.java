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
 * The abstract condition-query of T_TRCASESTOCKDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrcasestockdetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrcasestockdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRCASESTOCKDETAIL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcasestockdetailId The value of trcasestockdetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasestockdetailId_Equal(Long trcasestockdetailId) {
        doSetTrcasestockdetailId_Equal(trcasestockdetailId);
    }

    protected void doSetTrcasestockdetailId_Equal(Long trcasestockdetailId) {
        regTrcasestockdetailId(CK_EQ, trcasestockdetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcasestockdetailId The value of trcasestockdetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasestockdetailId_NotEqual(Long trcasestockdetailId) {
        doSetTrcasestockdetailId_NotEqual(trcasestockdetailId);
    }

    protected void doSetTrcasestockdetailId_NotEqual(Long trcasestockdetailId) {
        regTrcasestockdetailId(CK_NES, trcasestockdetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcasestockdetailId The value of trcasestockdetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasestockdetailId_GreaterThan(Long trcasestockdetailId) {
        regTrcasestockdetailId(CK_GT, trcasestockdetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcasestockdetailId The value of trcasestockdetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasestockdetailId_LessThan(Long trcasestockdetailId) {
        regTrcasestockdetailId(CK_LT, trcasestockdetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcasestockdetailId The value of trcasestockdetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasestockdetailId_GreaterEqual(Long trcasestockdetailId) {
        regTrcasestockdetailId(CK_GE, trcasestockdetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcasestockdetailId The value of trcasestockdetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasestockdetailId_LessEqual(Long trcasestockdetailId) {
        regTrcasestockdetailId(CK_LE, trcasestockdetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trcasestockdetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trcasestockdetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrcasestockdetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrcasestockdetailId(), "TRCASESTOCKDETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcasestockdetailIdList The collection of trcasestockdetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrcasestockdetailId_InScope(Collection<Long> trcasestockdetailIdList) {
        doSetTrcasestockdetailId_InScope(trcasestockdetailIdList);
    }

    protected void doSetTrcasestockdetailId_InScope(Collection<Long> trcasestockdetailIdList) {
        regINS(CK_INS, cTL(trcasestockdetailIdList), xgetCValueTrcasestockdetailId(), "TRCASESTOCKDETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trcasestockdetailIdList The collection of trcasestockdetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrcasestockdetailId_NotInScope(Collection<Long> trcasestockdetailIdList) {
        doSetTrcasestockdetailId_NotInScope(trcasestockdetailIdList);
    }

    protected void doSetTrcasestockdetailId_NotInScope(Collection<Long> trcasestockdetailIdList) {
        regINS(CK_NINS, cTL(trcasestockdetailIdList), xgetCValueTrcasestockdetailId(), "TRCASESTOCKDETAIL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrcasestockdetailId_IsNull() { regTrcasestockdetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrcasestockdetailId_IsNotNull() { regTrcasestockdetailId(CK_ISNN, DOBJ); }

    protected void regTrcasestockdetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrcasestockdetailId(), "TRCASESTOCKDETAIL_ID"); }
    protected abstract ConditionValue xgetCValueTrcasestockdetailId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASESTOCKDETAILNO: {NotNull, bigint(19)}
     * @param casestockdetailno The value of casestockdetailno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasestockdetailno_Equal(Long casestockdetailno) {
        doSetCasestockdetailno_Equal(casestockdetailno);
    }

    protected void doSetCasestockdetailno_Equal(Long casestockdetailno) {
        regCasestockdetailno(CK_EQ, casestockdetailno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASESTOCKDETAILNO: {NotNull, bigint(19)}
     * @param casestockdetailno The value of casestockdetailno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasestockdetailno_NotEqual(Long casestockdetailno) {
        doSetCasestockdetailno_NotEqual(casestockdetailno);
    }

    protected void doSetCasestockdetailno_NotEqual(Long casestockdetailno) {
        regCasestockdetailno(CK_NES, casestockdetailno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASESTOCKDETAILNO: {NotNull, bigint(19)}
     * @param casestockdetailno The value of casestockdetailno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasestockdetailno_GreaterThan(Long casestockdetailno) {
        regCasestockdetailno(CK_GT, casestockdetailno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASESTOCKDETAILNO: {NotNull, bigint(19)}
     * @param casestockdetailno The value of casestockdetailno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasestockdetailno_LessThan(Long casestockdetailno) {
        regCasestockdetailno(CK_LT, casestockdetailno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASESTOCKDETAILNO: {NotNull, bigint(19)}
     * @param casestockdetailno The value of casestockdetailno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasestockdetailno_GreaterEqual(Long casestockdetailno) {
        regCasestockdetailno(CK_GE, casestockdetailno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASESTOCKDETAILNO: {NotNull, bigint(19)}
     * @param casestockdetailno The value of casestockdetailno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasestockdetailno_LessEqual(Long casestockdetailno) {
        regCasestockdetailno(CK_LE, casestockdetailno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASESTOCKDETAILNO: {NotNull, bigint(19)}
     * @param minNumber The min number of casestockdetailno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of casestockdetailno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCasestockdetailno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCasestockdetailno(), "CASESTOCKDETAILNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASESTOCKDETAILNO: {NotNull, bigint(19)}
     * @param casestockdetailnoList The collection of casestockdetailno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasestockdetailno_InScope(Collection<Long> casestockdetailnoList) {
        doSetCasestockdetailno_InScope(casestockdetailnoList);
    }

    protected void doSetCasestockdetailno_InScope(Collection<Long> casestockdetailnoList) {
        regINS(CK_INS, cTL(casestockdetailnoList), xgetCValueCasestockdetailno(), "CASESTOCKDETAILNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASESTOCKDETAILNO: {NotNull, bigint(19)}
     * @param casestockdetailnoList The collection of casestockdetailno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasestockdetailno_NotInScope(Collection<Long> casestockdetailnoList) {
        doSetCasestockdetailno_NotInScope(casestockdetailnoList);
    }

    protected void doSetCasestockdetailno_NotInScope(Collection<Long> casestockdetailnoList) {
        regINS(CK_NINS, cTL(casestockdetailnoList), xgetCValueCasestockdetailno(), "CASESTOCKDETAILNO");
    }

    protected void regCasestockdetailno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasestockdetailno(), "CASESTOCKDETAILNO"); }
    protected abstract ConditionValue xgetCValueCasestockdetailno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)}
     * @param centerSymbolId The value of centerSymbolId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_Equal(java.math.BigDecimal centerSymbolId) {
        doSetCenterSymbolId_Equal(centerSymbolId);
    }

    protected void doSetCenterSymbolId_Equal(java.math.BigDecimal centerSymbolId) {
        regCenterSymbolId(CK_EQ, centerSymbolId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)}
     * @param centerSymbolId The value of centerSymbolId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_NotEqual(java.math.BigDecimal centerSymbolId) {
        doSetCenterSymbolId_NotEqual(centerSymbolId);
    }

    protected void doSetCenterSymbolId_NotEqual(java.math.BigDecimal centerSymbolId) {
        regCenterSymbolId(CK_NES, centerSymbolId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)}
     * @param centerSymbolId The value of centerSymbolId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_GreaterThan(java.math.BigDecimal centerSymbolId) {
        regCenterSymbolId(CK_GT, centerSymbolId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)}
     * @param centerSymbolId The value of centerSymbolId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_LessThan(java.math.BigDecimal centerSymbolId) {
        regCenterSymbolId(CK_LT, centerSymbolId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)}
     * @param centerSymbolId The value of centerSymbolId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_GreaterEqual(java.math.BigDecimal centerSymbolId) {
        regCenterSymbolId(CK_GE, centerSymbolId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)}
     * @param centerSymbolId The value of centerSymbolId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_LessEqual(java.math.BigDecimal centerSymbolId) {
        regCenterSymbolId(CK_LE, centerSymbolId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)}
     * @param minNumber The min number of centerSymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerSymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterSymbolId_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)}
     * @param centerSymbolIdList The collection of centerSymbolId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterSymbolId_InScope(Collection<java.math.BigDecimal> centerSymbolIdList) {
        doSetCenterSymbolId_InScope(centerSymbolIdList);
    }

    protected void doSetCenterSymbolId_InScope(Collection<java.math.BigDecimal> centerSymbolIdList) {
        regINS(CK_INS, cTL(centerSymbolIdList), xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)}
     * @param centerSymbolIdList The collection of centerSymbolId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterSymbolId_NotInScope(Collection<java.math.BigDecimal> centerSymbolIdList) {
        doSetCenterSymbolId_NotInScope(centerSymbolIdList);
    }

    protected void doSetCenterSymbolId_NotInScope(Collection<java.math.BigDecimal> centerSymbolIdList) {
        regINS(CK_NINS, cTL(centerSymbolIdList), xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID");
    }

    protected void regCenterSymbolId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID"); }
    protected abstract ConditionValue xgetCValueCenterSymbolId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCKDATE: {NotNull, varchar(8)}
     * @param sortstockdate The value of sortstockdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockdate_Equal(String sortstockdate) {
        doSetSortstockdate_Equal(fRES(sortstockdate));
    }

    protected void doSetSortstockdate_Equal(String sortstockdate) {
        regSortstockdate(CK_EQ, sortstockdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCKDATE: {NotNull, varchar(8)}
     * @param sortstockdate The value of sortstockdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockdate_NotEqual(String sortstockdate) {
        doSetSortstockdate_NotEqual(fRES(sortstockdate));
    }

    protected void doSetSortstockdate_NotEqual(String sortstockdate) {
        regSortstockdate(CK_NES, sortstockdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCKDATE: {NotNull, varchar(8)}
     * @param sortstockdate The value of sortstockdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockdate_GreaterThan(String sortstockdate) {
        regSortstockdate(CK_GT, fRES(sortstockdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCKDATE: {NotNull, varchar(8)}
     * @param sortstockdate The value of sortstockdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockdate_LessThan(String sortstockdate) {
        regSortstockdate(CK_LT, fRES(sortstockdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCKDATE: {NotNull, varchar(8)}
     * @param sortstockdate The value of sortstockdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockdate_GreaterEqual(String sortstockdate) {
        regSortstockdate(CK_GE, fRES(sortstockdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCKDATE: {NotNull, varchar(8)}
     * @param sortstockdate The value of sortstockdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockdate_LessEqual(String sortstockdate) {
        regSortstockdate(CK_LE, fRES(sortstockdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTSTOCKDATE: {NotNull, varchar(8)}
     * @param sortstockdateList The collection of sortstockdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockdate_InScope(Collection<String> sortstockdateList) {
        doSetSortstockdate_InScope(sortstockdateList);
    }

    protected void doSetSortstockdate_InScope(Collection<String> sortstockdateList) {
        regINS(CK_INS, cTL(sortstockdateList), xgetCValueSortstockdate(), "SORTSTOCKDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTSTOCKDATE: {NotNull, varchar(8)}
     * @param sortstockdateList The collection of sortstockdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockdate_NotInScope(Collection<String> sortstockdateList) {
        doSetSortstockdate_NotInScope(sortstockdateList);
    }

    protected void doSetSortstockdate_NotInScope(Collection<String> sortstockdateList) {
        regINS(CK_NINS, cTL(sortstockdateList), xgetCValueSortstockdate(), "SORTSTOCKDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTSTOCKDATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setSortstockdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortstockdate The value of sortstockdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortstockdate_LikeSearch(String sortstockdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortstockdate), xgetCValueSortstockdate(), "SORTSTOCKDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTSTOCKDATE: {NotNull, varchar(8)}
     * @param sortstockdate The value of sortstockdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortstockdate_NotLikeSearch(String sortstockdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortstockdate), xgetCValueSortstockdate(), "SORTSTOCKDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTSTOCKDATE: {NotNull, varchar(8)}
     * @param sortstockdate The value of sortstockdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockdate_PrefixSearch(String sortstockdate) {
        setSortstockdate_LikeSearch(sortstockdate, xcLSOPPre());
    }

    protected void regSortstockdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortstockdate(), "SORTSTOCKDATE"); }
    protected abstract ConditionValue xgetCValueSortstockdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKTIME: {NotNull, varchar(6)}
     * @param worktime The value of worktime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorktime_Equal(String worktime) {
        doSetWorktime_Equal(fRES(worktime));
    }

    protected void doSetWorktime_Equal(String worktime) {
        regWorktime(CK_EQ, worktime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKTIME: {NotNull, varchar(6)}
     * @param worktime The value of worktime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorktime_NotEqual(String worktime) {
        doSetWorktime_NotEqual(fRES(worktime));
    }

    protected void doSetWorktime_NotEqual(String worktime) {
        regWorktime(CK_NES, worktime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKTIME: {NotNull, varchar(6)}
     * @param worktime The value of worktime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorktime_GreaterThan(String worktime) {
        regWorktime(CK_GT, fRES(worktime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKTIME: {NotNull, varchar(6)}
     * @param worktime The value of worktime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorktime_LessThan(String worktime) {
        regWorktime(CK_LT, fRES(worktime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKTIME: {NotNull, varchar(6)}
     * @param worktime The value of worktime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorktime_GreaterEqual(String worktime) {
        regWorktime(CK_GE, fRES(worktime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKTIME: {NotNull, varchar(6)}
     * @param worktime The value of worktime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorktime_LessEqual(String worktime) {
        regWorktime(CK_LE, fRES(worktime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORKTIME: {NotNull, varchar(6)}
     * @param worktimeList The collection of worktime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorktime_InScope(Collection<String> worktimeList) {
        doSetWorktime_InScope(worktimeList);
    }

    protected void doSetWorktime_InScope(Collection<String> worktimeList) {
        regINS(CK_INS, cTL(worktimeList), xgetCValueWorktime(), "WORKTIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORKTIME: {NotNull, varchar(6)}
     * @param worktimeList The collection of worktime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorktime_NotInScope(Collection<String> worktimeList) {
        doSetWorktime_NotInScope(worktimeList);
    }

    protected void doSetWorktime_NotInScope(Collection<String> worktimeList) {
        regINS(CK_NINS, cTL(worktimeList), xgetCValueWorktime(), "WORKTIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORKTIME: {NotNull, varchar(6)} <br>
     * <pre>e.g. setWorktime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param worktime The value of worktime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorktime_LikeSearch(String worktime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(worktime), xgetCValueWorktime(), "WORKTIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORKTIME: {NotNull, varchar(6)}
     * @param worktime The value of worktime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorktime_NotLikeSearch(String worktime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(worktime), xgetCValueWorktime(), "WORKTIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORKTIME: {NotNull, varchar(6)}
     * @param worktime The value of worktime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorktime_PrefixSearch(String worktime) {
        setWorktime_LikeSearch(worktime, xcLSOPPre());
    }

    protected void regWorktime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorktime(), "WORKTIME"); }
    protected abstract ConditionValue xgetCValueWorktime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCKKBN: {NotNull, varchar(30)}
     * @param sortstockkbn The value of sortstockkbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockkbn_Equal(String sortstockkbn) {
        doSetSortstockkbn_Equal(fRES(sortstockkbn));
    }

    protected void doSetSortstockkbn_Equal(String sortstockkbn) {
        regSortstockkbn(CK_EQ, sortstockkbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCKKBN: {NotNull, varchar(30)}
     * @param sortstockkbn The value of sortstockkbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockkbn_NotEqual(String sortstockkbn) {
        doSetSortstockkbn_NotEqual(fRES(sortstockkbn));
    }

    protected void doSetSortstockkbn_NotEqual(String sortstockkbn) {
        regSortstockkbn(CK_NES, sortstockkbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCKKBN: {NotNull, varchar(30)}
     * @param sortstockkbn The value of sortstockkbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockkbn_GreaterThan(String sortstockkbn) {
        regSortstockkbn(CK_GT, fRES(sortstockkbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCKKBN: {NotNull, varchar(30)}
     * @param sortstockkbn The value of sortstockkbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockkbn_LessThan(String sortstockkbn) {
        regSortstockkbn(CK_LT, fRES(sortstockkbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCKKBN: {NotNull, varchar(30)}
     * @param sortstockkbn The value of sortstockkbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockkbn_GreaterEqual(String sortstockkbn) {
        regSortstockkbn(CK_GE, fRES(sortstockkbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTSTOCKKBN: {NotNull, varchar(30)}
     * @param sortstockkbn The value of sortstockkbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockkbn_LessEqual(String sortstockkbn) {
        regSortstockkbn(CK_LE, fRES(sortstockkbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTSTOCKKBN: {NotNull, varchar(30)}
     * @param sortstockkbnList The collection of sortstockkbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockkbn_InScope(Collection<String> sortstockkbnList) {
        doSetSortstockkbn_InScope(sortstockkbnList);
    }

    protected void doSetSortstockkbn_InScope(Collection<String> sortstockkbnList) {
        regINS(CK_INS, cTL(sortstockkbnList), xgetCValueSortstockkbn(), "SORTSTOCKKBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTSTOCKKBN: {NotNull, varchar(30)}
     * @param sortstockkbnList The collection of sortstockkbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockkbn_NotInScope(Collection<String> sortstockkbnList) {
        doSetSortstockkbn_NotInScope(sortstockkbnList);
    }

    protected void doSetSortstockkbn_NotInScope(Collection<String> sortstockkbnList) {
        regINS(CK_NINS, cTL(sortstockkbnList), xgetCValueSortstockkbn(), "SORTSTOCKKBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTSTOCKKBN: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSortstockkbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortstockkbn The value of sortstockkbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortstockkbn_LikeSearch(String sortstockkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortstockkbn), xgetCValueSortstockkbn(), "SORTSTOCKKBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTSTOCKKBN: {NotNull, varchar(30)}
     * @param sortstockkbn The value of sortstockkbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortstockkbn_NotLikeSearch(String sortstockkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortstockkbn), xgetCValueSortstockkbn(), "SORTSTOCKKBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTSTOCKKBN: {NotNull, varchar(30)}
     * @param sortstockkbn The value of sortstockkbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortstockkbn_PrefixSearch(String sortstockkbn) {
        setSortstockkbn_LikeSearch(sortstockkbn, xcLSOPPre());
    }

    protected void regSortstockkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortstockkbn(), "SORTSTOCKKBN"); }
    protected abstract ConditionValue xgetCValueSortstockkbn();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATETIMES: {NotNull, decimal(16, 6)}
     * @param operatetimes The value of operatetimes as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperatetimes_Equal(java.math.BigDecimal operatetimes) {
        doSetOperatetimes_Equal(operatetimes);
    }

    protected void doSetOperatetimes_Equal(java.math.BigDecimal operatetimes) {
        regOperatetimes(CK_EQ, operatetimes);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATETIMES: {NotNull, decimal(16, 6)}
     * @param operatetimes The value of operatetimes as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperatetimes_NotEqual(java.math.BigDecimal operatetimes) {
        doSetOperatetimes_NotEqual(operatetimes);
    }

    protected void doSetOperatetimes_NotEqual(java.math.BigDecimal operatetimes) {
        regOperatetimes(CK_NES, operatetimes);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATETIMES: {NotNull, decimal(16, 6)}
     * @param operatetimes The value of operatetimes as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperatetimes_GreaterThan(java.math.BigDecimal operatetimes) {
        regOperatetimes(CK_GT, operatetimes);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATETIMES: {NotNull, decimal(16, 6)}
     * @param operatetimes The value of operatetimes as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperatetimes_LessThan(java.math.BigDecimal operatetimes) {
        regOperatetimes(CK_LT, operatetimes);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATETIMES: {NotNull, decimal(16, 6)}
     * @param operatetimes The value of operatetimes as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperatetimes_GreaterEqual(java.math.BigDecimal operatetimes) {
        regOperatetimes(CK_GE, operatetimes);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATETIMES: {NotNull, decimal(16, 6)}
     * @param operatetimes The value of operatetimes as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperatetimes_LessEqual(java.math.BigDecimal operatetimes) {
        regOperatetimes(CK_LE, operatetimes);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATETIMES: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of operatetimes. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of operatetimes. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOperatetimes_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOperatetimes(), "OPERATETIMES", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OPERATETIMES: {NotNull, decimal(16, 6)}
     * @param operatetimesList The collection of operatetimes as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperatetimes_InScope(Collection<java.math.BigDecimal> operatetimesList) {
        doSetOperatetimes_InScope(operatetimesList);
    }

    protected void doSetOperatetimes_InScope(Collection<java.math.BigDecimal> operatetimesList) {
        regINS(CK_INS, cTL(operatetimesList), xgetCValueOperatetimes(), "OPERATETIMES");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OPERATETIMES: {NotNull, decimal(16, 6)}
     * @param operatetimesList The collection of operatetimes as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperatetimes_NotInScope(Collection<java.math.BigDecimal> operatetimesList) {
        doSetOperatetimes_NotInScope(operatetimesList);
    }

    protected void doSetOperatetimes_NotInScope(Collection<java.math.BigDecimal> operatetimesList) {
        regINS(CK_NINS, cTL(operatetimesList), xgetCValueOperatetimes(), "OPERATETIMES");
    }

    protected void regOperatetimes(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOperatetimes(), "OPERATETIMES"); }
    protected abstract ConditionValue xgetCValueOperatetimes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {IX+, NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_Equal(String sotedunit) {
        doSetSotedunit_Equal(fRES(sotedunit));
    }

    protected void doSetSotedunit_Equal(String sotedunit) {
        regSotedunit(CK_EQ, sotedunit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {IX+, NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_NotEqual(String sotedunit) {
        doSetSotedunit_NotEqual(fRES(sotedunit));
    }

    protected void doSetSotedunit_NotEqual(String sotedunit) {
        regSotedunit(CK_NES, sotedunit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {IX+, NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_GreaterThan(String sotedunit) {
        regSotedunit(CK_GT, fRES(sotedunit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {IX+, NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_LessThan(String sotedunit) {
        regSotedunit(CK_LT, fRES(sotedunit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {IX+, NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_GreaterEqual(String sotedunit) {
        regSotedunit(CK_GE, fRES(sotedunit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {IX+, NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_LessEqual(String sotedunit) {
        regSotedunit(CK_LE, fRES(sotedunit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {IX+, NotNull, varchar(30)}
     * @param sotedunitList The collection of sotedunit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_InScope(Collection<String> sotedunitList) {
        doSetSotedunit_InScope(sotedunitList);
    }

    protected void doSetSotedunit_InScope(Collection<String> sotedunitList) {
        regINS(CK_INS, cTL(sotedunitList), xgetCValueSotedunit(), "SOTEDUNIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {IX+, NotNull, varchar(30)}
     * @param sotedunitList The collection of sotedunit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_NotInScope(Collection<String> sotedunitList) {
        doSetSotedunit_NotInScope(sotedunitList);
    }

    protected void doSetSotedunit_NotInScope(Collection<String> sotedunitList) {
        regINS(CK_NINS, cTL(sotedunitList), xgetCValueSotedunit(), "SOTEDUNIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {IX+, NotNull, varchar(30)} <br>
     * <pre>e.g. setSotedunit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sotedunit The value of sotedunit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSotedunit_LikeSearch(String sotedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sotedunit), xgetCValueSotedunit(), "SOTEDUNIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {IX+, NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSotedunit_NotLikeSearch(String sotedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sotedunit), xgetCValueSotedunit(), "SOTEDUNIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {IX+, NotNull, varchar(30)}
     * @param sotedunit The value of sotedunit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_PrefixSearch(String sotedunit) {
        setSotedunit_LikeSearch(sotedunit, xcLSOPPre());
    }

    protected void regSotedunit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSotedunit(), "SOTEDUNIT"); }
    protected abstract ConditionValue xgetCValueSotedunit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTLOCCD: {NotNull, varchar(255)}
     * @param sortloccd The value of sortloccd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortloccd_Equal(String sortloccd) {
        doSetSortloccd_Equal(fRES(sortloccd));
    }

    protected void doSetSortloccd_Equal(String sortloccd) {
        regSortloccd(CK_EQ, sortloccd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTLOCCD: {NotNull, varchar(255)}
     * @param sortloccd The value of sortloccd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortloccd_NotEqual(String sortloccd) {
        doSetSortloccd_NotEqual(fRES(sortloccd));
    }

    protected void doSetSortloccd_NotEqual(String sortloccd) {
        regSortloccd(CK_NES, sortloccd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTLOCCD: {NotNull, varchar(255)}
     * @param sortloccd The value of sortloccd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortloccd_GreaterThan(String sortloccd) {
        regSortloccd(CK_GT, fRES(sortloccd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTLOCCD: {NotNull, varchar(255)}
     * @param sortloccd The value of sortloccd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortloccd_LessThan(String sortloccd) {
        regSortloccd(CK_LT, fRES(sortloccd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTLOCCD: {NotNull, varchar(255)}
     * @param sortloccd The value of sortloccd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortloccd_GreaterEqual(String sortloccd) {
        regSortloccd(CK_GE, fRES(sortloccd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTLOCCD: {NotNull, varchar(255)}
     * @param sortloccd The value of sortloccd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortloccd_LessEqual(String sortloccd) {
        regSortloccd(CK_LE, fRES(sortloccd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTLOCCD: {NotNull, varchar(255)}
     * @param sortloccdList The collection of sortloccd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortloccd_InScope(Collection<String> sortloccdList) {
        doSetSortloccd_InScope(sortloccdList);
    }

    protected void doSetSortloccd_InScope(Collection<String> sortloccdList) {
        regINS(CK_INS, cTL(sortloccdList), xgetCValueSortloccd(), "SORTLOCCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTLOCCD: {NotNull, varchar(255)}
     * @param sortloccdList The collection of sortloccd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortloccd_NotInScope(Collection<String> sortloccdList) {
        doSetSortloccd_NotInScope(sortloccdList);
    }

    protected void doSetSortloccd_NotInScope(Collection<String> sortloccdList) {
        regINS(CK_NINS, cTL(sortloccdList), xgetCValueSortloccd(), "SORTLOCCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTLOCCD: {NotNull, varchar(255)} <br>
     * <pre>e.g. setSortloccd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortloccd The value of sortloccd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortloccd_LikeSearch(String sortloccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortloccd), xgetCValueSortloccd(), "SORTLOCCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTLOCCD: {NotNull, varchar(255)}
     * @param sortloccd The value of sortloccd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortloccd_NotLikeSearch(String sortloccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortloccd), xgetCValueSortloccd(), "SORTLOCCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTLOCCD: {NotNull, varchar(255)}
     * @param sortloccd The value of sortloccd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortloccd_PrefixSearch(String sortloccd) {
        setSortloccd_LikeSearch(sortloccd, xcLSOPPre());
    }

    protected void regSortloccd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortloccd(), "SORTLOCCD"); }
    protected abstract ConditionValue xgetCValueSortloccd();

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
     * OPERATEQTY: {varchar(255)}
     * @param operateqty The value of operateqty as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperateqty_Equal(String operateqty) {
        doSetOperateqty_Equal(fRES(operateqty));
    }

    protected void doSetOperateqty_Equal(String operateqty) {
        regOperateqty(CK_EQ, operateqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATEQTY: {varchar(255)}
     * @param operateqty The value of operateqty as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperateqty_NotEqual(String operateqty) {
        doSetOperateqty_NotEqual(fRES(operateqty));
    }

    protected void doSetOperateqty_NotEqual(String operateqty) {
        regOperateqty(CK_NES, operateqty);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATEQTY: {varchar(255)}
     * @param operateqty The value of operateqty as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperateqty_GreaterThan(String operateqty) {
        regOperateqty(CK_GT, fRES(operateqty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATEQTY: {varchar(255)}
     * @param operateqty The value of operateqty as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperateqty_LessThan(String operateqty) {
        regOperateqty(CK_LT, fRES(operateqty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATEQTY: {varchar(255)}
     * @param operateqty The value of operateqty as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperateqty_GreaterEqual(String operateqty) {
        regOperateqty(CK_GE, fRES(operateqty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATEQTY: {varchar(255)}
     * @param operateqty The value of operateqty as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperateqty_LessEqual(String operateqty) {
        regOperateqty(CK_LE, fRES(operateqty));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPERATEQTY: {varchar(255)}
     * @param operateqtyList The collection of operateqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperateqty_InScope(Collection<String> operateqtyList) {
        doSetOperateqty_InScope(operateqtyList);
    }

    protected void doSetOperateqty_InScope(Collection<String> operateqtyList) {
        regINS(CK_INS, cTL(operateqtyList), xgetCValueOperateqty(), "OPERATEQTY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPERATEQTY: {varchar(255)}
     * @param operateqtyList The collection of operateqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperateqty_NotInScope(Collection<String> operateqtyList) {
        doSetOperateqty_NotInScope(operateqtyList);
    }

    protected void doSetOperateqty_NotInScope(Collection<String> operateqtyList) {
        regINS(CK_NINS, cTL(operateqtyList), xgetCValueOperateqty(), "OPERATEQTY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATEQTY: {varchar(255)} <br>
     * <pre>e.g. setOperateqty_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param operateqty The value of operateqty as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOperateqty_LikeSearch(String operateqty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(operateqty), xgetCValueOperateqty(), "OPERATEQTY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATEQTY: {varchar(255)}
     * @param operateqty The value of operateqty as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOperateqty_NotLikeSearch(String operateqty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(operateqty), xgetCValueOperateqty(), "OPERATEQTY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATEQTY: {varchar(255)}
     * @param operateqty The value of operateqty as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperateqty_PrefixSearch(String operateqty) {
        setOperateqty_LikeSearch(operateqty, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OPERATEQTY: {varchar(255)}
     */
    public void setOperateqty_IsNull() { regOperateqty(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OPERATEQTY: {varchar(255)}
     */
    public void setOperateqty_IsNullOrEmpty() { regOperateqty(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OPERATEQTY: {varchar(255)}
     */
    public void setOperateqty_IsNotNull() { regOperateqty(CK_ISNN, DOBJ); }

    protected void regOperateqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOperateqty(), "OPERATEQTY"); }
    protected abstract ConditionValue xgetCValueOperateqty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_Equal(String manufacturedate) {
        doSetManufacturedate_Equal(fRES(manufacturedate));
    }

    protected void doSetManufacturedate_Equal(String manufacturedate) {
        regManufacturedate(CK_EQ, manufacturedate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_NotEqual(String manufacturedate) {
        doSetManufacturedate_NotEqual(fRES(manufacturedate));
    }

    protected void doSetManufacturedate_NotEqual(String manufacturedate) {
        regManufacturedate(CK_NES, manufacturedate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_GreaterThan(String manufacturedate) {
        regManufacturedate(CK_GT, fRES(manufacturedate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_LessThan(String manufacturedate) {
        regManufacturedate(CK_LT, fRES(manufacturedate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_GreaterEqual(String manufacturedate) {
        regManufacturedate(CK_GE, fRES(manufacturedate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_LessEqual(String manufacturedate) {
        regManufacturedate(CK_LE, fRES(manufacturedate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedateList The collection of manufacturedate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_InScope(Collection<String> manufacturedateList) {
        doSetManufacturedate_InScope(manufacturedateList);
    }

    protected void doSetManufacturedate_InScope(Collection<String> manufacturedateList) {
        regINS(CK_INS, cTL(manufacturedateList), xgetCValueManufacturedate(), "MANUFACTUREDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedateList The collection of manufacturedate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_NotInScope(Collection<String> manufacturedateList) {
        doSetManufacturedate_NotInScope(manufacturedateList);
    }

    protected void doSetManufacturedate_NotInScope(Collection<String> manufacturedateList) {
        regINS(CK_NINS, cTL(manufacturedateList), xgetCValueManufacturedate(), "MANUFACTUREDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)} <br>
     * <pre>e.g. setManufacturedate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufacturedate The value of manufacturedate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufacturedate_LikeSearch(String manufacturedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufacturedate), xgetCValueManufacturedate(), "MANUFACTUREDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufacturedate_NotLikeSearch(String manufacturedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufacturedate), xgetCValueManufacturedate(), "MANUFACTUREDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_PrefixSearch(String manufacturedate) {
        setManufacturedate_LikeSearch(manufacturedate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     */
    public void setManufacturedate_IsNull() { regManufacturedate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     */
    public void setManufacturedate_IsNullOrEmpty() { regManufacturedate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     */
    public void setManufacturedate_IsNotNull() { regManufacturedate(CK_ISNN, DOBJ); }

    protected void regManufacturedate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufacturedate(), "MANUFACTUREDATE"); }
    protected abstract ConditionValue xgetCValueManufacturedate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONFIRMNO: {decimal(16, 6)}
     * @param confirmno The value of confirmno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setConfirmno_Equal(java.math.BigDecimal confirmno) {
        doSetConfirmno_Equal(confirmno);
    }

    protected void doSetConfirmno_Equal(java.math.BigDecimal confirmno) {
        regConfirmno(CK_EQ, confirmno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONFIRMNO: {decimal(16, 6)}
     * @param confirmno The value of confirmno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConfirmno_NotEqual(java.math.BigDecimal confirmno) {
        doSetConfirmno_NotEqual(confirmno);
    }

    protected void doSetConfirmno_NotEqual(java.math.BigDecimal confirmno) {
        regConfirmno(CK_NES, confirmno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONFIRMNO: {decimal(16, 6)}
     * @param confirmno The value of confirmno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setConfirmno_GreaterThan(java.math.BigDecimal confirmno) {
        regConfirmno(CK_GT, confirmno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONFIRMNO: {decimal(16, 6)}
     * @param confirmno The value of confirmno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setConfirmno_LessThan(java.math.BigDecimal confirmno) {
        regConfirmno(CK_LT, confirmno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONFIRMNO: {decimal(16, 6)}
     * @param confirmno The value of confirmno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConfirmno_GreaterEqual(java.math.BigDecimal confirmno) {
        regConfirmno(CK_GE, confirmno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONFIRMNO: {decimal(16, 6)}
     * @param confirmno The value of confirmno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConfirmno_LessEqual(java.math.BigDecimal confirmno) {
        regConfirmno(CK_LE, confirmno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONFIRMNO: {decimal(16, 6)}
     * @param minNumber The min number of confirmno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of confirmno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConfirmno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueConfirmno(), "CONFIRMNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CONFIRMNO: {decimal(16, 6)}
     * @param confirmnoList The collection of confirmno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmno_InScope(Collection<java.math.BigDecimal> confirmnoList) {
        doSetConfirmno_InScope(confirmnoList);
    }

    protected void doSetConfirmno_InScope(Collection<java.math.BigDecimal> confirmnoList) {
        regINS(CK_INS, cTL(confirmnoList), xgetCValueConfirmno(), "CONFIRMNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CONFIRMNO: {decimal(16, 6)}
     * @param confirmnoList The collection of confirmno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmno_NotInScope(Collection<java.math.BigDecimal> confirmnoList) {
        doSetConfirmno_NotInScope(confirmnoList);
    }

    protected void doSetConfirmno_NotInScope(Collection<java.math.BigDecimal> confirmnoList) {
        regINS(CK_NINS, cTL(confirmnoList), xgetCValueConfirmno(), "CONFIRMNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CONFIRMNO: {decimal(16, 6)}
     */
    public void setConfirmno_IsNull() { regConfirmno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CONFIRMNO: {decimal(16, 6)}
     */
    public void setConfirmno_IsNotNull() { regConfirmno(CK_ISNN, DOBJ); }

    protected void regConfirmno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueConfirmno(), "CONFIRMNO"); }
    protected abstract ConditionValue xgetCValueConfirmno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * @param printdatetime The value of printdatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintdatetime_Equal(java.sql.Timestamp printdatetime) {
        regPrintdatetime(CK_EQ,  printdatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * @param printdatetime The value of printdatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintdatetime_GreaterThan(java.sql.Timestamp printdatetime) {
        regPrintdatetime(CK_GT,  printdatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * @param printdatetime The value of printdatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintdatetime_LessThan(java.sql.Timestamp printdatetime) {
        regPrintdatetime(CK_LT,  printdatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * @param printdatetime The value of printdatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintdatetime_GreaterEqual(java.sql.Timestamp printdatetime) {
        regPrintdatetime(CK_GE,  printdatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * @param printdatetime The value of printdatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintdatetime_LessEqual(java.sql.Timestamp printdatetime) {
        regPrintdatetime(CK_LE, printdatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * <pre>e.g. setPrintdatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of printdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of printdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPrintdatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValuePrintdatetime(), "PRINTDATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of printdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of printdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPrintdatetime_DateFromTo(Date fromDate, Date toDate) {
        setPrintdatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     */
    public void setPrintdatetime_IsNull() { regPrintdatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     */
    public void setPrintdatetime_IsNotNull() { regPrintdatetime(CK_ISNN, DOBJ); }

    protected void regPrintdatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintdatetime(), "PRINTDATETIME"); }
    protected abstract ConditionValue xgetCValuePrintdatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1), default=[(0)]}
     * @param printedflg The value of printedflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_Equal(String printedflg) {
        doSetPrintedflg_Equal(fRES(printedflg));
    }

    protected void doSetPrintedflg_Equal(String printedflg) {
        regPrintedflg(CK_EQ, printedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1), default=[(0)]}
     * @param printedflg The value of printedflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_NotEqual(String printedflg) {
        doSetPrintedflg_NotEqual(fRES(printedflg));
    }

    protected void doSetPrintedflg_NotEqual(String printedflg) {
        regPrintedflg(CK_NES, printedflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1), default=[(0)]}
     * @param printedflg The value of printedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_GreaterThan(String printedflg) {
        regPrintedflg(CK_GT, fRES(printedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1), default=[(0)]}
     * @param printedflg The value of printedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_LessThan(String printedflg) {
        regPrintedflg(CK_LT, fRES(printedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1), default=[(0)]}
     * @param printedflg The value of printedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_GreaterEqual(String printedflg) {
        regPrintedflg(CK_GE, fRES(printedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1), default=[(0)]}
     * @param printedflg The value of printedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_LessEqual(String printedflg) {
        regPrintedflg(CK_LE, fRES(printedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1), default=[(0)]}
     * @param printedflgList The collection of printedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_InScope(Collection<String> printedflgList) {
        doSetPrintedflg_InScope(printedflgList);
    }

    protected void doSetPrintedflg_InScope(Collection<String> printedflgList) {
        regINS(CK_INS, cTL(printedflgList), xgetCValuePrintedflg(), "PRINTEDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1), default=[(0)]}
     * @param printedflgList The collection of printedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_NotInScope(Collection<String> printedflgList) {
        doSetPrintedflg_NotInScope(printedflgList);
    }

    protected void doSetPrintedflg_NotInScope(Collection<String> printedflgList) {
        regINS(CK_NINS, cTL(printedflgList), xgetCValuePrintedflg(), "PRINTEDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setPrintedflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param printedflg The value of printedflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrintedflg_LikeSearch(String printedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(printedflg), xgetCValuePrintedflg(), "PRINTEDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1), default=[(0)]}
     * @param printedflg The value of printedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrintedflg_NotLikeSearch(String printedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printedflg), xgetCValuePrintedflg(), "PRINTEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1), default=[(0)]}
     * @param printedflg The value of printedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_PrefixSearch(String printedflg) {
        setPrintedflg_LikeSearch(printedflg, xcLSOPPre());
    }

    protected void regPrintedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintedflg(), "PRINTEDFLG"); }
    protected abstract ConditionValue xgetCValuePrintedflg();

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
    public HpSLCFunction<TTrcasestockdetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrcasestockdetailCB.class);
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
    public HpSLCFunction<TTrcasestockdetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrcasestockdetailCB.class);
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
    public HpSLCFunction<TTrcasestockdetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrcasestockdetailCB.class);
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
    public HpSLCFunction<TTrcasestockdetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrcasestockdetailCB.class);
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
    public HpSLCFunction<TTrcasestockdetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrcasestockdetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrcasestockdetailCB&gt;() {
     *     public void query(TTrcasestockdetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrcasestockdetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrcasestockdetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcasestockdetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrcasestockdetailCQ sq);

    protected TTrcasestockdetailCB xcreateScalarConditionCB() {
        TTrcasestockdetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrcasestockdetailCB xcreateScalarConditionPartitionByCB() {
        TTrcasestockdetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrcasestockdetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcasestockdetailCB cb = new TTrcasestockdetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRCASESTOCKDETAIL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrcasestockdetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrcasestockdetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrcasestockdetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcasestockdetailCB cb = new TTrcasestockdetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRCASESTOCKDETAIL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrcasestockdetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrcasestockdetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrcasestockdetailCB cb = new TTrcasestockdetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrcasestockdetailCQ sq);

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
    protected TTrcasestockdetailCB newMyCB() {
        return new TTrcasestockdetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrcasestockdetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
