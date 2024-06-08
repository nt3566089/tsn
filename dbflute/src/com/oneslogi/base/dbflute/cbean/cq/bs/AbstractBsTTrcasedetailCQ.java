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
 * The abstract condition-query of T_TRCASEDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrcasedetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrcasedetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRCASEDETAIL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trcasedetailId The value of trcasedetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasedetailId_Equal(Long trcasedetailId) {
        doSetTrcasedetailId_Equal(trcasedetailId);
    }

    protected void doSetTrcasedetailId_Equal(Long trcasedetailId) {
        regTrcasedetailId(CK_EQ, trcasedetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trcasedetailId The value of trcasedetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasedetailId_NotEqual(Long trcasedetailId) {
        doSetTrcasedetailId_NotEqual(trcasedetailId);
    }

    protected void doSetTrcasedetailId_NotEqual(Long trcasedetailId) {
        regTrcasedetailId(CK_NES, trcasedetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trcasedetailId The value of trcasedetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasedetailId_GreaterThan(Long trcasedetailId) {
        regTrcasedetailId(CK_GT, trcasedetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trcasedetailId The value of trcasedetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasedetailId_LessThan(Long trcasedetailId) {
        regTrcasedetailId(CK_LT, trcasedetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trcasedetailId The value of trcasedetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasedetailId_GreaterEqual(Long trcasedetailId) {
        regTrcasedetailId(CK_GE, trcasedetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trcasedetailId The value of trcasedetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrcasedetailId_LessEqual(Long trcasedetailId) {
        regTrcasedetailId(CK_LE, trcasedetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param minNumber The min number of trcasedetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trcasedetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrcasedetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrcasedetailId(), "TRCASEDETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trcasedetailIdList The collection of trcasedetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrcasedetailId_InScope(Collection<Long> trcasedetailIdList) {
        doSetTrcasedetailId_InScope(trcasedetailIdList);
    }

    protected void doSetTrcasedetailId_InScope(Collection<Long> trcasedetailIdList) {
        regINS(CK_INS, cTL(trcasedetailIdList), xgetCValueTrcasedetailId(), "TRCASEDETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trcasedetailIdList The collection of trcasedetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrcasedetailId_NotInScope(Collection<Long> trcasedetailIdList) {
        doSetTrcasedetailId_NotInScope(trcasedetailIdList);
    }

    protected void doSetTrcasedetailId_NotInScope(Collection<Long> trcasedetailIdList) {
        regINS(CK_NINS, cTL(trcasedetailIdList), xgetCValueTrcasedetailId(), "TRCASEDETAIL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     */
    public void setTrcasedetailId_IsNull() { regTrcasedetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     */
    public void setTrcasedetailId_IsNotNull() { regTrcasedetailId(CK_ISNN, DOBJ); }

    protected void regTrcasedetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrcasedetailId(), "TRCASEDETAIL_ID"); }
    protected abstract ConditionValue xgetCValueTrcasedetailId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEDETAILNO: {NotNull, bigint(19)}
     * @param casedetailno The value of casedetailno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasedetailno_Equal(Long casedetailno) {
        doSetCasedetailno_Equal(casedetailno);
    }

    protected void doSetCasedetailno_Equal(Long casedetailno) {
        regCasedetailno(CK_EQ, casedetailno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEDETAILNO: {NotNull, bigint(19)}
     * @param casedetailno The value of casedetailno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasedetailno_NotEqual(Long casedetailno) {
        doSetCasedetailno_NotEqual(casedetailno);
    }

    protected void doSetCasedetailno_NotEqual(Long casedetailno) {
        regCasedetailno(CK_NES, casedetailno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEDETAILNO: {NotNull, bigint(19)}
     * @param casedetailno The value of casedetailno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasedetailno_GreaterThan(Long casedetailno) {
        regCasedetailno(CK_GT, casedetailno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEDETAILNO: {NotNull, bigint(19)}
     * @param casedetailno The value of casedetailno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasedetailno_LessThan(Long casedetailno) {
        regCasedetailno(CK_LT, casedetailno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEDETAILNO: {NotNull, bigint(19)}
     * @param casedetailno The value of casedetailno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasedetailno_GreaterEqual(Long casedetailno) {
        regCasedetailno(CK_GE, casedetailno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEDETAILNO: {NotNull, bigint(19)}
     * @param casedetailno The value of casedetailno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasedetailno_LessEqual(Long casedetailno) {
        regCasedetailno(CK_LE, casedetailno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASEDETAILNO: {NotNull, bigint(19)}
     * @param minNumber The min number of casedetailno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of casedetailno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCasedetailno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCasedetailno(), "CASEDETAILNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEDETAILNO: {NotNull, bigint(19)}
     * @param casedetailnoList The collection of casedetailno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasedetailno_InScope(Collection<Long> casedetailnoList) {
        doSetCasedetailno_InScope(casedetailnoList);
    }

    protected void doSetCasedetailno_InScope(Collection<Long> casedetailnoList) {
        regINS(CK_INS, cTL(casedetailnoList), xgetCValueCasedetailno(), "CASEDETAILNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEDETAILNO: {NotNull, bigint(19)}
     * @param casedetailnoList The collection of casedetailno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasedetailno_NotInScope(Collection<Long> casedetailnoList) {
        doSetCasedetailno_NotInScope(casedetailnoList);
    }

    protected void doSetCasedetailno_NotInScope(Collection<Long> casedetailnoList) {
        regINS(CK_NINS, cTL(casedetailnoList), xgetCValueCasedetailno(), "CASEDETAILNO");
    }

    protected void regCasedetailno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasedetailno(), "CASEDETAILNO"); }
    protected abstract ConditionValue xgetCValueCasedetailno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {IX+, NotNull, bigint(19)}
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
     * TRSYMBOL_ID: {IX+, NotNull, bigint(19)}
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
     * TRSYMBOL_ID: {IX+, NotNull, bigint(19)}
     * @param trsymbolId The value of trsymbolId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_GreaterThan(Long trsymbolId) {
        regTrsymbolId(CK_GT, trsymbolId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {IX+, NotNull, bigint(19)}
     * @param trsymbolId The value of trsymbolId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_LessThan(Long trsymbolId) {
        regTrsymbolId(CK_LT, trsymbolId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {IX+, NotNull, bigint(19)}
     * @param trsymbolId The value of trsymbolId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_GreaterEqual(Long trsymbolId) {
        regTrsymbolId(CK_GE, trsymbolId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {IX+, NotNull, bigint(19)}
     * @param trsymbolId The value of trsymbolId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_LessEqual(Long trsymbolId) {
        regTrsymbolId(CK_LE, trsymbolId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {IX+, NotNull, bigint(19)}
     * @param minNumber The min number of trsymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsymbolId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsymbolId(), "TRSYMBOL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOL_ID: {IX+, NotNull, bigint(19)}
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
     * TRSYMBOL_ID: {IX+, NotNull, bigint(19)}
     * @param trsymbolIdList The collection of trsymbolId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymbolId_NotInScope(Collection<Long> trsymbolIdList) {
        doSetTrsymbolId_NotInScope(trsymbolIdList);
    }

    protected void doSetTrsymbolId_NotInScope(Collection<Long> trsymbolIdList) {
        regINS(CK_NINS, cTL(trsymbolIdList), xgetCValueTrsymbolId(), "TRSYMBOL_ID");
    }

    protected void regTrsymbolId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsymbolId(), "TRSYMBOL_ID"); }
    protected abstract ConditionValue xgetCValueTrsymbolId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {NotNull, datetime2(26, 6)}
     * @param createdatetime The value of createdatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedatetime_Equal(java.sql.Timestamp createdatetime) {
        regCreatedatetime(CK_EQ,  createdatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {NotNull, datetime2(26, 6)}
     * @param createdatetime The value of createdatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedatetime_GreaterThan(java.sql.Timestamp createdatetime) {
        regCreatedatetime(CK_GT,  createdatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {NotNull, datetime2(26, 6)}
     * @param createdatetime The value of createdatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedatetime_LessThan(java.sql.Timestamp createdatetime) {
        regCreatedatetime(CK_LT,  createdatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {NotNull, datetime2(26, 6)}
     * @param createdatetime The value of createdatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedatetime_GreaterEqual(java.sql.Timestamp createdatetime) {
        regCreatedatetime(CK_GE,  createdatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {NotNull, datetime2(26, 6)}
     * @param createdatetime The value of createdatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedatetime_LessEqual(java.sql.Timestamp createdatetime) {
        regCreatedatetime(CK_LE, createdatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {NotNull, datetime2(26, 6)}
     * <pre>e.g. setCreatedatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setCreatedatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueCreatedatetime(), "CREATEDATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {NotNull, datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of createdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of createdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setCreatedatetime_DateFromTo(Date fromDate, Date toDate) {
        setCreatedatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    protected void regCreatedatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedatetime(), "CREATEDATETIME"); }
    protected abstract ConditionValue xgetCValueCreatedatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPEDT: {IX+, NotNull, varchar(30)}
     * @param tracetypedt The value of tracetypedt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypedt_Equal(String tracetypedt) {
        doSetTracetypedt_Equal(fRES(tracetypedt));
    }

    protected void doSetTracetypedt_Equal(String tracetypedt) {
        regTracetypedt(CK_EQ, tracetypedt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPEDT: {IX+, NotNull, varchar(30)}
     * @param tracetypedt The value of tracetypedt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypedt_NotEqual(String tracetypedt) {
        doSetTracetypedt_NotEqual(fRES(tracetypedt));
    }

    protected void doSetTracetypedt_NotEqual(String tracetypedt) {
        regTracetypedt(CK_NES, tracetypedt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPEDT: {IX+, NotNull, varchar(30)}
     * @param tracetypedt The value of tracetypedt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypedt_GreaterThan(String tracetypedt) {
        regTracetypedt(CK_GT, fRES(tracetypedt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPEDT: {IX+, NotNull, varchar(30)}
     * @param tracetypedt The value of tracetypedt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypedt_LessThan(String tracetypedt) {
        regTracetypedt(CK_LT, fRES(tracetypedt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPEDT: {IX+, NotNull, varchar(30)}
     * @param tracetypedt The value of tracetypedt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypedt_GreaterEqual(String tracetypedt) {
        regTracetypedt(CK_GE, fRES(tracetypedt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPEDT: {IX+, NotNull, varchar(30)}
     * @param tracetypedt The value of tracetypedt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypedt_LessEqual(String tracetypedt) {
        regTracetypedt(CK_LE, fRES(tracetypedt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACETYPEDT: {IX+, NotNull, varchar(30)}
     * @param tracetypedtList The collection of tracetypedt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypedt_InScope(Collection<String> tracetypedtList) {
        doSetTracetypedt_InScope(tracetypedtList);
    }

    protected void doSetTracetypedt_InScope(Collection<String> tracetypedtList) {
        regINS(CK_INS, cTL(tracetypedtList), xgetCValueTracetypedt(), "TRACETYPEDT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACETYPEDT: {IX+, NotNull, varchar(30)}
     * @param tracetypedtList The collection of tracetypedt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypedt_NotInScope(Collection<String> tracetypedtList) {
        doSetTracetypedt_NotInScope(tracetypedtList);
    }

    protected void doSetTracetypedt_NotInScope(Collection<String> tracetypedtList) {
        regINS(CK_NINS, cTL(tracetypedtList), xgetCValueTracetypedt(), "TRACETYPEDT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPEDT: {IX+, NotNull, varchar(30)} <br>
     * <pre>e.g. setTracetypedt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tracetypedt The value of tracetypedt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTracetypedt_LikeSearch(String tracetypedt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tracetypedt), xgetCValueTracetypedt(), "TRACETYPEDT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPEDT: {IX+, NotNull, varchar(30)}
     * @param tracetypedt The value of tracetypedt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTracetypedt_NotLikeSearch(String tracetypedt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tracetypedt), xgetCValueTracetypedt(), "TRACETYPEDT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPEDT: {IX+, NotNull, varchar(30)}
     * @param tracetypedt The value of tracetypedt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypedt_PrefixSearch(String tracetypedt) {
        setTracetypedt_LikeSearch(tracetypedt, xcLSOPPre());
    }

    protected void regTracetypedt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTracetypedt(), "TRACETYPEDT"); }
    protected abstract ConditionValue xgetCValueTracetypedt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param operationnum The value of operationnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperationnum_Equal(Long operationnum) {
        doSetOperationnum_Equal(operationnum);
    }

    protected void doSetOperationnum_Equal(Long operationnum) {
        regOperationnum(CK_EQ, operationnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param operationnum The value of operationnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperationnum_NotEqual(Long operationnum) {
        doSetOperationnum_NotEqual(operationnum);
    }

    protected void doSetOperationnum_NotEqual(Long operationnum) {
        regOperationnum(CK_NES, operationnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param operationnum The value of operationnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperationnum_GreaterThan(Long operationnum) {
        regOperationnum(CK_GT, operationnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param operationnum The value of operationnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperationnum_LessThan(Long operationnum) {
        regOperationnum(CK_LT, operationnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param operationnum The value of operationnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperationnum_GreaterEqual(Long operationnum) {
        regOperationnum(CK_GE, operationnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param operationnum The value of operationnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperationnum_LessEqual(Long operationnum) {
        regOperationnum(CK_LE, operationnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param minNumber The min number of operationnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of operationnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOperationnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOperationnum(), "OPERATIONNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param operationnumList The collection of operationnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationnum_InScope(Collection<Long> operationnumList) {
        doSetOperationnum_InScope(operationnumList);
    }

    protected void doSetOperationnum_InScope(Collection<Long> operationnumList) {
        regINS(CK_INS, cTL(operationnumList), xgetCValueOperationnum(), "OPERATIONNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param operationnumList The collection of operationnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationnum_NotInScope(Collection<Long> operationnumList) {
        doSetOperationnum_NotInScope(operationnumList);
    }

    protected void doSetOperationnum_NotInScope(Collection<Long> operationnumList) {
        regINS(CK_NINS, cTL(operationnumList), xgetCValueOperationnum(), "OPERATIONNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     */
    public void setOperationnum_IsNull() { regOperationnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     */
    public void setOperationnum_IsNotNull() { regOperationnum(CK_ISNN, DOBJ); }

    protected void regOperationnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOperationnum(), "OPERATIONNUM"); }
    protected abstract ConditionValue xgetCValueOperationnum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTINITNUM: {bigint(19)}
     * @param assortinitnum The value of assortinitnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortinitnum_Equal(Long assortinitnum) {
        doSetAssortinitnum_Equal(assortinitnum);
    }

    protected void doSetAssortinitnum_Equal(Long assortinitnum) {
        regAssortinitnum(CK_EQ, assortinitnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTINITNUM: {bigint(19)}
     * @param assortinitnum The value of assortinitnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortinitnum_NotEqual(Long assortinitnum) {
        doSetAssortinitnum_NotEqual(assortinitnum);
    }

    protected void doSetAssortinitnum_NotEqual(Long assortinitnum) {
        regAssortinitnum(CK_NES, assortinitnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTINITNUM: {bigint(19)}
     * @param assortinitnum The value of assortinitnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortinitnum_GreaterThan(Long assortinitnum) {
        regAssortinitnum(CK_GT, assortinitnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTINITNUM: {bigint(19)}
     * @param assortinitnum The value of assortinitnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortinitnum_LessThan(Long assortinitnum) {
        regAssortinitnum(CK_LT, assortinitnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTINITNUM: {bigint(19)}
     * @param assortinitnum The value of assortinitnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortinitnum_GreaterEqual(Long assortinitnum) {
        regAssortinitnum(CK_GE, assortinitnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTINITNUM: {bigint(19)}
     * @param assortinitnum The value of assortinitnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortinitnum_LessEqual(Long assortinitnum) {
        regAssortinitnum(CK_LE, assortinitnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTINITNUM: {bigint(19)}
     * @param minNumber The min number of assortinitnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of assortinitnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAssortinitnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAssortinitnum(), "ASSORTINITNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTINITNUM: {bigint(19)}
     * @param assortinitnumList The collection of assortinitnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortinitnum_InScope(Collection<Long> assortinitnumList) {
        doSetAssortinitnum_InScope(assortinitnumList);
    }

    protected void doSetAssortinitnum_InScope(Collection<Long> assortinitnumList) {
        regINS(CK_INS, cTL(assortinitnumList), xgetCValueAssortinitnum(), "ASSORTINITNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTINITNUM: {bigint(19)}
     * @param assortinitnumList The collection of assortinitnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortinitnum_NotInScope(Collection<Long> assortinitnumList) {
        doSetAssortinitnum_NotInScope(assortinitnumList);
    }

    protected void doSetAssortinitnum_NotInScope(Collection<Long> assortinitnumList) {
        regINS(CK_NINS, cTL(assortinitnumList), xgetCValueAssortinitnum(), "ASSORTINITNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTINITNUM: {bigint(19)}
     */
    public void setAssortinitnum_IsNull() { regAssortinitnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTINITNUM: {bigint(19)}
     */
    public void setAssortinitnum_IsNotNull() { regAssortinitnum(CK_ISNN, DOBJ); }

    protected void regAssortinitnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortinitnum(), "ASSORTINITNUM"); }
    protected abstract ConditionValue xgetCValueAssortinitnum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_Equal(Long assortnum) {
        doSetAssortnum_Equal(assortnum);
    }

    protected void doSetAssortnum_Equal(Long assortnum) {
        regAssortnum(CK_EQ, assortnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_NotEqual(Long assortnum) {
        doSetAssortnum_NotEqual(assortnum);
    }

    protected void doSetAssortnum_NotEqual(Long assortnum) {
        regAssortnum(CK_NES, assortnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_GreaterThan(Long assortnum) {
        regAssortnum(CK_GT, assortnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_LessThan(Long assortnum) {
        regAssortnum(CK_LT, assortnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_GreaterEqual(Long assortnum) {
        regAssortnum(CK_GE, assortnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_LessEqual(Long assortnum) {
        regAssortnum(CK_LE, assortnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param minNumber The min number of assortnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of assortnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAssortnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAssortnum(), "ASSORTNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnumList The collection of assortnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_InScope(Collection<Long> assortnumList) {
        doSetAssortnum_InScope(assortnumList);
    }

    protected void doSetAssortnum_InScope(Collection<Long> assortnumList) {
        regINS(CK_INS, cTL(assortnumList), xgetCValueAssortnum(), "ASSORTNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnumList The collection of assortnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_NotInScope(Collection<Long> assortnumList) {
        doSetAssortnum_NotInScope(assortnumList);
    }

    protected void doSetAssortnum_NotInScope(Collection<Long> assortnumList) {
        regINS(CK_NINS, cTL(assortnumList), xgetCValueAssortnum(), "ASSORTNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     */
    public void setAssortnum_IsNull() { regAssortnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     */
    public void setAssortnum_IsNotNull() { regAssortnum(CK_ISNN, DOBJ); }

    protected void regAssortnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortnum(), "ASSORTNUM"); }
    protected abstract ConditionValue xgetCValueAssortnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDCD: {varchar(30)}
     * @param assortedcd The value of assortedcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedcd_Equal(String assortedcd) {
        doSetAssortedcd_Equal(fRES(assortedcd));
    }

    protected void doSetAssortedcd_Equal(String assortedcd) {
        regAssortedcd(CK_EQ, assortedcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDCD: {varchar(30)}
     * @param assortedcd The value of assortedcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedcd_NotEqual(String assortedcd) {
        doSetAssortedcd_NotEqual(fRES(assortedcd));
    }

    protected void doSetAssortedcd_NotEqual(String assortedcd) {
        regAssortedcd(CK_NES, assortedcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDCD: {varchar(30)}
     * @param assortedcd The value of assortedcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedcd_GreaterThan(String assortedcd) {
        regAssortedcd(CK_GT, fRES(assortedcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDCD: {varchar(30)}
     * @param assortedcd The value of assortedcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedcd_LessThan(String assortedcd) {
        regAssortedcd(CK_LT, fRES(assortedcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDCD: {varchar(30)}
     * @param assortedcd The value of assortedcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedcd_GreaterEqual(String assortedcd) {
        regAssortedcd(CK_GE, fRES(assortedcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDCD: {varchar(30)}
     * @param assortedcd The value of assortedcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedcd_LessEqual(String assortedcd) {
        regAssortedcd(CK_LE, fRES(assortedcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTEDCD: {varchar(30)}
     * @param assortedcdList The collection of assortedcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedcd_InScope(Collection<String> assortedcdList) {
        doSetAssortedcd_InScope(assortedcdList);
    }

    protected void doSetAssortedcd_InScope(Collection<String> assortedcdList) {
        regINS(CK_INS, cTL(assortedcdList), xgetCValueAssortedcd(), "ASSORTEDCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTEDCD: {varchar(30)}
     * @param assortedcdList The collection of assortedcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedcd_NotInScope(Collection<String> assortedcdList) {
        doSetAssortedcd_NotInScope(assortedcdList);
    }

    protected void doSetAssortedcd_NotInScope(Collection<String> assortedcdList) {
        regINS(CK_NINS, cTL(assortedcdList), xgetCValueAssortedcd(), "ASSORTEDCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDCD: {varchar(30)} <br>
     * <pre>e.g. setAssortedcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortedcd The value of assortedcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortedcd_LikeSearch(String assortedcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortedcd), xgetCValueAssortedcd(), "ASSORTEDCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDCD: {varchar(30)}
     * @param assortedcd The value of assortedcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortedcd_NotLikeSearch(String assortedcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortedcd), xgetCValueAssortedcd(), "ASSORTEDCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDCD: {varchar(30)}
     * @param assortedcd The value of assortedcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedcd_PrefixSearch(String assortedcd) {
        setAssortedcd_LikeSearch(assortedcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTEDCD: {varchar(30)}
     */
    public void setAssortedcd_IsNull() { regAssortedcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORTEDCD: {varchar(30)}
     */
    public void setAssortedcd_IsNullOrEmpty() { regAssortedcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTEDCD: {varchar(30)}
     */
    public void setAssortedcd_IsNotNull() { regAssortedcd(CK_ISNN, DOBJ); }

    protected void regAssortedcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortedcd(), "ASSORTEDCD"); }
    protected abstract ConditionValue xgetCValueAssortedcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_Equal(String assortedunit) {
        doSetAssortedunit_Equal(fRES(assortedunit));
    }

    protected void doSetAssortedunit_Equal(String assortedunit) {
        regAssortedunit(CK_EQ, assortedunit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_NotEqual(String assortedunit) {
        doSetAssortedunit_NotEqual(fRES(assortedunit));
    }

    protected void doSetAssortedunit_NotEqual(String assortedunit) {
        regAssortedunit(CK_NES, assortedunit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_GreaterThan(String assortedunit) {
        regAssortedunit(CK_GT, fRES(assortedunit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_LessThan(String assortedunit) {
        regAssortedunit(CK_LT, fRES(assortedunit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_GreaterEqual(String assortedunit) {
        regAssortedunit(CK_GE, fRES(assortedunit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_LessEqual(String assortedunit) {
        regAssortedunit(CK_LE, fRES(assortedunit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunitList The collection of assortedunit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_InScope(Collection<String> assortedunitList) {
        doSetAssortedunit_InScope(assortedunitList);
    }

    protected void doSetAssortedunit_InScope(Collection<String> assortedunitList) {
        regINS(CK_INS, cTL(assortedunitList), xgetCValueAssortedunit(), "ASSORTEDUNIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunitList The collection of assortedunit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_NotInScope(Collection<String> assortedunitList) {
        doSetAssortedunit_NotInScope(assortedunitList);
    }

    protected void doSetAssortedunit_NotInScope(Collection<String> assortedunitList) {
        regINS(CK_NINS, cTL(assortedunitList), xgetCValueAssortedunit(), "ASSORTEDUNIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)} <br>
     * <pre>e.g. setAssortedunit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortedunit The value of assortedunit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortedunit_LikeSearch(String assortedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortedunit), xgetCValueAssortedunit(), "ASSORTEDUNIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortedunit_NotLikeSearch(String assortedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortedunit), xgetCValueAssortedunit(), "ASSORTEDUNIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_PrefixSearch(String assortedunit) {
        setAssortedunit_LikeSearch(assortedunit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     */
    public void setAssortedunit_IsNull() { regAssortedunit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     */
    public void setAssortedunit_IsNullOrEmpty() { regAssortedunit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     */
    public void setAssortedunit_IsNotNull() { regAssortedunit(CK_ISNN, DOBJ); }

    protected void regAssortedunit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortedunit(), "ASSORTEDUNIT"); }
    protected abstract ConditionValue xgetCValueAssortedunit();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param assortedindex The value of assortedindex as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_Equal(Long assortedindex) {
        doSetAssortedindex_Equal(assortedindex);
    }

    protected void doSetAssortedindex_Equal(Long assortedindex) {
        regAssortedindex(CK_EQ, assortedindex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param assortedindex The value of assortedindex as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_NotEqual(Long assortedindex) {
        doSetAssortedindex_NotEqual(assortedindex);
    }

    protected void doSetAssortedindex_NotEqual(Long assortedindex) {
        regAssortedindex(CK_NES, assortedindex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param assortedindex The value of assortedindex as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_GreaterThan(Long assortedindex) {
        regAssortedindex(CK_GT, assortedindex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param assortedindex The value of assortedindex as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_LessThan(Long assortedindex) {
        regAssortedindex(CK_LT, assortedindex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param assortedindex The value of assortedindex as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_GreaterEqual(Long assortedindex) {
        regAssortedindex(CK_GE, assortedindex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param assortedindex The value of assortedindex as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedindex_LessEqual(Long assortedindex) {
        regAssortedindex(CK_LE, assortedindex);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param minNumber The min number of assortedindex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of assortedindex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAssortedindex_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAssortedindex(), "ASSORTEDINDEX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param assortedindexList The collection of assortedindex as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_InScope(Collection<Long> assortedindexList) {
        doSetAssortedindex_InScope(assortedindexList);
    }

    protected void doSetAssortedindex_InScope(Collection<Long> assortedindexList) {
        regINS(CK_INS, cTL(assortedindexList), xgetCValueAssortedindex(), "ASSORTEDINDEX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @param assortedindexList The collection of assortedindex as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_NotInScope(Collection<Long> assortedindexList) {
        doSetAssortedindex_NotInScope(assortedindexList);
    }

    protected void doSetAssortedindex_NotInScope(Collection<Long> assortedindexList) {
        regINS(CK_NINS, cTL(assortedindexList), xgetCValueAssortedindex(), "ASSORTEDINDEX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     */
    public void setAssortedindex_IsNull() { regAssortedindex(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {bigint(19)}
     */
    public void setAssortedindex_IsNotNull() { regAssortedindex(CK_ISNN, DOBJ); }

    protected void regAssortedindex(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortedindex(), "ASSORTEDINDEX"); }
    protected abstract ConditionValue xgetCValueAssortedindex();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param assortdifnum The value of assortdifnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortdifnum_Equal(Long assortdifnum) {
        doSetAssortdifnum_Equal(assortdifnum);
    }

    protected void doSetAssortdifnum_Equal(Long assortdifnum) {
        regAssortdifnum(CK_EQ, assortdifnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param assortdifnum The value of assortdifnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortdifnum_NotEqual(Long assortdifnum) {
        doSetAssortdifnum_NotEqual(assortdifnum);
    }

    protected void doSetAssortdifnum_NotEqual(Long assortdifnum) {
        regAssortdifnum(CK_NES, assortdifnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param assortdifnum The value of assortdifnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortdifnum_GreaterThan(Long assortdifnum) {
        regAssortdifnum(CK_GT, assortdifnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param assortdifnum The value of assortdifnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortdifnum_LessThan(Long assortdifnum) {
        regAssortdifnum(CK_LT, assortdifnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param assortdifnum The value of assortdifnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortdifnum_GreaterEqual(Long assortdifnum) {
        regAssortdifnum(CK_GE, assortdifnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param assortdifnum The value of assortdifnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortdifnum_LessEqual(Long assortdifnum) {
        regAssortdifnum(CK_LE, assortdifnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param minNumber The min number of assortdifnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of assortdifnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAssortdifnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAssortdifnum(), "ASSORTDIFNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param assortdifnumList The collection of assortdifnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_InScope(Collection<Long> assortdifnumList) {
        doSetAssortdifnum_InScope(assortdifnumList);
    }

    protected void doSetAssortdifnum_InScope(Collection<Long> assortdifnumList) {
        regINS(CK_INS, cTL(assortdifnumList), xgetCValueAssortdifnum(), "ASSORTDIFNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @param assortdifnumList The collection of assortdifnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_NotInScope(Collection<Long> assortdifnumList) {
        doSetAssortdifnum_NotInScope(assortdifnumList);
    }

    protected void doSetAssortdifnum_NotInScope(Collection<Long> assortdifnumList) {
        regINS(CK_NINS, cTL(assortdifnumList), xgetCValueAssortdifnum(), "ASSORTDIFNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     */
    public void setAssortdifnum_IsNull() { regAssortdifnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {bigint(19)}
     */
    public void setAssortdifnum_IsNotNull() { regAssortdifnum(CK_ISNN, DOBJ); }

    protected void regAssortdifnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortdifnum(), "ASSORTDIFNUM"); }
    protected abstract ConditionValue xgetCValueAssortdifnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_Equal(String directioncd) {
        doSetDirectioncd_Equal(fRES(directioncd));
    }

    protected void doSetDirectioncd_Equal(String directioncd) {
        regDirectioncd(CK_EQ, directioncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_NotEqual(String directioncd) {
        doSetDirectioncd_NotEqual(fRES(directioncd));
    }

    protected void doSetDirectioncd_NotEqual(String directioncd) {
        regDirectioncd(CK_NES, directioncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_GreaterThan(String directioncd) {
        regDirectioncd(CK_GT, fRES(directioncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_LessThan(String directioncd) {
        regDirectioncd(CK_LT, fRES(directioncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_GreaterEqual(String directioncd) {
        regDirectioncd(CK_GE, fRES(directioncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_LessEqual(String directioncd) {
        regDirectioncd(CK_LE, fRES(directioncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncdList The collection of directioncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_InScope(Collection<String> directioncdList) {
        doSetDirectioncd_InScope(directioncdList);
    }

    protected void doSetDirectioncd_InScope(Collection<String> directioncdList) {
        regINS(CK_INS, cTL(directioncdList), xgetCValueDirectioncd(), "DIRECTIONCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncdList The collection of directioncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_NotInScope(Collection<String> directioncdList) {
        doSetDirectioncd_NotInScope(directioncdList);
    }

    protected void doSetDirectioncd_NotInScope(Collection<String> directioncdList) {
        regINS(CK_NINS, cTL(directioncdList), xgetCValueDirectioncd(), "DIRECTIONCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(30)} <br>
     * <pre>e.g. setDirectioncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directioncd The value of directioncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectioncd_LikeSearch(String directioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directioncd), xgetCValueDirectioncd(), "DIRECTIONCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectioncd_NotLikeSearch(String directioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directioncd), xgetCValueDirectioncd(), "DIRECTIONCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_PrefixSearch(String directioncd) {
        setDirectioncd_LikeSearch(directioncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     */
    public void setDirectioncd_IsNull() { regDirectioncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     */
    public void setDirectioncd_IsNullOrEmpty() { regDirectioncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     */
    public void setDirectioncd_IsNotNull() { regDirectioncd(CK_ISNN, DOBJ); }

    protected void regDirectioncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectioncd(), "DIRECTIONCD"); }
    protected abstract ConditionValue xgetCValueDirectioncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_Equal(String pistontype) {
        doSetPistontype_Equal(fRES(pistontype));
    }

    protected void doSetPistontype_Equal(String pistontype) {
        regPistontype(CK_EQ, pistontype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_NotEqual(String pistontype) {
        doSetPistontype_NotEqual(fRES(pistontype));
    }

    protected void doSetPistontype_NotEqual(String pistontype) {
        regPistontype(CK_NES, pistontype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_GreaterThan(String pistontype) {
        regPistontype(CK_GT, fRES(pistontype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_LessThan(String pistontype) {
        regPistontype(CK_LT, fRES(pistontype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_GreaterEqual(String pistontype) {
        regPistontype(CK_GE, fRES(pistontype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_LessEqual(String pistontype) {
        regPistontype(CK_LE, fRES(pistontype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontypeList The collection of pistontype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_InScope(Collection<String> pistontypeList) {
        doSetPistontype_InScope(pistontypeList);
    }

    protected void doSetPistontype_InScope(Collection<String> pistontypeList) {
        regINS(CK_INS, cTL(pistontypeList), xgetCValuePistontype(), "PISTONTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontypeList The collection of pistontype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_NotInScope(Collection<String> pistontypeList) {
        doSetPistontype_NotInScope(pistontypeList);
    }

    protected void doSetPistontype_NotInScope(Collection<String> pistontypeList) {
        regINS(CK_NINS, cTL(pistontypeList), xgetCValuePistontype(), "PISTONTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {char(1)} <br>
     * <pre>e.g. setPistontype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pistontype The value of pistontype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPistontype_LikeSearch(String pistontype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pistontype), xgetCValuePistontype(), "PISTONTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPistontype_NotLikeSearch(String pistontype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pistontype), xgetCValuePistontype(), "PISTONTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_PrefixSearch(String pistontype) {
        setPistontype_LikeSearch(pistontype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     */
    public void setPistontype_IsNull() { regPistontype(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     */
    public void setPistontype_IsNotNull() { regPistontype(CK_ISNN, DOBJ); }

    protected void regPistontype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePistontype(), "PISTONTYPE"); }
    protected abstract ConditionValue xgetCValuePistontype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_Equal(Long directionnum) {
        doSetDirectionnum_Equal(directionnum);
    }

    protected void doSetDirectionnum_Equal(Long directionnum) {
        regDirectionnum(CK_EQ, directionnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_NotEqual(Long directionnum) {
        doSetDirectionnum_NotEqual(directionnum);
    }

    protected void doSetDirectionnum_NotEqual(Long directionnum) {
        regDirectionnum(CK_NES, directionnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_GreaterThan(Long directionnum) {
        regDirectionnum(CK_GT, directionnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_LessThan(Long directionnum) {
        regDirectionnum(CK_LT, directionnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_GreaterEqual(Long directionnum) {
        regDirectionnum(CK_GE, directionnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_LessEqual(Long directionnum) {
        regDirectionnum(CK_LE, directionnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param minNumber The min number of directionnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of directionnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDirectionnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDirectionnum(), "DIRECTIONNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnumList The collection of directionnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_InScope(Collection<Long> directionnumList) {
        doSetDirectionnum_InScope(directionnumList);
    }

    protected void doSetDirectionnum_InScope(Collection<Long> directionnumList) {
        regINS(CK_INS, cTL(directionnumList), xgetCValueDirectionnum(), "DIRECTIONNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnumList The collection of directionnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_NotInScope(Collection<Long> directionnumList) {
        doSetDirectionnum_NotInScope(directionnumList);
    }

    protected void doSetDirectionnum_NotInScope(Collection<Long> directionnumList) {
        regINS(CK_NINS, cTL(directionnumList), xgetCValueDirectionnum(), "DIRECTIONNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     */
    public void setDirectionnum_IsNull() { regDirectionnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     */
    public void setDirectionnum_IsNotNull() { regDirectionnum(CK_ISNN, DOBJ); }

    protected void regDirectionnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectionnum(), "DIRECTIONNUM"); }
    protected abstract ConditionValue xgetCValueDirectionnum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPORDER: {bigint(19)}
     * @param shiporder The value of shiporder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiporder_Equal(Long shiporder) {
        doSetShiporder_Equal(shiporder);
    }

    protected void doSetShiporder_Equal(Long shiporder) {
        regShiporder(CK_EQ, shiporder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPORDER: {bigint(19)}
     * @param shiporder The value of shiporder as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiporder_NotEqual(Long shiporder) {
        doSetShiporder_NotEqual(shiporder);
    }

    protected void doSetShiporder_NotEqual(Long shiporder) {
        regShiporder(CK_NES, shiporder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPORDER: {bigint(19)}
     * @param shiporder The value of shiporder as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiporder_GreaterThan(Long shiporder) {
        regShiporder(CK_GT, shiporder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPORDER: {bigint(19)}
     * @param shiporder The value of shiporder as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiporder_LessThan(Long shiporder) {
        regShiporder(CK_LT, shiporder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPORDER: {bigint(19)}
     * @param shiporder The value of shiporder as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiporder_GreaterEqual(Long shiporder) {
        regShiporder(CK_GE, shiporder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPORDER: {bigint(19)}
     * @param shiporder The value of shiporder as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiporder_LessEqual(Long shiporder) {
        regShiporder(CK_LE, shiporder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPORDER: {bigint(19)}
     * @param minNumber The min number of shiporder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shiporder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShiporder_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShiporder(), "SHIPORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPORDER: {bigint(19)}
     * @param shiporderList The collection of shiporder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiporder_InScope(Collection<Long> shiporderList) {
        doSetShiporder_InScope(shiporderList);
    }

    protected void doSetShiporder_InScope(Collection<Long> shiporderList) {
        regINS(CK_INS, cTL(shiporderList), xgetCValueShiporder(), "SHIPORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPORDER: {bigint(19)}
     * @param shiporderList The collection of shiporder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiporder_NotInScope(Collection<Long> shiporderList) {
        doSetShiporder_NotInScope(shiporderList);
    }

    protected void doSetShiporder_NotInScope(Collection<Long> shiporderList) {
        regINS(CK_NINS, cTL(shiporderList), xgetCValueShiporder(), "SHIPORDER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPORDER: {bigint(19)}
     */
    public void setShiporder_IsNull() { regShiporder(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPORDER: {bigint(19)}
     */
    public void setShiporder_IsNotNull() { regShiporder(CK_ISNN, DOBJ); }

    protected void regShiporder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShiporder(), "SHIPORDER"); }
    protected abstract ConditionValue xgetCValueShiporder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {IX+, varchar(30)}
     * @param customercd The value of customercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_Equal(String customercd) {
        doSetCustomercd_Equal(fRES(customercd));
    }

    protected void doSetCustomercd_Equal(String customercd) {
        regCustomercd(CK_EQ, customercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {IX+, varchar(30)}
     * @param customercd The value of customercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_NotEqual(String customercd) {
        doSetCustomercd_NotEqual(fRES(customercd));
    }

    protected void doSetCustomercd_NotEqual(String customercd) {
        regCustomercd(CK_NES, customercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {IX+, varchar(30)}
     * @param customercd The value of customercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_GreaterThan(String customercd) {
        regCustomercd(CK_GT, fRES(customercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {IX+, varchar(30)}
     * @param customercd The value of customercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_LessThan(String customercd) {
        regCustomercd(CK_LT, fRES(customercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {IX+, varchar(30)}
     * @param customercd The value of customercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_GreaterEqual(String customercd) {
        regCustomercd(CK_GE, fRES(customercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {IX+, varchar(30)}
     * @param customercd The value of customercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_LessEqual(String customercd) {
        regCustomercd(CK_LE, fRES(customercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {IX+, varchar(30)}
     * @param customercdList The collection of customercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_InScope(Collection<String> customercdList) {
        doSetCustomercd_InScope(customercdList);
    }

    protected void doSetCustomercd_InScope(Collection<String> customercdList) {
        regINS(CK_INS, cTL(customercdList), xgetCValueCustomercd(), "CUSTOMERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {IX+, varchar(30)}
     * @param customercdList The collection of customercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_NotInScope(Collection<String> customercdList) {
        doSetCustomercd_NotInScope(customercdList);
    }

    protected void doSetCustomercd_NotInScope(Collection<String> customercdList) {
        regINS(CK_NINS, cTL(customercdList), xgetCValueCustomercd(), "CUSTOMERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {IX+, varchar(30)} <br>
     * <pre>e.g. setCustomercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customercd The value of customercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomercd_LikeSearch(String customercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customercd), xgetCValueCustomercd(), "CUSTOMERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {IX+, varchar(30)}
     * @param customercd The value of customercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomercd_NotLikeSearch(String customercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customercd), xgetCValueCustomercd(), "CUSTOMERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {IX+, varchar(30)}
     * @param customercd The value of customercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_PrefixSearch(String customercd) {
        setCustomercd_LikeSearch(customercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {IX+, varchar(30)}
     */
    public void setCustomercd_IsNull() { regCustomercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {IX+, varchar(30)}
     */
    public void setCustomercd_IsNullOrEmpty() { regCustomercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {IX+, varchar(30)}
     */
    public void setCustomercd_IsNotNull() { regCustomercd(CK_ISNN, DOBJ); }

    protected void regCustomercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomercd(), "CUSTOMERCD"); }
    protected abstract ConditionValue xgetCValueCustomercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserial The value of caseserial as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_Equal(String caseserial) {
        doSetCaseserial_Equal(fRES(caseserial));
    }

    protected void doSetCaseserial_Equal(String caseserial) {
        regCaseserial(CK_EQ, caseserial);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserial The value of caseserial as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_NotEqual(String caseserial) {
        doSetCaseserial_NotEqual(fRES(caseserial));
    }

    protected void doSetCaseserial_NotEqual(String caseserial) {
        regCaseserial(CK_NES, caseserial);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserial The value of caseserial as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_GreaterThan(String caseserial) {
        regCaseserial(CK_GT, fRES(caseserial));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserial The value of caseserial as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_LessThan(String caseserial) {
        regCaseserial(CK_LT, fRES(caseserial));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserial The value of caseserial as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_GreaterEqual(String caseserial) {
        regCaseserial(CK_GE, fRES(caseserial));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserial The value of caseserial as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_LessEqual(String caseserial) {
        regCaseserial(CK_LE, fRES(caseserial));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserialList The collection of caseserial as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_InScope(Collection<String> caseserialList) {
        doSetCaseserial_InScope(caseserialList);
    }

    protected void doSetCaseserial_InScope(Collection<String> caseserialList) {
        regINS(CK_INS, cTL(caseserialList), xgetCValueCaseserial(), "CASESERIAL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserialList The collection of caseserial as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_NotInScope(Collection<String> caseserialList) {
        doSetCaseserial_NotInScope(caseserialList);
    }

    protected void doSetCaseserial_NotInScope(Collection<String> caseserialList) {
        regINS(CK_NINS, cTL(caseserialList), xgetCValueCaseserial(), "CASESERIAL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASESERIAL: {varchar(30)} <br>
     * <pre>e.g. setCaseserial_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseserial The value of caseserial as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseserial_LikeSearch(String caseserial, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseserial), xgetCValueCaseserial(), "CASESERIAL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserial The value of caseserial as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseserial_NotLikeSearch(String caseserial, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseserial), xgetCValueCaseserial(), "CASESERIAL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserial The value of caseserial as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_PrefixSearch(String caseserial) {
        setCaseserial_LikeSearch(caseserial, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     */
    public void setCaseserial_IsNull() { regCaseserial(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     */
    public void setCaseserial_IsNullOrEmpty() { regCaseserial(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     */
    public void setCaseserial_IsNotNull() { regCaseserial(CK_ISNN, DOBJ); }

    protected void regCaseserial(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseserial(), "CASESERIAL"); }
    protected abstract ConditionValue xgetCValueCaseserial();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_Equal(String distwarehousecd) {
        doSetDistwarehousecd_Equal(fRES(distwarehousecd));
    }

    protected void doSetDistwarehousecd_Equal(String distwarehousecd) {
        regDistwarehousecd(CK_EQ, distwarehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_NotEqual(String distwarehousecd) {
        doSetDistwarehousecd_NotEqual(fRES(distwarehousecd));
    }

    protected void doSetDistwarehousecd_NotEqual(String distwarehousecd) {
        regDistwarehousecd(CK_NES, distwarehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_GreaterThan(String distwarehousecd) {
        regDistwarehousecd(CK_GT, fRES(distwarehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_LessThan(String distwarehousecd) {
        regDistwarehousecd(CK_LT, fRES(distwarehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_GreaterEqual(String distwarehousecd) {
        regDistwarehousecd(CK_GE, fRES(distwarehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_LessEqual(String distwarehousecd) {
        regDistwarehousecd(CK_LE, fRES(distwarehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecdList The collection of distwarehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_InScope(Collection<String> distwarehousecdList) {
        doSetDistwarehousecd_InScope(distwarehousecdList);
    }

    protected void doSetDistwarehousecd_InScope(Collection<String> distwarehousecdList) {
        regINS(CK_INS, cTL(distwarehousecdList), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecdList The collection of distwarehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_NotInScope(Collection<String> distwarehousecdList) {
        doSetDistwarehousecd_NotInScope(distwarehousecdList);
    }

    protected void doSetDistwarehousecd_NotInScope(Collection<String> distwarehousecdList) {
        regINS(CK_NINS, cTL(distwarehousecdList), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)} <br>
     * <pre>e.g. setDistwarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param distwarehousecd The value of distwarehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDistwarehousecd_LikeSearch(String distwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(distwarehousecd), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDistwarehousecd_NotLikeSearch(String distwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(distwarehousecd), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_PrefixSearch(String distwarehousecd) {
        setDistwarehousecd_LikeSearch(distwarehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     */
    public void setDistwarehousecd_IsNull() { regDistwarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     */
    public void setDistwarehousecd_IsNullOrEmpty() { regDistwarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     */
    public void setDistwarehousecd_IsNotNull() { regDistwarehousecd(CK_ISNN, DOBJ); }

    protected void regDistwarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistwarehousecd(), "DISTWAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueDistwarehousecd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param sendsts The value of sendsts as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendsts_Equal(java.math.BigDecimal sendsts) {
        doSetSendsts_Equal(sendsts);
    }

    protected void doSetSendsts_Equal(java.math.BigDecimal sendsts) {
        regSendsts(CK_EQ, sendsts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param sendsts The value of sendsts as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendsts_NotEqual(java.math.BigDecimal sendsts) {
        doSetSendsts_NotEqual(sendsts);
    }

    protected void doSetSendsts_NotEqual(java.math.BigDecimal sendsts) {
        regSendsts(CK_NES, sendsts);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param sendsts The value of sendsts as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendsts_GreaterThan(java.math.BigDecimal sendsts) {
        regSendsts(CK_GT, sendsts);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param sendsts The value of sendsts as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendsts_LessThan(java.math.BigDecimal sendsts) {
        regSendsts(CK_LT, sendsts);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param sendsts The value of sendsts as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendsts_GreaterEqual(java.math.BigDecimal sendsts) {
        regSendsts(CK_GE, sendsts);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param sendsts The value of sendsts as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendsts_LessEqual(java.math.BigDecimal sendsts) {
        regSendsts(CK_LE, sendsts);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of sendsts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sendsts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSendsts_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSendsts(), "SENDSTS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param sendstsList The collection of sendsts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendsts_InScope(Collection<java.math.BigDecimal> sendstsList) {
        doSetSendsts_InScope(sendstsList);
    }

    protected void doSetSendsts_InScope(Collection<java.math.BigDecimal> sendstsList) {
        regINS(CK_INS, cTL(sendstsList), xgetCValueSendsts(), "SENDSTS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param sendstsList The collection of sendsts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendsts_NotInScope(Collection<java.math.BigDecimal> sendstsList) {
        doSetSendsts_NotInScope(sendstsList);
    }

    protected void doSetSendsts_NotInScope(Collection<java.math.BigDecimal> sendstsList) {
        regINS(CK_NINS, cTL(sendstsList), xgetCValueSendsts(), "SENDSTS");
    }

    protected void regSendsts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendsts(), "SENDSTS"); }
    protected abstract ConditionValue xgetCValueSendsts();

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
    public HpSLCFunction<TTrcasedetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrcasedetailCB.class);
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
    public HpSLCFunction<TTrcasedetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrcasedetailCB.class);
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
    public HpSLCFunction<TTrcasedetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrcasedetailCB.class);
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
    public HpSLCFunction<TTrcasedetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrcasedetailCB.class);
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
    public HpSLCFunction<TTrcasedetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrcasedetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrcasedetailCB&gt;() {
     *     public void query(TTrcasedetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrcasedetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrcasedetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcasedetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrcasedetailCQ sq);

    protected TTrcasedetailCB xcreateScalarConditionCB() {
        TTrcasedetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrcasedetailCB xcreateScalarConditionPartitionByCB() {
        TTrcasedetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrcasedetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcasedetailCB cb = new TTrcasedetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRCASEDETAIL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrcasedetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrcasedetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrcasedetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcasedetailCB cb = new TTrcasedetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRCASEDETAIL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrcasedetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrcasedetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrcasedetailCB cb = new TTrcasedetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrcasedetailCQ sq);

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
    protected TTrcasedetailCB newMyCB() {
        return new TTrcasedetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrcasedetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
