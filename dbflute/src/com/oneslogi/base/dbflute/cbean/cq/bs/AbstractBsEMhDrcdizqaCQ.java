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
 * The abstract condition-query of E_MH_DRCDIZQA.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEMhDrcdizqaCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEMhDrcdizqaCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_MH_DRCDIZQA";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhDrcdizqaId The value of mhDrcdizqaId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhDrcdizqaId_Equal(Long mhDrcdizqaId) {
        doSetMhDrcdizqaId_Equal(mhDrcdizqaId);
    }

    protected void doSetMhDrcdizqaId_Equal(Long mhDrcdizqaId) {
        regMhDrcdizqaId(CK_EQ, mhDrcdizqaId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhDrcdizqaId The value of mhDrcdizqaId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhDrcdizqaId_NotEqual(Long mhDrcdizqaId) {
        doSetMhDrcdizqaId_NotEqual(mhDrcdizqaId);
    }

    protected void doSetMhDrcdizqaId_NotEqual(Long mhDrcdizqaId) {
        regMhDrcdizqaId(CK_NES, mhDrcdizqaId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhDrcdizqaId The value of mhDrcdizqaId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhDrcdizqaId_GreaterThan(Long mhDrcdizqaId) {
        regMhDrcdizqaId(CK_GT, mhDrcdizqaId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhDrcdizqaId The value of mhDrcdizqaId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhDrcdizqaId_LessThan(Long mhDrcdizqaId) {
        regMhDrcdizqaId(CK_LT, mhDrcdizqaId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhDrcdizqaId The value of mhDrcdizqaId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhDrcdizqaId_GreaterEqual(Long mhDrcdizqaId) {
        regMhDrcdizqaId(CK_GE, mhDrcdizqaId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhDrcdizqaId The value of mhDrcdizqaId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhDrcdizqaId_LessEqual(Long mhDrcdizqaId) {
        regMhDrcdizqaId(CK_LE, mhDrcdizqaId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of mhDrcdizqaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of mhDrcdizqaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMhDrcdizqaId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMhDrcdizqaId(), "MH_DRCDIZQA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhDrcdizqaIdList The collection of mhDrcdizqaId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMhDrcdizqaId_InScope(Collection<Long> mhDrcdizqaIdList) {
        doSetMhDrcdizqaId_InScope(mhDrcdizqaIdList);
    }

    protected void doSetMhDrcdizqaId_InScope(Collection<Long> mhDrcdizqaIdList) {
        regINS(CK_INS, cTL(mhDrcdizqaIdList), xgetCValueMhDrcdizqaId(), "MH_DRCDIZQA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhDrcdizqaIdList The collection of mhDrcdizqaId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMhDrcdizqaId_NotInScope(Collection<Long> mhDrcdizqaIdList) {
        doSetMhDrcdizqaId_NotInScope(mhDrcdizqaIdList);
    }

    protected void doSetMhDrcdizqaId_NotInScope(Collection<Long> mhDrcdizqaIdList) {
        regINS(CK_NINS, cTL(mhDrcdizqaIdList), xgetCValueMhDrcdizqaId(), "MH_DRCDIZQA_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMhDrcdizqaId_IsNull() { regMhDrcdizqaId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMhDrcdizqaId_IsNotNull() { regMhDrcdizqaId(CK_ISNN, DOBJ); }

    protected void regMhDrcdizqaId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMhDrcdizqaId(), "MH_DRCDIZQA_ID"); }
    protected abstract ConditionValue xgetCValueMhDrcdizqaId();

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
     * ZNECD: {NotNull, varchar(30)}
     * @param znecd The value of znecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZnecd_Equal(String znecd) {
        doSetZnecd_Equal(fRES(znecd));
    }

    protected void doSetZnecd_Equal(String znecd) {
        regZnecd(CK_EQ, znecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZNECD: {NotNull, varchar(30)}
     * @param znecd The value of znecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZnecd_NotEqual(String znecd) {
        doSetZnecd_NotEqual(fRES(znecd));
    }

    protected void doSetZnecd_NotEqual(String znecd) {
        regZnecd(CK_NES, znecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZNECD: {NotNull, varchar(30)}
     * @param znecd The value of znecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZnecd_GreaterThan(String znecd) {
        regZnecd(CK_GT, fRES(znecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZNECD: {NotNull, varchar(30)}
     * @param znecd The value of znecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZnecd_LessThan(String znecd) {
        regZnecd(CK_LT, fRES(znecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZNECD: {NotNull, varchar(30)}
     * @param znecd The value of znecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZnecd_GreaterEqual(String znecd) {
        regZnecd(CK_GE, fRES(znecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZNECD: {NotNull, varchar(30)}
     * @param znecd The value of znecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZnecd_LessEqual(String znecd) {
        regZnecd(CK_LE, fRES(znecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZNECD: {NotNull, varchar(30)}
     * @param znecdList The collection of znecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZnecd_InScope(Collection<String> znecdList) {
        doSetZnecd_InScope(znecdList);
    }

    protected void doSetZnecd_InScope(Collection<String> znecdList) {
        regINS(CK_INS, cTL(znecdList), xgetCValueZnecd(), "ZNECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZNECD: {NotNull, varchar(30)}
     * @param znecdList The collection of znecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZnecd_NotInScope(Collection<String> znecdList) {
        doSetZnecd_NotInScope(znecdList);
    }

    protected void doSetZnecd_NotInScope(Collection<String> znecdList) {
        regINS(CK_NINS, cTL(znecdList), xgetCValueZnecd(), "ZNECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZNECD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setZnecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param znecd The value of znecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZnecd_LikeSearch(String znecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(znecd), xgetCValueZnecd(), "ZNECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZNECD: {NotNull, varchar(30)}
     * @param znecd The value of znecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZnecd_NotLikeSearch(String znecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(znecd), xgetCValueZnecd(), "ZNECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZNECD: {NotNull, varchar(30)}
     * @param znecd The value of znecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZnecd_PrefixSearch(String znecd) {
        setZnecd_LikeSearch(znecd, xcLSOPPre());
    }

    protected void regZnecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZnecd(), "ZNECD"); }
    protected abstract ConditionValue xgetCValueZnecd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {NotNull, bigint(19)}
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
     * SRRNK: {NotNull, bigint(19)}
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
     * SRRNK: {NotNull, bigint(19)}
     * @param srrnk The value of srrnk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_GreaterThan(Long srrnk) {
        regSrrnk(CK_GT, srrnk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {NotNull, bigint(19)}
     * @param srrnk The value of srrnk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_LessThan(Long srrnk) {
        regSrrnk(CK_LT, srrnk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {NotNull, bigint(19)}
     * @param srrnk The value of srrnk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_GreaterEqual(Long srrnk) {
        regSrrnk(CK_GE, srrnk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {NotNull, bigint(19)}
     * @param srrnk The value of srrnk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_LessEqual(Long srrnk) {
        regSrrnk(CK_LE, srrnk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {NotNull, bigint(19)}
     * @param minNumber The min number of srrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of srrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSrrnk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSrrnk(), "SRRNK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRRNK: {NotNull, bigint(19)}
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
     * SRRNK: {NotNull, bigint(19)}
     * @param srrnkList The collection of srrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_NotInScope(Collection<Long> srrnkList) {
        doSetSrrnk_NotInScope(srrnkList);
    }

    protected void doSetSrrnk_NotInScope(Collection<Long> srrnkList) {
        regINS(CK_NINS, cTL(srrnkList), xgetCValueSrrnk(), "SRRNK");
    }

    protected void regSrrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrrnk(), "SRRNK"); }
    protected abstract ConditionValue xgetCValueSrrnk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCNO: {NotNull, varchar(255)}
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
     * LOCNO: {NotNull, varchar(255)}
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
     * LOCNO: {NotNull, varchar(255)}
     * @param locno The value of locno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_GreaterThan(String locno) {
        regLocno(CK_GT, fRES(locno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCNO: {NotNull, varchar(255)}
     * @param locno The value of locno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_LessThan(String locno) {
        regLocno(CK_LT, fRES(locno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCNO: {NotNull, varchar(255)}
     * @param locno The value of locno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_GreaterEqual(String locno) {
        regLocno(CK_GE, fRES(locno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCNO: {NotNull, varchar(255)}
     * @param locno The value of locno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_LessEqual(String locno) {
        regLocno(CK_LE, fRES(locno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCNO: {NotNull, varchar(255)}
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
     * LOCNO: {NotNull, varchar(255)}
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
     * LOCNO: {NotNull, varchar(255)} <br>
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
     * LOCNO: {NotNull, varchar(255)}
     * @param locno The value of locno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocno_NotLikeSearch(String locno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locno), xgetCValueLocno(), "LOCNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCNO: {NotNull, varchar(255)}
     * @param locno The value of locno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_PrefixSearch(String locno) {
        setLocno_LikeSearch(locno, xcLSOPPre());
    }

    protected void regLocno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocno(), "LOCNO"); }
    protected abstract ConditionValue xgetCValueLocno();

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
     * PSTNID: {NotNull, char(1)}
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
     * PSTNID: {NotNull, char(1)}
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
     * PSTNID: {NotNull, char(1)}
     * @param pstnid The value of pstnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterThan(String pstnid) {
        regPstnid(CK_GT, fRES(pstnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, char(1)}
     * @param pstnid The value of pstnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessThan(String pstnid) {
        regPstnid(CK_LT, fRES(pstnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, char(1)}
     * @param pstnid The value of pstnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterEqual(String pstnid) {
        regPstnid(CK_GE, fRES(pstnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, char(1)}
     * @param pstnid The value of pstnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessEqual(String pstnid) {
        regPstnid(CK_LE, fRES(pstnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSTNID: {NotNull, char(1)}
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
     * PSTNID: {NotNull, char(1)}
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
     * PSTNID: {NotNull, char(1)} <br>
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
     * PSTNID: {NotNull, char(1)}
     * @param pstnid The value of pstnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPstnid_NotLikeSearch(String pstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pstnid), xgetCValuePstnid(), "PSTNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {NotNull, char(1)}
     * @param pstnid The value of pstnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_PrefixSearch(String pstnid) {
        setPstnid_LikeSearch(pstnid, xcLSOPPre());
    }

    protected void regPstnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePstnid(), "PSTNID"); }
    protected abstract ConditionValue xgetCValuePstnid();

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
     * CSROPRTCNT: {bigint(19)}
     * @param csroprtcnt The value of csroprtcnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsroprtcnt_Equal(Long csroprtcnt) {
        doSetCsroprtcnt_Equal(csroprtcnt);
    }

    protected void doSetCsroprtcnt_Equal(Long csroprtcnt) {
        regCsroprtcnt(CK_EQ, csroprtcnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CSROPRTCNT: {bigint(19)}
     * @param csroprtcnt The value of csroprtcnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsroprtcnt_NotEqual(Long csroprtcnt) {
        doSetCsroprtcnt_NotEqual(csroprtcnt);
    }

    protected void doSetCsroprtcnt_NotEqual(Long csroprtcnt) {
        regCsroprtcnt(CK_NES, csroprtcnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CSROPRTCNT: {bigint(19)}
     * @param csroprtcnt The value of csroprtcnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsroprtcnt_GreaterThan(Long csroprtcnt) {
        regCsroprtcnt(CK_GT, csroprtcnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CSROPRTCNT: {bigint(19)}
     * @param csroprtcnt The value of csroprtcnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsroprtcnt_LessThan(Long csroprtcnt) {
        regCsroprtcnt(CK_LT, csroprtcnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CSROPRTCNT: {bigint(19)}
     * @param csroprtcnt The value of csroprtcnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsroprtcnt_GreaterEqual(Long csroprtcnt) {
        regCsroprtcnt(CK_GE, csroprtcnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CSROPRTCNT: {bigint(19)}
     * @param csroprtcnt The value of csroprtcnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsroprtcnt_LessEqual(Long csroprtcnt) {
        regCsroprtcnt(CK_LE, csroprtcnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CSROPRTCNT: {bigint(19)}
     * @param minNumber The min number of csroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of csroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCsroprtcnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCsroprtcnt(), "CSROPRTCNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CSROPRTCNT: {bigint(19)}
     * @param csroprtcntList The collection of csroprtcnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsroprtcnt_InScope(Collection<Long> csroprtcntList) {
        doSetCsroprtcnt_InScope(csroprtcntList);
    }

    protected void doSetCsroprtcnt_InScope(Collection<Long> csroprtcntList) {
        regINS(CK_INS, cTL(csroprtcntList), xgetCValueCsroprtcnt(), "CSROPRTCNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CSROPRTCNT: {bigint(19)}
     * @param csroprtcntList The collection of csroprtcnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsroprtcnt_NotInScope(Collection<Long> csroprtcntList) {
        doSetCsroprtcnt_NotInScope(csroprtcntList);
    }

    protected void doSetCsroprtcnt_NotInScope(Collection<Long> csroprtcntList) {
        regINS(CK_NINS, cTL(csroprtcntList), xgetCValueCsroprtcnt(), "CSROPRTCNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CSROPRTCNT: {bigint(19)}
     */
    public void setCsroprtcnt_IsNull() { regCsroprtcnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CSROPRTCNT: {bigint(19)}
     */
    public void setCsroprtcnt_IsNotNull() { regCsroprtcnt(CK_ISNN, DOBJ); }

    protected void regCsroprtcnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCsroprtcnt(), "CSROPRTCNT"); }
    protected abstract ConditionValue xgetCValueCsroprtcnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CINLADDRCSRRNK: {bigint(19)}
     * @param cinladdrcsrrnk The value of cinladdrcsrrnk as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCinladdrcsrrnk_Equal(Long cinladdrcsrrnk) {
        doSetCinladdrcsrrnk_Equal(cinladdrcsrrnk);
    }

    protected void doSetCinladdrcsrrnk_Equal(Long cinladdrcsrrnk) {
        regCinladdrcsrrnk(CK_EQ, cinladdrcsrrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CINLADDRCSRRNK: {bigint(19)}
     * @param cinladdrcsrrnk The value of cinladdrcsrrnk as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCinladdrcsrrnk_NotEqual(Long cinladdrcsrrnk) {
        doSetCinladdrcsrrnk_NotEqual(cinladdrcsrrnk);
    }

    protected void doSetCinladdrcsrrnk_NotEqual(Long cinladdrcsrrnk) {
        regCinladdrcsrrnk(CK_NES, cinladdrcsrrnk);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CINLADDRCSRRNK: {bigint(19)}
     * @param cinladdrcsrrnk The value of cinladdrcsrrnk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCinladdrcsrrnk_GreaterThan(Long cinladdrcsrrnk) {
        regCinladdrcsrrnk(CK_GT, cinladdrcsrrnk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CINLADDRCSRRNK: {bigint(19)}
     * @param cinladdrcsrrnk The value of cinladdrcsrrnk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCinladdrcsrrnk_LessThan(Long cinladdrcsrrnk) {
        regCinladdrcsrrnk(CK_LT, cinladdrcsrrnk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CINLADDRCSRRNK: {bigint(19)}
     * @param cinladdrcsrrnk The value of cinladdrcsrrnk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCinladdrcsrrnk_GreaterEqual(Long cinladdrcsrrnk) {
        regCinladdrcsrrnk(CK_GE, cinladdrcsrrnk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CINLADDRCSRRNK: {bigint(19)}
     * @param cinladdrcsrrnk The value of cinladdrcsrrnk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCinladdrcsrrnk_LessEqual(Long cinladdrcsrrnk) {
        regCinladdrcsrrnk(CK_LE, cinladdrcsrrnk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CINLADDRCSRRNK: {bigint(19)}
     * @param minNumber The min number of cinladdrcsrrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cinladdrcsrrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCinladdrcsrrnk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCinladdrcsrrnk(), "CINLADDRCSRRNK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CINLADDRCSRRNK: {bigint(19)}
     * @param cinladdrcsrrnkList The collection of cinladdrcsrrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCinladdrcsrrnk_InScope(Collection<Long> cinladdrcsrrnkList) {
        doSetCinladdrcsrrnk_InScope(cinladdrcsrrnkList);
    }

    protected void doSetCinladdrcsrrnk_InScope(Collection<Long> cinladdrcsrrnkList) {
        regINS(CK_INS, cTL(cinladdrcsrrnkList), xgetCValueCinladdrcsrrnk(), "CINLADDRCSRRNK");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CINLADDRCSRRNK: {bigint(19)}
     * @param cinladdrcsrrnkList The collection of cinladdrcsrrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCinladdrcsrrnk_NotInScope(Collection<Long> cinladdrcsrrnkList) {
        doSetCinladdrcsrrnk_NotInScope(cinladdrcsrrnkList);
    }

    protected void doSetCinladdrcsrrnk_NotInScope(Collection<Long> cinladdrcsrrnkList) {
        regINS(CK_NINS, cTL(cinladdrcsrrnkList), xgetCValueCinladdrcsrrnk(), "CINLADDRCSRRNK");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CINLADDRCSRRNK: {bigint(19)}
     */
    public void setCinladdrcsrrnk_IsNull() { regCinladdrcsrrnk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CINLADDRCSRRNK: {bigint(19)}
     */
    public void setCinladdrcsrrnk_IsNotNull() { regCinladdrcsrrnk(CK_ISNN, DOBJ); }

    protected void regCinladdrcsrrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCinladdrcsrrnk(), "CINLADDRCSRRNK"); }
    protected abstract ConditionValue xgetCValueCinladdrcsrrnk();

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
    public HpSLCFunction<EMhDrcdizqaCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EMhDrcdizqaCB.class);
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
    public HpSLCFunction<EMhDrcdizqaCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EMhDrcdizqaCB.class);
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
    public HpSLCFunction<EMhDrcdizqaCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EMhDrcdizqaCB.class);
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
    public HpSLCFunction<EMhDrcdizqaCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EMhDrcdizqaCB.class);
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
    public HpSLCFunction<EMhDrcdizqaCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EMhDrcdizqaCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EMhDrcdizqaCB&gt;() {
     *     public void query(EMhDrcdizqaCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EMhDrcdizqaCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EMhDrcdizqaCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EMhDrcdizqaCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EMhDrcdizqaCQ sq);

    protected EMhDrcdizqaCB xcreateScalarConditionCB() {
        EMhDrcdizqaCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EMhDrcdizqaCB xcreateScalarConditionPartitionByCB() {
        EMhDrcdizqaCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EMhDrcdizqaCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EMhDrcdizqaCB cb = new EMhDrcdizqaCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MH_DRCDIZQA_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EMhDrcdizqaCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EMhDrcdizqaCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EMhDrcdizqaCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EMhDrcdizqaCB cb = new EMhDrcdizqaCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MH_DRCDIZQA_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EMhDrcdizqaCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EMhDrcdizqaCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EMhDrcdizqaCB cb = new EMhDrcdizqaCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EMhDrcdizqaCQ sq);

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
    protected EMhDrcdizqaCB newMyCB() {
        return new EMhDrcdizqaCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EMhDrcdizqaCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
