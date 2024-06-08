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
 * The abstract condition-query of E_TSN_MFCOMPANY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsETsnMfcompanyCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsETsnMfcompanyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_TSN_MFCOMPANY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnMfcompanyId The value of tsnMfcompanyId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnMfcompanyId_Equal(Long tsnMfcompanyId) {
        doSetTsnMfcompanyId_Equal(tsnMfcompanyId);
    }

    protected void doSetTsnMfcompanyId_Equal(Long tsnMfcompanyId) {
        regTsnMfcompanyId(CK_EQ, tsnMfcompanyId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnMfcompanyId The value of tsnMfcompanyId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnMfcompanyId_NotEqual(Long tsnMfcompanyId) {
        doSetTsnMfcompanyId_NotEqual(tsnMfcompanyId);
    }

    protected void doSetTsnMfcompanyId_NotEqual(Long tsnMfcompanyId) {
        regTsnMfcompanyId(CK_NES, tsnMfcompanyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnMfcompanyId The value of tsnMfcompanyId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnMfcompanyId_GreaterThan(Long tsnMfcompanyId) {
        regTsnMfcompanyId(CK_GT, tsnMfcompanyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnMfcompanyId The value of tsnMfcompanyId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnMfcompanyId_LessThan(Long tsnMfcompanyId) {
        regTsnMfcompanyId(CK_LT, tsnMfcompanyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnMfcompanyId The value of tsnMfcompanyId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnMfcompanyId_GreaterEqual(Long tsnMfcompanyId) {
        regTsnMfcompanyId(CK_GE, tsnMfcompanyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnMfcompanyId The value of tsnMfcompanyId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnMfcompanyId_LessEqual(Long tsnMfcompanyId) {
        regTsnMfcompanyId(CK_LE, tsnMfcompanyId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of tsnMfcompanyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tsnMfcompanyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTsnMfcompanyId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTsnMfcompanyId(), "TSN_MFCOMPANY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnMfcompanyIdList The collection of tsnMfcompanyId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnMfcompanyId_InScope(Collection<Long> tsnMfcompanyIdList) {
        doSetTsnMfcompanyId_InScope(tsnMfcompanyIdList);
    }

    protected void doSetTsnMfcompanyId_InScope(Collection<Long> tsnMfcompanyIdList) {
        regINS(CK_INS, cTL(tsnMfcompanyIdList), xgetCValueTsnMfcompanyId(), "TSN_MFCOMPANY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnMfcompanyIdList The collection of tsnMfcompanyId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnMfcompanyId_NotInScope(Collection<Long> tsnMfcompanyIdList) {
        doSetTsnMfcompanyId_NotInScope(tsnMfcompanyIdList);
    }

    protected void doSetTsnMfcompanyId_NotInScope(Collection<Long> tsnMfcompanyIdList) {
        regINS(CK_NINS, cTL(tsnMfcompanyIdList), xgetCValueTsnMfcompanyId(), "TSN_MFCOMPANY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTsnMfcompanyId_IsNull() { regTsnMfcompanyId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTsnMfcompanyId_IsNotNull() { regTsnMfcompanyId(CK_ISNN, DOBJ); }

    protected void regTsnMfcompanyId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTsnMfcompanyId(), "TSN_MFCOMPANY_ID"); }
    protected abstract ConditionValue xgetCValueTsnMfcompanyId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @param importFlg The value of importFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_Equal(String importFlg) {
        doSetImportFlg_Equal(fRES(importFlg));
    }

    protected void doSetImportFlg_Equal(String importFlg) {
        regImportFlg(CK_EQ, importFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @param importFlg The value of importFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotEqual(String importFlg) {
        doSetImportFlg_NotEqual(fRES(importFlg));
    }

    protected void doSetImportFlg_NotEqual(String importFlg) {
        regImportFlg(CK_NES, importFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @param importFlg The value of importFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterThan(String importFlg) {
        regImportFlg(CK_GT, fRES(importFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @param importFlg The value of importFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessThan(String importFlg) {
        regImportFlg(CK_LT, fRES(importFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @param importFlg The value of importFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterEqual(String importFlg) {
        regImportFlg(CK_GE, fRES(importFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @param importFlg The value of importFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessEqual(String importFlg) {
        regImportFlg(CK_LE, fRES(importFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @param importFlgList The collection of importFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_InScope(Collection<String> importFlgList) {
        doSetImportFlg_InScope(importFlgList);
    }

    protected void doSetImportFlg_InScope(Collection<String> importFlgList) {
        regINS(CK_INS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @param importFlgList The collection of importFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotInScope(Collection<String> importFlgList) {
        doSetImportFlg_NotInScope(importFlgList);
    }

    protected void doSetImportFlg_NotInScope(Collection<String> importFlgList) {
        regINS(CK_NINS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setImportFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param importFlg The value of importFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImportFlg_LikeSearch(String importFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(importFlg), xgetCValueImportFlg(), "IMPORT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @param importFlg The value of importFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImportFlg_NotLikeSearch(String importFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(importFlg), xgetCValueImportFlg(), "IMPORT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @param importFlg The value of importFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_PrefixSearch(String importFlg) {
        setImportFlg_LikeSearch(importFlg, xcLSOPPre());
    }

    protected void regImportFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportFlg(), "IMPORT_FLG"); }
    protected abstract ConditionValue xgetCValueImportFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(30)}
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
     * ZZORGNCD: {varchar(30)}
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
     * ZZORGNCD: {varchar(30)}
     * @param zzorgncd The value of zzorgncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_GreaterThan(String zzorgncd) {
        regZzorgncd(CK_GT, fRES(zzorgncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     * @param zzorgncd The value of zzorgncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_LessThan(String zzorgncd) {
        regZzorgncd(CK_LT, fRES(zzorgncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     * @param zzorgncd The value of zzorgncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_GreaterEqual(String zzorgncd) {
        regZzorgncd(CK_GE, fRES(zzorgncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     * @param zzorgncd The value of zzorgncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_LessEqual(String zzorgncd) {
        regZzorgncd(CK_LE, fRES(zzorgncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {varchar(30)}
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
     * ZZORGNCD: {varchar(30)}
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
     * ZZORGNCD: {varchar(30)} <br>
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
     * ZZORGNCD: {varchar(30)}
     * @param zzorgncd The value of zzorgncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzorgncd_NotLikeSearch(String zzorgncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzorgncd), xgetCValueZzorgncd(), "ZZORGNCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     * @param zzorgncd The value of zzorgncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_PrefixSearch(String zzorgncd) {
        setZzorgncd_LikeSearch(zzorgncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     */
    public void setZzorgncd_IsNull() { regZzorgncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     */
    public void setZzorgncd_IsNullOrEmpty() { regZzorgncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     */
    public void setZzorgncd_IsNotNull() { regZzorgncd(CK_ISNN, DOBJ); }

    protected void regZzorgncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzorgncd(), "ZZORGNCD"); }
    protected abstract ConditionValue xgetCValueZzorgncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNID: {varchar(60)}
     * @param zzorgnid The value of zzorgnid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnid_Equal(String zzorgnid) {
        doSetZzorgnid_Equal(fRES(zzorgnid));
    }

    protected void doSetZzorgnid_Equal(String zzorgnid) {
        regZzorgnid(CK_EQ, zzorgnid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNID: {varchar(60)}
     * @param zzorgnid The value of zzorgnid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnid_NotEqual(String zzorgnid) {
        doSetZzorgnid_NotEqual(fRES(zzorgnid));
    }

    protected void doSetZzorgnid_NotEqual(String zzorgnid) {
        regZzorgnid(CK_NES, zzorgnid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNID: {varchar(60)}
     * @param zzorgnid The value of zzorgnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnid_GreaterThan(String zzorgnid) {
        regZzorgnid(CK_GT, fRES(zzorgnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNID: {varchar(60)}
     * @param zzorgnid The value of zzorgnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnid_LessThan(String zzorgnid) {
        regZzorgnid(CK_LT, fRES(zzorgnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNID: {varchar(60)}
     * @param zzorgnid The value of zzorgnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnid_GreaterEqual(String zzorgnid) {
        regZzorgnid(CK_GE, fRES(zzorgnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNID: {varchar(60)}
     * @param zzorgnid The value of zzorgnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnid_LessEqual(String zzorgnid) {
        regZzorgnid(CK_LE, fRES(zzorgnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORGNID: {varchar(60)}
     * @param zzorgnidList The collection of zzorgnid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnid_InScope(Collection<String> zzorgnidList) {
        doSetZzorgnid_InScope(zzorgnidList);
    }

    protected void doSetZzorgnid_InScope(Collection<String> zzorgnidList) {
        regINS(CK_INS, cTL(zzorgnidList), xgetCValueZzorgnid(), "ZZORGNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORGNID: {varchar(60)}
     * @param zzorgnidList The collection of zzorgnid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnid_NotInScope(Collection<String> zzorgnidList) {
        doSetZzorgnid_NotInScope(zzorgnidList);
    }

    protected void doSetZzorgnid_NotInScope(Collection<String> zzorgnidList) {
        regINS(CK_NINS, cTL(zzorgnidList), xgetCValueZzorgnid(), "ZZORGNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNID: {varchar(60)} <br>
     * <pre>e.g. setZzorgnid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzorgnid The value of zzorgnid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzorgnid_LikeSearch(String zzorgnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzorgnid), xgetCValueZzorgnid(), "ZZORGNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNID: {varchar(60)}
     * @param zzorgnid The value of zzorgnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzorgnid_NotLikeSearch(String zzorgnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzorgnid), xgetCValueZzorgnid(), "ZZORGNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNID: {varchar(60)}
     * @param zzorgnid The value of zzorgnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnid_PrefixSearch(String zzorgnid) {
        setZzorgnid_LikeSearch(zzorgnid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZORGNID: {varchar(60)}
     */
    public void setZzorgnid_IsNull() { regZzorgnid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZORGNID: {varchar(60)}
     */
    public void setZzorgnid_IsNullOrEmpty() { regZzorgnid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZORGNID: {varchar(60)}
     */
    public void setZzorgnid_IsNotNull() { regZzorgnid(CK_ISNN, DOBJ); }

    protected void regZzorgnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzorgnid(), "ZZORGNID"); }
    protected abstract ConditionValue xgetCValueZzorgnid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(255)}
     * @param orgnmkjf The value of orgnmkjf as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_Equal(String orgnmkjf) {
        doSetOrgnmkjf_Equal(fRES(orgnmkjf));
    }

    protected void doSetOrgnmkjf_Equal(String orgnmkjf) {
        regOrgnmkjf(CK_EQ, orgnmkjf);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(255)}
     * @param orgnmkjf The value of orgnmkjf as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_NotEqual(String orgnmkjf) {
        doSetOrgnmkjf_NotEqual(fRES(orgnmkjf));
    }

    protected void doSetOrgnmkjf_NotEqual(String orgnmkjf) {
        regOrgnmkjf(CK_NES, orgnmkjf);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(255)}
     * @param orgnmkjf The value of orgnmkjf as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_GreaterThan(String orgnmkjf) {
        regOrgnmkjf(CK_GT, fRES(orgnmkjf));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(255)}
     * @param orgnmkjf The value of orgnmkjf as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_LessThan(String orgnmkjf) {
        regOrgnmkjf(CK_LT, fRES(orgnmkjf));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(255)}
     * @param orgnmkjf The value of orgnmkjf as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_GreaterEqual(String orgnmkjf) {
        regOrgnmkjf(CK_GE, fRES(orgnmkjf));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(255)}
     * @param orgnmkjf The value of orgnmkjf as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_LessEqual(String orgnmkjf) {
        regOrgnmkjf(CK_LE, fRES(orgnmkjf));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGNMKJF: {varchar(255)}
     * @param orgnmkjfList The collection of orgnmkjf as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_InScope(Collection<String> orgnmkjfList) {
        doSetOrgnmkjf_InScope(orgnmkjfList);
    }

    protected void doSetOrgnmkjf_InScope(Collection<String> orgnmkjfList) {
        regINS(CK_INS, cTL(orgnmkjfList), xgetCValueOrgnmkjf(), "ORGNMKJF");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGNMKJF: {varchar(255)}
     * @param orgnmkjfList The collection of orgnmkjf as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_NotInScope(Collection<String> orgnmkjfList) {
        doSetOrgnmkjf_NotInScope(orgnmkjfList);
    }

    protected void doSetOrgnmkjf_NotInScope(Collection<String> orgnmkjfList) {
        regINS(CK_NINS, cTL(orgnmkjfList), xgetCValueOrgnmkjf(), "ORGNMKJF");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGNMKJF: {varchar(255)} <br>
     * <pre>e.g. setOrgnmkjf_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orgnmkjf The value of orgnmkjf as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrgnmkjf_LikeSearch(String orgnmkjf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orgnmkjf), xgetCValueOrgnmkjf(), "ORGNMKJF", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGNMKJF: {varchar(255)}
     * @param orgnmkjf The value of orgnmkjf as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrgnmkjf_NotLikeSearch(String orgnmkjf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orgnmkjf), xgetCValueOrgnmkjf(), "ORGNMKJF", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGNMKJF: {varchar(255)}
     * @param orgnmkjf The value of orgnmkjf as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgnmkjf_PrefixSearch(String orgnmkjf) {
        setOrgnmkjf_LikeSearch(orgnmkjf, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(255)}
     */
    public void setOrgnmkjf_IsNull() { regOrgnmkjf(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(255)}
     */
    public void setOrgnmkjf_IsNullOrEmpty() { regOrgnmkjf(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORGNMKJF: {varchar(255)}
     */
    public void setOrgnmkjf_IsNotNull() { regOrgnmkjf(CK_ISNN, DOBJ); }

    protected void regOrgnmkjf(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrgnmkjf(), "ORGNMKJF"); }
    protected abstract ConditionValue xgetCValueOrgnmkjf();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONFNF: {varchar(255)}
     * @param jtonfnf The value of jtonfnf as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnf_Equal(String jtonfnf) {
        doSetJtonfnf_Equal(fRES(jtonfnf));
    }

    protected void doSetJtonfnf_Equal(String jtonfnf) {
        regJtonfnf(CK_EQ, jtonfnf);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONFNF: {varchar(255)}
     * @param jtonfnf The value of jtonfnf as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnf_NotEqual(String jtonfnf) {
        doSetJtonfnf_NotEqual(fRES(jtonfnf));
    }

    protected void doSetJtonfnf_NotEqual(String jtonfnf) {
        regJtonfnf(CK_NES, jtonfnf);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONFNF: {varchar(255)}
     * @param jtonfnf The value of jtonfnf as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnf_GreaterThan(String jtonfnf) {
        regJtonfnf(CK_GT, fRES(jtonfnf));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONFNF: {varchar(255)}
     * @param jtonfnf The value of jtonfnf as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnf_LessThan(String jtonfnf) {
        regJtonfnf(CK_LT, fRES(jtonfnf));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONFNF: {varchar(255)}
     * @param jtonfnf The value of jtonfnf as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnf_GreaterEqual(String jtonfnf) {
        regJtonfnf(CK_GE, fRES(jtonfnf));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONFNF: {varchar(255)}
     * @param jtonfnf The value of jtonfnf as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnf_LessEqual(String jtonfnf) {
        regJtonfnf(CK_LE, fRES(jtonfnf));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JTONFNF: {varchar(255)}
     * @param jtonfnfList The collection of jtonfnf as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnf_InScope(Collection<String> jtonfnfList) {
        doSetJtonfnf_InScope(jtonfnfList);
    }

    protected void doSetJtonfnf_InScope(Collection<String> jtonfnfList) {
        regINS(CK_INS, cTL(jtonfnfList), xgetCValueJtonfnf(), "JTONFNF");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JTONFNF: {varchar(255)}
     * @param jtonfnfList The collection of jtonfnf as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnf_NotInScope(Collection<String> jtonfnfList) {
        doSetJtonfnf_NotInScope(jtonfnfList);
    }

    protected void doSetJtonfnf_NotInScope(Collection<String> jtonfnfList) {
        regINS(CK_NINS, cTL(jtonfnfList), xgetCValueJtonfnf(), "JTONFNF");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTONFNF: {varchar(255)} <br>
     * <pre>e.g. setJtonfnf_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param jtonfnf The value of jtonfnf as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setJtonfnf_LikeSearch(String jtonfnf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(jtonfnf), xgetCValueJtonfnf(), "JTONFNF", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTONFNF: {varchar(255)}
     * @param jtonfnf The value of jtonfnf as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setJtonfnf_NotLikeSearch(String jtonfnf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(jtonfnf), xgetCValueJtonfnf(), "JTONFNF", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTONFNF: {varchar(255)}
     * @param jtonfnf The value of jtonfnf as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnf_PrefixSearch(String jtonfnf) {
        setJtonfnf_LikeSearch(jtonfnf, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JTONFNF: {varchar(255)}
     */
    public void setJtonfnf_IsNull() { regJtonfnf(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * JTONFNF: {varchar(255)}
     */
    public void setJtonfnf_IsNullOrEmpty() { regJtonfnf(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JTONFNF: {varchar(255)}
     */
    public void setJtonfnf_IsNotNull() { regJtonfnf(CK_ISNN, DOBJ); }

    protected void regJtonfnf(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJtonfnf(), "JTONFNF"); }
    protected abstract ConditionValue xgetCValueJtonfnf();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONFNHA: {varchar(100)}
     * @param onfnha The value of onfnha as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnfnha_Equal(String onfnha) {
        doSetOnfnha_Equal(fRES(onfnha));
    }

    protected void doSetOnfnha_Equal(String onfnha) {
        regOnfnha(CK_EQ, onfnha);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONFNHA: {varchar(100)}
     * @param onfnha The value of onfnha as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnfnha_NotEqual(String onfnha) {
        doSetOnfnha_NotEqual(fRES(onfnha));
    }

    protected void doSetOnfnha_NotEqual(String onfnha) {
        regOnfnha(CK_NES, onfnha);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONFNHA: {varchar(100)}
     * @param onfnha The value of onfnha as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnfnha_GreaterThan(String onfnha) {
        regOnfnha(CK_GT, fRES(onfnha));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONFNHA: {varchar(100)}
     * @param onfnha The value of onfnha as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnfnha_LessThan(String onfnha) {
        regOnfnha(CK_LT, fRES(onfnha));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONFNHA: {varchar(100)}
     * @param onfnha The value of onfnha as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnfnha_GreaterEqual(String onfnha) {
        regOnfnha(CK_GE, fRES(onfnha));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONFNHA: {varchar(100)}
     * @param onfnha The value of onfnha as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnfnha_LessEqual(String onfnha) {
        regOnfnha(CK_LE, fRES(onfnha));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONFNHA: {varchar(100)}
     * @param onfnhaList The collection of onfnha as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnfnha_InScope(Collection<String> onfnhaList) {
        doSetOnfnha_InScope(onfnhaList);
    }

    protected void doSetOnfnha_InScope(Collection<String> onfnhaList) {
        regINS(CK_INS, cTL(onfnhaList), xgetCValueOnfnha(), "ONFNHA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONFNHA: {varchar(100)}
     * @param onfnhaList The collection of onfnha as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnfnha_NotInScope(Collection<String> onfnhaList) {
        doSetOnfnha_NotInScope(onfnhaList);
    }

    protected void doSetOnfnha_NotInScope(Collection<String> onfnhaList) {
        regINS(CK_NINS, cTL(onfnhaList), xgetCValueOnfnha(), "ONFNHA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ONFNHA: {varchar(100)} <br>
     * <pre>e.g. setOnfnha_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param onfnha The value of onfnha as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOnfnha_LikeSearch(String onfnha, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(onfnha), xgetCValueOnfnha(), "ONFNHA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ONFNHA: {varchar(100)}
     * @param onfnha The value of onfnha as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOnfnha_NotLikeSearch(String onfnha, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(onfnha), xgetCValueOnfnha(), "ONFNHA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ONFNHA: {varchar(100)}
     * @param onfnha The value of onfnha as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnfnha_PrefixSearch(String onfnha) {
        setOnfnha_LikeSearch(onfnha, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ONFNHA: {varchar(100)}
     */
    public void setOnfnha_IsNull() { regOnfnha(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ONFNHA: {varchar(100)}
     */
    public void setOnfnha_IsNullOrEmpty() { regOnfnha(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ONFNHA: {varchar(100)}
     */
    public void setOnfnha_IsNotNull() { regOnfnha(CK_ISNN, DOBJ); }

    protected void regOnfnha(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOnfnha(), "ONFNHA"); }
    protected abstract ConditionValue xgetCValueOnfnha();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONFNH: {varchar(100)}
     * @param jtonfnh The value of jtonfnh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnh_Equal(String jtonfnh) {
        doSetJtonfnh_Equal(fRES(jtonfnh));
    }

    protected void doSetJtonfnh_Equal(String jtonfnh) {
        regJtonfnh(CK_EQ, jtonfnh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONFNH: {varchar(100)}
     * @param jtonfnh The value of jtonfnh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnh_NotEqual(String jtonfnh) {
        doSetJtonfnh_NotEqual(fRES(jtonfnh));
    }

    protected void doSetJtonfnh_NotEqual(String jtonfnh) {
        regJtonfnh(CK_NES, jtonfnh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONFNH: {varchar(100)}
     * @param jtonfnh The value of jtonfnh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnh_GreaterThan(String jtonfnh) {
        regJtonfnh(CK_GT, fRES(jtonfnh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONFNH: {varchar(100)}
     * @param jtonfnh The value of jtonfnh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnh_LessThan(String jtonfnh) {
        regJtonfnh(CK_LT, fRES(jtonfnh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONFNH: {varchar(100)}
     * @param jtonfnh The value of jtonfnh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnh_GreaterEqual(String jtonfnh) {
        regJtonfnh(CK_GE, fRES(jtonfnh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONFNH: {varchar(100)}
     * @param jtonfnh The value of jtonfnh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnh_LessEqual(String jtonfnh) {
        regJtonfnh(CK_LE, fRES(jtonfnh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JTONFNH: {varchar(100)}
     * @param jtonfnhList The collection of jtonfnh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnh_InScope(Collection<String> jtonfnhList) {
        doSetJtonfnh_InScope(jtonfnhList);
    }

    protected void doSetJtonfnh_InScope(Collection<String> jtonfnhList) {
        regINS(CK_INS, cTL(jtonfnhList), xgetCValueJtonfnh(), "JTONFNH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JTONFNH: {varchar(100)}
     * @param jtonfnhList The collection of jtonfnh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnh_NotInScope(Collection<String> jtonfnhList) {
        doSetJtonfnh_NotInScope(jtonfnhList);
    }

    protected void doSetJtonfnh_NotInScope(Collection<String> jtonfnhList) {
        regINS(CK_NINS, cTL(jtonfnhList), xgetCValueJtonfnh(), "JTONFNH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTONFNH: {varchar(100)} <br>
     * <pre>e.g. setJtonfnh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param jtonfnh The value of jtonfnh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setJtonfnh_LikeSearch(String jtonfnh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(jtonfnh), xgetCValueJtonfnh(), "JTONFNH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTONFNH: {varchar(100)}
     * @param jtonfnh The value of jtonfnh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setJtonfnh_NotLikeSearch(String jtonfnh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(jtonfnh), xgetCValueJtonfnh(), "JTONFNH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTONFNH: {varchar(100)}
     * @param jtonfnh The value of jtonfnh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonfnh_PrefixSearch(String jtonfnh) {
        setJtonfnh_LikeSearch(jtonfnh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JTONFNH: {varchar(100)}
     */
    public void setJtonfnh_IsNull() { regJtonfnh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * JTONFNH: {varchar(100)}
     */
    public void setJtonfnh_IsNullOrEmpty() { regJtonfnh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JTONFNH: {varchar(100)}
     */
    public void setJtonfnh_IsNotNull() { regJtonfnh(CK_ISNN, DOBJ); }

    protected void regJtonfnh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJtonfnh(), "JTONFNH"); }
    protected abstract ConditionValue xgetCValueJtonfnh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNAM: {varchar(255)}
     * @param zzorgnam The value of zzorgnam as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnam_Equal(String zzorgnam) {
        doSetZzorgnam_Equal(fRES(zzorgnam));
    }

    protected void doSetZzorgnam_Equal(String zzorgnam) {
        regZzorgnam(CK_EQ, zzorgnam);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNAM: {varchar(255)}
     * @param zzorgnam The value of zzorgnam as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnam_NotEqual(String zzorgnam) {
        doSetZzorgnam_NotEqual(fRES(zzorgnam));
    }

    protected void doSetZzorgnam_NotEqual(String zzorgnam) {
        regZzorgnam(CK_NES, zzorgnam);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNAM: {varchar(255)}
     * @param zzorgnam The value of zzorgnam as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnam_GreaterThan(String zzorgnam) {
        regZzorgnam(CK_GT, fRES(zzorgnam));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNAM: {varchar(255)}
     * @param zzorgnam The value of zzorgnam as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnam_LessThan(String zzorgnam) {
        regZzorgnam(CK_LT, fRES(zzorgnam));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNAM: {varchar(255)}
     * @param zzorgnam The value of zzorgnam as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnam_GreaterEqual(String zzorgnam) {
        regZzorgnam(CK_GE, fRES(zzorgnam));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNAM: {varchar(255)}
     * @param zzorgnam The value of zzorgnam as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnam_LessEqual(String zzorgnam) {
        regZzorgnam(CK_LE, fRES(zzorgnam));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORGNAM: {varchar(255)}
     * @param zzorgnamList The collection of zzorgnam as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnam_InScope(Collection<String> zzorgnamList) {
        doSetZzorgnam_InScope(zzorgnamList);
    }

    protected void doSetZzorgnam_InScope(Collection<String> zzorgnamList) {
        regINS(CK_INS, cTL(zzorgnamList), xgetCValueZzorgnam(), "ZZORGNAM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORGNAM: {varchar(255)}
     * @param zzorgnamList The collection of zzorgnam as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnam_NotInScope(Collection<String> zzorgnamList) {
        doSetZzorgnam_NotInScope(zzorgnamList);
    }

    protected void doSetZzorgnam_NotInScope(Collection<String> zzorgnamList) {
        regINS(CK_NINS, cTL(zzorgnamList), xgetCValueZzorgnam(), "ZZORGNAM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNAM: {varchar(255)} <br>
     * <pre>e.g. setZzorgnam_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzorgnam The value of zzorgnam as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzorgnam_LikeSearch(String zzorgnam, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzorgnam), xgetCValueZzorgnam(), "ZZORGNAM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNAM: {varchar(255)}
     * @param zzorgnam The value of zzorgnam as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzorgnam_NotLikeSearch(String zzorgnam, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzorgnam), xgetCValueZzorgnam(), "ZZORGNAM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNAM: {varchar(255)}
     * @param zzorgnam The value of zzorgnam as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgnam_PrefixSearch(String zzorgnam) {
        setZzorgnam_LikeSearch(zzorgnam, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZORGNAM: {varchar(255)}
     */
    public void setZzorgnam_IsNull() { regZzorgnam(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZORGNAM: {varchar(255)}
     */
    public void setZzorgnam_IsNullOrEmpty() { regZzorgnam(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZORGNAM: {varchar(255)}
     */
    public void setZzorgnam_IsNotNull() { regZzorgnam(CK_ISNN, DOBJ); }

    protected void regZzorgnam(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzorgnam(), "ZZORGNAM"); }
    protected abstract ConditionValue xgetCValueZzorgnam();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONANF: {varchar(255)}
     * @param jtonanf The value of jtonanf as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanf_Equal(String jtonanf) {
        doSetJtonanf_Equal(fRES(jtonanf));
    }

    protected void doSetJtonanf_Equal(String jtonanf) {
        regJtonanf(CK_EQ, jtonanf);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONANF: {varchar(255)}
     * @param jtonanf The value of jtonanf as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanf_NotEqual(String jtonanf) {
        doSetJtonanf_NotEqual(fRES(jtonanf));
    }

    protected void doSetJtonanf_NotEqual(String jtonanf) {
        regJtonanf(CK_NES, jtonanf);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONANF: {varchar(255)}
     * @param jtonanf The value of jtonanf as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanf_GreaterThan(String jtonanf) {
        regJtonanf(CK_GT, fRES(jtonanf));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONANF: {varchar(255)}
     * @param jtonanf The value of jtonanf as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanf_LessThan(String jtonanf) {
        regJtonanf(CK_LT, fRES(jtonanf));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONANF: {varchar(255)}
     * @param jtonanf The value of jtonanf as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanf_GreaterEqual(String jtonanf) {
        regJtonanf(CK_GE, fRES(jtonanf));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONANF: {varchar(255)}
     * @param jtonanf The value of jtonanf as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanf_LessEqual(String jtonanf) {
        regJtonanf(CK_LE, fRES(jtonanf));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JTONANF: {varchar(255)}
     * @param jtonanfList The collection of jtonanf as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanf_InScope(Collection<String> jtonanfList) {
        doSetJtonanf_InScope(jtonanfList);
    }

    protected void doSetJtonanf_InScope(Collection<String> jtonanfList) {
        regINS(CK_INS, cTL(jtonanfList), xgetCValueJtonanf(), "JTONANF");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JTONANF: {varchar(255)}
     * @param jtonanfList The collection of jtonanf as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanf_NotInScope(Collection<String> jtonanfList) {
        doSetJtonanf_NotInScope(jtonanfList);
    }

    protected void doSetJtonanf_NotInScope(Collection<String> jtonanfList) {
        regINS(CK_NINS, cTL(jtonanfList), xgetCValueJtonanf(), "JTONANF");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTONANF: {varchar(255)} <br>
     * <pre>e.g. setJtonanf_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param jtonanf The value of jtonanf as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setJtonanf_LikeSearch(String jtonanf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(jtonanf), xgetCValueJtonanf(), "JTONANF", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTONANF: {varchar(255)}
     * @param jtonanf The value of jtonanf as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setJtonanf_NotLikeSearch(String jtonanf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(jtonanf), xgetCValueJtonanf(), "JTONANF", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTONANF: {varchar(255)}
     * @param jtonanf The value of jtonanf as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanf_PrefixSearch(String jtonanf) {
        setJtonanf_LikeSearch(jtonanf, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JTONANF: {varchar(255)}
     */
    public void setJtonanf_IsNull() { regJtonanf(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * JTONANF: {varchar(255)}
     */
    public void setJtonanf_IsNullOrEmpty() { regJtonanf(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JTONANF: {varchar(255)}
     */
    public void setJtonanf_IsNotNull() { regJtonanf(CK_ISNN, DOBJ); }

    protected void regJtonanf(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJtonanf(), "JTONANF"); }
    protected abstract ConditionValue xgetCValueJtonanf();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONANHA: {varchar(100)}
     * @param onanha The value of onanha as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnanha_Equal(String onanha) {
        doSetOnanha_Equal(fRES(onanha));
    }

    protected void doSetOnanha_Equal(String onanha) {
        regOnanha(CK_EQ, onanha);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONANHA: {varchar(100)}
     * @param onanha The value of onanha as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnanha_NotEqual(String onanha) {
        doSetOnanha_NotEqual(fRES(onanha));
    }

    protected void doSetOnanha_NotEqual(String onanha) {
        regOnanha(CK_NES, onanha);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONANHA: {varchar(100)}
     * @param onanha The value of onanha as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnanha_GreaterThan(String onanha) {
        regOnanha(CK_GT, fRES(onanha));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONANHA: {varchar(100)}
     * @param onanha The value of onanha as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnanha_LessThan(String onanha) {
        regOnanha(CK_LT, fRES(onanha));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONANHA: {varchar(100)}
     * @param onanha The value of onanha as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnanha_GreaterEqual(String onanha) {
        regOnanha(CK_GE, fRES(onanha));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONANHA: {varchar(100)}
     * @param onanha The value of onanha as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnanha_LessEqual(String onanha) {
        regOnanha(CK_LE, fRES(onanha));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONANHA: {varchar(100)}
     * @param onanhaList The collection of onanha as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnanha_InScope(Collection<String> onanhaList) {
        doSetOnanha_InScope(onanhaList);
    }

    protected void doSetOnanha_InScope(Collection<String> onanhaList) {
        regINS(CK_INS, cTL(onanhaList), xgetCValueOnanha(), "ONANHA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONANHA: {varchar(100)}
     * @param onanhaList The collection of onanha as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnanha_NotInScope(Collection<String> onanhaList) {
        doSetOnanha_NotInScope(onanhaList);
    }

    protected void doSetOnanha_NotInScope(Collection<String> onanhaList) {
        regINS(CK_NINS, cTL(onanhaList), xgetCValueOnanha(), "ONANHA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ONANHA: {varchar(100)} <br>
     * <pre>e.g. setOnanha_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param onanha The value of onanha as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOnanha_LikeSearch(String onanha, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(onanha), xgetCValueOnanha(), "ONANHA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ONANHA: {varchar(100)}
     * @param onanha The value of onanha as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOnanha_NotLikeSearch(String onanha, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(onanha), xgetCValueOnanha(), "ONANHA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ONANHA: {varchar(100)}
     * @param onanha The value of onanha as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnanha_PrefixSearch(String onanha) {
        setOnanha_LikeSearch(onanha, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ONANHA: {varchar(100)}
     */
    public void setOnanha_IsNull() { regOnanha(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ONANHA: {varchar(100)}
     */
    public void setOnanha_IsNullOrEmpty() { regOnanha(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ONANHA: {varchar(100)}
     */
    public void setOnanha_IsNotNull() { regOnanha(CK_ISNN, DOBJ); }

    protected void regOnanha(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOnanha(), "ONANHA"); }
    protected abstract ConditionValue xgetCValueOnanha();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONANH: {varchar(100)}
     * @param jtonanh The value of jtonanh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanh_Equal(String jtonanh) {
        doSetJtonanh_Equal(fRES(jtonanh));
    }

    protected void doSetJtonanh_Equal(String jtonanh) {
        regJtonanh(CK_EQ, jtonanh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONANH: {varchar(100)}
     * @param jtonanh The value of jtonanh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanh_NotEqual(String jtonanh) {
        doSetJtonanh_NotEqual(fRES(jtonanh));
    }

    protected void doSetJtonanh_NotEqual(String jtonanh) {
        regJtonanh(CK_NES, jtonanh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONANH: {varchar(100)}
     * @param jtonanh The value of jtonanh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanh_GreaterThan(String jtonanh) {
        regJtonanh(CK_GT, fRES(jtonanh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONANH: {varchar(100)}
     * @param jtonanh The value of jtonanh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanh_LessThan(String jtonanh) {
        regJtonanh(CK_LT, fRES(jtonanh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONANH: {varchar(100)}
     * @param jtonanh The value of jtonanh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanh_GreaterEqual(String jtonanh) {
        regJtonanh(CK_GE, fRES(jtonanh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTONANH: {varchar(100)}
     * @param jtonanh The value of jtonanh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanh_LessEqual(String jtonanh) {
        regJtonanh(CK_LE, fRES(jtonanh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JTONANH: {varchar(100)}
     * @param jtonanhList The collection of jtonanh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanh_InScope(Collection<String> jtonanhList) {
        doSetJtonanh_InScope(jtonanhList);
    }

    protected void doSetJtonanh_InScope(Collection<String> jtonanhList) {
        regINS(CK_INS, cTL(jtonanhList), xgetCValueJtonanh(), "JTONANH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JTONANH: {varchar(100)}
     * @param jtonanhList The collection of jtonanh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanh_NotInScope(Collection<String> jtonanhList) {
        doSetJtonanh_NotInScope(jtonanhList);
    }

    protected void doSetJtonanh_NotInScope(Collection<String> jtonanhList) {
        regINS(CK_NINS, cTL(jtonanhList), xgetCValueJtonanh(), "JTONANH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTONANH: {varchar(100)} <br>
     * <pre>e.g. setJtonanh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param jtonanh The value of jtonanh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setJtonanh_LikeSearch(String jtonanh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(jtonanh), xgetCValueJtonanh(), "JTONANH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTONANH: {varchar(100)}
     * @param jtonanh The value of jtonanh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setJtonanh_NotLikeSearch(String jtonanh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(jtonanh), xgetCValueJtonanh(), "JTONANH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTONANH: {varchar(100)}
     * @param jtonanh The value of jtonanh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtonanh_PrefixSearch(String jtonanh) {
        setJtonanh_LikeSearch(jtonanh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JTONANH: {varchar(100)}
     */
    public void setJtonanh_IsNull() { regJtonanh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * JTONANH: {varchar(100)}
     */
    public void setJtonanh_IsNullOrEmpty() { regJtonanh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JTONANH: {varchar(100)}
     */
    public void setJtonanh_IsNotNull() { regJtonanh(CK_ISNN, DOBJ); }

    protected void regJtonanh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJtonanh(), "JTONANH"); }
    protected abstract ConditionValue xgetCValueJtonanh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(255)}
     * @param anwhnm The value of anwhnm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_Equal(String anwhnm) {
        doSetAnwhnm_Equal(fRES(anwhnm));
    }

    protected void doSetAnwhnm_Equal(String anwhnm) {
        regAnwhnm(CK_EQ, anwhnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(255)}
     * @param anwhnm The value of anwhnm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_NotEqual(String anwhnm) {
        doSetAnwhnm_NotEqual(fRES(anwhnm));
    }

    protected void doSetAnwhnm_NotEqual(String anwhnm) {
        regAnwhnm(CK_NES, anwhnm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(255)}
     * @param anwhnm The value of anwhnm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_GreaterThan(String anwhnm) {
        regAnwhnm(CK_GT, fRES(anwhnm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(255)}
     * @param anwhnm The value of anwhnm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_LessThan(String anwhnm) {
        regAnwhnm(CK_LT, fRES(anwhnm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(255)}
     * @param anwhnm The value of anwhnm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_GreaterEqual(String anwhnm) {
        regAnwhnm(CK_GE, fRES(anwhnm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(255)}
     * @param anwhnm The value of anwhnm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_LessEqual(String anwhnm) {
        regAnwhnm(CK_LE, fRES(anwhnm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ANWHNM: {varchar(255)}
     * @param anwhnmList The collection of anwhnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_InScope(Collection<String> anwhnmList) {
        doSetAnwhnm_InScope(anwhnmList);
    }

    protected void doSetAnwhnm_InScope(Collection<String> anwhnmList) {
        regINS(CK_INS, cTL(anwhnmList), xgetCValueAnwhnm(), "ANWHNM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ANWHNM: {varchar(255)}
     * @param anwhnmList The collection of anwhnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_NotInScope(Collection<String> anwhnmList) {
        doSetAnwhnm_NotInScope(anwhnmList);
    }

    protected void doSetAnwhnm_NotInScope(Collection<String> anwhnmList) {
        regINS(CK_NINS, cTL(anwhnmList), xgetCValueAnwhnm(), "ANWHNM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ANWHNM: {varchar(255)} <br>
     * <pre>e.g. setAnwhnm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param anwhnm The value of anwhnm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAnwhnm_LikeSearch(String anwhnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(anwhnm), xgetCValueAnwhnm(), "ANWHNM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ANWHNM: {varchar(255)}
     * @param anwhnm The value of anwhnm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAnwhnm_NotLikeSearch(String anwhnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(anwhnm), xgetCValueAnwhnm(), "ANWHNM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ANWHNM: {varchar(255)}
     * @param anwhnm The value of anwhnm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwhnm_PrefixSearch(String anwhnm) {
        setAnwhnm_LikeSearch(anwhnm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(255)}
     */
    public void setAnwhnm_IsNull() { regAnwhnm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(255)}
     */
    public void setAnwhnm_IsNullOrEmpty() { regAnwhnm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ANWHNM: {varchar(255)}
     */
    public void setAnwhnm_IsNotNull() { regAnwhnm(CK_ISNN, DOBJ); }

    protected void regAnwhnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAnwhnm(), "ANWHNM"); }
    protected abstract ConditionValue xgetCValueAnwhnm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOORID: {varchar(60)}
     * @param ioorid The value of ioorid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoorid_Equal(String ioorid) {
        doSetIoorid_Equal(fRES(ioorid));
    }

    protected void doSetIoorid_Equal(String ioorid) {
        regIoorid(CK_EQ, ioorid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOORID: {varchar(60)}
     * @param ioorid The value of ioorid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoorid_NotEqual(String ioorid) {
        doSetIoorid_NotEqual(fRES(ioorid));
    }

    protected void doSetIoorid_NotEqual(String ioorid) {
        regIoorid(CK_NES, ioorid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOORID: {varchar(60)}
     * @param ioorid The value of ioorid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoorid_GreaterThan(String ioorid) {
        regIoorid(CK_GT, fRES(ioorid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOORID: {varchar(60)}
     * @param ioorid The value of ioorid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoorid_LessThan(String ioorid) {
        regIoorid(CK_LT, fRES(ioorid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOORID: {varchar(60)}
     * @param ioorid The value of ioorid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoorid_GreaterEqual(String ioorid) {
        regIoorid(CK_GE, fRES(ioorid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOORID: {varchar(60)}
     * @param ioorid The value of ioorid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoorid_LessEqual(String ioorid) {
        regIoorid(CK_LE, fRES(ioorid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IOORID: {varchar(60)}
     * @param iooridList The collection of ioorid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoorid_InScope(Collection<String> iooridList) {
        doSetIoorid_InScope(iooridList);
    }

    protected void doSetIoorid_InScope(Collection<String> iooridList) {
        regINS(CK_INS, cTL(iooridList), xgetCValueIoorid(), "IOORID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IOORID: {varchar(60)}
     * @param iooridList The collection of ioorid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoorid_NotInScope(Collection<String> iooridList) {
        doSetIoorid_NotInScope(iooridList);
    }

    protected void doSetIoorid_NotInScope(Collection<String> iooridList) {
        regINS(CK_NINS, cTL(iooridList), xgetCValueIoorid(), "IOORID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IOORID: {varchar(60)} <br>
     * <pre>e.g. setIoorid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ioorid The value of ioorid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIoorid_LikeSearch(String ioorid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ioorid), xgetCValueIoorid(), "IOORID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IOORID: {varchar(60)}
     * @param ioorid The value of ioorid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIoorid_NotLikeSearch(String ioorid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ioorid), xgetCValueIoorid(), "IOORID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IOORID: {varchar(60)}
     * @param ioorid The value of ioorid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoorid_PrefixSearch(String ioorid) {
        setIoorid_LikeSearch(ioorid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IOORID: {varchar(60)}
     */
    public void setIoorid_IsNull() { regIoorid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IOORID: {varchar(60)}
     */
    public void setIoorid_IsNullOrEmpty() { regIoorid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IOORID: {varchar(60)}
     */
    public void setIoorid_IsNotNull() { regIoorid(CK_ISNN, DOBJ); }

    protected void regIoorid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIoorid(), "IOORID"); }
    protected abstract ConditionValue xgetCValueIoorid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGPSNO: {varchar(100), default=[000-0000]}
     * @param orgpsno The value of orgpsno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgpsno_Equal(String orgpsno) {
        doSetOrgpsno_Equal(fRES(orgpsno));
    }

    protected void doSetOrgpsno_Equal(String orgpsno) {
        regOrgpsno(CK_EQ, orgpsno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGPSNO: {varchar(100), default=[000-0000]}
     * @param orgpsno The value of orgpsno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgpsno_NotEqual(String orgpsno) {
        doSetOrgpsno_NotEqual(fRES(orgpsno));
    }

    protected void doSetOrgpsno_NotEqual(String orgpsno) {
        regOrgpsno(CK_NES, orgpsno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGPSNO: {varchar(100), default=[000-0000]}
     * @param orgpsno The value of orgpsno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgpsno_GreaterThan(String orgpsno) {
        regOrgpsno(CK_GT, fRES(orgpsno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGPSNO: {varchar(100), default=[000-0000]}
     * @param orgpsno The value of orgpsno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgpsno_LessThan(String orgpsno) {
        regOrgpsno(CK_LT, fRES(orgpsno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGPSNO: {varchar(100), default=[000-0000]}
     * @param orgpsno The value of orgpsno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgpsno_GreaterEqual(String orgpsno) {
        regOrgpsno(CK_GE, fRES(orgpsno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGPSNO: {varchar(100), default=[000-0000]}
     * @param orgpsno The value of orgpsno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgpsno_LessEqual(String orgpsno) {
        regOrgpsno(CK_LE, fRES(orgpsno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGPSNO: {varchar(100), default=[000-0000]}
     * @param orgpsnoList The collection of orgpsno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgpsno_InScope(Collection<String> orgpsnoList) {
        doSetOrgpsno_InScope(orgpsnoList);
    }

    protected void doSetOrgpsno_InScope(Collection<String> orgpsnoList) {
        regINS(CK_INS, cTL(orgpsnoList), xgetCValueOrgpsno(), "ORGPSNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGPSNO: {varchar(100), default=[000-0000]}
     * @param orgpsnoList The collection of orgpsno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgpsno_NotInScope(Collection<String> orgpsnoList) {
        doSetOrgpsno_NotInScope(orgpsnoList);
    }

    protected void doSetOrgpsno_NotInScope(Collection<String> orgpsnoList) {
        regINS(CK_NINS, cTL(orgpsnoList), xgetCValueOrgpsno(), "ORGPSNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGPSNO: {varchar(100), default=[000-0000]} <br>
     * <pre>e.g. setOrgpsno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orgpsno The value of orgpsno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrgpsno_LikeSearch(String orgpsno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orgpsno), xgetCValueOrgpsno(), "ORGPSNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGPSNO: {varchar(100), default=[000-0000]}
     * @param orgpsno The value of orgpsno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrgpsno_NotLikeSearch(String orgpsno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orgpsno), xgetCValueOrgpsno(), "ORGPSNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGPSNO: {varchar(100), default=[000-0000]}
     * @param orgpsno The value of orgpsno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgpsno_PrefixSearch(String orgpsno) {
        setOrgpsno_LikeSearch(orgpsno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORGPSNO: {varchar(100), default=[000-0000]}
     */
    public void setOrgpsno_IsNull() { regOrgpsno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORGPSNO: {varchar(100), default=[000-0000]}
     */
    public void setOrgpsno_IsNullOrEmpty() { regOrgpsno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORGPSNO: {varchar(100), default=[000-0000]}
     */
    public void setOrgpsno_IsNotNull() { regOrgpsno(CK_ISNN, DOBJ); }

    protected void regOrgpsno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrgpsno(), "ORGPSNO"); }
    protected abstract ConditionValue xgetCValueOrgpsno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADVCD: {varchar(100)}
     * @param advcd The value of advcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvcd_Equal(String advcd) {
        doSetAdvcd_Equal(fRES(advcd));
    }

    protected void doSetAdvcd_Equal(String advcd) {
        regAdvcd(CK_EQ, advcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADVCD: {varchar(100)}
     * @param advcd The value of advcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvcd_NotEqual(String advcd) {
        doSetAdvcd_NotEqual(fRES(advcd));
    }

    protected void doSetAdvcd_NotEqual(String advcd) {
        regAdvcd(CK_NES, advcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADVCD: {varchar(100)}
     * @param advcd The value of advcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvcd_GreaterThan(String advcd) {
        regAdvcd(CK_GT, fRES(advcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADVCD: {varchar(100)}
     * @param advcd The value of advcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvcd_LessThan(String advcd) {
        regAdvcd(CK_LT, fRES(advcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADVCD: {varchar(100)}
     * @param advcd The value of advcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvcd_GreaterEqual(String advcd) {
        regAdvcd(CK_GE, fRES(advcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADVCD: {varchar(100)}
     * @param advcd The value of advcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvcd_LessEqual(String advcd) {
        regAdvcd(CK_LE, fRES(advcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADVCD: {varchar(100)}
     * @param advcdList The collection of advcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvcd_InScope(Collection<String> advcdList) {
        doSetAdvcd_InScope(advcdList);
    }

    protected void doSetAdvcd_InScope(Collection<String> advcdList) {
        regINS(CK_INS, cTL(advcdList), xgetCValueAdvcd(), "ADVCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADVCD: {varchar(100)}
     * @param advcdList The collection of advcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvcd_NotInScope(Collection<String> advcdList) {
        doSetAdvcd_NotInScope(advcdList);
    }

    protected void doSetAdvcd_NotInScope(Collection<String> advcdList) {
        regINS(CK_NINS, cTL(advcdList), xgetCValueAdvcd(), "ADVCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADVCD: {varchar(100)} <br>
     * <pre>e.g. setAdvcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param advcd The value of advcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAdvcd_LikeSearch(String advcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(advcd), xgetCValueAdvcd(), "ADVCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADVCD: {varchar(100)}
     * @param advcd The value of advcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAdvcd_NotLikeSearch(String advcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(advcd), xgetCValueAdvcd(), "ADVCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADVCD: {varchar(100)}
     * @param advcd The value of advcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvcd_PrefixSearch(String advcd) {
        setAdvcd_LikeSearch(advcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADVCD: {varchar(100)}
     */
    public void setAdvcd_IsNull() { regAdvcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADVCD: {varchar(100)}
     */
    public void setAdvcd_IsNullOrEmpty() { regAdvcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADVCD: {varchar(100)}
     */
    public void setAdvcd_IsNotNull() { regAdvcd(CK_ISNN, DOBJ); }

    protected void regAdvcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdvcd(), "ADVCD"); }
    protected abstract ConditionValue xgetCValueAdvcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNC: {varchar(100)}
     * @param counc The value of counc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounc_Equal(String counc) {
        doSetCounc_Equal(fRES(counc));
    }

    protected void doSetCounc_Equal(String counc) {
        regCounc(CK_EQ, counc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNC: {varchar(100)}
     * @param counc The value of counc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounc_NotEqual(String counc) {
        doSetCounc_NotEqual(fRES(counc));
    }

    protected void doSetCounc_NotEqual(String counc) {
        regCounc(CK_NES, counc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNC: {varchar(100)}
     * @param counc The value of counc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounc_GreaterThan(String counc) {
        regCounc(CK_GT, fRES(counc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNC: {varchar(100)}
     * @param counc The value of counc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounc_LessThan(String counc) {
        regCounc(CK_LT, fRES(counc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNC: {varchar(100)}
     * @param counc The value of counc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounc_GreaterEqual(String counc) {
        regCounc(CK_GE, fRES(counc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNC: {varchar(100)}
     * @param counc The value of counc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounc_LessEqual(String counc) {
        regCounc(CK_LE, fRES(counc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNC: {varchar(100)}
     * @param councList The collection of counc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounc_InScope(Collection<String> councList) {
        doSetCounc_InScope(councList);
    }

    protected void doSetCounc_InScope(Collection<String> councList) {
        regINS(CK_INS, cTL(councList), xgetCValueCounc(), "COUNC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNC: {varchar(100)}
     * @param councList The collection of counc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounc_NotInScope(Collection<String> councList) {
        doSetCounc_NotInScope(councList);
    }

    protected void doSetCounc_NotInScope(Collection<String> councList) {
        regINS(CK_NINS, cTL(councList), xgetCValueCounc(), "COUNC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNC: {varchar(100)} <br>
     * <pre>e.g. setCounc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param counc The value of counc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCounc_LikeSearch(String counc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(counc), xgetCValueCounc(), "COUNC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNC: {varchar(100)}
     * @param counc The value of counc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCounc_NotLikeSearch(String counc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(counc), xgetCValueCounc(), "COUNC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNC: {varchar(100)}
     * @param counc The value of counc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounc_PrefixSearch(String counc) {
        setCounc_LikeSearch(counc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COUNC: {varchar(100)}
     */
    public void setCounc_IsNull() { regCounc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COUNC: {varchar(100)}
     */
    public void setCounc_IsNullOrEmpty() { regCounc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COUNC: {varchar(100)}
     */
    public void setCounc_IsNotNull() { regCounc(CK_ISNN, DOBJ); }

    protected void regCounc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCounc(), "COUNC"); }
    protected abstract ConditionValue xgetCValueCounc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGADR1: {varchar(255)}
     * @param orgadr1 The value of orgadr1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgadr1_Equal(String orgadr1) {
        doSetOrgadr1_Equal(fRES(orgadr1));
    }

    protected void doSetOrgadr1_Equal(String orgadr1) {
        regOrgadr1(CK_EQ, orgadr1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGADR1: {varchar(255)}
     * @param orgadr1 The value of orgadr1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgadr1_NotEqual(String orgadr1) {
        doSetOrgadr1_NotEqual(fRES(orgadr1));
    }

    protected void doSetOrgadr1_NotEqual(String orgadr1) {
        regOrgadr1(CK_NES, orgadr1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGADR1: {varchar(255)}
     * @param orgadr1 The value of orgadr1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgadr1_GreaterThan(String orgadr1) {
        regOrgadr1(CK_GT, fRES(orgadr1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGADR1: {varchar(255)}
     * @param orgadr1 The value of orgadr1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgadr1_LessThan(String orgadr1) {
        regOrgadr1(CK_LT, fRES(orgadr1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGADR1: {varchar(255)}
     * @param orgadr1 The value of orgadr1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgadr1_GreaterEqual(String orgadr1) {
        regOrgadr1(CK_GE, fRES(orgadr1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGADR1: {varchar(255)}
     * @param orgadr1 The value of orgadr1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgadr1_LessEqual(String orgadr1) {
        regOrgadr1(CK_LE, fRES(orgadr1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGADR1: {varchar(255)}
     * @param orgadr1List The collection of orgadr1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgadr1_InScope(Collection<String> orgadr1List) {
        doSetOrgadr1_InScope(orgadr1List);
    }

    protected void doSetOrgadr1_InScope(Collection<String> orgadr1List) {
        regINS(CK_INS, cTL(orgadr1List), xgetCValueOrgadr1(), "ORGADR1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGADR1: {varchar(255)}
     * @param orgadr1List The collection of orgadr1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgadr1_NotInScope(Collection<String> orgadr1List) {
        doSetOrgadr1_NotInScope(orgadr1List);
    }

    protected void doSetOrgadr1_NotInScope(Collection<String> orgadr1List) {
        regINS(CK_NINS, cTL(orgadr1List), xgetCValueOrgadr1(), "ORGADR1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGADR1: {varchar(255)} <br>
     * <pre>e.g. setOrgadr1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orgadr1 The value of orgadr1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrgadr1_LikeSearch(String orgadr1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orgadr1), xgetCValueOrgadr1(), "ORGADR1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGADR1: {varchar(255)}
     * @param orgadr1 The value of orgadr1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrgadr1_NotLikeSearch(String orgadr1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orgadr1), xgetCValueOrgadr1(), "ORGADR1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGADR1: {varchar(255)}
     * @param orgadr1 The value of orgadr1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgadr1_PrefixSearch(String orgadr1) {
        setOrgadr1_LikeSearch(orgadr1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORGADR1: {varchar(255)}
     */
    public void setOrgadr1_IsNull() { regOrgadr1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORGADR1: {varchar(255)}
     */
    public void setOrgadr1_IsNullOrEmpty() { regOrgadr1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORGADR1: {varchar(255)}
     */
    public void setOrgadr1_IsNotNull() { regOrgadr1(CK_ISNN, DOBJ); }

    protected void regOrgadr1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrgadr1(), "ORGADR1"); }
    protected abstract ConditionValue xgetCValueOrgadr1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGTEL: {varchar(60)}
     * @param orgtel The value of orgtel as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgtel_Equal(String orgtel) {
        doSetOrgtel_Equal(fRES(orgtel));
    }

    protected void doSetOrgtel_Equal(String orgtel) {
        regOrgtel(CK_EQ, orgtel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGTEL: {varchar(60)}
     * @param orgtel The value of orgtel as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgtel_NotEqual(String orgtel) {
        doSetOrgtel_NotEqual(fRES(orgtel));
    }

    protected void doSetOrgtel_NotEqual(String orgtel) {
        regOrgtel(CK_NES, orgtel);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGTEL: {varchar(60)}
     * @param orgtel The value of orgtel as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgtel_GreaterThan(String orgtel) {
        regOrgtel(CK_GT, fRES(orgtel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGTEL: {varchar(60)}
     * @param orgtel The value of orgtel as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgtel_LessThan(String orgtel) {
        regOrgtel(CK_LT, fRES(orgtel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGTEL: {varchar(60)}
     * @param orgtel The value of orgtel as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgtel_GreaterEqual(String orgtel) {
        regOrgtel(CK_GE, fRES(orgtel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGTEL: {varchar(60)}
     * @param orgtel The value of orgtel as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgtel_LessEqual(String orgtel) {
        regOrgtel(CK_LE, fRES(orgtel));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGTEL: {varchar(60)}
     * @param orgtelList The collection of orgtel as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgtel_InScope(Collection<String> orgtelList) {
        doSetOrgtel_InScope(orgtelList);
    }

    protected void doSetOrgtel_InScope(Collection<String> orgtelList) {
        regINS(CK_INS, cTL(orgtelList), xgetCValueOrgtel(), "ORGTEL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGTEL: {varchar(60)}
     * @param orgtelList The collection of orgtel as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgtel_NotInScope(Collection<String> orgtelList) {
        doSetOrgtel_NotInScope(orgtelList);
    }

    protected void doSetOrgtel_NotInScope(Collection<String> orgtelList) {
        regINS(CK_NINS, cTL(orgtelList), xgetCValueOrgtel(), "ORGTEL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGTEL: {varchar(60)} <br>
     * <pre>e.g. setOrgtel_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orgtel The value of orgtel as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrgtel_LikeSearch(String orgtel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orgtel), xgetCValueOrgtel(), "ORGTEL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGTEL: {varchar(60)}
     * @param orgtel The value of orgtel as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrgtel_NotLikeSearch(String orgtel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orgtel), xgetCValueOrgtel(), "ORGTEL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGTEL: {varchar(60)}
     * @param orgtel The value of orgtel as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgtel_PrefixSearch(String orgtel) {
        setOrgtel_LikeSearch(orgtel, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORGTEL: {varchar(60)}
     */
    public void setOrgtel_IsNull() { regOrgtel(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORGTEL: {varchar(60)}
     */
    public void setOrgtel_IsNullOrEmpty() { regOrgtel(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORGTEL: {varchar(60)}
     */
    public void setOrgtel_IsNotNull() { regOrgtel(CK_ISNN, DOBJ); }

    protected void regOrgtel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrgtel(), "ORGTEL"); }
    protected abstract ConditionValue xgetCValueOrgtel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORTL2: {varchar(60)}
     * @param ortl2 The value of ortl2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrtl2_Equal(String ortl2) {
        doSetOrtl2_Equal(fRES(ortl2));
    }

    protected void doSetOrtl2_Equal(String ortl2) {
        regOrtl2(CK_EQ, ortl2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORTL2: {varchar(60)}
     * @param ortl2 The value of ortl2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrtl2_NotEqual(String ortl2) {
        doSetOrtl2_NotEqual(fRES(ortl2));
    }

    protected void doSetOrtl2_NotEqual(String ortl2) {
        regOrtl2(CK_NES, ortl2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORTL2: {varchar(60)}
     * @param ortl2 The value of ortl2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrtl2_GreaterThan(String ortl2) {
        regOrtl2(CK_GT, fRES(ortl2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORTL2: {varchar(60)}
     * @param ortl2 The value of ortl2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrtl2_LessThan(String ortl2) {
        regOrtl2(CK_LT, fRES(ortl2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORTL2: {varchar(60)}
     * @param ortl2 The value of ortl2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrtl2_GreaterEqual(String ortl2) {
        regOrtl2(CK_GE, fRES(ortl2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORTL2: {varchar(60)}
     * @param ortl2 The value of ortl2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrtl2_LessEqual(String ortl2) {
        regOrtl2(CK_LE, fRES(ortl2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORTL2: {varchar(60)}
     * @param ortl2List The collection of ortl2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrtl2_InScope(Collection<String> ortl2List) {
        doSetOrtl2_InScope(ortl2List);
    }

    protected void doSetOrtl2_InScope(Collection<String> ortl2List) {
        regINS(CK_INS, cTL(ortl2List), xgetCValueOrtl2(), "ORTL2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORTL2: {varchar(60)}
     * @param ortl2List The collection of ortl2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrtl2_NotInScope(Collection<String> ortl2List) {
        doSetOrtl2_NotInScope(ortl2List);
    }

    protected void doSetOrtl2_NotInScope(Collection<String> ortl2List) {
        regINS(CK_NINS, cTL(ortl2List), xgetCValueOrtl2(), "ORTL2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORTL2: {varchar(60)} <br>
     * <pre>e.g. setOrtl2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ortl2 The value of ortl2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrtl2_LikeSearch(String ortl2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ortl2), xgetCValueOrtl2(), "ORTL2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORTL2: {varchar(60)}
     * @param ortl2 The value of ortl2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrtl2_NotLikeSearch(String ortl2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ortl2), xgetCValueOrtl2(), "ORTL2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORTL2: {varchar(60)}
     * @param ortl2 The value of ortl2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrtl2_PrefixSearch(String ortl2) {
        setOrtl2_LikeSearch(ortl2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORTL2: {varchar(60)}
     */
    public void setOrtl2_IsNull() { regOrtl2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORTL2: {varchar(60)}
     */
    public void setOrtl2_IsNullOrEmpty() { regOrtl2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORTL2: {varchar(60)}
     */
    public void setOrtl2_IsNotNull() { regOrtl2(CK_ISNN, DOBJ); }

    protected void regOrtl2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrtl2(), "ORTL2"); }
    protected abstract ConditionValue xgetCValueOrtl2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGFAX: {varchar(60)}
     * @param orgfax The value of orgfax as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgfax_Equal(String orgfax) {
        doSetOrgfax_Equal(fRES(orgfax));
    }

    protected void doSetOrgfax_Equal(String orgfax) {
        regOrgfax(CK_EQ, orgfax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGFAX: {varchar(60)}
     * @param orgfax The value of orgfax as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgfax_NotEqual(String orgfax) {
        doSetOrgfax_NotEqual(fRES(orgfax));
    }

    protected void doSetOrgfax_NotEqual(String orgfax) {
        regOrgfax(CK_NES, orgfax);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGFAX: {varchar(60)}
     * @param orgfax The value of orgfax as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgfax_GreaterThan(String orgfax) {
        regOrgfax(CK_GT, fRES(orgfax));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGFAX: {varchar(60)}
     * @param orgfax The value of orgfax as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgfax_LessThan(String orgfax) {
        regOrgfax(CK_LT, fRES(orgfax));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGFAX: {varchar(60)}
     * @param orgfax The value of orgfax as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgfax_GreaterEqual(String orgfax) {
        regOrgfax(CK_GE, fRES(orgfax));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORGFAX: {varchar(60)}
     * @param orgfax The value of orgfax as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgfax_LessEqual(String orgfax) {
        regOrgfax(CK_LE, fRES(orgfax));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGFAX: {varchar(60)}
     * @param orgfaxList The collection of orgfax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgfax_InScope(Collection<String> orgfaxList) {
        doSetOrgfax_InScope(orgfaxList);
    }

    protected void doSetOrgfax_InScope(Collection<String> orgfaxList) {
        regINS(CK_INS, cTL(orgfaxList), xgetCValueOrgfax(), "ORGFAX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORGFAX: {varchar(60)}
     * @param orgfaxList The collection of orgfax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgfax_NotInScope(Collection<String> orgfaxList) {
        doSetOrgfax_NotInScope(orgfaxList);
    }

    protected void doSetOrgfax_NotInScope(Collection<String> orgfaxList) {
        regINS(CK_NINS, cTL(orgfaxList), xgetCValueOrgfax(), "ORGFAX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGFAX: {varchar(60)} <br>
     * <pre>e.g. setOrgfax_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orgfax The value of orgfax as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrgfax_LikeSearch(String orgfax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orgfax), xgetCValueOrgfax(), "ORGFAX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGFAX: {varchar(60)}
     * @param orgfax The value of orgfax as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrgfax_NotLikeSearch(String orgfax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orgfax), xgetCValueOrgfax(), "ORGFAX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORGFAX: {varchar(60)}
     * @param orgfax The value of orgfax as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrgfax_PrefixSearch(String orgfax) {
        setOrgfax_LikeSearch(orgfax, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORGFAX: {varchar(60)}
     */
    public void setOrgfax_IsNull() { regOrgfax(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORGFAX: {varchar(60)}
     */
    public void setOrgfax_IsNullOrEmpty() { regOrgfax(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORGFAX: {varchar(60)}
     */
    public void setOrgfax_IsNotNull() { regOrgfax(CK_ISNN, DOBJ); }

    protected void regOrgfax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrgfax(), "ORGFAX"); }
    protected abstract ConditionValue xgetCValueOrgfax();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZHORGCD: {varchar(255)}
     * @param zzhorgcd The value of zzhorgcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhorgcd_Equal(String zzhorgcd) {
        doSetZzhorgcd_Equal(fRES(zzhorgcd));
    }

    protected void doSetZzhorgcd_Equal(String zzhorgcd) {
        regZzhorgcd(CK_EQ, zzhorgcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZHORGCD: {varchar(255)}
     * @param zzhorgcd The value of zzhorgcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhorgcd_NotEqual(String zzhorgcd) {
        doSetZzhorgcd_NotEqual(fRES(zzhorgcd));
    }

    protected void doSetZzhorgcd_NotEqual(String zzhorgcd) {
        regZzhorgcd(CK_NES, zzhorgcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZHORGCD: {varchar(255)}
     * @param zzhorgcd The value of zzhorgcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhorgcd_GreaterThan(String zzhorgcd) {
        regZzhorgcd(CK_GT, fRES(zzhorgcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZHORGCD: {varchar(255)}
     * @param zzhorgcd The value of zzhorgcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhorgcd_LessThan(String zzhorgcd) {
        regZzhorgcd(CK_LT, fRES(zzhorgcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZHORGCD: {varchar(255)}
     * @param zzhorgcd The value of zzhorgcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhorgcd_GreaterEqual(String zzhorgcd) {
        regZzhorgcd(CK_GE, fRES(zzhorgcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZHORGCD: {varchar(255)}
     * @param zzhorgcd The value of zzhorgcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhorgcd_LessEqual(String zzhorgcd) {
        regZzhorgcd(CK_LE, fRES(zzhorgcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZHORGCD: {varchar(255)}
     * @param zzhorgcdList The collection of zzhorgcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhorgcd_InScope(Collection<String> zzhorgcdList) {
        doSetZzhorgcd_InScope(zzhorgcdList);
    }

    protected void doSetZzhorgcd_InScope(Collection<String> zzhorgcdList) {
        regINS(CK_INS, cTL(zzhorgcdList), xgetCValueZzhorgcd(), "ZZHORGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZHORGCD: {varchar(255)}
     * @param zzhorgcdList The collection of zzhorgcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhorgcd_NotInScope(Collection<String> zzhorgcdList) {
        doSetZzhorgcd_NotInScope(zzhorgcdList);
    }

    protected void doSetZzhorgcd_NotInScope(Collection<String> zzhorgcdList) {
        regINS(CK_NINS, cTL(zzhorgcdList), xgetCValueZzhorgcd(), "ZZHORGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZHORGCD: {varchar(255)} <br>
     * <pre>e.g. setZzhorgcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzhorgcd The value of zzhorgcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzhorgcd_LikeSearch(String zzhorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzhorgcd), xgetCValueZzhorgcd(), "ZZHORGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZHORGCD: {varchar(255)}
     * @param zzhorgcd The value of zzhorgcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzhorgcd_NotLikeSearch(String zzhorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzhorgcd), xgetCValueZzhorgcd(), "ZZHORGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZHORGCD: {varchar(255)}
     * @param zzhorgcd The value of zzhorgcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhorgcd_PrefixSearch(String zzhorgcd) {
        setZzhorgcd_LikeSearch(zzhorgcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZHORGCD: {varchar(255)}
     */
    public void setZzhorgcd_IsNull() { regZzhorgcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZHORGCD: {varchar(255)}
     */
    public void setZzhorgcd_IsNullOrEmpty() { regZzhorgcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZHORGCD: {varchar(255)}
     */
    public void setZzhorgcd_IsNotNull() { regZzhorgcd(CK_ISNN, DOBJ); }

    protected void regZzhorgcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzhorgcd(), "ZZHORGCD"); }
    protected abstract ConditionValue xgetCValueZzhorgcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(255)}
     * @param zzbasecd The value of zzbasecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_Equal(String zzbasecd) {
        doSetZzbasecd_Equal(fRES(zzbasecd));
    }

    protected void doSetZzbasecd_Equal(String zzbasecd) {
        regZzbasecd(CK_EQ, zzbasecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(255)}
     * @param zzbasecd The value of zzbasecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_NotEqual(String zzbasecd) {
        doSetZzbasecd_NotEqual(fRES(zzbasecd));
    }

    protected void doSetZzbasecd_NotEqual(String zzbasecd) {
        regZzbasecd(CK_NES, zzbasecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(255)}
     * @param zzbasecd The value of zzbasecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_GreaterThan(String zzbasecd) {
        regZzbasecd(CK_GT, fRES(zzbasecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(255)}
     * @param zzbasecd The value of zzbasecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_LessThan(String zzbasecd) {
        regZzbasecd(CK_LT, fRES(zzbasecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(255)}
     * @param zzbasecd The value of zzbasecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_GreaterEqual(String zzbasecd) {
        regZzbasecd(CK_GE, fRES(zzbasecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(255)}
     * @param zzbasecd The value of zzbasecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_LessEqual(String zzbasecd) {
        regZzbasecd(CK_LE, fRES(zzbasecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZBASECD: {varchar(255)}
     * @param zzbasecdList The collection of zzbasecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_InScope(Collection<String> zzbasecdList) {
        doSetZzbasecd_InScope(zzbasecdList);
    }

    protected void doSetZzbasecd_InScope(Collection<String> zzbasecdList) {
        regINS(CK_INS, cTL(zzbasecdList), xgetCValueZzbasecd(), "ZZBASECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZBASECD: {varchar(255)}
     * @param zzbasecdList The collection of zzbasecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_NotInScope(Collection<String> zzbasecdList) {
        doSetZzbasecd_NotInScope(zzbasecdList);
    }

    protected void doSetZzbasecd_NotInScope(Collection<String> zzbasecdList) {
        regINS(CK_NINS, cTL(zzbasecdList), xgetCValueZzbasecd(), "ZZBASECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZBASECD: {varchar(255)} <br>
     * <pre>e.g. setZzbasecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzbasecd The value of zzbasecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzbasecd_LikeSearch(String zzbasecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzbasecd), xgetCValueZzbasecd(), "ZZBASECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZBASECD: {varchar(255)}
     * @param zzbasecd The value of zzbasecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzbasecd_NotLikeSearch(String zzbasecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzbasecd), xgetCValueZzbasecd(), "ZZBASECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZBASECD: {varchar(255)}
     * @param zzbasecd The value of zzbasecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzbasecd_PrefixSearch(String zzbasecd) {
        setZzbasecd_LikeSearch(zzbasecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(255)}
     */
    public void setZzbasecd_IsNull() { regZzbasecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(255)}
     */
    public void setZzbasecd_IsNullOrEmpty() { regZzbasecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZBASECD: {varchar(255)}
     */
    public void setZzbasecd_IsNotNull() { regZzbasecd(CK_ISNN, DOBJ); }

    protected void regZzbasecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzbasecd(), "ZZBASECD"); }
    protected abstract ConditionValue xgetCValueZzbasecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSADMAG: {varchar(255)}
     * @param csadmag The value of csadmag as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsadmag_Equal(String csadmag) {
        doSetCsadmag_Equal(fRES(csadmag));
    }

    protected void doSetCsadmag_Equal(String csadmag) {
        regCsadmag(CK_EQ, csadmag);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSADMAG: {varchar(255)}
     * @param csadmag The value of csadmag as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsadmag_NotEqual(String csadmag) {
        doSetCsadmag_NotEqual(fRES(csadmag));
    }

    protected void doSetCsadmag_NotEqual(String csadmag) {
        regCsadmag(CK_NES, csadmag);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSADMAG: {varchar(255)}
     * @param csadmag The value of csadmag as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsadmag_GreaterThan(String csadmag) {
        regCsadmag(CK_GT, fRES(csadmag));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSADMAG: {varchar(255)}
     * @param csadmag The value of csadmag as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsadmag_LessThan(String csadmag) {
        regCsadmag(CK_LT, fRES(csadmag));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSADMAG: {varchar(255)}
     * @param csadmag The value of csadmag as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsadmag_GreaterEqual(String csadmag) {
        regCsadmag(CK_GE, fRES(csadmag));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSADMAG: {varchar(255)}
     * @param csadmag The value of csadmag as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsadmag_LessEqual(String csadmag) {
        regCsadmag(CK_LE, fRES(csadmag));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CSADMAG: {varchar(255)}
     * @param csadmagList The collection of csadmag as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsadmag_InScope(Collection<String> csadmagList) {
        doSetCsadmag_InScope(csadmagList);
    }

    protected void doSetCsadmag_InScope(Collection<String> csadmagList) {
        regINS(CK_INS, cTL(csadmagList), xgetCValueCsadmag(), "CSADMAG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CSADMAG: {varchar(255)}
     * @param csadmagList The collection of csadmag as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsadmag_NotInScope(Collection<String> csadmagList) {
        doSetCsadmag_NotInScope(csadmagList);
    }

    protected void doSetCsadmag_NotInScope(Collection<String> csadmagList) {
        regINS(CK_NINS, cTL(csadmagList), xgetCValueCsadmag(), "CSADMAG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CSADMAG: {varchar(255)} <br>
     * <pre>e.g. setCsadmag_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param csadmag The value of csadmag as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCsadmag_LikeSearch(String csadmag, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(csadmag), xgetCValueCsadmag(), "CSADMAG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CSADMAG: {varchar(255)}
     * @param csadmag The value of csadmag as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCsadmag_NotLikeSearch(String csadmag, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(csadmag), xgetCValueCsadmag(), "CSADMAG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CSADMAG: {varchar(255)}
     * @param csadmag The value of csadmag as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsadmag_PrefixSearch(String csadmag) {
        setCsadmag_LikeSearch(csadmag, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CSADMAG: {varchar(255)}
     */
    public void setCsadmag_IsNull() { regCsadmag(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CSADMAG: {varchar(255)}
     */
    public void setCsadmag_IsNullOrEmpty() { regCsadmag(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CSADMAG: {varchar(255)}
     */
    public void setCsadmag_IsNotNull() { regCsadmag(CK_ISNN, DOBJ); }

    protected void regCsadmag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCsadmag(), "CSADMAG"); }
    protected abstract ConditionValue xgetCValueCsadmag();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXOCD: {varchar(255)}
     * @param taxocd The value of taxocd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxocd_Equal(String taxocd) {
        doSetTaxocd_Equal(fRES(taxocd));
    }

    protected void doSetTaxocd_Equal(String taxocd) {
        regTaxocd(CK_EQ, taxocd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXOCD: {varchar(255)}
     * @param taxocd The value of taxocd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxocd_NotEqual(String taxocd) {
        doSetTaxocd_NotEqual(fRES(taxocd));
    }

    protected void doSetTaxocd_NotEqual(String taxocd) {
        regTaxocd(CK_NES, taxocd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXOCD: {varchar(255)}
     * @param taxocd The value of taxocd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxocd_GreaterThan(String taxocd) {
        regTaxocd(CK_GT, fRES(taxocd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXOCD: {varchar(255)}
     * @param taxocd The value of taxocd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxocd_LessThan(String taxocd) {
        regTaxocd(CK_LT, fRES(taxocd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXOCD: {varchar(255)}
     * @param taxocd The value of taxocd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxocd_GreaterEqual(String taxocd) {
        regTaxocd(CK_GE, fRES(taxocd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXOCD: {varchar(255)}
     * @param taxocd The value of taxocd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxocd_LessEqual(String taxocd) {
        regTaxocd(CK_LE, fRES(taxocd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAXOCD: {varchar(255)}
     * @param taxocdList The collection of taxocd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxocd_InScope(Collection<String> taxocdList) {
        doSetTaxocd_InScope(taxocdList);
    }

    protected void doSetTaxocd_InScope(Collection<String> taxocdList) {
        regINS(CK_INS, cTL(taxocdList), xgetCValueTaxocd(), "TAXOCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAXOCD: {varchar(255)}
     * @param taxocdList The collection of taxocd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxocd_NotInScope(Collection<String> taxocdList) {
        doSetTaxocd_NotInScope(taxocdList);
    }

    protected void doSetTaxocd_NotInScope(Collection<String> taxocdList) {
        regINS(CK_NINS, cTL(taxocdList), xgetCValueTaxocd(), "TAXOCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAXOCD: {varchar(255)} <br>
     * <pre>e.g. setTaxocd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param taxocd The value of taxocd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTaxocd_LikeSearch(String taxocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(taxocd), xgetCValueTaxocd(), "TAXOCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAXOCD: {varchar(255)}
     * @param taxocd The value of taxocd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTaxocd_NotLikeSearch(String taxocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(taxocd), xgetCValueTaxocd(), "TAXOCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAXOCD: {varchar(255)}
     * @param taxocd The value of taxocd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxocd_PrefixSearch(String taxocd) {
        setTaxocd_LikeSearch(taxocd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAXOCD: {varchar(255)}
     */
    public void setTaxocd_IsNull() { regTaxocd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TAXOCD: {varchar(255)}
     */
    public void setTaxocd_IsNullOrEmpty() { regTaxocd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAXOCD: {varchar(255)}
     */
    public void setTaxocd_IsNotNull() { regTaxocd(CK_ISNN, DOBJ); }

    protected void regTaxocd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaxocd(), "TAXOCD"); }
    protected abstract ConditionValue xgetCValueTaxocd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPTAXID: {varchar(60)}
     * @param uptaxid The value of uptaxid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUptaxid_Equal(String uptaxid) {
        doSetUptaxid_Equal(fRES(uptaxid));
    }

    protected void doSetUptaxid_Equal(String uptaxid) {
        regUptaxid(CK_EQ, uptaxid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPTAXID: {varchar(60)}
     * @param uptaxid The value of uptaxid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUptaxid_NotEqual(String uptaxid) {
        doSetUptaxid_NotEqual(fRES(uptaxid));
    }

    protected void doSetUptaxid_NotEqual(String uptaxid) {
        regUptaxid(CK_NES, uptaxid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPTAXID: {varchar(60)}
     * @param uptaxid The value of uptaxid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUptaxid_GreaterThan(String uptaxid) {
        regUptaxid(CK_GT, fRES(uptaxid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPTAXID: {varchar(60)}
     * @param uptaxid The value of uptaxid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUptaxid_LessThan(String uptaxid) {
        regUptaxid(CK_LT, fRES(uptaxid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPTAXID: {varchar(60)}
     * @param uptaxid The value of uptaxid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUptaxid_GreaterEqual(String uptaxid) {
        regUptaxid(CK_GE, fRES(uptaxid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPTAXID: {varchar(60)}
     * @param uptaxid The value of uptaxid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUptaxid_LessEqual(String uptaxid) {
        regUptaxid(CK_LE, fRES(uptaxid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPTAXID: {varchar(60)}
     * @param uptaxidList The collection of uptaxid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUptaxid_InScope(Collection<String> uptaxidList) {
        doSetUptaxid_InScope(uptaxidList);
    }

    protected void doSetUptaxid_InScope(Collection<String> uptaxidList) {
        regINS(CK_INS, cTL(uptaxidList), xgetCValueUptaxid(), "UPTAXID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPTAXID: {varchar(60)}
     * @param uptaxidList The collection of uptaxid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUptaxid_NotInScope(Collection<String> uptaxidList) {
        doSetUptaxid_NotInScope(uptaxidList);
    }

    protected void doSetUptaxid_NotInScope(Collection<String> uptaxidList) {
        regINS(CK_NINS, cTL(uptaxidList), xgetCValueUptaxid(), "UPTAXID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPTAXID: {varchar(60)} <br>
     * <pre>e.g. setUptaxid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uptaxid The value of uptaxid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUptaxid_LikeSearch(String uptaxid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uptaxid), xgetCValueUptaxid(), "UPTAXID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPTAXID: {varchar(60)}
     * @param uptaxid The value of uptaxid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUptaxid_NotLikeSearch(String uptaxid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uptaxid), xgetCValueUptaxid(), "UPTAXID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPTAXID: {varchar(60)}
     * @param uptaxid The value of uptaxid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUptaxid_PrefixSearch(String uptaxid) {
        setUptaxid_LikeSearch(uptaxid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPTAXID: {varchar(60)}
     */
    public void setUptaxid_IsNull() { regUptaxid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPTAXID: {varchar(60)}
     */
    public void setUptaxid_IsNullOrEmpty() { regUptaxid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPTAXID: {varchar(60)}
     */
    public void setUptaxid_IsNotNull() { regUptaxid(CK_ISNN, DOBJ); }

    protected void regUptaxid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUptaxid(), "UPTAXID"); }
    protected abstract ConditionValue xgetCValueUptaxid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATCID: {varchar(60)}
     * @param statcid The value of statcid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatcid_Equal(String statcid) {
        doSetStatcid_Equal(fRES(statcid));
    }

    protected void doSetStatcid_Equal(String statcid) {
        regStatcid(CK_EQ, statcid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATCID: {varchar(60)}
     * @param statcid The value of statcid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatcid_NotEqual(String statcid) {
        doSetStatcid_NotEqual(fRES(statcid));
    }

    protected void doSetStatcid_NotEqual(String statcid) {
        regStatcid(CK_NES, statcid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATCID: {varchar(60)}
     * @param statcid The value of statcid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatcid_GreaterThan(String statcid) {
        regStatcid(CK_GT, fRES(statcid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATCID: {varchar(60)}
     * @param statcid The value of statcid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatcid_LessThan(String statcid) {
        regStatcid(CK_LT, fRES(statcid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATCID: {varchar(60)}
     * @param statcid The value of statcid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatcid_GreaterEqual(String statcid) {
        regStatcid(CK_GE, fRES(statcid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATCID: {varchar(60)}
     * @param statcid The value of statcid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatcid_LessEqual(String statcid) {
        regStatcid(CK_LE, fRES(statcid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STATCID: {varchar(60)}
     * @param statcidList The collection of statcid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatcid_InScope(Collection<String> statcidList) {
        doSetStatcid_InScope(statcidList);
    }

    protected void doSetStatcid_InScope(Collection<String> statcidList) {
        regINS(CK_INS, cTL(statcidList), xgetCValueStatcid(), "STATCID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STATCID: {varchar(60)}
     * @param statcidList The collection of statcid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatcid_NotInScope(Collection<String> statcidList) {
        doSetStatcid_NotInScope(statcidList);
    }

    protected void doSetStatcid_NotInScope(Collection<String> statcidList) {
        regINS(CK_NINS, cTL(statcidList), xgetCValueStatcid(), "STATCID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATCID: {varchar(60)} <br>
     * <pre>e.g. setStatcid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param statcid The value of statcid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStatcid_LikeSearch(String statcid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(statcid), xgetCValueStatcid(), "STATCID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATCID: {varchar(60)}
     * @param statcid The value of statcid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStatcid_NotLikeSearch(String statcid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(statcid), xgetCValueStatcid(), "STATCID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATCID: {varchar(60)}
     * @param statcid The value of statcid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatcid_PrefixSearch(String statcid) {
        setStatcid_LikeSearch(statcid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STATCID: {varchar(60)}
     */
    public void setStatcid_IsNull() { regStatcid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STATCID: {varchar(60)}
     */
    public void setStatcid_IsNullOrEmpty() { regStatcid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STATCID: {varchar(60)}
     */
    public void setStatcid_IsNotNull() { regStatcid(CK_ISNN, DOBJ); }

    protected void regStatcid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStatcid(), "STATCID"); }
    protected abstract ConditionValue xgetCValueStatcid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STLNDID: {varchar(60)}
     * @param stlndid The value of stlndid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStlndid_Equal(String stlndid) {
        doSetStlndid_Equal(fRES(stlndid));
    }

    protected void doSetStlndid_Equal(String stlndid) {
        regStlndid(CK_EQ, stlndid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STLNDID: {varchar(60)}
     * @param stlndid The value of stlndid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStlndid_NotEqual(String stlndid) {
        doSetStlndid_NotEqual(fRES(stlndid));
    }

    protected void doSetStlndid_NotEqual(String stlndid) {
        regStlndid(CK_NES, stlndid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STLNDID: {varchar(60)}
     * @param stlndid The value of stlndid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStlndid_GreaterThan(String stlndid) {
        regStlndid(CK_GT, fRES(stlndid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STLNDID: {varchar(60)}
     * @param stlndid The value of stlndid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStlndid_LessThan(String stlndid) {
        regStlndid(CK_LT, fRES(stlndid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STLNDID: {varchar(60)}
     * @param stlndid The value of stlndid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStlndid_GreaterEqual(String stlndid) {
        regStlndid(CK_GE, fRES(stlndid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STLNDID: {varchar(60)}
     * @param stlndid The value of stlndid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStlndid_LessEqual(String stlndid) {
        regStlndid(CK_LE, fRES(stlndid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STLNDID: {varchar(60)}
     * @param stlndidList The collection of stlndid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStlndid_InScope(Collection<String> stlndidList) {
        doSetStlndid_InScope(stlndidList);
    }

    protected void doSetStlndid_InScope(Collection<String> stlndidList) {
        regINS(CK_INS, cTL(stlndidList), xgetCValueStlndid(), "STLNDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STLNDID: {varchar(60)}
     * @param stlndidList The collection of stlndid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStlndid_NotInScope(Collection<String> stlndidList) {
        doSetStlndid_NotInScope(stlndidList);
    }

    protected void doSetStlndid_NotInScope(Collection<String> stlndidList) {
        regINS(CK_NINS, cTL(stlndidList), xgetCValueStlndid(), "STLNDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STLNDID: {varchar(60)} <br>
     * <pre>e.g. setStlndid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stlndid The value of stlndid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStlndid_LikeSearch(String stlndid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stlndid), xgetCValueStlndid(), "STLNDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STLNDID: {varchar(60)}
     * @param stlndid The value of stlndid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStlndid_NotLikeSearch(String stlndid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stlndid), xgetCValueStlndid(), "STLNDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STLNDID: {varchar(60)}
     * @param stlndid The value of stlndid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStlndid_PrefixSearch(String stlndid) {
        setStlndid_LikeSearch(stlndid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STLNDID: {varchar(60)}
     */
    public void setStlndid_IsNull() { regStlndid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STLNDID: {varchar(60)}
     */
    public void setStlndid_IsNullOrEmpty() { regStlndid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STLNDID: {varchar(60)}
     */
    public void setStlndid_IsNotNull() { regStlndid(CK_ISNN, DOBJ); }

    protected void regStlndid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStlndid(), "STLNDID"); }
    protected abstract ConditionValue xgetCValueStlndid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(60)}
     * @param zzwhmgid The value of zzwhmgid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_Equal(String zzwhmgid) {
        doSetZzwhmgid_Equal(fRES(zzwhmgid));
    }

    protected void doSetZzwhmgid_Equal(String zzwhmgid) {
        regZzwhmgid(CK_EQ, zzwhmgid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(60)}
     * @param zzwhmgid The value of zzwhmgid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_NotEqual(String zzwhmgid) {
        doSetZzwhmgid_NotEqual(fRES(zzwhmgid));
    }

    protected void doSetZzwhmgid_NotEqual(String zzwhmgid) {
        regZzwhmgid(CK_NES, zzwhmgid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(60)}
     * @param zzwhmgid The value of zzwhmgid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_GreaterThan(String zzwhmgid) {
        regZzwhmgid(CK_GT, fRES(zzwhmgid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(60)}
     * @param zzwhmgid The value of zzwhmgid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_LessThan(String zzwhmgid) {
        regZzwhmgid(CK_LT, fRES(zzwhmgid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(60)}
     * @param zzwhmgid The value of zzwhmgid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_GreaterEqual(String zzwhmgid) {
        regZzwhmgid(CK_GE, fRES(zzwhmgid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(60)}
     * @param zzwhmgid The value of zzwhmgid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_LessEqual(String zzwhmgid) {
        regZzwhmgid(CK_LE, fRES(zzwhmgid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZWHMGID: {varchar(60)}
     * @param zzwhmgidList The collection of zzwhmgid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_InScope(Collection<String> zzwhmgidList) {
        doSetZzwhmgid_InScope(zzwhmgidList);
    }

    protected void doSetZzwhmgid_InScope(Collection<String> zzwhmgidList) {
        regINS(CK_INS, cTL(zzwhmgidList), xgetCValueZzwhmgid(), "ZZWHMGID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZWHMGID: {varchar(60)}
     * @param zzwhmgidList The collection of zzwhmgid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_NotInScope(Collection<String> zzwhmgidList) {
        doSetZzwhmgid_NotInScope(zzwhmgidList);
    }

    protected void doSetZzwhmgid_NotInScope(Collection<String> zzwhmgidList) {
        regINS(CK_NINS, cTL(zzwhmgidList), xgetCValueZzwhmgid(), "ZZWHMGID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZWHMGID: {varchar(60)} <br>
     * <pre>e.g. setZzwhmgid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzwhmgid The value of zzwhmgid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzwhmgid_LikeSearch(String zzwhmgid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzwhmgid), xgetCValueZzwhmgid(), "ZZWHMGID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZWHMGID: {varchar(60)}
     * @param zzwhmgid The value of zzwhmgid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzwhmgid_NotLikeSearch(String zzwhmgid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzwhmgid), xgetCValueZzwhmgid(), "ZZWHMGID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZWHMGID: {varchar(60)}
     * @param zzwhmgid The value of zzwhmgid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwhmgid_PrefixSearch(String zzwhmgid) {
        setZzwhmgid_LikeSearch(zzwhmgid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(60)}
     */
    public void setZzwhmgid_IsNull() { regZzwhmgid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(60)}
     */
    public void setZzwhmgid_IsNullOrEmpty() { regZzwhmgid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZWHMGID: {varchar(60)}
     */
    public void setZzwhmgid_IsNotNull() { regZzwhmgid(CK_ISNN, DOBJ); }

    protected void regZzwhmgid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzwhmgid(), "ZZWHMGID"); }
    protected abstract ConditionValue xgetCValueZzwhmgid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSCPNM: {varchar(100)}
     * @param tscpnm The value of tscpnm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTscpnm_Equal(String tscpnm) {
        doSetTscpnm_Equal(fRES(tscpnm));
    }

    protected void doSetTscpnm_Equal(String tscpnm) {
        regTscpnm(CK_EQ, tscpnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSCPNM: {varchar(100)}
     * @param tscpnm The value of tscpnm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTscpnm_NotEqual(String tscpnm) {
        doSetTscpnm_NotEqual(fRES(tscpnm));
    }

    protected void doSetTscpnm_NotEqual(String tscpnm) {
        regTscpnm(CK_NES, tscpnm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSCPNM: {varchar(100)}
     * @param tscpnm The value of tscpnm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTscpnm_GreaterThan(String tscpnm) {
        regTscpnm(CK_GT, fRES(tscpnm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSCPNM: {varchar(100)}
     * @param tscpnm The value of tscpnm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTscpnm_LessThan(String tscpnm) {
        regTscpnm(CK_LT, fRES(tscpnm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSCPNM: {varchar(100)}
     * @param tscpnm The value of tscpnm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTscpnm_GreaterEqual(String tscpnm) {
        regTscpnm(CK_GE, fRES(tscpnm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSCPNM: {varchar(100)}
     * @param tscpnm The value of tscpnm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTscpnm_LessEqual(String tscpnm) {
        regTscpnm(CK_LE, fRES(tscpnm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TSCPNM: {varchar(100)}
     * @param tscpnmList The collection of tscpnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTscpnm_InScope(Collection<String> tscpnmList) {
        doSetTscpnm_InScope(tscpnmList);
    }

    protected void doSetTscpnm_InScope(Collection<String> tscpnmList) {
        regINS(CK_INS, cTL(tscpnmList), xgetCValueTscpnm(), "TSCPNM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TSCPNM: {varchar(100)}
     * @param tscpnmList The collection of tscpnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTscpnm_NotInScope(Collection<String> tscpnmList) {
        doSetTscpnm_NotInScope(tscpnmList);
    }

    protected void doSetTscpnm_NotInScope(Collection<String> tscpnmList) {
        regINS(CK_NINS, cTL(tscpnmList), xgetCValueTscpnm(), "TSCPNM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TSCPNM: {varchar(100)} <br>
     * <pre>e.g. setTscpnm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tscpnm The value of tscpnm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTscpnm_LikeSearch(String tscpnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tscpnm), xgetCValueTscpnm(), "TSCPNM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TSCPNM: {varchar(100)}
     * @param tscpnm The value of tscpnm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTscpnm_NotLikeSearch(String tscpnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tscpnm), xgetCValueTscpnm(), "TSCPNM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TSCPNM: {varchar(100)}
     * @param tscpnm The value of tscpnm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTscpnm_PrefixSearch(String tscpnm) {
        setTscpnm_LikeSearch(tscpnm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TSCPNM: {varchar(100)}
     */
    public void setTscpnm_IsNull() { regTscpnm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TSCPNM: {varchar(100)}
     */
    public void setTscpnm_IsNullOrEmpty() { regTscpnm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TSCPNM: {varchar(100)}
     */
    public void setTscpnm_IsNotNull() { regTscpnm(CK_ISNN, DOBJ); }

    protected void regTscpnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTscpnm(), "TSCPNM"); }
    protected abstract ConditionValue xgetCValueTscpnm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPCD: {varchar(100)}
     * @param depcd The value of depcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepcd_Equal(String depcd) {
        doSetDepcd_Equal(fRES(depcd));
    }

    protected void doSetDepcd_Equal(String depcd) {
        regDepcd(CK_EQ, depcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPCD: {varchar(100)}
     * @param depcd The value of depcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepcd_NotEqual(String depcd) {
        doSetDepcd_NotEqual(fRES(depcd));
    }

    protected void doSetDepcd_NotEqual(String depcd) {
        regDepcd(CK_NES, depcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPCD: {varchar(100)}
     * @param depcd The value of depcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepcd_GreaterThan(String depcd) {
        regDepcd(CK_GT, fRES(depcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPCD: {varchar(100)}
     * @param depcd The value of depcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepcd_LessThan(String depcd) {
        regDepcd(CK_LT, fRES(depcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPCD: {varchar(100)}
     * @param depcd The value of depcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepcd_GreaterEqual(String depcd) {
        regDepcd(CK_GE, fRES(depcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPCD: {varchar(100)}
     * @param depcd The value of depcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepcd_LessEqual(String depcd) {
        regDepcd(CK_LE, fRES(depcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPCD: {varchar(100)}
     * @param depcdList The collection of depcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepcd_InScope(Collection<String> depcdList) {
        doSetDepcd_InScope(depcdList);
    }

    protected void doSetDepcd_InScope(Collection<String> depcdList) {
        regINS(CK_INS, cTL(depcdList), xgetCValueDepcd(), "DEPCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPCD: {varchar(100)}
     * @param depcdList The collection of depcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepcd_NotInScope(Collection<String> depcdList) {
        doSetDepcd_NotInScope(depcdList);
    }

    protected void doSetDepcd_NotInScope(Collection<String> depcdList) {
        regINS(CK_NINS, cTL(depcdList), xgetCValueDepcd(), "DEPCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPCD: {varchar(100)} <br>
     * <pre>e.g. setDepcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param depcd The value of depcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDepcd_LikeSearch(String depcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(depcd), xgetCValueDepcd(), "DEPCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPCD: {varchar(100)}
     * @param depcd The value of depcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDepcd_NotLikeSearch(String depcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(depcd), xgetCValueDepcd(), "DEPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPCD: {varchar(100)}
     * @param depcd The value of depcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepcd_PrefixSearch(String depcd) {
        setDepcd_LikeSearch(depcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEPCD: {varchar(100)}
     */
    public void setDepcd_IsNull() { regDepcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DEPCD: {varchar(100)}
     */
    public void setDepcd_IsNullOrEmpty() { regDepcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEPCD: {varchar(100)}
     */
    public void setDepcd_IsNotNull() { regDepcd(CK_ISNN, DOBJ); }

    protected void regDepcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDepcd(), "DEPCD"); }
    protected abstract ConditionValue xgetCValueDepcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNLID: {varchar(100)}
     * @param cnlid The value of cnlid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnlid_Equal(String cnlid) {
        doSetCnlid_Equal(fRES(cnlid));
    }

    protected void doSetCnlid_Equal(String cnlid) {
        regCnlid(CK_EQ, cnlid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNLID: {varchar(100)}
     * @param cnlid The value of cnlid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnlid_NotEqual(String cnlid) {
        doSetCnlid_NotEqual(fRES(cnlid));
    }

    protected void doSetCnlid_NotEqual(String cnlid) {
        regCnlid(CK_NES, cnlid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNLID: {varchar(100)}
     * @param cnlid The value of cnlid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnlid_GreaterThan(String cnlid) {
        regCnlid(CK_GT, fRES(cnlid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNLID: {varchar(100)}
     * @param cnlid The value of cnlid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnlid_LessThan(String cnlid) {
        regCnlid(CK_LT, fRES(cnlid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNLID: {varchar(100)}
     * @param cnlid The value of cnlid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnlid_GreaterEqual(String cnlid) {
        regCnlid(CK_GE, fRES(cnlid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNLID: {varchar(100)}
     * @param cnlid The value of cnlid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnlid_LessEqual(String cnlid) {
        regCnlid(CK_LE, fRES(cnlid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CNLID: {varchar(100)}
     * @param cnlidList The collection of cnlid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnlid_InScope(Collection<String> cnlidList) {
        doSetCnlid_InScope(cnlidList);
    }

    protected void doSetCnlid_InScope(Collection<String> cnlidList) {
        regINS(CK_INS, cTL(cnlidList), xgetCValueCnlid(), "CNLID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CNLID: {varchar(100)}
     * @param cnlidList The collection of cnlid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnlid_NotInScope(Collection<String> cnlidList) {
        doSetCnlid_NotInScope(cnlidList);
    }

    protected void doSetCnlid_NotInScope(Collection<String> cnlidList) {
        regINS(CK_NINS, cTL(cnlidList), xgetCValueCnlid(), "CNLID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNLID: {varchar(100)} <br>
     * <pre>e.g. setCnlid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cnlid The value of cnlid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCnlid_LikeSearch(String cnlid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cnlid), xgetCValueCnlid(), "CNLID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNLID: {varchar(100)}
     * @param cnlid The value of cnlid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCnlid_NotLikeSearch(String cnlid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cnlid), xgetCValueCnlid(), "CNLID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNLID: {varchar(100)}
     * @param cnlid The value of cnlid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnlid_PrefixSearch(String cnlid) {
        setCnlid_LikeSearch(cnlid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CNLID: {varchar(100)}
     */
    public void setCnlid_IsNull() { regCnlid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CNLID: {varchar(100)}
     */
    public void setCnlid_IsNullOrEmpty() { regCnlid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CNLID: {varchar(100)}
     */
    public void setCnlid_IsNotNull() { regCnlid(CK_ISNN, DOBJ); }

    protected void regCnlid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCnlid(), "CNLID"); }
    protected abstract ConditionValue xgetCValueCnlid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {varchar(100)}
     * @param otrnk The value of otrnk as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtrnk_Equal(String otrnk) {
        doSetOtrnk_Equal(fRES(otrnk));
    }

    protected void doSetOtrnk_Equal(String otrnk) {
        regOtrnk(CK_EQ, otrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {varchar(100)}
     * @param otrnk The value of otrnk as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtrnk_NotEqual(String otrnk) {
        doSetOtrnk_NotEqual(fRES(otrnk));
    }

    protected void doSetOtrnk_NotEqual(String otrnk) {
        regOtrnk(CK_NES, otrnk);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {varchar(100)}
     * @param otrnk The value of otrnk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtrnk_GreaterThan(String otrnk) {
        regOtrnk(CK_GT, fRES(otrnk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {varchar(100)}
     * @param otrnk The value of otrnk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtrnk_LessThan(String otrnk) {
        regOtrnk(CK_LT, fRES(otrnk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {varchar(100)}
     * @param otrnk The value of otrnk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtrnk_GreaterEqual(String otrnk) {
        regOtrnk(CK_GE, fRES(otrnk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {varchar(100)}
     * @param otrnk The value of otrnk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtrnk_LessEqual(String otrnk) {
        regOtrnk(CK_LE, fRES(otrnk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTRNK: {varchar(100)}
     * @param otrnkList The collection of otrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtrnk_InScope(Collection<String> otrnkList) {
        doSetOtrnk_InScope(otrnkList);
    }

    protected void doSetOtrnk_InScope(Collection<String> otrnkList) {
        regINS(CK_INS, cTL(otrnkList), xgetCValueOtrnk(), "OTRNK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTRNK: {varchar(100)}
     * @param otrnkList The collection of otrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtrnk_NotInScope(Collection<String> otrnkList) {
        doSetOtrnk_NotInScope(otrnkList);
    }

    protected void doSetOtrnk_NotInScope(Collection<String> otrnkList) {
        regINS(CK_NINS, cTL(otrnkList), xgetCValueOtrnk(), "OTRNK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTRNK: {varchar(100)} <br>
     * <pre>e.g. setOtrnk_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otrnk The value of otrnk as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtrnk_LikeSearch(String otrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otrnk), xgetCValueOtrnk(), "OTRNK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTRNK: {varchar(100)}
     * @param otrnk The value of otrnk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtrnk_NotLikeSearch(String otrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otrnk), xgetCValueOtrnk(), "OTRNK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTRNK: {varchar(100)}
     * @param otrnk The value of otrnk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtrnk_PrefixSearch(String otrnk) {
        setOtrnk_LikeSearch(otrnk, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTRNK: {varchar(100)}
     */
    public void setOtrnk_IsNull() { regOtrnk(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTRNK: {varchar(100)}
     */
    public void setOtrnk_IsNullOrEmpty() { regOtrnk(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTRNK: {varchar(100)}
     */
    public void setOtrnk_IsNotNull() { regOtrnk(CK_ISNN, DOBJ); }

    protected void regOtrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtrnk(), "OTRNK"); }
    protected abstract ConditionValue xgetCValueOtrnk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID1: {varchar(100)}
     * @param orattid1 The value of orattid1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid1_Equal(String orattid1) {
        doSetOrattid1_Equal(fRES(orattid1));
    }

    protected void doSetOrattid1_Equal(String orattid1) {
        regOrattid1(CK_EQ, orattid1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID1: {varchar(100)}
     * @param orattid1 The value of orattid1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid1_NotEqual(String orattid1) {
        doSetOrattid1_NotEqual(fRES(orattid1));
    }

    protected void doSetOrattid1_NotEqual(String orattid1) {
        regOrattid1(CK_NES, orattid1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID1: {varchar(100)}
     * @param orattid1 The value of orattid1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid1_GreaterThan(String orattid1) {
        regOrattid1(CK_GT, fRES(orattid1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID1: {varchar(100)}
     * @param orattid1 The value of orattid1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid1_LessThan(String orattid1) {
        regOrattid1(CK_LT, fRES(orattid1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID1: {varchar(100)}
     * @param orattid1 The value of orattid1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid1_GreaterEqual(String orattid1) {
        regOrattid1(CK_GE, fRES(orattid1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID1: {varchar(100)}
     * @param orattid1 The value of orattid1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid1_LessEqual(String orattid1) {
        regOrattid1(CK_LE, fRES(orattid1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORATTID1: {varchar(100)}
     * @param orattid1List The collection of orattid1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid1_InScope(Collection<String> orattid1List) {
        doSetOrattid1_InScope(orattid1List);
    }

    protected void doSetOrattid1_InScope(Collection<String> orattid1List) {
        regINS(CK_INS, cTL(orattid1List), xgetCValueOrattid1(), "ORATTID1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORATTID1: {varchar(100)}
     * @param orattid1List The collection of orattid1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid1_NotInScope(Collection<String> orattid1List) {
        doSetOrattid1_NotInScope(orattid1List);
    }

    protected void doSetOrattid1_NotInScope(Collection<String> orattid1List) {
        regINS(CK_NINS, cTL(orattid1List), xgetCValueOrattid1(), "ORATTID1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORATTID1: {varchar(100)} <br>
     * <pre>e.g. setOrattid1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orattid1 The value of orattid1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrattid1_LikeSearch(String orattid1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orattid1), xgetCValueOrattid1(), "ORATTID1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORATTID1: {varchar(100)}
     * @param orattid1 The value of orattid1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrattid1_NotLikeSearch(String orattid1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orattid1), xgetCValueOrattid1(), "ORATTID1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORATTID1: {varchar(100)}
     * @param orattid1 The value of orattid1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid1_PrefixSearch(String orattid1) {
        setOrattid1_LikeSearch(orattid1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORATTID1: {varchar(100)}
     */
    public void setOrattid1_IsNull() { regOrattid1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORATTID1: {varchar(100)}
     */
    public void setOrattid1_IsNullOrEmpty() { regOrattid1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORATTID1: {varchar(100)}
     */
    public void setOrattid1_IsNotNull() { regOrattid1(CK_ISNN, DOBJ); }

    protected void regOrattid1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrattid1(), "ORATTID1"); }
    protected abstract ConditionValue xgetCValueOrattid1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID2: {varchar(100)}
     * @param orattid2 The value of orattid2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid2_Equal(String orattid2) {
        doSetOrattid2_Equal(fRES(orattid2));
    }

    protected void doSetOrattid2_Equal(String orattid2) {
        regOrattid2(CK_EQ, orattid2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID2: {varchar(100)}
     * @param orattid2 The value of orattid2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid2_NotEqual(String orattid2) {
        doSetOrattid2_NotEqual(fRES(orattid2));
    }

    protected void doSetOrattid2_NotEqual(String orattid2) {
        regOrattid2(CK_NES, orattid2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID2: {varchar(100)}
     * @param orattid2 The value of orattid2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid2_GreaterThan(String orattid2) {
        regOrattid2(CK_GT, fRES(orattid2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID2: {varchar(100)}
     * @param orattid2 The value of orattid2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid2_LessThan(String orattid2) {
        regOrattid2(CK_LT, fRES(orattid2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID2: {varchar(100)}
     * @param orattid2 The value of orattid2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid2_GreaterEqual(String orattid2) {
        regOrattid2(CK_GE, fRES(orattid2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID2: {varchar(100)}
     * @param orattid2 The value of orattid2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid2_LessEqual(String orattid2) {
        regOrattid2(CK_LE, fRES(orattid2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORATTID2: {varchar(100)}
     * @param orattid2List The collection of orattid2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid2_InScope(Collection<String> orattid2List) {
        doSetOrattid2_InScope(orattid2List);
    }

    protected void doSetOrattid2_InScope(Collection<String> orattid2List) {
        regINS(CK_INS, cTL(orattid2List), xgetCValueOrattid2(), "ORATTID2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORATTID2: {varchar(100)}
     * @param orattid2List The collection of orattid2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid2_NotInScope(Collection<String> orattid2List) {
        doSetOrattid2_NotInScope(orattid2List);
    }

    protected void doSetOrattid2_NotInScope(Collection<String> orattid2List) {
        regINS(CK_NINS, cTL(orattid2List), xgetCValueOrattid2(), "ORATTID2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORATTID2: {varchar(100)} <br>
     * <pre>e.g. setOrattid2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orattid2 The value of orattid2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrattid2_LikeSearch(String orattid2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orattid2), xgetCValueOrattid2(), "ORATTID2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORATTID2: {varchar(100)}
     * @param orattid2 The value of orattid2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrattid2_NotLikeSearch(String orattid2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orattid2), xgetCValueOrattid2(), "ORATTID2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORATTID2: {varchar(100)}
     * @param orattid2 The value of orattid2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid2_PrefixSearch(String orattid2) {
        setOrattid2_LikeSearch(orattid2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORATTID2: {varchar(100)}
     */
    public void setOrattid2_IsNull() { regOrattid2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORATTID2: {varchar(100)}
     */
    public void setOrattid2_IsNullOrEmpty() { regOrattid2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORATTID2: {varchar(100)}
     */
    public void setOrattid2_IsNotNull() { regOrattid2(CK_ISNN, DOBJ); }

    protected void regOrattid2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrattid2(), "ORATTID2"); }
    protected abstract ConditionValue xgetCValueOrattid2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID3: {varchar(100)}
     * @param orattid3 The value of orattid3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid3_Equal(String orattid3) {
        doSetOrattid3_Equal(fRES(orattid3));
    }

    protected void doSetOrattid3_Equal(String orattid3) {
        regOrattid3(CK_EQ, orattid3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID3: {varchar(100)}
     * @param orattid3 The value of orattid3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid3_NotEqual(String orattid3) {
        doSetOrattid3_NotEqual(fRES(orattid3));
    }

    protected void doSetOrattid3_NotEqual(String orattid3) {
        regOrattid3(CK_NES, orattid3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID3: {varchar(100)}
     * @param orattid3 The value of orattid3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid3_GreaterThan(String orattid3) {
        regOrattid3(CK_GT, fRES(orattid3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID3: {varchar(100)}
     * @param orattid3 The value of orattid3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid3_LessThan(String orattid3) {
        regOrattid3(CK_LT, fRES(orattid3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID3: {varchar(100)}
     * @param orattid3 The value of orattid3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid3_GreaterEqual(String orattid3) {
        regOrattid3(CK_GE, fRES(orattid3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID3: {varchar(100)}
     * @param orattid3 The value of orattid3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid3_LessEqual(String orattid3) {
        regOrattid3(CK_LE, fRES(orattid3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORATTID3: {varchar(100)}
     * @param orattid3List The collection of orattid3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid3_InScope(Collection<String> orattid3List) {
        doSetOrattid3_InScope(orattid3List);
    }

    protected void doSetOrattid3_InScope(Collection<String> orattid3List) {
        regINS(CK_INS, cTL(orattid3List), xgetCValueOrattid3(), "ORATTID3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORATTID3: {varchar(100)}
     * @param orattid3List The collection of orattid3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid3_NotInScope(Collection<String> orattid3List) {
        doSetOrattid3_NotInScope(orattid3List);
    }

    protected void doSetOrattid3_NotInScope(Collection<String> orattid3List) {
        regINS(CK_NINS, cTL(orattid3List), xgetCValueOrattid3(), "ORATTID3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORATTID3: {varchar(100)} <br>
     * <pre>e.g. setOrattid3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orattid3 The value of orattid3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrattid3_LikeSearch(String orattid3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orattid3), xgetCValueOrattid3(), "ORATTID3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORATTID3: {varchar(100)}
     * @param orattid3 The value of orattid3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrattid3_NotLikeSearch(String orattid3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orattid3), xgetCValueOrattid3(), "ORATTID3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORATTID3: {varchar(100)}
     * @param orattid3 The value of orattid3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid3_PrefixSearch(String orattid3) {
        setOrattid3_LikeSearch(orattid3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORATTID3: {varchar(100)}
     */
    public void setOrattid3_IsNull() { regOrattid3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORATTID3: {varchar(100)}
     */
    public void setOrattid3_IsNullOrEmpty() { regOrattid3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORATTID3: {varchar(100)}
     */
    public void setOrattid3_IsNotNull() { regOrattid3(CK_ISNN, DOBJ); }

    protected void regOrattid3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrattid3(), "ORATTID3"); }
    protected abstract ConditionValue xgetCValueOrattid3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID1: {varchar(100)}
     * @param attid1 The value of attid1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid1_Equal(String attid1) {
        doSetAttid1_Equal(fRES(attid1));
    }

    protected void doSetAttid1_Equal(String attid1) {
        regAttid1(CK_EQ, attid1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID1: {varchar(100)}
     * @param attid1 The value of attid1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid1_NotEqual(String attid1) {
        doSetAttid1_NotEqual(fRES(attid1));
    }

    protected void doSetAttid1_NotEqual(String attid1) {
        regAttid1(CK_NES, attid1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID1: {varchar(100)}
     * @param attid1 The value of attid1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid1_GreaterThan(String attid1) {
        regAttid1(CK_GT, fRES(attid1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID1: {varchar(100)}
     * @param attid1 The value of attid1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid1_LessThan(String attid1) {
        regAttid1(CK_LT, fRES(attid1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID1: {varchar(100)}
     * @param attid1 The value of attid1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid1_GreaterEqual(String attid1) {
        regAttid1(CK_GE, fRES(attid1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID1: {varchar(100)}
     * @param attid1 The value of attid1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid1_LessEqual(String attid1) {
        regAttid1(CK_LE, fRES(attid1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTID1: {varchar(100)}
     * @param attid1List The collection of attid1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid1_InScope(Collection<String> attid1List) {
        doSetAttid1_InScope(attid1List);
    }

    protected void doSetAttid1_InScope(Collection<String> attid1List) {
        regINS(CK_INS, cTL(attid1List), xgetCValueAttid1(), "ATTID1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTID1: {varchar(100)}
     * @param attid1List The collection of attid1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid1_NotInScope(Collection<String> attid1List) {
        doSetAttid1_NotInScope(attid1List);
    }

    protected void doSetAttid1_NotInScope(Collection<String> attid1List) {
        regINS(CK_NINS, cTL(attid1List), xgetCValueAttid1(), "ATTID1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTID1: {varchar(100)} <br>
     * <pre>e.g. setAttid1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param attid1 The value of attid1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAttid1_LikeSearch(String attid1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(attid1), xgetCValueAttid1(), "ATTID1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTID1: {varchar(100)}
     * @param attid1 The value of attid1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAttid1_NotLikeSearch(String attid1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(attid1), xgetCValueAttid1(), "ATTID1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTID1: {varchar(100)}
     * @param attid1 The value of attid1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid1_PrefixSearch(String attid1) {
        setAttid1_LikeSearch(attid1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ATTID1: {varchar(100)}
     */
    public void setAttid1_IsNull() { regAttid1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ATTID1: {varchar(100)}
     */
    public void setAttid1_IsNullOrEmpty() { regAttid1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ATTID1: {varchar(100)}
     */
    public void setAttid1_IsNotNull() { regAttid1(CK_ISNN, DOBJ); }

    protected void regAttid1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAttid1(), "ATTID1"); }
    protected abstract ConditionValue xgetCValueAttid1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID2: {varchar(100)}
     * @param attid2 The value of attid2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid2_Equal(String attid2) {
        doSetAttid2_Equal(fRES(attid2));
    }

    protected void doSetAttid2_Equal(String attid2) {
        regAttid2(CK_EQ, attid2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID2: {varchar(100)}
     * @param attid2 The value of attid2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid2_NotEqual(String attid2) {
        doSetAttid2_NotEqual(fRES(attid2));
    }

    protected void doSetAttid2_NotEqual(String attid2) {
        regAttid2(CK_NES, attid2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID2: {varchar(100)}
     * @param attid2 The value of attid2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid2_GreaterThan(String attid2) {
        regAttid2(CK_GT, fRES(attid2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID2: {varchar(100)}
     * @param attid2 The value of attid2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid2_LessThan(String attid2) {
        regAttid2(CK_LT, fRES(attid2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID2: {varchar(100)}
     * @param attid2 The value of attid2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid2_GreaterEqual(String attid2) {
        regAttid2(CK_GE, fRES(attid2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID2: {varchar(100)}
     * @param attid2 The value of attid2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid2_LessEqual(String attid2) {
        regAttid2(CK_LE, fRES(attid2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTID2: {varchar(100)}
     * @param attid2List The collection of attid2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid2_InScope(Collection<String> attid2List) {
        doSetAttid2_InScope(attid2List);
    }

    protected void doSetAttid2_InScope(Collection<String> attid2List) {
        regINS(CK_INS, cTL(attid2List), xgetCValueAttid2(), "ATTID2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTID2: {varchar(100)}
     * @param attid2List The collection of attid2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid2_NotInScope(Collection<String> attid2List) {
        doSetAttid2_NotInScope(attid2List);
    }

    protected void doSetAttid2_NotInScope(Collection<String> attid2List) {
        regINS(CK_NINS, cTL(attid2List), xgetCValueAttid2(), "ATTID2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTID2: {varchar(100)} <br>
     * <pre>e.g. setAttid2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param attid2 The value of attid2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAttid2_LikeSearch(String attid2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(attid2), xgetCValueAttid2(), "ATTID2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTID2: {varchar(100)}
     * @param attid2 The value of attid2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAttid2_NotLikeSearch(String attid2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(attid2), xgetCValueAttid2(), "ATTID2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTID2: {varchar(100)}
     * @param attid2 The value of attid2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid2_PrefixSearch(String attid2) {
        setAttid2_LikeSearch(attid2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ATTID2: {varchar(100)}
     */
    public void setAttid2_IsNull() { regAttid2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ATTID2: {varchar(100)}
     */
    public void setAttid2_IsNullOrEmpty() { regAttid2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ATTID2: {varchar(100)}
     */
    public void setAttid2_IsNotNull() { regAttid2(CK_ISNN, DOBJ); }

    protected void regAttid2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAttid2(), "ATTID2"); }
    protected abstract ConditionValue xgetCValueAttid2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID3: {varchar(100)}
     * @param attid3 The value of attid3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid3_Equal(String attid3) {
        doSetAttid3_Equal(fRES(attid3));
    }

    protected void doSetAttid3_Equal(String attid3) {
        regAttid3(CK_EQ, attid3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID3: {varchar(100)}
     * @param attid3 The value of attid3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid3_NotEqual(String attid3) {
        doSetAttid3_NotEqual(fRES(attid3));
    }

    protected void doSetAttid3_NotEqual(String attid3) {
        regAttid3(CK_NES, attid3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID3: {varchar(100)}
     * @param attid3 The value of attid3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid3_GreaterThan(String attid3) {
        regAttid3(CK_GT, fRES(attid3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID3: {varchar(100)}
     * @param attid3 The value of attid3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid3_LessThan(String attid3) {
        regAttid3(CK_LT, fRES(attid3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID3: {varchar(100)}
     * @param attid3 The value of attid3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid3_GreaterEqual(String attid3) {
        regAttid3(CK_GE, fRES(attid3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTID3: {varchar(100)}
     * @param attid3 The value of attid3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid3_LessEqual(String attid3) {
        regAttid3(CK_LE, fRES(attid3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTID3: {varchar(100)}
     * @param attid3List The collection of attid3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid3_InScope(Collection<String> attid3List) {
        doSetAttid3_InScope(attid3List);
    }

    protected void doSetAttid3_InScope(Collection<String> attid3List) {
        regINS(CK_INS, cTL(attid3List), xgetCValueAttid3(), "ATTID3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTID3: {varchar(100)}
     * @param attid3List The collection of attid3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid3_NotInScope(Collection<String> attid3List) {
        doSetAttid3_NotInScope(attid3List);
    }

    protected void doSetAttid3_NotInScope(Collection<String> attid3List) {
        regINS(CK_NINS, cTL(attid3List), xgetCValueAttid3(), "ATTID3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTID3: {varchar(100)} <br>
     * <pre>e.g. setAttid3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param attid3 The value of attid3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAttid3_LikeSearch(String attid3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(attid3), xgetCValueAttid3(), "ATTID3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTID3: {varchar(100)}
     * @param attid3 The value of attid3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAttid3_NotLikeSearch(String attid3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(attid3), xgetCValueAttid3(), "ATTID3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTID3: {varchar(100)}
     * @param attid3 The value of attid3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttid3_PrefixSearch(String attid3) {
        setAttid3_LikeSearch(attid3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ATTID3: {varchar(100)}
     */
    public void setAttid3_IsNull() { regAttid3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ATTID3: {varchar(100)}
     */
    public void setAttid3_IsNullOrEmpty() { regAttid3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ATTID3: {varchar(100)}
     */
    public void setAttid3_IsNotNull() { regAttid3(CK_ISNN, DOBJ); }

    protected void regAttid3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAttid3(), "ATTID3"); }
    protected abstract ConditionValue xgetCValueAttid3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID4: {varchar(100)}
     * @param orattid4 The value of orattid4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid4_Equal(String orattid4) {
        doSetOrattid4_Equal(fRES(orattid4));
    }

    protected void doSetOrattid4_Equal(String orattid4) {
        regOrattid4(CK_EQ, orattid4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID4: {varchar(100)}
     * @param orattid4 The value of orattid4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid4_NotEqual(String orattid4) {
        doSetOrattid4_NotEqual(fRES(orattid4));
    }

    protected void doSetOrattid4_NotEqual(String orattid4) {
        regOrattid4(CK_NES, orattid4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID4: {varchar(100)}
     * @param orattid4 The value of orattid4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid4_GreaterThan(String orattid4) {
        regOrattid4(CK_GT, fRES(orattid4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID4: {varchar(100)}
     * @param orattid4 The value of orattid4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid4_LessThan(String orattid4) {
        regOrattid4(CK_LT, fRES(orattid4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID4: {varchar(100)}
     * @param orattid4 The value of orattid4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid4_GreaterEqual(String orattid4) {
        regOrattid4(CK_GE, fRES(orattid4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORATTID4: {varchar(100)}
     * @param orattid4 The value of orattid4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid4_LessEqual(String orattid4) {
        regOrattid4(CK_LE, fRES(orattid4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORATTID4: {varchar(100)}
     * @param orattid4List The collection of orattid4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid4_InScope(Collection<String> orattid4List) {
        doSetOrattid4_InScope(orattid4List);
    }

    protected void doSetOrattid4_InScope(Collection<String> orattid4List) {
        regINS(CK_INS, cTL(orattid4List), xgetCValueOrattid4(), "ORATTID4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORATTID4: {varchar(100)}
     * @param orattid4List The collection of orattid4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid4_NotInScope(Collection<String> orattid4List) {
        doSetOrattid4_NotInScope(orattid4List);
    }

    protected void doSetOrattid4_NotInScope(Collection<String> orattid4List) {
        regINS(CK_NINS, cTL(orattid4List), xgetCValueOrattid4(), "ORATTID4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORATTID4: {varchar(100)} <br>
     * <pre>e.g. setOrattid4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orattid4 The value of orattid4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrattid4_LikeSearch(String orattid4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orattid4), xgetCValueOrattid4(), "ORATTID4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORATTID4: {varchar(100)}
     * @param orattid4 The value of orattid4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrattid4_NotLikeSearch(String orattid4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orattid4), xgetCValueOrattid4(), "ORATTID4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORATTID4: {varchar(100)}
     * @param orattid4 The value of orattid4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrattid4_PrefixSearch(String orattid4) {
        setOrattid4_LikeSearch(orattid4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORATTID4: {varchar(100)}
     */
    public void setOrattid4_IsNull() { regOrattid4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORATTID4: {varchar(100)}
     */
    public void setOrattid4_IsNullOrEmpty() { regOrattid4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORATTID4: {varchar(100)}
     */
    public void setOrattid4_IsNotNull() { regOrattid4(CK_ISNN, DOBJ); }

    protected void regOrattid4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrattid4(), "ORATTID4"); }
    protected abstract ConditionValue xgetCValueOrattid4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSDID: {varchar(100)}
     * @param bsdid The value of bsdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBsdid_Equal(String bsdid) {
        doSetBsdid_Equal(fRES(bsdid));
    }

    protected void doSetBsdid_Equal(String bsdid) {
        regBsdid(CK_EQ, bsdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSDID: {varchar(100)}
     * @param bsdid The value of bsdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBsdid_NotEqual(String bsdid) {
        doSetBsdid_NotEqual(fRES(bsdid));
    }

    protected void doSetBsdid_NotEqual(String bsdid) {
        regBsdid(CK_NES, bsdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSDID: {varchar(100)}
     * @param bsdid The value of bsdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBsdid_GreaterThan(String bsdid) {
        regBsdid(CK_GT, fRES(bsdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSDID: {varchar(100)}
     * @param bsdid The value of bsdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBsdid_LessThan(String bsdid) {
        regBsdid(CK_LT, fRES(bsdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSDID: {varchar(100)}
     * @param bsdid The value of bsdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBsdid_GreaterEqual(String bsdid) {
        regBsdid(CK_GE, fRES(bsdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSDID: {varchar(100)}
     * @param bsdid The value of bsdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBsdid_LessEqual(String bsdid) {
        regBsdid(CK_LE, fRES(bsdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BSDID: {varchar(100)}
     * @param bsdidList The collection of bsdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBsdid_InScope(Collection<String> bsdidList) {
        doSetBsdid_InScope(bsdidList);
    }

    protected void doSetBsdid_InScope(Collection<String> bsdidList) {
        regINS(CK_INS, cTL(bsdidList), xgetCValueBsdid(), "BSDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BSDID: {varchar(100)}
     * @param bsdidList The collection of bsdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBsdid_NotInScope(Collection<String> bsdidList) {
        doSetBsdid_NotInScope(bsdidList);
    }

    protected void doSetBsdid_NotInScope(Collection<String> bsdidList) {
        regINS(CK_NINS, cTL(bsdidList), xgetCValueBsdid(), "BSDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSDID: {varchar(100)} <br>
     * <pre>e.g. setBsdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bsdid The value of bsdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBsdid_LikeSearch(String bsdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bsdid), xgetCValueBsdid(), "BSDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSDID: {varchar(100)}
     * @param bsdid The value of bsdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBsdid_NotLikeSearch(String bsdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bsdid), xgetCValueBsdid(), "BSDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSDID: {varchar(100)}
     * @param bsdid The value of bsdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBsdid_PrefixSearch(String bsdid) {
        setBsdid_LikeSearch(bsdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BSDID: {varchar(100)}
     */
    public void setBsdid_IsNull() { regBsdid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BSDID: {varchar(100)}
     */
    public void setBsdid_IsNullOrEmpty() { regBsdid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BSDID: {varchar(100)}
     */
    public void setBsdid_IsNotNull() { regBsdid(CK_ISNN, DOBJ); }

    protected void regBsdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBsdid(), "BSDID"); }
    protected abstract ConditionValue xgetCValueBsdid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RPBCD: {varchar(100)}
     * @param rpbcd The value of rpbcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRpbcd_Equal(String rpbcd) {
        doSetRpbcd_Equal(fRES(rpbcd));
    }

    protected void doSetRpbcd_Equal(String rpbcd) {
        regRpbcd(CK_EQ, rpbcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RPBCD: {varchar(100)}
     * @param rpbcd The value of rpbcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRpbcd_NotEqual(String rpbcd) {
        doSetRpbcd_NotEqual(fRES(rpbcd));
    }

    protected void doSetRpbcd_NotEqual(String rpbcd) {
        regRpbcd(CK_NES, rpbcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RPBCD: {varchar(100)}
     * @param rpbcd The value of rpbcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRpbcd_GreaterThan(String rpbcd) {
        regRpbcd(CK_GT, fRES(rpbcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RPBCD: {varchar(100)}
     * @param rpbcd The value of rpbcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRpbcd_LessThan(String rpbcd) {
        regRpbcd(CK_LT, fRES(rpbcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RPBCD: {varchar(100)}
     * @param rpbcd The value of rpbcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRpbcd_GreaterEqual(String rpbcd) {
        regRpbcd(CK_GE, fRES(rpbcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RPBCD: {varchar(100)}
     * @param rpbcd The value of rpbcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRpbcd_LessEqual(String rpbcd) {
        regRpbcd(CK_LE, fRES(rpbcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RPBCD: {varchar(100)}
     * @param rpbcdList The collection of rpbcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRpbcd_InScope(Collection<String> rpbcdList) {
        doSetRpbcd_InScope(rpbcdList);
    }

    protected void doSetRpbcd_InScope(Collection<String> rpbcdList) {
        regINS(CK_INS, cTL(rpbcdList), xgetCValueRpbcd(), "RPBCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RPBCD: {varchar(100)}
     * @param rpbcdList The collection of rpbcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRpbcd_NotInScope(Collection<String> rpbcdList) {
        doSetRpbcd_NotInScope(rpbcdList);
    }

    protected void doSetRpbcd_NotInScope(Collection<String> rpbcdList) {
        regINS(CK_NINS, cTL(rpbcdList), xgetCValueRpbcd(), "RPBCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RPBCD: {varchar(100)} <br>
     * <pre>e.g. setRpbcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rpbcd The value of rpbcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRpbcd_LikeSearch(String rpbcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rpbcd), xgetCValueRpbcd(), "RPBCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RPBCD: {varchar(100)}
     * @param rpbcd The value of rpbcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRpbcd_NotLikeSearch(String rpbcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rpbcd), xgetCValueRpbcd(), "RPBCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RPBCD: {varchar(100)}
     * @param rpbcd The value of rpbcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRpbcd_PrefixSearch(String rpbcd) {
        setRpbcd_LikeSearch(rpbcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RPBCD: {varchar(100)}
     */
    public void setRpbcd_IsNull() { regRpbcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RPBCD: {varchar(100)}
     */
    public void setRpbcd_IsNullOrEmpty() { regRpbcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RPBCD: {varchar(100)}
     */
    public void setRpbcd_IsNotNull() { regRpbcd(CK_ISNN, DOBJ); }

    protected void regRpbcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRpbcd(), "RPBCD"); }
    protected abstract ConditionValue xgetCValueRpbcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAUORGCD: {varchar(100)}
     * @param fauorgcd The value of fauorgcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFauorgcd_Equal(String fauorgcd) {
        doSetFauorgcd_Equal(fRES(fauorgcd));
    }

    protected void doSetFauorgcd_Equal(String fauorgcd) {
        regFauorgcd(CK_EQ, fauorgcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAUORGCD: {varchar(100)}
     * @param fauorgcd The value of fauorgcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFauorgcd_NotEqual(String fauorgcd) {
        doSetFauorgcd_NotEqual(fRES(fauorgcd));
    }

    protected void doSetFauorgcd_NotEqual(String fauorgcd) {
        regFauorgcd(CK_NES, fauorgcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAUORGCD: {varchar(100)}
     * @param fauorgcd The value of fauorgcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFauorgcd_GreaterThan(String fauorgcd) {
        regFauorgcd(CK_GT, fRES(fauorgcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAUORGCD: {varchar(100)}
     * @param fauorgcd The value of fauorgcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFauorgcd_LessThan(String fauorgcd) {
        regFauorgcd(CK_LT, fRES(fauorgcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAUORGCD: {varchar(100)}
     * @param fauorgcd The value of fauorgcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFauorgcd_GreaterEqual(String fauorgcd) {
        regFauorgcd(CK_GE, fRES(fauorgcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAUORGCD: {varchar(100)}
     * @param fauorgcd The value of fauorgcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFauorgcd_LessEqual(String fauorgcd) {
        regFauorgcd(CK_LE, fRES(fauorgcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FAUORGCD: {varchar(100)}
     * @param fauorgcdList The collection of fauorgcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFauorgcd_InScope(Collection<String> fauorgcdList) {
        doSetFauorgcd_InScope(fauorgcdList);
    }

    protected void doSetFauorgcd_InScope(Collection<String> fauorgcdList) {
        regINS(CK_INS, cTL(fauorgcdList), xgetCValueFauorgcd(), "FAUORGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FAUORGCD: {varchar(100)}
     * @param fauorgcdList The collection of fauorgcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFauorgcd_NotInScope(Collection<String> fauorgcdList) {
        doSetFauorgcd_NotInScope(fauorgcdList);
    }

    protected void doSetFauorgcd_NotInScope(Collection<String> fauorgcdList) {
        regINS(CK_NINS, cTL(fauorgcdList), xgetCValueFauorgcd(), "FAUORGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAUORGCD: {varchar(100)} <br>
     * <pre>e.g. setFauorgcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fauorgcd The value of fauorgcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFauorgcd_LikeSearch(String fauorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fauorgcd), xgetCValueFauorgcd(), "FAUORGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAUORGCD: {varchar(100)}
     * @param fauorgcd The value of fauorgcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFauorgcd_NotLikeSearch(String fauorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fauorgcd), xgetCValueFauorgcd(), "FAUORGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAUORGCD: {varchar(100)}
     * @param fauorgcd The value of fauorgcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFauorgcd_PrefixSearch(String fauorgcd) {
        setFauorgcd_LikeSearch(fauorgcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FAUORGCD: {varchar(100)}
     */
    public void setFauorgcd_IsNull() { regFauorgcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FAUORGCD: {varchar(100)}
     */
    public void setFauorgcd_IsNullOrEmpty() { regFauorgcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FAUORGCD: {varchar(100)}
     */
    public void setFauorgcd_IsNotNull() { regFauorgcd(CK_ISNN, DOBJ); }

    protected void regFauorgcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFauorgcd(), "FAUORGCD"); }
    protected abstract ConditionValue xgetCValueFauorgcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUORGCD: {varchar(100)}
     * @param auorgcd The value of auorgcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuorgcd_Equal(String auorgcd) {
        doSetAuorgcd_Equal(fRES(auorgcd));
    }

    protected void doSetAuorgcd_Equal(String auorgcd) {
        regAuorgcd(CK_EQ, auorgcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUORGCD: {varchar(100)}
     * @param auorgcd The value of auorgcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuorgcd_NotEqual(String auorgcd) {
        doSetAuorgcd_NotEqual(fRES(auorgcd));
    }

    protected void doSetAuorgcd_NotEqual(String auorgcd) {
        regAuorgcd(CK_NES, auorgcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUORGCD: {varchar(100)}
     * @param auorgcd The value of auorgcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuorgcd_GreaterThan(String auorgcd) {
        regAuorgcd(CK_GT, fRES(auorgcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUORGCD: {varchar(100)}
     * @param auorgcd The value of auorgcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuorgcd_LessThan(String auorgcd) {
        regAuorgcd(CK_LT, fRES(auorgcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUORGCD: {varchar(100)}
     * @param auorgcd The value of auorgcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuorgcd_GreaterEqual(String auorgcd) {
        regAuorgcd(CK_GE, fRES(auorgcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUORGCD: {varchar(100)}
     * @param auorgcd The value of auorgcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuorgcd_LessEqual(String auorgcd) {
        regAuorgcd(CK_LE, fRES(auorgcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUORGCD: {varchar(100)}
     * @param auorgcdList The collection of auorgcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuorgcd_InScope(Collection<String> auorgcdList) {
        doSetAuorgcd_InScope(auorgcdList);
    }

    protected void doSetAuorgcd_InScope(Collection<String> auorgcdList) {
        regINS(CK_INS, cTL(auorgcdList), xgetCValueAuorgcd(), "AUORGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUORGCD: {varchar(100)}
     * @param auorgcdList The collection of auorgcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuorgcd_NotInScope(Collection<String> auorgcdList) {
        doSetAuorgcd_NotInScope(auorgcdList);
    }

    protected void doSetAuorgcd_NotInScope(Collection<String> auorgcdList) {
        regINS(CK_NINS, cTL(auorgcdList), xgetCValueAuorgcd(), "AUORGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUORGCD: {varchar(100)} <br>
     * <pre>e.g. setAuorgcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param auorgcd The value of auorgcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAuorgcd_LikeSearch(String auorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(auorgcd), xgetCValueAuorgcd(), "AUORGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUORGCD: {varchar(100)}
     * @param auorgcd The value of auorgcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAuorgcd_NotLikeSearch(String auorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(auorgcd), xgetCValueAuorgcd(), "AUORGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUORGCD: {varchar(100)}
     * @param auorgcd The value of auorgcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuorgcd_PrefixSearch(String auorgcd) {
        setAuorgcd_LikeSearch(auorgcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AUORGCD: {varchar(100)}
     */
    public void setAuorgcd_IsNull() { regAuorgcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * AUORGCD: {varchar(100)}
     */
    public void setAuorgcd_IsNullOrEmpty() { regAuorgcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AUORGCD: {varchar(100)}
     */
    public void setAuorgcd_IsNotNull() { regAuorgcd(CK_ISNN, DOBJ); }

    protected void regAuorgcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAuorgcd(), "AUORGCD"); }
    protected abstract ConditionValue xgetCValueAuorgcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSTCTCD: {varchar(100)}
     * @param cstctcd The value of cstctcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCstctcd_Equal(String cstctcd) {
        doSetCstctcd_Equal(fRES(cstctcd));
    }

    protected void doSetCstctcd_Equal(String cstctcd) {
        regCstctcd(CK_EQ, cstctcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSTCTCD: {varchar(100)}
     * @param cstctcd The value of cstctcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCstctcd_NotEqual(String cstctcd) {
        doSetCstctcd_NotEqual(fRES(cstctcd));
    }

    protected void doSetCstctcd_NotEqual(String cstctcd) {
        regCstctcd(CK_NES, cstctcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSTCTCD: {varchar(100)}
     * @param cstctcd The value of cstctcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCstctcd_GreaterThan(String cstctcd) {
        regCstctcd(CK_GT, fRES(cstctcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSTCTCD: {varchar(100)}
     * @param cstctcd The value of cstctcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCstctcd_LessThan(String cstctcd) {
        regCstctcd(CK_LT, fRES(cstctcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSTCTCD: {varchar(100)}
     * @param cstctcd The value of cstctcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCstctcd_GreaterEqual(String cstctcd) {
        regCstctcd(CK_GE, fRES(cstctcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSTCTCD: {varchar(100)}
     * @param cstctcd The value of cstctcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCstctcd_LessEqual(String cstctcd) {
        regCstctcd(CK_LE, fRES(cstctcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CSTCTCD: {varchar(100)}
     * @param cstctcdList The collection of cstctcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCstctcd_InScope(Collection<String> cstctcdList) {
        doSetCstctcd_InScope(cstctcdList);
    }

    protected void doSetCstctcd_InScope(Collection<String> cstctcdList) {
        regINS(CK_INS, cTL(cstctcdList), xgetCValueCstctcd(), "CSTCTCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CSTCTCD: {varchar(100)}
     * @param cstctcdList The collection of cstctcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCstctcd_NotInScope(Collection<String> cstctcdList) {
        doSetCstctcd_NotInScope(cstctcdList);
    }

    protected void doSetCstctcd_NotInScope(Collection<String> cstctcdList) {
        regINS(CK_NINS, cTL(cstctcdList), xgetCValueCstctcd(), "CSTCTCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CSTCTCD: {varchar(100)} <br>
     * <pre>e.g. setCstctcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cstctcd The value of cstctcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCstctcd_LikeSearch(String cstctcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cstctcd), xgetCValueCstctcd(), "CSTCTCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CSTCTCD: {varchar(100)}
     * @param cstctcd The value of cstctcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCstctcd_NotLikeSearch(String cstctcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cstctcd), xgetCValueCstctcd(), "CSTCTCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CSTCTCD: {varchar(100)}
     * @param cstctcd The value of cstctcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCstctcd_PrefixSearch(String cstctcd) {
        setCstctcd_LikeSearch(cstctcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CSTCTCD: {varchar(100)}
     */
    public void setCstctcd_IsNull() { regCstctcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CSTCTCD: {varchar(100)}
     */
    public void setCstctcd_IsNullOrEmpty() { regCstctcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CSTCTCD: {varchar(100)}
     */
    public void setCstctcd_IsNotNull() { regCstctcd(CK_ISNN, DOBJ); }

    protected void regCstctcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCstctcd(), "CSTCTCD"); }
    protected abstract ConditionValue xgetCValueCstctcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZARCD: {varchar(100)}
     * @param bizarcd The value of bizarcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizarcd_Equal(String bizarcd) {
        doSetBizarcd_Equal(fRES(bizarcd));
    }

    protected void doSetBizarcd_Equal(String bizarcd) {
        regBizarcd(CK_EQ, bizarcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZARCD: {varchar(100)}
     * @param bizarcd The value of bizarcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizarcd_NotEqual(String bizarcd) {
        doSetBizarcd_NotEqual(fRES(bizarcd));
    }

    protected void doSetBizarcd_NotEqual(String bizarcd) {
        regBizarcd(CK_NES, bizarcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZARCD: {varchar(100)}
     * @param bizarcd The value of bizarcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizarcd_GreaterThan(String bizarcd) {
        regBizarcd(CK_GT, fRES(bizarcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZARCD: {varchar(100)}
     * @param bizarcd The value of bizarcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizarcd_LessThan(String bizarcd) {
        regBizarcd(CK_LT, fRES(bizarcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZARCD: {varchar(100)}
     * @param bizarcd The value of bizarcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizarcd_GreaterEqual(String bizarcd) {
        regBizarcd(CK_GE, fRES(bizarcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZARCD: {varchar(100)}
     * @param bizarcd The value of bizarcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizarcd_LessEqual(String bizarcd) {
        regBizarcd(CK_LE, fRES(bizarcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BIZARCD: {varchar(100)}
     * @param bizarcdList The collection of bizarcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizarcd_InScope(Collection<String> bizarcdList) {
        doSetBizarcd_InScope(bizarcdList);
    }

    protected void doSetBizarcd_InScope(Collection<String> bizarcdList) {
        regINS(CK_INS, cTL(bizarcdList), xgetCValueBizarcd(), "BIZARCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BIZARCD: {varchar(100)}
     * @param bizarcdList The collection of bizarcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizarcd_NotInScope(Collection<String> bizarcdList) {
        doSetBizarcd_NotInScope(bizarcdList);
    }

    protected void doSetBizarcd_NotInScope(Collection<String> bizarcdList) {
        regINS(CK_NINS, cTL(bizarcdList), xgetCValueBizarcd(), "BIZARCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BIZARCD: {varchar(100)} <br>
     * <pre>e.g. setBizarcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bizarcd The value of bizarcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBizarcd_LikeSearch(String bizarcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bizarcd), xgetCValueBizarcd(), "BIZARCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BIZARCD: {varchar(100)}
     * @param bizarcd The value of bizarcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBizarcd_NotLikeSearch(String bizarcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bizarcd), xgetCValueBizarcd(), "BIZARCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BIZARCD: {varchar(100)}
     * @param bizarcd The value of bizarcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizarcd_PrefixSearch(String bizarcd) {
        setBizarcd_LikeSearch(bizarcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BIZARCD: {varchar(100)}
     */
    public void setBizarcd_IsNull() { regBizarcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BIZARCD: {varchar(100)}
     */
    public void setBizarcd_IsNullOrEmpty() { regBizarcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BIZARCD: {varchar(100)}
     */
    public void setBizarcd_IsNotNull() { regBizarcd(CK_ISNN, DOBJ); }

    protected void regBizarcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBizarcd(), "BIZARCD"); }
    protected abstract ConditionValue xgetCValueBizarcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWCTCD: {varchar(100)}
     * @param fwctcd The value of fwctcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwctcd_Equal(String fwctcd) {
        doSetFwctcd_Equal(fRES(fwctcd));
    }

    protected void doSetFwctcd_Equal(String fwctcd) {
        regFwctcd(CK_EQ, fwctcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWCTCD: {varchar(100)}
     * @param fwctcd The value of fwctcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwctcd_NotEqual(String fwctcd) {
        doSetFwctcd_NotEqual(fRES(fwctcd));
    }

    protected void doSetFwctcd_NotEqual(String fwctcd) {
        regFwctcd(CK_NES, fwctcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWCTCD: {varchar(100)}
     * @param fwctcd The value of fwctcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwctcd_GreaterThan(String fwctcd) {
        regFwctcd(CK_GT, fRES(fwctcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWCTCD: {varchar(100)}
     * @param fwctcd The value of fwctcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwctcd_LessThan(String fwctcd) {
        regFwctcd(CK_LT, fRES(fwctcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWCTCD: {varchar(100)}
     * @param fwctcd The value of fwctcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwctcd_GreaterEqual(String fwctcd) {
        regFwctcd(CK_GE, fRES(fwctcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWCTCD: {varchar(100)}
     * @param fwctcd The value of fwctcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwctcd_LessEqual(String fwctcd) {
        regFwctcd(CK_LE, fRES(fwctcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FWCTCD: {varchar(100)}
     * @param fwctcdList The collection of fwctcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwctcd_InScope(Collection<String> fwctcdList) {
        doSetFwctcd_InScope(fwctcdList);
    }

    protected void doSetFwctcd_InScope(Collection<String> fwctcdList) {
        regINS(CK_INS, cTL(fwctcdList), xgetCValueFwctcd(), "FWCTCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FWCTCD: {varchar(100)}
     * @param fwctcdList The collection of fwctcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwctcd_NotInScope(Collection<String> fwctcdList) {
        doSetFwctcd_NotInScope(fwctcdList);
    }

    protected void doSetFwctcd_NotInScope(Collection<String> fwctcdList) {
        regINS(CK_NINS, cTL(fwctcdList), xgetCValueFwctcd(), "FWCTCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FWCTCD: {varchar(100)} <br>
     * <pre>e.g. setFwctcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fwctcd The value of fwctcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFwctcd_LikeSearch(String fwctcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fwctcd), xgetCValueFwctcd(), "FWCTCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FWCTCD: {varchar(100)}
     * @param fwctcd The value of fwctcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFwctcd_NotLikeSearch(String fwctcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fwctcd), xgetCValueFwctcd(), "FWCTCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FWCTCD: {varchar(100)}
     * @param fwctcd The value of fwctcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwctcd_PrefixSearch(String fwctcd) {
        setFwctcd_LikeSearch(fwctcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FWCTCD: {varchar(100)}
     */
    public void setFwctcd_IsNull() { regFwctcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FWCTCD: {varchar(100)}
     */
    public void setFwctcd_IsNullOrEmpty() { regFwctcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FWCTCD: {varchar(100)}
     */
    public void setFwctcd_IsNotNull() { regFwctcd(CK_ISNN, DOBJ); }

    protected void regFwctcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwctcd(), "FWCTCD"); }
    protected abstract ConditionValue xgetCValueFwctcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RDVDID: {varchar(100)}
     * @param rdvdid The value of rdvdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_Equal(String rdvdid) {
        doSetRdvdid_Equal(fRES(rdvdid));
    }

    protected void doSetRdvdid_Equal(String rdvdid) {
        regRdvdid(CK_EQ, rdvdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RDVDID: {varchar(100)}
     * @param rdvdid The value of rdvdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_NotEqual(String rdvdid) {
        doSetRdvdid_NotEqual(fRES(rdvdid));
    }

    protected void doSetRdvdid_NotEqual(String rdvdid) {
        regRdvdid(CK_NES, rdvdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RDVDID: {varchar(100)}
     * @param rdvdid The value of rdvdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_GreaterThan(String rdvdid) {
        regRdvdid(CK_GT, fRES(rdvdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RDVDID: {varchar(100)}
     * @param rdvdid The value of rdvdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_LessThan(String rdvdid) {
        regRdvdid(CK_LT, fRES(rdvdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RDVDID: {varchar(100)}
     * @param rdvdid The value of rdvdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_GreaterEqual(String rdvdid) {
        regRdvdid(CK_GE, fRES(rdvdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RDVDID: {varchar(100)}
     * @param rdvdid The value of rdvdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_LessEqual(String rdvdid) {
        regRdvdid(CK_LE, fRES(rdvdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RDVDID: {varchar(100)}
     * @param rdvdidList The collection of rdvdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_InScope(Collection<String> rdvdidList) {
        doSetRdvdid_InScope(rdvdidList);
    }

    protected void doSetRdvdid_InScope(Collection<String> rdvdidList) {
        regINS(CK_INS, cTL(rdvdidList), xgetCValueRdvdid(), "RDVDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RDVDID: {varchar(100)}
     * @param rdvdidList The collection of rdvdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_NotInScope(Collection<String> rdvdidList) {
        doSetRdvdid_NotInScope(rdvdidList);
    }

    protected void doSetRdvdid_NotInScope(Collection<String> rdvdidList) {
        regINS(CK_NINS, cTL(rdvdidList), xgetCValueRdvdid(), "RDVDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RDVDID: {varchar(100)} <br>
     * <pre>e.g. setRdvdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rdvdid The value of rdvdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRdvdid_LikeSearch(String rdvdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rdvdid), xgetCValueRdvdid(), "RDVDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RDVDID: {varchar(100)}
     * @param rdvdid The value of rdvdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRdvdid_NotLikeSearch(String rdvdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rdvdid), xgetCValueRdvdid(), "RDVDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RDVDID: {varchar(100)}
     * @param rdvdid The value of rdvdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRdvdid_PrefixSearch(String rdvdid) {
        setRdvdid_LikeSearch(rdvdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RDVDID: {varchar(100)}
     */
    public void setRdvdid_IsNull() { regRdvdid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RDVDID: {varchar(100)}
     */
    public void setRdvdid_IsNullOrEmpty() { regRdvdid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RDVDID: {varchar(100)}
     */
    public void setRdvdid_IsNotNull() { regRdvdid(CK_ISNN, DOBJ); }

    protected void regRdvdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRdvdid(), "RDVDID"); }
    protected abstract ConditionValue xgetCValueRdvdid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(30)}
     * @param zzablymd The value of zzablymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_Equal(String zzablymd) {
        doSetZzablymd_Equal(fRES(zzablymd));
    }

    protected void doSetZzablymd_Equal(String zzablymd) {
        regZzablymd(CK_EQ, zzablymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(30)}
     * @param zzablymd The value of zzablymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_NotEqual(String zzablymd) {
        doSetZzablymd_NotEqual(fRES(zzablymd));
    }

    protected void doSetZzablymd_NotEqual(String zzablymd) {
        regZzablymd(CK_NES, zzablymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(30)}
     * @param zzablymd The value of zzablymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_GreaterThan(String zzablymd) {
        regZzablymd(CK_GT, fRES(zzablymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(30)}
     * @param zzablymd The value of zzablymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_LessThan(String zzablymd) {
        regZzablymd(CK_LT, fRES(zzablymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(30)}
     * @param zzablymd The value of zzablymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_GreaterEqual(String zzablymd) {
        regZzablymd(CK_GE, fRES(zzablymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(30)}
     * @param zzablymd The value of zzablymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_LessEqual(String zzablymd) {
        regZzablymd(CK_LE, fRES(zzablymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZABLYMD: {varchar(30)}
     * @param zzablymdList The collection of zzablymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_InScope(Collection<String> zzablymdList) {
        doSetZzablymd_InScope(zzablymdList);
    }

    protected void doSetZzablymd_InScope(Collection<String> zzablymdList) {
        regINS(CK_INS, cTL(zzablymdList), xgetCValueZzablymd(), "ZZABLYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZABLYMD: {varchar(30)}
     * @param zzablymdList The collection of zzablymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_NotInScope(Collection<String> zzablymdList) {
        doSetZzablymd_NotInScope(zzablymdList);
    }

    protected void doSetZzablymd_NotInScope(Collection<String> zzablymdList) {
        regINS(CK_NINS, cTL(zzablymdList), xgetCValueZzablymd(), "ZZABLYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZABLYMD: {varchar(30)} <br>
     * <pre>e.g. setZzablymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzablymd The value of zzablymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzablymd_LikeSearch(String zzablymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzablymd), xgetCValueZzablymd(), "ZZABLYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZABLYMD: {varchar(30)}
     * @param zzablymd The value of zzablymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzablymd_NotLikeSearch(String zzablymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzablymd), xgetCValueZzablymd(), "ZZABLYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZABLYMD: {varchar(30)}
     * @param zzablymd The value of zzablymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_PrefixSearch(String zzablymd) {
        setZzablymd_LikeSearch(zzablymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(30)}
     */
    public void setZzablymd_IsNull() { regZzablymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(30)}
     */
    public void setZzablymd_IsNullOrEmpty() { regZzablymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(30)}
     */
    public void setZzablymd_IsNotNull() { regZzablymd(CK_ISNN, DOBJ); }

    protected void regZzablymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzablymd(), "ZZABLYMD"); }
    protected abstract ConditionValue xgetCValueZzablymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BPTNID: {varchar(100)}
     * @param bptnid The value of bptnid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBptnid_Equal(String bptnid) {
        doSetBptnid_Equal(fRES(bptnid));
    }

    protected void doSetBptnid_Equal(String bptnid) {
        regBptnid(CK_EQ, bptnid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BPTNID: {varchar(100)}
     * @param bptnid The value of bptnid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBptnid_NotEqual(String bptnid) {
        doSetBptnid_NotEqual(fRES(bptnid));
    }

    protected void doSetBptnid_NotEqual(String bptnid) {
        regBptnid(CK_NES, bptnid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BPTNID: {varchar(100)}
     * @param bptnid The value of bptnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBptnid_GreaterThan(String bptnid) {
        regBptnid(CK_GT, fRES(bptnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BPTNID: {varchar(100)}
     * @param bptnid The value of bptnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBptnid_LessThan(String bptnid) {
        regBptnid(CK_LT, fRES(bptnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BPTNID: {varchar(100)}
     * @param bptnid The value of bptnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBptnid_GreaterEqual(String bptnid) {
        regBptnid(CK_GE, fRES(bptnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BPTNID: {varchar(100)}
     * @param bptnid The value of bptnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBptnid_LessEqual(String bptnid) {
        regBptnid(CK_LE, fRES(bptnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BPTNID: {varchar(100)}
     * @param bptnidList The collection of bptnid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBptnid_InScope(Collection<String> bptnidList) {
        doSetBptnid_InScope(bptnidList);
    }

    protected void doSetBptnid_InScope(Collection<String> bptnidList) {
        regINS(CK_INS, cTL(bptnidList), xgetCValueBptnid(), "BPTNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BPTNID: {varchar(100)}
     * @param bptnidList The collection of bptnid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBptnid_NotInScope(Collection<String> bptnidList) {
        doSetBptnid_NotInScope(bptnidList);
    }

    protected void doSetBptnid_NotInScope(Collection<String> bptnidList) {
        regINS(CK_NINS, cTL(bptnidList), xgetCValueBptnid(), "BPTNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BPTNID: {varchar(100)} <br>
     * <pre>e.g. setBptnid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bptnid The value of bptnid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBptnid_LikeSearch(String bptnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bptnid), xgetCValueBptnid(), "BPTNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BPTNID: {varchar(100)}
     * @param bptnid The value of bptnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBptnid_NotLikeSearch(String bptnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bptnid), xgetCValueBptnid(), "BPTNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BPTNID: {varchar(100)}
     * @param bptnid The value of bptnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBptnid_PrefixSearch(String bptnid) {
        setBptnid_LikeSearch(bptnid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BPTNID: {varchar(100)}
     */
    public void setBptnid_IsNull() { regBptnid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BPTNID: {varchar(100)}
     */
    public void setBptnid_IsNullOrEmpty() { regBptnid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BPTNID: {varchar(100)}
     */
    public void setBptnid_IsNotNull() { regBptnid(CK_ISNN, DOBJ); }

    protected void regBptnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBptnid(), "BPTNID"); }
    protected abstract ConditionValue xgetCValueBptnid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNKHG: {varchar(100)}
     * @param snkhg The value of snkhg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnkhg_Equal(String snkhg) {
        doSetSnkhg_Equal(fRES(snkhg));
    }

    protected void doSetSnkhg_Equal(String snkhg) {
        regSnkhg(CK_EQ, snkhg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNKHG: {varchar(100)}
     * @param snkhg The value of snkhg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnkhg_NotEqual(String snkhg) {
        doSetSnkhg_NotEqual(fRES(snkhg));
    }

    protected void doSetSnkhg_NotEqual(String snkhg) {
        regSnkhg(CK_NES, snkhg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNKHG: {varchar(100)}
     * @param snkhg The value of snkhg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnkhg_GreaterThan(String snkhg) {
        regSnkhg(CK_GT, fRES(snkhg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNKHG: {varchar(100)}
     * @param snkhg The value of snkhg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnkhg_LessThan(String snkhg) {
        regSnkhg(CK_LT, fRES(snkhg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNKHG: {varchar(100)}
     * @param snkhg The value of snkhg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnkhg_GreaterEqual(String snkhg) {
        regSnkhg(CK_GE, fRES(snkhg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNKHG: {varchar(100)}
     * @param snkhg The value of snkhg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnkhg_LessEqual(String snkhg) {
        regSnkhg(CK_LE, fRES(snkhg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNKHG: {varchar(100)}
     * @param snkhgList The collection of snkhg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnkhg_InScope(Collection<String> snkhgList) {
        doSetSnkhg_InScope(snkhgList);
    }

    protected void doSetSnkhg_InScope(Collection<String> snkhgList) {
        regINS(CK_INS, cTL(snkhgList), xgetCValueSnkhg(), "SNKHG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNKHG: {varchar(100)}
     * @param snkhgList The collection of snkhg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnkhg_NotInScope(Collection<String> snkhgList) {
        doSetSnkhg_NotInScope(snkhgList);
    }

    protected void doSetSnkhg_NotInScope(Collection<String> snkhgList) {
        regINS(CK_NINS, cTL(snkhgList), xgetCValueSnkhg(), "SNKHG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNKHG: {varchar(100)} <br>
     * <pre>e.g. setSnkhg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param snkhg The value of snkhg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSnkhg_LikeSearch(String snkhg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(snkhg), xgetCValueSnkhg(), "SNKHG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNKHG: {varchar(100)}
     * @param snkhg The value of snkhg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSnkhg_NotLikeSearch(String snkhg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(snkhg), xgetCValueSnkhg(), "SNKHG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNKHG: {varchar(100)}
     * @param snkhg The value of snkhg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSnkhg_PrefixSearch(String snkhg) {
        setSnkhg_LikeSearch(snkhg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SNKHG: {varchar(100)}
     */
    public void setSnkhg_IsNull() { regSnkhg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SNKHG: {varchar(100)}
     */
    public void setSnkhg_IsNullOrEmpty() { regSnkhg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SNKHG: {varchar(100)}
     */
    public void setSnkhg_IsNotNull() { regSnkhg(CK_ISNN, DOBJ); }

    protected void regSnkhg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSnkhg(), "SNKHG"); }
    protected abstract ConditionValue xgetCValueSnkhg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TXCANSFG: {varchar(100)}
     * @param txcansfg The value of txcansfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTxcansfg_Equal(String txcansfg) {
        doSetTxcansfg_Equal(fRES(txcansfg));
    }

    protected void doSetTxcansfg_Equal(String txcansfg) {
        regTxcansfg(CK_EQ, txcansfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TXCANSFG: {varchar(100)}
     * @param txcansfg The value of txcansfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTxcansfg_NotEqual(String txcansfg) {
        doSetTxcansfg_NotEqual(fRES(txcansfg));
    }

    protected void doSetTxcansfg_NotEqual(String txcansfg) {
        regTxcansfg(CK_NES, txcansfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TXCANSFG: {varchar(100)}
     * @param txcansfg The value of txcansfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTxcansfg_GreaterThan(String txcansfg) {
        regTxcansfg(CK_GT, fRES(txcansfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TXCANSFG: {varchar(100)}
     * @param txcansfg The value of txcansfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTxcansfg_LessThan(String txcansfg) {
        regTxcansfg(CK_LT, fRES(txcansfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TXCANSFG: {varchar(100)}
     * @param txcansfg The value of txcansfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTxcansfg_GreaterEqual(String txcansfg) {
        regTxcansfg(CK_GE, fRES(txcansfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TXCANSFG: {varchar(100)}
     * @param txcansfg The value of txcansfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTxcansfg_LessEqual(String txcansfg) {
        regTxcansfg(CK_LE, fRES(txcansfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TXCANSFG: {varchar(100)}
     * @param txcansfgList The collection of txcansfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTxcansfg_InScope(Collection<String> txcansfgList) {
        doSetTxcansfg_InScope(txcansfgList);
    }

    protected void doSetTxcansfg_InScope(Collection<String> txcansfgList) {
        regINS(CK_INS, cTL(txcansfgList), xgetCValueTxcansfg(), "TXCANSFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TXCANSFG: {varchar(100)}
     * @param txcansfgList The collection of txcansfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTxcansfg_NotInScope(Collection<String> txcansfgList) {
        doSetTxcansfg_NotInScope(txcansfgList);
    }

    protected void doSetTxcansfg_NotInScope(Collection<String> txcansfgList) {
        regINS(CK_NINS, cTL(txcansfgList), xgetCValueTxcansfg(), "TXCANSFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TXCANSFG: {varchar(100)} <br>
     * <pre>e.g. setTxcansfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param txcansfg The value of txcansfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTxcansfg_LikeSearch(String txcansfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(txcansfg), xgetCValueTxcansfg(), "TXCANSFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TXCANSFG: {varchar(100)}
     * @param txcansfg The value of txcansfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTxcansfg_NotLikeSearch(String txcansfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(txcansfg), xgetCValueTxcansfg(), "TXCANSFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TXCANSFG: {varchar(100)}
     * @param txcansfg The value of txcansfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTxcansfg_PrefixSearch(String txcansfg) {
        setTxcansfg_LikeSearch(txcansfg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TXCANSFG: {varchar(100)}
     */
    public void setTxcansfg_IsNull() { regTxcansfg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TXCANSFG: {varchar(100)}
     */
    public void setTxcansfg_IsNullOrEmpty() { regTxcansfg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TXCANSFG: {varchar(100)}
     */
    public void setTxcansfg_IsNotNull() { regTxcansfg(CK_ISNN, DOBJ); }

    protected void regTxcansfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTxcansfg(), "TXCANSFG"); }
    protected abstract ConditionValue xgetCValueTxcansfg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSNPT: {varchar(100)}
     * @param csnpt The value of csnpt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsnpt_Equal(String csnpt) {
        doSetCsnpt_Equal(fRES(csnpt));
    }

    protected void doSetCsnpt_Equal(String csnpt) {
        regCsnpt(CK_EQ, csnpt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSNPT: {varchar(100)}
     * @param csnpt The value of csnpt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsnpt_NotEqual(String csnpt) {
        doSetCsnpt_NotEqual(fRES(csnpt));
    }

    protected void doSetCsnpt_NotEqual(String csnpt) {
        regCsnpt(CK_NES, csnpt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSNPT: {varchar(100)}
     * @param csnpt The value of csnpt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsnpt_GreaterThan(String csnpt) {
        regCsnpt(CK_GT, fRES(csnpt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSNPT: {varchar(100)}
     * @param csnpt The value of csnpt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsnpt_LessThan(String csnpt) {
        regCsnpt(CK_LT, fRES(csnpt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSNPT: {varchar(100)}
     * @param csnpt The value of csnpt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsnpt_GreaterEqual(String csnpt) {
        regCsnpt(CK_GE, fRES(csnpt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSNPT: {varchar(100)}
     * @param csnpt The value of csnpt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsnpt_LessEqual(String csnpt) {
        regCsnpt(CK_LE, fRES(csnpt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CSNPT: {varchar(100)}
     * @param csnptList The collection of csnpt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsnpt_InScope(Collection<String> csnptList) {
        doSetCsnpt_InScope(csnptList);
    }

    protected void doSetCsnpt_InScope(Collection<String> csnptList) {
        regINS(CK_INS, cTL(csnptList), xgetCValueCsnpt(), "CSNPT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CSNPT: {varchar(100)}
     * @param csnptList The collection of csnpt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsnpt_NotInScope(Collection<String> csnptList) {
        doSetCsnpt_NotInScope(csnptList);
    }

    protected void doSetCsnpt_NotInScope(Collection<String> csnptList) {
        regINS(CK_NINS, cTL(csnptList), xgetCValueCsnpt(), "CSNPT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CSNPT: {varchar(100)} <br>
     * <pre>e.g. setCsnpt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param csnpt The value of csnpt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCsnpt_LikeSearch(String csnpt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(csnpt), xgetCValueCsnpt(), "CSNPT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CSNPT: {varchar(100)}
     * @param csnpt The value of csnpt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCsnpt_NotLikeSearch(String csnpt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(csnpt), xgetCValueCsnpt(), "CSNPT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CSNPT: {varchar(100)}
     * @param csnpt The value of csnpt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsnpt_PrefixSearch(String csnpt) {
        setCsnpt_LikeSearch(csnpt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CSNPT: {varchar(100)}
     */
    public void setCsnpt_IsNull() { regCsnpt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CSNPT: {varchar(100)}
     */
    public void setCsnpt_IsNullOrEmpty() { regCsnpt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CSNPT: {varchar(100)}
     */
    public void setCsnpt_IsNotNull() { regCsnpt(CK_ISNN, DOBJ); }

    protected void regCsnpt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCsnpt(), "CSNPT"); }
    protected abstract ConditionValue xgetCValueCsnpt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TBSOCSTM: {varchar(100)}
     * @param tbsocstm The value of tbsocstm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTbsocstm_Equal(String tbsocstm) {
        doSetTbsocstm_Equal(fRES(tbsocstm));
    }

    protected void doSetTbsocstm_Equal(String tbsocstm) {
        regTbsocstm(CK_EQ, tbsocstm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TBSOCSTM: {varchar(100)}
     * @param tbsocstm The value of tbsocstm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTbsocstm_NotEqual(String tbsocstm) {
        doSetTbsocstm_NotEqual(fRES(tbsocstm));
    }

    protected void doSetTbsocstm_NotEqual(String tbsocstm) {
        regTbsocstm(CK_NES, tbsocstm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TBSOCSTM: {varchar(100)}
     * @param tbsocstm The value of tbsocstm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTbsocstm_GreaterThan(String tbsocstm) {
        regTbsocstm(CK_GT, fRES(tbsocstm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TBSOCSTM: {varchar(100)}
     * @param tbsocstm The value of tbsocstm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTbsocstm_LessThan(String tbsocstm) {
        regTbsocstm(CK_LT, fRES(tbsocstm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TBSOCSTM: {varchar(100)}
     * @param tbsocstm The value of tbsocstm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTbsocstm_GreaterEqual(String tbsocstm) {
        regTbsocstm(CK_GE, fRES(tbsocstm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TBSOCSTM: {varchar(100)}
     * @param tbsocstm The value of tbsocstm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTbsocstm_LessEqual(String tbsocstm) {
        regTbsocstm(CK_LE, fRES(tbsocstm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TBSOCSTM: {varchar(100)}
     * @param tbsocstmList The collection of tbsocstm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTbsocstm_InScope(Collection<String> tbsocstmList) {
        doSetTbsocstm_InScope(tbsocstmList);
    }

    protected void doSetTbsocstm_InScope(Collection<String> tbsocstmList) {
        regINS(CK_INS, cTL(tbsocstmList), xgetCValueTbsocstm(), "TBSOCSTM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TBSOCSTM: {varchar(100)}
     * @param tbsocstmList The collection of tbsocstm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTbsocstm_NotInScope(Collection<String> tbsocstmList) {
        doSetTbsocstm_NotInScope(tbsocstmList);
    }

    protected void doSetTbsocstm_NotInScope(Collection<String> tbsocstmList) {
        regINS(CK_NINS, cTL(tbsocstmList), xgetCValueTbsocstm(), "TBSOCSTM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TBSOCSTM: {varchar(100)} <br>
     * <pre>e.g. setTbsocstm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tbsocstm The value of tbsocstm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTbsocstm_LikeSearch(String tbsocstm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tbsocstm), xgetCValueTbsocstm(), "TBSOCSTM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TBSOCSTM: {varchar(100)}
     * @param tbsocstm The value of tbsocstm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTbsocstm_NotLikeSearch(String tbsocstm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tbsocstm), xgetCValueTbsocstm(), "TBSOCSTM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TBSOCSTM: {varchar(100)}
     * @param tbsocstm The value of tbsocstm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTbsocstm_PrefixSearch(String tbsocstm) {
        setTbsocstm_LikeSearch(tbsocstm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TBSOCSTM: {varchar(100)}
     */
    public void setTbsocstm_IsNull() { regTbsocstm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TBSOCSTM: {varchar(100)}
     */
    public void setTbsocstm_IsNullOrEmpty() { regTbsocstm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TBSOCSTM: {varchar(100)}
     */
    public void setTbsocstm_IsNotNull() { regTbsocstm(CK_ISNN, DOBJ); }

    protected void regTbsocstm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTbsocstm(), "TBSOCSTM"); }
    protected abstract ConditionValue xgetCValueTbsocstm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODTSCD: {varchar(100)}
     * @param odtscd The value of odtscd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_Equal(String odtscd) {
        doSetOdtscd_Equal(fRES(odtscd));
    }

    protected void doSetOdtscd_Equal(String odtscd) {
        regOdtscd(CK_EQ, odtscd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODTSCD: {varchar(100)}
     * @param odtscd The value of odtscd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_NotEqual(String odtscd) {
        doSetOdtscd_NotEqual(fRES(odtscd));
    }

    protected void doSetOdtscd_NotEqual(String odtscd) {
        regOdtscd(CK_NES, odtscd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODTSCD: {varchar(100)}
     * @param odtscd The value of odtscd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_GreaterThan(String odtscd) {
        regOdtscd(CK_GT, fRES(odtscd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODTSCD: {varchar(100)}
     * @param odtscd The value of odtscd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_LessThan(String odtscd) {
        regOdtscd(CK_LT, fRES(odtscd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODTSCD: {varchar(100)}
     * @param odtscd The value of odtscd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_GreaterEqual(String odtscd) {
        regOdtscd(CK_GE, fRES(odtscd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODTSCD: {varchar(100)}
     * @param odtscd The value of odtscd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_LessEqual(String odtscd) {
        regOdtscd(CK_LE, fRES(odtscd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ODTSCD: {varchar(100)}
     * @param odtscdList The collection of odtscd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_InScope(Collection<String> odtscdList) {
        doSetOdtscd_InScope(odtscdList);
    }

    protected void doSetOdtscd_InScope(Collection<String> odtscdList) {
        regINS(CK_INS, cTL(odtscdList), xgetCValueOdtscd(), "ODTSCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ODTSCD: {varchar(100)}
     * @param odtscdList The collection of odtscd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_NotInScope(Collection<String> odtscdList) {
        doSetOdtscd_NotInScope(odtscdList);
    }

    protected void doSetOdtscd_NotInScope(Collection<String> odtscdList) {
        regINS(CK_NINS, cTL(odtscdList), xgetCValueOdtscd(), "ODTSCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ODTSCD: {varchar(100)} <br>
     * <pre>e.g. setOdtscd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param odtscd The value of odtscd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOdtscd_LikeSearch(String odtscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(odtscd), xgetCValueOdtscd(), "ODTSCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ODTSCD: {varchar(100)}
     * @param odtscd The value of odtscd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOdtscd_NotLikeSearch(String odtscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(odtscd), xgetCValueOdtscd(), "ODTSCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ODTSCD: {varchar(100)}
     * @param odtscd The value of odtscd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdtscd_PrefixSearch(String odtscd) {
        setOdtscd_LikeSearch(odtscd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ODTSCD: {varchar(100)}
     */
    public void setOdtscd_IsNull() { regOdtscd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ODTSCD: {varchar(100)}
     */
    public void setOdtscd_IsNullOrEmpty() { regOdtscd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ODTSCD: {varchar(100)}
     */
    public void setOdtscd_IsNotNull() { regOdtscd(CK_ISNN, DOBJ); }

    protected void regOdtscd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOdtscd(), "ODTSCD"); }
    protected abstract ConditionValue xgetCValueOdtscd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LNARCD: {varchar(100)}
     * @param lnarcd The value of lnarcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_Equal(String lnarcd) {
        doSetLnarcd_Equal(fRES(lnarcd));
    }

    protected void doSetLnarcd_Equal(String lnarcd) {
        regLnarcd(CK_EQ, lnarcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LNARCD: {varchar(100)}
     * @param lnarcd The value of lnarcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_NotEqual(String lnarcd) {
        doSetLnarcd_NotEqual(fRES(lnarcd));
    }

    protected void doSetLnarcd_NotEqual(String lnarcd) {
        regLnarcd(CK_NES, lnarcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LNARCD: {varchar(100)}
     * @param lnarcd The value of lnarcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_GreaterThan(String lnarcd) {
        regLnarcd(CK_GT, fRES(lnarcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LNARCD: {varchar(100)}
     * @param lnarcd The value of lnarcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_LessThan(String lnarcd) {
        regLnarcd(CK_LT, fRES(lnarcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LNARCD: {varchar(100)}
     * @param lnarcd The value of lnarcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_GreaterEqual(String lnarcd) {
        regLnarcd(CK_GE, fRES(lnarcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LNARCD: {varchar(100)}
     * @param lnarcd The value of lnarcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_LessEqual(String lnarcd) {
        regLnarcd(CK_LE, fRES(lnarcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LNARCD: {varchar(100)}
     * @param lnarcdList The collection of lnarcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_InScope(Collection<String> lnarcdList) {
        doSetLnarcd_InScope(lnarcdList);
    }

    protected void doSetLnarcd_InScope(Collection<String> lnarcdList) {
        regINS(CK_INS, cTL(lnarcdList), xgetCValueLnarcd(), "LNARCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LNARCD: {varchar(100)}
     * @param lnarcdList The collection of lnarcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_NotInScope(Collection<String> lnarcdList) {
        doSetLnarcd_NotInScope(lnarcdList);
    }

    protected void doSetLnarcd_NotInScope(Collection<String> lnarcdList) {
        regINS(CK_NINS, cTL(lnarcdList), xgetCValueLnarcd(), "LNARCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LNARCD: {varchar(100)} <br>
     * <pre>e.g. setLnarcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lnarcd The value of lnarcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLnarcd_LikeSearch(String lnarcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lnarcd), xgetCValueLnarcd(), "LNARCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LNARCD: {varchar(100)}
     * @param lnarcd The value of lnarcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLnarcd_NotLikeSearch(String lnarcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lnarcd), xgetCValueLnarcd(), "LNARCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LNARCD: {varchar(100)}
     * @param lnarcd The value of lnarcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLnarcd_PrefixSearch(String lnarcd) {
        setLnarcd_LikeSearch(lnarcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LNARCD: {varchar(100)}
     */
    public void setLnarcd_IsNull() { regLnarcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LNARCD: {varchar(100)}
     */
    public void setLnarcd_IsNullOrEmpty() { regLnarcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LNARCD: {varchar(100)}
     */
    public void setLnarcd_IsNotNull() { regLnarcd(CK_ISNN, DOBJ); }

    protected void regLnarcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLnarcd(), "LNARCD"); }
    protected abstract ConditionValue xgetCValueLnarcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SASASID: {varchar(100)}
     * @param sasasid The value of sasasid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_Equal(String sasasid) {
        doSetSasasid_Equal(fRES(sasasid));
    }

    protected void doSetSasasid_Equal(String sasasid) {
        regSasasid(CK_EQ, sasasid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SASASID: {varchar(100)}
     * @param sasasid The value of sasasid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_NotEqual(String sasasid) {
        doSetSasasid_NotEqual(fRES(sasasid));
    }

    protected void doSetSasasid_NotEqual(String sasasid) {
        regSasasid(CK_NES, sasasid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SASASID: {varchar(100)}
     * @param sasasid The value of sasasid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_GreaterThan(String sasasid) {
        regSasasid(CK_GT, fRES(sasasid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SASASID: {varchar(100)}
     * @param sasasid The value of sasasid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_LessThan(String sasasid) {
        regSasasid(CK_LT, fRES(sasasid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SASASID: {varchar(100)}
     * @param sasasid The value of sasasid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_GreaterEqual(String sasasid) {
        regSasasid(CK_GE, fRES(sasasid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SASASID: {varchar(100)}
     * @param sasasid The value of sasasid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_LessEqual(String sasasid) {
        regSasasid(CK_LE, fRES(sasasid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SASASID: {varchar(100)}
     * @param sasasidList The collection of sasasid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_InScope(Collection<String> sasasidList) {
        doSetSasasid_InScope(sasasidList);
    }

    protected void doSetSasasid_InScope(Collection<String> sasasidList) {
        regINS(CK_INS, cTL(sasasidList), xgetCValueSasasid(), "SASASID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SASASID: {varchar(100)}
     * @param sasasidList The collection of sasasid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_NotInScope(Collection<String> sasasidList) {
        doSetSasasid_NotInScope(sasasidList);
    }

    protected void doSetSasasid_NotInScope(Collection<String> sasasidList) {
        regINS(CK_NINS, cTL(sasasidList), xgetCValueSasasid(), "SASASID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SASASID: {varchar(100)} <br>
     * <pre>e.g. setSasasid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sasasid The value of sasasid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSasasid_LikeSearch(String sasasid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sasasid), xgetCValueSasasid(), "SASASID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SASASID: {varchar(100)}
     * @param sasasid The value of sasasid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSasasid_NotLikeSearch(String sasasid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sasasid), xgetCValueSasasid(), "SASASID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SASASID: {varchar(100)}
     * @param sasasid The value of sasasid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSasasid_PrefixSearch(String sasasid) {
        setSasasid_LikeSearch(sasasid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SASASID: {varchar(100)}
     */
    public void setSasasid_IsNull() { regSasasid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SASASID: {varchar(100)}
     */
    public void setSasasid_IsNullOrEmpty() { regSasasid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SASASID: {varchar(100)}
     */
    public void setSasasid_IsNotNull() { regSasasid(CK_ISNN, DOBJ); }

    protected void regSasasid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSasasid(), "SASASID"); }
    protected abstract ConditionValue xgetCValueSasasid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(100)}
     * @param cmlrasid The value of cmlrasid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_Equal(String cmlrasid) {
        doSetCmlrasid_Equal(fRES(cmlrasid));
    }

    protected void doSetCmlrasid_Equal(String cmlrasid) {
        regCmlrasid(CK_EQ, cmlrasid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(100)}
     * @param cmlrasid The value of cmlrasid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_NotEqual(String cmlrasid) {
        doSetCmlrasid_NotEqual(fRES(cmlrasid));
    }

    protected void doSetCmlrasid_NotEqual(String cmlrasid) {
        regCmlrasid(CK_NES, cmlrasid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(100)}
     * @param cmlrasid The value of cmlrasid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_GreaterThan(String cmlrasid) {
        regCmlrasid(CK_GT, fRES(cmlrasid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(100)}
     * @param cmlrasid The value of cmlrasid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_LessThan(String cmlrasid) {
        regCmlrasid(CK_LT, fRES(cmlrasid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(100)}
     * @param cmlrasid The value of cmlrasid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_GreaterEqual(String cmlrasid) {
        regCmlrasid(CK_GE, fRES(cmlrasid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(100)}
     * @param cmlrasid The value of cmlrasid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_LessEqual(String cmlrasid) {
        regCmlrasid(CK_LE, fRES(cmlrasid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CMLRASID: {varchar(100)}
     * @param cmlrasidList The collection of cmlrasid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_InScope(Collection<String> cmlrasidList) {
        doSetCmlrasid_InScope(cmlrasidList);
    }

    protected void doSetCmlrasid_InScope(Collection<String> cmlrasidList) {
        regINS(CK_INS, cTL(cmlrasidList), xgetCValueCmlrasid(), "CMLRASID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CMLRASID: {varchar(100)}
     * @param cmlrasidList The collection of cmlrasid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_NotInScope(Collection<String> cmlrasidList) {
        doSetCmlrasid_NotInScope(cmlrasidList);
    }

    protected void doSetCmlrasid_NotInScope(Collection<String> cmlrasidList) {
        regINS(CK_NINS, cTL(cmlrasidList), xgetCValueCmlrasid(), "CMLRASID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CMLRASID: {varchar(100)} <br>
     * <pre>e.g. setCmlrasid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cmlrasid The value of cmlrasid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCmlrasid_LikeSearch(String cmlrasid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cmlrasid), xgetCValueCmlrasid(), "CMLRASID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CMLRASID: {varchar(100)}
     * @param cmlrasid The value of cmlrasid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCmlrasid_NotLikeSearch(String cmlrasid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cmlrasid), xgetCValueCmlrasid(), "CMLRASID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CMLRASID: {varchar(100)}
     * @param cmlrasid The value of cmlrasid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_PrefixSearch(String cmlrasid) {
        setCmlrasid_LikeSearch(cmlrasid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(100)}
     */
    public void setCmlrasid_IsNull() { regCmlrasid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(100)}
     */
    public void setCmlrasid_IsNullOrEmpty() { regCmlrasid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(100)}
     */
    public void setCmlrasid_IsNotNull() { regCmlrasid(CK_ISNN, DOBJ); }

    protected void regCmlrasid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCmlrasid(), "CMLRASID"); }
    protected abstract ConditionValue xgetCValueCmlrasid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSOID: {varchar(100)}
     * @param csoid The value of csoid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsoid_Equal(String csoid) {
        doSetCsoid_Equal(fRES(csoid));
    }

    protected void doSetCsoid_Equal(String csoid) {
        regCsoid(CK_EQ, csoid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSOID: {varchar(100)}
     * @param csoid The value of csoid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsoid_NotEqual(String csoid) {
        doSetCsoid_NotEqual(fRES(csoid));
    }

    protected void doSetCsoid_NotEqual(String csoid) {
        regCsoid(CK_NES, csoid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSOID: {varchar(100)}
     * @param csoid The value of csoid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsoid_GreaterThan(String csoid) {
        regCsoid(CK_GT, fRES(csoid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSOID: {varchar(100)}
     * @param csoid The value of csoid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsoid_LessThan(String csoid) {
        regCsoid(CK_LT, fRES(csoid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSOID: {varchar(100)}
     * @param csoid The value of csoid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsoid_GreaterEqual(String csoid) {
        regCsoid(CK_GE, fRES(csoid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSOID: {varchar(100)}
     * @param csoid The value of csoid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsoid_LessEqual(String csoid) {
        regCsoid(CK_LE, fRES(csoid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CSOID: {varchar(100)}
     * @param csoidList The collection of csoid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsoid_InScope(Collection<String> csoidList) {
        doSetCsoid_InScope(csoidList);
    }

    protected void doSetCsoid_InScope(Collection<String> csoidList) {
        regINS(CK_INS, cTL(csoidList), xgetCValueCsoid(), "CSOID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CSOID: {varchar(100)}
     * @param csoidList The collection of csoid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsoid_NotInScope(Collection<String> csoidList) {
        doSetCsoid_NotInScope(csoidList);
    }

    protected void doSetCsoid_NotInScope(Collection<String> csoidList) {
        regINS(CK_NINS, cTL(csoidList), xgetCValueCsoid(), "CSOID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CSOID: {varchar(100)} <br>
     * <pre>e.g. setCsoid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param csoid The value of csoid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCsoid_LikeSearch(String csoid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(csoid), xgetCValueCsoid(), "CSOID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CSOID: {varchar(100)}
     * @param csoid The value of csoid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCsoid_NotLikeSearch(String csoid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(csoid), xgetCValueCsoid(), "CSOID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CSOID: {varchar(100)}
     * @param csoid The value of csoid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsoid_PrefixSearch(String csoid) {
        setCsoid_LikeSearch(csoid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CSOID: {varchar(100)}
     */
    public void setCsoid_IsNull() { regCsoid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CSOID: {varchar(100)}
     */
    public void setCsoid_IsNullOrEmpty() { regCsoid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CSOID: {varchar(100)}
     */
    public void setCsoid_IsNotNull() { regCsoid(CK_ISNN, DOBJ); }

    protected void regCsoid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCsoid(), "CSOID"); }
    protected abstract ConditionValue xgetCValueCsoid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPMN: {bigint(19)}
     * @param upmn The value of upmn as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpmn_Equal(Long upmn) {
        doSetUpmn_Equal(upmn);
    }

    protected void doSetUpmn_Equal(Long upmn) {
        regUpmn(CK_EQ, upmn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPMN: {bigint(19)}
     * @param upmn The value of upmn as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpmn_NotEqual(Long upmn) {
        doSetUpmn_NotEqual(upmn);
    }

    protected void doSetUpmn_NotEqual(Long upmn) {
        regUpmn(CK_NES, upmn);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPMN: {bigint(19)}
     * @param upmn The value of upmn as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpmn_GreaterThan(Long upmn) {
        regUpmn(CK_GT, upmn);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPMN: {bigint(19)}
     * @param upmn The value of upmn as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpmn_LessThan(Long upmn) {
        regUpmn(CK_LT, upmn);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPMN: {bigint(19)}
     * @param upmn The value of upmn as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpmn_GreaterEqual(Long upmn) {
        regUpmn(CK_GE, upmn);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPMN: {bigint(19)}
     * @param upmn The value of upmn as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpmn_LessEqual(Long upmn) {
        regUpmn(CK_LE, upmn);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPMN: {bigint(19)}
     * @param minNumber The min number of upmn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of upmn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUpmn_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUpmn(), "UPMN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UPMN: {bigint(19)}
     * @param upmnList The collection of upmn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpmn_InScope(Collection<Long> upmnList) {
        doSetUpmn_InScope(upmnList);
    }

    protected void doSetUpmn_InScope(Collection<Long> upmnList) {
        regINS(CK_INS, cTL(upmnList), xgetCValueUpmn(), "UPMN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UPMN: {bigint(19)}
     * @param upmnList The collection of upmn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpmn_NotInScope(Collection<Long> upmnList) {
        doSetUpmn_NotInScope(upmnList);
    }

    protected void doSetUpmn_NotInScope(Collection<Long> upmnList) {
        regINS(CK_NINS, cTL(upmnList), xgetCValueUpmn(), "UPMN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPMN: {bigint(19)}
     */
    public void setUpmn_IsNull() { regUpmn(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPMN: {bigint(19)}
     */
    public void setUpmn_IsNotNull() { regUpmn(CK_ISNN, DOBJ); }

    protected void regUpmn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpmn(), "UPMN"); }
    protected abstract ConditionValue xgetCValueUpmn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHNGYD: {varchar(8)}
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
     * CHNGYD: {varchar(8)}
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
     * CHNGYD: {varchar(8)}
     * @param chngyd The value of chngyd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_GreaterThan(String chngyd) {
        regChngyd(CK_GT, fRES(chngyd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHNGYD: {varchar(8)}
     * @param chngyd The value of chngyd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_LessThan(String chngyd) {
        regChngyd(CK_LT, fRES(chngyd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHNGYD: {varchar(8)}
     * @param chngyd The value of chngyd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_GreaterEqual(String chngyd) {
        regChngyd(CK_GE, fRES(chngyd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHNGYD: {varchar(8)}
     * @param chngyd The value of chngyd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_LessEqual(String chngyd) {
        regChngyd(CK_LE, fRES(chngyd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHNGYD: {varchar(8)}
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
     * CHNGYD: {varchar(8)}
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
     * CHNGYD: {varchar(8)} <br>
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
     * CHNGYD: {varchar(8)}
     * @param chngyd The value of chngyd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setChngyd_NotLikeSearch(String chngyd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(chngyd), xgetCValueChngyd(), "CHNGYD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHNGYD: {varchar(8)}
     * @param chngyd The value of chngyd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_PrefixSearch(String chngyd) {
        setChngyd_LikeSearch(chngyd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHNGYD: {varchar(8)}
     */
    public void setChngyd_IsNull() { regChngyd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CHNGYD: {varchar(8)}
     */
    public void setChngyd_IsNullOrEmpty() { regChngyd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHNGYD: {varchar(8)}
     */
    public void setChngyd_IsNotNull() { regChngyd(CK_ISNN, DOBJ); }

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDIS: {bigint(19)}
     * @param updis The value of updis as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdis_Equal(Long updis) {
        doSetUpdis_Equal(updis);
    }

    protected void doSetUpdis_Equal(Long updis) {
        regUpdis(CK_EQ, updis);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDIS: {bigint(19)}
     * @param updis The value of updis as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdis_NotEqual(Long updis) {
        doSetUpdis_NotEqual(updis);
    }

    protected void doSetUpdis_NotEqual(Long updis) {
        regUpdis(CK_NES, updis);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDIS: {bigint(19)}
     * @param updis The value of updis as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdis_GreaterThan(Long updis) {
        regUpdis(CK_GT, updis);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDIS: {bigint(19)}
     * @param updis The value of updis as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdis_LessThan(Long updis) {
        regUpdis(CK_LT, updis);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDIS: {bigint(19)}
     * @param updis The value of updis as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdis_GreaterEqual(Long updis) {
        regUpdis(CK_GE, updis);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDIS: {bigint(19)}
     * @param updis The value of updis as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdis_LessEqual(Long updis) {
        regUpdis(CK_LE, updis);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPDIS: {bigint(19)}
     * @param minNumber The min number of updis. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of updis. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUpdis_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUpdis(), "UPDIS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UPDIS: {bigint(19)}
     * @param updisList The collection of updis as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdis_InScope(Collection<Long> updisList) {
        doSetUpdis_InScope(updisList);
    }

    protected void doSetUpdis_InScope(Collection<Long> updisList) {
        regINS(CK_INS, cTL(updisList), xgetCValueUpdis(), "UPDIS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UPDIS: {bigint(19)}
     * @param updisList The collection of updis as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdis_NotInScope(Collection<Long> updisList) {
        doSetUpdis_NotInScope(updisList);
    }

    protected void doSetUpdis_NotInScope(Collection<Long> updisList) {
        regINS(CK_NINS, cTL(updisList), xgetCValueUpdis(), "UPDIS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPDIS: {bigint(19)}
     */
    public void setUpdis_IsNull() { regUpdis(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPDIS: {bigint(19)}
     */
    public void setUpdis_IsNotNull() { regUpdis(CK_ISNN, DOBJ); }

    protected void regUpdis(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdis(), "UPDIS"); }
    protected abstract ConditionValue xgetCValueUpdis();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPBMN: {bigint(19)}
     * @param upbmn The value of upbmn as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpbmn_Equal(Long upbmn) {
        doSetUpbmn_Equal(upbmn);
    }

    protected void doSetUpbmn_Equal(Long upbmn) {
        regUpbmn(CK_EQ, upbmn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPBMN: {bigint(19)}
     * @param upbmn The value of upbmn as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpbmn_NotEqual(Long upbmn) {
        doSetUpbmn_NotEqual(upbmn);
    }

    protected void doSetUpbmn_NotEqual(Long upbmn) {
        regUpbmn(CK_NES, upbmn);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPBMN: {bigint(19)}
     * @param upbmn The value of upbmn as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpbmn_GreaterThan(Long upbmn) {
        regUpbmn(CK_GT, upbmn);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPBMN: {bigint(19)}
     * @param upbmn The value of upbmn as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpbmn_LessThan(Long upbmn) {
        regUpbmn(CK_LT, upbmn);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPBMN: {bigint(19)}
     * @param upbmn The value of upbmn as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpbmn_GreaterEqual(Long upbmn) {
        regUpbmn(CK_GE, upbmn);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPBMN: {bigint(19)}
     * @param upbmn The value of upbmn as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpbmn_LessEqual(Long upbmn) {
        regUpbmn(CK_LE, upbmn);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPBMN: {bigint(19)}
     * @param minNumber The min number of upbmn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of upbmn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUpbmn_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUpbmn(), "UPBMN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UPBMN: {bigint(19)}
     * @param upbmnList The collection of upbmn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpbmn_InScope(Collection<Long> upbmnList) {
        doSetUpbmn_InScope(upbmnList);
    }

    protected void doSetUpbmn_InScope(Collection<Long> upbmnList) {
        regINS(CK_INS, cTL(upbmnList), xgetCValueUpbmn(), "UPBMN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UPBMN: {bigint(19)}
     * @param upbmnList The collection of upbmn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpbmn_NotInScope(Collection<Long> upbmnList) {
        doSetUpbmn_NotInScope(upbmnList);
    }

    protected void doSetUpbmn_NotInScope(Collection<Long> upbmnList) {
        regINS(CK_NINS, cTL(upbmnList), xgetCValueUpbmn(), "UPBMN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPBMN: {bigint(19)}
     */
    public void setUpbmn_IsNull() { regUpbmn(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPBMN: {bigint(19)}
     */
    public void setUpbmn_IsNotNull() { regUpbmn(CK_ISNN, DOBJ); }

    protected void regUpbmn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpbmn(), "UPBMN"); }
    protected abstract ConditionValue xgetCValueUpbmn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(8)}
     * @param bchngyd The value of bchngyd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_Equal(String bchngyd) {
        doSetBchngyd_Equal(fRES(bchngyd));
    }

    protected void doSetBchngyd_Equal(String bchngyd) {
        regBchngyd(CK_EQ, bchngyd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(8)}
     * @param bchngyd The value of bchngyd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_NotEqual(String bchngyd) {
        doSetBchngyd_NotEqual(fRES(bchngyd));
    }

    protected void doSetBchngyd_NotEqual(String bchngyd) {
        regBchngyd(CK_NES, bchngyd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(8)}
     * @param bchngyd The value of bchngyd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_GreaterThan(String bchngyd) {
        regBchngyd(CK_GT, fRES(bchngyd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(8)}
     * @param bchngyd The value of bchngyd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_LessThan(String bchngyd) {
        regBchngyd(CK_LT, fRES(bchngyd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(8)}
     * @param bchngyd The value of bchngyd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_GreaterEqual(String bchngyd) {
        regBchngyd(CK_GE, fRES(bchngyd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(8)}
     * @param bchngyd The value of bchngyd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_LessEqual(String bchngyd) {
        regBchngyd(CK_LE, fRES(bchngyd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BCHNGYD: {varchar(8)}
     * @param bchngydList The collection of bchngyd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_InScope(Collection<String> bchngydList) {
        doSetBchngyd_InScope(bchngydList);
    }

    protected void doSetBchngyd_InScope(Collection<String> bchngydList) {
        regINS(CK_INS, cTL(bchngydList), xgetCValueBchngyd(), "BCHNGYD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BCHNGYD: {varchar(8)}
     * @param bchngydList The collection of bchngyd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_NotInScope(Collection<String> bchngydList) {
        doSetBchngyd_NotInScope(bchngydList);
    }

    protected void doSetBchngyd_NotInScope(Collection<String> bchngydList) {
        regINS(CK_NINS, cTL(bchngydList), xgetCValueBchngyd(), "BCHNGYD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BCHNGYD: {varchar(8)} <br>
     * <pre>e.g. setBchngyd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bchngyd The value of bchngyd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBchngyd_LikeSearch(String bchngyd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bchngyd), xgetCValueBchngyd(), "BCHNGYD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BCHNGYD: {varchar(8)}
     * @param bchngyd The value of bchngyd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBchngyd_NotLikeSearch(String bchngyd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bchngyd), xgetCValueBchngyd(), "BCHNGYD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BCHNGYD: {varchar(8)}
     * @param bchngyd The value of bchngyd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_PrefixSearch(String bchngyd) {
        setBchngyd_LikeSearch(bchngyd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(8)}
     */
    public void setBchngyd_IsNull() { regBchngyd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(8)}
     */
    public void setBchngyd_IsNullOrEmpty() { regBchngyd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(8)}
     */
    public void setBchngyd_IsNotNull() { regBchngyd(CK_ISNN, DOBJ); }

    protected void regBchngyd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBchngyd(), "BCHNGYD"); }
    protected abstract ConditionValue xgetCValueBchngyd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BUPDTM: {bigint(19)}
     * @param bupdtm The value of bupdtm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBupdtm_Equal(Long bupdtm) {
        doSetBupdtm_Equal(bupdtm);
    }

    protected void doSetBupdtm_Equal(Long bupdtm) {
        regBupdtm(CK_EQ, bupdtm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BUPDTM: {bigint(19)}
     * @param bupdtm The value of bupdtm as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBupdtm_NotEqual(Long bupdtm) {
        doSetBupdtm_NotEqual(bupdtm);
    }

    protected void doSetBupdtm_NotEqual(Long bupdtm) {
        regBupdtm(CK_NES, bupdtm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BUPDTM: {bigint(19)}
     * @param bupdtm The value of bupdtm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBupdtm_GreaterThan(Long bupdtm) {
        regBupdtm(CK_GT, bupdtm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BUPDTM: {bigint(19)}
     * @param bupdtm The value of bupdtm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBupdtm_LessThan(Long bupdtm) {
        regBupdtm(CK_LT, bupdtm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BUPDTM: {bigint(19)}
     * @param bupdtm The value of bupdtm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBupdtm_GreaterEqual(Long bupdtm) {
        regBupdtm(CK_GE, bupdtm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BUPDTM: {bigint(19)}
     * @param bupdtm The value of bupdtm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBupdtm_LessEqual(Long bupdtm) {
        regBupdtm(CK_LE, bupdtm);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BUPDTM: {bigint(19)}
     * @param minNumber The min number of bupdtm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bupdtm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBupdtm_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBupdtm(), "BUPDTM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BUPDTM: {bigint(19)}
     * @param bupdtmList The collection of bupdtm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBupdtm_InScope(Collection<Long> bupdtmList) {
        doSetBupdtm_InScope(bupdtmList);
    }

    protected void doSetBupdtm_InScope(Collection<Long> bupdtmList) {
        regINS(CK_INS, cTL(bupdtmList), xgetCValueBupdtm(), "BUPDTM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BUPDTM: {bigint(19)}
     * @param bupdtmList The collection of bupdtm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBupdtm_NotInScope(Collection<Long> bupdtmList) {
        doSetBupdtm_NotInScope(bupdtmList);
    }

    protected void doSetBupdtm_NotInScope(Collection<Long> bupdtmList) {
        regINS(CK_NINS, cTL(bupdtmList), xgetCValueBupdtm(), "BUPDTM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BUPDTM: {bigint(19)}
     */
    public void setBupdtm_IsNull() { regBupdtm(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BUPDTM: {bigint(19)}
     */
    public void setBupdtm_IsNotNull() { regBupdtm(CK_ISNN, DOBJ); }

    protected void regBupdtm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBupdtm(), "BUPDTM"); }
    protected abstract ConditionValue xgetCValueBupdtm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPOBMN: {bigint(19)}
     * @param upobmn The value of upobmn as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpobmn_Equal(Long upobmn) {
        doSetUpobmn_Equal(upobmn);
    }

    protected void doSetUpobmn_Equal(Long upobmn) {
        regUpobmn(CK_EQ, upobmn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPOBMN: {bigint(19)}
     * @param upobmn The value of upobmn as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpobmn_NotEqual(Long upobmn) {
        doSetUpobmn_NotEqual(upobmn);
    }

    protected void doSetUpobmn_NotEqual(Long upobmn) {
        regUpobmn(CK_NES, upobmn);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPOBMN: {bigint(19)}
     * @param upobmn The value of upobmn as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpobmn_GreaterThan(Long upobmn) {
        regUpobmn(CK_GT, upobmn);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPOBMN: {bigint(19)}
     * @param upobmn The value of upobmn as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpobmn_LessThan(Long upobmn) {
        regUpobmn(CK_LT, upobmn);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPOBMN: {bigint(19)}
     * @param upobmn The value of upobmn as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpobmn_GreaterEqual(Long upobmn) {
        regUpobmn(CK_GE, upobmn);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPOBMN: {bigint(19)}
     * @param upobmn The value of upobmn as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpobmn_LessEqual(Long upobmn) {
        regUpobmn(CK_LE, upobmn);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPOBMN: {bigint(19)}
     * @param minNumber The min number of upobmn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of upobmn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUpobmn_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUpobmn(), "UPOBMN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UPOBMN: {bigint(19)}
     * @param upobmnList The collection of upobmn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpobmn_InScope(Collection<Long> upobmnList) {
        doSetUpobmn_InScope(upobmnList);
    }

    protected void doSetUpobmn_InScope(Collection<Long> upobmnList) {
        regINS(CK_INS, cTL(upobmnList), xgetCValueUpobmn(), "UPOBMN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UPOBMN: {bigint(19)}
     * @param upobmnList The collection of upobmn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpobmn_NotInScope(Collection<Long> upobmnList) {
        doSetUpobmn_NotInScope(upobmnList);
    }

    protected void doSetUpobmn_NotInScope(Collection<Long> upobmnList) {
        regINS(CK_NINS, cTL(upobmnList), xgetCValueUpobmn(), "UPOBMN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPOBMN: {bigint(19)}
     */
    public void setUpobmn_IsNull() { regUpobmn(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPOBMN: {bigint(19)}
     */
    public void setUpobmn_IsNotNull() { regUpobmn(CK_ISNN, DOBJ); }

    protected void regUpobmn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpobmn(), "UPOBMN"); }
    protected abstract ConditionValue xgetCValueUpobmn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(8)}
     * @param obchngyd The value of obchngyd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_Equal(String obchngyd) {
        doSetObchngyd_Equal(fRES(obchngyd));
    }

    protected void doSetObchngyd_Equal(String obchngyd) {
        regObchngyd(CK_EQ, obchngyd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(8)}
     * @param obchngyd The value of obchngyd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_NotEqual(String obchngyd) {
        doSetObchngyd_NotEqual(fRES(obchngyd));
    }

    protected void doSetObchngyd_NotEqual(String obchngyd) {
        regObchngyd(CK_NES, obchngyd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(8)}
     * @param obchngyd The value of obchngyd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_GreaterThan(String obchngyd) {
        regObchngyd(CK_GT, fRES(obchngyd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(8)}
     * @param obchngyd The value of obchngyd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_LessThan(String obchngyd) {
        regObchngyd(CK_LT, fRES(obchngyd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(8)}
     * @param obchngyd The value of obchngyd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_GreaterEqual(String obchngyd) {
        regObchngyd(CK_GE, fRES(obchngyd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(8)}
     * @param obchngyd The value of obchngyd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_LessEqual(String obchngyd) {
        regObchngyd(CK_LE, fRES(obchngyd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OBCHNGYD: {varchar(8)}
     * @param obchngydList The collection of obchngyd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_InScope(Collection<String> obchngydList) {
        doSetObchngyd_InScope(obchngydList);
    }

    protected void doSetObchngyd_InScope(Collection<String> obchngydList) {
        regINS(CK_INS, cTL(obchngydList), xgetCValueObchngyd(), "OBCHNGYD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OBCHNGYD: {varchar(8)}
     * @param obchngydList The collection of obchngyd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_NotInScope(Collection<String> obchngydList) {
        doSetObchngyd_NotInScope(obchngydList);
    }

    protected void doSetObchngyd_NotInScope(Collection<String> obchngydList) {
        regINS(CK_NINS, cTL(obchngydList), xgetCValueObchngyd(), "OBCHNGYD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OBCHNGYD: {varchar(8)} <br>
     * <pre>e.g. setObchngyd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param obchngyd The value of obchngyd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setObchngyd_LikeSearch(String obchngyd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(obchngyd), xgetCValueObchngyd(), "OBCHNGYD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OBCHNGYD: {varchar(8)}
     * @param obchngyd The value of obchngyd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setObchngyd_NotLikeSearch(String obchngyd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(obchngyd), xgetCValueObchngyd(), "OBCHNGYD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OBCHNGYD: {varchar(8)}
     * @param obchngyd The value of obchngyd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_PrefixSearch(String obchngyd) {
        setObchngyd_LikeSearch(obchngyd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(8)}
     */
    public void setObchngyd_IsNull() { regObchngyd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(8)}
     */
    public void setObchngyd_IsNullOrEmpty() { regObchngyd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(8)}
     */
    public void setObchngyd_IsNotNull() { regObchngyd(CK_ISNN, DOBJ); }

    protected void regObchngyd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueObchngyd(), "OBCHNGYD"); }
    protected abstract ConditionValue xgetCValueObchngyd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OBUPDTM: {bigint(19)}
     * @param obupdtm The value of obupdtm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setObupdtm_Equal(Long obupdtm) {
        doSetObupdtm_Equal(obupdtm);
    }

    protected void doSetObupdtm_Equal(Long obupdtm) {
        regObupdtm(CK_EQ, obupdtm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OBUPDTM: {bigint(19)}
     * @param obupdtm The value of obupdtm as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setObupdtm_NotEqual(Long obupdtm) {
        doSetObupdtm_NotEqual(obupdtm);
    }

    protected void doSetObupdtm_NotEqual(Long obupdtm) {
        regObupdtm(CK_NES, obupdtm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OBUPDTM: {bigint(19)}
     * @param obupdtm The value of obupdtm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setObupdtm_GreaterThan(Long obupdtm) {
        regObupdtm(CK_GT, obupdtm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OBUPDTM: {bigint(19)}
     * @param obupdtm The value of obupdtm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setObupdtm_LessThan(Long obupdtm) {
        regObupdtm(CK_LT, obupdtm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OBUPDTM: {bigint(19)}
     * @param obupdtm The value of obupdtm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setObupdtm_GreaterEqual(Long obupdtm) {
        regObupdtm(CK_GE, obupdtm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OBUPDTM: {bigint(19)}
     * @param obupdtm The value of obupdtm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setObupdtm_LessEqual(Long obupdtm) {
        regObupdtm(CK_LE, obupdtm);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OBUPDTM: {bigint(19)}
     * @param minNumber The min number of obupdtm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of obupdtm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setObupdtm_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueObupdtm(), "OBUPDTM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OBUPDTM: {bigint(19)}
     * @param obupdtmList The collection of obupdtm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObupdtm_InScope(Collection<Long> obupdtmList) {
        doSetObupdtm_InScope(obupdtmList);
    }

    protected void doSetObupdtm_InScope(Collection<Long> obupdtmList) {
        regINS(CK_INS, cTL(obupdtmList), xgetCValueObupdtm(), "OBUPDTM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OBUPDTM: {bigint(19)}
     * @param obupdtmList The collection of obupdtm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObupdtm_NotInScope(Collection<Long> obupdtmList) {
        doSetObupdtm_NotInScope(obupdtmList);
    }

    protected void doSetObupdtm_NotInScope(Collection<Long> obupdtmList) {
        regINS(CK_NINS, cTL(obupdtmList), xgetCValueObupdtm(), "OBUPDTM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OBUPDTM: {bigint(19)}
     */
    public void setObupdtm_IsNull() { regObupdtm(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OBUPDTM: {bigint(19)}
     */
    public void setObupdtm_IsNotNull() { regObupdtm(CK_ISNN, DOBJ); }

    protected void regObupdtm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueObupdtm(), "OBUPDTM"); }
    protected abstract ConditionValue xgetCValueObupdtm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
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
     * ZZFRDATEH: {varchar(8)}
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
     * ZZFRDATEH: {varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_GreaterThan(String zzfrdateh) {
        regZzfrdateh(CK_GT, fRES(zzfrdateh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_LessThan(String zzfrdateh) {
        regZzfrdateh(CK_LT, fRES(zzfrdateh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_GreaterEqual(String zzfrdateh) {
        regZzfrdateh(CK_GE, fRES(zzfrdateh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_LessEqual(String zzfrdateh) {
        regZzfrdateh(CK_LE, fRES(zzfrdateh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
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
     * ZZFRDATEH: {varchar(8)}
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
     * ZZFRDATEH: {varchar(8)} <br>
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
     * ZZFRDATEH: {varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzfrdateh_NotLikeSearch(String zzfrdateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzfrdateh), xgetCValueZzfrdateh(), "ZZFRDATEH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
     * @param zzfrdateh The value of zzfrdateh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_PrefixSearch(String zzfrdateh) {
        setZzfrdateh_LikeSearch(zzfrdateh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
     */
    public void setZzfrdateh_IsNull() { regZzfrdateh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
     */
    public void setZzfrdateh_IsNullOrEmpty() { regZzfrdateh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(8)}
     */
    public void setZzfrdateh_IsNotNull() { regZzfrdateh(CK_ISNN, DOBJ); }

    protected void regZzfrdateh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzfrdateh(), "ZZFRDATEH"); }
    protected abstract ConditionValue xgetCValueZzfrdateh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(8)}
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
     * ZZTODATEH: {varchar(8)}
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
     * ZZTODATEH: {varchar(8)}
     * @param zztodateh The value of zztodateh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_GreaterThan(String zztodateh) {
        regZztodateh(CK_GT, fRES(zztodateh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     * @param zztodateh The value of zztodateh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_LessThan(String zztodateh) {
        regZztodateh(CK_LT, fRES(zztodateh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     * @param zztodateh The value of zztodateh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_GreaterEqual(String zztodateh) {
        regZztodateh(CK_GE, fRES(zztodateh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     * @param zztodateh The value of zztodateh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_LessEqual(String zztodateh) {
        regZztodateh(CK_LE, fRES(zztodateh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZTODATEH: {varchar(8)}
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
     * ZZTODATEH: {varchar(8)}
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
     * ZZTODATEH: {varchar(8)} <br>
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
     * ZZTODATEH: {varchar(8)}
     * @param zztodateh The value of zztodateh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZztodateh_NotLikeSearch(String zztodateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zztodateh), xgetCValueZztodateh(), "ZZTODATEH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     * @param zztodateh The value of zztodateh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_PrefixSearch(String zztodateh) {
        setZztodateh_LikeSearch(zztodateh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     */
    public void setZztodateh_IsNull() { regZztodateh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     */
    public void setZztodateh_IsNullOrEmpty() { regZztodateh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(8)}
     */
    public void setZztodateh_IsNotNull() { regZztodateh(CK_ISNN, DOBJ); }

    protected void regZztodateh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZztodateh(), "ZZTODATEH"); }
    protected abstract ConditionValue xgetCValueZztodateh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDUPDPS: {varchar(30)}
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
     * RCDUPDPS: {varchar(30)}
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
     * RCDUPDPS: {varchar(30)}
     * @param rcdupdps The value of rcdupdps as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_GreaterThan(String rcdupdps) {
        regRcdupdps(CK_GT, fRES(rcdupdps));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDUPDPS: {varchar(30)}
     * @param rcdupdps The value of rcdupdps as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_LessThan(String rcdupdps) {
        regRcdupdps(CK_LT, fRES(rcdupdps));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDUPDPS: {varchar(30)}
     * @param rcdupdps The value of rcdupdps as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_GreaterEqual(String rcdupdps) {
        regRcdupdps(CK_GE, fRES(rcdupdps));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDUPDPS: {varchar(30)}
     * @param rcdupdps The value of rcdupdps as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_LessEqual(String rcdupdps) {
        regRcdupdps(CK_LE, fRES(rcdupdps));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCDUPDPS: {varchar(30)}
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
     * RCDUPDPS: {varchar(30)}
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
     * RCDUPDPS: {varchar(30)} <br>
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
     * RCDUPDPS: {varchar(30)}
     * @param rcdupdps The value of rcdupdps as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcdupdps_NotLikeSearch(String rcdupdps, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcdupdps), xgetCValueRcdupdps(), "RCDUPDPS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCDUPDPS: {varchar(30)}
     * @param rcdupdps The value of rcdupdps as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_PrefixSearch(String rcdupdps) {
        setRcdupdps_LikeSearch(rcdupdps, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCDUPDPS: {varchar(30)}
     */
    public void setRcdupdps_IsNull() { regRcdupdps(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCDUPDPS: {varchar(30)}
     */
    public void setRcdupdps_IsNullOrEmpty() { regRcdupdps(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCDUPDPS: {varchar(30)}
     */
    public void setRcdupdps_IsNotNull() { regRcdupdps(CK_ISNN, DOBJ); }

    protected void regRcdupdps(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcdupdps(), "RCDUPDPS"); }
    protected abstract ConditionValue xgetCValueRcdupdps();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDUSRID: {bigint(19)}
     * @param updusrid The value of updusrid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdusrid_Equal(Long updusrid) {
        doSetUpdusrid_Equal(updusrid);
    }

    protected void doSetUpdusrid_Equal(Long updusrid) {
        regUpdusrid(CK_EQ, updusrid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDUSRID: {bigint(19)}
     * @param updusrid The value of updusrid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdusrid_NotEqual(Long updusrid) {
        doSetUpdusrid_NotEqual(updusrid);
    }

    protected void doSetUpdusrid_NotEqual(Long updusrid) {
        regUpdusrid(CK_NES, updusrid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDUSRID: {bigint(19)}
     * @param updusrid The value of updusrid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdusrid_GreaterThan(Long updusrid) {
        regUpdusrid(CK_GT, updusrid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDUSRID: {bigint(19)}
     * @param updusrid The value of updusrid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdusrid_LessThan(Long updusrid) {
        regUpdusrid(CK_LT, updusrid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDUSRID: {bigint(19)}
     * @param updusrid The value of updusrid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdusrid_GreaterEqual(Long updusrid) {
        regUpdusrid(CK_GE, updusrid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDUSRID: {bigint(19)}
     * @param updusrid The value of updusrid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdusrid_LessEqual(Long updusrid) {
        regUpdusrid(CK_LE, updusrid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPDUSRID: {bigint(19)}
     * @param minNumber The min number of updusrid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of updusrid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUpdusrid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUpdusrid(), "UPDUSRID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UPDUSRID: {bigint(19)}
     * @param updusridList The collection of updusrid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdusrid_InScope(Collection<Long> updusridList) {
        doSetUpdusrid_InScope(updusridList);
    }

    protected void doSetUpdusrid_InScope(Collection<Long> updusridList) {
        regINS(CK_INS, cTL(updusridList), xgetCValueUpdusrid(), "UPDUSRID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UPDUSRID: {bigint(19)}
     * @param updusridList The collection of updusrid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdusrid_NotInScope(Collection<Long> updusridList) {
        doSetUpdusrid_NotInScope(updusridList);
    }

    protected void doSetUpdusrid_NotInScope(Collection<Long> updusridList) {
        regINS(CK_NINS, cTL(updusridList), xgetCValueUpdusrid(), "UPDUSRID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPDUSRID: {bigint(19)}
     */
    public void setUpdusrid_IsNull() { regUpdusrid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPDUSRID: {bigint(19)}
     */
    public void setUpdusrid_IsNotNull() { regUpdusrid(CK_ISNN, DOBJ); }

    protected void regUpdusrid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdusrid(), "UPDUSRID"); }
    protected abstract ConditionValue xgetCValueUpdusrid();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {decimal(16, 6)}
     * @param otcmpfg The value of otcmpfg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtcmpfg_Equal(java.math.BigDecimal otcmpfg) {
        doSetOtcmpfg_Equal(otcmpfg);
    }

    protected void doSetOtcmpfg_Equal(java.math.BigDecimal otcmpfg) {
        regOtcmpfg(CK_EQ, otcmpfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {decimal(16, 6)}
     * @param otcmpfg The value of otcmpfg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtcmpfg_NotEqual(java.math.BigDecimal otcmpfg) {
        doSetOtcmpfg_NotEqual(otcmpfg);
    }

    protected void doSetOtcmpfg_NotEqual(java.math.BigDecimal otcmpfg) {
        regOtcmpfg(CK_NES, otcmpfg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {decimal(16, 6)}
     * @param otcmpfg The value of otcmpfg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtcmpfg_GreaterThan(java.math.BigDecimal otcmpfg) {
        regOtcmpfg(CK_GT, otcmpfg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {decimal(16, 6)}
     * @param otcmpfg The value of otcmpfg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtcmpfg_LessThan(java.math.BigDecimal otcmpfg) {
        regOtcmpfg(CK_LT, otcmpfg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {decimal(16, 6)}
     * @param otcmpfg The value of otcmpfg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtcmpfg_GreaterEqual(java.math.BigDecimal otcmpfg) {
        regOtcmpfg(CK_GE, otcmpfg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {decimal(16, 6)}
     * @param otcmpfg The value of otcmpfg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtcmpfg_LessEqual(java.math.BigDecimal otcmpfg) {
        regOtcmpfg(CK_LE, otcmpfg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {decimal(16, 6)}
     * @param minNumber The min number of otcmpfg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of otcmpfg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOtcmpfg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOtcmpfg(), "OTCMPFG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTCMPFG: {decimal(16, 6)}
     * @param otcmpfgList The collection of otcmpfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_InScope(Collection<java.math.BigDecimal> otcmpfgList) {
        doSetOtcmpfg_InScope(otcmpfgList);
    }

    protected void doSetOtcmpfg_InScope(Collection<java.math.BigDecimal> otcmpfgList) {
        regINS(CK_INS, cTL(otcmpfgList), xgetCValueOtcmpfg(), "OTCMPFG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTCMPFG: {decimal(16, 6)}
     * @param otcmpfgList The collection of otcmpfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_NotInScope(Collection<java.math.BigDecimal> otcmpfgList) {
        doSetOtcmpfg_NotInScope(otcmpfgList);
    }

    protected void doSetOtcmpfg_NotInScope(Collection<java.math.BigDecimal> otcmpfgList) {
        regINS(CK_NINS, cTL(otcmpfgList), xgetCValueOtcmpfg(), "OTCMPFG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTCMPFG: {decimal(16, 6)}
     */
    public void setOtcmpfg_IsNull() { regOtcmpfg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTCMPFG: {decimal(16, 6)}
     */
    public void setOtcmpfg_IsNotNull() { regOtcmpfg(CK_ISNN, DOBJ); }

    protected void regOtcmpfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtcmpfg(), "OTCMPFG"); }
    protected abstract ConditionValue xgetCValueOtcmpfg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {decimal(16, 6)}
     * @param tmcmpfg The value of tmcmpfg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTmcmpfg_Equal(java.math.BigDecimal tmcmpfg) {
        doSetTmcmpfg_Equal(tmcmpfg);
    }

    protected void doSetTmcmpfg_Equal(java.math.BigDecimal tmcmpfg) {
        regTmcmpfg(CK_EQ, tmcmpfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {decimal(16, 6)}
     * @param tmcmpfg The value of tmcmpfg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTmcmpfg_NotEqual(java.math.BigDecimal tmcmpfg) {
        doSetTmcmpfg_NotEqual(tmcmpfg);
    }

    protected void doSetTmcmpfg_NotEqual(java.math.BigDecimal tmcmpfg) {
        regTmcmpfg(CK_NES, tmcmpfg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {decimal(16, 6)}
     * @param tmcmpfg The value of tmcmpfg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTmcmpfg_GreaterThan(java.math.BigDecimal tmcmpfg) {
        regTmcmpfg(CK_GT, tmcmpfg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {decimal(16, 6)}
     * @param tmcmpfg The value of tmcmpfg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTmcmpfg_LessThan(java.math.BigDecimal tmcmpfg) {
        regTmcmpfg(CK_LT, tmcmpfg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {decimal(16, 6)}
     * @param tmcmpfg The value of tmcmpfg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTmcmpfg_GreaterEqual(java.math.BigDecimal tmcmpfg) {
        regTmcmpfg(CK_GE, tmcmpfg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {decimal(16, 6)}
     * @param tmcmpfg The value of tmcmpfg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTmcmpfg_LessEqual(java.math.BigDecimal tmcmpfg) {
        regTmcmpfg(CK_LE, tmcmpfg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {decimal(16, 6)}
     * @param minNumber The min number of tmcmpfg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tmcmpfg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTmcmpfg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTmcmpfg(), "TMCMPFG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TMCMPFG: {decimal(16, 6)}
     * @param tmcmpfgList The collection of tmcmpfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_InScope(Collection<java.math.BigDecimal> tmcmpfgList) {
        doSetTmcmpfg_InScope(tmcmpfgList);
    }

    protected void doSetTmcmpfg_InScope(Collection<java.math.BigDecimal> tmcmpfgList) {
        regINS(CK_INS, cTL(tmcmpfgList), xgetCValueTmcmpfg(), "TMCMPFG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TMCMPFG: {decimal(16, 6)}
     * @param tmcmpfgList The collection of tmcmpfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_NotInScope(Collection<java.math.BigDecimal> tmcmpfgList) {
        doSetTmcmpfg_NotInScope(tmcmpfgList);
    }

    protected void doSetTmcmpfg_NotInScope(Collection<java.math.BigDecimal> tmcmpfgList) {
        regINS(CK_NINS, cTL(tmcmpfgList), xgetCValueTmcmpfg(), "TMCMPFG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TMCMPFG: {decimal(16, 6)}
     */
    public void setTmcmpfg_IsNull() { regTmcmpfg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TMCMPFG: {decimal(16, 6)}
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
    public HpSLCFunction<ETsnMfcompanyCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ETsnMfcompanyCB.class);
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
    public HpSLCFunction<ETsnMfcompanyCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ETsnMfcompanyCB.class);
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
    public HpSLCFunction<ETsnMfcompanyCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ETsnMfcompanyCB.class);
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
    public HpSLCFunction<ETsnMfcompanyCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ETsnMfcompanyCB.class);
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
    public HpSLCFunction<ETsnMfcompanyCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ETsnMfcompanyCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ETsnMfcompanyCB&gt;() {
     *     public void query(ETsnMfcompanyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ETsnMfcompanyCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ETsnMfcompanyCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ETsnMfcompanyCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ETsnMfcompanyCQ sq);

    protected ETsnMfcompanyCB xcreateScalarConditionCB() {
        ETsnMfcompanyCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ETsnMfcompanyCB xcreateScalarConditionPartitionByCB() {
        ETsnMfcompanyCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ETsnMfcompanyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ETsnMfcompanyCB cb = new ETsnMfcompanyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TSN_MFCOMPANY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ETsnMfcompanyCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ETsnMfcompanyCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ETsnMfcompanyCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ETsnMfcompanyCB cb = new ETsnMfcompanyCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TSN_MFCOMPANY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ETsnMfcompanyCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ETsnMfcompanyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ETsnMfcompanyCB cb = new ETsnMfcompanyCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ETsnMfcompanyCQ sq);

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
    protected ETsnMfcompanyCB newMyCB() {
        return new ETsnMfcompanyCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ETsnMfcompanyCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
