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
 * The abstract condition-query of E_MH_SHIPPING.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEMhShippingCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEMhShippingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_MH_SHIPPING";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhShippingId The value of mhShippingId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhShippingId_Equal(Long mhShippingId) {
        doSetMhShippingId_Equal(mhShippingId);
    }

    protected void doSetMhShippingId_Equal(Long mhShippingId) {
        regMhShippingId(CK_EQ, mhShippingId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhShippingId The value of mhShippingId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhShippingId_NotEqual(Long mhShippingId) {
        doSetMhShippingId_NotEqual(mhShippingId);
    }

    protected void doSetMhShippingId_NotEqual(Long mhShippingId) {
        regMhShippingId(CK_NES, mhShippingId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhShippingId The value of mhShippingId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhShippingId_GreaterThan(Long mhShippingId) {
        regMhShippingId(CK_GT, mhShippingId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhShippingId The value of mhShippingId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhShippingId_LessThan(Long mhShippingId) {
        regMhShippingId(CK_LT, mhShippingId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhShippingId The value of mhShippingId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhShippingId_GreaterEqual(Long mhShippingId) {
        regMhShippingId(CK_GE, mhShippingId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhShippingId The value of mhShippingId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhShippingId_LessEqual(Long mhShippingId) {
        regMhShippingId(CK_LE, mhShippingId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of mhShippingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of mhShippingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMhShippingId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMhShippingId(), "MH_SHIPPING_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhShippingIdList The collection of mhShippingId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMhShippingId_InScope(Collection<Long> mhShippingIdList) {
        doSetMhShippingId_InScope(mhShippingIdList);
    }

    protected void doSetMhShippingId_InScope(Collection<Long> mhShippingIdList) {
        regINS(CK_INS, cTL(mhShippingIdList), xgetCValueMhShippingId(), "MH_SHIPPING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhShippingIdList The collection of mhShippingId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMhShippingId_NotInScope(Collection<Long> mhShippingIdList) {
        doSetMhShippingId_NotInScope(mhShippingIdList);
    }

    protected void doSetMhShippingId_NotInScope(Collection<Long> mhShippingIdList) {
        regINS(CK_NINS, cTL(mhShippingIdList), xgetCValueMhShippingId(), "MH_SHIPPING_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMhShippingId_IsNull() { regMhShippingId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMhShippingId_IsNotNull() { regMhShippingId(CK_ISNN, DOBJ); }

    protected void regMhShippingId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMhShippingId(), "MH_SHIPPING_ID"); }
    protected abstract ConditionValue xgetCValueMhShippingId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
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
     * DPCD: {varchar(30)}
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
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterThan(String dpcd) {
        regDpcd(CK_GT, fRES(dpcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessThan(String dpcd) {
        regDpcd(CK_LT, fRES(dpcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterEqual(String dpcd) {
        regDpcd(CK_GE, fRES(dpcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessEqual(String dpcd) {
        regDpcd(CK_LE, fRES(dpcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(30)}
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
     * DPCD: {varchar(30)}
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
     * DPCD: {varchar(30)} <br>
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
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDpcd_NotLikeSearch(String dpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dpcd), xgetCValueDpcd(), "DPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_PrefixSearch(String dpcd) {
        setDpcd_LikeSearch(dpcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     */
    public void setDpcd_IsNull() { regDpcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     */
    public void setDpcd_IsNullOrEmpty() { regDpcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     */
    public void setDpcd_IsNotNull() { regDpcd(CK_ISNN, DOBJ); }

    protected void regDpcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDpcd(), "DPCD"); }
    protected abstract ConditionValue xgetCValueDpcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
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
     * DLVYMD: {varchar(8)}
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
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_GreaterThan(String dlvymd) {
        regDlvymd(CK_GT, fRES(dlvymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_LessThan(String dlvymd) {
        regDlvymd(CK_LT, fRES(dlvymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_GreaterEqual(String dlvymd) {
        regDlvymd(CK_GE, fRES(dlvymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_LessEqual(String dlvymd) {
        regDlvymd(CK_LE, fRES(dlvymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVYMD: {varchar(8)}
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
     * DLVYMD: {varchar(8)}
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
     * DLVYMD: {varchar(8)} <br>
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
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDlvymd_NotLikeSearch(String dlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dlvymd), xgetCValueDlvymd(), "DLVYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_PrefixSearch(String dlvymd) {
        setDlvymd_LikeSearch(dlvymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     */
    public void setDlvymd_IsNull() { regDlvymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     */
    public void setDlvymd_IsNullOrEmpty() { regDlvymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     */
    public void setDlvymd_IsNotNull() { regDlvymd(CK_ISNN, DOBJ); }

    protected void regDlvymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvymd(), "DLVYMD"); }
    protected abstract ConditionValue xgetCValueDlvymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
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
     * DED: {varchar(30)}
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
     * DED: {varchar(30)}
     * @param ded The value of ded as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterThan(String ded) {
        regDed(CK_GT, fRES(ded));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessThan(String ded) {
        regDed(CK_LT, fRES(ded));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterEqual(String ded) {
        regDed(CK_GE, fRES(ded));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessEqual(String ded) {
        regDed(CK_LE, fRES(ded));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DED: {varchar(30)}
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
     * DED: {varchar(30)}
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
     * DED: {varchar(30)} <br>
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
     * DED: {varchar(30)}
     * @param ded The value of ded as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDed_NotLikeSearch(String ded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ded), xgetCValueDed(), "DED", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_PrefixSearch(String ded) {
        setDed_LikeSearch(ded, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     */
    public void setDed_IsNull() { regDed(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     */
    public void setDed_IsNullOrEmpty() { regDed(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     */
    public void setDed_IsNotNull() { regDed(CK_ISNN, DOBJ); }

    protected void regDed(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDed(), "DED"); }
    protected abstract ConditionValue xgetCValueDed();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {char(1)}
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
     * PSTNID: {char(1)}
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
     * PSTNID: {char(1)}
     * @param pstnid The value of pstnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterThan(String pstnid) {
        regPstnid(CK_GT, fRES(pstnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {char(1)}
     * @param pstnid The value of pstnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessThan(String pstnid) {
        regPstnid(CK_LT, fRES(pstnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {char(1)}
     * @param pstnid The value of pstnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterEqual(String pstnid) {
        regPstnid(CK_GE, fRES(pstnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {char(1)}
     * @param pstnid The value of pstnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessEqual(String pstnid) {
        regPstnid(CK_LE, fRES(pstnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSTNID: {char(1)}
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
     * PSTNID: {char(1)}
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
     * PSTNID: {char(1)} <br>
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
     * PSTNID: {char(1)}
     * @param pstnid The value of pstnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPstnid_NotLikeSearch(String pstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pstnid), xgetCValuePstnid(), "PSTNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {char(1)}
     * @param pstnid The value of pstnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_PrefixSearch(String pstnid) {
        setPstnid_LikeSearch(pstnid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PSTNID: {char(1)}
     */
    public void setPstnid_IsNull() { regPstnid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PSTNID: {char(1)}
     */
    public void setPstnid_IsNotNull() { regPstnid(CK_ISNN, DOBJ); }

    protected void regPstnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePstnid(), "PSTNID"); }
    protected abstract ConditionValue xgetCValuePstnid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srded The value of srded as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_Equal(String srded) {
        doSetSrded_Equal(fRES(srded));
    }

    protected void doSetSrded_Equal(String srded) {
        regSrded(CK_EQ, srded);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srded The value of srded as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_NotEqual(String srded) {
        doSetSrded_NotEqual(fRES(srded));
    }

    protected void doSetSrded_NotEqual(String srded) {
        regSrded(CK_NES, srded);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srded The value of srded as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_GreaterThan(String srded) {
        regSrded(CK_GT, fRES(srded));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srded The value of srded as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_LessThan(String srded) {
        regSrded(CK_LT, fRES(srded));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srded The value of srded as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_GreaterEqual(String srded) {
        regSrded(CK_GE, fRES(srded));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srded The value of srded as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_LessEqual(String srded) {
        regSrded(CK_LE, fRES(srded));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srdedList The collection of srded as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_InScope(Collection<String> srdedList) {
        doSetSrded_InScope(srdedList);
    }

    protected void doSetSrded_InScope(Collection<String> srdedList) {
        regINS(CK_INS, cTL(srdedList), xgetCValueSrded(), "SRDED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srdedList The collection of srded as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_NotInScope(Collection<String> srdedList) {
        doSetSrded_NotInScope(srdedList);
    }

    protected void doSetSrded_NotInScope(Collection<String> srdedList) {
        regINS(CK_NINS, cTL(srdedList), xgetCValueSrded(), "SRDED");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRDED: {varchar(30)} <br>
     * <pre>e.g. setSrded_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srded The value of srded as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrded_LikeSearch(String srded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srded), xgetCValueSrded(), "SRDED", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srded The value of srded as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrded_NotLikeSearch(String srded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srded), xgetCValueSrded(), "SRDED", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srded The value of srded as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_PrefixSearch(String srded) {
        setSrded_LikeSearch(srded, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     */
    public void setSrded_IsNull() { regSrded(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     */
    public void setSrded_IsNullOrEmpty() { regSrded(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     */
    public void setSrded_IsNotNull() { regSrded(CK_ISNN, DOBJ); }

    protected void regSrded(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrded(), "SRDED"); }
    protected abstract ConditionValue xgetCValueSrded();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPSTNID: {char(1)}
     * @param srpstnid The value of srpstnid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_Equal(String srpstnid) {
        doSetSrpstnid_Equal(fRES(srpstnid));
    }

    protected void doSetSrpstnid_Equal(String srpstnid) {
        regSrpstnid(CK_EQ, srpstnid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPSTNID: {char(1)}
     * @param srpstnid The value of srpstnid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_NotEqual(String srpstnid) {
        doSetSrpstnid_NotEqual(fRES(srpstnid));
    }

    protected void doSetSrpstnid_NotEqual(String srpstnid) {
        regSrpstnid(CK_NES, srpstnid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPSTNID: {char(1)}
     * @param srpstnid The value of srpstnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_GreaterThan(String srpstnid) {
        regSrpstnid(CK_GT, fRES(srpstnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPSTNID: {char(1)}
     * @param srpstnid The value of srpstnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_LessThan(String srpstnid) {
        regSrpstnid(CK_LT, fRES(srpstnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPSTNID: {char(1)}
     * @param srpstnid The value of srpstnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_GreaterEqual(String srpstnid) {
        regSrpstnid(CK_GE, fRES(srpstnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPSTNID: {char(1)}
     * @param srpstnid The value of srpstnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_LessEqual(String srpstnid) {
        regSrpstnid(CK_LE, fRES(srpstnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRPSTNID: {char(1)}
     * @param srpstnidList The collection of srpstnid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_InScope(Collection<String> srpstnidList) {
        doSetSrpstnid_InScope(srpstnidList);
    }

    protected void doSetSrpstnid_InScope(Collection<String> srpstnidList) {
        regINS(CK_INS, cTL(srpstnidList), xgetCValueSrpstnid(), "SRPSTNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRPSTNID: {char(1)}
     * @param srpstnidList The collection of srpstnid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_NotInScope(Collection<String> srpstnidList) {
        doSetSrpstnid_NotInScope(srpstnidList);
    }

    protected void doSetSrpstnid_NotInScope(Collection<String> srpstnidList) {
        regINS(CK_NINS, cTL(srpstnidList), xgetCValueSrpstnid(), "SRPSTNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRPSTNID: {char(1)} <br>
     * <pre>e.g. setSrpstnid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srpstnid The value of srpstnid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrpstnid_LikeSearch(String srpstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srpstnid), xgetCValueSrpstnid(), "SRPSTNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRPSTNID: {char(1)}
     * @param srpstnid The value of srpstnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrpstnid_NotLikeSearch(String srpstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srpstnid), xgetCValueSrpstnid(), "SRPSTNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRPSTNID: {char(1)}
     * @param srpstnid The value of srpstnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_PrefixSearch(String srpstnid) {
        setSrpstnid_LikeSearch(srpstnid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRPSTNID: {char(1)}
     */
    public void setSrpstnid_IsNull() { regSrpstnid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRPSTNID: {char(1)}
     */
    public void setSrpstnid_IsNotNull() { regSrpstnid(CK_ISNN, DOBJ); }

    protected void regSrpstnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrpstnid(), "SRPSTNID"); }
    protected abstract ConditionValue xgetCValueSrpstnid();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {varchar(30)}
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
     * SSCD: {varchar(30)}
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
     * SSCD: {varchar(30)}
     * @param sscd The value of sscd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_GreaterThan(String sscd) {
        regSscd(CK_GT, fRES(sscd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {varchar(30)}
     * @param sscd The value of sscd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_LessThan(String sscd) {
        regSscd(CK_LT, fRES(sscd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {varchar(30)}
     * @param sscd The value of sscd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_GreaterEqual(String sscd) {
        regSscd(CK_GE, fRES(sscd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {varchar(30)}
     * @param sscd The value of sscd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_LessEqual(String sscd) {
        regSscd(CK_LE, fRES(sscd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSCD: {varchar(30)}
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
     * SSCD: {varchar(30)}
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
     * SSCD: {varchar(30)} <br>
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
     * SSCD: {varchar(30)}
     * @param sscd The value of sscd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSscd_NotLikeSearch(String sscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sscd), xgetCValueSscd(), "SSCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCD: {varchar(30)}
     * @param sscd The value of sscd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_PrefixSearch(String sscd) {
        setSscd_LikeSearch(sscd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SSCD: {varchar(30)}
     */
    public void setSscd_IsNull() { regSscd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SSCD: {varchar(30)}
     */
    public void setSscd_IsNullOrEmpty() { regSscd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SSCD: {varchar(30)}
     */
    public void setSscd_IsNotNull() { regSscd(CK_ISNN, DOBJ); }

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(30)}
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
     * ZZMATNR: {varchar(30)}
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
     * ZZMATNR: {varchar(30)}
     * @param zzmatnr The value of zzmatnr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_GreaterThan(String zzmatnr) {
        regZzmatnr(CK_GT, fRES(zzmatnr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(30)}
     * @param zzmatnr The value of zzmatnr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_LessThan(String zzmatnr) {
        regZzmatnr(CK_LT, fRES(zzmatnr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(30)}
     * @param zzmatnr The value of zzmatnr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_GreaterEqual(String zzmatnr) {
        regZzmatnr(CK_GE, fRES(zzmatnr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(30)}
     * @param zzmatnr The value of zzmatnr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_LessEqual(String zzmatnr) {
        regZzmatnr(CK_LE, fRES(zzmatnr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZMATNR: {varchar(30)}
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
     * ZZMATNR: {varchar(30)}
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
     * ZZMATNR: {varchar(30)} <br>
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
     * ZZMATNR: {varchar(30)}
     * @param zzmatnr The value of zzmatnr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzmatnr_NotLikeSearch(String zzmatnr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzmatnr), xgetCValueZzmatnr(), "ZZMATNR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZMATNR: {varchar(30)}
     * @param zzmatnr The value of zzmatnr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_PrefixSearch(String zzmatnr) {
        setZzmatnr_LikeSearch(zzmatnr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(30)}
     */
    public void setZzmatnr_IsNull() { regZzmatnr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(30)}
     */
    public void setZzmatnr_IsNullOrEmpty() { regZzmatnr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(30)}
     */
    public void setZzmatnr_IsNotNull() { regZzmatnr(CK_ISNN, DOBJ); }

    protected void regZzmatnr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzmatnr(), "ZZMATNR"); }
    protected abstract ConditionValue xgetCValueZzmatnr();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param slqacb The value of slqacb as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqacb_Equal(Long slqacb) {
        doSetSlqacb_Equal(slqacb);
    }

    protected void doSetSlqacb_Equal(Long slqacb) {
        regSlqacb(CK_EQ, slqacb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param slqacb The value of slqacb as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqacb_NotEqual(Long slqacb) {
        doSetSlqacb_NotEqual(slqacb);
    }

    protected void doSetSlqacb_NotEqual(Long slqacb) {
        regSlqacb(CK_NES, slqacb);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param slqacb The value of slqacb as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqacb_GreaterThan(Long slqacb) {
        regSlqacb(CK_GT, slqacb);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param slqacb The value of slqacb as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqacb_LessThan(Long slqacb) {
        regSlqacb(CK_LT, slqacb);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param slqacb The value of slqacb as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqacb_GreaterEqual(Long slqacb) {
        regSlqacb(CK_GE, slqacb);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param slqacb The value of slqacb as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqacb_LessEqual(Long slqacb) {
        regSlqacb(CK_LE, slqacb);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param minNumber The min number of slqacb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of slqacb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSlqacb_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSlqacb(), "SLQACB", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param slqacbList The collection of slqacb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqacb_InScope(Collection<Long> slqacbList) {
        doSetSlqacb_InScope(slqacbList);
    }

    protected void doSetSlqacb_InScope(Collection<Long> slqacbList) {
        regINS(CK_INS, cTL(slqacbList), xgetCValueSlqacb(), "SLQACB");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param slqacbList The collection of slqacb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqacb_NotInScope(Collection<Long> slqacbList) {
        doSetSlqacb_NotInScope(slqacbList);
    }

    protected void doSetSlqacb_NotInScope(Collection<Long> slqacbList) {
        regINS(CK_NINS, cTL(slqacbList), xgetCValueSlqacb(), "SLQACB");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     */
    public void setSlqacb_IsNull() { regSlqacb(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     */
    public void setSlqacb_IsNotNull() { regSlqacb(CK_ISNN, DOBJ); }

    protected void regSlqacb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlqacb(), "SLQACB"); }
    protected abstract ConditionValue xgetCValueSlqacb();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param slqact The value of slqact as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqact_Equal(Long slqact) {
        doSetSlqact_Equal(slqact);
    }

    protected void doSetSlqact_Equal(Long slqact) {
        regSlqact(CK_EQ, slqact);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param slqact The value of slqact as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqact_NotEqual(Long slqact) {
        doSetSlqact_NotEqual(slqact);
    }

    protected void doSetSlqact_NotEqual(Long slqact) {
        regSlqact(CK_NES, slqact);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param slqact The value of slqact as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqact_GreaterThan(Long slqact) {
        regSlqact(CK_GT, slqact);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param slqact The value of slqact as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqact_LessThan(Long slqact) {
        regSlqact(CK_LT, slqact);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param slqact The value of slqact as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqact_GreaterEqual(Long slqact) {
        regSlqact(CK_GE, slqact);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param slqact The value of slqact as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqact_LessEqual(Long slqact) {
        regSlqact(CK_LE, slqact);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param minNumber The min number of slqact. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of slqact. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSlqact_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSlqact(), "SLQACT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param slqactList The collection of slqact as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqact_InScope(Collection<Long> slqactList) {
        doSetSlqact_InScope(slqactList);
    }

    protected void doSetSlqact_InScope(Collection<Long> slqactList) {
        regINS(CK_INS, cTL(slqactList), xgetCValueSlqact(), "SLQACT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param slqactList The collection of slqact as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqact_NotInScope(Collection<Long> slqactList) {
        doSetSlqact_NotInScope(slqactList);
    }

    protected void doSetSlqact_NotInScope(Collection<Long> slqactList) {
        regINS(CK_NINS, cTL(slqactList), xgetCValueSlqact(), "SLQACT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     */
    public void setSlqact_IsNull() { regSlqact(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     */
    public void setSlqact_IsNotNull() { regSlqact(CK_ISNN, DOBJ); }

    protected void regSlqact(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlqact(), "SLQACT"); }
    protected abstract ConditionValue xgetCValueSlqact();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
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
     * LINBLK: {varchar(30)}
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
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_GreaterThan(String linblk) {
        regLinblk(CK_GT, fRES(linblk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_LessThan(String linblk) {
        regLinblk(CK_LT, fRES(linblk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_GreaterEqual(String linblk) {
        regLinblk(CK_GE, fRES(linblk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_LessEqual(String linblk) {
        regLinblk(CK_LE, fRES(linblk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINBLK: {varchar(30)}
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
     * LINBLK: {varchar(30)}
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
     * LINBLK: {varchar(30)} <br>
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
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLinblk_NotLikeSearch(String linblk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(linblk), xgetCValueLinblk(), "LINBLK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_PrefixSearch(String linblk) {
        setLinblk_LikeSearch(linblk, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     */
    public void setLinblk_IsNull() { regLinblk(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     */
    public void setLinblk_IsNullOrEmpty() { regLinblk(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     */
    public void setLinblk_IsNotNull() { regLinblk(CK_ISNN, DOBJ); }

    protected void regLinblk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLinblk(), "LINBLK"); }
    protected abstract ConditionValue xgetCValueLinblk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locno The value of locno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_Equal(String locno) {
        doSetLocno_Equal(fRES(locno));
    }

    protected void doSetLocno_Equal(String locno) {
        regLocno(CK_EQ, locno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locno The value of locno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_NotEqual(String locno) {
        doSetLocno_NotEqual(fRES(locno));
    }

    protected void doSetLocno_NotEqual(String locno) {
        regLocno(CK_NES, locno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locno The value of locno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_GreaterThan(String locno) {
        regLocno(CK_GT, fRES(locno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locno The value of locno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_LessThan(String locno) {
        regLocno(CK_LT, fRES(locno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locno The value of locno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_GreaterEqual(String locno) {
        regLocno(CK_GE, fRES(locno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locno The value of locno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_LessEqual(String locno) {
        regLocno(CK_LE, fRES(locno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locnoList The collection of locno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_InScope(Collection<String> locnoList) {
        doSetLocno_InScope(locnoList);
    }

    protected void doSetLocno_InScope(Collection<String> locnoList) {
        regINS(CK_INS, cTL(locnoList), xgetCValueLocno(), "LOCNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locnoList The collection of locno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_NotInScope(Collection<String> locnoList) {
        doSetLocno_NotInScope(locnoList);
    }

    protected void doSetLocno_NotInScope(Collection<String> locnoList) {
        regINS(CK_NINS, cTL(locnoList), xgetCValueLocno(), "LOCNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCNO: {varchar(255)} <br>
     * <pre>e.g. setLocno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locno The value of locno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocno_LikeSearch(String locno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locno), xgetCValueLocno(), "LOCNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locno The value of locno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocno_NotLikeSearch(String locno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locno), xgetCValueLocno(), "LOCNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locno The value of locno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_PrefixSearch(String locno) {
        setLocno_LikeSearch(locno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     */
    public void setLocno_IsNull() { regLocno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     */
    public void setLocno_IsNullOrEmpty() { regLocno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     */
    public void setLocno_IsNotNull() { regLocno(CK_ISNN, DOBJ); }

    protected void regLocno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocno(), "LOCNO"); }
    protected abstract ConditionValue xgetCValueLocno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCID: {char(1)}
     * @param locid The value of locid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_Equal(String locid) {
        doSetLocid_Equal(fRES(locid));
    }

    protected void doSetLocid_Equal(String locid) {
        regLocid(CK_EQ, locid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCID: {char(1)}
     * @param locid The value of locid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_NotEqual(String locid) {
        doSetLocid_NotEqual(fRES(locid));
    }

    protected void doSetLocid_NotEqual(String locid) {
        regLocid(CK_NES, locid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCID: {char(1)}
     * @param locid The value of locid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_GreaterThan(String locid) {
        regLocid(CK_GT, fRES(locid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCID: {char(1)}
     * @param locid The value of locid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_LessThan(String locid) {
        regLocid(CK_LT, fRES(locid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCID: {char(1)}
     * @param locid The value of locid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_GreaterEqual(String locid) {
        regLocid(CK_GE, fRES(locid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCID: {char(1)}
     * @param locid The value of locid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_LessEqual(String locid) {
        regLocid(CK_LE, fRES(locid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCID: {char(1)}
     * @param locidList The collection of locid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_InScope(Collection<String> locidList) {
        doSetLocid_InScope(locidList);
    }

    protected void doSetLocid_InScope(Collection<String> locidList) {
        regINS(CK_INS, cTL(locidList), xgetCValueLocid(), "LOCID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCID: {char(1)}
     * @param locidList The collection of locid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_NotInScope(Collection<String> locidList) {
        doSetLocid_NotInScope(locidList);
    }

    protected void doSetLocid_NotInScope(Collection<String> locidList) {
        regINS(CK_NINS, cTL(locidList), xgetCValueLocid(), "LOCID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCID: {char(1)} <br>
     * <pre>e.g. setLocid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locid The value of locid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocid_LikeSearch(String locid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locid), xgetCValueLocid(), "LOCID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCID: {char(1)}
     * @param locid The value of locid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocid_NotLikeSearch(String locid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locid), xgetCValueLocid(), "LOCID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCID: {char(1)}
     * @param locid The value of locid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_PrefixSearch(String locid) {
        setLocid_LikeSearch(locid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCID: {char(1)}
     */
    public void setLocid_IsNull() { regLocid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCID: {char(1)}
     */
    public void setLocid_IsNotNull() { regLocid(CK_ISNN, DOBJ); }

    protected void regLocid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocid(), "LOCID"); }
    protected abstract ConditionValue xgetCValueLocid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param dlvprtrnk The value of dlvprtrnk as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvprtrnk_Equal(Long dlvprtrnk) {
        doSetDlvprtrnk_Equal(dlvprtrnk);
    }

    protected void doSetDlvprtrnk_Equal(Long dlvprtrnk) {
        regDlvprtrnk(CK_EQ, dlvprtrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param dlvprtrnk The value of dlvprtrnk as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvprtrnk_NotEqual(Long dlvprtrnk) {
        doSetDlvprtrnk_NotEqual(dlvprtrnk);
    }

    protected void doSetDlvprtrnk_NotEqual(Long dlvprtrnk) {
        regDlvprtrnk(CK_NES, dlvprtrnk);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param dlvprtrnk The value of dlvprtrnk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvprtrnk_GreaterThan(Long dlvprtrnk) {
        regDlvprtrnk(CK_GT, dlvprtrnk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param dlvprtrnk The value of dlvprtrnk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvprtrnk_LessThan(Long dlvprtrnk) {
        regDlvprtrnk(CK_LT, dlvprtrnk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param dlvprtrnk The value of dlvprtrnk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvprtrnk_GreaterEqual(Long dlvprtrnk) {
        regDlvprtrnk(CK_GE, dlvprtrnk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param dlvprtrnk The value of dlvprtrnk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvprtrnk_LessEqual(Long dlvprtrnk) {
        regDlvprtrnk(CK_LE, dlvprtrnk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param minNumber The min number of dlvprtrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dlvprtrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDlvprtrnk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDlvprtrnk(), "DLVPRTRNK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param dlvprtrnkList The collection of dlvprtrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvprtrnk_InScope(Collection<Long> dlvprtrnkList) {
        doSetDlvprtrnk_InScope(dlvprtrnkList);
    }

    protected void doSetDlvprtrnk_InScope(Collection<Long> dlvprtrnkList) {
        regINS(CK_INS, cTL(dlvprtrnkList), xgetCValueDlvprtrnk(), "DLVPRTRNK");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param dlvprtrnkList The collection of dlvprtrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvprtrnk_NotInScope(Collection<Long> dlvprtrnkList) {
        doSetDlvprtrnk_NotInScope(dlvprtrnkList);
    }

    protected void doSetDlvprtrnk_NotInScope(Collection<Long> dlvprtrnkList) {
        regINS(CK_NINS, cTL(dlvprtrnkList), xgetCValueDlvprtrnk(), "DLVPRTRNK");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     */
    public void setDlvprtrnk_IsNull() { regDlvprtrnk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     */
    public void setDlvprtrnk_IsNotNull() { regDlvprtrnk(CK_ISNN, DOBJ); }

    protected void regDlvprtrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvprtrnk(), "DLVPRTRNK"); }
    protected abstract ConditionValue xgetCValueDlvprtrnk();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
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
     * DLVSNM: {bigint(19)}
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
     * DLVSNM: {bigint(19)}
     * @param dlvsnm The value of dlvsnm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_GreaterThan(Long dlvsnm) {
        regDlvsnm(CK_GT, dlvsnm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnm The value of dlvsnm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_LessThan(Long dlvsnm) {
        regDlvsnm(CK_LT, dlvsnm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnm The value of dlvsnm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_GreaterEqual(Long dlvsnm) {
        regDlvsnm(CK_GE, dlvsnm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnm The value of dlvsnm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_LessEqual(Long dlvsnm) {
        regDlvsnm(CK_LE, dlvsnm);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param minNumber The min number of dlvsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dlvsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDlvsnm_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDlvsnm(), "DLVSNM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DLVSNM: {bigint(19)}
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
     * DLVSNM: {bigint(19)}
     * @param dlvsnmList The collection of dlvsnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvsnm_NotInScope(Collection<Long> dlvsnmList) {
        doSetDlvsnm_NotInScope(dlvsnmList);
    }

    protected void doSetDlvsnm_NotInScope(Collection<Long> dlvsnmList) {
        regINS(CK_NINS, cTL(dlvsnmList), xgetCValueDlvsnm(), "DLVSNM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     */
    public void setDlvsnm_IsNull() { regDlvsnm(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     */
    public void setDlvsnm_IsNotNull() { regDlvsnm(CK_ISNN, DOBJ); }

    protected void regDlvsnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvsnm(), "DLVSNM"); }
    protected abstract ConditionValue xgetCValueDlvsnm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {decimal(16, 6)}
     * @param dlvdtlsnm The value of dlvdtlsnm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_Equal(java.math.BigDecimal dlvdtlsnm) {
        doSetDlvdtlsnm_Equal(dlvdtlsnm);
    }

    protected void doSetDlvdtlsnm_Equal(java.math.BigDecimal dlvdtlsnm) {
        regDlvdtlsnm(CK_EQ, dlvdtlsnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {decimal(16, 6)}
     * @param dlvdtlsnm The value of dlvdtlsnm as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_NotEqual(java.math.BigDecimal dlvdtlsnm) {
        doSetDlvdtlsnm_NotEqual(dlvdtlsnm);
    }

    protected void doSetDlvdtlsnm_NotEqual(java.math.BigDecimal dlvdtlsnm) {
        regDlvdtlsnm(CK_NES, dlvdtlsnm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {decimal(16, 6)}
     * @param dlvdtlsnm The value of dlvdtlsnm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_GreaterThan(java.math.BigDecimal dlvdtlsnm) {
        regDlvdtlsnm(CK_GT, dlvdtlsnm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {decimal(16, 6)}
     * @param dlvdtlsnm The value of dlvdtlsnm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_LessThan(java.math.BigDecimal dlvdtlsnm) {
        regDlvdtlsnm(CK_LT, dlvdtlsnm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {decimal(16, 6)}
     * @param dlvdtlsnm The value of dlvdtlsnm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_GreaterEqual(java.math.BigDecimal dlvdtlsnm) {
        regDlvdtlsnm(CK_GE, dlvdtlsnm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {decimal(16, 6)}
     * @param dlvdtlsnm The value of dlvdtlsnm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_LessEqual(java.math.BigDecimal dlvdtlsnm) {
        regDlvdtlsnm(CK_LE, dlvdtlsnm);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {decimal(16, 6)}
     * @param minNumber The min number of dlvdtlsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dlvdtlsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDlvdtlsnm_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDlvdtlsnm(), "DLVDTLSNM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DLVDTLSNM: {decimal(16, 6)}
     * @param dlvdtlsnmList The collection of dlvdtlsnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_InScope(Collection<java.math.BigDecimal> dlvdtlsnmList) {
        doSetDlvdtlsnm_InScope(dlvdtlsnmList);
    }

    protected void doSetDlvdtlsnm_InScope(Collection<java.math.BigDecimal> dlvdtlsnmList) {
        regINS(CK_INS, cTL(dlvdtlsnmList), xgetCValueDlvdtlsnm(), "DLVDTLSNM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DLVDTLSNM: {decimal(16, 6)}
     * @param dlvdtlsnmList The collection of dlvdtlsnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_NotInScope(Collection<java.math.BigDecimal> dlvdtlsnmList) {
        doSetDlvdtlsnm_NotInScope(dlvdtlsnmList);
    }

    protected void doSetDlvdtlsnm_NotInScope(Collection<java.math.BigDecimal> dlvdtlsnmList) {
        regINS(CK_NINS, cTL(dlvdtlsnmList), xgetCValueDlvdtlsnm(), "DLVDTLSNM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DLVDTLSNM: {decimal(16, 6)}
     */
    public void setDlvdtlsnm_IsNull() { regDlvdtlsnm(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DLVDTLSNM: {decimal(16, 6)}
     */
    public void setDlvdtlsnm_IsNotNull() { regDlvdtlsnm(CK_ISNN, DOBJ); }

    protected void regDlvdtlsnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvdtlsnm(), "DLVDTLSNM"); }
    protected abstract ConditionValue xgetCValueDlvdtlsnm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
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
     * SROPRTCNT: {bigint(19)}
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
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterThan(Long sroprtcnt) {
        regSroprtcnt(CK_GT, sroprtcnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessThan(Long sroprtcnt) {
        regSroprtcnt(CK_LT, sroprtcnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterEqual(Long sroprtcnt) {
        regSroprtcnt(CK_GE, sroprtcnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessEqual(Long sroprtcnt) {
        regSroprtcnt(CK_LE, sroprtcnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param minNumber The min number of sroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSroprtcnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSroprtcnt(), "SROPRTCNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {bigint(19)}
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
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcntList The collection of sroprtcnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_NotInScope(Collection<Long> sroprtcntList) {
        doSetSroprtcnt_NotInScope(sroprtcntList);
    }

    protected void doSetSroprtcnt_NotInScope(Collection<Long> sroprtcntList) {
        regINS(CK_NINS, cTL(sroprtcntList), xgetCValueSroprtcnt(), "SROPRTCNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     */
    public void setSroprtcnt_IsNull() { regSroprtcnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     */
    public void setSroprtcnt_IsNotNull() { regSroprtcnt(CK_ISNN, DOBJ); }

    protected void regSroprtcnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSroprtcnt(), "SROPRTCNT"); }
    protected abstract ConditionValue xgetCValueSroprtcnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param ttsroprtcnt The value of ttsroprtcnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtsroprtcnt_Equal(Long ttsroprtcnt) {
        doSetTtsroprtcnt_Equal(ttsroprtcnt);
    }

    protected void doSetTtsroprtcnt_Equal(Long ttsroprtcnt) {
        regTtsroprtcnt(CK_EQ, ttsroprtcnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param ttsroprtcnt The value of ttsroprtcnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtsroprtcnt_NotEqual(Long ttsroprtcnt) {
        doSetTtsroprtcnt_NotEqual(ttsroprtcnt);
    }

    protected void doSetTtsroprtcnt_NotEqual(Long ttsroprtcnt) {
        regTtsroprtcnt(CK_NES, ttsroprtcnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param ttsroprtcnt The value of ttsroprtcnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtsroprtcnt_GreaterThan(Long ttsroprtcnt) {
        regTtsroprtcnt(CK_GT, ttsroprtcnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param ttsroprtcnt The value of ttsroprtcnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtsroprtcnt_LessThan(Long ttsroprtcnt) {
        regTtsroprtcnt(CK_LT, ttsroprtcnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param ttsroprtcnt The value of ttsroprtcnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtsroprtcnt_GreaterEqual(Long ttsroprtcnt) {
        regTtsroprtcnt(CK_GE, ttsroprtcnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param ttsroprtcnt The value of ttsroprtcnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtsroprtcnt_LessEqual(Long ttsroprtcnt) {
        regTtsroprtcnt(CK_LE, ttsroprtcnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param minNumber The min number of ttsroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ttsroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTtsroprtcnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTtsroprtcnt(), "TTSROPRTCNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param ttsroprtcntList The collection of ttsroprtcnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtsroprtcnt_InScope(Collection<Long> ttsroprtcntList) {
        doSetTtsroprtcnt_InScope(ttsroprtcntList);
    }

    protected void doSetTtsroprtcnt_InScope(Collection<Long> ttsroprtcntList) {
        regINS(CK_INS, cTL(ttsroprtcntList), xgetCValueTtsroprtcnt(), "TTSROPRTCNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param ttsroprtcntList The collection of ttsroprtcnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtsroprtcnt_NotInScope(Collection<Long> ttsroprtcntList) {
        doSetTtsroprtcnt_NotInScope(ttsroprtcntList);
    }

    protected void doSetTtsroprtcnt_NotInScope(Collection<Long> ttsroprtcntList) {
        regINS(CK_NINS, cTL(ttsroprtcntList), xgetCValueTtsroprtcnt(), "TTSROPRTCNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     */
    public void setTtsroprtcnt_IsNull() { regTtsroprtcnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     */
    public void setTtsroprtcnt_IsNotNull() { regTtsroprtcnt(CK_ISNN, DOBJ); }

    protected void regTtsroprtcnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTtsroprtcnt(), "TTSROPRTCNT"); }
    protected abstract ConditionValue xgetCValueTtsroprtcnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param tttopdedrnk The value of tttopdedrnk as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTttopdedrnk_Equal(Long tttopdedrnk) {
        doSetTttopdedrnk_Equal(tttopdedrnk);
    }

    protected void doSetTttopdedrnk_Equal(Long tttopdedrnk) {
        regTttopdedrnk(CK_EQ, tttopdedrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param tttopdedrnk The value of tttopdedrnk as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTttopdedrnk_NotEqual(Long tttopdedrnk) {
        doSetTttopdedrnk_NotEqual(tttopdedrnk);
    }

    protected void doSetTttopdedrnk_NotEqual(Long tttopdedrnk) {
        regTttopdedrnk(CK_NES, tttopdedrnk);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param tttopdedrnk The value of tttopdedrnk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTttopdedrnk_GreaterThan(Long tttopdedrnk) {
        regTttopdedrnk(CK_GT, tttopdedrnk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param tttopdedrnk The value of tttopdedrnk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTttopdedrnk_LessThan(Long tttopdedrnk) {
        regTttopdedrnk(CK_LT, tttopdedrnk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param tttopdedrnk The value of tttopdedrnk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTttopdedrnk_GreaterEqual(Long tttopdedrnk) {
        regTttopdedrnk(CK_GE, tttopdedrnk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param tttopdedrnk The value of tttopdedrnk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTttopdedrnk_LessEqual(Long tttopdedrnk) {
        regTttopdedrnk(CK_LE, tttopdedrnk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param minNumber The min number of tttopdedrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tttopdedrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTttopdedrnk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTttopdedrnk(), "TTTOPDEDRNK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param tttopdedrnkList The collection of tttopdedrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTttopdedrnk_InScope(Collection<Long> tttopdedrnkList) {
        doSetTttopdedrnk_InScope(tttopdedrnkList);
    }

    protected void doSetTttopdedrnk_InScope(Collection<Long> tttopdedrnkList) {
        regINS(CK_INS, cTL(tttopdedrnkList), xgetCValueTttopdedrnk(), "TTTOPDEDRNK");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param tttopdedrnkList The collection of tttopdedrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTttopdedrnk_NotInScope(Collection<Long> tttopdedrnkList) {
        doSetTttopdedrnk_NotInScope(tttopdedrnkList);
    }

    protected void doSetTttopdedrnk_NotInScope(Collection<Long> tttopdedrnkList) {
        regINS(CK_NINS, cTL(tttopdedrnkList), xgetCValueTttopdedrnk(), "TTTOPDEDRNK");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     */
    public void setTttopdedrnk_IsNull() { regTttopdedrnk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     */
    public void setTttopdedrnk_IsNotNull() { regTttopdedrnk(CK_ISNN, DOBJ); }

    protected void regTttopdedrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTttopdedrnk(), "TTTOPDEDRNK"); }
    protected abstract ConditionValue xgetCValueTttopdedrnk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRTYP: {char(1)}
     * @param brtyp The value of brtyp as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_Equal(String brtyp) {
        doSetBrtyp_Equal(fRES(brtyp));
    }

    protected void doSetBrtyp_Equal(String brtyp) {
        regBrtyp(CK_EQ, brtyp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRTYP: {char(1)}
     * @param brtyp The value of brtyp as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_NotEqual(String brtyp) {
        doSetBrtyp_NotEqual(fRES(brtyp));
    }

    protected void doSetBrtyp_NotEqual(String brtyp) {
        regBrtyp(CK_NES, brtyp);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRTYP: {char(1)}
     * @param brtyp The value of brtyp as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_GreaterThan(String brtyp) {
        regBrtyp(CK_GT, fRES(brtyp));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRTYP: {char(1)}
     * @param brtyp The value of brtyp as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_LessThan(String brtyp) {
        regBrtyp(CK_LT, fRES(brtyp));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRTYP: {char(1)}
     * @param brtyp The value of brtyp as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_GreaterEqual(String brtyp) {
        regBrtyp(CK_GE, fRES(brtyp));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRTYP: {char(1)}
     * @param brtyp The value of brtyp as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_LessEqual(String brtyp) {
        regBrtyp(CK_LE, fRES(brtyp));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRTYP: {char(1)}
     * @param brtypList The collection of brtyp as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_InScope(Collection<String> brtypList) {
        doSetBrtyp_InScope(brtypList);
    }

    protected void doSetBrtyp_InScope(Collection<String> brtypList) {
        regINS(CK_INS, cTL(brtypList), xgetCValueBrtyp(), "BRTYP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRTYP: {char(1)}
     * @param brtypList The collection of brtyp as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_NotInScope(Collection<String> brtypList) {
        doSetBrtyp_NotInScope(brtypList);
    }

    protected void doSetBrtyp_NotInScope(Collection<String> brtypList) {
        regINS(CK_NINS, cTL(brtypList), xgetCValueBrtyp(), "BRTYP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRTYP: {char(1)} <br>
     * <pre>e.g. setBrtyp_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param brtyp The value of brtyp as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBrtyp_LikeSearch(String brtyp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(brtyp), xgetCValueBrtyp(), "BRTYP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRTYP: {char(1)}
     * @param brtyp The value of brtyp as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBrtyp_NotLikeSearch(String brtyp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(brtyp), xgetCValueBrtyp(), "BRTYP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRTYP: {char(1)}
     * @param brtyp The value of brtyp as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_PrefixSearch(String brtyp) {
        setBrtyp_LikeSearch(brtyp, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BRTYP: {char(1)}
     */
    public void setBrtyp_IsNull() { regBrtyp(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BRTYP: {char(1)}
     */
    public void setBrtyp_IsNotNull() { regBrtyp(CK_ISNN, DOBJ); }

    protected void regBrtyp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBrtyp(), "BRTYP"); }
    protected abstract ConditionValue xgetCValueBrtyp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxno The value of boxno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_Equal(String boxno) {
        doSetBoxno_Equal(fRES(boxno));
    }

    protected void doSetBoxno_Equal(String boxno) {
        regBoxno(CK_EQ, boxno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxno The value of boxno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_NotEqual(String boxno) {
        doSetBoxno_NotEqual(fRES(boxno));
    }

    protected void doSetBoxno_NotEqual(String boxno) {
        regBoxno(CK_NES, boxno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxno The value of boxno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_GreaterThan(String boxno) {
        regBoxno(CK_GT, fRES(boxno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxno The value of boxno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_LessThan(String boxno) {
        regBoxno(CK_LT, fRES(boxno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxno The value of boxno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_GreaterEqual(String boxno) {
        regBoxno(CK_GE, fRES(boxno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxno The value of boxno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_LessEqual(String boxno) {
        regBoxno(CK_LE, fRES(boxno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxnoList The collection of boxno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_InScope(Collection<String> boxnoList) {
        doSetBoxno_InScope(boxnoList);
    }

    protected void doSetBoxno_InScope(Collection<String> boxnoList) {
        regINS(CK_INS, cTL(boxnoList), xgetCValueBoxno(), "BOXNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxnoList The collection of boxno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_NotInScope(Collection<String> boxnoList) {
        doSetBoxno_NotInScope(boxnoList);
    }

    protected void doSetBoxno_NotInScope(Collection<String> boxnoList) {
        regINS(CK_NINS, cTL(boxnoList), xgetCValueBoxno(), "BOXNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNO: {varchar(30)} <br>
     * <pre>e.g. setBoxno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxno The value of boxno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxno_LikeSearch(String boxno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxno), xgetCValueBoxno(), "BOXNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxno The value of boxno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxno_NotLikeSearch(String boxno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxno), xgetCValueBoxno(), "BOXNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxno The value of boxno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_PrefixSearch(String boxno) {
        setBoxno_LikeSearch(boxno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     */
    public void setBoxno_IsNull() { regBoxno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     */
    public void setBoxno_IsNullOrEmpty() { regBoxno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     */
    public void setBoxno_IsNotNull() { regBoxno(CK_ISNN, DOBJ); }

    protected void regBoxno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxno(), "BOXNO"); }
    protected abstract ConditionValue xgetCValueBoxno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_Equal(String boxnocnsnm) {
        doSetBoxnocnsnm_Equal(fRES(boxnocnsnm));
    }

    protected void doSetBoxnocnsnm_Equal(String boxnocnsnm) {
        regBoxnocnsnm(CK_EQ, boxnocnsnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_NotEqual(String boxnocnsnm) {
        doSetBoxnocnsnm_NotEqual(fRES(boxnocnsnm));
    }

    protected void doSetBoxnocnsnm_NotEqual(String boxnocnsnm) {
        regBoxnocnsnm(CK_NES, boxnocnsnm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_GreaterThan(String boxnocnsnm) {
        regBoxnocnsnm(CK_GT, fRES(boxnocnsnm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_LessThan(String boxnocnsnm) {
        regBoxnocnsnm(CK_LT, fRES(boxnocnsnm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_GreaterEqual(String boxnocnsnm) {
        regBoxnocnsnm(CK_GE, fRES(boxnocnsnm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_LessEqual(String boxnocnsnm) {
        regBoxnocnsnm(CK_LE, fRES(boxnocnsnm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnmList The collection of boxnocnsnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_InScope(Collection<String> boxnocnsnmList) {
        doSetBoxnocnsnm_InScope(boxnocnsnmList);
    }

    protected void doSetBoxnocnsnm_InScope(Collection<String> boxnocnsnmList) {
        regINS(CK_INS, cTL(boxnocnsnmList), xgetCValueBoxnocnsnm(), "BOXNOCNSNM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnmList The collection of boxnocnsnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_NotInScope(Collection<String> boxnocnsnmList) {
        doSetBoxnocnsnm_NotInScope(boxnocnsnmList);
    }

    protected void doSetBoxnocnsnm_NotInScope(Collection<String> boxnocnsnmList) {
        regINS(CK_NINS, cTL(boxnocnsnmList), xgetCValueBoxnocnsnm(), "BOXNOCNSNM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNOCNSNM: {varchar(30)} <br>
     * <pre>e.g. setBoxnocnsnm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxnocnsnm The value of boxnocnsnm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxnocnsnm_LikeSearch(String boxnocnsnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxnocnsnm), xgetCValueBoxnocnsnm(), "BOXNOCNSNM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxnocnsnm_NotLikeSearch(String boxnocnsnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxnocnsnm), xgetCValueBoxnocnsnm(), "BOXNOCNSNM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_PrefixSearch(String boxnocnsnm) {
        setBoxnocnsnm_LikeSearch(boxnocnsnm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     */
    public void setBoxnocnsnm_IsNull() { regBoxnocnsnm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     */
    public void setBoxnocnsnm_IsNullOrEmpty() { regBoxnocnsnm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     */
    public void setBoxnocnsnm_IsNotNull() { regBoxnocnsnm(CK_ISNN, DOBJ); }

    protected void regBoxnocnsnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxnocnsnm(), "BOXNOCNSNM"); }
    protected abstract ConditionValue xgetCValueBoxnocnsnm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYP: {char(1)}
     * @param boxtyp The value of boxtyp as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_Equal(String boxtyp) {
        doSetBoxtyp_Equal(fRES(boxtyp));
    }

    protected void doSetBoxtyp_Equal(String boxtyp) {
        regBoxtyp(CK_EQ, boxtyp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYP: {char(1)}
     * @param boxtyp The value of boxtyp as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_NotEqual(String boxtyp) {
        doSetBoxtyp_NotEqual(fRES(boxtyp));
    }

    protected void doSetBoxtyp_NotEqual(String boxtyp) {
        regBoxtyp(CK_NES, boxtyp);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYP: {char(1)}
     * @param boxtyp The value of boxtyp as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_GreaterThan(String boxtyp) {
        regBoxtyp(CK_GT, fRES(boxtyp));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYP: {char(1)}
     * @param boxtyp The value of boxtyp as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_LessThan(String boxtyp) {
        regBoxtyp(CK_LT, fRES(boxtyp));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYP: {char(1)}
     * @param boxtyp The value of boxtyp as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_GreaterEqual(String boxtyp) {
        regBoxtyp(CK_GE, fRES(boxtyp));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYP: {char(1)}
     * @param boxtyp The value of boxtyp as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_LessEqual(String boxtyp) {
        regBoxtyp(CK_LE, fRES(boxtyp));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXTYP: {char(1)}
     * @param boxtypList The collection of boxtyp as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_InScope(Collection<String> boxtypList) {
        doSetBoxtyp_InScope(boxtypList);
    }

    protected void doSetBoxtyp_InScope(Collection<String> boxtypList) {
        regINS(CK_INS, cTL(boxtypList), xgetCValueBoxtyp(), "BOXTYP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXTYP: {char(1)}
     * @param boxtypList The collection of boxtyp as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_NotInScope(Collection<String> boxtypList) {
        doSetBoxtyp_NotInScope(boxtypList);
    }

    protected void doSetBoxtyp_NotInScope(Collection<String> boxtypList) {
        regINS(CK_NINS, cTL(boxtypList), xgetCValueBoxtyp(), "BOXTYP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXTYP: {char(1)} <br>
     * <pre>e.g. setBoxtyp_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxtyp The value of boxtyp as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxtyp_LikeSearch(String boxtyp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxtyp), xgetCValueBoxtyp(), "BOXTYP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXTYP: {char(1)}
     * @param boxtyp The value of boxtyp as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxtyp_NotLikeSearch(String boxtyp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxtyp), xgetCValueBoxtyp(), "BOXTYP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXTYP: {char(1)}
     * @param boxtyp The value of boxtyp as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_PrefixSearch(String boxtyp) {
        setBoxtyp_LikeSearch(boxtyp, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOXTYP: {char(1)}
     */
    public void setBoxtyp_IsNull() { regBoxtyp(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOXTYP: {char(1)}
     */
    public void setBoxtyp_IsNotNull() { regBoxtyp(CK_ISNN, DOBJ); }

    protected void regBoxtyp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxtyp(), "BOXTYP"); }
    protected abstract ConditionValue xgetCValueBoxtyp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdid The value of mgboxdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_Equal(String mgboxdid) {
        doSetMgboxdid_Equal(fRES(mgboxdid));
    }

    protected void doSetMgboxdid_Equal(String mgboxdid) {
        regMgboxdid(CK_EQ, mgboxdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdid The value of mgboxdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_NotEqual(String mgboxdid) {
        doSetMgboxdid_NotEqual(fRES(mgboxdid));
    }

    protected void doSetMgboxdid_NotEqual(String mgboxdid) {
        regMgboxdid(CK_NES, mgboxdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdid The value of mgboxdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_GreaterThan(String mgboxdid) {
        regMgboxdid(CK_GT, fRES(mgboxdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdid The value of mgboxdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_LessThan(String mgboxdid) {
        regMgboxdid(CK_LT, fRES(mgboxdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdid The value of mgboxdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_GreaterEqual(String mgboxdid) {
        regMgboxdid(CK_GE, fRES(mgboxdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdid The value of mgboxdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_LessEqual(String mgboxdid) {
        regMgboxdid(CK_LE, fRES(mgboxdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdidList The collection of mgboxdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_InScope(Collection<String> mgboxdidList) {
        doSetMgboxdid_InScope(mgboxdidList);
    }

    protected void doSetMgboxdid_InScope(Collection<String> mgboxdidList) {
        regINS(CK_INS, cTL(mgboxdidList), xgetCValueMgboxdid(), "MGBOXDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdidList The collection of mgboxdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_NotInScope(Collection<String> mgboxdidList) {
        doSetMgboxdid_NotInScope(mgboxdidList);
    }

    protected void doSetMgboxdid_NotInScope(Collection<String> mgboxdidList) {
        regINS(CK_NINS, cTL(mgboxdidList), xgetCValueMgboxdid(), "MGBOXDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MGBOXDID: {char(1)} <br>
     * <pre>e.g. setMgboxdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mgboxdid The value of mgboxdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMgboxdid_LikeSearch(String mgboxdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mgboxdid), xgetCValueMgboxdid(), "MGBOXDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdid The value of mgboxdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMgboxdid_NotLikeSearch(String mgboxdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mgboxdid), xgetCValueMgboxdid(), "MGBOXDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdid The value of mgboxdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_PrefixSearch(String mgboxdid) {
        setMgboxdid_LikeSearch(mgboxdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MGBOXDID: {char(1)}
     */
    public void setMgboxdid_IsNull() { regMgboxdid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MGBOXDID: {char(1)}
     */
    public void setMgboxdid_IsNotNull() { regMgboxdid(CK_ISNN, DOBJ); }

    protected void regMgboxdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMgboxdid(), "MGBOXDID"); }
    protected abstract ConditionValue xgetCValueMgboxdid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdid The value of dmdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_Equal(String dmdid) {
        doSetDmdid_Equal(fRES(dmdid));
    }

    protected void doSetDmdid_Equal(String dmdid) {
        regDmdid(CK_EQ, dmdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdid The value of dmdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_NotEqual(String dmdid) {
        doSetDmdid_NotEqual(fRES(dmdid));
    }

    protected void doSetDmdid_NotEqual(String dmdid) {
        regDmdid(CK_NES, dmdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdid The value of dmdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_GreaterThan(String dmdid) {
        regDmdid(CK_GT, fRES(dmdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdid The value of dmdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_LessThan(String dmdid) {
        regDmdid(CK_LT, fRES(dmdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdid The value of dmdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_GreaterEqual(String dmdid) {
        regDmdid(CK_GE, fRES(dmdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdid The value of dmdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_LessEqual(String dmdid) {
        regDmdid(CK_LE, fRES(dmdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdidList The collection of dmdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_InScope(Collection<String> dmdidList) {
        doSetDmdid_InScope(dmdidList);
    }

    protected void doSetDmdid_InScope(Collection<String> dmdidList) {
        regINS(CK_INS, cTL(dmdidList), xgetCValueDmdid(), "DMDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdidList The collection of dmdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_NotInScope(Collection<String> dmdidList) {
        doSetDmdid_NotInScope(dmdidList);
    }

    protected void doSetDmdid_NotInScope(Collection<String> dmdidList) {
        regINS(CK_NINS, cTL(dmdidList), xgetCValueDmdid(), "DMDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DMDID: {char(1)} <br>
     * <pre>e.g. setDmdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dmdid The value of dmdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDmdid_LikeSearch(String dmdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dmdid), xgetCValueDmdid(), "DMDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdid The value of dmdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDmdid_NotLikeSearch(String dmdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dmdid), xgetCValueDmdid(), "DMDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdid The value of dmdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_PrefixSearch(String dmdid) {
        setDmdid_LikeSearch(dmdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DMDID: {char(1)}
     */
    public void setDmdid_IsNull() { regDmdid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DMDID: {char(1)}
     */
    public void setDmdid_IsNotNull() { regDmdid(CK_ISNN, DOBJ); }

    protected void regDmdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDmdid(), "DMDID"); }
    protected abstract ConditionValue xgetCValueDmdid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param ttboxqa The value of ttboxqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtboxqa_Equal(Long ttboxqa) {
        doSetTtboxqa_Equal(ttboxqa);
    }

    protected void doSetTtboxqa_Equal(Long ttboxqa) {
        regTtboxqa(CK_EQ, ttboxqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param ttboxqa The value of ttboxqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtboxqa_NotEqual(Long ttboxqa) {
        doSetTtboxqa_NotEqual(ttboxqa);
    }

    protected void doSetTtboxqa_NotEqual(Long ttboxqa) {
        regTtboxqa(CK_NES, ttboxqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param ttboxqa The value of ttboxqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtboxqa_GreaterThan(Long ttboxqa) {
        regTtboxqa(CK_GT, ttboxqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param ttboxqa The value of ttboxqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtboxqa_LessThan(Long ttboxqa) {
        regTtboxqa(CK_LT, ttboxqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param ttboxqa The value of ttboxqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtboxqa_GreaterEqual(Long ttboxqa) {
        regTtboxqa(CK_GE, ttboxqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param ttboxqa The value of ttboxqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtboxqa_LessEqual(Long ttboxqa) {
        regTtboxqa(CK_LE, ttboxqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param minNumber The min number of ttboxqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ttboxqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTtboxqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTtboxqa(), "TTBOXQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param ttboxqaList The collection of ttboxqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtboxqa_InScope(Collection<Long> ttboxqaList) {
        doSetTtboxqa_InScope(ttboxqaList);
    }

    protected void doSetTtboxqa_InScope(Collection<Long> ttboxqaList) {
        regINS(CK_INS, cTL(ttboxqaList), xgetCValueTtboxqa(), "TTBOXQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param ttboxqaList The collection of ttboxqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtboxqa_NotInScope(Collection<Long> ttboxqaList) {
        doSetTtboxqa_NotInScope(ttboxqaList);
    }

    protected void doSetTtboxqa_NotInScope(Collection<Long> ttboxqaList) {
        regINS(CK_NINS, cTL(ttboxqaList), xgetCValueTtboxqa(), "TTBOXQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     */
    public void setTtboxqa_IsNull() { regTtboxqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     */
    public void setTtboxqa_IsNotNull() { regTtboxqa(CK_ISNN, DOBJ); }

    protected void regTtboxqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTtboxqa(), "TTBOXQA"); }
    protected abstract ConditionValue xgetCValueTtboxqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param boxctqata The value of boxctqata as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqata_Equal(Long boxctqata) {
        doSetBoxctqata_Equal(boxctqata);
    }

    protected void doSetBoxctqata_Equal(Long boxctqata) {
        regBoxctqata(CK_EQ, boxctqata);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param boxctqata The value of boxctqata as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqata_NotEqual(Long boxctqata) {
        doSetBoxctqata_NotEqual(boxctqata);
    }

    protected void doSetBoxctqata_NotEqual(Long boxctqata) {
        regBoxctqata(CK_NES, boxctqata);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param boxctqata The value of boxctqata as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqata_GreaterThan(Long boxctqata) {
        regBoxctqata(CK_GT, boxctqata);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param boxctqata The value of boxctqata as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqata_LessThan(Long boxctqata) {
        regBoxctqata(CK_LT, boxctqata);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param boxctqata The value of boxctqata as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqata_GreaterEqual(Long boxctqata) {
        regBoxctqata(CK_GE, boxctqata);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param boxctqata The value of boxctqata as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqata_LessEqual(Long boxctqata) {
        regBoxctqata(CK_LE, boxctqata);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param minNumber The min number of boxctqata. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of boxctqata. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBoxctqata_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBoxctqata(), "BOXCTQATA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param boxctqataList The collection of boxctqata as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxctqata_InScope(Collection<Long> boxctqataList) {
        doSetBoxctqata_InScope(boxctqataList);
    }

    protected void doSetBoxctqata_InScope(Collection<Long> boxctqataList) {
        regINS(CK_INS, cTL(boxctqataList), xgetCValueBoxctqata(), "BOXCTQATA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param boxctqataList The collection of boxctqata as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxctqata_NotInScope(Collection<Long> boxctqataList) {
        doSetBoxctqata_NotInScope(boxctqataList);
    }

    protected void doSetBoxctqata_NotInScope(Collection<Long> boxctqataList) {
        regINS(CK_NINS, cTL(boxctqataList), xgetCValueBoxctqata(), "BOXCTQATA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     */
    public void setBoxctqata_IsNull() { regBoxctqata(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     */
    public void setBoxctqata_IsNotNull() { regBoxctqata(CK_ISNN, DOBJ); }

    protected void regBoxctqata(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxctqata(), "BOXCTQATA"); }
    protected abstract ConditionValue xgetCValueBoxctqata();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param boxctqaapsrplc The value of boxctqaapsrplc as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqaapsrplc_Equal(Long boxctqaapsrplc) {
        doSetBoxctqaapsrplc_Equal(boxctqaapsrplc);
    }

    protected void doSetBoxctqaapsrplc_Equal(Long boxctqaapsrplc) {
        regBoxctqaapsrplc(CK_EQ, boxctqaapsrplc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param boxctqaapsrplc The value of boxctqaapsrplc as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqaapsrplc_NotEqual(Long boxctqaapsrplc) {
        doSetBoxctqaapsrplc_NotEqual(boxctqaapsrplc);
    }

    protected void doSetBoxctqaapsrplc_NotEqual(Long boxctqaapsrplc) {
        regBoxctqaapsrplc(CK_NES, boxctqaapsrplc);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param boxctqaapsrplc The value of boxctqaapsrplc as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqaapsrplc_GreaterThan(Long boxctqaapsrplc) {
        regBoxctqaapsrplc(CK_GT, boxctqaapsrplc);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param boxctqaapsrplc The value of boxctqaapsrplc as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqaapsrplc_LessThan(Long boxctqaapsrplc) {
        regBoxctqaapsrplc(CK_LT, boxctqaapsrplc);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param boxctqaapsrplc The value of boxctqaapsrplc as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqaapsrplc_GreaterEqual(Long boxctqaapsrplc) {
        regBoxctqaapsrplc(CK_GE, boxctqaapsrplc);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param boxctqaapsrplc The value of boxctqaapsrplc as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqaapsrplc_LessEqual(Long boxctqaapsrplc) {
        regBoxctqaapsrplc(CK_LE, boxctqaapsrplc);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param minNumber The min number of boxctqaapsrplc. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of boxctqaapsrplc. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBoxctqaapsrplc_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBoxctqaapsrplc(), "BOXCTQAAPSRPLC", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param boxctqaapsrplcList The collection of boxctqaapsrplc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxctqaapsrplc_InScope(Collection<Long> boxctqaapsrplcList) {
        doSetBoxctqaapsrplc_InScope(boxctqaapsrplcList);
    }

    protected void doSetBoxctqaapsrplc_InScope(Collection<Long> boxctqaapsrplcList) {
        regINS(CK_INS, cTL(boxctqaapsrplcList), xgetCValueBoxctqaapsrplc(), "BOXCTQAAPSRPLC");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param boxctqaapsrplcList The collection of boxctqaapsrplc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxctqaapsrplc_NotInScope(Collection<Long> boxctqaapsrplcList) {
        doSetBoxctqaapsrplc_NotInScope(boxctqaapsrplcList);
    }

    protected void doSetBoxctqaapsrplc_NotInScope(Collection<Long> boxctqaapsrplcList) {
        regINS(CK_NINS, cTL(boxctqaapsrplcList), xgetCValueBoxctqaapsrplc(), "BOXCTQAAPSRPLC");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     */
    public void setBoxctqaapsrplc_IsNull() { regBoxctqaapsrplc(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     */
    public void setBoxctqaapsrplc_IsNotNull() { regBoxctqaapsrplc(CK_ISNN, DOBJ); }

    protected void regBoxctqaapsrplc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxctqaapsrplc(), "BOXCTQAAPSRPLC"); }
    protected abstract ConditionValue xgetCValueBoxctqaapsrplc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbid The value of drclstlbcbid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_Equal(String drclstlbcbid) {
        doSetDrclstlbcbid_Equal(fRES(drclstlbcbid));
    }

    protected void doSetDrclstlbcbid_Equal(String drclstlbcbid) {
        regDrclstlbcbid(CK_EQ, drclstlbcbid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbid The value of drclstlbcbid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_NotEqual(String drclstlbcbid) {
        doSetDrclstlbcbid_NotEqual(fRES(drclstlbcbid));
    }

    protected void doSetDrclstlbcbid_NotEqual(String drclstlbcbid) {
        regDrclstlbcbid(CK_NES, drclstlbcbid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbid The value of drclstlbcbid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_GreaterThan(String drclstlbcbid) {
        regDrclstlbcbid(CK_GT, fRES(drclstlbcbid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbid The value of drclstlbcbid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_LessThan(String drclstlbcbid) {
        regDrclstlbcbid(CK_LT, fRES(drclstlbcbid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbid The value of drclstlbcbid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_GreaterEqual(String drclstlbcbid) {
        regDrclstlbcbid(CK_GE, fRES(drclstlbcbid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbid The value of drclstlbcbid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_LessEqual(String drclstlbcbid) {
        regDrclstlbcbid(CK_LE, fRES(drclstlbcbid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbidList The collection of drclstlbcbid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_InScope(Collection<String> drclstlbcbidList) {
        doSetDrclstlbcbid_InScope(drclstlbcbidList);
    }

    protected void doSetDrclstlbcbid_InScope(Collection<String> drclstlbcbidList) {
        regINS(CK_INS, cTL(drclstlbcbidList), xgetCValueDrclstlbcbid(), "DRCLSTLBCBID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbidList The collection of drclstlbcbid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_NotInScope(Collection<String> drclstlbcbidList) {
        doSetDrclstlbcbid_NotInScope(drclstlbcbidList);
    }

    protected void doSetDrclstlbcbid_NotInScope(Collection<String> drclstlbcbidList) {
        regINS(CK_NINS, cTL(drclstlbcbidList), xgetCValueDrclstlbcbid(), "DRCLSTLBCBID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DRCLSTLBCBID: {char(1)} <br>
     * <pre>e.g. setDrclstlbcbid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param drclstlbcbid The value of drclstlbcbid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDrclstlbcbid_LikeSearch(String drclstlbcbid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(drclstlbcbid), xgetCValueDrclstlbcbid(), "DRCLSTLBCBID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbid The value of drclstlbcbid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDrclstlbcbid_NotLikeSearch(String drclstlbcbid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(drclstlbcbid), xgetCValueDrclstlbcbid(), "DRCLSTLBCBID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbid The value of drclstlbcbid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_PrefixSearch(String drclstlbcbid) {
        setDrclstlbcbid_LikeSearch(drclstlbcbid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     */
    public void setDrclstlbcbid_IsNull() { regDrclstlbcbid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     */
    public void setDrclstlbcbid_IsNotNull() { regDrclstlbcbid(CK_ISNN, DOBJ); }

    protected void regDrclstlbcbid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDrclstlbcbid(), "DRCLSTLBCBID"); }
    protected abstract ConditionValue xgetCValueDrclstlbcbid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19)}
     * @param lbboxno The value of lbboxno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbboxno_Equal(Long lbboxno) {
        doSetLbboxno_Equal(lbboxno);
    }

    protected void doSetLbboxno_Equal(Long lbboxno) {
        regLbboxno(CK_EQ, lbboxno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19)}
     * @param lbboxno The value of lbboxno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbboxno_NotEqual(Long lbboxno) {
        doSetLbboxno_NotEqual(lbboxno);
    }

    protected void doSetLbboxno_NotEqual(Long lbboxno) {
        regLbboxno(CK_NES, lbboxno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19)}
     * @param lbboxno The value of lbboxno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbboxno_GreaterThan(Long lbboxno) {
        regLbboxno(CK_GT, lbboxno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19)}
     * @param lbboxno The value of lbboxno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbboxno_LessThan(Long lbboxno) {
        regLbboxno(CK_LT, lbboxno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19)}
     * @param lbboxno The value of lbboxno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbboxno_GreaterEqual(Long lbboxno) {
        regLbboxno(CK_GE, lbboxno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19)}
     * @param lbboxno The value of lbboxno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbboxno_LessEqual(Long lbboxno) {
        regLbboxno(CK_LE, lbboxno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19)}
     * @param minNumber The min number of lbboxno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lbboxno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLbboxno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLbboxno(), "LBBOXNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LBBOXNO: {bigint(19)}
     * @param lbboxnoList The collection of lbboxno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbboxno_InScope(Collection<Long> lbboxnoList) {
        doSetLbboxno_InScope(lbboxnoList);
    }

    protected void doSetLbboxno_InScope(Collection<Long> lbboxnoList) {
        regINS(CK_INS, cTL(lbboxnoList), xgetCValueLbboxno(), "LBBOXNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LBBOXNO: {bigint(19)}
     * @param lbboxnoList The collection of lbboxno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbboxno_NotInScope(Collection<Long> lbboxnoList) {
        doSetLbboxno_NotInScope(lbboxnoList);
    }

    protected void doSetLbboxno_NotInScope(Collection<Long> lbboxnoList) {
        regINS(CK_NINS, cTL(lbboxnoList), xgetCValueLbboxno(), "LBBOXNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19)}
     */
    public void setLbboxno_IsNull() { regLbboxno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19)}
     */
    public void setLbboxno_IsNotNull() { regLbboxno(CK_ISNN, DOBJ); }

    protected void regLbboxno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLbboxno(), "LBBOXNO"); }
    protected abstract ConditionValue xgetCValueLbboxno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19)}
     * @param lbttboxqa The value of lbttboxqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbttboxqa_Equal(Long lbttboxqa) {
        doSetLbttboxqa_Equal(lbttboxqa);
    }

    protected void doSetLbttboxqa_Equal(Long lbttboxqa) {
        regLbttboxqa(CK_EQ, lbttboxqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19)}
     * @param lbttboxqa The value of lbttboxqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbttboxqa_NotEqual(Long lbttboxqa) {
        doSetLbttboxqa_NotEqual(lbttboxqa);
    }

    protected void doSetLbttboxqa_NotEqual(Long lbttboxqa) {
        regLbttboxqa(CK_NES, lbttboxqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19)}
     * @param lbttboxqa The value of lbttboxqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbttboxqa_GreaterThan(Long lbttboxqa) {
        regLbttboxqa(CK_GT, lbttboxqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19)}
     * @param lbttboxqa The value of lbttboxqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbttboxqa_LessThan(Long lbttboxqa) {
        regLbttboxqa(CK_LT, lbttboxqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19)}
     * @param lbttboxqa The value of lbttboxqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbttboxqa_GreaterEqual(Long lbttboxqa) {
        regLbttboxqa(CK_GE, lbttboxqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19)}
     * @param lbttboxqa The value of lbttboxqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbttboxqa_LessEqual(Long lbttboxqa) {
        regLbttboxqa(CK_LE, lbttboxqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19)}
     * @param minNumber The min number of lbttboxqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lbttboxqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLbttboxqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLbttboxqa(), "LBTTBOXQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LBTTBOXQA: {bigint(19)}
     * @param lbttboxqaList The collection of lbttboxqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbttboxqa_InScope(Collection<Long> lbttboxqaList) {
        doSetLbttboxqa_InScope(lbttboxqaList);
    }

    protected void doSetLbttboxqa_InScope(Collection<Long> lbttboxqaList) {
        regINS(CK_INS, cTL(lbttboxqaList), xgetCValueLbttboxqa(), "LBTTBOXQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LBTTBOXQA: {bigint(19)}
     * @param lbttboxqaList The collection of lbttboxqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbttboxqa_NotInScope(Collection<Long> lbttboxqaList) {
        doSetLbttboxqa_NotInScope(lbttboxqaList);
    }

    protected void doSetLbttboxqa_NotInScope(Collection<Long> lbttboxqaList) {
        regINS(CK_NINS, cTL(lbttboxqaList), xgetCValueLbttboxqa(), "LBTTBOXQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19)}
     */
    public void setLbttboxqa_IsNull() { regLbttboxqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19)}
     */
    public void setLbttboxqa_IsNotNull() { regLbttboxqa(CK_ISNN, DOBJ); }

    protected void regLbttboxqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLbttboxqa(), "LBTTBOXQA"); }
    protected abstract ConditionValue xgetCValueLbttboxqa();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_Equal(String sendCd) {
        doSetSendCd_Equal(fRES(sendCd));
    }

    protected void doSetSendCd_Equal(String sendCd) {
        regSendCd(CK_EQ, sendCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_NotEqual(String sendCd) {
        doSetSendCd_NotEqual(fRES(sendCd));
    }

    protected void doSetSendCd_NotEqual(String sendCd) {
        regSendCd(CK_NES, sendCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_GreaterThan(String sendCd) {
        regSendCd(CK_GT, fRES(sendCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_LessThan(String sendCd) {
        regSendCd(CK_LT, fRES(sendCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_GreaterEqual(String sendCd) {
        regSendCd(CK_GE, fRES(sendCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_LessEqual(String sendCd) {
        regSendCd(CK_LE, fRES(sendCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCdList The collection of sendCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_InScope(Collection<String> sendCdList) {
        doSetSendCd_InScope(sendCdList);
    }

    protected void doSetSendCd_InScope(Collection<String> sendCdList) {
        regINS(CK_INS, cTL(sendCdList), xgetCValueSendCd(), "SEND_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCdList The collection of sendCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_NotInScope(Collection<String> sendCdList) {
        doSetSendCd_NotInScope(sendCdList);
    }

    protected void doSetSendCd_NotInScope(Collection<String> sendCdList) {
        regINS(CK_NINS, cTL(sendCdList), xgetCValueSendCd(), "SEND_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)} <br>
     * <pre>e.g. setSendCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sendCd The value of sendCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSendCd_LikeSearch(String sendCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sendCd), xgetCValueSendCd(), "SEND_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSendCd_NotLikeSearch(String sendCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sendCd), xgetCValueSendCd(), "SEND_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_PrefixSearch(String sendCd) {
        setSendCd_LikeSearch(sendCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     */
    public void setSendCd_IsNull() { regSendCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     */
    public void setSendCd_IsNullOrEmpty() { regSendCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     */
    public void setSendCd_IsNotNull() { regSendCd(CK_ISNN, DOBJ); }

    protected void regSendCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendCd(), "SEND_CD"); }
    protected abstract ConditionValue xgetCValueSendCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1)}
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
     * WORK_FLG: {char(1)}
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
     * WORK_FLG: {char(1)}
     * @param workFlg The value of workFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterThan(String workFlg) {
        regWorkFlg(CK_GT, fRES(workFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1)}
     * @param workFlg The value of workFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessThan(String workFlg) {
        regWorkFlg(CK_LT, fRES(workFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1)}
     * @param workFlg The value of workFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterEqual(String workFlg) {
        regWorkFlg(CK_GE, fRES(workFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1)}
     * @param workFlg The value of workFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessEqual(String workFlg) {
        regWorkFlg(CK_LE, fRES(workFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_FLG: {char(1)}
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
     * WORK_FLG: {char(1)}
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
     * WORK_FLG: {char(1)} <br>
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
     * WORK_FLG: {char(1)}
     * @param workFlg The value of workFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkFlg_NotLikeSearch(String workFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workFlg), xgetCValueWorkFlg(), "WORK_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {char(1)}
     * @param workFlg The value of workFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_PrefixSearch(String workFlg) {
        setWorkFlg_LikeSearch(workFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1)}
     */
    public void setWorkFlg_IsNull() { regWorkFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1)}
     */
    public void setWorkFlg_IsNotNull() { regWorkFlg(CK_ISNN, DOBJ); }

    protected void regWorkFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkFlg(), "WORK_FLG"); }
    protected abstract ConditionValue xgetCValueWorkFlg();

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
    public HpSLCFunction<EMhShippingCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EMhShippingCB.class);
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
    public HpSLCFunction<EMhShippingCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EMhShippingCB.class);
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
    public HpSLCFunction<EMhShippingCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EMhShippingCB.class);
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
    public HpSLCFunction<EMhShippingCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EMhShippingCB.class);
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
    public HpSLCFunction<EMhShippingCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EMhShippingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EMhShippingCB&gt;() {
     *     public void query(EMhShippingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EMhShippingCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EMhShippingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EMhShippingCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EMhShippingCQ sq);

    protected EMhShippingCB xcreateScalarConditionCB() {
        EMhShippingCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EMhShippingCB xcreateScalarConditionPartitionByCB() {
        EMhShippingCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EMhShippingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EMhShippingCB cb = new EMhShippingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MH_SHIPPING_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EMhShippingCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EMhShippingCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EMhShippingCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EMhShippingCB cb = new EMhShippingCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MH_SHIPPING_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EMhShippingCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EMhShippingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EMhShippingCB cb = new EMhShippingCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EMhShippingCQ sq);

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
    protected EMhShippingCB newMyCB() {
        return new EMhShippingCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EMhShippingCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
