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
 * The abstract condition-query of T_TREXAMRSLTDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrexamrsltdetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrexamrsltdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TREXAMRSLTDETAIL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trexamrsltdetailId The value of trexamrsltdetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamrsltdetailId_Equal(Long trexamrsltdetailId) {
        doSetTrexamrsltdetailId_Equal(trexamrsltdetailId);
    }

    protected void doSetTrexamrsltdetailId_Equal(Long trexamrsltdetailId) {
        regTrexamrsltdetailId(CK_EQ, trexamrsltdetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trexamrsltdetailId The value of trexamrsltdetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamrsltdetailId_NotEqual(Long trexamrsltdetailId) {
        doSetTrexamrsltdetailId_NotEqual(trexamrsltdetailId);
    }

    protected void doSetTrexamrsltdetailId_NotEqual(Long trexamrsltdetailId) {
        regTrexamrsltdetailId(CK_NES, trexamrsltdetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trexamrsltdetailId The value of trexamrsltdetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamrsltdetailId_GreaterThan(Long trexamrsltdetailId) {
        regTrexamrsltdetailId(CK_GT, trexamrsltdetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trexamrsltdetailId The value of trexamrsltdetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamrsltdetailId_LessThan(Long trexamrsltdetailId) {
        regTrexamrsltdetailId(CK_LT, trexamrsltdetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trexamrsltdetailId The value of trexamrsltdetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamrsltdetailId_GreaterEqual(Long trexamrsltdetailId) {
        regTrexamrsltdetailId(CK_GE, trexamrsltdetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trexamrsltdetailId The value of trexamrsltdetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamrsltdetailId_LessEqual(Long trexamrsltdetailId) {
        regTrexamrsltdetailId(CK_LE, trexamrsltdetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trexamrsltdetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trexamrsltdetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrexamrsltdetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrexamrsltdetailId(), "TREXAMRSLTDETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trexamrsltdetailIdList The collection of trexamrsltdetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrexamrsltdetailId_InScope(Collection<Long> trexamrsltdetailIdList) {
        doSetTrexamrsltdetailId_InScope(trexamrsltdetailIdList);
    }

    protected void doSetTrexamrsltdetailId_InScope(Collection<Long> trexamrsltdetailIdList) {
        regINS(CK_INS, cTL(trexamrsltdetailIdList), xgetCValueTrexamrsltdetailId(), "TREXAMRSLTDETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trexamrsltdetailIdList The collection of trexamrsltdetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrexamrsltdetailId_NotInScope(Collection<Long> trexamrsltdetailIdList) {
        doSetTrexamrsltdetailId_NotInScope(trexamrsltdetailIdList);
    }

    protected void doSetTrexamrsltdetailId_NotInScope(Collection<Long> trexamrsltdetailIdList) {
        regINS(CK_NINS, cTL(trexamrsltdetailIdList), xgetCValueTrexamrsltdetailId(), "TREXAMRSLTDETAIL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrexamrsltdetailId_IsNull() { regTrexamrsltdetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrexamrsltdetailId_IsNotNull() { regTrexamrsltdetailId(CK_ISNN, DOBJ); }

    protected void regTrexamrsltdetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrexamrsltdetailId(), "TREXAMRSLTDETAIL_ID"); }
    protected abstract ConditionValue xgetCValueTrexamrsltdetailId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {NotNull, bigint(19)}
     * @param trexamresultId The value of trexamresultId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_Equal(Long trexamresultId) {
        doSetTrexamresultId_Equal(trexamresultId);
    }

    protected void doSetTrexamresultId_Equal(Long trexamresultId) {
        regTrexamresultId(CK_EQ, trexamresultId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {NotNull, bigint(19)}
     * @param trexamresultId The value of trexamresultId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_NotEqual(Long trexamresultId) {
        doSetTrexamresultId_NotEqual(trexamresultId);
    }

    protected void doSetTrexamresultId_NotEqual(Long trexamresultId) {
        regTrexamresultId(CK_NES, trexamresultId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {NotNull, bigint(19)}
     * @param trexamresultId The value of trexamresultId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_GreaterThan(Long trexamresultId) {
        regTrexamresultId(CK_GT, trexamresultId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {NotNull, bigint(19)}
     * @param trexamresultId The value of trexamresultId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_LessThan(Long trexamresultId) {
        regTrexamresultId(CK_LT, trexamresultId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {NotNull, bigint(19)}
     * @param trexamresultId The value of trexamresultId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_GreaterEqual(Long trexamresultId) {
        regTrexamresultId(CK_GE, trexamresultId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {NotNull, bigint(19)}
     * @param trexamresultId The value of trexamresultId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_LessEqual(Long trexamresultId) {
        regTrexamresultId(CK_LE, trexamresultId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of trexamresultId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trexamresultId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrexamresultId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrexamresultId(), "TREXAMRESULT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TREXAMRESULT_ID: {NotNull, bigint(19)}
     * @param trexamresultIdList The collection of trexamresultId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrexamresultId_InScope(Collection<Long> trexamresultIdList) {
        doSetTrexamresultId_InScope(trexamresultIdList);
    }

    protected void doSetTrexamresultId_InScope(Collection<Long> trexamresultIdList) {
        regINS(CK_INS, cTL(trexamresultIdList), xgetCValueTrexamresultId(), "TREXAMRESULT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TREXAMRESULT_ID: {NotNull, bigint(19)}
     * @param trexamresultIdList The collection of trexamresultId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrexamresultId_NotInScope(Collection<Long> trexamresultIdList) {
        doSetTrexamresultId_NotInScope(trexamresultIdList);
    }

    protected void doSetTrexamresultId_NotInScope(Collection<Long> trexamresultIdList) {
        regINS(CK_NINS, cTL(trexamresultIdList), xgetCValueTrexamresultId(), "TREXAMRESULT_ID");
    }

    protected void regTrexamresultId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrexamresultId(), "TREXAMRESULT_ID"); }
    protected abstract ConditionValue xgetCValueTrexamresultId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMLINENO: {NotNull, bigint(19)}
     * @param examlineno The value of examlineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamlineno_Equal(Long examlineno) {
        doSetExamlineno_Equal(examlineno);
    }

    protected void doSetExamlineno_Equal(Long examlineno) {
        regExamlineno(CK_EQ, examlineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMLINENO: {NotNull, bigint(19)}
     * @param examlineno The value of examlineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamlineno_NotEqual(Long examlineno) {
        doSetExamlineno_NotEqual(examlineno);
    }

    protected void doSetExamlineno_NotEqual(Long examlineno) {
        regExamlineno(CK_NES, examlineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMLINENO: {NotNull, bigint(19)}
     * @param examlineno The value of examlineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamlineno_GreaterThan(Long examlineno) {
        regExamlineno(CK_GT, examlineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMLINENO: {NotNull, bigint(19)}
     * @param examlineno The value of examlineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamlineno_LessThan(Long examlineno) {
        regExamlineno(CK_LT, examlineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMLINENO: {NotNull, bigint(19)}
     * @param examlineno The value of examlineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamlineno_GreaterEqual(Long examlineno) {
        regExamlineno(CK_GE, examlineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMLINENO: {NotNull, bigint(19)}
     * @param examlineno The value of examlineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamlineno_LessEqual(Long examlineno) {
        regExamlineno(CK_LE, examlineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMLINENO: {NotNull, bigint(19)}
     * @param minNumber The min number of examlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of examlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExamlineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExamlineno(), "EXAMLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXAMLINENO: {NotNull, bigint(19)}
     * @param examlinenoList The collection of examlineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamlineno_InScope(Collection<Long> examlinenoList) {
        doSetExamlineno_InScope(examlinenoList);
    }

    protected void doSetExamlineno_InScope(Collection<Long> examlinenoList) {
        regINS(CK_INS, cTL(examlinenoList), xgetCValueExamlineno(), "EXAMLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXAMLINENO: {NotNull, bigint(19)}
     * @param examlinenoList The collection of examlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamlineno_NotInScope(Collection<Long> examlinenoList) {
        doSetExamlineno_NotInScope(examlinenoList);
    }

    protected void doSetExamlineno_NotInScope(Collection<Long> examlinenoList) {
        regINS(CK_NINS, cTL(examlinenoList), xgetCValueExamlineno(), "EXAMLINENO");
    }

    protected void regExamlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExamlineno(), "EXAMLINENO"); }
    protected abstract ConditionValue xgetCValueExamlineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZAIKOINV_ID: {bigint(19)}
     * @param zaikoinvId The value of zaikoinvId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setZaikoinvId_Equal(Long zaikoinvId) {
        doSetZaikoinvId_Equal(zaikoinvId);
    }

    protected void doSetZaikoinvId_Equal(Long zaikoinvId) {
        regZaikoinvId(CK_EQ, zaikoinvId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZAIKOINV_ID: {bigint(19)}
     * @param zaikoinvId The value of zaikoinvId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZaikoinvId_NotEqual(Long zaikoinvId) {
        doSetZaikoinvId_NotEqual(zaikoinvId);
    }

    protected void doSetZaikoinvId_NotEqual(Long zaikoinvId) {
        regZaikoinvId(CK_NES, zaikoinvId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZAIKOINV_ID: {bigint(19)}
     * @param zaikoinvId The value of zaikoinvId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZaikoinvId_GreaterThan(Long zaikoinvId) {
        regZaikoinvId(CK_GT, zaikoinvId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZAIKOINV_ID: {bigint(19)}
     * @param zaikoinvId The value of zaikoinvId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZaikoinvId_LessThan(Long zaikoinvId) {
        regZaikoinvId(CK_LT, zaikoinvId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZAIKOINV_ID: {bigint(19)}
     * @param zaikoinvId The value of zaikoinvId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZaikoinvId_GreaterEqual(Long zaikoinvId) {
        regZaikoinvId(CK_GE, zaikoinvId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZAIKOINV_ID: {bigint(19)}
     * @param zaikoinvId The value of zaikoinvId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZaikoinvId_LessEqual(Long zaikoinvId) {
        regZaikoinvId(CK_LE, zaikoinvId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ZAIKOINV_ID: {bigint(19)}
     * @param minNumber The min number of zaikoinvId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of zaikoinvId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setZaikoinvId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueZaikoinvId(), "ZAIKOINV_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZAIKOINV_ID: {bigint(19)}
     * @param zaikoinvIdList The collection of zaikoinvId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZaikoinvId_InScope(Collection<Long> zaikoinvIdList) {
        doSetZaikoinvId_InScope(zaikoinvIdList);
    }

    protected void doSetZaikoinvId_InScope(Collection<Long> zaikoinvIdList) {
        regINS(CK_INS, cTL(zaikoinvIdList), xgetCValueZaikoinvId(), "ZAIKOINV_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZAIKOINV_ID: {bigint(19)}
     * @param zaikoinvIdList The collection of zaikoinvId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZaikoinvId_NotInScope(Collection<Long> zaikoinvIdList) {
        doSetZaikoinvId_NotInScope(zaikoinvIdList);
    }

    protected void doSetZaikoinvId_NotInScope(Collection<Long> zaikoinvIdList) {
        regINS(CK_NINS, cTL(zaikoinvIdList), xgetCValueZaikoinvId(), "ZAIKOINV_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZAIKOINV_ID: {bigint(19)}
     */
    public void setZaikoinvId_IsNull() { regZaikoinvId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZAIKOINV_ID: {bigint(19)}
     */
    public void setZaikoinvId_IsNotNull() { regZaikoinvId(CK_ISNN, DOBJ); }

    protected void regZaikoinvId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZaikoinvId(), "ZAIKOINV_ID"); }
    protected abstract ConditionValue xgetCValueZaikoinvId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZAIKOINV: {varchar(30)}
     * @param zaikoinv The value of zaikoinv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZaikoinv_Equal(String zaikoinv) {
        doSetZaikoinv_Equal(fRES(zaikoinv));
    }

    protected void doSetZaikoinv_Equal(String zaikoinv) {
        regZaikoinv(CK_EQ, zaikoinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZAIKOINV: {varchar(30)}
     * @param zaikoinv The value of zaikoinv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZaikoinv_NotEqual(String zaikoinv) {
        doSetZaikoinv_NotEqual(fRES(zaikoinv));
    }

    protected void doSetZaikoinv_NotEqual(String zaikoinv) {
        regZaikoinv(CK_NES, zaikoinv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZAIKOINV: {varchar(30)}
     * @param zaikoinv The value of zaikoinv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZaikoinv_GreaterThan(String zaikoinv) {
        regZaikoinv(CK_GT, fRES(zaikoinv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZAIKOINV: {varchar(30)}
     * @param zaikoinv The value of zaikoinv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZaikoinv_LessThan(String zaikoinv) {
        regZaikoinv(CK_LT, fRES(zaikoinv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZAIKOINV: {varchar(30)}
     * @param zaikoinv The value of zaikoinv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZaikoinv_GreaterEqual(String zaikoinv) {
        regZaikoinv(CK_GE, fRES(zaikoinv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZAIKOINV: {varchar(30)}
     * @param zaikoinv The value of zaikoinv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZaikoinv_LessEqual(String zaikoinv) {
        regZaikoinv(CK_LE, fRES(zaikoinv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZAIKOINV: {varchar(30)}
     * @param zaikoinvList The collection of zaikoinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZaikoinv_InScope(Collection<String> zaikoinvList) {
        doSetZaikoinv_InScope(zaikoinvList);
    }

    protected void doSetZaikoinv_InScope(Collection<String> zaikoinvList) {
        regINS(CK_INS, cTL(zaikoinvList), xgetCValueZaikoinv(), "ZAIKOINV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZAIKOINV: {varchar(30)}
     * @param zaikoinvList The collection of zaikoinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZaikoinv_NotInScope(Collection<String> zaikoinvList) {
        doSetZaikoinv_NotInScope(zaikoinvList);
    }

    protected void doSetZaikoinv_NotInScope(Collection<String> zaikoinvList) {
        regINS(CK_NINS, cTL(zaikoinvList), xgetCValueZaikoinv(), "ZAIKOINV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZAIKOINV: {varchar(30)} <br>
     * <pre>e.g. setZaikoinv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zaikoinv The value of zaikoinv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZaikoinv_LikeSearch(String zaikoinv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zaikoinv), xgetCValueZaikoinv(), "ZAIKOINV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZAIKOINV: {varchar(30)}
     * @param zaikoinv The value of zaikoinv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZaikoinv_NotLikeSearch(String zaikoinv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zaikoinv), xgetCValueZaikoinv(), "ZAIKOINV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZAIKOINV: {varchar(30)}
     * @param zaikoinv The value of zaikoinv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZaikoinv_PrefixSearch(String zaikoinv) {
        setZaikoinv_LikeSearch(zaikoinv, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZAIKOINV: {varchar(30)}
     */
    public void setZaikoinv_IsNull() { regZaikoinv(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZAIKOINV: {varchar(30)}
     */
    public void setZaikoinv_IsNullOrEmpty() { regZaikoinv(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZAIKOINV: {varchar(30)}
     */
    public void setZaikoinv_IsNotNull() { regZaikoinv(CK_ISNN, DOBJ); }

    protected void regZaikoinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZaikoinv(), "ZAIKOINV"); }
    protected abstract ConditionValue xgetCValueZaikoinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMQTY: {NotNull, decimal(16, 6)}
     * @param examqty The value of examqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamqty_Equal(java.math.BigDecimal examqty) {
        doSetExamqty_Equal(examqty);
    }

    protected void doSetExamqty_Equal(java.math.BigDecimal examqty) {
        regExamqty(CK_EQ, examqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMQTY: {NotNull, decimal(16, 6)}
     * @param examqty The value of examqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamqty_NotEqual(java.math.BigDecimal examqty) {
        doSetExamqty_NotEqual(examqty);
    }

    protected void doSetExamqty_NotEqual(java.math.BigDecimal examqty) {
        regExamqty(CK_NES, examqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMQTY: {NotNull, decimal(16, 6)}
     * @param examqty The value of examqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamqty_GreaterThan(java.math.BigDecimal examqty) {
        regExamqty(CK_GT, examqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMQTY: {NotNull, decimal(16, 6)}
     * @param examqty The value of examqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamqty_LessThan(java.math.BigDecimal examqty) {
        regExamqty(CK_LT, examqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMQTY: {NotNull, decimal(16, 6)}
     * @param examqty The value of examqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamqty_GreaterEqual(java.math.BigDecimal examqty) {
        regExamqty(CK_GE, examqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMQTY: {NotNull, decimal(16, 6)}
     * @param examqty The value of examqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamqty_LessEqual(java.math.BigDecimal examqty) {
        regExamqty(CK_LE, examqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMQTY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of examqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of examqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExamqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExamqty(), "EXAMQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXAMQTY: {NotNull, decimal(16, 6)}
     * @param examqtyList The collection of examqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamqty_InScope(Collection<java.math.BigDecimal> examqtyList) {
        doSetExamqty_InScope(examqtyList);
    }

    protected void doSetExamqty_InScope(Collection<java.math.BigDecimal> examqtyList) {
        regINS(CK_INS, cTL(examqtyList), xgetCValueExamqty(), "EXAMQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXAMQTY: {NotNull, decimal(16, 6)}
     * @param examqtyList The collection of examqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamqty_NotInScope(Collection<java.math.BigDecimal> examqtyList) {
        doSetExamqty_NotInScope(examqtyList);
    }

    protected void doSetExamqty_NotInScope(Collection<java.math.BigDecimal> examqtyList) {
        regINS(CK_NINS, cTL(examqtyList), xgetCValueExamqty(), "EXAMQTY");
    }

    protected void regExamqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExamqty(), "EXAMQTY"); }
    protected abstract ConditionValue xgetCValueExamqty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param res40qty1 The value of res40qty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty1_Equal(java.math.BigDecimal res40qty1) {
        doSetRes40qty1_Equal(res40qty1);
    }

    protected void doSetRes40qty1_Equal(java.math.BigDecimal res40qty1) {
        regRes40qty1(CK_EQ, res40qty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param res40qty1 The value of res40qty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty1_NotEqual(java.math.BigDecimal res40qty1) {
        doSetRes40qty1_NotEqual(res40qty1);
    }

    protected void doSetRes40qty1_NotEqual(java.math.BigDecimal res40qty1) {
        regRes40qty1(CK_NES, res40qty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param res40qty1 The value of res40qty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty1_GreaterThan(java.math.BigDecimal res40qty1) {
        regRes40qty1(CK_GT, res40qty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param res40qty1 The value of res40qty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty1_LessThan(java.math.BigDecimal res40qty1) {
        regRes40qty1(CK_LT, res40qty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param res40qty1 The value of res40qty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty1_GreaterEqual(java.math.BigDecimal res40qty1) {
        regRes40qty1(CK_GE, res40qty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param res40qty1 The value of res40qty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty1_LessEqual(java.math.BigDecimal res40qty1) {
        regRes40qty1(CK_LE, res40qty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of res40qty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of res40qty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRes40qty1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRes40qty1(), "RES40QTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param res40qty1List The collection of res40qty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRes40qty1_InScope(Collection<java.math.BigDecimal> res40qty1List) {
        doSetRes40qty1_InScope(res40qty1List);
    }

    protected void doSetRes40qty1_InScope(Collection<java.math.BigDecimal> res40qty1List) {
        regINS(CK_INS, cTL(res40qty1List), xgetCValueRes40qty1(), "RES40QTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @param res40qty1List The collection of res40qty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRes40qty1_NotInScope(Collection<java.math.BigDecimal> res40qty1List) {
        doSetRes40qty1_NotInScope(res40qty1List);
    }

    protected void doSetRes40qty1_NotInScope(Collection<java.math.BigDecimal> res40qty1List) {
        regINS(CK_NINS, cTL(res40qty1List), xgetCValueRes40qty1(), "RES40QTY1");
    }

    protected void regRes40qty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRes40qty1(), "RES40QTY1"); }
    protected abstract ConditionValue xgetCValueRes40qty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param res40qty2 The value of res40qty2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty2_Equal(java.math.BigDecimal res40qty2) {
        doSetRes40qty2_Equal(res40qty2);
    }

    protected void doSetRes40qty2_Equal(java.math.BigDecimal res40qty2) {
        regRes40qty2(CK_EQ, res40qty2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param res40qty2 The value of res40qty2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty2_NotEqual(java.math.BigDecimal res40qty2) {
        doSetRes40qty2_NotEqual(res40qty2);
    }

    protected void doSetRes40qty2_NotEqual(java.math.BigDecimal res40qty2) {
        regRes40qty2(CK_NES, res40qty2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param res40qty2 The value of res40qty2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty2_GreaterThan(java.math.BigDecimal res40qty2) {
        regRes40qty2(CK_GT, res40qty2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param res40qty2 The value of res40qty2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty2_LessThan(java.math.BigDecimal res40qty2) {
        regRes40qty2(CK_LT, res40qty2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param res40qty2 The value of res40qty2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty2_GreaterEqual(java.math.BigDecimal res40qty2) {
        regRes40qty2(CK_GE, res40qty2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param res40qty2 The value of res40qty2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty2_LessEqual(java.math.BigDecimal res40qty2) {
        regRes40qty2(CK_LE, res40qty2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of res40qty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of res40qty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRes40qty2_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRes40qty2(), "RES40QTY2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param res40qty2List The collection of res40qty2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRes40qty2_InScope(Collection<java.math.BigDecimal> res40qty2List) {
        doSetRes40qty2_InScope(res40qty2List);
    }

    protected void doSetRes40qty2_InScope(Collection<java.math.BigDecimal> res40qty2List) {
        regINS(CK_INS, cTL(res40qty2List), xgetCValueRes40qty2(), "RES40QTY2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]}
     * @param res40qty2List The collection of res40qty2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRes40qty2_NotInScope(Collection<java.math.BigDecimal> res40qty2List) {
        doSetRes40qty2_NotInScope(res40qty2List);
    }

    protected void doSetRes40qty2_NotInScope(Collection<java.math.BigDecimal> res40qty2List) {
        regINS(CK_NINS, cTL(res40qty2List), xgetCValueRes40qty2(), "RES40QTY2");
    }

    protected void regRes40qty2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRes40qty2(), "RES40QTY2"); }
    protected abstract ConditionValue xgetCValueRes40qty2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inferiorqty The value of inferiorqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInferiorqty_Equal(java.math.BigDecimal inferiorqty) {
        doSetInferiorqty_Equal(inferiorqty);
    }

    protected void doSetInferiorqty_Equal(java.math.BigDecimal inferiorqty) {
        regInferiorqty(CK_EQ, inferiorqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inferiorqty The value of inferiorqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInferiorqty_NotEqual(java.math.BigDecimal inferiorqty) {
        doSetInferiorqty_NotEqual(inferiorqty);
    }

    protected void doSetInferiorqty_NotEqual(java.math.BigDecimal inferiorqty) {
        regInferiorqty(CK_NES, inferiorqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inferiorqty The value of inferiorqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInferiorqty_GreaterThan(java.math.BigDecimal inferiorqty) {
        regInferiorqty(CK_GT, inferiorqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inferiorqty The value of inferiorqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInferiorqty_LessThan(java.math.BigDecimal inferiorqty) {
        regInferiorqty(CK_LT, inferiorqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inferiorqty The value of inferiorqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInferiorqty_GreaterEqual(java.math.BigDecimal inferiorqty) {
        regInferiorqty(CK_GE, inferiorqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inferiorqty The value of inferiorqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInferiorqty_LessEqual(java.math.BigDecimal inferiorqty) {
        regInferiorqty(CK_LE, inferiorqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of inferiorqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inferiorqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInferiorqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInferiorqty(), "INFERIORQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inferiorqtyList The collection of inferiorqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInferiorqty_InScope(Collection<java.math.BigDecimal> inferiorqtyList) {
        doSetInferiorqty_InScope(inferiorqtyList);
    }

    protected void doSetInferiorqty_InScope(Collection<java.math.BigDecimal> inferiorqtyList) {
        regINS(CK_INS, cTL(inferiorqtyList), xgetCValueInferiorqty(), "INFERIORQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @param inferiorqtyList The collection of inferiorqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInferiorqty_NotInScope(Collection<java.math.BigDecimal> inferiorqtyList) {
        doSetInferiorqty_NotInScope(inferiorqtyList);
    }

    protected void doSetInferiorqty_NotInScope(Collection<java.math.BigDecimal> inferiorqtyList) {
        regINS(CK_NINS, cTL(inferiorqtyList), xgetCValueInferiorqty(), "INFERIORQTY");
    }

    protected void regInferiorqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInferiorqty(), "INFERIORQTY"); }
    protected abstract ConditionValue xgetCValueInferiorqty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV_ID: {bigint(19)}
     * @param aftzaikoinvId The value of aftzaikoinvId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAftzaikoinvId_Equal(Long aftzaikoinvId) {
        doSetAftzaikoinvId_Equal(aftzaikoinvId);
    }

    protected void doSetAftzaikoinvId_Equal(Long aftzaikoinvId) {
        regAftzaikoinvId(CK_EQ, aftzaikoinvId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV_ID: {bigint(19)}
     * @param aftzaikoinvId The value of aftzaikoinvId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAftzaikoinvId_NotEqual(Long aftzaikoinvId) {
        doSetAftzaikoinvId_NotEqual(aftzaikoinvId);
    }

    protected void doSetAftzaikoinvId_NotEqual(Long aftzaikoinvId) {
        regAftzaikoinvId(CK_NES, aftzaikoinvId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV_ID: {bigint(19)}
     * @param aftzaikoinvId The value of aftzaikoinvId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAftzaikoinvId_GreaterThan(Long aftzaikoinvId) {
        regAftzaikoinvId(CK_GT, aftzaikoinvId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV_ID: {bigint(19)}
     * @param aftzaikoinvId The value of aftzaikoinvId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAftzaikoinvId_LessThan(Long aftzaikoinvId) {
        regAftzaikoinvId(CK_LT, aftzaikoinvId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV_ID: {bigint(19)}
     * @param aftzaikoinvId The value of aftzaikoinvId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAftzaikoinvId_GreaterEqual(Long aftzaikoinvId) {
        regAftzaikoinvId(CK_GE, aftzaikoinvId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV_ID: {bigint(19)}
     * @param aftzaikoinvId The value of aftzaikoinvId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAftzaikoinvId_LessEqual(Long aftzaikoinvId) {
        regAftzaikoinvId(CK_LE, aftzaikoinvId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV_ID: {bigint(19)}
     * @param minNumber The min number of aftzaikoinvId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of aftzaikoinvId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAftzaikoinvId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAftzaikoinvId(), "AFTZAIKOINV_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * AFTZAIKOINV_ID: {bigint(19)}
     * @param aftzaikoinvIdList The collection of aftzaikoinvId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinvId_InScope(Collection<Long> aftzaikoinvIdList) {
        doSetAftzaikoinvId_InScope(aftzaikoinvIdList);
    }

    protected void doSetAftzaikoinvId_InScope(Collection<Long> aftzaikoinvIdList) {
        regINS(CK_INS, cTL(aftzaikoinvIdList), xgetCValueAftzaikoinvId(), "AFTZAIKOINV_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * AFTZAIKOINV_ID: {bigint(19)}
     * @param aftzaikoinvIdList The collection of aftzaikoinvId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinvId_NotInScope(Collection<Long> aftzaikoinvIdList) {
        doSetAftzaikoinvId_NotInScope(aftzaikoinvIdList);
    }

    protected void doSetAftzaikoinvId_NotInScope(Collection<Long> aftzaikoinvIdList) {
        regINS(CK_NINS, cTL(aftzaikoinvIdList), xgetCValueAftzaikoinvId(), "AFTZAIKOINV_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AFTZAIKOINV_ID: {bigint(19)}
     */
    public void setAftzaikoinvId_IsNull() { regAftzaikoinvId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AFTZAIKOINV_ID: {bigint(19)}
     */
    public void setAftzaikoinvId_IsNotNull() { regAftzaikoinvId(CK_ISNN, DOBJ); }

    protected void regAftzaikoinvId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAftzaikoinvId(), "AFTZAIKOINV_ID"); }
    protected abstract ConditionValue xgetCValueAftzaikoinvId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV: {NotNull, varchar(30)}
     * @param aftzaikoinv The value of aftzaikoinv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_Equal(String aftzaikoinv) {
        doSetAftzaikoinv_Equal(fRES(aftzaikoinv));
    }

    protected void doSetAftzaikoinv_Equal(String aftzaikoinv) {
        regAftzaikoinv(CK_EQ, aftzaikoinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV: {NotNull, varchar(30)}
     * @param aftzaikoinv The value of aftzaikoinv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_NotEqual(String aftzaikoinv) {
        doSetAftzaikoinv_NotEqual(fRES(aftzaikoinv));
    }

    protected void doSetAftzaikoinv_NotEqual(String aftzaikoinv) {
        regAftzaikoinv(CK_NES, aftzaikoinv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV: {NotNull, varchar(30)}
     * @param aftzaikoinv The value of aftzaikoinv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_GreaterThan(String aftzaikoinv) {
        regAftzaikoinv(CK_GT, fRES(aftzaikoinv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV: {NotNull, varchar(30)}
     * @param aftzaikoinv The value of aftzaikoinv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_LessThan(String aftzaikoinv) {
        regAftzaikoinv(CK_LT, fRES(aftzaikoinv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV: {NotNull, varchar(30)}
     * @param aftzaikoinv The value of aftzaikoinv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_GreaterEqual(String aftzaikoinv) {
        regAftzaikoinv(CK_GE, fRES(aftzaikoinv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV: {NotNull, varchar(30)}
     * @param aftzaikoinv The value of aftzaikoinv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_LessEqual(String aftzaikoinv) {
        regAftzaikoinv(CK_LE, fRES(aftzaikoinv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTZAIKOINV: {NotNull, varchar(30)}
     * @param aftzaikoinvList The collection of aftzaikoinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_InScope(Collection<String> aftzaikoinvList) {
        doSetAftzaikoinv_InScope(aftzaikoinvList);
    }

    protected void doSetAftzaikoinv_InScope(Collection<String> aftzaikoinvList) {
        regINS(CK_INS, cTL(aftzaikoinvList), xgetCValueAftzaikoinv(), "AFTZAIKOINV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTZAIKOINV: {NotNull, varchar(30)}
     * @param aftzaikoinvList The collection of aftzaikoinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_NotInScope(Collection<String> aftzaikoinvList) {
        doSetAftzaikoinv_NotInScope(aftzaikoinvList);
    }

    protected void doSetAftzaikoinv_NotInScope(Collection<String> aftzaikoinvList) {
        regINS(CK_NINS, cTL(aftzaikoinvList), xgetCValueAftzaikoinv(), "AFTZAIKOINV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AFTZAIKOINV: {NotNull, varchar(30)} <br>
     * <pre>e.g. setAftzaikoinv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param aftzaikoinv The value of aftzaikoinv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAftzaikoinv_LikeSearch(String aftzaikoinv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(aftzaikoinv), xgetCValueAftzaikoinv(), "AFTZAIKOINV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AFTZAIKOINV: {NotNull, varchar(30)}
     * @param aftzaikoinv The value of aftzaikoinv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAftzaikoinv_NotLikeSearch(String aftzaikoinv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(aftzaikoinv), xgetCValueAftzaikoinv(), "AFTZAIKOINV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AFTZAIKOINV: {NotNull, varchar(30)}
     * @param aftzaikoinv The value of aftzaikoinv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_PrefixSearch(String aftzaikoinv) {
        setAftzaikoinv_LikeSearch(aftzaikoinv, xcLSOPPre());
    }

    protected void regAftzaikoinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAftzaikoinv(), "AFTZAIKOINV"); }
    protected abstract ConditionValue xgetCValueAftzaikoinv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVATIONFLG: {NotNull, char(1), default=[(0)]}
     * @param reservationflg The value of reservationflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservationflg_Equal(String reservationflg) {
        doSetReservationflg_Equal(fRES(reservationflg));
    }

    protected void doSetReservationflg_Equal(String reservationflg) {
        regReservationflg(CK_EQ, reservationflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVATIONFLG: {NotNull, char(1), default=[(0)]}
     * @param reservationflg The value of reservationflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservationflg_NotEqual(String reservationflg) {
        doSetReservationflg_NotEqual(fRES(reservationflg));
    }

    protected void doSetReservationflg_NotEqual(String reservationflg) {
        regReservationflg(CK_NES, reservationflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVATIONFLG: {NotNull, char(1), default=[(0)]}
     * @param reservationflg The value of reservationflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservationflg_GreaterThan(String reservationflg) {
        regReservationflg(CK_GT, fRES(reservationflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVATIONFLG: {NotNull, char(1), default=[(0)]}
     * @param reservationflg The value of reservationflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservationflg_LessThan(String reservationflg) {
        regReservationflg(CK_LT, fRES(reservationflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVATIONFLG: {NotNull, char(1), default=[(0)]}
     * @param reservationflg The value of reservationflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservationflg_GreaterEqual(String reservationflg) {
        regReservationflg(CK_GE, fRES(reservationflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVATIONFLG: {NotNull, char(1), default=[(0)]}
     * @param reservationflg The value of reservationflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservationflg_LessEqual(String reservationflg) {
        regReservationflg(CK_LE, fRES(reservationflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESERVATIONFLG: {NotNull, char(1), default=[(0)]}
     * @param reservationflgList The collection of reservationflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservationflg_InScope(Collection<String> reservationflgList) {
        doSetReservationflg_InScope(reservationflgList);
    }

    protected void doSetReservationflg_InScope(Collection<String> reservationflgList) {
        regINS(CK_INS, cTL(reservationflgList), xgetCValueReservationflg(), "RESERVATIONFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESERVATIONFLG: {NotNull, char(1), default=[(0)]}
     * @param reservationflgList The collection of reservationflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservationflg_NotInScope(Collection<String> reservationflgList) {
        doSetReservationflg_NotInScope(reservationflgList);
    }

    protected void doSetReservationflg_NotInScope(Collection<String> reservationflgList) {
        regINS(CK_NINS, cTL(reservationflgList), xgetCValueReservationflg(), "RESERVATIONFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVATIONFLG: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setReservationflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reservationflg The value of reservationflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReservationflg_LikeSearch(String reservationflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reservationflg), xgetCValueReservationflg(), "RESERVATIONFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVATIONFLG: {NotNull, char(1), default=[(0)]}
     * @param reservationflg The value of reservationflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReservationflg_NotLikeSearch(String reservationflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reservationflg), xgetCValueReservationflg(), "RESERVATIONFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVATIONFLG: {NotNull, char(1), default=[(0)]}
     * @param reservationflg The value of reservationflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservationflg_PrefixSearch(String reservationflg) {
        setReservationflg_LikeSearch(reservationflg, xcLSOPPre());
    }

    protected void regReservationflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReservationflg(), "RESERVATIONFLG"); }
    protected abstract ConditionValue xgetCValueReservationflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDETAILSTS: {NotNull, char(1), default=[(0)]}
     * @param examdetailsts The value of examdetailsts as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdetailsts_Equal(String examdetailsts) {
        doSetExamdetailsts_Equal(fRES(examdetailsts));
    }

    protected void doSetExamdetailsts_Equal(String examdetailsts) {
        regExamdetailsts(CK_EQ, examdetailsts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDETAILSTS: {NotNull, char(1), default=[(0)]}
     * @param examdetailsts The value of examdetailsts as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdetailsts_NotEqual(String examdetailsts) {
        doSetExamdetailsts_NotEqual(fRES(examdetailsts));
    }

    protected void doSetExamdetailsts_NotEqual(String examdetailsts) {
        regExamdetailsts(CK_NES, examdetailsts);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDETAILSTS: {NotNull, char(1), default=[(0)]}
     * @param examdetailsts The value of examdetailsts as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdetailsts_GreaterThan(String examdetailsts) {
        regExamdetailsts(CK_GT, fRES(examdetailsts));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDETAILSTS: {NotNull, char(1), default=[(0)]}
     * @param examdetailsts The value of examdetailsts as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdetailsts_LessThan(String examdetailsts) {
        regExamdetailsts(CK_LT, fRES(examdetailsts));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDETAILSTS: {NotNull, char(1), default=[(0)]}
     * @param examdetailsts The value of examdetailsts as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdetailsts_GreaterEqual(String examdetailsts) {
        regExamdetailsts(CK_GE, fRES(examdetailsts));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDETAILSTS: {NotNull, char(1), default=[(0)]}
     * @param examdetailsts The value of examdetailsts as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdetailsts_LessEqual(String examdetailsts) {
        regExamdetailsts(CK_LE, fRES(examdetailsts));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXAMDETAILSTS: {NotNull, char(1), default=[(0)]}
     * @param examdetailstsList The collection of examdetailsts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdetailsts_InScope(Collection<String> examdetailstsList) {
        doSetExamdetailsts_InScope(examdetailstsList);
    }

    protected void doSetExamdetailsts_InScope(Collection<String> examdetailstsList) {
        regINS(CK_INS, cTL(examdetailstsList), xgetCValueExamdetailsts(), "EXAMDETAILSTS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXAMDETAILSTS: {NotNull, char(1), default=[(0)]}
     * @param examdetailstsList The collection of examdetailsts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdetailsts_NotInScope(Collection<String> examdetailstsList) {
        doSetExamdetailsts_NotInScope(examdetailstsList);
    }

    protected void doSetExamdetailsts_NotInScope(Collection<String> examdetailstsList) {
        regINS(CK_NINS, cTL(examdetailstsList), xgetCValueExamdetailsts(), "EXAMDETAILSTS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMDETAILSTS: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setExamdetailsts_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param examdetailsts The value of examdetailsts as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExamdetailsts_LikeSearch(String examdetailsts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(examdetailsts), xgetCValueExamdetailsts(), "EXAMDETAILSTS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMDETAILSTS: {NotNull, char(1), default=[(0)]}
     * @param examdetailsts The value of examdetailsts as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExamdetailsts_NotLikeSearch(String examdetailsts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(examdetailsts), xgetCValueExamdetailsts(), "EXAMDETAILSTS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMDETAILSTS: {NotNull, char(1), default=[(0)]}
     * @param examdetailsts The value of examdetailsts as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdetailsts_PrefixSearch(String examdetailsts) {
        setExamdetailsts_LikeSearch(examdetailsts, xcLSOPPre());
    }

    protected void regExamdetailsts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExamdetailsts(), "EXAMDETAILSTS"); }
    protected abstract ConditionValue xgetCValueExamdetailsts();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(8)}
     * @param examdate The value of examdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_Equal(String examdate) {
        doSetExamdate_Equal(fRES(examdate));
    }

    protected void doSetExamdate_Equal(String examdate) {
        regExamdate(CK_EQ, examdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(8)}
     * @param examdate The value of examdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_NotEqual(String examdate) {
        doSetExamdate_NotEqual(fRES(examdate));
    }

    protected void doSetExamdate_NotEqual(String examdate) {
        regExamdate(CK_NES, examdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(8)}
     * @param examdate The value of examdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_GreaterThan(String examdate) {
        regExamdate(CK_GT, fRES(examdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(8)}
     * @param examdate The value of examdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_LessThan(String examdate) {
        regExamdate(CK_LT, fRES(examdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(8)}
     * @param examdate The value of examdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_GreaterEqual(String examdate) {
        regExamdate(CK_GE, fRES(examdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(8)}
     * @param examdate The value of examdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_LessEqual(String examdate) {
        regExamdate(CK_LE, fRES(examdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXAMDATE: {varchar(8)}
     * @param examdateList The collection of examdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_InScope(Collection<String> examdateList) {
        doSetExamdate_InScope(examdateList);
    }

    protected void doSetExamdate_InScope(Collection<String> examdateList) {
        regINS(CK_INS, cTL(examdateList), xgetCValueExamdate(), "EXAMDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXAMDATE: {varchar(8)}
     * @param examdateList The collection of examdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_NotInScope(Collection<String> examdateList) {
        doSetExamdate_NotInScope(examdateList);
    }

    protected void doSetExamdate_NotInScope(Collection<String> examdateList) {
        regINS(CK_NINS, cTL(examdateList), xgetCValueExamdate(), "EXAMDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMDATE: {varchar(8)} <br>
     * <pre>e.g. setExamdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param examdate The value of examdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExamdate_LikeSearch(String examdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(examdate), xgetCValueExamdate(), "EXAMDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMDATE: {varchar(8)}
     * @param examdate The value of examdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExamdate_NotLikeSearch(String examdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(examdate), xgetCValueExamdate(), "EXAMDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMDATE: {varchar(8)}
     * @param examdate The value of examdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_PrefixSearch(String examdate) {
        setExamdate_LikeSearch(examdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(8)}
     */
    public void setExamdate_IsNull() { regExamdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(8)}
     */
    public void setExamdate_IsNullOrEmpty() { regExamdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(8)}
     */
    public void setExamdate_IsNotNull() { regExamdate(CK_ISNN, DOBJ); }

    protected void regExamdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExamdate(), "EXAMDATE"); }
    protected abstract ConditionValue xgetCValueExamdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param notexamqty The value of notexamqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotexamqty_Equal(java.math.BigDecimal notexamqty) {
        doSetNotexamqty_Equal(notexamqty);
    }

    protected void doSetNotexamqty_Equal(java.math.BigDecimal notexamqty) {
        regNotexamqty(CK_EQ, notexamqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param notexamqty The value of notexamqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotexamqty_NotEqual(java.math.BigDecimal notexamqty) {
        doSetNotexamqty_NotEqual(notexamqty);
    }

    protected void doSetNotexamqty_NotEqual(java.math.BigDecimal notexamqty) {
        regNotexamqty(CK_NES, notexamqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param notexamqty The value of notexamqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotexamqty_GreaterThan(java.math.BigDecimal notexamqty) {
        regNotexamqty(CK_GT, notexamqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param notexamqty The value of notexamqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotexamqty_LessThan(java.math.BigDecimal notexamqty) {
        regNotexamqty(CK_LT, notexamqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param notexamqty The value of notexamqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotexamqty_GreaterEqual(java.math.BigDecimal notexamqty) {
        regNotexamqty(CK_GE, notexamqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param notexamqty The value of notexamqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotexamqty_LessEqual(java.math.BigDecimal notexamqty) {
        regNotexamqty(CK_LE, notexamqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param minNumber The min number of notexamqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of notexamqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNotexamqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNotexamqty(), "NOTEXAMQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param notexamqtyList The collection of notexamqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotexamqty_InScope(Collection<java.math.BigDecimal> notexamqtyList) {
        doSetNotexamqty_InScope(notexamqtyList);
    }

    protected void doSetNotexamqty_InScope(Collection<java.math.BigDecimal> notexamqtyList) {
        regINS(CK_INS, cTL(notexamqtyList), xgetCValueNotexamqty(), "NOTEXAMQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param notexamqtyList The collection of notexamqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotexamqty_NotInScope(Collection<java.math.BigDecimal> notexamqtyList) {
        doSetNotexamqty_NotInScope(notexamqtyList);
    }

    protected void doSetNotexamqty_NotInScope(Collection<java.math.BigDecimal> notexamqtyList) {
        regINS(CK_NINS, cTL(notexamqtyList), xgetCValueNotexamqty(), "NOTEXAMQTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     */
    public void setNotexamqty_IsNull() { regNotexamqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     */
    public void setNotexamqty_IsNotNull() { regNotexamqty(CK_ISNN, DOBJ); }

    protected void regNotexamqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotexamqty(), "NOTEXAMQTY"); }
    protected abstract ConditionValue xgetCValueNotexamqty();

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
    public HpSLCFunction<TTrexamrsltdetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrexamrsltdetailCB.class);
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
    public HpSLCFunction<TTrexamrsltdetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrexamrsltdetailCB.class);
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
    public HpSLCFunction<TTrexamrsltdetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrexamrsltdetailCB.class);
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
    public HpSLCFunction<TTrexamrsltdetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrexamrsltdetailCB.class);
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
    public HpSLCFunction<TTrexamrsltdetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrexamrsltdetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrexamrsltdetailCB&gt;() {
     *     public void query(TTrexamrsltdetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrexamrsltdetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrexamrsltdetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrexamrsltdetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrexamrsltdetailCQ sq);

    protected TTrexamrsltdetailCB xcreateScalarConditionCB() {
        TTrexamrsltdetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrexamrsltdetailCB xcreateScalarConditionPartitionByCB() {
        TTrexamrsltdetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrexamrsltdetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrexamrsltdetailCB cb = new TTrexamrsltdetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TREXAMRSLTDETAIL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrexamrsltdetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrexamrsltdetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrexamrsltdetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrexamrsltdetailCB cb = new TTrexamrsltdetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TREXAMRSLTDETAIL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrexamrsltdetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrexamrsltdetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrexamrsltdetailCB cb = new TTrexamrsltdetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrexamrsltdetailCQ sq);

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
    protected TTrexamrsltdetailCB newMyCB() {
        return new TTrexamrsltdetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrexamrsltdetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
