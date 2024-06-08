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
 * The abstract condition-query of M_CRELAYBS.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCrelaybsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCrelaybsCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CRELAYBS";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param crelaybsId The value of crelaybsId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCrelaybsId_Equal(Long crelaybsId) {
        doSetCrelaybsId_Equal(crelaybsId);
    }

    protected void doSetCrelaybsId_Equal(Long crelaybsId) {
        regCrelaybsId(CK_EQ, crelaybsId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param crelaybsId The value of crelaybsId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCrelaybsId_NotEqual(Long crelaybsId) {
        doSetCrelaybsId_NotEqual(crelaybsId);
    }

    protected void doSetCrelaybsId_NotEqual(Long crelaybsId) {
        regCrelaybsId(CK_NES, crelaybsId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param crelaybsId The value of crelaybsId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCrelaybsId_GreaterThan(Long crelaybsId) {
        regCrelaybsId(CK_GT, crelaybsId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param crelaybsId The value of crelaybsId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCrelaybsId_LessThan(Long crelaybsId) {
        regCrelaybsId(CK_LT, crelaybsId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param crelaybsId The value of crelaybsId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCrelaybsId_GreaterEqual(Long crelaybsId) {
        regCrelaybsId(CK_GE, crelaybsId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param crelaybsId The value of crelaybsId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCrelaybsId_LessEqual(Long crelaybsId) {
        regCrelaybsId(CK_LE, crelaybsId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of crelaybsId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of crelaybsId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCrelaybsId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCrelaybsId(), "CRELAYBS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param crelaybsIdList The collection of crelaybsId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCrelaybsId_InScope(Collection<Long> crelaybsIdList) {
        doSetCrelaybsId_InScope(crelaybsIdList);
    }

    protected void doSetCrelaybsId_InScope(Collection<Long> crelaybsIdList) {
        regINS(CK_INS, cTL(crelaybsIdList), xgetCValueCrelaybsId(), "CRELAYBS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param crelaybsIdList The collection of crelaybsId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCrelaybsId_NotInScope(Collection<Long> crelaybsIdList) {
        doSetCrelaybsId_NotInScope(crelaybsIdList);
    }

    protected void doSetCrelaybsId_NotInScope(Collection<Long> crelaybsIdList) {
        regINS(CK_NINS, cTL(crelaybsIdList), xgetCValueCrelaybsId(), "CRELAYBS_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCrelaybsId_IsNull() { regCrelaybsId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCrelaybsId_IsNotNull() { regCrelaybsId(CK_ISNN, DOBJ); }

    protected void regCrelaybsId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCrelaybsId(), "CRELAYBS_ID"); }
    protected abstract ConditionValue xgetCValueCrelaybsId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {NotNull, varchar(30)}
     * @param rlybscd The value of rlybscd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_Equal(String rlybscd) {
        doSetRlybscd_Equal(fRES(rlybscd));
    }

    protected void doSetRlybscd_Equal(String rlybscd) {
        regRlybscd(CK_EQ, rlybscd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {NotNull, varchar(30)}
     * @param rlybscd The value of rlybscd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_NotEqual(String rlybscd) {
        doSetRlybscd_NotEqual(fRES(rlybscd));
    }

    protected void doSetRlybscd_NotEqual(String rlybscd) {
        regRlybscd(CK_NES, rlybscd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {NotNull, varchar(30)}
     * @param rlybscd The value of rlybscd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_GreaterThan(String rlybscd) {
        regRlybscd(CK_GT, fRES(rlybscd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {NotNull, varchar(30)}
     * @param rlybscd The value of rlybscd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_LessThan(String rlybscd) {
        regRlybscd(CK_LT, fRES(rlybscd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {NotNull, varchar(30)}
     * @param rlybscd The value of rlybscd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_GreaterEqual(String rlybscd) {
        regRlybscd(CK_GE, fRES(rlybscd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {NotNull, varchar(30)}
     * @param rlybscd The value of rlybscd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_LessEqual(String rlybscd) {
        regRlybscd(CK_LE, fRES(rlybscd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSCD: {NotNull, varchar(30)}
     * @param rlybscdList The collection of rlybscd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_InScope(Collection<String> rlybscdList) {
        doSetRlybscd_InScope(rlybscdList);
    }

    protected void doSetRlybscd_InScope(Collection<String> rlybscdList) {
        regINS(CK_INS, cTL(rlybscdList), xgetCValueRlybscd(), "RLYBSCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSCD: {NotNull, varchar(30)}
     * @param rlybscdList The collection of rlybscd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_NotInScope(Collection<String> rlybscdList) {
        doSetRlybscd_NotInScope(rlybscdList);
    }

    protected void doSetRlybscd_NotInScope(Collection<String> rlybscdList) {
        regINS(CK_NINS, cTL(rlybscdList), xgetCValueRlybscd(), "RLYBSCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setRlybscd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rlybscd The value of rlybscd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRlybscd_LikeSearch(String rlybscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rlybscd), xgetCValueRlybscd(), "RLYBSCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSCD: {NotNull, varchar(30)}
     * @param rlybscd The value of rlybscd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRlybscd_NotLikeSearch(String rlybscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rlybscd), xgetCValueRlybscd(), "RLYBSCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSCD: {NotNull, varchar(30)}
     * @param rlybscd The value of rlybscd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_PrefixSearch(String rlybscd) {
        setRlybscd_LikeSearch(rlybscd, xcLSOPPre());
    }

    protected void regRlybscd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRlybscd(), "RLYBSCD"); }
    protected abstract ConditionValue xgetCValueRlybscd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVDPCD: {NotNull, varchar(30)}
     * @param dlvdpcd The value of dlvdpcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvdpcd_Equal(String dlvdpcd) {
        doSetDlvdpcd_Equal(fRES(dlvdpcd));
    }

    protected void doSetDlvdpcd_Equal(String dlvdpcd) {
        regDlvdpcd(CK_EQ, dlvdpcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVDPCD: {NotNull, varchar(30)}
     * @param dlvdpcd The value of dlvdpcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvdpcd_NotEqual(String dlvdpcd) {
        doSetDlvdpcd_NotEqual(fRES(dlvdpcd));
    }

    protected void doSetDlvdpcd_NotEqual(String dlvdpcd) {
        regDlvdpcd(CK_NES, dlvdpcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVDPCD: {NotNull, varchar(30)}
     * @param dlvdpcd The value of dlvdpcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvdpcd_GreaterThan(String dlvdpcd) {
        regDlvdpcd(CK_GT, fRES(dlvdpcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVDPCD: {NotNull, varchar(30)}
     * @param dlvdpcd The value of dlvdpcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvdpcd_LessThan(String dlvdpcd) {
        regDlvdpcd(CK_LT, fRES(dlvdpcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVDPCD: {NotNull, varchar(30)}
     * @param dlvdpcd The value of dlvdpcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvdpcd_GreaterEqual(String dlvdpcd) {
        regDlvdpcd(CK_GE, fRES(dlvdpcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVDPCD: {NotNull, varchar(30)}
     * @param dlvdpcd The value of dlvdpcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvdpcd_LessEqual(String dlvdpcd) {
        regDlvdpcd(CK_LE, fRES(dlvdpcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVDPCD: {NotNull, varchar(30)}
     * @param dlvdpcdList The collection of dlvdpcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvdpcd_InScope(Collection<String> dlvdpcdList) {
        doSetDlvdpcd_InScope(dlvdpcdList);
    }

    protected void doSetDlvdpcd_InScope(Collection<String> dlvdpcdList) {
        regINS(CK_INS, cTL(dlvdpcdList), xgetCValueDlvdpcd(), "DLVDPCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVDPCD: {NotNull, varchar(30)}
     * @param dlvdpcdList The collection of dlvdpcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvdpcd_NotInScope(Collection<String> dlvdpcdList) {
        doSetDlvdpcd_NotInScope(dlvdpcdList);
    }

    protected void doSetDlvdpcd_NotInScope(Collection<String> dlvdpcdList) {
        regINS(CK_NINS, cTL(dlvdpcdList), xgetCValueDlvdpcd(), "DLVDPCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVDPCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setDlvdpcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dlvdpcd The value of dlvdpcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDlvdpcd_LikeSearch(String dlvdpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dlvdpcd), xgetCValueDlvdpcd(), "DLVDPCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVDPCD: {NotNull, varchar(30)}
     * @param dlvdpcd The value of dlvdpcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDlvdpcd_NotLikeSearch(String dlvdpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dlvdpcd), xgetCValueDlvdpcd(), "DLVDPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVDPCD: {NotNull, varchar(30)}
     * @param dlvdpcd The value of dlvdpcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvdpcd_PrefixSearch(String dlvdpcd) {
        setDlvdpcd_LikeSearch(dlvdpcd, xcLSOPPre());
    }

    protected void regDlvdpcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvdpcd(), "DLVDPCD"); }
    protected abstract ConditionValue xgetCValueDlvdpcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSNM: {NotNull, varchar(30)}
     * @param rlybsnm The value of rlybsnm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsnm_Equal(String rlybsnm) {
        doSetRlybsnm_Equal(fRES(rlybsnm));
    }

    protected void doSetRlybsnm_Equal(String rlybsnm) {
        regRlybsnm(CK_EQ, rlybsnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSNM: {NotNull, varchar(30)}
     * @param rlybsnm The value of rlybsnm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsnm_NotEqual(String rlybsnm) {
        doSetRlybsnm_NotEqual(fRES(rlybsnm));
    }

    protected void doSetRlybsnm_NotEqual(String rlybsnm) {
        regRlybsnm(CK_NES, rlybsnm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSNM: {NotNull, varchar(30)}
     * @param rlybsnm The value of rlybsnm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsnm_GreaterThan(String rlybsnm) {
        regRlybsnm(CK_GT, fRES(rlybsnm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSNM: {NotNull, varchar(30)}
     * @param rlybsnm The value of rlybsnm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsnm_LessThan(String rlybsnm) {
        regRlybsnm(CK_LT, fRES(rlybsnm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSNM: {NotNull, varchar(30)}
     * @param rlybsnm The value of rlybsnm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsnm_GreaterEqual(String rlybsnm) {
        regRlybsnm(CK_GE, fRES(rlybsnm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSNM: {NotNull, varchar(30)}
     * @param rlybsnm The value of rlybsnm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsnm_LessEqual(String rlybsnm) {
        regRlybsnm(CK_LE, fRES(rlybsnm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSNM: {NotNull, varchar(30)}
     * @param rlybsnmList The collection of rlybsnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsnm_InScope(Collection<String> rlybsnmList) {
        doSetRlybsnm_InScope(rlybsnmList);
    }

    protected void doSetRlybsnm_InScope(Collection<String> rlybsnmList) {
        regINS(CK_INS, cTL(rlybsnmList), xgetCValueRlybsnm(), "RLYBSNM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSNM: {NotNull, varchar(30)}
     * @param rlybsnmList The collection of rlybsnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsnm_NotInScope(Collection<String> rlybsnmList) {
        doSetRlybsnm_NotInScope(rlybsnmList);
    }

    protected void doSetRlybsnm_NotInScope(Collection<String> rlybsnmList) {
        regINS(CK_NINS, cTL(rlybsnmList), xgetCValueRlybsnm(), "RLYBSNM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSNM: {NotNull, varchar(30)} <br>
     * <pre>e.g. setRlybsnm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rlybsnm The value of rlybsnm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRlybsnm_LikeSearch(String rlybsnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rlybsnm), xgetCValueRlybsnm(), "RLYBSNM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSNM: {NotNull, varchar(30)}
     * @param rlybsnm The value of rlybsnm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRlybsnm_NotLikeSearch(String rlybsnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rlybsnm), xgetCValueRlybsnm(), "RLYBSNM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSNM: {NotNull, varchar(30)}
     * @param rlybsnm The value of rlybsnm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsnm_PrefixSearch(String rlybsnm) {
        setRlybsnm_LikeSearch(rlybsnm, xcLSOPPre());
    }

    protected void regRlybsnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRlybsnm(), "RLYBSNM"); }
    protected abstract ConditionValue xgetCValueRlybsnm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSSNM: {varchar(30)}
     * @param rlybssnm The value of rlybssnm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybssnm_Equal(String rlybssnm) {
        doSetRlybssnm_Equal(fRES(rlybssnm));
    }

    protected void doSetRlybssnm_Equal(String rlybssnm) {
        regRlybssnm(CK_EQ, rlybssnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSSNM: {varchar(30)}
     * @param rlybssnm The value of rlybssnm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybssnm_NotEqual(String rlybssnm) {
        doSetRlybssnm_NotEqual(fRES(rlybssnm));
    }

    protected void doSetRlybssnm_NotEqual(String rlybssnm) {
        regRlybssnm(CK_NES, rlybssnm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSSNM: {varchar(30)}
     * @param rlybssnm The value of rlybssnm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybssnm_GreaterThan(String rlybssnm) {
        regRlybssnm(CK_GT, fRES(rlybssnm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSSNM: {varchar(30)}
     * @param rlybssnm The value of rlybssnm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybssnm_LessThan(String rlybssnm) {
        regRlybssnm(CK_LT, fRES(rlybssnm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSSNM: {varchar(30)}
     * @param rlybssnm The value of rlybssnm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybssnm_GreaterEqual(String rlybssnm) {
        regRlybssnm(CK_GE, fRES(rlybssnm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSSNM: {varchar(30)}
     * @param rlybssnm The value of rlybssnm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybssnm_LessEqual(String rlybssnm) {
        regRlybssnm(CK_LE, fRES(rlybssnm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSSNM: {varchar(30)}
     * @param rlybssnmList The collection of rlybssnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybssnm_InScope(Collection<String> rlybssnmList) {
        doSetRlybssnm_InScope(rlybssnmList);
    }

    protected void doSetRlybssnm_InScope(Collection<String> rlybssnmList) {
        regINS(CK_INS, cTL(rlybssnmList), xgetCValueRlybssnm(), "RLYBSSNM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSSNM: {varchar(30)}
     * @param rlybssnmList The collection of rlybssnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybssnm_NotInScope(Collection<String> rlybssnmList) {
        doSetRlybssnm_NotInScope(rlybssnmList);
    }

    protected void doSetRlybssnm_NotInScope(Collection<String> rlybssnmList) {
        regINS(CK_NINS, cTL(rlybssnmList), xgetCValueRlybssnm(), "RLYBSSNM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSSNM: {varchar(30)} <br>
     * <pre>e.g. setRlybssnm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rlybssnm The value of rlybssnm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRlybssnm_LikeSearch(String rlybssnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rlybssnm), xgetCValueRlybssnm(), "RLYBSSNM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSSNM: {varchar(30)}
     * @param rlybssnm The value of rlybssnm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRlybssnm_NotLikeSearch(String rlybssnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rlybssnm), xgetCValueRlybssnm(), "RLYBSSNM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSSNM: {varchar(30)}
     * @param rlybssnm The value of rlybssnm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybssnm_PrefixSearch(String rlybssnm) {
        setRlybssnm_LikeSearch(rlybssnm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RLYBSSNM: {varchar(30)}
     */
    public void setRlybssnm_IsNull() { regRlybssnm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RLYBSSNM: {varchar(30)}
     */
    public void setRlybssnm_IsNullOrEmpty() { regRlybssnm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RLYBSSNM: {varchar(30)}
     */
    public void setRlybssnm_IsNotNull() { regRlybssnm(CK_ISNN, DOBJ); }

    protected void regRlybssnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRlybssnm(), "RLYBSSNM"); }
    protected abstract ConditionValue xgetCValueRlybssnm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSP: {NotNull, varchar(30)}
     * @param rlybsp The value of rlybsp as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsp_Equal(String rlybsp) {
        doSetRlybsp_Equal(fRES(rlybsp));
    }

    protected void doSetRlybsp_Equal(String rlybsp) {
        regRlybsp(CK_EQ, rlybsp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSP: {NotNull, varchar(30)}
     * @param rlybsp The value of rlybsp as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsp_NotEqual(String rlybsp) {
        doSetRlybsp_NotEqual(fRES(rlybsp));
    }

    protected void doSetRlybsp_NotEqual(String rlybsp) {
        regRlybsp(CK_NES, rlybsp);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSP: {NotNull, varchar(30)}
     * @param rlybsp The value of rlybsp as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsp_GreaterThan(String rlybsp) {
        regRlybsp(CK_GT, fRES(rlybsp));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSP: {NotNull, varchar(30)}
     * @param rlybsp The value of rlybsp as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsp_LessThan(String rlybsp) {
        regRlybsp(CK_LT, fRES(rlybsp));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSP: {NotNull, varchar(30)}
     * @param rlybsp The value of rlybsp as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsp_GreaterEqual(String rlybsp) {
        regRlybsp(CK_GE, fRES(rlybsp));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSP: {NotNull, varchar(30)}
     * @param rlybsp The value of rlybsp as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsp_LessEqual(String rlybsp) {
        regRlybsp(CK_LE, fRES(rlybsp));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSP: {NotNull, varchar(30)}
     * @param rlybspList The collection of rlybsp as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsp_InScope(Collection<String> rlybspList) {
        doSetRlybsp_InScope(rlybspList);
    }

    protected void doSetRlybsp_InScope(Collection<String> rlybspList) {
        regINS(CK_INS, cTL(rlybspList), xgetCValueRlybsp(), "RLYBSP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSP: {NotNull, varchar(30)}
     * @param rlybspList The collection of rlybsp as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsp_NotInScope(Collection<String> rlybspList) {
        doSetRlybsp_NotInScope(rlybspList);
    }

    protected void doSetRlybsp_NotInScope(Collection<String> rlybspList) {
        regINS(CK_NINS, cTL(rlybspList), xgetCValueRlybsp(), "RLYBSP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSP: {NotNull, varchar(30)} <br>
     * <pre>e.g. setRlybsp_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rlybsp The value of rlybsp as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRlybsp_LikeSearch(String rlybsp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rlybsp), xgetCValueRlybsp(), "RLYBSP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSP: {NotNull, varchar(30)}
     * @param rlybsp The value of rlybsp as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRlybsp_NotLikeSearch(String rlybsp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rlybsp), xgetCValueRlybsp(), "RLYBSP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSP: {NotNull, varchar(30)}
     * @param rlybsp The value of rlybsp as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsp_PrefixSearch(String rlybsp) {
        setRlybsp_LikeSearch(rlybsp, xcLSOPPre());
    }

    protected void regRlybsp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRlybsp(), "RLYBSP"); }
    protected abstract ConditionValue xgetCValueRlybsp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSACD: {NotNull, varchar(30)}
     * @param rlybsacd The value of rlybsacd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsacd_Equal(String rlybsacd) {
        doSetRlybsacd_Equal(fRES(rlybsacd));
    }

    protected void doSetRlybsacd_Equal(String rlybsacd) {
        regRlybsacd(CK_EQ, rlybsacd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSACD: {NotNull, varchar(30)}
     * @param rlybsacd The value of rlybsacd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsacd_NotEqual(String rlybsacd) {
        doSetRlybsacd_NotEqual(fRES(rlybsacd));
    }

    protected void doSetRlybsacd_NotEqual(String rlybsacd) {
        regRlybsacd(CK_NES, rlybsacd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSACD: {NotNull, varchar(30)}
     * @param rlybsacd The value of rlybsacd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsacd_GreaterThan(String rlybsacd) {
        regRlybsacd(CK_GT, fRES(rlybsacd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSACD: {NotNull, varchar(30)}
     * @param rlybsacd The value of rlybsacd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsacd_LessThan(String rlybsacd) {
        regRlybsacd(CK_LT, fRES(rlybsacd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSACD: {NotNull, varchar(30)}
     * @param rlybsacd The value of rlybsacd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsacd_GreaterEqual(String rlybsacd) {
        regRlybsacd(CK_GE, fRES(rlybsacd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSACD: {NotNull, varchar(30)}
     * @param rlybsacd The value of rlybsacd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsacd_LessEqual(String rlybsacd) {
        regRlybsacd(CK_LE, fRES(rlybsacd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSACD: {NotNull, varchar(30)}
     * @param rlybsacdList The collection of rlybsacd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsacd_InScope(Collection<String> rlybsacdList) {
        doSetRlybsacd_InScope(rlybsacdList);
    }

    protected void doSetRlybsacd_InScope(Collection<String> rlybsacdList) {
        regINS(CK_INS, cTL(rlybsacdList), xgetCValueRlybsacd(), "RLYBSACD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSACD: {NotNull, varchar(30)}
     * @param rlybsacdList The collection of rlybsacd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsacd_NotInScope(Collection<String> rlybsacdList) {
        doSetRlybsacd_NotInScope(rlybsacdList);
    }

    protected void doSetRlybsacd_NotInScope(Collection<String> rlybsacdList) {
        regINS(CK_NINS, cTL(rlybsacdList), xgetCValueRlybsacd(), "RLYBSACD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSACD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setRlybsacd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rlybsacd The value of rlybsacd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRlybsacd_LikeSearch(String rlybsacd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rlybsacd), xgetCValueRlybsacd(), "RLYBSACD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSACD: {NotNull, varchar(30)}
     * @param rlybsacd The value of rlybsacd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRlybsacd_NotLikeSearch(String rlybsacd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rlybsacd), xgetCValueRlybsacd(), "RLYBSACD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSACD: {NotNull, varchar(30)}
     * @param rlybsacd The value of rlybsacd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsacd_PrefixSearch(String rlybsacd) {
        setRlybsacd_LikeSearch(rlybsacd, xcLSOPPre());
    }

    protected void regRlybsacd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRlybsacd(), "RLYBSACD"); }
    protected abstract ConditionValue xgetCValueRlybsacd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCCD: {NotNull, varchar(30)}
     * @param rlybsccd The value of rlybsccd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsccd_Equal(String rlybsccd) {
        doSetRlybsccd_Equal(fRES(rlybsccd));
    }

    protected void doSetRlybsccd_Equal(String rlybsccd) {
        regRlybsccd(CK_EQ, rlybsccd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCCD: {NotNull, varchar(30)}
     * @param rlybsccd The value of rlybsccd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsccd_NotEqual(String rlybsccd) {
        doSetRlybsccd_NotEqual(fRES(rlybsccd));
    }

    protected void doSetRlybsccd_NotEqual(String rlybsccd) {
        regRlybsccd(CK_NES, rlybsccd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCCD: {NotNull, varchar(30)}
     * @param rlybsccd The value of rlybsccd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsccd_GreaterThan(String rlybsccd) {
        regRlybsccd(CK_GT, fRES(rlybsccd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCCD: {NotNull, varchar(30)}
     * @param rlybsccd The value of rlybsccd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsccd_LessThan(String rlybsccd) {
        regRlybsccd(CK_LT, fRES(rlybsccd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCCD: {NotNull, varchar(30)}
     * @param rlybsccd The value of rlybsccd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsccd_GreaterEqual(String rlybsccd) {
        regRlybsccd(CK_GE, fRES(rlybsccd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCCD: {NotNull, varchar(30)}
     * @param rlybsccd The value of rlybsccd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsccd_LessEqual(String rlybsccd) {
        regRlybsccd(CK_LE, fRES(rlybsccd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSCCD: {NotNull, varchar(30)}
     * @param rlybsccdList The collection of rlybsccd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsccd_InScope(Collection<String> rlybsccdList) {
        doSetRlybsccd_InScope(rlybsccdList);
    }

    protected void doSetRlybsccd_InScope(Collection<String> rlybsccdList) {
        regINS(CK_INS, cTL(rlybsccdList), xgetCValueRlybsccd(), "RLYBSCCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSCCD: {NotNull, varchar(30)}
     * @param rlybsccdList The collection of rlybsccd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsccd_NotInScope(Collection<String> rlybsccdList) {
        doSetRlybsccd_NotInScope(rlybsccdList);
    }

    protected void doSetRlybsccd_NotInScope(Collection<String> rlybsccdList) {
        regINS(CK_NINS, cTL(rlybsccdList), xgetCValueRlybsccd(), "RLYBSCCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSCCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setRlybsccd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rlybsccd The value of rlybsccd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRlybsccd_LikeSearch(String rlybsccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rlybsccd), xgetCValueRlybsccd(), "RLYBSCCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSCCD: {NotNull, varchar(30)}
     * @param rlybsccd The value of rlybsccd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRlybsccd_NotLikeSearch(String rlybsccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rlybsccd), xgetCValueRlybsccd(), "RLYBSCCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSCCD: {NotNull, varchar(30)}
     * @param rlybsccd The value of rlybsccd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsccd_PrefixSearch(String rlybsccd) {
        setRlybsccd_LikeSearch(rlybsccd, xcLSOPPre());
    }

    protected void regRlybsccd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRlybsccd(), "RLYBSCCD"); }
    protected abstract ConditionValue xgetCValueRlybsccd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSAR: {NotNull, varchar(60)}
     * @param rlybsar The value of rlybsar as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsar_Equal(String rlybsar) {
        doSetRlybsar_Equal(fRES(rlybsar));
    }

    protected void doSetRlybsar_Equal(String rlybsar) {
        regRlybsar(CK_EQ, rlybsar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSAR: {NotNull, varchar(60)}
     * @param rlybsar The value of rlybsar as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsar_NotEqual(String rlybsar) {
        doSetRlybsar_NotEqual(fRES(rlybsar));
    }

    protected void doSetRlybsar_NotEqual(String rlybsar) {
        regRlybsar(CK_NES, rlybsar);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSAR: {NotNull, varchar(60)}
     * @param rlybsar The value of rlybsar as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsar_GreaterThan(String rlybsar) {
        regRlybsar(CK_GT, fRES(rlybsar));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSAR: {NotNull, varchar(60)}
     * @param rlybsar The value of rlybsar as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsar_LessThan(String rlybsar) {
        regRlybsar(CK_LT, fRES(rlybsar));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSAR: {NotNull, varchar(60)}
     * @param rlybsar The value of rlybsar as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsar_GreaterEqual(String rlybsar) {
        regRlybsar(CK_GE, fRES(rlybsar));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSAR: {NotNull, varchar(60)}
     * @param rlybsar The value of rlybsar as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsar_LessEqual(String rlybsar) {
        regRlybsar(CK_LE, fRES(rlybsar));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSAR: {NotNull, varchar(60)}
     * @param rlybsarList The collection of rlybsar as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsar_InScope(Collection<String> rlybsarList) {
        doSetRlybsar_InScope(rlybsarList);
    }

    protected void doSetRlybsar_InScope(Collection<String> rlybsarList) {
        regINS(CK_INS, cTL(rlybsarList), xgetCValueRlybsar(), "RLYBSAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSAR: {NotNull, varchar(60)}
     * @param rlybsarList The collection of rlybsar as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsar_NotInScope(Collection<String> rlybsarList) {
        doSetRlybsar_NotInScope(rlybsarList);
    }

    protected void doSetRlybsar_NotInScope(Collection<String> rlybsarList) {
        regINS(CK_NINS, cTL(rlybsarList), xgetCValueRlybsar(), "RLYBSAR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSAR: {NotNull, varchar(60)} <br>
     * <pre>e.g. setRlybsar_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rlybsar The value of rlybsar as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRlybsar_LikeSearch(String rlybsar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rlybsar), xgetCValueRlybsar(), "RLYBSAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSAR: {NotNull, varchar(60)}
     * @param rlybsar The value of rlybsar as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRlybsar_NotLikeSearch(String rlybsar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rlybsar), xgetCValueRlybsar(), "RLYBSAR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSAR: {NotNull, varchar(60)}
     * @param rlybsar The value of rlybsar as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsar_PrefixSearch(String rlybsar) {
        setRlybsar_LikeSearch(rlybsar, xcLSOPPre());
    }

    protected void regRlybsar(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRlybsar(), "RLYBSAR"); }
    protected abstract ConditionValue xgetCValueRlybsar();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSTL: {varchar(30)}
     * @param rlybstl The value of rlybstl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybstl_Equal(String rlybstl) {
        doSetRlybstl_Equal(fRES(rlybstl));
    }

    protected void doSetRlybstl_Equal(String rlybstl) {
        regRlybstl(CK_EQ, rlybstl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSTL: {varchar(30)}
     * @param rlybstl The value of rlybstl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybstl_NotEqual(String rlybstl) {
        doSetRlybstl_NotEqual(fRES(rlybstl));
    }

    protected void doSetRlybstl_NotEqual(String rlybstl) {
        regRlybstl(CK_NES, rlybstl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSTL: {varchar(30)}
     * @param rlybstl The value of rlybstl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybstl_GreaterThan(String rlybstl) {
        regRlybstl(CK_GT, fRES(rlybstl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSTL: {varchar(30)}
     * @param rlybstl The value of rlybstl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybstl_LessThan(String rlybstl) {
        regRlybstl(CK_LT, fRES(rlybstl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSTL: {varchar(30)}
     * @param rlybstl The value of rlybstl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybstl_GreaterEqual(String rlybstl) {
        regRlybstl(CK_GE, fRES(rlybstl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSTL: {varchar(30)}
     * @param rlybstl The value of rlybstl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybstl_LessEqual(String rlybstl) {
        regRlybstl(CK_LE, fRES(rlybstl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSTL: {varchar(30)}
     * @param rlybstlList The collection of rlybstl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybstl_InScope(Collection<String> rlybstlList) {
        doSetRlybstl_InScope(rlybstlList);
    }

    protected void doSetRlybstl_InScope(Collection<String> rlybstlList) {
        regINS(CK_INS, cTL(rlybstlList), xgetCValueRlybstl(), "RLYBSTL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSTL: {varchar(30)}
     * @param rlybstlList The collection of rlybstl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybstl_NotInScope(Collection<String> rlybstlList) {
        doSetRlybstl_NotInScope(rlybstlList);
    }

    protected void doSetRlybstl_NotInScope(Collection<String> rlybstlList) {
        regINS(CK_NINS, cTL(rlybstlList), xgetCValueRlybstl(), "RLYBSTL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSTL: {varchar(30)} <br>
     * <pre>e.g. setRlybstl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rlybstl The value of rlybstl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRlybstl_LikeSearch(String rlybstl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rlybstl), xgetCValueRlybstl(), "RLYBSTL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSTL: {varchar(30)}
     * @param rlybstl The value of rlybstl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRlybstl_NotLikeSearch(String rlybstl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rlybstl), xgetCValueRlybstl(), "RLYBSTL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSTL: {varchar(30)}
     * @param rlybstl The value of rlybstl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybstl_PrefixSearch(String rlybstl) {
        setRlybstl_LikeSearch(rlybstl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RLYBSTL: {varchar(30)}
     */
    public void setRlybstl_IsNull() { regRlybstl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RLYBSTL: {varchar(30)}
     */
    public void setRlybstl_IsNullOrEmpty() { regRlybstl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RLYBSTL: {varchar(30)}
     */
    public void setRlybstl_IsNotNull() { regRlybstl(CK_ISNN, DOBJ); }

    protected void regRlybstl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRlybstl(), "RLYBSTL"); }
    protected abstract ConditionValue xgetCValueRlybstl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSFN: {varchar(30)}
     * @param rlybsfn The value of rlybsfn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsfn_Equal(String rlybsfn) {
        doSetRlybsfn_Equal(fRES(rlybsfn));
    }

    protected void doSetRlybsfn_Equal(String rlybsfn) {
        regRlybsfn(CK_EQ, rlybsfn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSFN: {varchar(30)}
     * @param rlybsfn The value of rlybsfn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsfn_NotEqual(String rlybsfn) {
        doSetRlybsfn_NotEqual(fRES(rlybsfn));
    }

    protected void doSetRlybsfn_NotEqual(String rlybsfn) {
        regRlybsfn(CK_NES, rlybsfn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSFN: {varchar(30)}
     * @param rlybsfn The value of rlybsfn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsfn_GreaterThan(String rlybsfn) {
        regRlybsfn(CK_GT, fRES(rlybsfn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSFN: {varchar(30)}
     * @param rlybsfn The value of rlybsfn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsfn_LessThan(String rlybsfn) {
        regRlybsfn(CK_LT, fRES(rlybsfn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSFN: {varchar(30)}
     * @param rlybsfn The value of rlybsfn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsfn_GreaterEqual(String rlybsfn) {
        regRlybsfn(CK_GE, fRES(rlybsfn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSFN: {varchar(30)}
     * @param rlybsfn The value of rlybsfn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsfn_LessEqual(String rlybsfn) {
        regRlybsfn(CK_LE, fRES(rlybsfn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSFN: {varchar(30)}
     * @param rlybsfnList The collection of rlybsfn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsfn_InScope(Collection<String> rlybsfnList) {
        doSetRlybsfn_InScope(rlybsfnList);
    }

    protected void doSetRlybsfn_InScope(Collection<String> rlybsfnList) {
        regINS(CK_INS, cTL(rlybsfnList), xgetCValueRlybsfn(), "RLYBSFN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSFN: {varchar(30)}
     * @param rlybsfnList The collection of rlybsfn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsfn_NotInScope(Collection<String> rlybsfnList) {
        doSetRlybsfn_NotInScope(rlybsfnList);
    }

    protected void doSetRlybsfn_NotInScope(Collection<String> rlybsfnList) {
        regINS(CK_NINS, cTL(rlybsfnList), xgetCValueRlybsfn(), "RLYBSFN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSFN: {varchar(30)} <br>
     * <pre>e.g. setRlybsfn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rlybsfn The value of rlybsfn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRlybsfn_LikeSearch(String rlybsfn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rlybsfn), xgetCValueRlybsfn(), "RLYBSFN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSFN: {varchar(30)}
     * @param rlybsfn The value of rlybsfn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRlybsfn_NotLikeSearch(String rlybsfn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rlybsfn), xgetCValueRlybsfn(), "RLYBSFN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSFN: {varchar(30)}
     * @param rlybsfn The value of rlybsfn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsfn_PrefixSearch(String rlybsfn) {
        setRlybsfn_LikeSearch(rlybsfn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RLYBSFN: {varchar(30)}
     */
    public void setRlybsfn_IsNull() { regRlybsfn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RLYBSFN: {varchar(30)}
     */
    public void setRlybsfn_IsNullOrEmpty() { regRlybsfn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RLYBSFN: {varchar(30)}
     */
    public void setRlybsfn_IsNotNull() { regRlybsfn(CK_ISNN, DOBJ); }

    protected void regRlybsfn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRlybsfn(), "RLYBSFN"); }
    protected abstract ConditionValue xgetCValueRlybsfn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSID: {char(1)}
     * @param rlybsid The value of rlybsid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsid_Equal(String rlybsid) {
        doSetRlybsid_Equal(fRES(rlybsid));
    }

    protected void doSetRlybsid_Equal(String rlybsid) {
        regRlybsid(CK_EQ, rlybsid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSID: {char(1)}
     * @param rlybsid The value of rlybsid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsid_NotEqual(String rlybsid) {
        doSetRlybsid_NotEqual(fRES(rlybsid));
    }

    protected void doSetRlybsid_NotEqual(String rlybsid) {
        regRlybsid(CK_NES, rlybsid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSID: {char(1)}
     * @param rlybsid The value of rlybsid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsid_GreaterThan(String rlybsid) {
        regRlybsid(CK_GT, fRES(rlybsid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSID: {char(1)}
     * @param rlybsid The value of rlybsid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsid_LessThan(String rlybsid) {
        regRlybsid(CK_LT, fRES(rlybsid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSID: {char(1)}
     * @param rlybsid The value of rlybsid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsid_GreaterEqual(String rlybsid) {
        regRlybsid(CK_GE, fRES(rlybsid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSID: {char(1)}
     * @param rlybsid The value of rlybsid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsid_LessEqual(String rlybsid) {
        regRlybsid(CK_LE, fRES(rlybsid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSID: {char(1)}
     * @param rlybsidList The collection of rlybsid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsid_InScope(Collection<String> rlybsidList) {
        doSetRlybsid_InScope(rlybsidList);
    }

    protected void doSetRlybsid_InScope(Collection<String> rlybsidList) {
        regINS(CK_INS, cTL(rlybsidList), xgetCValueRlybsid(), "RLYBSID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSID: {char(1)}
     * @param rlybsidList The collection of rlybsid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsid_NotInScope(Collection<String> rlybsidList) {
        doSetRlybsid_NotInScope(rlybsidList);
    }

    protected void doSetRlybsid_NotInScope(Collection<String> rlybsidList) {
        regINS(CK_NINS, cTL(rlybsidList), xgetCValueRlybsid(), "RLYBSID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSID: {char(1)} <br>
     * <pre>e.g. setRlybsid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rlybsid The value of rlybsid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRlybsid_LikeSearch(String rlybsid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rlybsid), xgetCValueRlybsid(), "RLYBSID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSID: {char(1)}
     * @param rlybsid The value of rlybsid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRlybsid_NotLikeSearch(String rlybsid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rlybsid), xgetCValueRlybsid(), "RLYBSID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSID: {char(1)}
     * @param rlybsid The value of rlybsid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybsid_PrefixSearch(String rlybsid) {
        setRlybsid_LikeSearch(rlybsid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RLYBSID: {char(1)}
     */
    public void setRlybsid_IsNull() { regRlybsid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RLYBSID: {char(1)}
     */
    public void setRlybsid_IsNotNull() { regRlybsid(CK_ISNN, DOBJ); }

    protected void regRlybsid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRlybsid(), "RLYBSID"); }
    protected abstract ConditionValue xgetCValueRlybsid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYSHAN: {varchar(60)}
     * @param rlyshan The value of rlyshan as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlyshan_Equal(String rlyshan) {
        doSetRlyshan_Equal(fRES(rlyshan));
    }

    protected void doSetRlyshan_Equal(String rlyshan) {
        regRlyshan(CK_EQ, rlyshan);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYSHAN: {varchar(60)}
     * @param rlyshan The value of rlyshan as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlyshan_NotEqual(String rlyshan) {
        doSetRlyshan_NotEqual(fRES(rlyshan));
    }

    protected void doSetRlyshan_NotEqual(String rlyshan) {
        regRlyshan(CK_NES, rlyshan);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYSHAN: {varchar(60)}
     * @param rlyshan The value of rlyshan as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlyshan_GreaterThan(String rlyshan) {
        regRlyshan(CK_GT, fRES(rlyshan));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYSHAN: {varchar(60)}
     * @param rlyshan The value of rlyshan as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlyshan_LessThan(String rlyshan) {
        regRlyshan(CK_LT, fRES(rlyshan));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYSHAN: {varchar(60)}
     * @param rlyshan The value of rlyshan as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlyshan_GreaterEqual(String rlyshan) {
        regRlyshan(CK_GE, fRES(rlyshan));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYSHAN: {varchar(60)}
     * @param rlyshan The value of rlyshan as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlyshan_LessEqual(String rlyshan) {
        regRlyshan(CK_LE, fRES(rlyshan));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYSHAN: {varchar(60)}
     * @param rlyshanList The collection of rlyshan as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlyshan_InScope(Collection<String> rlyshanList) {
        doSetRlyshan_InScope(rlyshanList);
    }

    protected void doSetRlyshan_InScope(Collection<String> rlyshanList) {
        regINS(CK_INS, cTL(rlyshanList), xgetCValueRlyshan(), "RLYSHAN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYSHAN: {varchar(60)}
     * @param rlyshanList The collection of rlyshan as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlyshan_NotInScope(Collection<String> rlyshanList) {
        doSetRlyshan_NotInScope(rlyshanList);
    }

    protected void doSetRlyshan_NotInScope(Collection<String> rlyshanList) {
        regINS(CK_NINS, cTL(rlyshanList), xgetCValueRlyshan(), "RLYSHAN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYSHAN: {varchar(60)} <br>
     * <pre>e.g. setRlyshan_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rlyshan The value of rlyshan as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRlyshan_LikeSearch(String rlyshan, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rlyshan), xgetCValueRlyshan(), "RLYSHAN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYSHAN: {varchar(60)}
     * @param rlyshan The value of rlyshan as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRlyshan_NotLikeSearch(String rlyshan, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rlyshan), xgetCValueRlyshan(), "RLYSHAN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYSHAN: {varchar(60)}
     * @param rlyshan The value of rlyshan as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlyshan_PrefixSearch(String rlyshan) {
        setRlyshan_LikeSearch(rlyshan, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RLYSHAN: {varchar(60)}
     */
    public void setRlyshan_IsNull() { regRlyshan(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RLYSHAN: {varchar(60)}
     */
    public void setRlyshan_IsNullOrEmpty() { regRlyshan(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RLYSHAN: {varchar(60)}
     */
    public void setRlyshan_IsNotNull() { regRlyshan(CK_ISNN, DOBJ); }

    protected void regRlyshan(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRlyshan(), "RLYSHAN"); }
    protected abstract ConditionValue xgetCValueRlyshan();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELYMD: {varchar(8)}
     * @param delymd The value of delymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelymd_Equal(String delymd) {
        doSetDelymd_Equal(fRES(delymd));
    }

    protected void doSetDelymd_Equal(String delymd) {
        regDelymd(CK_EQ, delymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELYMD: {varchar(8)}
     * @param delymd The value of delymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelymd_NotEqual(String delymd) {
        doSetDelymd_NotEqual(fRES(delymd));
    }

    protected void doSetDelymd_NotEqual(String delymd) {
        regDelymd(CK_NES, delymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELYMD: {varchar(8)}
     * @param delymd The value of delymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelymd_GreaterThan(String delymd) {
        regDelymd(CK_GT, fRES(delymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELYMD: {varchar(8)}
     * @param delymd The value of delymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelymd_LessThan(String delymd) {
        regDelymd(CK_LT, fRES(delymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELYMD: {varchar(8)}
     * @param delymd The value of delymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelymd_GreaterEqual(String delymd) {
        regDelymd(CK_GE, fRES(delymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELYMD: {varchar(8)}
     * @param delymd The value of delymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelymd_LessEqual(String delymd) {
        regDelymd(CK_LE, fRES(delymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELYMD: {varchar(8)}
     * @param delymdList The collection of delymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelymd_InScope(Collection<String> delymdList) {
        doSetDelymd_InScope(delymdList);
    }

    protected void doSetDelymd_InScope(Collection<String> delymdList) {
        regINS(CK_INS, cTL(delymdList), xgetCValueDelymd(), "DELYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELYMD: {varchar(8)}
     * @param delymdList The collection of delymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelymd_NotInScope(Collection<String> delymdList) {
        doSetDelymd_NotInScope(delymdList);
    }

    protected void doSetDelymd_NotInScope(Collection<String> delymdList) {
        regINS(CK_NINS, cTL(delymdList), xgetCValueDelymd(), "DELYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELYMD: {varchar(8)} <br>
     * <pre>e.g. setDelymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delymd The value of delymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelymd_LikeSearch(String delymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delymd), xgetCValueDelymd(), "DELYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELYMD: {varchar(8)}
     * @param delymd The value of delymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelymd_NotLikeSearch(String delymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delymd), xgetCValueDelymd(), "DELYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELYMD: {varchar(8)}
     * @param delymd The value of delymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelymd_PrefixSearch(String delymd) {
        setDelymd_LikeSearch(delymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELYMD: {varchar(8)}
     */
    public void setDelymd_IsNull() { regDelymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELYMD: {varchar(8)}
     */
    public void setDelymd_IsNullOrEmpty() { regDelymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELYMD: {varchar(8)}
     */
    public void setDelymd_IsNotNull() { regDelymd(CK_ISNN, DOBJ); }

    protected void regDelymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelymd(), "DELYMD"); }
    protected abstract ConditionValue xgetCValueDelymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHNGYD: {NotNull, varchar(8)}
     * @param chngyd The value of chngyd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_Equal(String chngyd) {
        doSetChngyd_Equal(fRES(chngyd));
    }

    protected void doSetChngyd_Equal(String chngyd) {
        regChngyd(CK_EQ, chngyd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHNGYD: {NotNull, varchar(8)}
     * @param chngyd The value of chngyd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_NotEqual(String chngyd) {
        doSetChngyd_NotEqual(fRES(chngyd));
    }

    protected void doSetChngyd_NotEqual(String chngyd) {
        regChngyd(CK_NES, chngyd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHNGYD: {NotNull, varchar(8)}
     * @param chngyd The value of chngyd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_GreaterThan(String chngyd) {
        regChngyd(CK_GT, fRES(chngyd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHNGYD: {NotNull, varchar(8)}
     * @param chngyd The value of chngyd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_LessThan(String chngyd) {
        regChngyd(CK_LT, fRES(chngyd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHNGYD: {NotNull, varchar(8)}
     * @param chngyd The value of chngyd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_GreaterEqual(String chngyd) {
        regChngyd(CK_GE, fRES(chngyd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHNGYD: {NotNull, varchar(8)}
     * @param chngyd The value of chngyd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_LessEqual(String chngyd) {
        regChngyd(CK_LE, fRES(chngyd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHNGYD: {NotNull, varchar(8)}
     * @param chngydList The collection of chngyd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_InScope(Collection<String> chngydList) {
        doSetChngyd_InScope(chngydList);
    }

    protected void doSetChngyd_InScope(Collection<String> chngydList) {
        regINS(CK_INS, cTL(chngydList), xgetCValueChngyd(), "CHNGYD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHNGYD: {NotNull, varchar(8)}
     * @param chngydList The collection of chngyd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_NotInScope(Collection<String> chngydList) {
        doSetChngyd_NotInScope(chngydList);
    }

    protected void doSetChngyd_NotInScope(Collection<String> chngydList) {
        regINS(CK_NINS, cTL(chngydList), xgetCValueChngyd(), "CHNGYD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHNGYD: {NotNull, varchar(8)} <br>
     * <pre>e.g. setChngyd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param chngyd The value of chngyd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setChngyd_LikeSearch(String chngyd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(chngyd), xgetCValueChngyd(), "CHNGYD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHNGYD: {NotNull, varchar(8)}
     * @param chngyd The value of chngyd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setChngyd_NotLikeSearch(String chngyd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(chngyd), xgetCValueChngyd(), "CHNGYD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHNGYD: {NotNull, varchar(8)}
     * @param chngyd The value of chngyd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_PrefixSearch(String chngyd) {
        setChngyd_LikeSearch(chngyd, xcLSOPPre());
    }

    protected void regChngyd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChngyd(), "CHNGYD"); }
    protected abstract ConditionValue xgetCValueChngyd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDTM: {varchar(30)}
     * @param updtm The value of updtm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_Equal(String updtm) {
        doSetUpdtm_Equal(fRES(updtm));
    }

    protected void doSetUpdtm_Equal(String updtm) {
        regUpdtm(CK_EQ, updtm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDTM: {varchar(30)}
     * @param updtm The value of updtm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_NotEqual(String updtm) {
        doSetUpdtm_NotEqual(fRES(updtm));
    }

    protected void doSetUpdtm_NotEqual(String updtm) {
        regUpdtm(CK_NES, updtm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDTM: {varchar(30)}
     * @param updtm The value of updtm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_GreaterThan(String updtm) {
        regUpdtm(CK_GT, fRES(updtm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDTM: {varchar(30)}
     * @param updtm The value of updtm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_LessThan(String updtm) {
        regUpdtm(CK_LT, fRES(updtm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDTM: {varchar(30)}
     * @param updtm The value of updtm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_GreaterEqual(String updtm) {
        regUpdtm(CK_GE, fRES(updtm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDTM: {varchar(30)}
     * @param updtm The value of updtm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_LessEqual(String updtm) {
        regUpdtm(CK_LE, fRES(updtm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDTM: {varchar(30)}
     * @param updtmList The collection of updtm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_InScope(Collection<String> updtmList) {
        doSetUpdtm_InScope(updtmList);
    }

    protected void doSetUpdtm_InScope(Collection<String> updtmList) {
        regINS(CK_INS, cTL(updtmList), xgetCValueUpdtm(), "UPDTM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDTM: {varchar(30)}
     * @param updtmList The collection of updtm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_NotInScope(Collection<String> updtmList) {
        doSetUpdtm_NotInScope(updtmList);
    }

    protected void doSetUpdtm_NotInScope(Collection<String> updtmList) {
        regINS(CK_NINS, cTL(updtmList), xgetCValueUpdtm(), "UPDTM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDTM: {varchar(30)} <br>
     * <pre>e.g. setUpdtm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updtm The value of updtm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdtm_LikeSearch(String updtm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updtm), xgetCValueUpdtm(), "UPDTM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDTM: {varchar(30)}
     * @param updtm The value of updtm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdtm_NotLikeSearch(String updtm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updtm), xgetCValueUpdtm(), "UPDTM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDTM: {varchar(30)}
     * @param updtm The value of updtm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_PrefixSearch(String updtm) {
        setUpdtm_LikeSearch(updtm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPDTM: {varchar(30)}
     */
    public void setUpdtm_IsNull() { regUpdtm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPDTM: {varchar(30)}
     */
    public void setUpdtm_IsNullOrEmpty() { regUpdtm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPDTM: {varchar(30)}
     */
    public void setUpdtm_IsNotNull() { regUpdtm(CK_ISNN, DOBJ); }

    protected void regUpdtm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdtm(), "UPDTM"); }
    protected abstract ConditionValue xgetCValueUpdtm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_Equal(String zzfrdateh) {
        doSetZzfrdateh_Equal(fRES(zzfrdateh));
    }

    protected void doSetZzfrdateh_Equal(String zzfrdateh) {
        regZzfrdateh(CK_EQ, zzfrdateh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_NotEqual(String zzfrdateh) {
        doSetZzfrdateh_NotEqual(fRES(zzfrdateh));
    }

    protected void doSetZzfrdateh_NotEqual(String zzfrdateh) {
        regZzfrdateh(CK_NES, zzfrdateh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_GreaterThan(String zzfrdateh) {
        regZzfrdateh(CK_GT, fRES(zzfrdateh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_LessThan(String zzfrdateh) {
        regZzfrdateh(CK_LT, fRES(zzfrdateh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_GreaterEqual(String zzfrdateh) {
        regZzfrdateh(CK_GE, fRES(zzfrdateh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_LessEqual(String zzfrdateh) {
        regZzfrdateh(CK_LE, fRES(zzfrdateh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdatehList The collection of zzfrdateh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_InScope(Collection<String> zzfrdatehList) {
        doSetZzfrdateh_InScope(zzfrdatehList);
    }

    protected void doSetZzfrdateh_InScope(Collection<String> zzfrdatehList) {
        regINS(CK_INS, cTL(zzfrdatehList), xgetCValueZzfrdateh(), "ZZFRDATEH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdatehList The collection of zzfrdateh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_NotInScope(Collection<String> zzfrdatehList) {
        doSetZzfrdateh_NotInScope(zzfrdatehList);
    }

    protected void doSetZzfrdateh_NotInScope(Collection<String> zzfrdatehList) {
        regINS(CK_NINS, cTL(zzfrdatehList), xgetCValueZzfrdateh(), "ZZFRDATEH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)} <br>
     * <pre>e.g. setZzfrdateh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzfrdateh The value of zzfrdateh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzfrdateh_LikeSearch(String zzfrdateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzfrdateh), xgetCValueZzfrdateh(), "ZZFRDATEH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzfrdateh_NotLikeSearch(String zzfrdateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzfrdateh), xgetCValueZzfrdateh(), "ZZFRDATEH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_PrefixSearch(String zzfrdateh) {
        setZzfrdateh_LikeSearch(zzfrdateh, xcLSOPPre());
    }

    protected void regZzfrdateh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzfrdateh(), "ZZFRDATEH"); }
    protected abstract ConditionValue xgetCValueZzfrdateh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {NotNull, varchar(8)}
     * @param zztodateh The value of zztodateh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_Equal(String zztodateh) {
        doSetZztodateh_Equal(fRES(zztodateh));
    }

    protected void doSetZztodateh_Equal(String zztodateh) {
        regZztodateh(CK_EQ, zztodateh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {NotNull, varchar(8)}
     * @param zztodateh The value of zztodateh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_NotEqual(String zztodateh) {
        doSetZztodateh_NotEqual(fRES(zztodateh));
    }

    protected void doSetZztodateh_NotEqual(String zztodateh) {
        regZztodateh(CK_NES, zztodateh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {NotNull, varchar(8)}
     * @param zztodateh The value of zztodateh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_GreaterThan(String zztodateh) {
        regZztodateh(CK_GT, fRES(zztodateh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {NotNull, varchar(8)}
     * @param zztodateh The value of zztodateh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_LessThan(String zztodateh) {
        regZztodateh(CK_LT, fRES(zztodateh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {NotNull, varchar(8)}
     * @param zztodateh The value of zztodateh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_GreaterEqual(String zztodateh) {
        regZztodateh(CK_GE, fRES(zztodateh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {NotNull, varchar(8)}
     * @param zztodateh The value of zztodateh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_LessEqual(String zztodateh) {
        regZztodateh(CK_LE, fRES(zztodateh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZTODATEH: {NotNull, varchar(8)}
     * @param zztodatehList The collection of zztodateh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_InScope(Collection<String> zztodatehList) {
        doSetZztodateh_InScope(zztodatehList);
    }

    protected void doSetZztodateh_InScope(Collection<String> zztodatehList) {
        regINS(CK_INS, cTL(zztodatehList), xgetCValueZztodateh(), "ZZTODATEH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZTODATEH: {NotNull, varchar(8)}
     * @param zztodatehList The collection of zztodateh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_NotInScope(Collection<String> zztodatehList) {
        doSetZztodateh_NotInScope(zztodatehList);
    }

    protected void doSetZztodateh_NotInScope(Collection<String> zztodatehList) {
        regINS(CK_NINS, cTL(zztodatehList), xgetCValueZztodateh(), "ZZTODATEH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZTODATEH: {NotNull, varchar(8)} <br>
     * <pre>e.g. setZztodateh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zztodateh The value of zztodateh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZztodateh_LikeSearch(String zztodateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zztodateh), xgetCValueZztodateh(), "ZZTODATEH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZTODATEH: {NotNull, varchar(8)}
     * @param zztodateh The value of zztodateh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZztodateh_NotLikeSearch(String zztodateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zztodateh), xgetCValueZztodateh(), "ZZTODATEH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZTODATEH: {NotNull, varchar(8)}
     * @param zztodateh The value of zztodateh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_PrefixSearch(String zztodateh) {
        setZztodateh_LikeSearch(zztodateh, xcLSOPPre());
    }

    protected void regZztodateh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZztodateh(), "ZZTODATEH"); }
    protected abstract ConditionValue xgetCValueZztodateh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDUPDPS: {NotNull, varchar(30)}
     * @param rcdupdps The value of rcdupdps as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_Equal(String rcdupdps) {
        doSetRcdupdps_Equal(fRES(rcdupdps));
    }

    protected void doSetRcdupdps_Equal(String rcdupdps) {
        regRcdupdps(CK_EQ, rcdupdps);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDUPDPS: {NotNull, varchar(30)}
     * @param rcdupdps The value of rcdupdps as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_NotEqual(String rcdupdps) {
        doSetRcdupdps_NotEqual(fRES(rcdupdps));
    }

    protected void doSetRcdupdps_NotEqual(String rcdupdps) {
        regRcdupdps(CK_NES, rcdupdps);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDUPDPS: {NotNull, varchar(30)}
     * @param rcdupdps The value of rcdupdps as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_GreaterThan(String rcdupdps) {
        regRcdupdps(CK_GT, fRES(rcdupdps));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDUPDPS: {NotNull, varchar(30)}
     * @param rcdupdps The value of rcdupdps as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_LessThan(String rcdupdps) {
        regRcdupdps(CK_LT, fRES(rcdupdps));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDUPDPS: {NotNull, varchar(30)}
     * @param rcdupdps The value of rcdupdps as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_GreaterEqual(String rcdupdps) {
        regRcdupdps(CK_GE, fRES(rcdupdps));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDUPDPS: {NotNull, varchar(30)}
     * @param rcdupdps The value of rcdupdps as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_LessEqual(String rcdupdps) {
        regRcdupdps(CK_LE, fRES(rcdupdps));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCDUPDPS: {NotNull, varchar(30)}
     * @param rcdupdpsList The collection of rcdupdps as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_InScope(Collection<String> rcdupdpsList) {
        doSetRcdupdps_InScope(rcdupdpsList);
    }

    protected void doSetRcdupdps_InScope(Collection<String> rcdupdpsList) {
        regINS(CK_INS, cTL(rcdupdpsList), xgetCValueRcdupdps(), "RCDUPDPS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCDUPDPS: {NotNull, varchar(30)}
     * @param rcdupdpsList The collection of rcdupdps as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_NotInScope(Collection<String> rcdupdpsList) {
        doSetRcdupdps_NotInScope(rcdupdpsList);
    }

    protected void doSetRcdupdps_NotInScope(Collection<String> rcdupdpsList) {
        regINS(CK_NINS, cTL(rcdupdpsList), xgetCValueRcdupdps(), "RCDUPDPS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCDUPDPS: {NotNull, varchar(30)} <br>
     * <pre>e.g. setRcdupdps_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcdupdps The value of rcdupdps as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcdupdps_LikeSearch(String rcdupdps, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcdupdps), xgetCValueRcdupdps(), "RCDUPDPS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCDUPDPS: {NotNull, varchar(30)}
     * @param rcdupdps The value of rcdupdps as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcdupdps_NotLikeSearch(String rcdupdps, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcdupdps), xgetCValueRcdupdps(), "RCDUPDPS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCDUPDPS: {NotNull, varchar(30)}
     * @param rcdupdps The value of rcdupdps as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_PrefixSearch(String rcdupdps) {
        setRcdupdps_LikeSearch(rcdupdps, xcLSOPPre());
    }

    protected void regRcdupdps(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcdupdps(), "RCDUPDPS"); }
    protected abstract ConditionValue xgetCValueRcdupdps();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(30)}
     * @param updpocd The value of updpocd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_Equal(String updpocd) {
        doSetUpdpocd_Equal(fRES(updpocd));
    }

    protected void doSetUpdpocd_Equal(String updpocd) {
        regUpdpocd(CK_EQ, updpocd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(30)}
     * @param updpocd The value of updpocd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_NotEqual(String updpocd) {
        doSetUpdpocd_NotEqual(fRES(updpocd));
    }

    protected void doSetUpdpocd_NotEqual(String updpocd) {
        regUpdpocd(CK_NES, updpocd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(30)}
     * @param updpocd The value of updpocd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_GreaterThan(String updpocd) {
        regUpdpocd(CK_GT, fRES(updpocd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(30)}
     * @param updpocd The value of updpocd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_LessThan(String updpocd) {
        regUpdpocd(CK_LT, fRES(updpocd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(30)}
     * @param updpocd The value of updpocd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_GreaterEqual(String updpocd) {
        regUpdpocd(CK_GE, fRES(updpocd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(30)}
     * @param updpocd The value of updpocd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_LessEqual(String updpocd) {
        regUpdpocd(CK_LE, fRES(updpocd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDPOCD: {varchar(30)}
     * @param updpocdList The collection of updpocd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_InScope(Collection<String> updpocdList) {
        doSetUpdpocd_InScope(updpocdList);
    }

    protected void doSetUpdpocd_InScope(Collection<String> updpocdList) {
        regINS(CK_INS, cTL(updpocdList), xgetCValueUpdpocd(), "UPDPOCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDPOCD: {varchar(30)}
     * @param updpocdList The collection of updpocd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_NotInScope(Collection<String> updpocdList) {
        doSetUpdpocd_NotInScope(updpocdList);
    }

    protected void doSetUpdpocd_NotInScope(Collection<String> updpocdList) {
        regINS(CK_NINS, cTL(updpocdList), xgetCValueUpdpocd(), "UPDPOCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDPOCD: {varchar(30)} <br>
     * <pre>e.g. setUpdpocd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updpocd The value of updpocd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdpocd_LikeSearch(String updpocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updpocd), xgetCValueUpdpocd(), "UPDPOCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDPOCD: {varchar(30)}
     * @param updpocd The value of updpocd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdpocd_NotLikeSearch(String updpocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updpocd), xgetCValueUpdpocd(), "UPDPOCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDPOCD: {varchar(30)}
     * @param updpocd The value of updpocd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_PrefixSearch(String updpocd) {
        setUpdpocd_LikeSearch(updpocd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(30)}
     */
    public void setUpdpocd_IsNull() { regUpdpocd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(30)}
     */
    public void setUpdpocd_IsNullOrEmpty() { regUpdpocd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(30)}
     */
    public void setUpdpocd_IsNotNull() { regUpdpocd(CK_ISNN, DOBJ); }

    protected void regUpdpocd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdpocd(), "UPDPOCD"); }
    protected abstract ConditionValue xgetCValueUpdpocd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {char(1)}
     * @param otcmpfg The value of otcmpfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_Equal(String otcmpfg) {
        doSetOtcmpfg_Equal(fRES(otcmpfg));
    }

    protected void doSetOtcmpfg_Equal(String otcmpfg) {
        regOtcmpfg(CK_EQ, otcmpfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {char(1)}
     * @param otcmpfg The value of otcmpfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_NotEqual(String otcmpfg) {
        doSetOtcmpfg_NotEqual(fRES(otcmpfg));
    }

    protected void doSetOtcmpfg_NotEqual(String otcmpfg) {
        regOtcmpfg(CK_NES, otcmpfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {char(1)}
     * @param otcmpfg The value of otcmpfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_GreaterThan(String otcmpfg) {
        regOtcmpfg(CK_GT, fRES(otcmpfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {char(1)}
     * @param otcmpfg The value of otcmpfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_LessThan(String otcmpfg) {
        regOtcmpfg(CK_LT, fRES(otcmpfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {char(1)}
     * @param otcmpfg The value of otcmpfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_GreaterEqual(String otcmpfg) {
        regOtcmpfg(CK_GE, fRES(otcmpfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {char(1)}
     * @param otcmpfg The value of otcmpfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_LessEqual(String otcmpfg) {
        regOtcmpfg(CK_LE, fRES(otcmpfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTCMPFG: {char(1)}
     * @param otcmpfgList The collection of otcmpfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_InScope(Collection<String> otcmpfgList) {
        doSetOtcmpfg_InScope(otcmpfgList);
    }

    protected void doSetOtcmpfg_InScope(Collection<String> otcmpfgList) {
        regINS(CK_INS, cTL(otcmpfgList), xgetCValueOtcmpfg(), "OTCMPFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTCMPFG: {char(1)}
     * @param otcmpfgList The collection of otcmpfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_NotInScope(Collection<String> otcmpfgList) {
        doSetOtcmpfg_NotInScope(otcmpfgList);
    }

    protected void doSetOtcmpfg_NotInScope(Collection<String> otcmpfgList) {
        regINS(CK_NINS, cTL(otcmpfgList), xgetCValueOtcmpfg(), "OTCMPFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTCMPFG: {char(1)} <br>
     * <pre>e.g. setOtcmpfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otcmpfg The value of otcmpfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtcmpfg_LikeSearch(String otcmpfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otcmpfg), xgetCValueOtcmpfg(), "OTCMPFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTCMPFG: {char(1)}
     * @param otcmpfg The value of otcmpfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtcmpfg_NotLikeSearch(String otcmpfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otcmpfg), xgetCValueOtcmpfg(), "OTCMPFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTCMPFG: {char(1)}
     * @param otcmpfg The value of otcmpfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_PrefixSearch(String otcmpfg) {
        setOtcmpfg_LikeSearch(otcmpfg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTCMPFG: {char(1)}
     */
    public void setOtcmpfg_IsNull() { regOtcmpfg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTCMPFG: {char(1)}
     */
    public void setOtcmpfg_IsNotNull() { regOtcmpfg(CK_ISNN, DOBJ); }

    protected void regOtcmpfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtcmpfg(), "OTCMPFG"); }
    protected abstract ConditionValue xgetCValueOtcmpfg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {char(1)}
     * @param tmcmpfg The value of tmcmpfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_Equal(String tmcmpfg) {
        doSetTmcmpfg_Equal(fRES(tmcmpfg));
    }

    protected void doSetTmcmpfg_Equal(String tmcmpfg) {
        regTmcmpfg(CK_EQ, tmcmpfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {char(1)}
     * @param tmcmpfg The value of tmcmpfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_NotEqual(String tmcmpfg) {
        doSetTmcmpfg_NotEqual(fRES(tmcmpfg));
    }

    protected void doSetTmcmpfg_NotEqual(String tmcmpfg) {
        regTmcmpfg(CK_NES, tmcmpfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {char(1)}
     * @param tmcmpfg The value of tmcmpfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_GreaterThan(String tmcmpfg) {
        regTmcmpfg(CK_GT, fRES(tmcmpfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {char(1)}
     * @param tmcmpfg The value of tmcmpfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_LessThan(String tmcmpfg) {
        regTmcmpfg(CK_LT, fRES(tmcmpfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {char(1)}
     * @param tmcmpfg The value of tmcmpfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_GreaterEqual(String tmcmpfg) {
        regTmcmpfg(CK_GE, fRES(tmcmpfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {char(1)}
     * @param tmcmpfg The value of tmcmpfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_LessEqual(String tmcmpfg) {
        regTmcmpfg(CK_LE, fRES(tmcmpfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TMCMPFG: {char(1)}
     * @param tmcmpfgList The collection of tmcmpfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_InScope(Collection<String> tmcmpfgList) {
        doSetTmcmpfg_InScope(tmcmpfgList);
    }

    protected void doSetTmcmpfg_InScope(Collection<String> tmcmpfgList) {
        regINS(CK_INS, cTL(tmcmpfgList), xgetCValueTmcmpfg(), "TMCMPFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TMCMPFG: {char(1)}
     * @param tmcmpfgList The collection of tmcmpfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_NotInScope(Collection<String> tmcmpfgList) {
        doSetTmcmpfg_NotInScope(tmcmpfgList);
    }

    protected void doSetTmcmpfg_NotInScope(Collection<String> tmcmpfgList) {
        regINS(CK_NINS, cTL(tmcmpfgList), xgetCValueTmcmpfg(), "TMCMPFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TMCMPFG: {char(1)} <br>
     * <pre>e.g. setTmcmpfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tmcmpfg The value of tmcmpfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTmcmpfg_LikeSearch(String tmcmpfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tmcmpfg), xgetCValueTmcmpfg(), "TMCMPFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TMCMPFG: {char(1)}
     * @param tmcmpfg The value of tmcmpfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTmcmpfg_NotLikeSearch(String tmcmpfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tmcmpfg), xgetCValueTmcmpfg(), "TMCMPFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TMCMPFG: {char(1)}
     * @param tmcmpfg The value of tmcmpfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_PrefixSearch(String tmcmpfg) {
        setTmcmpfg_LikeSearch(tmcmpfg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TMCMPFG: {char(1)}
     */
    public void setTmcmpfg_IsNull() { regTmcmpfg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TMCMPFG: {char(1)}
     */
    public void setTmcmpfg_IsNotNull() { regTmcmpfg(CK_ISNN, DOBJ); }

    protected void regTmcmpfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTmcmpfg(), "TMCMPFG"); }
    protected abstract ConditionValue xgetCValueTmcmpfg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STMID: {varchar(30)}
     * @param stmid The value of stmid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_Equal(String stmid) {
        doSetStmid_Equal(fRES(stmid));
    }

    protected void doSetStmid_Equal(String stmid) {
        regStmid(CK_EQ, stmid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STMID: {varchar(30)}
     * @param stmid The value of stmid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_NotEqual(String stmid) {
        doSetStmid_NotEqual(fRES(stmid));
    }

    protected void doSetStmid_NotEqual(String stmid) {
        regStmid(CK_NES, stmid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STMID: {varchar(30)}
     * @param stmid The value of stmid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_GreaterThan(String stmid) {
        regStmid(CK_GT, fRES(stmid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STMID: {varchar(30)}
     * @param stmid The value of stmid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_LessThan(String stmid) {
        regStmid(CK_LT, fRES(stmid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STMID: {varchar(30)}
     * @param stmid The value of stmid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_GreaterEqual(String stmid) {
        regStmid(CK_GE, fRES(stmid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STMID: {varchar(30)}
     * @param stmid The value of stmid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_LessEqual(String stmid) {
        regStmid(CK_LE, fRES(stmid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STMID: {varchar(30)}
     * @param stmidList The collection of stmid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_InScope(Collection<String> stmidList) {
        doSetStmid_InScope(stmidList);
    }

    protected void doSetStmid_InScope(Collection<String> stmidList) {
        regINS(CK_INS, cTL(stmidList), xgetCValueStmid(), "STMID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STMID: {varchar(30)}
     * @param stmidList The collection of stmid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_NotInScope(Collection<String> stmidList) {
        doSetStmid_NotInScope(stmidList);
    }

    protected void doSetStmid_NotInScope(Collection<String> stmidList) {
        regINS(CK_NINS, cTL(stmidList), xgetCValueStmid(), "STMID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STMID: {varchar(30)} <br>
     * <pre>e.g. setStmid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stmid The value of stmid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStmid_LikeSearch(String stmid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stmid), xgetCValueStmid(), "STMID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STMID: {varchar(30)}
     * @param stmid The value of stmid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStmid_NotLikeSearch(String stmid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stmid), xgetCValueStmid(), "STMID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STMID: {varchar(30)}
     * @param stmid The value of stmid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_PrefixSearch(String stmid) {
        setStmid_LikeSearch(stmid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STMID: {varchar(30)}
     */
    public void setStmid_IsNull() { regStmid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STMID: {varchar(30)}
     */
    public void setStmid_IsNullOrEmpty() { regStmid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STMID: {varchar(30)}
     */
    public void setStmid_IsNotNull() { regStmid(CK_ISNN, DOBJ); }

    protected void regStmid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStmid(), "STMID"); }
    protected abstract ConditionValue xgetCValueStmid();

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
    public HpSLCFunction<MCrelaybsCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCrelaybsCB.class);
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
    public HpSLCFunction<MCrelaybsCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCrelaybsCB.class);
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
    public HpSLCFunction<MCrelaybsCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCrelaybsCB.class);
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
    public HpSLCFunction<MCrelaybsCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCrelaybsCB.class);
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
    public HpSLCFunction<MCrelaybsCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCrelaybsCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCrelaybsCB&gt;() {
     *     public void query(MCrelaybsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCrelaybsCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCrelaybsCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCrelaybsCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCrelaybsCQ sq);

    protected MCrelaybsCB xcreateScalarConditionCB() {
        MCrelaybsCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCrelaybsCB xcreateScalarConditionPartitionByCB() {
        MCrelaybsCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCrelaybsCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCrelaybsCB cb = new MCrelaybsCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CRELAYBS_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCrelaybsCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCrelaybsCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCrelaybsCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCrelaybsCB cb = new MCrelaybsCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CRELAYBS_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCrelaybsCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCrelaybsCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCrelaybsCB cb = new MCrelaybsCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCrelaybsCQ sq);

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
    protected MCrelaybsCB newMyCB() {
        return new MCrelaybsCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCrelaybsCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
