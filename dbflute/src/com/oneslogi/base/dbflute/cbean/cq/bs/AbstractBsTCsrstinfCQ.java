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
 * The abstract condition-query of T_CSRSTINF.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTCsrstinfCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTCsrstinfCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_CSRSTINF";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortStatisticsInfoId The value of sortStatisticsInfoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortStatisticsInfoId_Equal(Long sortStatisticsInfoId) {
        doSetSortStatisticsInfoId_Equal(sortStatisticsInfoId);
    }

    protected void doSetSortStatisticsInfoId_Equal(Long sortStatisticsInfoId) {
        regSortStatisticsInfoId(CK_EQ, sortStatisticsInfoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortStatisticsInfoId The value of sortStatisticsInfoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortStatisticsInfoId_NotEqual(Long sortStatisticsInfoId) {
        doSetSortStatisticsInfoId_NotEqual(sortStatisticsInfoId);
    }

    protected void doSetSortStatisticsInfoId_NotEqual(Long sortStatisticsInfoId) {
        regSortStatisticsInfoId(CK_NES, sortStatisticsInfoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortStatisticsInfoId The value of sortStatisticsInfoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortStatisticsInfoId_GreaterThan(Long sortStatisticsInfoId) {
        regSortStatisticsInfoId(CK_GT, sortStatisticsInfoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortStatisticsInfoId The value of sortStatisticsInfoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortStatisticsInfoId_LessThan(Long sortStatisticsInfoId) {
        regSortStatisticsInfoId(CK_LT, sortStatisticsInfoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortStatisticsInfoId The value of sortStatisticsInfoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortStatisticsInfoId_GreaterEqual(Long sortStatisticsInfoId) {
        regSortStatisticsInfoId(CK_GE, sortStatisticsInfoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortStatisticsInfoId The value of sortStatisticsInfoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortStatisticsInfoId_LessEqual(Long sortStatisticsInfoId) {
        regSortStatisticsInfoId(CK_LE, sortStatisticsInfoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of sortStatisticsInfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortStatisticsInfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortStatisticsInfoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortStatisticsInfoId(), "SORT_STATISTICS_INFO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortStatisticsInfoIdList The collection of sortStatisticsInfoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortStatisticsInfoId_InScope(Collection<Long> sortStatisticsInfoIdList) {
        doSetSortStatisticsInfoId_InScope(sortStatisticsInfoIdList);
    }

    protected void doSetSortStatisticsInfoId_InScope(Collection<Long> sortStatisticsInfoIdList) {
        regINS(CK_INS, cTL(sortStatisticsInfoIdList), xgetCValueSortStatisticsInfoId(), "SORT_STATISTICS_INFO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortStatisticsInfoIdList The collection of sortStatisticsInfoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortStatisticsInfoId_NotInScope(Collection<Long> sortStatisticsInfoIdList) {
        doSetSortStatisticsInfoId_NotInScope(sortStatisticsInfoIdList);
    }

    protected void doSetSortStatisticsInfoId_NotInScope(Collection<Long> sortStatisticsInfoIdList) {
        regINS(CK_NINS, cTL(sortStatisticsInfoIdList), xgetCValueSortStatisticsInfoId(), "SORT_STATISTICS_INFO_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSortStatisticsInfoId_IsNull() { regSortStatisticsInfoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSortStatisticsInfoId_IsNotNull() { regSortStatisticsInfoId(CK_ISNN, DOBJ); }

    protected void regSortStatisticsInfoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortStatisticsInfoId(), "SORT_STATISTICS_INFO_ID"); }
    protected abstract ConditionValue xgetCValueSortStatisticsInfoId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_Equal(String zzorgncd) {
        doSetZzorgncd_Equal(fRES(zzorgncd));
    }

    protected void doSetZzorgncd_Equal(String zzorgncd) {
        regZzorgncd(CK_EQ, zzorgncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_NotEqual(String zzorgncd) {
        doSetZzorgncd_NotEqual(fRES(zzorgncd));
    }

    protected void doSetZzorgncd_NotEqual(String zzorgncd) {
        regZzorgncd(CK_NES, zzorgncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_GreaterThan(String zzorgncd) {
        regZzorgncd(CK_GT, fRES(zzorgncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_LessThan(String zzorgncd) {
        regZzorgncd(CK_LT, fRES(zzorgncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_GreaterEqual(String zzorgncd) {
        regZzorgncd(CK_GE, fRES(zzorgncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_LessEqual(String zzorgncd) {
        regZzorgncd(CK_LE, fRES(zzorgncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncdList The collection of zzorgncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_InScope(Collection<String> zzorgncdList) {
        doSetZzorgncd_InScope(zzorgncdList);
    }

    protected void doSetZzorgncd_InScope(Collection<String> zzorgncdList) {
        regINS(CK_INS, cTL(zzorgncdList), xgetCValueZzorgncd(), "ZZORGNCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncdList The collection of zzorgncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_NotInScope(Collection<String> zzorgncdList) {
        doSetZzorgncd_NotInScope(zzorgncdList);
    }

    protected void doSetZzorgncd_NotInScope(Collection<String> zzorgncdList) {
        regINS(CK_NINS, cTL(zzorgncdList), xgetCValueZzorgncd(), "ZZORGNCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setZzorgncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzorgncd The value of zzorgncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzorgncd_LikeSearch(String zzorgncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzorgncd), xgetCValueZzorgncd(), "ZZORGNCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzorgncd_NotLikeSearch(String zzorgncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzorgncd), xgetCValueZzorgncd(), "ZZORGNCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_PrefixSearch(String zzorgncd) {
        setZzorgncd_LikeSearch(zzorgncd, xcLSOPPre());
    }

    protected void regZzorgncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzorgncd(), "ZZORGNCD"); }
    protected abstract ConditionValue xgetCValueZzorgncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTYMD: {NotNull, varchar(8)}
     * @param sroprtymd The value of sroprtymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_Equal(String sroprtymd) {
        doSetSroprtymd_Equal(fRES(sroprtymd));
    }

    protected void doSetSroprtymd_Equal(String sroprtymd) {
        regSroprtymd(CK_EQ, sroprtymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTYMD: {NotNull, varchar(8)}
     * @param sroprtymd The value of sroprtymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_NotEqual(String sroprtymd) {
        doSetSroprtymd_NotEqual(fRES(sroprtymd));
    }

    protected void doSetSroprtymd_NotEqual(String sroprtymd) {
        regSroprtymd(CK_NES, sroprtymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTYMD: {NotNull, varchar(8)}
     * @param sroprtymd The value of sroprtymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_GreaterThan(String sroprtymd) {
        regSroprtymd(CK_GT, fRES(sroprtymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTYMD: {NotNull, varchar(8)}
     * @param sroprtymd The value of sroprtymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_LessThan(String sroprtymd) {
        regSroprtymd(CK_LT, fRES(sroprtymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTYMD: {NotNull, varchar(8)}
     * @param sroprtymd The value of sroprtymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_GreaterEqual(String sroprtymd) {
        regSroprtymd(CK_GE, fRES(sroprtymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTYMD: {NotNull, varchar(8)}
     * @param sroprtymd The value of sroprtymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_LessEqual(String sroprtymd) {
        regSroprtymd(CK_LE, fRES(sroprtymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SROPRTYMD: {NotNull, varchar(8)}
     * @param sroprtymdList The collection of sroprtymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_InScope(Collection<String> sroprtymdList) {
        doSetSroprtymd_InScope(sroprtymdList);
    }

    protected void doSetSroprtymd_InScope(Collection<String> sroprtymdList) {
        regINS(CK_INS, cTL(sroprtymdList), xgetCValueSroprtymd(), "SROPRTYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SROPRTYMD: {NotNull, varchar(8)}
     * @param sroprtymdList The collection of sroprtymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_NotInScope(Collection<String> sroprtymdList) {
        doSetSroprtymd_NotInScope(sroprtymdList);
    }

    protected void doSetSroprtymd_NotInScope(Collection<String> sroprtymdList) {
        regINS(CK_NINS, cTL(sroprtymdList), xgetCValueSroprtymd(), "SROPRTYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SROPRTYMD: {NotNull, varchar(8)} <br>
     * <pre>e.g. setSroprtymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sroprtymd The value of sroprtymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSroprtymd_LikeSearch(String sroprtymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sroprtymd), xgetCValueSroprtymd(), "SROPRTYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SROPRTYMD: {NotNull, varchar(8)}
     * @param sroprtymd The value of sroprtymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSroprtymd_NotLikeSearch(String sroprtymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sroprtymd), xgetCValueSroprtymd(), "SROPRTYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SROPRTYMD: {NotNull, varchar(8)}
     * @param sroprtymd The value of sroprtymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_PrefixSearch(String sroprtymd) {
        setSroprtymd_LikeSearch(sroprtymd, xcLSOPPre());
    }

    protected void regSroprtymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSroprtymd(), "SROPRTYMD"); }
    protected abstract ConditionValue xgetCValueSroprtymd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_Equal(Long sroprtcnt) {
        doSetSroprtcnt_Equal(sroprtcnt);
    }

    protected void doSetSroprtcnt_Equal(Long sroprtcnt) {
        regSroprtcnt(CK_EQ, sroprtcnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_NotEqual(Long sroprtcnt) {
        doSetSroprtcnt_NotEqual(sroprtcnt);
    }

    protected void doSetSroprtcnt_NotEqual(Long sroprtcnt) {
        regSroprtcnt(CK_NES, sroprtcnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterThan(Long sroprtcnt) {
        regSroprtcnt(CK_GT, sroprtcnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessThan(Long sroprtcnt) {
        regSroprtcnt(CK_LT, sroprtcnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterEqual(Long sroprtcnt) {
        regSroprtcnt(CK_GE, sroprtcnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessEqual(Long sroprtcnt) {
        regSroprtcnt(CK_LE, sroprtcnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param minNumber The min number of sroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSroprtcnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSroprtcnt(), "SROPRTCNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcntList The collection of sroprtcnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_InScope(Collection<Long> sroprtcntList) {
        doSetSroprtcnt_InScope(sroprtcntList);
    }

    protected void doSetSroprtcnt_InScope(Collection<Long> sroprtcntList) {
        regINS(CK_INS, cTL(sroprtcntList), xgetCValueSroprtcnt(), "SROPRTCNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcntList The collection of sroprtcnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_NotInScope(Collection<Long> sroprtcntList) {
        doSetSroprtcnt_NotInScope(sroprtcntList);
    }

    protected void doSetSroprtcnt_NotInScope(Collection<Long> sroprtcntList) {
        regINS(CK_NINS, cTL(sroprtcntList), xgetCValueSroprtcnt(), "SROPRTCNT");
    }

    protected void regSroprtcnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSroprtcnt(), "SROPRTCNT"); }
    protected abstract ConditionValue xgetCValueSroprtcnt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblk The value of linblk as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_Equal(String linblk) {
        doSetLinblk_Equal(fRES(linblk));
    }

    protected void doSetLinblk_Equal(String linblk) {
        regLinblk(CK_EQ, linblk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblk The value of linblk as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_NotEqual(String linblk) {
        doSetLinblk_NotEqual(fRES(linblk));
    }

    protected void doSetLinblk_NotEqual(String linblk) {
        regLinblk(CK_NES, linblk);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblk The value of linblk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_GreaterThan(String linblk) {
        regLinblk(CK_GT, fRES(linblk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblk The value of linblk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_LessThan(String linblk) {
        regLinblk(CK_LT, fRES(linblk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblk The value of linblk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_GreaterEqual(String linblk) {
        regLinblk(CK_GE, fRES(linblk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblk The value of linblk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_LessEqual(String linblk) {
        regLinblk(CK_LE, fRES(linblk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblkList The collection of linblk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_InScope(Collection<String> linblkList) {
        doSetLinblk_InScope(linblkList);
    }

    protected void doSetLinblk_InScope(Collection<String> linblkList) {
        regINS(CK_INS, cTL(linblkList), xgetCValueLinblk(), "LINBLK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblkList The collection of linblk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_NotInScope(Collection<String> linblkList) {
        doSetLinblk_NotInScope(linblkList);
    }

    protected void doSetLinblk_NotInScope(Collection<String> linblkList) {
        regINS(CK_NINS, cTL(linblkList), xgetCValueLinblk(), "LINBLK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK: {NotNull, varchar(30)} <br>
     * <pre>e.g. setLinblk_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param linblk The value of linblk as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLinblk_LikeSearch(String linblk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(linblk), xgetCValueLinblk(), "LINBLK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblk The value of linblk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLinblk_NotLikeSearch(String linblk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(linblk), xgetCValueLinblk(), "LINBLK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @param linblk The value of linblk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_PrefixSearch(String linblk) {
        setLinblk_LikeSearch(linblk, xcLSOPPre());
    }

    protected void regLinblk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLinblk(), "LINBLK"); }
    protected abstract ConditionValue xgetCValueLinblk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_Equal(String dlvymd) {
        doSetDlvymd_Equal(fRES(dlvymd));
    }

    protected void doSetDlvymd_Equal(String dlvymd) {
        regDlvymd(CK_EQ, dlvymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_NotEqual(String dlvymd) {
        doSetDlvymd_NotEqual(fRES(dlvymd));
    }

    protected void doSetDlvymd_NotEqual(String dlvymd) {
        regDlvymd(CK_NES, dlvymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_GreaterThan(String dlvymd) {
        regDlvymd(CK_GT, fRES(dlvymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_LessThan(String dlvymd) {
        regDlvymd(CK_LT, fRES(dlvymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_GreaterEqual(String dlvymd) {
        regDlvymd(CK_GE, fRES(dlvymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_LessEqual(String dlvymd) {
        regDlvymd(CK_LE, fRES(dlvymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymdList The collection of dlvymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_InScope(Collection<String> dlvymdList) {
        doSetDlvymd_InScope(dlvymdList);
    }

    protected void doSetDlvymd_InScope(Collection<String> dlvymdList) {
        regINS(CK_INS, cTL(dlvymdList), xgetCValueDlvymd(), "DLVYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymdList The collection of dlvymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_NotInScope(Collection<String> dlvymdList) {
        doSetDlvymd_NotInScope(dlvymdList);
    }

    protected void doSetDlvymd_NotInScope(Collection<String> dlvymdList) {
        regINS(CK_NINS, cTL(dlvymdList), xgetCValueDlvymd(), "DLVYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)} <br>
     * <pre>e.g. setDlvymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dlvymd The value of dlvymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDlvymd_LikeSearch(String dlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dlvymd), xgetCValueDlvymd(), "DLVYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDlvymd_NotLikeSearch(String dlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dlvymd), xgetCValueDlvymd(), "DLVYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_PrefixSearch(String dlvymd) {
        setDlvymd_LikeSearch(dlvymd, xcLSOPPre());
    }

    protected void regDlvymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvymd(), "DLVYMD"); }
    protected abstract ConditionValue xgetCValueDlvymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_Equal(String dpcd) {
        doSetDpcd_Equal(fRES(dpcd));
    }

    protected void doSetDpcd_Equal(String dpcd) {
        regDpcd(CK_EQ, dpcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_NotEqual(String dpcd) {
        doSetDpcd_NotEqual(fRES(dpcd));
    }

    protected void doSetDpcd_NotEqual(String dpcd) {
        regDpcd(CK_NES, dpcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterThan(String dpcd) {
        regDpcd(CK_GT, fRES(dpcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessThan(String dpcd) {
        regDpcd(CK_LT, fRES(dpcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterEqual(String dpcd) {
        regDpcd(CK_GE, fRES(dpcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessEqual(String dpcd) {
        regDpcd(CK_LE, fRES(dpcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcdList The collection of dpcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_InScope(Collection<String> dpcdList) {
        doSetDpcd_InScope(dpcdList);
    }

    protected void doSetDpcd_InScope(Collection<String> dpcdList) {
        regINS(CK_INS, cTL(dpcdList), xgetCValueDpcd(), "DPCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcdList The collection of dpcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_NotInScope(Collection<String> dpcdList) {
        doSetDpcd_NotInScope(dpcdList);
    }

    protected void doSetDpcd_NotInScope(Collection<String> dpcdList) {
        regINS(CK_NINS, cTL(dpcdList), xgetCValueDpcd(), "DPCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setDpcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dpcd The value of dpcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDpcd_LikeSearch(String dpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dpcd), xgetCValueDpcd(), "DPCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDpcd_NotLikeSearch(String dpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dpcd), xgetCValueDpcd(), "DPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_PrefixSearch(String dpcd) {
        setDpcd_LikeSearch(dpcd, xcLSOPPre());
    }

    protected void regDpcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDpcd(), "DPCD"); }
    protected abstract ConditionValue xgetCValueDpcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_Equal(String ded) {
        doSetDed_Equal(fRES(ded));
    }

    protected void doSetDed_Equal(String ded) {
        regDed(CK_EQ, ded);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_NotEqual(String ded) {
        doSetDed_NotEqual(fRES(ded));
    }

    protected void doSetDed_NotEqual(String ded) {
        regDed(CK_NES, ded);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterThan(String ded) {
        regDed(CK_GT, fRES(ded));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessThan(String ded) {
        regDed(CK_LT, fRES(ded));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterEqual(String ded) {
        regDed(CK_GE, fRES(ded));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessEqual(String ded) {
        regDed(CK_LE, fRES(ded));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param dedList The collection of ded as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_InScope(Collection<String> dedList) {
        doSetDed_InScope(dedList);
    }

    protected void doSetDed_InScope(Collection<String> dedList) {
        regINS(CK_INS, cTL(dedList), xgetCValueDed(), "DED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param dedList The collection of ded as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_NotInScope(Collection<String> dedList) {
        doSetDed_NotInScope(dedList);
    }

    protected void doSetDed_NotInScope(Collection<String> dedList) {
        regINS(CK_NINS, cTL(dedList), xgetCValueDed(), "DED");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {NotNull, varchar(30)} <br>
     * <pre>e.g. setDed_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ded The value of ded as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDed_LikeSearch(String ded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ded), xgetCValueDed(), "DED", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDed_NotLikeSearch(String ded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ded), xgetCValueDed(), "DED", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_PrefixSearch(String ded) {
        setDed_LikeSearch(ded, xcLSOPPre());
    }

    protected void regDed(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDed(), "DED"); }
    protected abstract ConditionValue xgetCValueDed();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_Equal(String pstnid) {
        doSetPstnid_Equal(fRES(pstnid));
    }

    protected void doSetPstnid_Equal(String pstnid) {
        regPstnid(CK_EQ, pstnid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_NotEqual(String pstnid) {
        doSetPstnid_NotEqual(fRES(pstnid));
    }

    protected void doSetPstnid_NotEqual(String pstnid) {
        regPstnid(CK_NES, pstnid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterThan(String pstnid) {
        regPstnid(CK_GT, fRES(pstnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessThan(String pstnid) {
        regPstnid(CK_LT, fRES(pstnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterEqual(String pstnid) {
        regPstnid(CK_GE, fRES(pstnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessEqual(String pstnid) {
        regPstnid(CK_LE, fRES(pstnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnidList The collection of pstnid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_InScope(Collection<String> pstnidList) {
        doSetPstnid_InScope(pstnidList);
    }

    protected void doSetPstnid_InScope(Collection<String> pstnidList) {
        regINS(CK_INS, cTL(pstnidList), xgetCValuePstnid(), "PSTNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnidList The collection of pstnid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_NotInScope(Collection<String> pstnidList) {
        doSetPstnid_NotInScope(pstnidList);
    }

    protected void doSetPstnid_NotInScope(Collection<String> pstnidList) {
        regINS(CK_NINS, cTL(pstnidList), xgetCValuePstnid(), "PSTNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {NotNull, varchar(30)} <br>
     * <pre>e.g. setPstnid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pstnid The value of pstnid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPstnid_LikeSearch(String pstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pstnid), xgetCValuePstnid(), "PSTNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPstnid_NotLikeSearch(String pstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pstnid), xgetCValuePstnid(), "PSTNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_PrefixSearch(String pstnid) {
        setPstnid_LikeSearch(pstnid, xcLSOPPre());
    }

    protected void regPstnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePstnid(), "PSTNID"); }
    protected abstract ConditionValue xgetCValuePstnid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_Equal(String srlincd) {
        doSetSrlincd_Equal(fRES(srlincd));
    }

    protected void doSetSrlincd_Equal(String srlincd) {
        regSrlincd(CK_EQ, srlincd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_NotEqual(String srlincd) {
        doSetSrlincd_NotEqual(fRES(srlincd));
    }

    protected void doSetSrlincd_NotEqual(String srlincd) {
        regSrlincd(CK_NES, srlincd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_GreaterThan(String srlincd) {
        regSrlincd(CK_GT, fRES(srlincd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_LessThan(String srlincd) {
        regSrlincd(CK_LT, fRES(srlincd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_GreaterEqual(String srlincd) {
        regSrlincd(CK_GE, fRES(srlincd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_LessEqual(String srlincd) {
        regSrlincd(CK_LE, fRES(srlincd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincdList The collection of srlincd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_InScope(Collection<String> srlincdList) {
        doSetSrlincd_InScope(srlincdList);
    }

    protected void doSetSrlincd_InScope(Collection<String> srlincdList) {
        regINS(CK_INS, cTL(srlincdList), xgetCValueSrlincd(), "SRLINCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincdList The collection of srlincd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_NotInScope(Collection<String> srlincdList) {
        doSetSrlincd_NotInScope(srlincdList);
    }

    protected void doSetSrlincd_NotInScope(Collection<String> srlincdList) {
        regINS(CK_NINS, cTL(srlincdList), xgetCValueSrlincd(), "SRLINCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(30)} <br>
     * <pre>e.g. setSrlincd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srlincd The value of srlincd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrlincd_LikeSearch(String srlincd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srlincd), xgetCValueSrlincd(), "SRLINCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrlincd_NotLikeSearch(String srlincd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srlincd), xgetCValueSrlincd(), "SRLINCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_PrefixSearch(String srlincd) {
        setSrlincd_LikeSearch(srlincd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     */
    public void setSrlincd_IsNull() { regSrlincd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     */
    public void setSrlincd_IsNullOrEmpty() { regSrlincd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     */
    public void setSrlincd_IsNotNull() { regSrlincd(CK_ISNN, DOBJ); }

    protected void regSrlincd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrlincd(), "SRLINCD"); }
    protected abstract ConditionValue xgetCValueSrlincd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_Equal(Long srrnk) {
        doSetSrrnk_Equal(srrnk);
    }

    protected void doSetSrrnk_Equal(Long srrnk) {
        regSrrnk(CK_EQ, srrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_NotEqual(Long srrnk) {
        doSetSrrnk_NotEqual(srrnk);
    }

    protected void doSetSrrnk_NotEqual(Long srrnk) {
        regSrrnk(CK_NES, srrnk);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_GreaterThan(Long srrnk) {
        regSrrnk(CK_GT, srrnk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_LessThan(Long srrnk) {
        regSrrnk(CK_LT, srrnk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_GreaterEqual(Long srrnk) {
        regSrrnk(CK_GE, srrnk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_LessEqual(Long srrnk) {
        regSrrnk(CK_LE, srrnk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param minNumber The min number of srrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of srrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSrrnk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSrrnk(), "SRRNK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnkList The collection of srrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_InScope(Collection<Long> srrnkList) {
        doSetSrrnk_InScope(srrnkList);
    }

    protected void doSetSrrnk_InScope(Collection<Long> srrnkList) {
        regINS(CK_INS, cTL(srrnkList), xgetCValueSrrnk(), "SRRNK");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnkList The collection of srrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_NotInScope(Collection<Long> srrnkList) {
        doSetSrrnk_NotInScope(srrnkList);
    }

    protected void doSetSrrnk_NotInScope(Collection<Long> srrnkList) {
        regINS(CK_NINS, cTL(srrnkList), xgetCValueSrrnk(), "SRRNK");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     */
    public void setSrrnk_IsNull() { regSrrnk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     */
    public void setSrrnk_IsNotNull() { regSrrnk(CK_ISNN, DOBJ); }

    protected void regSrrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrrnk(), "SRRNK"); }
    protected abstract ConditionValue xgetCValueSrrnk();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRPAT: {bigint(19)}
     * @param srpat The value of srpat as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrpat_Equal(Long srpat) {
        doSetSrpat_Equal(srpat);
    }

    protected void doSetSrpat_Equal(Long srpat) {
        regSrpat(CK_EQ, srpat);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRPAT: {bigint(19)}
     * @param srpat The value of srpat as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrpat_NotEqual(Long srpat) {
        doSetSrpat_NotEqual(srpat);
    }

    protected void doSetSrpat_NotEqual(Long srpat) {
        regSrpat(CK_NES, srpat);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRPAT: {bigint(19)}
     * @param srpat The value of srpat as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrpat_GreaterThan(Long srpat) {
        regSrpat(CK_GT, srpat);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRPAT: {bigint(19)}
     * @param srpat The value of srpat as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrpat_LessThan(Long srpat) {
        regSrpat(CK_LT, srpat);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRPAT: {bigint(19)}
     * @param srpat The value of srpat as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrpat_GreaterEqual(Long srpat) {
        regSrpat(CK_GE, srpat);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRPAT: {bigint(19)}
     * @param srpat The value of srpat as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrpat_LessEqual(Long srpat) {
        regSrpat(CK_LE, srpat);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SRPAT: {bigint(19)}
     * @param minNumber The min number of srpat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of srpat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSrpat_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSrpat(), "SRPAT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRPAT: {bigint(19)}
     * @param srpatList The collection of srpat as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpat_InScope(Collection<Long> srpatList) {
        doSetSrpat_InScope(srpatList);
    }

    protected void doSetSrpat_InScope(Collection<Long> srpatList) {
        regINS(CK_INS, cTL(srpatList), xgetCValueSrpat(), "SRPAT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRPAT: {bigint(19)}
     * @param srpatList The collection of srpat as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpat_NotInScope(Collection<Long> srpatList) {
        doSetSrpat_NotInScope(srpatList);
    }

    protected void doSetSrpat_NotInScope(Collection<Long> srpatList) {
        regINS(CK_NINS, cTL(srpatList), xgetCValueSrpat(), "SRPAT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRPAT: {bigint(19)}
     */
    public void setSrpat_IsNull() { regSrpat(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRPAT: {bigint(19)}
     */
    public void setSrpat_IsNotNull() { regSrpat(CK_ISNN, DOBJ); }

    protected void regSrpat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrpat(), "SRPAT"); }
    protected abstract ConditionValue xgetCValueSrpat();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBRQA: {bigint(19)}
     * @param ttbrqa The value of ttbrqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtbrqa_Equal(Long ttbrqa) {
        doSetTtbrqa_Equal(ttbrqa);
    }

    protected void doSetTtbrqa_Equal(Long ttbrqa) {
        regTtbrqa(CK_EQ, ttbrqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBRQA: {bigint(19)}
     * @param ttbrqa The value of ttbrqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtbrqa_NotEqual(Long ttbrqa) {
        doSetTtbrqa_NotEqual(ttbrqa);
    }

    protected void doSetTtbrqa_NotEqual(Long ttbrqa) {
        regTtbrqa(CK_NES, ttbrqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBRQA: {bigint(19)}
     * @param ttbrqa The value of ttbrqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtbrqa_GreaterThan(Long ttbrqa) {
        regTtbrqa(CK_GT, ttbrqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBRQA: {bigint(19)}
     * @param ttbrqa The value of ttbrqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtbrqa_LessThan(Long ttbrqa) {
        regTtbrqa(CK_LT, ttbrqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBRQA: {bigint(19)}
     * @param ttbrqa The value of ttbrqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtbrqa_GreaterEqual(Long ttbrqa) {
        regTtbrqa(CK_GE, ttbrqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBRQA: {bigint(19)}
     * @param ttbrqa The value of ttbrqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtbrqa_LessEqual(Long ttbrqa) {
        regTtbrqa(CK_LE, ttbrqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TTBRQA: {bigint(19)}
     * @param minNumber The min number of ttbrqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ttbrqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTtbrqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTtbrqa(), "TTBRQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TTBRQA: {bigint(19)}
     * @param ttbrqaList The collection of ttbrqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtbrqa_InScope(Collection<Long> ttbrqaList) {
        doSetTtbrqa_InScope(ttbrqaList);
    }

    protected void doSetTtbrqa_InScope(Collection<Long> ttbrqaList) {
        regINS(CK_INS, cTL(ttbrqaList), xgetCValueTtbrqa(), "TTBRQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TTBRQA: {bigint(19)}
     * @param ttbrqaList The collection of ttbrqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtbrqa_NotInScope(Collection<Long> ttbrqaList) {
        doSetTtbrqa_NotInScope(ttbrqaList);
    }

    protected void doSetTtbrqa_NotInScope(Collection<Long> ttbrqaList) {
        regINS(CK_NINS, cTL(ttbrqaList), xgetCValueTtbrqa(), "TTBRQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TTBRQA: {bigint(19)}
     */
    public void setTtbrqa_IsNull() { regTtbrqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TTBRQA: {bigint(19)}
     */
    public void setTtbrqa_IsNotNull() { regTtbrqa(CK_ISNN, DOBJ); }

    protected void regTtbrqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTtbrqa(), "TTBRQA"); }
    protected abstract ConditionValue xgetCValueTtbrqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHPQA: {bigint(19)}
     * @param shpqa The value of shpqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShpqa_Equal(Long shpqa) {
        doSetShpqa_Equal(shpqa);
    }

    protected void doSetShpqa_Equal(Long shpqa) {
        regShpqa(CK_EQ, shpqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHPQA: {bigint(19)}
     * @param shpqa The value of shpqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShpqa_NotEqual(Long shpqa) {
        doSetShpqa_NotEqual(shpqa);
    }

    protected void doSetShpqa_NotEqual(Long shpqa) {
        regShpqa(CK_NES, shpqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHPQA: {bigint(19)}
     * @param shpqa The value of shpqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShpqa_GreaterThan(Long shpqa) {
        regShpqa(CK_GT, shpqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHPQA: {bigint(19)}
     * @param shpqa The value of shpqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShpqa_LessThan(Long shpqa) {
        regShpqa(CK_LT, shpqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHPQA: {bigint(19)}
     * @param shpqa The value of shpqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShpqa_GreaterEqual(Long shpqa) {
        regShpqa(CK_GE, shpqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHPQA: {bigint(19)}
     * @param shpqa The value of shpqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShpqa_LessEqual(Long shpqa) {
        regShpqa(CK_LE, shpqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHPQA: {bigint(19)}
     * @param minNumber The min number of shpqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shpqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShpqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShpqa(), "SHPQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHPQA: {bigint(19)}
     * @param shpqaList The collection of shpqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShpqa_InScope(Collection<Long> shpqaList) {
        doSetShpqa_InScope(shpqaList);
    }

    protected void doSetShpqa_InScope(Collection<Long> shpqaList) {
        regINS(CK_INS, cTL(shpqaList), xgetCValueShpqa(), "SHPQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHPQA: {bigint(19)}
     * @param shpqaList The collection of shpqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShpqa_NotInScope(Collection<Long> shpqaList) {
        doSetShpqa_NotInScope(shpqaList);
    }

    protected void doSetShpqa_NotInScope(Collection<Long> shpqaList) {
        regINS(CK_NINS, cTL(shpqaList), xgetCValueShpqa(), "SHPQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHPQA: {bigint(19)}
     */
    public void setShpqa_IsNull() { regShpqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHPQA: {bigint(19)}
     */
    public void setShpqa_IsNotNull() { regShpqa(CK_ISNN, DOBJ); }

    protected void regShpqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShpqa(), "SHPQA"); }
    protected abstract ConditionValue xgetCValueShpqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {bigint(19)}
     * @param sprqasftpcl The value of sprqasftpcl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqasftpcl_Equal(Long sprqasftpcl) {
        doSetSprqasftpcl_Equal(sprqasftpcl);
    }

    protected void doSetSprqasftpcl_Equal(Long sprqasftpcl) {
        regSprqasftpcl(CK_EQ, sprqasftpcl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {bigint(19)}
     * @param sprqasftpcl The value of sprqasftpcl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqasftpcl_NotEqual(Long sprqasftpcl) {
        doSetSprqasftpcl_NotEqual(sprqasftpcl);
    }

    protected void doSetSprqasftpcl_NotEqual(Long sprqasftpcl) {
        regSprqasftpcl(CK_NES, sprqasftpcl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {bigint(19)}
     * @param sprqasftpcl The value of sprqasftpcl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqasftpcl_GreaterThan(Long sprqasftpcl) {
        regSprqasftpcl(CK_GT, sprqasftpcl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {bigint(19)}
     * @param sprqasftpcl The value of sprqasftpcl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqasftpcl_LessThan(Long sprqasftpcl) {
        regSprqasftpcl(CK_LT, sprqasftpcl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {bigint(19)}
     * @param sprqasftpcl The value of sprqasftpcl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqasftpcl_GreaterEqual(Long sprqasftpcl) {
        regSprqasftpcl(CK_GE, sprqasftpcl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {bigint(19)}
     * @param sprqasftpcl The value of sprqasftpcl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqasftpcl_LessEqual(Long sprqasftpcl) {
        regSprqasftpcl(CK_LE, sprqasftpcl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {bigint(19)}
     * @param minNumber The min number of sprqasftpcl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sprqasftpcl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSprqasftpcl_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSprqasftpcl(), "SPRQASFTPCL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQASFTPCL: {bigint(19)}
     * @param sprqasftpclList The collection of sprqasftpcl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqasftpcl_InScope(Collection<Long> sprqasftpclList) {
        doSetSprqasftpcl_InScope(sprqasftpclList);
    }

    protected void doSetSprqasftpcl_InScope(Collection<Long> sprqasftpclList) {
        regINS(CK_INS, cTL(sprqasftpclList), xgetCValueSprqasftpcl(), "SPRQASFTPCL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQASFTPCL: {bigint(19)}
     * @param sprqasftpclList The collection of sprqasftpcl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqasftpcl_NotInScope(Collection<Long> sprqasftpclList) {
        doSetSprqasftpcl_NotInScope(sprqasftpclList);
    }

    protected void doSetSprqasftpcl_NotInScope(Collection<Long> sprqasftpclList) {
        regINS(CK_NINS, cTL(sprqasftpclList), xgetCValueSprqasftpcl(), "SPRQASFTPCL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {bigint(19)}
     */
    public void setSprqasftpcl_IsNull() { regSprqasftpcl(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {bigint(19)}
     */
    public void setSprqasftpcl_IsNotNull() { regSprqasftpcl(CK_ISNN, DOBJ); }

    protected void regSprqasftpcl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqasftpcl(), "SPRQASFTPCL"); }
    protected abstract ConditionValue xgetCValueSprqasftpcl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {bigint(19)}
     * @param sprqatsnbox The value of sprqatsnbox as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqatsnbox_Equal(Long sprqatsnbox) {
        doSetSprqatsnbox_Equal(sprqatsnbox);
    }

    protected void doSetSprqatsnbox_Equal(Long sprqatsnbox) {
        regSprqatsnbox(CK_EQ, sprqatsnbox);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {bigint(19)}
     * @param sprqatsnbox The value of sprqatsnbox as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqatsnbox_NotEqual(Long sprqatsnbox) {
        doSetSprqatsnbox_NotEqual(sprqatsnbox);
    }

    protected void doSetSprqatsnbox_NotEqual(Long sprqatsnbox) {
        regSprqatsnbox(CK_NES, sprqatsnbox);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {bigint(19)}
     * @param sprqatsnbox The value of sprqatsnbox as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqatsnbox_GreaterThan(Long sprqatsnbox) {
        regSprqatsnbox(CK_GT, sprqatsnbox);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {bigint(19)}
     * @param sprqatsnbox The value of sprqatsnbox as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqatsnbox_LessThan(Long sprqatsnbox) {
        regSprqatsnbox(CK_LT, sprqatsnbox);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {bigint(19)}
     * @param sprqatsnbox The value of sprqatsnbox as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqatsnbox_GreaterEqual(Long sprqatsnbox) {
        regSprqatsnbox(CK_GE, sprqatsnbox);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {bigint(19)}
     * @param sprqatsnbox The value of sprqatsnbox as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqatsnbox_LessEqual(Long sprqatsnbox) {
        regSprqatsnbox(CK_LE, sprqatsnbox);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {bigint(19)}
     * @param minNumber The min number of sprqatsnbox. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sprqatsnbox. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSprqatsnbox_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSprqatsnbox(), "SPRQATSNBOX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQATSNBOX: {bigint(19)}
     * @param sprqatsnboxList The collection of sprqatsnbox as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqatsnbox_InScope(Collection<Long> sprqatsnboxList) {
        doSetSprqatsnbox_InScope(sprqatsnboxList);
    }

    protected void doSetSprqatsnbox_InScope(Collection<Long> sprqatsnboxList) {
        regINS(CK_INS, cTL(sprqatsnboxList), xgetCValueSprqatsnbox(), "SPRQATSNBOX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQATSNBOX: {bigint(19)}
     * @param sprqatsnboxList The collection of sprqatsnbox as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqatsnbox_NotInScope(Collection<Long> sprqatsnboxList) {
        doSetSprqatsnbox_NotInScope(sprqatsnboxList);
    }

    protected void doSetSprqatsnbox_NotInScope(Collection<Long> sprqatsnboxList) {
        regINS(CK_NINS, cTL(sprqatsnboxList), xgetCValueSprqatsnbox(), "SPRQATSNBOX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {bigint(19)}
     */
    public void setSprqatsnbox_IsNull() { regSprqatsnbox(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {bigint(19)}
     */
    public void setSprqatsnbox_IsNotNull() { regSprqatsnbox(CK_ISNN, DOBJ); }

    protected void regSprqatsnbox(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqatsnbox(), "SPRQATSNBOX"); }
    protected abstract ConditionValue xgetCValueSprqatsnbox();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {bigint(19)}
     * @param sprqajtbox The value of sprqajtbox as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqajtbox_Equal(Long sprqajtbox) {
        doSetSprqajtbox_Equal(sprqajtbox);
    }

    protected void doSetSprqajtbox_Equal(Long sprqajtbox) {
        regSprqajtbox(CK_EQ, sprqajtbox);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {bigint(19)}
     * @param sprqajtbox The value of sprqajtbox as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqajtbox_NotEqual(Long sprqajtbox) {
        doSetSprqajtbox_NotEqual(sprqajtbox);
    }

    protected void doSetSprqajtbox_NotEqual(Long sprqajtbox) {
        regSprqajtbox(CK_NES, sprqajtbox);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {bigint(19)}
     * @param sprqajtbox The value of sprqajtbox as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqajtbox_GreaterThan(Long sprqajtbox) {
        regSprqajtbox(CK_GT, sprqajtbox);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {bigint(19)}
     * @param sprqajtbox The value of sprqajtbox as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqajtbox_LessThan(Long sprqajtbox) {
        regSprqajtbox(CK_LT, sprqajtbox);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {bigint(19)}
     * @param sprqajtbox The value of sprqajtbox as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqajtbox_GreaterEqual(Long sprqajtbox) {
        regSprqajtbox(CK_GE, sprqajtbox);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {bigint(19)}
     * @param sprqajtbox The value of sprqajtbox as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqajtbox_LessEqual(Long sprqajtbox) {
        regSprqajtbox(CK_LE, sprqajtbox);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {bigint(19)}
     * @param minNumber The min number of sprqajtbox. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sprqajtbox. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSprqajtbox_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSprqajtbox(), "SPRQAJTBOX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQAJTBOX: {bigint(19)}
     * @param sprqajtboxList The collection of sprqajtbox as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqajtbox_InScope(Collection<Long> sprqajtboxList) {
        doSetSprqajtbox_InScope(sprqajtboxList);
    }

    protected void doSetSprqajtbox_InScope(Collection<Long> sprqajtboxList) {
        regINS(CK_INS, cTL(sprqajtboxList), xgetCValueSprqajtbox(), "SPRQAJTBOX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQAJTBOX: {bigint(19)}
     * @param sprqajtboxList The collection of sprqajtbox as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqajtbox_NotInScope(Collection<Long> sprqajtboxList) {
        doSetSprqajtbox_NotInScope(sprqajtboxList);
    }

    protected void doSetSprqajtbox_NotInScope(Collection<Long> sprqajtboxList) {
        regINS(CK_NINS, cTL(sprqajtboxList), xgetCValueSprqajtbox(), "SPRQAJTBOX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {bigint(19)}
     */
    public void setSprqajtbox_IsNull() { regSprqajtbox(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {bigint(19)}
     */
    public void setSprqajtbox_IsNotNull() { regSprqajtbox(CK_ISNN, DOBJ); }

    protected void regSprqajtbox(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqajtbox(), "SPRQAJTBOX"); }
    protected abstract ConditionValue xgetCValueSprqajtbox();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQA100BOX: {bigint(19)}
     * @param sprqa100box The value of sprqa100box as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqa100box_Equal(Long sprqa100box) {
        doSetSprqa100box_Equal(sprqa100box);
    }

    protected void doSetSprqa100box_Equal(Long sprqa100box) {
        regSprqa100box(CK_EQ, sprqa100box);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQA100BOX: {bigint(19)}
     * @param sprqa100box The value of sprqa100box as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqa100box_NotEqual(Long sprqa100box) {
        doSetSprqa100box_NotEqual(sprqa100box);
    }

    protected void doSetSprqa100box_NotEqual(Long sprqa100box) {
        regSprqa100box(CK_NES, sprqa100box);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQA100BOX: {bigint(19)}
     * @param sprqa100box The value of sprqa100box as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqa100box_GreaterThan(Long sprqa100box) {
        regSprqa100box(CK_GT, sprqa100box);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQA100BOX: {bigint(19)}
     * @param sprqa100box The value of sprqa100box as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqa100box_LessThan(Long sprqa100box) {
        regSprqa100box(CK_LT, sprqa100box);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQA100BOX: {bigint(19)}
     * @param sprqa100box The value of sprqa100box as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqa100box_GreaterEqual(Long sprqa100box) {
        regSprqa100box(CK_GE, sprqa100box);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQA100BOX: {bigint(19)}
     * @param sprqa100box The value of sprqa100box as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqa100box_LessEqual(Long sprqa100box) {
        regSprqa100box(CK_LE, sprqa100box);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQA100BOX: {bigint(19)}
     * @param minNumber The min number of sprqa100box. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sprqa100box. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSprqa100box_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSprqa100box(), "SPRQA100BOX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQA100BOX: {bigint(19)}
     * @param sprqa100boxList The collection of sprqa100box as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqa100box_InScope(Collection<Long> sprqa100boxList) {
        doSetSprqa100box_InScope(sprqa100boxList);
    }

    protected void doSetSprqa100box_InScope(Collection<Long> sprqa100boxList) {
        regINS(CK_INS, cTL(sprqa100boxList), xgetCValueSprqa100box(), "SPRQA100BOX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQA100BOX: {bigint(19)}
     * @param sprqa100boxList The collection of sprqa100box as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqa100box_NotInScope(Collection<Long> sprqa100boxList) {
        doSetSprqa100box_NotInScope(sprqa100boxList);
    }

    protected void doSetSprqa100box_NotInScope(Collection<Long> sprqa100boxList) {
        regINS(CK_NINS, cTL(sprqa100boxList), xgetCValueSprqa100box(), "SPRQA100BOX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQA100BOX: {bigint(19)}
     */
    public void setSprqa100box_IsNull() { regSprqa100box(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQA100BOX: {bigint(19)}
     */
    public void setSprqa100box_IsNotNull() { regSprqa100box(CK_ISNN, DOBJ); }

    protected void regSprqa100box(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqa100box(), "SPRQA100BOX"); }
    protected abstract ConditionValue xgetCValueSprqa100box();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL: {bigint(19)}
     * @param sprqahl The value of sprqahl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl_Equal(Long sprqahl) {
        doSetSprqahl_Equal(sprqahl);
    }

    protected void doSetSprqahl_Equal(Long sprqahl) {
        regSprqahl(CK_EQ, sprqahl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL: {bigint(19)}
     * @param sprqahl The value of sprqahl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl_NotEqual(Long sprqahl) {
        doSetSprqahl_NotEqual(sprqahl);
    }

    protected void doSetSprqahl_NotEqual(Long sprqahl) {
        regSprqahl(CK_NES, sprqahl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL: {bigint(19)}
     * @param sprqahl The value of sprqahl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl_GreaterThan(Long sprqahl) {
        regSprqahl(CK_GT, sprqahl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL: {bigint(19)}
     * @param sprqahl The value of sprqahl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl_LessThan(Long sprqahl) {
        regSprqahl(CK_LT, sprqahl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL: {bigint(19)}
     * @param sprqahl The value of sprqahl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl_GreaterEqual(Long sprqahl) {
        regSprqahl(CK_GE, sprqahl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL: {bigint(19)}
     * @param sprqahl The value of sprqahl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl_LessEqual(Long sprqahl) {
        regSprqahl(CK_LE, sprqahl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL: {bigint(19)}
     * @param minNumber The min number of sprqahl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sprqahl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSprqahl_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSprqahl(), "SPRQAHL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQAHL: {bigint(19)}
     * @param sprqahlList The collection of sprqahl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl_InScope(Collection<Long> sprqahlList) {
        doSetSprqahl_InScope(sprqahlList);
    }

    protected void doSetSprqahl_InScope(Collection<Long> sprqahlList) {
        regINS(CK_INS, cTL(sprqahlList), xgetCValueSprqahl(), "SPRQAHL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQAHL: {bigint(19)}
     * @param sprqahlList The collection of sprqahl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl_NotInScope(Collection<Long> sprqahlList) {
        doSetSprqahl_NotInScope(sprqahlList);
    }

    protected void doSetSprqahl_NotInScope(Collection<Long> sprqahlList) {
        regINS(CK_NINS, cTL(sprqahlList), xgetCValueSprqahl(), "SPRQAHL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQAHL: {bigint(19)}
     */
    public void setSprqahl_IsNull() { regSprqahl(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQAHL: {bigint(19)}
     */
    public void setSprqahl_IsNotNull() { regSprqahl(CK_ISNN, DOBJ); }

    protected void regSprqahl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqahl(), "SPRQAHL"); }
    protected abstract ConditionValue xgetCValueSprqahl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAFUL: {bigint(19)}
     * @param sprqaful The value of sprqaful as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqaful_Equal(Long sprqaful) {
        doSetSprqaful_Equal(sprqaful);
    }

    protected void doSetSprqaful_Equal(Long sprqaful) {
        regSprqaful(CK_EQ, sprqaful);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAFUL: {bigint(19)}
     * @param sprqaful The value of sprqaful as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqaful_NotEqual(Long sprqaful) {
        doSetSprqaful_NotEqual(sprqaful);
    }

    protected void doSetSprqaful_NotEqual(Long sprqaful) {
        regSprqaful(CK_NES, sprqaful);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAFUL: {bigint(19)}
     * @param sprqaful The value of sprqaful as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqaful_GreaterThan(Long sprqaful) {
        regSprqaful(CK_GT, sprqaful);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAFUL: {bigint(19)}
     * @param sprqaful The value of sprqaful as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqaful_LessThan(Long sprqaful) {
        regSprqaful(CK_LT, sprqaful);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAFUL: {bigint(19)}
     * @param sprqaful The value of sprqaful as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqaful_GreaterEqual(Long sprqaful) {
        regSprqaful(CK_GE, sprqaful);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAFUL: {bigint(19)}
     * @param sprqaful The value of sprqaful as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqaful_LessEqual(Long sprqaful) {
        regSprqaful(CK_LE, sprqaful);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAFUL: {bigint(19)}
     * @param minNumber The min number of sprqaful. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sprqaful. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSprqaful_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSprqaful(), "SPRQAFUL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQAFUL: {bigint(19)}
     * @param sprqafulList The collection of sprqaful as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqaful_InScope(Collection<Long> sprqafulList) {
        doSetSprqaful_InScope(sprqafulList);
    }

    protected void doSetSprqaful_InScope(Collection<Long> sprqafulList) {
        regINS(CK_INS, cTL(sprqafulList), xgetCValueSprqaful(), "SPRQAFUL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQAFUL: {bigint(19)}
     * @param sprqafulList The collection of sprqaful as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqaful_NotInScope(Collection<Long> sprqafulList) {
        doSetSprqaful_NotInScope(sprqafulList);
    }

    protected void doSetSprqaful_NotInScope(Collection<Long> sprqafulList) {
        regINS(CK_NINS, cTL(sprqafulList), xgetCValueSprqaful(), "SPRQAFUL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQAFUL: {bigint(19)}
     */
    public void setSprqaful_IsNull() { regSprqaful(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQAFUL: {bigint(19)}
     */
    public void setSprqaful_IsNotNull() { regSprqaful(CK_ISNN, DOBJ); }

    protected void regSprqaful(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqaful(), "SPRQAFUL"); }
    protected abstract ConditionValue xgetCValueSprqaful();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {bigint(19), default=[(0)]}
     * @param sprqahlbgbox The value of sprqahlbgbox as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahlbgbox_Equal(Long sprqahlbgbox) {
        doSetSprqahlbgbox_Equal(sprqahlbgbox);
    }

    protected void doSetSprqahlbgbox_Equal(Long sprqahlbgbox) {
        regSprqahlbgbox(CK_EQ, sprqahlbgbox);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {bigint(19), default=[(0)]}
     * @param sprqahlbgbox The value of sprqahlbgbox as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahlbgbox_NotEqual(Long sprqahlbgbox) {
        doSetSprqahlbgbox_NotEqual(sprqahlbgbox);
    }

    protected void doSetSprqahlbgbox_NotEqual(Long sprqahlbgbox) {
        regSprqahlbgbox(CK_NES, sprqahlbgbox);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {bigint(19), default=[(0)]}
     * @param sprqahlbgbox The value of sprqahlbgbox as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahlbgbox_GreaterThan(Long sprqahlbgbox) {
        regSprqahlbgbox(CK_GT, sprqahlbgbox);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {bigint(19), default=[(0)]}
     * @param sprqahlbgbox The value of sprqahlbgbox as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahlbgbox_LessThan(Long sprqahlbgbox) {
        regSprqahlbgbox(CK_LT, sprqahlbgbox);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {bigint(19), default=[(0)]}
     * @param sprqahlbgbox The value of sprqahlbgbox as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahlbgbox_GreaterEqual(Long sprqahlbgbox) {
        regSprqahlbgbox(CK_GE, sprqahlbgbox);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {bigint(19), default=[(0)]}
     * @param sprqahlbgbox The value of sprqahlbgbox as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahlbgbox_LessEqual(Long sprqahlbgbox) {
        regSprqahlbgbox(CK_LE, sprqahlbgbox);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {bigint(19), default=[(0)]}
     * @param minNumber The min number of sprqahlbgbox. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sprqahlbgbox. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSprqahlbgbox_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSprqahlbgbox(), "SPRQAHLBGBOX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQAHLBGBOX: {bigint(19), default=[(0)]}
     * @param sprqahlbgboxList The collection of sprqahlbgbox as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahlbgbox_InScope(Collection<Long> sprqahlbgboxList) {
        doSetSprqahlbgbox_InScope(sprqahlbgboxList);
    }

    protected void doSetSprqahlbgbox_InScope(Collection<Long> sprqahlbgboxList) {
        regINS(CK_INS, cTL(sprqahlbgboxList), xgetCValueSprqahlbgbox(), "SPRQAHLBGBOX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQAHLBGBOX: {bigint(19), default=[(0)]}
     * @param sprqahlbgboxList The collection of sprqahlbgbox as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahlbgbox_NotInScope(Collection<Long> sprqahlbgboxList) {
        doSetSprqahlbgbox_NotInScope(sprqahlbgboxList);
    }

    protected void doSetSprqahlbgbox_NotInScope(Collection<Long> sprqahlbgboxList) {
        regINS(CK_NINS, cTL(sprqahlbgboxList), xgetCValueSprqahlbgbox(), "SPRQAHLBGBOX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {bigint(19), default=[(0)]}
     */
    public void setSprqahlbgbox_IsNull() { regSprqahlbgbox(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {bigint(19), default=[(0)]}
     */
    public void setSprqahlbgbox_IsNotNull() { regSprqahlbgbox(CK_ISNN, DOBJ); }

    protected void regSprqahlbgbox(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqahlbgbox(), "SPRQAHLBGBOX"); }
    protected abstract ConditionValue xgetCValueSprqahlbgbox();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {bigint(19), default=[(0)]}
     * @param sprqahl12box The value of sprqahl12box as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl12box_Equal(Long sprqahl12box) {
        doSetSprqahl12box_Equal(sprqahl12box);
    }

    protected void doSetSprqahl12box_Equal(Long sprqahl12box) {
        regSprqahl12box(CK_EQ, sprqahl12box);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {bigint(19), default=[(0)]}
     * @param sprqahl12box The value of sprqahl12box as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl12box_NotEqual(Long sprqahl12box) {
        doSetSprqahl12box_NotEqual(sprqahl12box);
    }

    protected void doSetSprqahl12box_NotEqual(Long sprqahl12box) {
        regSprqahl12box(CK_NES, sprqahl12box);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {bigint(19), default=[(0)]}
     * @param sprqahl12box The value of sprqahl12box as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl12box_GreaterThan(Long sprqahl12box) {
        regSprqahl12box(CK_GT, sprqahl12box);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {bigint(19), default=[(0)]}
     * @param sprqahl12box The value of sprqahl12box as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl12box_LessThan(Long sprqahl12box) {
        regSprqahl12box(CK_LT, sprqahl12box);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {bigint(19), default=[(0)]}
     * @param sprqahl12box The value of sprqahl12box as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl12box_GreaterEqual(Long sprqahl12box) {
        regSprqahl12box(CK_GE, sprqahl12box);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {bigint(19), default=[(0)]}
     * @param sprqahl12box The value of sprqahl12box as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl12box_LessEqual(Long sprqahl12box) {
        regSprqahl12box(CK_LE, sprqahl12box);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {bigint(19), default=[(0)]}
     * @param minNumber The min number of sprqahl12box. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sprqahl12box. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSprqahl12box_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSprqahl12box(), "SPRQAHL12BOX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQAHL12BOX: {bigint(19), default=[(0)]}
     * @param sprqahl12boxList The collection of sprqahl12box as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl12box_InScope(Collection<Long> sprqahl12boxList) {
        doSetSprqahl12box_InScope(sprqahl12boxList);
    }

    protected void doSetSprqahl12box_InScope(Collection<Long> sprqahl12boxList) {
        regINS(CK_INS, cTL(sprqahl12boxList), xgetCValueSprqahl12box(), "SPRQAHL12BOX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQAHL12BOX: {bigint(19), default=[(0)]}
     * @param sprqahl12boxList The collection of sprqahl12box as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl12box_NotInScope(Collection<Long> sprqahl12boxList) {
        doSetSprqahl12box_NotInScope(sprqahl12boxList);
    }

    protected void doSetSprqahl12box_NotInScope(Collection<Long> sprqahl12boxList) {
        regINS(CK_NINS, cTL(sprqahl12boxList), xgetCValueSprqahl12box(), "SPRQAHL12BOX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {bigint(19), default=[(0)]}
     */
    public void setSprqahl12box_IsNull() { regSprqahl12box(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {bigint(19), default=[(0)]}
     */
    public void setSprqahl12box_IsNotNull() { regSprqahl12box(CK_ISNN, DOBJ); }

    protected void regSprqahl12box(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqahl12box(), "SPRQAHL12BOX"); }
    protected abstract ConditionValue xgetCValueSprqahl12box();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {bigint(19), default=[(0)]}
     * @param sprqahl5box The value of sprqahl5box as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl5box_Equal(Long sprqahl5box) {
        doSetSprqahl5box_Equal(sprqahl5box);
    }

    protected void doSetSprqahl5box_Equal(Long sprqahl5box) {
        regSprqahl5box(CK_EQ, sprqahl5box);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {bigint(19), default=[(0)]}
     * @param sprqahl5box The value of sprqahl5box as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl5box_NotEqual(Long sprqahl5box) {
        doSetSprqahl5box_NotEqual(sprqahl5box);
    }

    protected void doSetSprqahl5box_NotEqual(Long sprqahl5box) {
        regSprqahl5box(CK_NES, sprqahl5box);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {bigint(19), default=[(0)]}
     * @param sprqahl5box The value of sprqahl5box as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl5box_GreaterThan(Long sprqahl5box) {
        regSprqahl5box(CK_GT, sprqahl5box);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {bigint(19), default=[(0)]}
     * @param sprqahl5box The value of sprqahl5box as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl5box_LessThan(Long sprqahl5box) {
        regSprqahl5box(CK_LT, sprqahl5box);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {bigint(19), default=[(0)]}
     * @param sprqahl5box The value of sprqahl5box as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl5box_GreaterEqual(Long sprqahl5box) {
        regSprqahl5box(CK_GE, sprqahl5box);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {bigint(19), default=[(0)]}
     * @param sprqahl5box The value of sprqahl5box as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSprqahl5box_LessEqual(Long sprqahl5box) {
        regSprqahl5box(CK_LE, sprqahl5box);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {bigint(19), default=[(0)]}
     * @param minNumber The min number of sprqahl5box. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sprqahl5box. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSprqahl5box_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSprqahl5box(), "SPRQAHL5BOX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQAHL5BOX: {bigint(19), default=[(0)]}
     * @param sprqahl5boxList The collection of sprqahl5box as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl5box_InScope(Collection<Long> sprqahl5boxList) {
        doSetSprqahl5box_InScope(sprqahl5boxList);
    }

    protected void doSetSprqahl5box_InScope(Collection<Long> sprqahl5boxList) {
        regINS(CK_INS, cTL(sprqahl5boxList), xgetCValueSprqahl5box(), "SPRQAHL5BOX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPRQAHL5BOX: {bigint(19), default=[(0)]}
     * @param sprqahl5boxList The collection of sprqahl5box as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl5box_NotInScope(Collection<Long> sprqahl5boxList) {
        doSetSprqahl5box_NotInScope(sprqahl5boxList);
    }

    protected void doSetSprqahl5box_NotInScope(Collection<Long> sprqahl5boxList) {
        regINS(CK_NINS, cTL(sprqahl5boxList), xgetCValueSprqahl5box(), "SPRQAHL5BOX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {bigint(19), default=[(0)]}
     */
    public void setSprqahl5box_IsNull() { regSprqahl5box(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {bigint(19), default=[(0)]}
     */
    public void setSprqahl5box_IsNotNull() { regSprqahl5box(CK_ISNN, DOBJ); }

    protected void regSprqahl5box(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqahl5box(), "SPRQAHL5BOX"); }
    protected abstract ConditionValue xgetCValueSprqahl5box();

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
    public HpSLCFunction<TCsrstinfCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TCsrstinfCB.class);
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
    public HpSLCFunction<TCsrstinfCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TCsrstinfCB.class);
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
    public HpSLCFunction<TCsrstinfCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TCsrstinfCB.class);
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
    public HpSLCFunction<TCsrstinfCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TCsrstinfCB.class);
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
    public HpSLCFunction<TCsrstinfCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TCsrstinfCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TCsrstinfCB&gt;() {
     *     public void query(TCsrstinfCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TCsrstinfCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TCsrstinfCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TCsrstinfCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TCsrstinfCQ sq);

    protected TCsrstinfCB xcreateScalarConditionCB() {
        TCsrstinfCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TCsrstinfCB xcreateScalarConditionPartitionByCB() {
        TCsrstinfCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TCsrstinfCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCsrstinfCB cb = new TCsrstinfCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SORT_STATISTICS_INFO_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TCsrstinfCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TCsrstinfCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TCsrstinfCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCsrstinfCB cb = new TCsrstinfCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SORT_STATISTICS_INFO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TCsrstinfCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TCsrstinfCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCsrstinfCB cb = new TCsrstinfCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TCsrstinfCQ sq);

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
    protected TCsrstinfCB newMyCB() {
        return new TCsrstinfCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TCsrstinfCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
