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
 * The abstract condition-query of T_CCUSAUINF.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTCcusauinfCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTCcusauinfCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_CCUSAUINF";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientTotalInfoId The value of clientTotalInfoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientTotalInfoId_Equal(Long clientTotalInfoId) {
        doSetClientTotalInfoId_Equal(clientTotalInfoId);
    }

    protected void doSetClientTotalInfoId_Equal(Long clientTotalInfoId) {
        regClientTotalInfoId(CK_EQ, clientTotalInfoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientTotalInfoId The value of clientTotalInfoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientTotalInfoId_NotEqual(Long clientTotalInfoId) {
        doSetClientTotalInfoId_NotEqual(clientTotalInfoId);
    }

    protected void doSetClientTotalInfoId_NotEqual(Long clientTotalInfoId) {
        regClientTotalInfoId(CK_NES, clientTotalInfoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientTotalInfoId The value of clientTotalInfoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientTotalInfoId_GreaterThan(Long clientTotalInfoId) {
        regClientTotalInfoId(CK_GT, clientTotalInfoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientTotalInfoId The value of clientTotalInfoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientTotalInfoId_LessThan(Long clientTotalInfoId) {
        regClientTotalInfoId(CK_LT, clientTotalInfoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientTotalInfoId The value of clientTotalInfoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientTotalInfoId_GreaterEqual(Long clientTotalInfoId) {
        regClientTotalInfoId(CK_GE, clientTotalInfoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientTotalInfoId The value of clientTotalInfoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientTotalInfoId_LessEqual(Long clientTotalInfoId) {
        regClientTotalInfoId(CK_LE, clientTotalInfoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of clientTotalInfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientTotalInfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientTotalInfoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientTotalInfoId(), "CLIENT_TOTAL_INFO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientTotalInfoIdList The collection of clientTotalInfoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientTotalInfoId_InScope(Collection<Long> clientTotalInfoIdList) {
        doSetClientTotalInfoId_InScope(clientTotalInfoIdList);
    }

    protected void doSetClientTotalInfoId_InScope(Collection<Long> clientTotalInfoIdList) {
        regINS(CK_INS, cTL(clientTotalInfoIdList), xgetCValueClientTotalInfoId(), "CLIENT_TOTAL_INFO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientTotalInfoIdList The collection of clientTotalInfoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientTotalInfoId_NotInScope(Collection<Long> clientTotalInfoIdList) {
        doSetClientTotalInfoId_NotInScope(clientTotalInfoIdList);
    }

    protected void doSetClientTotalInfoId_NotInScope(Collection<Long> clientTotalInfoIdList) {
        regINS(CK_NINS, cTL(clientTotalInfoIdList), xgetCValueClientTotalInfoId(), "CLIENT_TOTAL_INFO_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setClientTotalInfoId_IsNull() { regClientTotalInfoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setClientTotalInfoId_IsNotNull() { regClientTotalInfoId(CK_ISNN, DOBJ); }

    protected void regClientTotalInfoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientTotalInfoId(), "CLIENT_TOTAL_INFO_ID"); }
    protected abstract ConditionValue xgetCValueClientTotalInfoId();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {NotNull, bigint(19)}
     * @param dlvsnm The value of dlvsnm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_Equal(Long dlvsnm) {
        doSetDlvsnm_Equal(dlvsnm);
    }

    protected void doSetDlvsnm_Equal(Long dlvsnm) {
        regDlvsnm(CK_EQ, dlvsnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {NotNull, bigint(19)}
     * @param dlvsnm The value of dlvsnm as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_NotEqual(Long dlvsnm) {
        doSetDlvsnm_NotEqual(dlvsnm);
    }

    protected void doSetDlvsnm_NotEqual(Long dlvsnm) {
        regDlvsnm(CK_NES, dlvsnm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {NotNull, bigint(19)}
     * @param dlvsnm The value of dlvsnm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_GreaterThan(Long dlvsnm) {
        regDlvsnm(CK_GT, dlvsnm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {NotNull, bigint(19)}
     * @param dlvsnm The value of dlvsnm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_LessThan(Long dlvsnm) {
        regDlvsnm(CK_LT, dlvsnm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {NotNull, bigint(19)}
     * @param dlvsnm The value of dlvsnm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_GreaterEqual(Long dlvsnm) {
        regDlvsnm(CK_GE, dlvsnm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {NotNull, bigint(19)}
     * @param dlvsnm The value of dlvsnm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_LessEqual(Long dlvsnm) {
        regDlvsnm(CK_LE, dlvsnm);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {NotNull, bigint(19)}
     * @param minNumber The min number of dlvsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dlvsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDlvsnm_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDlvsnm(), "DLVSNM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DLVSNM: {NotNull, bigint(19)}
     * @param dlvsnmList The collection of dlvsnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvsnm_InScope(Collection<Long> dlvsnmList) {
        doSetDlvsnm_InScope(dlvsnmList);
    }

    protected void doSetDlvsnm_InScope(Collection<Long> dlvsnmList) {
        regINS(CK_INS, cTL(dlvsnmList), xgetCValueDlvsnm(), "DLVSNM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DLVSNM: {NotNull, bigint(19)}
     * @param dlvsnmList The collection of dlvsnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvsnm_NotInScope(Collection<Long> dlvsnmList) {
        doSetDlvsnm_NotInScope(dlvsnmList);
    }

    protected void doSetDlvsnm_NotInScope(Collection<Long> dlvsnmList) {
        regINS(CK_NINS, cTL(dlvsnmList), xgetCValueDlvsnm(), "DLVSNM");
    }

    protected void regDlvsnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvsnm(), "DLVSNM"); }
    protected abstract ConditionValue xgetCValueDlvsnm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {NotNull, bigint(19)}
     * @param dlvdtlsnm The value of dlvdtlsnm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_Equal(Long dlvdtlsnm) {
        doSetDlvdtlsnm_Equal(dlvdtlsnm);
    }

    protected void doSetDlvdtlsnm_Equal(Long dlvdtlsnm) {
        regDlvdtlsnm(CK_EQ, dlvdtlsnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {NotNull, bigint(19)}
     * @param dlvdtlsnm The value of dlvdtlsnm as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_NotEqual(Long dlvdtlsnm) {
        doSetDlvdtlsnm_NotEqual(dlvdtlsnm);
    }

    protected void doSetDlvdtlsnm_NotEqual(Long dlvdtlsnm) {
        regDlvdtlsnm(CK_NES, dlvdtlsnm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {NotNull, bigint(19)}
     * @param dlvdtlsnm The value of dlvdtlsnm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_GreaterThan(Long dlvdtlsnm) {
        regDlvdtlsnm(CK_GT, dlvdtlsnm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {NotNull, bigint(19)}
     * @param dlvdtlsnm The value of dlvdtlsnm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_LessThan(Long dlvdtlsnm) {
        regDlvdtlsnm(CK_LT, dlvdtlsnm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {NotNull, bigint(19)}
     * @param dlvdtlsnm The value of dlvdtlsnm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_GreaterEqual(Long dlvdtlsnm) {
        regDlvdtlsnm(CK_GE, dlvdtlsnm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {NotNull, bigint(19)}
     * @param dlvdtlsnm The value of dlvdtlsnm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_LessEqual(Long dlvdtlsnm) {
        regDlvdtlsnm(CK_LE, dlvdtlsnm);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {NotNull, bigint(19)}
     * @param minNumber The min number of dlvdtlsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dlvdtlsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDlvdtlsnm_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDlvdtlsnm(), "DLVDTLSNM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DLVDTLSNM: {NotNull, bigint(19)}
     * @param dlvdtlsnmList The collection of dlvdtlsnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_InScope(Collection<Long> dlvdtlsnmList) {
        doSetDlvdtlsnm_InScope(dlvdtlsnmList);
    }

    protected void doSetDlvdtlsnm_InScope(Collection<Long> dlvdtlsnmList) {
        regINS(CK_INS, cTL(dlvdtlsnmList), xgetCValueDlvdtlsnm(), "DLVDTLSNM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DLVDTLSNM: {NotNull, bigint(19)}
     * @param dlvdtlsnmList The collection of dlvdtlsnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_NotInScope(Collection<Long> dlvdtlsnmList) {
        doSetDlvdtlsnm_NotInScope(dlvdtlsnmList);
    }

    protected void doSetDlvdtlsnm_NotInScope(Collection<Long> dlvdtlsnmList) {
        regINS(CK_NINS, cTL(dlvdtlsnmList), xgetCValueDlvdtlsnm(), "DLVDTLSNM");
    }

    protected void regDlvdtlsnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvdtlsnm(), "DLVDTLSNM"); }
    protected abstract ConditionValue xgetCValueDlvdtlsnm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscd The value of sscd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_Equal(String sscd) {
        doSetSscd_Equal(fRES(sscd));
    }

    protected void doSetSscd_Equal(String sscd) {
        regSscd(CK_EQ, sscd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscd The value of sscd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_NotEqual(String sscd) {
        doSetSscd_NotEqual(fRES(sscd));
    }

    protected void doSetSscd_NotEqual(String sscd) {
        regSscd(CK_NES, sscd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscd The value of sscd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_GreaterThan(String sscd) {
        regSscd(CK_GT, fRES(sscd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscd The value of sscd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_LessThan(String sscd) {
        regSscd(CK_LT, fRES(sscd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscd The value of sscd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_GreaterEqual(String sscd) {
        regSscd(CK_GE, fRES(sscd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscd The value of sscd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_LessEqual(String sscd) {
        regSscd(CK_LE, fRES(sscd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscdList The collection of sscd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_InScope(Collection<String> sscdList) {
        doSetSscd_InScope(sscdList);
    }

    protected void doSetSscd_InScope(Collection<String> sscdList) {
        regINS(CK_INS, cTL(sscdList), xgetCValueSscd(), "SSCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscdList The collection of sscd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_NotInScope(Collection<String> sscdList) {
        doSetSscd_NotInScope(sscdList);
    }

    protected void doSetSscd_NotInScope(Collection<String> sscdList) {
        regINS(CK_NINS, cTL(sscdList), xgetCValueSscd(), "SSCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSscd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sscd The value of sscd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSscd_LikeSearch(String sscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sscd), xgetCValueSscd(), "SSCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscd The value of sscd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSscd_NotLikeSearch(String sscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sscd), xgetCValueSscd(), "SSCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscd The value of sscd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_PrefixSearch(String sscd) {
        setSscd_LikeSearch(sscd, xcLSOPPre());
    }

    protected void regSscd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSscd(), "SSCD"); }
    protected abstract ConditionValue xgetCValueSscd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnm The value of ssnm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_Equal(String ssnm) {
        doSetSsnm_Equal(fRES(ssnm));
    }

    protected void doSetSsnm_Equal(String ssnm) {
        regSsnm(CK_EQ, ssnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnm The value of ssnm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_NotEqual(String ssnm) {
        doSetSsnm_NotEqual(fRES(ssnm));
    }

    protected void doSetSsnm_NotEqual(String ssnm) {
        regSsnm(CK_NES, ssnm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnm The value of ssnm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_GreaterThan(String ssnm) {
        regSsnm(CK_GT, fRES(ssnm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnm The value of ssnm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_LessThan(String ssnm) {
        regSsnm(CK_LT, fRES(ssnm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnm The value of ssnm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_GreaterEqual(String ssnm) {
        regSsnm(CK_GE, fRES(ssnm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnm The value of ssnm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_LessEqual(String ssnm) {
        regSsnm(CK_LE, fRES(ssnm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnmList The collection of ssnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_InScope(Collection<String> ssnmList) {
        doSetSsnm_InScope(ssnmList);
    }

    protected void doSetSsnm_InScope(Collection<String> ssnmList) {
        regINS(CK_INS, cTL(ssnmList), xgetCValueSsnm(), "SSNM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnmList The collection of ssnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_NotInScope(Collection<String> ssnmList) {
        doSetSsnm_NotInScope(ssnmList);
    }

    protected void doSetSsnm_NotInScope(Collection<String> ssnmList) {
        regINS(CK_NINS, cTL(ssnmList), xgetCValueSsnm(), "SSNM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSNM: {varchar(60)} <br>
     * <pre>e.g. setSsnm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ssnm The value of ssnm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSsnm_LikeSearch(String ssnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ssnm), xgetCValueSsnm(), "SSNM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnm The value of ssnm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSsnm_NotLikeSearch(String ssnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ssnm), xgetCValueSsnm(), "SSNM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnm The value of ssnm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_PrefixSearch(String ssnm) {
        setSsnm_LikeSearch(ssnm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     */
    public void setSsnm_IsNull() { regSsnm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     */
    public void setSsnm_IsNullOrEmpty() { regSsnm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     */
    public void setSsnm_IsNotNull() { regSsnm(CK_ISNN, DOBJ); }

    protected void regSsnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSsnm(), "SSNM"); }
    protected abstract ConditionValue xgetCValueSsnm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACB: {bigint(19)}
     * @param srqacb The value of srqacb as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacb_Equal(Long srqacb) {
        doSetSrqacb_Equal(srqacb);
    }

    protected void doSetSrqacb_Equal(Long srqacb) {
        regSrqacb(CK_EQ, srqacb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACB: {bigint(19)}
     * @param srqacb The value of srqacb as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacb_NotEqual(Long srqacb) {
        doSetSrqacb_NotEqual(srqacb);
    }

    protected void doSetSrqacb_NotEqual(Long srqacb) {
        regSrqacb(CK_NES, srqacb);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACB: {bigint(19)}
     * @param srqacb The value of srqacb as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacb_GreaterThan(Long srqacb) {
        regSrqacb(CK_GT, srqacb);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACB: {bigint(19)}
     * @param srqacb The value of srqacb as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacb_LessThan(Long srqacb) {
        regSrqacb(CK_LT, srqacb);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACB: {bigint(19)}
     * @param srqacb The value of srqacb as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacb_GreaterEqual(Long srqacb) {
        regSrqacb(CK_GE, srqacb);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACB: {bigint(19)}
     * @param srqacb The value of srqacb as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacb_LessEqual(Long srqacb) {
        regSrqacb(CK_LE, srqacb);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACB: {bigint(19)}
     * @param minNumber The min number of srqacb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of srqacb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSrqacb_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSrqacb(), "SRQACB", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRQACB: {bigint(19)}
     * @param srqacbList The collection of srqacb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrqacb_InScope(Collection<Long> srqacbList) {
        doSetSrqacb_InScope(srqacbList);
    }

    protected void doSetSrqacb_InScope(Collection<Long> srqacbList) {
        regINS(CK_INS, cTL(srqacbList), xgetCValueSrqacb(), "SRQACB");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRQACB: {bigint(19)}
     * @param srqacbList The collection of srqacb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrqacb_NotInScope(Collection<Long> srqacbList) {
        doSetSrqacb_NotInScope(srqacbList);
    }

    protected void doSetSrqacb_NotInScope(Collection<Long> srqacbList) {
        regINS(CK_NINS, cTL(srqacbList), xgetCValueSrqacb(), "SRQACB");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRQACB: {bigint(19)}
     */
    public void setSrqacb_IsNull() { regSrqacb(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRQACB: {bigint(19)}
     */
    public void setSrqacb_IsNotNull() { regSrqacb(CK_ISNN, DOBJ); }

    protected void regSrqacb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrqacb(), "SRQACB"); }
    protected abstract ConditionValue xgetCValueSrqacb();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBLIN: {bigint(19)}
     * @param srqacblin The value of srqacblin as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacblin_Equal(Long srqacblin) {
        doSetSrqacblin_Equal(srqacblin);
    }

    protected void doSetSrqacblin_Equal(Long srqacblin) {
        regSrqacblin(CK_EQ, srqacblin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBLIN: {bigint(19)}
     * @param srqacblin The value of srqacblin as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacblin_NotEqual(Long srqacblin) {
        doSetSrqacblin_NotEqual(srqacblin);
    }

    protected void doSetSrqacblin_NotEqual(Long srqacblin) {
        regSrqacblin(CK_NES, srqacblin);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBLIN: {bigint(19)}
     * @param srqacblin The value of srqacblin as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacblin_GreaterThan(Long srqacblin) {
        regSrqacblin(CK_GT, srqacblin);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBLIN: {bigint(19)}
     * @param srqacblin The value of srqacblin as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacblin_LessThan(Long srqacblin) {
        regSrqacblin(CK_LT, srqacblin);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBLIN: {bigint(19)}
     * @param srqacblin The value of srqacblin as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacblin_GreaterEqual(Long srqacblin) {
        regSrqacblin(CK_GE, srqacblin);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBLIN: {bigint(19)}
     * @param srqacblin The value of srqacblin as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacblin_LessEqual(Long srqacblin) {
        regSrqacblin(CK_LE, srqacblin);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBLIN: {bigint(19)}
     * @param minNumber The min number of srqacblin. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of srqacblin. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSrqacblin_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSrqacblin(), "SRQACBLIN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRQACBLIN: {bigint(19)}
     * @param srqacblinList The collection of srqacblin as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrqacblin_InScope(Collection<Long> srqacblinList) {
        doSetSrqacblin_InScope(srqacblinList);
    }

    protected void doSetSrqacblin_InScope(Collection<Long> srqacblinList) {
        regINS(CK_INS, cTL(srqacblinList), xgetCValueSrqacblin(), "SRQACBLIN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRQACBLIN: {bigint(19)}
     * @param srqacblinList The collection of srqacblin as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrqacblin_NotInScope(Collection<Long> srqacblinList) {
        doSetSrqacblin_NotInScope(srqacblinList);
    }

    protected void doSetSrqacblin_NotInScope(Collection<Long> srqacblinList) {
        regINS(CK_NINS, cTL(srqacblinList), xgetCValueSrqacblin(), "SRQACBLIN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRQACBLIN: {bigint(19)}
     */
    public void setSrqacblin_IsNull() { regSrqacblin(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRQACBLIN: {bigint(19)}
     */
    public void setSrqacblin_IsNotNull() { regSrqacblin(CK_ISNN, DOBJ); }

    protected void regSrqacblin(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrqacblin(), "SRQACBLIN"); }
    protected abstract ConditionValue xgetCValueSrqacblin();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBBLK: {bigint(19)}
     * @param srqacbblk The value of srqacbblk as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacbblk_Equal(Long srqacbblk) {
        doSetSrqacbblk_Equal(srqacbblk);
    }

    protected void doSetSrqacbblk_Equal(Long srqacbblk) {
        regSrqacbblk(CK_EQ, srqacbblk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBBLK: {bigint(19)}
     * @param srqacbblk The value of srqacbblk as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacbblk_NotEqual(Long srqacbblk) {
        doSetSrqacbblk_NotEqual(srqacbblk);
    }

    protected void doSetSrqacbblk_NotEqual(Long srqacbblk) {
        regSrqacbblk(CK_NES, srqacbblk);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBBLK: {bigint(19)}
     * @param srqacbblk The value of srqacbblk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacbblk_GreaterThan(Long srqacbblk) {
        regSrqacbblk(CK_GT, srqacbblk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBBLK: {bigint(19)}
     * @param srqacbblk The value of srqacbblk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacbblk_LessThan(Long srqacbblk) {
        regSrqacbblk(CK_LT, srqacbblk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBBLK: {bigint(19)}
     * @param srqacbblk The value of srqacbblk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacbblk_GreaterEqual(Long srqacbblk) {
        regSrqacbblk(CK_GE, srqacbblk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBBLK: {bigint(19)}
     * @param srqacbblk The value of srqacbblk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacbblk_LessEqual(Long srqacbblk) {
        regSrqacbblk(CK_LE, srqacbblk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBBLK: {bigint(19)}
     * @param minNumber The min number of srqacbblk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of srqacbblk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSrqacbblk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSrqacbblk(), "SRQACBBLK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRQACBBLK: {bigint(19)}
     * @param srqacbblkList The collection of srqacbblk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrqacbblk_InScope(Collection<Long> srqacbblkList) {
        doSetSrqacbblk_InScope(srqacbblkList);
    }

    protected void doSetSrqacbblk_InScope(Collection<Long> srqacbblkList) {
        regINS(CK_INS, cTL(srqacbblkList), xgetCValueSrqacbblk(), "SRQACBBLK");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRQACBBLK: {bigint(19)}
     * @param srqacbblkList The collection of srqacbblk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrqacbblk_NotInScope(Collection<Long> srqacbblkList) {
        doSetSrqacbblk_NotInScope(srqacbblkList);
    }

    protected void doSetSrqacbblk_NotInScope(Collection<Long> srqacbblkList) {
        regINS(CK_NINS, cTL(srqacbblkList), xgetCValueSrqacbblk(), "SRQACBBLK");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRQACBBLK: {bigint(19)}
     */
    public void setSrqacbblk_IsNull() { regSrqacbblk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRQACBBLK: {bigint(19)}
     */
    public void setSrqacbblk_IsNotNull() { regSrqacbblk(CK_ISNN, DOBJ); }

    protected void regSrqacbblk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrqacbblk(), "SRQACBBLK"); }
    protected abstract ConditionValue xgetCValueSrqacbblk();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBDM: {bigint(19)}
     * @param srqacbdm The value of srqacbdm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacbdm_Equal(Long srqacbdm) {
        doSetSrqacbdm_Equal(srqacbdm);
    }

    protected void doSetSrqacbdm_Equal(Long srqacbdm) {
        regSrqacbdm(CK_EQ, srqacbdm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBDM: {bigint(19)}
     * @param srqacbdm The value of srqacbdm as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacbdm_NotEqual(Long srqacbdm) {
        doSetSrqacbdm_NotEqual(srqacbdm);
    }

    protected void doSetSrqacbdm_NotEqual(Long srqacbdm) {
        regSrqacbdm(CK_NES, srqacbdm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBDM: {bigint(19)}
     * @param srqacbdm The value of srqacbdm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacbdm_GreaterThan(Long srqacbdm) {
        regSrqacbdm(CK_GT, srqacbdm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBDM: {bigint(19)}
     * @param srqacbdm The value of srqacbdm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacbdm_LessThan(Long srqacbdm) {
        regSrqacbdm(CK_LT, srqacbdm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBDM: {bigint(19)}
     * @param srqacbdm The value of srqacbdm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacbdm_GreaterEqual(Long srqacbdm) {
        regSrqacbdm(CK_GE, srqacbdm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBDM: {bigint(19)}
     * @param srqacbdm The value of srqacbdm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrqacbdm_LessEqual(Long srqacbdm) {
        regSrqacbdm(CK_LE, srqacbdm);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SRQACBDM: {bigint(19)}
     * @param minNumber The min number of srqacbdm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of srqacbdm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSrqacbdm_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSrqacbdm(), "SRQACBDM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRQACBDM: {bigint(19)}
     * @param srqacbdmList The collection of srqacbdm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrqacbdm_InScope(Collection<Long> srqacbdmList) {
        doSetSrqacbdm_InScope(srqacbdmList);
    }

    protected void doSetSrqacbdm_InScope(Collection<Long> srqacbdmList) {
        regINS(CK_INS, cTL(srqacbdmList), xgetCValueSrqacbdm(), "SRQACBDM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRQACBDM: {bigint(19)}
     * @param srqacbdmList The collection of srqacbdm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrqacbdm_NotInScope(Collection<Long> srqacbdmList) {
        doSetSrqacbdm_NotInScope(srqacbdmList);
    }

    protected void doSetSrqacbdm_NotInScope(Collection<Long> srqacbdmList) {
        regINS(CK_NINS, cTL(srqacbdmList), xgetCValueSrqacbdm(), "SRQACBDM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRQACBDM: {bigint(19)}
     */
    public void setSrqacbdm_IsNull() { regSrqacbdm(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRQACBDM: {bigint(19)}
     */
    public void setSrqacbdm_IsNotNull() { regSrqacbdm(CK_ISNN, DOBJ); }

    protected void regSrqacbdm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrqacbdm(), "SRQACBDM"); }
    protected abstract ConditionValue xgetCValueSrqacbdm();

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
    public HpSLCFunction<TCcusauinfCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TCcusauinfCB.class);
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
    public HpSLCFunction<TCcusauinfCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TCcusauinfCB.class);
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
    public HpSLCFunction<TCcusauinfCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TCcusauinfCB.class);
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
    public HpSLCFunction<TCcusauinfCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TCcusauinfCB.class);
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
    public HpSLCFunction<TCcusauinfCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TCcusauinfCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TCcusauinfCB&gt;() {
     *     public void query(TCcusauinfCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TCcusauinfCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TCcusauinfCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TCcusauinfCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TCcusauinfCQ sq);

    protected TCcusauinfCB xcreateScalarConditionCB() {
        TCcusauinfCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TCcusauinfCB xcreateScalarConditionPartitionByCB() {
        TCcusauinfCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TCcusauinfCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCcusauinfCB cb = new TCcusauinfCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CLIENT_TOTAL_INFO_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TCcusauinfCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TCcusauinfCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TCcusauinfCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCcusauinfCB cb = new TCcusauinfCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CLIENT_TOTAL_INFO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TCcusauinfCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TCcusauinfCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCcusauinfCB cb = new TCcusauinfCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TCcusauinfCQ sq);

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
    protected TCcusauinfCB newMyCB() {
        return new TCcusauinfCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TCcusauinfCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
