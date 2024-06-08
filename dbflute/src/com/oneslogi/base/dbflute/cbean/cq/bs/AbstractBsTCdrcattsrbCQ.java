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
 * The abstract condition-query of T_CDRCATTSRB.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTCdrcattsrbCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTCdrcattsrbCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_CDRCATTSRB";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HOUMEN_SORT_BLOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param houmenSortBlockId The value of houmenSortBlockId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHoumenSortBlockId_Equal(Long houmenSortBlockId) {
        doSetHoumenSortBlockId_Equal(houmenSortBlockId);
    }

    protected void doSetHoumenSortBlockId_Equal(Long houmenSortBlockId) {
        regHoumenSortBlockId(CK_EQ, houmenSortBlockId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HOUMEN_SORT_BLOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param houmenSortBlockId The value of houmenSortBlockId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHoumenSortBlockId_NotEqual(Long houmenSortBlockId) {
        doSetHoumenSortBlockId_NotEqual(houmenSortBlockId);
    }

    protected void doSetHoumenSortBlockId_NotEqual(Long houmenSortBlockId) {
        regHoumenSortBlockId(CK_NES, houmenSortBlockId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HOUMEN_SORT_BLOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param houmenSortBlockId The value of houmenSortBlockId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHoumenSortBlockId_GreaterThan(Long houmenSortBlockId) {
        regHoumenSortBlockId(CK_GT, houmenSortBlockId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HOUMEN_SORT_BLOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param houmenSortBlockId The value of houmenSortBlockId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHoumenSortBlockId_LessThan(Long houmenSortBlockId) {
        regHoumenSortBlockId(CK_LT, houmenSortBlockId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HOUMEN_SORT_BLOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param houmenSortBlockId The value of houmenSortBlockId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHoumenSortBlockId_GreaterEqual(Long houmenSortBlockId) {
        regHoumenSortBlockId(CK_GE, houmenSortBlockId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HOUMEN_SORT_BLOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param houmenSortBlockId The value of houmenSortBlockId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHoumenSortBlockId_LessEqual(Long houmenSortBlockId) {
        regHoumenSortBlockId(CK_LE, houmenSortBlockId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HOUMEN_SORT_BLOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of houmenSortBlockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of houmenSortBlockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHoumenSortBlockId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHoumenSortBlockId(), "HOUMEN_SORT_BLOCK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HOUMEN_SORT_BLOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param houmenSortBlockIdList The collection of houmenSortBlockId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHoumenSortBlockId_InScope(Collection<Long> houmenSortBlockIdList) {
        doSetHoumenSortBlockId_InScope(houmenSortBlockIdList);
    }

    protected void doSetHoumenSortBlockId_InScope(Collection<Long> houmenSortBlockIdList) {
        regINS(CK_INS, cTL(houmenSortBlockIdList), xgetCValueHoumenSortBlockId(), "HOUMEN_SORT_BLOCK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HOUMEN_SORT_BLOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param houmenSortBlockIdList The collection of houmenSortBlockId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHoumenSortBlockId_NotInScope(Collection<Long> houmenSortBlockIdList) {
        doSetHoumenSortBlockId_NotInScope(houmenSortBlockIdList);
    }

    protected void doSetHoumenSortBlockId_NotInScope(Collection<Long> houmenSortBlockIdList) {
        regINS(CK_NINS, cTL(houmenSortBlockIdList), xgetCValueHoumenSortBlockId(), "HOUMEN_SORT_BLOCK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HOUMEN_SORT_BLOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setHoumenSortBlockId_IsNull() { regHoumenSortBlockId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HOUMEN_SORT_BLOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setHoumenSortBlockId_IsNotNull() { regHoumenSortBlockId(CK_ISNN, DOBJ); }

    protected void regHoumenSortBlockId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHoumenSortBlockId(), "HOUMEN_SORT_BLOCK_ID"); }
    protected abstract ConditionValue xgetCValueHoumenSortBlockId();

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
     * DRCCD: {NotNull, varchar(30)}
     * @param drccd The value of drccd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_Equal(String drccd) {
        doSetDrccd_Equal(fRES(drccd));
    }

    protected void doSetDrccd_Equal(String drccd) {
        regDrccd(CK_EQ, drccd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccd The value of drccd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_NotEqual(String drccd) {
        doSetDrccd_NotEqual(fRES(drccd));
    }

    protected void doSetDrccd_NotEqual(String drccd) {
        regDrccd(CK_NES, drccd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccd The value of drccd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_GreaterThan(String drccd) {
        regDrccd(CK_GT, fRES(drccd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccd The value of drccd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_LessThan(String drccd) {
        regDrccd(CK_LT, fRES(drccd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccd The value of drccd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_GreaterEqual(String drccd) {
        regDrccd(CK_GE, fRES(drccd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccd The value of drccd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_LessEqual(String drccd) {
        regDrccd(CK_LE, fRES(drccd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccdList The collection of drccd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_InScope(Collection<String> drccdList) {
        doSetDrccd_InScope(drccdList);
    }

    protected void doSetDrccd_InScope(Collection<String> drccdList) {
        regINS(CK_INS, cTL(drccdList), xgetCValueDrccd(), "DRCCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccdList The collection of drccd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_NotInScope(Collection<String> drccdList) {
        doSetDrccd_NotInScope(drccdList);
    }

    protected void doSetDrccd_NotInScope(Collection<String> drccdList) {
        regINS(CK_NINS, cTL(drccdList), xgetCValueDrccd(), "DRCCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DRCCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setDrccd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param drccd The value of drccd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDrccd_LikeSearch(String drccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(drccd), xgetCValueDrccd(), "DRCCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccd The value of drccd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDrccd_NotLikeSearch(String drccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(drccd), xgetCValueDrccd(), "DRCCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @param drccd The value of drccd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrccd_PrefixSearch(String drccd) {
        setDrccd_LikeSearch(drccd, xcLSOPPre());
    }

    protected void regDrccd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDrccd(), "DRCCD"); }
    protected abstract ConditionValue xgetCValueDrccd();

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
     * IOID: {NotNull, char(1)}
     * @param ioid The value of ioid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_Equal(String ioid) {
        doSetIoid_Equal(fRES(ioid));
    }

    protected void doSetIoid_Equal(String ioid) {
        regIoid(CK_EQ, ioid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioid The value of ioid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_NotEqual(String ioid) {
        doSetIoid_NotEqual(fRES(ioid));
    }

    protected void doSetIoid_NotEqual(String ioid) {
        regIoid(CK_NES, ioid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioid The value of ioid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_GreaterThan(String ioid) {
        regIoid(CK_GT, fRES(ioid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioid The value of ioid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_LessThan(String ioid) {
        regIoid(CK_LT, fRES(ioid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioid The value of ioid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_GreaterEqual(String ioid) {
        regIoid(CK_GE, fRES(ioid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioid The value of ioid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_LessEqual(String ioid) {
        regIoid(CK_LE, fRES(ioid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioidList The collection of ioid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_InScope(Collection<String> ioidList) {
        doSetIoid_InScope(ioidList);
    }

    protected void doSetIoid_InScope(Collection<String> ioidList) {
        regINS(CK_INS, cTL(ioidList), xgetCValueIoid(), "IOID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioidList The collection of ioid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_NotInScope(Collection<String> ioidList) {
        doSetIoid_NotInScope(ioidList);
    }

    protected void doSetIoid_NotInScope(Collection<String> ioidList) {
        regINS(CK_NINS, cTL(ioidList), xgetCValueIoid(), "IOID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IOID: {NotNull, char(1)} <br>
     * <pre>e.g. setIoid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ioid The value of ioid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIoid_LikeSearch(String ioid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ioid), xgetCValueIoid(), "IOID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioid The value of ioid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIoid_NotLikeSearch(String ioid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ioid), xgetCValueIoid(), "IOID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IOID: {NotNull, char(1)}
     * @param ioid The value of ioid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoid_PrefixSearch(String ioid) {
        setIoid_LikeSearch(ioid, xcLSOPPre());
    }

    protected void regIoid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIoid(), "IOID"); }
    protected abstract ConditionValue xgetCValueIoid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlin The value of srlin as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_Equal(String srlin) {
        doSetSrlin_Equal(fRES(srlin));
    }

    protected void doSetSrlin_Equal(String srlin) {
        regSrlin(CK_EQ, srlin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlin The value of srlin as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_NotEqual(String srlin) {
        doSetSrlin_NotEqual(fRES(srlin));
    }

    protected void doSetSrlin_NotEqual(String srlin) {
        regSrlin(CK_NES, srlin);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlin The value of srlin as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_GreaterThan(String srlin) {
        regSrlin(CK_GT, fRES(srlin));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlin The value of srlin as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_LessThan(String srlin) {
        regSrlin(CK_LT, fRES(srlin));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlin The value of srlin as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_GreaterEqual(String srlin) {
        regSrlin(CK_GE, fRES(srlin));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlin The value of srlin as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_LessEqual(String srlin) {
        regSrlin(CK_LE, fRES(srlin));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlinList The collection of srlin as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_InScope(Collection<String> srlinList) {
        doSetSrlin_InScope(srlinList);
    }

    protected void doSetSrlin_InScope(Collection<String> srlinList) {
        regINS(CK_INS, cTL(srlinList), xgetCValueSrlin(), "SRLIN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlinList The collection of srlin as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_NotInScope(Collection<String> srlinList) {
        doSetSrlin_NotInScope(srlinList);
    }

    protected void doSetSrlin_NotInScope(Collection<String> srlinList) {
        regINS(CK_NINS, cTL(srlinList), xgetCValueSrlin(), "SRLIN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLIN: {varchar(30)} <br>
     * <pre>e.g. setSrlin_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srlin The value of srlin as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrlin_LikeSearch(String srlin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srlin), xgetCValueSrlin(), "SRLIN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlin The value of srlin as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrlin_NotLikeSearch(String srlin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srlin), xgetCValueSrlin(), "SRLIN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLIN: {varchar(30)}
     * @param srlin The value of srlin as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlin_PrefixSearch(String srlin) {
        setSrlin_LikeSearch(srlin, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     */
    public void setSrlin_IsNull() { regSrlin(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     */
    public void setSrlin_IsNullOrEmpty() { regSrlin(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRLIN: {varchar(30)}
     */
    public void setSrlin_IsNotNull() { regSrlin(CK_ISNN, DOBJ); }

    protected void regSrlin(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrlin(), "SRLIN"); }
    protected abstract ConditionValue xgetCValueSrlin();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcd The value of blkcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_Equal(String blkcd) {
        doSetBlkcd_Equal(fRES(blkcd));
    }

    protected void doSetBlkcd_Equal(String blkcd) {
        regBlkcd(CK_EQ, blkcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcd The value of blkcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_NotEqual(String blkcd) {
        doSetBlkcd_NotEqual(fRES(blkcd));
    }

    protected void doSetBlkcd_NotEqual(String blkcd) {
        regBlkcd(CK_NES, blkcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcd The value of blkcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_GreaterThan(String blkcd) {
        regBlkcd(CK_GT, fRES(blkcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcd The value of blkcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_LessThan(String blkcd) {
        regBlkcd(CK_LT, fRES(blkcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcd The value of blkcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_GreaterEqual(String blkcd) {
        regBlkcd(CK_GE, fRES(blkcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcd The value of blkcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_LessEqual(String blkcd) {
        regBlkcd(CK_LE, fRES(blkcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcdList The collection of blkcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_InScope(Collection<String> blkcdList) {
        doSetBlkcd_InScope(blkcdList);
    }

    protected void doSetBlkcd_InScope(Collection<String> blkcdList) {
        regINS(CK_INS, cTL(blkcdList), xgetCValueBlkcd(), "BLKCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcdList The collection of blkcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_NotInScope(Collection<String> blkcdList) {
        doSetBlkcd_NotInScope(blkcdList);
    }

    protected void doSetBlkcd_NotInScope(Collection<String> blkcdList) {
        regINS(CK_NINS, cTL(blkcdList), xgetCValueBlkcd(), "BLKCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLKCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setBlkcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param blkcd The value of blkcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBlkcd_LikeSearch(String blkcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(blkcd), xgetCValueBlkcd(), "BLKCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcd The value of blkcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBlkcd_NotLikeSearch(String blkcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(blkcd), xgetCValueBlkcd(), "BLKCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @param blkcd The value of blkcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkcd_PrefixSearch(String blkcd) {
        setBlkcd_LikeSearch(blkcd, xcLSOPPre());
    }

    protected void regBlkcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBlkcd(), "BLKCD"); }
    protected abstract ConditionValue xgetCValueBlkcd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSRRNKS: {bigint(19)}
     * @param blksrrnks The value of blksrrnks as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlksrrnks_Equal(Long blksrrnks) {
        doSetBlksrrnks_Equal(blksrrnks);
    }

    protected void doSetBlksrrnks_Equal(Long blksrrnks) {
        regBlksrrnks(CK_EQ, blksrrnks);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSRRNKS: {bigint(19)}
     * @param blksrrnks The value of blksrrnks as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlksrrnks_NotEqual(Long blksrrnks) {
        doSetBlksrrnks_NotEqual(blksrrnks);
    }

    protected void doSetBlksrrnks_NotEqual(Long blksrrnks) {
        regBlksrrnks(CK_NES, blksrrnks);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSRRNKS: {bigint(19)}
     * @param blksrrnks The value of blksrrnks as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlksrrnks_GreaterThan(Long blksrrnks) {
        regBlksrrnks(CK_GT, blksrrnks);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSRRNKS: {bigint(19)}
     * @param blksrrnks The value of blksrrnks as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlksrrnks_LessThan(Long blksrrnks) {
        regBlksrrnks(CK_LT, blksrrnks);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSRRNKS: {bigint(19)}
     * @param blksrrnks The value of blksrrnks as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlksrrnks_GreaterEqual(Long blksrrnks) {
        regBlksrrnks(CK_GE, blksrrnks);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSRRNKS: {bigint(19)}
     * @param blksrrnks The value of blksrrnks as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlksrrnks_LessEqual(Long blksrrnks) {
        regBlksrrnks(CK_LE, blksrrnks);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSRRNKS: {bigint(19)}
     * @param minNumber The min number of blksrrnks. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of blksrrnks. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBlksrrnks_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBlksrrnks(), "BLKSRRNKS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLKSRRNKS: {bigint(19)}
     * @param blksrrnksList The collection of blksrrnks as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlksrrnks_InScope(Collection<Long> blksrrnksList) {
        doSetBlksrrnks_InScope(blksrrnksList);
    }

    protected void doSetBlksrrnks_InScope(Collection<Long> blksrrnksList) {
        regINS(CK_INS, cTL(blksrrnksList), xgetCValueBlksrrnks(), "BLKSRRNKS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLKSRRNKS: {bigint(19)}
     * @param blksrrnksList The collection of blksrrnks as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlksrrnks_NotInScope(Collection<Long> blksrrnksList) {
        doSetBlksrrnks_NotInScope(blksrrnksList);
    }

    protected void doSetBlksrrnks_NotInScope(Collection<Long> blksrrnksList) {
        regINS(CK_NINS, cTL(blksrrnksList), xgetCValueBlksrrnks(), "BLKSRRNKS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLKSRRNKS: {bigint(19)}
     */
    public void setBlksrrnks_IsNull() { regBlksrrnks(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLKSRRNKS: {bigint(19)}
     */
    public void setBlksrrnks_IsNotNull() { regBlksrrnks(CK_ISNN, DOBJ); }

    protected void regBlksrrnks(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBlksrrnks(), "BLKSRRNKS"); }
    protected abstract ConditionValue xgetCValueBlksrrnks();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSRRNK: {bigint(19)}
     * @param blksrrnk The value of blksrrnk as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlksrrnk_Equal(Long blksrrnk) {
        doSetBlksrrnk_Equal(blksrrnk);
    }

    protected void doSetBlksrrnk_Equal(Long blksrrnk) {
        regBlksrrnk(CK_EQ, blksrrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSRRNK: {bigint(19)}
     * @param blksrrnk The value of blksrrnk as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlksrrnk_NotEqual(Long blksrrnk) {
        doSetBlksrrnk_NotEqual(blksrrnk);
    }

    protected void doSetBlksrrnk_NotEqual(Long blksrrnk) {
        regBlksrrnk(CK_NES, blksrrnk);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSRRNK: {bigint(19)}
     * @param blksrrnk The value of blksrrnk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlksrrnk_GreaterThan(Long blksrrnk) {
        regBlksrrnk(CK_GT, blksrrnk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSRRNK: {bigint(19)}
     * @param blksrrnk The value of blksrrnk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlksrrnk_LessThan(Long blksrrnk) {
        regBlksrrnk(CK_LT, blksrrnk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSRRNK: {bigint(19)}
     * @param blksrrnk The value of blksrrnk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlksrrnk_GreaterEqual(Long blksrrnk) {
        regBlksrrnk(CK_GE, blksrrnk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSRRNK: {bigint(19)}
     * @param blksrrnk The value of blksrrnk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlksrrnk_LessEqual(Long blksrrnk) {
        regBlksrrnk(CK_LE, blksrrnk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSRRNK: {bigint(19)}
     * @param minNumber The min number of blksrrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of blksrrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBlksrrnk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBlksrrnk(), "BLKSRRNK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLKSRRNK: {bigint(19)}
     * @param blksrrnkList The collection of blksrrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlksrrnk_InScope(Collection<Long> blksrrnkList) {
        doSetBlksrrnk_InScope(blksrrnkList);
    }

    protected void doSetBlksrrnk_InScope(Collection<Long> blksrrnkList) {
        regINS(CK_INS, cTL(blksrrnkList), xgetCValueBlksrrnk(), "BLKSRRNK");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLKSRRNK: {bigint(19)}
     * @param blksrrnkList The collection of blksrrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlksrrnk_NotInScope(Collection<Long> blksrrnkList) {
        doSetBlksrrnk_NotInScope(blksrrnkList);
    }

    protected void doSetBlksrrnk_NotInScope(Collection<Long> blksrrnkList) {
        regINS(CK_NINS, cTL(blksrrnkList), xgetCValueBlksrrnk(), "BLKSRRNK");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLKSRRNK: {bigint(19)}
     */
    public void setBlksrrnk_IsNull() { regBlksrrnk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLKSRRNK: {bigint(19)}
     */
    public void setBlksrrnk_IsNotNull() { regBlksrrnk(CK_ISNN, DOBJ); }

    protected void regBlksrrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBlksrrnk(), "BLKSRRNK"); }
    protected abstract ConditionValue xgetCValueBlksrrnk();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSWUNIT: {bigint(19)}
     * @param blkswunit The value of blkswunit as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlkswunit_Equal(Long blkswunit) {
        doSetBlkswunit_Equal(blkswunit);
    }

    protected void doSetBlkswunit_Equal(Long blkswunit) {
        regBlkswunit(CK_EQ, blkswunit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSWUNIT: {bigint(19)}
     * @param blkswunit The value of blkswunit as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlkswunit_NotEqual(Long blkswunit) {
        doSetBlkswunit_NotEqual(blkswunit);
    }

    protected void doSetBlkswunit_NotEqual(Long blkswunit) {
        regBlkswunit(CK_NES, blkswunit);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSWUNIT: {bigint(19)}
     * @param blkswunit The value of blkswunit as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlkswunit_GreaterThan(Long blkswunit) {
        regBlkswunit(CK_GT, blkswunit);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSWUNIT: {bigint(19)}
     * @param blkswunit The value of blkswunit as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlkswunit_LessThan(Long blkswunit) {
        regBlkswunit(CK_LT, blkswunit);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSWUNIT: {bigint(19)}
     * @param blkswunit The value of blkswunit as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlkswunit_GreaterEqual(Long blkswunit) {
        regBlkswunit(CK_GE, blkswunit);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSWUNIT: {bigint(19)}
     * @param blkswunit The value of blkswunit as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlkswunit_LessEqual(Long blkswunit) {
        regBlkswunit(CK_LE, blkswunit);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSWUNIT: {bigint(19)}
     * @param minNumber The min number of blkswunit. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of blkswunit. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBlkswunit_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBlkswunit(), "BLKSWUNIT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLKSWUNIT: {bigint(19)}
     * @param blkswunitList The collection of blkswunit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkswunit_InScope(Collection<Long> blkswunitList) {
        doSetBlkswunit_InScope(blkswunitList);
    }

    protected void doSetBlkswunit_InScope(Collection<Long> blkswunitList) {
        regINS(CK_INS, cTL(blkswunitList), xgetCValueBlkswunit(), "BLKSWUNIT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLKSWUNIT: {bigint(19)}
     * @param blkswunitList The collection of blkswunit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkswunit_NotInScope(Collection<Long> blkswunitList) {
        doSetBlkswunit_NotInScope(blkswunitList);
    }

    protected void doSetBlkswunit_NotInScope(Collection<Long> blkswunitList) {
        regINS(CK_NINS, cTL(blkswunitList), xgetCValueBlkswunit(), "BLKSWUNIT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLKSWUNIT: {bigint(19)}
     */
    public void setBlkswunit_IsNull() { regBlkswunit(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLKSWUNIT: {bigint(19)}
     */
    public void setBlkswunit_IsNotNull() { regBlkswunit(CK_ISNN, DOBJ); }

    protected void regBlkswunit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBlkswunit(), "BLKSWUNIT"); }
    protected abstract ConditionValue xgetCValueBlkswunit();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSWNUM: {bigint(19)}
     * @param blkswnum The value of blkswnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlkswnum_Equal(Long blkswnum) {
        doSetBlkswnum_Equal(blkswnum);
    }

    protected void doSetBlkswnum_Equal(Long blkswnum) {
        regBlkswnum(CK_EQ, blkswnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSWNUM: {bigint(19)}
     * @param blkswnum The value of blkswnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlkswnum_NotEqual(Long blkswnum) {
        doSetBlkswnum_NotEqual(blkswnum);
    }

    protected void doSetBlkswnum_NotEqual(Long blkswnum) {
        regBlkswnum(CK_NES, blkswnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSWNUM: {bigint(19)}
     * @param blkswnum The value of blkswnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlkswnum_GreaterThan(Long blkswnum) {
        regBlkswnum(CK_GT, blkswnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSWNUM: {bigint(19)}
     * @param blkswnum The value of blkswnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlkswnum_LessThan(Long blkswnum) {
        regBlkswnum(CK_LT, blkswnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSWNUM: {bigint(19)}
     * @param blkswnum The value of blkswnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlkswnum_GreaterEqual(Long blkswnum) {
        regBlkswnum(CK_GE, blkswnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSWNUM: {bigint(19)}
     * @param blkswnum The value of blkswnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBlkswnum_LessEqual(Long blkswnum) {
        regBlkswnum(CK_LE, blkswnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BLKSWNUM: {bigint(19)}
     * @param minNumber The min number of blkswnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of blkswnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBlkswnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBlkswnum(), "BLKSWNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLKSWNUM: {bigint(19)}
     * @param blkswnumList The collection of blkswnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkswnum_InScope(Collection<Long> blkswnumList) {
        doSetBlkswnum_InScope(blkswnumList);
    }

    protected void doSetBlkswnum_InScope(Collection<Long> blkswnumList) {
        regINS(CK_INS, cTL(blkswnumList), xgetCValueBlkswnum(), "BLKSWNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLKSWNUM: {bigint(19)}
     * @param blkswnumList The collection of blkswnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlkswnum_NotInScope(Collection<Long> blkswnumList) {
        doSetBlkswnum_NotInScope(blkswnumList);
    }

    protected void doSetBlkswnum_NotInScope(Collection<Long> blkswnumList) {
        regINS(CK_NINS, cTL(blkswnumList), xgetCValueBlkswnum(), "BLKSWNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLKSWNUM: {bigint(19)}
     */
    public void setBlkswnum_IsNull() { regBlkswnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLKSWNUM: {bigint(19)}
     */
    public void setBlkswnum_IsNotNull() { regBlkswnum(CK_ISNN, DOBJ); }

    protected void regBlkswnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBlkswnum(), "BLKSWNUM"); }
    protected abstract ConditionValue xgetCValueBlkswnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     * @param comt The value of comt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_Equal(String comt) {
        doSetComt_Equal(fRES(comt));
    }

    protected void doSetComt_Equal(String comt) {
        regComt(CK_EQ, comt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     * @param comt The value of comt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_NotEqual(String comt) {
        doSetComt_NotEqual(fRES(comt));
    }

    protected void doSetComt_NotEqual(String comt) {
        regComt(CK_NES, comt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     * @param comt The value of comt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_GreaterThan(String comt) {
        regComt(CK_GT, fRES(comt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     * @param comt The value of comt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_LessThan(String comt) {
        regComt(CK_LT, fRES(comt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     * @param comt The value of comt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_GreaterEqual(String comt) {
        regComt(CK_GE, fRES(comt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     * @param comt The value of comt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_LessEqual(String comt) {
        regComt(CK_LE, fRES(comt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMT: {varchar(60)}
     * @param comtList The collection of comt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_InScope(Collection<String> comtList) {
        doSetComt_InScope(comtList);
    }

    protected void doSetComt_InScope(Collection<String> comtList) {
        regINS(CK_INS, cTL(comtList), xgetCValueComt(), "COMT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMT: {varchar(60)}
     * @param comtList The collection of comt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_NotInScope(Collection<String> comtList) {
        doSetComt_NotInScope(comtList);
    }

    protected void doSetComt_NotInScope(Collection<String> comtList) {
        regINS(CK_NINS, cTL(comtList), xgetCValueComt(), "COMT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMT: {varchar(60)} <br>
     * <pre>e.g. setComt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param comt The value of comt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setComt_LikeSearch(String comt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(comt), xgetCValueComt(), "COMT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMT: {varchar(60)}
     * @param comt The value of comt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setComt_NotLikeSearch(String comt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(comt), xgetCValueComt(), "COMT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMT: {varchar(60)}
     * @param comt The value of comt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComt_PrefixSearch(String comt) {
        setComt_LikeSearch(comt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     */
    public void setComt_IsNull() { regComt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     */
    public void setComt_IsNullOrEmpty() { regComt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMT: {varchar(60)}
     */
    public void setComt_IsNotNull() { regComt(CK_ISNN, DOBJ); }

    protected void regComt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueComt(), "COMT"); }
    protected abstract ConditionValue xgetCValueComt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfg The value of wrkmfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_Equal(String wrkmfg) {
        doSetWrkmfg_Equal(fRES(wrkmfg));
    }

    protected void doSetWrkmfg_Equal(String wrkmfg) {
        regWrkmfg(CK_EQ, wrkmfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfg The value of wrkmfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_NotEqual(String wrkmfg) {
        doSetWrkmfg_NotEqual(fRES(wrkmfg));
    }

    protected void doSetWrkmfg_NotEqual(String wrkmfg) {
        regWrkmfg(CK_NES, wrkmfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfg The value of wrkmfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_GreaterThan(String wrkmfg) {
        regWrkmfg(CK_GT, fRES(wrkmfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfg The value of wrkmfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_LessThan(String wrkmfg) {
        regWrkmfg(CK_LT, fRES(wrkmfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfg The value of wrkmfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_GreaterEqual(String wrkmfg) {
        regWrkmfg(CK_GE, fRES(wrkmfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfg The value of wrkmfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_LessEqual(String wrkmfg) {
        regWrkmfg(CK_LE, fRES(wrkmfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfgList The collection of wrkmfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_InScope(Collection<String> wrkmfgList) {
        doSetWrkmfg_InScope(wrkmfgList);
    }

    protected void doSetWrkmfg_InScope(Collection<String> wrkmfgList) {
        regINS(CK_INS, cTL(wrkmfgList), xgetCValueWrkmfg(), "WRKMFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfgList The collection of wrkmfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_NotInScope(Collection<String> wrkmfgList) {
        doSetWrkmfg_NotInScope(wrkmfgList);
    }

    protected void doSetWrkmfg_NotInScope(Collection<String> wrkmfgList) {
        regINS(CK_NINS, cTL(wrkmfgList), xgetCValueWrkmfg(), "WRKMFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRKMFG: {NotNull, char(1)} <br>
     * <pre>e.g. setWrkmfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wrkmfg The value of wrkmfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWrkmfg_LikeSearch(String wrkmfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wrkmfg), xgetCValueWrkmfg(), "WRKMFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfg The value of wrkmfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWrkmfg_NotLikeSearch(String wrkmfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wrkmfg), xgetCValueWrkmfg(), "WRKMFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRKMFG: {NotNull, char(1)}
     * @param wrkmfg The value of wrkmfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrkmfg_PrefixSearch(String wrkmfg) {
        setWrkmfg_LikeSearch(wrkmfg, xcLSOPPre());
    }

    protected void regWrkmfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWrkmfg(), "WRKMFG"); }
    protected abstract ConditionValue xgetCValueWrkmfg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDate The value of sortDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_Equal(String sortDate) {
        doSetSortDate_Equal(fRES(sortDate));
    }

    protected void doSetSortDate_Equal(String sortDate) {
        regSortDate(CK_EQ, sortDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDate The value of sortDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_NotEqual(String sortDate) {
        doSetSortDate_NotEqual(fRES(sortDate));
    }

    protected void doSetSortDate_NotEqual(String sortDate) {
        regSortDate(CK_NES, sortDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDate The value of sortDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_GreaterThan(String sortDate) {
        regSortDate(CK_GT, fRES(sortDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDate The value of sortDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_LessThan(String sortDate) {
        regSortDate(CK_LT, fRES(sortDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDate The value of sortDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_GreaterEqual(String sortDate) {
        regSortDate(CK_GE, fRES(sortDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDate The value of sortDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_LessEqual(String sortDate) {
        regSortDate(CK_LE, fRES(sortDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDateList The collection of sortDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_InScope(Collection<String> sortDateList) {
        doSetSortDate_InScope(sortDateList);
    }

    protected void doSetSortDate_InScope(Collection<String> sortDateList) {
        regINS(CK_INS, cTL(sortDateList), xgetCValueSortDate(), "SORT_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDateList The collection of sortDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_NotInScope(Collection<String> sortDateList) {
        doSetSortDate_NotInScope(sortDateList);
    }

    protected void doSetSortDate_NotInScope(Collection<String> sortDateList) {
        regINS(CK_NINS, cTL(sortDateList), xgetCValueSortDate(), "SORT_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_DATE: {varchar(8)} <br>
     * <pre>e.g. setSortDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortDate The value of sortDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortDate_LikeSearch(String sortDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortDate), xgetCValueSortDate(), "SORT_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDate The value of sortDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortDate_NotLikeSearch(String sortDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortDate), xgetCValueSortDate(), "SORT_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_DATE: {varchar(8)}
     * @param sortDate The value of sortDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortDate_PrefixSearch(String sortDate) {
        setSortDate_LikeSearch(sortDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     */
    public void setSortDate_IsNull() { regSortDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     */
    public void setSortDate_IsNullOrEmpty() { regSortDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORT_DATE: {varchar(8)}
     */
    public void setSortDate_IsNotNull() { regSortDate(CK_ISNN, DOBJ); }

    protected void regSortDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortDate(), "SORT_DATE"); }
    protected abstract ConditionValue xgetCValueSortDate();

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
    public HpSLCFunction<TCdrcattsrbCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TCdrcattsrbCB.class);
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
    public HpSLCFunction<TCdrcattsrbCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TCdrcattsrbCB.class);
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
    public HpSLCFunction<TCdrcattsrbCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TCdrcattsrbCB.class);
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
    public HpSLCFunction<TCdrcattsrbCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TCdrcattsrbCB.class);
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
    public HpSLCFunction<TCdrcattsrbCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TCdrcattsrbCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TCdrcattsrbCB&gt;() {
     *     public void query(TCdrcattsrbCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TCdrcattsrbCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TCdrcattsrbCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TCdrcattsrbCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TCdrcattsrbCQ sq);

    protected TCdrcattsrbCB xcreateScalarConditionCB() {
        TCdrcattsrbCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TCdrcattsrbCB xcreateScalarConditionPartitionByCB() {
        TCdrcattsrbCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TCdrcattsrbCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCdrcattsrbCB cb = new TCdrcattsrbCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "HOUMEN_SORT_BLOCK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TCdrcattsrbCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TCdrcattsrbCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TCdrcattsrbCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCdrcattsrbCB cb = new TCdrcattsrbCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "HOUMEN_SORT_BLOCK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TCdrcattsrbCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TCdrcattsrbCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCdrcattsrbCB cb = new TCdrcattsrbCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TCdrcattsrbCQ sq);

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
    protected TCdrcattsrbCB newMyCB() {
        return new TCdrcattsrbCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TCdrcattsrbCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
