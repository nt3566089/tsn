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
 * The abstract condition-query of E_MH_STOCK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEMhStockCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEMhStockCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_MH_STOCK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhStockId The value of mhStockId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhStockId_Equal(Long mhStockId) {
        doSetMhStockId_Equal(mhStockId);
    }

    protected void doSetMhStockId_Equal(Long mhStockId) {
        regMhStockId(CK_EQ, mhStockId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhStockId The value of mhStockId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhStockId_NotEqual(Long mhStockId) {
        doSetMhStockId_NotEqual(mhStockId);
    }

    protected void doSetMhStockId_NotEqual(Long mhStockId) {
        regMhStockId(CK_NES, mhStockId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhStockId The value of mhStockId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhStockId_GreaterThan(Long mhStockId) {
        regMhStockId(CK_GT, mhStockId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhStockId The value of mhStockId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhStockId_LessThan(Long mhStockId) {
        regMhStockId(CK_LT, mhStockId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhStockId The value of mhStockId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhStockId_GreaterEqual(Long mhStockId) {
        regMhStockId(CK_GE, mhStockId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhStockId The value of mhStockId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMhStockId_LessEqual(Long mhStockId) {
        regMhStockId(CK_LE, mhStockId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of mhStockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of mhStockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMhStockId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMhStockId(), "MH_STOCK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhStockIdList The collection of mhStockId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMhStockId_InScope(Collection<Long> mhStockIdList) {
        doSetMhStockId_InScope(mhStockIdList);
    }

    protected void doSetMhStockId_InScope(Collection<Long> mhStockIdList) {
        regINS(CK_INS, cTL(mhStockIdList), xgetCValueMhStockId(), "MH_STOCK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mhStockIdList The collection of mhStockId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMhStockId_NotInScope(Collection<Long> mhStockIdList) {
        doSetMhStockId_NotInScope(mhStockIdList);
    }

    protected void doSetMhStockId_NotInScope(Collection<Long> mhStockIdList) {
        regINS(CK_NINS, cTL(mhStockIdList), xgetCValueMhStockId(), "MH_STOCK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMhStockId_IsNull() { regMhStockId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMhStockId_IsNotNull() { regMhStockId(CK_ISNN, DOBJ); }

    protected void regMhStockId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMhStockId(), "MH_STOCK_ID"); }
    protected abstract ConditionValue xgetCValueMhStockId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCd The value of companyCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_Equal(String companyCd) {
        doSetCompanyCd_Equal(fRES(companyCd));
    }

    protected void doSetCompanyCd_Equal(String companyCd) {
        regCompanyCd(CK_EQ, companyCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCd The value of companyCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_NotEqual(String companyCd) {
        doSetCompanyCd_NotEqual(fRES(companyCd));
    }

    protected void doSetCompanyCd_NotEqual(String companyCd) {
        regCompanyCd(CK_NES, companyCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCd The value of companyCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_GreaterThan(String companyCd) {
        regCompanyCd(CK_GT, fRES(companyCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCd The value of companyCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_LessThan(String companyCd) {
        regCompanyCd(CK_LT, fRES(companyCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCd The value of companyCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_GreaterEqual(String companyCd) {
        regCompanyCd(CK_GE, fRES(companyCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCd The value of companyCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_LessEqual(String companyCd) {
        regCompanyCd(CK_LE, fRES(companyCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCdList The collection of companyCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_InScope(Collection<String> companyCdList) {
        doSetCompanyCd_InScope(companyCdList);
    }

    protected void doSetCompanyCd_InScope(Collection<String> companyCdList) {
        regINS(CK_INS, cTL(companyCdList), xgetCValueCompanyCd(), "COMPANY_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCdList The collection of companyCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_NotInScope(Collection<String> companyCdList) {
        doSetCompanyCd_NotInScope(companyCdList);
    }

    protected void doSetCompanyCd_NotInScope(Collection<String> companyCdList) {
        regINS(CK_NINS, cTL(companyCdList), xgetCValueCompanyCd(), "COMPANY_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(30)} <br>
     * <pre>e.g. setCompanyCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param companyCd The value of companyCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompanyCd_LikeSearch(String companyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(companyCd), xgetCValueCompanyCd(), "COMPANY_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCd The value of companyCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompanyCd_NotLikeSearch(String companyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(companyCd), xgetCValueCompanyCd(), "COMPANY_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCd The value of companyCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_PrefixSearch(String companyCd) {
        setCompanyCd_LikeSearch(companyCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     */
    public void setCompanyCd_IsNull() { regCompanyCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     */
    public void setCompanyCd_IsNullOrEmpty() { regCompanyCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     */
    public void setCompanyCd_IsNotNull() { regCompanyCd(CK_ISNN, DOBJ); }

    protected void regCompanyCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanyCd(), "COMPANY_CD"); }
    protected abstract ConditionValue xgetCValueCompanyCd();

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
     * ZONE_CD: {varchar(30)}
     * @param zoneCd The value of zoneCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_Equal(String zoneCd) {
        doSetZoneCd_Equal(fRES(zoneCd));
    }

    protected void doSetZoneCd_Equal(String zoneCd) {
        regZoneCd(CK_EQ, zoneCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(30)}
     * @param zoneCd The value of zoneCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_NotEqual(String zoneCd) {
        doSetZoneCd_NotEqual(fRES(zoneCd));
    }

    protected void doSetZoneCd_NotEqual(String zoneCd) {
        regZoneCd(CK_NES, zoneCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(30)}
     * @param zoneCd The value of zoneCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_GreaterThan(String zoneCd) {
        regZoneCd(CK_GT, fRES(zoneCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(30)}
     * @param zoneCd The value of zoneCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_LessThan(String zoneCd) {
        regZoneCd(CK_LT, fRES(zoneCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(30)}
     * @param zoneCd The value of zoneCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_GreaterEqual(String zoneCd) {
        regZoneCd(CK_GE, fRES(zoneCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(30)}
     * @param zoneCd The value of zoneCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_LessEqual(String zoneCd) {
        regZoneCd(CK_LE, fRES(zoneCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZONE_CD: {varchar(30)}
     * @param zoneCdList The collection of zoneCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_InScope(Collection<String> zoneCdList) {
        doSetZoneCd_InScope(zoneCdList);
    }

    protected void doSetZoneCd_InScope(Collection<String> zoneCdList) {
        regINS(CK_INS, cTL(zoneCdList), xgetCValueZoneCd(), "ZONE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZONE_CD: {varchar(30)}
     * @param zoneCdList The collection of zoneCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_NotInScope(Collection<String> zoneCdList) {
        doSetZoneCd_NotInScope(zoneCdList);
    }

    protected void doSetZoneCd_NotInScope(Collection<String> zoneCdList) {
        regINS(CK_NINS, cTL(zoneCdList), xgetCValueZoneCd(), "ZONE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE_CD: {varchar(30)} <br>
     * <pre>e.g. setZoneCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zoneCd The value of zoneCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZoneCd_LikeSearch(String zoneCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zoneCd), xgetCValueZoneCd(), "ZONE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE_CD: {varchar(30)}
     * @param zoneCd The value of zoneCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZoneCd_NotLikeSearch(String zoneCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zoneCd), xgetCValueZoneCd(), "ZONE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE_CD: {varchar(30)}
     * @param zoneCd The value of zoneCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_PrefixSearch(String zoneCd) {
        setZoneCd_LikeSearch(zoneCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(30)}
     */
    public void setZoneCd_IsNull() { regZoneCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(30)}
     */
    public void setZoneCd_IsNullOrEmpty() { regZoneCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(30)}
     */
    public void setZoneCd_IsNotNull() { regZoneCd(CK_ISNN, DOBJ); }

    protected void regZoneCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZoneCd(), "ZONE_CD"); }
    protected abstract ConditionValue xgetCValueZoneCd();

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
     * LOCKBN: {char(1)}
     * @param lockbn The value of lockbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLockbn_Equal(String lockbn) {
        doSetLockbn_Equal(fRES(lockbn));
    }

    protected void doSetLockbn_Equal(String lockbn) {
        regLockbn(CK_EQ, lockbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCKBN: {char(1)}
     * @param lockbn The value of lockbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLockbn_NotEqual(String lockbn) {
        doSetLockbn_NotEqual(fRES(lockbn));
    }

    protected void doSetLockbn_NotEqual(String lockbn) {
        regLockbn(CK_NES, lockbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCKBN: {char(1)}
     * @param lockbn The value of lockbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLockbn_GreaterThan(String lockbn) {
        regLockbn(CK_GT, fRES(lockbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCKBN: {char(1)}
     * @param lockbn The value of lockbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLockbn_LessThan(String lockbn) {
        regLockbn(CK_LT, fRES(lockbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCKBN: {char(1)}
     * @param lockbn The value of lockbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLockbn_GreaterEqual(String lockbn) {
        regLockbn(CK_GE, fRES(lockbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCKBN: {char(1)}
     * @param lockbn The value of lockbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLockbn_LessEqual(String lockbn) {
        regLockbn(CK_LE, fRES(lockbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCKBN: {char(1)}
     * @param lockbnList The collection of lockbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLockbn_InScope(Collection<String> lockbnList) {
        doSetLockbn_InScope(lockbnList);
    }

    protected void doSetLockbn_InScope(Collection<String> lockbnList) {
        regINS(CK_INS, cTL(lockbnList), xgetCValueLockbn(), "LOCKBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCKBN: {char(1)}
     * @param lockbnList The collection of lockbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLockbn_NotInScope(Collection<String> lockbnList) {
        doSetLockbn_NotInScope(lockbnList);
    }

    protected void doSetLockbn_NotInScope(Collection<String> lockbnList) {
        regINS(CK_NINS, cTL(lockbnList), xgetCValueLockbn(), "LOCKBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCKBN: {char(1)} <br>
     * <pre>e.g. setLockbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lockbn The value of lockbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLockbn_LikeSearch(String lockbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lockbn), xgetCValueLockbn(), "LOCKBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCKBN: {char(1)}
     * @param lockbn The value of lockbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLockbn_NotLikeSearch(String lockbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lockbn), xgetCValueLockbn(), "LOCKBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCKBN: {char(1)}
     * @param lockbn The value of lockbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLockbn_PrefixSearch(String lockbn) {
        setLockbn_LikeSearch(lockbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCKBN: {char(1)}
     */
    public void setLockbn_IsNull() { regLockbn(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCKBN: {char(1)}
     */
    public void setLockbn_IsNotNull() { regLockbn(CK_ISNN, DOBJ); }

    protected void regLockbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLockbn(), "LOCKBN"); }
    protected abstract ConditionValue xgetCValueLockbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_Equal(String productCd) {
        doSetProductCd_Equal(fRES(productCd));
    }

    protected void doSetProductCd_Equal(String productCd) {
        regProductCd(CK_EQ, productCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotEqual(String productCd) {
        doSetProductCd_NotEqual(fRES(productCd));
    }

    protected void doSetProductCd_NotEqual(String productCd) {
        regProductCd(CK_NES, productCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCdList The collection of productCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_InScope(Collection<String> productCdList) {
        doSetProductCd_InScope(productCdList);
    }

    protected void doSetProductCd_InScope(Collection<String> productCdList) {
        regINS(CK_INS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCdList The collection of productCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotInScope(Collection<String> productCdList) {
        doSetProductCd_NotInScope(productCdList);
    }

    protected void doSetProductCd_NotInScope(Collection<String> productCdList) {
        regINS(CK_NINS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)} <br>
     * <pre>e.g. setProductCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCd The value of productCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCd_LikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param tstinvcb The value of tstinvcb as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvcb_Equal(Long tstinvcb) {
        doSetTstinvcb_Equal(tstinvcb);
    }

    protected void doSetTstinvcb_Equal(Long tstinvcb) {
        regTstinvcb(CK_EQ, tstinvcb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param tstinvcb The value of tstinvcb as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvcb_NotEqual(Long tstinvcb) {
        doSetTstinvcb_NotEqual(tstinvcb);
    }

    protected void doSetTstinvcb_NotEqual(Long tstinvcb) {
        regTstinvcb(CK_NES, tstinvcb);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param tstinvcb The value of tstinvcb as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvcb_GreaterThan(Long tstinvcb) {
        regTstinvcb(CK_GT, tstinvcb);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param tstinvcb The value of tstinvcb as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvcb_LessThan(Long tstinvcb) {
        regTstinvcb(CK_LT, tstinvcb);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param tstinvcb The value of tstinvcb as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvcb_GreaterEqual(Long tstinvcb) {
        regTstinvcb(CK_GE, tstinvcb);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param tstinvcb The value of tstinvcb as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvcb_LessEqual(Long tstinvcb) {
        regTstinvcb(CK_LE, tstinvcb);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param minNumber The min number of tstinvcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tstinvcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTstinvcb_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTstinvcb(), "TSTINVCB", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param tstinvcbList The collection of tstinvcb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTstinvcb_InScope(Collection<Long> tstinvcbList) {
        doSetTstinvcb_InScope(tstinvcbList);
    }

    protected void doSetTstinvcb_InScope(Collection<Long> tstinvcbList) {
        regINS(CK_INS, cTL(tstinvcbList), xgetCValueTstinvcb(), "TSTINVCB");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSTINVCB: {bigint(19)}
     * @param tstinvcbList The collection of tstinvcb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTstinvcb_NotInScope(Collection<Long> tstinvcbList) {
        doSetTstinvcb_NotInScope(tstinvcbList);
    }

    protected void doSetTstinvcb_NotInScope(Collection<Long> tstinvcbList) {
        regINS(CK_NINS, cTL(tstinvcbList), xgetCValueTstinvcb(), "TSTINVCB");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     */
    public void setTstinvcb_IsNull() { regTstinvcb(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TSTINVCB: {bigint(19)}
     */
    public void setTstinvcb_IsNotNull() { regTstinvcb(CK_ISNN, DOBJ); }

    protected void regTstinvcb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTstinvcb(), "TSTINVCB"); }
    protected abstract ConditionValue xgetCValueTstinvcb();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param tstinvct The value of tstinvct as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvct_Equal(Long tstinvct) {
        doSetTstinvct_Equal(tstinvct);
    }

    protected void doSetTstinvct_Equal(Long tstinvct) {
        regTstinvct(CK_EQ, tstinvct);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param tstinvct The value of tstinvct as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvct_NotEqual(Long tstinvct) {
        doSetTstinvct_NotEqual(tstinvct);
    }

    protected void doSetTstinvct_NotEqual(Long tstinvct) {
        regTstinvct(CK_NES, tstinvct);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param tstinvct The value of tstinvct as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvct_GreaterThan(Long tstinvct) {
        regTstinvct(CK_GT, tstinvct);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param tstinvct The value of tstinvct as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvct_LessThan(Long tstinvct) {
        regTstinvct(CK_LT, tstinvct);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param tstinvct The value of tstinvct as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvct_GreaterEqual(Long tstinvct) {
        regTstinvct(CK_GE, tstinvct);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param tstinvct The value of tstinvct as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTstinvct_LessEqual(Long tstinvct) {
        regTstinvct(CK_LE, tstinvct);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param minNumber The min number of tstinvct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tstinvct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTstinvct_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTstinvct(), "TSTINVCT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param tstinvctList The collection of tstinvct as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTstinvct_InScope(Collection<Long> tstinvctList) {
        doSetTstinvct_InScope(tstinvctList);
    }

    protected void doSetTstinvct_InScope(Collection<Long> tstinvctList) {
        regINS(CK_INS, cTL(tstinvctList), xgetCValueTstinvct(), "TSTINVCT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSTINVCT: {bigint(19)}
     * @param tstinvctList The collection of tstinvct as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTstinvct_NotInScope(Collection<Long> tstinvctList) {
        doSetTstinvct_NotInScope(tstinvctList);
    }

    protected void doSetTstinvct_NotInScope(Collection<Long> tstinvctList) {
        regINS(CK_NINS, cTL(tstinvctList), xgetCValueTstinvct(), "TSTINVCT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     */
    public void setTstinvct_IsNull() { regTstinvct(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TSTINVCT: {bigint(19)}
     */
    public void setTstinvct_IsNotNull() { regTstinvct(CK_ISNN, DOBJ); }

    protected void regTstinvct(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTstinvct(), "TSTINVCT"); }
    protected abstract ConditionValue xgetCValueTstinvct();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param tosplcbqa The value of tosplcbqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplcbqa_Equal(Long tosplcbqa) {
        doSetTosplcbqa_Equal(tosplcbqa);
    }

    protected void doSetTosplcbqa_Equal(Long tosplcbqa) {
        regTosplcbqa(CK_EQ, tosplcbqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param tosplcbqa The value of tosplcbqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplcbqa_NotEqual(Long tosplcbqa) {
        doSetTosplcbqa_NotEqual(tosplcbqa);
    }

    protected void doSetTosplcbqa_NotEqual(Long tosplcbqa) {
        regTosplcbqa(CK_NES, tosplcbqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param tosplcbqa The value of tosplcbqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplcbqa_GreaterThan(Long tosplcbqa) {
        regTosplcbqa(CK_GT, tosplcbqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param tosplcbqa The value of tosplcbqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplcbqa_LessThan(Long tosplcbqa) {
        regTosplcbqa(CK_LT, tosplcbqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param tosplcbqa The value of tosplcbqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplcbqa_GreaterEqual(Long tosplcbqa) {
        regTosplcbqa(CK_GE, tosplcbqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param tosplcbqa The value of tosplcbqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplcbqa_LessEqual(Long tosplcbqa) {
        regTosplcbqa(CK_LE, tosplcbqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param minNumber The min number of tosplcbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tosplcbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTosplcbqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTosplcbqa(), "TOSPLCBQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param tosplcbqaList The collection of tosplcbqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTosplcbqa_InScope(Collection<Long> tosplcbqaList) {
        doSetTosplcbqa_InScope(tosplcbqaList);
    }

    protected void doSetTosplcbqa_InScope(Collection<Long> tosplcbqaList) {
        regINS(CK_INS, cTL(tosplcbqaList), xgetCValueTosplcbqa(), "TOSPLCBQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     * @param tosplcbqaList The collection of tosplcbqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTosplcbqa_NotInScope(Collection<Long> tosplcbqaList) {
        doSetTosplcbqa_NotInScope(tosplcbqaList);
    }

    protected void doSetTosplcbqa_NotInScope(Collection<Long> tosplcbqaList) {
        regINS(CK_NINS, cTL(tosplcbqaList), xgetCValueTosplcbqa(), "TOSPLCBQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     */
    public void setTosplcbqa_IsNull() { regTosplcbqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOSPLCBQA: {bigint(19)}
     */
    public void setTosplcbqa_IsNotNull() { regTosplcbqa(CK_ISNN, DOBJ); }

    protected void regTosplcbqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTosplcbqa(), "TOSPLCBQA"); }
    protected abstract ConditionValue xgetCValueTosplcbqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param tosplctqa The value of tosplctqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplctqa_Equal(Long tosplctqa) {
        doSetTosplctqa_Equal(tosplctqa);
    }

    protected void doSetTosplctqa_Equal(Long tosplctqa) {
        regTosplctqa(CK_EQ, tosplctqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param tosplctqa The value of tosplctqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplctqa_NotEqual(Long tosplctqa) {
        doSetTosplctqa_NotEqual(tosplctqa);
    }

    protected void doSetTosplctqa_NotEqual(Long tosplctqa) {
        regTosplctqa(CK_NES, tosplctqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param tosplctqa The value of tosplctqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplctqa_GreaterThan(Long tosplctqa) {
        regTosplctqa(CK_GT, tosplctqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param tosplctqa The value of tosplctqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplctqa_LessThan(Long tosplctqa) {
        regTosplctqa(CK_LT, tosplctqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param tosplctqa The value of tosplctqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplctqa_GreaterEqual(Long tosplctqa) {
        regTosplctqa(CK_GE, tosplctqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param tosplctqa The value of tosplctqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTosplctqa_LessEqual(Long tosplctqa) {
        regTosplctqa(CK_LE, tosplctqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param minNumber The min number of tosplctqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tosplctqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTosplctqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTosplctqa(), "TOSPLCTQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param tosplctqaList The collection of tosplctqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTosplctqa_InScope(Collection<Long> tosplctqaList) {
        doSetTosplctqa_InScope(tosplctqaList);
    }

    protected void doSetTosplctqa_InScope(Collection<Long> tosplctqaList) {
        regINS(CK_INS, cTL(tosplctqaList), xgetCValueTosplctqa(), "TOSPLCTQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     * @param tosplctqaList The collection of tosplctqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTosplctqa_NotInScope(Collection<Long> tosplctqaList) {
        doSetTosplctqa_NotInScope(tosplctqaList);
    }

    protected void doSetTosplctqa_NotInScope(Collection<Long> tosplctqaList) {
        regINS(CK_NINS, cTL(tosplctqaList), xgetCValueTosplctqa(), "TOSPLCTQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     */
    public void setTosplctqa_IsNull() { regTosplctqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOSPLCTQA: {bigint(19)}
     */
    public void setTosplctqa_IsNotNull() { regTosplctqa(CK_ISNN, DOBJ); }

    protected void regTosplctqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTosplctqa(), "TOSPLCTQA"); }
    protected abstract ConditionValue xgetCValueTosplctqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param tsplcb The value of tsplcb as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplcb_Equal(Long tsplcb) {
        doSetTsplcb_Equal(tsplcb);
    }

    protected void doSetTsplcb_Equal(Long tsplcb) {
        regTsplcb(CK_EQ, tsplcb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param tsplcb The value of tsplcb as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplcb_NotEqual(Long tsplcb) {
        doSetTsplcb_NotEqual(tsplcb);
    }

    protected void doSetTsplcb_NotEqual(Long tsplcb) {
        regTsplcb(CK_NES, tsplcb);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param tsplcb The value of tsplcb as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplcb_GreaterThan(Long tsplcb) {
        regTsplcb(CK_GT, tsplcb);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param tsplcb The value of tsplcb as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplcb_LessThan(Long tsplcb) {
        regTsplcb(CK_LT, tsplcb);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param tsplcb The value of tsplcb as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplcb_GreaterEqual(Long tsplcb) {
        regTsplcb(CK_GE, tsplcb);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param tsplcb The value of tsplcb as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplcb_LessEqual(Long tsplcb) {
        regTsplcb(CK_LE, tsplcb);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param minNumber The min number of tsplcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tsplcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTsplcb_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTsplcb(), "TSPLCB", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param tsplcbList The collection of tsplcb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsplcb_InScope(Collection<Long> tsplcbList) {
        doSetTsplcb_InScope(tsplcbList);
    }

    protected void doSetTsplcb_InScope(Collection<Long> tsplcbList) {
        regINS(CK_INS, cTL(tsplcbList), xgetCValueTsplcb(), "TSPLCB");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSPLCB: {bigint(19)}
     * @param tsplcbList The collection of tsplcb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsplcb_NotInScope(Collection<Long> tsplcbList) {
        doSetTsplcb_NotInScope(tsplcbList);
    }

    protected void doSetTsplcb_NotInScope(Collection<Long> tsplcbList) {
        regINS(CK_NINS, cTL(tsplcbList), xgetCValueTsplcb(), "TSPLCB");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     */
    public void setTsplcb_IsNull() { regTsplcb(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TSPLCB: {bigint(19)}
     */
    public void setTsplcb_IsNotNull() { regTsplcb(CK_ISNN, DOBJ); }

    protected void regTsplcb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTsplcb(), "TSPLCB"); }
    protected abstract ConditionValue xgetCValueTsplcb();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param tsplct The value of tsplct as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplct_Equal(Long tsplct) {
        doSetTsplct_Equal(tsplct);
    }

    protected void doSetTsplct_Equal(Long tsplct) {
        regTsplct(CK_EQ, tsplct);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param tsplct The value of tsplct as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplct_NotEqual(Long tsplct) {
        doSetTsplct_NotEqual(tsplct);
    }

    protected void doSetTsplct_NotEqual(Long tsplct) {
        regTsplct(CK_NES, tsplct);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param tsplct The value of tsplct as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplct_GreaterThan(Long tsplct) {
        regTsplct(CK_GT, tsplct);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param tsplct The value of tsplct as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplct_LessThan(Long tsplct) {
        regTsplct(CK_LT, tsplct);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param tsplct The value of tsplct as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplct_GreaterEqual(Long tsplct) {
        regTsplct(CK_GE, tsplct);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param tsplct The value of tsplct as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsplct_LessEqual(Long tsplct) {
        regTsplct(CK_LE, tsplct);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param minNumber The min number of tsplct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tsplct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTsplct_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTsplct(), "TSPLCT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param tsplctList The collection of tsplct as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsplct_InScope(Collection<Long> tsplctList) {
        doSetTsplct_InScope(tsplctList);
    }

    protected void doSetTsplct_InScope(Collection<Long> tsplctList) {
        regINS(CK_INS, cTL(tsplctList), xgetCValueTsplct(), "TSPLCT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSPLCT: {bigint(19)}
     * @param tsplctList The collection of tsplct as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsplct_NotInScope(Collection<Long> tsplctList) {
        doSetTsplct_NotInScope(tsplctList);
    }

    protected void doSetTsplct_NotInScope(Collection<Long> tsplctList) {
        regINS(CK_NINS, cTL(tsplctList), xgetCValueTsplct(), "TSPLCT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     */
    public void setTsplct_IsNull() { regTsplct(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TSPLCT: {bigint(19)}
     */
    public void setTsplct_IsNotNull() { regTsplct(CK_ISNN, DOBJ); }

    protected void regTsplct(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTsplct(), "TSPLCT"); }
    protected abstract ConditionValue xgetCValueTsplct();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param presplcbqa The value of presplcbqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcbqa_Equal(Long presplcbqa) {
        doSetPresplcbqa_Equal(presplcbqa);
    }

    protected void doSetPresplcbqa_Equal(Long presplcbqa) {
        regPresplcbqa(CK_EQ, presplcbqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param presplcbqa The value of presplcbqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcbqa_NotEqual(Long presplcbqa) {
        doSetPresplcbqa_NotEqual(presplcbqa);
    }

    protected void doSetPresplcbqa_NotEqual(Long presplcbqa) {
        regPresplcbqa(CK_NES, presplcbqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param presplcbqa The value of presplcbqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcbqa_GreaterThan(Long presplcbqa) {
        regPresplcbqa(CK_GT, presplcbqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param presplcbqa The value of presplcbqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcbqa_LessThan(Long presplcbqa) {
        regPresplcbqa(CK_LT, presplcbqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param presplcbqa The value of presplcbqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcbqa_GreaterEqual(Long presplcbqa) {
        regPresplcbqa(CK_GE, presplcbqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param presplcbqa The value of presplcbqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplcbqa_LessEqual(Long presplcbqa) {
        regPresplcbqa(CK_LE, presplcbqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param minNumber The min number of presplcbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of presplcbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPresplcbqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePresplcbqa(), "PRESPLCBQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param presplcbqaList The collection of presplcbqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPresplcbqa_InScope(Collection<Long> presplcbqaList) {
        doSetPresplcbqa_InScope(presplcbqaList);
    }

    protected void doSetPresplcbqa_InScope(Collection<Long> presplcbqaList) {
        regINS(CK_INS, cTL(presplcbqaList), xgetCValuePresplcbqa(), "PRESPLCBQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     * @param presplcbqaList The collection of presplcbqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPresplcbqa_NotInScope(Collection<Long> presplcbqaList) {
        doSetPresplcbqa_NotInScope(presplcbqaList);
    }

    protected void doSetPresplcbqa_NotInScope(Collection<Long> presplcbqaList) {
        regINS(CK_NINS, cTL(presplcbqaList), xgetCValuePresplcbqa(), "PRESPLCBQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     */
    public void setPresplcbqa_IsNull() { regPresplcbqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRESPLCBQA: {bigint(19)}
     */
    public void setPresplcbqa_IsNotNull() { regPresplcbqa(CK_ISNN, DOBJ); }

    protected void regPresplcbqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePresplcbqa(), "PRESPLCBQA"); }
    protected abstract ConditionValue xgetCValuePresplcbqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param presplctqa The value of presplctqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplctqa_Equal(Long presplctqa) {
        doSetPresplctqa_Equal(presplctqa);
    }

    protected void doSetPresplctqa_Equal(Long presplctqa) {
        regPresplctqa(CK_EQ, presplctqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param presplctqa The value of presplctqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplctqa_NotEqual(Long presplctqa) {
        doSetPresplctqa_NotEqual(presplctqa);
    }

    protected void doSetPresplctqa_NotEqual(Long presplctqa) {
        regPresplctqa(CK_NES, presplctqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param presplctqa The value of presplctqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplctqa_GreaterThan(Long presplctqa) {
        regPresplctqa(CK_GT, presplctqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param presplctqa The value of presplctqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplctqa_LessThan(Long presplctqa) {
        regPresplctqa(CK_LT, presplctqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param presplctqa The value of presplctqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplctqa_GreaterEqual(Long presplctqa) {
        regPresplctqa(CK_GE, presplctqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param presplctqa The value of presplctqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPresplctqa_LessEqual(Long presplctqa) {
        regPresplctqa(CK_LE, presplctqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param minNumber The min number of presplctqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of presplctqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPresplctqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePresplctqa(), "PRESPLCTQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param presplctqaList The collection of presplctqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPresplctqa_InScope(Collection<Long> presplctqaList) {
        doSetPresplctqa_InScope(presplctqaList);
    }

    protected void doSetPresplctqa_InScope(Collection<Long> presplctqaList) {
        regINS(CK_INS, cTL(presplctqaList), xgetCValuePresplctqa(), "PRESPLCTQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     * @param presplctqaList The collection of presplctqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPresplctqa_NotInScope(Collection<Long> presplctqaList) {
        doSetPresplctqa_NotInScope(presplctqaList);
    }

    protected void doSetPresplctqa_NotInScope(Collection<Long> presplctqaList) {
        regINS(CK_NINS, cTL(presplctqaList), xgetCValuePresplctqa(), "PRESPLCTQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     */
    public void setPresplctqa_IsNull() { regPresplctqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRESPLCTQA: {bigint(19)}
     */
    public void setPresplctqa_IsNotNull() { regPresplctqa(CK_ISNN, DOBJ); }

    protected void regPresplctqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePresplctqa(), "PRESPLCTQA"); }
    protected abstract ConditionValue xgetCValuePresplctqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param tpresplcb The value of tpresplcb as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplcb_Equal(Long tpresplcb) {
        doSetTpresplcb_Equal(tpresplcb);
    }

    protected void doSetTpresplcb_Equal(Long tpresplcb) {
        regTpresplcb(CK_EQ, tpresplcb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param tpresplcb The value of tpresplcb as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplcb_NotEqual(Long tpresplcb) {
        doSetTpresplcb_NotEqual(tpresplcb);
    }

    protected void doSetTpresplcb_NotEqual(Long tpresplcb) {
        regTpresplcb(CK_NES, tpresplcb);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param tpresplcb The value of tpresplcb as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplcb_GreaterThan(Long tpresplcb) {
        regTpresplcb(CK_GT, tpresplcb);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param tpresplcb The value of tpresplcb as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplcb_LessThan(Long tpresplcb) {
        regTpresplcb(CK_LT, tpresplcb);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param tpresplcb The value of tpresplcb as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplcb_GreaterEqual(Long tpresplcb) {
        regTpresplcb(CK_GE, tpresplcb);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param tpresplcb The value of tpresplcb as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplcb_LessEqual(Long tpresplcb) {
        regTpresplcb(CK_LE, tpresplcb);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param minNumber The min number of tpresplcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tpresplcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTpresplcb_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTpresplcb(), "TPRESPLCB", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param tpresplcbList The collection of tpresplcb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTpresplcb_InScope(Collection<Long> tpresplcbList) {
        doSetTpresplcb_InScope(tpresplcbList);
    }

    protected void doSetTpresplcb_InScope(Collection<Long> tpresplcbList) {
        regINS(CK_INS, cTL(tpresplcbList), xgetCValueTpresplcb(), "TPRESPLCB");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     * @param tpresplcbList The collection of tpresplcb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTpresplcb_NotInScope(Collection<Long> tpresplcbList) {
        doSetTpresplcb_NotInScope(tpresplcbList);
    }

    protected void doSetTpresplcb_NotInScope(Collection<Long> tpresplcbList) {
        regINS(CK_NINS, cTL(tpresplcbList), xgetCValueTpresplcb(), "TPRESPLCB");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     */
    public void setTpresplcb_IsNull() { regTpresplcb(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TPRESPLCB: {bigint(19)}
     */
    public void setTpresplcb_IsNotNull() { regTpresplcb(CK_ISNN, DOBJ); }

    protected void regTpresplcb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTpresplcb(), "TPRESPLCB"); }
    protected abstract ConditionValue xgetCValueTpresplcb();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param tpresplct The value of tpresplct as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplct_Equal(Long tpresplct) {
        doSetTpresplct_Equal(tpresplct);
    }

    protected void doSetTpresplct_Equal(Long tpresplct) {
        regTpresplct(CK_EQ, tpresplct);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param tpresplct The value of tpresplct as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplct_NotEqual(Long tpresplct) {
        doSetTpresplct_NotEqual(tpresplct);
    }

    protected void doSetTpresplct_NotEqual(Long tpresplct) {
        regTpresplct(CK_NES, tpresplct);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param tpresplct The value of tpresplct as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplct_GreaterThan(Long tpresplct) {
        regTpresplct(CK_GT, tpresplct);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param tpresplct The value of tpresplct as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplct_LessThan(Long tpresplct) {
        regTpresplct(CK_LT, tpresplct);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param tpresplct The value of tpresplct as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplct_GreaterEqual(Long tpresplct) {
        regTpresplct(CK_GE, tpresplct);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param tpresplct The value of tpresplct as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTpresplct_LessEqual(Long tpresplct) {
        regTpresplct(CK_LE, tpresplct);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param minNumber The min number of tpresplct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tpresplct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTpresplct_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTpresplct(), "TPRESPLCT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param tpresplctList The collection of tpresplct as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTpresplct_InScope(Collection<Long> tpresplctList) {
        doSetTpresplct_InScope(tpresplctList);
    }

    protected void doSetTpresplct_InScope(Collection<Long> tpresplctList) {
        regINS(CK_INS, cTL(tpresplctList), xgetCValueTpresplct(), "TPRESPLCT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     * @param tpresplctList The collection of tpresplct as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTpresplct_NotInScope(Collection<Long> tpresplctList) {
        doSetTpresplct_NotInScope(tpresplctList);
    }

    protected void doSetTpresplct_NotInScope(Collection<Long> tpresplctList) {
        regINS(CK_NINS, cTL(tpresplctList), xgetCValueTpresplct(), "TPRESPLCT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     */
    public void setTpresplct_IsNull() { regTpresplct(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TPRESPLCT: {bigint(19)}
     */
    public void setTpresplct_IsNotNull() { regTpresplct(CK_ISNN, DOBJ); }

    protected void regTpresplct(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTpresplct(), "TPRESPLCT"); }
    protected abstract ConditionValue xgetCValueTpresplct();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCBS: {char(1)}
     * @param tinvmdtcbs The value of tinvmdtcbs as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcbs_Equal(String tinvmdtcbs) {
        doSetTinvmdtcbs_Equal(fRES(tinvmdtcbs));
    }

    protected void doSetTinvmdtcbs_Equal(String tinvmdtcbs) {
        regTinvmdtcbs(CK_EQ, tinvmdtcbs);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCBS: {char(1)}
     * @param tinvmdtcbs The value of tinvmdtcbs as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcbs_NotEqual(String tinvmdtcbs) {
        doSetTinvmdtcbs_NotEqual(fRES(tinvmdtcbs));
    }

    protected void doSetTinvmdtcbs_NotEqual(String tinvmdtcbs) {
        regTinvmdtcbs(CK_NES, tinvmdtcbs);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCBS: {char(1)}
     * @param tinvmdtcbs The value of tinvmdtcbs as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcbs_GreaterThan(String tinvmdtcbs) {
        regTinvmdtcbs(CK_GT, fRES(tinvmdtcbs));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCBS: {char(1)}
     * @param tinvmdtcbs The value of tinvmdtcbs as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcbs_LessThan(String tinvmdtcbs) {
        regTinvmdtcbs(CK_LT, fRES(tinvmdtcbs));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCBS: {char(1)}
     * @param tinvmdtcbs The value of tinvmdtcbs as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcbs_GreaterEqual(String tinvmdtcbs) {
        regTinvmdtcbs(CK_GE, fRES(tinvmdtcbs));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCBS: {char(1)}
     * @param tinvmdtcbs The value of tinvmdtcbs as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcbs_LessEqual(String tinvmdtcbs) {
        regTinvmdtcbs(CK_LE, fRES(tinvmdtcbs));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TINVMDTCBS: {char(1)}
     * @param tinvmdtcbsList The collection of tinvmdtcbs as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcbs_InScope(Collection<String> tinvmdtcbsList) {
        doSetTinvmdtcbs_InScope(tinvmdtcbsList);
    }

    protected void doSetTinvmdtcbs_InScope(Collection<String> tinvmdtcbsList) {
        regINS(CK_INS, cTL(tinvmdtcbsList), xgetCValueTinvmdtcbs(), "TINVMDTCBS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TINVMDTCBS: {char(1)}
     * @param tinvmdtcbsList The collection of tinvmdtcbs as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcbs_NotInScope(Collection<String> tinvmdtcbsList) {
        doSetTinvmdtcbs_NotInScope(tinvmdtcbsList);
    }

    protected void doSetTinvmdtcbs_NotInScope(Collection<String> tinvmdtcbsList) {
        regINS(CK_NINS, cTL(tinvmdtcbsList), xgetCValueTinvmdtcbs(), "TINVMDTCBS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TINVMDTCBS: {char(1)} <br>
     * <pre>e.g. setTinvmdtcbs_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tinvmdtcbs The value of tinvmdtcbs as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTinvmdtcbs_LikeSearch(String tinvmdtcbs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tinvmdtcbs), xgetCValueTinvmdtcbs(), "TINVMDTCBS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TINVMDTCBS: {char(1)}
     * @param tinvmdtcbs The value of tinvmdtcbs as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTinvmdtcbs_NotLikeSearch(String tinvmdtcbs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tinvmdtcbs), xgetCValueTinvmdtcbs(), "TINVMDTCBS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TINVMDTCBS: {char(1)}
     * @param tinvmdtcbs The value of tinvmdtcbs as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcbs_PrefixSearch(String tinvmdtcbs) {
        setTinvmdtcbs_LikeSearch(tinvmdtcbs, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TINVMDTCBS: {char(1)}
     */
    public void setTinvmdtcbs_IsNull() { regTinvmdtcbs(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TINVMDTCBS: {char(1)}
     */
    public void setTinvmdtcbs_IsNotNull() { regTinvmdtcbs(CK_ISNN, DOBJ); }

    protected void regTinvmdtcbs(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTinvmdtcbs(), "TINVMDTCBS"); }
    protected abstract ConditionValue xgetCValueTinvmdtcbs();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param tinvmdtcb The value of tinvmdtcb as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtcb_Equal(Long tinvmdtcb) {
        doSetTinvmdtcb_Equal(tinvmdtcb);
    }

    protected void doSetTinvmdtcb_Equal(Long tinvmdtcb) {
        regTinvmdtcb(CK_EQ, tinvmdtcb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param tinvmdtcb The value of tinvmdtcb as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtcb_NotEqual(Long tinvmdtcb) {
        doSetTinvmdtcb_NotEqual(tinvmdtcb);
    }

    protected void doSetTinvmdtcb_NotEqual(Long tinvmdtcb) {
        regTinvmdtcb(CK_NES, tinvmdtcb);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param tinvmdtcb The value of tinvmdtcb as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtcb_GreaterThan(Long tinvmdtcb) {
        regTinvmdtcb(CK_GT, tinvmdtcb);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param tinvmdtcb The value of tinvmdtcb as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtcb_LessThan(Long tinvmdtcb) {
        regTinvmdtcb(CK_LT, tinvmdtcb);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param tinvmdtcb The value of tinvmdtcb as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtcb_GreaterEqual(Long tinvmdtcb) {
        regTinvmdtcb(CK_GE, tinvmdtcb);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param tinvmdtcb The value of tinvmdtcb as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtcb_LessEqual(Long tinvmdtcb) {
        regTinvmdtcb(CK_LE, tinvmdtcb);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param minNumber The min number of tinvmdtcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tinvmdtcb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTinvmdtcb_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTinvmdtcb(), "TINVMDTCB", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param tinvmdtcbList The collection of tinvmdtcb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcb_InScope(Collection<Long> tinvmdtcbList) {
        doSetTinvmdtcb_InScope(tinvmdtcbList);
    }

    protected void doSetTinvmdtcb_InScope(Collection<Long> tinvmdtcbList) {
        regINS(CK_INS, cTL(tinvmdtcbList), xgetCValueTinvmdtcb(), "TINVMDTCB");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     * @param tinvmdtcbList The collection of tinvmdtcb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcb_NotInScope(Collection<Long> tinvmdtcbList) {
        doSetTinvmdtcb_NotInScope(tinvmdtcbList);
    }

    protected void doSetTinvmdtcb_NotInScope(Collection<Long> tinvmdtcbList) {
        regINS(CK_NINS, cTL(tinvmdtcbList), xgetCValueTinvmdtcb(), "TINVMDTCB");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     */
    public void setTinvmdtcb_IsNull() { regTinvmdtcb(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TINVMDTCB: {bigint(19)}
     */
    public void setTinvmdtcb_IsNotNull() { regTinvmdtcb(CK_ISNN, DOBJ); }

    protected void regTinvmdtcb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTinvmdtcb(), "TINVMDTCB"); }
    protected abstract ConditionValue xgetCValueTinvmdtcb();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCTS: {char(1)}
     * @param tinvmdtcts The value of tinvmdtcts as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcts_Equal(String tinvmdtcts) {
        doSetTinvmdtcts_Equal(fRES(tinvmdtcts));
    }

    protected void doSetTinvmdtcts_Equal(String tinvmdtcts) {
        regTinvmdtcts(CK_EQ, tinvmdtcts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCTS: {char(1)}
     * @param tinvmdtcts The value of tinvmdtcts as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcts_NotEqual(String tinvmdtcts) {
        doSetTinvmdtcts_NotEqual(fRES(tinvmdtcts));
    }

    protected void doSetTinvmdtcts_NotEqual(String tinvmdtcts) {
        regTinvmdtcts(CK_NES, tinvmdtcts);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCTS: {char(1)}
     * @param tinvmdtcts The value of tinvmdtcts as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcts_GreaterThan(String tinvmdtcts) {
        regTinvmdtcts(CK_GT, fRES(tinvmdtcts));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCTS: {char(1)}
     * @param tinvmdtcts The value of tinvmdtcts as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcts_LessThan(String tinvmdtcts) {
        regTinvmdtcts(CK_LT, fRES(tinvmdtcts));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCTS: {char(1)}
     * @param tinvmdtcts The value of tinvmdtcts as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcts_GreaterEqual(String tinvmdtcts) {
        regTinvmdtcts(CK_GE, fRES(tinvmdtcts));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCTS: {char(1)}
     * @param tinvmdtcts The value of tinvmdtcts as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcts_LessEqual(String tinvmdtcts) {
        regTinvmdtcts(CK_LE, fRES(tinvmdtcts));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TINVMDTCTS: {char(1)}
     * @param tinvmdtctsList The collection of tinvmdtcts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcts_InScope(Collection<String> tinvmdtctsList) {
        doSetTinvmdtcts_InScope(tinvmdtctsList);
    }

    protected void doSetTinvmdtcts_InScope(Collection<String> tinvmdtctsList) {
        regINS(CK_INS, cTL(tinvmdtctsList), xgetCValueTinvmdtcts(), "TINVMDTCTS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TINVMDTCTS: {char(1)}
     * @param tinvmdtctsList The collection of tinvmdtcts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcts_NotInScope(Collection<String> tinvmdtctsList) {
        doSetTinvmdtcts_NotInScope(tinvmdtctsList);
    }

    protected void doSetTinvmdtcts_NotInScope(Collection<String> tinvmdtctsList) {
        regINS(CK_NINS, cTL(tinvmdtctsList), xgetCValueTinvmdtcts(), "TINVMDTCTS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TINVMDTCTS: {char(1)} <br>
     * <pre>e.g. setTinvmdtcts_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tinvmdtcts The value of tinvmdtcts as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTinvmdtcts_LikeSearch(String tinvmdtcts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tinvmdtcts), xgetCValueTinvmdtcts(), "TINVMDTCTS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TINVMDTCTS: {char(1)}
     * @param tinvmdtcts The value of tinvmdtcts as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTinvmdtcts_NotLikeSearch(String tinvmdtcts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tinvmdtcts), xgetCValueTinvmdtcts(), "TINVMDTCTS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TINVMDTCTS: {char(1)}
     * @param tinvmdtcts The value of tinvmdtcts as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtcts_PrefixSearch(String tinvmdtcts) {
        setTinvmdtcts_LikeSearch(tinvmdtcts, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TINVMDTCTS: {char(1)}
     */
    public void setTinvmdtcts_IsNull() { regTinvmdtcts(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TINVMDTCTS: {char(1)}
     */
    public void setTinvmdtcts_IsNotNull() { regTinvmdtcts(CK_ISNN, DOBJ); }

    protected void regTinvmdtcts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTinvmdtcts(), "TINVMDTCTS"); }
    protected abstract ConditionValue xgetCValueTinvmdtcts();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param tinvmdtct The value of tinvmdtct as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtct_Equal(Long tinvmdtct) {
        doSetTinvmdtct_Equal(tinvmdtct);
    }

    protected void doSetTinvmdtct_Equal(Long tinvmdtct) {
        regTinvmdtct(CK_EQ, tinvmdtct);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param tinvmdtct The value of tinvmdtct as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtct_NotEqual(Long tinvmdtct) {
        doSetTinvmdtct_NotEqual(tinvmdtct);
    }

    protected void doSetTinvmdtct_NotEqual(Long tinvmdtct) {
        regTinvmdtct(CK_NES, tinvmdtct);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param tinvmdtct The value of tinvmdtct as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtct_GreaterThan(Long tinvmdtct) {
        regTinvmdtct(CK_GT, tinvmdtct);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param tinvmdtct The value of tinvmdtct as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtct_LessThan(Long tinvmdtct) {
        regTinvmdtct(CK_LT, tinvmdtct);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param tinvmdtct The value of tinvmdtct as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtct_GreaterEqual(Long tinvmdtct) {
        regTinvmdtct(CK_GE, tinvmdtct);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param tinvmdtct The value of tinvmdtct as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTinvmdtct_LessEqual(Long tinvmdtct) {
        regTinvmdtct(CK_LE, tinvmdtct);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param minNumber The min number of tinvmdtct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tinvmdtct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTinvmdtct_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTinvmdtct(), "TINVMDTCT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param tinvmdtctList The collection of tinvmdtct as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtct_InScope(Collection<Long> tinvmdtctList) {
        doSetTinvmdtct_InScope(tinvmdtctList);
    }

    protected void doSetTinvmdtct_InScope(Collection<Long> tinvmdtctList) {
        regINS(CK_INS, cTL(tinvmdtctList), xgetCValueTinvmdtct(), "TINVMDTCT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     * @param tinvmdtctList The collection of tinvmdtct as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTinvmdtct_NotInScope(Collection<Long> tinvmdtctList) {
        doSetTinvmdtct_NotInScope(tinvmdtctList);
    }

    protected void doSetTinvmdtct_NotInScope(Collection<Long> tinvmdtctList) {
        regINS(CK_NINS, cTL(tinvmdtctList), xgetCValueTinvmdtct(), "TINVMDTCT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     */
    public void setTinvmdtct_IsNull() { regTinvmdtct(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TINVMDTCT: {bigint(19)}
     */
    public void setTinvmdtct_IsNotNull() { regTinvmdtct(CK_ISNN, DOBJ); }

    protected void regTinvmdtct(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTinvmdtct(), "TINVMDTCT"); }
    protected abstract ConditionValue xgetCValueTinvmdtct();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param csplnun The value of csplnun as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_Equal(Long csplnun) {
        doSetCsplnun_Equal(csplnun);
    }

    protected void doSetCsplnun_Equal(Long csplnun) {
        regCsplnun(CK_EQ, csplnun);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param csplnun The value of csplnun as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_NotEqual(Long csplnun) {
        doSetCsplnun_NotEqual(csplnun);
    }

    protected void doSetCsplnun_NotEqual(Long csplnun) {
        regCsplnun(CK_NES, csplnun);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param csplnun The value of csplnun as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_GreaterThan(Long csplnun) {
        regCsplnun(CK_GT, csplnun);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param csplnun The value of csplnun as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_LessThan(Long csplnun) {
        regCsplnun(CK_LT, csplnun);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param csplnun The value of csplnun as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_GreaterEqual(Long csplnun) {
        regCsplnun(CK_GE, csplnun);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param csplnun The value of csplnun as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsplnun_LessEqual(Long csplnun) {
        regCsplnun(CK_LE, csplnun);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param minNumber The min number of csplnun. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of csplnun. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCsplnun_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCsplnun(), "CSPLNUN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param csplnunList The collection of csplnun as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsplnun_InScope(Collection<Long> csplnunList) {
        doSetCsplnun_InScope(csplnunList);
    }

    protected void doSetCsplnun_InScope(Collection<Long> csplnunList) {
        regINS(CK_INS, cTL(csplnunList), xgetCValueCsplnun(), "CSPLNUN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CSPLNUN: {bigint(19)}
     * @param csplnunList The collection of csplnun as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsplnun_NotInScope(Collection<Long> csplnunList) {
        doSetCsplnun_NotInScope(csplnunList);
    }

    protected void doSetCsplnun_NotInScope(Collection<Long> csplnunList) {
        regINS(CK_NINS, cTL(csplnunList), xgetCValueCsplnun(), "CSPLNUN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     */
    public void setCsplnun_IsNull() { regCsplnun(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CSPLNUN: {bigint(19)}
     */
    public void setCsplnun_IsNotNull() { regCsplnun(CK_ISNN, DOBJ); }

    protected void regCsplnun(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCsplnun(), "CSPLNUN"); }
    protected abstract ConditionValue xgetCValueCsplnun();

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
    public HpSLCFunction<EMhStockCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EMhStockCB.class);
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
    public HpSLCFunction<EMhStockCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EMhStockCB.class);
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
    public HpSLCFunction<EMhStockCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EMhStockCB.class);
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
    public HpSLCFunction<EMhStockCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EMhStockCB.class);
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
    public HpSLCFunction<EMhStockCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EMhStockCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EMhStockCB&gt;() {
     *     public void query(EMhStockCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EMhStockCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EMhStockCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EMhStockCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EMhStockCQ sq);

    protected EMhStockCB xcreateScalarConditionCB() {
        EMhStockCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EMhStockCB xcreateScalarConditionPartitionByCB() {
        EMhStockCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EMhStockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EMhStockCB cb = new EMhStockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MH_STOCK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EMhStockCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EMhStockCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EMhStockCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EMhStockCB cb = new EMhStockCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MH_STOCK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EMhStockCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EMhStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EMhStockCB cb = new EMhStockCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EMhStockCQ sq);

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
    protected EMhStockCB newMyCB() {
        return new EMhStockCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EMhStockCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
