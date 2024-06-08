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
 * The abstract condition-query of B_DML_LOG.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBDmlLogCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBDmlLogCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_DML_LOG";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dmlLogId The value of dmlLogId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDmlLogId_Equal(Long dmlLogId) {
        doSetDmlLogId_Equal(dmlLogId);
    }

    protected void doSetDmlLogId_Equal(Long dmlLogId) {
        regDmlLogId(CK_EQ, dmlLogId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dmlLogId The value of dmlLogId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDmlLogId_NotEqual(Long dmlLogId) {
        doSetDmlLogId_NotEqual(dmlLogId);
    }

    protected void doSetDmlLogId_NotEqual(Long dmlLogId) {
        regDmlLogId(CK_NES, dmlLogId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dmlLogId The value of dmlLogId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDmlLogId_GreaterThan(Long dmlLogId) {
        regDmlLogId(CK_GT, dmlLogId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dmlLogId The value of dmlLogId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDmlLogId_LessThan(Long dmlLogId) {
        regDmlLogId(CK_LT, dmlLogId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dmlLogId The value of dmlLogId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDmlLogId_GreaterEqual(Long dmlLogId) {
        regDmlLogId(CK_GE, dmlLogId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dmlLogId The value of dmlLogId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDmlLogId_LessEqual(Long dmlLogId) {
        regDmlLogId(CK_LE, dmlLogId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of dmlLogId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dmlLogId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDmlLogId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDmlLogId(), "DML_LOG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dmlLogIdList The collection of dmlLogId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlLogId_InScope(Collection<Long> dmlLogIdList) {
        doSetDmlLogId_InScope(dmlLogIdList);
    }

    protected void doSetDmlLogId_InScope(Collection<Long> dmlLogIdList) {
        regINS(CK_INS, cTL(dmlLogIdList), xgetCValueDmlLogId(), "DML_LOG_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dmlLogIdList The collection of dmlLogId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlLogId_NotInScope(Collection<Long> dmlLogIdList) {
        doSetDmlLogId_NotInScope(dmlLogIdList);
    }

    protected void doSetDmlLogId_NotInScope(Collection<Long> dmlLogIdList) {
        regINS(CK_NINS, cTL(dmlLogIdList), xgetCValueDmlLogId(), "DML_LOG_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setDmlLogId_IsNull() { regDmlLogId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setDmlLogId_IsNotNull() { regDmlLogId(CK_ISNN, DOBJ); }

    protected void regDmlLogId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDmlLogId(), "DML_LOG_ID"); }
    protected abstract ConditionValue xgetCValueDmlLogId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_KBN: {varchar(30)}
     * @param dmlKbn The value of dmlKbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlKbn_Equal(String dmlKbn) {
        doSetDmlKbn_Equal(fRES(dmlKbn));
    }

    protected void doSetDmlKbn_Equal(String dmlKbn) {
        regDmlKbn(CK_EQ, dmlKbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_KBN: {varchar(30)}
     * @param dmlKbn The value of dmlKbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlKbn_NotEqual(String dmlKbn) {
        doSetDmlKbn_NotEqual(fRES(dmlKbn));
    }

    protected void doSetDmlKbn_NotEqual(String dmlKbn) {
        regDmlKbn(CK_NES, dmlKbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_KBN: {varchar(30)}
     * @param dmlKbn The value of dmlKbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlKbn_GreaterThan(String dmlKbn) {
        regDmlKbn(CK_GT, fRES(dmlKbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_KBN: {varchar(30)}
     * @param dmlKbn The value of dmlKbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlKbn_LessThan(String dmlKbn) {
        regDmlKbn(CK_LT, fRES(dmlKbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_KBN: {varchar(30)}
     * @param dmlKbn The value of dmlKbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlKbn_GreaterEqual(String dmlKbn) {
        regDmlKbn(CK_GE, fRES(dmlKbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_KBN: {varchar(30)}
     * @param dmlKbn The value of dmlKbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlKbn_LessEqual(String dmlKbn) {
        regDmlKbn(CK_LE, fRES(dmlKbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DML_KBN: {varchar(30)}
     * @param dmlKbnList The collection of dmlKbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlKbn_InScope(Collection<String> dmlKbnList) {
        doSetDmlKbn_InScope(dmlKbnList);
    }

    protected void doSetDmlKbn_InScope(Collection<String> dmlKbnList) {
        regINS(CK_INS, cTL(dmlKbnList), xgetCValueDmlKbn(), "DML_KBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DML_KBN: {varchar(30)}
     * @param dmlKbnList The collection of dmlKbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlKbn_NotInScope(Collection<String> dmlKbnList) {
        doSetDmlKbn_NotInScope(dmlKbnList);
    }

    protected void doSetDmlKbn_NotInScope(Collection<String> dmlKbnList) {
        regINS(CK_NINS, cTL(dmlKbnList), xgetCValueDmlKbn(), "DML_KBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DML_KBN: {varchar(30)} <br>
     * <pre>e.g. setDmlKbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dmlKbn The value of dmlKbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDmlKbn_LikeSearch(String dmlKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dmlKbn), xgetCValueDmlKbn(), "DML_KBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DML_KBN: {varchar(30)}
     * @param dmlKbn The value of dmlKbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDmlKbn_NotLikeSearch(String dmlKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dmlKbn), xgetCValueDmlKbn(), "DML_KBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DML_KBN: {varchar(30)}
     * @param dmlKbn The value of dmlKbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlKbn_PrefixSearch(String dmlKbn) {
        setDmlKbn_LikeSearch(dmlKbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DML_KBN: {varchar(30)}
     */
    public void setDmlKbn_IsNull() { regDmlKbn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DML_KBN: {varchar(30)}
     */
    public void setDmlKbn_IsNullOrEmpty() { regDmlKbn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DML_KBN: {varchar(30)}
     */
    public void setDmlKbn_IsNotNull() { regDmlKbn(CK_ISNN, DOBJ); }

    protected void regDmlKbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDmlKbn(), "DML_KBN"); }
    protected abstract ConditionValue xgetCValueDmlKbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_TABLE_NM: {varchar(30)}
     * @param dmlTableNm The value of dmlTableNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlTableNm_Equal(String dmlTableNm) {
        doSetDmlTableNm_Equal(fRES(dmlTableNm));
    }

    protected void doSetDmlTableNm_Equal(String dmlTableNm) {
        regDmlTableNm(CK_EQ, dmlTableNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_TABLE_NM: {varchar(30)}
     * @param dmlTableNm The value of dmlTableNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlTableNm_NotEqual(String dmlTableNm) {
        doSetDmlTableNm_NotEqual(fRES(dmlTableNm));
    }

    protected void doSetDmlTableNm_NotEqual(String dmlTableNm) {
        regDmlTableNm(CK_NES, dmlTableNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_TABLE_NM: {varchar(30)}
     * @param dmlTableNm The value of dmlTableNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlTableNm_GreaterThan(String dmlTableNm) {
        regDmlTableNm(CK_GT, fRES(dmlTableNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_TABLE_NM: {varchar(30)}
     * @param dmlTableNm The value of dmlTableNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlTableNm_LessThan(String dmlTableNm) {
        regDmlTableNm(CK_LT, fRES(dmlTableNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_TABLE_NM: {varchar(30)}
     * @param dmlTableNm The value of dmlTableNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlTableNm_GreaterEqual(String dmlTableNm) {
        regDmlTableNm(CK_GE, fRES(dmlTableNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_TABLE_NM: {varchar(30)}
     * @param dmlTableNm The value of dmlTableNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlTableNm_LessEqual(String dmlTableNm) {
        regDmlTableNm(CK_LE, fRES(dmlTableNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DML_TABLE_NM: {varchar(30)}
     * @param dmlTableNmList The collection of dmlTableNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlTableNm_InScope(Collection<String> dmlTableNmList) {
        doSetDmlTableNm_InScope(dmlTableNmList);
    }

    protected void doSetDmlTableNm_InScope(Collection<String> dmlTableNmList) {
        regINS(CK_INS, cTL(dmlTableNmList), xgetCValueDmlTableNm(), "DML_TABLE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DML_TABLE_NM: {varchar(30)}
     * @param dmlTableNmList The collection of dmlTableNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlTableNm_NotInScope(Collection<String> dmlTableNmList) {
        doSetDmlTableNm_NotInScope(dmlTableNmList);
    }

    protected void doSetDmlTableNm_NotInScope(Collection<String> dmlTableNmList) {
        regINS(CK_NINS, cTL(dmlTableNmList), xgetCValueDmlTableNm(), "DML_TABLE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DML_TABLE_NM: {varchar(30)} <br>
     * <pre>e.g. setDmlTableNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dmlTableNm The value of dmlTableNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDmlTableNm_LikeSearch(String dmlTableNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dmlTableNm), xgetCValueDmlTableNm(), "DML_TABLE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DML_TABLE_NM: {varchar(30)}
     * @param dmlTableNm The value of dmlTableNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDmlTableNm_NotLikeSearch(String dmlTableNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dmlTableNm), xgetCValueDmlTableNm(), "DML_TABLE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DML_TABLE_NM: {varchar(30)}
     * @param dmlTableNm The value of dmlTableNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlTableNm_PrefixSearch(String dmlTableNm) {
        setDmlTableNm_LikeSearch(dmlTableNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DML_TABLE_NM: {varchar(30)}
     */
    public void setDmlTableNm_IsNull() { regDmlTableNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DML_TABLE_NM: {varchar(30)}
     */
    public void setDmlTableNm_IsNullOrEmpty() { regDmlTableNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DML_TABLE_NM: {varchar(30)}
     */
    public void setDmlTableNm_IsNotNull() { regDmlTableNm(CK_ISNN, DOBJ); }

    protected void regDmlTableNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDmlTableNm(), "DML_TABLE_NM"); }
    protected abstract ConditionValue xgetCValueDmlTableNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_COLUMN_NM: {varchar(30)}
     * @param dmlColumnNm The value of dmlColumnNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlColumnNm_Equal(String dmlColumnNm) {
        doSetDmlColumnNm_Equal(fRES(dmlColumnNm));
    }

    protected void doSetDmlColumnNm_Equal(String dmlColumnNm) {
        regDmlColumnNm(CK_EQ, dmlColumnNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_COLUMN_NM: {varchar(30)}
     * @param dmlColumnNm The value of dmlColumnNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlColumnNm_NotEqual(String dmlColumnNm) {
        doSetDmlColumnNm_NotEqual(fRES(dmlColumnNm));
    }

    protected void doSetDmlColumnNm_NotEqual(String dmlColumnNm) {
        regDmlColumnNm(CK_NES, dmlColumnNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_COLUMN_NM: {varchar(30)}
     * @param dmlColumnNm The value of dmlColumnNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlColumnNm_GreaterThan(String dmlColumnNm) {
        regDmlColumnNm(CK_GT, fRES(dmlColumnNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_COLUMN_NM: {varchar(30)}
     * @param dmlColumnNm The value of dmlColumnNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlColumnNm_LessThan(String dmlColumnNm) {
        regDmlColumnNm(CK_LT, fRES(dmlColumnNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_COLUMN_NM: {varchar(30)}
     * @param dmlColumnNm The value of dmlColumnNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlColumnNm_GreaterEqual(String dmlColumnNm) {
        regDmlColumnNm(CK_GE, fRES(dmlColumnNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_COLUMN_NM: {varchar(30)}
     * @param dmlColumnNm The value of dmlColumnNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlColumnNm_LessEqual(String dmlColumnNm) {
        regDmlColumnNm(CK_LE, fRES(dmlColumnNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DML_COLUMN_NM: {varchar(30)}
     * @param dmlColumnNmList The collection of dmlColumnNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlColumnNm_InScope(Collection<String> dmlColumnNmList) {
        doSetDmlColumnNm_InScope(dmlColumnNmList);
    }

    protected void doSetDmlColumnNm_InScope(Collection<String> dmlColumnNmList) {
        regINS(CK_INS, cTL(dmlColumnNmList), xgetCValueDmlColumnNm(), "DML_COLUMN_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DML_COLUMN_NM: {varchar(30)}
     * @param dmlColumnNmList The collection of dmlColumnNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlColumnNm_NotInScope(Collection<String> dmlColumnNmList) {
        doSetDmlColumnNm_NotInScope(dmlColumnNmList);
    }

    protected void doSetDmlColumnNm_NotInScope(Collection<String> dmlColumnNmList) {
        regINS(CK_NINS, cTL(dmlColumnNmList), xgetCValueDmlColumnNm(), "DML_COLUMN_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DML_COLUMN_NM: {varchar(30)} <br>
     * <pre>e.g. setDmlColumnNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dmlColumnNm The value of dmlColumnNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDmlColumnNm_LikeSearch(String dmlColumnNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dmlColumnNm), xgetCValueDmlColumnNm(), "DML_COLUMN_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DML_COLUMN_NM: {varchar(30)}
     * @param dmlColumnNm The value of dmlColumnNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDmlColumnNm_NotLikeSearch(String dmlColumnNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dmlColumnNm), xgetCValueDmlColumnNm(), "DML_COLUMN_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DML_COLUMN_NM: {varchar(30)}
     * @param dmlColumnNm The value of dmlColumnNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlColumnNm_PrefixSearch(String dmlColumnNm) {
        setDmlColumnNm_LikeSearch(dmlColumnNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DML_COLUMN_NM: {varchar(30)}
     */
    public void setDmlColumnNm_IsNull() { regDmlColumnNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DML_COLUMN_NM: {varchar(30)}
     */
    public void setDmlColumnNm_IsNullOrEmpty() { regDmlColumnNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DML_COLUMN_NM: {varchar(30)}
     */
    public void setDmlColumnNm_IsNotNull() { regDmlColumnNm(CK_ISNN, DOBJ); }

    protected void regDmlColumnNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDmlColumnNm(), "DML_COLUMN_NM"); }
    protected abstract ConditionValue xgetCValueDmlColumnNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DML_ROW_ID: {bigint(19)}
     * @param dmlRowId The value of dmlRowId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDmlRowId_Equal(Long dmlRowId) {
        doSetDmlRowId_Equal(dmlRowId);
    }

    protected void doSetDmlRowId_Equal(Long dmlRowId) {
        regDmlRowId(CK_EQ, dmlRowId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DML_ROW_ID: {bigint(19)}
     * @param dmlRowId The value of dmlRowId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDmlRowId_NotEqual(Long dmlRowId) {
        doSetDmlRowId_NotEqual(dmlRowId);
    }

    protected void doSetDmlRowId_NotEqual(Long dmlRowId) {
        regDmlRowId(CK_NES, dmlRowId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DML_ROW_ID: {bigint(19)}
     * @param dmlRowId The value of dmlRowId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDmlRowId_GreaterThan(Long dmlRowId) {
        regDmlRowId(CK_GT, dmlRowId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DML_ROW_ID: {bigint(19)}
     * @param dmlRowId The value of dmlRowId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDmlRowId_LessThan(Long dmlRowId) {
        regDmlRowId(CK_LT, dmlRowId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DML_ROW_ID: {bigint(19)}
     * @param dmlRowId The value of dmlRowId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDmlRowId_GreaterEqual(Long dmlRowId) {
        regDmlRowId(CK_GE, dmlRowId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DML_ROW_ID: {bigint(19)}
     * @param dmlRowId The value of dmlRowId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDmlRowId_LessEqual(Long dmlRowId) {
        regDmlRowId(CK_LE, dmlRowId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DML_ROW_ID: {bigint(19)}
     * @param minNumber The min number of dmlRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dmlRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDmlRowId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDmlRowId(), "DML_ROW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DML_ROW_ID: {bigint(19)}
     * @param dmlRowIdList The collection of dmlRowId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlRowId_InScope(Collection<Long> dmlRowIdList) {
        doSetDmlRowId_InScope(dmlRowIdList);
    }

    protected void doSetDmlRowId_InScope(Collection<Long> dmlRowIdList) {
        regINS(CK_INS, cTL(dmlRowIdList), xgetCValueDmlRowId(), "DML_ROW_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DML_ROW_ID: {bigint(19)}
     * @param dmlRowIdList The collection of dmlRowId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlRowId_NotInScope(Collection<Long> dmlRowIdList) {
        doSetDmlRowId_NotInScope(dmlRowIdList);
    }

    protected void doSetDmlRowId_NotInScope(Collection<Long> dmlRowIdList) {
        regINS(CK_NINS, cTL(dmlRowIdList), xgetCValueDmlRowId(), "DML_ROW_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DML_ROW_ID: {bigint(19)}
     */
    public void setDmlRowId_IsNull() { regDmlRowId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DML_ROW_ID: {bigint(19)}
     */
    public void setDmlRowId_IsNotNull() { regDmlRowId(CK_ISNN, DOBJ); }

    protected void regDmlRowId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDmlRowId(), "DML_ROW_ID"); }
    protected abstract ConditionValue xgetCValueDmlRowId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_BEFORE_VALUE: {varchar(255)}
     * @param dmlBeforeValue The value of dmlBeforeValue as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlBeforeValue_Equal(String dmlBeforeValue) {
        doSetDmlBeforeValue_Equal(fRES(dmlBeforeValue));
    }

    protected void doSetDmlBeforeValue_Equal(String dmlBeforeValue) {
        regDmlBeforeValue(CK_EQ, dmlBeforeValue);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_BEFORE_VALUE: {varchar(255)}
     * @param dmlBeforeValue The value of dmlBeforeValue as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlBeforeValue_NotEqual(String dmlBeforeValue) {
        doSetDmlBeforeValue_NotEqual(fRES(dmlBeforeValue));
    }

    protected void doSetDmlBeforeValue_NotEqual(String dmlBeforeValue) {
        regDmlBeforeValue(CK_NES, dmlBeforeValue);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_BEFORE_VALUE: {varchar(255)}
     * @param dmlBeforeValue The value of dmlBeforeValue as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlBeforeValue_GreaterThan(String dmlBeforeValue) {
        regDmlBeforeValue(CK_GT, fRES(dmlBeforeValue));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_BEFORE_VALUE: {varchar(255)}
     * @param dmlBeforeValue The value of dmlBeforeValue as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlBeforeValue_LessThan(String dmlBeforeValue) {
        regDmlBeforeValue(CK_LT, fRES(dmlBeforeValue));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_BEFORE_VALUE: {varchar(255)}
     * @param dmlBeforeValue The value of dmlBeforeValue as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlBeforeValue_GreaterEqual(String dmlBeforeValue) {
        regDmlBeforeValue(CK_GE, fRES(dmlBeforeValue));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_BEFORE_VALUE: {varchar(255)}
     * @param dmlBeforeValue The value of dmlBeforeValue as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlBeforeValue_LessEqual(String dmlBeforeValue) {
        regDmlBeforeValue(CK_LE, fRES(dmlBeforeValue));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DML_BEFORE_VALUE: {varchar(255)}
     * @param dmlBeforeValueList The collection of dmlBeforeValue as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlBeforeValue_InScope(Collection<String> dmlBeforeValueList) {
        doSetDmlBeforeValue_InScope(dmlBeforeValueList);
    }

    protected void doSetDmlBeforeValue_InScope(Collection<String> dmlBeforeValueList) {
        regINS(CK_INS, cTL(dmlBeforeValueList), xgetCValueDmlBeforeValue(), "DML_BEFORE_VALUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DML_BEFORE_VALUE: {varchar(255)}
     * @param dmlBeforeValueList The collection of dmlBeforeValue as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlBeforeValue_NotInScope(Collection<String> dmlBeforeValueList) {
        doSetDmlBeforeValue_NotInScope(dmlBeforeValueList);
    }

    protected void doSetDmlBeforeValue_NotInScope(Collection<String> dmlBeforeValueList) {
        regINS(CK_NINS, cTL(dmlBeforeValueList), xgetCValueDmlBeforeValue(), "DML_BEFORE_VALUE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DML_BEFORE_VALUE: {varchar(255)} <br>
     * <pre>e.g. setDmlBeforeValue_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dmlBeforeValue The value of dmlBeforeValue as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDmlBeforeValue_LikeSearch(String dmlBeforeValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dmlBeforeValue), xgetCValueDmlBeforeValue(), "DML_BEFORE_VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DML_BEFORE_VALUE: {varchar(255)}
     * @param dmlBeforeValue The value of dmlBeforeValue as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDmlBeforeValue_NotLikeSearch(String dmlBeforeValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dmlBeforeValue), xgetCValueDmlBeforeValue(), "DML_BEFORE_VALUE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DML_BEFORE_VALUE: {varchar(255)}
     * @param dmlBeforeValue The value of dmlBeforeValue as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlBeforeValue_PrefixSearch(String dmlBeforeValue) {
        setDmlBeforeValue_LikeSearch(dmlBeforeValue, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DML_BEFORE_VALUE: {varchar(255)}
     */
    public void setDmlBeforeValue_IsNull() { regDmlBeforeValue(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DML_BEFORE_VALUE: {varchar(255)}
     */
    public void setDmlBeforeValue_IsNullOrEmpty() { regDmlBeforeValue(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DML_BEFORE_VALUE: {varchar(255)}
     */
    public void setDmlBeforeValue_IsNotNull() { regDmlBeforeValue(CK_ISNN, DOBJ); }

    protected void regDmlBeforeValue(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDmlBeforeValue(), "DML_BEFORE_VALUE"); }
    protected abstract ConditionValue xgetCValueDmlBeforeValue();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_AFTER_VALUE: {varchar(255)}
     * @param dmlAfterValue The value of dmlAfterValue as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlAfterValue_Equal(String dmlAfterValue) {
        doSetDmlAfterValue_Equal(fRES(dmlAfterValue));
    }

    protected void doSetDmlAfterValue_Equal(String dmlAfterValue) {
        regDmlAfterValue(CK_EQ, dmlAfterValue);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_AFTER_VALUE: {varchar(255)}
     * @param dmlAfterValue The value of dmlAfterValue as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlAfterValue_NotEqual(String dmlAfterValue) {
        doSetDmlAfterValue_NotEqual(fRES(dmlAfterValue));
    }

    protected void doSetDmlAfterValue_NotEqual(String dmlAfterValue) {
        regDmlAfterValue(CK_NES, dmlAfterValue);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_AFTER_VALUE: {varchar(255)}
     * @param dmlAfterValue The value of dmlAfterValue as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlAfterValue_GreaterThan(String dmlAfterValue) {
        regDmlAfterValue(CK_GT, fRES(dmlAfterValue));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_AFTER_VALUE: {varchar(255)}
     * @param dmlAfterValue The value of dmlAfterValue as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlAfterValue_LessThan(String dmlAfterValue) {
        regDmlAfterValue(CK_LT, fRES(dmlAfterValue));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_AFTER_VALUE: {varchar(255)}
     * @param dmlAfterValue The value of dmlAfterValue as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlAfterValue_GreaterEqual(String dmlAfterValue) {
        regDmlAfterValue(CK_GE, fRES(dmlAfterValue));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DML_AFTER_VALUE: {varchar(255)}
     * @param dmlAfterValue The value of dmlAfterValue as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlAfterValue_LessEqual(String dmlAfterValue) {
        regDmlAfterValue(CK_LE, fRES(dmlAfterValue));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DML_AFTER_VALUE: {varchar(255)}
     * @param dmlAfterValueList The collection of dmlAfterValue as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlAfterValue_InScope(Collection<String> dmlAfterValueList) {
        doSetDmlAfterValue_InScope(dmlAfterValueList);
    }

    protected void doSetDmlAfterValue_InScope(Collection<String> dmlAfterValueList) {
        regINS(CK_INS, cTL(dmlAfterValueList), xgetCValueDmlAfterValue(), "DML_AFTER_VALUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DML_AFTER_VALUE: {varchar(255)}
     * @param dmlAfterValueList The collection of dmlAfterValue as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlAfterValue_NotInScope(Collection<String> dmlAfterValueList) {
        doSetDmlAfterValue_NotInScope(dmlAfterValueList);
    }

    protected void doSetDmlAfterValue_NotInScope(Collection<String> dmlAfterValueList) {
        regINS(CK_NINS, cTL(dmlAfterValueList), xgetCValueDmlAfterValue(), "DML_AFTER_VALUE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DML_AFTER_VALUE: {varchar(255)} <br>
     * <pre>e.g. setDmlAfterValue_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dmlAfterValue The value of dmlAfterValue as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDmlAfterValue_LikeSearch(String dmlAfterValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dmlAfterValue), xgetCValueDmlAfterValue(), "DML_AFTER_VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DML_AFTER_VALUE: {varchar(255)}
     * @param dmlAfterValue The value of dmlAfterValue as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDmlAfterValue_NotLikeSearch(String dmlAfterValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dmlAfterValue), xgetCValueDmlAfterValue(), "DML_AFTER_VALUE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DML_AFTER_VALUE: {varchar(255)}
     * @param dmlAfterValue The value of dmlAfterValue as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmlAfterValue_PrefixSearch(String dmlAfterValue) {
        setDmlAfterValue_LikeSearch(dmlAfterValue, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DML_AFTER_VALUE: {varchar(255)}
     */
    public void setDmlAfterValue_IsNull() { regDmlAfterValue(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DML_AFTER_VALUE: {varchar(255)}
     */
    public void setDmlAfterValue_IsNullOrEmpty() { regDmlAfterValue(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DML_AFTER_VALUE: {varchar(255)}
     */
    public void setDmlAfterValue_IsNotNull() { regDmlAfterValue(CK_ISNN, DOBJ); }

    protected void regDmlAfterValue(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDmlAfterValue(), "DML_AFTER_VALUE"); }
    protected abstract ConditionValue xgetCValueDmlAfterValue();

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
    public HpSLCFunction<BDmlLogCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BDmlLogCB.class);
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
    public HpSLCFunction<BDmlLogCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BDmlLogCB.class);
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
    public HpSLCFunction<BDmlLogCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BDmlLogCB.class);
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
    public HpSLCFunction<BDmlLogCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BDmlLogCB.class);
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
    public HpSLCFunction<BDmlLogCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BDmlLogCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BDmlLogCB&gt;() {
     *     public void query(BDmlLogCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BDmlLogCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BDmlLogCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BDmlLogCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BDmlLogCQ sq);

    protected BDmlLogCB xcreateScalarConditionCB() {
        BDmlLogCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BDmlLogCB xcreateScalarConditionPartitionByCB() {
        BDmlLogCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BDmlLogCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BDmlLogCB cb = new BDmlLogCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DML_LOG_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BDmlLogCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BDmlLogCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BDmlLogCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BDmlLogCB cb = new BDmlLogCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DML_LOG_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BDmlLogCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BDmlLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BDmlLogCB cb = new BDmlLogCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BDmlLogCQ sq);

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
    protected BDmlLogCB newMyCB() {
        return new BDmlLogCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BDmlLogCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
