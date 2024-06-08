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
 * The abstract condition-query of B_LOG.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBLogCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBLogCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_LOG";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param logId The value of logId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogId_Equal(Long logId) {
        doSetLogId_Equal(logId);
    }

    protected void doSetLogId_Equal(Long logId) {
        regLogId(CK_EQ, logId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param logId The value of logId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogId_NotEqual(Long logId) {
        doSetLogId_NotEqual(logId);
    }

    protected void doSetLogId_NotEqual(Long logId) {
        regLogId(CK_NES, logId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param logId The value of logId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogId_GreaterThan(Long logId) {
        regLogId(CK_GT, logId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param logId The value of logId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogId_LessThan(Long logId) {
        regLogId(CK_LT, logId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param logId The value of logId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogId_GreaterEqual(Long logId) {
        regLogId(CK_GE, logId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param logId The value of logId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogId_LessEqual(Long logId) {
        regLogId(CK_LE, logId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of logId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of logId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLogId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLogId(), "LOG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param logIdList The collection of logId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogId_InScope(Collection<Long> logIdList) {
        doSetLogId_InScope(logIdList);
    }

    protected void doSetLogId_InScope(Collection<Long> logIdList) {
        regINS(CK_INS, cTL(logIdList), xgetCValueLogId(), "LOG_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param logIdList The collection of logId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogId_NotInScope(Collection<Long> logIdList) {
        doSetLogId_NotInScope(logIdList);
    }

    protected void doSetLogId_NotInScope(Collection<Long> logIdList) {
        regINS(CK_NINS, cTL(logIdList), xgetCValueLogId(), "LOG_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOG_ID from B_LOG_DTL where ...)} <br>
     * B_LOG_DTL by LOG_ID, named 'BLogDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBLogDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BLogDtlList for 'exists'. (NotNull)
     */
    public void existsBLogDtlList(SubQuery<BLogDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BLogDtlCB cb = new BLogDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLogId_ExistsReferrer_BLogDtlList(cb.query());
        registerExistsReferrer(cb.query(), "LOG_ID", "LOG_ID", pp, "bLogDtlList");
    }
    public abstract String keepLogId_ExistsReferrer_BLogDtlList(BLogDtlCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOG_ID from B_LOG_DTL where ...)} <br>
     * B_LOG_DTL by LOG_ID, named 'BLogDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBLogDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LogId_NotExistsReferrer_BLogDtlList for 'not exists'. (NotNull)
     */
    public void notExistsBLogDtlList(SubQuery<BLogDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BLogDtlCB cb = new BLogDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLogId_NotExistsReferrer_BLogDtlList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOG_ID", "LOG_ID", pp, "bLogDtlList");
    }
    public abstract String keepLogId_NotExistsReferrer_BLogDtlList(BLogDtlCQ sq);

    public void xsderiveBLogDtlList(String fn, SubQuery<BLogDtlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BLogDtlCB cb = new BLogDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLogId_SpecifyDerivedReferrer_BLogDtlList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOG_ID", "LOG_ID", pp, "bLogDtlList", al, op);
    }
    public abstract String keepLogId_SpecifyDerivedReferrer_BLogDtlList(BLogDtlCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_LOG_DTL where ...)} <br>
     * B_LOG_DTL by LOG_ID, named 'BLogDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBLogDtlList()</span>.<span style="color: #CC4747">max</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     dtlCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BLogDtlCB> derivedBLogDtlList() {
        return xcreateQDRFunctionBLogDtlList();
    }
    protected HpQDRFunction<BLogDtlCB> xcreateQDRFunctionBLogDtlList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBLogDtlList(fn, sq, rd, vl, op));
    }
    public void xqderiveBLogDtlList(String fn, SubQuery<BLogDtlCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BLogDtlCB cb = new BLogDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLogId_QueryDerivedReferrer_BLogDtlList(cb.query()); String prpp = keepLogId_QueryDerivedReferrer_BLogDtlListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOG_ID", "LOG_ID", sqpp, "bLogDtlList", rd, vl, prpp, op);
    }
    public abstract String keepLogId_QueryDerivedReferrer_BLogDtlList(BLogDtlCQ sq);
    public abstract String keepLogId_QueryDerivedReferrer_BLogDtlListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setLogId_IsNull() { regLogId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setLogId_IsNotNull() { regLogId(CK_ISNN, DOBJ); }

    protected void regLogId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogId(), "LOG_ID"); }
    protected abstract ConditionValue xgetCValueLogId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus}
     * @param logStatus The value of logStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogStatus_Equal(String logStatus) {
        doSetLogStatus_Equal(fRES(logStatus));
    }

    /**
     * Equal(=). As LogStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus} <br>
     * ログステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLogStatus_Equal_AsLogStatus(CDef.LogStatus cdef) {
        doSetLogStatus_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 処理中
     */
    public void setLogStatus_Equal_$1() {
        setLogStatus_Equal_AsLogStatus(CDef.LogStatus.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 正常終了
     */
    public void setLogStatus_Equal_$2() {
        setLogStatus_Equal_AsLogStatus(CDef.LogStatus.$2);
    }

    /**
     * Equal(=). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: 異常終了
     */
    public void setLogStatus_Equal_$3() {
        setLogStatus_Equal_AsLogStatus(CDef.LogStatus.$3);
    }

    protected void doSetLogStatus_Equal(String logStatus) {
        regLogStatus(CK_EQ, logStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus}
     * @param logStatus The value of logStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogStatus_NotEqual(String logStatus) {
        doSetLogStatus_NotEqual(fRES(logStatus));
    }

    /**
     * NotEqual(&lt;&gt;). As LogStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus} <br>
     * ログステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLogStatus_NotEqual_AsLogStatus(CDef.LogStatus cdef) {
        doSetLogStatus_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 処理中
     */
    public void setLogStatus_NotEqual_$1() {
        setLogStatus_NotEqual_AsLogStatus(CDef.LogStatus.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 正常終了
     */
    public void setLogStatus_NotEqual_$2() {
        setLogStatus_NotEqual_AsLogStatus(CDef.LogStatus.$2);
    }

    /**
     * NotEqual(&lt;&gt;). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: 異常終了
     */
    public void setLogStatus_NotEqual_$3() {
        setLogStatus_NotEqual_AsLogStatus(CDef.LogStatus.$3);
    }

    protected void doSetLogStatus_NotEqual(String logStatus) {
        regLogStatus(CK_NES, logStatus);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus}
     * @param logStatusList The collection of logStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogStatus_InScope(Collection<String> logStatusList) {
        doSetLogStatus_InScope(logStatusList);
    }

    /**
     * InScope {in ('a', 'b')}. As LogStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus} <br>
     * ログステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogStatus_InScope_AsLogStatus(Collection<CDef.LogStatus> cdefList) {
        doSetLogStatus_InScope(cTStrL(cdefList));
    }

    protected void doSetLogStatus_InScope(Collection<String> logStatusList) {
        regINS(CK_INS, cTL(logStatusList), xgetCValueLogStatus(), "LOG_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus}
     * @param logStatusList The collection of logStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogStatus_NotInScope(Collection<String> logStatusList) {
        doSetLogStatus_NotInScope(logStatusList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LogStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus} <br>
     * ログステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogStatus_NotInScope_AsLogStatus(Collection<CDef.LogStatus> cdefList) {
        doSetLogStatus_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLogStatus_NotInScope(Collection<String> logStatusList) {
        regINS(CK_NINS, cTL(logStatusList), xgetCValueLogStatus(), "LOG_STATUS");
    }

    protected void regLogStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogStatus(), "LOG_STATUS"); }
    protected abstract ConditionValue xgetCValueLogStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_CD: {varchar(100)}
     * @param logGroupCd The value of logGroupCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupCd_Equal(String logGroupCd) {
        doSetLogGroupCd_Equal(fRES(logGroupCd));
    }

    protected void doSetLogGroupCd_Equal(String logGroupCd) {
        regLogGroupCd(CK_EQ, logGroupCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_CD: {varchar(100)}
     * @param logGroupCd The value of logGroupCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupCd_NotEqual(String logGroupCd) {
        doSetLogGroupCd_NotEqual(fRES(logGroupCd));
    }

    protected void doSetLogGroupCd_NotEqual(String logGroupCd) {
        regLogGroupCd(CK_NES, logGroupCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_CD: {varchar(100)}
     * @param logGroupCd The value of logGroupCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupCd_GreaterThan(String logGroupCd) {
        regLogGroupCd(CK_GT, fRES(logGroupCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_CD: {varchar(100)}
     * @param logGroupCd The value of logGroupCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupCd_LessThan(String logGroupCd) {
        regLogGroupCd(CK_LT, fRES(logGroupCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_CD: {varchar(100)}
     * @param logGroupCd The value of logGroupCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupCd_GreaterEqual(String logGroupCd) {
        regLogGroupCd(CK_GE, fRES(logGroupCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_CD: {varchar(100)}
     * @param logGroupCd The value of logGroupCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupCd_LessEqual(String logGroupCd) {
        regLogGroupCd(CK_LE, fRES(logGroupCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_GROUP_CD: {varchar(100)}
     * @param logGroupCdList The collection of logGroupCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupCd_InScope(Collection<String> logGroupCdList) {
        doSetLogGroupCd_InScope(logGroupCdList);
    }

    protected void doSetLogGroupCd_InScope(Collection<String> logGroupCdList) {
        regINS(CK_INS, cTL(logGroupCdList), xgetCValueLogGroupCd(), "LOG_GROUP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_GROUP_CD: {varchar(100)}
     * @param logGroupCdList The collection of logGroupCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupCd_NotInScope(Collection<String> logGroupCdList) {
        doSetLogGroupCd_NotInScope(logGroupCdList);
    }

    protected void doSetLogGroupCd_NotInScope(Collection<String> logGroupCdList) {
        regINS(CK_NINS, cTL(logGroupCdList), xgetCValueLogGroupCd(), "LOG_GROUP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOG_GROUP_CD: {varchar(100)} <br>
     * <pre>e.g. setLogGroupCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logGroupCd The value of logGroupCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogGroupCd_LikeSearch(String logGroupCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logGroupCd), xgetCValueLogGroupCd(), "LOG_GROUP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOG_GROUP_CD: {varchar(100)}
     * @param logGroupCd The value of logGroupCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogGroupCd_NotLikeSearch(String logGroupCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logGroupCd), xgetCValueLogGroupCd(), "LOG_GROUP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOG_GROUP_CD: {varchar(100)}
     * @param logGroupCd The value of logGroupCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupCd_PrefixSearch(String logGroupCd) {
        setLogGroupCd_LikeSearch(logGroupCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOG_GROUP_CD: {varchar(100)}
     */
    public void setLogGroupCd_IsNull() { regLogGroupCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOG_GROUP_CD: {varchar(100)}
     */
    public void setLogGroupCd_IsNullOrEmpty() { regLogGroupCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOG_GROUP_CD: {varchar(100)}
     */
    public void setLogGroupCd_IsNotNull() { regLogGroupCd(CK_ISNN, DOBJ); }

    protected void regLogGroupCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogGroupCd(), "LOG_GROUP_CD"); }
    protected abstract ConditionValue xgetCValueLogGroupCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_NM: {varchar(60)}
     * @param logGroupNm The value of logGroupNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupNm_Equal(String logGroupNm) {
        doSetLogGroupNm_Equal(fRES(logGroupNm));
    }

    protected void doSetLogGroupNm_Equal(String logGroupNm) {
        regLogGroupNm(CK_EQ, logGroupNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_NM: {varchar(60)}
     * @param logGroupNm The value of logGroupNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupNm_NotEqual(String logGroupNm) {
        doSetLogGroupNm_NotEqual(fRES(logGroupNm));
    }

    protected void doSetLogGroupNm_NotEqual(String logGroupNm) {
        regLogGroupNm(CK_NES, logGroupNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_NM: {varchar(60)}
     * @param logGroupNm The value of logGroupNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupNm_GreaterThan(String logGroupNm) {
        regLogGroupNm(CK_GT, fRES(logGroupNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_NM: {varchar(60)}
     * @param logGroupNm The value of logGroupNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupNm_LessThan(String logGroupNm) {
        regLogGroupNm(CK_LT, fRES(logGroupNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_NM: {varchar(60)}
     * @param logGroupNm The value of logGroupNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupNm_GreaterEqual(String logGroupNm) {
        regLogGroupNm(CK_GE, fRES(logGroupNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_NM: {varchar(60)}
     * @param logGroupNm The value of logGroupNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupNm_LessEqual(String logGroupNm) {
        regLogGroupNm(CK_LE, fRES(logGroupNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_GROUP_NM: {varchar(60)}
     * @param logGroupNmList The collection of logGroupNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupNm_InScope(Collection<String> logGroupNmList) {
        doSetLogGroupNm_InScope(logGroupNmList);
    }

    protected void doSetLogGroupNm_InScope(Collection<String> logGroupNmList) {
        regINS(CK_INS, cTL(logGroupNmList), xgetCValueLogGroupNm(), "LOG_GROUP_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOG_GROUP_NM: {varchar(60)}
     * @param logGroupNmList The collection of logGroupNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupNm_NotInScope(Collection<String> logGroupNmList) {
        doSetLogGroupNm_NotInScope(logGroupNmList);
    }

    protected void doSetLogGroupNm_NotInScope(Collection<String> logGroupNmList) {
        regINS(CK_NINS, cTL(logGroupNmList), xgetCValueLogGroupNm(), "LOG_GROUP_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOG_GROUP_NM: {varchar(60)} <br>
     * <pre>e.g. setLogGroupNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logGroupNm The value of logGroupNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogGroupNm_LikeSearch(String logGroupNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logGroupNm), xgetCValueLogGroupNm(), "LOG_GROUP_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOG_GROUP_NM: {varchar(60)}
     * @param logGroupNm The value of logGroupNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogGroupNm_NotLikeSearch(String logGroupNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logGroupNm), xgetCValueLogGroupNm(), "LOG_GROUP_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOG_GROUP_NM: {varchar(60)}
     * @param logGroupNm The value of logGroupNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupNm_PrefixSearch(String logGroupNm) {
        setLogGroupNm_LikeSearch(logGroupNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOG_GROUP_NM: {varchar(60)}
     */
    public void setLogGroupNm_IsNull() { regLogGroupNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOG_GROUP_NM: {varchar(60)}
     */
    public void setLogGroupNm_IsNullOrEmpty() { regLogGroupNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOG_GROUP_NM: {varchar(60)}
     */
    public void setLogGroupNm_IsNotNull() { regLogGroupNm(CK_ISNN, DOBJ); }

    protected void regLogGroupNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogGroupNm(), "LOG_GROUP_NM"); }
    protected abstract ConditionValue xgetCValueLogGroupNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_PROCESS_ID: {bigint(19)}
     * @param logGroupProcessId The value of logGroupProcessId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogGroupProcessId_Equal(Long logGroupProcessId) {
        doSetLogGroupProcessId_Equal(logGroupProcessId);
    }

    protected void doSetLogGroupProcessId_Equal(Long logGroupProcessId) {
        regLogGroupProcessId(CK_EQ, logGroupProcessId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_PROCESS_ID: {bigint(19)}
     * @param logGroupProcessId The value of logGroupProcessId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogGroupProcessId_NotEqual(Long logGroupProcessId) {
        doSetLogGroupProcessId_NotEqual(logGroupProcessId);
    }

    protected void doSetLogGroupProcessId_NotEqual(Long logGroupProcessId) {
        regLogGroupProcessId(CK_NES, logGroupProcessId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_PROCESS_ID: {bigint(19)}
     * @param logGroupProcessId The value of logGroupProcessId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogGroupProcessId_GreaterThan(Long logGroupProcessId) {
        regLogGroupProcessId(CK_GT, logGroupProcessId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_PROCESS_ID: {bigint(19)}
     * @param logGroupProcessId The value of logGroupProcessId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogGroupProcessId_LessThan(Long logGroupProcessId) {
        regLogGroupProcessId(CK_LT, logGroupProcessId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_PROCESS_ID: {bigint(19)}
     * @param logGroupProcessId The value of logGroupProcessId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogGroupProcessId_GreaterEqual(Long logGroupProcessId) {
        regLogGroupProcessId(CK_GE, logGroupProcessId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_PROCESS_ID: {bigint(19)}
     * @param logGroupProcessId The value of logGroupProcessId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLogGroupProcessId_LessEqual(Long logGroupProcessId) {
        regLogGroupProcessId(CK_LE, logGroupProcessId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOG_GROUP_PROCESS_ID: {bigint(19)}
     * @param minNumber The min number of logGroupProcessId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of logGroupProcessId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLogGroupProcessId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLogGroupProcessId(), "LOG_GROUP_PROCESS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOG_GROUP_PROCESS_ID: {bigint(19)}
     * @param logGroupProcessIdList The collection of logGroupProcessId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupProcessId_InScope(Collection<Long> logGroupProcessIdList) {
        doSetLogGroupProcessId_InScope(logGroupProcessIdList);
    }

    protected void doSetLogGroupProcessId_InScope(Collection<Long> logGroupProcessIdList) {
        regINS(CK_INS, cTL(logGroupProcessIdList), xgetCValueLogGroupProcessId(), "LOG_GROUP_PROCESS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOG_GROUP_PROCESS_ID: {bigint(19)}
     * @param logGroupProcessIdList The collection of logGroupProcessId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogGroupProcessId_NotInScope(Collection<Long> logGroupProcessIdList) {
        doSetLogGroupProcessId_NotInScope(logGroupProcessIdList);
    }

    protected void doSetLogGroupProcessId_NotInScope(Collection<Long> logGroupProcessIdList) {
        regINS(CK_NINS, cTL(logGroupProcessIdList), xgetCValueLogGroupProcessId(), "LOG_GROUP_PROCESS_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOG_GROUP_PROCESS_ID: {bigint(19)}
     */
    public void setLogGroupProcessId_IsNull() { regLogGroupProcessId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOG_GROUP_PROCESS_ID: {bigint(19)}
     */
    public void setLogGroupProcessId_IsNotNull() { regLogGroupProcessId(CK_ISNN, DOBJ); }

    protected void regLogGroupProcessId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogGroupProcessId(), "LOG_GROUP_PROCESS_ID"); }
    protected abstract ConditionValue xgetCValueLogGroupProcessId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PGM_CD: {varchar(100)}
     * @param pgmCd The value of pgmCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmCd_Equal(String pgmCd) {
        doSetPgmCd_Equal(fRES(pgmCd));
    }

    protected void doSetPgmCd_Equal(String pgmCd) {
        regPgmCd(CK_EQ, pgmCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PGM_CD: {varchar(100)}
     * @param pgmCd The value of pgmCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmCd_NotEqual(String pgmCd) {
        doSetPgmCd_NotEqual(fRES(pgmCd));
    }

    protected void doSetPgmCd_NotEqual(String pgmCd) {
        regPgmCd(CK_NES, pgmCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PGM_CD: {varchar(100)}
     * @param pgmCd The value of pgmCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmCd_GreaterThan(String pgmCd) {
        regPgmCd(CK_GT, fRES(pgmCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PGM_CD: {varchar(100)}
     * @param pgmCd The value of pgmCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmCd_LessThan(String pgmCd) {
        regPgmCd(CK_LT, fRES(pgmCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PGM_CD: {varchar(100)}
     * @param pgmCd The value of pgmCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmCd_GreaterEqual(String pgmCd) {
        regPgmCd(CK_GE, fRES(pgmCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PGM_CD: {varchar(100)}
     * @param pgmCd The value of pgmCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmCd_LessEqual(String pgmCd) {
        regPgmCd(CK_LE, fRES(pgmCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PGM_CD: {varchar(100)}
     * @param pgmCdList The collection of pgmCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmCd_InScope(Collection<String> pgmCdList) {
        doSetPgmCd_InScope(pgmCdList);
    }

    protected void doSetPgmCd_InScope(Collection<String> pgmCdList) {
        regINS(CK_INS, cTL(pgmCdList), xgetCValuePgmCd(), "PGM_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PGM_CD: {varchar(100)}
     * @param pgmCdList The collection of pgmCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmCd_NotInScope(Collection<String> pgmCdList) {
        doSetPgmCd_NotInScope(pgmCdList);
    }

    protected void doSetPgmCd_NotInScope(Collection<String> pgmCdList) {
        regINS(CK_NINS, cTL(pgmCdList), xgetCValuePgmCd(), "PGM_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PGM_CD: {varchar(100)} <br>
     * <pre>e.g. setPgmCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pgmCd The value of pgmCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPgmCd_LikeSearch(String pgmCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pgmCd), xgetCValuePgmCd(), "PGM_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PGM_CD: {varchar(100)}
     * @param pgmCd The value of pgmCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPgmCd_NotLikeSearch(String pgmCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pgmCd), xgetCValuePgmCd(), "PGM_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PGM_CD: {varchar(100)}
     * @param pgmCd The value of pgmCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmCd_PrefixSearch(String pgmCd) {
        setPgmCd_LikeSearch(pgmCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PGM_CD: {varchar(100)}
     */
    public void setPgmCd_IsNull() { regPgmCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PGM_CD: {varchar(100)}
     */
    public void setPgmCd_IsNullOrEmpty() { regPgmCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PGM_CD: {varchar(100)}
     */
    public void setPgmCd_IsNotNull() { regPgmCd(CK_ISNN, DOBJ); }

    protected void regPgmCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePgmCd(), "PGM_CD"); }
    protected abstract ConditionValue xgetCValuePgmCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PGM_NM: {varchar(60)}
     * @param pgmNm The value of pgmNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmNm_Equal(String pgmNm) {
        doSetPgmNm_Equal(fRES(pgmNm));
    }

    protected void doSetPgmNm_Equal(String pgmNm) {
        regPgmNm(CK_EQ, pgmNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PGM_NM: {varchar(60)}
     * @param pgmNm The value of pgmNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmNm_NotEqual(String pgmNm) {
        doSetPgmNm_NotEqual(fRES(pgmNm));
    }

    protected void doSetPgmNm_NotEqual(String pgmNm) {
        regPgmNm(CK_NES, pgmNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PGM_NM: {varchar(60)}
     * @param pgmNm The value of pgmNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmNm_GreaterThan(String pgmNm) {
        regPgmNm(CK_GT, fRES(pgmNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PGM_NM: {varchar(60)}
     * @param pgmNm The value of pgmNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmNm_LessThan(String pgmNm) {
        regPgmNm(CK_LT, fRES(pgmNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PGM_NM: {varchar(60)}
     * @param pgmNm The value of pgmNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmNm_GreaterEqual(String pgmNm) {
        regPgmNm(CK_GE, fRES(pgmNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PGM_NM: {varchar(60)}
     * @param pgmNm The value of pgmNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmNm_LessEqual(String pgmNm) {
        regPgmNm(CK_LE, fRES(pgmNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PGM_NM: {varchar(60)}
     * @param pgmNmList The collection of pgmNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmNm_InScope(Collection<String> pgmNmList) {
        doSetPgmNm_InScope(pgmNmList);
    }

    protected void doSetPgmNm_InScope(Collection<String> pgmNmList) {
        regINS(CK_INS, cTL(pgmNmList), xgetCValuePgmNm(), "PGM_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PGM_NM: {varchar(60)}
     * @param pgmNmList The collection of pgmNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmNm_NotInScope(Collection<String> pgmNmList) {
        doSetPgmNm_NotInScope(pgmNmList);
    }

    protected void doSetPgmNm_NotInScope(Collection<String> pgmNmList) {
        regINS(CK_NINS, cTL(pgmNmList), xgetCValuePgmNm(), "PGM_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PGM_NM: {varchar(60)} <br>
     * <pre>e.g. setPgmNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pgmNm The value of pgmNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPgmNm_LikeSearch(String pgmNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pgmNm), xgetCValuePgmNm(), "PGM_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PGM_NM: {varchar(60)}
     * @param pgmNm The value of pgmNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPgmNm_NotLikeSearch(String pgmNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pgmNm), xgetCValuePgmNm(), "PGM_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PGM_NM: {varchar(60)}
     * @param pgmNm The value of pgmNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPgmNm_PrefixSearch(String pgmNm) {
        setPgmNm_LikeSearch(pgmNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PGM_NM: {varchar(60)}
     */
    public void setPgmNm_IsNull() { regPgmNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PGM_NM: {varchar(60)}
     */
    public void setPgmNm_IsNullOrEmpty() { regPgmNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PGM_NM: {varchar(60)}
     */
    public void setPgmNm_IsNotNull() { regPgmNm(CK_ISNN, DOBJ); }

    protected void regPgmNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePgmNm(), "PGM_NM"); }
    protected abstract ConditionValue xgetCValuePgmNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_START_DT: {IX, NotNull, datetime2(26, 6)}
     * @param processStartDt The value of processStartDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessStartDt_Equal(java.sql.Timestamp processStartDt) {
        regProcessStartDt(CK_EQ,  processStartDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_START_DT: {IX, NotNull, datetime2(26, 6)}
     * @param processStartDt The value of processStartDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessStartDt_GreaterThan(java.sql.Timestamp processStartDt) {
        regProcessStartDt(CK_GT,  processStartDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_START_DT: {IX, NotNull, datetime2(26, 6)}
     * @param processStartDt The value of processStartDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessStartDt_LessThan(java.sql.Timestamp processStartDt) {
        regProcessStartDt(CK_LT,  processStartDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_START_DT: {IX, NotNull, datetime2(26, 6)}
     * @param processStartDt The value of processStartDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessStartDt_GreaterEqual(java.sql.Timestamp processStartDt) {
        regProcessStartDt(CK_GE,  processStartDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_START_DT: {IX, NotNull, datetime2(26, 6)}
     * @param processStartDt The value of processStartDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessStartDt_LessEqual(java.sql.Timestamp processStartDt) {
        regProcessStartDt(CK_LE, processStartDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_START_DT: {IX, NotNull, datetime2(26, 6)}
     * <pre>e.g. setProcessStartDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of processStartDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of processStartDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setProcessStartDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueProcessStartDt(), "PROCESS_START_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_START_DT: {IX, NotNull, datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of processStartDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of processStartDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setProcessStartDt_DateFromTo(Date fromDate, Date toDate) {
        setProcessStartDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    protected void regProcessStartDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessStartDt(), "PROCESS_START_DT"); }
    protected abstract ConditionValue xgetCValueProcessStartDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_END_DT: {IX, datetime2(26, 6)}
     * @param processEndDt The value of processEndDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessEndDt_Equal(java.sql.Timestamp processEndDt) {
        regProcessEndDt(CK_EQ,  processEndDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_END_DT: {IX, datetime2(26, 6)}
     * @param processEndDt The value of processEndDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessEndDt_GreaterThan(java.sql.Timestamp processEndDt) {
        regProcessEndDt(CK_GT,  processEndDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_END_DT: {IX, datetime2(26, 6)}
     * @param processEndDt The value of processEndDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessEndDt_LessThan(java.sql.Timestamp processEndDt) {
        regProcessEndDt(CK_LT,  processEndDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_END_DT: {IX, datetime2(26, 6)}
     * @param processEndDt The value of processEndDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessEndDt_GreaterEqual(java.sql.Timestamp processEndDt) {
        regProcessEndDt(CK_GE,  processEndDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_END_DT: {IX, datetime2(26, 6)}
     * @param processEndDt The value of processEndDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessEndDt_LessEqual(java.sql.Timestamp processEndDt) {
        regProcessEndDt(CK_LE, processEndDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_END_DT: {IX, datetime2(26, 6)}
     * <pre>e.g. setProcessEndDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of processEndDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of processEndDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setProcessEndDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueProcessEndDt(), "PROCESS_END_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_END_DT: {IX, datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of processEndDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of processEndDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setProcessEndDt_DateFromTo(Date fromDate, Date toDate) {
        setProcessEndDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROCESS_END_DT: {IX, datetime2(26, 6)}
     */
    public void setProcessEndDt_IsNull() { regProcessEndDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROCESS_END_DT: {IX, datetime2(26, 6)}
     */
    public void setProcessEndDt_IsNotNull() { regProcessEndDt(CK_ISNN, DOBJ); }

    protected void regProcessEndDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessEndDt(), "PROCESS_END_DT"); }
    protected abstract ConditionValue xgetCValueProcessEndDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1 The value of attribute1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_Equal(String attribute1) {
        doSetAttribute1_Equal(fRES(attribute1));
    }

    protected void doSetAttribute1_Equal(String attribute1) {
        regAttribute1(CK_EQ, attribute1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1 The value of attribute1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_NotEqual(String attribute1) {
        doSetAttribute1_NotEqual(fRES(attribute1));
    }

    protected void doSetAttribute1_NotEqual(String attribute1) {
        regAttribute1(CK_NES, attribute1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1 The value of attribute1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_GreaterThan(String attribute1) {
        regAttribute1(CK_GT, fRES(attribute1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1 The value of attribute1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_LessThan(String attribute1) {
        regAttribute1(CK_LT, fRES(attribute1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1 The value of attribute1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_GreaterEqual(String attribute1) {
        regAttribute1(CK_GE, fRES(attribute1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1 The value of attribute1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_LessEqual(String attribute1) {
        regAttribute1(CK_LE, fRES(attribute1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1List The collection of attribute1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_InScope(Collection<String> attribute1List) {
        doSetAttribute1_InScope(attribute1List);
    }

    protected void doSetAttribute1_InScope(Collection<String> attribute1List) {
        regINS(CK_INS, cTL(attribute1List), xgetCValueAttribute1(), "ATTRIBUTE1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1List The collection of attribute1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_NotInScope(Collection<String> attribute1List) {
        doSetAttribute1_NotInScope(attribute1List);
    }

    protected void doSetAttribute1_NotInScope(Collection<String> attribute1List) {
        regINS(CK_NINS, cTL(attribute1List), xgetCValueAttribute1(), "ATTRIBUTE1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE1: {varchar(100)} <br>
     * <pre>e.g. setAttribute1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param attribute1 The value of attribute1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAttribute1_LikeSearch(String attribute1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(attribute1), xgetCValueAttribute1(), "ATTRIBUTE1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1 The value of attribute1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAttribute1_NotLikeSearch(String attribute1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(attribute1), xgetCValueAttribute1(), "ATTRIBUTE1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @param attribute1 The value of attribute1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute1_PrefixSearch(String attribute1) {
        setAttribute1_LikeSearch(attribute1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     */
    public void setAttribute1_IsNull() { regAttribute1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     */
    public void setAttribute1_IsNullOrEmpty() { regAttribute1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE1: {varchar(100)}
     */
    public void setAttribute1_IsNotNull() { regAttribute1(CK_ISNN, DOBJ); }

    protected void regAttribute1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAttribute1(), "ATTRIBUTE1"); }
    protected abstract ConditionValue xgetCValueAttribute1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2 The value of attribute2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_Equal(String attribute2) {
        doSetAttribute2_Equal(fRES(attribute2));
    }

    protected void doSetAttribute2_Equal(String attribute2) {
        regAttribute2(CK_EQ, attribute2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2 The value of attribute2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_NotEqual(String attribute2) {
        doSetAttribute2_NotEqual(fRES(attribute2));
    }

    protected void doSetAttribute2_NotEqual(String attribute2) {
        regAttribute2(CK_NES, attribute2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2 The value of attribute2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_GreaterThan(String attribute2) {
        regAttribute2(CK_GT, fRES(attribute2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2 The value of attribute2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_LessThan(String attribute2) {
        regAttribute2(CK_LT, fRES(attribute2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2 The value of attribute2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_GreaterEqual(String attribute2) {
        regAttribute2(CK_GE, fRES(attribute2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2 The value of attribute2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_LessEqual(String attribute2) {
        regAttribute2(CK_LE, fRES(attribute2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2List The collection of attribute2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_InScope(Collection<String> attribute2List) {
        doSetAttribute2_InScope(attribute2List);
    }

    protected void doSetAttribute2_InScope(Collection<String> attribute2List) {
        regINS(CK_INS, cTL(attribute2List), xgetCValueAttribute2(), "ATTRIBUTE2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2List The collection of attribute2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_NotInScope(Collection<String> attribute2List) {
        doSetAttribute2_NotInScope(attribute2List);
    }

    protected void doSetAttribute2_NotInScope(Collection<String> attribute2List) {
        regINS(CK_NINS, cTL(attribute2List), xgetCValueAttribute2(), "ATTRIBUTE2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE2: {varchar(100)} <br>
     * <pre>e.g. setAttribute2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param attribute2 The value of attribute2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAttribute2_LikeSearch(String attribute2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(attribute2), xgetCValueAttribute2(), "ATTRIBUTE2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2 The value of attribute2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAttribute2_NotLikeSearch(String attribute2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(attribute2), xgetCValueAttribute2(), "ATTRIBUTE2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @param attribute2 The value of attribute2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute2_PrefixSearch(String attribute2) {
        setAttribute2_LikeSearch(attribute2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     */
    public void setAttribute2_IsNull() { regAttribute2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     */
    public void setAttribute2_IsNullOrEmpty() { regAttribute2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE2: {varchar(100)}
     */
    public void setAttribute2_IsNotNull() { regAttribute2(CK_ISNN, DOBJ); }

    protected void regAttribute2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAttribute2(), "ATTRIBUTE2"); }
    protected abstract ConditionValue xgetCValueAttribute2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3 The value of attribute3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_Equal(String attribute3) {
        doSetAttribute3_Equal(fRES(attribute3));
    }

    protected void doSetAttribute3_Equal(String attribute3) {
        regAttribute3(CK_EQ, attribute3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3 The value of attribute3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_NotEqual(String attribute3) {
        doSetAttribute3_NotEqual(fRES(attribute3));
    }

    protected void doSetAttribute3_NotEqual(String attribute3) {
        regAttribute3(CK_NES, attribute3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3 The value of attribute3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_GreaterThan(String attribute3) {
        regAttribute3(CK_GT, fRES(attribute3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3 The value of attribute3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_LessThan(String attribute3) {
        regAttribute3(CK_LT, fRES(attribute3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3 The value of attribute3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_GreaterEqual(String attribute3) {
        regAttribute3(CK_GE, fRES(attribute3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3 The value of attribute3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_LessEqual(String attribute3) {
        regAttribute3(CK_LE, fRES(attribute3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3List The collection of attribute3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_InScope(Collection<String> attribute3List) {
        doSetAttribute3_InScope(attribute3List);
    }

    protected void doSetAttribute3_InScope(Collection<String> attribute3List) {
        regINS(CK_INS, cTL(attribute3List), xgetCValueAttribute3(), "ATTRIBUTE3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3List The collection of attribute3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_NotInScope(Collection<String> attribute3List) {
        doSetAttribute3_NotInScope(attribute3List);
    }

    protected void doSetAttribute3_NotInScope(Collection<String> attribute3List) {
        regINS(CK_NINS, cTL(attribute3List), xgetCValueAttribute3(), "ATTRIBUTE3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE3: {varchar(100)} <br>
     * <pre>e.g. setAttribute3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param attribute3 The value of attribute3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAttribute3_LikeSearch(String attribute3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(attribute3), xgetCValueAttribute3(), "ATTRIBUTE3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3 The value of attribute3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAttribute3_NotLikeSearch(String attribute3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(attribute3), xgetCValueAttribute3(), "ATTRIBUTE3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @param attribute3 The value of attribute3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute3_PrefixSearch(String attribute3) {
        setAttribute3_LikeSearch(attribute3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     */
    public void setAttribute3_IsNull() { regAttribute3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     */
    public void setAttribute3_IsNullOrEmpty() { regAttribute3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE3: {varchar(100)}
     */
    public void setAttribute3_IsNotNull() { regAttribute3(CK_ISNN, DOBJ); }

    protected void regAttribute3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAttribute3(), "ATTRIBUTE3"); }
    protected abstract ConditionValue xgetCValueAttribute3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4 The value of attribute4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_Equal(String attribute4) {
        doSetAttribute4_Equal(fRES(attribute4));
    }

    protected void doSetAttribute4_Equal(String attribute4) {
        regAttribute4(CK_EQ, attribute4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4 The value of attribute4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_NotEqual(String attribute4) {
        doSetAttribute4_NotEqual(fRES(attribute4));
    }

    protected void doSetAttribute4_NotEqual(String attribute4) {
        regAttribute4(CK_NES, attribute4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4 The value of attribute4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_GreaterThan(String attribute4) {
        regAttribute4(CK_GT, fRES(attribute4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4 The value of attribute4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_LessThan(String attribute4) {
        regAttribute4(CK_LT, fRES(attribute4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4 The value of attribute4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_GreaterEqual(String attribute4) {
        regAttribute4(CK_GE, fRES(attribute4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4 The value of attribute4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_LessEqual(String attribute4) {
        regAttribute4(CK_LE, fRES(attribute4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4List The collection of attribute4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_InScope(Collection<String> attribute4List) {
        doSetAttribute4_InScope(attribute4List);
    }

    protected void doSetAttribute4_InScope(Collection<String> attribute4List) {
        regINS(CK_INS, cTL(attribute4List), xgetCValueAttribute4(), "ATTRIBUTE4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4List The collection of attribute4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_NotInScope(Collection<String> attribute4List) {
        doSetAttribute4_NotInScope(attribute4List);
    }

    protected void doSetAttribute4_NotInScope(Collection<String> attribute4List) {
        regINS(CK_NINS, cTL(attribute4List), xgetCValueAttribute4(), "ATTRIBUTE4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE4: {varchar(100)} <br>
     * <pre>e.g. setAttribute4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param attribute4 The value of attribute4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAttribute4_LikeSearch(String attribute4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(attribute4), xgetCValueAttribute4(), "ATTRIBUTE4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4 The value of attribute4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAttribute4_NotLikeSearch(String attribute4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(attribute4), xgetCValueAttribute4(), "ATTRIBUTE4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @param attribute4 The value of attribute4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute4_PrefixSearch(String attribute4) {
        setAttribute4_LikeSearch(attribute4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     */
    public void setAttribute4_IsNull() { regAttribute4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     */
    public void setAttribute4_IsNullOrEmpty() { regAttribute4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE4: {varchar(100)}
     */
    public void setAttribute4_IsNotNull() { regAttribute4(CK_ISNN, DOBJ); }

    protected void regAttribute4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAttribute4(), "ATTRIBUTE4"); }
    protected abstract ConditionValue xgetCValueAttribute4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5 The value of attribute5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_Equal(String attribute5) {
        doSetAttribute5_Equal(fRES(attribute5));
    }

    protected void doSetAttribute5_Equal(String attribute5) {
        regAttribute5(CK_EQ, attribute5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5 The value of attribute5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_NotEqual(String attribute5) {
        doSetAttribute5_NotEqual(fRES(attribute5));
    }

    protected void doSetAttribute5_NotEqual(String attribute5) {
        regAttribute5(CK_NES, attribute5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5 The value of attribute5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_GreaterThan(String attribute5) {
        regAttribute5(CK_GT, fRES(attribute5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5 The value of attribute5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_LessThan(String attribute5) {
        regAttribute5(CK_LT, fRES(attribute5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5 The value of attribute5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_GreaterEqual(String attribute5) {
        regAttribute5(CK_GE, fRES(attribute5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5 The value of attribute5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_LessEqual(String attribute5) {
        regAttribute5(CK_LE, fRES(attribute5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5List The collection of attribute5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_InScope(Collection<String> attribute5List) {
        doSetAttribute5_InScope(attribute5List);
    }

    protected void doSetAttribute5_InScope(Collection<String> attribute5List) {
        regINS(CK_INS, cTL(attribute5List), xgetCValueAttribute5(), "ATTRIBUTE5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5List The collection of attribute5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_NotInScope(Collection<String> attribute5List) {
        doSetAttribute5_NotInScope(attribute5List);
    }

    protected void doSetAttribute5_NotInScope(Collection<String> attribute5List) {
        regINS(CK_NINS, cTL(attribute5List), xgetCValueAttribute5(), "ATTRIBUTE5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE5: {varchar(100)} <br>
     * <pre>e.g. setAttribute5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param attribute5 The value of attribute5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAttribute5_LikeSearch(String attribute5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(attribute5), xgetCValueAttribute5(), "ATTRIBUTE5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5 The value of attribute5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAttribute5_NotLikeSearch(String attribute5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(attribute5), xgetCValueAttribute5(), "ATTRIBUTE5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @param attribute5 The value of attribute5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttribute5_PrefixSearch(String attribute5) {
        setAttribute5_LikeSearch(attribute5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     */
    public void setAttribute5_IsNull() { regAttribute5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     */
    public void setAttribute5_IsNullOrEmpty() { regAttribute5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ATTRIBUTE5: {varchar(100)}
     */
    public void setAttribute5_IsNotNull() { regAttribute5(CK_ISNN, DOBJ); }

    protected void regAttribute5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAttribute5(), "ATTRIBUTE5"); }
    protected abstract ConditionValue xgetCValueAttribute5();

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
    public HpSLCFunction<BLogCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BLogCB.class);
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
    public HpSLCFunction<BLogCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BLogCB.class);
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
    public HpSLCFunction<BLogCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BLogCB.class);
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
    public HpSLCFunction<BLogCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BLogCB.class);
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
    public HpSLCFunction<BLogCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BLogCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BLogCB&gt;() {
     *     public void query(BLogCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BLogCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BLogCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BLogCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BLogCQ sq);

    protected BLogCB xcreateScalarConditionCB() {
        BLogCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BLogCB xcreateScalarConditionPartitionByCB() {
        BLogCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BLogCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BLogCB cb = new BLogCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LOG_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BLogCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BLogCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BLogCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BLogCB cb = new BLogCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LOG_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BLogCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BLogCB cb = new BLogCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BLogCQ sq);

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
    protected BLogCB newMyCB() {
        return new BLogCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BLogCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
