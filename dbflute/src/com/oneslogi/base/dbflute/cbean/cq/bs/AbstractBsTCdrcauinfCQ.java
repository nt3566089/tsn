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
 * The abstract condition-query of T_CDRCAUINF.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTCdrcauinfCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTCdrcauinfCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_CDRCAUINF";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HOUMEN_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param houmenTotalInfoId The value of houmenTotalInfoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHoumenTotalInfoId_Equal(Long houmenTotalInfoId) {
        doSetHoumenTotalInfoId_Equal(houmenTotalInfoId);
    }

    protected void doSetHoumenTotalInfoId_Equal(Long houmenTotalInfoId) {
        regHoumenTotalInfoId(CK_EQ, houmenTotalInfoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HOUMEN_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param houmenTotalInfoId The value of houmenTotalInfoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHoumenTotalInfoId_NotEqual(Long houmenTotalInfoId) {
        doSetHoumenTotalInfoId_NotEqual(houmenTotalInfoId);
    }

    protected void doSetHoumenTotalInfoId_NotEqual(Long houmenTotalInfoId) {
        regHoumenTotalInfoId(CK_NES, houmenTotalInfoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HOUMEN_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param houmenTotalInfoId The value of houmenTotalInfoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHoumenTotalInfoId_GreaterThan(Long houmenTotalInfoId) {
        regHoumenTotalInfoId(CK_GT, houmenTotalInfoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HOUMEN_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param houmenTotalInfoId The value of houmenTotalInfoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHoumenTotalInfoId_LessThan(Long houmenTotalInfoId) {
        regHoumenTotalInfoId(CK_LT, houmenTotalInfoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HOUMEN_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param houmenTotalInfoId The value of houmenTotalInfoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHoumenTotalInfoId_GreaterEqual(Long houmenTotalInfoId) {
        regHoumenTotalInfoId(CK_GE, houmenTotalInfoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HOUMEN_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param houmenTotalInfoId The value of houmenTotalInfoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHoumenTotalInfoId_LessEqual(Long houmenTotalInfoId) {
        regHoumenTotalInfoId(CK_LE, houmenTotalInfoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HOUMEN_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of houmenTotalInfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of houmenTotalInfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHoumenTotalInfoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHoumenTotalInfoId(), "HOUMEN_TOTAL_INFO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HOUMEN_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param houmenTotalInfoIdList The collection of houmenTotalInfoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHoumenTotalInfoId_InScope(Collection<Long> houmenTotalInfoIdList) {
        doSetHoumenTotalInfoId_InScope(houmenTotalInfoIdList);
    }

    protected void doSetHoumenTotalInfoId_InScope(Collection<Long> houmenTotalInfoIdList) {
        regINS(CK_INS, cTL(houmenTotalInfoIdList), xgetCValueHoumenTotalInfoId(), "HOUMEN_TOTAL_INFO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HOUMEN_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param houmenTotalInfoIdList The collection of houmenTotalInfoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHoumenTotalInfoId_NotInScope(Collection<Long> houmenTotalInfoIdList) {
        doSetHoumenTotalInfoId_NotInScope(houmenTotalInfoIdList);
    }

    protected void doSetHoumenTotalInfoId_NotInScope(Collection<Long> houmenTotalInfoIdList) {
        regINS(CK_NINS, cTL(houmenTotalInfoIdList), xgetCValueHoumenTotalInfoId(), "HOUMEN_TOTAL_INFO_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HOUMEN_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setHoumenTotalInfoId_IsNull() { regHoumenTotalInfoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HOUMEN_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setHoumenTotalInfoId_IsNotNull() { regHoumenTotalInfoId(CK_ISNN, DOBJ); }

    protected void regHoumenTotalInfoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHoumenTotalInfoId(), "HOUMEN_TOTAL_INFO_ID"); }
    protected abstract ConditionValue xgetCValueHoumenTotalInfoId();

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
     * ZZPSTNID: {NotNull, varchar(30)}
     * @param zzpstnid The value of zzpstnid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_Equal(String zzpstnid) {
        doSetZzpstnid_Equal(fRES(zzpstnid));
    }

    protected void doSetZzpstnid_Equal(String zzpstnid) {
        regZzpstnid(CK_EQ, zzpstnid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZPSTNID: {NotNull, varchar(30)}
     * @param zzpstnid The value of zzpstnid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_NotEqual(String zzpstnid) {
        doSetZzpstnid_NotEqual(fRES(zzpstnid));
    }

    protected void doSetZzpstnid_NotEqual(String zzpstnid) {
        regZzpstnid(CK_NES, zzpstnid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZPSTNID: {NotNull, varchar(30)}
     * @param zzpstnid The value of zzpstnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_GreaterThan(String zzpstnid) {
        regZzpstnid(CK_GT, fRES(zzpstnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZPSTNID: {NotNull, varchar(30)}
     * @param zzpstnid The value of zzpstnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_LessThan(String zzpstnid) {
        regZzpstnid(CK_LT, fRES(zzpstnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZPSTNID: {NotNull, varchar(30)}
     * @param zzpstnid The value of zzpstnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_GreaterEqual(String zzpstnid) {
        regZzpstnid(CK_GE, fRES(zzpstnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZPSTNID: {NotNull, varchar(30)}
     * @param zzpstnid The value of zzpstnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_LessEqual(String zzpstnid) {
        regZzpstnid(CK_LE, fRES(zzpstnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZPSTNID: {NotNull, varchar(30)}
     * @param zzpstnidList The collection of zzpstnid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_InScope(Collection<String> zzpstnidList) {
        doSetZzpstnid_InScope(zzpstnidList);
    }

    protected void doSetZzpstnid_InScope(Collection<String> zzpstnidList) {
        regINS(CK_INS, cTL(zzpstnidList), xgetCValueZzpstnid(), "ZZPSTNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZPSTNID: {NotNull, varchar(30)}
     * @param zzpstnidList The collection of zzpstnid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_NotInScope(Collection<String> zzpstnidList) {
        doSetZzpstnid_NotInScope(zzpstnidList);
    }

    protected void doSetZzpstnid_NotInScope(Collection<String> zzpstnidList) {
        regINS(CK_NINS, cTL(zzpstnidList), xgetCValueZzpstnid(), "ZZPSTNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZPSTNID: {NotNull, varchar(30)} <br>
     * <pre>e.g. setZzpstnid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzpstnid The value of zzpstnid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzpstnid_LikeSearch(String zzpstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzpstnid), xgetCValueZzpstnid(), "ZZPSTNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZPSTNID: {NotNull, varchar(30)}
     * @param zzpstnid The value of zzpstnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzpstnid_NotLikeSearch(String zzpstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzpstnid), xgetCValueZzpstnid(), "ZZPSTNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZPSTNID: {NotNull, varchar(30)}
     * @param zzpstnid The value of zzpstnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzpstnid_PrefixSearch(String zzpstnid) {
        setZzpstnid_LikeSearch(zzpstnid, xcLSOPPre());
    }

    protected void regZzpstnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzpstnid(), "ZZPSTNID"); }
    protected abstract ConditionValue xgetCValueZzpstnid();

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
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnr The value of zzmatnr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_Equal(String zzmatnr) {
        doSetZzmatnr_Equal(fRES(zzmatnr));
    }

    protected void doSetZzmatnr_Equal(String zzmatnr) {
        regZzmatnr(CK_EQ, zzmatnr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnr The value of zzmatnr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_NotEqual(String zzmatnr) {
        doSetZzmatnr_NotEqual(fRES(zzmatnr));
    }

    protected void doSetZzmatnr_NotEqual(String zzmatnr) {
        regZzmatnr(CK_NES, zzmatnr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnr The value of zzmatnr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_GreaterThan(String zzmatnr) {
        regZzmatnr(CK_GT, fRES(zzmatnr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnr The value of zzmatnr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_LessThan(String zzmatnr) {
        regZzmatnr(CK_LT, fRES(zzmatnr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnr The value of zzmatnr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_GreaterEqual(String zzmatnr) {
        regZzmatnr(CK_GE, fRES(zzmatnr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnr The value of zzmatnr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_LessEqual(String zzmatnr) {
        regZzmatnr(CK_LE, fRES(zzmatnr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnrList The collection of zzmatnr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_InScope(Collection<String> zzmatnrList) {
        doSetZzmatnr_InScope(zzmatnrList);
    }

    protected void doSetZzmatnr_InScope(Collection<String> zzmatnrList) {
        regINS(CK_INS, cTL(zzmatnrList), xgetCValueZzmatnr(), "ZZMATNR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnrList The collection of zzmatnr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_NotInScope(Collection<String> zzmatnrList) {
        doSetZzmatnr_NotInScope(zzmatnrList);
    }

    protected void doSetZzmatnr_NotInScope(Collection<String> zzmatnrList) {
        regINS(CK_NINS, cTL(zzmatnrList), xgetCValueZzmatnr(), "ZZMATNR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)} <br>
     * <pre>e.g. setZzmatnr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzmatnr The value of zzmatnr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzmatnr_LikeSearch(String zzmatnr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzmatnr), xgetCValueZzmatnr(), "ZZMATNR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnr The value of zzmatnr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzmatnr_NotLikeSearch(String zzmatnr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzmatnr), xgetCValueZzmatnr(), "ZZMATNR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnr The value of zzmatnr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_PrefixSearch(String zzmatnr) {
        setZzmatnr_LikeSearch(zzmatnr, xcLSOPPre());
    }

    protected void regZzmatnr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzmatnr(), "ZZMATNR"); }
    protected abstract ConditionValue xgetCValueZzmatnr();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CBQA: {bigint(19)}
     * @param cbqa The value of cbqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCbqa_Equal(Long cbqa) {
        doSetCbqa_Equal(cbqa);
    }

    protected void doSetCbqa_Equal(Long cbqa) {
        regCbqa(CK_EQ, cbqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CBQA: {bigint(19)}
     * @param cbqa The value of cbqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCbqa_NotEqual(Long cbqa) {
        doSetCbqa_NotEqual(cbqa);
    }

    protected void doSetCbqa_NotEqual(Long cbqa) {
        regCbqa(CK_NES, cbqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CBQA: {bigint(19)}
     * @param cbqa The value of cbqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCbqa_GreaterThan(Long cbqa) {
        regCbqa(CK_GT, cbqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CBQA: {bigint(19)}
     * @param cbqa The value of cbqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCbqa_LessThan(Long cbqa) {
        regCbqa(CK_LT, cbqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CBQA: {bigint(19)}
     * @param cbqa The value of cbqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCbqa_GreaterEqual(Long cbqa) {
        regCbqa(CK_GE, cbqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CBQA: {bigint(19)}
     * @param cbqa The value of cbqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCbqa_LessEqual(Long cbqa) {
        regCbqa(CK_LE, cbqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CBQA: {bigint(19)}
     * @param minNumber The min number of cbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCbqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCbqa(), "CBQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CBQA: {bigint(19)}
     * @param cbqaList The collection of cbqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbqa_InScope(Collection<Long> cbqaList) {
        doSetCbqa_InScope(cbqaList);
    }

    protected void doSetCbqa_InScope(Collection<Long> cbqaList) {
        regINS(CK_INS, cTL(cbqaList), xgetCValueCbqa(), "CBQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CBQA: {bigint(19)}
     * @param cbqaList The collection of cbqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbqa_NotInScope(Collection<Long> cbqaList) {
        doSetCbqa_NotInScope(cbqaList);
    }

    protected void doSetCbqa_NotInScope(Collection<Long> cbqaList) {
        regINS(CK_NINS, cTL(cbqaList), xgetCValueCbqa(), "CBQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CBQA: {bigint(19)}
     */
    public void setCbqa_IsNull() { regCbqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CBQA: {bigint(19)}
     */
    public void setCbqa_IsNotNull() { regCbqa(CK_ISNN, DOBJ); }

    protected void regCbqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCbqa(), "CBQA"); }
    protected abstract ConditionValue xgetCValueCbqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param ctnum The value of ctnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtnum_Equal(Long ctnum) {
        doSetCtnum_Equal(ctnum);
    }

    protected void doSetCtnum_Equal(Long ctnum) {
        regCtnum(CK_EQ, ctnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param ctnum The value of ctnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtnum_NotEqual(Long ctnum) {
        doSetCtnum_NotEqual(ctnum);
    }

    protected void doSetCtnum_NotEqual(Long ctnum) {
        regCtnum(CK_NES, ctnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param ctnum The value of ctnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtnum_GreaterThan(Long ctnum) {
        regCtnum(CK_GT, ctnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param ctnum The value of ctnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtnum_LessThan(Long ctnum) {
        regCtnum(CK_LT, ctnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param ctnum The value of ctnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtnum_GreaterEqual(Long ctnum) {
        regCtnum(CK_GE, ctnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param ctnum The value of ctnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtnum_LessEqual(Long ctnum) {
        regCtnum(CK_LE, ctnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param minNumber The min number of ctnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ctnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCtnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCtnum(), "CTNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param ctnumList The collection of ctnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtnum_InScope(Collection<Long> ctnumList) {
        doSetCtnum_InScope(ctnumList);
    }

    protected void doSetCtnum_InScope(Collection<Long> ctnumList) {
        regINS(CK_INS, cTL(ctnumList), xgetCValueCtnum(), "CTNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param ctnumList The collection of ctnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtnum_NotInScope(Collection<Long> ctnumList) {
        doSetCtnum_NotInScope(ctnumList);
    }

    protected void doSetCtnum_NotInScope(Collection<Long> ctnumList) {
        regINS(CK_NINS, cTL(ctnumList), xgetCValueCtnum(), "CTNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     */
    public void setCtnum_IsNull() { regCtnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     */
    public void setCtnum_IsNotNull() { regCtnum(CK_ISNN, DOBJ); }

    protected void regCtnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtnum(), "CTNUM"); }
    protected abstract ConditionValue xgetCValueCtnum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZQACP: {bigint(19)}
     * @param zqacp The value of zqacp as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setZqacp_Equal(Long zqacp) {
        doSetZqacp_Equal(zqacp);
    }

    protected void doSetZqacp_Equal(Long zqacp) {
        regZqacp(CK_EQ, zqacp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZQACP: {bigint(19)}
     * @param zqacp The value of zqacp as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZqacp_NotEqual(Long zqacp) {
        doSetZqacp_NotEqual(zqacp);
    }

    protected void doSetZqacp_NotEqual(Long zqacp) {
        regZqacp(CK_NES, zqacp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZQACP: {bigint(19)}
     * @param zqacp The value of zqacp as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZqacp_GreaterThan(Long zqacp) {
        regZqacp(CK_GT, zqacp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZQACP: {bigint(19)}
     * @param zqacp The value of zqacp as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZqacp_LessThan(Long zqacp) {
        regZqacp(CK_LT, zqacp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZQACP: {bigint(19)}
     * @param zqacp The value of zqacp as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZqacp_GreaterEqual(Long zqacp) {
        regZqacp(CK_GE, zqacp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZQACP: {bigint(19)}
     * @param zqacp The value of zqacp as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZqacp_LessEqual(Long zqacp) {
        regZqacp(CK_LE, zqacp);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ZQACP: {bigint(19)}
     * @param minNumber The min number of zqacp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of zqacp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setZqacp_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueZqacp(), "ZQACP", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZQACP: {bigint(19)}
     * @param zqacpList The collection of zqacp as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZqacp_InScope(Collection<Long> zqacpList) {
        doSetZqacp_InScope(zqacpList);
    }

    protected void doSetZqacp_InScope(Collection<Long> zqacpList) {
        regINS(CK_INS, cTL(zqacpList), xgetCValueZqacp(), "ZQACP");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZQACP: {bigint(19)}
     * @param zqacpList The collection of zqacp as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZqacp_NotInScope(Collection<Long> zqacpList) {
        doSetZqacp_NotInScope(zqacpList);
    }

    protected void doSetZqacp_NotInScope(Collection<Long> zqacpList) {
        regINS(CK_NINS, cTL(zqacpList), xgetCValueZqacp(), "ZQACP");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZQACP: {bigint(19)}
     */
    public void setZqacp_IsNull() { regZqacp(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZQACP: {bigint(19)}
     */
    public void setZqacp_IsNotNull() { regZqacp(CK_ISNN, DOBJ); }

    protected void regZqacp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZqacp(), "ZQACP"); }
    protected abstract ConditionValue xgetCValueZqacp();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZQACTQA: {bigint(19)}
     * @param zqactqa The value of zqactqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setZqactqa_Equal(Long zqactqa) {
        doSetZqactqa_Equal(zqactqa);
    }

    protected void doSetZqactqa_Equal(Long zqactqa) {
        regZqactqa(CK_EQ, zqactqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZQACTQA: {bigint(19)}
     * @param zqactqa The value of zqactqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZqactqa_NotEqual(Long zqactqa) {
        doSetZqactqa_NotEqual(zqactqa);
    }

    protected void doSetZqactqa_NotEqual(Long zqactqa) {
        regZqactqa(CK_NES, zqactqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZQACTQA: {bigint(19)}
     * @param zqactqa The value of zqactqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZqactqa_GreaterThan(Long zqactqa) {
        regZqactqa(CK_GT, zqactqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZQACTQA: {bigint(19)}
     * @param zqactqa The value of zqactqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZqactqa_LessThan(Long zqactqa) {
        regZqactqa(CK_LT, zqactqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZQACTQA: {bigint(19)}
     * @param zqactqa The value of zqactqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZqactqa_GreaterEqual(Long zqactqa) {
        regZqactqa(CK_GE, zqactqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZQACTQA: {bigint(19)}
     * @param zqactqa The value of zqactqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZqactqa_LessEqual(Long zqactqa) {
        regZqactqa(CK_LE, zqactqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ZQACTQA: {bigint(19)}
     * @param minNumber The min number of zqactqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of zqactqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setZqactqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueZqactqa(), "ZQACTQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZQACTQA: {bigint(19)}
     * @param zqactqaList The collection of zqactqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZqactqa_InScope(Collection<Long> zqactqaList) {
        doSetZqactqa_InScope(zqactqaList);
    }

    protected void doSetZqactqa_InScope(Collection<Long> zqactqaList) {
        regINS(CK_INS, cTL(zqactqaList), xgetCValueZqactqa(), "ZQACTQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZQACTQA: {bigint(19)}
     * @param zqactqaList The collection of zqactqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZqactqa_NotInScope(Collection<Long> zqactqaList) {
        doSetZqactqa_NotInScope(zqactqaList);
    }

    protected void doSetZqactqa_NotInScope(Collection<Long> zqactqaList) {
        regINS(CK_NINS, cTL(zqactqaList), xgetCValueZqactqa(), "ZQACTQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZQACTQA: {bigint(19)}
     */
    public void setZqactqa_IsNull() { regZqactqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZQACTQA: {bigint(19)}
     */
    public void setZqactqa_IsNotNull() { regZqactqa(CK_ISNN, DOBJ); }

    protected void regZqactqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZqactqa(), "ZQACTQA"); }
    protected abstract ConditionValue xgetCValueZqactqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SSQA: {bigint(19)}
     * @param ssqa The value of ssqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSsqa_Equal(Long ssqa) {
        doSetSsqa_Equal(ssqa);
    }

    protected void doSetSsqa_Equal(Long ssqa) {
        regSsqa(CK_EQ, ssqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SSQA: {bigint(19)}
     * @param ssqa The value of ssqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSsqa_NotEqual(Long ssqa) {
        doSetSsqa_NotEqual(ssqa);
    }

    protected void doSetSsqa_NotEqual(Long ssqa) {
        regSsqa(CK_NES, ssqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SSQA: {bigint(19)}
     * @param ssqa The value of ssqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSsqa_GreaterThan(Long ssqa) {
        regSsqa(CK_GT, ssqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SSQA: {bigint(19)}
     * @param ssqa The value of ssqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSsqa_LessThan(Long ssqa) {
        regSsqa(CK_LT, ssqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SSQA: {bigint(19)}
     * @param ssqa The value of ssqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSsqa_GreaterEqual(Long ssqa) {
        regSsqa(CK_GE, ssqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SSQA: {bigint(19)}
     * @param ssqa The value of ssqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSsqa_LessEqual(Long ssqa) {
        regSsqa(CK_LE, ssqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SSQA: {bigint(19)}
     * @param minNumber The min number of ssqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ssqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSsqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSsqa(), "SSQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SSQA: {bigint(19)}
     * @param ssqaList The collection of ssqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsqa_InScope(Collection<Long> ssqaList) {
        doSetSsqa_InScope(ssqaList);
    }

    protected void doSetSsqa_InScope(Collection<Long> ssqaList) {
        regINS(CK_INS, cTL(ssqaList), xgetCValueSsqa(), "SSQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SSQA: {bigint(19)}
     * @param ssqaList The collection of ssqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsqa_NotInScope(Collection<Long> ssqaList) {
        doSetSsqa_NotInScope(ssqaList);
    }

    protected void doSetSsqa_NotInScope(Collection<Long> ssqaList) {
        regINS(CK_NINS, cTL(ssqaList), xgetCValueSsqa(), "SSQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SSQA: {bigint(19)}
     */
    public void setSsqa_IsNull() { regSsqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SSQA: {bigint(19)}
     */
    public void setSsqa_IsNotNull() { regSsqa(CK_ISNN, DOBJ); }

    protected void regSsqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSsqa(), "SSQA"); }
    protected abstract ConditionValue xgetCValueSsqa();

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
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

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
    public HpSLCFunction<TCdrcauinfCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TCdrcauinfCB.class);
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
    public HpSLCFunction<TCdrcauinfCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TCdrcauinfCB.class);
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
    public HpSLCFunction<TCdrcauinfCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TCdrcauinfCB.class);
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
    public HpSLCFunction<TCdrcauinfCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TCdrcauinfCB.class);
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
    public HpSLCFunction<TCdrcauinfCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TCdrcauinfCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TCdrcauinfCB&gt;() {
     *     public void query(TCdrcauinfCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TCdrcauinfCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TCdrcauinfCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TCdrcauinfCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TCdrcauinfCQ sq);

    protected TCdrcauinfCB xcreateScalarConditionCB() {
        TCdrcauinfCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TCdrcauinfCB xcreateScalarConditionPartitionByCB() {
        TCdrcauinfCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TCdrcauinfCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCdrcauinfCB cb = new TCdrcauinfCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "HOUMEN_TOTAL_INFO_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TCdrcauinfCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TCdrcauinfCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TCdrcauinfCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCdrcauinfCB cb = new TCdrcauinfCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "HOUMEN_TOTAL_INFO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TCdrcauinfCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TCdrcauinfCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCdrcauinfCB cb = new TCdrcauinfCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TCdrcauinfCQ sq);

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
    protected TCdrcauinfCB newMyCB() {
        return new TCdrcauinfCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TCdrcauinfCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
