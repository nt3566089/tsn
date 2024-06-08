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
 * The abstract condition-query of W_WORK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWWorkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWWorkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_WORK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param workId The value of workId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkId_Equal(Long workId) {
        doSetWorkId_Equal(workId);
    }

    protected void doSetWorkId_Equal(Long workId) {
        regWorkId(CK_EQ, workId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param workId The value of workId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkId_NotEqual(Long workId) {
        doSetWorkId_NotEqual(workId);
    }

    protected void doSetWorkId_NotEqual(Long workId) {
        regWorkId(CK_NES, workId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param workId The value of workId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkId_GreaterThan(Long workId) {
        regWorkId(CK_GT, workId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param workId The value of workId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkId_LessThan(Long workId) {
        regWorkId(CK_LT, workId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param workId The value of workId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkId_GreaterEqual(Long workId) {
        regWorkId(CK_GE, workId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param workId The value of workId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkId_LessEqual(Long workId) {
        regWorkId(CK_LE, workId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of workId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWorkId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkId(), "WORK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param workIdList The collection of workId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkId_InScope(Collection<Long> workIdList) {
        doSetWorkId_InScope(workIdList);
    }

    protected void doSetWorkId_InScope(Collection<Long> workIdList) {
        regINS(CK_INS, cTL(workIdList), xgetCValueWorkId(), "WORK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param workIdList The collection of workId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkId_NotInScope(Collection<Long> workIdList) {
        doSetWorkId_NotInScope(workIdList);
    }

    protected void doSetWorkId_NotInScope(Collection<Long> workIdList) {
        regINS(CK_NINS, cTL(workIdList), xgetCValueWorkId(), "WORK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setWorkId_IsNull() { regWorkId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setWorkId_IsNotNull() { regWorkId(CK_ISNN, DOBJ); }

    protected void regWorkId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkId(), "WORK_ID"); }
    protected abstract ConditionValue xgetCValueWorkId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_Equal(String centerCd) {
        doSetCenterCd_Equal(fRES(centerCd));
    }

    protected void doSetCenterCd_Equal(String centerCd) {
        regCenterCd(CK_EQ, centerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_NotEqual(String centerCd) {
        doSetCenterCd_NotEqual(fRES(centerCd));
    }

    protected void doSetCenterCd_NotEqual(String centerCd) {
        regCenterCd(CK_NES, centerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterThan(String centerCd) {
        regCenterCd(CK_GT, fRES(centerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessThan(String centerCd) {
        regCenterCd(CK_LT, fRES(centerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterEqual(String centerCd) {
        regCenterCd(CK_GE, fRES(centerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessEqual(String centerCd) {
        regCenterCd(CK_LE, fRES(centerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCdList The collection of centerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_InScope(Collection<String> centerCdList) {
        doSetCenterCd_InScope(centerCdList);
    }

    protected void doSetCenterCd_InScope(Collection<String> centerCdList) {
        regINS(CK_INS, cTL(centerCdList), xgetCValueCenterCd(), "CENTER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCdList The collection of centerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_NotInScope(Collection<String> centerCdList) {
        doSetCenterCd_NotInScope(centerCdList);
    }

    protected void doSetCenterCd_NotInScope(Collection<String> centerCdList) {
        regINS(CK_NINS, cTL(centerCdList), xgetCValueCenterCd(), "CENTER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(30)} <br>
     * <pre>e.g. setCenterCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param centerCd The value of centerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCenterCd_LikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterCd_NotLikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_PrefixSearch(String centerCd) {
        setCenterCd_LikeSearch(centerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     */
    public void setCenterCd_IsNull() { regCenterCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     */
    public void setCenterCd_IsNullOrEmpty() { regCenterCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     */
    public void setCenterCd_IsNotNull() { regCenterCd(CK_ISNN, DOBJ); }

    protected void regCenterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterCd(), "CENTER_CD"); }
    protected abstract ConditionValue xgetCValueCenterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_USER_CD: {varchar(30)}
     * @param workUserCd The value of workUserCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkUserCd_Equal(String workUserCd) {
        doSetWorkUserCd_Equal(fRES(workUserCd));
    }

    protected void doSetWorkUserCd_Equal(String workUserCd) {
        regWorkUserCd(CK_EQ, workUserCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_USER_CD: {varchar(30)}
     * @param workUserCd The value of workUserCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkUserCd_NotEqual(String workUserCd) {
        doSetWorkUserCd_NotEqual(fRES(workUserCd));
    }

    protected void doSetWorkUserCd_NotEqual(String workUserCd) {
        regWorkUserCd(CK_NES, workUserCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_USER_CD: {varchar(30)}
     * @param workUserCd The value of workUserCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkUserCd_GreaterThan(String workUserCd) {
        regWorkUserCd(CK_GT, fRES(workUserCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_USER_CD: {varchar(30)}
     * @param workUserCd The value of workUserCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkUserCd_LessThan(String workUserCd) {
        regWorkUserCd(CK_LT, fRES(workUserCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_USER_CD: {varchar(30)}
     * @param workUserCd The value of workUserCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkUserCd_GreaterEqual(String workUserCd) {
        regWorkUserCd(CK_GE, fRES(workUserCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_USER_CD: {varchar(30)}
     * @param workUserCd The value of workUserCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkUserCd_LessEqual(String workUserCd) {
        regWorkUserCd(CK_LE, fRES(workUserCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_USER_CD: {varchar(30)}
     * @param workUserCdList The collection of workUserCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkUserCd_InScope(Collection<String> workUserCdList) {
        doSetWorkUserCd_InScope(workUserCdList);
    }

    protected void doSetWorkUserCd_InScope(Collection<String> workUserCdList) {
        regINS(CK_INS, cTL(workUserCdList), xgetCValueWorkUserCd(), "WORK_USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_USER_CD: {varchar(30)}
     * @param workUserCdList The collection of workUserCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkUserCd_NotInScope(Collection<String> workUserCdList) {
        doSetWorkUserCd_NotInScope(workUserCdList);
    }

    protected void doSetWorkUserCd_NotInScope(Collection<String> workUserCdList) {
        regINS(CK_NINS, cTL(workUserCdList), xgetCValueWorkUserCd(), "WORK_USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_USER_CD: {varchar(30)} <br>
     * <pre>e.g. setWorkUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param workUserCd The value of workUserCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkUserCd_LikeSearch(String workUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workUserCd), xgetCValueWorkUserCd(), "WORK_USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_USER_CD: {varchar(30)}
     * @param workUserCd The value of workUserCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkUserCd_NotLikeSearch(String workUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workUserCd), xgetCValueWorkUserCd(), "WORK_USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_USER_CD: {varchar(30)}
     * @param workUserCd The value of workUserCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkUserCd_PrefixSearch(String workUserCd) {
        setWorkUserCd_LikeSearch(workUserCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_USER_CD: {varchar(30)}
     */
    public void setWorkUserCd_IsNull() { regWorkUserCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WORK_USER_CD: {varchar(30)}
     */
    public void setWorkUserCd_IsNullOrEmpty() { regWorkUserCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_USER_CD: {varchar(30)}
     */
    public void setWorkUserCd_IsNotNull() { regWorkUserCd(CK_ISNN, DOBJ); }

    protected void regWorkUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkUserCd(), "WORK_USER_CD"); }
    protected abstract ConditionValue xgetCValueWorkUserCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {varchar(8)}
     * @param workDt The value of workDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_Equal(String workDt) {
        doSetWorkDt_Equal(fRES(workDt));
    }

    protected void doSetWorkDt_Equal(String workDt) {
        regWorkDt(CK_EQ, workDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {varchar(8)}
     * @param workDt The value of workDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_NotEqual(String workDt) {
        doSetWorkDt_NotEqual(fRES(workDt));
    }

    protected void doSetWorkDt_NotEqual(String workDt) {
        regWorkDt(CK_NES, workDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {varchar(8)}
     * @param workDt The value of workDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_GreaterThan(String workDt) {
        regWorkDt(CK_GT, fRES(workDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {varchar(8)}
     * @param workDt The value of workDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_LessThan(String workDt) {
        regWorkDt(CK_LT, fRES(workDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {varchar(8)}
     * @param workDt The value of workDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_GreaterEqual(String workDt) {
        regWorkDt(CK_GE, fRES(workDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {varchar(8)}
     * @param workDt The value of workDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_LessEqual(String workDt) {
        regWorkDt(CK_LE, fRES(workDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_DT: {varchar(8)}
     * @param workDtList The collection of workDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_InScope(Collection<String> workDtList) {
        doSetWorkDt_InScope(workDtList);
    }

    protected void doSetWorkDt_InScope(Collection<String> workDtList) {
        regINS(CK_INS, cTL(workDtList), xgetCValueWorkDt(), "WORK_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_DT: {varchar(8)}
     * @param workDtList The collection of workDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_NotInScope(Collection<String> workDtList) {
        doSetWorkDt_NotInScope(workDtList);
    }

    protected void doSetWorkDt_NotInScope(Collection<String> workDtList) {
        regINS(CK_NINS, cTL(workDtList), xgetCValueWorkDt(), "WORK_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {varchar(8)} <br>
     * <pre>e.g. setWorkDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param workDt The value of workDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkDt_LikeSearch(String workDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workDt), xgetCValueWorkDt(), "WORK_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {varchar(8)}
     * @param workDt The value of workDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkDt_NotLikeSearch(String workDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workDt), xgetCValueWorkDt(), "WORK_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {varchar(8)}
     * @param workDt The value of workDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_PrefixSearch(String workDt) {
        setWorkDt_LikeSearch(workDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_DT: {varchar(8)}
     */
    public void setWorkDt_IsNull() { regWorkDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WORK_DT: {varchar(8)}
     */
    public void setWorkDt_IsNullOrEmpty() { regWorkDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_DT: {varchar(8)}
     */
    public void setWorkDt_IsNotNull() { regWorkDt(CK_ISNN, DOBJ); }

    protected void regWorkDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkDt(), "WORK_DT"); }
    protected abstract ConditionValue xgetCValueWorkDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLOCK_IN_FLG: {char(1), default=[0]}
     * @param clockInFlg The value of clockInFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockInFlg_Equal(String clockInFlg) {
        doSetClockInFlg_Equal(fRES(clockInFlg));
    }

    protected void doSetClockInFlg_Equal(String clockInFlg) {
        regClockInFlg(CK_EQ, clockInFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLOCK_IN_FLG: {char(1), default=[0]}
     * @param clockInFlg The value of clockInFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockInFlg_NotEqual(String clockInFlg) {
        doSetClockInFlg_NotEqual(fRES(clockInFlg));
    }

    protected void doSetClockInFlg_NotEqual(String clockInFlg) {
        regClockInFlg(CK_NES, clockInFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLOCK_IN_FLG: {char(1), default=[0]}
     * @param clockInFlg The value of clockInFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockInFlg_GreaterThan(String clockInFlg) {
        regClockInFlg(CK_GT, fRES(clockInFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLOCK_IN_FLG: {char(1), default=[0]}
     * @param clockInFlg The value of clockInFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockInFlg_LessThan(String clockInFlg) {
        regClockInFlg(CK_LT, fRES(clockInFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLOCK_IN_FLG: {char(1), default=[0]}
     * @param clockInFlg The value of clockInFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockInFlg_GreaterEqual(String clockInFlg) {
        regClockInFlg(CK_GE, fRES(clockInFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLOCK_IN_FLG: {char(1), default=[0]}
     * @param clockInFlg The value of clockInFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockInFlg_LessEqual(String clockInFlg) {
        regClockInFlg(CK_LE, fRES(clockInFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLOCK_IN_FLG: {char(1), default=[0]}
     * @param clockInFlgList The collection of clockInFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockInFlg_InScope(Collection<String> clockInFlgList) {
        doSetClockInFlg_InScope(clockInFlgList);
    }

    protected void doSetClockInFlg_InScope(Collection<String> clockInFlgList) {
        regINS(CK_INS, cTL(clockInFlgList), xgetCValueClockInFlg(), "CLOCK_IN_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLOCK_IN_FLG: {char(1), default=[0]}
     * @param clockInFlgList The collection of clockInFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockInFlg_NotInScope(Collection<String> clockInFlgList) {
        doSetClockInFlg_NotInScope(clockInFlgList);
    }

    protected void doSetClockInFlg_NotInScope(Collection<String> clockInFlgList) {
        regINS(CK_NINS, cTL(clockInFlgList), xgetCValueClockInFlg(), "CLOCK_IN_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLOCK_IN_FLG: {char(1), default=[0]} <br>
     * <pre>e.g. setClockInFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clockInFlg The value of clockInFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClockInFlg_LikeSearch(String clockInFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clockInFlg), xgetCValueClockInFlg(), "CLOCK_IN_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLOCK_IN_FLG: {char(1), default=[0]}
     * @param clockInFlg The value of clockInFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClockInFlg_NotLikeSearch(String clockInFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clockInFlg), xgetCValueClockInFlg(), "CLOCK_IN_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLOCK_IN_FLG: {char(1), default=[0]}
     * @param clockInFlg The value of clockInFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockInFlg_PrefixSearch(String clockInFlg) {
        setClockInFlg_LikeSearch(clockInFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLOCK_IN_FLG: {char(1), default=[0]}
     */
    public void setClockInFlg_IsNull() { regClockInFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLOCK_IN_FLG: {char(1), default=[0]}
     */
    public void setClockInFlg_IsNotNull() { regClockInFlg(CK_ISNN, DOBJ); }

    protected void regClockInFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClockInFlg(), "CLOCK_IN_FLG"); }
    protected abstract ConditionValue xgetCValueClockInFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param clockOutFlg The value of clockOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockOutFlg_Equal(String clockOutFlg) {
        doSetClockOutFlg_Equal(fRES(clockOutFlg));
    }

    protected void doSetClockOutFlg_Equal(String clockOutFlg) {
        regClockOutFlg(CK_EQ, clockOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param clockOutFlg The value of clockOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockOutFlg_NotEqual(String clockOutFlg) {
        doSetClockOutFlg_NotEqual(fRES(clockOutFlg));
    }

    protected void doSetClockOutFlg_NotEqual(String clockOutFlg) {
        regClockOutFlg(CK_NES, clockOutFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param clockOutFlg The value of clockOutFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockOutFlg_GreaterThan(String clockOutFlg) {
        regClockOutFlg(CK_GT, fRES(clockOutFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param clockOutFlg The value of clockOutFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockOutFlg_LessThan(String clockOutFlg) {
        regClockOutFlg(CK_LT, fRES(clockOutFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param clockOutFlg The value of clockOutFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockOutFlg_GreaterEqual(String clockOutFlg) {
        regClockOutFlg(CK_GE, fRES(clockOutFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param clockOutFlg The value of clockOutFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockOutFlg_LessEqual(String clockOutFlg) {
        regClockOutFlg(CK_LE, fRES(clockOutFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param clockOutFlgList The collection of clockOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockOutFlg_InScope(Collection<String> clockOutFlgList) {
        doSetClockOutFlg_InScope(clockOutFlgList);
    }

    protected void doSetClockOutFlg_InScope(Collection<String> clockOutFlgList) {
        regINS(CK_INS, cTL(clockOutFlgList), xgetCValueClockOutFlg(), "CLOCK_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param clockOutFlgList The collection of clockOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockOutFlg_NotInScope(Collection<String> clockOutFlgList) {
        doSetClockOutFlg_NotInScope(clockOutFlgList);
    }

    protected void doSetClockOutFlg_NotInScope(Collection<String> clockOutFlgList) {
        regINS(CK_NINS, cTL(clockOutFlgList), xgetCValueClockOutFlg(), "CLOCK_OUT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLOCK_OUT_FLG: {char(1), default=[0]} <br>
     * <pre>e.g. setClockOutFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clockOutFlg The value of clockOutFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClockOutFlg_LikeSearch(String clockOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clockOutFlg), xgetCValueClockOutFlg(), "CLOCK_OUT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param clockOutFlg The value of clockOutFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClockOutFlg_NotLikeSearch(String clockOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clockOutFlg), xgetCValueClockOutFlg(), "CLOCK_OUT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param clockOutFlg The value of clockOutFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClockOutFlg_PrefixSearch(String clockOutFlg) {
        setClockOutFlg_LikeSearch(clockOutFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLOCK_OUT_FLG: {char(1), default=[0]}
     */
    public void setClockOutFlg_IsNull() { regClockOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLOCK_OUT_FLG: {char(1), default=[0]}
     */
    public void setClockOutFlg_IsNotNull() { regClockOutFlg(CK_ISNN, DOBJ); }

    protected void regClockOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClockOutFlg(), "CLOCK_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueClockOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_START_DT: {varchar(8)}
     * @param entryStartDt The value of entryStartDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartDt_Equal(String entryStartDt) {
        doSetEntryStartDt_Equal(fRES(entryStartDt));
    }

    protected void doSetEntryStartDt_Equal(String entryStartDt) {
        regEntryStartDt(CK_EQ, entryStartDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_START_DT: {varchar(8)}
     * @param entryStartDt The value of entryStartDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartDt_NotEqual(String entryStartDt) {
        doSetEntryStartDt_NotEqual(fRES(entryStartDt));
    }

    protected void doSetEntryStartDt_NotEqual(String entryStartDt) {
        regEntryStartDt(CK_NES, entryStartDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_START_DT: {varchar(8)}
     * @param entryStartDt The value of entryStartDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartDt_GreaterThan(String entryStartDt) {
        regEntryStartDt(CK_GT, fRES(entryStartDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_START_DT: {varchar(8)}
     * @param entryStartDt The value of entryStartDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartDt_LessThan(String entryStartDt) {
        regEntryStartDt(CK_LT, fRES(entryStartDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_START_DT: {varchar(8)}
     * @param entryStartDt The value of entryStartDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartDt_GreaterEqual(String entryStartDt) {
        regEntryStartDt(CK_GE, fRES(entryStartDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_START_DT: {varchar(8)}
     * @param entryStartDt The value of entryStartDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartDt_LessEqual(String entryStartDt) {
        regEntryStartDt(CK_LE, fRES(entryStartDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ENTRY_START_DT: {varchar(8)}
     * @param entryStartDtList The collection of entryStartDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartDt_InScope(Collection<String> entryStartDtList) {
        doSetEntryStartDt_InScope(entryStartDtList);
    }

    protected void doSetEntryStartDt_InScope(Collection<String> entryStartDtList) {
        regINS(CK_INS, cTL(entryStartDtList), xgetCValueEntryStartDt(), "ENTRY_START_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ENTRY_START_DT: {varchar(8)}
     * @param entryStartDtList The collection of entryStartDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartDt_NotInScope(Collection<String> entryStartDtList) {
        doSetEntryStartDt_NotInScope(entryStartDtList);
    }

    protected void doSetEntryStartDt_NotInScope(Collection<String> entryStartDtList) {
        regINS(CK_NINS, cTL(entryStartDtList), xgetCValueEntryStartDt(), "ENTRY_START_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTRY_START_DT: {varchar(8)} <br>
     * <pre>e.g. setEntryStartDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param entryStartDt The value of entryStartDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEntryStartDt_LikeSearch(String entryStartDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(entryStartDt), xgetCValueEntryStartDt(), "ENTRY_START_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTRY_START_DT: {varchar(8)}
     * @param entryStartDt The value of entryStartDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEntryStartDt_NotLikeSearch(String entryStartDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(entryStartDt), xgetCValueEntryStartDt(), "ENTRY_START_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTRY_START_DT: {varchar(8)}
     * @param entryStartDt The value of entryStartDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartDt_PrefixSearch(String entryStartDt) {
        setEntryStartDt_LikeSearch(entryStartDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ENTRY_START_DT: {varchar(8)}
     */
    public void setEntryStartDt_IsNull() { regEntryStartDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ENTRY_START_DT: {varchar(8)}
     */
    public void setEntryStartDt_IsNullOrEmpty() { regEntryStartDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ENTRY_START_DT: {varchar(8)}
     */
    public void setEntryStartDt_IsNotNull() { regEntryStartDt(CK_ISNN, DOBJ); }

    protected void regEntryStartDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEntryStartDt(), "ENTRY_START_DT"); }
    protected abstract ConditionValue xgetCValueEntryStartDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_START_TM: {varchar(6)}
     * @param entryStartTm The value of entryStartTm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartTm_Equal(String entryStartTm) {
        doSetEntryStartTm_Equal(fRES(entryStartTm));
    }

    protected void doSetEntryStartTm_Equal(String entryStartTm) {
        regEntryStartTm(CK_EQ, entryStartTm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_START_TM: {varchar(6)}
     * @param entryStartTm The value of entryStartTm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartTm_NotEqual(String entryStartTm) {
        doSetEntryStartTm_NotEqual(fRES(entryStartTm));
    }

    protected void doSetEntryStartTm_NotEqual(String entryStartTm) {
        regEntryStartTm(CK_NES, entryStartTm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_START_TM: {varchar(6)}
     * @param entryStartTm The value of entryStartTm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartTm_GreaterThan(String entryStartTm) {
        regEntryStartTm(CK_GT, fRES(entryStartTm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_START_TM: {varchar(6)}
     * @param entryStartTm The value of entryStartTm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartTm_LessThan(String entryStartTm) {
        regEntryStartTm(CK_LT, fRES(entryStartTm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_START_TM: {varchar(6)}
     * @param entryStartTm The value of entryStartTm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartTm_GreaterEqual(String entryStartTm) {
        regEntryStartTm(CK_GE, fRES(entryStartTm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_START_TM: {varchar(6)}
     * @param entryStartTm The value of entryStartTm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartTm_LessEqual(String entryStartTm) {
        regEntryStartTm(CK_LE, fRES(entryStartTm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ENTRY_START_TM: {varchar(6)}
     * @param entryStartTmList The collection of entryStartTm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartTm_InScope(Collection<String> entryStartTmList) {
        doSetEntryStartTm_InScope(entryStartTmList);
    }

    protected void doSetEntryStartTm_InScope(Collection<String> entryStartTmList) {
        regINS(CK_INS, cTL(entryStartTmList), xgetCValueEntryStartTm(), "ENTRY_START_TM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ENTRY_START_TM: {varchar(6)}
     * @param entryStartTmList The collection of entryStartTm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartTm_NotInScope(Collection<String> entryStartTmList) {
        doSetEntryStartTm_NotInScope(entryStartTmList);
    }

    protected void doSetEntryStartTm_NotInScope(Collection<String> entryStartTmList) {
        regINS(CK_NINS, cTL(entryStartTmList), xgetCValueEntryStartTm(), "ENTRY_START_TM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTRY_START_TM: {varchar(6)} <br>
     * <pre>e.g. setEntryStartTm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param entryStartTm The value of entryStartTm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEntryStartTm_LikeSearch(String entryStartTm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(entryStartTm), xgetCValueEntryStartTm(), "ENTRY_START_TM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTRY_START_TM: {varchar(6)}
     * @param entryStartTm The value of entryStartTm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEntryStartTm_NotLikeSearch(String entryStartTm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(entryStartTm), xgetCValueEntryStartTm(), "ENTRY_START_TM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTRY_START_TM: {varchar(6)}
     * @param entryStartTm The value of entryStartTm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryStartTm_PrefixSearch(String entryStartTm) {
        setEntryStartTm_LikeSearch(entryStartTm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ENTRY_START_TM: {varchar(6)}
     */
    public void setEntryStartTm_IsNull() { regEntryStartTm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ENTRY_START_TM: {varchar(6)}
     */
    public void setEntryStartTm_IsNullOrEmpty() { regEntryStartTm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ENTRY_START_TM: {varchar(6)}
     */
    public void setEntryStartTm_IsNotNull() { regEntryStartTm(CK_ISNN, DOBJ); }

    protected void regEntryStartTm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEntryStartTm(), "ENTRY_START_TM"); }
    protected abstract ConditionValue xgetCValueEntryStartTm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_END_DT: {varchar(8)}
     * @param entryEndDt The value of entryEndDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndDt_Equal(String entryEndDt) {
        doSetEntryEndDt_Equal(fRES(entryEndDt));
    }

    protected void doSetEntryEndDt_Equal(String entryEndDt) {
        regEntryEndDt(CK_EQ, entryEndDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_END_DT: {varchar(8)}
     * @param entryEndDt The value of entryEndDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndDt_NotEqual(String entryEndDt) {
        doSetEntryEndDt_NotEqual(fRES(entryEndDt));
    }

    protected void doSetEntryEndDt_NotEqual(String entryEndDt) {
        regEntryEndDt(CK_NES, entryEndDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_END_DT: {varchar(8)}
     * @param entryEndDt The value of entryEndDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndDt_GreaterThan(String entryEndDt) {
        regEntryEndDt(CK_GT, fRES(entryEndDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_END_DT: {varchar(8)}
     * @param entryEndDt The value of entryEndDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndDt_LessThan(String entryEndDt) {
        regEntryEndDt(CK_LT, fRES(entryEndDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_END_DT: {varchar(8)}
     * @param entryEndDt The value of entryEndDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndDt_GreaterEqual(String entryEndDt) {
        regEntryEndDt(CK_GE, fRES(entryEndDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_END_DT: {varchar(8)}
     * @param entryEndDt The value of entryEndDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndDt_LessEqual(String entryEndDt) {
        regEntryEndDt(CK_LE, fRES(entryEndDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ENTRY_END_DT: {varchar(8)}
     * @param entryEndDtList The collection of entryEndDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndDt_InScope(Collection<String> entryEndDtList) {
        doSetEntryEndDt_InScope(entryEndDtList);
    }

    protected void doSetEntryEndDt_InScope(Collection<String> entryEndDtList) {
        regINS(CK_INS, cTL(entryEndDtList), xgetCValueEntryEndDt(), "ENTRY_END_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ENTRY_END_DT: {varchar(8)}
     * @param entryEndDtList The collection of entryEndDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndDt_NotInScope(Collection<String> entryEndDtList) {
        doSetEntryEndDt_NotInScope(entryEndDtList);
    }

    protected void doSetEntryEndDt_NotInScope(Collection<String> entryEndDtList) {
        regINS(CK_NINS, cTL(entryEndDtList), xgetCValueEntryEndDt(), "ENTRY_END_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTRY_END_DT: {varchar(8)} <br>
     * <pre>e.g. setEntryEndDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param entryEndDt The value of entryEndDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEntryEndDt_LikeSearch(String entryEndDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(entryEndDt), xgetCValueEntryEndDt(), "ENTRY_END_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTRY_END_DT: {varchar(8)}
     * @param entryEndDt The value of entryEndDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEntryEndDt_NotLikeSearch(String entryEndDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(entryEndDt), xgetCValueEntryEndDt(), "ENTRY_END_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTRY_END_DT: {varchar(8)}
     * @param entryEndDt The value of entryEndDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndDt_PrefixSearch(String entryEndDt) {
        setEntryEndDt_LikeSearch(entryEndDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ENTRY_END_DT: {varchar(8)}
     */
    public void setEntryEndDt_IsNull() { regEntryEndDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ENTRY_END_DT: {varchar(8)}
     */
    public void setEntryEndDt_IsNullOrEmpty() { regEntryEndDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ENTRY_END_DT: {varchar(8)}
     */
    public void setEntryEndDt_IsNotNull() { regEntryEndDt(CK_ISNN, DOBJ); }

    protected void regEntryEndDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEntryEndDt(), "ENTRY_END_DT"); }
    protected abstract ConditionValue xgetCValueEntryEndDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_END_TM: {varchar(6)}
     * @param entryEndTm The value of entryEndTm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndTm_Equal(String entryEndTm) {
        doSetEntryEndTm_Equal(fRES(entryEndTm));
    }

    protected void doSetEntryEndTm_Equal(String entryEndTm) {
        regEntryEndTm(CK_EQ, entryEndTm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_END_TM: {varchar(6)}
     * @param entryEndTm The value of entryEndTm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndTm_NotEqual(String entryEndTm) {
        doSetEntryEndTm_NotEqual(fRES(entryEndTm));
    }

    protected void doSetEntryEndTm_NotEqual(String entryEndTm) {
        regEntryEndTm(CK_NES, entryEndTm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_END_TM: {varchar(6)}
     * @param entryEndTm The value of entryEndTm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndTm_GreaterThan(String entryEndTm) {
        regEntryEndTm(CK_GT, fRES(entryEndTm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_END_TM: {varchar(6)}
     * @param entryEndTm The value of entryEndTm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndTm_LessThan(String entryEndTm) {
        regEntryEndTm(CK_LT, fRES(entryEndTm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_END_TM: {varchar(6)}
     * @param entryEndTm The value of entryEndTm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndTm_GreaterEqual(String entryEndTm) {
        regEntryEndTm(CK_GE, fRES(entryEndTm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_END_TM: {varchar(6)}
     * @param entryEndTm The value of entryEndTm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndTm_LessEqual(String entryEndTm) {
        regEntryEndTm(CK_LE, fRES(entryEndTm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ENTRY_END_TM: {varchar(6)}
     * @param entryEndTmList The collection of entryEndTm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndTm_InScope(Collection<String> entryEndTmList) {
        doSetEntryEndTm_InScope(entryEndTmList);
    }

    protected void doSetEntryEndTm_InScope(Collection<String> entryEndTmList) {
        regINS(CK_INS, cTL(entryEndTmList), xgetCValueEntryEndTm(), "ENTRY_END_TM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ENTRY_END_TM: {varchar(6)}
     * @param entryEndTmList The collection of entryEndTm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndTm_NotInScope(Collection<String> entryEndTmList) {
        doSetEntryEndTm_NotInScope(entryEndTmList);
    }

    protected void doSetEntryEndTm_NotInScope(Collection<String> entryEndTmList) {
        regINS(CK_NINS, cTL(entryEndTmList), xgetCValueEntryEndTm(), "ENTRY_END_TM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTRY_END_TM: {varchar(6)} <br>
     * <pre>e.g. setEntryEndTm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param entryEndTm The value of entryEndTm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEntryEndTm_LikeSearch(String entryEndTm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(entryEndTm), xgetCValueEntryEndTm(), "ENTRY_END_TM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTRY_END_TM: {varchar(6)}
     * @param entryEndTm The value of entryEndTm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEntryEndTm_NotLikeSearch(String entryEndTm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(entryEndTm), xgetCValueEntryEndTm(), "ENTRY_END_TM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTRY_END_TM: {varchar(6)}
     * @param entryEndTm The value of entryEndTm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryEndTm_PrefixSearch(String entryEndTm) {
        setEntryEndTm_LikeSearch(entryEndTm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ENTRY_END_TM: {varchar(6)}
     */
    public void setEntryEndTm_IsNull() { regEntryEndTm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ENTRY_END_TM: {varchar(6)}
     */
    public void setEntryEndTm_IsNullOrEmpty() { regEntryEndTm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ENTRY_END_TM: {varchar(6)}
     */
    public void setEntryEndTm_IsNotNull() { regEntryEndTm(CK_ISNN, DOBJ); }

    protected void regEntryEndTm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEntryEndTm(), "ENTRY_END_TM"); }
    protected abstract ConditionValue xgetCValueEntryEndTm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_FLG: {char(1), default=[0]}
     * @param breakStartFlg The value of breakStartFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartFlg_Equal(String breakStartFlg) {
        doSetBreakStartFlg_Equal(fRES(breakStartFlg));
    }

    protected void doSetBreakStartFlg_Equal(String breakStartFlg) {
        regBreakStartFlg(CK_EQ, breakStartFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_FLG: {char(1), default=[0]}
     * @param breakStartFlg The value of breakStartFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartFlg_NotEqual(String breakStartFlg) {
        doSetBreakStartFlg_NotEqual(fRES(breakStartFlg));
    }

    protected void doSetBreakStartFlg_NotEqual(String breakStartFlg) {
        regBreakStartFlg(CK_NES, breakStartFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_FLG: {char(1), default=[0]}
     * @param breakStartFlg The value of breakStartFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartFlg_GreaterThan(String breakStartFlg) {
        regBreakStartFlg(CK_GT, fRES(breakStartFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_FLG: {char(1), default=[0]}
     * @param breakStartFlg The value of breakStartFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartFlg_LessThan(String breakStartFlg) {
        regBreakStartFlg(CK_LT, fRES(breakStartFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_FLG: {char(1), default=[0]}
     * @param breakStartFlg The value of breakStartFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartFlg_GreaterEqual(String breakStartFlg) {
        regBreakStartFlg(CK_GE, fRES(breakStartFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_FLG: {char(1), default=[0]}
     * @param breakStartFlg The value of breakStartFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartFlg_LessEqual(String breakStartFlg) {
        regBreakStartFlg(CK_LE, fRES(breakStartFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BREAK_START_FLG: {char(1), default=[0]}
     * @param breakStartFlgList The collection of breakStartFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartFlg_InScope(Collection<String> breakStartFlgList) {
        doSetBreakStartFlg_InScope(breakStartFlgList);
    }

    protected void doSetBreakStartFlg_InScope(Collection<String> breakStartFlgList) {
        regINS(CK_INS, cTL(breakStartFlgList), xgetCValueBreakStartFlg(), "BREAK_START_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BREAK_START_FLG: {char(1), default=[0]}
     * @param breakStartFlgList The collection of breakStartFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartFlg_NotInScope(Collection<String> breakStartFlgList) {
        doSetBreakStartFlg_NotInScope(breakStartFlgList);
    }

    protected void doSetBreakStartFlg_NotInScope(Collection<String> breakStartFlgList) {
        regINS(CK_NINS, cTL(breakStartFlgList), xgetCValueBreakStartFlg(), "BREAK_START_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BREAK_START_FLG: {char(1), default=[0]} <br>
     * <pre>e.g. setBreakStartFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param breakStartFlg The value of breakStartFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBreakStartFlg_LikeSearch(String breakStartFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(breakStartFlg), xgetCValueBreakStartFlg(), "BREAK_START_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BREAK_START_FLG: {char(1), default=[0]}
     * @param breakStartFlg The value of breakStartFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBreakStartFlg_NotLikeSearch(String breakStartFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(breakStartFlg), xgetCValueBreakStartFlg(), "BREAK_START_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BREAK_START_FLG: {char(1), default=[0]}
     * @param breakStartFlg The value of breakStartFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartFlg_PrefixSearch(String breakStartFlg) {
        setBreakStartFlg_LikeSearch(breakStartFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BREAK_START_FLG: {char(1), default=[0]}
     */
    public void setBreakStartFlg_IsNull() { regBreakStartFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BREAK_START_FLG: {char(1), default=[0]}
     */
    public void setBreakStartFlg_IsNotNull() { regBreakStartFlg(CK_ISNN, DOBJ); }

    protected void regBreakStartFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBreakStartFlg(), "BREAK_START_FLG"); }
    protected abstract ConditionValue xgetCValueBreakStartFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_DT: {varchar(8)}
     * @param breakStartDt The value of breakStartDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartDt_Equal(String breakStartDt) {
        doSetBreakStartDt_Equal(fRES(breakStartDt));
    }

    protected void doSetBreakStartDt_Equal(String breakStartDt) {
        regBreakStartDt(CK_EQ, breakStartDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_DT: {varchar(8)}
     * @param breakStartDt The value of breakStartDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartDt_NotEqual(String breakStartDt) {
        doSetBreakStartDt_NotEqual(fRES(breakStartDt));
    }

    protected void doSetBreakStartDt_NotEqual(String breakStartDt) {
        regBreakStartDt(CK_NES, breakStartDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_DT: {varchar(8)}
     * @param breakStartDt The value of breakStartDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartDt_GreaterThan(String breakStartDt) {
        regBreakStartDt(CK_GT, fRES(breakStartDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_DT: {varchar(8)}
     * @param breakStartDt The value of breakStartDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartDt_LessThan(String breakStartDt) {
        regBreakStartDt(CK_LT, fRES(breakStartDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_DT: {varchar(8)}
     * @param breakStartDt The value of breakStartDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartDt_GreaterEqual(String breakStartDt) {
        regBreakStartDt(CK_GE, fRES(breakStartDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_DT: {varchar(8)}
     * @param breakStartDt The value of breakStartDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartDt_LessEqual(String breakStartDt) {
        regBreakStartDt(CK_LE, fRES(breakStartDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BREAK_START_DT: {varchar(8)}
     * @param breakStartDtList The collection of breakStartDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartDt_InScope(Collection<String> breakStartDtList) {
        doSetBreakStartDt_InScope(breakStartDtList);
    }

    protected void doSetBreakStartDt_InScope(Collection<String> breakStartDtList) {
        regINS(CK_INS, cTL(breakStartDtList), xgetCValueBreakStartDt(), "BREAK_START_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BREAK_START_DT: {varchar(8)}
     * @param breakStartDtList The collection of breakStartDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartDt_NotInScope(Collection<String> breakStartDtList) {
        doSetBreakStartDt_NotInScope(breakStartDtList);
    }

    protected void doSetBreakStartDt_NotInScope(Collection<String> breakStartDtList) {
        regINS(CK_NINS, cTL(breakStartDtList), xgetCValueBreakStartDt(), "BREAK_START_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BREAK_START_DT: {varchar(8)} <br>
     * <pre>e.g. setBreakStartDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param breakStartDt The value of breakStartDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBreakStartDt_LikeSearch(String breakStartDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(breakStartDt), xgetCValueBreakStartDt(), "BREAK_START_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BREAK_START_DT: {varchar(8)}
     * @param breakStartDt The value of breakStartDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBreakStartDt_NotLikeSearch(String breakStartDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(breakStartDt), xgetCValueBreakStartDt(), "BREAK_START_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BREAK_START_DT: {varchar(8)}
     * @param breakStartDt The value of breakStartDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartDt_PrefixSearch(String breakStartDt) {
        setBreakStartDt_LikeSearch(breakStartDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BREAK_START_DT: {varchar(8)}
     */
    public void setBreakStartDt_IsNull() { regBreakStartDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BREAK_START_DT: {varchar(8)}
     */
    public void setBreakStartDt_IsNullOrEmpty() { regBreakStartDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BREAK_START_DT: {varchar(8)}
     */
    public void setBreakStartDt_IsNotNull() { regBreakStartDt(CK_ISNN, DOBJ); }

    protected void regBreakStartDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBreakStartDt(), "BREAK_START_DT"); }
    protected abstract ConditionValue xgetCValueBreakStartDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_TM: {varchar(6)}
     * @param breakStartTm The value of breakStartTm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartTm_Equal(String breakStartTm) {
        doSetBreakStartTm_Equal(fRES(breakStartTm));
    }

    protected void doSetBreakStartTm_Equal(String breakStartTm) {
        regBreakStartTm(CK_EQ, breakStartTm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_TM: {varchar(6)}
     * @param breakStartTm The value of breakStartTm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartTm_NotEqual(String breakStartTm) {
        doSetBreakStartTm_NotEqual(fRES(breakStartTm));
    }

    protected void doSetBreakStartTm_NotEqual(String breakStartTm) {
        regBreakStartTm(CK_NES, breakStartTm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_TM: {varchar(6)}
     * @param breakStartTm The value of breakStartTm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartTm_GreaterThan(String breakStartTm) {
        regBreakStartTm(CK_GT, fRES(breakStartTm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_TM: {varchar(6)}
     * @param breakStartTm The value of breakStartTm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartTm_LessThan(String breakStartTm) {
        regBreakStartTm(CK_LT, fRES(breakStartTm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_TM: {varchar(6)}
     * @param breakStartTm The value of breakStartTm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartTm_GreaterEqual(String breakStartTm) {
        regBreakStartTm(CK_GE, fRES(breakStartTm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_START_TM: {varchar(6)}
     * @param breakStartTm The value of breakStartTm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartTm_LessEqual(String breakStartTm) {
        regBreakStartTm(CK_LE, fRES(breakStartTm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BREAK_START_TM: {varchar(6)}
     * @param breakStartTmList The collection of breakStartTm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartTm_InScope(Collection<String> breakStartTmList) {
        doSetBreakStartTm_InScope(breakStartTmList);
    }

    protected void doSetBreakStartTm_InScope(Collection<String> breakStartTmList) {
        regINS(CK_INS, cTL(breakStartTmList), xgetCValueBreakStartTm(), "BREAK_START_TM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BREAK_START_TM: {varchar(6)}
     * @param breakStartTmList The collection of breakStartTm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartTm_NotInScope(Collection<String> breakStartTmList) {
        doSetBreakStartTm_NotInScope(breakStartTmList);
    }

    protected void doSetBreakStartTm_NotInScope(Collection<String> breakStartTmList) {
        regINS(CK_NINS, cTL(breakStartTmList), xgetCValueBreakStartTm(), "BREAK_START_TM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BREAK_START_TM: {varchar(6)} <br>
     * <pre>e.g. setBreakStartTm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param breakStartTm The value of breakStartTm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBreakStartTm_LikeSearch(String breakStartTm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(breakStartTm), xgetCValueBreakStartTm(), "BREAK_START_TM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BREAK_START_TM: {varchar(6)}
     * @param breakStartTm The value of breakStartTm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBreakStartTm_NotLikeSearch(String breakStartTm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(breakStartTm), xgetCValueBreakStartTm(), "BREAK_START_TM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BREAK_START_TM: {varchar(6)}
     * @param breakStartTm The value of breakStartTm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakStartTm_PrefixSearch(String breakStartTm) {
        setBreakStartTm_LikeSearch(breakStartTm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BREAK_START_TM: {varchar(6)}
     */
    public void setBreakStartTm_IsNull() { regBreakStartTm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BREAK_START_TM: {varchar(6)}
     */
    public void setBreakStartTm_IsNullOrEmpty() { regBreakStartTm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BREAK_START_TM: {varchar(6)}
     */
    public void setBreakStartTm_IsNotNull() { regBreakStartTm(CK_ISNN, DOBJ); }

    protected void regBreakStartTm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBreakStartTm(), "BREAK_START_TM"); }
    protected abstract ConditionValue xgetCValueBreakStartTm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_END_DT: {varchar(8)}
     * @param breakEndDt The value of breakEndDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndDt_Equal(String breakEndDt) {
        doSetBreakEndDt_Equal(fRES(breakEndDt));
    }

    protected void doSetBreakEndDt_Equal(String breakEndDt) {
        regBreakEndDt(CK_EQ, breakEndDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_END_DT: {varchar(8)}
     * @param breakEndDt The value of breakEndDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndDt_NotEqual(String breakEndDt) {
        doSetBreakEndDt_NotEqual(fRES(breakEndDt));
    }

    protected void doSetBreakEndDt_NotEqual(String breakEndDt) {
        regBreakEndDt(CK_NES, breakEndDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_END_DT: {varchar(8)}
     * @param breakEndDt The value of breakEndDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndDt_GreaterThan(String breakEndDt) {
        regBreakEndDt(CK_GT, fRES(breakEndDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_END_DT: {varchar(8)}
     * @param breakEndDt The value of breakEndDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndDt_LessThan(String breakEndDt) {
        regBreakEndDt(CK_LT, fRES(breakEndDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_END_DT: {varchar(8)}
     * @param breakEndDt The value of breakEndDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndDt_GreaterEqual(String breakEndDt) {
        regBreakEndDt(CK_GE, fRES(breakEndDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_END_DT: {varchar(8)}
     * @param breakEndDt The value of breakEndDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndDt_LessEqual(String breakEndDt) {
        regBreakEndDt(CK_LE, fRES(breakEndDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BREAK_END_DT: {varchar(8)}
     * @param breakEndDtList The collection of breakEndDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndDt_InScope(Collection<String> breakEndDtList) {
        doSetBreakEndDt_InScope(breakEndDtList);
    }

    protected void doSetBreakEndDt_InScope(Collection<String> breakEndDtList) {
        regINS(CK_INS, cTL(breakEndDtList), xgetCValueBreakEndDt(), "BREAK_END_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BREAK_END_DT: {varchar(8)}
     * @param breakEndDtList The collection of breakEndDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndDt_NotInScope(Collection<String> breakEndDtList) {
        doSetBreakEndDt_NotInScope(breakEndDtList);
    }

    protected void doSetBreakEndDt_NotInScope(Collection<String> breakEndDtList) {
        regINS(CK_NINS, cTL(breakEndDtList), xgetCValueBreakEndDt(), "BREAK_END_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BREAK_END_DT: {varchar(8)} <br>
     * <pre>e.g. setBreakEndDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param breakEndDt The value of breakEndDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBreakEndDt_LikeSearch(String breakEndDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(breakEndDt), xgetCValueBreakEndDt(), "BREAK_END_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BREAK_END_DT: {varchar(8)}
     * @param breakEndDt The value of breakEndDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBreakEndDt_NotLikeSearch(String breakEndDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(breakEndDt), xgetCValueBreakEndDt(), "BREAK_END_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BREAK_END_DT: {varchar(8)}
     * @param breakEndDt The value of breakEndDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndDt_PrefixSearch(String breakEndDt) {
        setBreakEndDt_LikeSearch(breakEndDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BREAK_END_DT: {varchar(8)}
     */
    public void setBreakEndDt_IsNull() { regBreakEndDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BREAK_END_DT: {varchar(8)}
     */
    public void setBreakEndDt_IsNullOrEmpty() { regBreakEndDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BREAK_END_DT: {varchar(8)}
     */
    public void setBreakEndDt_IsNotNull() { regBreakEndDt(CK_ISNN, DOBJ); }

    protected void regBreakEndDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBreakEndDt(), "BREAK_END_DT"); }
    protected abstract ConditionValue xgetCValueBreakEndDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_END_TM: {varchar(6)}
     * @param breakEndTm The value of breakEndTm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndTm_Equal(String breakEndTm) {
        doSetBreakEndTm_Equal(fRES(breakEndTm));
    }

    protected void doSetBreakEndTm_Equal(String breakEndTm) {
        regBreakEndTm(CK_EQ, breakEndTm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_END_TM: {varchar(6)}
     * @param breakEndTm The value of breakEndTm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndTm_NotEqual(String breakEndTm) {
        doSetBreakEndTm_NotEqual(fRES(breakEndTm));
    }

    protected void doSetBreakEndTm_NotEqual(String breakEndTm) {
        regBreakEndTm(CK_NES, breakEndTm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_END_TM: {varchar(6)}
     * @param breakEndTm The value of breakEndTm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndTm_GreaterThan(String breakEndTm) {
        regBreakEndTm(CK_GT, fRES(breakEndTm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_END_TM: {varchar(6)}
     * @param breakEndTm The value of breakEndTm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndTm_LessThan(String breakEndTm) {
        regBreakEndTm(CK_LT, fRES(breakEndTm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_END_TM: {varchar(6)}
     * @param breakEndTm The value of breakEndTm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndTm_GreaterEqual(String breakEndTm) {
        regBreakEndTm(CK_GE, fRES(breakEndTm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BREAK_END_TM: {varchar(6)}
     * @param breakEndTm The value of breakEndTm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndTm_LessEqual(String breakEndTm) {
        regBreakEndTm(CK_LE, fRES(breakEndTm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BREAK_END_TM: {varchar(6)}
     * @param breakEndTmList The collection of breakEndTm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndTm_InScope(Collection<String> breakEndTmList) {
        doSetBreakEndTm_InScope(breakEndTmList);
    }

    protected void doSetBreakEndTm_InScope(Collection<String> breakEndTmList) {
        regINS(CK_INS, cTL(breakEndTmList), xgetCValueBreakEndTm(), "BREAK_END_TM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BREAK_END_TM: {varchar(6)}
     * @param breakEndTmList The collection of breakEndTm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndTm_NotInScope(Collection<String> breakEndTmList) {
        doSetBreakEndTm_NotInScope(breakEndTmList);
    }

    protected void doSetBreakEndTm_NotInScope(Collection<String> breakEndTmList) {
        regINS(CK_NINS, cTL(breakEndTmList), xgetCValueBreakEndTm(), "BREAK_END_TM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BREAK_END_TM: {varchar(6)} <br>
     * <pre>e.g. setBreakEndTm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param breakEndTm The value of breakEndTm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBreakEndTm_LikeSearch(String breakEndTm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(breakEndTm), xgetCValueBreakEndTm(), "BREAK_END_TM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BREAK_END_TM: {varchar(6)}
     * @param breakEndTm The value of breakEndTm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBreakEndTm_NotLikeSearch(String breakEndTm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(breakEndTm), xgetCValueBreakEndTm(), "BREAK_END_TM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BREAK_END_TM: {varchar(6)}
     * @param breakEndTm The value of breakEndTm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBreakEndTm_PrefixSearch(String breakEndTm) {
        setBreakEndTm_LikeSearch(breakEndTm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BREAK_END_TM: {varchar(6)}
     */
    public void setBreakEndTm_IsNull() { regBreakEndTm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BREAK_END_TM: {varchar(6)}
     */
    public void setBreakEndTm_IsNullOrEmpty() { regBreakEndTm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BREAK_END_TM: {varchar(6)}
     */
    public void setBreakEndTm_IsNotNull() { regBreakEndTm(CK_ISNN, DOBJ); }

    protected void regBreakEndTm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBreakEndTm(), "BREAK_END_TM"); }
    protected abstract ConditionValue xgetCValueBreakEndTm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FORCED_CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param forcedClockOutFlg The value of forcedClockOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForcedClockOutFlg_Equal(String forcedClockOutFlg) {
        doSetForcedClockOutFlg_Equal(fRES(forcedClockOutFlg));
    }

    protected void doSetForcedClockOutFlg_Equal(String forcedClockOutFlg) {
        regForcedClockOutFlg(CK_EQ, forcedClockOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FORCED_CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param forcedClockOutFlg The value of forcedClockOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForcedClockOutFlg_NotEqual(String forcedClockOutFlg) {
        doSetForcedClockOutFlg_NotEqual(fRES(forcedClockOutFlg));
    }

    protected void doSetForcedClockOutFlg_NotEqual(String forcedClockOutFlg) {
        regForcedClockOutFlg(CK_NES, forcedClockOutFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FORCED_CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param forcedClockOutFlg The value of forcedClockOutFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForcedClockOutFlg_GreaterThan(String forcedClockOutFlg) {
        regForcedClockOutFlg(CK_GT, fRES(forcedClockOutFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FORCED_CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param forcedClockOutFlg The value of forcedClockOutFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForcedClockOutFlg_LessThan(String forcedClockOutFlg) {
        regForcedClockOutFlg(CK_LT, fRES(forcedClockOutFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FORCED_CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param forcedClockOutFlg The value of forcedClockOutFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForcedClockOutFlg_GreaterEqual(String forcedClockOutFlg) {
        regForcedClockOutFlg(CK_GE, fRES(forcedClockOutFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FORCED_CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param forcedClockOutFlg The value of forcedClockOutFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForcedClockOutFlg_LessEqual(String forcedClockOutFlg) {
        regForcedClockOutFlg(CK_LE, fRES(forcedClockOutFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FORCED_CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param forcedClockOutFlgList The collection of forcedClockOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForcedClockOutFlg_InScope(Collection<String> forcedClockOutFlgList) {
        doSetForcedClockOutFlg_InScope(forcedClockOutFlgList);
    }

    protected void doSetForcedClockOutFlg_InScope(Collection<String> forcedClockOutFlgList) {
        regINS(CK_INS, cTL(forcedClockOutFlgList), xgetCValueForcedClockOutFlg(), "FORCED_CLOCK_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FORCED_CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param forcedClockOutFlgList The collection of forcedClockOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForcedClockOutFlg_NotInScope(Collection<String> forcedClockOutFlgList) {
        doSetForcedClockOutFlg_NotInScope(forcedClockOutFlgList);
    }

    protected void doSetForcedClockOutFlg_NotInScope(Collection<String> forcedClockOutFlgList) {
        regINS(CK_NINS, cTL(forcedClockOutFlgList), xgetCValueForcedClockOutFlg(), "FORCED_CLOCK_OUT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FORCED_CLOCK_OUT_FLG: {char(1), default=[0]} <br>
     * <pre>e.g. setForcedClockOutFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param forcedClockOutFlg The value of forcedClockOutFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setForcedClockOutFlg_LikeSearch(String forcedClockOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(forcedClockOutFlg), xgetCValueForcedClockOutFlg(), "FORCED_CLOCK_OUT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FORCED_CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param forcedClockOutFlg The value of forcedClockOutFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setForcedClockOutFlg_NotLikeSearch(String forcedClockOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(forcedClockOutFlg), xgetCValueForcedClockOutFlg(), "FORCED_CLOCK_OUT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FORCED_CLOCK_OUT_FLG: {char(1), default=[0]}
     * @param forcedClockOutFlg The value of forcedClockOutFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForcedClockOutFlg_PrefixSearch(String forcedClockOutFlg) {
        setForcedClockOutFlg_LikeSearch(forcedClockOutFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FORCED_CLOCK_OUT_FLG: {char(1), default=[0]}
     */
    public void setForcedClockOutFlg_IsNull() { regForcedClockOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FORCED_CLOCK_OUT_FLG: {char(1), default=[0]}
     */
    public void setForcedClockOutFlg_IsNotNull() { regForcedClockOutFlg(CK_ISNN, DOBJ); }

    protected void regForcedClockOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueForcedClockOutFlg(), "FORCED_CLOCK_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueForcedClockOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[0]}
     * @param workFlg The value of workFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_Equal(String workFlg) {
        doSetWorkFlg_Equal(fRES(workFlg));
    }

    protected void doSetWorkFlg_Equal(String workFlg) {
        regWorkFlg(CK_EQ, workFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[0]}
     * @param workFlg The value of workFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_NotEqual(String workFlg) {
        doSetWorkFlg_NotEqual(fRES(workFlg));
    }

    protected void doSetWorkFlg_NotEqual(String workFlg) {
        regWorkFlg(CK_NES, workFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[0]}
     * @param workFlg The value of workFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterThan(String workFlg) {
        regWorkFlg(CK_GT, fRES(workFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[0]}
     * @param workFlg The value of workFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessThan(String workFlg) {
        regWorkFlg(CK_LT, fRES(workFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[0]}
     * @param workFlg The value of workFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterEqual(String workFlg) {
        regWorkFlg(CK_GE, fRES(workFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[0]}
     * @param workFlg The value of workFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessEqual(String workFlg) {
        regWorkFlg(CK_LE, fRES(workFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_FLG: {char(1), default=[0]}
     * @param workFlgList The collection of workFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_InScope(Collection<String> workFlgList) {
        doSetWorkFlg_InScope(workFlgList);
    }

    protected void doSetWorkFlg_InScope(Collection<String> workFlgList) {
        regINS(CK_INS, cTL(workFlgList), xgetCValueWorkFlg(), "WORK_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_FLG: {char(1), default=[0]}
     * @param workFlgList The collection of workFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_NotInScope(Collection<String> workFlgList) {
        doSetWorkFlg_NotInScope(workFlgList);
    }

    protected void doSetWorkFlg_NotInScope(Collection<String> workFlgList) {
        regINS(CK_NINS, cTL(workFlgList), xgetCValueWorkFlg(), "WORK_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {char(1), default=[0]} <br>
     * <pre>e.g. setWorkFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param workFlg The value of workFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkFlg_LikeSearch(String workFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workFlg), xgetCValueWorkFlg(), "WORK_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {char(1), default=[0]}
     * @param workFlg The value of workFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkFlg_NotLikeSearch(String workFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workFlg), xgetCValueWorkFlg(), "WORK_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {char(1), default=[0]}
     * @param workFlg The value of workFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_PrefixSearch(String workFlg) {
        setWorkFlg_LikeSearch(workFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[0]}
     */
    public void setWorkFlg_IsNull() { regWorkFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[0]}
     */
    public void setWorkFlg_IsNotNull() { regWorkFlg(CK_ISNN, DOBJ); }

    protected void regWorkFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkFlg(), "WORK_FLG"); }
    protected abstract ConditionValue xgetCValueWorkFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal(String errorFlg) {
        doSetErrorFlg_Equal(fRES(errorFlg));
    }

    protected void doSetErrorFlg_Equal(String errorFlg) {
        regErrorFlg(CK_EQ, errorFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual(String errorFlg) {
        doSetErrorFlg_NotEqual(fRES(errorFlg));
    }

    protected void doSetErrorFlg_NotEqual(String errorFlg) {
        regErrorFlg(CK_NES, errorFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterThan(String errorFlg) {
        regErrorFlg(CK_GT, fRES(errorFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessThan(String errorFlg) {
        regErrorFlg(CK_LT, fRES(errorFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterEqual(String errorFlg) {
        regErrorFlg(CK_GE, fRES(errorFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessEqual(String errorFlg) {
        regErrorFlg(CK_LE, fRES(errorFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlgList The collection of errorFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope(Collection<String> errorFlgList) {
        doSetErrorFlg_InScope(errorFlgList);
    }

    protected void doSetErrorFlg_InScope(Collection<String> errorFlgList) {
        regINS(CK_INS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlgList The collection of errorFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope(Collection<String> errorFlgList) {
        doSetErrorFlg_NotInScope(errorFlgList);
    }

    protected void doSetErrorFlg_NotInScope(Collection<String> errorFlgList) {
        regINS(CK_NINS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]} <br>
     * <pre>e.g. setErrorFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorFlg The value of errorFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorFlg_LikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorFlg_NotLikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_PrefixSearch(String errorFlg) {
        setErrorFlg_LikeSearch(errorFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     */
    public void setErrorFlg_IsNull() { regErrorFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     */
    public void setErrorFlg_IsNotNull() { regErrorFlg(CK_ISNN, DOBJ); }

    protected void regErrorFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorFlg(), "ERROR_FLG"); }
    protected abstract ConditionValue xgetCValueErrorFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsg The value of errorMsg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_Equal(String errorMsg) {
        doSetErrorMsg_Equal(fRES(errorMsg));
    }

    protected void doSetErrorMsg_Equal(String errorMsg) {
        regErrorMsg(CK_EQ, errorMsg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsg The value of errorMsg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_NotEqual(String errorMsg) {
        doSetErrorMsg_NotEqual(fRES(errorMsg));
    }

    protected void doSetErrorMsg_NotEqual(String errorMsg) {
        regErrorMsg(CK_NES, errorMsg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsg The value of errorMsg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_GreaterThan(String errorMsg) {
        regErrorMsg(CK_GT, fRES(errorMsg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsg The value of errorMsg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_LessThan(String errorMsg) {
        regErrorMsg(CK_LT, fRES(errorMsg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsg The value of errorMsg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_GreaterEqual(String errorMsg) {
        regErrorMsg(CK_GE, fRES(errorMsg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsg The value of errorMsg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_LessEqual(String errorMsg) {
        regErrorMsg(CK_LE, fRES(errorMsg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsgList The collection of errorMsg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_InScope(Collection<String> errorMsgList) {
        doSetErrorMsg_InScope(errorMsgList);
    }

    protected void doSetErrorMsg_InScope(Collection<String> errorMsgList) {
        regINS(CK_INS, cTL(errorMsgList), xgetCValueErrorMsg(), "ERROR_MSG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsgList The collection of errorMsg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_NotInScope(Collection<String> errorMsgList) {
        doSetErrorMsg_NotInScope(errorMsgList);
    }

    protected void doSetErrorMsg_NotInScope(Collection<String> errorMsgList) {
        regINS(CK_NINS, cTL(errorMsgList), xgetCValueErrorMsg(), "ERROR_MSG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)} <br>
     * <pre>e.g. setErrorMsg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorMsg The value of errorMsg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorMsg_LikeSearch(String errorMsg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorMsg), xgetCValueErrorMsg(), "ERROR_MSG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsg The value of errorMsg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorMsg_NotLikeSearch(String errorMsg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorMsg), xgetCValueErrorMsg(), "ERROR_MSG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsg The value of errorMsg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_PrefixSearch(String errorMsg) {
        setErrorMsg_LikeSearch(errorMsg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     */
    public void setErrorMsg_IsNull() { regErrorMsg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     */
    public void setErrorMsg_IsNullOrEmpty() { regErrorMsg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     */
    public void setErrorMsg_IsNotNull() { regErrorMsg(CK_ISNN, DOBJ); }

    protected void regErrorMsg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorMsg(), "ERROR_MSG"); }
    protected abstract ConditionValue xgetCValueErrorMsg();

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
    public HpSLCFunction<WWorkCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WWorkCB.class);
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
    public HpSLCFunction<WWorkCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WWorkCB.class);
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
    public HpSLCFunction<WWorkCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WWorkCB.class);
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
    public HpSLCFunction<WWorkCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WWorkCB.class);
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
    public HpSLCFunction<WWorkCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WWorkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WWorkCB&gt;() {
     *     public void query(WWorkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WWorkCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WWorkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WWorkCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WWorkCQ sq);

    protected WWorkCB xcreateScalarConditionCB() {
        WWorkCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WWorkCB xcreateScalarConditionPartitionByCB() {
        WWorkCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WWorkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WWorkCB cb = new WWorkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "WORK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WWorkCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WWorkCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WWorkCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WWorkCB cb = new WWorkCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "WORK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WWorkCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WWorkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WWorkCB cb = new WWorkCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WWorkCQ sq);

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
    protected WWorkCB newMyCB() {
        return new WWorkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WWorkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
